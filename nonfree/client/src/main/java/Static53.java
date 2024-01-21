import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!k", name = "w", descriptor = "[I")
	public static int[] anIntArray262;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "Ljava/awt/Font;")
	public static Font aFont2;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!wb;")
	public static Class65 aClass65_886 = Static24.method441("Verbindung mit Freunde)2Server)3)3)3");

	@OriginalMember(owner = "client!k", name = "s", descriptor = "Lclient!wb;")
	public static Class65 aClass65_887 = Static24.method441("null");

	@OriginalMember(owner = "client!k", name = "y", descriptor = "I")
	public static int anInt1931 = 0;

	@OriginalMember(owner = "client!k", name = "G", descriptor = "Lclient!wb;")
	public static Class65 aClass65_888 = Static24.method441("Wir vermuten ihr Spielkonto wurde gestohlen");

	@OriginalMember(owner = "client!k", name = "K", descriptor = "I")
	public static int anInt1941 = 0;

	@OriginalMember(owner = "client!k", name = "O", descriptor = "I")
	public static volatile int anInt1943 = 0;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
	public static void method1130() {
		aClass65_888 = null;
		anIntArray262 = null;
		aClass65_886 = null;
		aFont2 = null;
		aClass65_887 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!o;BI)V")
	public static void method1145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub1_Sub11 arg2, @OriginalArg(4) int arg3) {
		if (Static24.anInt719 >= 400) {
			return;
		}
		if (arg2.anIntArray285 != null) {
			arg2 = arg2.method1262();
		}
		if (arg2 == null || !arg2.aBoolean111) {
			return;
		}
		@Pc(31) Class65 local31 = arg2.aClass65_972;
		if (arg2.anInt2109 != 0) {
			local31 = Static13.method282(new Class65[] { local31, Static20.method405(Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1583, arg2.anInt2109), Static101.aClass65_1253, Static78.aClass65_264, Static93.method1617(arg2.anInt2109), Static52.aClass65_720 });
		}
		if (Static80.anInt2291 == 1) {
			Static47.method820(arg0, arg3, Static22.aClass65_311, Static13.method282(new Class65[] { Static99.aClass65_1144, Static9.aClass65_159, local31 }), 4, arg1);
		} else if (Static37.anInt1224 != 1) {
			@Pc(119) Class65[] local119 = arg2.aClass65Array10;
			if (Static55.aBoolean91) {
				local119 = Static78.method346(local119);
			}
			@Pc(129) int local129;
			if (local119 != null) {
				for (local129 = 4; local129 >= 0; local129--) {
					if (local119[local129] != null && !local119[local129].method1788(Static96.aClass65_1200)) {
						@Pc(148) byte local148 = 0;
						if (local129 == 0) {
							local148 = 53;
						}
						if (local129 == 1) {
							local148 = 7;
						}
						if (local129 == 2) {
							local148 = 16;
						}
						if (local129 == 3) {
							local148 = 32;
						}
						if (local129 == 4) {
							local148 = 31;
						}
						Static47.method820(arg0, arg3, local119[local129], Static13.method282(new Class65[] { Static98.aClass65_1234, local31 }), local148, arg1);
					}
				}
			}
			if (local119 != null) {
				for (local129 = 4; local129 >= 0; local129--) {
					if (local119[local129] != null && local119[local129].method1788(Static96.aClass65_1200)) {
						@Pc(225) short local225 = 0;
						@Pc(231) int local231 = 0;
						if (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anInt1583 < arg2.anInt2109) {
							local225 = 2000;
						}
						if (local129 == 0) {
							local231 = local225 + 53;
						}
						if (local129 == 1) {
							local231 = local225 + 7;
						}
						if (local129 == 2) {
							local231 = local225 + 16;
						}
						if (local129 == 3) {
							local231 = local225 + 32;
						}
						if (local129 == 4) {
							local231 = local225 + 31;
						}
						Static47.method820(arg0, arg3, local119[local129], Static13.method282(new Class65[] { Static98.aClass65_1234, local31 }), local231, arg1);
					}
				}
			}
			Static47.method820(arg0, arg3, Static85.aClass65_1102, Static13.method282(new Class65[] { Static98.aClass65_1234, local31 }), 1006, arg1);
		} else if ((Static39.anInt1259 & 0x2) == 2) {
			Static47.method820(arg0, arg3, Static80.aClass65_1042, Static13.method282(new Class65[] { Static29.aClass65_387, Static9.aClass65_159, local31 }), 11, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(Z)V")
	public static void method1148() {
		@Pc(19) int local19;
		@Pc(34) int local34;
		@Pc(25) int local25;
		@Pc(38) int local38;
		@Pc(68) Class2_Sub1_Sub1_Sub3 local68;
		if (Static8.anInt307 == 123) {
			local19 = Static59.aClass2_Sub8_Sub1_19.method1378();
			local25 = Static102.anInt2800 + (local19 & 0x7);
			local34 = Static74.anInt1538 + (local19 >> 4 & 0x7);
			local38 = Static59.aClass2_Sub8_Sub1_19.method1394();
			if (local34 >= 0 && local25 >= 0 && local34 < 104 && local25 < 104) {
				@Pc(61) Class52 local61 = Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local34][local25];
				if (local61 != null) {
					for (local68 = (Class2_Sub1_Sub1_Sub3) local61.method1587(); local68 != null; local68 = (Class2_Sub1_Sub1_Sub3) local61.method1588()) {
						if ((local38 & 0x7FFF) == local68.anInt1292) {
							local68.method1794();
							break;
						}
					}
					if (local61.method1587() == null) {
						Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local34][local25] = null;
					}
					Static69.method1241(local25, local34);
				}
			}
			return;
		}
		@Pc(140) int local140;
		@Pc(144) int local144;
		@Pc(148) int local148;
		@Pc(152) int local152;
		if (Static8.anInt307 == 144) {
			local19 = Static59.aClass2_Sub8_Sub1_19.method1378();
			local25 = (local19 & 0x7) + Static102.anInt2800;
			local34 = Static74.anInt1538 + (local19 >> 4 & 0x7);
			local38 = Static59.aClass2_Sub8_Sub1_19.method1394();
			local140 = Static59.aClass2_Sub8_Sub1_19.method1410();
			local144 = local140 >> 2;
			local148 = local140 & 0x3;
			local152 = Static45.anIntArray192[local144];
			if (local34 >= 0 && local25 >= 0 && local34 < 104 && local25 < 104) {
				Static52.method929(local144, -1, local25, 0, local34, local38, local152, Static62.anInt1879, local148);
			}
			return;
		}
		@Pc(226) int local226;
		@Pc(230) int local230;
		@Pc(238) int local238;
		if (Static8.anInt307 == 141) {
			local19 = Static59.aClass2_Sub8_Sub1_19.method1378();
			local25 = local19 & 0x3;
			local34 = local19 >> 2;
			local38 = Static45.anIntArray192[local34];
			local140 = Static59.aClass2_Sub8_Sub1_19.method1395();
			local148 = (local140 & 0x7) + Static102.anInt2800;
			local144 = Static74.anInt1538 + (local140 >> 4 & 0x7);
			@Pc(218) byte local218 = Static59.aClass2_Sub8_Sub1_19.method1387();
			@Pc(222) byte local222 = Static59.aClass2_Sub8_Sub1_19.method1387();
			local226 = Static59.aClass2_Sub8_Sub1_19.method1396();
			local230 = Static59.aClass2_Sub8_Sub1_19.method1391();
			@Pc(234) byte local234 = Static59.aClass2_Sub8_Sub1_19.method1380();
			local238 = Static59.aClass2_Sub8_Sub1_19.method1382();
			@Pc(242) byte local242 = Static59.aClass2_Sub8_Sub1_19.method1386();
			@Pc(246) int local246 = Static59.aClass2_Sub8_Sub1_19.method1394();
			@Pc(251) Class2_Sub1_Sub1_Sub2_Sub2 local251;
			if (Static47.anInt1379 == local238) {
				local251 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1;
			} else {
				local251 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local238];
			}
			if (local251 != null) {
				@Pc(263) Class2_Sub1_Sub14 local263 = Static29.method518(local246);
				@Pc(271) int local271 = Static61.anIntArrayArrayArray6[Static62.anInt1879][local144][local148];
				@Pc(283) int local283 = Static61.anIntArrayArrayArray6[Static62.anInt1879][local144 + 1][local148 + 1];
				@Pc(293) int local293 = Static61.anIntArrayArrayArray6[Static62.anInt1879][local144][local148 + 1];
				@Pc(303) int local303 = Static61.anIntArrayArrayArray6[Static62.anInt1879][local144 + 1][local148];
				@Pc(313) Class2_Sub1_Sub1_Sub6 local313 = local263.method1613(local293, local271, local25, local34, local283, local303);
				if (local313 != null) {
					Static52.method929(0, local230 + 1, local148, local226 + 1, local144, -1, local38, Static62.anInt1879, 0);
					local251.aClass2_Sub1_Sub1_Sub6_1 = local313;
					@Pc(336) int local336 = local263.anInt2621;
					local251.anInt1596 = local230 + Static108.anInt2902;
					@Pc(344) int local344 = local263.anInt2634;
					@Pc(349) byte local349;
					if (local222 > local218) {
						local349 = local222;
						local222 = local218;
						local218 = local349;
					}
					local251.anInt1588 = Static108.anInt2902 + local226;
					if (local25 == 1 || local25 == 3) {
						local336 = local263.anInt2634;
						local344 = local263.anInt2621;
					}
					if (local242 > local234) {
						local349 = local242;
						local242 = local234;
						local234 = local349;
					}
					local251.anInt1581 = local148 * 128 + local344 * 64;
					local251.anInt1578 = local144 * 128 + local336 * 64;
					local251.anInt1582 = Static25.method447(Static62.anInt1879, local251.anInt1581, local251.anInt1578);
					local251.anInt1595 = local234 + local148;
					local251.anInt1576 = local144 + local218;
					local251.anInt1598 = local148 + local242;
					local251.anInt1575 = local144 + local222;
				}
			}
		}
		if (Static8.anInt307 == 0) {
			local19 = Static59.aClass2_Sub8_Sub1_19.method1410();
			local34 = local19 >> 2;
			local25 = local19 & 0x3;
			local38 = Static45.anIntArray192[local34];
			local140 = Static59.aClass2_Sub8_Sub1_19.method1395();
			local144 = Static74.anInt1538 + (local140 >> 4 & 0x7);
			local148 = (local140 & 0x7) + Static102.anInt2800;
			if (local144 >= 0 && local148 >= 0 && local144 < 104 && local148 < 104) {
				Static52.method929(local34, -1, local148, 0, local144, -1, local38, Static62.anInt1879, local25);
			}
		} else if (Static8.anInt307 == 214) {
			local19 = Static59.aClass2_Sub8_Sub1_19.method1410();
			local25 = Static102.anInt2800 + (local19 & 0x7);
			local34 = Static74.anInt1538 + (local19 >> 4 & 0x7);
			local38 = Static59.aClass2_Sub8_Sub1_19.method1396();
			local140 = Static59.aClass2_Sub8_Sub1_19.method1396();
			local144 = Static59.aClass2_Sub8_Sub1_19.method1396();
			if (local34 >= 0 && local25 >= 0 && local34 < 104 && local25 < 104) {
				@Pc(563) Class52 local563 = Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local34][local25];
				if (local563 != null) {
					for (@Pc(570) Class2_Sub1_Sub1_Sub3 local570 = (Class2_Sub1_Sub1_Sub3) local563.method1587(); local570 != null; local570 = (Class2_Sub1_Sub1_Sub3) local563.method1588()) {
						if ((local38 & 0x7FFF) == local570.anInt1292 && local140 == local570.anInt1297) {
							local570.anInt1297 = local144;
							break;
						}
					}
					Static69.method1241(local25, local34);
				}
			}
		} else {
			@Pc(663) int local663;
			if (Static8.anInt307 == 75) {
				local19 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local34 = (local19 >> 4 & 0x7) + Static74.anInt1538;
				local25 = Static102.anInt2800 + (local19 & 0x7);
				local38 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local140 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local148 = local140 & 0x7;
				local144 = local140 >> 4 & 0xF;
				local152 = Static59.aClass2_Sub8_Sub1_19.method1410();
				if (local34 >= 0 && local25 >= 0 && local34 < 104 && local25 < 104) {
					local663 = local144 + 1;
					if (local34 - local663 <= Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0] && local663 + local34 >= Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0] && local25 - local663 <= Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0] && local663 + local25 >= Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0] && Static83.anInt2378 != 0 && local148 > 0 && Static98.anInt2765 < 50) {
						Static85.anIntArray320[Static98.anInt2765] = local38;
						Static104.anIntArray409[Static98.anInt2765] = local148;
						Static19.anIntArray256[Static98.anInt2765] = local152;
						Static30.aClass35Array1[Static98.anInt2765] = null;
						Static105.anIntArray410[Static98.anInt2765] = (local34 << 16) + (local25 << 8) + local144;
						Static98.anInt2765++;
					}
				}
			}
			@Pc(822) int local822;
			if (Static8.anInt307 == 35) {
				local19 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local25 = (local19 & 0x7) + Static102.anInt2800;
				local34 = (local19 >> 4 & 0x7) + Static74.anInt1538;
				local38 = local34 + Static59.aClass2_Sub8_Sub1_19.method1380();
				local140 = Static59.aClass2_Sub8_Sub1_19.method1380() + local25;
				local144 = Static59.aClass2_Sub8_Sub1_19.method1381();
				local148 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local152 = Static59.aClass2_Sub8_Sub1_19.method1410() * 4;
				local663 = Static59.aClass2_Sub8_Sub1_19.method1410() * 4;
				local226 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local230 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local822 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local238 = Static59.aClass2_Sub8_Sub1_19.method1410();
				if (local34 >= 0 && local25 >= 0 && local34 < 104 && local25 < 104 && local38 >= 0 && local140 >= 0 && local38 < 104 && local140 < 104 && local148 != 65535) {
					local140 = local140 * 128 + 64;
					local25 = local25 * 128 + 64;
					local38 = local38 * 128 + 64;
					local34 = local34 * 128 + 64;
					@Pc(911) Class2_Sub1_Sub1_Sub1 local911 = new Class2_Sub1_Sub1_Sub1(local148, Static62.anInt1879, local34, local25, Static25.method447(Static62.anInt1879, local25, local34) - local152, local226 + Static108.anInt2902, Static108.anInt2902 + local230, local822, local238, local144, local663);
					local911.method59(local38, Static25.method447(Static62.anInt1879, local140, local38) - local663, local140, Static108.anInt2902 + local226);
					Static45.aClass52_7.method1593(local911);
				}
			} else if (Static8.anInt307 == 96) {
				local19 = Static59.aClass2_Sub8_Sub1_19.method1391();
				local34 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local25 = local34 >> 2;
				local38 = local34 & 0x3;
				local140 = Static45.anIntArray192[local25];
				local144 = Static59.aClass2_Sub8_Sub1_19.method1412();
				local148 = (local144 >> 4 & 0x7) + Static74.anInt1538;
				local152 = (local144 & 0x7) + Static102.anInt2800;
				if (local148 >= 0 && local152 >= 0 && local148 < 103 && local152 < 103) {
					local663 = Static61.anIntArrayArrayArray6[Static62.anInt1879][local148][local152];
					local230 = Static61.anIntArrayArrayArray6[Static62.anInt1879][local148 + 1][local152 + 1];
					local822 = Static61.anIntArrayArrayArray6[Static62.anInt1879][local148][local152 + 1];
					local226 = Static61.anIntArrayArrayArray6[Static62.anInt1879][local148 + 1][local152];
					if (local140 == 0) {
						@Pc(1035) Class39 local1035 = Static67.aClass18_1.method610(Static62.anInt1879, local148, local152);
						if (local1035 != null) {
							@Pc(1044) int local1044 = local1035.anInt1877 >> 14 & 0x7FFF;
							if (local25 == 2) {
								local1035.aClass2_Sub1_Sub1_6 = new Class2_Sub1_Sub1_Sub4(local1044, 2, local38 + 4, local663, local226, local230, local822, local19, false);
								local1035.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub4(local1044, 2, local38 + 1 & 0x3, local663, local226, local230, local822, local19, false);
							} else {
								local1035.aClass2_Sub1_Sub1_6 = new Class2_Sub1_Sub1_Sub4(local1044, local25, local38, local663, local226, local230, local822, local19, false);
							}
						}
					}
					if (local140 == 1) {
						@Pc(1108) Class32 local1108 = Static67.aClass18_1.method612(Static62.anInt1879, local148, local152);
						if (local1108 != null) {
							local1108.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub4(local1108.anInt1472 >> 14 & 0x7FFF, 4, 0, local663, local226, local230, local822, local19, false);
						}
					}
					if (local140 == 2) {
						@Pc(1140) Class54 local1140 = Static67.aClass18_1.method617(Static62.anInt1879, local148, local152);
						if (local25 == 11) {
							local25 = 10;
						}
						if (local1140 != null) {
							local1140.aClass2_Sub1_Sub1_7 = new Class2_Sub1_Sub1_Sub4(local1140.anInt2710 >> 14 & 0x7FFF, local25, local38, local663, local226, local230, local822, local19, false);
						}
					}
					if (local140 == 3) {
						@Pc(1177) Class63 local1177 = Static67.aClass18_1.method623(Static62.anInt1879, local148, local152);
						if (local1177 != null) {
							local1177.aClass2_Sub1_Sub1_8 = new Class2_Sub1_Sub1_Sub4(local1177.anInt2835 >> 14 & 0x7FFF, 22, local38, local663, local226, local230, local822, local19, false);
						}
					}
				}
			} else if (Static8.anInt307 == 135) {
				local19 = Static59.aClass2_Sub8_Sub1_19.method1378();
				local34 = Static74.anInt1538 + (local19 >> 4 & 0x7);
				local25 = Static102.anInt2800 + (local19 & 0x7);
				local38 = Static59.aClass2_Sub8_Sub1_19.method1391();
				local140 = Static59.aClass2_Sub8_Sub1_19.method1391();
				local144 = Static59.aClass2_Sub8_Sub1_19.method1382();
				if (local34 >= 0 && local25 >= 0 && local34 < 104 && local25 < 104 && Static47.anInt1379 != local38) {
					@Pc(1256) Class2_Sub1_Sub1_Sub3 local1256 = new Class2_Sub1_Sub1_Sub3();
					local1256.anInt1297 = local144;
					local1256.anInt1292 = local140;
					if (Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local34][local25] == null) {
						Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local34][local25] = new Class52();
					}
					Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local34][local25].method1593(local1256);
					Static69.method1241(local25, local34);
				}
			} else if (Static8.anInt307 == 61) {
				local19 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local34 = Static74.anInt1538 + (local19 >> 4 & 0x7);
				local25 = Static102.anInt2800 + (local19 & 0x7);
				local38 = Static59.aClass2_Sub8_Sub1_19.method1396();
				local140 = Static59.aClass2_Sub8_Sub1_19.method1410();
				local144 = Static59.aClass2_Sub8_Sub1_19.method1396();
				if (local34 >= 0 && local25 >= 0 && local34 < 104 && local25 < 104) {
					local25 = local25 * 128 + 64;
					local34 = local34 * 128 + 64;
					@Pc(1375) Class2_Sub1_Sub1_Sub5 local1375 = new Class2_Sub1_Sub1_Sub5(local38, Static62.anInt1879, local34, local25, Static25.method447(Static62.anInt1879, local25, local34) - local140, local144, Static108.anInt2902);
					Static36.aClass52_6.method1593(local1375);
				}
			} else if (Static8.anInt307 == 114) {
				local19 = Static59.aClass2_Sub8_Sub1_19.method1395();
				local34 = (local19 >> 4 & 0x7) + Static74.anInt1538;
				local25 = (local19 & 0x7) + Static102.anInt2800;
				local38 = Static59.aClass2_Sub8_Sub1_19.method1394();
				local140 = Static59.aClass2_Sub8_Sub1_19.method1391();
				if (local34 >= 0 && local25 >= 0 && local34 < 104 && local25 < 104) {
					local68 = new Class2_Sub1_Sub1_Sub3();
					local68.anInt1292 = local140;
					local68.anInt1297 = local38;
					if (Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local34][local25] == null) {
						Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local34][local25] = new Class52();
					}
					Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local34][local25].method1593(local68);
					Static69.method1241(local25, local34);
				}
			}
		}
	}
}
