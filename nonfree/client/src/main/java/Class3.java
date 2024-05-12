import sign.signlink;

final class Class3 {

	private boolean aBoolean18 = false;

	public static int anInt67;

	private static int[] anIntArray8;

	private static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_2;

	private static Class3[] aClass3Array1;

	private static int anInt68;

	private long aLong5 = -1L;

	public String aString2;

	public byte[] aByteArray2;

	public byte aByte4 = 1;

	private int[] anIntArray9;

	private int[] anIntArray10;

	public int anInt69 = -1;

	public int anInt70 = -1;

	public int anInt71 = -1;

	public int anInt72 = -1;

	public int anInt73 = -1;

	private boolean aBoolean19 = false;

	private int[] anIntArray11;

	private int[] anIntArray12;

	public String[] aStringArray2;

	public int anInt74 = -1;

	public int anInt75 = -1;

	public int anInt76 = -1;

	public boolean aBoolean20 = true;

	public int anInt77 = -1;

	private int anInt78 = 128;

	private int anInt79 = 128;

	public static Class35 aClass35_3 = new Class35((byte) 0, 30);

	public static final void method30(Class39 arg0) {
		aClass1_Sub3_Sub3_2 = new Class1_Sub3_Sub3(363, arg0.method536("npc.dat", (byte[]) null, (byte) 2));
		Class1_Sub3_Sub3 var1 = new Class1_Sub3_Sub3(363, arg0.method536("npc.idx", (byte[]) null, (byte) 2));
		anInt67 = var1.method393();
		anIntArray8 = new int[anInt67];
		int var2 = 2;
		for (int var3 = 0; var3 < anInt67; ++var3) {
			anIntArray8[var3] = var2;
			var2 += var1.method393();
		}
		aClass3Array1 = new Class3[20];
		for (int var4 = 0; var4 < 20; ++var4) {
			aClass3Array1[var4] = new Class3();
		}
	}

