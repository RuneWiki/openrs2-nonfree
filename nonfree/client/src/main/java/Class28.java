import sign.signlink;

public final class Class28 {

	private boolean aBoolean139 = true;

	private byte aByte32 = 2;

	private int anInt664 = -546;

	private int anInt665 = -676;

	public Class1 aClass1_33 = new Class1();

	private Class1 aClass1_34;

	public Class28(int arg0) {
		try {
			if (arg0 != 0) {
				this.aBoolean139 = !this.aBoolean139;
			}
			this.aClass1_33.aClass1_41 = this.aClass1_33;
			this.aClass1_33.aClass1_42 = this.aClass1_33;
		} catch (RuntimeException var3) {
			signlink.reporterror("59838, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public void method453(Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method567();
		}
		arg0.aClass1_42 = this.aClass1_33.aClass1_42;
		arg0.aClass1_41 = this.aClass1_33;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	public void method454(Class1 arg0, int arg1) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method567();
			}
			arg0.aClass1_42 = this.aClass1_33;
			if (arg1 == -26173) {
				arg0.aClass1_41 = this.aClass1_33.aClass1_41;
				arg0.aClass1_42.aClass1_41 = arg0;
				arg0.aClass1_41.aClass1_42 = arg0;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("2399, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public Class1 method455() {
		Class1 var1 = this.aClass1_33.aClass1_41;
		if (var1 == this.aClass1_33) {
			return null;
		} else {
			var1.method567();
			return var1;
		}
	}

	public Class1 method456() {
		Class1 var1 = this.aClass1_33.aClass1_41;
		if (var1 == this.aClass1_33) {
			this.aClass1_34 = null;
			return null;
		} else {
			this.aClass1_34 = var1.aClass1_41;
			return var1;
		}
	}

	public Class1 method457(byte arg0) {
		try {
			Class1 var2 = this.aClass1_33.aClass1_42;
			if (var2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = var2.aClass1_42;
				if (arg0 != this.aByte32) {
					this.anInt665 = 112;
				}
				return var2;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("37919, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public Class1 method458(int arg0) {
		try {
			if (arg0 <= 0) {
				throw new NullPointerException();
			} else {
				Class1 var2 = this.aClass1_34;
				if (var2 == this.aClass1_33) {
					this.aClass1_34 = null;
					return null;
				} else {
					this.aClass1_34 = var2.aClass1_41;
					return var2;
				}
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("89761, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public Class1 method459(boolean arg0) {
		try {
			Class1 var2 = this.aClass1_34;
			if (arg0) {
				for (int var3 = 1; var3 > 0; ++var3) {
				}
			}
			if (var2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = var2.aClass1_42;
				return var2;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("58136, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public void method460() {
		while (true) {
			Class1 var1 = this.aClass1_33.aClass1_41;
			if (var1 == this.aClass1_33) {
				return;
			}
			var1.method567();
		}
	}
}
