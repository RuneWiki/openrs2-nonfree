import sign.signlink;

final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	private int anInt58;

	private int anInt59;

	private Class21 aClass21_2;

	public int anInt60;

	public int anInt61;

	public int anInt62;

	public int anInt63;

	public int anInt64;

	private int anInt65;

	private int anInt66;

	public boolean aBoolean17 = false;

	public Class1_Sub1_Sub2(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
		try {
			this.aClass21_2 = Class21.aClass21Array1[arg1];
			this.anInt61 = arg6;
			if (arg2) {
				this.anInt59 = -147;
			}
			this.anInt62 = arg0;
			this.anInt63 = arg3;
			this.anInt64 = arg5;
			this.anInt60 = arg7 + arg4;
			this.aBoolean17 = false;
		} catch (RuntimeException var10) {
			signlink.reporterror("19764, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public final void method29(int arg0, int arg1) {
		try {
			if (arg1 != 0) {
				this.anInt59 = -255;
			}
			this.anInt66 += arg0;
			while (true) {
				do {
					do {
						if (this.anInt66 <= this.aClass21_2.aClass19_1.anIntArray188[this.anInt65]) {
							return;
						}
						this.anInt66 -= this.aClass21_2.aClass19_1.anIntArray188[this.anInt65] + 1;
						++this.anInt65;
					} while (this.anInt65 < this.aClass21_2.aClass19_1.anInt543);
				} while (this.anInt65 >= 0 && this.anInt65 < this.aClass21_2.aClass19_1.anInt543);
				this.anInt65 = 0;
				this.aBoolean17 = true;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("59523, " + arg0 + ", " + arg1 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method568(boolean arg0) {
		try {
			Class1_Sub3_Sub1 var2 = this.aClass21_2.method409();
			Class1_Sub3_Sub1 var3 = new Class1_Sub3_Sub1(var2, true, !this.aClass21_2.aBoolean131, this.anInt58, false);
			if (!arg0) {
				throw new NullPointerException();
			} else {
				if (!this.aBoolean17) {
					var3.method230(4);
					var3.method231(-16599, this.aClass21_2.aClass19_1.anIntArray186[this.anInt65]);
					var3.anIntArrayArray7 = null;
					var3.anIntArrayArray6 = null;
				}
				if (this.aClass21_2.anInt571 != 128 || this.aClass21_2.anInt572 != 128) {
					var3.method239(this.aClass21_2.anInt571, 2, this.aClass21_2.anInt572, this.aClass21_2.anInt571);
				}
				if (this.aClass21_2.anInt573 != 0) {
					if (this.aClass21_2.anInt573 == 90) {
						var3.method234(0);
					}
					if (this.aClass21_2.anInt573 == 180) {
						var3.method234(0);
						var3.method234(0);
					}
					if (this.aClass21_2.anInt573 == 270) {
						var3.method234(0);
						var3.method234(0);
						var3.method234(0);
					}
				}
				var3.method240(64 + this.aClass21_2.anInt574, 850 + this.aClass21_2.anInt575, -30, -50, -30, true);
				return var3;
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("26048, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}
}
