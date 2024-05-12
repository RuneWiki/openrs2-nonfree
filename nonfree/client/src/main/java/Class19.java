import sign.signlink;

public class Class19 {

	private static boolean aBoolean125 = true;

	private static int anInt541 = 473;

	public static int anInt542;

	public static Class19[] aClass19Array1;

	public int anInt543;

	public int[] anIntArray186;

	public int[] anIntArray187;

	public int[] anIntArray188;

	public int anInt544 = -1;

	public int[] anIntArray189;

	public boolean aBoolean126 = false;

	public int anInt545 = 5;

	public int anInt546 = -1;

	public int anInt547 = -1;

	public int anInt548 = 99;

	public static void method374(Class39 arg0, int arg1) {
		try {
			Class1_Sub3_Sub3 var2 = new Class1_Sub3_Sub3(363, arg0.method536("seq.dat", (byte[]) null, (byte) 2));
			if (arg1 <= 0) {
				aBoolean125 = !aBoolean125;
			}
			anInt542 = var2.method393();
			if (aClass19Array1 == null) {
				aClass19Array1 = new Class19[anInt542];
			}
			for (int var3 = 0; var3 < anInt542; ++var3) {
				if (aClass19Array1[var3] == null) {
					aClass19Array1[var3] = new Class19();
				}
				aClass19Array1[var3].method375(false, var2);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("35892, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method375(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			int var3;
			if (arg0) {
				for (var3 = 1; var3 > 0; ++var3) {
				}
			}
			while (true) {
				while (true) {
					var3 = arg1.method391();
					if (var3 == 0) {
						if (this.anInt543 == 0) {
							this.anInt543 = 1;
							this.anIntArray186 = new int[1];
							this.anIntArray186[0] = -1;
							this.anIntArray187 = new int[1];
							this.anIntArray187[0] = -1;
							this.anIntArray188 = new int[1];
							this.anIntArray188[0] = -1;
							return;
						}
						return;
					}
					int var4;
					if (var3 == 1) {
						this.anInt543 = arg1.method391();
						this.anIntArray186 = new int[this.anInt543];
						this.anIntArray187 = new int[this.anInt543];
						this.anIntArray188 = new int[this.anInt543];
						for (var4 = 0; var4 < this.anInt543; ++var4) {
							this.anIntArray186[var4] = arg1.method393();
							this.anIntArray187[var4] = arg1.method393();
							if (this.anIntArray187[var4] == 65535) {
								this.anIntArray187[var4] = -1;
							}
							this.anIntArray188[var4] = arg1.method393();
							if (this.anIntArray188[var4] == 0) {
								this.anIntArray188[var4] = Class12.aClass12Array1[this.anIntArray186[var4]].anInt411;
							}
							if (this.anIntArray188[var4] == 0) {
								this.anIntArray188[var4] = 1;
							}
						}
					} else if (var3 == 2) {
						this.anInt544 = arg1.method393();
					} else if (var3 != 3) {
						if (var3 == 4) {
							this.aBoolean126 = true;
						} else if (var3 == 5) {
							this.anInt545 = arg1.method391();
						} else if (var3 == 6) {
							this.anInt546 = arg1.method393();
						} else if (var3 == 7) {
							this.anInt547 = arg1.method393();
						} else if (var3 == 8) {
							this.anInt548 = arg1.method391();
						} else {
							System.out.println("Error unrecognised seq config code: " + var3);
						}
					} else {
						var4 = arg1.method391();
						this.anIntArray189 = new int[var4 + 1];
						for (int var5 = 0; var5 < var4; ++var5) {
							this.anIntArray189[var5] = arg1.method391();
						}
						this.anIntArray189[var4] = 9999999;
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("38080, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
