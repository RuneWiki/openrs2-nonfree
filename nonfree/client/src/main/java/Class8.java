import sign.signlink;

public class Class8 {

	private static byte aByte18 = 65;

	private static int anInt351 = 78;

	private static boolean aBoolean79;

	private static boolean aBoolean80;

	public static boolean aBoolean81;

	static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_7 = null;

	static Class1_Sub3_Sub3 aClass1_Sub3_Sub3_8 = null;

	static long aLong11;

	static int anInt352;

	static long aLong12;

	static int anInt353;

	static int anInt354;

	public static final synchronized void method208(int arg0) {
		try {
			aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method378(1, -737);
			aClass1_Sub3_Sub3_8 = null;
			aLong11 = System.currentTimeMillis();
			if (arg0 != -31717) {
				aBoolean80 = !aBoolean80;
			}
			aBoolean81 = true;
		} catch (RuntimeException var2) {
			signlink.reporterror("89678, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method209(byte arg0) {
		try {
			aBoolean81 = false;
			aClass1_Sub3_Sub3_7 = null;
			if (arg0 == aByte18) {
				aClass1_Sub3_Sub3_8 = null;
			}
		} catch (RuntimeException var2) {
			signlink.reporterror("9859, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized Class1_Sub3_Sub3 method210(int arg0) {
		try {
			Class1_Sub3_Sub3 var1 = null;
			if (aClass1_Sub3_Sub3_8 != null && aBoolean81) {
				var1 = aClass1_Sub3_Sub3_8;
			}
			aClass1_Sub3_Sub3_8 = null;
			if (arg0 >= 0) {
				aBoolean79 = !aBoolean79;
			}
			return var1;
		} catch (RuntimeException var2) {
			signlink.reporterror("67521, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized Class1_Sub3_Sub3 method211(int arg0) {
		try {
			if (arg0 <= 0) {
				aBoolean80 = !aBoolean80;
			}
			Class1_Sub3_Sub3 var1 = null;
			if (aClass1_Sub3_Sub3_7 != null && aClass1_Sub3_Sub3_7.anInt561 > 0 && aBoolean81) {
				var1 = aClass1_Sub3_Sub3_7;
			}
			method209((byte) 65);
			return var1;
		} catch (RuntimeException var2) {
			signlink.reporterror("12569, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	private static final synchronized void method212(int arg0, int arg1) {
		try {
			if (arg0 <= 0) {
				aBoolean79 = !aBoolean79;
			}
			if (aClass1_Sub3_Sub3_7.anInt561 + arg1 >= 500) {
				Class1_Sub3_Sub3 var2 = aClass1_Sub3_Sub3_7;
				aClass1_Sub3_Sub3_7 = Class1_Sub3_Sub3.method378(1, -737);
				aClass1_Sub3_Sub3_8 = var2;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("3191, " + arg0 + ", " + arg1 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method213(int arg0, int arg1, int arg2, byte arg3) {
		try {
			if (aBoolean81) {
				if (arg0 >= 0 && arg0 < 789 && arg2 >= 0 && arg2 < 532) {
					++anInt352;
					long var4 = System.currentTimeMillis();
					long var6 = (var4 - aLong11) / 10L;
					if (var6 > 250L) {
						var6 = 250L;
					}
					aLong11 = var4;
					method212(anInt351, 5);
					if (arg3 == 4) {
						if (arg1 == 1) {
							aClass1_Sub3_Sub3_7.method381(1);
						} else {
							aClass1_Sub3_Sub3_7.method381(2);
						}
						aClass1_Sub3_Sub3_7.method381((int) var6);
						aClass1_Sub3_Sub3_7.method384(arg0 + (arg2 << 10));
					}
				}
			}
		} catch (RuntimeException var8) {
			signlink.reporterror("20421, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var8.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method214(int arg0, int arg1) {
		try {
			if (aBoolean81) {
				++anInt352;
				long var2 = System.currentTimeMillis();
				long var4 = (var2 - aLong11) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}
				aLong11 = var2;
				if (arg1 == 0) {
					method212(anInt351, 2);
					if (arg0 == 1) {
						aClass1_Sub3_Sub3_7.method381(3);
					} else {
						aClass1_Sub3_Sub3_7.method381(4);
					}
					aClass1_Sub3_Sub3_7.method381((int) var4);
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("77824, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method215(int arg0, boolean arg1, int arg2) {
		try {
			if (aBoolean81) {
				if (arg2 >= 0 && arg2 < 789 && arg0 >= 0 && arg0 < 532) {
					long var3 = System.currentTimeMillis();
					if (!arg1) {
						anInt351 = 445;
					}
					if (var3 - aLong12 >= 50L) {
						aLong12 = var3;
						++anInt352;
						long var5 = (var3 - aLong11) / 10L;
						if (var5 > 250L) {
							var5 = 250L;
						}
						aLong11 = var3;
						if (arg2 - anInt353 < 8 && arg2 - anInt353 >= -8 && arg0 - anInt354 < 8 && arg0 - anInt354 >= -8) {
							method212(anInt351, 3);
							aClass1_Sub3_Sub3_7.method381(5);
							aClass1_Sub3_Sub3_7.method381((int) var5);
							aClass1_Sub3_Sub3_7.method381(arg2 - anInt353 + 8 + (arg0 - anInt354 + 8 << 4));
						} else if (arg2 - anInt353 < 128 && arg2 - anInt353 >= -128 && arg0 - anInt354 < 128 && arg0 - anInt354 >= -128) {
							method212(anInt351, 4);
							aClass1_Sub3_Sub3_7.method381(6);
							aClass1_Sub3_Sub3_7.method381((int) var5);
							aClass1_Sub3_Sub3_7.method381(arg2 - anInt353 + 128);
							aClass1_Sub3_Sub3_7.method381(arg0 - anInt354 + 128);
						} else {
							method212(anInt351, 5);
							aClass1_Sub3_Sub3_7.method381(7);
							aClass1_Sub3_Sub3_7.method381((int) var5);
							aClass1_Sub3_Sub3_7.method384(arg2 + (arg0 << 10));
						}
						anInt353 = arg2;
						anInt354 = arg0;
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("20655, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method216(int arg0, boolean arg1) {
		try {
			if (aBoolean81) {
				++anInt352;
				long var2 = System.currentTimeMillis();
				long var4 = (var2 - aLong11) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}
				aLong11 = var2;
				if (arg0 == 1000) {
					arg0 = 11;
				}
				if (arg0 == 1001) {
					arg0 = 12;
				}
				if (arg0 == 1002) {
					arg0 = 14;
				}
				if (arg0 == 1003) {
					arg0 = 15;
				}
				if (arg0 >= 1008) {
					arg0 -= 992;
				}
				method212(anInt351, 3);
				if (!arg1) {
					for (int var6 = 1; var6 > 0; ++var6) {
					}
				}
				aClass1_Sub3_Sub3_7.method381(8);
				aClass1_Sub3_Sub3_7.method381((int) var4);
				aClass1_Sub3_Sub3_7.method381(arg0);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("93007, " + arg0 + ", " + arg1 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method217(int arg0, int arg1) {
		try {
			if (aBoolean81) {
				++anInt352;
				long var2 = System.currentTimeMillis();
				long var4 = (var2 - aLong11) / 10L;
				if (var4 > 250L) {
					var4 = 250L;
				}
				aLong11 = var2;
				if (arg0 == 1000) {
					arg0 = 11;
				}
				if (arg0 == 1001) {
					arg0 = 12;
				}
				if (arg0 == 1002) {
					arg0 = 14;
				}
				if (arg0 == 1003) {
					arg0 = 15;
				}
				if (arg0 >= 1008) {
					arg0 -= 992;
				}
				method212(anInt351, 3);
				aClass1_Sub3_Sub3_7.method381(9);
				aClass1_Sub3_Sub3_7.method381((int) var4);
				aClass1_Sub3_Sub3_7.method381(arg0);
				if (arg1 == 1) {
					;
				}
			}
		} catch (RuntimeException var6) {
			signlink.reporterror("36408, " + arg0 + ", " + arg1 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method218(int arg0) {
		try {
			if (aBoolean81) {
				++anInt352;
				if (arg0 < 0) {
					long var1 = System.currentTimeMillis();
					long var3 = (var1 - aLong11) / 10L;
					if (var3 > 250L) {
						var3 = 250L;
					}
					aLong11 = var1;
					method212(anInt351, 2);
					aClass1_Sub3_Sub3_7.method381(10);
					aClass1_Sub3_Sub3_7.method381((int) var3);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("23406, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method219(int arg0) {
		try {
			if (aBoolean81) {
				++anInt352;
				long var1 = System.currentTimeMillis();
				long var3 = (var1 - aLong11) / 10L;
				if (var3 > 250L) {
					var3 = 250L;
				}
				aLong11 = var1;
				method212(anInt351, 2);
				if (arg0 != 0) {
					aBoolean80 = !aBoolean80;
				}
				aClass1_Sub3_Sub3_7.method381(11);
				aClass1_Sub3_Sub3_7.method381((int) var3);
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("80777, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method220(int arg0) {
		try {
			if (aBoolean81) {
				++anInt352;
				long var1 = System.currentTimeMillis();
				long var3 = (var1 - aLong11) / 10L;
				if (var3 > 250L) {
					var3 = 250L;
				}
				aLong11 = var1;
				method212(anInt351, 2);
				if (arg0 < 0) {
					aClass1_Sub3_Sub3_7.method381(12);
					aClass1_Sub3_Sub3_7.method381((int) var3);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("47039, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public static final synchronized void method221(boolean arg0) {
		try {
			if (!arg0) {
				if (aBoolean81) {
					++anInt352;
					long var1 = System.currentTimeMillis();
					long var3 = (var1 - aLong11) / 10L;
					if (var3 > 250L) {
						var3 = 250L;
					}
					aLong11 = var1;
					method212(anInt351, 2);
					aClass1_Sub3_Sub3_7.method381(13);
					aClass1_Sub3_Sub3_7.method381((int) var3);
				}
			}
		} catch (RuntimeException var5) {
			signlink.reporterror("76997, " + arg0 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}
}
