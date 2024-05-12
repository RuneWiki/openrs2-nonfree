import sign.signlink;

public final class Class39 {

	private boolean aBoolean150 = false;

	private byte aByte39 = 2;

	private int anInt770 = 40267;

	private boolean aBoolean151 = false;

	public byte[] aByteArray14;

	public int anInt771;

	public int[] anIntArray221;

	public int[] anIntArray222;

	public int[] anIntArray223;

	public int[] anIntArray224;

	private boolean aBoolean152;

	public Class39(byte[] arg0, boolean arg1) {
		try {
			if (arg1) {
				for (int var3 = 1; var3 > 0; ++var3) {
				}
			}
			this.method535(true, arg0);
		} catch (RuntimeException var4) {
			signlink.reporterror("94335, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private void method535(boolean arg0, byte[] arg1) {
		try {
			Class1_Sub3_Sub3 var3 = new Class1_Sub3_Sub3(363, arg1);
			int var4 = var3.method395();
			int var5 = var3.method395();
			if (var5 != var4) {
				byte[] var6 = new byte[var4];
				Class34.method519(var6, var4, arg1, var5, 6);
				this.aByteArray14 = var6;
				var3 = new Class1_Sub3_Sub3(363, this.aByteArray14);
				this.aBoolean152 = true;
			} else {
				this.aByteArray14 = arg1;
				this.aBoolean152 = false;
			}
			this.anInt771 = var3.method393();
			this.anIntArray221 = new int[this.anInt771];
			this.anIntArray222 = new int[this.anInt771];
			this.anIntArray223 = new int[this.anInt771];
			this.anIntArray224 = new int[this.anInt771];
			if (arg0) {
				int var9 = var3.anInt561 + this.anInt771 * 10;
				for (int var7 = 0; var7 < this.anInt771; ++var7) {
					this.anIntArray221[var7] = var3.method396();
					this.anIntArray222[var7] = var3.method395();
					this.anIntArray223[var7] = var3.method395();
					this.anIntArray224[var7] = var9;
					var9 += this.anIntArray223[var7];
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("40193, " + arg0 + ", " + arg1 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public byte[] method536(String arg0, byte[] arg1, byte arg2) {
		try {
			int var4 = 0;
			String var9 = arg0.toUpperCase();
			for (int var5 = 0; var5 < var9.length(); ++var5) {
				var4 = var4 * 61 + var9.charAt(var5) - 32;
			}
			for (int var6 = 0; var6 < this.anInt771; ++var6) {
				if (this.anIntArray221[var6] == var4) {
					if (arg1 == null) {
						arg1 = new byte[this.anIntArray222[var6]];
					}
					if (!this.aBoolean152) {
						Class34.method519(arg1, this.anIntArray222[var6], this.aByteArray14, this.anIntArray223[var6], this.anIntArray224[var6]);
					} else {
						for (int var7 = 0; var7 < this.anIntArray222[var6]; ++var7) {
							arg1[var7] = this.aByteArray14[this.anIntArray224[var6] + var7];
						}
					}
					return arg1;
				}
			}
			if (arg2 != this.aByte39) {
				throw new NullPointerException();
			} else {
				return null;
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("98811, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}
}
