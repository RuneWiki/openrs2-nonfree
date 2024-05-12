import sign.signlink;

public final class Class35 {

	private boolean aBoolean145 = false;

	private static int anInt725 = 5;

	private int anInt726;

	private int anInt727;

	private Class37 aClass37_1 = new Class37(9, 1024);

	private Class30 aClass30_1 = new Class30(anInt725);

	public Class35(byte arg0, int arg1) {
		try {
			this.anInt726 = arg1;
			if (arg0 != 0) {
				for (int var3 = 1; var3 > 0; ++var3) {
				}
			}
			this.anInt727 = arg1;
		} catch (RuntimeException var4) {
			signlink.reporterror("73592, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public Class1_Sub3 method527(long arg0) {
		Class1_Sub3 var3 = (Class1_Sub3) this.aClass37_1.method530(arg0);
		if (var3 != null) {
			this.aClass30_1.method461(var3);
		}
		return var3;
	}

	public void method528(int arg0, long arg1, Class1_Sub3 arg2) {
		try {
			if (this.anInt727 == 0) {
				Class1_Sub3 var5 = this.aClass30_1.method462();
				var5.method567();
				var5.method377();
			} else {
				--this.anInt727;
			}
			this.aClass37_1.method531(arg1, -566, arg2);
			if (arg0 < 6 || arg0 > 6) {
				this.aBoolean145 = !this.aBoolean145;
			}
			this.aClass30_1.method461(arg2);
		} catch (RuntimeException var6) {
			signlink.reporterror("10260, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public void method529() {
		while (true) {
			Class1_Sub3 var1 = this.aClass30_1.method462();
			if (var1 == null) {
				this.anInt727 = this.anInt726;
				return;
			}
			var1.method567();
			var1.method377();
		}
	}
}
