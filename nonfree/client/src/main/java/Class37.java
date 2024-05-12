import sign.signlink;

public final class Class37 {

	private int anInt764 = 4277;

	private boolean aBoolean149 = false;

	private int anInt765;

	private Class1[] aClass1Array1;

	public Class37(int arg0, int arg1) {
		try {
			this.anInt765 = arg1;
			this.aClass1Array1 = new Class1[arg1];
			if (arg0 < 9 || arg0 > 9) {
				this.aBoolean149 = !this.aBoolean149;
			}
			for (int var3 = 0; var3 < arg1; ++var3) {
				Class1 var4 = this.aClass1Array1[var3] = new Class1();
				var4.aClass1_41 = var4;
				var4.aClass1_42 = var4;
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("73766, " + arg0 + ", " + arg1 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public Class1 method530(long arg0) {
		Class1 var3 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt765 - 1))];
		for (Class1 var4 = var3.aClass1_41; var4 != var3; var4 = var4.aClass1_41) {
			if (var4.aLong26 == arg0) {
				return var4;
			}
		}
		return null;
	}

	public void method531(long arg0, int arg1, Class1 arg2) {
		try {
			if (arg2.aClass1_42 != null) {
				arg2.method567();
			}
			Class1 var5 = this.aClass1Array1[(int) (arg0 & (long) (this.anInt765 - 1))];
			arg2.aClass1_42 = var5.aClass1_42;
			if (arg1 < 0) {
				arg2.aClass1_41 = var5;
				arg2.aClass1_42.aClass1_41 = arg2;
				arg2.aClass1_41.aClass1_42 = arg2;
				arg2.aLong26 = arg0;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("49205, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
