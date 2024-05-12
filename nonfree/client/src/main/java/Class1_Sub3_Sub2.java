import sign.signlink;

public class Class1_Sub3_Sub2 extends Class1_Sub3 {

	private static int anInt526;

	private static int anInt527;

	private static boolean aBoolean123 = true;

	public static int[] anIntArray178;

	public static int anInt528;

	public static int anInt529;

	public static int anInt530;

	public static int anInt531;

	public static int anInt532;

	public static int anInt533;

	public static int anInt534;

	public static int anInt535;

	public static int anInt536;

	public static void method354(int arg0, int[] arg1, int arg2, int arg3) {
		try {
			anIntArray178 = arg1;
			anInt528 = arg0;
			while (arg2 >= 0) {
				anInt526 = -151;
			}
			anInt529 = arg3;
			method356(arg3, 0, arg0, 789, 0);
		} catch (RuntimeException var5) {
			signlink.reporterror("39631, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + var5.toString());
			throw new RuntimeException();
		}
	}

	public static void method355(int arg0) {
		try {
			anInt532 = 0;
			anInt530 = 0;
			anInt533 = anInt528;
			if (arg0 != 0) {
				for (int var1 = 1; var1 > 0; ++var1) {
				}
			}
			anInt531 = anInt529;
			anInt534 = anInt533 - 1;
			anInt535 = anInt533 / 2;
		} catch (RuntimeException var2) {
			signlink.reporterror("74265, " + arg0 + ", " + var2.toString());
			throw new RuntimeException();
		}
	}

	public static void method356(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg4 < 0) {
				arg4 = 0;
			}
			if (arg1 < 0) {
				arg1 = 0;
			}
			if (arg2 > anInt528) {
				arg2 = anInt528;
			}
			if (arg0 > anInt529) {
				arg0 = anInt529;
			}
			anInt532 = arg4;
			anInt530 = arg1;
			anInt533 = arg2;
			anInt531 = arg0;
			anInt534 = anInt533 - 1;
			anInt535 = anInt533 / 2;
			if (arg3 <= 0) {
				for (int var5 = 1; var5 > 0; ++var5) {
				}
			}
			anInt536 = anInt531 / 2;
		} catch (RuntimeException var6) {
			signlink.reporterror("56986, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var6.toString());
			throw new RuntimeException();
		}
	}

	public static void method357(int arg0) {
		try {
			int var4 = 87 / arg0;
			int var1 = anInt528 * anInt529;
			for (int var2 = 0; var2 < var1; ++var2) {
				anIntArray178[var2] = 0;
			}
		} catch (RuntimeException var3) {
			signlink.reporterror("45949, " + arg0 + ", " + var3.toString());
			throw new RuntimeException();
		}
	}

	public static void method358(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
		try {
			if (arg3 != 93) {
				anInt526 = 289;
			}
			if (arg1 < anInt532) {
				arg4 -= anInt532 - arg1;
				arg1 = anInt532;
			}
			if (arg0 < anInt530) {
				arg5 -= anInt530 - arg0;
				arg0 = anInt530;
			}
			if (arg1 + arg4 > anInt533) {
				arg4 = anInt533 - arg1;
			}
			if (arg0 + arg5 > anInt531) {
				arg5 = anInt531 - arg0;
			}
			int var6 = anInt528 - arg4;
			int var7 = arg1 + arg0 * anInt528;
			for (int var8 = -arg5; var8 < 0; ++var8) {
				for (int var9 = -arg4; var9 < 0; ++var9) {
					anIntArray178[var7++] = arg2;
				}
				var7 += var6;
			}
		} catch (RuntimeException var10) {
			signlink.reporterror("10678, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var10.toString());
			throw new RuntimeException();
		}
	}

	public static void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		try {
			if (arg0 >= 3 && arg0 <= 3) {
				method360(arg2, 0, arg4, arg5, arg1);
				method360(arg2, 0, arg4 + arg3 - 1, arg5, arg1);
				method361(arg2, anInt527, arg4, arg3, arg1);
				method361(arg2, anInt527, arg4, arg3, arg1 + arg5 - 1);
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("74170, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public static void method360(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg2 >= anInt530 && arg2 < anInt531) {
				if (arg4 < anInt532) {
					arg3 -= anInt532 - arg4;
					arg4 = anInt532;
				}
				if (arg4 + arg3 > anInt533) {
					arg3 = anInt533 - arg4;
				}
				int var5 = arg4 + arg2 * anInt528;
				if (arg1 == 0) {
					for (int var6 = 0; var6 < arg3; ++var6) {
						anIntArray178[var5 + var6] = arg0;
					}
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("17925, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}

	public static void method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
		try {
			if (arg4 >= anInt532 && arg4 < anInt533) {
				if (arg2 < anInt530) {
					arg3 -= anInt530 - arg2;
					arg2 = anInt530;
				}
				if (arg2 + arg3 > anInt531) {
					arg3 = anInt531 - arg2;
				}
				int var5 = arg4 + arg2 * anInt528;
				if (arg1 != 0) {
					anInt527 = 71;
				}
				for (int var6 = 0; var6 < arg3; ++var6) {
					anIntArray178[var5 + var6 * anInt528] = arg0;
				}
			}
		} catch (RuntimeException var7) {
			signlink.reporterror("40773, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + var7.toString());
			throw new RuntimeException();
		}
	}
}
