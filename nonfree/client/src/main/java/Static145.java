import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "[I")
	public static final int[] anIntArray180 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)Z")
	public static boolean method2410(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!ni;IIILclient!ni;IIIII)V")
	public static void method2412(@OriginalArg(0) Class6_Sub1_Sub1_Sub1 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class6_Sub1_Sub1_Sub1 arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) int local7 = arg2.method6158();
		if (local7 == -1) {
			return;
		}
		@Pc(25) Class39 local25 = (Class39) Static46.aClass313_12.method6989((long) local7);
		if (local25 == null) {
			@Pc(32) Class13[] local32 = Static596.method254(Static490.aClass259_153, local7);
			if (local32 == null) {
				return;
			}
			local25 = Static307.aClass100_6.method6256(local32[0], true);
			Static46.aClass313_12.method6980((long) local7, local25);
		}
		Static405.method5914(0, arg0.anInt8764, arg0.method6165() * 256, arg5 >> 1, arg0.aByte112, arg6 >> 1, arg0.anInt8761);
		@Pc(81) int local81 = arg4 + Static318.anIntArray418[0] - 18;
		@Pc(89) int local89 = local81 + arg1 / 4 * 18;
		@Pc(99) int local99 = arg3 + Static318.anIntArray418[1] - 16 - 54;
		@Pc(107) int local107 = local99 + arg1 % 4 * 18;
		local25.method7851(local89, local107);
		if (arg0 == arg2) {
			Static307.aClass100_6.method6200(18, local107 - 1, 18, local89 - 1, -256);
		}
		@Pc(131) Class6_Sub2 local131 = Static167.method2912();
		local131.anInt2378 = local89 + 16;
		local131.anInt2383 = local89;
		local131.aClass6_Sub1_Sub1_Sub1_1 = arg2;
		local131.anInt2382 = local107 + 16;
		local131.anInt2379 = local107;
		Static104.aClass109_3.method2313(local131);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!fh;B)V")
	public static void method2413(@OriginalArg(0) Class113 arg0) {
		@Pc(12) int local12;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (arg0 == Static493.aClass113_18) {
			local12 = Static133.aClass2_Sub15_Sub2_1.method4325();
			local18 = (local12 & 0x7) + Static233.anInt4337;
			local22 = Static130.anInt5246 + local18;
			local30 = (local12 >> 4 & 0x7) + Static489.anInt8257;
			local34 = local30 + Static35.anInt906;
			local38 = Static133.aClass2_Sub15_Sub2_1.method4294();
			local42 = Static133.aClass2_Sub15_Sub2_1.method4343();
			@Pc(59) boolean local59 = local30 >= 0 && local18 >= 0 && Static188.anInt3850 > local30 && local18 < Static49.anInt1174;
			if (local59 || Static21.method420(Static565.anInt9249)) {
				Static44.method729(new Class2_Sub18(local38, local42), Static578.anInt9401, local22, local34);
				if (local59) {
					Static46.method793(local18, Static578.anInt9401, local30);
				}
			}
			return;
		}
		@Pc(132) int local132;
		@Pc(136) int local136;
		@Pc(150) int local150;
		if (arg0 == Static38.aClass113_1) {
			local12 = Static133.aClass2_Sub15_Sub2_1.method4325();
			local18 = Static489.anInt8257 + (local12 >> 4 & 0x7);
			local22 = (local12 & 0x7) + Static233.anInt4337;
			local30 = Static133.aClass2_Sub15_Sub2_1.method4294();
			if (local30 == 65535) {
				local30 = -1;
			}
			local34 = Static133.aClass2_Sub15_Sub2_1.method4325();
			local38 = local34 >> 4 & 0xF;
			local42 = local34 & 0x7;
			local132 = Static133.aClass2_Sub15_Sub2_1.method4325();
			local136 = Static133.aClass2_Sub15_Sub2_1.method4325();
			if (local18 >= 0 && local22 >= 0 && Static188.anInt3850 > local18 && local22 < Static49.anInt1174) {
				local150 = local38 + 1;
				if (local18 - local150 <= Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0] && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0] <= local18 + local150 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0] >= local22 - local150 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0] <= local22 + local150) {
					Static529.method7842(local30, local136, local42, local132, (local22 << 8) + (local18 << 16) + (Static578.anInt9401 << 24) + local38);
				}
			}
		} else if (Static505.aClass113_19 == arg0) {
			Static133.aClass2_Sub15_Sub2_1.method4325();
			local12 = Static133.aClass2_Sub15_Sub2_1.method4325();
			local18 = Static489.anInt8257 + (local12 >> 4 & 0x7);
			local22 = Static233.anInt4337 + (local12 & 0x7);
			local30 = Static133.aClass2_Sub15_Sub2_1.method4294();
			local34 = Static133.aClass2_Sub15_Sub2_1.method4325();
			local38 = Static133.aClass2_Sub15_Sub2_1.method4341();
			@Pc(251) String local251 = Static133.aClass2_Sub15_Sub2_1.method4324();
			Static159.method2632(local22, local34, local30, Static578.anInt9401, local38, local251, local18);
		} else {
			@Pc(332) int local332;
			@Pc(414) int local414;
			@Pc(342) int local342;
			@Pc(346) int local346;
			if (Static210.aClass113_9 == arg0) {
				local12 = Static133.aClass2_Sub15_Sub2_1.method4325();
				local18 = Static489.anInt8257 * 2 + (local12 >> 4 & 0xF);
				local22 = Static233.anInt4337 * 2 + (local12 & 0xF);
				local30 = Static133.aClass2_Sub15_Sub2_1.method4325();
				@Pc(302) boolean local302 = (local30 & 0x1) != 0;
				local38 = local30 >> 1;
				local42 = local18 + Static133.aClass2_Sub15_Sub2_1.method4304();
				local132 = local22 + Static133.aClass2_Sub15_Sub2_1.method4304();
				local136 = Static133.aClass2_Sub15_Sub2_1.method4334();
				local150 = Static133.aClass2_Sub15_Sub2_1.method4334();
				local332 = Static133.aClass2_Sub15_Sub2_1.method4294();
				@Pc(336) byte local336 = Static133.aClass2_Sub15_Sub2_1.method4304();
				local342 = Static133.aClass2_Sub15_Sub2_1.method4325() * 4;
				local346 = Static133.aClass2_Sub15_Sub2_1.method4294();
				@Pc(350) int local350 = Static133.aClass2_Sub15_Sub2_1.method4294();
				@Pc(354) int local354 = Static133.aClass2_Sub15_Sub2_1.method4325();
				@Pc(358) int local358 = Static133.aClass2_Sub15_Sub2_1.method4294();
				if (local354 == 255) {
					local354 = -1;
				}
				if (local18 >= 0 && local22 >= 0 && Static188.anInt3850 * 2 > local18 && local22 < Static188.anInt3850 * 2 && local42 >= 0 && local132 >= 0 && Static49.anInt1174 * 2 > local42 && local132 < Static49.anInt1174 * 2 && local332 != 65535) {
					local414 = local336 << 2;
					local132 *= 256;
					local342 <<= 0x2;
					local22 *= 256;
					local18 = local18 * 256;
					local42 *= 256;
					local358 <<= 0x2;
					if (local136 != 0) {
						@Pc(445) Class6_Sub1_Sub1_Sub1 local445 = null;
						@Pc(455) int local455;
						if (local136 < 0) {
							local455 = -local136 - 1;
							if (Static222.anInt4184 == local455) {
								local445 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2;
							} else {
								local445 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local455];
							}
						} else {
							local455 = local136 - 1;
							@Pc(481) Class2_Sub32 local481 = (Class2_Sub32) Static544.aClass162_40.method3519((long) local455);
							if (local481 != null) {
								local445 = local481.aClass6_Sub1_Sub1_Sub1_Sub1_1;
							}
						}
						if (local445 != null) {
							@Pc(492) Class54 local492 = local445.method6168();
							if (local492.anIntArrayArray2 != null && local492.anIntArrayArray2[local38] != null) {
								@Pc(507) int local507 = local492.anIntArrayArray2[local38][0];
								@Pc(514) int local514 = local492.anIntArrayArray2[local38][2];
								@Pc(519) int local519 = local445.aClass186_7.method4106();
								@Pc(523) int local523 = Class363.anIntArray697[local519];
								@Pc(527) int local527 = Class363.anIntArray698[local519];
								@Pc(537) int local537 = local507 * local527 + local523 * local514 >> 14;
								@Pc(548) int local548 = local514 * local527 - local523 * local507 >> 14;
								local18 += local537;
								local22 += local548;
								local414 -= local492.anIntArrayArray2[local38][1];
							}
						}
					}
					@Pc(589) Class6_Sub1_Sub1_Sub2 local589 = new Class6_Sub1_Sub1_Sub2(local332, Static578.anInt9401, Static578.anInt9401, local18, local22, local414, Static412.anInt575 + local346, local350 - -Static412.anInt575, local354, local358, local150, local342, local302);
					local589.method693(local132, local42, local346 + Static412.anInt575, -local342 + Static524.method7217(local42, Static578.anInt9401, local132));
					Static230.aClass8_24.method212(new Class2_Sub3_Sub15(local589));
				}
			} else {
				@Pc(806) Class6_Sub1_Sub1_Sub2 local806;
				if (arg0 == Static410.aClass113_16) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local18 = Static489.anInt8257 * 2 + (local12 >> 4 & 0xF);
					local22 = Static233.anInt4337 * 2 + (local12 & 0xF);
					@Pc(650) boolean local650 = Static133.aClass2_Sub15_Sub2_1.method4325() != 0;
					local34 = local18 + Static133.aClass2_Sub15_Sub2_1.method4304();
					local38 = local22 + Static133.aClass2_Sub15_Sub2_1.method4304();
					local42 = Static133.aClass2_Sub15_Sub2_1.method4334();
					local132 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local136 = Static133.aClass2_Sub15_Sub2_1.method4325() * 4;
					local150 = Static133.aClass2_Sub15_Sub2_1.method4325() * 4;
					local332 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local414 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local342 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local346 = Static133.aClass2_Sub15_Sub2_1.method4294();
					if (local342 == 255) {
						local342 = -1;
					}
					if (local18 >= 0 && local22 >= 0 && Static188.anInt3850 * 2 > local18 && local22 < Static188.anInt3850 * 2 && local34 >= 0 && local38 >= 0 && Static49.anInt1174 * 2 > local34 && Static49.anInt1174 * 2 > local38 && local132 != 65535) {
						local150 <<= 0x2;
						local136 <<= 0x2;
						local18 = local18 * 256;
						local346 <<= 0x2;
						local22 *= 256;
						local34 = local34 * 256;
						local38 *= 256;
						local806 = new Class6_Sub1_Sub1_Sub2(local132, Static578.anInt9401, Static578.anInt9401, local18, local22, local136, local332 + Static412.anInt575, Static412.anInt575 + local414, local342, local346, local42, local150, local650);
						local806.method693(local38, local34, Static412.anInt575 + local332, Static524.method7217(local34, Static578.anInt9401, local38) - local150);
						Static230.aClass8_24.method212(new Class2_Sub3_Sub15(local806));
					}
				} else if (arg0 == Static183.aClass113_8) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4322();
					local18 = local12 >> 2;
					local22 = local12 & 0x3;
					local30 = Static368.anIntArray450[local18];
					local34 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local38 = (local34 >> 4 & 0x7) + Static489.anInt8257;
					local42 = (local34 & 0x7) + Static233.anInt4337;
					local132 = Static133.aClass2_Sub15_Sub2_1.method4294();
					if (local132 == 65535) {
						local132 = -1;
					}
					Static584.method7921(local18, local132, local30, Static578.anInt9401, local42, local22, local38);
				} else if (arg0 == Static226.aClass113_12) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local18 = (local12 >> 4 & 0x7) + Static489.anInt8257;
					local22 = (local12 & 0x7) + Static233.anInt4337;
					local30 = Static133.aClass2_Sub15_Sub2_1.method4294();
					if (local30 == 65535) {
						local30 = -1;
					}
					local34 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local38 = local34 >> 4 & 0xF;
					local42 = local34 & 0x7;
					local132 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local136 = Static133.aClass2_Sub15_Sub2_1.method4325();
					if (local18 >= 0 && local22 >= 0 && Static188.anInt3850 > local18 && Static49.anInt1174 > local22) {
						local150 = local38 + 1;
						if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0] >= local18 - local150 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0] <= local18 + local150 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0] >= local22 - local150 && local150 + local22 >= Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0]) {
							Static592.method3600(local132, local30, local38 + (local18 << 16) + (Static578.anInt9401 << 24) + (local22 << 8), local42, local136);
						}
					}
				} else if (Static313.aClass113_13 == arg0) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local18 = Static233.anInt4337 + (local12 & 0x7);
					local22 = Static130.anInt5246 + local18;
					local30 = Static489.anInt8257 + (local12 >> 4 & 0x7);
					local34 = local30 + Static35.anInt906;
					local38 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local42 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local132 = Static133.aClass2_Sub15_Sub2_1.method4294();
					if (Static261.aClass162_35 != null) {
						@Pc(1082) Class2_Sub40 local1082 = (Class2_Sub40) Static261.aClass162_35.method3519((long) (local22 << 14 | Static578.anInt9401 << 28 | local34));
						if (local1082 != null) {
							for (@Pc(1090) Class2_Sub18 local1090 = (Class2_Sub18) local1082.aClass8_57.method210(); local1090 != null; local1090 = (Class2_Sub18) local1082.aClass8_57.method218()) {
								if ((local38 & 0x7FFF) == local1090.anInt3007 && local42 == local1090.anInt3006) {
									local1090.method7966();
									local1090.anInt3006 = local132;
									Static44.method729(local1090, Static578.anInt9401, local22, local34);
									break;
								}
							}
							if (local30 >= 0 && local18 >= 0 && Static188.anInt3850 > local30 && local18 < Static49.anInt1174) {
								Static46.method793(local18, Static578.anInt9401, local30);
							}
						}
					}
				} else if (arg0 == Static478.aClass113_17) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local18 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local22 = (local18 & 0x7) + Static233.anInt4337;
					local30 = local22 + Static130.anInt5246;
					local34 = Static489.anInt8257 + (local18 >> 4 & 0x7);
					local38 = Static35.anInt906 + local34;
					@Pc(1196) Class2_Sub40 local1196 = (Class2_Sub40) Static261.aClass162_35.method3519((long) (Static578.anInt9401 << 28 | local30 << 14 | local38));
					if (local1196 != null) {
						for (@Pc(1204) Class2_Sub18 local1204 = (Class2_Sub18) local1196.aClass8_57.method210(); local1204 != null; local1204 = (Class2_Sub18) local1196.aClass8_57.method218()) {
							if ((local12 & 0x7FFF) == local1204.anInt3007) {
								local1204.method7966();
								break;
							}
						}
						if (local1196.aClass8_57.method219()) {
							local1196.method7966();
						}
						if (local34 >= 0 && local22 >= 0 && Static188.anInt3850 > local34 && local22 < Static49.anInt1174) {
							Static46.method793(local22, Static578.anInt9401, local34);
						}
					}
				} else if (Static105.aClass113_3 == arg0) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local18 = Static133.aClass2_Sub15_Sub2_1.method4325();
					Static541.aClass97_4.method1794(local12).method561(local18);
				} else if (arg0 == Static55.aClass113_4) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4322();
					local18 = local12 >> 2;
					local22 = local12 & 0x3;
					local30 = Static368.anIntArray450[local18];
					local34 = Static133.aClass2_Sub15_Sub2_1.method4322();
					local38 = (local34 >> 4 & 0x7) + Static489.anInt8257;
					local42 = Static233.anInt4337 + (local34 & 0x7);
					if (Static21.method420(Static565.anInt9249) || local38 >= 0 && local42 >= 0 && local38 < Static188.anInt3850 && Static49.anInt1174 > local42) {
						Static310.method4648(Static578.anInt9401, local22, local18, -1, local42, local38, local30);
					}
				} else if (arg0 == Static175.aClass113_5) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local18 = Static489.anInt8257 + (local12 >> 4 & 0x7);
					local22 = Static233.anInt4337 + (local12 & 0x7);
					local30 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local34 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local38 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local42 = Static133.aClass2_Sub15_Sub2_1.method4325();
					if (local18 >= 0 && local22 >= 0 && Static188.anInt3850 > local18 && local22 < Static49.anInt1174) {
						local132 = local18 * 512 + 256;
						local136 = local22 * 512 + 256;
						local150 = Static578.anInt9401;
						if (local150 < 3 && Static551.method7475(local22, local18)) {
							local150++;
						}
						@Pc(1459) Class6_Sub1_Sub1_Sub5 local1459 = new Class6_Sub1_Sub1_Sub5(local30, local38, Static412.anInt575, Static578.anInt9401, local150, local132, Static524.method7217(local132, Static578.anInt9401, local136) - local34, local136, local18, local18, local22, local22, local42);
						Static472.aClass8_55.method212(new Class2_Sub3_Sub17(local1459));
					}
				} else if (Static394.aClass113_11 == arg0) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4291();
					local18 = Static133.aClass2_Sub15_Sub2_1.method4338();
					local22 = (local18 & 0x7) + Static233.anInt4337;
					local30 = local22 + Static130.anInt5246;
					local34 = (local18 >> 4 & 0x7) + Static489.anInt8257;
					local38 = Static35.anInt906 + local34;
					local42 = Static133.aClass2_Sub15_Sub2_1.method4291();
					local132 = Static133.aClass2_Sub15_Sub2_1.method4343();
					if (Static222.anInt4184 != local132) {
						@Pc(1535) boolean local1535 = local34 >= 0 && local22 >= 0 && local34 < Static188.anInt3850 && local22 < Static49.anInt1174;
						if (local1535 || Static21.method420(Static565.anInt9249)) {
							Static44.method729(new Class2_Sub18(local12, local42), Static578.anInt9401, local30, local38);
							if (local1535) {
								Static46.method793(local22, Static578.anInt9401, local34);
							}
						}
					}
				} else if (Static400.aClass113_15 == arg0) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4325();
					@Pc(1574) boolean local1574 = (local12 & 0x80) != 0;
					local22 = (local12 >> 3 & 0x7) + Static489.anInt8257;
					local30 = Static233.anInt4337 + (local12 & 0x7);
					local34 = local22 + Static133.aClass2_Sub15_Sub2_1.method4304();
					local38 = local30 + Static133.aClass2_Sub15_Sub2_1.method4304();
					local42 = Static133.aClass2_Sub15_Sub2_1.method4334();
					local132 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local136 = Static133.aClass2_Sub15_Sub2_1.method4325() * 4;
					local150 = Static133.aClass2_Sub15_Sub2_1.method4325() * 4;
					local332 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local414 = Static133.aClass2_Sub15_Sub2_1.method4294();
					local342 = Static133.aClass2_Sub15_Sub2_1.method4325();
					if (local342 == 255) {
						local342 = -1;
					}
					local346 = Static133.aClass2_Sub15_Sub2_1.method4294();
					if (local22 >= 0 && local30 >= 0 && Static188.anInt3850 > local22 && local30 < Static49.anInt1174 && local34 >= 0 && local38 >= 0 && local34 < Static188.anInt3850 && local38 < Static49.anInt1174 && local132 != 65535) {
						local22 = local22 * 512 + 256;
						local346 <<= 0x2;
						local30 = local30 * 512 + 256;
						local34 = local34 * 512 + 256;
						local150 <<= 0x2;
						local136 <<= 0x2;
						local38 = local38 * 512 + 256;
						local806 = new Class6_Sub1_Sub1_Sub2(local132, Static578.anInt9401, Static578.anInt9401, local22, local30, local136, Static412.anInt575 + local332, Static412.anInt575 + local414, local342, local346, local42, local150, local1574);
						local806.method693(local38, local34, local332 + Static412.anInt575, -local150 + Static524.method7217(local34, Static578.anInt9401, local38));
						Static230.aClass8_24.method212(new Class2_Sub3_Sub15(local806));
					}
				} else if (Static355.aClass113_14 == arg0) {
					local12 = Static133.aClass2_Sub15_Sub2_1.method4323();
					local18 = local12 >> 2;
					local22 = local12 & 0x3;
					local30 = Static368.anIntArray450[local18];
					local34 = Static133.aClass2_Sub15_Sub2_1.method4325();
					local38 = Static489.anInt8257 + (local34 >> 4 & 0x7);
					local42 = (local34 & 0x7) + Static233.anInt4337;
					local132 = Static133.aClass2_Sub15_Sub2_1.method4294();
					if (Static21.method420(Static565.anInt9249) || local38 >= 0 && local42 >= 0 && local38 < Static188.anInt3850 && local42 < Static49.anInt1174) {
						Static310.method4648(Static578.anInt9401, local22, local18, local132, local42, local38, local30);
					}
				} else {
					Static58.method946("T3 - " + arg0, null);
					Static295.method7108(false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZLjava/lang/String;II)V")
	public static void method2414(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3) {
		Static229.method3603(arg3, null, arg1, arg0, false, arg2);
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V")
	public static void method2415() {
		if (Static332.anInt6122 == -1 || Static408.anInt7104 == -1) {
			return;
		}
		@Pc(24) int local24 = Static177.anInt3713 + (Static14.anInt463 * (Static472.anInt8075 - Static177.anInt3713) >> 16);
		Static14.anInt463 += local24;
		if (Static14.anInt463 >= 65535) {
			if (Static174.aBoolean300) {
				Static526.aBoolean668 = false;
			} else {
				Static526.aBoolean668 = true;
			}
			Static14.anInt463 = 65535;
			Static174.aBoolean300 = true;
		} else {
			Static174.aBoolean300 = false;
			Static526.aBoolean668 = false;
		}
		@Pc(61) float local61 = (float) Static14.anInt463 / 65535.0F;
		@Pc(64) float[] local64 = new float[3];
		@Pc(68) int local68 = Static467.anInt7990 * 2;
		@Pc(94) int local94;
		@Pc(127) int local127;
		@Pc(135) int local135;
		@Pc(140) int local140;
		@Pc(148) int local148;
		@Pc(165) int local165;
		for (@Pc(70) int local70 = 0; local70 < 3; local70++) {
			@Pc(82) int local82 = Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68][local70] * 3;
			local94 = Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68 + 1][local70] * 3;
			local127 = (Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68 + 2][local70] + Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68 + 2][local70] - Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68 + 3][local70]) * 3;
			local135 = Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68][local70];
			local140 = local94 - local82;
			local148 = local82 + local127 - local94 * 2;
			local165 = Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68 + 2][local70] + local94 - local135 - local127;
			local64[local70] = (float) local135 + local61 * (local61 * ((float) local148 + (float) local165 * local61) + (float) local140);
		}
		Static548.anInt8906 = (int) local64[1] * -1;
		Static90.anInt1932 = (int) local64[0] - Static35.anInt906 * 512;
		Static7.anInt337 = (int) local64[2] - Static130.anInt5246 * 512;
		@Pc(219) float[] local219 = new float[3];
		local94 = Static274.anInt4968 * 2;
		for (local127 = 0; local127 < 3; local127++) {
			local135 = Class6_Sub1_Sub3_Sub1.lb[Static408.anInt7104][local94][local127] * 3;
			local140 = Class6_Sub1_Sub3_Sub1.lb[Static408.anInt7104][local94 + 1][local127] * 3;
			local148 = (Class6_Sub1_Sub3_Sub1.lb[Static408.anInt7104][local94 + 2][local127] + Class6_Sub1_Sub3_Sub1.lb[Static408.anInt7104][local94 + 2][local127] - Class6_Sub1_Sub3_Sub1.lb[Static408.anInt7104][local94 + 3][local127]) * 3;
			local165 = Class6_Sub1_Sub3_Sub1.lb[Static408.anInt7104][local94][local127];
			@Pc(295) int local295 = local140 - local135;
			@Pc(303) int local303 = local135 + local148 - local140 * 2;
			@Pc(321) int local321 = local140 + Class6_Sub1_Sub3_Sub1.lb[Static408.anInt7104][local94 + 2][local127] - local165 - local148;
			local219[local127] = local61 * ((float) local295 + ((float) local303 + local61 * (float) local321) * local61) + (float) local165;
		}
		@Pc(355) float local355 = local219[0] - local64[0];
		@Pc(366) float local366 = (local219[1] - local64[1]) * -1.0F;
		@Pc(374) float local374 = local219[2] - local64[2];
		@Pc(384) double local384 = Math.sqrt((double) (local355 * local355 + local374 * local374));
		Static323.anInt6015 = (int) (Math.atan2((double) local366, local384) * 2607.5945876176133D) & 0x3FFF;
		Static177.anInt3712 = (int) (-Math.atan2((double) local355, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static443.anInt7768 = Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68][3] + ((Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68 + 2][3] - Class6_Sub1_Sub3_Sub1.lb[Static332.anInt6122][local68][3]) * Static14.anInt463 >> 16);
	}
}
