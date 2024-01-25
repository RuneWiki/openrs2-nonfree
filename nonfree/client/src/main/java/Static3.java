import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!aca", name = "B", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!aca", name = "l", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_8 = new Class112(2, 4, 4, 0);

	@OriginalMember(owner = "client!aca", name = "x", descriptor = "[Z")
	public static final boolean[] aBooleanArray22 = new boolean[100];

	@OriginalMember(owner = "client!aca", name = "y", descriptor = "Lclient!au;")
	public static final Class20 aClass20_2 = new Class20();

	@OriginalMember(owner = "client!aca", name = "z", descriptor = "Lclient!fv;")
	public static final Class112 aClass112_9 = new Class112(11, 0, 1, 2);

	@OriginalMember(owner = "client!aca", name = "A", descriptor = "Lclient!gu;")
	public static Applet_Sub1 anApplet_Sub1_2 = null;

	@OriginalMember(owner = "client!aca", name = "b", descriptor = "(Z)V")
	public static void method5141() {
		Static101.aClass9_4.method5443(Static397.aFloat174, Static294.aFloat122, Static552.aFloat183);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZII[Ljava/lang/String;[S)V")
	public static void method5142(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) short[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) String local20 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local20;
		@Pc(34) short local34 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg0; local46++) {
			if (local20 == null || arg2[local46] != null && (local46 & 0x1) > arg2[local46].compareTo(local20)) {
				@Pc(67) String local67 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16] = local67;
				@Pc(81) short local81 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local81;
			}
		}
		arg2[arg0] = arg2[local16];
		arg2[local16] = local20;
		arg3[arg0] = arg3[local16];
		arg3[local16] = local34;
		method5142(local16 - 1, arg1, arg2, arg3);
		method5142(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aca", name = "a", descriptor = "(Lclient!gl;B)V")
	public static void method5143(@OriginalArg(0) Class117 arg0) {
		@Pc(12) int local12;
		@Pc(19) int local19;
		@Pc(23) int local23;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		if (arg0 == Static70.aClass117_3) {
			local12 = Static345.aClass6_Sub26_Sub2_1.method4954();
			local19 = Static314.anInt8006 + (local12 & 0x7);
			local23 = local19 + Static247.anInt5049;
			local31 = (local12 >> 4 & 0x7) + Static560.anInt9526;
			local35 = local31 + Static191.anInt4147;
			local39 = Static345.aClass6_Sub26_Sub2_1.method4999();
			@Pc(54) Class6_Sub35 local54 = (Class6_Sub35) Static516.aClass305_37.method7447((long) (local23 << 14 | Static147.anInt3044 << 28 | local35));
			if (local54 != null) {
				for (@Pc(62) Class6_Sub43 local62 = (Class6_Sub43) local54.aClass211_47.method5183(); local62 != null; local62 = (Class6_Sub43) local54.aClass211_47.method5177()) {
					if ((local39 & 0x7FFF) == local62.anInt8493) {
						local62.method8151();
						break;
					}
				}
				if (local54.aClass211_47.method5170()) {
					local54.method8151();
				}
				if (local31 >= 0 && local19 >= 0 && Static228.anInt4746 > local31 && local19 < Static44.anInt1275) {
					Static337.method5317(local31, Static147.anInt3044, local19);
				}
			}
			return;
		}
		@Pc(157) int local157;
		@Pc(161) int local161;
		if (arg0 == Static166.aClass117_6) {
			local12 = Static345.aClass6_Sub26_Sub2_1.method4988();
			local19 = Static560.anInt9526 + (local12 >> 4 & 0x7);
			local23 = Static314.anInt8006 + (local12 & 0x7);
			local31 = Static345.aClass6_Sub26_Sub2_1.method4988();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local157 = Static476.anIntArray768[local35];
			local161 = Static345.aClass6_Sub26_Sub2_1.method4983();
			if (Static169.method3452(Static314.anInt8010) || local19 >= 0 && local23 >= 0 && local19 < Static228.anInt4746 && Static44.anInt1275 > local23) {
				Static434.method6631(local161, local35, local19, local39, local157, local23, Static147.anInt3044);
			}
			return;
		}
		@Pc(252) int local252;
		@Pc(274) int local274;
		if (Static541.aClass117_17 == arg0) {
			local12 = Static345.aClass6_Sub26_Sub2_1.method4966();
			local19 = Static560.anInt9526 + (local12 >> 4 & 0x7);
			local23 = (local12 & 0x7) + Static314.anInt8006;
			local31 = Static345.aClass6_Sub26_Sub2_1.method4999();
			if (local31 == 65535) {
				local31 = -1;
			}
			local35 = Static345.aClass6_Sub26_Sub2_1.method4966();
			local39 = local35 >> 4 & 0xF;
			local157 = local35 & 0x7;
			local161 = Static345.aClass6_Sub26_Sub2_1.method4966();
			local252 = Static345.aClass6_Sub26_Sub2_1.method4966();
			if (local19 >= 0 && local23 >= 0 && Static228.anInt4746 > local19 && Static44.anInt1275 > local23) {
				local274 = local39 + 1;
				if (Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0] >= local19 - local274 && Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0] <= local19 + local274 && local23 - local274 <= Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0] && local23 + local274 >= Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0]) {
					Static257.method4468(local31, local157, local252, (local23 << 8) + (local19 << 16) + (Static147.anInt3044 << 24) + local39, local161);
				}
			}
			return;
		}
		@Pc(399) int local399;
		@Pc(407) int local407;
		@Pc(391) byte local391;
		if (arg0 == Static62.aClass117_12) {
			local12 = Static345.aClass6_Sub26_Sub2_1.method4966();
			local19 = local12 >> 2;
			local23 = local12 & 0x3;
			local31 = Static345.aClass6_Sub26_Sub2_1.method4978();
			local35 = (local31 >> 4 & 0x7) + Static560.anInt9526;
			local39 = (local31 & 0x7) + Static314.anInt8006;
			@Pc(379) byte local379 = Static345.aClass6_Sub26_Sub2_1.method4980();
			local161 = Static345.aClass6_Sub26_Sub2_1.method4983();
			local252 = Static345.aClass6_Sub26_Sub2_1.method4990();
			local391 = Static345.aClass6_Sub26_Sub2_1.method4972();
			@Pc(395) byte local395 = Static345.aClass6_Sub26_Sub2_1.method4942();
			local399 = Static345.aClass6_Sub26_Sub2_1.method4999();
			@Pc(403) byte local403 = Static345.aClass6_Sub26_Sub2_1.method4972();
			local407 = Static345.aClass6_Sub26_Sub2_1.method4957();
			if (!Static323.aClass9_8.method5458()) {
				Static380.method5988(local395, local161, local23, local39, Static147.anInt3044, local252, local403, local407, local391, local35, local19, local399, local379);
			}
			return;
		}
		@Pc(495) int local495;
		@Pc(503) int local503;
		@Pc(604) Class11_Sub1_Sub5 local604;
		if (arg0 == Static167.aClass117_7) {
			local12 = Static345.aClass6_Sub26_Sub2_1.method4966();
			@Pc(444) boolean local444 = (local12 & 0x80) != 0;
			local23 = (local12 >> 3 & 0x7) + Static560.anInt9526;
			local31 = (local12 & 0x7) + Static314.anInt8006;
			local35 = local23 + Static345.aClass6_Sub26_Sub2_1.method4972();
			local39 = local31 + Static345.aClass6_Sub26_Sub2_1.method4972();
			local157 = Static345.aClass6_Sub26_Sub2_1.method4974();
			local161 = Static345.aClass6_Sub26_Sub2_1.method4999();
			local252 = Static345.aClass6_Sub26_Sub2_1.method4966() * 4;
			local274 = Static345.aClass6_Sub26_Sub2_1.method4966() * 4;
			local495 = Static345.aClass6_Sub26_Sub2_1.method4999();
			local399 = Static345.aClass6_Sub26_Sub2_1.method4999();
			local503 = Static345.aClass6_Sub26_Sub2_1.method4966();
			if (local503 == 255) {
				local503 = -1;
			}
			local407 = Static345.aClass6_Sub26_Sub2_1.method4999();
			if (local23 >= 0 && local31 >= 0 && Static228.anInt4746 > local23 && local31 < Static44.anInt1275 && local35 >= 0 && local39 >= 0 && Static228.anInt4746 > local35 && local39 < Static44.anInt1275 && local161 != 65535) {
				local407 <<= 0x2;
				local23 = local23 * 512 + 256;
				local39 = local39 * 512 + 256;
				local31 = local31 * 512 + 256;
				local35 = local35 * 512 + 256;
				local252 <<= 0x2;
				local274 <<= 0x2;
				local604 = new Class11_Sub1_Sub5(local161, Static147.anInt3044, local23, local31, local252, Static508.anInt8998 + local495, local399 + Static508.anInt8998, local503, local407, local157, local274, local444);
				local604.method5135(local35, local495 + Static508.anInt8998, -local274 + Static482.method7333(Static147.anInt3044, local39, local35), local39);
				Static565.aClass211_73.method5173(new Class6_Sub4_Sub18(local604));
			}
		} else if (Static556.aClass117_18 == arg0) {
			local12 = Static345.aClass6_Sub26_Sub2_1.method4966();
			local19 = Static314.anInt8006 + (local12 & 0x7);
			local23 = local19 + Static247.anInt5049;
			local31 = Static560.anInt9526 + (local12 >> 4 & 0x7);
			local35 = local31 + Static191.anInt4147;
			local39 = Static345.aClass6_Sub26_Sub2_1.method4999();
			local157 = Static345.aClass6_Sub26_Sub2_1.method4999();
			local161 = Static345.aClass6_Sub26_Sub2_1.method4999();
			if (Static516.aClass305_37 != null) {
				@Pc(689) Class6_Sub35 local689 = (Class6_Sub35) Static516.aClass305_37.method7447((long) (Static147.anInt3044 << 28 | local23 << 14 | local35));
				if (local689 != null) {
					for (@Pc(697) Class6_Sub43 local697 = (Class6_Sub43) local689.aClass211_47.method5183(); local697 != null; local697 = (Class6_Sub43) local689.aClass211_47.method5177()) {
						if ((local39 & 0x7FFF) == local697.anInt8493 && local157 == local697.anInt8487) {
							local697.method8151();
							local697.anInt8487 = local161;
							Static235.method4128(local35, local23, local697, Static147.anInt3044);
							break;
						}
					}
					if (local31 >= 0 && local19 >= 0 && local31 < Static228.anInt4746 && local19 < Static44.anInt1275) {
						Static337.method5317(local31, Static147.anInt3044, local19);
					}
				}
			}
		} else {
			@Pc(797) boolean local797;
			if (Static533.aClass117_16 == arg0) {
				local12 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local19 = (local12 >> 4 & 0xF) + Static560.anInt9526 * 2;
				local23 = Static314.anInt8006 * 2 + (local12 & 0xF);
				local797 = Static345.aClass6_Sub26_Sub2_1.method4966() != 0;
				local35 = local19 + Static345.aClass6_Sub26_Sub2_1.method4972();
				local39 = local23 + Static345.aClass6_Sub26_Sub2_1.method4972();
				local157 = Static345.aClass6_Sub26_Sub2_1.method4974();
				local161 = Static345.aClass6_Sub26_Sub2_1.method4974();
				local252 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local391 = Static345.aClass6_Sub26_Sub2_1.method4972();
				local495 = Static345.aClass6_Sub26_Sub2_1.method4966() * 4;
				local399 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local503 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local407 = Static345.aClass6_Sub26_Sub2_1.method4966();
				if (local407 == 255) {
					local407 = -1;
				}
				@Pc(856) int local856 = Static345.aClass6_Sub26_Sub2_1.method4999();
				if (local19 >= 0 && local23 >= 0 && Static228.anInt4746 * 2 > local19 && local23 < Static228.anInt4746 * 2 && local35 >= 0 && local39 >= 0 && local35 < Static44.anInt1275 * 2 && Static44.anInt1275 * 2 > local39 && local252 != 65535) {
					local23 = local23 * 256;
					local35 *= 256;
					local19 *= 256;
					local495 <<= 0x2;
					local39 = local39 * 256;
					local856 <<= 0x2;
					local274 = local391 << 2;
					if (local157 != 0) {
						@Pc(931) Class11_Sub1_Sub1 local931 = null;
						@Pc(951) int local951;
						@Pc(941) int local941;
						@Pc(945) int local945;
						if (local157 < 0) {
							local941 = -local157 - 1;
							local945 = local941 & 0x7FF;
							local951 = local941 >> 11 & 0xF;
							if (local945 == Static412.anInt7714) {
								local931 = Static350.aClass11_Sub1_Sub1_Sub2_4;
							} else {
								local931 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local945];
							}
						} else {
							local941 = local157 - 1;
							local945 = local941 & 0x7FF;
							local951 = local941 >> 11 & 0xF;
							@Pc(987) Class6_Sub33 local987 = (Class6_Sub33) Static506.aClass305_36.method7447((long) local945);
							if (local987 != null) {
								local931 = local987.aClass11_Sub1_Sub1_Sub1_2;
							}
						}
						if (local931 != null) {
							@Pc(998) Class169 local998 = local931.method6209();
							if (local998.anIntArrayArray35 != null && local998.anIntArrayArray35[local951] != null) {
								local945 = local998.anIntArrayArray35[local951][0];
								@Pc(1020) int local1020 = local998.anIntArrayArray35[local951][2];
								@Pc(1025) int local1025 = local931.aClass134_7.method3705();
								@Pc(1029) int local1029 = Class179.anIntArray756[local1025];
								@Pc(1033) int local1033 = Class179.anIntArray757[local1025];
								@Pc(1044) int local1044 = local1029 * local1020 + local1033 * local945 >> 14;
								@Pc(1055) int local1055 = local1033 * local1020 - local945 * local1029 >> 14;
								local19 += local1044;
								local23 += local1055;
								local274 -= local998.anIntArrayArray35[local951][1];
							}
						}
					}
					@Pc(1094) Class11_Sub1_Sub5 local1094 = new Class11_Sub1_Sub5(local252, Static147.anInt3044, local19, local23, local274, Static508.anInt8998 + local399, Static508.anInt8998 + local503, local407, local856, local161, local495, local797);
					local1094.method5135(local35, Static508.anInt8998 + local399, -local495 + Static482.method7333(Static147.anInt3044, local39, local35), local39);
					Static565.aClass211_73.method5173(new Class6_Sub4_Sub18(local1094));
				}
			} else if (Static236.aClass117_8 == arg0) {
				local12 = Static345.aClass6_Sub26_Sub2_1.method4978();
				local19 = Static314.anInt8006 + (local12 & 0x7);
				local23 = Static247.anInt5049 + local19;
				local31 = (local12 >> 4 & 0x7) + Static560.anInt9526;
				local35 = Static191.anInt4147 + local31;
				local39 = Static345.aClass6_Sub26_Sub2_1.method4967();
				local157 = Static345.aClass6_Sub26_Sub2_1.method4983();
				local161 = Static345.aClass6_Sub26_Sub2_1.method4983();
				if (Static412.anInt7714 != local161) {
					@Pc(1191) boolean local1191 = local31 >= 0 && local19 >= 0 && local31 < Static228.anInt4746 && local19 < Static44.anInt1275;
					if (local1191 || Static169.method3452(Static314.anInt8010)) {
						Static235.method4128(local35, local23, new Class6_Sub43(local157, local39), Static147.anInt3044);
						if (local1191) {
							Static337.method5317(local31, Static147.anInt3044, local19);
						}
					}
				}
			} else if (arg0 == Static161.aClass117_5) {
				local12 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local19 = Static345.aClass6_Sub26_Sub2_1.method4966();
				Static480.aClass57_11.method1469(local12).method1024(local19);
			} else if (Static532.aClass117_15 == arg0) {
				local12 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local19 = Static560.anInt9526 + (local12 >> 4 & 0x7);
				local23 = Static314.anInt8006 + (local12 & 0x7);
				local31 = Static345.aClass6_Sub26_Sub2_1.method4999();
				if (local31 == 65535) {
					local31 = -1;
				}
				local35 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local39 = local35 >> 4 & 0xF;
				local157 = local35 & 0x7;
				local161 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local252 = Static345.aClass6_Sub26_Sub2_1.method4966();
				if (local19 >= 0 && local23 >= 0 && Static228.anInt4746 > local19 && Static44.anInt1275 > local23) {
					local274 = local39 + 1;
					if (Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0] >= local19 - local274 && local274 + local19 >= Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0] && local23 - local274 <= Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0] && local274 + local23 >= Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0]) {
						Static268.method7571(local157, local31, local39 + (local23 << 8) + (local19 << 16) + (Static147.anInt3044 << 24), local252, local161);
					}
				}
			} else if (Static342.aClass117_11 == arg0) {
				local12 = Static345.aClass6_Sub26_Sub2_1.method4954();
				local19 = local12 >> 2;
				local23 = local12 & 0x3;
				local31 = Static476.anIntArray768[local19];
				local35 = Static345.aClass6_Sub26_Sub2_1.method4967();
				if (local35 == 65535) {
					local35 = -1;
				}
				local39 = Static345.aClass6_Sub26_Sub2_1.method4988();
				local157 = Static560.anInt9526 + (local39 >> 4 & 0x7);
				local161 = (local39 & 0x7) + Static314.anInt8006;
				Static213.method4959(local161, local23, Static147.anInt3044, local31, local157, local35, local19);
			} else if (Static308.aClass117_10 == arg0) {
				local12 = Static345.aClass6_Sub26_Sub2_1.method4988();
				local19 = local12 >> 2;
				local23 = local12 & 0x3;
				local31 = Static476.anIntArray768[local19];
				local35 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local39 = Static560.anInt9526 + (local35 >> 4 & 0x7);
				local157 = Static314.anInt8006 + (local35 & 0x7);
				if (Static169.method3452(Static314.anInt8010) || local39 >= 0 && local157 >= 0 && Static228.anInt4746 > local39 && local157 < Static44.anInt1275) {
					Static434.method6631(-1, local19, local39, local23, local31, local157, Static147.anInt3044);
				}
			} else if (arg0 == Static378.aClass117_13) {
				local12 = Static345.aClass6_Sub26_Sub2_1.method4988();
				local19 = (local12 & 0x7) + Static314.anInt8006;
				local23 = Static247.anInt5049 + local19;
				local31 = Static560.anInt9526 + (local12 >> 4 & 0x7);
				local35 = local31 + Static191.anInt4147;
				local39 = Static345.aClass6_Sub26_Sub2_1.method4967();
				local157 = Static345.aClass6_Sub26_Sub2_1.method4967();
				@Pc(1556) boolean local1556 = local31 >= 0 && local19 >= 0 && local31 < Static228.anInt4746 && local19 < Static44.anInt1275;
				if (local1556 || Static169.method3452(Static314.anInt8010)) {
					Static235.method4128(local35, local23, new Class6_Sub43(local157, local39), Static147.anInt3044);
					if (local1556) {
						Static337.method5317(local31, Static147.anInt3044, local19);
					}
				}
			} else if (arg0 == Static453.aClass117_14) {
				local12 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local19 = Static560.anInt9526 + (local12 >> 4 & 0x7);
				local23 = Static314.anInt8006 + (local12 & 0x7);
				local31 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local35 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local39 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local157 = Static345.aClass6_Sub26_Sub2_1.method4966();
				if (local19 >= 0 && local23 >= 0 && local19 < Static228.anInt4746 && local23 < Static44.anInt1275) {
					local161 = local19 * 512 + 256;
					local252 = local23 * 512 + 256;
					local274 = Static147.anInt3044;
					if (local274 < 3 && Static539.method7769(local19, local23)) {
						local274++;
					}
					@Pc(1687) Class11_Sub1_Sub2 local1687 = new Class11_Sub1_Sub2(local31, local39, Static508.anInt8998, Static147.anInt3044, local274, local161, Static482.method7333(Static147.anInt3044, local252, local161) - local35, local252, local19, local19, local23, local23, local157);
					Static409.aClass211_62.method5173(new Class6_Sub4_Sub17(local1687));
				}
			} else if (Static46.aClass117_1 == arg0) {
				local12 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local19 = Static560.anInt9526 * 2 + (local12 >> 4 & 0xF);
				local23 = Static314.anInt8006 * 2 + (local12 & 0xF);
				local797 = Static345.aClass6_Sub26_Sub2_1.method4966() != 0;
				local35 = local19 + Static345.aClass6_Sub26_Sub2_1.method4972();
				local39 = local23 + Static345.aClass6_Sub26_Sub2_1.method4972();
				local157 = Static345.aClass6_Sub26_Sub2_1.method4974();
				local161 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local252 = Static345.aClass6_Sub26_Sub2_1.method4966() * 4;
				local274 = Static345.aClass6_Sub26_Sub2_1.method4966() * 4;
				local495 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local399 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local503 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local407 = Static345.aClass6_Sub26_Sub2_1.method4999();
				if (local503 == 255) {
					local503 = -1;
				}
				if (local19 >= 0 && local23 >= 0 && local19 < Static228.anInt4746 * 2 && Static228.anInt4746 * 2 > local23 && local35 >= 0 && local39 >= 0 && Static44.anInt1275 * 2 > local35 && Static44.anInt1275 * 2 > local39 && local161 != 65535) {
					local35 = local35 * 256;
					local23 = local23 * 256;
					local252 <<= 0x2;
					local19 *= 256;
					local274 <<= 0x2;
					local407 <<= 0x2;
					local39 = local39 * 256;
					local604 = new Class11_Sub1_Sub5(local161, Static147.anInt3044, local19, local23, local252, local495 + Static508.anInt8998, Static508.anInt8998 + local399, local503, local407, local157, local274, local797);
					local604.method5135(local35, local495 + Static508.anInt8998, Static482.method7333(Static147.anInt3044, local39, local35) - local274, local39);
					Static565.aClass211_73.method5173(new Class6_Sub4_Sub18(local604));
				}
			} else if (arg0 == Static136.aClass117_4) {
				Static345.aClass6_Sub26_Sub2_1.method4966();
				local12 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local19 = Static560.anInt9526 + (local12 >> 4 & 0x7);
				local23 = (local12 & 0x7) + Static314.anInt8006;
				local31 = Static345.aClass6_Sub26_Sub2_1.method4999();
				local35 = Static345.aClass6_Sub26_Sub2_1.method4966();
				local39 = Static345.aClass6_Sub26_Sub2_1.method4949();
				@Pc(1947) String local1947 = Static345.aClass6_Sub26_Sub2_1.method4941();
				Static460.method7136(local23, local19, local1947, Static147.anInt3044, local39, local35, local31);
			} else {
				Static5.method211(null, "T3 - " + arg0);
				Static366.method5845(false);
			}
		}
	}
}