	public static final void method31(boolean arg0) {
		try {
			aClass35_3 = null;
			anIntArray8 = null;
			aClass3Array1 = null;
			if (!arg0) {
				for (int var1 = 1; var1 > 0; ++var1) {
				}
			}
			aClass1_Sub3_Sub3_2 = null;
		} catch (RuntimeException var2) {
			signlink.reporterror("32991, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static final Class3 method32(int arg0) {
		for (int var1 = 0; var1 < 20; ++var1) {
			if (aClass3Array1[var1].aLong5 == (long) arg0) {
				return aClass3Array1[var1];
			}
		}
		anInt68 = (anInt68 + 1) % 20;
		Class3 var2 = aClass3Array1[anInt68] = new Class3();
		aClass1_Sub3_Sub3_2.anInt561 = anIntArray8[arg0];
		var2.aLong5 = (long) arg0;
		var2.method33(false, aClass1_Sub3_Sub3_2);
		return var2;
	}

	private final void method33(boolean arg0, Class1_Sub3_Sub3 arg1) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else {
				while (true) {
					while (true) {
						int var3 = arg1.method391();
						if (var3 == 0) {
							return;
						}
						int var4;
						int var5;
						if (var3 == 1) {
							var4 = arg1.method391();
							this.anIntArray9 = new int[var4];
							for (var5 = 0; var5 < var4; ++var5) {
								this.anIntArray9[var5] = arg1.method393();
							}
						} else if (var3 == 2) {
							this.aString2 = arg1.method398();
						} else if (var3 == 3) {
							this.aByteArray2 = arg1.method399((byte) 31);
						} else if (var3 == 12) {
							this.aByte4 = arg1.method392();
						} else if (var3 == 13) {
							this.anInt69 = arg1.method393();
						} else if (var3 == 14) {
							this.anInt70 = arg1.method393();
						} else if (var3 == 16) {
							this.aBoolean19 = true;
						} else if (var3 == 17) {
							this.anInt70 = arg1.method393();
							this.anInt71 = arg1.method393();
							this.anInt72 = arg1.method393();
							this.anInt73 = arg1.method393();
						} else if (var3 >= 30 && var3 < 40) {
							if (this.aStringArray2 == null) {
								this.aStringArray2 = new String[5];
							}
							this.aStringArray2[var3 - 30] = arg1.method398();
							if (this.aStringArray2[var3 - 30].equalsIgnoreCase("hidden")) {
								this.aStringArray2[var3 - 30] = null;
							}
						} else if (var3 == 40) {
							var4 = arg1.method391();
							this.anIntArray11 = new int[var4];
							this.anIntArray12 = new int[var4];
							for (var5 = 0; var5 < var4; ++var5) {
								this.anIntArray11[var5] = arg1.method393();
								this.anIntArray12[var5] = arg1.method393();
							}
						} else if (var3 == 60) {
							var4 = arg1.method391();
							this.anIntArray10 = new int[var4];
							for (var5 = 0; var5 < var4; ++var5) {
								this.anIntArray10[var5] = arg1.method393();
							}
						} else if (var3 == 90) {
							this.anInt74 = arg1.method393();
						} else if (var3 == 91) {
							this.anInt75 = arg1.method393();
						} else if (var3 == 92) {
							this.anInt76 = arg1.method393();
						} else if (var3 == 93) {
							this.aBoolean20 = false;
						} else if (var3 == 95) {
							this.anInt77 = arg1.method393();
						} else if (var3 == 97) {
							this.anInt78 = arg1.method393();
						} else if (var3 == 98) {
							this.anInt79 = arg1.method393();
						}
					}
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("30732, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public final Class1_Sub3_Sub1 method34(int arg0, int arg1, int[] arg2) {
		Class1_Sub3_Sub1 var4 = null;
		Class1_Sub3_Sub1 var5 = (Class1_Sub3_Sub1) aClass35_3.method527(this.aLong5);
		if (var5 == null) {
			Class1_Sub3_Sub1[] var6 = new Class1_Sub3_Sub1[this.anIntArray9.length];
			for (int var7 = 0; var7 < this.anIntArray9.length; ++var7) {
				var6[var7] = new Class1_Sub3_Sub1(false, this.anIntArray9[var7]);
			}
			if (var6.length == 1) {
				var5 = var6[0];
			} else {
				var5 = new Class1_Sub3_Sub1(0, var6, var6.length);
			}
			if (this.anIntArray11 != null) {
				for (int var8 = 0; var8 < this.anIntArray11.length; ++var8) {
					var5.method237(this.anIntArray11[var8], this.anIntArray12[var8]);
				}
			}
			var5.method230(4);
			var5.method240(64, 850, -30, -50, -30, true);
			aClass35_3.method528(6, this.aLong5, var5);
		}
		var4 = new Class1_Sub3_Sub1(0, var5, !this.aBoolean19);
		if (arg0 != -1 && arg1 != -1) {
			var4.method232(arg1, 3, arg0, arg2);
		} else if (arg0 != -1) {
			var4.method231(-16599, arg0);
		}
		if (this.anInt78 != 128 || this.anInt79 != 128) {
			var4.method239(this.anInt78, 2, this.anInt79, this.anInt78);
		}
		var4.method227(2992);
		var4.anIntArrayArray7 = null;
		var4.anIntArrayArray6 = null;
		if (this.aByte4 == 1) {
			var4.aBoolean84 = true;
		}
		return var4;
	}

	public final Class1_Sub3_Sub1 method35(boolean arg0) {
		try {
			if (arg0) {
				throw new NullPointerException();
			} else if (this.anIntArray10 == null) {
				return null;
			} else {
				Class1_Sub3_Sub1[] var2 = new Class1_Sub3_Sub1[this.anIntArray10.length];
				for (int var3 = 0; var3 < this.anIntArray10.length; ++var3) {
					var2[var3] = new Class1_Sub3_Sub1(false, this.anIntArray10[var3]);
				}
				Class1_Sub3_Sub1 var4;
				if (var2.length == 1) {
					var4 = var2[0];
				} else {
					var4 = new Class1_Sub3_Sub1(0, var2, var2.length);
				}
				if (this.anIntArray11 != null) {
					for (int var5 = 0; var5 < this.anIntArray11.length; ++var5) {
						var4.method237(this.anIntArray11[var5], this.anIntArray12[var5]);
					}
				}
				return var4;
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("86097, " + arg0 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}
}
