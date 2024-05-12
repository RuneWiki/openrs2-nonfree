import sign.signlink;

class Class1_Sub1_Sub3 extends Class1_Sub1 {

	private int anInt889 = 332;

	private boolean aBoolean161 = false;

	int anInt890;

	int anInt891;

	int anInt892;

	boolean aBoolean162 = false;

	int anInt893 = 1;

	int anInt894 = -1;

	int anInt895 = -1;

	int anInt896 = -1;

	int anInt897 = -1;

	int anInt898 = -1;

	int anInt899 = -1;

	int anInt900 = -1;

	String aString29;

	int anInt901 = 100;

	int anInt902;

	int anInt903;

	int anInt904;

	int anInt905;

	int anInt906 = -1000;

	int anInt907;

	int anInt908;

	int anInt909 = -1;

	int anInt910;

	int anInt911;

	int anInt912 = -1;

	int anInt913;

	int anInt914;

	int anInt915 = -1;

	int anInt916;

	int anInt917;

	int anInt918;

	int anInt919;

	int anInt920 = -1;

	int anInt921;

	int anInt922;

	int anInt923;

	int anInt924;

	int anInt925;

	int anInt926;

	int anInt927;

	int anInt928;

	int anInt929;

	int anInt930;

	int anInt931;

	int anInt932;

	int anInt933;

	int anInt934;

	int anInt935;

	int[] anIntArray232 = new int[10];

	int[] anIntArray233 = new int[10];

	boolean[] aBooleanArray9 = new boolean[10];

	int anInt936;

	public final void method569(boolean arg0, boolean arg1, int arg2, int arg3) {
		try {
			if (this.anInt915 != -1 && Class19.aClass19Array1[this.anInt915].anInt545 <= 1) {
				this.anInt915 = -1;
			}
			if (!arg1) {
				int var5 = arg2 - this.anIntArray232[0];
				int var6 = arg3 - this.anIntArray233[0];
				if (var5 >= -8 && var5 <= 8 && var6 >= -8 && var6 <= 8) {
					if (this.anInt935 < 9) {
						++this.anInt935;
					}
					for (int var7 = this.anInt935; var7 > 0; --var7) {
						this.anIntArray232[var7] = this.anIntArray232[var7 - 1];
						this.anIntArray233[var7] = this.anIntArray233[var7 - 1];
						this.aBooleanArray9[var7] = this.aBooleanArray9[var7 - 1];
					}
					this.anIntArray232[0] = arg2;
					this.anIntArray233[0] = arg3;
					this.aBooleanArray9[0] = false;
					return;
				}
			}
			this.anInt935 = 0;
			this.anInt936 = 0;
			this.anIntArray232[0] = arg2;
			if (!arg0) {
				this.anIntArray233[0] = arg3;
				this.anInt890 = this.anIntArray232[0] * 128 + this.anInt893 * 64;
				this.anInt891 = this.anIntArray233[0] * 128 + this.anInt893 * 64;
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("85707, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public final void method570(boolean arg0, int arg1, byte arg2) {
		try {
			int var4 = this.anIntArray232[0];
			int var5 = this.anIntArray233[0];
			if (arg2 == 6) {
				boolean var8 = false;
			} else {
				this.anInt889 = 243;
			}
			if (arg1 == 0) {
				--var4;
				++var5;
			}
			if (arg1 == 1) {
				++var5;
			}
			if (arg1 == 2) {
				++var4;
				++var5;
			}
			if (arg1 == 3) {
				--var4;
			}
			if (arg1 == 4) {
				++var4;
			}
			if (arg1 == 5) {
				--var4;
				--var5;
			}
			if (arg1 == 6) {
				--var5;
			}
			if (arg1 == 7) {
				++var4;
				--var5;
			}
			if (this.anInt915 != -1 && Class19.aClass19Array1[this.anInt915].anInt545 <= 1) {
				this.anInt915 = -1;
			}
			if (this.anInt935 < 9) {
				++this.anInt935;
			}
			for (int var6 = this.anInt935; var6 > 0; --var6) {
				this.anIntArray232[var6] = this.anIntArray232[var6 - 1];
				this.anIntArray233[var6] = this.anIntArray233[var6 - 1];
				this.aBooleanArray9[var6] = this.aBooleanArray9[var6 - 1];
			}
			this.anIntArray232[0] = var4;
			this.anIntArray233[0] = var5;
			this.aBooleanArray9[0] = arg0;
		} catch (RuntimeException var7) {
			signlink.reporterror("18445, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public boolean method571(boolean arg0) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else {
				return false;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("65424, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
