import sign.signlink;

public class Class15 {

	private static int anInt467;

	private static boolean aBoolean105;

	public static Class15[] aClass15Array1;

	public int[] anIntArray149;

	public int[] anIntArray150;

	public int anInt468;

	public int anInt469;

	public int anInt470;

	public int anInt471;

	public int anInt472;

	public int anInt473;

	public int anInt474;

	public int anInt475;

	public int anInt476;

	public int anInt477;

	public int anInt478;

	public int[][] anIntArrayArray15;

	public int[] anIntArray151;

	public int[] anIntArray152;

	public int anInt479;

	public int anInt480;

	public int anInt481;

	public boolean aBoolean106;

	public int[] anIntArray153;

	public int[] anIntArray154;

	public int[] anIntArray155;

	public int anInt482;

	public boolean aBoolean107;

	public boolean aBoolean108;

	public boolean aBoolean109;

	public boolean aBoolean110;

	public int anInt483;

	public int anInt484;

	public Class1_Sub3_Sub2_Sub2[] aClass1_Sub3_Sub2_Sub2Array8;

	public int[] anIntArray156;

	public int[] anIntArray157;

	public String[] aStringArray10;

	public boolean aBoolean111;

	public boolean aBoolean112;

	public boolean aBoolean113;

	public Class1_Sub3_Sub2_Sub4 aClass1_Sub3_Sub2_Sub4_5;

	public String aString20;

	public String aString21;

	public int anInt485;

	public int anInt486;

	public int anInt487;

	public Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_12;

	public Class1_Sub3_Sub2_Sub2 aClass1_Sub3_Sub2_Sub2_13;

	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_2;

	public Class1_Sub3_Sub1 aClass1_Sub3_Sub1_3;

	public int anInt488;

	public int anInt489;

	public int anInt490;

	public int anInt491;

	public int anInt492;

	public String aString22;

	public String aString23;

	public int anInt493;

	public String aString24;

	private static Class35 aClass35_6;

	private static Class35 aClass35_7;

