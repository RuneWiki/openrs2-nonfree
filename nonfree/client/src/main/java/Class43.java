import sign.signlink;

public class Class43 {

	private boolean aBoolean160 = true;

	private static int anInt885 = 473;

	private static Class43[] aClass43Array1 = new Class43[1000];

	public static int[] anIntArray231 = new int[1000];

	private static byte[] aByteArray15;

	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_23;

	private Class44[] aClass44Array1 = new Class44[10];

	private int anInt886;

	private int anInt887;

	public static final void method561(Class1_Sub3_Sub3 arg0, int arg1) {
		try {
			aByteArray15 = new byte[441000];
			aClass1_Sub3_Sub3_23 = new Class1_Sub3_Sub3(363, aByteArray15);
			int var4 = 87 / arg1;
			Class44.method575();
			while (true) {
				int var2 = arg0.method393();
				if (var2 == 65535) {
					return;
				}
				aClass43Array1[var2] = new Class43();
				aClass43Array1[var2].method563(false, arg0);
				anIntArray231[var2] = aClass43Array1[var2].method564((byte) 7);
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("6214, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public static final Class1_Sub3_Sub3 method562(byte arg0, int arg1, int arg2) {
		try {
			if (arg0 != -16) {
				anInt885 = -83;
			}
			if (aClass43Array1[arg2] != null) {
				Class43 var3 = aClass43Array1[arg2];
				return var3.method565(true, arg1);
			} else {
				return null;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("72905, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	private final void method563(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			for (int var3 = 0; var3 < 10; ++var3) {
				int var4 = arg1.method391();
				if (var4 != 0) {
					--arg1.anInt561;
					this.aClass44Array1[var3] = new Class44();
					this.aClass44Array1[var3].method578(false, arg1);
				}
			}
			if (arg0) {
				anInt885 = -307;
			}
			this.anInt886 = arg1.method393();
			this.anInt887 = arg1.method393();
		} catch (RuntimeException var5) {
			signlink.reporterror("58220, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	private final int method564(byte arg0) {
		try {
			int var2 = 9999999;
			for (int var3 = 0; var3 < 10; ++var3) {
				if (this.aClass44Array1[var3] != null && this.aClass44Array1[var3].anInt956 / 20 < var2) {
					var2 = this.aClass44Array1[var3].anInt956 / 20;
				}
			}
			if (arg0 == 7) {
				boolean var6 = false;
			} else {
				anInt885 = -8;
			}
			if (this.anInt886 < this.anInt887 && this.anInt886 / 20 < var2) {
				var2 = this.anInt886 / 20;
			}
			if (var2 != 9999999 && var2 != 0) {
				for (int var4 = 0; var4 < 10; ++var4) {
					if (this.aClass44Array1[var4] != null) {
						this.aClass44Array1[var4].anInt956 -= var2 * 20;
					}
				}
				if (this.anInt886 < this.anInt887) {
					this.anInt886 -= var2 * 20;
					this.anInt887 -= var2 * 20;
				}
				return var2;
			} else {
				return 0;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("49328, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	private final Class1_Sub3_Sub3 method565(boolean arg0, int arg1) {
		try {
			int var3 = this.method566(arg1);
			aClass1_Sub3_Sub3_23.anInt561 = 0;
			aClass1_Sub3_Sub3_23.method385(1380533830);
			aClass1_Sub3_Sub3_23.method386(false, 36 + var3);
			aClass1_Sub3_Sub3_23.method385(1463899717);
			aClass1_Sub3_Sub3_23.method385(1718449184);
			aClass1_Sub3_Sub3_23.method386(false, 16);
			if (!arg0) {
				for (int var4 = 1; var4 > 0; ++var4) {
				}
			}
			aClass1_Sub3_Sub3_23.method383(this.aBoolean160, 1);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean160, 1);
			aClass1_Sub3_Sub3_23.method386(false, 22050);
			aClass1_Sub3_Sub3_23.method386(false, 22050);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean160, 1);
			aClass1_Sub3_Sub3_23.method383(this.aBoolean160, 8);
			aClass1_Sub3_Sub3_23.method385(1684108385);
			aClass1_Sub3_Sub3_23.method386(false, var3);
			aClass1_Sub3_Sub3_23.anInt561 += var3;
			return aClass1_Sub3_Sub3_23;
		} catch (RuntimeException var5) {
			signlink.reporterror("83597, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	private final int method566(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; ++var3) {
			if (this.aClass44Array1[var3] != null && this.aClass44Array1[var3].anInt955 + this.aClass44Array1[var3].anInt956 > var2) {
				var2 = this.aClass44Array1[var3].anInt955 + this.aClass44Array1[var3].anInt956;
			}
		}
		if (var2 == 0) {
			return 0;
		} else {
			int var4 = 22050 * var2 / 1000;
			int var5 = 22050 * this.anInt886 / 1000;
			int var6 = 22050 * this.anInt887 / 1000;
			if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
				arg0 = 0;
			}
			int var7 = var4 + (var6 - var5) * (arg0 - 1);
			for (int var8 = 44; var8 < var7 + 44; ++var8) {
				aByteArray15[var8] = -128;
			}
			int var10;
			int var11;
			int var13;
			for (int var9 = 0; var9 < 10; ++var9) {
				if (this.aClass44Array1[var9] != null) {
					var10 = this.aClass44Array1[var9].anInt955 * 22050 / 1000;
					var11 = this.aClass44Array1[var9].anInt956 * 22050 / 1000;
					int[] var12 = this.aClass44Array1[var9].method576(var10, this.aClass44Array1[var9].anInt955);
					for (var13 = 0; var13 < var10; ++var13) {
						aByteArray15[var13 + var11 + 44] += (byte) (var12[var13] >> 8);
					}
				}
			}
			if (arg0 > 1) {
				var5 += 44;
				var6 += 44;
				var4 += 44;
				var7 += 44;
				var10 = var7 - var4;
				for (var11 = var4 - 1; var11 >= var6; --var11) {
					aByteArray15[var11 + var10] = aByteArray15[var11];
				}
				for (int var14 = 1; var14 < arg0; ++var14) {
					var10 = (var6 - var5) * var14;
					for (var13 = var5; var13 < var6; ++var13) {
						aByteArray15[var13 + var10] = aByteArray15[var13];
					}
				}
				var7 -= 44;
			}
			return var7;
		}
	}
}
