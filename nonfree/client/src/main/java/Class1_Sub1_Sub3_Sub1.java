import sign.signlink;

final class Class1_Sub1_Sub3_Sub1 extends Class1_Sub1_Sub3 {

	private int anInt884;

	private boolean aBoolean159 = false;

	Class3 aClass3_1;

	public final Class1_Sub3_Sub1 method568(boolean arg0) {
		try {
			if (this.aClass3_1 == null) {
				return null;
			} else if (super.anInt920 != -1 && super.anInt921 != -1) {
				Class1_Sub3_Sub1 var2 = this.method560(false);
				Class21 var3 = Class21.aClass21Array1[super.anInt920];
				Class1_Sub3_Sub1 var4 = new Class1_Sub3_Sub1(var3.method409(), true, !var3.aBoolean131, this.anInt884, false);
				var4.method236(-super.anInt924, 0, -122, 0);
				var4.method230(4);
				var4.method231(-16599, var3.aClass19_1.anIntArray186[super.anInt921]);
				var4.anIntArrayArray7 = null;
				var4.anIntArrayArray6 = null;
				if (!arg0) {
					throw new NullPointerException();
				} else {
					if (var3.anInt571 != 128 || var3.anInt572 != 128) {
						var4.method239(var3.anInt571, 2, var3.anInt572, var3.anInt571);
					}
					var4.method240(64 + var3.anInt574, 850 + var3.anInt575, -30, -50, -30, true);
					Class1_Sub3_Sub1[] var5 = new Class1_Sub3_Sub1[] { var2, var4 };
					Class1_Sub3_Sub1 var6 = new Class1_Sub3_Sub1(var5, (byte) -31, 2, true);
					if (this.aClass3_1.aByte4 == 1) {
						var6.aBoolean84 = true;
					}
					return var6;
				}
			} else {
				return this.method560(false);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("64857, " + arg0 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method560(boolean arg0) {
		try {
			int var2;
			if (super.anInt915 >= 0 && super.anInt918 == 0) {
				var2 = Class19.aClass19Array1[super.anInt915].anIntArray186[super.anInt916];
				int var5 = -1;
				if (super.anInt912 >= 0 && super.anInt912 != super.anInt894) {
					var5 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
				}
				return this.aClass3_1.method34(var2, var5, Class19.aClass19Array1[super.anInt915].anIntArray189);
			} else {
				var2 = -1;
				if (arg0) {
					throw new NullPointerException();
				} else {
					if (super.anInt912 >= 0) {
						var2 = Class19.aClass19Array1[super.anInt912].anIntArray186[super.anInt913];
					}
					Class1_Sub3_Sub1 var3 = this.aClass3_1.method34(var2, -1, (int[]) null);
					super.anInt933 = var3.anInt368;
					return var3;
				}
			}
		} catch (RuntimeException var4) {
			signlink.reporterror("9268, " + arg0 + ", " + var4.toString());
			throw new RuntimeException();
		}
	}

	public final boolean method571(boolean arg0) {
		try {
			if (arg0) {
				this.aBoolean159 = !this.aBoolean159;
			}
			return this.aClass3_1 != null;
		} catch (RuntimeException var3) {
			signlink.reporterror("55429, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
