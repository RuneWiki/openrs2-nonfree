import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!oe", name = "hb", descriptor = "I")
	public static int anInt3289;

	@OriginalMember(owner = "client!oe", name = "xb", descriptor = "Lclient!wd;")
	public static Class97 aClass97_11;

	@OriginalMember(owner = "client!oe", name = "Db", descriptor = "Lclient!sd;")
	public static Class60 aClass60_27;

	@OriginalMember(owner = "client!oe", name = "mb", descriptor = "I")
	public static int anInt3294 = 0;

	@OriginalMember(owner = "client!oe", name = "sb", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[104][104];

	@OriginalMember(owner = "client!oe", name = "vb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1838 = Static118.method2249("::");

	@OriginalMember(owner = "client!oe", name = "wb", descriptor = "[I")
	public static final int[] anIntArray374 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!oe", name = "Ab", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1839 = Static118.method2249("(U0a )2 in: ");

	@OriginalMember(owner = "client!oe", name = "Eb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1840 = Static118.method2249("bevor Sie den Vorgang wiederholen)3");

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!ba;)V")
	public static void method2531(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static206.aBoolean184) {
			Static131.method2502(arg0);
			return;
		}
		if (Static96.anInt2403 == 1 && Static2.anInt67 >= 715 && Static182.anInt4065 >= 453) {
			Static13.aBoolean37 = !Static13.aBoolean37;
			if (Static13.aBoolean37) {
				Static1.method3302();
			} else {
				Static165.method2842(Static16.aClass60_Sub1_15, 255, Static135.anInt3348);
			}
		}
		if (Static174.anInt3884 == 5) {
			return;
		}
		Static40.anInt1077++;
		if (Static174.anInt3884 != 10) {
			return;
		}
		if (Static138.anInt3396 != 2) {
			if (Static96.anInt2403 == 1 && Static2.anInt67 >= 5 && Static2.anInt67 <= 105 && Static182.anInt4065 >= 463 && Static182.anInt4065 <= 498) {
				Static55.method976();
				return;
			}
			if (Static180.aClass79_6 != null) {
				Static55.method976();
			}
		}
		@Pc(110) int local110 = Static96.anInt2403;
		@Pc(112) int local112 = Static2.anInt67;
		@Pc(114) int local114 = Static182.anInt4065;
		if (Static140.anInt3419 == 0) {
			@Pc(122) boolean local122 = false;
			if (local110 == 1 && local112 >= 227 && local112 <= 377 && local114 >= 271 && local114 <= 311) {
				Static140.anInt3419 = 3;
				Static88.anInt2109 = 0;
			}
			if (Static99.anInt2495 != 0) {
				while (Static70.method1201()) {
					if (Static35.anInt1011 == 84) {
						local122 = true;
						break;
					}
				}
			}
			if (local122 || local110 == 1 && local112 >= 387 && local112 <= 537 && local114 >= 271 && local114 <= 311) {
				Static139.aClass65_1954 = Static90.aClass65_2587;
				Static139.aClass65_1957 = Static208.aClass65_2340;
				Static140.anInt3419 = 2;
				Static88.anInt2109 = 0;
				Static139.aClass65_1952 = Static208.aClass65_2372;
			}
		} else if (Static140.anInt3419 == 2) {
			@Pc(236) short local236 = 231;
			@Pc(241) int local241 = local236 + 30;
			if (local110 == 1 && local114 >= 246 && local114 < 261) {
				Static88.anInt2109 = 0;
			}
			local241 += 15;
			if (local110 == 1 && local114 >= 261 && local114 < 276) {
				Static88.anInt2109 = 1;
			}
			local241 += 15;
			if (local110 == 1 && local112 >= 227 && local112 <= 377 && local114 >= 301 && local114 <= 341) {
				Static139.aClass65_1958 = Static139.aClass65_1958.method2456().method2488();
				if (Static139.aClass65_1958.method2482() == 0) {
					Static177.method2998(Static78.aClass65_1172, Static208.aClass65_2337, Static208.aClass65_2355);
					return;
				}
				if (Static139.aClass65_1951.method2482() == 0) {
					Static177.method2998(Static19.aClass65_484, Static208.aClass65_2348, Static208.aClass65_2335);
					return;
				}
				Static177.method2998(Static122.aClass65_1997, Static208.aClass65_2362, Static208.aClass65_2373);
				Static118.method2247(20);
				return;
			}
			if (local110 == 1 && local112 >= 387 && local112 <= 537 && local114 >= 301 && local114 <= 341) {
				Static139.aClass65_1951 = Static139.aClass65_1953;
				Static140.anInt3419 = 0;
				Static139.aClass65_1958 = Static139.aClass65_1953;
			}
			while (true) {
				@Pc(402) boolean local402;
				label202: do {
					while (Static70.method1201()) {
						local402 = false;
						for (@Pc(404) int local404 = 0; Static182.aClass65_2431.method2482() > local404; local404++) {
							if (Static38.anInt1050 == Static182.aClass65_2431.method2473(local404)) {
								local402 = true;
								break;
							}
						}
						if (Static88.anInt2109 != 0) {
							continue label202;
						}
						if (Static35.anInt1011 == 85 && Static139.aClass65_1958.method2482() > 0) {
							Static139.aClass65_1958 = Static139.aClass65_1958.method2481(Static139.aClass65_1958.method2482() - 1, 0);
						}
						if (Static35.anInt1011 == 84 || Static35.anInt1011 == 80) {
							Static88.anInt2109 = 1;
						}
						if (local402 && Static139.aClass65_1958.method2482() < 12) {
							Static139.aClass65_1958 = Static139.aClass65_1958.method2462(Static38.anInt1050);
						}
					}
					return;
				} while (Static88.anInt2109 != 1);
				if (Static35.anInt1011 == 85 && Static139.aClass65_1951.method2482() > 0) {
					Static139.aClass65_1951 = Static139.aClass65_1951.method2481(Static139.aClass65_1951.method2482() - 1, 0);
				}
				if (Static35.anInt1011 == 84 || Static35.anInt1011 == 80) {
					Static88.anInt2109 = 0;
				}
				if (Static99.anInt2495 != 0 && Static35.anInt1011 == 84) {
					Static139.aClass65_1958 = Static139.aClass65_1958.method2456().method2488();
					if (Static139.aClass65_1958.method2482() == 0) {
						Static177.method2998(Static78.aClass65_1172, Static208.aClass65_2337, Static208.aClass65_2355);
						return;
					}
					if (Static139.aClass65_1951.method2482() == 0) {
						Static177.method2998(Static19.aClass65_484, Static208.aClass65_2348, Static208.aClass65_2335);
						return;
					}
					Static177.method2998(Static122.aClass65_1997, Static208.aClass65_2362, Static208.aClass65_2373);
					Static118.method2247(20);
					return;
				}
				if (local402 && Static139.aClass65_1951.method2482() < 20) {
					Static139.aClass65_1951 = Static139.aClass65_1951.method2462(Static38.anInt1050);
				}
			}
		} else if (Static140.anInt3419 == 3 && local110 == 1 && local112 >= 307 && local112 <= 457 && local114 >= 301 && local114 <= 341) {
			Static140.anInt3419 = 0;
		}
	}
}
