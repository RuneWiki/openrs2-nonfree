const fs = require('fs');
const path = require('path');
const child_process = require('child_process');

const yauzl = require('yauzl');

const { decryptClient, unpack200 } = require('./gamepack.js');

function extractFile(zip, name, dest) {
    return new Promise((resolve, reject) => {
        yauzl.open(zip, { lazyEntries: true }, (err, zipfile) => {
            if (err) {
                reject(err);
                return;
            }

            zipfile.readEntry();
            zipfile.on('entry', entry => {
                if (entry.fileName === name) {
                    zipfile.openReadStream(entry, (err, readStream) => {
                        if (err) {
                            reject(err);
                            return;
                        }

                        const writeStream = fs.createWriteStream(dest);
                        readStream.pipe(writeStream);
                        writeStream.on('close', () => {
                            resolve();
                        });
                    });
                } else {
                    zipfile.readEntry();
                }
            });
        });
    });
}

async function deob(settings, upload = true) {
    if (!settings) {
        return;
    }

    let libraries = settings.libraries.split(';').map(x => {
        let [name, file] = x.split(':');
        return { name, file };
    });

    // setting up the work directory
    fs.rmSync('work', { recursive: true, force: true });
    fs.mkdirSync(path.join('work', 'share', 'deob'), { recursive: true });
    fs.cpSync(path.join('template', 'deob-annotations'), path.join('work', 'nonfree', 'deob-annotations'), { recursive: true });

    if (settings.secret && settings.vector) {
        const gamepack = libraries.find(x => x.name === 'gamepack');
        await extractFile(path.join('lib', gamepack.file), 'inner.pack.gz', path.join('lib', `${settings.rev}.innerpack.jar`));
        const innerPack = decryptClient(fs.readFileSync(path.join('lib', `${settings.rev}.innerpack.jar`)), settings.secret, settings.vector);
        unpack200(innerPack, path.join('lib', `${settings.rev}.innerpack.jar`));

        libraries = [
            { name: 'client', file: `${settings.rev}.innerpack.jar` },
            { name: 'loader', file: gamepack.file }
        ];
    }

    // update the base profile
    let profile = fs.readFileSync(settings.profile, 'ascii').replaceAll('\r\n', '\n');
    for (let i = 0; i < libraries.length; i++) {
        const { name, file } = libraries[i];

        fs.cpSync(path.join('lib', file), path.join('work', 'nonfree', 'lib', file));

        profile = profile.replace(`%${name}_format%`, file.split('.').pop());
        profile = profile.replace(`%${name}_file%`, file);
    }

    if (settings.secret && settings.vector) {
        fs.rmSync(path.join('lib', `${settings.rev}.innerpack.jar`));
    }

    if (profile.indexOf('gl_profile') !== -1) {
        const gl = profile.match(/gl_profile: "(.*)"/)[1];
        fs.cpSync(gl, path.join('work', 'share', 'deob', 'gl.xml'));
    } else {
        fs.cpSync('khronosgl.xml', path.join('work', 'share', 'deob', 'gl.xml'));
    }

    profile = profile.replaceAll(/\n#.*/g, ''); // we store extra info as comments in the profile, remove them
    fs.writeFileSync(path.join('work', 'share', 'deob', 'profile.yaml'), profile);

    if (profile.indexOf('stub.jar') !== -1) {
        fs.mkdirSync(path.join('work', 'nonfree', 'lib'), { recursive: true });
        fs.cpSync(path.join('lib', 'stub.jar'), path.join('work', 'nonfree', 'lib', 'stub.jar'));
    }

    // attempt to deobfuscate
    let done = false;
    let retry = 0;
    while (!done && retry < 3) {
        console.log(`Deobfuscating ${settings.rev} (attempt ${retry + 1})`);

        try {
            if (settings.mathdeob) {
                child_process.execSync(`java -jar ../../../rl-math.jar ${settings.mathdeob} ${settings.mathdeob}-temp.jar`, {
                    cwd: path.join(__dirname, 'work', 'nonfree', 'lib'),
                    stdio: 'inherit'
                });

                fs.renameSync(path.join(__dirname, 'work', 'nonfree', 'lib', `${settings.mathdeob}-temp.jar`), path.join(__dirname, 'work', 'nonfree', 'lib', settings.mathdeob));
            }

            child_process.execSync('java -jar ../openrs2.jar deob', {
                cwd: path.join(__dirname, 'work'),
                // stdio: 'inherit'
                // pipe stdio to file
                // stdio: ['ignore', fs.openSync(`${settings.rev}.log`, 'w'), fs.openSync(`${settings.rev}.err.log`, 'w')]
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

const args = process.argv.slice(2);
async function run() {
    let min = -1;
    let max = -1;
    let target = -1;

    const deobs = readCsv('deob.csv');

    target = args[0];
    if (target) {
        await deob(deobs.find(x => x.rev == target));
        process.exit(0);
    }

    if (args.length > 1) {
        min = parseInt(args[1]);
    }

    if (args.length > 2) {
        max = parseInt(args[2]);
    }

    for (let i = 0; i < deobs.length; i++) {
        // already processed
        if (min !== -1 && deobs[i].rev <= min) {
            continue;
        }

        // already processed
        if (max !== -1 && deobs[i].rev >= max) {
            continue;
        }

        // target specific
        if (target !== -1 && deobs[i].rev != target) {
            continue;
        }

        await deob(deobs[i]);
    }
}
run();
