import sign.signlink;

public class Class44 {

	private static int anInt951 = 8;

	private int anInt952 = -15143;

	private Class42 aClass42_1;

	private Class42 aClass42_2;

	private Class42 aClass42_3;

	private Class42 aClass42_4;

	private Class42 aClass42_5;

	private Class42 aClass42_6;

	private Class42 aClass42_7;

	private Class42 aClass42_8;

	private int[] anIntArray236 = new int[5];

	private int[] anIntArray237 = new int[5];

	private int[] anIntArray238 = new int[5];

	private int anInt953;

	private int anInt954 = 100;

	int anInt955 = 500;

	int anInt956;

	private static int[] anIntArray239;

	private static int[] anIntArray240;

	private static int[] anIntArray241;

	private static int[] anIntArray242 = new int[5];

	private static int[] anIntArray243 = new int[5];

	private static int[] anIntArray244 = new int[5];

	private static int[] anIntArray245 = new int[5];

	private static int[] anIntArray246 = new int[5];

	public static final void method575() {
		anIntArray240 = new int[32768];
		for (int var0 = 0; var0 < 32768; ++var0) {
			if (Math.random() > 0.5D) {
				anIntArray240[var0] = 1;
			} else {
				anIntArray240[var0] = -1;
			}
		}
		anIntArray241 = new int[32768];
		for (int var1 = 0; var1 < 32768; ++var1) {
			anIntArray241[var1] = (int) (Math.sin((double) var1 / 5215.1903D) * 16384.0D);
		}
		anIntArray239 = new int[220500];
	}

	public final int[] method576(int arg0, int arg1) {
		for (int var3 = 0; var3 < arg0; ++var3) {
			anIntArray239[var3] = 0;
		}
		if (arg1 < 10) {
			return anIntArray239;
		} else {
			double var4 = (double) arg0 / ((double) arg1 + 0.0D);
			this.aClass42_1.method553(anInt951);
			this.aClass42_2.method553(anInt951);
			int var6 = 0;
			int var7 = 0;
			int var8 = 0;
			if (this.aClass42_3 != null) {
				this.aClass42_3.method553(anInt951);
				this.aClass42_4.method553(anInt951);
				var6 = (int) ((double) (this.aClass42_3.anInt828 - this.aClass42_3.anInt827) * 32.768D / var4);
				var7 = (int) ((double) this.aClass42_3.anInt827 * 32.768D / var4);
			}
			int var9 = 0;
			int var10 = 0;
			int var11 = 0;
			if (this.aClass42_5 != null) {
				this.aClass42_5.method553(anInt951);
				this.aClass42_6.method553(anInt951);
				var9 = (int) ((double) (this.aClass42_5.anInt828 - this.aClass42_5.anInt827) * 32.768D / var4);
				var10 = (int) ((double) this.aClass42_5.anInt827 * 32.768D / var4);
			}
			for (int var12 = 0; var12 < 5; ++var12) {
				if (this.anIntArray236[var12] != 0) {
					anIntArray242[var12] = 0;
					anIntArray243[var12] = (int) ((double) this.anIntArray238[var12] * var4);
					anIntArray244[var12] = (this.anIntArray236[var12] << 14) / 100;
					anIntArray245[var12] = (int) ((double) (this.aClass42_1.anInt828 - this.aClass42_1.anInt827) * 32.768D * Math.pow(1.0057929410678534D, (double) this.anIntArray237[var12]) / var4);
					anIntArray246[var12] = (int) ((double) this.aClass42_1.anInt827 * 32.768D / var4);
				}
			}
			int var14;
			int var15;
			int var17;
			for (int var13 = 0; var13 < arg0; ++var13) {
				var14 = this.aClass42_1.method554(true, arg0);
				var15 = this.aClass42_2.method554(true, arg0);
				int var16;
				if (this.aClass42_3 != null) {
					var16 = this.aClass42_3.method554(true, arg0);
					var17 = this.aClass42_4.method554(true, arg0);
					var14 += this.method577(-15143, var17, var8, this.aClass42_3.anInt829) >> 1;
					var8 += (var16 * var6 >> 16) + var7;
				}
				if (this.aClass42_5 != null) {
					var16 = this.aClass42_5.method554(true, arg0);
					var17 = this.aClass42_6.method554(true, arg0);
					var15 = var15 * ((this.method577(-15143, var17, var11, this.aClass42_5.anInt829) >> 1) + 32768) >> 15;
					var11 += (var16 * var9 >> 16) + var10;
				}
				for (var16 = 0; var16 < 5; ++var16) {
					if (this.anIntArray236[var16] != 0) {
						var17 = var13 + anIntArray243[var16];
						if (var17 < arg0) {
							anIntArray239[var17] += this.method577(-15143, var15 * anIntArray244[var16] >> 15, anIntArray242[var16], this.aClass42_1.anInt829);
							anIntArray242[var16] += (var14 * anIntArray245[var16] >> 16) + anIntArray246[var16];
						}
					}
				}
			}
			if (this.aClass42_7 != null) {
				this.aClass42_7.method553(anInt951);
				this.aClass42_8.method553(anInt951);
				var14 = 0;
				boolean var20 = false;
				boolean var21 = true;
				for (var17 = 0; var17 < arg0; ++var17) {
					int var18 = this.aClass42_7.method554(true, arg0);
					int var19 = this.aClass42_8.method554(true, arg0);
					if (var21) {
						var15 = this.aClass42_7.anInt827 + ((this.aClass42_7.anInt828 - this.aClass42_7.anInt827) * var18 >> 8);
					} else {
						var15 = this.aClass42_7.anInt827 + ((this.aClass42_7.anInt828 - this.aClass42_7.anInt827) * var19 >> 8);
					}
					var14 += 256;
					if (var14 >= var15) {
						var14 = 0;
						var21 = !var21;
					}
					if (var21) {
						anIntArray239[var17] = 0;
					}
				}
			}
			if (this.anInt953 > 0 && this.anInt954 > 0) {
				var14 = (int) ((double) this.anInt953 * var4);
				for (var15 = var14; var15 < arg0; ++var15) {
					anIntArray239[var15] += anIntArray239[var15 - var14] * this.anInt954 / 100;
				}
			}
			for (var14 = 0; var14 < arg0; ++var14) {
				if (anIntArray239[var14] < -32768) {
					anIntArray239[var14] = -32768;
				}
				if (anIntArray239[var14] > 32767) {
					anIntArray239[var14] = 32767;
				}
			}
			return anIntArray239;
		}
	}

