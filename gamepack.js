const child_process = require('child_process');
const crypto = require('crypto');
const fs = require('fs');
const path = require('path');
const zlib = require('zlib');

function getKeySize(length) {
    if (length === 0) {
        return 0;
    }

    return 3 * Math.floor((length - 1) / 4) + 1;
}

function decodeBase64(input, size) {
    input = input.replace(/\*/g, '+').replace(/-/g, '/');

    const buffer = Buffer.from(input, 'base64');
    const result = new Uint8Array(size);
    result.set(buffer);
    return result;
}

function decryptClient(innerPack, secret, vector) {
    const secretKeySize = getKeySize(secret.length);
    const vectorSize = getKeySize(vector.length);

    const secretKey = secretKeySize === 0 ? new Uint8Array() : decodeBase64(secret, secretKeySize);
    const initialisationVector = vectorSize === 0 ? new Uint8Array() : decodeBase64(vector, vectorSize);

    // encrypted with a 128-bit key and an initialisation vector (decrypt it)
    // compressed with gzip (decompress it)
    // stored as pack200 (to unpack it, you'll need java <= 11)

    const decipher = crypto.createDecipheriv('aes-128-cbc', secretKey, initialisationVector);
    const decrypted = Buffer.concat([decipher.update(innerPack), decipher.final()]);
    return zlib.gunzipSync(decrypted);
}

function unpack200(inputData, outputPath) {
    fs.writeFileSync(path.join('work', 'temp.pack200'), inputData);
    child_process.spawnSync('unpack200', [path.join('work', 'temp.pack200'), outputPath], { stdio: 'inherit' });
    fs.unlinkSync(path.join('work', 'temp.pack200'));
}

module.exports = {
    decryptClient,
    unpack200
};
