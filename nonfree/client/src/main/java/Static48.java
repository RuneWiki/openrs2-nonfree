import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	public static int anInt2951;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "Lclient!wd;")
	public static Class8_Sub20 aClass8_Sub20_36;

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
	public static int anInt2952;

	@OriginalMember(owner = "client!hb", name = "O", descriptor = "[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] aClass8_Sub1_Sub3_Sub3Array39;

	@OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
	public static int anInt2954;

	@OriginalMember(owner = "client!hb", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1348 = Static56.method816("welle:");

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1349 = Static56.method816("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1350 = Static56.method816("Die Verbindung konnte");

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1351 = Static56.method816("Sorry invited players only)3");

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "[I")
	public static int[] anIntArray392 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1352 = aClass34_1351;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "Lclient!lf;")
	public static Class48 aClass48_56 = new Class48(100);

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1353 = Static56.method816("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!hb", name = "M", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1354 = Static56.method816(" <col=ffff00>");

	@OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
	public static int anInt2953 = 0;

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1357 = Static56.method816("Login limit exceeded)3");

	@OriginalMember(owner = "client!hb", name = "P", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1355 = aClass34_1357;

	@OriginalMember(owner = "client!hb", name = "R", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1356 = Static56.method816("(U0a )2 via: ");

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	public static void method1950() {
		aClass34_1355 = null;
		aClass48_56 = null;
		aClass34_1357 = null;
		aClass34_1349 = null;
		Class8_Sub1.anIntArray391 = null;
		aClass34_1352 = null;
		aClass8_Sub1_Sub3_Sub3Array39 = null;
		aClass34_1348 = null;
		anIntArray392 = null;
		aClass34_1353 = null;
		aClass34_1351 = null;
		aClass34_1354 = null;
		aClass8_Sub20_36 = null;
		aClass34_1350 = null;
		aClass34_1356 = null;
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	public static void method1951() {
		Static119.method1770(false);
		Static128.anInt3019 = 0;
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < Static75.aByteArrayArray40.length; local22++) {
			if (Static66.anIntArray393[local22] != -1 && Static75.aByteArrayArray40[local22] == null) {
				Static75.aByteArrayArray40[local22] = Static36.aClass14_Sub1_6.method1156(0, Static66.anIntArray393[local22]);
				if (Static75.aByteArrayArray40[local22] == null) {
					Static128.anInt3019++;
					local20 = false;
				}
			}
			if (Static52.anIntArray169[local22] != -1 && Static102.aByteArrayArray71[local22] == null) {
				Static102.aByteArrayArray71[local22] = Static36.aClass14_Sub1_6.method1149(0, Static52.anIntArray169[local22], Static8.anIntArrayArray1[local22]);
				if (Static102.aByteArrayArray71[local22] == null) {
					Static128.anInt3019++;
					local20 = false;
				}
			}
		}
		if (!local20) {
			Static32.anInt871 = 1;
			return;
		}
		Static36.anInt922 = 0;
		local20 = true;
		@Pc(120) int local120;
		@Pc(130) int local130;
		for (@Pc(101) int local101 = 0; local101 < Static75.aByteArrayArray40.length; local101++) {
			@Pc(107) byte[] local107 = Static102.aByteArrayArray71[local101];
			if (local107 != null) {
				local120 = (Static124.anIntArray394[local101] >> 8) * 64 - Static82.anInt1959;
				local130 = (Static124.anIntArray394[local101] & 0xFF) * 64 - Static64.anInt2062;
				if (Static47.aBoolean52) {
					local120 = 10;
					local130 = 10;
				}
				local20 &= Static88.method1453(local107, local120, local130);
			}
		}
		if (!local20) {
			Static32.anInt871 = 2;
			return;
		}
		if (Static32.anInt871 != 0) {
			Static105.method1477(Static44.method669(new Class34[] { Static113.aClass34_1209, Static128.aClass34_1388 }), true);
		}
		Static33.method548();
		Static39.method596();
		Static33.method548();
		Static3.aClass64_1.method1411();
		Static33.method548();
		System.gc();
		for (@Pc(191) int local191 = 0; local191 < 4; local191++) {
			Static97.aClass42Array1[local191].method1029();
		}
		@Pc(212) int local212;
		for (local120 = 0; local120 < 4; local120++) {
			for (local130 = 0; local130 < 104; local130++) {
				for (local212 = 0; local212 < 104; local212++) {
					Static105.aByteArrayArrayArray5[local120][local130][local212] = 0;
				}
			}
		}
		Static33.method548();
		Static7.method43();
		local130 = Static75.aByteArrayArray40.length;
		Static16.method247();
		Static119.method1770(true);
		@Pc(265) int local265;
		@Pc(275) int local275;
		@Pc(390) int local390;
		@Pc(336) int local336;
		@Pc(379) int local379;
		if (!Static47.aBoolean52) {
			@Pc(279) byte[] local279;
			for (local212 = 0; local212 < local130; local212++) {
				local265 = (Static124.anIntArray394[local212] >> 8) * 64 - Static82.anInt1959;
				local275 = (Static124.anIntArray394[local212] & 0xFF) * 64 - Static64.anInt2062;
				local279 = Static75.aByteArrayArray40[local212];
				if (local279 != null) {
					Static33.method548();
					Static124.method1966(local279, (Static132.anInt2834 - 6) * 8, local265, local275, Static97.aClass42Array1, (Static95.anInt2249 - 6) * 8);
				}
			}
			for (local265 = 0; local265 < local130; local265++) {
				local275 = (Static124.anIntArray394[local265] >> 8) * 64 - Static82.anInt1959;
				@Pc(325) byte[] local325 = Static75.aByteArrayArray40[local265];
				local336 = (Static124.anIntArray394[local265] & 0xFF) * 64 - Static64.anInt2062;
				if (local325 == null && Static95.anInt2249 < 800) {
					Static33.method548();
					Static30.method526(64, 64, local336, local275);
				}
			}
			Static119.method1770(true);
			for (local275 = 0; local275 < local130; local275++) {
				local279 = Static102.aByteArrayArray71[local275];
				if (local279 != null) {
					local379 = (Static124.anIntArray394[local275] >> 8) * 64 - Static82.anInt1959;
					local390 = (Static124.anIntArray394[local275] & 0xFF) * 64 - Static64.anInt2062;
					Static33.method548();
					Static119.method1769(Static3.aClass64_1, local379, local390, Static97.aClass42Array1, local279);
				}
			}
		}
		@Pc(442) int local442;
		@Pc(454) int local454;
		if (Static47.aBoolean52) {
			@Pc(460) int local460;
			@Pc(470) int local470;
			@Pc(472) int local472;
			for (local212 = 0; local212 < 4; local212++) {
				Static33.method548();
				for (local265 = 0; local265 < 13; local265++) {
					for (local275 = 0; local275 < 13; local275++) {
						@Pc(425) boolean local425 = false;
						local379 = Static115.anIntArrayArrayArray8[local212][local265][local275];
						if (local379 != -1) {
							local442 = local379 >> 1 & 0x3;
							local390 = local379 >> 24 & 0x3;
							local454 = local379 >> 14 & 0x3FF;
							local460 = local379 >> 3 & 0x7FF;
							local470 = (local454 / 8 << 8) + local460 / 8;
							for (local472 = 0; local472 < Static124.anIntArray394.length; local472++) {
								if (Static124.anIntArray394[local472] == local470 && Static75.aByteArrayArray40[local472] != null) {
									Static120.method1901(local212, Static75.aByteArrayArray40[local472], local442, (local454 & 0x7) * 8, local265 * 8, Static97.aClass42Array1, local390, (local460 & 0x7) * 8, local275 * 8);
									local425 = true;
									break;
								}
							}
						}
						if (!local425) {
							Static6.method40(local265 * 8, local275 * 8, local212);
						}
					}
				}
			}
			for (local265 = 0; local265 < 13; local265++) {
				for (local275 = 0; local275 < 13; local275++) {
					local336 = Static115.anIntArrayArrayArray8[0][local265][local275];
					if (local336 == -1) {
						Static30.method526(8, 8, local275 * 8, local265 * 8);
					}
				}
			}
			Static119.method1770(true);
			for (local275 = 0; local275 < 4; local275++) {
				Static33.method548();
				for (local336 = 0; local336 < 13; local336++) {
					for (local379 = 0; local379 < 13; local379++) {
						local390 = Static115.anIntArrayArrayArray8[local275][local336][local379];
						if (local390 != -1) {
							local442 = local390 >> 24 & 0x3;
							local454 = local390 >> 1 & 0x3;
							local460 = local390 >> 14 & 0x3FF;
							local470 = local390 >> 3 & 0x7FF;
							local472 = (local460 / 8 << 8) + (local470 / 8);
							for (@Pc(651) int local651 = 0; local651 < Static124.anIntArray394.length; local651++) {
								if (Static124.anIntArray394[local651] == local472 && Static102.aByteArrayArray71[local651] != null) {
									Static76.method1115(local454, (local470 & 0x7) * 8, local379 * 8, local275, local442, Static97.aClass42Array1, (local460 & 0x7) * 8, local336 * 8, Static102.aByteArrayArray71[local651], Static3.aClass64_1);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static119.method1770(true);
		Static39.method596();
		Static33.method548();
		Static57.method885(Static3.aClass64_1, Static97.aClass42Array1);
		Static119.method1770(true);
		local212 = Static41.anInt996;
		if (local212 > Static42.anInt1024) {
			local212 = Static42.anInt1024;
		}
		if (local212 < Static42.anInt1024 - 1) {
		}
		if (Static108.aBoolean98) {
			Static3.aClass64_1.method1433(Static41.anInt996);
		} else {
			Static3.aClass64_1.method1433(0);
		}
		for (local265 = 0; local265 < 104; local265++) {
			for (local275 = 0; local275 < 104; local275++) {
				Static66.method1958(local265, local275);
			}
		}
		Static33.method548();
		Static34.method557();
		Static88.aClass48_44.method1101();
		if (Static107.aFrame1 != null) {
			Static106.aClass8_Sub20_Sub1_3.method1907(142);
			Static106.aClass8_Sub20_Sub1_3.method1873(1057001181);
		}
		if (!Static47.aBoolean52) {
			local275 = (Static132.anInt2834 - 6) / 8;
			local379 = (Static95.anInt2249 - 6) / 8;
			local336 = (Static132.anInt2834 + 6) / 8;
			local390 = (Static95.anInt2249 + 6) / 8;
			for (local442 = local275 - 1; local442 <= local336 + 1; local442++) {
				for (local454 = local379 - 1; local454 <= local390 + 1; local454++) {
					if (local275 > local442 || local336 < local442 || local454 < local379 || local390 < local454) {
						Static36.aClass14_Sub1_6.method1146(Static44.method669(new Class34[] { Static60.aClass34_754, Static44.method672(local442), Static34.aClass34_486, Static44.method672(local454) }));
						Static36.aClass14_Sub1_6.method1146(Static44.method669(new Class34[] { Static106.aClass34_1141, Static44.method672(local442), Static34.aClass34_486, Static44.method672(local454) }));
					}
				}
			}
		}
		Static82.method1201(30);
		Static33.method548();
		Static31.method533();
		Static106.aClass8_Sub20_Sub1_3.method1907(99);
		Static79.method1141();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIILclient!h;)V")
	public static void method1953(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class8_Sub1_Sub1_Sub4_Sub1 arg2) {
		if ((arg1 & 0x40) != 0) {
			arg2.anInt2029 = Static10.aClass8_Sub20_Sub1_1.method1858();
			if (arg2.anInt2029 == 65535) {
				arg2.anInt2029 = -1;
			}
		}
		if ((arg1 & 0x1) != 0) {
			arg2.anInt2053 = Static10.aClass8_Sub20_Sub1_1.method1839();
			arg2.anInt2040 = Static10.aClass8_Sub20_Sub1_1.method1878();
		}
		@Pc(59) int local59;
		@Pc(68) int local68;
		if ((arg1 & 0x80) != 0) {
			local59 = Static10.aClass8_Sub20_Sub1_1.method1839();
			if (local59 == 65535) {
				local59 = -1;
			}
			local68 = Static10.aClass8_Sub20_Sub1_1.method1851();
			Static107.method1513(local59, arg2, local68);
		}
		if ((arg1 & 0x4) != 0) {
			arg2.aClass34_919 = Static10.aClass8_Sub20_Sub1_1.method1892();
			if (arg2.aClass34_919.method808(0) == 126) {
				arg2.aClass34_919 = arg2.aClass34_919.method835(1);
				Static108.method1530(arg2.aClass34_919, arg2.aClass34_638, 2);
			} else if (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1 == arg2) {
				Static108.method1530(arg2.aClass34_919, arg2.aClass34_638, 2);
			}
			arg2.anInt2049 = 0;
			arg2.anInt2011 = 0;
			arg2.anInt2035 = 150;
		}
		if ((arg1 & 0x100) != 0) {
			arg2.anInt2006 = Static10.aClass8_Sub20_Sub1_1.method1878();
			local59 = Static10.aClass8_Sub20_Sub1_1.method1853();
			arg2.anInt2013 = local59 >> 16;
			arg2.anInt2055 = (local59 & 0xFFFF) + Static21.anInt655;
			arg2.anInt2050 = 0;
			arg2.anInt2024 = 0;
			if (arg2.anInt2006 == 65535) {
				arg2.anInt2006 = -1;
			}
			if (Static21.anInt655 < arg2.anInt2055) {
				arg2.anInt2050 = -1;
			}
		}
		if ((arg1 & 0x10) != 0) {
			local59 = Static10.aClass8_Sub20_Sub1_1.method1878();
			local68 = Static10.aClass8_Sub20_Sub1_1.method1848();
			@Pc(198) int local198 = Static10.aClass8_Sub20_Sub1_1.method1851();
			@Pc(201) int local201 = Static10.aClass8_Sub20_Sub1_1.anInt2853;
			if (arg2.aClass34_638 != null && arg2.aClass52_1 != null) {
				@Pc(209) boolean local209 = false;
				@Pc(214) long local214 = arg2.aClass34_638.method830();
				if (local68 <= 1) {
					for (@Pc(221) int local221 = 0; local221 < Static69.anInt1679; local221++) {
						if (local214 == Static5.aLongArray2[local221]) {
							local209 = true;
							break;
						}
					}
				}
				if (!local209 && Static10.anInt226 == 0) {
					Static5.aClass8_Sub20_1.anInt2853 = 0;
					Static10.aClass8_Sub20_Sub1_1.method1846(local198, Static5.aClass8_Sub20_1.aByteArray44);
					Static5.aClass8_Sub20_1.anInt2853 = 0;
					@Pc(264) Class34 local264 = Static131.method1757(Static36.method572(Static5.aClass8_Sub20_1).method822());
					arg2.aClass34_919 = local264.method812();
					arg2.anInt2011 = local59 >> 8;
					arg2.anInt2049 = local59 & 0xFF;
					arg2.anInt2035 = 150;
					if (local68 == 2 || local68 == 3) {
						Static108.method1530(local264, Static44.method669(new Class34[] { Static8.aClass34_105, arg2.aClass34_638 }), 1);
					} else if (local68 == 1) {
						Static108.method1530(local264, Static44.method669(new Class34[] { Static101.aClass34_1107, arg2.aClass34_638 }), 1);
					} else {
						Static108.method1530(local264, arg2.aClass34_638, 2);
					}
				}
			}
			Static10.aClass8_Sub20_Sub1_1.anInt2853 = local198 + local201;
		}
		if ((arg1 & 0x400) != 0) {
			arg2.anInt2058 = Static10.aClass8_Sub20_Sub1_1.method1851();
			arg2.anInt2061 = Static10.aClass8_Sub20_Sub1_1.method1877();
			arg2.anInt2047 = Static10.aClass8_Sub20_Sub1_1.method1877();
			arg2.anInt2044 = Static10.aClass8_Sub20_Sub1_1.method1851();
			arg2.anInt2026 = Static10.aClass8_Sub20_Sub1_1.method1839() + Static21.anInt655;
			arg2.anInt2039 = Static10.aClass8_Sub20_Sub1_1.method1839() + Static21.anInt655;
			arg2.anInt2017 = Static10.aClass8_Sub20_Sub1_1.method1872();
			arg2.anInt2032 = 1;
			arg2.anInt2005 = 0;
		}
		if ((arg1 & 0x200) != 0) {
			local59 = Static10.aClass8_Sub20_Sub1_1.method1848();
			local68 = Static10.aClass8_Sub20_Sub1_1.method1877();
			arg2.method1227(local68, Static21.anInt655, local59);
			arg2.anInt2008 = Static21.anInt655 + 300;
			arg2.anInt2018 = Static10.aClass8_Sub20_Sub1_1.method1848();
			arg2.anInt2019 = Static10.aClass8_Sub20_Sub1_1.method1848();
		}
		if ((arg1 & 0x2) != 0) {
			local59 = Static10.aClass8_Sub20_Sub1_1.method1877();
			local68 = Static10.aClass8_Sub20_Sub1_1.method1872();
			arg2.method1227(local68, Static21.anInt655, local59);
			arg2.anInt2008 = Static21.anInt655 + 300;
			arg2.anInt2018 = Static10.aClass8_Sub20_Sub1_1.method1851();
			arg2.anInt2019 = Static10.aClass8_Sub20_Sub1_1.method1851();
		}
		if ((arg1 & 0x8) == 0) {
			return;
		}
		local59 = Static10.aClass8_Sub20_Sub1_1.method1872();
		@Pc(472) byte[] local472 = new byte[local59];
		@Pc(477) Class8_Sub20 local477 = new Class8_Sub20(local472);
		Static10.aClass8_Sub20_Sub1_1.method1860(local472, local59);
		Static44.aClass8_Sub20Array1[arg0] = local477;
		arg2.method736(local477);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)V")
	public static void method1954(@OriginalArg(3) boolean arg0) {
		Static134.anInt3165 = 2;
		Static23.anInt713 = 22050;
		Static23.aBoolean34 = arg0;
	}
}
