package ru.otus.zarechnev.library.shell;

import lombok.RequiredArgsConstructor;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import ru.otus.zarechnev.library.domain.Author;
import ru.otus.zarechnev.library.repository.AuthorRepository;
import ru.otus.zarechnev.library.service.AuthorService;

import java.util.List;

@ShellComponent
@RequiredArgsConstructor
public class AuthorCommands {

    private final AuthorRepository authorRepository;
    private final AuthorService authorService;

    @ShellMethod(value = "Show authors", key = {"al", "author list"})
    public List<Author> showAuthors() {
        return authorRepository.getAll();
    }

    @ShellMethod(value = "Add author", key = {"aa", "author add"})
    public void addAuthor() {
        authorService.addAuthor();
    }
}