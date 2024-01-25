import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!na", name = "c", descriptor = "I")
	public static int anInt6181;

	@OriginalMember(owner = "client!na", name = "d", descriptor = "Lclient!fa;")
	public static Class94 aClass94_8;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BLclient!qa;I)Z")
	public static boolean method5148(@OriginalArg(1) Class62 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static460.anInt7894 - 104) / 2;
		@Pc(17) int local17 = (Static235.anInt4493 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static189.method4028(local25, local21, arg1, local29)) {
						local40 = local29;
						if (Static279.method4553(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static452.method6362(local21, local25, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(96) int[] local96 = new int[262144];
		for (local29 = 0; local29 < local96.length; local29++) {
			local96[local29] = -16777216;
		}
		Static112.aClass25_5 = arg0.method7021(local96, 512, 512, 512);
		Static152.method2795();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 228 | 0xFF000000;
		@Pc(171) int local171 = ((int) (Math.random() * 20.0D) + 228 | 0xFF00) << 16;
		@Pc(190) int local190 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(198) boolean[][] local198 = new boolean[Static187.anInt3604 + 1][Static187.anInt3604 + 1];
		@Pc(204) int local204;
		@Pc(208) int local208;
		@Pc(210) int local210;
		@Pc(212) int local212;
		@Pc(218) int local218;
		@Pc(225) int local225;
		@Pc(234) int local234;
		@Pc(259) int local259;
		@Pc(263) int local263;
		@Pc(316) int local316;
		@Pc(323) int local323;
		@Pc(327) int local327;
		@Pc(350) int local350;
		for (@Pc(200) int local200 = local11; local200 < local11 + 104; local200 += Static187.anInt3604) {
			for (local204 = local17; local204 < local17 + 104; local204 += Static187.anInt3604) {
				local208 = 0;
				local210 = 0;
				local212 = local200;
				if (local200 > 0) {
					local208 += 4;
					local212 = local200 - 1;
				}
				local218 = local204;
				if (local204 > 0) {
					local218 = local204 - 1;
				}
				local225 = local200 + Static187.anInt3604;
				if (local225 < 104) {
					local225++;
				}
				local234 = local204 + Static187.anInt3604;
				if (local234 < 104) {
					local234++;
					local210 += 4;
				}
				arg0.N(0, 0, Static187.anInt3604 * 4 + local208, local210 - -(Static187.anInt3604 * 4));
				arg0.Z(-16777216);
				@Pc(267) int local267;
				for (local259 = arg1; local259 <= 3; local259++) {
					for (local263 = 0; local263 <= Static187.anInt3604; local263++) {
						for (local267 = 0; local267 <= Static187.anInt3604; local267++) {
							local198[local263][local267] = Static189.method4028(local267 + local218, local263 + local212, arg1, local259);
						}
					}
					Static493.aClass131Array5[local259].method7182(local212, local218, local225, local234, local198);
					if (!Static533.aBoolean651) {
						for (local267 = -4; local267 < Static187.anInt3604; local267++) {
							for (local316 = -4; local316 < Static187.anInt3604; local316++) {
								local323 = local200 + local267;
								local327 = local204 + local316;
								if (local323 >= local11 && local17 <= local327 && Static189.method4028(local327, local323, arg1, local259)) {
									local350 = local259;
									if (Static279.method4553(local327, local323)) {
										local350 = local259 - 1;
									}
									if (local350 >= 0) {
										Static181.method3082(local171, local40, local208 + local267 * 4, local210 + (Static187.anInt3604 - local316) * 4 - 4, local327, local323, arg0, local350);
									}
								}
							}
						}
					}
				}
				if (Static533.aBoolean651) {
					@Pc(409) Class10 local409 = Static71.aClass10Array3[arg1];
					for (local267 = 0; local267 < Static187.anInt3604; local267++) {
						for (local316 = 0; local316 < Static187.anInt3604; local316++) {
							local323 = local200 + local267;
							local327 = local204 + local316;
							local350 = local409.anIntArrayArray2[local323 - local409.anInt163][local327 - local409.anInt162];
							if ((local350 & 0x40240000) != 0) {
								arg0.method7040(-1713569622, 4, local210 + (Static187.anInt3604 - local316) * 4 - 4, local267 * 4 + local208, 4);
							} else if ((local350 & 0x800000) != 0) {
								arg0.method7042(4, local210 + (Static187.anInt3604 - local316) * 4 - 4, local267 * 4 + local208, -1713569622);
							} else if ((local350 & 0x2000000) != 0) {
								arg0.method7064(4, local267 * 4 + local208 + 3, (Static187.anInt3604 - local316) * 4 + -4 + local210, -1713569622);
							} else if ((local350 & 0x8000000) != 0) {
								arg0.method7042(4, (Static187.anInt3604 - local316) * 4 + local210 - 1, local208 - -(local267 * 4), -1713569622);
							} else if ((local350 & 0x20000000) != 0) {
								arg0.method7064(4, local208 + local267 * 4, local210 - -((-local316 + Static187.anInt3604) * 4) + -4, -1713569622);
							}
						}
					}
				}
				arg0.f(local208, local210, Static187.anInt3604 * 4, Static187.anInt3604 * 4, local190, 2);
				Static112.aClass25_5.P((local200 - local11) * 4 + 48, -(Static187.anInt3604 * 4) + -((local204 + -local17) * 4) + 464, Static187.anInt3604 * 4, Static187.anInt3604 * 4, local208, local210);
			}
		}
		arg0.n();
		arg0.Z(-16777215);
		Static544.method2108();
		Static106.anInt2330 = 0;
		Static370.aClass99_70.method2524();
		if (!Static533.aBoolean651) {
			for (local204 = local11; local204 < local11 + 104; local204++) {
				for (local208 = local17; local208 < local17 + 104; local208++) {
					for (local210 = arg1; arg1 + 1 >= local210 && local210 <= 3; local210++) {
						if (Static189.method4028(local208, local204, arg1, local210)) {
							@Pc(692) Interface10 local692 = (Interface10) Static469.method6581(local210, local204, local208);
							if (local692 == null) {
								local692 = (Interface10) Static188.method3173(local210, local204, local208, p.class);
							}
							if (local692 == null) {
								local692 = (Interface10) Static490.method6780(local210, local204, local208);
							}
							if (local692 == null) {
								local692 = (Interface10) Static475.method6634(local210, local204, local208);
							}
							if (local692 != null) {
								@Pc(733) Class283 local733 = Static453.aClass88_3.method2294(local692.method6868());
								if (!local733.aBoolean589 || Static433.aBoolean542) {
									local225 = local733.anInt8188;
									if (local733.anIntArray632 != null) {
										for (local234 = 0; local234 < local733.anIntArray632.length; local234++) {
											if (local733.anIntArray632[local234] != -1) {
												@Pc(762) Class283 local762 = Static453.aClass88_3.method2294(local733.anIntArray632[local234]);
												if (local762.anInt8188 >= 0) {
													local225 = local762.anInt8188;
												}
											}
										}
									}
									if (local225 >= 0) {
										@Pc(788) boolean local788 = false;
										if (local225 >= 0) {
											@Pc(795) Class101 local795 = Static358.aClass246_3.method5847(local225);
											if (local795 != null && local795.aBoolean189) {
												local788 = true;
											}
										}
										local259 = local204;
										local263 = local208;
										if (local788) {
											@Pc(813) int[][] local813 = Static71.aClass10Array3[local210].anIntArrayArray2;
											local316 = Static71.aClass10Array3[local210].anInt163;
											local323 = Static71.aClass10Array3[local210].anInt162;
											for (local327 = 0; local327 < 10; local327++) {
												local350 = (int) (Math.random() * 4.0D);
												if (local350 == 0 && local259 > local11 && local204 - 3 < local259 && (local813[local259 - local316 - 1][local263 - local323] & 0x2C0108) == 0) {
													local259--;
												}
												if (local350 == 1 && local259 < local11 + 104 - 1 && local259 < local204 + 3 && (local813[local259 + 1 - local316][local263 - local323] & 0x2C0180) == 0) {
													local259++;
												}
												if (local350 == 2 && local263 > local17 && local263 > local208 - 3 && (local813[local259 - local316][local263 - local323 - 1] & 0x2C0102) == 0) {
													local263--;
												}
												if (local350 == 3 && local263 < local17 + 103 && local263 < local208 + 3 && (local813[local259 - local316][local263 + 1 - local323] & 0x2C0120) == 0) {
													local263++;
												}
											}
										}
										Static428.anIntArray574[Static106.anInt2330] = local733.anInt8190;
										Static449.anIntArray591[Static106.anInt2330] = local259;
										Static474.anIntArray242[Static106.anInt2330] = local263;
										Static106.anInt2330++;
									}
								}
							}
						}
					}
				}
			}
			if (Static259.aClass197_2 != null) {
				Static212.aClass117_110.anInt3362 = 1;
				Static358.aClass246_3.method5844(1024, 64);
				for (local208 = 0; local208 < Static259.aClass197_2.anInt6065; local208++) {
					local210 = Static259.aClass197_2.anIntArray418[local208];
					if (local210 >> 28 == Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91) {
						local212 = (local210 >> 14 & 0x3FFF) - Static515.anInt3214;
						local218 = (local210 & 0x3FFF) - Static338.anInt6353;
						if (local212 >= 0 && local212 < Static460.anInt7894 && local218 >= 0 && Static235.anInt4493 > local218) {
							Static370.aClass99_70.method2513(new Class5_Sub27(local208));
						} else {
							@Pc(1082) Class101 local1082 = Static358.aClass246_3.method5847(Static259.aClass197_2.anIntArray417[local208]);
							if (local1082.anIntArray235 != null && local212 + local1082.anInt2888 >= 0 && local1082.anInt2877 + local212 < Static460.anInt7894 && local218 + local1082.anInt2861 >= 0 && local218 + local1082.anInt2883 < Static235.anInt4493) {
								Static370.aClass99_70.method2513(new Class5_Sub27(local208));
							}
						}
					}
				}
				Static358.aClass246_3.method5844(128, 64);
				Static212.aClass117_110.anInt3362 = 2;
				Static212.aClass117_110.method2952();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(III)V")
	public static void method5149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub2_Sub7 local8 = Static144.method2728(arg0, 1);
		local8.method1327();
		local8.anInt1437 = arg1;
	}
}