	private final int method577(int arg0, int arg1, int arg2, int arg3) {
		try {
			if (arg0 != this.anInt952) {
				return 2;
			} else if (arg3 == 1) {
				return (arg2 & 32767) < 16384 ? arg1 : -arg1;
			} else if (arg3 == 2) {
				return anIntArray241[arg2 & 32767] * arg1 >> 14;
			} else if (arg3 == 3) {
				return ((arg2 & 32767) * arg1 >> 14) - arg1;
			} else {
				return arg3 == 4 ? anIntArray240[arg2 / 2607 & 32767] * arg1 : 0;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("41611, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final void method578(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			this.aClass42_1 = new Class42();
			this.aClass42_1.method552(false, arg1);
			this.aClass42_2 = new Class42();
			this.aClass42_2.method552(false, arg1);
			int var3 = arg1.method391();
			if (arg0) {
				throw new NullPointerException();
			} else {
				if (var3 != 0) {
					--arg1.anInt561;
					this.aClass42_3 = new Class42();
					this.aClass42_3.method552(false, arg1);
					this.aClass42_4 = new Class42();
					this.aClass42_4.method552(false, arg1);
				}
				var3 = arg1.method391();
				if (var3 != 0) {
					--arg1.anInt561;
					this.aClass42_5 = new Class42();
					this.aClass42_5.method552(false, arg1);
					this.aClass42_6 = new Class42();
					this.aClass42_6.method552(false, arg1);
				}
				var3 = arg1.method391();
				if (var3 != 0) {
					--arg1.anInt561;
					this.aClass42_7 = new Class42();
					this.aClass42_7.method552(false, arg1);
					this.aClass42_8 = new Class42();
					this.aClass42_8.method552(false, arg1);
				}
				for (int var4 = 0; var4 < 10; ++var4) {
					int var5 = arg1.method405();
					if (var5 == 0) {
						break;
					}
					this.anIntArray236[var4] = var5;
					this.anIntArray237[var4] = arg1.method404();
					this.anIntArray238[var4] = arg1.method405();
				}
				this.anInt953 = arg1.method405();
				this.anInt954 = arg1.method405();
				this.anInt955 = arg1.method393();
				this.anInt956 = arg1.method393();
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("36876, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
