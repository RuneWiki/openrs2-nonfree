import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!pg", name = "y", descriptor = "I")
	public static int anInt2639;

	@OriginalMember(owner = "client!pg", name = "wb", descriptor = "[Z")
	public static boolean[] aBooleanArray12;

	@OriginalMember(owner = "client!pg", name = "w", descriptor = "I")
	public static int anInt2637 = -1;

	@OriginalMember(owner = "client!pg", name = "E", descriptor = "I")
	public static int anInt2645 = 0;

	@OriginalMember(owner = "client!pg", name = "G", descriptor = "I")
	public static int anInt2647 = 0;

	@OriginalMember(owner = "client!pg", name = "sb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_902 = Static186.method3527("Members only world");

	@OriginalMember(owner = "client!pg", name = "S", descriptor = "Lclient!hh;")
	public static Class50 aClass50_901 = aClass50_902;

	@OriginalMember(owner = "client!pg", name = "lb", descriptor = "I")
	public static int anInt2676 = -1;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
	public static void method2130(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub1_Sub13 local12 = Static74.method1093(1, arg0);
		local12.method2259();
	}

	@OriginalMember(owner = "client!pg", name = "h", descriptor = "(I)V")
	public static void method2137() {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = -1; local7 < Static13.anInt250; local7++) {
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static52.anIntArray356[local7];
			}
			@Pc(24) Class20_Sub3_Sub1 local24 = Static232.aClass20_Sub3_Sub1Array1[local16];
			if (local24 != null && local24.anInt3066 > 0) {
				local24.anInt3066--;
				if (local24.anInt3066 == 0) {
					local24.aClass50_1013 = null;
				}
			}
		}
		for (local16 = 0; local16 < Static103.anInt2065; local16++) {
			@Pc(53) int local53 = Static21.anIntArray44[local16];
			@Pc(57) Class20_Sub3_Sub2 local57 = Static78.aClass20_Sub3_Sub2Array1[local53];
			if (local57 != null && local57.anInt3066 > 0) {
				local57.anInt3066--;
				if (local57.anInt3066 == 0) {
					local57.aClass50_1013 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "o", descriptor = "(I)V")
	public static void method2162() {
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(40) int local40;
		@Pc(46) int local46;
		if (Static157.anInt3267 == 139) {
			local14 = Static97.aClass1_Sub17_Sub1_2.method2142();
			local22 = (local14 >> 4 & 0x7) + Static91.anInt4085;
			local28 = Static105.anInt2092 + (local14 & 0x7);
			local34 = Static97.aClass1_Sub17_Sub1_2.method2178();
			local40 = Static97.aClass1_Sub17_Sub1_2.method2178();
			local46 = Static97.aClass1_Sub17_Sub1_2.method2178();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				@Pc(72) Class75 local72 = Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local22][local28];
				if (local72 != null) {
					for (@Pc(79) Class1_Sub1_Sub3 local79 = (Class1_Sub1_Sub3) local72.method2239(); local79 != null; local79 = (Class1_Sub1_Sub3) local72.method2238()) {
						@Pc(84) Class20_Sub2 local84 = local79.aClass20_Sub2_1;
						if (local84.anInt1196 == (local34 & 0x7FFF) && local84.anInt1198 == local40) {
							local84.anInt1198 = local46;
							break;
						}
					}
					Static183.method3009(local22, local28);
				}
			}
			return;
		}
		@Pc(154) int local154;
		@Pc(158) int local158;
		if (Static157.anInt3267 == 144) {
			local14 = Static97.aClass1_Sub17_Sub1_2.method2139();
			local22 = local14 >> 2;
			local34 = Static22.anIntArray45[local22];
			local40 = Static97.aClass1_Sub17_Sub1_2.method2128();
			local28 = local14 & 0x3;
			local46 = (local40 >> 4 & 0x7) + Static91.anInt4085;
			local154 = Static105.anInt2092 + (local40 & 0x7);
			local158 = Static97.aClass1_Sub17_Sub1_2.method2131();
			if (local46 >= 0 && local154 >= 0 && local46 < 104 && local154 < 104) {
				Static234.method3540(local28, -1, local46, local158, 0, Static212.anInt4195, local34, local22, local154);
			}
		} else if (Static157.anInt3267 == 18) {
			local14 = Static97.aClass1_Sub17_Sub1_2.method2149();
			local22 = Static97.aClass1_Sub17_Sub1_2.method2129();
			if (local14 == 65535) {
				local14 = -1;
			}
			local28 = local22 >> 2;
			local34 = local22 & 0x3;
			local40 = Static22.anIntArray45[local28];
			local46 = Static97.aClass1_Sub17_Sub1_2.method2129();
			local158 = (local46 & 0x7) + Static105.anInt2092;
			local154 = Static91.anInt4085 + (local46 >> 4 & 0x7);
			Static141.method3011(local28, local154, local40, local14, Static212.anInt4195, local158, local34);
		} else if (Static157.anInt3267 == 95) {
			local14 = Static97.aClass1_Sub17_Sub1_2.method2128();
			local22 = local14 >> 2;
			local28 = local14 & 0x3;
			local34 = Static22.anIntArray45[local22];
			local40 = Static97.aClass1_Sub17_Sub1_2.method2142();
			local46 = (local40 >> 4 & 0x7) + Static91.anInt4085;
			local154 = Static105.anInt2092 + (local40 & 0x7);
			if (local46 >= 0 && local154 >= 0 && local46 < 104 && local154 < 104) {
				Static234.method3540(local28, -1, local46, -1, 0, Static212.anInt4195, local34, local22, local154);
			}
		} else {
			@Pc(360) int local360;
			@Pc(364) int local364;
			@Pc(368) int local368;
			@Pc(372) int local372;
			@Pc(376) int local376;
			if (Static157.anInt3267 == 78) {
				local14 = Static97.aClass1_Sub17_Sub1_2.method2134();
				local22 = Static97.aClass1_Sub17_Sub1_2.method2131();
				local28 = Static97.aClass1_Sub17_Sub1_2.method2149();
				local34 = Static97.aClass1_Sub17_Sub1_2.method2178();
				@Pc(338) byte local338 = Static97.aClass1_Sub17_Sub1_2.method2163();
				@Pc(342) byte local342 = Static97.aClass1_Sub17_Sub1_2.method2146();
				local154 = Static97.aClass1_Sub17_Sub1_2.method2139();
				local158 = (local154 >> 4 & 0x7) + Static91.anInt4085;
				local360 = Static105.anInt2092 + (local154 & 0x7);
				local364 = Static97.aClass1_Sub17_Sub1_2.method2128();
				local368 = local364 >> 2;
				local372 = local364 & 0x3;
				local376 = Static22.anIntArray45[local368];
				@Pc(382) byte local382 = Static97.aClass1_Sub17_Sub1_2.method2163();
				@Pc(386) byte local386 = Static97.aClass1_Sub17_Sub1_2.method2155();
				@Pc(391) Class20_Sub3_Sub1 local391;
				if (local28 == Static20.anInt417) {
					local391 = Static230.aClass20_Sub3_Sub1_3;
				} else {
					local391 = Static232.aClass20_Sub3_Sub1Array1[local28];
				}
				if (local391 != null) {
					@Pc(403) Class18 local403 = Static148.method2487(local14);
					@Pc(414) int local414;
					@Pc(417) int local417;
					if (local372 == 1 || local372 == 3) {
						local414 = local403.anInt822;
						local417 = local403.anInt811;
					} else {
						local417 = local403.anInt822;
						local414 = local403.anInt811;
					}
					@Pc(432) int local432 = local360 + (local417 >> 1);
					@Pc(438) int local438 = local158 + (local414 >> 1);
					@Pc(446) int local446 = (local414 + 1 >> 1) + local158;
					@Pc(450) int[][] local450 = Static119.anIntArrayArrayArray10[Static212.anInt4195];
					@Pc(452) int[][] local452 = null;
					if (Static212.anInt4195 < 3) {
						local452 = Static119.anIntArrayArrayArray10[Static212.anInt4195 + 1];
					}
					@Pc(469) int local469 = local360 + (local417 + 1 >> 1);
					@Pc(495) int local495 = local450[local438][local469] + local450[local438][local432] + local450[local446][local432] + local450[local446][local469] >> 2;
					@Pc(503) int local503 = (local360 << 7) + (local417 << 6);
					@Pc(512) int local512 = (local158 << 7) + (local414 << 6);
					@Pc(527) Class113 local527 = local403.method605(local503, false, local450, null, local512, local495, local452, local403.aBoolean31, local368, local372);
					if (local527 != null) {
						Static234.method3540(0, local34 + 1, local158, -1, local22 + 1, Static212.anInt4195, local376, 0, local360);
						local391.anInt1510 = local495;
						local391.anInt1516 = Static107.anInt2132 + local22;
						local391.anInt1522 = local158 * 128 + local414 * 64;
						local391.anInt1499 = Static107.anInt2132 + local34;
						local391.aClass20_Sub5_1 = (Class20_Sub5) local527.aClass20_6;
						local391.anInt1497 = local417 * 64 + local360 * 128;
						@Pc(590) byte local590;
						if (local342 > local338) {
							local590 = local342;
							local342 = local338;
							local338 = local590;
						}
						local391.anInt1511 = local158 + local338;
						local391.anInt1518 = local342 + local158;
						if (local386 < local382) {
							local590 = local382;
							local382 = local386;
							local386 = local590;
						}
						local391.anInt1520 = local360 + local386;
						local391.anInt1495 = local360 + local382;
					}
				}
			}
			if (Static157.anInt3267 == 22) {
				local14 = Static97.aClass1_Sub17_Sub1_2.method2142();
				local28 = (local14 & 0x7) + Static105.anInt2092;
				local22 = (local14 >> 4 & 0x7) + Static91.anInt4085;
				local34 = Static97.aClass1_Sub17_Sub1_2.method2178();
				if (local34 == 65535) {
					local34 = -1;
				}
				local40 = Static97.aClass1_Sub17_Sub1_2.method2142();
				local46 = local40 >> 4 & 0xF;
				local158 = Static97.aClass1_Sub17_Sub1_2.method2142();
				local154 = local40 & 0x7;
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					local360 = local46 + 1;
					if (Static230.aClass20_Sub3_Sub1_3.anIntArray311[0] >= local22 - local360 && Static230.aClass20_Sub3_Sub1_3.anIntArray311[0] <= local360 + local22 && Static230.aClass20_Sub3_Sub1_3.anIntArray313[0] >= local28 - local360 && Static230.aClass20_Sub3_Sub1_3.anIntArray313[0] <= local360 + local28 && Static146.anInt3076 != 0 && local154 > 0 && Static223.anInt4343 < 50 && local34 != -1) {
						Static148.anIntArray319[Static223.anInt4343] = local34;
						Static10.anIntArray24[Static223.anInt4343] = local154;
						Static155.anIntArray332[Static223.anInt4343] = local158;
						Static27.aClass71Array1[Static223.anInt4343] = null;
						Static204.anIntArray465[Static223.anInt4343] = local46 + (local28 << 8) + (local22 << 16);
						Static223.anInt4343++;
					}
				}
			} else if (Static157.anInt3267 == 238) {
				local14 = Static97.aClass1_Sub17_Sub1_2.method2129();
				local22 = Static91.anInt4085 + (local14 >> 4 & 0x7);
				local28 = (local14 & 0x7) + Static105.anInt2092;
				local34 = Static97.aClass1_Sub17_Sub1_2.method2178();
				local40 = Static97.aClass1_Sub17_Sub1_2.method2131();
				if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
					@Pc(839) Class20_Sub2 local839 = new Class20_Sub2();
					local839.anInt1196 = local34;
					local839.anInt1198 = local40;
					if (Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local22][local28] == null) {
						Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local22][local28] = new Class75();
					}
					Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local22][local28].method2240(new Class1_Sub1_Sub3(local839));
					Static183.method3009(local22, local28);
				}
			} else {
				@Pc(1035) Class20_Sub6 local1035;
				if (Static157.anInt3267 == 108) {
					local14 = Static97.aClass1_Sub17_Sub1_2.method2142();
					local22 = (local14 >> 4 & 0x7) + Static91.anInt4085;
					local28 = Static105.anInt2092 + (local14 & 0x7);
					local34 = Static97.aClass1_Sub17_Sub1_2.method2155() + local22;
					local40 = Static97.aClass1_Sub17_Sub1_2.method2155() + local28;
					local46 = Static97.aClass1_Sub17_Sub1_2.method2167();
					local154 = Static97.aClass1_Sub17_Sub1_2.method2178();
					local158 = Static97.aClass1_Sub17_Sub1_2.method2142() * 4;
					local360 = Static97.aClass1_Sub17_Sub1_2.method2142() * 4;
					local364 = Static97.aClass1_Sub17_Sub1_2.method2178();
					local368 = Static97.aClass1_Sub17_Sub1_2.method2178();
					local372 = Static97.aClass1_Sub17_Sub1_2.method2142();
					local376 = Static97.aClass1_Sub17_Sub1_2.method2142();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local34 >= 0 && local40 >= 0 && local34 < 104 && local40 < 104 && local154 != 65535) {
						local28 = local28 * 128 + 64;
						local40 = local40 * 128 + 64;
						local34 = local34 * 128 + 64;
						local22 = local22 * 128 + 64;
						local1035 = new Class20_Sub6(local154, Static212.anInt4195, local22, local28, Static131.method2213(local28, local22, Static212.anInt4195) - local158, Static107.anInt2132 + local364, local368 + Static107.anInt2132, local372, local376, local46, local360);
						local1035.method3208(Static131.method2213(local40, local34, Static212.anInt4195) - local360, local364 + Static107.anInt2132, local40, local34);
						Static156.aClass75_16.method2240(new Class1_Sub1_Sub16(local1035));
					}
				} else if (Static157.anInt3267 == 241) {
					local14 = Static97.aClass1_Sub17_Sub1_2.method2128();
					local28 = (local14 & 0x7) + Static105.anInt2092;
					local22 = (local14 >> 4 & 0x7) + Static91.anInt4085;
					local34 = Static97.aClass1_Sub17_Sub1_2.method2178();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						@Pc(1109) Class75 local1109 = Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local22][local28];
						if (local1109 != null) {
							for (@Pc(1116) Class1_Sub1_Sub3 local1116 = (Class1_Sub1_Sub3) local1109.method2239(); local1116 != null; local1116 = (Class1_Sub1_Sub3) local1109.method2238()) {
								if ((local34 & 0x7FFF) == local1116.aClass20_Sub2_1.anInt1196) {
									local1116.method3525();
									break;
								}
							}
							if (local1109.method2239() == null) {
								Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local22][local28] = null;
							}
							Static183.method3009(local22, local28);
						}
					}
				} else if (Static157.anInt3267 == 177) {
					local14 = Static97.aClass1_Sub17_Sub1_2.method2178();
					local22 = Static97.aClass1_Sub17_Sub1_2.method2131();
					local28 = Static97.aClass1_Sub17_Sub1_2.method2129();
					local34 = (local28 >> 4 & 0x7) + Static91.anInt4085;
					local40 = (local28 & 0x7) + Static105.anInt2092;
					local46 = Static97.aClass1_Sub17_Sub1_2.method2149();
					if (local34 >= 0 && local40 >= 0 && local34 < 104 && local40 < 104 && local22 != Static20.anInt417) {
						@Pc(1222) Class20_Sub2 local1222 = new Class20_Sub2();
						local1222.anInt1196 = local46;
						local1222.anInt1198 = local14;
						if (Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local34][local40] == null) {
							Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local34][local40] = new Class75();
						}
						Static182.aClass75ArrayArrayArray1[Static212.anInt4195][local34][local40].method2240(new Class1_Sub1_Sub3(local1222));
						Static183.method3009(local34, local40);
					}
				} else if (Static157.anInt3267 == 23) {
					local14 = Static97.aClass1_Sub17_Sub1_2.method2142();
					local28 = Static105.anInt2092 + (local14 & 0x7);
					local22 = (local14 >> 4 & 0x7) + Static91.anInt4085;
					local34 = Static97.aClass1_Sub17_Sub1_2.method2178();
					local40 = Static97.aClass1_Sub17_Sub1_2.method2142();
					local46 = Static97.aClass1_Sub17_Sub1_2.method2178();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						local28 = local28 * 128 + 64;
						local22 = local22 * 128 + 64;
						@Pc(1348) Class20_Sub7 local1348 = new Class20_Sub7(local34, Static212.anInt4195, local22, local28, Static131.method2213(local28, local22, Static212.anInt4195) - local40, local46, Static107.anInt2132);
						Static40.aClass75_4.method2240(new Class1_Sub1_Sub9(local1348));
					}
				} else if (Static157.anInt3267 == 96) {
					local14 = Static97.aClass1_Sub17_Sub1_2.method2142();
					local22 = (local14 >> 4 & 0xF) + Static91.anInt4085 * 2;
					local28 = (local14 & 0xF) + Static105.anInt2092 * 2;
					local34 = local22 + Static97.aClass1_Sub17_Sub1_2.method2155();
					local40 = Static97.aClass1_Sub17_Sub1_2.method2155() + local28;
					local46 = Static97.aClass1_Sub17_Sub1_2.method2167();
					local154 = Static97.aClass1_Sub17_Sub1_2.method2178();
					local158 = Static97.aClass1_Sub17_Sub1_2.method2142() * 4;
					local360 = Static97.aClass1_Sub17_Sub1_2.method2142() * 4;
					local364 = Static97.aClass1_Sub17_Sub1_2.method2178();
					local368 = Static97.aClass1_Sub17_Sub1_2.method2178();
					local372 = Static97.aClass1_Sub17_Sub1_2.method2142();
					local376 = Static97.aClass1_Sub17_Sub1_2.method2142();
					if (local22 >= 0 && local28 >= 0 && local22 < 208 && local28 < 208 && local34 >= 0 && local40 >= 0 && local34 < 208 && local40 < 208 && local154 != 65535) {
						local40 = local40 * 64;
						local22 = local22 * 64;
						local28 *= 64;
						local34 = local34 * 64;
						local1035 = new Class20_Sub6(local154, Static212.anInt4195, local22, local28, Static131.method2213(local28, local22, Static212.anInt4195) - local158, Static107.anInt2132 + local364, Static107.anInt2132 + local368, local372, local376, local46, local360);
						local1035.method3208(Static131.method2213(local40, local34, Static212.anInt4195) - local360, local364 + Static107.anInt2132, local40, local34);
						Static156.aClass75_16.method2240(new Class1_Sub1_Sub16(local1035));
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!pa;I)V")
	public static void method2165(@OriginalArg(0) Class86 arg0) {
		Static121.aClass86_43 = arg0;
	}
}
