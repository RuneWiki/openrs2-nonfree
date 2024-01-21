import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
	public static int anInt1565;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "Lclient!ea;")
	private static Class18 aClass18_376 = Static8.method128("slide:");

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "Lclient!ea;")
	private static Class18 aClass18_377 = Static8.method128("Prepared sound engine");

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "Lclient!ea;")
	public static Class18 aClass18_378 = aClass18_376;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "Lclient!ea;")
	private static Class18 aClass18_379 = Static8.method128("Service unavailable)3");

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	public static int anInt1567 = 0;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "Lclient!ea;")
	private static Class18 aClass18_380 = Static8.method128("Could not complete login)3");

	@OriginalMember(owner = "client!fg", name = "C", descriptor = "Lclient!ea;")
	public static Class18 aClass18_381 = aClass18_380;

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "Lclient!ea;")
	private static Class18 aClass18_382 = Static8.method128("Loading sprites )2 ");

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "Lclient!ea;")
	public static Class18 aClass18_383 = aClass18_377;

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "Lclient!ea;")
	public static Class18 aClass18_384 = aClass18_382;

	@OriginalMember(owner = "client!fg", name = "H", descriptor = "Lclient!ea;")
	public static Class18 aClass18_385 = aClass18_376;

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "Lclient!ea;")
	public static Class18 aClass18_386 = aClass18_379;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	public static void method1036() {
		aClass18_378 = null;
		aClass18_384 = null;
		aClass18_382 = null;
		aClass18_377 = null;
		aClass18_385 = null;
		aClass18_386 = null;
		aClass18_381 = null;
		aClass18_383 = null;
		aClass18_379 = null;
		aClass18_376 = null;
		aClass18_380 = null;
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(Z)V")
	public static void method1037() {
		@Pc(6) Object local6 = Static71.anObject3;
		synchronized (Static71.anObject3) {
			if (Static121.anInt3415 == 0) {
				Static162.aClass53_4.method2271(new Class9(), 5);
			}
			Static121.anInt3415 = 600;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)Z")
	public static boolean method1038(@OriginalArg(0) int arg0) {
		if (Static110.aBooleanArray11[arg0]) {
			return true;
		} else if (Static130.aClass16_22.method2248(arg0)) {
			@Pc(25) int local25 = Static130.aClass16_22.method2252(arg0);
			if (local25 == 0) {
				Static110.aBooleanArray11[arg0] = true;
				return true;
			}
			if (Static148.aClass20ArrayArray1[arg0] == null) {
				Static148.aClass20ArrayArray1[arg0] = new Class20[local25];
			}
			for (@Pc(52) int local52 = 0; local52 < local25; local52++) {
				if (Static148.aClass20ArrayArray1[arg0][local52] == null) {
					@Pc(68) byte[] local68 = Static130.aClass16_22.method2254(local52, arg0);
					if (local68 != null) {
						Static148.aClass20ArrayArray1[arg0][local52] = new Class20();
						Static148.aClass20ArrayArray1[arg0][local52].anInt1240 = (arg0 << 16) + local52;
						if (local68[0] == -1) {
							Static148.aClass20ArrayArray1[arg0][local52].method788(new Class1_Sub6(local68));
						} else {
							Static148.aClass20ArrayArray1[arg0][local52].method783(new Class1_Sub6(local68));
						}
					}
				}
			}
			Static110.aBooleanArray11[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
	public static void method1039(@OriginalArg(1) int arg0) {
		if (!method1038(arg0)) {
			return;
		}
		@Pc(14) Class20[] local14 = Static148.aClass20ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class20 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt1195 = 0;
				local22.anInt1262 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
	public static void method1040() {
		@Pc(8) int local8;
		@Pc(16) int local16;
		@Pc(23) int local23;
		@Pc(27) int local27;
		@Pc(33) int local33;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(69) int local69;
		if (Static94.anInt2924 == 205) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method544();
			local16 = (local8 >> 4 & 0x7) + Static111.anInt3252;
			local23 = Static136.anInt3825 + (local8 & 0x7);
			local27 = Static167.aClass1_Sub6_Sub1_3.method546();
			local33 = Static167.aClass1_Sub6_Sub1_3.method544();
			local39 = local33 >> 4 & 0xF;
			local43 = local33 & 0x7;
			local47 = Static167.aClass1_Sub6_Sub1_3.method544();
			if (local16 >= 0 && local23 >= 0 && local16 < 104 && local23 < 104) {
				local69 = local39 + 1;
				if (Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0] >= local16 - local69 && Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray314[0] <= local16 + local69 && local23 - local69 <= Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0] && local23 + local69 >= Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1.anIntArray315[0] && Static97.anInt3004 != 0 && local43 > 0 && Static33.anInt1116 < 50) {
					Static101.anIntArray268[Static33.anInt1116] = local27;
					Static71.anIntArray190[Static33.anInt1116] = local43;
					Static167.anIntArray412[Static33.anInt1116] = local47;
					Static159.aClass12Array1[Static33.anInt1116] = null;
					Static124.anIntArray312[Static33.anInt1116] = local39 + (local16 << 16) + (local23 << 8);
					Static33.anInt1116++;
				}
			}
		}
		@Pc(218) Class1_Sub1_Sub5_Sub3 local218;
		if (Static94.anInt2924 == 28) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method550();
			local16 = Static167.aClass1_Sub6_Sub1_3.method518();
			local23 = Static111.anInt3252 + (local16 >> 4 & 0x7);
			local27 = Static136.anInt3825 + (local16 & 0x7);
			if (local23 >= 0 && local27 >= 0 && local23 < 104 && local27 < 104) {
				@Pc(209) Class59 local209 = Static105.aClass59ArrayArrayArray1[Static9.anInt295][local23][local27];
				if (local209 != null) {
					for (local218 = (Class1_Sub1_Sub5_Sub3) local209.method2417(); local218 != null; local218 = (Class1_Sub1_Sub5_Sub3) local209.method2424()) {
						if ((local8 & 0x7FFF) == local218.anInt1374) {
							local218.method3198();
							break;
						}
					}
					if (local209.method2417() == null) {
						Static105.aClass59ArrayArrayArray1[Static9.anInt295][local23][local27] = null;
					}
					Static8.method131(local27, local23);
				}
			}
			return;
		}
		@Pc(337) int local337;
		if (Static94.anInt2924 == 55) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method518();
			local23 = local8 & 0x3;
			local16 = local8 >> 2;
			local27 = Static66.anIntArray169[local16];
			local33 = Static167.aClass1_Sub6_Sub1_3.method544();
			local39 = Static111.anInt3252 + (local33 >> 4 & 0x7);
			local43 = (local33 & 0x7) + Static136.anInt3825;
			local47 = Static167.aClass1_Sub6_Sub1_3.method546();
			if (local39 >= 0 && local43 >= 0 && local39 < 103 && local43 < 103) {
				if (local27 == 0) {
					@Pc(328) Class75 local328 = Static87.aClass68_1.method2650(Static9.anInt295, local39, local43);
					if (local328 != null) {
						local337 = local328.anInt4208 >> 14 & 0x7FFF;
						if (local16 == 2) {
							local328.aClass1_Sub1_Sub5_5 = new Class1_Sub1_Sub5_Sub6(local337, 2, local23 + 4, Static9.anInt295, local39, local43, local47, false, local328.aClass1_Sub1_Sub5_5);
							local328.aClass1_Sub1_Sub5_6 = new Class1_Sub1_Sub5_Sub6(local337, 2, local23 + 1 & 0x3, Static9.anInt295, local39, local43, local47, false, local328.aClass1_Sub1_Sub5_6);
						} else {
							local328.aClass1_Sub1_Sub5_5 = new Class1_Sub1_Sub5_Sub6(local337, local16, local23, Static9.anInt295, local39, local43, local47, false, local328.aClass1_Sub1_Sub5_5);
						}
					}
				}
				if (local27 == 1) {
					@Pc(402) Class42 local402 = Static87.aClass68_1.method2632(Static9.anInt295, local39, local43);
					if (local402 != null) {
						local337 = local402.anInt2879 >> 14 & 0x7FFF;
						if (local16 == 4 || local16 == 5) {
							local402.aClass1_Sub1_Sub5_4 = new Class1_Sub1_Sub5_Sub6(local337, 4, local23, Static9.anInt295, local39, local43, local47, false, local402.aClass1_Sub1_Sub5_4);
						} else if (local16 == 6) {
							local402.aClass1_Sub1_Sub5_4 = new Class1_Sub1_Sub5_Sub6(local337, 4, local23 + 4, Static9.anInt295, local39, local43, local47, false, local402.aClass1_Sub1_Sub5_4);
						} else if (local16 == 7) {
							local402.aClass1_Sub1_Sub5_4 = new Class1_Sub1_Sub5_Sub6(local337, 4, (local23 + 2 & 0x3) + 4, Static9.anInt295, local39, local43, local47, false, local402.aClass1_Sub1_Sub5_4);
						} else if (local16 == 8) {
							local402.aClass1_Sub1_Sub5_4 = new Class1_Sub1_Sub5_Sub6(local337, 4, local23 + 4, Static9.anInt295, local39, local43, local47, false, local402.aClass1_Sub1_Sub5_4);
							local402.aClass1_Sub1_Sub5_3 = new Class1_Sub1_Sub5_Sub6(local337, 4, (local23 + 2 & 0x3) + 4, Static9.anInt295, local39, local43, local47, false, local402.aClass1_Sub1_Sub5_3);
						}
					}
				}
				if (local27 == 2) {
					if (local16 == 11) {
						local16 = 10;
					}
					@Pc(543) Class29 local543 = Static87.aClass68_1.method2625(Static9.anInt295, local39, local43);
					if (local543 != null) {
						local543.aClass1_Sub1_Sub5_1 = new Class1_Sub1_Sub5_Sub6(local543.anInt1869 >> 14 & 0x7FFF, local16, local23, Static9.anInt295, local39, local43, local47, false, local543.aClass1_Sub1_Sub5_1);
					}
				}
				if (local27 == 3) {
					@Pc(574) Class40 local574 = Static87.aClass68_1.method2641(Static9.anInt295, local39, local43);
					if (local574 != null) {
						local574.aClass1_Sub1_Sub5_2 = new Class1_Sub1_Sub5_Sub6(local574.anInt2747 >> 14 & 0x7FFF, 22, local23, Static9.anInt295, local39, local43, local47, false, local574.aClass1_Sub1_Sub5_2);
					}
				}
			}
			return;
		}
		@Pc(661) int local661;
		@Pc(667) int local667;
		@Pc(673) int local673;
		if (Static94.anInt2924 == 38) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method544();
			local23 = Static136.anInt3825 + (local8 & 0x7);
			local16 = (local8 >> 4 & 0x7) + Static111.anInt3252;
			local27 = local16 + Static167.aClass1_Sub6_Sub1_3.method548();
			local33 = Static167.aClass1_Sub6_Sub1_3.method548() + local23;
			local39 = Static167.aClass1_Sub6_Sub1_3.method497();
			local43 = Static167.aClass1_Sub6_Sub1_3.method546();
			local47 = Static167.aClass1_Sub6_Sub1_3.method544() * 4;
			local69 = Static167.aClass1_Sub6_Sub1_3.method544() * 4;
			local337 = Static167.aClass1_Sub6_Sub1_3.method546();
			local661 = Static167.aClass1_Sub6_Sub1_3.method546();
			local667 = Static167.aClass1_Sub6_Sub1_3.method544();
			local673 = Static167.aClass1_Sub6_Sub1_3.method544();
			if (local16 >= 0 && local23 >= 0 && local16 < 104 && local23 < 104 && local27 >= 0 && local33 >= 0 && local27 < 104 && local33 < 104 && local43 != 65535) {
				local33 = local33 * 128 + 64;
				local16 = local16 * 128 + 64;
				local23 = local23 * 128 + 64;
				@Pc(749) Class1_Sub1_Sub5_Sub2 local749 = new Class1_Sub1_Sub5_Sub2(local43, Static9.anInt295, local16, local23, Static34.method728(Static9.anInt295, local23, local16) - local47, local337 + Static41.anInt1322, Static41.anInt1322 + local661, local667, local673, local39, local69);
				local27 = local27 * 128 + 64;
				local749.method646(local27, local337 + Static41.anInt1322, local33, Static34.method728(Static9.anInt295, local33, local27) - local69);
				Static40.aClass59_16.method2411(local749);
			}
		} else if (Static94.anInt2924 == 49) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method544();
			local16 = Static111.anInt3252 + (local8 >> 4 & 0x7);
			local23 = (local8 & 0x7) + Static136.anInt3825;
			local27 = Static167.aClass1_Sub6_Sub1_3.method546();
			local33 = Static167.aClass1_Sub6_Sub1_3.method544();
			local39 = Static167.aClass1_Sub6_Sub1_3.method546();
			if (local16 >= 0 && local23 >= 0 && local16 < 104 && local23 < 104) {
				local23 = local23 * 128 + 64;
				local16 = local16 * 128 + 64;
				@Pc(857) Class1_Sub1_Sub5_Sub7 local857 = new Class1_Sub1_Sub5_Sub7(local27, Static9.anInt295, local16, local23, Static34.method728(Static9.anInt295, local23, local16) - local33, local39, Static41.anInt1322);
				Static45.aClass59_25.method2411(local857);
			}
		} else if (Static94.anInt2924 == 188) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method544();
			local16 = local8 >> 2;
			local23 = local8 & 0x3;
			local27 = Static66.anIntArray169[local16];
			local33 = Static167.aClass1_Sub6_Sub1_3.method550();
			local39 = Static167.aClass1_Sub6_Sub1_3.method533();
			local43 = (local39 >> 4 & 0x7) + Static111.anInt3252;
			local47 = Static136.anInt3825 + (local39 & 0x7);
			if (local43 >= 0 && local47 >= 0 && local43 < 104 && local47 < 104) {
				Static9.method174(local23, local33, local16, local27, Static9.anInt295, local47, -1, local43, 0);
			}
		} else if (Static94.anInt2924 == 191) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method544();
			local16 = Static111.anInt3252 + (local8 >> 4 & 0x7);
			local23 = (local8 & 0x7) + Static136.anInt3825;
			local27 = Static167.aClass1_Sub6_Sub1_3.method546();
			local33 = Static167.aClass1_Sub6_Sub1_3.method546();
			local39 = Static167.aClass1_Sub6_Sub1_3.method550();
			if (local16 >= 0 && local23 >= 0 && local16 < 104 && local23 < 104 && Static40.anInt1308 != local33) {
				@Pc(1010) Class1_Sub1_Sub5_Sub3 local1010 = new Class1_Sub1_Sub5_Sub3();
				local1010.anInt1370 = local39;
				local1010.anInt1374 = local27;
				if (Static105.aClass59ArrayArrayArray1[Static9.anInt295][local16][local23] == null) {
					Static105.aClass59ArrayArrayArray1[Static9.anInt295][local16][local23] = new Class59();
				}
				Static105.aClass59ArrayArrayArray1[Static9.anInt295][local16][local23].method2411(local1010);
				Static8.method131(local23, local16);
			}
		} else if (Static94.anInt2924 == 220) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method544();
			local23 = (local8 & 0x7) + Static136.anInt3825;
			local16 = (local8 >> 4 & 0x7) + Static111.anInt3252;
			local27 = Static167.aClass1_Sub6_Sub1_3.method546();
			local33 = Static167.aClass1_Sub6_Sub1_3.method546();
			local39 = Static167.aClass1_Sub6_Sub1_3.method546();
			if (local16 >= 0 && local23 >= 0 && local16 < 104 && local23 < 104) {
				@Pc(1112) Class59 local1112 = Static105.aClass59ArrayArrayArray1[Static9.anInt295][local16][local23];
				if (local1112 != null) {
					for (@Pc(1119) Class1_Sub1_Sub5_Sub3 local1119 = (Class1_Sub1_Sub5_Sub3) local1112.method2417(); local1119 != null; local1119 = (Class1_Sub1_Sub5_Sub3) local1112.method2424()) {
						if (local1119.anInt1374 == (local27 & 0x7FFF) && local33 == local1119.anInt1370) {
							local1119.anInt1370 = local39;
							break;
						}
					}
					Static8.method131(local23, local16);
				}
			}
		} else if (Static94.anInt2924 == 86) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method498();
			local16 = local8 >> 2;
			local23 = local8 & 0x3;
			local27 = Static66.anIntArray169[local16];
			local33 = Static167.aClass1_Sub6_Sub1_3.method498();
			local43 = (local33 & 0x7) + Static136.anInt3825;
			local39 = (local33 >> 4 & 0x7) + Static111.anInt3252;
			if (local39 >= 0 && local43 >= 0 && local39 < 104 && local43 < 104) {
				Static9.method174(local23, -1, local16, local27, Static9.anInt295, local43, -1, local39, 0);
			}
		} else if (Static94.anInt2924 == 7) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method544();
			local23 = (local8 & 0x7) + Static136.anInt3825;
			local16 = Static111.anInt3252 + (local8 >> 4 & 0x7);
			local27 = Static167.aClass1_Sub6_Sub1_3.method546();
			local33 = Static167.aClass1_Sub6_Sub1_3.method522();
			if (local16 >= 0 && local23 >= 0 && local16 < 104 && local23 < 104) {
				local218 = new Class1_Sub1_Sub5_Sub3();
				local218.anInt1370 = local33;
				local218.anInt1374 = local27;
				if (Static105.aClass59ArrayArrayArray1[Static9.anInt295][local16][local23] == null) {
					Static105.aClass59ArrayArrayArray1[Static9.anInt295][local16][local23] = new Class59();
				}
				Static105.aClass59ArrayArrayArray1[Static9.anInt295][local16][local23].method2411(local218);
				Static8.method131(local23, local16);
			}
		} else if (Static94.anInt2924 == 18) {
			local8 = Static167.aClass1_Sub6_Sub1_3.method544();
			local23 = local8 & 0x3;
			local16 = local8 >> 2;
			local27 = Static66.anIntArray169[local16];
			@Pc(1339) byte local1339 = Static167.aClass1_Sub6_Sub1_3.method506();
			@Pc(1343) byte local1343 = Static167.aClass1_Sub6_Sub1_3.method548();
			local43 = Static167.aClass1_Sub6_Sub1_3.method518();
			local47 = Static111.anInt3252 + (local43 >> 4 & 0x7);
			local69 = (local43 & 0x7) + Static136.anInt3825;
			local337 = Static167.aClass1_Sub6_Sub1_3.method550();
			local661 = Static167.aClass1_Sub6_Sub1_3.method546();
			local667 = Static167.aClass1_Sub6_Sub1_3.method550();
			local673 = Static167.aClass1_Sub6_Sub1_3.method541();
			@Pc(1385) byte local1385 = Static167.aClass1_Sub6_Sub1_3.method507();
			@Pc(1389) byte local1389 = Static167.aClass1_Sub6_Sub1_3.method504();
			@Pc(1398) Class1_Sub1_Sub5_Sub1_Sub2 local1398;
			if (local667 == Static40.anInt1308) {
				local1398 = Static170.aClass1_Sub1_Sub5_Sub1_Sub2_1;
			} else {
				local1398 = Static153.aClass1_Sub1_Sub5_Sub1_Sub2Array1[local667];
			}
			if (local1398 != null) {
				@Pc(1410) Class1_Sub1_Sub11 local1410 = Static62.method1274(local661);
				@Pc(1422) int local1422;
				@Pc(1419) int local1419;
				if (local23 == 1 || local23 == 3) {
					local1419 = local1410.anInt2815;
					local1422 = local1410.anInt2822;
				} else {
					local1422 = local1410.anInt2815;
					local1419 = local1410.anInt2822;
				}
				@Pc(1436) int local1436 = (local1422 >> 1) + local47;
				@Pc(1442) int local1442 = (local1419 >> 1) + local69;
				@Pc(1450) int local1450 = local69 + (local1419 + 1 >> 1);
				@Pc(1454) int[][] local1454 = Static135.anIntArrayArrayArray5[Static9.anInt295];
				@Pc(1462) int local1462 = local47 + (local1422 + 1 >> 1);
				@Pc(1471) int local1471 = (local47 << 7) + (local1422 << 6);
				@Pc(1498) int local1498 = local1454[local1462][local1450] + local1454[local1436][local1442] + local1454[local1462][local1442] + local1454[local1436][local1450] >> 2;
				@Pc(1506) int local1506 = (local1419 << 6) + (local69 << 7);
				@Pc(1516) Class1_Sub1_Sub5_Sub4 local1516 = local1410.method1963(local23, local1454, local1471, local1498, local1506, local16);
				if (local1516 != null) {
					@Pc(1523) byte local1523;
					if (local1343 < local1385) {
						local1523 = local1385;
						local1385 = local1343;
						local1343 = local1523;
					}
					if (local1389 > local1339) {
						local1523 = local1389;
						local1389 = local1339;
						local1339 = local1523;
					}
					Static9.method174(0, -1, 0, local27, Static9.anInt295, local69, local337 + 1, local47, local673 + 1);
					local1398.aClass1_Sub1_Sub5_Sub4_1 = local1516;
					local1398.anInt3624 = Static41.anInt1322 + local673;
					local1398.anInt3629 = local1343 + local47;
					local1398.anInt3623 = local69 + local1389;
					local1398.anInt3612 = Static41.anInt1322 + local337;
					local1398.anInt3630 = local69 * 128 + local1419 * 64;
					local1398.anInt3626 = local47 * 128 + local1422 * 64;
					local1398.anInt3618 = local69 + local1339;
					local1398.anInt3611 = local1498;
					local1398.anInt3609 = local47 + local1385;
					return;
				}
			}
		}
	}
}
