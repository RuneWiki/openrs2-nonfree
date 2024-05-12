import sign.signlink;

final class Class2 {

	private static int anInt38;

	private static int anInt39;

	public static boolean aBoolean6;

	private static int anInt40;

	private static int[] anIntArray3;

	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_1;

	private static Class2[] aClass2Array1;

	private static int anInt41;

	private int anInt42 = -1;

	private int[] anIntArray4;

	private int[] anIntArray5;

	public String aString1;

	public byte[] aByteArray1;

	private int[] anIntArray6;

	private int[] anIntArray7;

	public int anInt43;

	public int anInt44;

	public boolean aBoolean7;

	public boolean aBoolean8;

	public boolean aBoolean9;

	private boolean aBoolean10;

	private boolean aBoolean11;

	public boolean aBoolean12;

	public int anInt45;

	public int anInt46;

	private byte aByte2;

	private byte aByte3;

	public String[] aStringArray1;

	private boolean aBoolean13;

	public int anInt47;

	public int anInt48;

	private boolean aBoolean14;

	public boolean aBoolean15;

	private int anInt49;

	private int anInt50;

	private int anInt51;

	private int anInt52;

	private int anInt53;

	private int anInt54;

	public int anInt55;

	public boolean aBoolean16;

	public static Class35 aClass35_1 = new Class35((byte) 0, 500);

	public static Class35 aClass35_2 = new Class35((byte) 0, 30);

	public static final void method21(Class39 arg0) {
		aClass1_Sub3_Sub3_1 = new Class1_Sub3_Sub3(363, arg0.method536("loc.dat", (byte[]) null, (byte) 2));
		Class1_Sub3_Sub3 var1 = new Class1_Sub3_Sub3(363, arg0.method536("loc.idx", (byte[]) null, (byte) 2));
		anInt40 = var1.method393();
		anIntArray3 = new int[anInt40];
		int var2 = 2;
		for (int var3 = 0; var3 < anInt40; ++var3) {
			anIntArray3[var3] = var2;
			var2 += var1.method393();
		}
		aClass2Array1 = new Class2[10];
		for (int var4 = 0; var4 < 10; ++var4) {
			aClass2Array1[var4] = new Class2();
		}
	}

