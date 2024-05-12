import sign.signlink;

public class Class23 {

	private static int anInt603 = 473;

	private static int anInt604 = 13703;

	public static int anInt605;

	public static Class23[] aClass23Array1;

	public static int anInt606;

	public static int[] anIntArray194;

	public String aString25;

	public int anInt607;

	public int anInt608;

	public boolean aBoolean132 = false;

	public boolean aBoolean133 = true;

	public int anInt609;

	public boolean aBoolean134 = false;

	public int anInt610;

	public boolean aBoolean135 = false;

	public static void method411(Class39 arg0, int arg1) {
		try {
			Class1_Sub3_Sub3 var2 = new Class1_Sub3_Sub3(363, arg0.method536("varp.dat", (byte[]) null, (byte) 2));
			anInt606 = 0;
			int var5 = 28 / arg1;
			anInt605 = var2.method393();
			if (aClass23Array1 == null) {
				aClass23Array1 = new Class23[anInt605];
			}
			if (anIntArray194 == null) {
				anIntArray194 = new int[anInt605];
			}
			for (int var3 = 0; var3 < anInt605; ++var3) {
				if (aClass23Array1[var3] == null) {
					aClass23Array1[var3] = new Class23();
				}
				aClass23Array1[var3].method412(anInt604, var3, var2);
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("45283, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method412(int arg0, int arg1, Class1_Sub3_Sub3 arg2) {
		try {
			if (arg0 == 13703) {
				while (true) {
					int var4 = arg2.method391();
					if (var4 == 0) {
						return;
					}
					if (var4 == 1) {
						this.anInt607 = arg2.method391();
					} else if (var4 == 2) {
						this.anInt608 = arg2.method391();
					} else if (var4 == 3) {
						this.aBoolean132 = true;
						anIntArray194[anInt606++] = arg1;
					} else if (var4 == 4) {
						this.aBoolean133 = false;
					} else if (var4 == 5) {
						this.anInt609 = arg2.method393();
					} else if (var4 == 6) {
						this.aBoolean134 = true;
					} else if (var4 == 7) {
						this.anInt610 = arg2.method396();
					} else if (var4 == 8) {
						this.aBoolean135 = true;
					} else if (var4 == 10) {
						this.aString25 = arg2.method398();
					} else {
						System.out.println("Error unrecognised config code: " + var4);
					}
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("67426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
