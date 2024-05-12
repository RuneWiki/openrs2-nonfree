import sign.signlink;

public class Class21 {

	private static int anInt566 = 473;

	public static int anInt567;

	public static Class21[] aClass21Array1;

	public int anInt568;

	public int anInt569;

	public int anInt570 = -1;

	public Class19 aClass19_1;

	public boolean aBoolean131 = false;

	public int[] anIntArray192 = new int[6];

	public int[] anIntArray193 = new int[6];

	public int anInt571 = 128;

	public int anInt572 = 128;

	public int anInt573;

	public int anInt574;

	public int anInt575;

	public static Class35 aClass35_8 = new Class35((byte) 0, 30);

	public static void method407(Class39 arg0, int arg1) {
		try {
			int var5 = 91 / arg1;
			Class1_Sub3_Sub3 var2 = new Class1_Sub3_Sub3(363, arg0.method536("spotanim.dat", (byte[]) null, (byte) 2));
			anInt567 = var2.method393();
			if (aClass21Array1 == null) {
				aClass21Array1 = new Class21[anInt567];
			}
			for (int var3 = 0; var3 < anInt567; ++var3) {
				if (aClass21Array1[var3] == null) {
					aClass21Array1[var3] = new Class21();
				}
				aClass21Array1[var3].anInt568 = var3;
				aClass21Array1[var3].method408(false, var2);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("26561, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method408(boolean arg0, Class1_Sub3_Sub3 arg1) {
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
						return;
					}
					if (var3 == 1) {
						this.anInt569 = arg1.method393();
					} else if (var3 == 2) {
						this.anInt570 = arg1.method393();
						if (Class19.aClass19Array1 != null) {
							this.aClass19_1 = Class19.aClass19Array1[this.anInt570];
						}
					} else if (var3 == 3) {
						this.aBoolean131 = true;
					} else if (var3 == 4) {
						this.anInt571 = arg1.method393();
					} else if (var3 == 5) {
						this.anInt572 = arg1.method393();
					} else if (var3 == 6) {
						this.anInt573 = arg1.method393();
					} else if (var3 == 7) {
						this.anInt574 = arg1.method391();
					} else if (var3 == 8) {
						this.anInt575 = arg1.method391();
					} else if (var3 >= 40 && var3 < 50) {
						this.anIntArray192[var3 - 40] = arg1.method393();
					} else if (var3 >= 50 && var3 < 60) {
						this.anIntArray193[var3 - 50] = arg1.method393();
					} else {
						System.out.println("Error unrecognised spotanim config code: " + var3);
					}
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("42060, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public Class1_Sub3_Sub1 method409() {
		Class1_Sub3_Sub1 var1 = (Class1_Sub3_Sub1) aClass35_8.method527((long) this.anInt568);
		if (var1 != null) {
			return var1;
		} else {
			var1 = new Class1_Sub3_Sub1(false, this.anInt569);
			for (int var2 = 0; var2 < 6; ++var2) {
				if (this.anIntArray192[0] != 0) {
					var1.method237(this.anIntArray192[var2], this.anIntArray193[var2]);
				}
			}
			aClass35_8.method528(6, (long) this.anInt568, var1);
			return var1;
		}
	}
}