	public static final void method22(boolean arg0) {
		try {
			aClass35_1 = null;
			aClass35_2 = null;
			if (arg0) {
				anIntArray3 = null;
				aClass2Array1 = null;
				aClass1_Sub3_Sub3_1 = null;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("1378, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static final Class2 method23(int arg0) {
		for (int var1 = 0; var1 < 10; ++var1) {
			if (aClass2Array1[var1].anInt42 == arg0) {
				return aClass2Array1[var1];
			}
		}
		anInt41 = (anInt41 + 1) % 10;
		Class2 var2 = aClass2Array1[anInt41];
		aClass1_Sub3_Sub3_1.anInt561 = anIntArray3[arg0];
		var2.anInt42 = arg0;
		var2.method24();
		var2.method25(false, aClass1_Sub3_Sub3_1);
		return var2;
	}

	private final void method24() {
		this.anIntArray4 = null;
		this.anIntArray5 = null;
		this.aString1 = null;
		this.aByteArray1 = null;
		this.anIntArray6 = null;
		this.anIntArray7 = null;
		this.anInt43 = 1;
		this.anInt44 = 1;
		this.aBoolean7 = true;
		this.aBoolean8 = true;
		this.aBoolean9 = false;
		this.aBoolean10 = false;
		this.aBoolean11 = false;
		this.aBoolean12 = false;
		this.anInt45 = -1;
		this.anInt46 = 16;
		this.aByte2 = 0;
		this.aByte3 = 0;
		this.aStringArray1 = null;
		this.aBoolean13 = false;
		this.anInt47 = -1;
		this.anInt48 = -1;
		this.aBoolean14 = false;
		this.aBoolean15 = true;
		this.anInt49 = 128;
		this.anInt50 = 128;
		this.anInt51 = 128;
		this.anInt55 = 0;
		this.anInt52 = 0;
		this.anInt53 = 0;
		this.anInt54 = 0;
		this.aBoolean16 = false;
	}

	private final void method25(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			int var3;
			if (arg0) {
				for (var3 = 1; var3 > 0; ++var3) {
				}
			}
			var3 = -1;
			while (true) {
				while (true) {
					int var4 = arg1.method391();
					if (var4 == 0) {
						if (this.anIntArray5 == null) {
							this.anIntArray5 = new int[0];
						}
						if (var3 == -1) {
							this.aBoolean9 = false;
							if (this.anIntArray5.length > 0 && this.anIntArray5[0] == 10) {
								this.aBoolean9 = true;
							}
							if (this.aStringArray1 != null) {
								this.aBoolean9 = true;
								return;
							}
						}
						return;
					}
					int var5;
					int var6;
					if (var4 == 1) {
						var5 = arg1.method391();
						this.anIntArray5 = new int[var5];
						this.anIntArray4 = new int[var5];
						for (var6 = 0; var6 < var5; ++var6) {
							this.anIntArray4[var6] = arg1.method393();
							this.anIntArray5[var6] = arg1.method391();
						}
					} else if (var4 == 2) {
						this.aString1 = arg1.method398();
					} else if (var4 == 3) {
						this.aByteArray1 = arg1.method399((byte) 31);
					} else if (var4 == 14) {
						this.anInt43 = arg1.method391();
					} else if (var4 == 15) {
						this.anInt44 = arg1.method391();
					} else if (var4 == 17) {
						this.aBoolean7 = false;
					} else if (var4 == 18) {
						this.aBoolean8 = false;
					} else if (var4 == 19) {
						var3 = arg1.method391();
						if (var3 == 1) {
							this.aBoolean9 = true;
						}
					} else if (var4 == 21) {
						this.aBoolean10 = true;
					} else if (var4 == 22) {
						this.aBoolean11 = true;
					} else if (var4 == 23) {
						this.aBoolean12 = true;
					} else if (var4 == 24) {
						this.anInt45 = arg1.method393();
						if (this.anInt45 == 65535) {
							this.anInt45 = -1;
						}
					} else if (var4 == 25) {
						this.aBoolean13 = true;
					} else if (var4 == 28) {
						this.anInt46 = arg1.method391();
					} else if (var4 == 29) {
						this.aByte2 = arg1.method392();
					} else if (var4 == 39) {
						this.aByte3 = arg1.method392();
					} else if (var4 >= 30 && var4 < 39) {
						if (this.aStringArray1 == null) {
							this.aStringArray1 = new String[5];
						}
						this.aStringArray1[var4 - 30] = arg1.method398();
						if (this.aStringArray1[var4 - 30].equalsIgnoreCase("hidden")) {
							this.aStringArray1[var4 - 30] = null;
						}
					} else if (var4 == 40) {
						var5 = arg1.method391();
						this.anIntArray6 = new int[var5];
						this.anIntArray7 = new int[var5];
						for (var6 = 0; var6 < var5; ++var6) {
							this.anIntArray6[var6] = arg1.method393();
							this.anIntArray7[var6] = arg1.method393();
						}
					} else if (var4 == 60) {
						this.anInt47 = arg1.method393();
					} else if (var4 == 62) {
						this.aBoolean14 = true;
					} else if (var4 == 64) {
						this.aBoolean15 = false;
					} else if (var4 == 65) {
						this.anInt49 = arg1.method393();
					} else if (var4 == 66) {
						this.anInt50 = arg1.method393();
					} else if (var4 == 67) {
						this.anInt51 = arg1.method393();
					} else if (var4 == 68) {
						this.anInt48 = arg1.method393();
					} else if (var4 == 69) {
						this.anInt55 = arg1.method391();
					} else if (var4 == 70) {
						this.anInt52 = arg1.method394();
					} else if (var4 == 71) {
						this.anInt53 = arg1.method394();
					} else if (var4 == 72) {
						this.anInt54 = arg1.method394();
					} else if (var4 == 73) {
						this.aBoolean16 = true;
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("20782, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method26(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = -1;
		for (int var9 = 0; var9 < this.anIntArray5.length; ++var9) {
			if (this.anIntArray5[var9] == arg0) {
				var8 = var9;
				break;
			}
		}
		if (var8 == -1) {
			return null;
		} else {
			long var10 = (long) ((this.anInt42 << 6) + (var8 << 3) + arg1) + ((long) (arg6 + 1) << 32);
			if (aBoolean6) {
				var10 = 0L;
			}
			Class1_Sub3_Sub1 var12 = (Class1_Sub3_Sub1) aClass35_2.method527(var10);
			int var13;
			int var19;
			if (var12 != null) {
				if (aBoolean6) {
					return var12;
				} else {
					if (this.aBoolean10 || this.aBoolean11) {
						var12 = new Class1_Sub3_Sub1(var12, (byte) -31, this.aBoolean10, this.aBoolean11);
					}
					if (this.aBoolean10) {
						var13 = (arg2 + arg3 + arg4 + arg5) / 4;
						for (int var26 = 0; var26 < var12.anInt359; ++var26) {
							int var27 = var12.anIntArray91[var26];
							int var28 = var12.anIntArray93[var26];
							int var29 = arg2 + (arg3 - arg2) * (var27 + 64) / 128;
							int var30 = arg5 + (arg4 - arg5) * (var27 + 64) / 128;
							var19 = var29 + (var30 - var29) * (var28 + 64) / 128;
							var12.anIntArray92[var26] += var19 - var13;
						}
						var12.method228(anInt39);
					}
					return var12;
				}
			} else if (var8 >= this.anIntArray4.length) {
				return null;
			} else {
				var13 = this.anIntArray4[var8];
				if (var13 == -1) {
					return null;
				} else {
					boolean var14 = this.aBoolean14 ^ arg1 > 3;
					if (var14) {
						var13 += 65536;
					}
					Class1_Sub3_Sub1 var15 = (Class1_Sub3_Sub1) aClass35_1.method527((long) var13);
					if (var15 == null) {
						var15 = new Class1_Sub3_Sub1(false, var13 & 65535);
						if (var14) {
							var15.method238(-725);
						}
						aClass35_1.method528(6, (long) var13, var15);
					}
					boolean var16;
					if (this.anInt49 == 128 && this.anInt50 == 128 && this.anInt51 == 128) {
						var16 = false;
					} else {
						var16 = true;
					}
					boolean var17;
					if (this.anInt52 == 0 && this.anInt53 == 0 && this.anInt54 == 0) {
						var17 = false;
					} else {
						var17 = true;
					}
					Class1_Sub3_Sub1 var18 = new Class1_Sub3_Sub1(var15, this.anIntArray6 == null, !this.aBoolean13, anInt38, arg1 == 0 && arg6 == -1 && !var16 && !var17);
					if (arg6 != -1) {
						var18.method230(4);
						var18.method231(-16599, arg6);
						var18.anIntArrayArray7 = null;
						var18.anIntArrayArray6 = null;
					}
					while (arg1-- > 0) {
						var18.method234(0);
					}
					if (this.anIntArray6 != null) {
						for (var19 = 0; var19 < this.anIntArray6.length; ++var19) {
							var18.method237(this.anIntArray6[var19], this.anIntArray7[var19]);
						}
					}
					if (var16) {
						var18.method239(this.anInt51, 2, this.anInt50, this.anInt49);
					}
					if (var17) {
						var18.method236(this.anInt53, this.anInt52, -122, this.anInt54);
					}
					var18.method240(64 + this.aByte2, 768 + this.aByte3 * 5, -50, -10, -50, !this.aBoolean11);
					if (this.aBoolean7) {
						var18.anInt372 = var18.anInt368;
					}
					aClass35_2.method528(6, var10, var18);
					if (this.aBoolean10 || this.aBoolean11) {
						var18 = new Class1_Sub3_Sub1(var18, (byte) -31, this.aBoolean10, this.aBoolean11);
					}
					if (this.aBoolean10) {
						var19 = (arg2 + arg3 + arg4 + arg5) / 4;
						for (int var20 = 0; var20 < var18.anInt359; ++var20) {
							int var21 = var18.anIntArray91[var20];
							int var22 = var18.anIntArray93[var20];
							int var23 = arg2 + (arg3 - arg2) * (var21 + 64) / 128;
							int var24 = arg5 + (arg4 - arg5) * (var21 + 64) / 128;
							int var25 = var23 + (var24 - var23) * (var22 + 64) / 128;
							var18.anIntArray92[var20] += var25 - var19;
						}
						var18.method228(anInt39);
					}
					return var18;
				}
			}
		}
	}
}
