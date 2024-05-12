import sign.signlink;

public class Class13 {

	private static int anInt435;

	private static int anInt436 = 473;

	private boolean aBoolean100 = false;

	public static int anInt437;

	public static Class13[] aClass13Array1;

	public int anInt438 = -1;

	public int[] anIntArray143;

	public int[] anIntArray144 = new int[6];

	public int[] anIntArray145 = new int[6];

	public int[] anIntArray146 = new int[] { -1, -1, -1, -1, -1 };

	public boolean aBoolean101 = false;

	public static void method304(Class39 arg0, int arg1) {
		try {
			Class1_Sub3_Sub3 var2 = new Class1_Sub3_Sub3(363, arg0.method536("idk.dat", (byte[]) null, (byte) 2));
			anInt437 = var2.method393();
			if (aClass13Array1 == null) {
				aClass13Array1 = new Class13[anInt437];
			}
			for (int var3 = 0; var3 < anInt437; ++var3) {
				if (aClass13Array1[var3] == null) {
					aClass13Array1[var3] = new Class13();
				}
				aClass13Array1[var3].method305(false, var2);
			}
			int var5 = 87 / arg1;
		} catch (RuntimeException var4) {
			signlink.reporterror("89502, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method305(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0) {
				anInt435 = 65;
			}
			while (true) {
				while (true) {
					int var3 = arg1.method391();
					if (var3 == 0) {
						return;
					}
					if (var3 == 1) {
						this.anInt438 = arg1.method391();
					} else if (var3 == 2) {
						int var4 = arg1.method391();
						this.anIntArray143 = new int[var4];
						for (int var5 = 0; var5 < var4; ++var5) {
							this.anIntArray143[var5] = arg1.method393();
						}
					} else if (var3 == 3) {
						this.aBoolean101 = true;
					} else if (var3 >= 40 && var3 < 50) {
						this.anIntArray144[var3 - 40] = arg1.method393();
					} else if (var3 >= 50 && var3 < 60) {
						this.anIntArray145[var3 - 50] = arg1.method393();
					} else if (var3 >= 60 && var3 < 70) {
						this.anIntArray146[var3 - 60] = arg1.method393();
					} else {
						System.out.println("Error unrecognised config code: " + var3);
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("61151, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public Class1_Sub3_Sub1 method306() {
		if (this.anIntArray143 == null) {
			return null;
		} else {
			Class1_Sub3_Sub1[] var1 = new Class1_Sub3_Sub1[this.anIntArray143.length];
			for (int var2 = 0; var2 < this.anIntArray143.length; ++var2) {
				var1[var2] = new Class1_Sub3_Sub1(false, this.anIntArray143[var2]);
			}
			Class1_Sub3_Sub1 var3;
			if (var1.length == 1) {
				var3 = var1[0];
			} else {
				var3 = new Class1_Sub3_Sub1(0, var1, var1.length);
			}
			for (int var4 = 0; var4 < 6 && this.anIntArray144[var4] != 0; ++var4) {
				var3.method237(this.anIntArray144[var4], this.anIntArray145[var4]);
			}
			return var3;
		}
	}

	public Class1_Sub3_Sub1 method307(boolean arg0) {
		try {
			Class1_Sub3_Sub1[] var2 = new Class1_Sub3_Sub1[5];
			int var3 = 0;
			for (int var4 = 0; var4 < 5; ++var4) {
				if (this.anIntArray146[var4] != -1) {
					var2[var3++] = new Class1_Sub3_Sub1(false, this.anIntArray146[var4]);
				}
			}
			Class1_Sub3_Sub1 var5 = new Class1_Sub3_Sub1(0, var2, var3);
			for (int var6 = 0; var6 < 6 && this.anIntArray144[var6] != 0; ++var6) {
				var5.method237(this.anIntArray144[var6], this.anIntArray145[var6]);
			}
			if (arg0) {
				for (int var7 = 1; var7 > 0; ++var7) {
				}
			}
			return var5;
		} catch (RuntimeException var8) {
			signlink.reporterror("19364, " + arg0 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}
}
