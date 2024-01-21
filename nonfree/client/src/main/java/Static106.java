import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!va", name = "H", descriptor = "I")
	public static int anInt2713;

	@OriginalMember(owner = "client!va", name = "D", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1549 = Static15.method178("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!va", name = "E", descriptor = "[I")
	public static int[] anIntArray375 = new int[5];

	@OriginalMember(owner = "client!va", name = "G", descriptor = "I")
	public static int anInt2712 = 0;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1550 = Static15.method178("@yel@*V");

	@OriginalMember(owner = "client!va", name = "M", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1551 = Static15.method178("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!va", name = "W", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1556 = Static15.method178("Please use a different world)3");

	@OriginalMember(owner = "client!va", name = "O", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1552 = aClass23_1556;

	@OriginalMember(owner = "client!va", name = "T", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1555 = Static15.method178("Enter message to send to ");

	@OriginalMember(owner = "client!va", name = "P", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1553 = aClass23_1555;

	@OriginalMember(owner = "client!va", name = "R", descriptor = "Ljava/math/BigInteger;")
	public static BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!va", name = "S", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1554 = aClass23_1551;

	@OriginalMember(owner = "client!va", name = "Z", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1557 = Static15.method178("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!va", name = "ab", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1558 = Static15.method178("Entfernen");

	@OriginalMember(owner = "client!va", name = "eb", descriptor = "I")
	public static volatile int anInt2721 = 0;

	@OriginalMember(owner = "client!va", name = "gb", descriptor = "I")
	public static int anInt2723 = 3;

	@OriginalMember(owner = "client!va", name = "ib", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1560 = Static15.method178("flash2:");

	@OriginalMember(owner = "client!va", name = "hb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1559 = aClass23_1560;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V")
	public static void method1794() {
		@Pc(3) int local3 = Static2.aClass1_Sub1_Sub6_Sub2_13.method850(Static100.aClass23_1463);
		@Pc(12) int local12;
		for (@Pc(5) int local5 = 0; local5 < Static40.anInt1400; local5++) {
			local12 = Static2.aClass1_Sub1_Sub6_Sub2_13.method845(Static109.aClass23Array18[local5]);
			if (local12 > local3) {
				local3 = local12;
			}
		}
		local3 += 8;
		local12 = Static40.anInt1400 * 15 + 21;
		@Pc(59) int local59;
		@Pc(71) int local71;
		if (Static111.anInt2890 > 4 && Static74.anInt1803 > 4 && Static111.anInt2890 < 516 && Static74.anInt1803 < 338) {
			Static13.anInt238 = local3;
			local59 = Static111.anInt2890 - local3 / 2 - 4;
			Static55.anInt1715 = Static40.anInt1400 * 15 + 22;
			Static96.anInt1798 = 0;
			local71 = Static74.anInt1803 - 4;
			Static74.aBoolean90 = true;
			if (local12 + local71 > 334) {
				local71 = 334 - local12;
			}
			if (local71 < 0) {
				local71 = 0;
			}
			if (local59 + local3 > 512) {
				local59 = 512 - local3;
			}
			Static55.anInt1713 = local71;
			if (local59 < 0) {
				local59 = 0;
			}
			Static84.anInt2351 = local59;
		}
		if (Static111.anInt2890 > 553 && Static74.anInt1803 > 205 && Static111.anInt2890 < 743 && Static74.anInt1803 < 466) {
			Static55.anInt1715 = Static40.anInt1400 * 15 + 22;
			Static96.anInt1798 = 1;
			local59 = Static111.anInt2890 - local3 / 2 - 553;
			Static74.aBoolean90 = true;
			Static13.anInt238 = local3;
			if (local59 < 0) {
				local59 = 0;
			} else if (local59 + local3 > 190) {
				local59 = 190 - local3;
			}
			local71 = Static74.anInt1803 - 205;
			Static84.anInt2351 = local59;
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 + local12 > 261) {
				local71 = 261 - local12;
			}
			Static55.anInt1713 = local71;
		}
		if (Static111.anInt2890 <= 17 || Static74.anInt1803 <= 357 || Static111.anInt2890 >= 496 || Static74.anInt1803 >= 453) {
			return;
		}
		Static74.aBoolean90 = true;
		Static55.anInt1715 = Static40.anInt1400 * 15 + 22;
		Static13.anInt238 = local3;
		Static96.anInt1798 = 2;
		local59 = Static111.anInt2890 - local3 / 2 - 17;
		if (local59 < 0) {
			local59 = 0;
		} else if (local3 + local59 > 479) {
			local59 = 479 - local3;
		}
		Static84.anInt2351 = local59;
		local71 = Static74.anInt1803 - 357;
		if (local71 < 0) {
			local71 = 0;
		} else if (local71 + local12 > 96) {
			local71 = 96 - local12;
		}
		Static55.anInt1713 = local71;
	}

	@OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V")
	public static void method1795() {
		Static40.aClass5_34.method99();
		Static113.aClass5_64.method99();
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!rb;IZ)Z")
	public static boolean method1796(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(2) int arg2) {
		@Pc(5) byte[] local5 = arg1.method1867(arg2, arg0);
		if (local5 == null) {
			return false;
		} else {
			Static7.method92(local5);
			return true;
		}
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)Z")
	public static boolean method1797() {
		if (Static94.aClass68_4 == null) {
			return false;
		}
		@Pc(122) int local122;
		try {
			@Pc(11) int local11 = Static94.aClass68_4.method1941();
			if (local11 == 0) {
				return false;
			}
			if (Static96.anInt1794 == -1) {
				local11--;
				Static94.aClass68_4.method1937(Static83.aClass1_Sub5_Sub1_3.aByteArray6, 1, 0);
				Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
				Static96.anInt1794 = Static83.aClass1_Sub5_Sub1_3.method736();
				Static39.anInt1382 = Static51.anIntArray187[Static96.anInt1794];
			}
			if (Static39.anInt1382 == -1) {
				if (local11 <= 0) {
					return false;
				}
				local11--;
				Static94.aClass68_4.method1937(Static83.aClass1_Sub5_Sub1_3.aByteArray6, 1, 0);
				Static39.anInt1382 = Static83.aClass1_Sub5_Sub1_3.aByteArray6[0] & 0xFF;
			}
			if (Static39.anInt1382 == -2) {
				if (local11 <= 1) {
					return false;
				}
				Static94.aClass68_4.method1937(Static83.aClass1_Sub5_Sub1_3.aByteArray6, 2, 0);
				local11 -= 2;
				Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
				Static39.anInt1382 = Static83.aClass1_Sub5_Sub1_3.method715();
			}
			if (local11 < Static39.anInt1382) {
				return false;
			}
			Static83.aClass1_Sub5_Sub1_3.anInt1266 = 0;
			Static94.aClass68_4.method1937(Static83.aClass1_Sub5_Sub1_3.aByteArray6, Static39.anInt1382, 0);
			Static37.anInt1300 = Static44.anInt1486;
			Static44.anInt1486 = Static79.anInt2135;
			Static26.anInt803 = 0;
			Static79.anInt2135 = Static96.anInt1794;
			@Pc(118) int local118;
			@Pc(126) int local126;
			@Pc(130) Class1_Sub1_Sub7 local130;
			if (Static96.anInt1794 == 16) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method715();
				local122 = Static83.aClass1_Sub5_Sub1_3.method728();
				local126 = Static83.aClass1_Sub5_Sub1_3.method692();
				local130 = Static15.method174(local126);
				Static96.anInt1794 = -1;
				local130.anInt805 = (local118 << 16) + local122;
				return true;
			}
			@Pc(165) Class1_Sub1_Sub7 local165;
			@Pc(173) int local173;
			@Pc(177) int local177;
			@Pc(179) int local179;
			if (Static96.anInt1794 == 105) {
				Static34.aBoolean60 = true;
				local118 = Static83.aClass1_Sub5_Sub1_3.method692();
				local122 = Static83.aClass1_Sub5_Sub1_3.method715();
				if (local118 >= 0) {
					local165 = Static15.method174(local118);
				} else {
					local165 = null;
				}
				while (Static39.anInt1382 > Static83.aClass1_Sub5_Sub1_3.anInt1266) {
					local173 = Static83.aClass1_Sub5_Sub1_3.method721();
					local177 = Static83.aClass1_Sub5_Sub1_3.method715();
					local179 = 0;
					if (local177 != 0) {
						local179 = Static83.aClass1_Sub5_Sub1_3.method716();
						if (local179 == 255) {
							local179 = Static83.aClass1_Sub5_Sub1_3.method692();
						}
					}
					if (local165 != null && local173 >= 0 && local165.anIntArray118.length > local173) {
						local165.anIntArray118[local173] = local177;
						local165.anIntArray117[local173] = local179;
					}
					Static95.method1615(local177 - 1, local122, local173, local179);
				}
				Static96.anInt1794 = -1;
				Static28.anInt2227 = Static7.anInt176;
				return true;
			}
			@Pc(245) Class23 local245;
			@Pc(279) long local279;
			@Pc(273) Class23 local273;
			if (Static96.anInt1794 == 145) {
				local245 = Static83.aClass1_Sub5_Sub1_3.method683();
				@Pc(275) boolean local275;
				if (local245.method531(Static71.aClass23_1182)) {
					local273 = local245.method512(0, local245.method528(Static34.aClass23_601));
					local279 = local273.method516();
					local275 = false;
					for (local179 = 0; local179 < Static35.anInt1118; local179++) {
						if (local279 == Static58.aLongArray37[local179]) {
							local275 = true;
							break;
						}
					}
					if (!local275 && Static46.anInt1571 == 0) {
						Static63.method1229(local273, Static18.aClass23_285, 4);
					}
				} else if (local245.method531(Static44.aClass23_791)) {
					local273 = local245.method512(0, local245.method528(Static34.aClass23_601));
					local275 = false;
					local279 = local273.method516();
					for (local179 = 0; local179 < Static35.anInt1118; local179++) {
						if (local279 == Static58.aLongArray37[local179]) {
							local275 = true;
							break;
						}
					}
					if (!local275 && Static46.anInt1571 == 0) {
						Static63.method1229(local273, Static40.aClass23_727, 8);
					}
				} else if (local245.method531(Static69.aClass23_1166)) {
					local273 = local245.method512(0, local245.method528(Static34.aClass23_601));
					local275 = false;
					local279 = local273.method516();
					for (local179 = 0; local179 < Static35.anInt1118; local179++) {
						if (Static58.aLongArray37[local179] == local279) {
							local275 = true;
							break;
						}
					}
					if (!local275 && Static46.anInt1571 == 0) {
						@Pc(318) Class23 local318 = local245.method512(local245.method528(Static34.aClass23_601) + 1, local245.method525() + -9);
						Static63.method1229(local273, local318, 8);
					}
				} else {
					Static63.method1229(Static104.aClass23_1523, local245, 0);
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 102) {
				Static40.anInt1397 = 0;
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 68) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method696();
				local122 = Static83.aClass1_Sub5_Sub1_3.method692();
				local165 = Static15.method174(local122);
				Static96.anInt1794 = -1;
				if (local165.anInt846 != local118 || local118 == -1) {
					local165.anInt825 = 0;
					local165.anInt841 = 0;
					local165.anInt846 = local118;
				}
				return true;
			}
			if (Static96.anInt1794 == 108) {
				for (local118 = 0; local118 < Static68.anInt391; local118++) {
					@Pc(484) Class1_Sub1_Sub13 local484 = Static87.method1882(local118);
					if (local484 != null && local484.anInt2530 == 0) {
						Static70.anIntArray211[local118] = 0;
						Static40.anIntArray164[local118] = 0;
					}
				}
				Static34.aBoolean60 = true;
				if (Static56.anInt1733 != -1) {
					Static102.aBoolean123 = true;
				}
				Static96.anInt1794 = -1;
				Static108.anInt2794 = Static7.anInt176;
				return true;
			}
			if (Static96.anInt1794 == 30) {
				Static32.method513();
				Static96.anInt1794 = -1;
				return false;
			}
			if (Static96.anInt1794 == 52) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method715();
				local122 = Static83.aClass1_Sub5_Sub1_3.method672();
				local126 = Static83.aClass1_Sub5_Sub1_3.method675();
				local173 = Static83.aClass1_Sub5_Sub1_3.method675();
				@Pc(555) Class1_Sub1_Sub7 local555 = Static15.method174(local122);
				local555.anInt801 = local126;
				local555.anInt791 = local118;
				Static96.anInt1794 = -1;
				local555.anInt792 = local173;
				return true;
			}
			if (Static96.anInt1794 == 53) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method678();
				Static2.method1414(local118);
				if (Static16.anInt335 != -1) {
					Static108.method1842(Static16.anInt335);
					Static34.aBoolean60 = true;
					Static64.aBoolean98 = true;
					Static16.anInt335 = -1;
				}
				if (Static77.anInt2096 != -1) {
					Static108.method1842(Static77.anInt2096);
					Static77.anInt2096 = -1;
					Static89.method1524(30);
				}
				if (Static87.anInt2866 != -1) {
					Static108.method1842(Static87.anInt2866);
					Static87.anInt2866 = -1;
				}
				if (Static109.anInt2824 != -1) {
					Static108.method1842(Static109.anInt2824);
					Static109.anInt2824 = -1;
				}
				if (local118 != Static92.anInt2913) {
					Static108.method1842(Static92.anInt2913);
					Static92.anInt2913 = local118;
				}
				Static47.anInt1599 = -1;
				Static42.method903(Static92.anInt2913);
				Static102.aBoolean123 = true;
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 198) {
				Static80.anInt2234 = Static83.aClass1_Sub5_Sub1_3.method716();
				if (Static80.anInt2234 == 1) {
					Static25.anInt759 = Static83.aClass1_Sub5_Sub1_3.method715();
				}
				if (Static80.anInt2234 >= 2 && Static80.anInt2234 <= 6) {
					if (Static80.anInt2234 == 2) {
						Static33.anInt1049 = 64;
						Static36.anInt1277 = 64;
					}
					if (Static80.anInt2234 == 3) {
						Static33.anInt1049 = 0;
						Static36.anInt1277 = 64;
					}
					if (Static80.anInt2234 == 4) {
						Static36.anInt1277 = 64;
						Static33.anInt1049 = 128;
					}
					if (Static80.anInt2234 == 5) {
						Static36.anInt1277 = 0;
						Static33.anInt1049 = 64;
					}
					if (Static80.anInt2234 == 6) {
						Static36.anInt1277 = 128;
						Static33.anInt1049 = 64;
					}
					Static80.anInt2234 = 2;
					Static90.anInt2417 = Static83.aClass1_Sub5_Sub1_3.method715();
					anInt2712 = Static83.aClass1_Sub5_Sub1_3.method715();
					Static109.anInt2831 = Static83.aClass1_Sub5_Sub1_3.method716();
				}
				if (Static80.anInt2234 == 10) {
					Static13.anInt235 = Static83.aClass1_Sub5_Sub1_3.method715();
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 173) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method673();
				Static76.aClass62_37 = Static26.aClass54_2.method1483(local118);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 127) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method715();
				Static2.method1414(local118);
				if (Static92.anInt2913 != -1) {
					Static108.method1842(Static92.anInt2913);
					Static92.anInt2913 = -1;
					Static102.aBoolean123 = true;
				}
				if (Static77.anInt2096 != -1) {
					Static108.method1842(Static77.anInt2096);
					Static77.anInt2096 = -1;
					Static89.method1524(30);
				}
				if (Static87.anInt2866 != -1) {
					Static108.method1842(Static87.anInt2866);
					Static87.anInt2866 = -1;
				}
				if (Static109.anInt2824 != -1) {
					Static108.method1842(Static109.anInt2824);
					Static109.anInt2824 = -1;
				}
				if (local118 != Static16.anInt335) {
					Static108.method1842(Static16.anInt335);
					Static16.anInt335 = local118;
				}
				Static47.anInt1599 = -1;
				Static64.aBoolean98 = true;
				if (Static44.anInt1485 != 0) {
					Static102.aBoolean123 = true;
					Static44.anInt1485 = 0;
				}
				Static34.aBoolean60 = true;
				Static42.method903(Static16.anInt335);
				Static96.anInt1794 = -1;
				return true;
			}
			@Pc(838) Class1_Sub1_Sub7 local838;
			if (Static96.anInt1794 == 54) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method682();
				local838 = Static15.method174(local118);
				for (local126 = 0; local126 < local838.anIntArray118.length; local126++) {
					local838.anIntArray118[local126] = -1;
					local838.anIntArray118[local126] = 0;
				}
				Static96.anInt1794 = -1;
				return true;
			}
			@Pc(935) int local935;
			if (Static96.anInt1794 == 155) {
				Static34.aBoolean60 = true;
				local118 = Static83.aClass1_Sub5_Sub1_3.method692();
				local122 = Static83.aClass1_Sub5_Sub1_3.method715();
				if (local118 >= 0) {
					local165 = Static15.method174(local118);
				} else {
					local165 = null;
				}
				if (local165 != null) {
					for (local173 = 0; local173 < local165.anIntArray118.length; local173++) {
						local165.anIntArray118[local173] = 0;
						local165.anIntArray117[local173] = 0;
					}
				}
				Static36.method740(local122);
				local173 = Static83.aClass1_Sub5_Sub1_3.method715();
				for (local177 = 0; local177 < local173; local177++) {
					local179 = Static83.aClass1_Sub5_Sub1_3.method715();
					local935 = Static83.aClass1_Sub5_Sub1_3.method718();
					if (local935 == 255) {
						local935 = Static83.aClass1_Sub5_Sub1_3.method673();
					}
					if (local165 != null && local165.anIntArray118.length > local177) {
						local165.anIntArray118[local177] = local179;
						local165.anIntArray117[local177] = local935;
					}
					Static95.method1615(local179 - 1, local122, local177, local935);
				}
				Static28.anInt2227 = Static7.anInt176;
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 73) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method705();
				if (Static56.anInt1733 != local118) {
					Static108.method1842(Static56.anInt1733);
					Static56.anInt1733 = local118;
				}
				Static102.aBoolean123 = true;
				Static42.method903(Static56.anInt1733);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 130) {
				Static35.anInt1118 = Static39.anInt1382 / 8;
				for (local118 = 0; local118 < Static35.anInt1118; local118++) {
					Static58.aLongArray37[local118] = Static83.aClass1_Sub5_Sub1_3.method726();
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 247) {
				anInt2723 = Static83.aClass1_Sub5_Sub1_3.method718();
				Static64.aBoolean98 = true;
				Static34.aBoolean60 = true;
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 221) {
				Static35.anInt1095 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static43.anInt1458 = Static83.aClass1_Sub5_Sub1_3.method718();
				while (Static39.anInt1382 > Static83.aClass1_Sub5_Sub1_3.anInt1266) {
					Static96.anInt1794 = Static83.aClass1_Sub5_Sub1_3.method716();
					Static58.method1853();
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 67 || Static96.anInt1794 == 62 || Static96.anInt1794 == 151 || Static96.anInt1794 == 159 || Static96.anInt1794 == 213 || Static96.anInt1794 == 77 || Static96.anInt1794 == 244 || Static96.anInt1794 == 232 || Static96.anInt1794 == 63 || Static96.anInt1794 == 228 || Static96.anInt1794 == 37) {
				Static58.method1853();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 252) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method715();
				local122 = Static83.aClass1_Sub5_Sub1_3.method716();
				local126 = Static83.aClass1_Sub5_Sub1_3.method715();
				Static99.method1663(local118, local122, local126);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 172) {
				Static2.anInt2292 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static77.anInt2097 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static62.anInt1905 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static96.anInt1794 = -1;
				Static74.aBoolean89 = true;
				Static102.aBoolean123 = true;
				return true;
			}
			if (Static96.anInt1794 == 18) {
				Static69.method1282(true);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 223) {
				Static95.anInt2499 = Static83.aClass1_Sub5_Sub1_3.method713();
				Static96.anInt1794 = -1;
				if (anInt2723 == Static95.anInt2499) {
					if (Static95.anInt2499 == 3) {
						anInt2723 = 1;
					} else {
						anInt2723 = 3;
					}
					Static34.aBoolean60 = true;
				}
				return true;
			}
			if (Static96.anInt1794 == 32) {
				Static114.anInt2951 = Static83.aClass1_Sub5_Sub1_3.method715();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 201) {
				Static69.method1282(false);
				Static96.anInt1794 = -1;
				return true;
			}
			@Pc(1254) long local1254;
			if (Static96.anInt1794 == 129) {
				local1254 = Static83.aClass1_Sub5_Sub1_3.method726();
				local126 = Static83.aClass1_Sub5_Sub1_3.method715();
				@Pc(1264) Class23 local1264 = Static54.method1049(local1254).method514();
				for (local177 = 0; local177 < Static8.anInt186; local177++) {
					if (Static88.aLongArray16[local177] == local1254) {
						if (local126 != Static63.anIntArray223[local177]) {
							Static63.anIntArray223[local177] = local126;
							Static34.aBoolean60 = true;
							if (local126 > 0) {
								Static63.method1229(Static104.aClass23_1523, Static17.method233(new Class23[] { local1264, Static90.aClass23_1367 }), 5);
							}
							if (local126 == 0) {
								Static63.method1229(Static104.aClass23_1523, Static17.method233(new Class23[] { local1264, Static60.aClass23_986 }), 5);
							}
						}
						local1264 = null;
						break;
					}
				}
				if (local1264 != null && Static8.anInt186 < 200) {
					Static88.aLongArray16[Static8.anInt186] = local1254;
					Static8.aClass23Array4[Static8.anInt186] = local1264;
					Static63.anIntArray223[Static8.anInt186] = local126;
					Static8.anInt186++;
					Static34.aBoolean60 = true;
				}
				@Pc(1370) boolean local1370 = false;
				while (!local1370) {
					local1370 = true;
					for (local935 = 0; local935 < Static8.anInt186 - 1; local935++) {
						if (Static1.anInt68 != Static63.anIntArray223[local935] && Static63.anIntArray223[local935 + 1] == Static1.anInt68 || Static63.anIntArray223[local935] == 0 && Static63.anIntArray223[local935 + 1] != 0) {
							local1370 = false;
							@Pc(1412) int local1412 = Static63.anIntArray223[local935];
							Static63.anIntArray223[local935] = Static63.anIntArray223[local935 + 1];
							Static63.anIntArray223[local935 + 1] = local1412;
							@Pc(1430) Class23 local1430 = Static8.aClass23Array4[local935];
							Static8.aClass23Array4[local935] = Static8.aClass23Array4[local935 + 1];
							Static8.aClass23Array4[local935 + 1] = local1430;
							@Pc(1448) long local1448 = Static88.aLongArray16[local935];
							Static88.aLongArray16[local935] = Static88.aLongArray16[local935 + 1];
							Static88.aLongArray16[local935 + 1] = local1448;
							Static34.aBoolean60 = true;
						}
					}
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 4) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method696();
				local122 = Static83.aClass1_Sub5_Sub1_3.method696();
				local126 = Static83.aClass1_Sub5_Sub1_3.method673();
				local130 = Static15.method174(local126);
				local130.anInt820 = local130.anInt840 + local122;
				local130.anInt816 = local118 + local130.anInt844;
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 66) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method678();
				Static17.method231(local118);
				Static28.anInt2227 = Static7.anInt176;
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 82) {
				Static9.aBoolean5 = false;
				for (local118 = 0; local118 < 5; local118++) {
					Static76.aBooleanArray6[local118] = false;
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 20) {
				if (anInt2723 == 12) {
					Static34.aBoolean60 = true;
				}
				Static18.anInt458 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 208) {
				if (Static92.anInt2913 != -1) {
					Static108.method1842(Static92.anInt2913);
					Static92.anInt2913 = -1;
				}
				Static68.aBoolean27 = false;
				Static96.anInt1794 = -1;
				Static102.aBoolean123 = true;
				Static104.aClass23_1522 = Static104.aClass23_1523;
				Static44.anInt1485 = 2;
				return true;
			}
			if (Static96.anInt1794 == 140) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method716();
				local273 = Static83.aClass1_Sub5_Sub1_3.method683();
				local126 = Static83.aClass1_Sub5_Sub1_3.method676();
				if (local118 >= 1 && local118 <= 5) {
					if (local273.method530(Static52.aClass23_870)) {
						local273 = null;
					}
					Static14.aClass23Array6[local118 - 1] = local273;
					Static26.aBooleanArray3[local118 - 1] = local126 == 0;
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 80) {
				if (Static16.anInt335 != -1) {
					Static108.method1842(Static16.anInt335);
					Static34.aBoolean60 = true;
					Static64.aBoolean98 = true;
					Static16.anInt335 = -1;
				}
				if (Static92.anInt2913 != -1) {
					Static108.method1842(Static92.anInt2913);
					Static92.anInt2913 = -1;
					Static102.aBoolean123 = true;
				}
				if (Static77.anInt2096 != -1) {
					Static108.method1842(Static77.anInt2096);
					Static77.anInt2096 = -1;
					Static89.method1524(30);
				}
				if (Static87.anInt2866 != -1) {
					Static108.method1842(Static87.anInt2866);
					Static87.anInt2866 = -1;
				}
				if (Static109.anInt2824 != -1) {
					Static108.method1842(Static109.anInt2824);
					Static109.anInt2824 = -1;
				}
				if (Static44.anInt1485 != 0) {
					Static102.aBoolean123 = true;
					Static44.anInt1485 = 0;
				}
				Static96.anInt1794 = -1;
				Static47.anInt1599 = -1;
				return true;
			}
			if (Static96.anInt1794 == 115) {
				local1254 = Static83.aClass1_Sub5_Sub1_3.method726();
				@Pc(1736) Class23 local1736 = Static10.method108(Static83.aClass1_Sub5_Sub1_3).method527();
				Static63.method1229(Static54.method1049(local1254).method514(), local1736, 6);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 43) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method672();
				local122 = Static83.aClass1_Sub5_Sub1_3.method678();
				local165 = Static15.method174(local118);
				local165.anInt793 = 1;
				Static96.anInt1794 = -1;
				local165.anInt824 = local122;
				return true;
			}
			if (Static96.anInt1794 == 243) {
				local1254 = Static83.aClass1_Sub5_Sub1_3.method726();
				local279 = Static83.aClass1_Sub5_Sub1_3.method715();
				@Pc(1792) boolean local1792 = false;
				@Pc(1797) long local1797 = (long) Static83.aClass1_Sub5_Sub1_3.method688();
				@Pc(1803) long local1803 = local1797 + (local279 << 32);
				local935 = Static83.aClass1_Sub5_Sub1_3.method716();
				for (@Pc(1809) int local1809 = 0; local1809 < 100; local1809++) {
					if (local1803 == Static63.aLongArray25[local1809]) {
						local1792 = true;
						break;
					}
				}
				if (local935 <= 1) {
					for (@Pc(1832) int local1832 = 0; local1832 < Static35.anInt1118; local1832++) {
						if (local1254 == Static58.aLongArray37[local1832]) {
							local1792 = true;
							break;
						}
					}
				}
				if (!local1792 && Static46.anInt1571 == 0) {
					Static63.aLongArray25[Static66.anInt1970] = local1803;
					Static66.anInt1970 = (Static66.anInt1970 + 1) % 100;
					@Pc(1869) Class23 local1869 = Static10.method108(Static83.aClass1_Sub5_Sub1_3).method527();
					if (local935 == 2 || local935 == 3) {
						Static63.method1229(Static17.method233(new Class23[] { Static46.aClass23_850, Static54.method1049(local1254).method514() }), local1869, 7);
					} else if (local935 == 1) {
						Static63.method1229(Static17.method233(new Class23[] { Static8.aClass23_159, Static54.method1049(local1254).method514() }), local1869, 7);
					} else {
						Static63.method1229(Static54.method1049(local1254).method514(), local1869, 3);
					}
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 181) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method676();
				local122 = Static83.aClass1_Sub5_Sub1_3.method715();
				if (local122 == 65535) {
					local122 = -1;
				}
				if (Static90.anIntArray325[local118] != local122) {
					Static108.method1842(Static90.anIntArray325[local118]);
					Static90.anIntArray325[local118] = local122;
				}
				Static64.aBoolean98 = true;
				Static34.aBoolean60 = true;
				Static42.method903(Static90.anIntArray325[local118]);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 56) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method675();
				local122 = Static83.aClass1_Sub5_Sub1_3.method682();
				if (local118 == 65535) {
					local118 = -1;
				}
				local126 = Static83.aClass1_Sub5_Sub1_3.method673();
				local130 = Static15.method174(local126);
				if (local130.aBoolean39) {
					local130.anInt811 = local118;
					local130.anInt848 = local122;
				} else if (local118 == -1) {
					Static96.anInt1794 = -1;
					local130.anInt793 = 0;
					return true;
				} else {
					@Pc(2042) Class1_Sub1_Sub1 local2042 = Static111.method1907(local118);
					local130.anInt791 = local2042.anInt85 * 100 / local122;
					local130.anInt824 = local118;
					local130.anInt793 = 4;
					local130.anInt801 = local2042.anInt90;
					local130.anInt792 = local2042.anInt55;
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 180) {
				if (anInt2723 == 12) {
					Static34.aBoolean60 = true;
				}
				Static35.anInt1121 = Static83.aClass1_Sub5_Sub1_3.method691();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 147) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method682();
				local122 = Static83.aClass1_Sub5_Sub1_3.method678();
				local165 = Static15.method174(local118);
				local165.anInt793 = 2;
				Static96.anInt1794 = -1;
				local165.anInt824 = local122;
				return true;
			}
			if (Static96.anInt1794 == 251) {
				Static76.anInt2079 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 126) {
				Static35.anInt1095 = Static83.aClass1_Sub5_Sub1_3.method713();
				Static43.anInt1458 = Static83.aClass1_Sub5_Sub1_3.method713();
				for (local118 = Static35.anInt1095; local118 < Static35.anInt1095 + 8; local118++) {
					for (local122 = Static43.anInt1458; local122 < Static43.anInt1458 + 8; local122++) {
						if (Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local118][local122] != null) {
							Static49.aClass45ArrayArrayArray3[Static79.anInt2137][local118][local122] = null;
							Static104.method1776(local122, local118);
						}
					}
				}
				for (@Pc(2185) Class1_Sub11 local2185 = (Class1_Sub11) Static109.aClass45_9.method1299(); local2185 != null; local2185 = (Class1_Sub11) Static109.aClass45_9.method1288()) {
					if (local2185.anInt2039 >= Static35.anInt1095 && Static35.anInt1095 + 8 > local2185.anInt2039 && local2185.anInt2041 >= Static43.anInt1458 && local2185.anInt2041 < Static43.anInt1458 + 8 && Static79.anInt2137 == local2185.anInt2037) {
						local2185.anInt2038 = 0;
					}
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 206) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method728();
				local122 = Static83.aClass1_Sub5_Sub1_3.method728();
				Static2.method1414(local118);
				if (local122 != -1) {
					Static2.method1414(local122);
				}
				if (Static109.anInt2824 != -1) {
					Static108.method1842(Static109.anInt2824);
					Static109.anInt2824 = -1;
				}
				if (Static16.anInt335 != -1) {
					Static108.method1842(Static16.anInt335);
					Static16.anInt335 = -1;
				}
				if (Static92.anInt2913 != -1) {
					Static108.method1842(Static92.anInt2913);
					Static92.anInt2913 = -1;
				}
				if (Static77.anInt2096 != local118) {
					Static108.method1842(Static77.anInt2096);
					Static77.anInt2096 = local118;
					Static89.method1524(35);
				}
				if (Static87.anInt2866 != local118) {
					Static108.method1842(Static87.anInt2866);
					Static87.anInt2866 = local122;
				}
				Static47.anInt1599 = -1;
				Static44.anInt1485 = 0;
				Static42.method903(Static77.anInt2096);
				Static42.method903(Static87.anInt2866);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 187) {
				Static57.method1097(Static39.anInt1382, Static83.aClass1_Sub5_Sub1_3, Static26.aClass54_2);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 78) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method715();
				if (local118 == 65535) {
					local118 = -1;
				}
				Static84.method1473(local118);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 174) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method728();
				if (local118 == 65535) {
					local118 = -1;
				}
				local122 = Static83.aClass1_Sub5_Sub1_3.method681();
				Static114.method1927(local122, local118);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 93) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method682();
				@Pc(2405) boolean local2405 = Static83.aClass1_Sub5_Sub1_3.method716() == 1;
				local165 = Static15.method174(local118);
				Static96.anInt1794 = -1;
				local165.aBoolean36 = local2405;
				return true;
			}
			if (Static96.anInt1794 == 234) {
				Static34.aBoolean60 = true;
				local118 = Static83.aClass1_Sub5_Sub1_3.method716();
				local122 = Static83.aClass1_Sub5_Sub1_3.method713();
				local126 = Static83.aClass1_Sub5_Sub1_3.method692();
				Static20.anIntArray92[local118] = local126;
				Static109.anIntArray395[local118] = local122;
				Static63.anIntArray225[local118] = 1;
				for (local173 = 0; local173 < 98; local173++) {
					if (client.anIntArray63[local173] <= local126) {
						Static63.anIntArray225[local118] = local173 + 2;
					}
				}
				Static61.anInt1890 = Static7.anInt176;
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 179) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method716();
				local122 = Static83.aClass1_Sub5_Sub1_3.method676();
				local126 = Static83.aClass1_Sub5_Sub1_3.method676();
				Static79.anInt2137 = local126 >> 1;
				Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.method1391(local118, (local126 & 0x1) == 1, local122);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 164) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method728();
				local122 = Static83.aClass1_Sub5_Sub1_3.method675();
				if (Static92.anInt2913 != -1) {
					Static108.method1842(Static92.anInt2913);
					Static102.aBoolean123 = true;
					Static92.anInt2913 = -1;
				}
				if (Static77.anInt2096 != -1) {
					Static108.method1842(Static77.anInt2096);
					Static77.anInt2096 = -1;
					Static89.method1524(30);
				}
				if (Static87.anInt2866 != -1) {
					Static108.method1842(Static87.anInt2866);
					Static87.anInt2866 = -1;
				}
				if (Static109.anInt2824 != local118) {
					Static108.method1842(Static109.anInt2824);
					Static109.anInt2824 = local118;
				}
				if (Static16.anInt335 != local122) {
					Static108.method1842(Static16.anInt335);
					Static16.anInt335 = local122;
				}
				Static64.aBoolean98 = true;
				Static47.anInt1599 = -1;
				if (Static44.anInt1485 != 0) {
					Static102.aBoolean123 = true;
					Static44.anInt1485 = 0;
				}
				Static34.aBoolean60 = true;
				Static42.method903(Static109.anInt2824);
				Static42.method903(Static16.anInt335);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 246) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method682();
				local122 = Static83.aClass1_Sub5_Sub1_3.method728();
				local173 = local122 >> 5 & 0x1F;
				local126 = local122 >> 10 & 0x1F;
				local177 = local122 & 0x1F;
				@Pc(2630) Class1_Sub1_Sub7 local2630 = Static15.method174(local118);
				Static96.anInt1794 = -1;
				local2630.anInt798 = (local177 << 3) + (local173 << 11) + (local126 << 19);
				return true;
			}
			if (Static96.anInt1794 == 103) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method675();
				local122 = Static83.aClass1_Sub5_Sub1_3.method672();
				Static70.anIntArray211[local118] = local122;
				if (Static40.anIntArray164[local118] != local122) {
					Static40.anIntArray164[local118] = local122;
					Static18.method248(local118);
					if (Static56.anInt1733 != -1) {
						Static102.aBoolean123 = true;
					}
					Static34.aBoolean60 = true;
				}
				Static96.anInt1794 = -1;
				Static108.anInt2794 = Static7.anInt176;
				return true;
			}
			if (Static96.anInt1794 == 81) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method723();
				if (local118 >= 0) {
					Static2.method1414(local118);
				}
				if (local118 != Static70.anInt1836) {
					Static108.method1842(Static70.anInt1836);
					Static70.anInt1836 = local118;
				}
				Static42.method903(Static70.anInt1836);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 136) {
				if (Static92.anInt2913 != -1) {
					Static108.method1842(Static92.anInt2913);
					Static92.anInt2913 = -1;
				}
				Static104.aClass23_1522 = Static104.aClass23_1523;
				Static96.anInt1794 = -1;
				Static102.aBoolean123 = true;
				Static44.anInt1485 = 1;
				Static68.aBoolean27 = false;
				return true;
			}
			if (Static96.anInt1794 == 48) {
				for (local118 = 0; local118 < Static40.anIntArray164.length; local118++) {
					if (Static40.anIntArray164[local118] != Static70.anIntArray211[local118]) {
						Static40.anIntArray164[local118] = Static70.anIntArray211[local118];
						Static18.method248(local118);
						Static34.aBoolean60 = true;
					}
				}
				Static96.anInt1794 = -1;
				Static108.anInt2794 = Static7.anInt176;
				return true;
			}
			if (Static96.anInt1794 == 146) {
				Static35.anInt1095 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static43.anInt1458 = Static83.aClass1_Sub5_Sub1_3.method713();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 23) {
				local245 = Static83.aClass1_Sub5_Sub1_3.method683();
				local122 = Static83.aClass1_Sub5_Sub1_3.method673();
				local165 = Static15.method174(local122);
				local165.aClass23_461 = local245;
				if (local122 >> 16 == Static90.anIntArray325[anInt2723]) {
					Static34.aBoolean60 = true;
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 218) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method673();
				local838 = Static15.method174(local118);
				local838.anInt793 = 3;
				local838.anInt824 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass58_2.method1613();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 236) {
				for (local118 = 0; local118 < Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3.length; local118++) {
					if (Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local118] != null) {
						Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local118].anInt2213 = -1;
					}
				}
				for (local122 = 0; local122 < Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1.length; local122++) {
					if (Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local122] != null) {
						Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local122].anInt2213 = -1;
					}
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 203) {
				Static95.method1625();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 74) {
				Static115.anInt2954 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static96.anInt1794 = -1;
				Static34.aBoolean60 = true;
				return true;
			}
			if (Static96.anInt1794 == 22) {
				Static104.anInt2686 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 194) {
				Static9.aBoolean5 = true;
				Static92.anInt2919 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static35.anInt1111 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static45.anInt1523 = Static83.aClass1_Sub5_Sub1_3.method715();
				Static74.anInt1805 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static16.anInt332 = Static83.aClass1_Sub5_Sub1_3.method716();
				if (Static16.anInt332 >= 100) {
					local118 = Static92.anInt2919 * 128 + 64;
					local122 = Static35.anInt1111 * 128 + 64;
					local126 = Static48.method987(local122, local118, Static79.anInt2137) - Static45.anInt1523;
					local177 = local126 - Static96.anInt1793;
					local179 = local122 - Static21.anInt702;
					local173 = local118 - Static54.anInt1684;
					local935 = (int) Math.sqrt((double) (local173 * local173 + local179 * local179));
					Static44.anInt1488 = (int) (Math.atan2((double) local177, (double) local935) * 325.949D) & 0x7FF;
					Static107.anInt2775 = (int) (Math.atan2((double) local173, (double) local179) * -325.949D) & 0x7FF;
					if (Static44.anInt1488 < 128) {
						Static44.anInt1488 = 128;
					}
					if (Static44.anInt1488 > 383) {
						Static44.anInt1488 = 383;
					}
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 34) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method716();
				local122 = Static83.aClass1_Sub5_Sub1_3.method716();
				local126 = Static83.aClass1_Sub5_Sub1_3.method716();
				local173 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static76.aBooleanArray6[local118] = true;
				Static76.anIntArray239[local118] = local122;
				Static41.anIntArray168[local118] = local126;
				Static62.anIntArray220[local118] = local173;
				Static14.anIntArray49[local118] = 0;
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 58) {
				Static66.anInt1971 = Static83.aClass1_Sub5_Sub1_3.method715() * 30;
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 189) {
				Static96.method1109();
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 210) {
				Static9.aBoolean5 = true;
				Static107.anInt2743 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static17.anInt427 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static13.anInt237 = Static83.aClass1_Sub5_Sub1_3.method715();
				Static27.anInt858 = Static83.aClass1_Sub5_Sub1_3.method716();
				Static104.anInt2690 = Static83.aClass1_Sub5_Sub1_3.method716();
				if (Static104.anInt2690 >= 100) {
					Static54.anInt1684 = Static107.anInt2743 * 128 + 64;
					Static21.anInt702 = Static17.anInt427 * 128 + 64;
					Static96.anInt1793 = Static48.method987(Static21.anInt702, Static54.anInt1684, Static79.anInt2137) - Static13.anInt237;
				}
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 2) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method675();
				Static2.method1414(local118);
				if (Static16.anInt335 != -1) {
					Static108.method1842(Static16.anInt335);
					Static34.aBoolean60 = true;
					Static16.anInt335 = -1;
					Static64.aBoolean98 = true;
				}
				if (Static92.anInt2913 != -1) {
					Static108.method1842(Static92.anInt2913);
					Static102.aBoolean123 = true;
					Static92.anInt2913 = -1;
				}
				if (Static77.anInt2096 != -1) {
					Static108.method1842(Static77.anInt2096);
					Static77.anInt2096 = -1;
					Static89.method1524(30);
				}
				if (Static87.anInt2866 != -1) {
					Static108.method1842(Static87.anInt2866);
					Static87.anInt2866 = -1;
				}
				if (Static109.anInt2824 != local118) {
					Static108.method1842(Static109.anInt2824);
					Static109.anInt2824 = local118;
				}
				if (Static44.anInt1485 != 0) {
					Static44.anInt1485 = 0;
					Static102.aBoolean123 = true;
				}
				Static47.anInt1599 = -1;
				Static42.method903(Static109.anInt2824);
				Static96.anInt1794 = -1;
				return true;
			}
			if (Static96.anInt1794 == 44) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method682();
				local122 = Static83.aClass1_Sub5_Sub1_3.method715();
				local165 = Static15.method174(local118);
				Static96.anInt1794 = -1;
				if (local165 != null && local165.anInt802 == 0) {
					if (local122 < 0) {
						local122 = 0;
					}
					if (local165.anInt807 - local165.anInt817 < local122) {
						local122 = local165.anInt807 - local165.anInt817;
					}
					local165.anInt822 = local122;
				}
				return true;
			}
			if (Static96.anInt1794 == 128) {
				local118 = Static83.aClass1_Sub5_Sub1_3.method678();
				@Pc(3326) byte local3326 = Static83.aClass1_Sub5_Sub1_3.method724();
				Static70.anIntArray211[local118] = local3326;
				if (Static40.anIntArray164[local118] != local3326) {
					Static40.anIntArray164[local118] = local3326;
					Static18.method248(local118);
					Static34.aBoolean60 = true;
					if (Static56.anInt1733 != -1) {
						Static102.aBoolean123 = true;
					}
				}
				Static96.anInt1794 = -1;
				Static108.anInt2794 = Static7.anInt176;
				return true;
			}
			Static42.method908("T1 - " + Static96.anInt1794 + "," + Static44.anInt1486 + "," + Static37.anInt1300 + " - " + Static39.anInt1382, null);
			Static32.method513();
		} catch (@Pc(3381) IOException local3381) {
			Static1.method42();
		} catch (@Pc(3385) Exception local3385) {
			@Pc(3427) String local3427 = "T2 - " + Static96.anInt1794 + "," + Static44.anInt1486 + "," + Static37.anInt1300 + " - " + Static39.anInt1382 + "," + (Static104.anInt2684 + Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray264[0]) + "," + (Static107.anInt2745 + Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.anIntArray266[0]) + " - ";
			for (local122 = 0; Static39.anInt1382 > local122 && local122 < 50; local122++) {
				local3427 = local3427 + Static83.aClass1_Sub5_Sub1_3.aByteArray6[local122] + ",";
			}
			Static42.method908(local3427, local3385);
			Static32.method513();
		}
		return true;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method1798() {
		for (@Pc(15) Class1_Sub1_Sub2_Sub5 local15 = (Class1_Sub1_Sub2_Sub5) Static71.aClass45_5.method1299(); local15 != null; local15 = (Class1_Sub1_Sub2_Sub5) Static71.aClass45_5.method1288()) {
			if (Static79.anInt2137 != local15.anInt1768 || local15.aBoolean88) {
				local15.method1913();
			} else if (local15.anInt1784 <= Static7.anInt176) {
				local15.method1095(Static70.anInt1829);
				if (local15.aBoolean88) {
					local15.method1913();
				} else {
					Static19.aClass65_1.method1759(local15.anInt1768, local15.anInt1773, local15.anInt1785, local15.anInt1783, 60, local15, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
	public static void method1799() {
		if (Static55.aClass61_1 != null) {
			@Pc(11) Class61 local11 = Static55.aClass61_1;
			synchronized (Static55.aClass61_1) {
				Static55.aClass61_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V")
	public static void method1800() {
		aClass23_1553 = null;
		aClass23_1557 = null;
		aClass23_1555 = null;
		aClass23_1552 = null;
		aClass23_1560 = null;
		aClass23_1554 = null;
		anIntArray375 = null;
		aClass23_1559 = null;
		aClass23_1558 = null;
		aBigInteger2 = null;
		aClass23_1549 = null;
		aClass23_1550 = null;
		aClass23_1556 = null;
		aClass23_1551 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)I")
	public static int method1801(@OriginalArg(0) int arg0) {
		return (int) (Math.log((double) arg0 * 0.00390625D) * 868.5889638065036D + 0.5D);
	}
}
