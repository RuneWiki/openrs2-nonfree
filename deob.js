const fs = require('fs');
const path = require('path');
const child_process = require('child_process');

// when running sequentially, once the first redundant cast is found, all subsequent deob attempts will fail
let globalRedundantCast = true;

function deob(rev, client, loader, gl) {
    // setting up the work directory
    fs.rmSync('work', { recursive: true, force: true });
    fs.mkdirSync(path.join('work', 'nonfree', 'lib'), { recursive: true });
    fs.mkdirSync(path.join('work', 'share', 'deob'), { recursive: true });

    fs.cpSync(path.join('lib', loader), path.join('work', 'nonfree', 'lib', loader));
    fs.cpSync(path.join('lib', client), path.join('work', 'nonfree', 'lib', client));
    fs.cpSync(path.join('lib', 'stub.jar'), path.join('work', 'nonfree', 'lib', 'stub.jar'));

    // update the base profile
    let profile = fs.readFileSync(path.join('profile.yaml'), 'ascii').replaceAll('\r\n', '\n');
    profile = profile.replace('%client_format%', client.split('.').pop());
    profile = profile.replace('%client_file%', client);
    profile = profile.replace('%loader_format%', loader.split('.').pop());
    profile = profile.replace('%loader_file%', loader);
    if (globalRedundantCast){ 
        profile = profile.replace('  - RedundantCast\n', '');
    }
    if (typeof gl !== 'undefined') {
        fs.cpSync(path.join(`${gl}.xml`), path.join('work', 'share', 'deob', 'gl.xml'));
    } else {
        // still need to copy a gl.xml file even if we're not using it
        fs.cpSync(path.join('khronosgl.xml'), path.join('work', 'share', 'deob', 'gl.xml'));
        profile = profile.replace('  - Gl\n', '');
    }
    fs.writeFileSync(path.join('work', 'share', 'deob', 'profile.yaml'), profile);

    // attempt to deobfuscate
    let done = false;
    let retry = 0;
    let lastKnownError = 0;
    while (!done && retry < 3) {
        console.log(`Deobfuscating ${rev} (attempt ${retry + 1})`);

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
                console.log('Failed on rev', rev);
                fs.appendFileSync('failed.txt', `${rev}: unknown error\n`);
                fs.writeFileSync(`${rev}.txt`, stderr);
                return;
            }

            if (redundantCast) {
                profile = profile.replace('  - RedundantCast\n', '');
                fs.writeFileSync(path.join('work', 'share', 'deob', 'profile.yaml'), profile);
                globalRedundantCast = true;
                lastKnownError = 1;
            }

            fs.rmSync(path.join('work', 'nonfree', 'client'), { recursive: true, force: true });
            fs.rmSync(path.join('work', 'nonfree', 'loader'), { recursive: true, force: true });
            fs.rmSync(path.join('work', 'nonfree', 'var'), { recursive: true, force: true });

            retry++;
        }

        if (retry >= 3) {
            console.log('Failed on rev', rev);
            fs.appendFileSync('failed.txt', `${rev}: too many retries\n`);
            return;
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

const deobs = fs.readFileSync('deob.csv').toString().replaceAll('\r\n', '\n').split('\n').slice(1).filter(x => x.length).map(x => x.split(',')).filter(x => x.length >= 3);

for (let i = 0; i < deobs.length; i++) {
    // already processed
    if (deobs[i][0] <= 600) {
        continue;
    }

    // already processed
    if (deobs[i][0] >= 652) {
        continue;
    }

    // target specific
    // if (deobs[i][0] != 668) {
    //     continue;
    // }

    deob(...deobs[i]);
}
