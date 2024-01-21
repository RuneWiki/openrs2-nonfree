import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!p", name = "cb", descriptor = "I")
	public static int anInt1836;

	@OriginalMember(owner = "client!p", name = "eb", descriptor = "I")
	public static int anInt1837;

	@OriginalMember(owner = "client!p", name = "ib", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!p", name = "lb", descriptor = "I")
	public static int anInt1840;

	@OriginalMember(owner = "client!p", name = "db", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1024 = Static75.method1216("leuchten1:");

	@OriginalMember(owner = "client!p", name = "nb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1027 = Static75.method1216("red:");

	@OriginalMember(owner = "client!p", name = "jb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1025 = aClass4_1027;

	@OriginalMember(owner = "client!p", name = "kb", descriptor = "Lclient!rc;")
	public static Class3_Sub1_Sub14 aClass3_Sub1_Sub14_1 = null;

	@OriginalMember(owner = "client!p", name = "mb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1026 = Static75.method1216("Fps:");

	@OriginalMember(owner = "client!p", name = "ob", descriptor = "I")
	public static int anInt1841 = -1;

	@OriginalMember(owner = "client!p", name = "pb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1028 = Static75.method1216("compass");

	@OriginalMember(owner = "client!p", name = "qb", descriptor = "I")
	public static int anInt1842 = 0;

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	public static void method1240() {
		Static83.anInt1934 = 0;
		@Pc(73) int local73;
		for (@Pc(9) int local9 = -1; local9 < Static29.anInt905 + Static11.anInt2841; local9++) {
			@Pc(16) Class3_Sub1_Sub1_Sub1 local16;
			if (local9 == -1) {
				local16 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1;
			} else if (Static11.anInt2841 <= local9) {
				local16 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[Static24.anIntArray40[local9 - Static11.anInt2841]];
			} else {
				local16 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static92.anIntArray270[local9]];
			}
			if (local16 != null && local16.method1552()) {
				@Pc(53) Class3_Sub1_Sub17 local53;
				if (local16 instanceof Class3_Sub1_Sub1_Sub1_Sub1) {
					local53 = ((Class3_Sub1_Sub1_Sub1_Sub1) local16).aClass3_Sub1_Sub17_1;
					if (local53.anIntArray307 != null) {
						local53 = local53.method1676();
					}
					if (local53 == null) {
						continue;
					}
				}
				if (local9 >= Static11.anInt2841) {
					local53 = ((Class3_Sub1_Sub1_Sub1_Sub1) local16).aClass3_Sub1_Sub17_1;
					if (local53.anInt2494 >= 0 && local53.anInt2494 < Static74.aClass3_Sub1_Sub4_Sub2Array10.length) {
						Static32.method631(local16, local16.anInt2296 + 15);
						if (Static78.anInt454 > -1) {
							Static74.aClass3_Sub1_Sub4_Sub2Array10[local53.anInt2494].method1733(Static78.anInt454 - 12, Static82.anInt1907 + -30);
						}
					}
					if (Static82.anInt1908 == 1 && Static23.anInt504 == Static24.anIntArray40[local9 - Static11.anInt2841] && Static60.anInt1489 % 20 < 10) {
						Static32.method631(local16, local16.anInt2296 + 15);
						if (Static78.anInt454 > -1) {
							Static35.aClass3_Sub1_Sub4_Sub2Array6[0].method1733(Static78.anInt454 - 12, Static82.anInt1907 + -28);
						}
					}
				} else {
					local73 = 30;
					@Pc(76) Class3_Sub1_Sub1_Sub1_Sub2 local76 = (Class3_Sub1_Sub1_Sub1_Sub2) local16;
					if (local76.anInt2359 != -1 || local76.anInt2365 != -1) {
						Static32.method631(local16, local16.anInt2296 + 15);
						if (Static78.anInt454 > -1) {
							if (local76.anInt2359 != -1) {
								Static66.aClass3_Sub1_Sub4_Sub2Array9[local76.anInt2359].method1733(Static78.anInt454 - 12, Static82.anInt1907 - 30);
								local73 += 25;
							}
							if (local76.anInt2365 != -1) {
								Static74.aClass3_Sub1_Sub4_Sub2Array10[local76.anInt2365].method1733(Static78.anInt454 - 12, Static82.anInt1907 + -local73);
								local73 += 25;
							}
						}
					}
					if (local9 >= 0 && Static82.anInt1908 == 10 && Static92.anIntArray270[local9] == Static36.anInt1039) {
						Static32.method631(local16, local16.anInt2296 + 15);
						if (Static78.anInt454 > -1) {
							Static35.aClass3_Sub1_Sub4_Sub2Array6[1].method1733(Static78.anInt454 - 12, Static82.anInt1907 + -local73);
						}
					}
				}
				if (local16.aClass4_1294 != null && (Static11.anInt2841 <= local9 || Static58.anInt1429 == 0 || Static58.anInt1429 == 3 || Static58.anInt1429 == 1 && Static111.method1898(((Class3_Sub1_Sub1_Sub1_Sub2) local16).aClass4_1302))) {
					Static32.method631(local16, local16.anInt2296);
					if (Static78.anInt454 > -1 && Static87.anInt1452 > Static83.anInt1934) {
						Static87.anIntArray207[Static83.anInt1934] = Static113.aClass3_Sub1_Sub4_Sub4_3.method1859(local16.aClass4_1294) / 2;
						Static87.anIntArray208[Static83.anInt1934] = Static113.aClass3_Sub1_Sub4_Sub4_3.anInt2731;
						Static87.anIntArray201[Static83.anInt1934] = Static78.anInt454;
						Static87.anIntArray204[Static83.anInt1934] = Static82.anInt1907;
						Static87.anIntArray206[Static83.anInt1934] = local16.anInt2341;
						Static87.anIntArray202[Static83.anInt1934] = local16.anInt2294;
						Static87.anIntArray203[Static83.anInt1934] = local16.anInt2330;
						Static87.aClass4Array11[Static83.anInt1934] = local16.aClass4_1294;
						Static83.anInt1934++;
					}
				}
				if (local16.anInt2328 > Static60.anInt1489) {
					Static32.method631(local16, local16.anInt2296 + 15);
					if (Static78.anInt454 > -1) {
						local73 = local16.anInt2344 * 30 / local16.anInt2292;
						if (local73 > 30) {
							local73 = 30;
						}
						Static50.method1840(Static78.anInt454 - 15, Static82.anInt1907 + -3, local73, 5, 65280);
						Static50.method1840(Static78.anInt454 + local73 - 15, Static82.anInt1907 - 3, 30 - local73, 5, 16711680);
					}
				}
				for (local73 = 0; local73 < 4; local73++) {
					if (Static60.anInt1489 < local16.anIntArray290[local73]) {
						Static32.method631(local16, local16.anInt2296 / 2);
						if (Static78.anInt454 > -1) {
							if (local73 == 1) {
								Static82.anInt1907 -= 20;
							}
							if (local73 == 2) {
								Static82.anInt1907 -= 10;
								Static78.anInt454 -= 15;
							}
							if (local73 == 3) {
								Static78.anInt454 += 15;
								Static82.anInt1907 -= 10;
							}
							Static78.aClass3_Sub1_Sub4_Sub2Array3[local16.anIntArray287[local73]].method1733(Static78.anInt454 - 12, Static82.anInt1907 + -12);
							Static45.aClass3_Sub1_Sub4_Sub4_1.method1869(Static93.method1632(local16.anIntArray291[local73]), Static78.anInt454, Static82.anInt1907 + 4, 0);
							Static45.aClass3_Sub1_Sub4_Sub4_1.method1869(Static93.method1632(local16.anIntArray291[local73]), Static78.anInt454 - 1, Static82.anInt1907 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(494) int local494 = 0; local494 < Static83.anInt1934; local494++) {
			local73 = Static87.anIntArray201[local494];
			@Pc(504) int local504 = Static87.anIntArray204[local494];
			@Pc(506) boolean local506 = true;
			@Pc(510) int local510 = Static87.anIntArray208[local494];
			@Pc(514) int local514 = Static87.anIntArray207[local494];
			while (local506) {
				local506 = false;
				for (@Pc(520) int local520 = 0; local520 < local494; local520++) {
					if (Static87.anIntArray204[local520] - Static87.anIntArray208[local520] < local504 - -2 && local504 - local510 < Static87.anIntArray204[local520] - -2 && local73 - local514 < Static87.anIntArray201[local520] + Static87.anIntArray207[local520] && local73 + local514 > -Static87.anIntArray207[local520] + Static87.anIntArray201[local520] && Static87.anIntArray204[local520] - Static87.anIntArray208[local520] < local504) {
						local506 = true;
						local504 = Static87.anIntArray204[local520] - Static87.anIntArray208[local520];
					}
				}
			}
			Static78.anInt454 = Static87.anIntArray201[local494];
			Static82.anInt1907 = Static87.anIntArray204[local494] = local504;
			@Pc(625) Class4 local625 = Static87.aClass4Array11[local494];
			if (Static98.anInt2369 == 0) {
				@Pc(645) int local645 = 16776960;
				if (Static87.anIntArray206[local494] < 6) {
					local645 = Static73.anIntArray235[Static87.anIntArray206[local494]];
				}
				if (Static87.anIntArray206[local494] == 6) {
					local645 = Static30.anInt942 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static87.anIntArray206[local494] == 7) {
					local645 = Static30.anInt942 % 20 < 10 ? 255 : 65535;
				}
				if (Static87.anIntArray206[local494] == 8) {
					local645 = Static30.anInt942 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(720) int local720;
				if (Static87.anIntArray206[local494] == 9) {
					local720 = 150 - Static87.anIntArray203[local494];
					if (local720 < 50) {
						local645 = local720 * 1280 + 16711680;
					} else if (local720 < 100) {
						local645 = 16776960 - (local720 - 50) * 327680;
					} else if (local720 < 150) {
						local645 = (local720 - 100) * 5 + 65280;
					}
				}
				if (Static87.anIntArray206[local494] == 10) {
					local720 = 150 - Static87.anIntArray203[local494];
					if (local720 < 50) {
						local645 = local720 * 5 + 16711680;
					} else if (local720 < 100) {
						local645 = 16384000 + 16711935 - local720 * 327680;
					} else if (local720 < 150) {
						local645 = (local720 - 100) * 327680 + 255 - (local720 + -100) * 5;
					}
				}
				if (Static87.anIntArray206[local494] == 11) {
					local720 = 150 - Static87.anIntArray203[local494];
					if (local720 < 50) {
						local645 = 16777215 - local720 * 327685;
					} else if (local720 < 100) {
						local645 = local720 * 327685 + 65280 - 16384250;
					} else if (local720 < 150) {
						local645 = 16777215 - (local720 - 100) * 327680;
					}
				}
				if (Static87.anIntArray202[local494] == 0) {
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(local625, Static78.anInt454, Static82.anInt1907 + 1, 0);
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(local625, Static78.anInt454, Static82.anInt1907, local645);
				}
				if (Static87.anIntArray202[local494] == 1) {
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1854(local625, Static78.anInt454, Static82.anInt1907 + 1, 0, Static30.anInt942);
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1854(local625, Static78.anInt454, Static82.anInt1907, local645, Static30.anInt942);
				}
				if (Static87.anIntArray202[local494] == 2) {
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1853(local625, Static78.anInt454, Static82.anInt1907 + 1, 0, Static30.anInt942);
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1853(local625, Static78.anInt454, Static82.anInt1907, local645, Static30.anInt942);
				}
				if (Static87.anIntArray202[local494] == 3) {
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1865(local625, Static78.anInt454, Static82.anInt1907 + 1, 0, Static30.anInt942, 150 - Static87.anIntArray203[local494]);
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1865(local625, Static78.anInt454, Static82.anInt1907, local645, Static30.anInt942, 150 - Static87.anIntArray203[local494]);
				}
				@Pc(989) int local989;
				if (Static87.anIntArray202[local494] == 4) {
					local720 = Static113.aClass3_Sub1_Sub4_Sub4_3.method1859(local625);
					local989 = (local720 + 100) * (-Static87.anIntArray203[local494] + 150) / 150;
					Static50.method1851(Static78.anInt454 - 50, 0, Static78.anInt454 + 50, 334);
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1866(local625, Static78.anInt454 + 50 - local989, Static82.anInt1907 + 1, 0);
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1866(local625, Static78.anInt454 + 50 - local989, Static82.anInt1907, local645);
					Static50.method1847();
				}
				if (Static87.anIntArray202[local494] == 5) {
					local720 = 150 - Static87.anIntArray203[local494];
					Static50.method1851(0, Static82.anInt1907 - Static113.aClass3_Sub1_Sub4_Sub4_3.anInt2731 - 1, 512, Static82.anInt1907 + 5);
					local989 = 0;
					if (local720 < 25) {
						local989 = local720 - 25;
					} else if (local720 > 125) {
						local989 = local720 - 125;
					}
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(local625, Static78.anInt454, Static82.anInt1907 + local989 + 1, 0);
					Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(local625, Static78.anInt454, Static82.anInt1907 + local989, local645);
					Static50.method1847();
				}
			} else {
				Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(local625, Static78.anInt454, Static82.anInt1907 + 1, 0);
				Static113.aClass3_Sub1_Sub4_Sub4_3.method1869(local625, Static78.anInt454, Static82.anInt1907, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V")
	public static void method1241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
			Static78.anInt454 = -1;
			Static82.anInt1907 = -1;
			return;
		}
		@Pc(37) int local37 = Static82.method1293(arg2, Static49.anInt1203, arg0) - arg1;
		@Pc(41) int local41 = local37 - Static61.anInt1536;
		@Pc(45) int local45 = Static41.anIntArray149[Static106.anInt2666];
		@Pc(49) int local49 = arg2 - Static113.anInt2853;
		@Pc(53) int local53 = arg0 - Static9.anInt314;
		@Pc(57) int local57 = Static41.anIntArray142[Static106.anInt2666];
		@Pc(61) int local61 = Static41.anIntArray149[Static47.anInt1186];
		@Pc(70) int local70 = Static41.anIntArray142[Static47.anInt1186];
		@Pc(80) int local80 = local49 * local70 + local53 * local61 >> 16;
		@Pc(90) int local90 = local70 * local53 - local61 * local49 >> 16;
		@Pc(92) int local92 = local80;
		@Pc(103) int local103 = local57 * local41 - local90 * local45 >> 16;
		@Pc(113) int local113 = local57 * local90 + local45 * local41 >> 16;
		if (local113 >= 50) {
			Static82.anInt1907 = (local103 << 9) / local113 + 167;
			Static78.anInt454 = (local92 << 9) / local113 + 256;
		} else {
			Static78.anInt454 = -1;
			Static82.anInt1907 = -1;
		}
	}

	@OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
	public static void method1242() {
		aClass3_Sub1_Sub14_1 = null;
		aClass4_1027 = null;
		aClass4_1028 = null;
		aClass4_1026 = null;
		aFontMetrics1 = null;
		aClass4_1025 = null;
		aClass4_1024 = null;
	}
}
