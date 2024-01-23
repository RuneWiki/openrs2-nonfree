const fs = require('fs');
const path = require('path');
const child_process = require('child_process');

function deob(settings, upload = true) {
    let libraries = settings.libraries.split(';').map(x => {
        let [name, file] = x.split(':');
        return { name, file };
    });

    // setting up the work directory
    fs.rmSync('work', { recursive: true, force: true });

    fs.mkdirSync(path.join('work', 'share', 'deob'), { recursive: true });
    fs.cpSync(path.join('khronosgl.xml'), path.join('work', 'share', 'deob', 'gl.xml'));

    fs.mkdirSync(path.join('work', 'nonfree', 'lib'), { recursive: true });
    fs.cpSync(path.join('lib', 'stub.jar'), path.join('work', 'nonfree', 'lib', 'stub.jar')); // temp

    // update the base profile
    let profile = fs.readFileSync(settings.profile, 'ascii').replaceAll('\r\n', '\n');
    for (let i = 0; i < libraries.length; i++) {
        const { name, file } = libraries[i];

        fs.cpSync(path.join('lib', file), path.join('work', 'nonfree', 'lib', file));

        profile = profile.replace(`%${name}_format%`, file.split('.').pop());
        profile = profile.replace(`%${name}_file%`, file);
    }
    fs.writeFileSync(path.join('work', 'share', 'deob', 'profile.yaml'), profile);

    // attempt to deobfuscate
    let done = false;
    let retry = 0;
    while (!done && retry < 3) {
        console.log(`Deobfuscating ${settings.rev} (attempt ${retry + 1})`);

        try {
            child_process.execSync('java -jar ../openrs2.jar deob', {
                cwd: path.join(__dirname, 'work'),
                // stdio: 'inherit'
            });

            done = true;
        } catch (err) {
            const stderr = err.toString();

            const redundantCast = stderr.indexOf('We are unable to find the method declaration') !== -1;
            const knownError = redundantCast;

            if (!knownError) {
                console.log('Failed on rev', settings.rev);
                fs.appendFileSync('failed.txt', `${settings.rev}: deob error\n`);
                fs.writeFileSync(`${settings.rev}.txt`, stderr);
                return;
            }

            if (redundantCast) {
                profile = profile.replace('  - RedundantCast\n', '');
                fs.writeFileSync(path.join('work', 'share', 'deob', 'profile.yaml'), profile);
            }

            fs.rmSync(path.join('work', 'nonfree', 'client'), { recursive: true, force: true });
            fs.rmSync(path.join('work', 'nonfree', 'loader'), { recursive: true, force: true });
            fs.rmSync(path.join('work', 'nonfree', 'var'), { recursive: true, force: true });

            retry++;
        }
    }

    if (!done) {
        console.log('Failed on rev', settings.rev);
        fs.appendFileSync('failed.txt', `${settings.rev}: too many attempts\n`);
        return;
    }

    if (upload) {
        // create a git repo in the work directory and commit the deobfuscated files
        child_process.execSync('git init', {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync('git remote add origin https://github.com/RuneWiki/openrs2-nonfree', {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync(`git checkout -b ${settings.rev}`, {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync('git add -A', {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync('git commit -m "feat: Initial deob"', {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync(`git push -u origin ${settings.rev} -f`, {
            cwd: path.join(__dirname, 'work')
        });
    }
}

function readCsv(name, hasHeader = true) {
    let csv = fs.readFileSync(name).toString().replaceAll('\r\n', '\n').split('\n').map(x => x.split(',')).filter(x => x.length > 1);

    if (hasHeader) {
        // convert this array[] into an object[] with the header as the key for each object
        const header = csv[0];
        csv = csv.slice(1).map(x => {
            const obj = {};

            for (let i = 0; i < header.length; i++) {
                const key = header[i];
                if (key === '') {
                    continue;
                }

                obj[key] = x[i];
            }

            return obj;
        });
    }

    return csv;
}

const deobs = readCsv('deob.csv');
for (let i = 0; i < deobs.length; i++) {
    // already processed
    if (deobs[i].rev <= 498) {
        continue;
    }

    // already processed
    if (deobs[i].rev >= 555) {
        continue;
    }

    // target specific
    // if (deobs[i].rev != 377) {
    //     continue;
    // }

    deob(deobs[i]);
}
