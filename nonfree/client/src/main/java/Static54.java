import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array9;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "Lclient!bd;")
	public static Class8 aClass8_19;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	public static int anInt1773;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!a;")
	private static Class1 aClass1_1827 = Static94.method1596("Loading game screen )2 ");

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_1828 = Static94.method1596("invback");

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_1829 = Static94.method1596(")2");

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "Lclient!a;")
	public static Class1 aClass1_1830 = Static94.method1596("sich mit einer anderen Welt zu verbinden)3");

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!a;")
	public static Class1 aClass1_1831 = Static94.method1596("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "Lclient!a;")
	private static Class1 aClass1_1832 = Static94.method1596("Offline");

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
	public static int anInt1771 = 0;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "Lclient!a;")
	private static Class1 aClass1_1833 = Static94.method1596("Take");

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "Lclient!a;")
	public static Class1 aClass1_1834 = aClass1_1832;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "Lclient!a;")
	public static Class1 aClass1_1835 = aClass1_1833;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "[I")
	public static int[] anIntArray182 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "Lclient!a;")
	public static Class1 aClass1_1836 = aClass1_1827;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	private static void method1219() {
		Static80.anInt2129++;
		Static97.method1656(true);
		Static96.method1635(true);
		Static97.method1656(false);
		Static96.method1635(false);
		Static43.method995();
		Static102.method1722();
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (!Static68.aBoolean105) {
			local29 = Static110.anInt2777;
			if (Static50.anInt1637 / 256 > local29) {
				local29 = Static50.anInt1637 / 256;
			}
			local44 = Static94.anInt2376 + Static93.anInt2361 & 0x7FF;
			if (Static18.aBooleanArray5[4] && Static55.anIntArray85[4] + 128 > local29) {
				local29 = Static55.anIntArray85[4] + 128;
			}
			Static82.method1496(local29, Static41.anInt1395, Static65.method1338(Static2.anInt287, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717) - 50, local44, Static62.anInt1878, local29 * 3 + 600);
		}
		if (Static68.aBoolean105) {
			local29 = Static14.method451();
		} else {
			local29 = Static18.method525();
		}
		local44 = Static21.anInt916;
		@Pc(95) int local95 = Static4.anInt376;
		@Pc(97) int local97 = Static59.anInt1824;
		@Pc(99) int local99 = Static47.anInt1561;
		@Pc(101) int local101 = Static41.anInt1396;
		for (@Pc(103) int local103 = 0; local103 < 5; local103++) {
			if (Static18.aBooleanArray5[local103]) {
				@Pc(144) int local144 = (int) ((double) (Static12.anIntArray335[local103] * 2 + 1) * Math.random() - (double) Static12.anIntArray335[local103] + Math.sin((double) Static33.anIntArray124[local103] * ((double) Static94.anIntArray294[local103] / 100.0D)) * (double) Static55.anIntArray85[local103]);
				if (local103 == 1) {
					Static59.anInt1824 += local144;
				}
				if (local103 == 0) {
					Static21.anInt916 += local144;
				}
				if (local103 == 2) {
					Static41.anInt1396 += local144;
				}
				if (local103 == 4) {
					Static47.anInt1561 += local144;
					if (Static47.anInt1561 < 128) {
						Static47.anInt1561 = 128;
					}
					if (Static47.anInt1561 > 383) {
						Static47.anInt1561 = 383;
					}
				}
				if (local103 == 3) {
					Static4.anInt376 = local144 + Static4.anInt376 & 0x7FF;
				}
			}
		}
		Static110.method1795();
		Static75.anInt2041 = Static84.anInt2248 - 4;
		Static75.aBoolean112 = true;
		Static75.anInt2046 = Static22.anInt930 - 4;
		Static75.anInt2045 = 0;
		Static92.method1127();
		Static109.aClass3_1.method129(Static21.anInt916, Static59.anInt1824, Static41.anInt1396, Static47.anInt1561, Static4.anInt376, local29);
		Static109.aClass3_1.method136();
		Static60.method1277();
		Static52.method1190();
		((Class38) Static24.anInterface4_1).method1314(Static8.anInt509);
		Static89.method1566();
		if (Static34.aBoolean62 && method1234() == 0) {
			Static34.aBoolean62 = false;
		}
		if (Static34.aBoolean62) {
			Static110.method1795();
			Static92.method1127();
			Static85.method1537(Static112.aClass1_2901, false, null);
		}
		Static2.method120();
		Static21.anInt916 = local44;
		Static41.anInt1396 = local101;
		Static4.anInt376 = local95;
		Static47.anInt1561 = local99;
		Static59.anInt1824 = local97;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public static void method1220() {
		Static67.anInt2767 = 0;
		Static27.anInt1037 = 0;
		Static67.method1785();
		Static56.method1239();
		Static62.method1300();
		Static80.method1485();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static27.anInt1037; local19++) {
			local25 = Static10.anIntArray317[local19];
			if (Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local25].anInt2755 != Static69.anInt2806) {
				Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local25] = null;
			}
		}
		if (Static13.aClass2_Sub3_Sub1_1.anInt1168 != Static83.anInt2224) {
			throw new RuntimeException("gpp1 pos:" + Static13.aClass2_Sub3_Sub1_1.anInt1168 + " psize:" + Static83.anInt2224);
		}
		for (local25 = 0; local25 < Static99.anInt2521; local25++) {
			if (Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[Static93.anIntArray292[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static99.anInt2521);
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIII)V")
	public static void method1221(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = (arg3 - 32) * arg3 / arg1;
		Static10.aClass2_Sub1_Sub2_Sub2Array10[0].method637(arg2, arg4);
		Static10.aClass2_Sub1_Sub2_Sub2Array10[1].method637(arg2, arg4 + arg3 - 16);
		Static92.method1120(arg2, arg4 + 16, 16, arg3 - 32, Static90.anInt2334);
		if (local7 < 8) {
			local7 = 8;
		}
		@Pc(58) int local58 = (arg3 - local7 - 32) * arg0 / (arg1 - arg3);
		Static92.method1120(arg2, arg4 + local58 + 16, 16, local7, Static13.anInt652);
		Static92.method1132(arg2, arg4 + local58 + 16, local7, Static111.anInt2783);
		Static92.method1132(arg2 + 1, local58 + arg4 + 16, local7, Static111.anInt2783);
		Static92.method1123(arg2, local58 + arg4 + 16, 16, Static111.anInt2783);
		Static92.method1123(arg2, arg4 + local58 + 17, 16, Static111.anInt2783);
		Static92.method1132(arg2 + 15, arg4 - -16 - -local58, local7, Static91.anInt2346);
		Static92.method1132(arg2 + 14, local58 + 17 + arg4, local7 - 1, Static91.anInt2346);
		Static92.method1123(arg2, local7 + local58 + arg4 + 15, 16, Static91.anInt2346);
		Static92.method1123(arg2 + 1, arg4 + 14 - -local58 + local7, 15, Static91.anInt2346);
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method1222() {
		aClass1_1830 = null;
		aClass2_Sub1_Sub2_Sub4Array9 = null;
		aClass1_1833 = null;
		aClass8_19 = null;
		aClass1_1828 = null;
		aClass1_1832 = null;
		aClass1_1831 = null;
		aClass1_1836 = null;
		aClass1_1835 = null;
		anIntArray182 = null;
		aClass1_1834 = null;
		aClass1_1829 = null;
		aClass1_1827 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!bd;ILclient!bd;)V")
	public static void method1223(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class8 arg1) {
		Static94.aClass8_23 = arg1;
		Static112.aClass8_30 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public static void method1224(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static32.anIntArray123[arg0];
		@Pc(16) int local16 = Static98.anIntArray311[arg0];
		@Pc(20) int local20 = Static66.anIntArray290[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(28) int local28 = Static60.anIntArray196[arg0];
		if (Static95.anInt2396 != 0 && local20 != 1005) {
			Static95.anInt2396 = 0;
			Static87.aBoolean137 = true;
		}
		if (local20 == 37) {
			Static59.aClass2_Sub3_Sub1_2.method841(21);
			Static59.aClass2_Sub3_Sub1_2.method817(Static99.anInt2527);
			Static59.aClass2_Sub3_Sub1_2.method826(local16);
			Static59.aClass2_Sub3_Sub1_2.method797(local28);
			Static59.aClass2_Sub3_Sub1_2.method797(local12);
			Static18.anInt841 = 2;
			Static87.anInt2299 = local12;
			Static38.anInt1376 = 0;
			if (Static111.anInt2784 == local16 >> 16) {
				Static18.anInt841 = 1;
			}
			Static57.anInt1792 = local16;
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
		}
		@Pc(118) boolean local118;
		if (local20 == 38) {
			local118 = Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			if (!local118) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			}
			Static29.anInt1086 = 0;
			Static14.anInt680 = Static1.anInt13;
			Static100.anInt2546 = Static93.anInt2360;
			Static76.anInt2064 = 2;
			Static59.aClass2_Sub3_Sub1_2.method841(190);
			Static59.aClass2_Sub3_Sub1_2.method801(local12 + Static25.anInt1022);
			Static59.aClass2_Sub3_Sub1_2.method797(local28);
			Static59.aClass2_Sub3_Sub1_2.method797(local16 + Static47.anInt1563);
		}
		if (local20 == 1004) {
			Static14.anInt680 = Static1.anInt13;
			Static100.anInt2546 = Static93.anInt2360;
			Static76.anInt2064 = 2;
			Static29.anInt1086 = 0;
			Static59.aClass2_Sub3_Sub1_2.method841(148);
			Static59.aClass2_Sub3_Sub1_2.method809(local28 >> 14 & 0x7FFF);
		}
		if (local20 == 27) {
			Static42.method983(local12, local28, local16);
			Static59.aClass2_Sub3_Sub1_2.method841(229);
			Static59.aClass2_Sub3_Sub1_2.method809(Static25.anInt1022 + local12);
			Static59.aClass2_Sub3_Sub1_2.method809(local28 >> 14 & 0x7FFF);
			Static59.aClass2_Sub3_Sub1_2.method809(Static47.anInt1563 + local16);
		}
		@Pc(246) Class2_Sub1_Sub1_Sub1_Sub1 local246;
		if (local20 == 1) {
			local246 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local28];
			if (local246 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local246.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local246.anIntArray343[0], 2);
				Static100.anInt2546 = Static93.anInt2360;
				Static29.anInt1086 = 0;
				Static76.anInt2064 = 2;
				Static14.anInt680 = Static1.anInt13;
				Static59.aClass2_Sub3_Sub1_2.method841(221);
				Static59.aClass2_Sub3_Sub1_2.method810(Static99.anInt2527);
				Static59.aClass2_Sub3_Sub1_2.method809(local28);
			}
		}
		@Pc(317) int local317;
		@Pc(340) int local340;
		@Pc(312) Class1 local312;
		if (local20 == 26 || local20 == 46) {
			local312 = Static84.aClass1Array20[arg0];
			local317 = local312.method11(Static47.aClass1_1511);
			if (local317 != -1) {
				local312 = local312.method1(local317 + 5).method40();
				@Pc(336) Class1 local336 = local312.method13().method36();
				@Pc(338) boolean local338 = false;
				for (local340 = 0; local340 < Static99.anInt2521; local340++) {
					@Pc(348) Class2_Sub1_Sub1_Sub1_Sub1 local348 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[Static93.anIntArray292[local340]];
					if (local348 != null && local348.aClass1_264 != null && local348.aClass1_264.method14(local336)) {
						local338 = true;
						Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local348.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local348.anIntArray343[0], 2);
						if (local20 == 26) {
							Static59.aClass2_Sub3_Sub1_2.method841(96);
							Static59.aClass2_Sub3_Sub1_2.method816(Static93.anIntArray292[local340]);
						}
						if (local20 == 46) {
							Static59.aClass2_Sub3_Sub1_2.method841(68);
							Static59.aClass2_Sub3_Sub1_2.method809(Static93.anIntArray292[local340]);
						}
						break;
					}
				}
				if (!local338) {
					Static73.method1372(0, Static97.method1655(new Class1[] { Static21.aClass1_849, local336 }), Static111.aClass1_2898);
				}
			}
		}
		if (local20 == 55) {
			Static59.aClass2_Sub3_Sub1_2.method841(26);
			Static59.aClass2_Sub3_Sub1_2.method816(local12);
			Static59.aClass2_Sub3_Sub1_2.method817(local16);
			Static59.aClass2_Sub3_Sub1_2.method816(local28);
			Static57.anInt1792 = local16;
			Static38.anInt1376 = 0;
			Static87.anInt2299 = local12;
			Static18.anInt841 = 2;
			if (local16 >> 16 == Static111.anInt2784) {
				Static18.anInt841 = 1;
			}
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
		}
		if (local20 == 53) {
			Static59.aClass2_Sub3_Sub1_2.method841(38);
			Static59.aClass2_Sub3_Sub1_2.method816(local28);
			Static59.aClass2_Sub3_Sub1_2.method809(local12);
			Static59.aClass2_Sub3_Sub1_2.method810(local16);
			Static87.anInt2299 = local12;
			Static18.anInt841 = 2;
			Static38.anInt1376 = 0;
			Static57.anInt1792 = local16;
			if (Static111.anInt2784 == local16 >> 16) {
				Static18.anInt841 = 1;
			}
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
		}
		@Pc(570) Class2_Sub1_Sub14 local570;
		if (local20 == 57) {
			Static59.aClass2_Sub3_Sub1_2.method841(64);
			Static59.aClass2_Sub3_Sub1_2.method829(local16);
			local570 = Static113.method1526(local16);
			if (local570.anIntArrayArray19 != null && local570.anIntArrayArray19[0][0] == 5) {
				local317 = local570.anIntArrayArray19[0][1];
				if (local570.anIntArray277[0] != Static94.anIntArray295[local317]) {
					Static94.anIntArray295[local317] = local570.anIntArray277[0];
					Static40.method1085(local317);
					Static34.aBoolean60 = true;
				}
			}
		}
		if (local20 == 52) {
			Static59.aClass2_Sub3_Sub1_2.method841(240);
			Static59.aClass2_Sub3_Sub1_2.method801(local12);
			Static59.aClass2_Sub3_Sub1_2.method809(local28);
			Static59.aClass2_Sub3_Sub1_2.method826(local16);
			Static87.anInt2299 = local12;
			Static57.anInt1792 = local16;
			Static38.anInt1376 = 0;
			Static18.anInt841 = 2;
			if (Static111.anInt2784 == local16 >> 16) {
				Static18.anInt841 = 1;
			}
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
		}
		if (local20 == 10) {
			local246 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local28];
			if (local246 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local246.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local246.anIntArray343[0], 2);
				Static100.anInt2546 = Static93.anInt2360;
				Static76.anInt2064 = 2;
				Static14.anInt680 = Static1.anInt13;
				Static29.anInt1086 = 0;
				Static59.aClass2_Sub3_Sub1_2.method841(68);
				Static59.aClass2_Sub3_Sub1_2.method809(local28);
			}
		}
		if (local20 == 14) {
			local246 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local28];
			if (local246 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local246.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local246.anIntArray343[0], 2);
				Static29.anInt1086 = 0;
				Static76.anInt2064 = 2;
				Static14.anInt680 = Static1.anInt13;
				Static100.anInt2546 = Static93.anInt2360;
				Static59.aClass2_Sub3_Sub1_2.method841(96);
				Static59.aClass2_Sub3_Sub1_2.method816(local28);
			}
		}
		@Pc(790) Class2_Sub1_Sub1_Sub1_Sub2 local790;
		if (local20 == 1001) {
			Static100.anInt2546 = Static93.anInt2360;
			Static76.anInt2064 = 2;
			Static14.anInt680 = Static1.anInt13;
			Static29.anInt1086 = 0;
			local790 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local790 != null) {
				@Pc(795) Class2_Sub1_Sub7 local795 = local790.aClass2_Sub1_Sub7_1;
				if (local795.anIntArray140 != null) {
					local795 = local795.method939();
				}
				if (local795 != null) {
					Static59.aClass2_Sub3_Sub1_2.method841(247);
					Static59.aClass2_Sub3_Sub1_2.method801(local795.anInt1366);
				}
			}
		}
		if (local20 == 22) {
			local246 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local28];
			if (local246 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local246.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local246.anIntArray343[0], 2);
				Static100.anInt2546 = Static93.anInt2360;
				Static76.anInt2064 = 2;
				Static14.anInt680 = Static1.anInt13;
				Static29.anInt1086 = 0;
				Static59.aClass2_Sub3_Sub1_2.method841(110);
				Static59.aClass2_Sub3_Sub1_2.method801(local28);
				Static59.aClass2_Sub3_Sub1_2.method810(Static34.anInt1276);
				Static59.aClass2_Sub3_Sub1_2.method797(Static82.anInt2148);
				Static59.aClass2_Sub3_Sub1_2.method797(Static76.anInt2053);
			}
		}
		if (local20 == 19) {
			Static82.anInt2148 = local28;
			Static76.anInt2053 = local12;
			Static34.anInt1276 = local16;
			Static12.anInt2645 = 1;
			Static109.aClass1_2872 = Static97.method1655(new Class1[] { Static77.aClass1_2163, Static73.method1374(local28).aClass1_2571, Static47.aClass1_1511 });
			Static17.anInt783 = 0;
			if (Static109.aClass1_2872 == null) {
				Static109.aClass1_2872 = Static55.aClass1_670;
			}
			Static34.aBoolean60 = true;
			return;
		}
		if (local20 == 15) {
			local118 = Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			if (!local118) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			}
			Static29.anInt1086 = 0;
			Static76.anInt2064 = 2;
			Static14.anInt680 = Static1.anInt13;
			Static100.anInt2546 = Static93.anInt2360;
			Static59.aClass2_Sub3_Sub1_2.method841(168);
			Static59.aClass2_Sub3_Sub1_2.method809(local28);
			Static59.aClass2_Sub3_Sub1_2.method816(Static25.anInt1022 + local12);
			Static59.aClass2_Sub3_Sub1_2.method810(Static99.anInt2527);
			Static59.aClass2_Sub3_Sub1_2.method797(Static47.anInt1563 + local16);
		}
		if (local20 == 23) {
			Static59.aClass2_Sub3_Sub1_2.method841(64);
			Static59.aClass2_Sub3_Sub1_2.method829(local16);
			local570 = Static113.method1526(local16);
			if (local570.anIntArrayArray19 != null && local570.anIntArrayArray19[0][0] == 5) {
				local317 = local570.anIntArrayArray19[0][1];
				Static94.anIntArray295[local317] = 1 - Static94.anIntArray295[local317];
				Static40.method1085(local317);
				Static34.aBoolean60 = true;
			}
		}
		if (local20 == 48) {
			Static59.aClass2_Sub3_Sub1_2.method841(147);
			Static59.aClass2_Sub3_Sub1_2.method816(local28);
			Static59.aClass2_Sub3_Sub1_2.method809(local12);
			Static59.aClass2_Sub3_Sub1_2.method817(local16);
			Static18.anInt841 = 2;
			Static87.anInt2299 = local12;
			Static57.anInt1792 = local16;
			if (Static111.anInt2784 == local16 >> 16) {
				Static18.anInt841 = 1;
			}
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
			Static38.anInt1376 = 0;
		}
		@Pc(1130) long local1130;
		if (local20 == 18) {
			local312 = Static84.aClass1Array20[arg0];
			local317 = local312.method11(Static47.aClass1_1511);
			if (local317 != -1) {
				local1130 = local312.method1(local317 + 5).method40().method9();
				local340 = -1;
				for (@Pc(1134) int local1134 = 0; local1134 < Static51.anInt1703; local1134++) {
					if (local1130 == Static98.aLongArray6[local1134]) {
						local340 = local1134;
						break;
					}
				}
				if (local340 != -1 && Static61.anIntArray197[local340] > 0) {
					Static65.anInt1941 = 3;
					Static87.aBoolean137 = true;
					Static95.anInt2396 = 0;
					Static111.aClass1_2897 = Static111.aClass1_2898;
					Static32.aBoolean54 = true;
					Static31.aLong31 = Static98.aLongArray6[local340];
					Static111.aClass1_2896 = Static97.method1655(new Class1[] { Static63.aClass1_1918, Static100.aClass1Array25[local340] });
				}
			}
		}
		if (local20 == 1003) {
			Static29.anInt1086 = 0;
			Static76.anInt2064 = 2;
			Static14.anInt680 = Static1.anInt13;
			Static100.anInt2546 = Static93.anInt2360;
			Static59.aClass2_Sub3_Sub1_2.method841(151);
			Static59.aClass2_Sub3_Sub1_2.method801(local28);
		}
		if (local20 == 1002) {
			Static42.method983(local12, local28, local16);
			Static59.aClass2_Sub3_Sub1_2.method841(62);
			Static59.aClass2_Sub3_Sub1_2.method797(local28 >> 14 & 0x7FFF);
			Static59.aClass2_Sub3_Sub1_2.method809(local16 + Static47.anInt1563);
			Static59.aClass2_Sub3_Sub1_2.method801(local12 + Static25.anInt1022);
		}
		if (local20 == 30) {
			local790 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local790 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local790.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local790.anIntArray343[0], 2);
				Static29.anInt1086 = 0;
				Static100.anInt2546 = Static93.anInt2360;
				Static14.anInt680 = Static1.anInt13;
				Static76.anInt2064 = 2;
				Static59.aClass2_Sub3_Sub1_2.method841(57);
				Static59.aClass2_Sub3_Sub1_2.method797(local28);
			}
		}
		if (local20 == 49) {
			local790 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local790 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local790.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local790.anIntArray343[0], 2);
				Static100.anInt2546 = Static93.anInt2360;
				Static14.anInt680 = Static1.anInt13;
				Static29.anInt1086 = 0;
				Static76.anInt2064 = 2;
				Static59.aClass2_Sub3_Sub1_2.method841(208);
				Static59.aClass2_Sub3_Sub1_2.method816(local28);
				Static59.aClass2_Sub3_Sub1_2.method816(Static82.anInt2148);
				Static59.aClass2_Sub3_Sub1_2.method801(Static76.anInt2053);
				Static59.aClass2_Sub3_Sub1_2.method829(Static34.anInt1276);
			}
		}
		if (local20 == 29) {
			Static42.method983(local12, local28, local16);
			Static59.aClass2_Sub3_Sub1_2.method841(164);
			Static59.aClass2_Sub3_Sub1_2.method801(Static25.anInt1022 + local12);
			Static59.aClass2_Sub3_Sub1_2.method801(Static47.anInt1563 + local16);
			Static59.aClass2_Sub3_Sub1_2.method801(local28 >> 14 & 0x7FFF);
		}
		if (local20 == 5 && Static42.method983(local12, local28, local16)) {
			Static59.aClass2_Sub3_Sub1_2.method841(24);
			Static59.aClass2_Sub3_Sub1_2.method801(local16 + Static47.anInt1563);
			Static59.aClass2_Sub3_Sub1_2.method816(Static82.anInt2148);
			Static59.aClass2_Sub3_Sub1_2.method809(local28 >> 14 & 0x7FFF);
			Static59.aClass2_Sub3_Sub1_2.method801(Static76.anInt2053);
			Static59.aClass2_Sub3_Sub1_2.method810(Static34.anInt1276);
			Static59.aClass2_Sub3_Sub1_2.method801(local12 + Static25.anInt1022);
		}
		if (local20 == 34) {
			local790 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local790 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local790.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local790.anIntArray343[0], 2);
				Static29.anInt1086 = 0;
				Static76.anInt2064 = 2;
				Static100.anInt2546 = Static93.anInt2360;
				Static14.anInt680 = Static1.anInt13;
				Static59.aClass2_Sub3_Sub1_2.method841(0);
				Static59.aClass2_Sub3_Sub1_2.method816(local28);
			}
		}
		if (local20 == 56) {
			Static59.aClass2_Sub3_Sub1_2.method841(40);
			Static59.aClass2_Sub3_Sub1_2.method801(local28);
			Static59.aClass2_Sub3_Sub1_2.method801(local12);
			Static59.aClass2_Sub3_Sub1_2.method817(local16);
			Static59.aClass2_Sub3_Sub1_2.method817(Static34.anInt1276);
			Static59.aClass2_Sub3_Sub1_2.method809(Static82.anInt2148);
			Static59.aClass2_Sub3_Sub1_2.method816(Static76.anInt2053);
			Static57.anInt1792 = local16;
			Static38.anInt1376 = 0;
			Static87.anInt2299 = local12;
			Static18.anInt841 = 2;
			if (local16 >> 16 == Static111.anInt2784) {
				Static18.anInt841 = 1;
			}
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
		}
		if (local20 == 33) {
			local570 = Static113.method1526(local16);
			Static34.aBoolean60 = true;
			Static17.anInt783 = 1;
			Static52.aClass1_1774 = local570.aClass1_2332;
			Static96.anInt2434 = local570.anInt2200;
			Static12.anInt2645 = 0;
			Static99.anInt2527 = local16;
			Static46.aClass1_1507 = Static97.method1655(new Class1[] { Static84.aClass1_2356, local570.aClass1_2342, Static47.aClass1_1511 });
			if (Static96.anInt2434 == 16) {
				Static79.aBoolean115 = true;
				Static8.anInt514 = 3;
				Static34.aBoolean60 = true;
			}
			return;
		}
		if (local20 == 1007) {
			local570 = Static113.method1526(local16);
			if (local570 != null && local570.aClass2_Sub1_Sub14Array1 != null && local12 != -1) {
				local570 = local570.aClass2_Sub1_Sub14Array1[local12];
			}
			if (local570 == null || local570.anInt2218 < 100000) {
				Static59.aClass2_Sub3_Sub1_2.method841(151);
				Static59.aClass2_Sub3_Sub1_2.method801(local28);
			} else {
				Static73.method1372(0, Static97.method1655(new Class1[] { Static43.method994(local570.anInt2218), Static110.aClass1_2883, Static73.method1374(local28).aClass1_2571 }), Static111.aClass1_2898);
			}
		}
		if (local20 == 42) {
			local570 = Static113.method1526(local16);
			@Pc(1716) boolean local1716 = true;
			if (local570.anInt2169 > 0) {
				local1716 = Static8.method300(local570);
			}
			if (local1716) {
				Static59.aClass2_Sub3_Sub1_2.method841(64);
				Static59.aClass2_Sub3_Sub1_2.method829(local16);
			}
		}
		if (local20 == 31) {
			Static59.aClass2_Sub3_Sub1_2.method841(163);
			Static59.aClass2_Sub3_Sub1_2.method801(local12);
			Static59.aClass2_Sub3_Sub1_2.method801(local28);
			Static59.aClass2_Sub3_Sub1_2.method829(local16);
			Static87.anInt2299 = local12;
			Static18.anInt841 = 2;
			Static57.anInt1792 = local16;
			Static38.anInt1376 = 0;
			if (local16 >> 16 == Static111.anInt2784) {
				Static18.anInt841 = 1;
			}
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
		}
		if (local20 == 12) {
			local790 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local790 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local790.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local790.anIntArray343[0], 2);
				Static100.anInt2546 = Static93.anInt2360;
				Static14.anInt680 = Static1.anInt13;
				Static29.anInt1086 = 0;
				Static76.anInt2064 = 2;
				Static59.aClass2_Sub3_Sub1_2.method841(63);
				Static59.aClass2_Sub3_Sub1_2.method801(local28);
			}
		}
		if (local20 == 2) {
			local118 = Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			if (!local118) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			}
			Static76.anInt2064 = 2;
			Static29.anInt1086 = 0;
			Static100.anInt2546 = Static93.anInt2360;
			Static14.anInt680 = Static1.anInt13;
			Static59.aClass2_Sub3_Sub1_2.method841(244);
			Static59.aClass2_Sub3_Sub1_2.method809(local12 + Static25.anInt1022);
			Static59.aClass2_Sub3_Sub1_2.method816(Static47.anInt1563 + local16);
			Static59.aClass2_Sub3_Sub1_2.method797(local28);
		}
		if (local20 == 3) {
			local118 = Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			if (!local118) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			}
			Static29.anInt1086 = 0;
			Static100.anInt2546 = Static93.anInt2360;
			Static76.anInt2064 = 2;
			Static14.anInt680 = Static1.anInt13;
			Static59.aClass2_Sub3_Sub1_2.method841(85);
			Static59.aClass2_Sub3_Sub1_2.method816(Static47.anInt1563 + local16);
			Static59.aClass2_Sub3_Sub1_2.method816(local28);
			Static59.aClass2_Sub3_Sub1_2.method809(local12 + Static25.anInt1022);
		}
		if (local20 == 21) {
			local790 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local790 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local790.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local790.anIntArray343[0], 2);
				Static100.anInt2546 = Static93.anInt2360;
				Static14.anInt680 = Static1.anInt13;
				Static29.anInt1086 = 0;
				Static76.anInt2064 = 2;
				Static59.aClass2_Sub3_Sub1_2.method841(253);
				Static59.aClass2_Sub3_Sub1_2.method797(local28);
				Static59.aClass2_Sub3_Sub1_2.method810(Static99.anInt2527);
			}
		}
		if (local20 == 45 || local20 == 51 || local20 == 13 || local20 == 35) {
			local312 = Static84.aClass1Array20[arg0];
			local317 = local312.method11(Static47.aClass1_1511);
			if (local317 != -1) {
				local1130 = local312.method1(local317 + 5).method40().method9();
				if (local20 == 45) {
					Static64.method1329(local1130);
				}
				if (local20 == 51) {
					Static27.method727(local1130);
				}
				if (local20 == 13) {
					Static55.method488(local1130);
				}
				if (local20 == 35) {
					Static50.method1107(local1130);
				}
			}
		}
		if (local20 == 44) {
			local246 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local28];
			if (local246 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local246.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local246.anIntArray343[0], 2);
				Static76.anInt2064 = 2;
				Static29.anInt1086 = 0;
				Static100.anInt2546 = Static93.anInt2360;
				Static14.anInt680 = Static1.anInt13;
				Static59.aClass2_Sub3_Sub1_2.method841(220);
				Static59.aClass2_Sub3_Sub1_2.method797(local28);
			}
		}
		if (local20 == 7) {
			if (Static6.aBoolean11) {
				Static109.aClass3_1.method152(local12 - 4, local16 + -4);
			} else {
				Static109.aClass3_1.method152(Static93.anInt2360 - 4, Static1.anInt13 + -4);
			}
		}
		if (local20 == 1006) {
			local570 = Static113.method1526(local16);
			if (local570 == null || local570.anIntArray281[local12] < 100000) {
				Static59.aClass2_Sub3_Sub1_2.method841(151);
				Static59.aClass2_Sub3_Sub1_2.method801(local28);
			} else {
				Static73.method1372(0, Static97.method1655(new Class1[] { Static43.method994(local570.anIntArray281[local12]), Static110.aClass1_2883, Static73.method1374(local28).aClass1_2571 }), Static111.aClass1_2898);
			}
			Static87.anInt2299 = local12;
			Static38.anInt1376 = 0;
			Static57.anInt1792 = local16;
			Static18.anInt841 = 2;
			if (local16 >> 16 == Static111.anInt2784) {
				Static18.anInt841 = 1;
			}
			if (local16 >> 16 == Static72.anInt1978) {
				Static18.anInt841 = 3;
			}
		}
		if (local20 == 17) {
			Static42.method983(local12, local28, local16);
			Static59.aClass2_Sub3_Sub1_2.method841(183);
			Static59.aClass2_Sub3_Sub1_2.method816(local16 + Static47.anInt1563);
			Static59.aClass2_Sub3_Sub1_2.method797(local28 >> 14 & 0x7FFF);
			Static59.aClass2_Sub3_Sub1_2.method816(local12 + Static25.anInt1022);
		}
		if (local20 == 50) {
			Static60.method1279(local12, local28, local16);
		}
		if (local20 == 40) {
			Static90.method1570(Static81.anInt2140);
			Static81.anInt2140 = -1;
			Static87.aBoolean137 = true;
		}
		if (local20 == 32 && Static42.method983(local12, local28, local16)) {
			Static59.aClass2_Sub3_Sub1_2.method841(225);
			Static59.aClass2_Sub3_Sub1_2.method797(local28 >> 14 & 0x7FFF);
			Static59.aClass2_Sub3_Sub1_2.method801(local16 + Static47.anInt1563);
			Static59.aClass2_Sub3_Sub1_2.method810(Static99.anInt2527);
			Static59.aClass2_Sub3_Sub1_2.method809(local12 + Static25.anInt1022);
		}
		if (local20 == 25) {
			Static59.aClass2_Sub3_Sub1_2.method841(228);
			Static59.aClass2_Sub3_Sub1_2.method809(local28);
			Static59.aClass2_Sub3_Sub1_2.method817(local16);
			Static59.aClass2_Sub3_Sub1_2.method809(local12);
			Static38.anInt1376 = 0;
			Static18.anInt841 = 2;
			if (local16 >> 16 == Static111.anInt2784) {
				Static18.anInt841 = 1;
			}
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
			Static57.anInt1792 = local16;
			Static87.anInt2299 = local12;
		}
		if (local20 == 11) {
			Static59.aClass2_Sub3_Sub1_2.method841(29);
			Static59.aClass2_Sub3_Sub1_2.method810(local16);
			Static59.aClass2_Sub3_Sub1_2.method816(local12);
			Static59.aClass2_Sub3_Sub1_2.method809(local28);
			Static87.anInt2299 = local12;
			Static57.anInt1792 = local16;
			Static18.anInt841 = 2;
			if (local16 >> 16 == Static111.anInt2784) {
				Static18.anInt841 = 1;
			}
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
			Static38.anInt1376 = 0;
		}
		if (local20 == 41) {
			local246 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local28];
			if (local246 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local246.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local246.anIntArray343[0], 2);
				Static76.anInt2064 = 2;
				Static14.anInt680 = Static1.anInt13;
				Static100.anInt2546 = Static93.anInt2360;
				Static29.anInt1086 = 0;
				Static59.aClass2_Sub3_Sub1_2.method841(187);
				Static59.aClass2_Sub3_Sub1_2.method801(local28);
			}
		}
		if (local20 == 28) {
			local312 = Static84.aClass1Array20[arg0];
			local317 = local312.method11(Static47.aClass1_1511);
			if (local317 != -1) {
				if (Static111.anInt2784 == -1) {
					Static31.method839();
					if (Static62.anInt1879 != -1) {
						Static111.aClass1_2890 = local312.method1(local317 + 5).method40();
						Static111.anInt2781 = Static111.anInt2784 = Static62.anInt1879;
						Static112.aBoolean161 = false;
					}
				} else {
					Static73.method1372(0, Static65.aClass1_1973, Static111.aClass1_2898);
				}
			}
		}
		if (local20 == 8) {
			local118 = Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			if (!local118) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			}
			Static100.anInt2546 = Static93.anInt2360;
			Static29.anInt1086 = 0;
			Static76.anInt2064 = 2;
			Static14.anInt680 = Static1.anInt13;
			Static59.aClass2_Sub3_Sub1_2.method841(65);
			Static59.aClass2_Sub3_Sub1_2.method816(local28);
			Static59.aClass2_Sub3_Sub1_2.method816(local16 + Static47.anInt1563);
			Static59.aClass2_Sub3_Sub1_2.method809(Static25.anInt1022 + local12);
		}
		if (local20 == 9) {
			Static31.method839();
		}
		if (local20 == 54 && Static101.anInt2594 == -1) {
			Static31.method840(0, local16);
			Static101.anInt2594 = local16;
		}
		if (local20 == 43) {
			Static59.aClass2_Sub3_Sub1_2.method841(98);
			Static59.aClass2_Sub3_Sub1_2.method797(local12);
			Static59.aClass2_Sub3_Sub1_2.method810(local16);
			Static59.aClass2_Sub3_Sub1_2.method797(local28);
			Static38.anInt1376 = 0;
			Static18.anInt841 = 2;
			if (Static111.anInt2784 == local16 >> 16) {
				Static18.anInt841 = 1;
			}
			Static87.anInt2299 = local12;
			Static57.anInt1792 = local16;
			if (local16 >> 16 == Static72.anInt1978) {
				Static18.anInt841 = 3;
			}
		}
		if (local20 == 36) {
			local118 = Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			if (!local118) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			}
			Static14.anInt680 = Static1.anInt13;
			Static76.anInt2064 = 2;
			Static29.anInt1086 = 0;
			Static100.anInt2546 = Static93.anInt2360;
			Static59.aClass2_Sub3_Sub1_2.method841(27);
			Static59.aClass2_Sub3_Sub1_2.method797(Static25.anInt1022 + local12);
			Static59.aClass2_Sub3_Sub1_2.method816(local28);
			Static59.aClass2_Sub3_Sub1_2.method816(local16 + Static47.anInt1563);
		}
		if (local20 == 39) {
			local246 = Static67.aClass2_Sub1_Sub1_Sub1_Sub1Array3[local28];
			if (local246 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local246.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local246.anIntArray343[0], 2);
				Static29.anInt1086 = 0;
				Static100.anInt2546 = Static93.anInt2360;
				Static76.anInt2064 = 2;
				Static14.anInt680 = Static1.anInt13;
				Static59.aClass2_Sub3_Sub1_2.method841(211);
				Static59.aClass2_Sub3_Sub1_2.method809(local28);
			}
		}
		if (local20 == 24) {
			Static59.aClass2_Sub3_Sub1_2.method841(124);
			Static59.aClass2_Sub3_Sub1_2.method797(local12);
			Static59.aClass2_Sub3_Sub1_2.method817(local16);
			Static59.aClass2_Sub3_Sub1_2.method797(local28);
			Static57.anInt1792 = local16;
			Static38.anInt1376 = 0;
			Static87.anInt2299 = local12;
			Static18.anInt841 = 2;
			if (Static111.anInt2784 == local16 >> 16) {
				Static18.anInt841 = 1;
			}
			if (Static72.anInt1978 == local16 >> 16) {
				Static18.anInt841 = 3;
			}
		}
		if (local20 == 16) {
			Static42.method983(local12, local28, local16);
			Static59.aClass2_Sub3_Sub1_2.method841(30);
			Static59.aClass2_Sub3_Sub1_2.method816(local28 >> 14 & 0x7FFF);
			Static59.aClass2_Sub3_Sub1_2.method816(Static47.anInt1563 + local16);
			Static59.aClass2_Sub3_Sub1_2.method801(local12 + Static25.anInt1022);
		}
		if (local20 == 20) {
			local790 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local790 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local790.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local790.anIntArray343[0], 2);
				Static76.anInt2064 = 2;
				Static100.anInt2546 = Static93.anInt2360;
				Static14.anInt680 = Static1.anInt13;
				Static29.anInt1086 = 0;
				Static59.aClass2_Sub3_Sub1_2.method841(153);
				Static59.aClass2_Sub3_Sub1_2.method809(local28);
			}
		}
		if (local20 == 47) {
			local118 = Static52.method1188(0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			if (!local118) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local12, 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local16, 2);
			}
			Static100.anInt2546 = Static93.anInt2360;
			Static14.anInt680 = Static1.anInt13;
			Static29.anInt1086 = 0;
			Static76.anInt2064 = 2;
			Static59.aClass2_Sub3_Sub1_2.method841(172);
			Static59.aClass2_Sub3_Sub1_2.method816(local12 + Static25.anInt1022);
			Static59.aClass2_Sub3_Sub1_2.method797(Static76.anInt2053);
			Static59.aClass2_Sub3_Sub1_2.method816(local28);
			Static59.aClass2_Sub3_Sub1_2.method826(Static34.anInt1276);
			Static59.aClass2_Sub3_Sub1_2.method809(Static47.anInt1563 + local16);
			Static59.aClass2_Sub3_Sub1_2.method809(Static82.anInt2148);
		}
		if (local20 == 6) {
			Static59.aClass2_Sub3_Sub1_2.method841(102);
			Static59.aClass2_Sub3_Sub1_2.method817(local16);
			Static59.aClass2_Sub3_Sub1_2.method801(local12);
			Static59.aClass2_Sub3_Sub1_2.method797(local28);
			Static87.anInt2299 = local12;
			Static38.anInt1376 = 0;
			Static18.anInt841 = 2;
			Static57.anInt1792 = local16;
			if (local16 >> 16 == Static111.anInt2784) {
				Static18.anInt841 = 1;
			}
			if (local16 >> 16 == Static72.anInt1978) {
				Static18.anInt841 = 3;
			}
		}
		if (local20 == 4) {
			local790 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local28];
			if (local790 != null) {
				Static52.method1188(1, 0, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0], local790.anIntArray341[0], 0, false, 0, 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0], local790.anIntArray343[0], 2);
				Static76.anInt2064 = 2;
				Static100.anInt2546 = Static93.anInt2360;
				Static29.anInt1086 = 0;
				Static14.anInt680 = Static1.anInt13;
				Static59.aClass2_Sub3_Sub1_2.method841(116);
				Static59.aClass2_Sub3_Sub1_2.method809(local28);
			}
		}
		if (Static12.anInt2645 != 0) {
			Static12.anInt2645 = 0;
			Static34.aBoolean60 = true;
		}
		if (Static17.anInt783 != 0) {
			Static34.aBoolean60 = true;
			Static17.anInt783 = 0;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!a;Lclient!a;Lclient!bd;B)Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 method1225(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) Class8 arg2) {
		@Pc(13) int local13 = arg2.method1695(arg0);
		@Pc(21) int local21 = arg2.method1691(local13, arg1);
		return method1229(arg2, local21, local13);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BIIIIII)V")
	public static void method1226(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (!Static113.method1524(arg3)) {
			return;
		}
		Static55.method479(arg4, arg2, 0, arg1, arg5, -1, Static98.aClass2_Sub1_Sub14ArrayArray1[arg3], arg0, 0);
		if (Static15.aClass2_Sub1_Sub14_1 == null) {
			return;
		}
		@Pc(37) Class2_Sub1_Sub14 local37 = Static15.aClass2_Sub1_Sub14_1;
		@Pc(41) Class2_Sub1_Sub14 local41 = Static106.method1754(local37);
		if (local41 == null) {
			return;
		}
		@Pc(48) int[] local48 = Static22.method607(local41);
		@Pc(52) int[] local52 = Static22.method607(local37);
		@Pc(65) int local65 = local52[1] + Static84.anInt2248 - local48[1] - Static80.anInt2126;
		@Pc(79) int local79 = local52[0] + Static22.anInt930 - local48[0] - Static11.anInt608;
		if (local65 < 0) {
			local65 = 0;
		}
		if (local41.anInt2171 < local65 + local37.anInt2171) {
			local65 = local41.anInt2171 - local37.anInt2171;
		}
		if (local79 < 0) {
			local79 = 0;
		}
		if (local41.anInt2196 < local37.anInt2196 + local79) {
			local79 = local41.anInt2196 - local37.anInt2196;
		}
		if (Static15.aClass2_Sub1_Sub14_1.anObjectArray4 != null && (arg1 & 0x200) != 0) {
			Static72.method1368(local37.anObjectArray4, local65, local37, local79);
		}
		if (Static25.anInt1019 != 0 || (arg1 & 0x400) == 0) {
			return;
		}
		if (Static15.aClass2_Sub1_Sub14_1.anObjectArray9 != null) {
			Static72.method1368(local37.anObjectArray9, local65, local37, local79);
		}
		Static15.aClass2_Sub1_Sub14_1 = null;
		return;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([Lclient!qd;IZIIIII)Lclient!qd;")
	public static Class2_Sub1_Sub14 method1227(@OriginalArg(0) Class2_Sub1_Sub14[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class2_Sub1_Sub14 local11 = null;
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(18) Class2_Sub1_Sub14 local18 = arg0[local13];
			if (local18 != null && arg4 == local18.anInt2174) {
				@Pc(35) int local35 = arg3 + local18.anInt2197;
				@Pc(40) int local40 = arg5 + local18.anInt2180;
				if (local40 <= arg6 && local35 <= arg1 && local40 + local18.anInt2196 > arg6 && arg1 < local35 + local18.anInt2171 && !local18.aBoolean134) {
					if (local18.anInt2194 < 0 && arg2 || local18.anInt2194 >= 0 && !arg2) {
						local11 = local18;
					}
					if (local18.anInt2192 == 0) {
						@Pc(109) Class2_Sub1_Sub14 local109 = method1227(arg0, arg1, arg2, local18.anInt2197 - local18.anInt2215, local13, local18.anInt2180 - local18.anInt2228, arg6);
						if (local109 != null) {
							local11 = local109;
						}
						if (arg2 && local18.aClass2_Sub1_Sub14Array1 != null) {
							@Pc(139) Class2_Sub1_Sub14 local139 = method1227(local18.aClass2_Sub1_Sub14Array1, arg1, arg2, local18.anInt2197 - local18.anInt2215, local18.anInt2194, local18.anInt2180 - local18.anInt2228, arg6);
							if (local139 != null) {
								local11 = local139;
							}
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!bd;BII)Lclient!e;")
	private static Class2_Sub1_Sub2_Sub2 method1229(@OriginalArg(0) Class8 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static87.method1560(arg1, arg2, arg0) ? Static39.method1772() : null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BZ)V")
	public static void method1230(@OriginalArg(1) boolean arg0) {
		Static40.anInt1611++;
		if (Static40.anInt1611 < 50 && !arg0) {
			return;
		}
		Static40.anInt1611 = 0;
		if (Static65.aBoolean104 || Static50.aClass65_1 == null) {
			return;
		}
		Static59.aClass2_Sub3_Sub1_2.method841(13);
		try {
			Static50.aClass65_1.method1759(Static59.aClass2_Sub3_Sub1_2.anInt1168, Static59.aClass2_Sub3_Sub1_2.aByteArray7);
			Static59.aClass2_Sub3_Sub1_2.anInt1168 = 0;
		} catch (@Pc(46) IOException local46) {
			Static65.aBoolean104 = true;
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public static void method1231() {
		if (Static80.aBoolean119) {
			Static80.aBoolean119 = false;
			Static96.method1628();
			Static79.aBoolean115 = true;
			Static87.aBoolean137 = true;
			Static34.aBoolean60 = true;
			Static13.aBoolean20 = true;
		}
		method1219();
		if (Static6.aBoolean11 && Static18.anInt835 == 1) {
			Static34.aBoolean60 = true;
		}
		@Pc(35) boolean local35;
		if (Static56.anInt1778 != -1) {
			local35 = Static107.method1776(Static56.anInt1778);
			if (local35) {
				Static34.aBoolean60 = true;
			}
		}
		if (Static18.anInt841 == 2) {
			Static34.aBoolean60 = true;
		}
		if (Static28.anInt1052 == 2) {
			Static34.aBoolean60 = true;
		}
		if (Static34.aBoolean60) {
			Static34.aBoolean60 = false;
			Static72.method1369();
		}
		@Pc(103) int local103;
		if (Static72.anInt1978 == -1) {
			Static21.aClass2_Sub1_Sub14_4.anInt2215 = Static103.anInt2618 - Static44.anInt1515 - 77;
			if (Static22.anInt930 > 448 && Static22.anInt930 < 560 && Static84.anInt2248 > 332) {
				Static8.method302(77, Static84.anInt2248 - 357, Static22.anInt930 + -17, Static103.anInt2618, Static21.aClass2_Sub1_Sub14_4, 463, -1, 0);
			}
			local103 = Static103.anInt2618 - Static21.aClass2_Sub1_Sub14_4.anInt2215 - 77;
			if (local103 < 0) {
				local103 = 0;
			}
			if (local103 > Static103.anInt2618 - 77) {
				local103 = Static103.anInt2618 - 77;
			}
			if (local103 != Static44.anInt1515) {
				Static44.anInt1515 = local103;
				Static87.aBoolean137 = true;
			}
		}
		if (Static72.anInt1978 == -1 && Static95.anInt2396 == 3) {
			Static21.aClass2_Sub1_Sub14_4.anInt2215 = Static47.anInt1557;
			local103 = Static77.anInt2076 * 14 + 7;
			if (Static22.anInt930 > 448 && Static22.anInt930 < 560 && Static84.anInt2248 > 332) {
				Static8.method302(77, Static84.anInt2248 - 357, Static22.anInt930 + -17, local103, Static21.aClass2_Sub1_Sub14_4, 463, -1, 0);
			}
			@Pc(169) int local169 = Static21.aClass2_Sub1_Sub14_4.anInt2215;
			if (local169 < 0) {
				local169 = 0;
			}
			if (local169 > local103 - 77) {
				local169 = local103 - 77;
			}
			if (local169 != Static47.anInt1557) {
				Static47.anInt1557 = local169;
				Static87.aBoolean137 = true;
			}
		}
		if (Static72.anInt1978 != -1) {
			local35 = Static107.method1776(Static72.anInt1978);
			if (local35) {
				Static87.aBoolean137 = true;
			}
		}
		if (Static18.anInt841 == 3) {
			Static87.aBoolean137 = true;
		}
		if (Static28.anInt1052 == 3) {
			Static87.aBoolean137 = true;
		}
		if (Static55.aClass1_665 != null) {
			Static87.aBoolean137 = true;
		}
		if (Static6.aBoolean11 && Static18.anInt835 == 2) {
			Static87.aBoolean137 = true;
		}
		if (Static87.aBoolean137) {
			Static87.aBoolean137 = false;
			Static94.method1597();
		}
		Static65.method1343();
		if (Static85.anInt2264 != -1) {
			Static79.aBoolean115 = true;
		}
		if (Static79.aBoolean115) {
			if (Static85.anInt2264 != -1 && Static8.anInt514 == Static85.anInt2264) {
				Static85.anInt2264 = -1;
				Static59.aClass2_Sub3_Sub1_2.method841(44);
				Static59.aClass2_Sub3_Sub1_2.method788(Static8.anInt514);
			}
			Static79.aBoolean115 = false;
			Static20.aBoolean38 = true;
			Static11.method414(Static8.anInt514, Static80.anIntArray274, Static56.anInt1778 == -1, Static69.anInt2806 % 20 >= 10 ? Static85.anInt2264 : -1);
		}
		if (Static13.aBoolean20) {
			Static20.aBoolean38 = true;
			Static13.aBoolean20 = false;
			Static87.method1555(Static96.anInt2420, Static88.aClass2_Sub1_Sub2_Sub1_1, Static6.anInt409, Static63.anInt1889);
		}
		Static84.method1531(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724, Static2.anInt287, Static8.anInt509, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717);
		Static8.anInt509 = 0;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	public static void method1232(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static60.method1284(Static69.aClass1_2935, Static87.aClass1_2422, Static28.aClass1_1061);
		} else if (arg0 == -2) {
			Static60.method1284(Static69.aClass1_2918, Static69.aClass1_2945, Static41.aClass1_1384);
		} else if (arg0 == -1) {
			Static60.method1284(Static69.aClass1_2929, Static60.aClass1_1857, Static28.aClass1_1058);
		} else if (arg0 == 3) {
			Static60.method1284(Static69.aClass1_2922, Static69.aClass1_2948, Static34.aClass1_1240);
		} else if (arg0 == 4) {
			Static60.method1284(Static69.aClass1_2950, Static108.aClass1_2813, Static13.aClass1_597);
		} else if (arg0 == 5) {
			Static60.method1284(Static69.aClass1_2943, Static40.aClass1_1577, Static2.aClass1_266);
		} else if (arg0 == 6) {
			Static60.method1284(Static69.aClass1_2914, Static41.aClass1_1382, Static110.aClass1_2884);
		} else if (arg0 == 7) {
			Static60.method1284(Static69.aClass1_2932, Static93.aClass1_2462, Static104.aClass1_1594);
		} else if (arg0 == 8) {
			Static60.method1284(Static69.aClass1_2919, Static71.aClass1_2033, Static4.aClass1_284);
		} else if (arg0 == 9) {
			Static60.method1284(Static69.aClass1_2923, Static67.aClass1_2867, Static51.aClass1_1742);
		} else if (arg0 == 10) {
			Static60.method1284(Static69.aClass1_2931, Static71.aClass1_2036, Static79.aClass1_2219);
		} else if (arg0 == 11) {
			Static60.method1284(Static69.aClass1_2924, Static71.aClass1_2035, Static50.aClass1_1644);
		} else if (arg0 == 12) {
			Static60.method1284(Static69.aClass1_2915, Static106.aClass1_2805, Static30.aClass1_1159);
		} else if (arg0 == 13) {
			Static60.method1284(Static69.aClass1_2946, Static51.aClass1_1747, Static28.aClass1_1052);
		} else if (arg0 == 14) {
			Static60.method1284(Static69.aClass1_2913, Static15.aClass1_655, Static37.aClass1_1317);
		} else if (arg0 == 16) {
			Static60.method1284(Static69.aClass1_2911, Static7.aClass1_1202, Static33.aClass1_1232);
		} else if (arg0 == 17) {
			Static60.method1284(Static69.aClass1_2938, Static84.aClass1_2363, Static102.aClass1_2686);
		} else if (arg0 == 18) {
			Static60.method1284(Static69.aClass1_2940, Static17.aClass1_679, Static62.aClass1_1907);
		} else if (arg0 == 20) {
			Static60.method1284(Static69.aClass1_2925, Static90.aClass1_2445, Static28.aClass1_1055);
		} else if (arg0 == 22) {
			Static60.method1284(Static69.aClass1_2934, Static29.aClass1_1109, Static10.aClass1_2679);
		} else if (arg0 == 23) {
			Static60.method1284(Static69.aClass1_2936, Static66.aClass1_2451, Static37.aClass1_1320);
		} else if (arg0 == 24) {
			Static60.method1284(Static69.aClass1_2933, Static99.aClass1_2633, Static8.aClass1_421);
		} else if (arg0 == 25) {
			Static60.method1284(Static69.aClass1_2947, Static12.aClass1_2745, Static28.aClass1_1056);
		} else if (arg0 == 26) {
			Static60.method1284(Static69.aClass1_2939, Static33.aClass1_1223, Static27.aClass1_1008);
		} else if (arg0 == 27) {
			Static60.method1284(Static69.aClass1_2926, Static69.aClass1_2912, Static106.aClass1_2806);
		} else {
			Static60.method1284(Static69.aClass1_2927, Static37.aClass1_1323, Static28.aClass1_1059);
		}
		Static29.method759(10);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BZZ)I")
	private static int method1234() {
		return Static27.anInt1038 + Static113.anInt2233;
	}
}
