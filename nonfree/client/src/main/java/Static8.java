import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "ib", descriptor = "I")
	public static int anInt305;

	@OriginalMember(owner = "client!ah", name = "W", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_118 = Static177.method3050("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ah", name = "X", descriptor = "I")
	public static int anInt297 = 0;

	@OriginalMember(owner = "client!ah", name = "Z", descriptor = "Lclient!f;")
	public static final Class4_Sub9 aClass4_Sub9_1 = new Class4_Sub9(0, 0);

	@OriginalMember(owner = "client!ah", name = "db", descriptor = "I")
	public static int anInt302 = 0;

	@OriginalMember(owner = "client!ah", name = "fb", descriptor = "J")
	public static volatile long aLong9 = 0L;

	@OriginalMember(owner = "client!ah", name = "gb", descriptor = "I")
	public static int anInt304 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!ah", name = "hb", descriptor = "[I")
	public static final int[] anIntArray28 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ah", name = "kb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_119 = Static177.method3050("Hier wechseln");

	@OriginalMember(owner = "client!ah", name = "f", descriptor = "(I)Z")
	public static boolean method162() {
		if (Static59.aClass27_2 == null) {
			return false;
		}
		@Pc(126) int local126;
		try {
			@Pc(15) int local15 = Static59.aClass27_2.method959();
			if (local15 == 0) {
				return false;
			}
			if (Static55.anInt1368 == -1) {
				local15--;
				Static59.aClass27_2.method951(0, 1, Static162.aClass4_Sub11_Sub1_3.aByteArray19);
				Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
				Static55.anInt1368 = Static162.aClass4_Sub11_Sub1_3.method1284();
				Static132.anInt3166 = Static69.anIntArray171[Static55.anInt1368];
			}
			if (Static132.anInt3166 == -1) {
				if (local15 <= 0) {
					return false;
				}
				local15--;
				Static59.aClass27_2.method951(0, 1, Static162.aClass4_Sub11_Sub1_3.aByteArray19);
				Static132.anInt3166 = Static162.aClass4_Sub11_Sub1_3.aByteArray19[0] & 0xFF;
			}
			if (Static132.anInt3166 == -2) {
				if (local15 <= 1) {
					return false;
				}
				local15 -= 2;
				Static59.aClass27_2.method951(0, 2, Static162.aClass4_Sub11_Sub1_3.aByteArray19);
				Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
				Static132.anInt3166 = Static162.aClass4_Sub11_Sub1_3.method1252();
			}
			if (Static132.anInt3166 > local15) {
				return false;
			}
			Static162.aClass4_Sub11_Sub1_3.anInt1597 = 0;
			Static59.aClass27_2.method951(0, Static132.anInt3166, Static162.aClass4_Sub11_Sub1_3.aByteArray19);
			Static3.anInt83 = Static40.anInt1045;
			Static107.anInt2652 = 0;
			Static40.anInt1045 = Static89.anInt2295;
			Static89.anInt2295 = Static55.anInt1368;
			@Pc(151) int local151;
			@Pc(159) int local159;
			@Pc(122) int local122;
			@Pc(153) int local153;
			@Pc(139) Class1 local139;
			if (Static55.anInt1368 == 22) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1263();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1252();
				if (local122 < -70000) {
					local126 += 32768;
				}
				if (local122 < 0) {
					local139 = null;
				} else {
					local139 = Static154.method3136(local122);
				}
				while (Static132.anInt3166 > Static162.aClass4_Sub11_Sub1_3.anInt1597) {
					local151 = Static162.aClass4_Sub11_Sub1_3.method1240();
					local153 = 0;
					local159 = Static162.aClass4_Sub11_Sub1_3.method1252();
					if (local159 != 0) {
						local153 = Static162.aClass4_Sub11_Sub1_3.method1253();
						if (local153 == 255) {
							local153 = Static162.aClass4_Sub11_Sub1_3.method1263();
						}
					}
					if (local139 != null && local151 >= 0 && local139.anIntArray11.length > local151) {
						local139.anIntArray11[local151] = local159;
						local139.anIntArray2[local151] = local153;
					}
					Static118.method2139(local159 - 1, local126, local153, local151);
				}
				if (local139 != null) {
					Static3.method21(local139);
				}
				Static24.method400();
				Static162.anIntArray350[Static148.anInt3383++ & 0x1F] = local126 & 0x7FFF;
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 80) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1243();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1235();
				if (local126 == 65535) {
					local126 = -1;
				}
				local139 = Static154.method3136(local122);
				if (local139.anInt33 != 2 || local139.anInt71 != local126) {
					local139.anInt71 = local126;
					local139.anInt33 = 2;
					Static3.method21(local139);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 171) {
				for (local122 = 0; local122 < Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1.length; local122++) {
					if (Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local122] != null) {
						Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local122].anInt2808 = -1;
					}
				}
				for (local126 = 0; local126 < Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1.length; local126++) {
					if (Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local126] != null) {
						Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local126].anInt2808 = -1;
					}
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 6) {
				for (local122 = 0; local122 < Static10.anInt355; local122++) {
					@Pc(337) Class4_Sub1_Sub5 local337 = Static50.method958(local122);
					if (local337 != null && local337.anInt615 == 0) {
						Static40.anIntArray91[local122] = 0;
						Static147.anIntArray64[local122] = 0;
					}
				}
				Static24.method400();
				Static55.anInt1368 = -1;
				Static144.anInt3349 += 32;
				return true;
			}
			@Pc(380) Class46 local380;
			if (Static55.anInt1368 == 104) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1261();
				local380 = Static162.aClass4_Sub11_Sub1_3.method1247();
				local139 = Static154.method3136(local122);
				if (!local380.method1668(local139.aClass46_2)) {
					local139.aClass46_2 = local380;
					Static3.method21(local139);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 83) {
				Static93.anInt2387 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static172.anInt3875 = Static162.aClass4_Sub11_Sub1_3.method1253();
				while (Static162.aClass4_Sub11_Sub1_3.anInt1597 < Static132.anInt3166) {
					Static55.anInt1368 = Static162.aClass4_Sub11_Sub1_3.method1253();
					Static182.method3121();
				}
				Static55.anInt1368 = -1;
				return true;
			}
			@Pc(442) int local442;
			@Pc(450) boolean local450;
			@Pc(582) int local582;
			@Pc(571) int local571;
			@Pc(438) long local438;
			@Pc(545) Class46 local545;
			if (Static55.anInt1368 == 228) {
				local438 = Static162.aClass4_Sub11_Sub1_3.method1258();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1252();
				@Pc(448) byte local448 = Static162.aClass4_Sub11_Sub1_3.method1241();
				local450 = false;
				if ((Long.MIN_VALUE & local438) != 0L) {
					local450 = true;
				}
				if (local450) {
					if (anInt305 == 0) {
						Static55.anInt1368 = -1;
						return true;
					}
					local438 &= Long.MAX_VALUE;
					for (local153 = 0; anInt305 > local153 && (local438 != Static61.aClass4_Sub6Array1[local153].aLong148 || Static61.aClass4_Sub6Array1[local153].anInt922 != local442); local153++) {
					}
					if (anInt305 > local153) {
						while (local153 < anInt305 - 1) {
							Static61.aClass4_Sub6Array1[local153] = Static61.aClass4_Sub6Array1[local153 + 1];
							local153++;
						}
						anInt305--;
						Static61.aClass4_Sub6Array1[anInt305] = null;
					}
				} else {
					local545 = Static162.aClass4_Sub11_Sub1_3.method1247();
					@Pc(549) Class4_Sub6 local549 = new Class4_Sub6();
					local549.aLong148 = local438;
					local549.aClass46_311 = Static116.method2124(local549.aLong148);
					local549.anInt922 = local442;
					local549.aClass46_305 = local545;
					local549.aByte3 = local448;
					for (local571 = anInt305 - 1; local571 >= 0; local571--) {
						local582 = Static61.aClass4_Sub6Array1[local571].aClass46_311.method1645(local549.aClass46_311);
						if (local582 == 0) {
							Static61.aClass4_Sub6Array1[local571].anInt922 = local442;
							Static61.aClass4_Sub6Array1[local571].aByte3 = local448;
							Static61.aClass4_Sub6Array1[local571].aClass46_305 = local545;
							if (local438 == Static80.aLong73) {
								Static24.aByte2 = local448;
							}
							Static102.anInt2594 = Static163.anInt3721;
							Static55.anInt1368 = -1;
							return true;
						}
						if (local582 < 0) {
							break;
						}
					}
					if (anInt305 >= Static61.aClass4_Sub6Array1.length) {
						Static55.anInt1368 = -1;
						return true;
					}
					for (local582 = anInt305 - 1; local582 > local571; local582--) {
						Static61.aClass4_Sub6Array1[local582 + 1] = Static61.aClass4_Sub6Array1[local582];
					}
					if (anInt305 == 0) {
						Static61.aClass4_Sub6Array1 = new Class4_Sub6[100];
					}
					Static61.aClass4_Sub6Array1[local571 + 1] = local549;
					anInt305++;
					if (local438 == Static80.aLong73) {
						Static24.aByte2 = local448;
					}
				}
				Static55.anInt1368 = -1;
				Static102.anInt2594 = Static163.anInt3721;
				return true;
			}
			if (Static55.anInt1368 == 149) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1243();
				local139 = Static154.method3136(local126);
				if (local139 != null && local139.anInt7 == 0) {
					if (local122 > local139.anInt42 - local139.anInt20) {
						local122 = local139.anInt42 - local139.anInt20;
					}
					if (local122 < 0) {
						local122 = 0;
					}
					if (local122 != local139.anInt32) {
						local139.anInt32 = local122;
						Static3.method21(local139);
					}
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 132) {
				Static120.method2861();
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 203) {
				Static6.method98(Static162.aClass4_Sub11_Sub1_3);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 179) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1252();
				if (local122 == 65535) {
					local122 = -1;
				}
				local126 = Static162.aClass4_Sub11_Sub1_3.method1253();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1252();
				Static91.method1804(local122, local126, local442);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 119) {
				Static27.anInt743 = Static162.aClass4_Sub11_Sub1_3.method1252() * 30;
				Static83.anInt2130 = Static163.anInt3721;
				Static55.anInt1368 = -1;
				return true;
			}
			@Pc(834) Class46 local834;
			if (Static55.anInt1368 == 194) {
				local438 = Static162.aClass4_Sub11_Sub1_3.method1258();
				local834 = Static138.method891(Static100.method1915(Static162.aClass4_Sub11_Sub1_3).method1670());
				Static105.method1982(Static116.method2124(local438).method1654(), 6, local834);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 90) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1253();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1253();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1253();
				local151 = Static162.aClass4_Sub11_Sub1_3.method1253();
				local159 = Static162.aClass4_Sub11_Sub1_3.method1252();
				Static29.aBooleanArray4[local122] = true;
				Static117.anIntArray264[local122] = local126;
				Static99.anIntArray235[local122] = local442;
				Static79.anIntArray198[local122] = local151;
				Static84.anIntArray439[local122] = local159;
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 118) {
				Static77.aClass46_738 = Static162.aClass4_Sub11_Sub1_3.method1247();
				Static169.method2882(Static77.aClass46_738);
				Static55.anInt1368 = -1;
				return true;
			}
			@Pc(925) Class1 local925;
			if (Static55.anInt1368 == 156) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1261();
				local925 = Static154.method3136(local122);
				for (local442 = 0; local442 < local925.anIntArray11.length; local442++) {
					local925.anIntArray11[local442] = -1;
					local925.anIntArray11[local442] = 0;
				}
				Static3.method21(local925);
				Static55.anInt1368 = -1;
				return true;
			}
			@Pc(971) long local971;
			@Pc(989) long local989;
			@Pc(978) long local978;
			if (Static55.anInt1368 == 192) {
				local438 = Static162.aClass4_Sub11_Sub1_3.method1258();
				Static162.aClass4_Sub11_Sub1_3.method1241();
				local971 = Static162.aClass4_Sub11_Sub1_3.method1258();
				local978 = Static162.aClass4_Sub11_Sub1_3.method1252();
				@Pc(983) long local983 = (long) Static162.aClass4_Sub11_Sub1_3.method1225();
				local989 = local983 + (local978 << 32);
				local582 = Static162.aClass4_Sub11_Sub1_3.method1253();
				@Pc(995) boolean local995 = false;
				for (@Pc(997) int local997 = 0; local997 < 100; local997++) {
					if (local989 == Static17.aLongArray6[local997]) {
						local995 = true;
						break;
					}
				}
				if (local582 <= 1) {
					for (@Pc(1022) int local1022 = 0; local1022 < Static57.anInt1403; local1022++) {
						if (Static129.aLongArray33[local1022] == local438) {
							local995 = true;
							break;
						}
					}
				}
				if (!local995 && Static174.anInt3915 == 0) {
					Static17.aLongArray6[Static42.anInt1067] = local989;
					Static42.anInt1067 = (Static42.anInt1067 + 1) % 100;
					@Pc(1070) Class46 local1070 = Static138.method891(Static100.method1915(Static162.aClass4_Sub11_Sub1_3).method1670());
					if (local582 == 2 || local582 == 3) {
						Static2.method20(local1070, 9, Static69.method1482(new Class46[] { Static57.aClass46_548, Static116.method2124(local438).method1654() }), Static116.method2124(local971).method1654());
					} else if (local582 == 1) {
						Static2.method20(local1070, 9, Static69.method1482(new Class46[] { Static106.aClass46_959, Static116.method2124(local438).method1654() }), Static116.method2124(local971).method1654());
					} else {
						Static2.method20(local1070, 9, Static116.method2124(local438).method1654(), Static116.method2124(local971).method1654());
					}
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 161) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1245();
				local925 = Static154.method3136(local122);
				local925.anInt33 = 3;
				local925.anInt71 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1.method1569();
				Static3.method21(local925);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 46) {
				@Pc(1208) boolean local1208 = Static162.aClass4_Sub11_Sub1_3.method1271() == 1;
				local126 = Static162.aClass4_Sub11_Sub1_3.method1263();
				local139 = Static154.method3136(local126);
				if (local1208 != local139.aBoolean5) {
					local139.aBoolean5 = local1208;
					Static3.method21(local139);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			@Pc(1336) Class4_Sub14 local1336;
			@Pc(1378) int local1378;
			if (Static55.anInt1368 == 103) {
				local122 = Static162.aClass4_Sub11_Sub1_3.anInt1597 + Static132.anInt3166;
				local126 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1252();
				if (Static174.anInt3902 != local126) {
					Static174.anInt3902 = local126;
					Static89.method1775(Static174.anInt3902);
					Static47.method922(Static174.anInt3902);
					for (local151 = 0; local151 < 100; local151++) {
						Static50.aBooleanArray8[local151] = true;
					}
				}
				while (local442-- > 0) {
					local151 = Static162.aClass4_Sub11_Sub1_3.method1263();
					local159 = Static162.aClass4_Sub11_Sub1_3.method1252();
					local153 = Static162.aClass4_Sub11_Sub1_3.method1253();
					@Pc(1301) Class4_Sub14 local1301 = (Class4_Sub14) Static106.aClass20_5.method505((long) local151);
					if (local1301 != null && local159 != local1301.anInt2450) {
						Static91.method1801(local1301, true);
						local1301 = null;
					}
					if (local1301 == null) {
						local1301 = Static111.method2064(local153, local151, local159);
					}
					local1301.aBoolean107 = true;
				}
				for (local1336 = (Class4_Sub14) Static106.aClass20_5.method504(); local1336 != null; local1336 = (Class4_Sub14) Static106.aClass20_5.method498()) {
					if (local1336.aBoolean107) {
						local1336.aBoolean107 = false;
					} else {
						Static91.method1801(local1336, true);
					}
				}
				Static129.aClass20_8 = new Class20(512);
				while (local122 > Static162.aClass4_Sub11_Sub1_3.anInt1597) {
					local159 = Static162.aClass4_Sub11_Sub1_3.method1263();
					local153 = Static162.aClass4_Sub11_Sub1_3.method1252();
					local1378 = Static162.aClass4_Sub11_Sub1_3.method1252();
					local571 = Static162.aClass4_Sub11_Sub1_3.method1263();
					for (local582 = local153; local582 <= local1378; local582++) {
						local989 = (long) local582 + ((long) local159 << 32);
						Static129.aClass20_8.method499(local989, new Class4_Sub18(local571));
					}
				}
				Static55.anInt1368 = -1;
				return true;
			}
			@Pc(1442) Class1 local1442;
			if (Static55.anInt1368 == 106) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1275();
				if (local122 == 65535) {
					local122 = -1;
				}
				local126 = Static162.aClass4_Sub11_Sub1_3.method1243();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1245();
				local1442 = Static154.method3136(local126);
				@Pc(1455) Class4_Sub1_Sub12 local1455;
				if (local1442.aBoolean8) {
					local1442.anInt25 = local122;
					local1442.anInt46 = local442;
					local1455 = Static83.method1663(local122);
					local1442.anInt22 = local1455.anInt2504;
					local1442.anInt35 = local1455.anInt2493;
					local1442.anInt5 = local1455.anInt2474;
					local1442.anInt72 = local1455.anInt2499;
					local1442.anInt56 = local1455.anInt2491;
					if (local1442.anInt50 > 0) {
						local1442.anInt72 = local1442.anInt72 * 32 / local1442.anInt50;
					}
					local1442.anInt4 = local1455.anInt2485;
					Static3.method21(local1442);
				} else if (local122 == -1) {
					Static55.anInt1368 = -1;
					local1442.anInt33 = 0;
					return true;
				} else {
					local1455 = Static83.method1663(local122);
					local1442.anInt56 = local1455.anInt2491;
					local1442.anInt72 = local1455.anInt2499 * 100 / local442;
					local1442.anInt71 = local122;
					local1442.anInt35 = local1455.anInt2493;
					local1442.anInt33 = 4;
					Static3.method21(local1442);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 115) {
				Static132.method2335(Static162.aClass4_Sub11_Sub1_3, Static132.anInt3166, Static126.aClass76_4);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 52) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1275();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1261();
				Static40.anIntArray91[local122] = local126;
				if (local126 != Static147.anIntArray64[local122]) {
					Static147.anIntArray64[local122] = local126;
					Static125.method2219(local122);
				}
				Static140.anIntArray315[Static144.anInt3349++ & 0x1F] = local122;
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 187) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1261();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1224();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1224();
				local1442 = Static154.method3136(local122);
				local1442.anInt23 = (local126 << 16) + local442;
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 65) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1221();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1253();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1271();
				Static73.anInt1873 = local442 >> 1;
				Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.method2116(local126, (local442 & 0x1) == 1, local122);
				Static55.anInt1368 = -1;
				return true;
			}
			@Pc(1835) int local1835;
			@Pc(1868) int local1868;
			@Pc(1832) boolean local1832;
			@Pc(1886) Class46 local1886;
			if (Static55.anInt1368 == 147) {
				local438 = Static162.aClass4_Sub11_Sub1_3.method1258();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local151 = Static162.aClass4_Sub11_Sub1_3.method1253();
				@Pc(1695) Class46 local1695 = Static3.aClass46_44;
				if (local442 > 0) {
					local1695 = Static162.aClass4_Sub11_Sub1_3.method1247();
				}
				local545 = Static116.method2124(local438).method1654();
				for (local1378 = 0; local1378 < Static148.anInt3385; local1378++) {
					if (local438 == Static84.aLongArray50[local1378]) {
						if (Static132.anIntArray294[local1378] != local442) {
							Static132.anIntArray294[local1378] = local442;
							if (local442 > 0) {
								Static105.method1982(Static3.aClass46_44, 5, Static69.method1482(new Class46[] { local545, Static136.aClass46_1190 }));
							}
							if (local442 == 0) {
								Static105.method1982(Static3.aClass46_44, 5, Static69.method1482(new Class46[] { local545, Static126.aClass46_1098 }));
							}
						}
						Static31.aClass46Array6[local1378] = local1695;
						local545 = null;
						Static104.anIntArray243[local1378] = local151;
						break;
					}
				}
				if (local545 != null && Static148.anInt3385 < 200) {
					Static84.aLongArray50[Static148.anInt3385] = local438;
					Static23.aClass46Array4[Static148.anInt3385] = local545;
					Static132.anIntArray294[Static148.anInt3385] = local442;
					Static31.aClass46Array6[Static148.anInt3385] = local1695;
					Static104.anIntArray243[Static148.anInt3385] = local151;
					Static148.anInt3385++;
				}
				Static122.anInt2963 = Static163.anInt3721;
				local582 = Static148.anInt3385;
				while (local582 > 0) {
					local1832 = true;
					local582--;
					for (local1835 = 0; local1835 < local582; local1835++) {
						if (Static132.anIntArray294[local1835] != Static69.anInt1855 && Static132.anIntArray294[local1835 + 1] == Static69.anInt1855 || Static132.anIntArray294[local1835] == 0 && Static132.anIntArray294[local1835 + 1] != 0) {
							local1832 = false;
							local1868 = Static132.anIntArray294[local1835];
							Static132.anIntArray294[local1835] = Static132.anIntArray294[local1835 + 1];
							Static132.anIntArray294[local1835 + 1] = local1868;
							local1886 = Static31.aClass46Array6[local1835];
							Static31.aClass46Array6[local1835] = Static31.aClass46Array6[local1835 + 1];
							Static31.aClass46Array6[local1835 + 1] = local1886;
							@Pc(1904) Class46 local1904 = Static23.aClass46Array4[local1835];
							Static23.aClass46Array4[local1835] = Static23.aClass46Array4[local1835 + 1];
							Static23.aClass46Array4[local1835 + 1] = local1904;
							@Pc(1922) long local1922 = Static84.aLongArray50[local1835];
							Static84.aLongArray50[local1835] = Static84.aLongArray50[local1835 + 1];
							Static84.aLongArray50[local1835 + 1] = local1922;
							@Pc(1940) int local1940 = Static104.anIntArray243[local1835];
							Static104.anIntArray243[local1835] = Static104.anIntArray243[local1835 + 1];
							Static104.anIntArray243[local1835 + 1] = local1940;
						}
					}
					if (local1832) {
						break;
					}
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 107) {
				Static3.method22(false);
				Static55.anInt1368 = -1;
				return true;
			}
			@Pc(1991) Class46 local1991;
			if (Static55.anInt1368 == 108) {
				local1991 = Static162.aClass4_Sub11_Sub1_3.method1247();
				@Pc(1998) Object[] local1998 = new Object[local1991.method1677() + 1];
				for (local442 = local1991.method1677() - 1; local442 >= 0; local442--) {
					if (local1991.method1672(local442) == 115) {
						local1998[local442 + 1] = Static162.aClass4_Sub11_Sub1_3.method1247();
					} else {
						local1998[local442 + 1] = Integer.valueOf(Static162.aClass4_Sub11_Sub1_3.method1263());
					}
				}
				local1998[0] = Integer.valueOf(Static162.aClass4_Sub11_Sub1_3.method1263());
				@Pc(2049) Class4_Sub21 local2049 = new Class4_Sub21();
				local2049.anObjectArray28 = local1998;
				Static2.method18(local2049);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 148) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1261();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local151 = Static162.aClass4_Sub11_Sub1_3.method1275();
				@Pc(2086) Class1 local2086 = Static154.method3136(local122);
				if (local2086.anInt35 != local126 || local151 != local2086.anInt56 || local2086.anInt72 != local442) {
					local2086.anInt35 = local126;
					local2086.anInt72 = local442;
					local2086.anInt56 = local151;
					Static3.method21(local2086);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 215) {
				local438 = Static162.aClass4_Sub11_Sub1_3.method1258();
				local971 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local978 = Static162.aClass4_Sub11_Sub1_3.method1225();
				@Pc(2143) long local2143 = (local971 << 32) + local978;
				local1378 = Static162.aClass4_Sub11_Sub1_3.method1253();
				@Pc(2149) boolean local2149 = false;
				for (local1868 = 0; local1868 < 100; local1868++) {
					if (local2143 == Static17.aLongArray6[local1868]) {
						local2149 = true;
						break;
					}
				}
				if (local1378 <= 1) {
					for (@Pc(2176) int local2176 = 0; local2176 < Static57.anInt1403; local2176++) {
						if (local438 == Static129.aLongArray33[local2176]) {
							local2149 = true;
							break;
						}
					}
				}
				if (!local2149 && Static174.anInt3915 == 0) {
					Static17.aLongArray6[Static42.anInt1067] = local2143;
					Static42.anInt1067 = (Static42.anInt1067 + 1) % 100;
					local1886 = Static138.method891(Static100.method1915(Static162.aClass4_Sub11_Sub1_3).method1670());
					if (local1378 == 2 || local1378 == 3) {
						Static105.method1982(Static69.method1482(new Class46[] { Static57.aClass46_548, Static116.method2124(local438).method1654() }), 7, local1886);
					} else if (local1378 == 1) {
						Static105.method1982(Static69.method1482(new Class46[] { Static106.aClass46_959, Static116.method2124(local438).method1654() }), 7, local1886);
					} else {
						Static105.method1982(Static116.method2124(local438).method1654(), 3, local1886);
					}
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 40) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1230();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1263();
				local139 = Static154.method3136(local126);
				if (local139.anInt19 != local122 || local122 == -1) {
					local139.anInt19 = local122;
					local139.anInt70 = 0;
					local139.anInt76 = 0;
					Static3.method21(local139);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 191) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1224();
				Static174.anInt3902 = local122;
				Static89.method1775(local122);
				Static47.method922(Static174.anInt3902);
				for (local126 = 0; local126 < 100; local126++) {
					Static50.aBooleanArray8[local126] = true;
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 205) {
				Static24.method400();
				Static45.anInt1129 = Static162.aClass4_Sub11_Sub1_3.method1227();
				Static55.anInt1368 = -1;
				Static83.anInt2130 = Static163.anInt3721;
				return true;
			}
			if (Static55.anInt1368 == 246) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1263();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1266();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1266();
				local1442 = Static154.method3136(local122);
				local159 = local1442.anInt28 + local126;
				local153 = local1442.anInt60 + local442;
				if (local1442.anInt43 != local159 || local1442.anInt8 != local153) {
					local1442.anInt8 = local153;
					local1442.anInt43 = local159;
					Static3.method21(local1442);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 207) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1252();
				if (local122 == 65535) {
					local122 = -1;
				}
				local126 = Static162.aClass4_Sub11_Sub1_3.method1263();
				local139 = Static154.method3136(local126);
				if (local139.anInt33 != 1 || local122 != local139.anInt71) {
					local139.anInt71 = local122;
					local139.anInt33 = 1;
					Static3.method21(local139);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 234) {
				Static112.method3175();
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 173) {
				Static102.anInt2594 = Static163.anInt3721;
				local438 = Static162.aClass4_Sub11_Sub1_3.method1258();
				if (local438 == 0L) {
					Static55.anInt1368 = -1;
					Static101.aClass46_932 = null;
					anInt305 = 0;
					Static61.aClass4_Sub6Array1 = null;
					Static31.aClass46_263 = null;
					return true;
				}
				local971 = Static162.aClass4_Sub11_Sub1_3.method1258();
				Static31.aClass46_263 = Static116.method2124(local971);
				Static101.aClass46_932 = Static116.method2124(local438);
				Static6.aByte1 = Static162.aClass4_Sub11_Sub1_3.method1241();
				local159 = Static162.aClass4_Sub11_Sub1_3.method1253();
				if (local159 == 255) {
					Static55.anInt1368 = -1;
					return true;
				}
				anInt305 = local159;
				@Pc(2567) Class4_Sub6[] local2567 = new Class4_Sub6[100];
				for (local1378 = 0; local1378 < anInt305; local1378++) {
					local2567[local1378] = new Class4_Sub6();
					local2567[local1378].aLong148 = Static162.aClass4_Sub11_Sub1_3.method1258();
					local2567[local1378].aClass46_311 = Static116.method2124(local2567[local1378].aLong148);
					local2567[local1378].anInt922 = Static162.aClass4_Sub11_Sub1_3.method1252();
					local2567[local1378].aByte3 = Static162.aClass4_Sub11_Sub1_3.method1241();
					local2567[local1378].aClass46_305 = Static162.aClass4_Sub11_Sub1_3.method1247();
					if (local2567[local1378].aLong148 == Static80.aLong73) {
						Static24.aByte2 = local2567[local1378].aByte3;
					}
				}
				local1835 = anInt305;
				while (local1835 > 0) {
					local1835--;
					local1832 = true;
					for (local1868 = 0; local1868 < local1835; local1868++) {
						if (local2567[local1868].aClass46_311.method1645(local2567[local1868 + 1].aClass46_311) > 0) {
							local1832 = false;
							@Pc(2670) Class4_Sub6 local2670 = local2567[local1868];
							local2567[local1868] = local2567[local1868 + 1];
							local2567[local1868 + 1] = local2670;
						}
					}
					if (local1832) {
						break;
					}
				}
				Static55.anInt1368 = -1;
				Static61.aClass4_Sub6Array1 = local2567;
				return true;
			}
			if (Static55.anInt1368 == 236) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1235();
				Static148.method2493(local122);
				Static162.anIntArray350[Static148.anInt3383++ & 0x1F] = local122 & 0x7FFF;
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 235) {
				if (Static174.anInt3902 != -1) {
					Static73.method1504(Static174.anInt3902, 0);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 102) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1224();
				Static55.anInt1368 = -1;
				Static15.anInt456 = local126;
				Static4.anInt2849 = local122;
				return true;
			}
			if (Static55.anInt1368 == 210) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1263();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1252();
				if (local122 < -70000) {
					local126 += 32768;
				}
				if (local122 >= 0) {
					local139 = Static154.method3136(local122);
				} else {
					local139 = null;
				}
				if (local139 != null) {
					for (local151 = 0; local151 < local139.anIntArray11.length; local151++) {
						local139.anIntArray11[local151] = 0;
						local139.anIntArray2[local151] = 0;
					}
				}
				Static103.method1969(local126);
				local151 = Static162.aClass4_Sub11_Sub1_3.method1252();
				for (local159 = 0; local159 < local151; local159++) {
					local153 = Static162.aClass4_Sub11_Sub1_3.method1253();
					if (local153 == 255) {
						local153 = Static162.aClass4_Sub11_Sub1_3.method1245();
					}
					local1378 = Static162.aClass4_Sub11_Sub1_3.method1224();
					if (local139 != null && local159 < local139.anIntArray11.length) {
						local139.anIntArray11[local159] = local1378;
						local139.anIntArray2[local159] = local153;
					}
					Static118.method2139(local1378 - 1, local126, local153, local159);
				}
				if (local139 != null) {
					Static3.method21(local139);
				}
				Static24.method400();
				Static162.anIntArray350[Static148.anInt3383++ & 0x1F] = local126 & 0x7FFF;
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 151) {
				Static83.anInt2136 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static55.anInt1368 = -1;
				Static122.anInt2963 = Static163.anInt3721;
				return true;
			}
			if (Static55.anInt1368 == 199) {
				local1991 = Static162.aClass4_Sub11_Sub1_3.method1247();
				if (local1991.method1662(Static177.aClass46_1459)) {
					local380 = local1991.method1666(local1991.method1652(Static33.aClass46_287), 0);
					local971 = local380.method1646();
					local450 = false;
					for (local153 = 0; local153 < Static57.anInt1403; local153++) {
						if (Static129.aLongArray33[local153] == local971) {
							local450 = true;
							break;
						}
					}
					if (!local450 && Static174.anInt3915 == 0) {
						Static105.method1982(local380, 4, Static59.aClass46_556);
					}
				} else if (local1991.method1662(Static31.aClass46_265)) {
					local380 = local1991.method1666(local1991.method1652(Static33.aClass46_287), 0);
					local971 = local380.method1646();
					local450 = false;
					for (local153 = 0; local153 < Static57.anInt1403; local153++) {
						if (local971 == Static129.aLongArray33[local153]) {
							local450 = true;
							break;
						}
					}
					if (!local450 && Static174.anInt3915 == 0) {
						@Pc(3357) Class46 local3357 = local1991.method1666(local1991.method1677() - 9, local1991.method1652(Static33.aClass46_287) + 1);
						Static105.method1982(local380, 8, local3357);
					}
				} else if (local1991.method1662(Static2.aClass46_29)) {
					local380 = local1991.method1666(local1991.method1652(Static33.aClass46_287), 0);
					local971 = local380.method1646();
					local450 = false;
					for (local153 = 0; local153 < Static57.anInt1403; local153++) {
						if (local971 == Static129.aLongArray33[local153]) {
							local450 = true;
							break;
						}
					}
					if (!local450 && Static174.anInt3915 == 0) {
						Static105.method1982(local380, 10, Static3.aClass46_44);
					}
				} else if (local1991.method1662(Static7.aClass46_98)) {
					local380 = local1991.method1666(local1991.method1652(Static7.aClass46_98), 0);
					Static105.method1982(Static3.aClass46_44, 11, local380);
				} else if (local1991.method1662(Static6.aClass46_92)) {
					local380 = local1991.method1666(local1991.method1652(Static6.aClass46_92), 0);
					if (Static174.anInt3915 == 0) {
						Static105.method1982(Static3.aClass46_44, 12, local380);
					}
				} else if (local1991.method1662(Static76.aClass46_1435)) {
					local380 = local1991.method1666(local1991.method1652(Static76.aClass46_1435), 0);
					if (Static174.anInt3915 == 0) {
						Static105.method1982(Static3.aClass46_44, 13, local380);
					}
				} else if (local1991.method1662(Static156.aClass46_1306)) {
					local380 = local1991.method1666(local1991.method1652(Static33.aClass46_287), 0);
					local971 = local380.method1646();
					local450 = false;
					for (local153 = 0; local153 < Static57.anInt1403; local153++) {
						if (Static129.aLongArray33[local153] == local971) {
							local450 = true;
							break;
						}
					}
					if (!local450 && Static174.anInt3915 == 0) {
						Static105.method1982(local380, 14, Static3.aClass46_44);
					}
				} else if (local1991.method1662(Static92.aClass46_852)) {
					local450 = false;
					local380 = local1991.method1666(local1991.method1652(Static33.aClass46_287), 0);
					local971 = local380.method1646();
					for (local153 = 0; local153 < Static57.anInt1403; local153++) {
						if (Static129.aLongArray33[local153] == local971) {
							local450 = true;
							break;
						}
					}
					if (!local450 && Static174.anInt3915 == 0) {
						Static105.method1982(local380, 15, Static3.aClass46_44);
					}
				} else if (local1991.method1662(Static90.aClass46_844)) {
					local380 = local1991.method1666(local1991.method1652(Static33.aClass46_287), 0);
					local971 = local380.method1646();
					local450 = false;
					for (local153 = 0; local153 < Static57.anInt1403; local153++) {
						if (local971 == Static129.aLongArray33[local153]) {
							local450 = true;
							break;
						}
					}
					if (!local450 && Static174.anInt3915 == 0) {
						Static105.method1982(local380, 16, Static3.aClass46_44);
					}
				} else {
					Static105.method1982(Static3.aClass46_44, 0, local1991);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 226) {
				for (local122 = 0; local122 < Static147.anIntArray64.length; local122++) {
					if (Static147.anIntArray64[local122] != Static40.anIntArray91[local122]) {
						Static147.anIntArray64[local122] = Static40.anIntArray91[local122];
						Static125.method2219(local122);
						Static140.anIntArray315[Static144.anInt3349++ & 0x1F] = local122;
					}
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 29) {
				Static58.anInt1415 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static127.anInt3027 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static54.anInt1361 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 135) {
				Static24.method400();
				local122 = Static162.aClass4_Sub11_Sub1_3.method1221();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1221();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1245();
				Static121.anIntArray274[local126] = local442;
				Static13.anIntArray39[local126] = local122;
				Static91.anIntArray224[local126] = 1;
				for (local151 = 0; local151 < 98; local151++) {
					if (Class4_Sub11_Sub1.anIntArray154[local151] <= local442) {
						Static91.anIntArray224[local126] = local151 + 2;
					}
				}
				Static89.anIntArray216[Static110.anInt2694++ & 0x1F] = local126;
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 43) {
				Static35.aBoolean47 = true;
				Static175.anInt3921 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static100.anInt2534 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static125.anInt2989 = Static162.aClass4_Sub11_Sub1_3.method1252();
				Static143.anInt3328 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static167.anInt3702 = Static162.aClass4_Sub11_Sub1_3.method1253();
				if (Static167.anInt3702 >= 100) {
					local122 = Static175.anInt3921 * 128 + 64;
					local126 = Static100.anInt2534 * 128 + 64;
					local442 = Static106.method1998(local122, Static73.anInt1873, local126) - Static125.anInt2989;
					local151 = local122 - Static119.anInt2886;
					local159 = local442 - Static111.anInt2724;
					local153 = local126 - Static135.anInt3214;
					local1378 = (int) Math.sqrt((double) (local151 * local151 + local153 * local153));
					Static15.anInt456 = (int) (Math.atan2((double) local159, (double) local1378) * 325.949D) & 0x7FF;
					Static4.anInt2849 = (int) (-325.949D * Math.atan2((double) local151, (double) local153)) & 0x7FF;
					if (Static15.anInt456 < 128) {
						Static15.anInt456 = 128;
					}
					if (Static15.anInt456 > 383) {
						Static15.anInt456 = 383;
					}
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 175) {
				Static24.method400();
				Static153.anInt3513 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static83.anInt2130 = Static163.anInt3721;
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 70) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1224();
				if (local122 == 65535) {
					local122 = -1;
				}
				Static72.method1499(local122);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 63) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1272();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1224();
				if (local126 == 65535) {
					local126 = -1;
				}
				Static17.method305(local122, local126);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 109) {
				Static35.aBoolean47 = true;
				Static143.anInt3336 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static111.anInt2723 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static84.anInt4123 = Static162.aClass4_Sub11_Sub1_3.method1252();
				Static143.anInt3334 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static109.anInt2689 = Static162.aClass4_Sub11_Sub1_3.method1253();
				if (Static109.anInt2689 >= 100) {
					Static119.anInt2886 = Static143.anInt3336 * 128 + 64;
					Static135.anInt3214 = Static111.anInt2723 * 128 + 64;
					Static111.anInt2724 = Static106.method1998(Static119.anInt2886, Static73.anInt1873, Static135.anInt3214) - Static84.anInt4123;
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 229) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1252();
				@Pc(3739) byte local3739 = Static162.aClass4_Sub11_Sub1_3.method1241();
				Static40.anIntArray91[local122] = local3739;
				if (Static147.anIntArray64[local122] != local3739) {
					Static147.anIntArray64[local122] = local3739;
					Static125.method2219(local122);
				}
				Static140.anIntArray315[Static144.anInt3349++ & 0x1F] = local122;
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 222) {
				Static55.anInt1368 = -1;
				Static4.anInt2846 = 0;
				return true;
			}
			if (Static55.anInt1368 == 93 || Static55.anInt1368 == 211 || Static55.anInt1368 == 160 || Static55.anInt1368 == 174 || Static55.anInt1368 == 85 || Static55.anInt1368 == 19 || Static55.anInt1368 == 163 || Static55.anInt1368 == 138 || Static55.anInt1368 == 71 || Static55.anInt1368 == 193 || Static55.anInt1368 == 7) {
				Static182.method3121();
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 217) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1252();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1263();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1271();
				local1336 = (Class4_Sub14) Static106.aClass20_5.method505((long) local126);
				if (local1336 != null) {
					Static91.method1801(local1336, local1336.anInt2450 != local122);
				}
				Static111.method2064(local442, local126, local122);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 105) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1253();
				@Pc(3894) Class92 local3894 = new Class92();
				local126 = local122 >> 6;
				local3894.anInt4005 = local122 & 0x3F;
				local3894.anInt4001 = Static162.aClass4_Sub11_Sub1_3.method1253();
				if (local3894.anInt4001 >= 0 && local3894.anInt4001 < Static186.aClass4_Sub1_Sub7_Sub2Array12.length) {
					if (local3894.anInt4005 == 1 || local3894.anInt4005 == 10) {
						local3894.anInt4007 = Static162.aClass4_Sub11_Sub1_3.method1252();
					}
					if (local3894.anInt4005 >= 2 && local3894.anInt4005 <= 6) {
						if (local3894.anInt4005 == 2) {
							local3894.anInt3999 = 64;
							local3894.anInt3995 = 64;
						}
						if (local3894.anInt4005 == 3) {
							local3894.anInt3995 = 64;
							local3894.anInt3999 = 0;
						}
						if (local3894.anInt4005 == 4) {
							local3894.anInt3999 = 128;
							local3894.anInt3995 = 64;
						}
						if (local3894.anInt4005 == 5) {
							local3894.anInt3995 = 0;
							local3894.anInt3999 = 64;
						}
						if (local3894.anInt4005 == 6) {
							local3894.anInt3995 = 128;
							local3894.anInt3999 = 64;
						}
						local3894.anInt4005 = 2;
						local3894.anInt3996 = Static162.aClass4_Sub11_Sub1_3.method1252();
						local3894.anInt4004 = Static162.aClass4_Sub11_Sub1_3.method1252();
						local3894.anInt4003 = Static162.aClass4_Sub11_Sub1_3.method1253();
					}
					Static121.aClass92Array1[local126] = local3894;
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 66) {
				Static57.anInt1403 = Static132.anInt3166 / 8;
				for (local122 = 0; local122 < Static57.anInt1403; local122++) {
					Static129.aLongArray33[local122] = Static162.aClass4_Sub11_Sub1_3.method1258();
					Static153.aClass46Array23[local122] = Static116.method2124(Static129.aLongArray33[local122]);
				}
				Static55.anInt1368 = -1;
				Static122.anInt2963 = Static163.anInt3721;
				return true;
			}
			if (Static55.anInt1368 == 158) {
				Static93.anInt2387 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static172.anInt3875 = Static162.aClass4_Sub11_Sub1_3.method1228();
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 172) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1263();
				Static44.aClass84_3 = Static126.aClass76_4.method2561(local122);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 23) {
				Static3.method22(true);
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 28) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1224();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1261();
				local442 = local122 >> 10 & 0x1F;
				local151 = local122 >> 5 & 0x1F;
				local159 = local122 & 0x1F;
				local153 = (local159 << 3) + (local151 << 11) + (local442 << 19);
				@Pc(4163) Class1 local4163 = Static154.method3136(local126);
				if (local153 != local4163.anInt6) {
					local4163.anInt6 = local153;
					Static3.method21(local4163);
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 155) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1263();
				@Pc(4197) Class4_Sub14 local4197 = (Class4_Sub14) Static106.aClass20_5.method505((long) local122);
				if (local4197 != null) {
					Static91.method1801(local4197, true);
				}
				if (Static84.aClass1_54 != null) {
					Static3.method21(Static84.aClass1_54);
					Static84.aClass1_54 = null;
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 227) {
				Static93.anInt2387 = Static162.aClass4_Sub11_Sub1_3.method1221();
				Static172.anInt3875 = Static162.aClass4_Sub11_Sub1_3.method1271();
				for (local122 = Static93.anInt2387; local122 < Static93.anInt2387 + 8; local122++) {
					for (local126 = Static172.anInt3875; local126 < Static172.anInt3875 + 8; local126++) {
						if (Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local122][local126] != null) {
							Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local122][local126] = null;
							Static147.method478(local126, local122);
						}
					}
				}
				for (@Pc(4280) Class4_Sub13 local4280 = (Class4_Sub13) Static185.aClass11_16.method274(); local4280 != null; local4280 = (Class4_Sub13) Static185.aClass11_16.method271()) {
					if (Static93.anInt2387 <= local4280.anInt2391 && Static93.anInt2387 + 8 > local4280.anInt2391 && local4280.anInt2389 >= Static172.anInt3875 && Static172.anInt3875 + 8 > local4280.anInt2389 && Static73.anInt1873 == local4280.anInt2390) {
						local4280.anInt2378 = 0;
					}
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 159) {
				Static167.method2779();
				Static55.anInt1368 = -1;
				return false;
			}
			if (Static55.anInt1368 == 165) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1228();
				local126 = Static162.aClass4_Sub11_Sub1_3.method1271();
				local834 = Static162.aClass4_Sub11_Sub1_3.method1247();
				if (local122 >= 1 && local122 <= 8) {
					if (local834.method1683(Static54.aClass46_524)) {
						local834 = null;
					}
					Static81.aClass46Array14[local122 - 1] = local834;
					Static46.aBooleanArray7[local122 - 1] = local126 == 0;
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 94) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1253();
				if (Static162.aClass4_Sub11_Sub1_3.method1253() == 0) {
					Static61.aClass68Array1[local122] = new Class68();
				} else {
					Static162.aClass4_Sub11_Sub1_3.anInt1597--;
					Static61.aClass68Array1[local122] = new Class68(Static162.aClass4_Sub11_Sub1_3);
				}
				Static55.anInt1368 = -1;
				Static35.anInt924 = Static163.anInt3721;
				return true;
			}
			if (Static55.anInt1368 == 154) {
				Static123.anInt2973 = Static162.aClass4_Sub11_Sub1_3.method1253();
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 239) {
				Static35.aBoolean47 = false;
				for (local122 = 0; local122 < 5; local122++) {
					Static29.aBooleanArray4[local122] = false;
				}
				Static55.anInt1368 = -1;
				return true;
			}
			if (Static55.anInt1368 == 68) {
				local122 = Static162.aClass4_Sub11_Sub1_3.method1252();
				if (local122 == 65535) {
					local122 = -1;
				}
				local126 = Static162.aClass4_Sub11_Sub1_3.method1261();
				local442 = Static162.aClass4_Sub11_Sub1_3.method1224();
				if (local442 == 65535) {
					local442 = -1;
				}
				local151 = Static162.aClass4_Sub11_Sub1_3.method1243();
				for (local159 = local122; local159 <= local442; local159++) {
					@Pc(4518) long local4518 = (long) local159 + ((long) local151 << 32);
					@Pc(4523) Class4 local4523 = Static129.aClass20_8.method505(local4518);
					if (local4523 != null) {
						local4523.method3173();
					}
					Static129.aClass20_8.method499(local4518, new Class4_Sub18(local126));
				}
				Static55.anInt1368 = -1;
				return true;
			}
			Static146.method2485("T1 - " + Static55.anInt1368 + "," + Static40.anInt1045 + "," + Static3.anInt83 + " - " + Static132.anInt3166, null);
			Static167.method2779();
		} catch (@Pc(4572) IOException local4572) {
			Static183.method1441();
		} catch (@Pc(4576) Exception local4576) {
			@Pc(4616) String local4616 = "T2 - " + Static55.anInt1368 + "," + Static40.anInt1045 + "," + Static3.anInt83 + " - " + Static132.anInt3166 + "," + (Static103.anInt2610 + Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0]) + "," + (Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0] + Static184.anInt4144) + " - ";
			for (local126 = 0; local126 < Static132.anInt3166 && local126 < 50; local126++) {
				local4616 = local4616 + Static162.aClass4_Sub11_Sub1_3.aByteArray19[local126] + ",";
			}
			Static146.method2485(local4616, local4576);
			Static167.method2779();
		}
		return true;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIII)I")
	public static int method163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static53.aByteArrayArrayArray2[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static53.aByteArrayArrayArray2[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!nh;ILclient!nh;)V")
	public static void method165(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1) {
		Static183.aClass62_17 = arg0;
		Static163.aClass62_43 = arg1;
		Static130.anInt3126 = Static163.aClass62_43.method2865(3);
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(Z)V")
	public static void method166() {
		for (@Pc(6) Class4_Sub13 local6 = (Class4_Sub13) Static185.aClass11_16.method274(); local6 != null; local6 = (Class4_Sub13) Static185.aClass11_16.method271()) {
			if (local6.anInt2378 > 0) {
				local6.anInt2378--;
			}
			if (local6.anInt2378 != 0) {
				if (local6.anInt2374 > 0) {
					local6.anInt2374--;
				}
				if (local6.anInt2374 == 0 && local6.anInt2391 >= 1 && local6.anInt2389 >= 1 && local6.anInt2391 <= 102 && local6.anInt2389 <= 102 && (local6.anInt2379 < 0 || Static180.method3095(local6.anInt2379, local6.anInt2375))) {
					Static108.method2015(local6.anInt2391, local6.anInt2382, local6.anInt2389, local6.anInt2381, local6.anInt2379, local6.anInt2390, local6.anInt2375);
					local6.anInt2374 = -1;
					if (local6.anInt2380 == local6.anInt2379 && local6.anInt2380 == -1) {
						local6.method3173();
					} else if (local6.anInt2380 == local6.anInt2379 && local6.anInt2376 == local6.anInt2381 && local6.anInt2377 == local6.anInt2375) {
						local6.method3173();
					}
				}
			} else if (local6.anInt2380 < 0 || Static180.method3095(local6.anInt2380, local6.anInt2377)) {
				Static108.method2015(local6.anInt2391, local6.anInt2382, local6.anInt2389, local6.anInt2376, local6.anInt2380, local6.anInt2390, local6.anInt2377);
				local6.method3173();
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(JBII)Z")
	public static boolean method167(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = (int) arg0 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg0 >> 20 & 0x3;
		@Pc(26) int local26 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local12 == 10 || local12 == 11 || local12 == 22) {
			@Pc(65) Class4_Sub1_Sub19 local65 = Static113.method2090(local26);
			@Pc(68) int local68 = local65.anInt4178;
			@Pc(76) int local76;
			@Pc(79) int local79;
			if (local19 == 0 || local19 == 2) {
				local79 = local65.anInt4187;
				local76 = local65.anInt4191;
			} else {
				local76 = local65.anInt4187;
				local79 = local65.anInt4191;
			}
			if (local19 != 0) {
				local68 = (local68 << local19 & 0xF) + (local68 >> 4 - local19);
			}
			Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], arg2, local79, true, local76, local68, 0, arg1, 2);
		} else {
			Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], local19, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], arg2, 0, true, 0, 0, local12 + 1, arg1, 2);
		}
		Static179.anInt3998 = 0;
		Static162.anInt3596 = Static28.anInt747;
		Static65.anInt1716 = 2;
		Static143.anInt3331 = Static73.anInt1877;
		return true;
	}
}
