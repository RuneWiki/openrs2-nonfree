import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!we;")
	public static Class62 aClass62_7;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_395 = Static109.method1737("OFF");

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_396 = Static109.method1737("cross");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
	public static int anInt1019 = -1;

	@OriginalMember(owner = "client!fb", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_397 = Static109.method1737("Handel akzeptieren");

	@OriginalMember(owner = "client!fb", name = "m", descriptor = "[Lclient!q;")
	public static Class62_Sub1[] aClass62_Sub1Array1 = new Class62_Sub1[256];

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "Lclient!na;")
	private static Class53 aClass53_398 = Static109.method1737(" from your ignore list first");

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "Lclient!na;")
	public static Class53 aClass53_399 = aClass53_398;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!na;")
	public static Class53 aClass53_400 = Static109.method1737("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Lclient!na;")
	private static Class53 aClass53_401 = Static109.method1737("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_402 = Static109.method1737("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!na;")
	public static Class53 aClass53_403 = aClass53_401;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Lclient!vb;")
	public static Class3_Sub1_Sub15 method666(@OriginalArg(1) int arg0) {
		@Pc(3) int local3 = arg0 >> -1268518192;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		if (Static107.aClass3_Sub1_Sub15ArrayArray1[local3] == null || Static107.aClass3_Sub1_Sub15ArrayArray1[local3][local7] == null) {
			@Pc(25) boolean local25 = Static98.method1633(local3);
			if (!local25) {
				return null;
			}
		}
		return Static107.aClass3_Sub1_Sub15ArrayArray1[local3][local7];
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lclient!na;")
	public static Class53 method667() {
		@Pc(7) Class53 local7 = new Class53();
		local7.aByteArray43 = new byte[100];
		local7.anInt1890 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method668(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static108.anInt2485 > 0) {
			local21 = Static85.aByteArrayArray5[--Static108.anInt2485];
			Static85.aByteArrayArray5[Static108.anInt2485] = null;
			return local21;
		} else if (arg0 == 5000 && Static79.anInt1981 > 0) {
			local21 = Static73.aByteArrayArray4[--Static79.anInt1981];
			Static73.aByteArrayArray4[Static79.anInt1981] = null;
			return local21;
		} else if (arg0 == 30000 && Static18.anInt476 > 0) {
			local21 = Static98.aByteArrayArray6[--Static18.anInt476];
			Static98.aByteArrayArray6[Static18.anInt476] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
	public static void method669() {
		Static38.aClass77_4 = new Class77(32);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method670() {
		aClass53_401 = null;
		aClass53_403 = null;
		Class24.anIntArray111 = null;
		aClass53_402 = null;
		aClass62_7 = null;
		aClass53_399 = null;
		aClass53_395 = null;
		aClass53_398 = null;
		aClass53_397 = null;
		aClass53_400 = null;
		aClass62_Sub1Array1 = null;
		aClass53_396 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!vd;B)V")
	public static void method671(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static86.aBoolean79) {
			Static100.method1648(arg0);
			return;
		}
		if (Static73.anInt1832 == 1 && Static56.anInt1504 >= 715 && Static54.anInt2854 >= 453) {
			Static76.aBoolean70 = !Static76.aBoolean70;
			if (Static76.aBoolean70) {
				Static86.method1440();
			} else {
				Static126.method1517(Static10.aClass53_107, Static109.aClass62_Sub1_17, Static122.aClass53_1407);
			}
		}
		if (Static78.anInt1957 == 5) {
			return;
		}
		Static50.anInt2786++;
		if (Static78.anInt1957 != 10) {
			return;
		}
		if (Static59.anInt1542 != 2 && Static87.anInt2095 == 0) {
			if (Static73.anInt1832 == 1 && Static56.anInt1504 >= 5 && Static56.anInt1504 <= 105 && Static54.anInt2854 >= 463 && Static54.anInt2854 <= 498) {
				Static89.method1459();
				return;
			}
			if (Static99.aClass28_1 != null) {
				Static89.method1459();
			}
		}
		@Pc(110) int local110 = Static73.anInt1832;
		@Pc(112) int local112 = Static54.anInt2854;
		@Pc(114) int local114 = Static56.anInt1504;
		if (Static105.anInt2431 == 0) {
			if (local110 == 1 && local114 >= 227 && local114 <= 377 && local112 >= 271 && local112 <= 311) {
				Static105.anInt2431 = 3;
				Static31.anInt1066 = 0;
			}
			if (local110 == 1 && local114 >= 387 && local114 <= 537 && local112 >= 271 && local112 <= 311) {
				Static31.anInt1066 = 0;
				Static105.anInt2431 = 2;
				Static122.aClass53_1413 = Static38.aClass53_496;
				Static122.aClass53_1408 = Static86.aClass53_986;
				Static122.aClass53_1412 = Static86.aClass53_990;
			}
		} else if (Static105.anInt2431 == 2) {
			@Pc(173) short local173 = 231;
			@Pc(174) int local174 = local173 + 30;
			if (local110 == 1 && local112 >= 246 && local112 < 261) {
				Static31.anInt1066 = 0;
			}
			local174 += 15;
			if (local110 == 1 && local112 >= 261 && local112 < 276) {
				Static31.anInt1066 = 1;
			}
			local174 += 15;
			if (local110 == 1 && local114 >= 227 && local114 <= 377 && local112 >= 301 && local112 <= 341) {
				Static122.aClass53_1409 = Static122.aClass53_1409.method1276().method1263();
				Static88.method1454(Static123.aClass53_1430, Static86.aClass53_970, Static86.aClass53_987);
				Static103.method1692(20);
				return;
			}
			if (local110 == 1 && local114 >= 387 && local114 <= 537 && local112 >= 301 && local112 <= 341) {
				Static105.anInt2431 = 0;
				Static122.aClass53_1409 = Static122.aClass53_1407;
				Static122.aClass53_1406 = Static122.aClass53_1407;
			}
			while (true) {
				@Pc(311) boolean local311;
				label182: do {
					while (Static62.method1105()) {
						local311 = false;
						for (@Pc(313) int local313 = 0; local313 < Static37.aClass53_1062.method1294(); local313++) {
							if (Static122.anInt2839 == Static37.aClass53_1062.method1258(local313)) {
								local311 = true;
								break;
							}
						}
						if (Static31.anInt1066 != 0) {
							continue label182;
						}
						if (Static20.anInt702 == 85 && Static122.aClass53_1409.method1294() > 0) {
							Static122.aClass53_1409 = Static122.aClass53_1409.method1267(Static122.aClass53_1409.method1294() - 1, 0);
						}
						if (Static20.anInt702 == 84 || Static20.anInt702 == 80) {
							Static31.anInt1066 = 1;
						}
						if (local311 && Static122.aClass53_1409.method1294() < 12) {
							Static122.aClass53_1409 = Static122.aClass53_1409.method1261(Static122.anInt2839);
						}
					}
					return;
				} while (Static31.anInt1066 != 1);
				if (Static20.anInt702 == 85 && Static122.aClass53_1406.method1294() > 0) {
					Static122.aClass53_1406 = Static122.aClass53_1406.method1267(Static122.aClass53_1406.method1294() - 1, 0);
				}
				if (Static20.anInt702 == 84 || Static20.anInt702 == 80) {
					Static31.anInt1066 = 0;
				}
				if (local311 && Static122.aClass53_1406.method1294() < 20) {
					Static122.aClass53_1406 = Static122.aClass53_1406.method1261(Static122.anInt2839);
				}
			}
		} else if (Static105.anInt2431 == 3 && local110 == 1 && local114 >= 307 && local114 <= 457 && local112 >= 301 && local112 <= 341) {
			Static105.anInt2431 = 0;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)I")
	public static int method672(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 256 - arg0;
		return ((arg1 & 0xFF00FF) * arg0 + (arg2 & 0xFF00FF) * local13 & 0xFF00FF00) + (arg0 * (arg1 & 0xFF00) + (arg2 & 0xFF00) * local13 & 0xFF0000) >> 8;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method673() {
		for (@Pc(10) Class3_Sub19 local10 = (Class3_Sub19) Static94.aClass11_10.method189(); local10 != null; local10 = (Class3_Sub19) Static94.aClass11_10.method187()) {
			if (local10.aClass3_Sub10_Sub3_2 != null) {
				Static36.aClass3_Sub10_Sub1_1.method861(local10.aClass3_Sub10_Sub3_2);
				local10.aClass3_Sub10_Sub3_2 = null;
			}
			if (local10.aClass3_Sub10_Sub3_3 != null) {
				Static36.aClass3_Sub10_Sub1_1.method861(local10.aClass3_Sub10_Sub3_3);
				local10.aClass3_Sub10_Sub3_3 = null;
			}
		}
		Static94.aClass11_10.method201();
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!vc;Lclient!we;Lclient!we;ILclient!we;)Z")
	public static boolean method674(@OriginalArg(0) Class3_Sub10_Sub4 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(4) Class62 arg3) {
		Static77.aClass62_14 = arg1;
		Static120.aClass3_Sub10_Sub4_2 = arg0;
		Static72.aClass62_12 = arg2;
		Static51.aClass62_8 = arg3;
		return true;
	}
}
