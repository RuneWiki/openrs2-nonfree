import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!pa", name = "p", descriptor = "[I")
	public static int[] anIntArray294;

	@OriginalMember(owner = "client!pa", name = "t", descriptor = "Lclient!fe;")
	public static Class26 aClass26_3;

	@OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
	public static int anInt2723;

	@OriginalMember(owner = "client!pa", name = "q", descriptor = "[I")
	private static int[] anIntArray295 = new int[32];

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
	public static final int anInt2718 = 7759444;

	@OriginalMember(owner = "client!pa", name = "u", descriptor = "Lclient!cf;")
	public static Class12 aClass12_10 = new Class12();

	@OriginalMember(owner = "client!pa", name = "w", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1176 = Static51.method932("gelb:");

	@OriginalMember(owner = "client!pa", name = "x", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1177 = Static51.method932("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!pa", name = "F", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1178 = Static51.method932("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
	public static void method1931() {
		Static34.aClass72_8.method2261();
		Static100.aClass72_19.method2261();
		Static40.aClass72_10.method2261();
	}

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)Z")
	public static boolean method1932() {
		if (Static98.aClass34_5 == null) {
			return false;
		}
		@Pc(138) int local138;
		try {
			@Pc(13) int local13 = Static98.aClass34_5.method1135();
			if (local13 == 0) {
				return false;
			}
			if (Static55.anInt1420 == -1) {
				local13--;
				Static98.aClass34_5.method1134(0, 1, Static75.aClass2_Sub11_Sub1_1.aByteArray24);
				Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
				Static55.anInt1420 = Static75.aClass2_Sub11_Sub1_1.method1492();
				Static174.anInt3743 = Static92.anIntArray225[Static55.anInt1420];
			}
			if (Static174.anInt3743 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static98.aClass34_5.method1134(0, 1, Static75.aClass2_Sub11_Sub1_1.aByteArray24);
				Static174.anInt3743 = Static75.aClass2_Sub11_Sub1_1.aByteArray24[0] & 0xFF;
			}
			if (Static174.anInt3743 == -2) {
				if (local13 <= 1) {
					return false;
				}
				Static98.aClass34_5.method1134(0, 2, Static75.aClass2_Sub11_Sub1_1.aByteArray24);
				local13 -= 2;
				Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
				Static174.anInt3743 = Static75.aClass2_Sub11_Sub1_1.method1456();
			}
			if (Static174.anInt3743 > local13) {
				return false;
			}
			Static75.aClass2_Sub11_Sub1_1.anInt2077 = 0;
			Static98.aClass34_5.method1134(0, Static174.anInt3743, Static75.aClass2_Sub11_Sub1_1.aByteArray24);
			Static160.anInt3398 = Static75.anInt1785;
			Static75.anInt1785 = Static96.anInt3689;
			Static96.anInt3689 = Static55.anInt1420;
			Static175.anInt3786 = 0;
			@Pc(134) int local134;
			@Pc(142) Class23 local142;
			if (Static55.anInt1420 == 235) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1489();
				local138 = Static75.aClass2_Sub11_Sub1_1.method1459();
				local142 = Static102.method2541(local134);
				if (local142 != null && local142.anInt1090 == 0) {
					if (local142.anInt1076 - local142.anInt1087 < local138) {
						local138 = local142.anInt1076 - local142.anInt1087;
					}
					if (local138 < 0) {
						local138 = 0;
					}
					if (local138 != local142.anInt1053) {
						local142.anInt1053 = local138;
						Static3.method34(local142);
					}
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 246) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1435();
				@Pc(214) boolean local214 = Static75.aClass2_Sub11_Sub1_1.method1460() == 1;
				local142 = Static102.method2541(local134);
				if (local214 != local142.aBoolean49) {
					local142.aBoolean49 = local214;
					Static3.method34(local142);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 125) {
				Static100.method1659();
				Static24.anInt559 = Static75.aClass2_Sub11_Sub1_1.method1455();
				Static55.anInt1420 = -1;
				Static133.anInt2947 = Static12.anInt364;
				return true;
			}
			if (Static55.anInt1420 == 151) {
				Static104.method1687();
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 160) {
				Static9.anInt253 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static154.anInt3325 = Static75.aClass2_Sub11_Sub1_1.method1461();
				for (local134 = Static154.anInt3325; local134 < Static154.anInt3325 + 8; local134++) {
					for (local138 = Static9.anInt253; local138 < Static9.anInt253 + 8; local138++) {
						if (Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local134][local138] != null) {
							Static132.aClass12ArrayArrayArray1[Static56.anInt1432][local134][local138] = null;
							Static149.method2286(local138, local134);
						}
					}
				}
				for (@Pc(316) Class2_Sub19 local316 = (Class2_Sub19) Static158.aClass12_13.method384(); local316 != null; local316 = (Class2_Sub19) Static158.aClass12_13.method381()) {
					if (local316.anInt2993 >= Static154.anInt3325 && Static154.anInt3325 + 8 > local316.anInt2993 && Static9.anInt253 <= local316.anInt2998 && Static9.anInt253 + 8 > local316.anInt2998 && Static56.anInt1432 == local316.anInt3000) {
						local316.anInt2994 = 0;
					}
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 28) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1456();
				if (local134 == 65535) {
					local134 = -1;
				}
				Static71.method1208(local134);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 78) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1459();
				local138 = Static75.aClass2_Sub11_Sub1_1.method1483();
				if (local134 == 65535) {
					local134 = -1;
				}
				Static151.method2298(local138, local134);
				Static55.anInt1420 = -1;
				return true;
			}
			@Pc(434) Class10 local434;
			if (Static55.anInt1420 == 254) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1460();
				local138 = Static75.aClass2_Sub11_Sub1_1.method1460();
				local434 = Static75.aClass2_Sub11_Sub1_1.method1452();
				if (local138 >= 1 && local138 <= 8) {
					if (local434.method343(Static176.aClass10_1601)) {
						local434 = null;
					}
					Static98.aClass10Array17[local138 - 1] = local434;
					Static89.aBooleanArray8[local138 - 1] = local134 == 0;
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 170) {
				Static139.anInt3081 = Static174.anInt3743 / 8;
				for (local134 = 0; local134 < Static139.anInt3081; local134++) {
					Static167.aLongArray6[local134] = Static75.aClass2_Sub11_Sub1_1.method1476();
					Static116.aClass10Array20[local134] = Static36.method764(Static167.aLongArray6[local134]);
				}
				Static55.anInt1420 = -1;
				Static1.anInt5 = Static12.anInt364;
				return true;
			}
			@Pc(515) int local515;
			@Pc(527) int local527;
			@Pc(636) int local636;
			@Pc(643) int local643;
			@Pc(673) int local673;
			@Pc(727) int local727;
			@Pc(511) long local511;
			@Pc(519) int local519;
			if (Static55.anInt1420 == 141) {
				local511 = Static75.aClass2_Sub11_Sub1_1.method1476();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local519 = Static75.aClass2_Sub11_Sub1_1.method1461();
				@Pc(525) Class10 local525 = Static36.method764(local511).method361();
				for (local527 = 0; local527 < Static76.anInt1789; local527++) {
					if (local511 == Static16.aLongArray2[local527]) {
						if (local515 != Static70.anIntArray181[local527]) {
							Static70.anIntArray181[local527] = local515;
							if (local515 > 0) {
								Static96.method2627(Static63.aClass10_687, 5, Static3.method36(new Class10[] { local525, Static108.aClass10_1079 }));
							}
							if (local515 == 0) {
								Static96.method2627(Static63.aClass10_687, 5, Static3.method36(new Class10[] { local525, Static93.aClass10_923 }));
							}
						}
						Static62.anIntArray174[local527] = local519;
						local525 = null;
						break;
					}
				}
				if (local525 != null && Static76.anInt1789 < 200) {
					Static16.aLongArray2[Static76.anInt1789] = local511;
					Static5.aClass10Array2[Static76.anInt1789] = local525;
					Static70.anIntArray181[Static76.anInt1789] = local515;
					Static62.anIntArray174[Static76.anInt1789] = local519;
					Static76.anInt1789++;
				}
				Static1.anInt5 = Static12.anInt364;
				local636 = Static76.anInt1789;
				while (local636 > 0) {
					@Pc(640) boolean local640 = true;
					local636--;
					for (local643 = 0; local643 < local636; local643++) {
						if (Static70.anIntArray181[local643] != Static12.anInt363 && Static12.anInt363 == Static70.anIntArray181[local643 + 1] || Static70.anIntArray181[local643] == 0 && Static70.anIntArray181[local643 + 1] != 0) {
							local640 = false;
							local673 = Static70.anIntArray181[local643];
							Static70.anIntArray181[local643] = Static70.anIntArray181[local643 + 1];
							Static70.anIntArray181[local643 + 1] = local673;
							@Pc(691) Class10 local691 = Static5.aClass10Array2[local643];
							Static5.aClass10Array2[local643] = Static5.aClass10Array2[local643 + 1];
							Static5.aClass10Array2[local643 + 1] = local691;
							@Pc(709) long local709 = Static16.aLongArray2[local643];
							Static16.aLongArray2[local643] = Static16.aLongArray2[local643 + 1];
							Static16.aLongArray2[local643 + 1] = local709;
							local727 = Static62.anIntArray174[local643];
							Static62.anIntArray174[local643] = Static62.anIntArray174[local643 + 1];
							Static62.anIntArray174[local643 + 1] = local727;
						}
					}
					if (local640) {
						break;
					}
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 52) {
				Static161.aBoolean153 = true;
				Static167.anInt2050 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static136.anInt3018 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static119.anInt2709 = Static75.aClass2_Sub11_Sub1_1.method1456();
				Static74.anInt2921 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static117.anInt2676 = Static75.aClass2_Sub11_Sub1_1.method1461();
				if (Static117.anInt2676 >= 100) {
					Static104.anInt2384 = Static136.anInt3018 * 128 + 64;
					Static107.anInt2447 = Static167.anInt2050 * 128 + 64;
					Static110.anInt2509 = Static178.method2702(Static104.anInt2384, Static107.anInt2447, Static56.anInt1432) - Static119.anInt2709;
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 176) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1461();
				if (Static75.aClass2_Sub11_Sub1_1.method1461() == 0) {
					Static174.aClass19Array1[local134] = new Class19();
				} else {
					Static75.aClass2_Sub11_Sub1_1.anInt2077--;
					Static174.aClass19Array1[local134] = new Class19(Static75.aClass2_Sub11_Sub1_1);
				}
				Static119.anInt2711 = Static12.anInt364;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 51) {
				Static100.method1659();
				Static68.anInt1630 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static55.anInt1420 = -1;
				Static133.anInt2947 = Static12.anInt364;
				return true;
			}
			if (Static55.anInt1420 == 233) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1475();
				local138 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1435();
				@Pc(888) Class2_Sub15 local888 = (Class2_Sub15) Static30.aClass18_2.method683((long) local515);
				if (local888 != null) {
					Static48.method890(local888, local888.anInt2387 != local134);
				}
				Static99.method1646(local134, local515, local138);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 239) {
				Static1.method6(true);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 80) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1435();
				Static64.aClass15_4 = Static57.aClass63_4.method1963(local134);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 163) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1446();
				local138 = Static75.aClass2_Sub11_Sub1_1.method1489();
				local142 = Static102.method2541(local138);
				if (local134 != local142.anInt1069 || local134 == -1) {
					local142.anInt1069 = local134;
					local142.anInt1098 = 0;
					local142.anInt1062 = 0;
					Static3.method34(local142);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 219) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local138 = Static75.aClass2_Sub11_Sub1_1.method1460();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1460();
				Static56.anInt1432 = local138 >> 1;
				Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.method2468(local134, (local138 & 0x1) == 1, local515);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 251) {
				Static161.aBoolean153 = false;
				for (local134 = 0; local134 < 5; local134++) {
					Static178.aBooleanArray19[local134] = false;
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 30) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1454();
				@Pc(1051) Class23 local1051 = Static102.method2541(local134);
				local1051.anInt1093 = 3;
				local1051.anInt1034 = Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.aClass74_2.method2270();
				Static3.method34(local1051);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 216) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local138 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local519 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static178.aBooleanArray19[local134] = true;
				Static72.anIntArray188[local134] = local138;
				Static60.anIntArray173[local134] = local515;
				Static41.anIntArray76[local134] = local519;
				Static117.anIntArray282[local134] = 0;
				Static55.anInt1420 = -1;
				return true;
			}
			@Pc(1135) Class23 local1135;
			if (Static55.anInt1420 == 188) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1454();
				local138 = Static75.aClass2_Sub11_Sub1_1.method1443();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1475();
				local519 = Static75.aClass2_Sub11_Sub1_1.method1443();
				local1135 = Static102.method2541(local134);
				if (local515 != local1135.anInt1058 || local138 != local1135.anInt1044 || local1135.anInt1039 != local519) {
					local1135.anInt1058 = local515;
					local1135.anInt1044 = local138;
					local1135.anInt1039 = local519;
					Static3.method34(local1135);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 165) {
				local511 = Static75.aClass2_Sub11_Sub1_1.method1476();
				local434 = Static35.method525(Static81.method1309(Static75.aClass2_Sub11_Sub1_1).method348());
				Static96.method2627(Static36.method764(local511).method361(), 6, local434);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 68) {
				if (Static107.anInt2446 != -1) {
					Static144.method2255(Static107.anInt2446, 0);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			@Pc(1244) Class23 local1244;
			if (Static55.anInt1420 == 210) {
				local134 = Static75.aClass2_Sub11_Sub1_1.method1459();
				if (local134 == 65535) {
					local134 = -1;
				}
				local138 = Static75.aClass2_Sub11_Sub1_1.method1489();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1449();
				local1244 = Static102.method2541(local138);
				@Pc(1257) Class2_Sub1_Sub6 local1257;
				if (local1244.aBoolean37) {
					local1244.anInt1067 = local515;
					local1244.anInt1099 = local134;
					local1257 = Static78.method577(local134);
					local1244.anInt1038 = local1257.anInt1529;
					local1244.anInt1030 = local1257.anInt1515;
					local1244.anInt1058 = local1257.anInt1518;
					local1244.anInt1044 = local1257.anInt1532;
					local1244.anInt1039 = local1257.anInt1509;
					local1244.anInt1055 = local1257.anInt1496;
					if (local1244.anInt1089 > 0) {
						local1244.anInt1039 = local1244.anInt1039 * 32 / local1244.anInt1089;
					}
					Static3.method34(local1244);
				} else if (local134 == -1) {
					local1244.anInt1093 = 0;
					Static55.anInt1420 = -1;
					return true;
				} else {
					local1257 = Static78.method577(local134);
					local1244.anInt1034 = local134;
					local1244.anInt1044 = local1257.anInt1532;
					local1244.anInt1093 = 4;
					local1244.anInt1039 = local1257.anInt1509 * 100 / local515;
					local1244.anInt1058 = local1257.anInt1518;
					Static3.method34(local1244);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 100) {
				Static50.method926(Static75.aClass2_Sub11_Sub1_1);
				Static55.anInt1420 = -1;
				return true;
			}
			@Pc(1404) int local1404;
			@Pc(1425) int local1425;
			if (Static55.anInt1420 == 138) {
				Static161.aBoolean153 = true;
				Static46.anInt1136 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static46.anInt1141 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static28.anInt785 = Static75.aClass2_Sub11_Sub1_1.method1456();
				Static176.anInt3789 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static24.anInt555 = Static75.aClass2_Sub11_Sub1_1.method1461();
				if (Static24.anInt555 >= 100) {
					local138 = Static46.anInt1141 * 128 + 64;
					local134 = Static46.anInt1136 * 128 + 64;
					local515 = Static178.method2702(local138, local134, Static56.anInt1432) - Static28.anInt785;
					local1404 = local515 - Static110.anInt2509;
					local519 = local134 - Static107.anInt2447;
					local527 = local138 - Static104.anInt2384;
					local1425 = (int) Math.sqrt((double) (local519 * local519 + local527 * local527));
					Static95.anInt2250 = (int) (Math.atan2((double) local1404, (double) local1425) * 325.949D) & 0x7FF;
					Static161.anInt3427 = (int) (Math.atan2((double) local519, (double) local527) * -325.949D) & 0x7FF;
					if (Static95.anInt2250 < 128) {
						Static95.anInt2250 = 128;
					}
					if (Static95.anInt2250 > 383) {
						Static95.anInt2250 = 383;
					}
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 147) {
				Static100.method1659();
				local138 = Static75.aClass2_Sub11_Sub1_1.method1449();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1462();
				local519 = Static75.aClass2_Sub11_Sub1_1.method1462();
				Static138.anIntArray327[local519] = local138;
				Static99.anIntArray241[local519] = local515;
				Static58.anIntArray165[local519] = 1;
				for (local1404 = 0; local1404 < 98; local1404++) {
					if (local138 >= Class2_Sub2_Sub19.anIntArray224[local1404]) {
						Static58.anIntArray165[local519] = local1404 + 2;
					}
				}
				Static111.anIntArray259[Static64.anInt1575++ & 0x1F] = local519;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 189) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1449();
				@Pc(1549) Class2_Sub15 local1549 = (Class2_Sub15) Static30.aClass18_2.method683((long) local138);
				if (local1549 != null) {
					Static48.method890(local1549, true);
				}
				if (Static68.aClass23_6 != null) {
					Static3.method34(Static68.aClass23_6);
					Static68.aClass23_6 = null;
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 4) {
				Static9.anInt253 = Static75.aClass2_Sub11_Sub1_1.method1462();
				Static154.anInt3325 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 178) {
				for (local138 = 0; local138 < Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1.length; local138++) {
					if (Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local138] != null) {
						Static86.aClass2_Sub1_Sub3_Sub2_Sub1Array1[local138].anInt3509 = -1;
					}
				}
				for (local515 = 0; local515 < Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1.length; local515++) {
					if (Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local515] != null) {
						Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local515].anInt3509 = -1;
					}
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 143) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1475();
				@Pc(1643) byte local1643 = Static75.aClass2_Sub11_Sub1_1.method1438();
				Static146.anIntArray338[local138] = local1643;
				if (Static51.anIntArray143[local138] != local1643) {
					Static51.anIntArray143[local138] = local1643;
					Static121.method1953(local138);
				}
				anIntArray295[Static8.anInt237++ & 0x1F] = local138;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 121) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1449();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1456();
				if (local138 < 0) {
					local1244 = null;
				} else {
					local1244 = Static102.method2541(local138);
				}
				if (local1244 != null) {
					for (local1404 = 0; local1404 < local1244.anIntArray131.length; local1404++) {
						local1244.anIntArray131[local1404] = 0;
						local1244.anIntArray126[local1404] = 0;
					}
				}
				if (local138 < -70000) {
					local515 += 32768;
				}
				Static2.method32(local515);
				local1404 = Static75.aClass2_Sub11_Sub1_1.method1456();
				for (local527 = 0; local527 < local1404; local527++) {
					local1425 = Static75.aClass2_Sub11_Sub1_1.method1460();
					if (local1425 == 255) {
						local1425 = Static75.aClass2_Sub11_Sub1_1.method1454();
					}
					local636 = Static75.aClass2_Sub11_Sub1_1.method1443();
					if (local1244 != null && local1244.anIntArray131.length > local527) {
						local1244.anIntArray131[local527] = local636;
						local1244.anIntArray126[local527] = local1425;
					}
					Static157.method2405(local1425, local636 - 1, local527, local515);
				}
				if (local1244 != null) {
					Static3.method34(local1244);
				}
				Static100.method1659();
				Static154.anIntArray353[Static57.anInt1463++ & 0x1F] = local515 & 0x7FFF;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 245) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1456();
				Static180.method2711(local138);
				Static154.anIntArray353[Static57.anInt1463++ & 0x1F] = local138 & 0x7FFF;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 124) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local519 = Static75.aClass2_Sub11_Sub1_1.method1456();
				Static179.method2709(local515, local519, local138);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 64) {
				Static55.anInt1420 = -1;
				Static109.anInt2502 = 0;
				return true;
			}
			@Pc(2010) int local2010;
			@Pc(1890) long local1890;
			@Pc(1910) long local1910;
			if (Static55.anInt1420 == 45) {
				Static121.anInt2753 = Static12.anInt364;
				local1890 = Static75.aClass2_Sub11_Sub1_1.method1476();
				if (local1890 == 0L) {
					Static60.aClass10_659 = null;
					Static65.aClass10_695 = null;
					Static146.anInt3197 = 0;
					Static141.aClass2_Sub17Array1 = null;
					Static55.anInt1420 = -1;
					return true;
				}
				local1910 = Static75.aClass2_Sub11_Sub1_1.method1476();
				Static60.aClass10_659 = Static36.method764(local1910);
				Static65.aClass10_695 = Static36.method764(local1890);
				Static170.aByte9 = Static75.aClass2_Sub11_Sub1_1.method1463();
				local527 = Static75.aClass2_Sub11_Sub1_1.method1461();
				if (local527 == 255) {
					Static55.anInt1420 = -1;
					return true;
				}
				Static146.anInt3197 = local527;
				@Pc(1938) Class2_Sub17[] local1938 = new Class2_Sub17[100];
				for (local636 = 0; local636 < Static146.anInt3197; local636++) {
					local1938[local636] = new Class2_Sub17();
					local1938[local636].aLong139 = Static75.aClass2_Sub11_Sub1_1.method1476();
					local1938[local636].aClass10_1175 = Static36.method764(local1938[local636].aLong139);
					local1938[local636].anInt2721 = Static75.aClass2_Sub11_Sub1_1.method1456();
					local1938[local636].aByte6 = Static75.aClass2_Sub11_Sub1_1.method1463();
					if (local1938[local636].aLong139 == Static85.aLong66) {
						Static114.aByte5 = local1938[local636].aByte6;
					}
				}
				@Pc(2003) int local2003 = Static146.anInt3197;
				while (local2003 > 0) {
					local2003--;
					@Pc(2008) boolean local2008 = true;
					for (local2010 = 0; local2010 < local2003; local2010++) {
						if (local1938[local2010].aClass10_1175.method338(local1938[local2010 + 1].aClass10_1175) > 0) {
							@Pc(2029) Class2_Sub17 local2029 = local1938[local2010];
							local2008 = false;
							local1938[local2010] = local1938[local2010 + 1];
							local1938[local2010 + 1] = local2029;
						}
					}
					if (local2008) {
						break;
					}
				}
				Static141.aClass2_Sub17Array1 = local1938;
				Static55.anInt1420 = -1;
				return true;
			}
			@Pc(2070) Class10 local2070;
			if (Static55.anInt1420 == 47) {
				local2070 = Static75.aClass2_Sub11_Sub1_1.method1452();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1435();
				local1244 = Static102.method2541(local515);
				if (!local2070.method358(local1244.aClass10_500)) {
					local1244.aClass10_500 = local2070;
					Static3.method34(local1244);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 173) {
				Static110.method1754();
				Static55.anInt1420 = -1;
				return false;
			}
			if (Static55.anInt1420 == 115) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1454();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local1404 = local515 >> 5 & 0x1F;
				local519 = local515 >> 10 & 0x1F;
				local527 = local515 & 0x1F;
				local1425 = (local527 << 3) + ((local519 << 19) + (local1404 << 11));
				@Pc(2149) Class23 local2149 = Static102.method2541(local138);
				if (local2149.anInt1080 != local1425) {
					local2149.anInt1080 = local1425;
					Static3.method34(local2149);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 181) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1454();
				local142 = Static102.method2541(local138);
				for (local519 = 0; local519 < local142.anIntArray131.length; local519++) {
					local142.anIntArray131[local519] = -1;
					local142.anIntArray131[local519] = 0;
				}
				Static3.method34(local142);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 94) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1435();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1443();
				local1244 = Static102.method2541(local138);
				if (local1244.anInt1093 != 2 || local1244.anInt1034 != local515) {
					local1244.anInt1034 = local515;
					local1244.anInt1093 = 2;
					Static3.method34(local1244);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 157) {
				Static103.method1682(Static75.aClass2_Sub11_Sub1_1, Static57.aClass63_4, Static174.anInt3743);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 97) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1475();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1489();
				Static146.anIntArray338[local138] = local515;
				if (Static51.anIntArray143[local138] != local515) {
					Static51.anIntArray143[local138] = local515;
					Static121.method1953(local138);
				}
				anIntArray295[Static8.anInt237++ & 0x1F] = local138;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 242) {
				local2070 = Static75.aClass2_Sub11_Sub1_1.method1452();
				@Pc(2318) Object[] local2318 = new Object[local2070.method340() + 1];
				for (local519 = local2070.method340() - 1; local519 >= 0; local519--) {
					if (local2070.method357(local519) == 115) {
						local2318[local519 + 1] = Static75.aClass2_Sub11_Sub1_1.method1452();
					} else {
						local2318[local519 + 1] = Integer.valueOf(Static75.aClass2_Sub11_Sub1_1.method1449());
					}
				}
				local2318[0] = Integer.valueOf(Static75.aClass2_Sub11_Sub1_1.method1449());
				@Pc(2372) Class2_Sub18 local2372 = new Class2_Sub18();
				local2372.anObjectArray29 = local2318;
				Static47.method881(local2372);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 58) {
				for (local138 = 0; local138 < Static40.anInt980; local138++) {
					@Pc(2393) Class2_Sub1_Sub17 local2393 = Static110.method1756(local138);
					if (local2393 != null && local2393.anInt3156 == 0) {
						Static146.anIntArray338[local138] = 0;
						Static51.anIntArray143[local138] = 0;
					}
				}
				Static100.method1659();
				Static8.anInt237 += 32;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 111 || Static55.anInt1420 == 11 || Static55.anInt1420 == 42 || Static55.anInt1420 == 5 || Static55.anInt1420 == 88 || Static55.anInt1420 == 9 || Static55.anInt1420 == 150 || Static55.anInt1420 == 15 || Static55.anInt1420 == 236 || Static55.anInt1420 == 76 || Static55.anInt1420 == 13) {
				Static32.method671();
				Static55.anInt1420 = -1;
				return true;
			}
			@Pc(2491) long local2491;
			if (Static55.anInt1420 == 223) {
				local1890 = Static75.aClass2_Sub11_Sub1_1.method1476();
				local1910 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local2491 = Static75.aClass2_Sub11_Sub1_1.method1436();
				@Pc(2497) long local2497 = (local1910 << 32) + local2491;
				local636 = Static75.aClass2_Sub11_Sub1_1.method1461();
				@Pc(2503) boolean local2503 = false;
				for (local2010 = 0; local2010 < 100; local2010++) {
					if (local2497 == Static13.aLongArray1[local2010]) {
						local2503 = true;
						break;
					}
				}
				if (local636 <= 1) {
					for (@Pc(2528) int local2528 = 0; local2528 < Static139.anInt3081; local2528++) {
						if (local1890 == Static167.aLongArray6[local2528]) {
							local2503 = true;
							break;
						}
					}
				}
				if (!local2503 && Static3.anInt41 == 0) {
					Static13.aLongArray1[Static170.anInt3680] = local2497;
					Static170.anInt3680 = (Static170.anInt3680 + 1) % 100;
					@Pc(2565) Class10 local2565 = Static35.method525(Static81.method1309(Static75.aClass2_Sub11_Sub1_1).method348());
					if (local636 == 2 || local636 == 3) {
						Static96.method2627(Static3.method36(new Class10[] { Static18.aClass10_221, Static36.method764(local1890).method361() }), 7, local2565);
					} else if (local636 == 1) {
						Static96.method2627(Static3.method36(new Class10[] { Static154.aClass10_1448, Static36.method764(local1890).method361() }), 7, local2565);
					} else {
						Static96.method2627(Static36.method764(local1890).method361(), 3, local2565);
					}
				}
				Static55.anInt1420 = -1;
				return true;
			}
			@Pc(2670) long local2670;
			if (Static55.anInt1420 == 218) {
				local1890 = Static75.aClass2_Sub11_Sub1_1.method1476();
				Static75.aClass2_Sub11_Sub1_1.method1463();
				local1910 = Static75.aClass2_Sub11_Sub1_1.method1476();
				local2491 = Static75.aClass2_Sub11_Sub1_1.method1456();
				@Pc(2660) long local2660 = (long) Static75.aClass2_Sub11_Sub1_1.method1436();
				local673 = Static75.aClass2_Sub11_Sub1_1.method1461();
				local2670 = local2660 + (local2491 << 32);
				@Pc(2672) boolean local2672 = false;
				for (local727 = 0; local727 < 100; local727++) {
					if (Static13.aLongArray1[local727] == local2670) {
						local2672 = true;
						break;
					}
				}
				if (local673 <= 1) {
					for (@Pc(2697) int local2697 = 0; local2697 < Static139.anInt3081; local2697++) {
						if (Static167.aLongArray6[local2697] == local1890) {
							local2672 = true;
							break;
						}
					}
				}
				if (!local2672 && Static3.anInt41 == 0) {
					Static13.aLongArray1[Static170.anInt3680] = local2670;
					Static170.anInt3680 = (Static170.anInt3680 + 1) % 100;
					@Pc(2738) Class10 local2738 = Static35.method525(Static81.method1309(Static75.aClass2_Sub11_Sub1_1).method348());
					if (local673 == 2 || local673 == 3) {
						Static163.method2472(9, Static36.method764(local1910).method361(), local2738, Static3.method36(new Class10[] { Static18.aClass10_221, Static36.method764(local1890).method361() }));
					} else if (local673 == 1) {
						Static163.method2472(9, Static36.method764(local1910).method361(), local2738, Static3.method36(new Class10[] { Static154.aClass10_1448, Static36.method764(local1890).method361() }));
					} else {
						Static163.method2472(9, Static36.method764(local1910).method361(), local2738, Static36.method764(local1890).method361());
					}
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 55) {
				Static154.anInt3325 = Static75.aClass2_Sub11_Sub1_1.method1466();
				Static9.anInt253 = Static75.aClass2_Sub11_Sub1_1.method1466();
				while (Static174.anInt3743 > Static75.aClass2_Sub11_Sub1_1.anInt2077) {
					Static55.anInt1420 = Static75.aClass2_Sub11_Sub1_1.method1461();
					Static32.method671();
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 190) {
				local138 = Static75.aClass2_Sub11_Sub1_1.anInt2077 + Static174.anInt3743;
				local515 = Static75.aClass2_Sub11_Sub1_1.method1456();
				local519 = Static75.aClass2_Sub11_Sub1_1.method1456();
				if (local515 != Static107.anInt2446) {
					Static107.anInt2446 = local515;
					Static1.method1(Static107.anInt2446);
					Static141.method2231(Static107.anInt2446);
					for (local1404 = 0; local1404 < 100; local1404++) {
						Static152.aBooleanArray14[local1404] = true;
					}
				}
				while (local519-- > 0) {
					local1404 = Static75.aClass2_Sub11_Sub1_1.method1449();
					local527 = Static75.aClass2_Sub11_Sub1_1.method1456();
					local1425 = Static75.aClass2_Sub11_Sub1_1.method1461();
					@Pc(2915) Class2_Sub15 local2915 = (Class2_Sub15) Static30.aClass18_2.method683((long) local1404);
					if (local2915 != null && local2915.anInt2387 != local527) {
						Static48.method890(local2915, true);
						local2915 = null;
					}
					if (local2915 == null) {
						local2915 = Static99.method1646(local527, local1404, local1425);
					}
					local2915.aBoolean106 = true;
				}
				for (@Pc(2953) Class2_Sub15 local2953 = (Class2_Sub15) Static30.aClass18_2.method687(); local2953 != null; local2953 = (Class2_Sub15) Static30.aClass18_2.method682()) {
					if (local2953.aBoolean106) {
						local2953.aBoolean106 = false;
					} else {
						Static48.method890(local2953, true);
					}
				}
				Static180.aClass18_14 = new Class18(512);
				while (Static75.aClass2_Sub11_Sub1_1.anInt2077 < local138) {
					local527 = Static75.aClass2_Sub11_Sub1_1.method1449();
					local1425 = Static75.aClass2_Sub11_Sub1_1.method1456();
					local636 = Static75.aClass2_Sub11_Sub1_1.method1456();
					local643 = Static75.aClass2_Sub11_Sub1_1.method1449();
					for (local673 = local1425; local673 <= local636; local673++) {
						local2670 = ((long) local527 << 32) + ((long) local673);
						Static180.aClass18_14.method685(local2670, new Class2_Sub8(local643));
					}
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 86) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1443();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1449();
				local519 = Static75.aClass2_Sub11_Sub1_1.method1443();
				local1135 = Static102.method2541(local515);
				Static55.anInt1420 = -1;
				local1135.anInt1059 = (local138 << 16) + local519;
				return true;
			}
			@Pc(3094) boolean local3094;
			if (Static55.anInt1420 == 87) {
				local2070 = Static75.aClass2_Sub11_Sub1_1.method1452();
				if (local2070.method344(Static99.aClass10_1001)) {
					local434 = local2070.method353(0, local2070.method365(Static15.aClass10_194));
					local1910 = local434.method363();
					local3094 = false;
					for (local1425 = 0; local1425 < Static139.anInt3081; local1425++) {
						if (local1910 == Static167.aLongArray6[local1425]) {
							local3094 = true;
							break;
						}
					}
					if (!local3094 && Static3.anInt41 == 0) {
						Static96.method2627(local434, 4, Static57.aClass10_628);
					}
				} else if (local2070.method344(Static170.aClass10_1581)) {
					local434 = local2070.method353(0, local2070.method365(Static15.aClass10_194));
					local3094 = false;
					local1910 = local434.method363();
					for (local1425 = 0; local1425 < Static139.anInt3081; local1425++) {
						if (Static167.aLongArray6[local1425] == local1910) {
							local3094 = true;
							break;
						}
					}
					if (!local3094 && Static3.anInt41 == 0) {
						Static96.method2627(local434, 8, Static147.aClass10_1618);
					}
				} else if (local2070.method344(Static53.aClass10_578)) {
					local434 = local2070.method353(0, local2070.method365(Static15.aClass10_194));
					local3094 = false;
					local1910 = local434.method363();
					for (local1425 = 0; local1425 < Static139.anInt3081; local1425++) {
						if (local1910 == Static167.aLongArray6[local1425]) {
							local3094 = true;
							break;
						}
					}
					if (!local3094 && Static3.anInt41 == 0) {
						@Pc(3373) Class10 local3373 = local2070.method353(local2070.method365(Static15.aClass10_194) + 1, local2070.method340() + -9);
						Static96.method2627(local434, 8, local3373);
					}
				} else if (local2070.method344(Static77.aClass10_784)) {
					local434 = local2070.method353(0, local2070.method365(Static15.aClass10_194));
					local1910 = local434.method363();
					local3094 = false;
					for (local1425 = 0; local1425 < Static139.anInt3081; local1425++) {
						if (Static167.aLongArray6[local1425] == local1910) {
							local3094 = true;
							break;
						}
					}
					if (!local3094 && Static3.anInt41 == 0) {
						Static96.method2627(local434, 10, Static63.aClass10_687);
					}
				} else if (local2070.method344(Static147.aClass10_1620)) {
					local434 = local2070.method353(0, local2070.method365(Static147.aClass10_1620));
					Static96.method2627(Static63.aClass10_687, 11, local434);
				} else if (local2070.method344(Static10.aClass10_135)) {
					local434 = local2070.method353(0, local2070.method365(Static10.aClass10_135));
					if (Static3.anInt41 == 0) {
						Static96.method2627(Static63.aClass10_687, 12, local434);
					}
				} else if (local2070.method344(Static99.aClass10_997)) {
					local434 = local2070.method353(0, local2070.method365(Static99.aClass10_997));
					if (Static3.anInt41 == 0) {
						Static96.method2627(Static63.aClass10_687, 13, local434);
					}
				} else {
					Static96.method2627(Static63.aClass10_687, 0, local2070);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 61) {
				Static102.anInt3607 = Static75.aClass2_Sub11_Sub1_1.method1461();
				if (Static102.anInt3607 == 1) {
					Static53.anInt1254 = Static75.aClass2_Sub11_Sub1_1.method1456();
				}
				if (Static102.anInt3607 >= 2 && Static102.anInt3607 <= 6) {
					if (Static102.anInt3607 == 2) {
						Static154.anInt3314 = 64;
						Static71.anInt1706 = 64;
					}
					if (Static102.anInt3607 == 3) {
						Static154.anInt3314 = 64;
						Static71.anInt1706 = 0;
					}
					if (Static102.anInt3607 == 4) {
						Static71.anInt1706 = 128;
						Static154.anInt3314 = 64;
					}
					if (Static102.anInt3607 == 5) {
						Static154.anInt3314 = 0;
						Static71.anInt1706 = 64;
					}
					if (Static102.anInt3607 == 6) {
						Static154.anInt3314 = 128;
						Static71.anInt1706 = 64;
					}
					Static102.anInt3607 = 2;
					Static65.anInt1597 = Static75.aClass2_Sub11_Sub1_1.method1456();
					Static28.anInt788 = Static75.aClass2_Sub11_Sub1_1.method1456();
					Static135.anInt3004 = Static75.aClass2_Sub11_Sub1_1.method1461();
				}
				if (Static102.anInt3607 == 10) {
					Static167.anInt2043 = Static75.aClass2_Sub11_Sub1_1.method1456();
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 108) {
				Static79.anInt1819 = Static75.aClass2_Sub11_Sub1_1.method1475() * 30;
				Static133.anInt2947 = Static12.anInt364;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 140) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1459();
				if (local138 == 65535) {
					local138 = -1;
				}
				local515 = Static75.aClass2_Sub11_Sub1_1.method1454();
				local519 = Static75.aClass2_Sub11_Sub1_1.method1454();
				local1404 = Static75.aClass2_Sub11_Sub1_1.method1456();
				if (local1404 == 65535) {
					local1404 = -1;
				}
				for (local527 = local138; local527 <= local1404; local527++) {
					@Pc(3539) long local3539 = ((long) local519 << 32) + ((long) local527);
					@Pc(3544) Class2 local3544 = Static180.aClass18_14.method683(local3539);
					if (local3544 != null) {
						local3544.method2705();
					}
					Static180.aClass18_14.method685(local3539, new Class2_Sub8(local515));
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 208) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1449();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1444();
				local519 = Static75.aClass2_Sub11_Sub1_1.method1455();
				local1135 = Static102.method2541(local138);
				local527 = local519 + local1135.anInt1029;
				local1425 = local1135.anInt1041 + local515;
				if (local527 != local1135.anInt1073 || local1135.anInt1085 != local1425) {
					local1135.anInt1073 = local527;
					local1135.anInt1085 = local1425;
					Static3.method34(local1135);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 177) {
				local3094 = false;
				local1890 = Static75.aClass2_Sub11_Sub1_1.method1476();
				if ((Long.MIN_VALUE & local1890) != 0L) {
					local3094 = true;
				}
				local519 = Static75.aClass2_Sub11_Sub1_1.method1456();
				@Pc(3659) byte local3659 = Static75.aClass2_Sub11_Sub1_1.method1463();
				if (local3094) {
					if (Static146.anInt3197 == 0) {
						Static55.anInt1420 = -1;
						return true;
					}
					local1890 &= Long.MAX_VALUE;
					for (local1425 = 0; local1425 < Static146.anInt3197 && (Static141.aClass2_Sub17Array1[local1425].aLong139 != local1890 || Static141.aClass2_Sub17Array1[local1425].anInt2721 != local519); local1425++) {
					}
					if (local1425 < Static146.anInt3197) {
						while (Static146.anInt3197 - 1 > local1425) {
							Static141.aClass2_Sub17Array1[local1425] = Static141.aClass2_Sub17Array1[local1425 + 1];
							local1425++;
						}
						Static146.anInt3197--;
						Static141.aClass2_Sub17Array1[Static146.anInt3197] = null;
					}
				} else {
					@Pc(3729) Class2_Sub17 local3729 = new Class2_Sub17();
					local3729.aLong139 = local1890;
					local3729.aClass10_1175 = Static36.method764(local3729.aLong139);
					local3729.anInt2721 = local519;
					local3729.aByte6 = local3659;
					for (local636 = Static146.anInt3197 - 1; local636 >= 0; local636--) {
						local643 = Static141.aClass2_Sub17Array1[local636].aClass10_1175.method338(local3729.aClass10_1175);
						if (local643 == 0) {
							Static141.aClass2_Sub17Array1[local636].anInt2721 = local519;
							Static141.aClass2_Sub17Array1[local636].aByte6 = local3659;
							if (Static85.aLong66 == local1890) {
								Static114.aByte5 = local3659;
							}
							Static121.anInt2753 = Static12.anInt364;
							Static55.anInt1420 = -1;
							return true;
						}
						if (local643 < 0) {
							break;
						}
					}
					if (Static146.anInt3197 >= Static141.aClass2_Sub17Array1.length) {
						Static55.anInt1420 = -1;
						return true;
					}
					for (local643 = Static146.anInt3197 - 1; local643 > local636; local643--) {
						Static141.aClass2_Sub17Array1[local643 + 1] = Static141.aClass2_Sub17Array1[local643];
					}
					if (Static146.anInt3197 == 0) {
						Static141.aClass2_Sub17Array1 = new Class2_Sub17[100];
					}
					Static141.aClass2_Sub17Array1[local636 + 1] = local3729;
					if (local1890 == Static85.aLong66) {
						Static114.aByte5 = local3659;
					}
					Static146.anInt3197++;
				}
				Static121.anInt2753 = Static12.anInt364;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 39) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1454();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1459();
				local1244 = Static102.method2541(local138);
				if (local1244.anInt1093 != 1 || local515 != local1244.anInt1034) {
					local1244.anInt1034 = local515;
					local1244.anInt1093 = 1;
					Static3.method34(local1244);
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 128) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1475();
				Static107.anInt2446 = local138;
				Static1.method1(local138);
				Static141.method2231(Static107.anInt2446);
				for (local515 = 0; local515 < 100; local515++) {
					Static152.aBooleanArray14[local515] = true;
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 131) {
				Static66.anInt1600 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static130.anInt2890 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static111.anInt2515 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 142) {
				Static69.anInt1635 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static1.anInt5 = Static12.anInt364;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 29) {
				local138 = Static75.aClass2_Sub11_Sub1_1.method1449();
				local515 = Static75.aClass2_Sub11_Sub1_1.method1456();
				if (local138 < -70000) {
					local515 += 32768;
				}
				if (local138 >= 0) {
					local1244 = Static102.method2541(local138);
				} else {
					local1244 = null;
				}
				while (Static174.anInt3743 > Static75.aClass2_Sub11_Sub1_1.anInt2077) {
					local1404 = Static75.aClass2_Sub11_Sub1_1.method1469();
					local527 = Static75.aClass2_Sub11_Sub1_1.method1456();
					local1425 = 0;
					if (local527 != 0) {
						local1425 = Static75.aClass2_Sub11_Sub1_1.method1461();
						if (local1425 == 255) {
							local1425 = Static75.aClass2_Sub11_Sub1_1.method1449();
						}
					}
					if (local1244 != null && local1404 >= 0 && local1244.anIntArray131.length > local1404) {
						local1244.anIntArray131[local1404] = local527;
						local1244.anIntArray126[local1404] = local1425;
					}
					Static157.method2405(local1425, local527 - 1, local1404, local515);
				}
				if (local1244 != null) {
					Static3.method34(local1244);
				}
				Static100.method1659();
				Static154.anIntArray353[Static57.anInt1463++ & 0x1F] = local515 & 0x7FFF;
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 186) {
				Static1.method6(false);
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 89) {
				for (local138 = 0; local138 < Static51.anIntArray143.length; local138++) {
					if (Static146.anIntArray338[local138] != Static51.anIntArray143[local138]) {
						Static51.anIntArray143[local138] = Static146.anIntArray338[local138];
						Static121.method1953(local138);
						anIntArray295[Static8.anInt237++ & 0x1F] = local138;
					}
				}
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 57) {
				Static131.method2086();
				Static55.anInt1420 = -1;
				return true;
			}
			if (Static55.anInt1420 == 215) {
				Static111.anInt2519 = Static75.aClass2_Sub11_Sub1_1.method1461();
				Static55.anInt1420 = -1;
				return true;
			}
			Static165.method2525("T1 - " + Static55.anInt1420 + "," + Static75.anInt1785 + "," + Static160.anInt3398 + " - " + Static174.anInt3743, null);
			Static110.method1754();
		} catch (@Pc(4185) IOException local4185) {
			Static106.method1721();
		} catch (@Pc(4189) Exception local4189) {
			@Pc(4229) String local4229 = "T2 - " + Static55.anInt1420 + "," + Static75.anInt1785 + "," + Static160.anInt3398 + " - " + Static174.anInt3743 + "," + (Static137.anInt3049 + Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray365[0]) + "," + (Static119.aClass2_Sub1_Sub3_Sub2_Sub1_1.anIntArray366[0] + Static85.anInt1937) + " - ";
			for (local138 = 0; Static174.anInt3743 > local138 && local138 < 50; local138++) {
				local4229 = local4229 + Static75.aClass2_Sub11_Sub1_1.aByteArray24[local138] + ",";
			}
			Static165.method2525(local4229, local4189);
			Static110.method1754();
		}
		return true;
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(B)V")
	public static void method1933() {
		aClass10_1178 = null;
		aClass26_3 = null;
		anIntArray294 = null;
		aClass10_1177 = null;
		anIntArray295 = null;
		aClass12_10 = null;
		aClass10_1176 = null;
	}

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(B)V")
	public static void method1934() {
		@Pc(22) int local22;
		if (Static168.anInt3652 == 0) {
			Static180.aClass60_1 = new Class60(4, 104, 104, Static162.anIntArrayArrayArray8);
			for (local22 = 0; local22 < 4; local22++) {
				Static59.aClass27Array1[local22] = new Class27(104, 104);
			}
			Static128.aClass2_Sub1_Sub4_Sub2_34 = new Class2_Sub1_Sub4_Sub2(512, 512);
			Static168.anInt3652 = 20;
			Static95.aClass10_943 = Static149.aClass10_1416;
			Static30.anInt813 = 5;
			return;
		}
		@Pc(59) int local59;
		@Pc(69) int local69;
		@Pc(80) int local80;
		@Pc(73) int local73;
		if (Static168.anInt3652 == 20) {
			@Pc(57) int[] local57 = new int[9];
			for (local59 = 0; local59 < 9; local59++) {
				local69 = local59 * 32 + 128 + 15;
				local73 = Class2_Sub1_Sub4_Sub4.anIntArray299[local69];
				local80 = local69 * 3 + 600;
				local57[local59] = local80 * local73 >> 16;
			}
			Static113.method1781(local57);
			Static30.anInt813 = 10;
			Static168.anInt3652 = 30;
			Static95.aClass10_943 = Static19.aClass10_228;
		} else if (Static168.anInt3652 == 30) {
			Static117.aClass29_Sub1_39 = Static85.method1358(true, false, 0, true);
			Static20.aClass29_Sub1_13 = Static85.method1358(true, false, 1, true);
			Static58.aClass29_Sub1_24 = Static85.method1358(false, true, 2, true);
			Static14.aClass29_Sub1_10 = Static85.method1358(true, false, 3, true);
			Static102.aClass29_Sub1_50 = Static85.method1358(true, false, 4, true);
			Static76.aClass29_Sub1_27 = Static85.method1358(true, true, 5, true);
			Static170.aClass29_Sub1_51 = Static85.method1358(true, true, 6, false);
			Static56.aClass29_Sub1_23 = Static85.method1358(true, false, 7, true);
			Static26.aClass29_Sub1_17 = Static85.method1358(true, false, 8, true);
			Static1.aClass29_Sub1_1 = Static85.method1358(false, true, 9, true);
			Static101.aClass29_Sub1_34 = Static85.method1358(true, false, 10, true);
			Static115.aClass29_Sub1_37 = Static85.method1358(true, false, 11, true);
			Static7.aClass29_Sub1_7 = Static85.method1358(true, false, 12, true);
			Static162.aClass29_Sub1_48 = Static85.method1358(false, true, 13, true);
			Static148.aClass29_Sub1_46 = Static85.method1358(true, false, 14, false);
			Static8.aClass29_Sub1_8 = Static85.method1358(true, false, 15, true);
			Static95.aClass10_943 = Static10.aClass10_137;
			Static30.anInt813 = 20;
			Static168.anInt3652 = 40;
		} else if (Static168.anInt3652 == 40) {
			local22 = Static117.aClass29_Sub1_39.method1045() * 4 / 100;
			local22 += Static20.aClass29_Sub1_13.method1045() * 4 / 100;
			local22 += Static58.aClass29_Sub1_24.method1045() * 2 / 100;
			local22 += Static14.aClass29_Sub1_10.method1045() * 2 / 100;
			local22 += Static102.aClass29_Sub1_50.method1045() * 6 / 100;
			local22 += Static76.aClass29_Sub1_27.method1045() * 4 / 100;
			local22 += Static170.aClass29_Sub1_51.method1045() * 2 / 100;
			local22 += Static56.aClass29_Sub1_23.method1045() * 60 / 100;
			local22 += Static26.aClass29_Sub1_17.method1045() * 2 / 100;
			local22 += Static1.aClass29_Sub1_1.method1045() * 2 / 100;
			local22 += Static101.aClass29_Sub1_34.method1045() * 2 / 100;
			local22 += Static115.aClass29_Sub1_37.method1045() * 2 / 100;
			local22 += Static7.aClass29_Sub1_7.method1045() * 2 / 100;
			local22 += Static162.aClass29_Sub1_48.method1045() * 2 / 100;
			local22 += Static148.aClass29_Sub1_46.method1045() * 2 / 100;
			local22 += Static8.aClass29_Sub1_8.method1045() * 2 / 100;
			if (local22 == 100) {
				Static30.anInt813 = 30;
				Static95.aClass10_943 = Static39.aClass10_481;
				Static168.anInt3652 = 45;
			} else {
				if (local22 != 0) {
					Static95.aClass10_943 = Static3.method36(new Class10[] { Static89.aClass10_872, Static164.method2485(local22), Static30.aClass10_379 });
				}
				Static30.anInt813 = 30;
			}
		} else if (Static168.anInt3652 == 45) {
			Static151.method2299(!Static170.aBoolean163);
			@Pc(450) Class2_Sub5_Sub4 local450 = new Class2_Sub5_Sub4();
			local450.method2677();
			Static71.aClass82_2 = Static13.method219(Static57.aClass63_4, 0, Static25.aCanvas1, 22050);
			Static71.aClass82_2.method2644(local450);
			Static40.method791(Static8.aClass29_Sub1_8, Static102.aClass29_Sub1_50, local450, Static148.aClass29_Sub1_46);
			Static38.aClass82_1 = Static13.method219(Static57.aClass63_4, 1, Static25.aCanvas1, 2048);
			Static2.aClass2_Sub5_Sub3_1 = new Class2_Sub5_Sub3();
			Static38.aClass82_1.method2644(Static2.aClass2_Sub5_Sub3_1);
			Static52.aClass13_1 = new Class13(22050, Static45.anInt1131);
			Static30.anInt813 = 35;
			Static168.anInt3652 = 50;
			Static95.aClass10_943 = Static85.aClass10_848;
		} else if (Static168.anInt3652 == 50) {
			local22 = 0;
			if (Static176.aClass2_Sub1_Sub4_Sub1_Sub1_5 == null) {
				Static176.aClass2_Sub1_Sub4_Sub1_Sub1_5 = Static136.method2157(Static45.aClass10_518, Static26.aClass29_Sub1_17, Static63.aClass10_687, Static162.aClass29_Sub1_48);
			} else {
				local22++;
			}
			if (Static13.aClass2_Sub1_Sub4_Sub1_Sub1_2 == null) {
				Static13.aClass2_Sub1_Sub4_Sub1_Sub1_2 = Static136.method2157(Static114.aClass10_1106, Static26.aClass29_Sub1_17, Static63.aClass10_687, Static162.aClass29_Sub1_48);
			} else {
				local22++;
			}
			if (Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4 == null) {
				Static167.aClass2_Sub1_Sub4_Sub1_Sub1_4 = Static136.method2157(Static5.aClass10_73, Static26.aClass29_Sub1_17, Static63.aClass10_687, Static162.aClass29_Sub1_48);
			} else {
				local22++;
			}
			if (local22 < 3) {
				Static95.aClass10_943 = Static3.method36(new Class10[] { Static57.aClass10_631, Static164.method2485(local22 * 100 / 3), Static30.aClass10_379 });
				Static30.anInt813 = 40;
			} else {
				Static168.anInt3652 = 60;
				Static95.aClass10_943 = Static83.aClass10_835;
				Static30.anInt813 = 40;
			}
		} else if (Static168.anInt3652 == 60) {
			local22 = Static180.method2712(Static26.aClass29_Sub1_17, Static101.aClass29_Sub1_34);
			local59 = Static62.method1104();
			if (local59 > local22) {
				Static95.aClass10_943 = Static3.method36(new Class10[] { Static48.aClass10_529, Static164.method2485(local22 * 100 / local59), Static30.aClass10_379 });
				Static30.anInt813 = 50;
			} else {
				Static30.anInt813 = 50;
				Static95.aClass10_943 = Static46.aClass10_524;
				Static45.method870(5);
				Static168.anInt3652 = 70;
			}
		} else if (Static168.anInt3652 == 70) {
			if (Static58.aClass29_Sub1_24.method1019()) {
				Static157.method2402(Static58.aClass29_Sub1_24);
				Static104.method1688(Static58.aClass29_Sub1_24);
				Static24.method390(Static56.aClass29_Sub1_23, Static58.aClass29_Sub1_24);
				Static15.method242(Static58.aClass29_Sub1_24, Static170.aBoolean163, Static56.aClass29_Sub1_23);
				Static88.method1031(Static56.aClass29_Sub1_23, Static58.aClass29_Sub1_24);
				Static169.method2594(Static176.aClass2_Sub1_Sub4_Sub1_Sub1_5, Static56.aClass29_Sub1_23, Static165.aBoolean157, Static58.aClass29_Sub1_24);
				Static36.method762(Static58.aClass29_Sub1_24, Static117.aClass29_Sub1_39, Static20.aClass29_Sub1_13);
				Static13.method218(Static58.aClass29_Sub1_24, Static56.aClass29_Sub1_23);
				Static126.method2066(Static58.aClass29_Sub1_24);
				Static2.method29(Static58.aClass29_Sub1_24);
				Static52.method952(Static14.aClass29_Sub1_10, Static56.aClass29_Sub1_23, Static26.aClass29_Sub1_17, Static162.aClass29_Sub1_48);
				Static13.method220(Static58.aClass29_Sub1_24);
				Static117.method1901(Static58.aClass29_Sub1_24);
				Static168.anInt3652 = 80;
				Static30.anInt813 = 60;
				Static95.aClass10_943 = Static141.aClass10_1377;
			} else {
				Static95.aClass10_943 = Static3.method36(new Class10[] { Static21.aClass10_253, Static164.method2485(Static58.aClass29_Sub1_24.method1049()), Static30.aClass10_379 });
				Static30.anInt813 = 60;
			}
		} else if (Static168.anInt3652 == 80) {
			local22 = 0;
			if (Static61.aClass2_Sub1_Sub4_Sub2_43 == null) {
				Static61.aClass2_Sub1_Sub4_Sub2_43 = Static91.method1543(Static63.aClass10_687, Static26.aClass29_Sub1_17, Static156.aClass10_1458);
			} else {
				local22++;
			}
			if (Static151.aClass2_Sub1_Sub4_Sub2_38 == null) {
				Static151.aClass2_Sub1_Sub4_Sub2_38 = Static91.method1543(Static63.aClass10_687, Static26.aClass29_Sub1_17, Static28.aClass10_364);
			} else {
				local22++;
			}
			if (Static41.aClass2_Sub1_Sub4_Sub3Array10 == null) {
				Static41.aClass2_Sub1_Sub4_Sub3Array10 = Static41.method794(Static63.aClass10_687, Static26.aClass29_Sub1_17, Static45.aClass10_519);
			} else {
				local22++;
			}
			if (Static21.aClass2_Sub1_Sub4_Sub2Array2 == null) {
				Static21.aClass2_Sub1_Sub4_Sub2Array2 = Static87.method1499(Static91.aClass10_907, Static63.aClass10_687, Static26.aClass29_Sub1_17);
			} else {
				local22++;
			}
			if (Static177.aClass2_Sub1_Sub4_Sub2Array11 == null) {
				Static177.aClass2_Sub1_Sub4_Sub2Array11 = Static87.method1499(Static100.aClass10_1011, Static63.aClass10_687, Static26.aClass29_Sub1_17);
			} else {
				local22++;
			}
			if (Static158.aClass2_Sub1_Sub4_Sub2Array9 == null) {
				Static158.aClass2_Sub1_Sub4_Sub2Array9 = Static87.method1499(Static128.aClass10_1239, Static63.aClass10_687, Static26.aClass29_Sub1_17);
			} else {
				local22++;
			}
			if (Static44.aClass2_Sub1_Sub4_Sub2Array3 == null) {
				Static44.aClass2_Sub1_Sub4_Sub2Array3 = Static87.method1499(Static104.aClass10_1043, Static63.aClass10_687, Static26.aClass29_Sub1_17);
			} else {
				local22++;
			}
			if (Static8.aClass2_Sub1_Sub4_Sub2Array1 == null) {
				Static8.aClass2_Sub1_Sub4_Sub2Array1 = Static87.method1499(Static80.aClass10_809, Static63.aClass10_687, Static26.aClass29_Sub1_17);
			} else {
				local22++;
			}
			if (Static95.aClass2_Sub1_Sub4_Sub2Array7 == null) {
				Static95.aClass2_Sub1_Sub4_Sub2Array7 = Static87.method1499(Static21.aClass10_251, Static63.aClass10_687, Static26.aClass29_Sub1_17);
			} else {
				local22++;
			}
			if (Static45.aClass2_Sub1_Sub4_Sub2Array4 == null) {
				Static45.aClass2_Sub1_Sub4_Sub2Array4 = Static87.method1499(Static121.aClass10_1189, Static63.aClass10_687, Static26.aClass29_Sub1_17);
			} else {
				local22++;
			}
			if (Static96.aClass2_Sub1_Sub4_Sub2Array10 == null) {
				Static96.aClass2_Sub1_Sub4_Sub2Array10 = Static87.method1499(Static115.aClass10_1121, Static63.aClass10_687, Static26.aClass29_Sub1_17);
			} else {
				local22++;
			}
			if (Static137.aClass2_Sub1_Sub4_Sub3Array18 == null) {
				Static137.aClass2_Sub1_Sub4_Sub3Array18 = Static41.method794(Static63.aClass10_687, Static26.aClass29_Sub1_17, Static50.aClass10_558);
			} else {
				local22++;
			}
			if (Static10.aClass2_Sub1_Sub4_Sub3Array4 == null) {
				Static10.aClass2_Sub1_Sub4_Sub3Array4 = Static41.method794(Static63.aClass10_687, Static26.aClass29_Sub1_17, Static11.aClass10_1511);
			} else {
				local22++;
			}
			if (Static149.aClass2_Sub1_Sub4_Sub3_7 == null) {
				Static149.aClass2_Sub1_Sub4_Sub3_7 = Static2.method33(Static26.aClass29_Sub1_17, Static60.aClass10_663, Static63.aClass10_687);
			} else {
				local22++;
			}
			if (local22 < 14) {
				Static95.aClass10_943 = Static3.method36(new Class10[] { Static144.aClass10_1404, Static164.method2485(local22 * 100 / 14), Static30.aClass10_379 });
				Static30.anInt813 = 70;
			} else {
				Static35.aClass2_Sub1_Sub4_Sub3Array8 = Static10.aClass2_Sub1_Sub4_Sub3Array4;
				Static151.aClass2_Sub1_Sub4_Sub2_38.method718();
				local59 = (int) (Math.random() * 21.0D) - 10;
				local69 = (int) (Math.random() * 21.0D) - 10;
				local80 = (int) (Math.random() * 21.0D) - 10;
				local73 = (int) (Math.random() * 41.0D) - 20;
				for (@Pc(960) int local960 = 0; local960 < Static21.aClass2_Sub1_Sub4_Sub2Array2.length; local960++) {
					Static21.aClass2_Sub1_Sub4_Sub2Array2[local960].method730(local59 + local73, local73 + local69, local73 + local80);
				}
				Static41.aClass2_Sub1_Sub4_Sub3Array10[0].method1876(local59 + local73, local73 + local69, local80 + local73);
				Static73.method1242();
				Static168.anInt3652 = 90;
				Static30.anInt813 = 70;
				Static95.aClass10_943 = Static52.aClass10_570;
			}
		} else if (Static168.anInt3652 == 90) {
			if (Static1.aClass29_Sub1_1.method1019()) {
				@Pc(1048) Class7 local1048 = new Class7(Static1.aClass29_Sub1_1, Static26.aClass29_Sub1_17, 20, Static170.aBoolean163 ? 64 : 128);
				Static125.method2047(local1048);
				Static125.method2045(0.8F);
				Static95.aClass10_943 = Static10.aClass10_136;
				Static168.anInt3652 = 110;
				Static30.anInt813 = 90;
			} else {
				Static95.aClass10_943 = Static3.method36(new Class10[] { Static89.aClass10_873, Static164.method2485(Static1.aClass29_Sub1_1.method1049()), Static30.aClass10_379 });
				Static30.anInt813 = 90;
			}
		} else if (Static168.anInt3652 == 110) {
			Static14.aClass87_1 = new Class87();
			Static57.aClass63_4.method1956(Static14.aClass87_1, 10);
			Static95.aClass10_943 = Static77.aClass10_787;
			Static30.anInt813 = 94;
			Static168.anInt3652 = 120;
		} else if (Static168.anInt3652 == 120) {
			if (Static101.aClass29_Sub1_34.method1036(Static63.aClass10_687, Static98.aClass10_985)) {
				@Pc(1115) Class37 local1115 = new Class37(Static101.aClass29_Sub1_34.method1038(Static63.aClass10_687, Static98.aClass10_985));
				Static81.method1308(local1115);
				Static30.anInt813 = 96;
				Static168.anInt3652 = 130;
				Static95.aClass10_943 = Static59.aClass10_646;
			} else {
				Static95.aClass10_943 = Static3.method36(new Class10[] { Static86.aClass10_851, Static20.aClass10_243 });
				Static30.anInt813 = 96;
			}
		} else if (Static168.anInt3652 == 130) {
			if (!Static14.aClass29_Sub1_10.method1019()) {
				Static95.aClass10_943 = Static3.method36(new Class10[] { Static70.aClass10_725, Static164.method2485(Static14.aClass29_Sub1_10.method1049() * 4 / 5), Static30.aClass10_379 });
				Static30.anInt813 = 100;
			} else if (!Static7.aClass29_Sub1_7.method1019()) {
				Static95.aClass10_943 = Static3.method36(new Class10[] { Static70.aClass10_725, Static164.method2485(Static7.aClass29_Sub1_7.method1049() / 6 + 80), Static30.aClass10_379 });
				Static30.anInt813 = 100;
			} else if (Static162.aClass29_Sub1_48.method1019()) {
				Static30.anInt813 = 100;
				Static95.aClass10_943 = Static27.aClass10_345;
				Static168.anInt3652 = 140;
			} else {
				Static95.aClass10_943 = Static3.method36(new Class10[] { Static70.aClass10_725, Static164.method2485(Static162.aClass29_Sub1_48.method1049() / 20 + 96), Static30.aClass10_379 });
				Static30.anInt813 = 100;
			}
		} else if (Static168.anInt3652 == 140) {
			Static45.method870(10);
		}
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI[Lclient!fa;IIIII)V")
	public static void method1935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class23[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(18) Class23 local18 = arg2[local12];
			if (local18 != null && (!local18.aBoolean37 || local18.anInt1090 == 0 || local18.aBoolean40 || Static126.method2068(local18) != 0 || Static169.aClass23_13 == local18) && arg0 == local18.anInt1045 && (!local18.aBoolean37 || !Static86.method1370(local18))) {
				@Pc(56) int local56 = arg7 + local18.anInt1073;
				@Pc(61) int local61 = arg1 + local18.anInt1085;
				if (Static16.aClass23_1 == local18) {
					Static179.anInt3814 = local56;
					Static131.aBoolean131 = true;
					Static69.anInt1634 = local61;
				}
				@Pc(80) int local80;
				@Pc(82) int local82;
				@Pc(84) int local84;
				@Pc(78) int local78;
				@Pc(106) int local106;
				if (local18.anInt1090 == 2) {
					local78 = arg6;
					local80 = arg5;
					local82 = arg3;
					local84 = arg4;
				} else {
					@Pc(108) int local108;
					@Pc(94) int local94;
					if (local18.anInt1090 == 9) {
						local94 = local61;
						@Pc(100) int local100 = local56 + local18.anInt1089;
						local106 = local61 + local18.anInt1087;
						local108 = local56;
						if (local56 > local100) {
							local108 = local100;
							local100 = local56;
						}
						local100++;
						local80 = arg5 < local108 ? local108 : arg5;
						local84 = arg4 > local100 ? local100 : arg4;
						if (local61 > local106) {
							local94 = local106;
							local106 = local61;
						}
						local106++;
						local78 = arg6 > local106 ? local106 : arg6;
						local82 = local94 > arg3 ? local94 : arg3;
					} else {
						local82 = local61 <= arg3 ? arg3 : local61;
						local108 = local18.anInt1089 + local56;
						local80 = local56 <= arg5 ? arg5 : local56;
						local84 = local108 >= arg4 ? arg4 : local108;
						local94 = local18.anInt1087 + local61;
						local78 = arg6 > local94 ? local94 : arg6;
					}
				}
				if (!local18.aBoolean37 || local84 > local80 && local78 > local82) {
					if (local18.anInt1088 == 1337) {
						Static3.method34(local18);
					} else if (local18.anInt1088 == 1338) {
						Static171.method2645(local56, local61);
					} else {
						if (local18.anInt1090 == 0) {
							if (!local18.aBoolean37 && Static86.method1370(local18) && Static59.aClass23_4 != local18) {
								continue;
							}
							method1935(local18.anInt1057, local61 - local18.anInt1053, arg2, local82, local84, local80, local78, local56 - local18.anInt1071);
							if (local18.aClass23Array1 != null) {
								method1935(local18.anInt1057, local61 - local18.anInt1053, local18.aClass23Array1, local82, local84, local80, local78, local56 - local18.anInt1071);
							}
							@Pc(332) Class2_Sub15 local332 = (Class2_Sub15) Static30.aClass18_2.method683((long) local18.anInt1057);
							if (local332 != null) {
								Static107.method1726(local84, local80, local56, local332.anInt2387, local82, local61, local78);
							}
						}
						if (local18.aBoolean37) {
							@Pc(373) boolean local373;
							if (local80 <= Static72.anInt1723 && local82 <= Static61.anInt3635 && Static72.anInt1723 < local84 && local78 > Static61.anInt3635) {
								local373 = true;
							} else {
								local373 = false;
							}
							@Pc(379) boolean local379 = false;
							if (Static95.anInt2252 == 1 && local373) {
								local379 = true;
							}
							@Pc(388) boolean local388 = false;
							if (Static40.anInt976 == 1 && Static62.anInt1534 >= local80 && local82 <= Static40.anInt977 && local84 > Static62.anInt1534 && local78 > Static40.anInt977) {
								local388 = true;
							}
							if (local388) {
								Static22.method346(Static62.anInt1534 - local56, Static40.anInt977 + -local61, local18);
							}
							if (Static16.aClass23_1 != null && Static16.aClass23_1 != local18 && local373 && Static149.method2289(Static126.method2068(local18))) {
								Static60.aClass23_5 = local18;
							}
							if (Static169.aClass23_13 == local18) {
								Static142.aBoolean140 = true;
								Static135.anInt2991 = local56;
								Static87.anInt2091 = local61;
							}
							if (local18.aBoolean40) {
								@Pc(464) Class2_Sub18 local464;
								if (local373 && Static81.anInt1877 != 0 && local18.anObjectArray24 != null) {
									local464 = new Class2_Sub18();
									local464.anInt2887 = Static81.anInt1877;
									local464.anObjectArray29 = local18.anObjectArray24;
									local464.aClass23_9 = local18;
									Static21.aClass12_2.method382(local464);
								}
								if (Static16.aClass23_1 != null || Static169.aClass23_12 != null || Static119.aBoolean119) {
									local379 = false;
									local373 = false;
									local388 = false;
								}
								if (!local18.aBoolean48 && local388) {
									local18.aBoolean48 = true;
									if (local18.anObjectArray18 != null) {
										local464 = new Class2_Sub18();
										local464.anInt2889 = Static62.anInt1534 - local56;
										local464.anInt2887 = Static40.anInt977 - local61;
										local464.anObjectArray29 = local18.anObjectArray18;
										local464.aClass23_9 = local18;
										Static21.aClass12_2.method382(local464);
									}
								}
								if (local18.aBoolean48 && local379 && local18.anObjectArray15 != null) {
									local464 = new Class2_Sub18();
									local464.anInt2889 = Static72.anInt1723 - local56;
									local464.anObjectArray29 = local18.anObjectArray15;
									local464.aClass23_9 = local18;
									local464.anInt2887 = Static61.anInt3635 - local61;
									Static21.aClass12_2.method382(local464);
								}
								if (local18.aBoolean48 && !local379) {
									local18.aBoolean48 = false;
									if (local18.anObjectArray22 != null) {
										local464 = new Class2_Sub18();
										local464.anInt2889 = Static72.anInt1723 - local56;
										local464.aClass23_9 = local18;
										local464.anObjectArray29 = local18.anObjectArray22;
										local464.anInt2887 = Static61.anInt3635 - local61;
										aClass12_10.method382(local464);
									}
								}
								if (local379 && local18.anObjectArray4 != null) {
									local464 = new Class2_Sub18();
									local464.aClass23_9 = local18;
									local464.anInt2889 = Static72.anInt1723 - local56;
									local464.anInt2887 = Static61.anInt3635 - local61;
									local464.anObjectArray29 = local18.anObjectArray4;
									Static21.aClass12_2.method382(local464);
								}
								if (!local18.aBoolean43 && local373) {
									local18.aBoolean43 = true;
									if (local18.anObjectArray12 != null) {
										local464 = new Class2_Sub18();
										local464.anObjectArray29 = local18.anObjectArray12;
										local464.anInt2887 = Static61.anInt3635 - local61;
										local464.aClass23_9 = local18;
										local464.anInt2889 = Static72.anInt1723 - local56;
										Static21.aClass12_2.method382(local464);
									}
								}
								if (local18.aBoolean43 && local373 && local18.anObjectArray5 != null) {
									local464 = new Class2_Sub18();
									local464.anInt2889 = Static72.anInt1723 - local56;
									local464.anInt2887 = Static61.anInt3635 - local61;
									local464.anObjectArray29 = local18.anObjectArray5;
									local464.aClass23_9 = local18;
									Static21.aClass12_2.method382(local464);
								}
								if (local18.aBoolean43 && !local373) {
									local18.aBoolean43 = false;
									if (local18.anObjectArray16 != null) {
										local464 = new Class2_Sub18();
										local464.aClass23_9 = local18;
										local464.anObjectArray29 = local18.anObjectArray16;
										local464.anInt2887 = Static61.anInt3635 - local61;
										local464.anInt2889 = Static72.anInt1723 - local56;
										aClass12_10.method382(local464);
									}
								}
								if (local18.anObjectArray2 != null) {
									local464 = new Class2_Sub18();
									local464.aClass23_9 = local18;
									local464.anObjectArray29 = local18.anObjectArray2;
									Static59.aClass12_5.method382(local464);
								}
								@Pc(810) int local810;
								@Pc(812) int local812;
								@Pc(828) Class2_Sub18 local828;
								if (local18.anObjectArray19 != null && local18.anInt1042 < Static8.anInt237) {
									if (local18.anIntArray133 == null || Static8.anInt237 - local18.anInt1042 > 32) {
										local464 = new Class2_Sub18();
										local464.aClass23_9 = local18;
										local464.anObjectArray29 = local18.anObjectArray19;
										Static21.aClass12_2.method382(local464);
									} else {
										label374: for (local106 = local18.anInt1042; local106 < Static8.anInt237; local106++) {
											local810 = anIntArray295[local106 & 0x1F];
											for (local812 = 0; local812 < local18.anIntArray133.length; local812++) {
												if (local810 == local18.anIntArray133[local812]) {
													local828 = new Class2_Sub18();
													local828.anObjectArray29 = local18.anObjectArray19;
													local828.aClass23_9 = local18;
													Static21.aClass12_2.method382(local828);
													break label374;
												}
											}
										}
									}
									local18.anInt1042 = Static8.anInt237;
								}
								if (local18.anObjectArray14 != null && local18.anInt1086 < Static57.anInt1463) {
									if (local18.anIntArray129 == null || Static57.anInt1463 - local18.anInt1086 > 32) {
										local464 = new Class2_Sub18();
										local464.anObjectArray29 = local18.anObjectArray14;
										local464.aClass23_9 = local18;
										Static21.aClass12_2.method382(local464);
									} else {
										label354: for (local106 = local18.anInt1086; local106 < Static57.anInt1463; local106++) {
											local810 = Static154.anIntArray353[local106 & 0x1F];
											for (local812 = 0; local812 < local18.anIntArray129.length; local812++) {
												if (local810 == local18.anIntArray129[local812]) {
													local828 = new Class2_Sub18();
													local828.aClass23_9 = local18;
													local828.anObjectArray29 = local18.anObjectArray14;
													Static21.aClass12_2.method382(local828);
													break label354;
												}
											}
										}
									}
									local18.anInt1086 = Static57.anInt1463;
								}
								if (local18.anObjectArray9 != null && Static64.anInt1575 > local18.anInt1022) {
									if (local18.anIntArray130 == null || Static64.anInt1575 - local18.anInt1022 > 32) {
										local464 = new Class2_Sub18();
										local464.anObjectArray29 = local18.anObjectArray9;
										local464.aClass23_9 = local18;
										Static21.aClass12_2.method382(local464);
									} else {
										label334: for (local106 = local18.anInt1022; local106 < Static64.anInt1575; local106++) {
											local810 = Static111.anIntArray259[local106 & 0x1F];
											for (local812 = 0; local812 < local18.anIntArray130.length; local812++) {
												if (local18.anIntArray130[local812] == local810) {
													local828 = new Class2_Sub18();
													local828.anObjectArray29 = local18.anObjectArray9;
													local828.aClass23_9 = local18;
													Static21.aClass12_2.method382(local828);
													break label334;
												}
											}
										}
									}
									local18.anInt1022 = Static64.anInt1575;
								}
								if (Static72.anInt1720 > local18.anInt1047 && local18.anObjectArray7 != null) {
									local464 = new Class2_Sub18();
									local464.anObjectArray29 = local18.anObjectArray7;
									local464.aClass23_9 = local18;
									Static21.aClass12_2.method382(local464);
								}
								if (local18.anInt1047 < Static1.anInt5 && local18.anObjectArray11 != null) {
									local464 = new Class2_Sub18();
									local464.anObjectArray29 = local18.anObjectArray11;
									local464.aClass23_9 = local18;
									Static21.aClass12_2.method382(local464);
								}
								if (local18.anInt1047 < Static121.anInt2753 && local18.anObjectArray21 != null) {
									local464 = new Class2_Sub18();
									local464.anObjectArray29 = local18.anObjectArray21;
									local464.aClass23_9 = local18;
									Static21.aClass12_2.method382(local464);
								}
								if (local18.anInt1047 < Static119.anInt2711 && local18.anObjectArray17 != null) {
									local464 = new Class2_Sub18();
									local464.aClass23_9 = local18;
									local464.anObjectArray29 = local18.anObjectArray17;
									Static21.aClass12_2.method382(local464);
								}
								if (Static133.anInt2947 > local18.anInt1047 && local18.anObjectArray23 != null) {
									local464 = new Class2_Sub18();
									local464.aClass23_9 = local18;
									local464.anObjectArray29 = local18.anObjectArray23;
									Static21.aClass12_2.method382(local464);
								}
								local18.anInt1047 = Static12.anInt364;
								if (local18.anObjectArray10 != null) {
									for (local106 = 0; local106 < Static69.anInt1633; local106++) {
										@Pc(1188) Class2_Sub18 local1188 = new Class2_Sub18();
										local1188.aClass23_9 = local18;
										local1188.anInt2885 = Static58.anIntArray164[local106];
										local1188.anInt2888 = Static171.anIntArray402[local106];
										local1188.anObjectArray29 = local18.anObjectArray10;
										Static21.aClass12_2.method382(local1188);
									}
								}
							}
						}
						if (!local18.aBoolean37) {
							if (Static16.aClass23_1 != null || Static169.aClass23_12 != null || Static119.aBoolean119) {
								return;
							}
							if ((local18.anInt1068 >= 0 || local18.anInt1066 != 0) && Static72.anInt1723 >= local80 && local82 <= Static61.anInt3635 && local84 > Static72.anInt1723 && Static61.anInt3635 < local78) {
								if (local18.anInt1068 >= 0) {
									Static59.aClass23_4 = arg2[local18.anInt1068];
								} else {
									Static59.aClass23_4 = local18;
								}
							}
							if (local18.anInt1090 == 8 && Static72.anInt1723 >= local80 && local82 <= Static61.anInt3635 && local84 > Static72.anInt1723 && Static61.anInt3635 < local78) {
								Static175.aClass23_14 = local18;
							}
							if (local18.anInt1076 > local18.anInt1087) {
								Static76.method1264(Static61.anInt3635, local18, Static72.anInt1723, local18.anInt1076, local56 + local18.anInt1089, local61, local18.anInt1087);
							}
						}
					}
				}
			}
		}
	}
}
