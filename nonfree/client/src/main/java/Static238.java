import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!pg", name = "l", descriptor = "[I")
	public static final int[] anIntArray366 = new int[5];

	@OriginalMember(owner = "client!pg", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString267 = "flash3:";

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray38 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
	public static int anInt4610 = 0;

	@OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
	public static int anInt4612 = -1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ra;I)V")
	public static void method4047(@OriginalArg(0) Class170 arg0) {
		Static139.aClass170_116 = arg0;
		Static139.aClass170_116.method4575(35);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I")
	public static int method4048(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public static void method4049() {
		Static277.method4707(false);
		Static324.anInt6150 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static129.aByteArrayArray6.length; local14++) {
			if (Static139.anIntArray529[local14] != -1 && Static129.aByteArrayArray6[local14] == null) {
				Static129.aByteArrayArray6[local14] = Static2.aClass170_1.method4584(Static139.anIntArray529[local14], 0);
				if (Static129.aByteArrayArray6[local14] == null) {
					Static324.anInt6150++;
					local12 = false;
				}
			}
			if (Static55.anIntArray63[local14] != -1 && Static210.aByteArrayArray21[local14] == null) {
				Static210.aByteArrayArray21[local14] = Static2.aClass170_1.method4551(Static19.anIntArrayArray2[local14], 0, Static55.anIntArray63[local14]);
				if (Static210.aByteArrayArray21[local14] == null) {
					Static324.anInt6150++;
					local12 = false;
				}
			}
			if (Static228.anIntArray321[local14] != -1 && Static49.aByteArrayArray4[local14] == null) {
				Static49.aByteArrayArray4[local14] = Static2.aClass170_1.method4584(Static228.anIntArray321[local14], 0);
				if (Static49.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static324.anInt6150++;
				}
			}
			if (Static287.anIntArray415[local14] != -1 && Static353.aByteArrayArray25[local14] == null) {
				Static353.aByteArrayArray25[local14] = Static2.aClass170_1.method4584(Static287.anIntArray415[local14], 0);
				if (Static353.aByteArrayArray25[local14] == null) {
					Static324.anInt6150++;
					local12 = false;
				}
			}
			if (Static249.anIntArray376 != null && Static27.aByteArrayArray19[local14] == null && Static249.anIntArray376[local14] != -1) {
				Static27.aByteArrayArray19[local14] = Static2.aClass170_1.method4551(Static19.anIntArrayArray2[local14], 0, Static249.anIntArray376[local14]);
				if (Static27.aByteArrayArray19[local14] == null) {
					Static324.anInt6150++;
					local12 = false;
				}
			}
		}
		if (Static334.aClass194_3 == null) {
			if (Static256.aClass5_Sub9_Sub8_2 == null || !Static117.aClass170_52.method4565(Static256.aClass5_Sub9_Sub8_2.aString136 + "_staticelements")) {
				Static334.aClass194_3 = new Class194(0);
			} else if (Static117.aClass170_52.method4549(Static256.aClass5_Sub9_Sub8_2.aString136 + "_staticelements")) {
				Static334.aClass194_3 = Static278.method4730(Static256.aClass5_Sub9_Sub8_2.aString136 + "_staticelements", Static117.aClass170_52, Static32.aBoolean63);
			} else {
				Static324.anInt6150++;
				local12 = false;
			}
		}
		if (!local12) {
			Static253.anInt4963 = 1;
			return;
		}
		Static345.anInt6412 = 0;
		local12 = true;
		@Pc(272) int local272;
		@Pc(283) int local283;
		for (@Pc(254) int local254 = 0; local254 < Static129.aByteArrayArray6.length; local254++) {
			@Pc(260) byte[] local260 = Static210.aByteArrayArray21[local254];
			if (local260 != null) {
				local272 = (Static338.anIntArray283[local254] >> 8) * 64 - Static263.anInt5063;
				local283 = (Static338.anIntArray283[local254] & 0xFF) * 64 - Static28.anInt773;
				if (Static324.aBoolean460) {
					local283 = 10;
					local272 = 10;
				}
				local12 &= Static67.method1490(local272, local283, local260);
			}
			local260 = Static353.aByteArrayArray25[local254];
			if (local260 != null) {
				local272 = (Static338.anIntArray283[local254] >> 8) * 64 - Static263.anInt5063;
				local283 = (Static338.anIntArray283[local254] & 0xFF) * 64 - Static28.anInt773;
				if (Static324.aBoolean460) {
					local272 = 10;
					local283 = 10;
				}
				local12 &= Static67.method1490(local272, local283, local260);
			}
		}
		if (!local12) {
			Static253.anInt4963 = 2;
			return;
		}
		if (Static253.anInt4963 != 0) {
			Static240.method4079(Static334.aString363 + "<br>(100%)", Static62.aClass91_3, true);
		}
		Static153.method2894();
		Static123.method2410();
		@Pc(369) boolean local369 = false;
		if (Static15.aClass59_1.method4818() && Static322.aBoolean457) {
			for (local272 = 0; local272 < Static129.aByteArrayArray6.length; local272++) {
				if (Static353.aByteArrayArray25[local272] != null || Static49.aByteArrayArray4[local272] != null) {
					local369 = true;
					break;
				}
			}
		}
		if (Static18.aBoolean39) {
			local272 = Static82.anIntArray114[Static121.anInt2577];
		} else {
			local272 = Static99.anIntArray128[Static121.anInt2577];
		}
		if (Static15.aClass59_1.method4864()) {
			local272++;
		}
		Static269.method4548(Static266.anInt5101, Static339.anInt6352, local272, local369, Static15.aClass59_1.method4796() > 0);
		for (local283 = 0; local283 < 4; local283++) {
			Static117.aClass49Array1[local283].method1236();
		}
		Static16.method520();
		Static188.method3461(false);
		Static254.method4679();
		Static153.method2894();
		System.gc();
		Static277.method4707(true);
		Static81.method1790(4);
		@Pc(456) int[][] local456 = null;
		if (!Static324.aBoolean460) {
			Static319.method5390(false);
			Static82.method1815(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0] >> 3, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0] >> 3);
			Static222.method3885();
			Static354.method5829(false, null, Static15.aClass59_1, 4);
			local456 = Static200.anIntArrayArrayArray17[0];
			Static277.method4707(true);
			Static172.method3270(false);
			if (Static27.aByteArrayArray19 != null) {
				Static145.method5519();
			}
		}
		if (Static324.aBoolean460) {
			Static241.method4108(false);
			Static82.method1815(Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray401[0] >> 3, Static85.aClass25_Sub1_Sub1_Sub1_1.anIntArray402[0] >> 3);
			Static222.method3885();
			Static354.method5829(false, null, Static15.aClass59_1, 4);
			local456 = Static200.anIntArrayArrayArray17[0];
			Static277.method4707(true);
			Static316.method5376(false);
		}
		Static123.method2410();
		Static277.method4707(true);
		Static114.method2256(4, null, false, Static117.aClass49Array1, Static15.aClass59_1);
		Static206.method3680(4, Static15.aClass59_1);
		Static277.method4707(true);
		@Pc(555) int local555 = Static344.anInt1080;
		if (Static156.anInt3123 < local555) {
			local555 = Static156.anInt3123;
		}
		if (Static156.anInt3123 - 1 > local555) {
			local555 = Static156.anInt3123 - 1;
		}
		if (Static26.method628()) {
			Static48.method1064(0);
		} else {
			Static48.method1064(local555);
		}
		Static307.method5245();
		if (local369) {
			Static164.method3036(true);
			Static81.method1790(1);
			if (!Static324.aBoolean460) {
				Static319.method5390(true);
				Static354.method5829(true, local456, Static15.aClass59_1, 1);
				Static277.method4707(true);
				Static172.method3270(true);
				Static206.method3680(1, Static15.aClass59_1);
			}
			if (Static324.aBoolean460) {
				Static241.method4108(true);
				Static354.method5829(true, local456, Static15.aClass59_1, 1);
				Static277.method4707(true);
				Static316.method5376(true);
			}
			Static123.method2410();
			Static277.method4707(true);
			Static114.method2256(1, Static262.aClass3Array3[0], true, Static117.aClass49Array1, Static15.aClass59_1);
			Static206.method3680(1, Static15.aClass59_1);
			Static277.method4707(true);
			Static307.method5245();
			Static164.method3036(false);
		}
		@Pc(660) int local660;
		@Pc(664) int local664;
		for (@Pc(656) int local656 = 0; local656 < 4; local656++) {
			for (local660 = 0; local660 < Static266.anInt5101; local660++) {
				for (local664 = 0; local664 < Static339.anInt6352; local664++) {
					Static60.method1250(local656, local664, local660);
				}
			}
		}
		Static144.method2701();
		Static153.method2894();
		Static43.method973();
		Static123.method2410();
		Static236.aBoolean333 = false;
		Static47.method1059();
		if (Static168.aFrame2 != null && Static95.aClass68_23 != null && Static247.anInt3874 == 25) {
			Static335.aClass5_Sub1_Sub1_3.method174(224);
			Static335.aClass5_Sub1_Sub1_3.method1851(1057001181);
		}
		if (!Static324.aBoolean460) {
			local660 = (Static63.anInt1492 - (Static266.anInt5101 >> 4)) / 8;
			local664 = (Static63.anInt1492 + (Static266.anInt5101 >> 4)) / 8;
			@Pc(744) int local744 = (Static1.anInt3 - (Static339.anInt6352 >> 4)) / 8;
			@Pc(752) int local752 = ((Static339.anInt6352 >> 4) + Static1.anInt3) / 8;
			for (@Pc(756) int local756 = local660 - 1; local756 <= local664 + 1; local756++) {
				for (@Pc(762) int local762 = local744 - 1; local762 <= local752 + 1; local762++) {
					if (local756 < local660 || local664 < local756 || local762 < local744 || local762 > local752) {
						Static2.aClass170_1.method4564("m" + local756 + "_" + local762);
						Static2.aClass170_1.method4564("l" + local756 + "_" + local762);
					}
				}
			}
		}
		if (Static247.anInt3874 == 28) {
			Static293.method4971(10);
		} else {
			Static293.method4971(30);
			if (Static95.aClass68_23 != null) {
				Static335.aClass5_Sub1_Sub1_3.method174(151);
			}
		}
		Static318.method5253();
		Static153.method2894();
		Static209.method3724();
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIII)I")
	public static int method4050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == arg0) {
			return arg1;
		}
		@Pc(16) int local16 = 128 - arg2;
		@Pc(35) int local35 = arg2 * (arg0 & 0x7F) + (arg1 & 0x7F) * local16 >> 7;
		@Pc(49) int local49 = local16 * (arg1 & 0x380) + (arg0 & 0x380) * arg2 >> 7;
		@Pc(64) int local64 = (arg1 & 0xFC00) * local16 + (arg0 & 0xFC00) * arg2 >> 7;
		return local35 & 0x7F | local64 & 0xFC00 | local49 & 0x380;
	}
}
