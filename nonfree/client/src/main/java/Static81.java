import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
	public static int anInt2054;

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "Lclient!kb;")
	private static Class46 aClass46_693 = Static65.method1172("Your account has been disabled)3");

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "Lclient!kb;")
	public static Class46 aClass46_690 = aClass46_693;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!kb;")
	public static Class46 aClass46_691 = Static65.method1172(": ");

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	public static int anInt2039 = 0;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "[I")
	public static int[] anIntArray203 = new int[5];

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!kb;")
	public static Class46 aClass46_692 = Static65.method1172(":tradereq:");

	@OriginalMember(owner = "client!kb", name = "X", descriptor = "Lclient!kb;")
	public static Class46 aClass46_694 = Static65.method1172("headicons_prayer");

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public static void method1350() {
		aClass46_692 = null;
		anIntArray203 = null;
		aClass46_691 = null;
		aClass46_694 = null;
		aClass46_690 = null;
		aClass46_693 = null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public static void method1354() {
		for (@Pc(10) Class3_Sub2_Sub1_Sub4 local10 = (Class3_Sub2_Sub1_Sub4) Static26.aClass59_3.method1731(); local10 != null; local10 = (Class3_Sub2_Sub1_Sub4) Static26.aClass59_3.method1734()) {
			if (local10.anInt2667 != Static99.anInt2422 || local10.anInt2673 < Static20.anInt512) {
				local10.method2900();
			} else if (local10.anInt2659 <= Static20.anInt512) {
				if (local10.anInt2664 > 0) {
					@Pc(47) Class3_Sub2_Sub1_Sub1_Sub2 local47 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local10.anInt2664 - 1];
					if (local47 != null && local47.anInt1700 >= 0 && local47.anInt1700 < 13312 && local47.anInt1711 >= 0 && local47.anInt1711 < 13312) {
						local10.method1841(Static168.method2689(local47.anInt1711, local47.anInt1700, local10.anInt2667) - local10.anInt2662, Static20.anInt512, local47.anInt1711, local47.anInt1700);
					}
				}
				if (local10.anInt2664 < 0) {
					@Pc(102) int local102 = -local10.anInt2664 - 1;
					@Pc(107) Class3_Sub2_Sub1_Sub1_Sub1 local107;
					if (local102 == Static6.anInt137) {
						local107 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1;
					} else {
						local107 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local102];
					}
					if (local107 != null && local107.anInt1700 >= 0 && local107.anInt1700 < 13312 && local107.anInt1711 >= 0 && local107.anInt1711 < 13312) {
						local10.method1841(Static168.method2689(local107.anInt1711, local107.anInt1700, local10.anInt2667) - local10.anInt2662, Static20.anInt512, local107.anInt1711, local107.anInt1700);
					}
				}
				local10.method1844(Static22.anInt526);
				Static154.aClass62_1.method2005(Static99.anInt2422, (int) local10.aDouble6, (int) local10.aDouble5, (int) local10.aDouble7, 60, local10, local10.anInt2674, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(BLclient!kb;)Z")
	public static boolean method1359(@OriginalArg(1) Class46 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static25.anInt3983; local11++) {
			if (arg0.method1389(Static120.aClass46Array17[local11])) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public static void method1360() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(38) int local38;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(74) int local74;
		if (Static57.anInt1552 == 118) {
			local14 = Static49.aClass3_Sub4_Sub1_2.method191();
			local22 = Static137.anInt3206 + (local14 >> 4 & 0x7);
			local28 = (local14 & 0x7) + Static173.anInt3781;
			local32 = Static49.aClass3_Sub4_Sub1_2.method208();
			local38 = Static49.aClass3_Sub4_Sub1_2.method191();
			local44 = local38 >> 4 & 0xF;
			local48 = local38 & 0x7;
			local52 = Static49.aClass3_Sub4_Sub1_2.method191();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local74 = local44 + 1;
				if (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0] >= local22 - local74 && local22 + local74 >= Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0] && local28 - local74 <= Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0] && Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0] <= local28 + local74 && Static147.anInt3353 != 0 && local48 > 0 && Static88.anInt2165 < 50) {
					Static123.anIntArray332[Static88.anInt2165] = local32;
					Static49.anIntArray126[Static88.anInt2165] = local48;
					Static90.anIntArray225[Static88.anInt2165] = local52;
					Static146.aClass24Array1[Static88.anInt2165] = null;
					Static63.anIntArray155[Static88.anInt2165] = (local28 << 8) + (local22 << 16) + local44;
					Static88.anInt2165++;
				}
			}
		}
		if (Static57.anInt1552 == 109) {
			local14 = Static49.aClass3_Sub4_Sub1_2.method191();
			local28 = Static173.anInt3781 + (local14 & 0x7);
			local22 = (local14 >> 4 & 0x7) + Static137.anInt3206;
			local32 = Static49.aClass3_Sub4_Sub1_2.method208();
			local38 = Static49.aClass3_Sub4_Sub1_2.method191();
			local44 = Static49.aClass3_Sub4_Sub1_2.method208();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				local28 = local28 * 128 + 64;
				local22 = local22 * 128 + 64;
				@Pc(239) Class3_Sub2_Sub1_Sub3 local239 = new Class3_Sub2_Sub1_Sub3(local32, Static99.anInt2422, local22, local28, Static168.method2689(local28, local22, Static99.anInt2422) - local38, local44, Static20.anInt512);
				Static181.aClass59_16.method1730(local239);
			}
			return;
		}
		@Pc(317) int local317;
		if (Static57.anInt1552 == 188) {
			local14 = Static49.aClass3_Sub4_Sub1_2.method171();
			local22 = Static49.aClass3_Sub4_Sub1_2.method192();
			local28 = (local22 >> 4 & 0x7) + Static137.anInt3206;
			local32 = Static173.anInt3781 + (local22 & 0x7);
			local38 = Static49.aClass3_Sub4_Sub1_2.method192();
			local44 = local38 >> 2;
			local48 = local38 & 0x3;
			local52 = Static31.anIntArray67[local44];
			if (local28 >= 0 && local32 >= 0 && local28 < 103 && local32 < 103) {
				if (local52 == 0) {
					@Pc(308) Class2 local308 = Static154.aClass62_1.method1992(Static99.anInt2422, local28, local32);
					if (local308 != null) {
						local317 = local308.anInt26 >> 14 & 0x7FFF;
						if (local44 == 2) {
							local308.aClass3_Sub2_Sub1_1 = new Class3_Sub2_Sub1_Sub5(local317, 2, local48 + 4, Static99.anInt2422, local28, local32, local14, false, local308.aClass3_Sub2_Sub1_1);
							local308.aClass3_Sub2_Sub1_2 = new Class3_Sub2_Sub1_Sub5(local317, 2, local48 + 1 & 0x3, Static99.anInt2422, local28, local32, local14, false, local308.aClass3_Sub2_Sub1_2);
						} else {
							local308.aClass3_Sub2_Sub1_1 = new Class3_Sub2_Sub1_Sub5(local317, local44, local48, Static99.anInt2422, local28, local32, local14, false, local308.aClass3_Sub2_Sub1_1);
						}
					}
				}
				if (local52 == 1) {
					@Pc(384) Class36 local384 = Static154.aClass62_1.method1986(Static99.anInt2422, local28, local32);
					if (local384 != null) {
						local317 = local384.anInt1750 >> 14 & 0x7FFF;
						if (local44 == 4 || local44 == 5) {
							local384.aClass3_Sub2_Sub1_5 = new Class3_Sub2_Sub1_Sub5(local317, 4, local48, Static99.anInt2422, local28, local32, local14, false, local384.aClass3_Sub2_Sub1_5);
						} else if (local44 == 6) {
							local384.aClass3_Sub2_Sub1_5 = new Class3_Sub2_Sub1_Sub5(local317, 4, local48 + 4, Static99.anInt2422, local28, local32, local14, false, local384.aClass3_Sub2_Sub1_5);
						} else if (local44 == 7) {
							local384.aClass3_Sub2_Sub1_5 = new Class3_Sub2_Sub1_Sub5(local317, 4, (local48 + 2 & 0x3) + 4, Static99.anInt2422, local28, local32, local14, false, local384.aClass3_Sub2_Sub1_5);
						} else if (local44 == 8) {
							local384.aClass3_Sub2_Sub1_5 = new Class3_Sub2_Sub1_Sub5(local317, 4, local48 + 4, Static99.anInt2422, local28, local32, local14, false, local384.aClass3_Sub2_Sub1_5);
							local384.aClass3_Sub2_Sub1_4 = new Class3_Sub2_Sub1_Sub5(local317, 4, (local48 + 2 & 0x3) + 4, Static99.anInt2422, local28, local32, local14, false, local384.aClass3_Sub2_Sub1_4);
						}
					}
				}
				if (local52 == 2) {
					if (local44 == 11) {
						local44 = 10;
					}
					@Pc(527) Class17 local527 = Static154.aClass62_1.method1979(Static99.anInt2422, local28, local32);
					if (local527 != null) {
						local527.aClass3_Sub2_Sub1_3 = new Class3_Sub2_Sub1_Sub5(local527.anInt534 >> 14 & 0x7FFF, local44, local48, Static99.anInt2422, local28, local32, local14, false, local527.aClass3_Sub2_Sub1_3);
					}
				}
				if (local52 == 3) {
					@Pc(558) Class60 local558 = Static154.aClass62_1.method2006(Static99.anInt2422, local28, local32);
					if (local558 != null) {
						local558.aClass3_Sub2_Sub1_9 = new Class3_Sub2_Sub1_Sub5(local558.anInt2615 >> 14 & 0x7FFF, 22, local48, Static99.anInt2422, local28, local32, local14, false, local558.aClass3_Sub2_Sub1_9);
					}
				}
			}
		} else if (Static57.anInt1552 == 242) {
			local14 = Static49.aClass3_Sub4_Sub1_2.method171();
			local22 = Static49.aClass3_Sub4_Sub1_2.method192();
			local32 = (local22 & 0x7) + Static173.anInt3781;
			local28 = (local22 >> 4 & 0x7) + Static137.anInt3206;
			local38 = Static49.aClass3_Sub4_Sub1_2.method205();
			local44 = local38 >> 2;
			local48 = local38 & 0x3;
			local52 = Static31.anIntArray67[local44];
			if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
				Static55.method1028(0, local28, local32, -1, local48, Static99.anInt2422, local44, local14, local52);
			}
		} else {
			@Pc(700) Class3_Sub2_Sub1_Sub7 local700;
			if (Static57.anInt1552 == 167) {
				local14 = Static49.aClass3_Sub4_Sub1_2.method174();
				local22 = Static49.aClass3_Sub4_Sub1_2.method208();
				local28 = Static49.aClass3_Sub4_Sub1_2.method205();
				local38 = (local28 & 0x7) + Static173.anInt3781;
				local32 = (local28 >> 4 & 0x7) + Static137.anInt3206;
				if (local32 >= 0 && local38 >= 0 && local32 < 104 && local38 < 104) {
					local700 = new Class3_Sub2_Sub1_Sub7();
					local700.anInt3721 = local22;
					local700.anInt3718 = local14;
					if (Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local32][local38] == null) {
						Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local32][local38] = new Class59();
					}
					Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local32][local38].method1730(local700);
					Static129.method2168(local38, local32);
				}
			} else if (Static57.anInt1552 == 100) {
				local14 = Static49.aClass3_Sub4_Sub1_2.method191();
				local22 = (local14 >> 4 & 0x7) + Static137.anInt3206;
				local28 = (local14 & 0x7) + Static173.anInt3781;
				local32 = Static49.aClass3_Sub4_Sub1_2.method223();
				local44 = local32 & 0x3;
				local38 = local32 >> 2;
				local48 = Static31.anIntArray67[local38];
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					Static55.method1028(0, local22, local28, -1, local44, Static99.anInt2422, local38, -1, local48);
				}
			} else if (Static57.anInt1552 == 172) {
				local14 = Static49.aClass3_Sub4_Sub1_2.method223();
				local22 = Static137.anInt3206 + (local14 >> 4 & 0x7);
				local28 = Static173.anInt3781 + (local14 & 0x7);
				local32 = Static49.aClass3_Sub4_Sub1_2.method208();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					@Pc(866) Class59 local866 = Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local22][local28];
					if (local866 != null) {
						for (local700 = (Class3_Sub2_Sub1_Sub7) local866.method1731(); local700 != null; local700 = (Class3_Sub2_Sub1_Sub7) local866.method1734()) {
							if ((local32 & 0x7FFF) == local700.anInt3721) {
								local700.method2900();
								break;
							}
						}
						if (local866.method1731() == null) {
							Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local22][local28] = null;
						}
						Static129.method2168(local28, local22);
					}
				}
			} else if (Static57.anInt1552 == 88) {
				local14 = Static49.aClass3_Sub4_Sub1_2.method184();
				local22 = Static49.aClass3_Sub4_Sub1_2.method171();
				local28 = Static49.aClass3_Sub4_Sub1_2.method192();
				local32 = (local28 >> 4 & 0x7) + Static137.anInt3206;
				local38 = (local28 & 0x7) + Static173.anInt3781;
				local44 = Static49.aClass3_Sub4_Sub1_2.method208();
				if (local32 >= 0 && local38 >= 0 && local32 < 104 && local38 < 104 && Static6.anInt137 != local22) {
					@Pc(973) Class3_Sub2_Sub1_Sub7 local973 = new Class3_Sub2_Sub1_Sub7();
					local973.anInt3718 = local44;
					local973.anInt3721 = local14;
					if (Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local32][local38] == null) {
						Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local32][local38] = new Class59();
					}
					Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local32][local38].method1730(local973);
					Static129.method2168(local38, local32);
				}
			} else if (Static57.anInt1552 == 23) {
				local14 = Static49.aClass3_Sub4_Sub1_2.method191();
				local28 = (local14 & 0x7) + Static173.anInt3781;
				local22 = (local14 >> 4 & 0x7) + Static137.anInt3206;
				local32 = Static49.aClass3_Sub4_Sub1_2.method208();
				local38 = Static49.aClass3_Sub4_Sub1_2.method208();
				local44 = Static49.aClass3_Sub4_Sub1_2.method208();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					@Pc(1067) Class59 local1067 = Static148.aClass59ArrayArrayArray2[Static99.anInt2422][local22][local28];
					if (local1067 != null) {
						for (@Pc(1074) Class3_Sub2_Sub1_Sub7 local1074 = (Class3_Sub2_Sub1_Sub7) local1067.method1731(); local1074 != null; local1074 = (Class3_Sub2_Sub1_Sub7) local1067.method1734()) {
							if ((local32 & 0x7FFF) == local1074.anInt3721 && local1074.anInt3718 == local38) {
								local1074.anInt3718 = local44;
								break;
							}
						}
						Static129.method2168(local28, local22);
					}
				}
			} else {
				@Pc(1175) int local1175;
				@Pc(1179) int local1179;
				@Pc(1185) int local1185;
				if (Static57.anInt1552 == 30) {
					local14 = Static49.aClass3_Sub4_Sub1_2.method191();
					local22 = (local14 >> 4 & 0x7) + Static137.anInt3206;
					local28 = Static173.anInt3781 + (local14 & 0x7);
					local32 = Static49.aClass3_Sub4_Sub1_2.method203() + local22;
					local38 = local28 + Static49.aClass3_Sub4_Sub1_2.method203();
					local44 = Static49.aClass3_Sub4_Sub1_2.method220();
					local48 = Static49.aClass3_Sub4_Sub1_2.method208();
					local52 = Static49.aClass3_Sub4_Sub1_2.method191() * 4;
					local74 = Static49.aClass3_Sub4_Sub1_2.method191() * 4;
					local317 = Static49.aClass3_Sub4_Sub1_2.method208();
					local1175 = Static49.aClass3_Sub4_Sub1_2.method208();
					local1179 = Static49.aClass3_Sub4_Sub1_2.method191();
					local1185 = Static49.aClass3_Sub4_Sub1_2.method191();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local32 >= 0 && local38 >= 0 && local32 < 104 && local38 < 104 && local48 != 65535) {
						local38 = local38 * 128 + 64;
						local22 = local22 * 128 + 64;
						local28 = local28 * 128 + 64;
						local32 = local32 * 128 + 64;
						@Pc(1278) Class3_Sub2_Sub1_Sub4 local1278 = new Class3_Sub2_Sub1_Sub4(local48, Static99.anInt2422, local22, local28, Static168.method2689(local28, local22, Static99.anInt2422) - local52, local317 - -Static20.anInt512, Static20.anInt512 + local1175, local1179, local1185, local44, local74);
						local1278.method1841(Static168.method2689(local38, local32, Static99.anInt2422) - local74, Static20.anInt512 + local317, local38, local32);
						Static26.aClass59_3.method1730(local1278);
					}
				} else if (Static57.anInt1552 == 207) {
					local14 = Static49.aClass3_Sub4_Sub1_2.method171();
					local22 = Static49.aClass3_Sub4_Sub1_2.method205();
					local32 = local22 & 0x3;
					local28 = local22 >> 2;
					local38 = Static31.anIntArray67[local28];
					@Pc(1331) byte local1331 = Static49.aClass3_Sub4_Sub1_2.method199();
					@Pc(1337) byte local1337 = Static49.aClass3_Sub4_Sub1_2.method199();
					@Pc(1341) byte local1341 = Static49.aClass3_Sub4_Sub1_2.method203();
					@Pc(1347) byte local1347 = Static49.aClass3_Sub4_Sub1_2.method194();
					local317 = Static49.aClass3_Sub4_Sub1_2.method171();
					local1175 = Static49.aClass3_Sub4_Sub1_2.method171();
					local1179 = Static49.aClass3_Sub4_Sub1_2.method184();
					local1185 = Static49.aClass3_Sub4_Sub1_2.method223();
					@Pc(1373) int local1373 = (local1185 >> 4 & 0x7) + Static137.anInt3206;
					@Pc(1379) int local1379 = (local1185 & 0x7) + Static173.anInt3781;
					@Pc(1386) Class3_Sub2_Sub1_Sub1_Sub1 local1386;
					if (Static6.anInt137 == local1179) {
						local1386 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1;
					} else {
						local1386 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local1179];
					}
					if (local1386 != null) {
						@Pc(1396) Class3_Sub2_Sub9 local1396 = Static136.method2319(local317);
						@Pc(1405) int local1405;
						@Pc(1408) int local1408;
						if (local32 == 1 || local32 == 3) {
							local1405 = local1396.anInt1825;
							local1408 = local1396.anInt1795;
						} else {
							local1405 = local1396.anInt1795;
							local1408 = local1396.anInt1825;
						}
						@Pc(1425) int local1425 = local1373 + (local1405 + 1 >> 1);
						@Pc(1433) int local1433 = (local1408 + 1 >> 1) + local1379;
						@Pc(1439) int local1439 = local1379 + (local1408 >> 1);
						@Pc(1445) int local1445 = local1373 + (local1405 >> 1);
						@Pc(1449) int[][] local1449 = Static133.anIntArrayArrayArray8[Static99.anInt2422];
						@Pc(1476) int local1476 = local1449[local1445][local1433] + local1449[local1425][local1439] + local1449[local1445][local1439] + local1449[local1425][local1433] >> 2;
						@Pc(1484) int local1484 = (local1373 << 7) + (local1405 << 6);
						@Pc(1492) int local1492 = (local1379 << 7) + (local1408 << 6);
						@Pc(1502) Class3_Sub2_Sub1_Sub2 local1502 = local1396.method1209(local1476, local1484, local1449, local28, local1492, local32);
						if (local1502 != null) {
							Static55.method1028(local14 + 1, local1373, local1379, local1175 + 1, 0, Static99.anInt2422, 0, -1, local38);
							@Pc(1528) byte local1528;
							if (local1337 > local1341) {
								local1528 = local1337;
								local1337 = local1341;
								local1341 = local1528;
							}
							local1386.anInt891 = local1408 * 64 + local1379 * 128;
							local1386.anInt903 = local14 + Static20.anInt512;
							local1386.anInt897 = local1341 + local1373;
							local1386.anInt895 = local1476;
							local1386.anInt904 = Static20.anInt512 + local1175;
							local1386.anInt896 = local1373 * 128 + local1405 * 64;
							if (local1331 < local1347) {
								local1528 = local1347;
								local1347 = local1331;
								local1331 = local1528;
							}
							local1386.anInt898 = local1347 + local1379;
							local1386.aClass3_Sub2_Sub1_Sub2_1 = local1502;
							local1386.anInt900 = local1331 + local1379;
							local1386.anInt899 = local1337 + local1373;
							return;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
	public static void method1366() {
		Static163.anInt3623 = 0;
		Static124.anInt2964 = -1;
		Static57.anInt1552 = -1;
		Static87.anInt2129 = 0;
		Static105.aBoolean103 = false;
		Static42.anInt1174 = 0;
		Static133.aClass3_Sub4_Sub1_3.anInt232 = 0;
		Static139.anInt3221 = 0;
		Static97.anInt1739 = 0;
		Static32.anInt911 = 0;
		Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
		Static72.anInt1850 = -1;
		Static156.anInt3496 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1.length; local35++) {
			if (Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local35] != null) {
				Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local35].anInt1723 = -1;
			}
		}
		for (@Pc(57) int local57 = 0; local57 < Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1.length; local57++) {
			if (Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local57] != null) {
				Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local57].anInt1723 = -1;
			}
		}
		Static9.method256();
		Static180.method2893(30);
		for (@Pc(84) int local84 = 0; local84 < 100; local84++) {
			Static178.aBooleanArray20[local84] = true;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!kb;Lclient!kb;Lclient!kb;I)V")
	public static void method1387(@OriginalArg(0) Class46 arg0, @OriginalArg(1) Class46 arg1, @OriginalArg(2) Class46 arg2) {
		Static130.aClass46_1064 = arg1;
		Static130.aClass46_1062 = arg0;
		Static130.aClass46_1060 = arg2;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V")
	public static void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static154.aClass62_1.method2008(arg2, arg3, arg0);
		@Pc(23) int local23;
		@Pc(61) int local61;
		@Pc(27) int local27;
		@Pc(32) int local32;
		@Pc(55) int local55;
		@Pc(67) int local67;
		if (local11 != 0) {
			local23 = Static154.aClass62_1.method1967(arg2, arg3, arg0, local11);
			local27 = local23 & 0x1F;
			@Pc(30) int[] local30 = Static12.aClass3_Sub2_Sub3_Sub3_43.anIntArray301;
			local32 = arg4;
			if (local11 > 0) {
				local32 = arg1;
			}
			local55 = arg3 * 4 + (52736 - arg0 * 512) * 4 + 24624;
			local61 = local23 >> 6 & 0x3;
			local67 = local11 >> 14 & 0x7FFF;
			@Pc(71) Class3_Sub2_Sub9 local71 = Static136.method2319(local67);
			if (local71.anInt1812 == -1) {
				if (local27 == 0 || local27 == 2) {
					if (local61 == 0) {
						local30[local55] = local32;
						local30[local55 + 512] = local32;
						local30[local55 + 1024] = local32;
						local30[local55 + 1536] = local32;
					} else if (local61 == 1) {
						local30[local55] = local32;
						local30[local55 + 1] = local32;
						local30[local55 + 2] = local32;
						local30[local55 + 3] = local32;
					} else if (local61 == 2) {
						local30[local55 + 3] = local32;
						local30[local55 + 512 + 3] = local32;
						local30[local55 + 1027] = local32;
						local30[local55 + 1536 + 3] = local32;
					} else if (local61 == 3) {
						local30[local55 + 1536] = local32;
						local30[local55 + 1536 + 1] = local32;
						local30[local55 + 1536 + 2] = local32;
						local30[local55 + 3 + 1536] = local32;
					}
				}
				if (local27 == 3) {
					if (local61 == 0) {
						local30[local55] = local32;
					} else if (local61 == 1) {
						local30[local55 + 3] = local32;
					} else if (local61 == 2) {
						local30[local55 + 1536 + 3] = local32;
					} else if (local61 == 3) {
						local30[local55 + 1536] = local32;
					}
				}
				if (local27 == 2) {
					if (local61 == 3) {
						local30[local55] = local32;
						local30[local55 + 512] = local32;
						local30[local55 + 1024] = local32;
						local30[local55 + 1536] = local32;
					} else if (local61 == 0) {
						local30[local55] = local32;
						local30[local55 + 1] = local32;
						local30[local55 + 2] = local32;
						local30[local55 + 3] = local32;
					} else if (local61 == 1) {
						local30[local55 + 3] = local32;
						local30[local55 + 512 + 3] = local32;
						local30[local55 + 3 + 1024] = local32;
						local30[local55 + 1539] = local32;
					} else if (local61 == 2) {
						local30[local55 + 1536] = local32;
						local30[local55 + 1537] = local32;
						local30[local55 + 1536 + 2] = local32;
						local30[local55 + 1539] = local32;
					}
				}
			} else {
				@Pc(80) Class3_Sub2_Sub3_Sub2 local80 = Static7.aClass3_Sub2_Sub3_Sub2Array1[local71.anInt1812];
				if (local80 != null) {
					@Pc(93) int local93 = (local71.anInt1795 * 4 - local80.anInt2494) / 2;
					@Pc(104) int local104 = (local71.anInt1825 * 4 - local80.anInt2495) / 2;
					local80.method1713(arg3 * 4 + local93 + 48, local104 + (48 - -((-local71.anInt1825 + 104 + -arg0) * 4)));
				}
			}
		}
		local11 = Static154.aClass62_1.method1996(arg2, arg3, arg0);
		if (local11 != 0) {
			local23 = Static154.aClass62_1.method1967(arg2, arg3, arg0, local11);
			local61 = local23 >> 6 & 0x3;
			local32 = local11 >> 14 & 0x7FFF;
			@Pc(466) Class3_Sub2_Sub9 local466 = Static136.method2319(local32);
			local27 = local23 & 0x1F;
			@Pc(492) int local492;
			if (local466.anInt1812 != -1) {
				@Pc(479) Class3_Sub2_Sub3_Sub2 local479 = Static7.aClass3_Sub2_Sub3_Sub2Array1[local466.anInt1812];
				if (local479 != null) {
					local492 = (local466.anInt1825 * 4 - local479.anInt2495) / 2;
					local67 = (local466.anInt1795 * 4 - local479.anInt2494) / 2;
					local479.method1713(arg3 * 4 + local67 + 48, (-arg0 + 104 + -local466.anInt1825) * 4 + 48 + local492);
				}
			} else if (local27 == 9) {
				local55 = 15658734;
				@Pc(538) int[] local538 = Static12.aClass3_Sub2_Sub3_Sub3_43.anIntArray301;
				if (local11 > 0) {
					local55 = 15597568;
				}
				local492 = arg3 * 4 + (103 - arg0) * 512 * 4 + 24624;
				if (local61 == 0 || local61 == 2) {
					local538[local492 + 1536] = local55;
					local538[local492 + 1 + 1024] = local55;
					local538[local492 + 512 + 2] = local55;
					local538[local492 + 3] = local55;
				} else {
					local538[local492] = local55;
					local538[local492 + 513] = local55;
					local538[local492 + 1024 + 2] = local55;
					local538[local492 + 1536 + 3] = local55;
				}
			}
		}
		local11 = Static154.aClass62_1.method1973(arg2, arg3, arg0);
		if (local11 == 0) {
			return;
		}
		local23 = local11 >> 14 & 0x7FFF;
		@Pc(647) Class3_Sub2_Sub9 local647 = Static136.method2319(local23);
		if (local647.anInt1812 == -1) {
			return;
		}
		@Pc(656) Class3_Sub2_Sub3_Sub2 local656 = Static7.aClass3_Sub2_Sub3_Sub2Array1[local647.anInt1812];
		if (local656 != null) {
			local32 = (local647.anInt1795 * 4 - local656.anInt2494) / 2;
			@Pc(679) int local679 = (local647.anInt1825 * 4 - local656.anInt2495) / 2;
			local656.method1713(arg3 * 4 + local32 + 48, local679 + (48 - -((-local647.anInt1825 + (104 - arg0)) * 4)));
			return;
		}
	}
}
