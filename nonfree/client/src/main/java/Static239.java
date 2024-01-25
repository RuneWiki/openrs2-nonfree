import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!lr", name = "U", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray14 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!gn;B)V")
	public static void method3255(@OriginalArg(0) Class94 arg0) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(24) int local24;
		@Pc(28) int local28;
		@Pc(36) int local36;
		@Pc(44) int local44;
		@Pc(53) int local53;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(67) int local67;
		if (Static108.aClass94_13 == arg0) {
			@Pc(12) byte local12 = Static210.aClass7_Sub14_Sub1_4.method3930();
			local16 = Static210.aClass7_Sub14_Sub1_4.method3931();
			local20 = local16 >> 2;
			local24 = local16 & 0x3;
			local28 = Static210.aClass7_Sub14_Sub1_4.method3961();
			@Pc(32) byte local32 = Static210.aClass7_Sub14_Sub1_4.method3980();
			local36 = Static210.aClass7_Sub14_Sub1_4.method3946();
			@Pc(40) byte local40 = Static210.aClass7_Sub14_Sub1_4.method3980();
			local44 = Static210.aClass7_Sub14_Sub1_4.method3981();
			local53 = Static421.anInt6702 + (local44 >> 4 & 0x7);
			local59 = Static400.anInt5902 + (local44 & 0x7);
			local63 = Static210.aClass7_Sub14_Sub1_4.method3935();
			local67 = Static210.aClass7_Sub14_Sub1_4.method3935();
			@Pc(71) byte local71 = Static210.aClass7_Sub14_Sub1_4.method3945();
			if (!Static269.aClass51_9.method5316()) {
				Static431.method5566(local59, local32, local40, local24, local63, Static287.anInt6591, local12, local67, local36, local71, local20, local53, local28);
			}
			return;
		}
		@Pc(97) int local97;
		@Pc(124) int local124;
		if (arg0 == Static138.aClass94_16) {
			local97 = Static210.aClass7_Sub14_Sub1_4.method3990();
			local16 = Static210.aClass7_Sub14_Sub1_4.method3946();
			local20 = Static210.aClass7_Sub14_Sub1_4.method3968();
			local24 = Static421.anInt6702 + (local20 >> 4 & 0x7);
			local28 = Static400.anInt5902 + (local20 & 0x7);
			local124 = Static210.aClass7_Sub14_Sub1_4.method3990();
			if (local24 >= 0 && local28 >= 0 && local24 < Static333.anInt3375 && Static102.anInt2086 > local28 && local97 != Static296.anInt4920) {
				Static111.method1914(local24, new Class7_Sub24(local124, local16), Static287.anInt6591, local28);
				Static32.method424(local24, local28, Static287.anInt6591);
			}
		} else if (arg0 == Static140.aClass94_2) {
			Static210.aClass7_Sub14_Sub1_4.method3981();
			local97 = Static210.aClass7_Sub14_Sub1_4.method3981();
			local16 = Static421.anInt6702 + (local97 >> 4 & 0x7);
			local20 = (local97 & 0x7) + Static400.anInt5902;
			local24 = Static210.aClass7_Sub14_Sub1_4.method3943();
			local28 = Static210.aClass7_Sub14_Sub1_4.method3981();
			local124 = Static210.aClass7_Sub14_Sub1_4.method3975();
			@Pc(209) String local209 = Static210.aClass7_Sub14_Sub1_4.method3986();
			Static45.method604(Static287.anInt6591, local24, local28, local16, local124, local20, local209);
		} else if (Static425.aClass94_24 == arg0) {
			local97 = Static210.aClass7_Sub14_Sub1_4.method3943();
			local16 = Static210.aClass7_Sub14_Sub1_4.method3981();
			Static411.aClass142_4.method3148(local97).method4023(local16);
		} else if (arg0 == Static324.aClass94_23) {
			local97 = Static210.aClass7_Sub14_Sub1_4.method3968();
			local16 = (local97 >> 4 & 0x7) + Static421.anInt6702;
			local20 = (local97 & 0x7) + Static400.anInt5902;
			local24 = Static210.aClass7_Sub14_Sub1_4.method3972();
			local28 = local24 >> 2;
			local124 = local24 & 0x3;
			local36 = Static150.anIntArray251[local28];
			if (Static117.method1986(Static97.anInt1979) || local16 >= 0 && local20 >= 0 && Static333.anInt3375 > local16 && local20 < Static102.anInt2086) {
				Static38.method556(local36, local28, -1, local16, local20, Static287.anInt6591, local124);
			}
		} else {
			@Pc(361) int local361;
			if (Static445.aClass94_4 == arg0) {
				local97 = Static210.aClass7_Sub14_Sub1_4.method3990();
				if (local97 == 65535) {
					local97 = -1;
				}
				local16 = Static210.aClass7_Sub14_Sub1_4.method3968();
				local20 = Static421.anInt6702 + (local16 >> 4 & 0x7);
				local24 = Static400.anInt5902 + (local16 & 0x7);
				local28 = Static210.aClass7_Sub14_Sub1_4.method3931();
				local124 = local28 >> 2;
				local36 = local28 & 0x3;
				local361 = Static150.anIntArray251[local124];
				Static237.method3231(local97, Static287.anInt6591, local20, local124, local361, local36, local24);
			} else if (arg0 == Static97.aClass94_10) {
				local97 = Static210.aClass7_Sub14_Sub1_4.method3931();
				local16 = (local97 >> 4 & 0x7) + Static421.anInt6702;
				local20 = Static400.anInt5902 + (local97 & 0x7);
				local24 = Static210.aClass7_Sub14_Sub1_4.method3990();
				local28 = Static210.aClass7_Sub14_Sub1_4.method3990();
				if (local16 >= 0 && local20 >= 0 && Static333.anInt3375 > local16 && Static102.anInt2086 > local20) {
					Static111.method1914(local16, new Class7_Sub24(local24, local28), Static287.anInt6591, local20);
					Static32.method424(local16, local20, Static287.anInt6591);
				}
			} else {
				@Pc(520) int local520;
				@Pc(473) boolean local473;
				if (Static62.aClass94_5 == arg0) {
					local97 = Static210.aClass7_Sub14_Sub1_4.method3981();
					local16 = Static421.anInt6702 * 2 + (local97 >> 4 & 0xF);
					local20 = (local97 & 0xF) + Static400.anInt5902 * 2;
					local473 = Static210.aClass7_Sub14_Sub1_4.method3981() != 0;
					local28 = Static210.aClass7_Sub14_Sub1_4.method3930() + local16;
					local124 = local20 + Static210.aClass7_Sub14_Sub1_4.method3930();
					local36 = Static210.aClass7_Sub14_Sub1_4.method3961();
					local361 = Static210.aClass7_Sub14_Sub1_4.method3961();
					local44 = Static210.aClass7_Sub14_Sub1_4.method3943();
					@Pc(502) byte local502 = Static210.aClass7_Sub14_Sub1_4.method3930();
					local59 = Static210.aClass7_Sub14_Sub1_4.method3981() * 4;
					local63 = Static210.aClass7_Sub14_Sub1_4.method3943();
					local67 = Static210.aClass7_Sub14_Sub1_4.method3943();
					local520 = Static210.aClass7_Sub14_Sub1_4.method3981();
					@Pc(524) int local524 = Static210.aClass7_Sub14_Sub1_4.method3981();
					if (local520 == 255) {
						local520 = -1;
					}
					if (local16 >= 0 && local20 >= 0 && local16 < Static333.anInt3375 * 2 && Static333.anInt3375 * 2 > local20 && local28 >= 0 && local124 >= 0 && local28 < Static102.anInt2086 * 2 && local124 < Static102.anInt2086 * 2 && local44 != 65535) {
						local28 = local28 * 64;
						local20 = local20 * 64;
						local16 = local16 * 64;
						local53 = local502 << 0;
						local59 <<= 0x0;
						local124 *= 64;
						if (local36 != 0) {
							@Pc(613) int local613;
							@Pc(624) Class26_Sub2_Sub4 local624;
							@Pc(607) int local607;
							@Pc(617) int local617;
							if (local36 < 0) {
								local607 = -local36 - 1;
								local613 = local607 >> 11 & 0xF;
								local617 = local607 & 0x7FF;
								if (Static296.anInt4920 == local617) {
									local624 = Static104.aClass26_Sub2_Sub4_Sub2_2;
								} else {
									local624 = Static410.aClass26_Sub2_Sub4_Sub2Array1[local617];
								}
							} else {
								local607 = local36 - 1;
								local613 = local607 >> 11 & 0xF;
								local617 = local607 & 0x7FF;
								local624 = Static171.aClass26_Sub2_Sub4_Sub1Array1[local617];
							}
							if (local624 != null) {
								@Pc(654) Class78 local654 = local624.method5507();
								if (local654.anIntArrayArray15 != null && local654.anIntArrayArray15[local613] != null) {
									local617 = local654.anIntArrayArray15[local613][0];
									@Pc(676) int local676 = local654.anIntArrayArray15[local613][2];
									@Pc(681) int local681 = local624.aClass158_7.method3356();
									@Pc(685) int local685 = Class22_Sub7.anIntArray411[local681];
									@Pc(689) int local689 = Class22_Sub7.anIntArray410[local681];
									@Pc(699) int local699 = local689 * local617 + local676 * local685 >> 15;
									@Pc(709) int local709 = local676 * local689 - local685 * local617 >> 15;
									local53 -= local654.anIntArrayArray15[local613][1];
									local16 += local699;
									local20 += local709;
								}
							}
						}
						@Pc(748) Class26_Sub2_Sub3 local748 = new Class26_Sub2_Sub3(local44, Static287.anInt6591, local16, local20, local53, Static274.anInt4617 + local63, Static274.anInt4617 + local67, local520, local524, local361, local59, local473);
						local748.method2848(Static333.method2748(Static287.anInt6591, local124, local28) - local59, local28, Static274.anInt4617 + local63, local124);
						Static235.aClass85_25.method2011(new Class7_Sub4_Sub3(local748));
					}
				} else {
					@Pc(950) Class26_Sub2_Sub3 local950;
					if (Static355.aClass94_20 == arg0) {
						local97 = Static210.aClass7_Sub14_Sub1_4.method3981();
						local16 = (local97 >> 4 & 0xF) + Static421.anInt6702 * 2;
						local20 = (local97 & 0xF) + Static400.anInt5902 * 2;
						local473 = Static210.aClass7_Sub14_Sub1_4.method3981() != 0;
						local28 = Static210.aClass7_Sub14_Sub1_4.method3930() + local16;
						local124 = local20 + Static210.aClass7_Sub14_Sub1_4.method3930();
						local36 = Static210.aClass7_Sub14_Sub1_4.method3961();
						local361 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local44 = Static210.aClass7_Sub14_Sub1_4.method3981() * 4;
						local53 = Static210.aClass7_Sub14_Sub1_4.method3981() * 4;
						local59 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local63 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local67 = Static210.aClass7_Sub14_Sub1_4.method3981();
						local520 = Static210.aClass7_Sub14_Sub1_4.method3981();
						if (local67 == 255) {
							local67 = -1;
						}
						if (local16 >= 0 && local20 >= 0 && Static333.anInt3375 * 2 > local16 && Static333.anInt3375 * 2 > local20 && local28 >= 0 && local124 >= 0 && Static102.anInt2086 * 2 > local28 && Static102.anInt2086 * 2 > local124 && local361 != 65535) {
							local16 *= 64;
							local44 <<= 0x0;
							local53 <<= 0x0;
							local124 = local124 * 64;
							local20 = local20 * 64;
							local28 *= 64;
							local950 = new Class26_Sub2_Sub3(local361, Static287.anInt6591, local16, local20, local44, local59 + Static274.anInt4617, Static274.anInt4617 + local63, local67, local520, local36, local53, local473);
							local950.method2848(Static333.method2748(Static287.anInt6591, local124, local28) - local53, local28, Static274.anInt4617 + local59, local124);
							Static235.aClass85_25.method2011(new Class7_Sub4_Sub3(local950));
						}
					} else if (arg0 == Static278.aClass94_21) {
						local97 = Static210.aClass7_Sub14_Sub1_4.method3981();
						local16 = (local97 >> 4 & 0x7) + Static421.anInt6702;
						local20 = Static400.anInt5902 + (local97 & 0x7);
						local24 = Static210.aClass7_Sub14_Sub1_4.method3943();
						if (local24 == 65535) {
							local24 = -1;
						}
						local28 = Static210.aClass7_Sub14_Sub1_4.method3981();
						local124 = local28 >> 4 & 0xF;
						local36 = local28 & 0x7;
						local361 = Static210.aClass7_Sub14_Sub1_4.method3981();
						local44 = Static210.aClass7_Sub14_Sub1_4.method3981();
						if (local16 >= 0 && local20 >= 0 && local16 < Static333.anInt3375 && local20 < Static102.anInt2086) {
							local53 = local124 + 1;
							if (local16 - local53 <= Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray603[0] && local53 + local16 >= Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray603[0] && local20 - local53 <= Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray604[0] && local53 + local20 >= Static104.aClass26_Sub2_Sub4_Sub2_2.anIntArray604[0]) {
								Static68.method1149(local44, (local20 << 8) + (local16 << 16) + (Static287.anInt6591 << 24) + local124, local24, local36, local361);
							}
						}
					} else if (arg0 == Static122.aClass94_15) {
						local97 = Static210.aClass7_Sub14_Sub1_4.method3981();
						local16 = (local97 >> 4 & 0x7) + Static421.anInt6702;
						local20 = Static400.anInt5902 + (local97 & 0x7);
						local24 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local28 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local124 = Static210.aClass7_Sub14_Sub1_4.method3943();
						if (Static345.aClass164_33 != null && local16 >= 0 && local20 >= 0 && local16 < Static333.anInt3375 && Static102.anInt2086 > local20) {
							@Pc(1171) Class7_Sub34 local1171 = (Class7_Sub34) Static345.aClass164_33.method3512((long) (local16 | Static287.anInt6591 << 28 | local20 << 14));
							if (local1171 != null) {
								for (@Pc(1179) Class7_Sub24 local1179 = (Class7_Sub24) local1171.aClass85_31.method2010(); local1179 != null; local1179 = (Class7_Sub24) local1171.aClass85_31.method2000()) {
									if ((local24 & 0x7FFF) == local1179.anInt3082 && local28 == local1179.anInt3083) {
										local1179.method5802();
										local1179.anInt3083 = local124;
										Static111.method1914(local16, local1179, Static287.anInt6591, local20);
										break;
									}
								}
								Static32.method424(local16, local20, Static287.anInt6591);
							}
						}
					} else if (Static65.aClass94_12 == arg0) {
						local97 = Static210.aClass7_Sub14_Sub1_4.method3981();
						local16 = (local97 >> 4 & 0x7) + Static421.anInt6702;
						local20 = Static400.anInt5902 + (local97 & 0x7);
						local24 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local28 = Static210.aClass7_Sub14_Sub1_4.method3981();
						local124 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local36 = Static210.aClass7_Sub14_Sub1_4.method3981();
						if (local16 >= 0 && local20 >= 0 && local16 < Static333.anInt3375 && local20 < Static102.anInt2086) {
							local361 = local16 * 128 + 64;
							local44 = local20 * 128 + 64;
							local53 = Static287.anInt6591;
							if (local53 < 3 && Static148.method2268(local20, local16)) {
								local53++;
							}
							@Pc(1332) Class26_Sub2_Sub1 local1332 = new Class26_Sub2_Sub1(local24, local124, Static274.anInt4617, Static287.anInt6591, local53, local361, Static333.method2748(Static287.anInt6591, local44, local361) - local28, local44, local16, local16, local20, local20, local36);
							Static203.aClass85_20.method2011(new Class7_Sub4_Sub12(local1332));
						}
					} else if (arg0 == Static443.aClass94_25) {
						local97 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local16 = Static210.aClass7_Sub14_Sub1_4.method3972();
						local20 = (local16 >> 4 & 0x7) + Static421.anInt6702;
						local24 = (local16 & 0x7) + Static400.anInt5902;
						if (local20 >= 0 && local24 >= 0 && local20 < Static333.anInt3375 && local24 < Static102.anInt2086) {
							@Pc(1396) Class7_Sub34 local1396 = (Class7_Sub34) Static345.aClass164_33.method3512((long) (local24 << 14 | Static287.anInt6591 << 28 | local20));
							if (local1396 != null) {
								for (@Pc(1404) Class7_Sub24 local1404 = (Class7_Sub24) local1396.aClass85_31.method2010(); local1404 != null; local1404 = (Class7_Sub24) local1396.aClass85_31.method2000()) {
									if (local1404.anInt3082 == (local97 & 0x7FFF)) {
										local1404.method5802();
										break;
									}
								}
								if (local1396.aClass85_31.method2007()) {
									local1396.method5802();
								}
								Static32.method424(local20, local24, Static287.anInt6591);
							}
						}
					} else if (arg0 == Static106.aClass94_11) {
						local97 = Static210.aClass7_Sub14_Sub1_4.method3981();
						@Pc(1461) boolean local1461 = (local97 & 0x80) != 0;
						local20 = (local97 >> 3 & 0x7) + Static421.anInt6702;
						local24 = Static400.anInt5902 + (local97 & 0x7);
						local28 = Static210.aClass7_Sub14_Sub1_4.method3930() + local20;
						local124 = Static210.aClass7_Sub14_Sub1_4.method3930() + local24;
						local36 = Static210.aClass7_Sub14_Sub1_4.method3961();
						local361 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local44 = Static210.aClass7_Sub14_Sub1_4.method3981() * 4;
						local53 = Static210.aClass7_Sub14_Sub1_4.method3981() * 4;
						local59 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local63 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local67 = Static210.aClass7_Sub14_Sub1_4.method3981();
						local520 = Static210.aClass7_Sub14_Sub1_4.method3981();
						if (local67 == 255) {
							local67 = -1;
						}
						if (local20 >= 0 && local24 >= 0 && local20 < Static333.anInt3375 && Static102.anInt2086 > local24 && local28 >= 0 && local124 >= 0 && Static333.anInt3375 > local28 && Static102.anInt2086 > local124 && local361 != 65535) {
							local20 = local20 * 128 + 64;
							local44 <<= 0x0;
							local24 = local24 * 128 + 64;
							local124 = local124 * 128 + 64;
							local28 = local28 * 128 + 64;
							local53 <<= 0x0;
							local950 = new Class26_Sub2_Sub3(local361, Static287.anInt6591, local20, local24, local44, local59 + Static274.anInt4617, local63 + Static274.anInt4617, local67, local520, local36, local53, local1461);
							local950.method2848(Static333.method2748(Static287.anInt6591, local124, local28) - local53, local28, local59 + Static274.anInt4617, local124);
							Static235.aClass85_25.method2011(new Class7_Sub4_Sub3(local950));
						}
					} else if (Static225.aClass94_22 == arg0) {
						local97 = Static210.aClass7_Sub14_Sub1_4.method3972();
						local16 = local97 >> 2;
						local20 = local97 & 0x3;
						local24 = Static150.anIntArray251[local16];
						local28 = Static210.aClass7_Sub14_Sub1_4.method3943();
						local124 = Static210.aClass7_Sub14_Sub1_4.method3968();
						local36 = Static421.anInt6702 + (local124 >> 4 & 0x7);
						local361 = Static400.anInt5902 + (local124 & 0x7);
						if (Static117.method1986(Static97.anInt1979) || local36 >= 0 && local361 >= 0 && Static333.anInt3375 > local36 && local361 < Static102.anInt2086) {
							Static38.method556(local24, local16, local28, local36, local361, Static287.anInt6591, local20);
						}
					} else {
						Static419.method5247(null, "T3 - " + arg0);
						Static362.method4646(false);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[S)[S")
	public static short[] method3256(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) short[] local11 = new short[arg0.length];
			Static464.method3635(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method3257(@OriginalArg(1) Class51 arg0) {
		if (Static331.aBoolean372) {
			Static88.method1557(arg0);
		} else {
			Static429.method5537(arg0);
		}
	}
}