	public static void method331(Class39 arg0, Class1_Sub3_Sub2_Sub4[] arg1, int arg2, Class39 arg3) {
		try {
			int var16 = 17 / arg2;
			aClass35_6 = new Class35((byte) 0, 50000);
			aClass35_7 = new Class35((byte) 0, 50000);
			Class1_Sub3_Sub3 var4 = new Class1_Sub3_Sub3(363, arg3.method536("data", (byte[]) null, (byte) 2));
			int var5 = -1;
			int var6 = var4.method393();
			aClass15Array1 = new Class15[var6];
			while (true) {
				Class15 var8;
				do {
					if (var4.anInt561 >= var4.aByteArray7.length) {
						aClass35_6 = null;
						aClass35_7 = null;
						return;
					}
					int var7 = var4.method393();
					if (var7 == 65535) {
						var5 = var4.method393();
						var7 = var4.method393();
					}
					var8 = aClass15Array1[var7] = new Class15();
					var8.anInt470 = var7;
					var8.anInt471 = var5;
					var8.anInt472 = var4.method391();
					var8.anInt473 = var4.method391();
					var8.anInt474 = var4.method393();
					var8.anInt475 = var4.method393();
					var8.anInt476 = var4.method393();
					var8.anInt479 = var4.method391();
					if (var8.anInt479 != 0) {
						var8.anInt479 = (var8.anInt479 - 1 << 8) + var4.method391();
					} else {
						var8.anInt479 = -1;
					}
					int var9 = var4.method391();
					int var10;
					if (var9 > 0) {
						var8.anIntArray151 = new int[var9];
						var8.anIntArray152 = new int[var9];
						for (var10 = 0; var10 < var9; ++var10) {
							var8.anIntArray151[var10] = var4.method391();
							var8.anIntArray152[var10] = var4.method393();
						}
					}
					var10 = var4.method391();
					int var11;
					int var12;
					if (var10 > 0) {
						var8.anIntArrayArray15 = new int[var10][];
						for (var11 = 0; var11 < var10; ++var11) {
							var12 = var4.method393();
							var8.anIntArrayArray15[var11] = new int[var12];
							for (int var13 = 0; var13 < var12; ++var13) {
								var8.anIntArrayArray15[var11][var13] = var4.method393();
							}
						}
					}
					if (var8.anInt472 == 0) {
						var8.anInt480 = var4.method393();
						var8.aBoolean106 = var4.method391() == 1;
						var11 = var4.method391();
						var8.anIntArray153 = new int[var11];
						var8.anIntArray154 = new int[var11];
						var8.anIntArray155 = new int[var11];
						for (var12 = 0; var12 < var11; ++var12) {
							var8.anIntArray153[var12] = var4.method393();
							var8.anIntArray154[var12] = var4.method394();
							var8.anIntArray155[var12] = var4.method394();
						}
					}
					if (var8.anInt472 == 1) {
						var8.anInt482 = var4.method393();
						var8.aBoolean107 = var4.method391() == 1;
					}
					if (var8.anInt472 == 2) {
						var8.anIntArray149 = new int[var8.anInt475 * var8.anInt476];
						var8.anIntArray150 = new int[var8.anInt475 * var8.anInt476];
						var8.aBoolean108 = var4.method391() == 1;
						var8.aBoolean109 = var4.method391() == 1;
						var8.aBoolean110 = var4.method391() == 1;
						var8.anInt483 = var4.method391();
						var8.anInt484 = var4.method391();
						var8.anIntArray156 = new int[20];
						var8.anIntArray157 = new int[20];
						var8.aClass1_Sub3_Sub2_Sub2Array8 = new Class1_Sub3_Sub2_Sub2[20];
						for (var11 = 0; var11 < 20; ++var11) {
							var12 = var4.method391();
							if (var12 == 1) {
								var8.anIntArray156[var11] = var4.method394();
								var8.anIntArray157[var11] = var4.method394();
								String var18 = var4.method398();
								if (arg0 != null && var18.length() > 0) {
									int var14 = var18.lastIndexOf(",");
									var8.aClass1_Sub3_Sub2_Sub2Array8[var11] = method333(arg0, Integer.parseInt(var18.substring(var14 + 1)), var18.substring(0, var14), -36068);
								}
							}
						}
						var8.aStringArray10 = new String[5];
						for (var12 = 0; var12 < 5; ++var12) {
							var8.aStringArray10[var12] = var4.method398();
							if (var8.aStringArray10[var12].length() == 0) {
								var8.aStringArray10[var12] = null;
							}
						}
					}
					if (var8.anInt472 == 3) {
						var8.aBoolean111 = var4.method391() == 1;
					}
					if (var8.anInt472 == 4 || var8.anInt472 == 1) {
						var8.aBoolean112 = var4.method391() == 1;
						var11 = var4.method391();
						if (arg1 != null) {
							var8.aClass1_Sub3_Sub2_Sub4_5 = arg1[var11];
						}
						var8.aBoolean113 = var4.method391() == 1;
					}
					if (var8.anInt472 == 4) {
						var8.aString20 = var4.method398();
						var8.aString21 = var4.method398();
					}
					if (var8.anInt472 == 1 || var8.anInt472 == 3 || var8.anInt472 == 4) {
						var8.anInt485 = var4.method396();
					}
					if (var8.anInt472 == 3 || var8.anInt472 == 4) {
						var8.anInt486 = var4.method396();
						var8.anInt487 = var4.method396();
					}
					if (var8.anInt472 == 5) {
						String var17 = var4.method398();
						if (arg0 != null && var17.length() > 0) {
							var12 = var17.lastIndexOf(",");
							var8.aClass1_Sub3_Sub2_Sub2_12 = method333(arg0, Integer.parseInt(var17.substring(var12 + 1)), var17.substring(0, var12), -36068);
						}
						var17 = var4.method398();
						if (arg0 != null && var17.length() > 0) {
							var12 = var17.lastIndexOf(",");
							var8.aClass1_Sub3_Sub2_Sub2_13 = method333(arg0, Integer.parseInt(var17.substring(var12 + 1)), var17.substring(0, var12), -36068);
						}
					}
					if (var8.anInt472 == 6) {
						var7 = var4.method391();
						if (var7 != 0) {
							var8.aClass1_Sub3_Sub1_2 = method334(4, (var7 - 1 << 8) + var4.method391());
						}
						var7 = var4.method391();
						if (var7 != 0) {
							var8.aClass1_Sub3_Sub1_3 = method334(4, (var7 - 1 << 8) + var4.method391());
						}
						var7 = var4.method391();
						if (var7 != 0) {
							var8.anInt488 = (var7 - 1 << 8) + var4.method391();
						} else {
							var8.anInt488 = -1;
						}
						var7 = var4.method391();
						if (var7 != 0) {
							var8.anInt489 = (var7 - 1 << 8) + var4.method391();
						} else {
							var8.anInt489 = -1;
						}
						var8.anInt490 = var4.method393();
						var8.anInt491 = var4.method393();
						var8.anInt492 = var4.method393();
					}
					if (var8.anInt472 == 7) {
						var8.anIntArray149 = new int[var8.anInt475 * var8.anInt476];
						var8.anIntArray150 = new int[var8.anInt475 * var8.anInt476];
						var8.aBoolean112 = var4.method391() == 1;
						var11 = var4.method391();
						if (arg1 != null) {
							var8.aClass1_Sub3_Sub2_Sub4_5 = arg1[var11];
						}
						var8.aBoolean113 = var4.method391() == 1;
						var8.anInt485 = var4.method396();
						var8.anInt483 = var4.method394();
						var8.anInt484 = var4.method394();
						var8.aBoolean109 = var4.method391() == 1;
						var8.aStringArray10 = new String[5];
						for (var12 = 0; var12 < 5; ++var12) {
							var8.aStringArray10[var12] = var4.method398();
							if (var8.aStringArray10[var12].length() == 0) {
								var8.aStringArray10[var12] = null;
							}
						}
					}
					if (var8.anInt473 == 2 || var8.anInt472 == 2) {
						var8.aString22 = var4.method398();
						var8.aString23 = var4.method398();
						var8.anInt493 = var4.method393();
					}
				} while (var8.anInt473 != 1 && var8.anInt473 != 4 && var8.anInt473 != 5 && var8.anInt473 != 6);
				var8.aString24 = var4.method398();
				if (var8.aString24.length() == 0) {
					if (var8.anInt473 == 1) {
						var8.aString24 = "Ok";
					}
					if (var8.anInt473 == 4) {
						var8.aString24 = "Select";
					}
					if (var8.anInt473 == 5) {
						var8.aString24 = "Select";
					}
					if (var8.anInt473 == 6) {
						var8.aString24 = "Continue";
					}
				}
			}
		} catch (RuntimeException var15) {
			signlink.reporterror("9595, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var15.toString());
			throw new RuntimeException();
		}
	}

	public Class1_Sub3_Sub1 method332(int arg0, int arg1, boolean arg2) {
		Class1_Sub3_Sub1 var4 = this.aClass1_Sub3_Sub1_2;
		if (arg2) {
			var4 = this.aClass1_Sub3_Sub1_3;
		}
		if (var4 == null) {
			return null;
		} else if (arg0 == -1 && arg1 == -1 && var4.anIntArray103 == null) {
			return var4;
		} else {
			Class1_Sub3_Sub1 var5 = new Class1_Sub3_Sub1(var4, true, true, anInt467, false);
			if (arg0 != -1 || arg1 != -1) {
				var5.method230(4);
			}
			if (arg0 != -1) {
				var5.method231(-16599, arg0);
			}
			if (arg1 != -1) {
				var5.method231(-16599, arg1);
			}
			var5.method240(64, 768, -50, -10, -50, true);
			return var5;
		}
	}

	private static Class1_Sub3_Sub2_Sub2 method333(Class39 arg0, int arg1, String arg2, int arg3) {
		try {
			long var4 = (Class40.method540(0, arg2) << 8) + (long) arg1;
			Class1_Sub3_Sub2_Sub2 var6 = (Class1_Sub3_Sub2_Sub2) aClass35_6.method527(var4);
			if (arg3 != -36068) {
				throw new NullPointerException();
			} else if (var6 != null) {
				return var6;
			} else {
				try {
					var6 = new Class1_Sub3_Sub2_Sub2(arg0, arg2, arg1);
					aClass35_6.method528(6, var4, var6);
					return var6;
				} catch (Exception var7) {
					return null;
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("51863, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	private static Class1_Sub3_Sub1 method334(int arg0, int arg1) {
		try {
			Class1_Sub3_Sub1 var2 = (Class1_Sub3_Sub1) aClass35_7.method527((long) arg1);
			if (arg0 != 4) {
				aBoolean105 = !aBoolean105;
			}
			if (var2 != null) {
				return var2;
			} else {
				var2 = new Class1_Sub3_Sub1(false, arg1);
				aClass35_7.method528(6, (long) arg1, var2);
				return var2;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("7272, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}
}
