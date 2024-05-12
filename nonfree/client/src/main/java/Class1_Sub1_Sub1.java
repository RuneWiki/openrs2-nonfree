import sign.signlink;

final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	private int anInt22;

	private int anInt23 = -159;

	private Class21 aClass21_1;

	public int anInt24;

	public int anInt25;

	public int anInt26;

	public int anInt27;

	public int anInt28;

	public int anInt29;

	public int anInt30;

	public int anInt31;

	public int anInt32;

	public int anInt33;

	public boolean aBoolean5 = false;

	public double aDouble1;

	public double aDouble2;

	public double aDouble3;

	private double aDouble4;

	private double aDouble5;

	private double aDouble6;

	private double aDouble7;

	private double aDouble8;

	public int anInt34;

	public int anInt35;

	private int anInt36;

	private int anInt37;

	public Class1_Sub1_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
		try {
			this.aClass21_1 = Class21.aClass21Array1[arg10];
			if (arg8 != 0) {
				throw new NullPointerException();
			} else {
				this.anInt24 = arg4;
				this.anInt25 = arg11;
				this.anInt26 = arg2;
				this.anInt27 = arg9;
				this.anInt29 = arg6;
				this.anInt30 = arg3;
				this.anInt31 = arg1;
				this.anInt32 = arg7;
				this.anInt33 = arg5;
				this.anInt28 = arg0;
				this.aBoolean5 = false;
			}
		} catch (RuntimeException var14) {
			signlink.reporterror("57613, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + var14.toString());
			throw new RuntimeException();
		}
	}

	public final void method19(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			double var6;
			if (!this.aBoolean5) {
				var6 = (double) (arg2 - this.anInt25);
				double var8 = (double) (arg1 - this.anInt26);
				double var10 = Math.sqrt(var6 * var6 + var8 * var8);
				this.aDouble1 = (double) this.anInt25 + var6 * (double) this.anInt32 / var10;
				this.aDouble2 = (double) this.anInt26 + var8 * (double) this.anInt32 / var10;
				this.aDouble3 = (double) this.anInt27;
			}
			var6 = (double) (this.anInt30 + 1 - arg4);
			this.aDouble4 = ((double) arg2 - this.aDouble1) / var6;
			this.aDouble5 = ((double) arg1 - this.aDouble2) / var6;
			this.aDouble6 = Math.sqrt(this.aDouble4 * this.aDouble4 + this.aDouble5 * this.aDouble5);
			if (!this.aBoolean5) {
				this.aDouble7 = -this.aDouble6 * Math.tan((double) this.anInt31 * 0.02454369D);
			}
			this.aDouble8 = 2.0D * ((double) arg0 - this.aDouble3 - this.aDouble7 * var6) / (var6 * var6);
			if (arg3 < 0) {
				;
			}
		} catch (RuntimeException var12) {
			signlink.reporterror("18544, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var12.toString());
			throw new RuntimeException();
		}
	}

	public final void method20(byte arg0, int arg1) {
		try {
			if (arg0 != -30) {
				this.anInt23 = -454;
			}
			this.aBoolean5 = true;
			this.aDouble1 += this.aDouble4 * (double) arg1;
			this.aDouble2 += this.aDouble5 * (double) arg1;
			this.aDouble3 += this.aDouble7 * (double) arg1 + 0.5D * this.aDouble8 * (double) arg1 * (double) arg1;
			this.aDouble7 += this.aDouble8 * (double) arg1;
			this.anInt34 = (int) (Math.atan2(this.aDouble4, this.aDouble5) * 325.949D) + 1024 & 2047;
			this.anInt35 = (int) (Math.atan2(this.aDouble7, this.aDouble6) * 325.949D) & 2047;
			if (this.aClass21_1.aClass19_1 != null) {
				this.anInt37 += arg1;
				while (this.anInt37 > this.aClass21_1.aClass19_1.anIntArray188[this.anInt36]) {
					this.anInt37 -= this.aClass21_1.aClass19_1.anIntArray188[this.anInt36] + 1;
					++this.anInt36;
					if (this.anInt36 >= this.aClass21_1.aClass19_1.anInt543) {
						this.anInt36 = 0;
					}
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("86911, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method568(boolean arg0) {
		try {
			Class1_Sub3_Sub1 var2 = this.aClass21_1.method409();
			Class1_Sub3_Sub1 var3 = new Class1_Sub3_Sub1(var2, true, !this.aClass21_1.aBoolean131, this.anInt22, false);
			if (!arg0) {
				for (int var4 = 1; var4 > 0; ++var4) {
				}
			}
			if (this.aClass21_1.aClass19_1 != null) {
				var3.method230(4);
				var3.method231(-16599, this.aClass21_1.aClass19_1.anIntArray186[this.anInt36]);
				var3.anIntArrayArray7 = null;
				var3.anIntArrayArray6 = null;
			}
			if (this.aClass21_1.anInt571 != 128 || this.aClass21_1.anInt572 != 128) {
				var3.method239(this.aClass21_1.anInt571, 2, this.aClass21_1.anInt572, this.aClass21_1.anInt571);
			}
			var3.method235((byte) 7, this.anInt35);
			var3.method240(64 + this.aClass21_1.anInt574, 850 + this.aClass21_1.anInt575, -30, -50, -30, true);
			return var3;
		} catch (RuntimeException var5) {
			signlink.reporterror("99718, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
