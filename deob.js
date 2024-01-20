const fs = require('fs');
const path = require('path');
const child_process = require('child_process');

function deob(rev, client, loader) {
    // setting up the work directory
    fs.rmSync('work', { recursive: true, force: true });
    fs.mkdirSync(path.join('work', 'nonfree', 'lib'), { recursive: true });
    fs.mkdirSync(path.join('work', 'share', 'deob'), { recursive: true });

    fs.cpSync(path.join('lib', loader), path.join('work', 'nonfree', 'lib', loader));
    fs.cpSync(path.join('lib', client), path.join('work', 'nonfree', 'lib', client));
    fs.cpSync(path.join('lib', 'stub.jar'), path.join('work', 'nonfree', 'lib', 'stub.jar'));

    // update the base profile
    let profile = fs.readFileSync(path.join('profile.yaml'), 'utf8');
    profile = profile.replace('%client_format%', client.split('.').pop());
    profile = profile.replace('%client_file%', client);
    profile = profile.replace('%loader_format%', loader.split('.').pop());
    profile = profile.replace('%loader_file%', loader);
    fs.writeFileSync(path.join('work', 'share', 'deob', 'profile.yaml'), profile);
    fs.cpSync(path.join('jagexgl.xml'), path.join('work', 'share', 'deob', 'gl.xml'));

    // attempt to deobfuscate
    let done = false;
    let retry = 0;
    while (!done && retry < 3) {
        try {
            child_process.execSync('java -jar ../openrs2.jar deob', {
                cwd: path.join(__dirname, 'work')
            });

            done = true;
        } catch (err) {
            const stderr = err.toString();
            const knownError = false; // stderr;

            if (!knownError) {
                process.exit(1);
            }

            retry++;
        }
    }

    if (done) {
        // create a git repo in the work directory and commit the deobfuscated files
        child_process.execSync('git init', {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync('git remote add origin https://github.com/RuneWiki/openrs2-nonfree', {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync(`git checkout -b ${rev}`, {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync('git add -A', {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync('git commit -m "feat: Initial deob"', {
            cwd: path.join(__dirname, 'work')
        });

        child_process.execSync(`git push -u origin ${rev} -f`, {
            cwd: path.join(__dirname, 'work')
        });
    }
}

const deobs = fs.readFileSync('deob.csv').toString().replaceAll('\r\n', '\n').split('\n').slice(1).filter(x => x.length).map(x => x.split(',')).filter(x => x.length === 3);

for (let i = 0; i < deobs.length; i++) {
    console.log(`Deobfuscating ${deobs[i][0]}`);
    deob(...deobs[i]);
}
