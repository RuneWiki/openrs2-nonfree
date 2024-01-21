import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "Lclient!wb;")
	private static Class65 aClass65_506 = Static24.method441(" has logged in)3");

	@OriginalMember(owner = "client!gd", name = "Y", descriptor = "Lclient!wb;")
	public static Class65 aClass65_505 = aClass65_506;

	@OriginalMember(owner = "client!gd", name = "db", descriptor = "I")
	public static int anInt1181 = 0;

	@OriginalMember(owner = "client!gd", name = "gb", descriptor = "I")
	public static volatile int anInt1184 = 0;

	@OriginalMember(owner = "client!gd", name = "Ab", descriptor = "Lclient!wb;")
	private static Class65 aClass65_510 = Static24.method441("Your ignore list is full)3 Max of 100 hit");

	@OriginalMember(owner = "client!gd", name = "pb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_507 = aClass65_510;

	@OriginalMember(owner = "client!gd", name = "sb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_508 = Static24.method441("Classic");

	@OriginalMember(owner = "client!gd", name = "Jb", descriptor = "Lclient!wb;")
	private static Class65 aClass65_512 = Static24.method441("Hide");

	@OriginalMember(owner = "client!gd", name = "vb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_509 = aClass65_512;

	@OriginalMember(owner = "client!gd", name = "Cb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_511 = Static24.method441("backbase1");

	@OriginalMember(owner = "client!gd", name = "Hb", descriptor = "I")
	public static int anInt1204 = 0;

	@OriginalMember(owner = "client!gd", name = "Ib", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
	public static void method726() {
		Static106.method1750(false);
		@Pc(10) boolean local10 = true;
		Static37.anInt1221 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static23.aByteArrayArray1.length; local14++) {
			if (Static26.anIntArray415[local14] != -1 && Static23.aByteArrayArray1[local14] == null) {
				Static23.aByteArrayArray1[local14] = Static56.aClass33_Sub1_24.method1150(0, Static26.anIntArray415[local14]);
				if (Static23.aByteArrayArray1[local14] == null) {
					local10 = false;
					Static37.anInt1221++;
				}
			}
			if (Static47.anIntArray194[local14] != -1 && Static63.aByteArrayArray6[local14] == null) {
				Static63.aByteArrayArray6[local14] = Static56.aClass33_Sub1_24.method1134(Static47.anIntArray194[local14], Static110.anIntArrayArray26[local14], 0);
				if (Static63.aByteArrayArray6[local14] == null) {
					local10 = false;
					Static37.anInt1221++;
				}
			}
		}
		if (!local10) {
			Static48.anInt1404 = 1;
			return;
		}
		Static98.anInt2762 = 0;
		local10 = true;
		@Pc(116) int local116;
		@Pc(127) int local127;
		for (@Pc(97) int local97 = 0; local97 < Static23.aByteArrayArray1.length; local97++) {
			@Pc(103) byte[] local103 = Static63.aByteArrayArray6[local97];
			if (local103 != null) {
				local116 = (Static92.anIntArray378[local97] >> 8) * 64 - Static107.anInt2849;
				local127 = (Static92.anIntArray378[local97] & 0xFF) * 64 - Static37.anInt1220;
				if (Static22.aBoolean45) {
					local127 = 10;
					local116 = 10;
				}
				local10 &= Static16.method320(local103, local116, local127);
			}
		}
		if (!local10) {
			Static48.anInt1404 = 2;
			return;
		}
		if (Static48.anInt1404 != 0) {
			Static4.method94(Static105.aClass65_1283, true, Static39.aClass65_537);
		}
		Static84.method1447();
		Static67.aClass18_1.method604();
		System.gc();
		for (@Pc(168) int local168 = 0; local168 < 4; local168++) {
			Static84.aClass58Array1[local168].method1733();
		}
		@Pc(191) int local191;
		for (local116 = 0; local116 < 4; local116++) {
			for (local127 = 0; local127 < 104; local127++) {
				for (local191 = 0; local191 < 104; local191++) {
					Static50.aByteArrayArrayArray6[local116][local127][local191] = 0;
				}
			}
		}
		Static69.method1245();
		local127 = Static23.aByteArrayArray1.length;
		Static17.method367();
		Static106.method1750(true);
		@Pc(243) int local243;
		@Pc(254) int local254;
		@Pc(366) int local366;
		@Pc(314) int local314;
		@Pc(355) int local355;
		if (!Static22.aBoolean45) {
			@Pc(258) byte[] local258;
			for (local191 = 0; local191 < local127; local191++) {
				local243 = (Static92.anIntArray378[local191] >> 8) * 64 - Static107.anInt2849;
				local254 = (Static92.anIntArray378[local191] & 0xFF) * 64 - Static37.anInt1220;
				local258 = Static23.aByteArrayArray1[local191];
				if (local258 != null) {
					Static69.method1243(local254, Static24.anInt721 * 8 - 48, local243, (Static84.anInt2408 - 6) * 8, local258, Static84.aClass58Array1);
				}
			}
			for (local243 = 0; local243 < local127; local243++) {
				local254 = (Static92.anIntArray378[local243] >> 8) * 64 - Static107.anInt2849;
				@Pc(303) byte[] local303 = Static23.aByteArrayArray1[local243];
				local314 = (Static92.anIntArray378[local243] & 0xFF) * 64 - Static37.anInt1220;
				if (local303 == null && Static24.anInt721 < 800) {
					Static32.method628(local314, local254, 64, 64);
				}
			}
			Static106.method1750(true);
			for (local254 = 0; local254 < local127; local254++) {
				local258 = Static63.aByteArrayArray6[local254];
				if (local258 != null) {
					local355 = (Static92.anIntArray378[local254] >> 8) * 64 - Static107.anInt2849;
					local366 = (Static92.anIntArray378[local254] & 0xFF) * 64 - Static37.anInt1220;
					Static82.method1426(Static84.aClass58Array1, Static67.aClass18_1, local355, local366, local258);
				}
			}
		}
		@Pc(411) int local411;
		@Pc(423) int local423;
		if (Static22.aBoolean45) {
			@Pc(429) int local429;
			@Pc(439) int local439;
			@Pc(441) int local441;
			for (local191 = 0; local191 < 4; local191++) {
				for (local243 = 0; local243 < 13; local243++) {
					for (local254 = 0; local254 < 13; local254++) {
						@Pc(393) boolean local393 = false;
						local355 = Static51.anIntArrayArrayArray5[local191][local243][local254];
						if (local355 != -1) {
							local411 = local355 >> 1 & 0x3;
							local366 = local355 >> 24 & 0x3;
							local423 = local355 >> 14 & 0x3FF;
							local429 = local355 >> 3 & 0x7FF;
							local439 = local429 / 8 + (local423 / 8 << 8);
							for (local441 = 0; local441 < Static92.anIntArray378.length; local441++) {
								if (Static92.anIntArray378[local441] == local439 && Static23.aByteArrayArray1[local441] != null) {
									Static104.method1737(Static23.aByteArrayArray1[local441], local191, local411, local243 * 8, local254 * 8, (local423 & 0x7) * 8, local366, (local429 & 0x7) * 8, Static84.aClass58Array1);
									local393 = true;
									break;
								}
							}
						}
						if (!local393) {
							Static95.method1175(local191, local254 * 8, local243 * 8);
						}
					}
				}
			}
			for (local243 = 0; local243 < 13; local243++) {
				for (local254 = 0; local254 < 13; local254++) {
					local314 = Static51.anIntArrayArrayArray5[0][local243][local254];
					if (local314 == -1) {
						Static32.method628(local254 * 8, local243 * 8, 8, 8);
					}
				}
			}
			Static106.method1750(true);
			for (local254 = 0; local254 < 4; local254++) {
				for (local314 = 0; local314 < 13; local314++) {
					for (local355 = 0; local355 < 13; local355++) {
						local366 = Static51.anIntArrayArrayArray5[local254][local314][local355];
						if (local366 != -1) {
							local411 = local366 >> 24 & 0x3;
							local429 = local366 >> 14 & 0x3FF;
							local423 = local366 >> 1 & 0x3;
							local439 = local366 >> 3 & 0x7FF;
							local441 = (local429 / 8 << 8) + local439 / 8;
							for (@Pc(617) int local617 = 0; local617 < Static92.anIntArray378.length; local617++) {
								if (Static92.anIntArray378[local617] == local441 && Static63.aByteArrayArray6[local617] != null) {
									Static28.method505(local423, Static84.aClass58Array1, local254, Static63.aByteArrayArray6[local617], local411, (local439 & 0x7) * 8, local314 * 8, (local429 & 0x7) * 8, Static67.aClass18_1, local355 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static106.method1750(true);
		Static84.method1447();
		Static38.method751(Static67.aClass18_1, Static84.aClass58Array1);
		Static106.method1750(true);
		local191 = Static106.anInt2837;
		if (Static62.anInt1879 < local191) {
			local191 = Static62.anInt1879;
		}
		if (local191 < Static62.anInt1879 - 1) {
		}
		if (Static4.aBoolean16) {
			Static67.aClass18_1.method624(Static106.anInt2837);
		} else {
			Static67.aClass18_1.method624(0);
		}
		for (local243 = 0; local243 < 104; local243++) {
			for (local254 = 0; local254 < 104; local254++) {
				Static69.method1241(local254, local243);
			}
		}
		Static9.method166();
		Static60.aClass21_24.method743();
		if (Static54.aFrame1 != null) {
			Static12.aClass2_Sub8_Sub1_8.method1425(112);
			Static12.aClass2_Sub8_Sub1_8.method1370(1057001181);
		}
		if (!Static22.aBoolean45) {
			local254 = (Static84.anInt2408 - 6) / 8;
			local314 = (Static84.anInt2408 + 6) / 8;
			local355 = (Static24.anInt721 - 6) / 8;
			local366 = (Static24.anInt721 + 6) / 8;
			for (local411 = local254 - 1; local411 <= local314 + 1; local411++) {
				for (local423 = local355 - 1; local423 <= local366 + 1; local423++) {
					if (local254 > local411 || local411 > local314 || local355 > local423 || local423 > local366) {
						Static56.aClass33_Sub1_24.method1142(Static13.method282(new Class65[] { Static78.aClass65_265, Static93.method1617(local411), Static95.aClass65_893, Static93.method1617(local423) }));
						Static56.aClass33_Sub1_24.method1142(Static13.method282(new Class65[] { Static55.aClass65_750, Static93.method1617(local411), Static95.aClass65_893, Static93.method1617(local423) }));
					}
				}
			}
		}
		if (Static96.anInt2688 == -1) {
			Static76.method1307(30);
		} else {
			Static76.method1307(35);
		}
		Static97.method1656();
		Static12.aClass2_Sub8_Sub1_8.method1425(151);
		Static20.method407();
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(Z)V")
	public static void method727() {
		aClass65_507 = null;
		aClass65_505 = null;
		aClass65_511 = null;
		aClass65_510 = null;
		aClass65_512 = null;
		aClass65_506 = null;
		aClass65_509 = null;
		aClass65_508 = null;
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
	public static void method728() {
		while (true) {
			if (Static59.aClass2_Sub8_Sub1_19.method1424(Static57.anInt1718) >= 11) {
				@Pc(12) int local12 = Static59.aClass2_Sub8_Sub1_19.method1419(11);
				if (local12 != 2047) {
					@Pc(19) boolean local19 = false;
					if (Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local12] == null) {
						local19 = true;
						Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local12] = new Class2_Sub1_Sub1_Sub2_Sub2();
						if (Static87.aClass2_Sub8Array1[local12] != null) {
							Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local12].method930(Static87.aClass2_Sub8Array1[local12]);
						}
					}
					Static24.anIntArray99[Static54.anInt1640++] = local12;
					@Pc(55) Class2_Sub1_Sub1_Sub2_Sub2 local55 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local12];
					local55.anInt1544 = Static108.anInt2902;
					@Pc(63) int local63 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
					if (local63 == 1) {
						Static61.anIntArray248[Static39.anInt1251++] = local12;
					}
					@Pc(79) int local79 = Static59.aClass2_Sub8_Sub1_19.method1419(5);
					@Pc(84) int local84 = Static59.aClass2_Sub8_Sub1_19.method1419(1);
					if (local79 > 15) {
						local79 -= 32;
					}
					@Pc(93) int local93 = Static59.aClass2_Sub8_Sub1_19.method1419(5);
					@Pc(100) int local100 = Static62.anIntArray254[Static59.aClass2_Sub8_Sub1_19.method1419(3)];
					if (local93 > 15) {
						local93 -= 32;
					}
					if (local19) {
						local55.anInt1540 = local100;
					}
					local55.method922(local93 + Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray208[0], local84 == 1, Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.anIntArray209[0] + local79);
					continue;
				}
			}
			Static59.aClass2_Sub8_Sub1_19.method1428();
			return;
		}
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(B)V")
	public static void method729() {
		if (Static47.anInt1390 == 0) {
			return;
		}
		@Pc(21) int local21 = 0;
		if (Static33.anInt2359 != 0) {
			local21 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < 100; local27++) {
			if (Static34.aClass65Array5[local27] != null) {
				@Pc(37) int local37 = Static61.anIntArray249[local27];
				@Pc(41) Class65 local41 = Static78.aClass65Array4[local27];
				if (local41 != null && local41.method1783(Static69.aClass65_954)) {
					local41 = local41.method1779(5);
				}
				if (local41 != null && local41.method1783(Static6.aClass65_117)) {
					local41 = local41.method1779(5);
				}
				if ((local37 == 3 || local37 == 7) && (local37 == 7 || Static42.anInt1350 == 0 || Static42.anInt1350 == 1 && Static4.method102(local41))) {
					@Pc(97) int local97 = 329 - local21 * 13;
					if (Static16.anInt480 > 4 && Static85.anInt2459 - 4 > local97 + -10 && local97 + 3 >= Static85.anInt2459 - 4) {
						@Pc(143) int local143 = Static110.aClass2_Sub1_Sub4_Sub4_3.method1839(Static13.method282(new Class65[] { Static85.aClass65_1106, Static61.aClass65_835, local41, Static34.aClass65Array5[local27] })) + 25;
						if (local143 > 450) {
							local143 = 450;
						}
						if (local143 + 4 > Static16.anInt480) {
							if (Static20.anInt629 >= 1) {
								Static47.method820(0, 0, Static52.aClass65_724, Static13.method282(new Class65[] { Static68.aClass65_948, local41 }), 2035, 0);
							}
							Static47.method820(0, 0, Static95.aClass65_901, Static13.method282(new Class65[] { Static68.aClass65_948, local41 }), 2036, 0);
							Static47.method820(0, 0, Static1.aClass65_7, Static13.method282(new Class65[] { Static68.aClass65_948, local41 }), 2051, 0);
						}
					}
					local21++;
					if (local21 >= 5) {
						return;
					}
				}
				if ((local37 == 5 || local37 == 6) && Static42.anInt1350 < 2) {
					local21++;
					if (local21 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lclient!kc;")
	public static Class2_Sub1_Sub7 method730(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub7 local10 = (Class2_Sub1_Sub7) Static36.aClass21_11.method744((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static22.aClass33_8.method1150(arg0, 14);
		local10 = new Class2_Sub1_Sub7();
		if (local20 != null) {
			local10.method980(new Class2_Sub8(local20));
		}
		Static36.aClass21_11.method745((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(Z)V")
	public static void method734() {
		for (@Pc(15) Class2_Sub12 local15 = (Class2_Sub12) Static13.aClass52_3.method1587(); local15 != null; local15 = (Class2_Sub12) Static13.aClass52_3.method1588()) {
			if (local15.anInt1690 > 0) {
				local15.anInt1690--;
			}
			if (local15.anInt1690 != 0) {
				if (local15.anInt1700 > 0) {
					local15.anInt1700--;
				}
				if (local15.anInt1700 == 0 && local15.anInt1709 >= 1 && local15.anInt1698 >= 1 && local15.anInt1709 <= 102 && local15.anInt1698 <= 102 && (local15.anInt1701 < 0 || Static27.method498(local15.anInt1707, local15.anInt1701))) {
					Static65.method1166(local15.anInt1708, local15.anInt1709, local15.anInt1701, local15.anInt1707, local15.anInt1692, local15.anInt1702, local15.anInt1698);
					local15.anInt1700 = -1;
					if (local15.anInt1701 == local15.anInt1696 && local15.anInt1696 == -1) {
						local15.method1794();
					} else if (local15.anInt1701 == local15.anInt1696 && local15.anInt1692 == local15.anInt1706 && local15.anInt1699 == local15.anInt1707) {
						local15.method1794();
					}
				}
			} else if (local15.anInt1696 < 0 || Static27.method498(local15.anInt1699, local15.anInt1696)) {
				Static65.method1166(local15.anInt1708, local15.anInt1709, local15.anInt1696, local15.anInt1699, local15.anInt1706, local15.anInt1702, local15.anInt1698);
				local15.method1794();
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIILclient!fe;III)V")
	public static void method737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class2_Sub8 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(32) int local32;
		if (arg6 < 0 || arg6 >= 104 || arg0 < 0 || arg0 >= 104) {
			while (true) {
				local32 = arg4.method1410();
				if (local32 == 0) {
					break;
				}
				if (local32 == 1) {
					arg4.method1410();
					break;
				}
				if (local32 <= 49) {
					arg4.method1410();
				}
			}
			return;
		}
		Static50.aByteArrayArrayArray6[arg2][arg6][arg0] = 0;
		while (true) {
			local32 = arg4.method1410();
			if (local32 == 0) {
				if (arg2 == 0) {
					Static61.anIntArrayArrayArray6[0][arg6][arg0] = -Static40.method784(arg6 + arg1 + 932731, arg3 + 556238 - -arg0) * 8;
				} else {
					Static61.anIntArrayArrayArray6[arg2][arg6][arg0] = Static61.anIntArrayArrayArray6[arg2 - 1][arg6][arg0] - 240;
				}
				break;
			}
			if (local32 == 1) {
				@Pc(89) int local89 = arg4.method1410();
				if (local89 == 1) {
					local89 = 0;
				}
				if (arg2 == 0) {
					Static61.anIntArrayArrayArray6[0][arg6][arg0] = -local89 * 8;
				} else {
					Static61.anIntArrayArrayArray6[arg2][arg6][arg0] = Static61.anIntArrayArrayArray6[arg2 - 1][arg6][arg0] - local89 * 8;
				}
				break;
			}
			if (local32 <= 49) {
				Static5.aByteArrayArrayArray1[arg2][arg6][arg0] = arg4.method1380();
				Static38.aByteArrayArrayArray4[arg2][arg6][arg0] = (byte) ((local32 - 2) / 4);
				Static7.aByteArrayArrayArray2[arg2][arg6][arg0] = (byte) (arg5 + local32 - 2 & 0x3);
			} else if (local32 <= 81) {
				Static50.aByteArrayArrayArray6[arg2][arg6][arg0] = (byte) (local32 - 49);
			} else {
				Static7.aByteArrayArrayArray3[arg2][arg6][arg0] = (byte) (local32 - 81);
			}
		}
	}
}
