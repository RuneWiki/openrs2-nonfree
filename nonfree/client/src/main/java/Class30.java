import sign.signlink;

public final class Class30 {

	private int anInt678 = 679;

	private byte aByte34 = 2;

	private boolean aBoolean140 = true;

	private Class1_Sub3 aClass1_Sub3_17 = new Class1_Sub3();

	public Class30(int arg0) {
		try {
			this.aClass1_Sub3_17.aClass1_Sub3_15 = this.aClass1_Sub3_17;
			if (arg0 < 5 || arg0 > 5) {
				this.anInt678 = -426;
			}
			this.aClass1_Sub3_17.aClass1_Sub3_16 = this.aClass1_Sub3_17;
		} catch (RuntimeException var3) {
			signlink.reporterror("27606, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public void method461(Class1_Sub3 arg0) {
		if (arg0.aClass1_Sub3_16 != null) {
			arg0.method377();
		}
		arg0.aClass1_Sub3_16 = this.aClass1_Sub3_17.aClass1_Sub3_16;
		arg0.aClass1_Sub3_15 = this.aClass1_Sub3_17;
		arg0.aClass1_Sub3_16.aClass1_Sub3_15 = arg0;
		arg0.aClass1_Sub3_15.aClass1_Sub3_16 = arg0;
	}

	public Class1_Sub3 method462() {
		Class1_Sub3 var1 = this.aClass1_Sub3_17.aClass1_Sub3_15;
		if (var1 == this.aClass1_Sub3_17) {
			return null;
		} else {
			var1.method377();
			return var1;
		}
	}
}
