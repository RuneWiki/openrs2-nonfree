import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!wd", name = "W", descriptor = "Lclient!hd;")
	public static Class15 aClass15_4;

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
	public static int anInt3141 = 0;

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1374 = Static63.method1251("Message");

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1376 = Static63.method1251("Loaded config");

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1375 = aClass45_1376;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1377 = Static63.method1251("Select");

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1378 = aClass45_1377;

	@OriginalMember(owner = "client!wd", name = "I", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1379 = Static63.method1251("System update in: ");

	@OriginalMember(owner = "client!wd", name = "T", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1384 = Static63.method1251("button near the top of that page)3");

	@OriginalMember(owner = "client!wd", name = "J", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1380 = aClass45_1384;

	@OriginalMember(owner = "client!wd", name = "M", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1381 = Static63.method1251("mapscene");

	@OriginalMember(owner = "client!wd", name = "Q", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1382 = Static63.method1251("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
	public static int anInt3151 = 0;

	@OriginalMember(owner = "client!wd", name = "S", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1383 = Static63.method1251("Loading textures )2 ");

	@OriginalMember(owner = "client!wd", name = "U", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1385 = aClass45_1379;

	@OriginalMember(owner = "client!wd", name = "V", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1386 = Static63.method1251("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!wd", name = "Z", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1387 = Static63.method1251("(U2");

	@OriginalMember(owner = "client!wd", name = "bb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1388 = aClass45_1374;

	@OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1389 = aClass45_1383;

	@OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1390 = Static63.method1251("weiss:");

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public static void method2155() {
		aClass45_1378 = null;
		aClass15_4 = null;
		aClass45_1379 = null;
		aClass45_1388 = null;
		aClass45_1374 = null;
		aClass45_1376 = null;
		aClass45_1390 = null;
		aClass45_1383 = null;
		aClass45_1375 = null;
		aClass45_1384 = null;
		aClass45_1381 = null;
		aClass45_1377 = null;
		aClass45_1380 = null;
		aClass45_1385 = null;
		aClass45_1389 = null;
		aClass45_1387 = null;
		aClass45_1382 = null;
		aClass45_1386 = null;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ia;Z)Lclient!ia;")
	public static Class5_Sub2_Sub8 method2156(@OriginalArg(0) Class5_Sub2_Sub8 arg0) {
		@Pc(11) int local11 = Static56.method1171(Static74.method1700(arg0));
		if (local11 == 0) {
			return null;
		}
		for (@Pc(25) int local25 = 0; local25 < local11; local25++) {
			arg0 = Static80.method1507(arg0.anInt1301);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V")
	public static void method2157() {
		Static49.method1108(false);
		Static30.anInt470 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static31.aByteArrayArray4.length; local16++) {
			if (Static76.anIntArray309[local16] != -1 && Static31.aByteArrayArray4[local16] == null) {
				Static31.aByteArrayArray4[local16] = Static46.aClass29_Sub1_17.method733(0, Static76.anIntArray309[local16]);
				if (Static31.aByteArrayArray4[local16] == null) {
					Static30.anInt470++;
					local14 = false;
				}
			}
			if (Static63.anIntArray281[local16] != -1 && Static79.aByteArrayArray7[local16] == null) {
				Static79.aByteArrayArray7[local16] = Static46.aClass29_Sub1_17.method758(0, Static63.anIntArray281[local16], Static71.anIntArrayArray21[local16]);
				if (Static79.aByteArrayArray7[local16] == null) {
					Static30.anInt470++;
					local14 = false;
				}
			}
		}
		if (!local14) {
			Static75.anInt2183 = 1;
			return;
		}
		local14 = true;
		Static78.anInt2217 = 0;
		@Pc(120) int local120;
		@Pc(131) int local131;
		for (@Pc(101) int local101 = 0; local101 < Static31.aByteArrayArray4.length; local101++) {
			@Pc(107) byte[] local107 = Static79.aByteArrayArray7[local101];
			if (local107 != null) {
				local120 = (Static33.anIntArray158[local101] >> 8) * 64 - Static78.anInt2210;
				local131 = (Static33.anIntArray158[local101] & 0xFF) * 64 - Static6.anInt162;
				if (Static2.aBoolean3) {
					local120 = 10;
					local131 = 10;
				}
				local14 &= Static104.method1903(local131, local120, local107);
			}
		}
		if (!local14) {
			Static75.anInt2183 = 2;
			return;
		}
		if (Static75.anInt2183 != 0) {
			Static59.method1216(Static81.aClass45_961, Static111.aClass45_1277, true);
		}
		Static104.method1900();
		Static70.method1357();
		Static104.method1900();
		Static110.aClass34_1.method914();
		Static104.method1900();
		System.gc();
		for (@Pc(182) int local182 = 0; local182 < 4; local182++) {
			Static51.aClass37Array1[local182].method1125();
		}
		@Pc(205) int local205;
		for (local120 = 0; local120 < 4; local120++) {
			for (local131 = 0; local131 < 104; local131++) {
				for (local205 = 0; local205 < 104; local205++) {
					Static48.aByteArrayArrayArray3[local120][local131][local205] = 0;
				}
			}
		}
		Static104.method1900();
		Static110.method1986();
		local131 = Static31.aByteArrayArray4.length;
		Static100.method1838();
		Static49.method1108(true);
		@Pc(266) int local266;
		@Pc(280) int local280;
		@Pc(392) int local392;
		@Pc(334) int local334;
		@Pc(381) int local381;
		if (!Static2.aBoolean3) {
			@Pc(270) byte[] local270;
			for (local205 = 0; local205 < local131; local205++) {
				local266 = (Static33.anIntArray158[local205] >> 8) * 64 - Static78.anInt2210;
				local270 = Static31.aByteArrayArray4[local205];
				local280 = (Static33.anIntArray158[local205] & 0xFF) * 64 - Static6.anInt162;
				if (local270 != null) {
					Static104.method1900();
					Static28.method623(Static51.aClass37Array1, Static42.anInt803 * 8 - 48, local270, local266, local280, Static41.anInt2257 * 8 - 48);
				}
			}
			for (local266 = 0; local266 < local131; local266++) {
				local280 = (Static33.anIntArray158[local266] >> 8) * 64 - Static78.anInt2210;
				local334 = (Static33.anIntArray158[local266] & 0xFF) * 64 - Static6.anInt162;
				@Pc(338) byte[] local338 = Static31.aByteArrayArray4[local266];
				if (local338 == null && Static42.anInt803 < 800) {
					Static104.method1900();
					Static62.method1235(local280, 64, 64, local334);
				}
			}
			Static49.method1108(true);
			for (local280 = 0; local280 < local131; local280++) {
				local270 = Static79.aByteArrayArray7[local280];
				if (local270 != null) {
					local381 = (Static33.anIntArray158[local280] >> 8) * 64 - Static78.anInt2210;
					local392 = (Static33.anIntArray158[local280] & 0xFF) * 64 - Static6.anInt162;
					Static104.method1900();
					Static44.method944(local392, local270, local381, Static51.aClass37Array1, Static110.aClass34_1);
				}
			}
		}
		@Pc(450) int local450;
		@Pc(462) int local462;
		if (Static2.aBoolean3) {
			@Pc(456) int local456;
			@Pc(472) int local472;
			@Pc(474) int local474;
			for (local205 = 0; local205 < 4; local205++) {
				Static104.method1900();
				for (local266 = 0; local266 < 13; local266++) {
					for (local280 = 0; local280 < 13; local280++) {
						@Pc(427) boolean local427 = false;
						local381 = Static73.anIntArrayArrayArray7[local205][local266][local280];
						if (local381 != -1) {
							local392 = local381 >> 24 & 0x3;
							local450 = local381 >> 1 & 0x3;
							local456 = local381 >> 3 & 0x7FF;
							local462 = local381 >> 14 & 0x3FF;
							local472 = local456 / 8 + (local462 / 8 << 8);
							for (local474 = 0; local474 < Static33.anIntArray158.length; local474++) {
								if (Static33.anIntArray158[local474] == local472 && Static31.aByteArrayArray4[local474] != null) {
									Static87.method1682(local205, local450, local266 * 8, local280 * 8, local392, (local456 & 0x7) * 8, Static31.aByteArrayArray4[local474], Static51.aClass37Array1, (local462 & 0x7) * 8);
									local427 = true;
									break;
								}
							}
						}
						if (!local427) {
							Static121.method1615(local266 * 8, local205, local280 * 8);
						}
					}
				}
			}
			for (local266 = 0; local266 < 13; local266++) {
				for (local280 = 0; local280 < 13; local280++) {
					local334 = Static73.anIntArrayArrayArray7[0][local266][local280];
					if (local334 == -1) {
						Static62.method1235(local266 * 8, 8, 8, local280 * 8);
					}
				}
			}
			Static49.method1108(true);
			for (local280 = 0; local280 < 4; local280++) {
				Static104.method1900();
				for (local334 = 0; local334 < 13; local334++) {
					for (local381 = 0; local381 < 13; local381++) {
						local392 = Static73.anIntArrayArrayArray7[local280][local334][local381];
						if (local392 != -1) {
							local462 = local392 >> 1 & 0x3;
							local456 = local392 >> 14 & 0x3FF;
							local450 = local392 >> 24 & 0x3;
							local472 = local392 >> 3 & 0x7FF;
							local474 = local472 / 8 + (local456 / 8 << 8);
							for (@Pc(645) int local645 = 0; local645 < Static33.anIntArray158.length; local645++) {
								if (local474 == Static33.anIntArray158[local645] && Static79.aByteArrayArray7[local645] != null) {
									Static91.method1706(local450, local462, (local472 & 0x7) * 8, (local456 & 0x7) * 8, Static79.aByteArrayArray7[local645], local381 * 8, Static51.aClass37Array1, local334 * 8, Static110.aClass34_1, local280);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static49.method1108(true);
		Static70.method1357();
		Static104.method1900();
		Static96.method1795(Static110.aClass34_1, Static51.aClass37Array1);
		Static49.method1108(true);
		local205 = Static32.anInt936;
		if (Static8.anInt262 < local205) {
			local205 = Static8.anInt262;
		}
		if (local205 < Static8.anInt262 - 1) {
		}
		if (Static103.aBoolean122) {
			Static110.aClass34_1.method910(Static32.anInt936);
		} else {
			Static110.aClass34_1.method910(0);
		}
		for (local266 = 0; local266 < 104; local266++) {
			for (local280 = 0; local280 < 104; local280++) {
				Static81.method1518(local280, local266);
			}
		}
		Static104.method1900();
		Static78.method1486();
		Static120.aClass67_26.method1819();
		if (Static35.aFrame1 != null) {
			Static64.aClass5_Sub9_Sub1_2.method1466(218);
			Static64.aClass5_Sub9_Sub1_2.method1413(1057001181);
		}
		if (!Static2.aBoolean3) {
			local280 = (Static41.anInt2257 - 6) / 8;
			local334 = (Static41.anInt2257 + 6) / 8;
			local381 = (Static42.anInt803 - 6) / 8;
			local392 = (Static42.anInt803 + 6) / 8;
			for (local450 = local280 - 1; local450 <= local334 + 1; local450++) {
				for (local462 = local381 - 1; local462 <= local392 + 1; local462++) {
					if (local450 < local280 || local334 < local450 || local462 < local381 || local462 > local392) {
						Static46.aClass29_Sub1_17.method748(Static39.method1443(new Class45[] { Static10.aClass45_166, Static76.method1476(local450), Static81.aClass45_960, Static76.method1476(local462) }));
						Static46.aClass29_Sub1_17.method748(Static39.method1443(new Class45[] { Static96.aClass45_1103, Static76.method1476(local450), Static81.aClass45_960, Static76.method1476(local462) }));
					}
				}
			}
		}
		if (Static101.anInt1036 == -1) {
			Static39.method1422(30);
		} else {
			Static39.method1422(35);
		}
		Static104.method1900();
		Static31.method664();
		Static64.aClass5_Sub9_Sub1_2.method1466(193);
		Static89.method1703();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public static void method2158(@OriginalArg(1) int arg0) {
		if (Static45.anInt1317 == 0) {
			Static54.aClass5_Sub7_Sub4_3.method2032(arg0);
		} else {
			Static51.anInt1613 = arg0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!sd;IB)Lclient!kb;")
	public static Class5_Sub12 method2159(@OriginalArg(0) Class29 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method745(arg1);
		return local13 == null ? null : new Class5_Sub12(local13);
	}
}
