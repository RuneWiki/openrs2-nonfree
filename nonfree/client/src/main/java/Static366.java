import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!iu;")
	public static Class125 aClass125_3;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
	public static int[] anIntArray569;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)I")
	public static int method5052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!si;)V")
	public static void method5053(@OriginalArg(1) Class217 arg0) {
		@Pc(12) int local12;
		@Pc(22) int local22;
		@Pc(30) int local30;
		@Pc(47) int local47;
		@Pc(53) int local53;
		@Pc(57) int local57;
		@Pc(61) int local61;
		@Pc(67) int local67;
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(185) Class6_Sub2_Sub6 local185;
		@Pc(41) boolean local41;
		@Pc(81) int local81;
		if (Static415.aClass217_39 == arg0) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local22 = Static111.anInt6481 * 2 + (local12 >> 4 & 0xF);
			local30 = (local12 & 0xF) + Static54.anInt7605 * 2;
			local41 = Static349.aClass4_Sub30_Sub1_2.method4864() != 0;
			local47 = Static349.aClass4_Sub30_Sub1_2.method4865() + local22;
			local53 = Static349.aClass4_Sub30_Sub1_2.method4865() + local30;
			local57 = Static349.aClass4_Sub30_Sub1_2.method4889();
			local61 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local67 = Static349.aClass4_Sub30_Sub1_2.method4864() * 4;
			local73 = Static349.aClass4_Sub30_Sub1_2.method4864() * 4;
			local77 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local81 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local85 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local89 = Static349.aClass4_Sub30_Sub1_2.method4864();
			if (local85 == 255) {
				local85 = -1;
			}
			if (local22 >= 0 && local30 >= 0 && local22 < Static126.anInt2569 * 2 && Static126.anInt2569 * 2 > local30 && local47 >= 0 && local53 >= 0 && Static190.anInt3697 * 2 > local47 && Static190.anInt3697 * 2 > local53 && local61 != 65535) {
				local67 <<= 0x0;
				local73 <<= 0x0;
				local47 = local47 * 64;
				local53 = local53 * 64;
				local22 = local22 * 64;
				local30 = local30 * 64;
				local185 = new Class6_Sub2_Sub6(local61, Static290.anInt5240, local22, local30, local67, Static175.anInt3261 + local77, Static175.anInt3261 + local81, local85, local89, local57, local73, local41);
				local185.method3265(Static222.method3109(local47, Static290.anInt5240, local53) - local73, local77 - -Static175.anInt3261, local47, local53);
				Static332.aClass258_41.method5526(new Class4_Sub1_Sub14(local185));
			}
			return;
		}
		@Pc(236) int local236;
		if (Static192.aClass217_42 == arg0) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4880();
			local22 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local30 = (local22 >> 4 & 0x7) + Static111.anInt6481;
			local236 = Static54.anInt7605 + (local22 & 0x7);
			if (local30 >= 0 && local236 >= 0 && Static126.anInt2569 > local30 && Static190.anInt3697 > local236) {
				@Pc(261) Class4_Sub20 local261 = (Class4_Sub20) Static437.aClass196_41.method4477((long) (local30 | local236 << 14 | Static290.anInt5240 << 28));
				if (local261 != null) {
					for (@Pc(269) Class4_Sub41 local269 = (Class4_Sub41) local261.aClass258_25.method5538(); local269 != null; local269 = (Class4_Sub41) local261.aClass258_25.method5528()) {
						if ((local12 & 0x7FFF) == local269.anInt6970) {
							local269.method5854();
							break;
						}
					}
					if (local261.aClass258_25.method5533()) {
						local261.method5854();
					}
					Static387.method5232(Static290.anInt5240, local30, local236);
				}
			}
		} else if (arg0 == Static285.aClass217_27) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local22 = (local12 >> 4 & 0x7) + Static111.anInt6481;
			local30 = (local12 & 0x7) + Static54.anInt7605;
			local236 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local47 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local53 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local57 = Static349.aClass4_Sub30_Sub1_2.method4864();
			if (local22 >= 0 && local30 >= 0 && local22 < Static126.anInt2569 && local30 < Static190.anInt3697) {
				local61 = local22 * 128 + 64;
				local67 = local30 * 128 + 64;
				local73 = Static290.anInt5240;
				if (local73 < 3 && Static317.method4378(local30, local22)) {
					local73++;
				}
				@Pc(420) Class6_Sub2_Sub4 local420 = new Class6_Sub2_Sub4(local236, local53, Static175.anInt3261, Static290.anInt5240, local73, local61, Static222.method3109(local61, Static290.anInt5240, local67) - local47, local67, local22, local22, local30, local30, local57);
				Static198.aClass258_30.method5526(new Class4_Sub1_Sub9(local420));
			}
		} else if (arg0 == Static15.aClass217_3) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local22 = Static111.anInt6481 * 2 + (local12 >> 4 & 0xF);
			local30 = Static54.anInt7605 * 2 + (local12 & 0xF);
			local41 = Static349.aClass4_Sub30_Sub1_2.method4864() != 0;
			local47 = Static349.aClass4_Sub30_Sub1_2.method4865() + local22;
			local53 = Static349.aClass4_Sub30_Sub1_2.method4865() + local30;
			local57 = Static349.aClass4_Sub30_Sub1_2.method4889();
			local61 = Static349.aClass4_Sub30_Sub1_2.method4889();
			local67 = Static349.aClass4_Sub30_Sub1_2.method4877();
			@Pc(489) byte local489 = Static349.aClass4_Sub30_Sub1_2.method4865();
			local77 = Static349.aClass4_Sub30_Sub1_2.method4864() * 4;
			local81 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local85 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local89 = Static349.aClass4_Sub30_Sub1_2.method4864();
			@Pc(511) int local511 = Static349.aClass4_Sub30_Sub1_2.method4864();
			if (local89 == 255) {
				local89 = -1;
			}
			if (local22 >= 0 && local30 >= 0 && local22 < Static126.anInt2569 * 2 && Static126.anInt2569 * 2 > local30 && local47 >= 0 && local53 >= 0 && Static190.anInt3697 * 2 > local47 && Static190.anInt3697 * 2 > local53 && local67 != 65535) {
				local53 = local53 * 64;
				local30 *= 64;
				local77 <<= 0x0;
				local73 = local489 << 0;
				local47 = local47 * 64;
				local22 *= 64;
				if (local57 != 0) {
					@Pc(599) int local599;
					@Pc(606) Class6_Sub2_Sub1 local606;
					@Pc(589) int local589;
					@Pc(593) int local593;
					if (local57 < 0) {
						local589 = -local57 - 1;
						local593 = local589 & 0x7FF;
						local599 = local589 >> 11 & 0xF;
						if (Static373.anInt6574 == local593) {
							local606 = Static375.aClass6_Sub2_Sub1_Sub1_3;
						} else {
							local606 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local593];
						}
					} else {
						local589 = local57 - 1;
						local593 = local589 & 0x7FF;
						local599 = local589 >> 11 & 0xF;
						local606 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local593];
					}
					if (local606 != null) {
						@Pc(636) Class132 local636 = local606.method4762();
						if (local636.anIntArrayArray32 != null && local636.anIntArrayArray32[local599] != null) {
							local593 = local636.anIntArrayArray32[local599][0];
							@Pc(658) int local658 = local636.anIntArrayArray32[local599][2];
							@Pc(663) int local663 = local606.aClass216_7.method4985();
							@Pc(667) int local667 = Class56.anIntArray119[local663];
							@Pc(671) int local671 = Class56.anIntArray120[local663];
							@Pc(681) int local681 = local671 * local593 + local658 * local667 >> 15;
							@Pc(692) int local692 = local658 * local671 - local667 * local593 >> 15;
							local22 += local681;
							local73 -= local636.anIntArrayArray32[local599][1];
							local30 += local692;
						}
					}
				}
				@Pc(731) Class6_Sub2_Sub6 local731 = new Class6_Sub2_Sub6(local67, Static290.anInt5240, local22, local30, local73, Static175.anInt3261 + local81, Static175.anInt3261 + local85, local89, local511, local61, local77, local41);
				local731.method3265(Static222.method3109(local47, Static290.anInt5240, local53) - local77, Static175.anInt3261 + local81, local47, local53);
				Static332.aClass258_41.method5526(new Class4_Sub1_Sub14(local731));
			}
		} else if (arg0 == Static17.aClass217_4) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4864();
			@Pc(770) boolean local770 = (local12 & 0x80) != 0;
			local30 = Static111.anInt6481 + (local12 >> 3 & 0x7);
			local236 = Static54.anInt7605 + (local12 & 0x7);
			local47 = local30 + Static349.aClass4_Sub30_Sub1_2.method4865();
			local53 = local236 + Static349.aClass4_Sub30_Sub1_2.method4865();
			local57 = Static349.aClass4_Sub30_Sub1_2.method4889();
			local61 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local67 = Static349.aClass4_Sub30_Sub1_2.method4864() * 4;
			local73 = Static349.aClass4_Sub30_Sub1_2.method4864() * 4;
			local77 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local81 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local85 = Static349.aClass4_Sub30_Sub1_2.method4864();
			if (local85 == 255) {
				local85 = -1;
			}
			local89 = Static349.aClass4_Sub30_Sub1_2.method4864();
			if (local30 >= 0 && local236 >= 0 && Static126.anInt2569 > local30 && Static190.anInt3697 > local236 && local47 >= 0 && local53 >= 0 && Static126.anInt2569 > local47 && Static190.anInt3697 > local53 && local61 != 65535) {
				local53 = local53 * 128 + 64;
				local236 = local236 * 128 + 64;
				local30 = local30 * 128 + 64;
				local67 <<= 0x0;
				local73 <<= 0x0;
				local47 = local47 * 128 + 64;
				local185 = new Class6_Sub2_Sub6(local61, Static290.anInt5240, local30, local236, local67, local77 + Static175.anInt3261, local81 + Static175.anInt3261, local85, local89, local57, local73, local770);
				local185.method3265(Static222.method3109(local47, Static290.anInt5240, local53) - local73, local77 - -Static175.anInt3261, local47, local53);
				Static332.aClass258_41.method5526(new Class4_Sub1_Sub14(local185));
			}
		} else if (Static348.aClass217_34 == arg0) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local22 = (local12 >> 4 & 0x7) + Static111.anInt6481;
			local30 = (local12 & 0x7) + Static54.anInt7605;
			local236 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local47 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local53 = Static349.aClass4_Sub30_Sub1_2.method4877();
			if (Static437.aClass196_41 != null && local22 >= 0 && local30 >= 0 && local22 < Static126.anInt2569 && local30 < Static190.anInt3697) {
				@Pc(1023) Class4_Sub20 local1023 = (Class4_Sub20) Static437.aClass196_41.method4477((long) (local30 << 14 | Static290.anInt5240 << 28 | local22));
				if (local1023 != null) {
					for (@Pc(1031) Class4_Sub41 local1031 = (Class4_Sub41) local1023.aClass258_25.method5538(); local1031 != null; local1031 = (Class4_Sub41) local1023.aClass258_25.method5528()) {
						if (local1031.anInt6970 == (local236 & 0x7FFF) && local47 == local1031.anInt6968) {
							local1031.method5854();
							local1031.anInt6968 = local53;
							Static190.method2802(local1031, Static290.anInt5240, local30, local22);
							break;
						}
					}
					Static387.method5232(Static290.anInt5240, local22, local30);
				}
			}
		} else if (Static289.aClass217_29 == arg0) {
			Static349.aClass4_Sub30_Sub1_2.method4864();
			local12 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local22 = Static111.anInt6481 + (local12 >> 4 & 0x7);
			local30 = Static54.anInt7605 + (local12 & 0x7);
			local236 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local47 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local53 = Static349.aClass4_Sub30_Sub1_2.method4887();
			@Pc(1121) String local1121 = Static349.aClass4_Sub30_Sub1_2.method4867();
			Static423.method4746(local30, local236, local22, local47, Static290.anInt5240, local1121, local53);
		} else if (Static332.aClass217_33 == arg0) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local22 = (local12 >> 4 & 0x7) + Static111.anInt6481;
			local30 = Static54.anInt7605 + (local12 & 0x7);
			local236 = Static349.aClass4_Sub30_Sub1_2.method4880();
			if (local236 == 65535) {
				local236 = -1;
			}
			local47 = Static349.aClass4_Sub30_Sub1_2.method4829();
			local53 = local47 >> 2;
			local57 = local47 & 0x3;
			local61 = Static76.anIntArray111[local53];
			Static403.method5329(local22, local53, local61, local57, Static290.anInt5240, local236, local30);
		} else if (Static266.aClass217_25 == arg0) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local22 = Static349.aClass4_Sub30_Sub1_2.method4864();
			Static2.aClass74_13.method1683(local12).method1630(local22);
		} else if (Static68.aClass217_21 == arg0) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4854();
			local22 = (local12 >> 4 & 0x7) + Static111.anInt6481;
			local30 = (local12 & 0x7) + Static54.anInt7605;
			local236 = Static349.aClass4_Sub30_Sub1_2.method4856();
			local47 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local53 = Static349.aClass4_Sub30_Sub1_2.method4877();
			if (local22 >= 0 && local30 >= 0 && local22 < Static126.anInt2569 && Static190.anInt3697 > local30 && local236 != Static373.anInt6574) {
				Static190.method2802(new Class4_Sub41(local47, local53), Static290.anInt5240, local30, local22);
				Static387.method5232(Static290.anInt5240, local22, local30);
			}
		} else if (Static236.aClass217_17 == arg0) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local22 = Static111.anInt6481 + (local12 >> 4 & 0x7);
			local30 = Static54.anInt7605 + (local12 & 0x7);
			local236 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local47 = local236 >> 2;
			local53 = local236 & 0x3;
			local57 = Static76.anIntArray111[local47];
			if (Static122.method1872(Static323.anInt5755) || local22 >= 0 && local30 >= 0 && local22 < Static126.anInt2569 && local30 < Static190.anInt3697) {
				Static4.method114(local47, -1, local30, local22, local53, Static290.anInt5240, local57);
			}
		} else if (arg0 == Static289.aClass217_28) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4852();
			local22 = Static349.aClass4_Sub30_Sub1_2.method4854();
			local30 = Static111.anInt6481 + (local22 >> 4 & 0x7);
			local236 = Static54.anInt7605 + (local22 & 0x7);
			local47 = Static349.aClass4_Sub30_Sub1_2.method4877();
			if (local30 >= 0 && local236 >= 0 && Static126.anInt2569 > local30 && local236 < Static190.anInt3697) {
				Static190.method2802(new Class4_Sub41(local47, local12), Static290.anInt5240, local236, local30);
				Static387.method5232(Static290.anInt5240, local30, local236);
			}
		} else if (arg0 == Static448.aClass217_41) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4882();
			local22 = local12 >> 2;
			local30 = local12 & 0x3;
			local236 = Static76.anIntArray111[local22];
			local47 = Static349.aClass4_Sub30_Sub1_2.method4852();
			local53 = Static349.aClass4_Sub30_Sub1_2.method4882();
			local57 = Static111.anInt6481 + (local53 >> 4 & 0x7);
			local61 = (local53 & 0x7) + Static54.anInt7605;
			if (Static122.method1872(Static323.anInt5755) || local57 >= 0 && local61 >= 0 && local57 < Static126.anInt2569 && Static190.anInt3697 > local61) {
				Static4.method114(local22, local47, local61, local57, local30, Static290.anInt5240, local236);
			}
		} else if (arg0 == Static440.aClass217_40) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local22 = Static111.anInt6481 + (local12 >> 4 & 0x7);
			local30 = (local12 & 0x7) + Static54.anInt7605;
			local236 = Static349.aClass4_Sub30_Sub1_2.method4877();
			if (local236 == 65535) {
				local236 = -1;
			}
			local47 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local53 = local47 >> 4 & 0xF;
			local57 = local47 & 0x7;
			local61 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local67 = Static349.aClass4_Sub30_Sub1_2.method4864();
			if (local22 >= 0 && local30 >= 0 && local22 < Static126.anInt2569 && Static190.anInt3697 > local30) {
				local73 = local53 + 1;
				if (Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray536[0] >= local22 - local73 && local73 + local22 >= Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray536[0] && local30 - local73 <= Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray537[0] && local30 + local73 >= Static375.aClass6_Sub2_Sub1_Sub1_3.anIntArray537[0]) {
					Static200.method2885(local67, local57, local53 + (local30 << 8) + (local22 << 16) + (Static290.anInt5240 << 24), local236, local61);
				}
			}
		} else if (Static294.aClass217_30 == arg0) {
			local12 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local22 = Static349.aClass4_Sub30_Sub1_2.method4882();
			local30 = Static111.anInt6481 + (local22 >> 4 & 0x7);
			local236 = (local22 & 0x7) + Static54.anInt7605;
			@Pc(1653) byte local1653 = Static349.aClass4_Sub30_Sub1_2.method4879();
			@Pc(1657) byte local1657 = Static349.aClass4_Sub30_Sub1_2.method4866();
			@Pc(1661) byte local1661 = Static349.aClass4_Sub30_Sub1_2.method4865();
			local61 = Static349.aClass4_Sub30_Sub1_2.method4852();
			local67 = Static349.aClass4_Sub30_Sub1_2.method4882();
			local73 = local67 >> 2;
			local77 = local67 & 0x3;
			@Pc(1681) byte local1681 = Static349.aClass4_Sub30_Sub1_2.method4865();
			local85 = Static349.aClass4_Sub30_Sub1_2.method4832();
			local89 = Static349.aClass4_Sub30_Sub1_2.method4852();
			if (!Static16.aClass30_11.method4682()) {
				Static212.method3011(local85, local73, local30, Static290.anInt5240, local89, local61, local77, local1661, local12, local1657, local1681, local1653, local236);
			}
		} else {
			Static273.method3690("T3 - " + arg0, null);
			Static246.method3390();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(FFIIBIFI)[F")
	public static float[] method5057(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		local6[2] = local25;
		local6[6] = -local25;
		local6[8] = local17;
		local6[0] = local17;
		local6[1] = 0.0F;
		local6[7] = 0.0F;
		local6[3] = 0.0F;
		local6[4] = 1.0F;
		local6[5] = 0.0F;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(76) float local76 = (float) arg6 / 32767.0F;
		@Pc(78) float local78 = 0.0F;
		@Pc(82) float local82 = 1.0F - local76;
		@Pc(93) float local93 = -((float) Math.sqrt((double) (1.0F - local76 * local76)));
		@Pc(104) float local104 = (float) Math.sqrt((double) (arg2 * arg2 + arg4 * arg4));
		if (local104 == 0.0F && local76 == 0.0F) {
			local9 = local6;
		} else {
			if (local104 != 0.0F) {
				local71 = (float) -arg4 / local104;
				local78 = (float) arg2 / local104;
			}
			local69[1] = local93 * local78;
			local69[5] = local93 * local71;
			local69[7] = local93 * -local71;
			local69[2] = local82 * local78 * local71;
			local69[8] = local76 + local78 * local78 * local82;
			local69[3] = -local78 * local93;
			local69[6] = local82 * local78 * local71;
			local69[0] = local71 * local71 * local82 + local76;
			local69[4] = local76;
			local9[0] = local69[6] * local6[2] + local69[3] * local6[1] + local69[0] * local6[0];
			local9[1] = local6[2] * local69[7] + local69[4] * local6[1] + local6[0] * local69[1];
			local9[3] = local69[3] * local6[4] + local6[3] * local69[0] + local69[6] * local6[5];
			local9[2] = local69[2] * local6[0] + local6[1] * local69[5] + local6[2] * local69[8];
			local9[4] = local69[7] * local6[5] + local69[1] * local6[3] + local69[4] * local6[4];
			local9[5] = local6[4] * local69[5] + local69[2] * local6[3] + local69[8] * local6[5];
			local9[6] = local6[8] * local69[6] + local6[7] * local69[3] + local69[0] * local6[6];
			local9[7] = local69[7] * local6[8] + local6[7] * local69[4] + local69[1] * local6[6];
			local9[8] = local6[6] * local69[2] + local6[7] * local69[5] + local69[8] * local6[8];
		}
		local9[4] *= arg1;
		local9[2] *= arg5;
		local9[6] *= arg0;
		local9[8] *= arg0;
		local9[3] *= arg1;
		local9[5] *= arg1;
		local9[7] *= arg0;
		local9[0] *= arg5;
		local9[1] *= arg5;
		return local9;
	}
}
