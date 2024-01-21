import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
	public static int anInt382;

	@OriginalMember(owner = "client!ad", name = "D", descriptor = "Lclient!ca;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "I")
	public static int anInt404;

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
	public static int anInt405;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!ad", name = "A", descriptor = "I")
	public static int anInt402 = -1;

	@OriginalMember(owner = "client!ad", name = "B", descriptor = "Lclient!a;")
	public static Class1 aClass1_286 = Static94.method1596("Konfig geladen)3");

	@OriginalMember(owner = "client!ad", name = "C", descriptor = "I")
	public static int anInt403 = 0;

	@OriginalMember(owner = "client!ad", name = "I", descriptor = "Lclient!a;")
	private static Class1 aClass1_289 = Static94.method1596("Continue");

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!a;")
	public static Class1 aClass1_287 = aClass1_289;

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "[B")
	public static byte[] aByteArray3 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "Lclient!a;")
	public static Class1 aClass1_288 = Static94.method1596("(X");

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method196() {
		Static12.aFontMetrics5 = null;
		Static27.aFont1 = null;
		Static47.anImage3 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)Z")
	public static boolean method199() {
		if (Static50.aClass65_1 == null) {
			return false;
		}
		@Pc(431) int local431;
		try {
			@Pc(13) int local13 = Static50.aClass65_1.method1763();
			if (local13 == 0) {
				return false;
			}
			if (Static93.anInt2359 == -1) {
				Static50.aClass65_1.method1757(0, 1, Static13.aClass2_Sub3_Sub1_1.aByteArray7);
				Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
				local13--;
				Static93.anInt2359 = Static13.aClass2_Sub3_Sub1_1.method835();
				Static83.anInt2224 = Static45.anIntArray158[Static93.anInt2359];
			}
			if (Static83.anInt2224 == -1) {
				if (local13 <= 0) {
					return false;
				}
				Static50.aClass65_1.method1757(0, 1, Static13.aClass2_Sub3_Sub1_1.aByteArray7);
				Static83.anInt2224 = Static13.aClass2_Sub3_Sub1_1.aByteArray7[0] & 0xFF;
				local13--;
			}
			if (Static83.anInt2224 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static50.aClass65_1.method1757(0, 2, Static13.aClass2_Sub3_Sub1_1.aByteArray7);
				Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
				Static83.anInt2224 = Static13.aClass2_Sub3_Sub1_1.method792();
			}
			if (Static83.anInt2224 > local13) {
				return false;
			}
			Static13.aClass2_Sub3_Sub1_1.anInt1168 = 0;
			Static50.aClass65_1.method1757(0, Static83.anInt2224, Static13.aClass2_Sub3_Sub1_1.aByteArray7);
			Static82.anInt2147 = Static13.anInt654;
			Static63.anInt1885 = 0;
			Static13.anInt654 = Static1.anInt32;
			Static1.anInt32 = Static93.anInt2359;
			@Pc(127) long local127;
			if (Static93.anInt2359 == 71) {
				local127 = Static13.aClass2_Sub3_Sub1_1.method821();
				@Pc(133) Class1 local133 = Static89.method1568(Static13.aClass2_Sub3_Sub1_1).method4();
				Static73.method1372(6, local133, Static99.method1668(local127).method36());
				Static93.anInt2359 = -1;
				return true;
			}
			@Pc(157) int local157;
			@Pc(165) int local165;
			@Pc(266) int local266;
			@Pc(310) int local310;
			if (Static93.anInt2359 == 156) {
				local127 = Static13.aClass2_Sub3_Sub1_1.method821();
				local157 = Static13.aClass2_Sub3_Sub1_1.method792();
				@Pc(163) Class1 local163 = Static99.method1668(local127).method36();
				for (local165 = 0; local165 < Static51.anInt1703; local165++) {
					if (local127 == Static98.aLongArray6[local165]) {
						if (local157 != Static61.anIntArray197[local165]) {
							Static61.anIntArray197[local165] = local157;
							Static34.aBoolean60 = true;
							if (local157 > 0) {
								Static73.method1372(5, Static97.method1655(new Class1[] { local163, Static71.aClass1_2029 }), Static111.aClass1_2898);
							}
							if (local157 == 0) {
								Static73.method1372(5, Static97.method1655(new Class1[] { local163, Static52.aClass1_1771 }), Static111.aClass1_2898);
							}
						}
						local163 = null;
						break;
					}
				}
				@Pc(235) boolean local235 = false;
				if (local163 != null && Static51.anInt1703 < 200) {
					Static98.aLongArray6[Static51.anInt1703] = local127;
					Static100.aClass1Array25[Static51.anInt1703] = local163;
					Static61.anIntArray197[Static51.anInt1703] = local157;
					Static51.anInt1703++;
					Static34.aBoolean60 = true;
				}
				while (!local235) {
					local235 = true;
					for (local266 = 0; local266 < Static51.anInt1703 - 1; local266++) {
						if (Static61.anIntArray197[local266] != Static22.anInt921 && Static22.anInt921 == Static61.anIntArray197[local266 + 1] || Static61.anIntArray197[local266] == 0 && Static61.anIntArray197[local266 + 1] != 0) {
							local235 = false;
							local310 = Static61.anIntArray197[local266];
							Static61.anIntArray197[local266] = Static61.anIntArray197[local266 + 1];
							Static61.anIntArray197[local266 + 1] = local310;
							@Pc(328) Class1 local328 = Static100.aClass1Array25[local266];
							Static100.aClass1Array25[local266] = Static100.aClass1Array25[local266 + 1];
							Static100.aClass1Array25[local266 + 1] = local328;
							@Pc(346) long local346 = Static98.aLongArray6[local266];
							Static98.aLongArray6[local266] = Static98.aLongArray6[local266 + 1];
							Static98.aLongArray6[local266 + 1] = local346;
							Static34.aBoolean60 = true;
						}
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 233) {
				Static93.anInt2359 = -1;
				Static30.anInt1133 = 0;
				return true;
			}
			@Pc(394) int local394;
			if (Static93.anInt2359 == 7) {
				Static68.aBoolean105 = false;
				for (local394 = 0; local394 < 5; local394++) {
					Static18.aBooleanArray5[local394] = false;
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 23) {
				Static46.method1045(true);
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 222) {
				@Pc(427) byte local427 = Static13.aClass2_Sub3_Sub1_1.method815();
				local431 = Static13.aClass2_Sub3_Sub1_1.method784();
				Static7.anIntArray122[local431] = local427;
				if (local427 != Static94.anIntArray295[local431]) {
					Static94.anIntArray295[local431] = local427;
					Static40.method1085(local431);
					Static34.aBoolean60 = true;
					if (Static81.anInt2140 != -1) {
						Static87.aBoolean137 = true;
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			@Pc(487) Class2_Sub1_Sub14 local487;
			if (Static93.anInt2359 == 115) {
				@Pc(479) boolean local479 = Static13.aClass2_Sub3_Sub1_1.method791() == 1;
				local431 = Static13.aClass2_Sub3_Sub1_1.method793();
				local487 = Static113.method1526(local431);
				local487.aBoolean134 = local479;
				Static93.anInt2359 = -1;
				return true;
			}
			@Pc(542) int local542;
			@Pc(509) Class2_Sub1_Sub14 local509;
			@Pc(603) int local603;
			@Pc(548) Class2_Sub1_Sub14 local548;
			@Pc(540) Class2_Sub1_Sub14[] local540;
			if (Static93.anInt2359 == 12) {
				Static34.aBoolean60 = true;
				local394 = Static13.aClass2_Sub3_Sub1_1.method814();
				local509 = Static113.method1526(local394);
				if (local509.aBoolean121) {
					local540 = Static98.aClass2_Sub1_Sub14ArrayArray1[local394 >> 16];
					for (local542 = 0; local542 < local540.length; local542++) {
						local548 = local540[local542];
						if ((local548.anInt2174 & 0xFFFF) == (local509.anInt2194 & 0xFFFF) && local548.anInt2220 > 0) {
							local548.anInt2218 = 0;
							local548.anInt2206 = -1;
						}
					}
				} else {
					for (local157 = 0; local157 < local509.anIntArray276.length; local157++) {
						local509.anIntArray276[local157] = 0;
						local509.anIntArray281[local157] = 0;
					}
				}
				local157 = Static13.aClass2_Sub3_Sub1_1.method792();
				for (local542 = 0; local542 < local157; local542++) {
					local165 = Static13.aClass2_Sub3_Sub1_1.method799();
					if (local165 == 255) {
						local165 = Static13.aClass2_Sub3_Sub1_1.method814();
					}
					local603 = Static13.aClass2_Sub3_Sub1_1.method784();
					if (local509.aBoolean121) {
						@Pc(629) Class2_Sub1_Sub14[] local629 = Static98.aClass2_Sub1_Sub14ArrayArray1[local394 >> 16];
						for (local310 = 0; local310 < local629.length; local310++) {
							@Pc(637) Class2_Sub1_Sub14 local637 = local629[local310];
							if ((local509.anInt2194 & 0xFFFF) == (local637.anInt2174 & 0xFFFF) && local637.anInt2220 == local542 + 1) {
								local637.anInt2218 = local165;
								local637.anInt2206 = local603 - 1;
							}
						}
					} else if (local509.anIntArray276.length > local542) {
						local509.anIntArray276[local542] = local603;
						local509.anIntArray281[local542] = local165;
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 250) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method813();
				local431 = Static13.aClass2_Sub3_Sub1_1.method793();
				local487 = Static113.method1526(local431);
				local487.anInt2189 = local394;
				local487.anInt2193 = 1;
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 255) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method791();
				local431 = Static13.aClass2_Sub3_Sub1_1.method791();
				local157 = Static13.aClass2_Sub3_Sub1_1.method791();
				local542 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static18.aBooleanArray5[local394] = true;
				Static12.anIntArray335[local394] = local431;
				Static55.anIntArray85[local394] = local157;
				Static94.anIntArray294[local394] = local542;
				Static33.anIntArray124[local394] = 0;
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 235) {
				Static54.anInt1771 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 48) {
				Static50.anInt1642 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static93.anInt2359 = -1;
				return true;
			}
			@Pc(826) long local826;
			@Pc(822) Class1 local822;
			@Pc(791) Class1 local791;
			if (Static93.anInt2359 == 82) {
				local791 = Static13.aClass2_Sub3_Sub1_1.method787();
				@Pc(828) boolean local828;
				if (local791.method38(Static42.aClass1_1431)) {
					local822 = local791.method19(0, local791.method11(Static72.aClass1_2045));
					local826 = local822.method9();
					local828 = false;
					for (local603 = 0; local603 < Static71.anInt1968; local603++) {
						if (Static88.aLongArray5[local603] == local826) {
							local828 = true;
							break;
						}
					}
					if (!local828 && Static6.anInt407 == 0) {
						Static73.method1372(4, Static6.aClass1_292, local822);
					}
				} else if (local791.method38(Static41.aClass1_1373)) {
					local822 = local791.method19(0, local791.method11(Static72.aClass1_2045));
					local826 = local822.method9();
					local828 = false;
					for (local603 = 0; local603 < Static71.anInt1968; local603++) {
						if (Static88.aLongArray5[local603] == local826) {
							local828 = true;
							break;
						}
					}
					if (!local828 && Static6.anInt407 == 0) {
						Static73.method1372(8, Static102.aClass1_2691, local822);
					}
				} else if (local791.method38(Static69.aClass1_2928)) {
					local822 = local791.method19(0, local791.method11(Static72.aClass1_2045));
					local826 = local822.method9();
					local828 = false;
					for (local603 = 0; local603 < Static71.anInt1968; local603++) {
						if (local826 == Static88.aLongArray5[local603]) {
							local828 = true;
							break;
						}
					}
					if (!local828 && Static6.anInt407 == 0) {
						@Pc(868) Class1 local868 = local791.method19(local791.method11(Static72.aClass1_2045) + 1, local791.method10() + -9);
						Static73.method1372(8, local868, local822);
					}
				} else {
					Static73.method1372(0, local791, Static111.aClass1_2898);
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 182) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method792();
				local431 = Static13.aClass2_Sub3_Sub1_1.method808();
				local487 = Static113.method1526(local431);
				Static93.anInt2359 = -1;
				if (local487 != null && local487.anInt2192 == 0) {
					if (local394 < 0) {
						local394 = 0;
					}
					if (local487.anInt2208 - local487.anInt2171 < local394) {
						local394 = local487.anInt2208 - local487.anInt2171;
					}
					local487.anInt2215 = local394;
				}
				return true;
			}
			if (Static93.anInt2359 == 174) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method793();
				local509 = Static113.method1526(local394);
				if (local509.aBoolean121) {
					local540 = Static98.aClass2_Sub1_Sub14ArrayArray1[local394 >> 16];
					for (local542 = 0; local542 < local540.length; local542++) {
						local548 = local540[local542];
						if ((local548.anInt2174 & 0xFFFF) == (local509.anInt2194 & 0xFFFF) && local548.anInt2220 > 0) {
							local548.anInt2206 = -1;
							local548.anInt2218 = 0;
						}
					}
				} else {
					for (local157 = 0; local157 < local509.anIntArray276.length; local157++) {
						local509.anIntArray276[local157] = -1;
						local509.anIntArray276[local157] = 0;
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 130) {
				Static62.anInt1879 = Static13.aClass2_Sub3_Sub1_1.method813();
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 129) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method794();
				local431 = Static13.aClass2_Sub3_Sub1_1.method799();
				local157 = Static13.aClass2_Sub3_Sub1_1.method794();
				Static2.anInt287 = local394 >> 1;
				Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.method1786(local157, (local394 & 0x1) == 1, local431);
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 181) {
				Static81.method1495();
				Static93.anInt2359 = -1;
				return false;
			}
			if (Static93.anInt2359 == 24) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method786();
				local431 = Static13.aClass2_Sub3_Sub1_1.method814();
				local487 = Static113.method1526(local431);
				if (local487.anInt2182 != local394 || local394 == -1) {
					local487.anInt2183 = 0;
					local487.anInt2179 = 0;
					local487.anInt2182 = local394;
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 56) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method783();
				if (local394 >= 0) {
					Static71.method1360(local394);
				}
				if (Static94.anInt2377 != local394) {
					Static90.method1570(Static94.anInt2377);
					Static94.anInt2377 = local394;
				}
				Static93.anInt2359 = -1;
				return true;
			}
			@Pc(1274) Class2_Sub1_Sub14 local1274;
			if (Static93.anInt2359 == 117) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method792();
				local431 = Static13.aClass2_Sub3_Sub1_1.method827();
				local157 = Static13.aClass2_Sub3_Sub1_1.method808();
				local1274 = Static113.method1526(local157);
				Static93.anInt2359 = -1;
				local1274.anInt2210 = local431 + (local394 << 16);
				return true;
			}
			if (Static93.anInt2359 == 84) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method792();
				local431 = Static13.aClass2_Sub3_Sub1_1.method827();
				if (Static72.anInt1978 != -1) {
					Static90.method1570(Static72.anInt1978);
					Static87.aBoolean137 = true;
					Static72.anInt1978 = -1;
				}
				if (Static37.anInt1369 != -1) {
					Static90.method1570(Static37.anInt1369);
					Static37.anInt1369 = -1;
					Static29.method759(30);
				}
				if (Static64.anInt1914 != -1) {
					Static90.method1570(Static64.anInt1914);
					Static64.anInt1914 = -1;
				}
				if (Static111.anInt2784 != local431) {
					Static90.method1570(Static111.anInt2784);
					Static111.anInt2784 = local431;
				}
				if (local394 != Static56.anInt1778) {
					Static90.method1570(Static56.anInt1778);
					Static56.anInt1778 = local394;
				}
				Static101.anInt2594 = -1;
				if (Static95.anInt2396 != 0) {
					Static87.aBoolean137 = true;
					Static95.anInt2396 = 0;
				}
				Static34.aBoolean60 = true;
				Static79.aBoolean115 = true;
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 64) {
				Static29.anInt1085 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static50.anInt1643 = Static13.aClass2_Sub3_Sub1_1.method799();
				for (local394 = Static50.anInt1643; local394 < Static50.anInt1643 + 8; local394++) {
					for (local431 = Static29.anInt1085; local431 < Static29.anInt1085 + 8; local431++) {
						if (Static15.aClass46ArrayArrayArray1[Static2.anInt287][local394][local431] != null) {
							Static15.aClass46ArrayArrayArray1[Static2.anInt287][local394][local431] = null;
							Static106.method1756(local431, local394);
						}
					}
				}
				for (@Pc(1427) Class2_Sub5 local1427 = (Class2_Sub5) Static76.aClass46_7.method1435(); local1427 != null; local1427 = (Class2_Sub5) Static76.aClass46_7.method1442()) {
					if (local1427.anInt914 >= Static50.anInt1643 && Static50.anInt1643 + 8 > local1427.anInt914 && local1427.anInt913 >= Static29.anInt1085 && Static29.anInt1085 + 8 > local1427.anInt913 && Static2.anInt287 == local1427.anInt897) {
						local1427.anInt907 = 0;
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 223) {
				local791 = Static13.aClass2_Sub3_Sub1_1.method787();
				local431 = Static13.aClass2_Sub3_Sub1_1.method803();
				local157 = Static13.aClass2_Sub3_Sub1_1.method791();
				if (local157 >= 1 && local157 <= 5) {
					if (local791.method14(Static55.aClass1_670)) {
						local791 = null;
					}
					Static17.aClass1Array8[local157 - 1] = local791;
					Static22.aBooleanArray9[local157 - 1] = local431 == 0;
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 118) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method792();
				Static71.method1360(local394);
				if (Static56.anInt1778 != -1) {
					Static90.method1570(Static56.anInt1778);
					Static79.aBoolean115 = true;
					Static56.anInt1778 = -1;
					Static34.aBoolean60 = true;
				}
				if (Static72.anInt1978 != -1) {
					Static90.method1570(Static72.anInt1978);
					Static87.aBoolean137 = true;
					Static72.anInt1978 = -1;
				}
				if (Static37.anInt1369 != -1) {
					Static90.method1570(Static37.anInt1369);
					Static37.anInt1369 = -1;
					Static29.method759(30);
				}
				if (Static64.anInt1914 != -1) {
					Static90.method1570(Static64.anInt1914);
					Static64.anInt1914 = -1;
				}
				if (local394 != Static111.anInt2784) {
					Static90.method1570(Static111.anInt2784);
					Static111.anInt2784 = local394;
				}
				Static101.anInt2594 = -1;
				if (Static95.anInt2396 != 0) {
					Static87.aBoolean137 = true;
					Static95.anInt2396 = 0;
				}
				Static108.method1761(Static111.anInt2784);
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 18) {
				if (Static8.anInt514 == 12) {
					Static34.aBoolean60 = true;
				}
				Static100.anInt2544 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 253) {
				Static68.aBoolean105 = true;
				Static40.anInt1615 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static59.anInt1823 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static8.anInt506 = Static13.aClass2_Sub3_Sub1_1.method792();
				Static6.anInt412 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static98.anInt2513 = Static13.aClass2_Sub3_Sub1_1.method791();
				if (Static98.anInt2513 >= 100) {
					Static41.anInt1396 = Static59.anInt1823 * 128 + 64;
					Static21.anInt916 = Static40.anInt1615 * 128 + 64;
					Static59.anInt1824 = Static65.method1338(Static2.anInt287, Static21.anInt916, Static41.anInt1396) - Static8.anInt506;
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 185) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method783();
				if (Static81.anInt2140 != local394) {
					Static90.method1570(Static81.anInt2140);
					Static81.anInt2140 = local394;
				}
				Static93.anInt2359 = -1;
				Static87.aBoolean137 = true;
				return true;
			}
			if (Static93.anInt2359 == 195) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method784();
				local431 = Static13.aClass2_Sub3_Sub1_1.method792();
				Static71.method1360(local431);
				if (local394 != -1) {
					Static71.method1360(local394);
				}
				if (Static111.anInt2784 != -1) {
					Static90.method1570(Static111.anInt2784);
					Static111.anInt2784 = -1;
				}
				if (Static56.anInt1778 != -1) {
					Static90.method1570(Static56.anInt1778);
					Static56.anInt1778 = -1;
				}
				if (Static72.anInt1978 != -1) {
					Static90.method1570(Static72.anInt1978);
					Static72.anInt1978 = -1;
				}
				if (Static37.anInt1369 != local431) {
					Static90.method1570(Static37.anInt1369);
					Static37.anInt1369 = local431;
					Static29.method759(35);
				}
				if (local431 != Static64.anInt1914) {
					Static90.method1570(Static64.anInt1914);
					Static64.anInt1914 = local394;
				}
				Static101.anInt2594 = -1;
				Static95.anInt2396 = 0;
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 180) {
				if (Static56.anInt1778 != -1) {
					Static90.method1570(Static56.anInt1778);
					Static34.aBoolean60 = true;
					Static79.aBoolean115 = true;
					Static56.anInt1778 = -1;
				}
				if (Static72.anInt1978 != -1) {
					Static90.method1570(Static72.anInt1978);
					Static87.aBoolean137 = true;
					Static72.anInt1978 = -1;
				}
				if (Static37.anInt1369 != -1) {
					Static90.method1570(Static37.anInt1369);
					Static37.anInt1369 = -1;
					Static29.method759(30);
				}
				if (Static64.anInt1914 != -1) {
					Static90.method1570(Static64.anInt1914);
					Static64.anInt1914 = -1;
				}
				if (Static111.anInt2784 != -1) {
					Static90.method1570(Static111.anInt2784);
					Static111.anInt2784 = -1;
				}
				Static93.anInt2359 = -1;
				Static101.anInt2594 = -1;
				if (Static95.anInt2396 != 0) {
					Static87.aBoolean137 = true;
					Static95.anInt2396 = 0;
				}
				return true;
			}
			if (Static93.anInt2359 == 208) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method784();
				Static71.method1360(local394);
				if (Static56.anInt1778 != -1) {
					Static90.method1570(Static56.anInt1778);
					Static79.aBoolean115 = true;
					Static56.anInt1778 = -1;
					Static34.aBoolean60 = true;
				}
				if (Static37.anInt1369 != -1) {
					Static90.method1570(Static37.anInt1369);
					Static37.anInt1369 = -1;
					Static29.method759(30);
				}
				if (Static64.anInt1914 != -1) {
					Static90.method1570(Static64.anInt1914);
					Static64.anInt1914 = -1;
				}
				if (Static111.anInt2784 != -1) {
					Static90.method1570(Static111.anInt2784);
					Static111.anInt2784 = -1;
				}
				if (Static72.anInt1978 != local394) {
					Static90.method1570(Static72.anInt1978);
					Static72.anInt1978 = local394;
				}
				Static87.aBoolean137 = true;
				Static93.anInt2359 = -1;
				Static101.anInt2594 = -1;
				return true;
			}
			if (Static93.anInt2359 == 217) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method813();
				if (local394 == 65535) {
					local394 = -1;
				}
				Static85.method1539(local394);
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 40) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method811();
				local431 = Static13.aClass2_Sub3_Sub1_1.method784();
				if (local431 == 65535) {
					local431 = -1;
				}
				Static93.method1593(local394, local431);
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 254) {
				Static29.anInt1085 = Static13.aClass2_Sub3_Sub1_1.method803();
				Static50.anInt1643 = Static13.aClass2_Sub3_Sub1_1.method794();
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 88) {
				Static85.anInt2264 = Static13.aClass2_Sub3_Sub1_1.method799();
				if (Static8.anInt514 == Static85.anInt2264) {
					if (Static85.anInt2264 == 3) {
						Static8.anInt514 = 1;
					} else {
						Static8.anInt514 = 3;
					}
					Static34.aBoolean60 = true;
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 63) {
				Static50.anInt1643 = Static13.aClass2_Sub3_Sub1_1.method794();
				Static29.anInt1085 = Static13.aClass2_Sub3_Sub1_1.method803();
				while (Static13.aClass2_Sub3_Sub1_1.anInt1168 < Static83.anInt2224) {
					Static93.anInt2359 = Static13.aClass2_Sub3_Sub1_1.method791();
					Static88.method1561();
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 196) {
				Static63.anInt1889 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static6.anInt409 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static96.anInt2420 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static87.aBoolean137 = true;
				Static13.aBoolean20 = true;
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 116) {
				Static95.anInt2397 = Static13.aClass2_Sub3_Sub1_1.method813() * 30;
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 92) {
				Static54.method1220();
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 2) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method793();
				local431 = Static13.aClass2_Sub3_Sub1_1.method792();
				Static7.anIntArray122[local431] = local394;
				if (local394 != Static94.anIntArray295[local431]) {
					Static94.anIntArray295[local431] = local394;
					Static40.method1085(local431);
					if (Static81.anInt2140 != -1) {
						Static87.aBoolean137 = true;
					}
					Static34.aBoolean60 = true;
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 128) {
				Static48.method1067();
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 131) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method792();
				local431 = Static13.aClass2_Sub3_Sub1_1.method791();
				local157 = Static13.aClass2_Sub3_Sub1_1.method792();
				Static88.method1562(local394, local431, local157);
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 237) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method792();
				Static71.method1360(local394);
				if (Static72.anInt1978 != -1) {
					Static90.method1570(Static72.anInt1978);
					Static72.anInt1978 = -1;
					Static87.aBoolean137 = true;
				}
				if (Static37.anInt1369 != -1) {
					Static90.method1570(Static37.anInt1369);
					Static37.anInt1369 = -1;
					Static29.method759(30);
				}
				if (Static64.anInt1914 != -1) {
					Static90.method1570(Static64.anInt1914);
					Static64.anInt1914 = -1;
				}
				if (Static111.anInt2784 != -1) {
					Static90.method1570(Static111.anInt2784);
					Static111.anInt2784 = -1;
				}
				if (local394 != Static56.anInt1778) {
					Static90.method1570(Static56.anInt1778);
					Static56.anInt1778 = local394;
				}
				Static79.aBoolean115 = true;
				if (Static95.anInt2396 != 0) {
					Static87.aBoolean137 = true;
					Static95.anInt2396 = 0;
				}
				Static101.anInt2594 = -1;
				Static93.anInt2359 = -1;
				Static34.aBoolean60 = true;
				return true;
			}
			if (Static93.anInt2359 == 234) {
				Static68.aBoolean105 = true;
				Static43.anInt1455 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static64.anInt1923 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static66.anInt2356 = Static13.aClass2_Sub3_Sub1_1.method792();
				Static99.anInt2524 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static33.anInt1257 = Static13.aClass2_Sub3_Sub1_1.method791();
				if (Static33.anInt1257 >= 100) {
					local394 = Static43.anInt1455 * 128 + 64;
					local431 = Static64.anInt1923 * 128 + 64;
					local157 = Static65.method1338(Static2.anInt287, local394, local431) - Static66.anInt2356;
					local542 = local394 - Static21.anInt916;
					local603 = local431 - Static41.anInt1396;
					local165 = local157 - Static59.anInt1824;
					local266 = (int) Math.sqrt((double) (local603 * local603 + local542 * local542));
					Static47.anInt1561 = (int) (Math.atan2((double) local165, (double) local266) * 325.949D) & 0x7FF;
					Static4.anInt376 = (int) (Math.atan2((double) local542, (double) local603) * -325.949D) & 0x7FF;
					if (Static47.anInt1561 < 128) {
						Static47.anInt1561 = 128;
					}
					if (Static47.anInt1561 > 383) {
						Static47.anInt1561 = 383;
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 142) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method792();
				local431 = Static13.aClass2_Sub3_Sub1_1.method813();
				local157 = Static13.aClass2_Sub3_Sub1_1.method792();
				local542 = Static13.aClass2_Sub3_Sub1_1.method808();
				local548 = Static113.method1526(local542);
				Static93.anInt2359 = -1;
				local548.anInt2181 = local394;
				local548.anInt2214 = local431;
				local548.anInt2195 = local157;
				return true;
			}
			if (Static93.anInt2359 == 6) {
				Static8.anInt514 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static79.aBoolean115 = true;
				Static34.aBoolean60 = true;
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 171) {
				if (Static8.anInt514 == 12) {
					Static34.aBoolean60 = true;
				}
				Static87.anInt2292 = Static13.aClass2_Sub3_Sub1_1.method786();
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 9 || Static93.anInt2359 == 99 || Static93.anInt2359 == 229 || Static93.anInt2359 == 19 || Static93.anInt2359 == 202 || Static93.anInt2359 == 1 || Static93.anInt2359 == 74 || Static93.anInt2359 == 175 || Static93.anInt2359 == 49 || Static93.anInt2359 == 143 || Static93.anInt2359 == 241) {
				Static88.method1561();
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 14) {
				for (local394 = 0; local394 < Static98.anInt2511; local394++) {
					@Pc(2475) Class2_Sub1_Sub13 local2475 = Static109.method1790(local394);
					if (local2475 != null && local2475.anInt2131 == 0) {
						Static7.anIntArray122[local394] = 0;
						Static94.anIntArray295[local394] = 0;
					}
				}
				if (Static81.anInt2140 != -1) {
					Static87.aBoolean137 = true;
				}
				Static34.aBoolean60 = true;
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 160) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method813();
				local431 = Static13.aClass2_Sub3_Sub1_1.method808();
				local487 = Static113.method1526(local431);
				local487.anInt2193 = 2;
				Static93.anInt2359 = -1;
				local487.anInt2189 = local394;
				return true;
			}
			if (Static93.anInt2359 == 132) {
				if (Static72.anInt1978 != -1) {
					Static90.method1570(Static72.anInt1978);
					Static72.anInt1978 = -1;
				}
				Static93.anInt2359 = -1;
				Static111.aClass1_2886 = Static111.aClass1_2898;
				Static95.anInt2396 = 1;
				Static87.aBoolean137 = true;
				Static32.aBoolean54 = false;
				return true;
			}
			if (Static93.anInt2359 == 186) {
				Static2.anInt299 = Static13.aClass2_Sub3_Sub1_1.method791();
				if (Static2.anInt299 == 1) {
					Static111.anInt2779 = Static13.aClass2_Sub3_Sub1_1.method792();
				}
				if (Static2.anInt299 >= 2 && Static2.anInt299 <= 6) {
					if (Static2.anInt299 == 2) {
						Static63.anInt1887 = 64;
						Static84.anInt2249 = 64;
					}
					if (Static2.anInt299 == 3) {
						Static63.anInt1887 = 64;
						Static84.anInt2249 = 0;
					}
					if (Static2.anInt299 == 4) {
						Static63.anInt1887 = 64;
						Static84.anInt2249 = 128;
					}
					if (Static2.anInt299 == 5) {
						Static84.anInt2249 = 64;
						Static63.anInt1887 = 0;
					}
					if (Static2.anInt299 == 6) {
						Static84.anInt2249 = 64;
						Static63.anInt1887 = 128;
					}
					Static2.anInt299 = 2;
					Static113.anInt2243 = Static13.aClass2_Sub3_Sub1_1.method792();
					Static6.anInt406 = Static13.aClass2_Sub3_Sub1_1.method792();
					Static37.anInt1350 = Static13.aClass2_Sub3_Sub1_1.method791();
				}
				if (Static2.anInt299 == 10) {
					Static113.anInt2237 = Static13.aClass2_Sub3_Sub1_1.method792();
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 210) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method808();
				local509 = Static113.method1526(local394);
				local509.anInt2193 = 3;
				local509.anInt2189 = Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.aClass33_1.method1240();
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 110) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method808();
				local822 = Static13.aClass2_Sub3_Sub1_1.method787();
				local487 = Static113.method1526(local394);
				local487.aClass1_2333 = local822;
				if (Static80.anIntArray274[Static8.anInt514] == local394 >> 16) {
					Static34.aBoolean60 = true;
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 70) {
				Static21.anInt915 = Static13.aClass2_Sub3_Sub1_1.method791();
				Static34.aBoolean60 = true;
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 120) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method792();
				local431 = Static13.aClass2_Sub3_Sub1_1.method813();
				local157 = Static13.aClass2_Sub3_Sub1_1.method808();
				if (local431 == 65535) {
					local431 = -1;
				}
				local1274 = Static113.method1526(local157);
				if (local1274.aBoolean121) {
					local1274.anInt2218 = 1;
					local1274.anInt2206 = local431;
				} else if (local431 == -1) {
					Static93.anInt2359 = -1;
					local1274.anInt2193 = 0;
					return true;
				} else {
					@Pc(2759) Class2_Sub1_Sub17 local2759 = Static73.method1374(local431);
					local1274.anInt2195 = local2759.anInt2460;
					local1274.anInt2189 = local431;
					local1274.anInt2193 = 4;
					local1274.anInt2214 = local2759.anInt2435 * 100 / local394;
					local1274.anInt2181 = local2759.anInt2448;
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 51) {
				local127 = Static13.aClass2_Sub3_Sub1_1.method821();
				local826 = Static13.aClass2_Sub3_Sub1_1.method792();
				@Pc(2810) long local2810 = (long) Static13.aClass2_Sub3_Sub1_1.method811();
				local266 = Static13.aClass2_Sub3_Sub1_1.method791();
				@Pc(2816) boolean local2816 = false;
				@Pc(2823) long local2823 = (local826 << 32) + local2810;
				for (@Pc(2825) int local2825 = 0; local2825 < 100; local2825++) {
					if (local2823 == Static86.aLongArray4[local2825]) {
						local2816 = true;
						break;
					}
				}
				if (local266 <= 1) {
					for (@Pc(2846) int local2846 = 0; local2846 < Static71.anInt1968; local2846++) {
						if (local127 == Static88.aLongArray5[local2846]) {
							local2816 = true;
							break;
						}
					}
				}
				if (!local2816 && Static6.anInt407 == 0) {
					Static86.aLongArray4[Static20.anInt899] = local2823;
					Static20.anInt899 = (Static20.anInt899 + 1) % 100;
					@Pc(2889) Class1 local2889 = Static89.method1568(Static13.aClass2_Sub3_Sub1_1).method4();
					if (local266 == 2 || local266 == 3) {
						Static73.method1372(7, local2889, Static97.method1655(new Class1[] { Static83.aClass1_2344, Static99.method1668(local127).method36() }));
					} else if (local266 == 1) {
						Static73.method1372(7, local2889, Static97.method1655(new Class1[] { Static85.aClass1_2374, Static99.method1668(local127).method36() }));
					} else {
						Static73.method1372(3, local2889, Static99.method1668(local127).method36());
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 27) {
				for (local394 = 0; local394 < Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3.length; local394++) {
					if (Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local394] != null) {
						Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local394].anInt2759 = -1;
					}
				}
				for (local431 = 0; local431 < Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1.length; local431++) {
					if (Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local431] != null) {
						Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local431].anInt2759 = -1;
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 140) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method792();
				local431 = Static13.aClass2_Sub3_Sub1_1.method791();
				if (local394 == 65535) {
					local394 = -1;
				}
				if (local394 != Static80.anIntArray274[local431]) {
					Static90.method1570(Static80.anIntArray274[local431]);
					Static80.anIntArray274[local431] = local394;
				}
				Static79.aBoolean115 = true;
				Static93.anInt2359 = -1;
				Static34.aBoolean60 = true;
				return true;
			}
			if (Static93.anInt2359 == 34) {
				Static34.aBoolean60 = true;
				local394 = Static13.aClass2_Sub3_Sub1_1.method799();
				local431 = Static13.aClass2_Sub3_Sub1_1.method791();
				local157 = Static13.aClass2_Sub3_Sub1_1.method793();
				Static51.anIntArray173[local431] = local157;
				Static22.anIntArray91[local431] = local394;
				Static15.anIntArray68[local431] = 1;
				for (local542 = 0; local542 < 98; local542++) {
					if (Class29_Sub1.anIntArray178[local542] <= local157) {
						Static15.anIntArray68[local431] = local542 + 2;
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 3) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method814();
				local431 = Static13.aClass2_Sub3_Sub1_1.method807();
				local157 = Static13.aClass2_Sub3_Sub1_1.method807();
				local1274 = Static113.method1526(local394);
				local1274.anInt2180 = local1274.anInt2175 + local157;
				Static93.anInt2359 = -1;
				local1274.anInt2197 = local1274.anInt2225 + local431;
				return true;
			}
			if (Static93.anInt2359 == 72) {
				for (local394 = 0; local394 < Static94.anIntArray295.length; local394++) {
					if (Static7.anIntArray122[local394] != Static94.anIntArray295[local394]) {
						Static94.anIntArray295[local394] = Static7.anIntArray122[local394];
						Static40.method1085(local394);
						Static34.aBoolean60 = true;
					}
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 240) {
				Static37.method942(Static34.aClass34_4, Static13.aClass2_Sub3_Sub1_1, Static83.anInt2224);
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 58) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method830();
				Static21.aClass18_3 = Static34.aClass34_4.method1261(local394);
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 214) {
				Static34.aBoolean60 = true;
				local394 = Static13.aClass2_Sub3_Sub1_1.method814();
				local509 = Static113.method1526(local394);
				while (true) {
					while (Static83.anInt2224 > Static13.aClass2_Sub3_Sub1_1.anInt1168) {
						local157 = Static13.aClass2_Sub3_Sub1_1.method825();
						local542 = Static13.aClass2_Sub3_Sub1_1.method792();
						local165 = 0;
						if (local542 != 0) {
							local165 = Static13.aClass2_Sub3_Sub1_1.method791();
							if (local165 == 255) {
								local165 = Static13.aClass2_Sub3_Sub1_1.method814();
							}
						}
						if (local509.aBoolean121) {
							@Pc(3290) Class2_Sub1_Sub14[] local3290 = Static98.aClass2_Sub1_Sub14ArrayArray1[local394 >> 16];
							for (local266 = 0; local266 < local3290.length; local266++) {
								@Pc(3298) Class2_Sub1_Sub14 local3298 = local3290[local266];
								if ((local3298.anInt2174 & 0xFFFF) == (local509.anInt2194 & 0xFFFF) && local157 + 1 == local3298.anInt2220) {
									local3298.anInt2218 = local165;
									local3298.anInt2206 = local542 - 1;
								}
							}
						} else if (local157 >= 0 && local509.anIntArray276.length > local157) {
							local509.anIntArray276[local157] = local542;
							local509.anIntArray281[local157] = local165;
						}
					}
					Static93.anInt2359 = -1;
					return true;
				}
			}
			if (Static93.anInt2359 == 166) {
				Static46.method1045(false);
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 231) {
				local394 = Static13.aClass2_Sub3_Sub1_1.method784();
				local431 = Static13.aClass2_Sub3_Sub1_1.method808();
				local157 = local394 >> 10 & 0x1F;
				local542 = local394 >> 5 & 0x1F;
				@Pc(3381) Class2_Sub1_Sub14 local3381 = Static113.method1526(local431);
				Static93.anInt2359 = -1;
				local165 = local394 & 0x1F;
				local3381.anInt2173 = (local542 << 11) + (local157 << 19) + (local165 << 3);
				return true;
			}
			if (Static93.anInt2359 == 211) {
				Static71.anInt1968 = Static83.anInt2224 / 8;
				for (local394 = 0; local394 < Static71.anInt1968; local394++) {
					Static88.aLongArray5[local394] = Static13.aClass2_Sub3_Sub1_1.method821();
				}
				Static93.anInt2359 = -1;
				return true;
			}
			if (Static93.anInt2359 == 124) {
				if (Static72.anInt1978 != -1) {
					Static90.method1570(Static72.anInt1978);
					Static72.anInt1978 = -1;
				}
				Static87.aBoolean137 = true;
				Static111.aClass1_2886 = Static111.aClass1_2898;
				Static95.anInt2396 = 2;
				Static93.anInt2359 = -1;
				Static32.aBoolean54 = false;
				return true;
			}
			Static10.method1681("T1 - " + Static93.anInt2359 + "," + Static13.anInt654 + "," + Static82.anInt2147 + " - " + Static83.anInt2224, null);
			Static81.method1495();
		} catch (@Pc(3482) IOException local3482) {
			Static98.method1659();
		} catch (@Pc(3486) Exception local3486) {
			@Pc(3526) String local3526 = "T2 - " + Static93.anInt2359 + "," + Static13.anInt654 + "," + Static82.anInt2147 + " - " + Static83.anInt2224 + "," + (Static25.anInt1022 + Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0]) + "," + (Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0] + Static47.anInt1563) + " - ";
			for (local431 = 0; Static83.anInt2224 > local431 && local431 < 50; local431++) {
				local3526 = local3526 + Static13.aClass2_Sub3_Sub1_1.aByteArray7[local431] + ",";
			}
			Static10.method1681(local3526, local3486);
			Static81.method1495();
		}
		return true;
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public static void method204() {
		aByteArray3 = null;
		anObject1 = null;
		aClass1_287 = null;
		aClass1_288 = null;
		aClass1_286 = null;
		aClass1_289 = null;
		aClass10_1 = null;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(III)I")
	public static int method209(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(41) int local41 = Static71.method1361(arg0 - 1, arg1 + -1) + Static71.method1361(arg0 + 1, arg1 - 1) + Static71.method1361(arg0 + -1, arg1 + 1) + Static71.method1361(arg0 + 1, arg1 - -1);
		@Pc(76) int local76 = Static71.method1361(arg0 - 1, arg1) + Static71.method1361(arg0 + 1, arg1) + Static71.method1361(arg0, arg1 - 1) + Static71.method1361(arg0, arg1 + 1);
		@Pc(81) int local81 = Static71.method1361(arg0, arg1);
		return local41 / 16 + local76 / 8 + local81 / 4;
	}
}
