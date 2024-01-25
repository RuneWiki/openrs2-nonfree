import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "[S")
	public static short[] aShortArray123;

	@OriginalMember(owner = "client!wp", name = "y", descriptor = "I")
	public static int anInt6384;

	@OriginalMember(owner = "client!wp", name = "z", descriptor = "I")
	public static int anInt6385;

	@OriginalMember(owner = "client!wp", name = "s", descriptor = "Lclient!j;")
	public static final Class113 aClass113_19 = new Class113(3, 3);

	@OriginalMember(owner = "client!wp", name = "B", descriptor = "Z")
	public static boolean aBoolean589 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLclient!so;BLclient!so;I)I")
	public static int method5544(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class124_Sub1 arg1, @OriginalArg(3) Class124_Sub1 arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg3 == 1) {
			local11 = arg2.anInt5502;
			local14 = arg1.anInt5502;
			if (!arg0) {
				if (local14 == -1) {
					local14 = 2001;
				}
				if (local11 == -1) {
					local11 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg3 == 2) {
			return Static325.method4731(arg2.method4762().aString58, Static48.anInt952, arg1.method4762().aString58);
		} else if (arg3 == 3) {
			if (arg2.aString65.equals("-")) {
				if (arg1.aString65.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg1.aString65.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static325.method4731(arg2.aString65, Static48.anInt952, arg1.aString65);
			}
		} else if (arg3 == 4) {
			if (arg2.method4750()) {
				return arg1.method4750() ? 0 : 1;
			} else if (arg1.method4750()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 5) {
			if (arg2.method4748()) {
				return arg1.method4748() ? 0 : 1;
			} else if (arg1.method4748()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 6) {
			if (arg2.method4749()) {
				return arg1.method4749() ? 0 : 1;
			} else if (arg1.method4749()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 7) {
			if (arg2.method4754()) {
				return arg1.method4754() ? 0 : 1;
			} else if (arg1.method4754()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg3 == 8) {
			local11 = arg2.anInt5512;
			local14 = arg1.anInt5512;
			if (arg0) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg2.anInt5511 - arg1.anInt5511;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!j;)V")
	public static void method5547(@OriginalArg(1) Class113 arg0) {
		@Pc(16) int local16;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(41) int local41;
		@Pc(45) int local45;
		if (arg0 == Static84.aClass113_2) {
			Static139.aClass1_Sub33_Sub2_1.method5174();
			local16 = Static139.aClass1_Sub33_Sub2_1.method5174();
			local25 = Static357.anInt6083 + (local16 >> 4 & 0x7);
			local31 = Static102.anInt3167 + (local16 & 0x7);
			local35 = Static139.aClass1_Sub33_Sub2_1.method5177();
			local41 = Static139.aClass1_Sub33_Sub2_1.method5174();
			local45 = Static139.aClass1_Sub33_Sub2_1.method5159();
			@Pc(49) String local49 = Static139.aClass1_Sub33_Sub2_1.method5128();
			Static54.method889(local41, local49, local35, local45, Static121.anInt2166, local25, local31);
		} else if (Static374.aClass113_18 == arg0) {
			local16 = Static139.aClass1_Sub33_Sub2_1.method5174();
			local25 = Static357.anInt6083 + (local16 >> 4 & 0x7);
			local31 = (local16 & 0x7) + Static102.anInt3167;
			local35 = Static139.aClass1_Sub33_Sub2_1.method5177();
			local41 = Static139.aClass1_Sub33_Sub2_1.method5177();
			local45 = Static139.aClass1_Sub33_Sub2_1.method5177();
			if (Static338.aClass77_34 != null && local25 >= 0 && local31 >= 0 && Static92.anInt1675 > local25 && local31 < Static262.anInt6340) {
				@Pc(132) Class1_Sub12 local132 = (Class1_Sub12) Static338.aClass77_34.method1368((long) (local31 << 14 | Static121.anInt2166 << 28 | local25));
				if (local132 != null) {
					for (@Pc(140) Class1_Sub11 local140 = (Class1_Sub11) local132.aClass17_12.method202(); local140 != null; local140 = (Class1_Sub11) local132.aClass17_12.method207()) {
						if (local140.anInt1462 == (local35 & 0x7FFF) && local41 == local140.anInt1460) {
							local140.method5577();
							local140.anInt1460 = local45;
							Static287.method4353(local31, local25, local140, Static121.anInt2166);
							break;
						}
					}
					Static80.method1208(Static121.anInt2166, local25, local31);
				}
			}
		} else if (arg0 == Static345.aClass113_16) {
			local16 = Static139.aClass1_Sub33_Sub2_1.method5131();
			local25 = Static139.aClass1_Sub33_Sub2_1.method5174();
			local31 = (local25 >> 4 & 0x7) + Static357.anInt6083;
			local35 = Static102.anInt3167 + (local25 & 0x7);
			local41 = Static139.aClass1_Sub33_Sub2_1.method5131();
			local45 = Static139.aClass1_Sub33_Sub2_1.method5131();
			if (local31 >= 0 && local35 >= 0 && local31 < Static92.anInt1675 && Static262.anInt6340 > local35 && Static43.anInt861 != local45) {
				Static287.method4353(local35, local31, new Class1_Sub11(local16, local41), Static121.anInt2166);
				Static80.method1208(Static121.anInt2166, local31, local35);
			}
		} else {
			@Pc(300) int local300;
			if (arg0 == Static196.aClass113_8) {
				local16 = Static139.aClass1_Sub33_Sub2_1.method5172();
				local25 = (local16 >> 4 & 0x7) + Static357.anInt6083;
				local31 = Static102.anInt3167 + (local16 & 0x7);
				local35 = Static139.aClass1_Sub33_Sub2_1.method5174();
				local41 = local35 >> 2;
				local45 = local35 & 0x3;
				local300 = Static140.anIntArray722[local41];
				if (local25 >= 0 && local31 >= 0 && local25 < Static92.anInt1675 && Static262.anInt6340 > local31) {
					Static6.method59(local41, Static121.anInt2166, -1, local31, local45, local25, local300);
				}
			} else if (arg0 == aClass113_19) {
				local16 = Static139.aClass1_Sub33_Sub2_1.method5162();
				local25 = (local16 >> 4 & 0x7) + Static357.anInt6083;
				local31 = (local16 & 0x7) + Static102.anInt3167;
				local35 = Static139.aClass1_Sub33_Sub2_1.method5177();
				if (local25 >= 0 && local31 >= 0 && Static92.anInt1675 > local25 && local31 < Static262.anInt6340) {
					@Pc(399) Class1_Sub12 local399 = (Class1_Sub12) Static338.aClass77_34.method1368((long) (local25 | Static121.anInt2166 << 28 | local31 << 14));
					if (local399 != null) {
						for (@Pc(407) Class1_Sub11 local407 = (Class1_Sub11) local399.aClass17_12.method202(); local407 != null; local407 = (Class1_Sub11) local399.aClass17_12.method207()) {
							if ((local35 & 0x7FFF) == local407.anInt1462) {
								local407.method5577();
								break;
							}
						}
						if (local399.aClass17_12.method204()) {
							local399.method5577();
						}
						Static80.method1208(Static121.anInt2166, local25, local31);
					}
				}
			} else {
				@Pc(503) int local503;
				@Pc(509) int local509;
				@Pc(513) int local513;
				@Pc(517) int local517;
				@Pc(521) int local521;
				@Pc(525) int local525;
				@Pc(620) Class25_Sub1_Sub2 local620;
				if (Static138.aClass113_3 == arg0) {
					local16 = Static139.aClass1_Sub33_Sub2_1.method5174();
					local25 = Static357.anInt6083 * 2 + (local16 >> 4 & 0xF);
					local31 = (local16 & 0xF) + Static102.anInt3167 * 2;
					local35 = local25 + Static139.aClass1_Sub33_Sub2_1.method5188();
					local41 = local31 + Static139.aClass1_Sub33_Sub2_1.method5188();
					local45 = Static139.aClass1_Sub33_Sub2_1.method5180();
					local300 = Static139.aClass1_Sub33_Sub2_1.method5177();
					local503 = Static139.aClass1_Sub33_Sub2_1.method5174() * 4;
					local509 = Static139.aClass1_Sub33_Sub2_1.method5174() * 4;
					local513 = Static139.aClass1_Sub33_Sub2_1.method5177();
					local517 = Static139.aClass1_Sub33_Sub2_1.method5177();
					local521 = Static139.aClass1_Sub33_Sub2_1.method5174();
					local525 = Static139.aClass1_Sub33_Sub2_1.method5174();
					if (local521 == 255) {
						local521 = -1;
					}
					if (local25 >= 0 && local31 >= 0 && local25 < Static92.anInt1675 * 2 && Static92.anInt1675 * 2 > local31 && local35 >= 0 && local41 >= 0 && local35 < Static262.anInt6340 * 2 && local41 < Static262.anInt6340 * 2 && local300 != 65535) {
						local25 *= 64;
						local41 *= 64;
						local31 = local31 * 64;
						local35 *= 64;
						local620 = new Class25_Sub1_Sub2(local300, Static121.anInt2166, local25, local31, Static236.method3260(Static121.anInt2166, local31, local25) - local503, Static366.anInt5883 + local513, Static366.anInt5883 + local517, local521, local525, local45, local509);
						local620.method1833(Static236.method3260(Static121.anInt2166, local41, local35) - local509, local35, local513 + Static366.anInt5883, local41);
						Static310.aClass17_63.method199(new Class1_Sub6_Sub16(local620));
					}
				} else if (arg0 == Static139.aClass113_4) {
					local16 = Static139.aClass1_Sub33_Sub2_1.method5174();
					local25 = Static357.anInt6083 + (local16 >> 4 & 0x7);
					local31 = (local16 & 0x7) + Static102.anInt3167;
					local35 = Static139.aClass1_Sub33_Sub2_1.method5177();
					local41 = Static139.aClass1_Sub33_Sub2_1.method5174();
					local45 = Static139.aClass1_Sub33_Sub2_1.method5177();
					if (local25 >= 0 && local31 >= 0 && Static92.anInt1675 > local25 && local31 < Static262.anInt6340) {
						local300 = local25 * 128 + 64;
						local503 = local31 * 128 + 64;
						@Pc(731) Class25_Sub1_Sub3 local731 = new Class25_Sub1_Sub3(local35, local45, Static366.anInt5883, Static121.anInt2166, local300, Static236.method3260(Static121.anInt2166, local503, local300) - local41, local503, local25, local25, local31, local31);
						Static137.aClass17_23.method199(new Class1_Sub6_Sub7(local731));
					}
				} else {
					@Pc(808) int local808;
					if (arg0 == Static13.aClass113_1) {
						@Pc(746) byte local746 = Static139.aClass1_Sub33_Sub2_1.method5164();
						local25 = Static139.aClass1_Sub33_Sub2_1.method5131();
						@Pc(756) byte local756 = Static139.aClass1_Sub33_Sub2_1.method5187();
						local35 = Static139.aClass1_Sub33_Sub2_1.method5167();
						local41 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local45 = Static139.aClass1_Sub33_Sub2_1.method5162();
						local300 = local45 >> 2;
						local503 = local45 & 0x3;
						@Pc(782) byte local782 = Static139.aClass1_Sub33_Sub2_1.method5164();
						local513 = Static139.aClass1_Sub33_Sub2_1.method5177();
						@Pc(790) byte local790 = Static139.aClass1_Sub33_Sub2_1.method5188();
						local521 = Static139.aClass1_Sub33_Sub2_1.method5172();
						local525 = Static357.anInt6083 + (local521 >> 4 & 0x7);
						local808 = (local521 & 0x7) + Static102.anInt3167;
						if (!Static66.aClass164_2.method5369()) {
							Static191.method2737(local746, Static121.anInt2166, local300, local756, local513, local503, local782, local790, local25, local41, local35, local808, local525);
						}
					} else if (arg0 == Static314.aClass113_14) {
						local16 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local25 = Static357.anInt6083 * 2 + (local16 >> 4 & 0xF);
						local31 = Static102.anInt3167 * 2 + (local16 & 0xF);
						local35 = Static139.aClass1_Sub33_Sub2_1.method5188() + local25;
						local41 = local31 + Static139.aClass1_Sub33_Sub2_1.method5188();
						local45 = Static139.aClass1_Sub33_Sub2_1.method5180();
						local300 = Static139.aClass1_Sub33_Sub2_1.method5180();
						local503 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local509 = Static139.aClass1_Sub33_Sub2_1.method5188();
						local513 = Static139.aClass1_Sub33_Sub2_1.method5174() * 4;
						local517 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local521 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local525 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local808 = Static139.aClass1_Sub33_Sub2_1.method5174();
						if (local525 == 255) {
							local525 = -1;
						}
						if (local25 >= 0 && local31 >= 0 && local25 < Static92.anInt1675 * 2 && local31 < Static92.anInt1675 * 2 && local35 >= 0 && local41 >= 0 && local35 < Static262.anInt6340 * 2 && Static262.anInt6340 * 2 > local41 && local503 != 65535) {
							local41 = local41 * 64;
							local25 = local25 * 64;
							local31 *= 64;
							local35 *= 64;
							if (local45 != 0) {
								@Pc(992) int local992;
								@Pc(1000) Class25_Sub1_Sub1 local1000;
								@Pc(986) int local986;
								@Pc(996) int local996;
								if (local45 >= 0) {
									local986 = local45 - 1;
									local992 = local986 >> 11 & 0xF;
									local996 = local986 & 0x7FF;
									local1000 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local996];
								} else {
									local986 = -local45 - 1;
									local992 = local986 >> 11 & 0xF;
									local996 = local986 & 0x7FF;
									if (Static43.anInt861 == local996) {
										local1000 = Static321.aClass25_Sub1_Sub1_Sub1_2;
									} else {
										local1000 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local996];
									}
								}
								if (local1000 != null) {
									@Pc(1036) Class8 local1036 = local1000.method1880();
									if (local1036.anIntArrayArray2 != null && local1036.anIntArrayArray2[local992] != null) {
										local996 = local1036.anIntArrayArray2[local992][0];
										@Pc(1058) int local1058 = local1036.anIntArrayArray2[local992][2];
										@Pc(1063) int local1063 = local1000.aClass99_7.method2036();
										@Pc(1067) int local1067 = Class13.anIntArray20[local1063];
										@Pc(1071) int local1071 = Class13.anIntArray21[local1063];
										@Pc(1081) int local1081 = local1071 * local996 + local1067 * local1058 >> 15;
										@Pc(1092) int local1092 = local1058 * local1071 - local1067 * local996 >> 15;
										local25 += local1081;
										local31 += local1092;
										local509 -= local1036.anIntArrayArray2[local992][1];
									}
								}
							}
							@Pc(1137) Class25_Sub1_Sub2 local1137 = new Class25_Sub1_Sub2(local503, Static121.anInt2166, local25, local31, Static236.method3260(Static121.anInt2166, local31, local25) - local509, Static366.anInt5883 + local517, Static366.anInt5883 + local521, local525, local808, local300, local513);
							local1137.method1833(Static236.method3260(Static121.anInt2166, local41, local35) - local513, local35, Static366.anInt5883 + local517, local41);
							Static310.aClass17_63.method199(new Class1_Sub6_Sub16(local1137));
						}
					} else if (arg0 == Static247.aClass113_11) {
						local16 = Static139.aClass1_Sub33_Sub2_1.method5183();
						if (local16 == 65535) {
							local16 = -1;
						}
						local25 = Static139.aClass1_Sub33_Sub2_1.method5162();
						local31 = local25 >> 2;
						local35 = local25 & 0x3;
						local41 = Static140.anIntArray722[local31];
						local45 = Static139.aClass1_Sub33_Sub2_1.method5166();
						local300 = (local45 >> 4 & 0x7) + Static357.anInt6083;
						local503 = Static102.anInt3167 + (local45 & 0x7);
						Static306.method4560(local41, local31, local16, Static121.anInt2166, local35, local503, local300);
					} else if (Static289.aClass113_12 == arg0) {
						local16 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local25 = Static139.aClass1_Sub33_Sub2_1.method5174();
						Static54.aClass153_1.method3081(local16).method5075(local25);
					} else if (Static172.aClass113_5 == arg0) {
						local16 = Static139.aClass1_Sub33_Sub2_1.method5144();
						local25 = Static139.aClass1_Sub33_Sub2_1.method5144();
						local31 = Static139.aClass1_Sub33_Sub2_1.method5162();
						local35 = (local31 >> 4 & 0x7) + Static357.anInt6083;
						local41 = Static102.anInt3167 + (local31 & 0x7);
						if (local35 >= 0 && local41 >= 0 && local35 < Static92.anInt1675 && Static262.anInt6340 > local41) {
							Static287.method4353(local41, local35, new Class1_Sub11(local25, local16), Static121.anInt2166);
							Static80.method1208(Static121.anInt2166, local35, local41);
						}
					} else if (arg0 == Static348.aClass113_17) {
						local16 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local25 = Static357.anInt6083 + (local16 >> 4 & 0x7);
						local31 = Static102.anInt3167 + (local16 & 0x7);
						local35 = Static139.aClass1_Sub33_Sub2_1.method5188() + local25;
						local41 = Static139.aClass1_Sub33_Sub2_1.method5188() + local31;
						local45 = Static139.aClass1_Sub33_Sub2_1.method5180();
						local300 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local503 = Static139.aClass1_Sub33_Sub2_1.method5174() * 4;
						local509 = Static139.aClass1_Sub33_Sub2_1.method5174() * 4;
						local513 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local517 = Static139.aClass1_Sub33_Sub2_1.method5177();
						local521 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local525 = Static139.aClass1_Sub33_Sub2_1.method5174();
						if (local521 == 255) {
							local521 = -1;
						}
						if (local25 >= 0 && local31 >= 0 && Static92.anInt1675 > local25 && Static262.anInt6340 > local31 && local35 >= 0 && local41 >= 0 && Static92.anInt1675 > local35 && local41 < Static262.anInt6340 && local300 != 65535) {
							local41 = local41 * 128 + 64;
							local25 = local25 * 128 + 64;
							local35 = local35 * 128 + 64;
							local31 = local31 * 128 + 64;
							local620 = new Class25_Sub1_Sub2(local300, Static121.anInt2166, local25, local31, Static236.method3260(Static121.anInt2166, local31, local25) - local503, local513 + Static366.anInt5883, Static366.anInt5883 + local517, local521, local525, local45, local509);
							local620.method1833(Static236.method3260(Static121.anInt2166, local41, local35) - local509, local35, local513 + Static366.anInt5883, local41);
							Static310.aClass17_63.method199(new Class1_Sub6_Sub16(local620));
						}
					} else if (arg0 == Static327.aClass113_15) {
						local16 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local25 = Static357.anInt6083 + (local16 >> 4 & 0x7);
						local31 = (local16 & 0x7) + Static102.anInt3167;
						local35 = Static139.aClass1_Sub33_Sub2_1.method5177();
						if (local35 == 65535) {
							local35 = -1;
						}
						local41 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local45 = local41 >> 4 & 0xF;
						local300 = local41 & 0x7;
						local503 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local509 = Static139.aClass1_Sub33_Sub2_1.method5174();
						if (local25 >= 0 && local31 >= 0 && Static92.anInt1675 > local25 && local31 < Static262.anInt6340) {
							local513 = local45 + 1;
							if (local25 - local513 <= Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray296[0] && local513 + local25 >= Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray296[0] && Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray295[0] >= local31 - local513 && Static321.aClass25_Sub1_Sub1_Sub1_2.anIntArray295[0] <= local513 + local31 && Static188.aClass135_Sub1_1.anInt3374 != 0 && local300 > 0 && Static104.anInt1830 < 50 && local35 != -1) {
								Static300.anIntArray609[Static104.anInt1830] = local35;
								Static254.anIntArray539[Static104.anInt1830] = local300;
								Static255.anIntArray542[Static104.anInt1830] = local503;
								Static311.aClass159Array1[Static104.anInt1830] = null;
								Static57.anIntArray700[Static104.anInt1830] = local45 + (local31 << 8) + (Static121.anInt2166 << 24) + (local25 << 16);
								Static190.anIntArray390[Static104.anInt1830] = local509;
								Static104.anInt1830++;
							}
						}
					} else if (arg0 == Static292.aClass113_13) {
						local16 = Static139.aClass1_Sub33_Sub2_1.method5166();
						local25 = (local16 >> 4 & 0x7) + Static357.anInt6083;
						local31 = (local16 & 0x7) + Static102.anInt3167;
						local35 = Static139.aClass1_Sub33_Sub2_1.method5174();
						local41 = local35 >> 2;
						local45 = local35 & 0x3;
						local300 = Static140.anIntArray722[local41];
						local503 = Static139.aClass1_Sub33_Sub2_1.method5177();
						if (local25 >= 0 && local31 >= 0 && Static92.anInt1675 > local25 && local31 < Static262.anInt6340) {
							Static6.method59(local41, Static121.anInt2166, local503, local31, local45, local25, local300);
						}
					} else {
						Static62.method1006(null, "T3 - " + arg0);
						Static384.method5442();
					}
				}
			}
		}
	}
}
