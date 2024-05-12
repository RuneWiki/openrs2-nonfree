import sign.signlink;

public final class Class38 {

	private int anInt766;

	private int[] anIntArray219;

	private int[] anIntArray220;

	private int anInt767;

	private int anInt768;

	private int anInt769;

	public Class38(byte arg0, int[] arg1) {
		try {
			this.anIntArray220 = new int[256];
			this.anIntArray219 = new int[256];
			for (int var3 = 0; var3 < arg1.length; ++var3) {
				this.anIntArray219[var3] = arg1[var3];
			}
			if (arg0 == 1) {
				boolean var5 = false;
				this.method534();
			} else {
				throw new NullPointerException();
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("45225, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final int method532() {
		if (this.anInt766-- == 0) {
			this.method533();
			this.anInt766 = 255;
		}
		return this.anIntArray219[this.anInt766];
	}

	private final void method533() {
		this.anInt768 += ++this.anInt769;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var2 = this.anIntArray220[var1];
			switch(var1 & 3) {
				case 0:
					this.anInt767 ^= this.anInt767 << 13;
					break;
				case 1:
					this.anInt767 ^= this.anInt767 >>> 6;
					break;
				case 2:
					this.anInt767 ^= this.anInt767 << 2;
					break;
				case 3:
					this.anInt767 ^= this.anInt767 >>> 16;
			}
			this.anInt767 += this.anIntArray220[var1 + 128 & 255];
			int var3;
			this.anIntArray220[var1] = var3 = this.anIntArray220[(var2 & 1020) >> 2] + this.anInt767 + this.anInt768;
			this.anIntArray219[var1] = this.anInt768 = this.anIntArray220[(var3 >> 8 & 1020) >> 2] + var2;
		}
	}

	private final void method534() {
		int var9 = -1640531527;
		int var8 = -1640531527;
		int var7 = -1640531527;
		int var6 = -1640531527;
		int var5 = -1640531527;
		int var4 = -1640531527;
		int var3 = -1640531527;
		int var2 = -1640531527;
		int var1;
		for (var1 = 0; var1 < 4; ++var1) {
			var2 ^= var3 << 11;
			var5 += var2;
			var3 += var4;
			var3 ^= var4 >>> 2;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 8;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 >>> 16;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 << 10;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 >>> 4;
			var2 += var7;
			var8 += var9;
			var8 ^= var9 << 8;
			var3 += var8;
			var9 += var2;
			var9 ^= var2 >>> 9;
			var4 += var9;
			var2 += var3;
		}
		for (var1 = 0; var1 < 256; var1 += 8) {
			var2 += this.anIntArray219[var1];
			var3 += this.anIntArray219[var1 + 1];
			var4 += this.anIntArray219[var1 + 2];
			var5 += this.anIntArray219[var1 + 3];
			var6 += this.anIntArray219[var1 + 4];
			var7 += this.anIntArray219[var1 + 5];
			var8 += this.anIntArray219[var1 + 6];
			var9 += this.anIntArray219[var1 + 7];
			var2 ^= var3 << 11;
			var5 += var2;
			var3 += var4;
			var3 ^= var4 >>> 2;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 8;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 >>> 16;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 << 10;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 >>> 4;
			var2 += var7;
			var8 += var9;
			var8 ^= var9 << 8;
			var3 += var8;
			var9 += var2;
			var9 ^= var2 >>> 9;
			var4 += var9;
			var2 += var3;
			this.anIntArray220[var1] = var2;
			this.anIntArray220[var1 + 1] = var3;
			this.anIntArray220[var1 + 2] = var4;
			this.anIntArray220[var1 + 3] = var5;
			this.anIntArray220[var1 + 4] = var6;
			this.anIntArray220[var1 + 5] = var7;
			this.anIntArray220[var1 + 6] = var8;
			this.anIntArray220[var1 + 7] = var9;
		}
		for (var1 = 0; var1 < 256; var1 += 8) {
			var2 += this.anIntArray220[var1];
			var3 += this.anIntArray220[var1 + 1];
			var4 += this.anIntArray220[var1 + 2];
			var5 += this.anIntArray220[var1 + 3];
			var6 += this.anIntArray220[var1 + 4];
			var7 += this.anIntArray220[var1 + 5];
			var8 += this.anIntArray220[var1 + 6];
			var9 += this.anIntArray220[var1 + 7];
			var2 ^= var3 << 11;
			var5 += var2;
			var3 += var4;
			var3 ^= var4 >>> 2;
			var6 += var3;
			var4 += var5;
			var4 ^= var5 << 8;
			var7 += var4;
			var5 += var6;
			var5 ^= var6 >>> 16;
			var8 += var5;
			var6 += var7;
			var6 ^= var7 << 10;
			var9 += var6;
			var7 += var8;
			var7 ^= var8 >>> 4;
			var2 += var7;
			var8 += var9;
			var8 ^= var9 << 8;
			var3 += var8;
			var9 += var2;
			var9 ^= var2 >>> 9;
			var4 += var9;
			var2 += var3;
			this.anIntArray220[var1] = var2;
			this.anIntArray220[var1 + 1] = var3;
			this.anIntArray220[var1 + 2] = var4;
			this.anIntArray220[var1 + 3] = var5;
			this.anIntArray220[var1 + 4] = var6;
			this.anIntArray220[var1 + 5] = var7;
			this.anIntArray220[var1 + 6] = var8;
			this.anIntArray220[var1 + 7] = var9;
		}
		this.method533();
		this.anInt766 = 256;
	}
}
