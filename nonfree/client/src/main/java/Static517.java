import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!ha;I)Z")
	public static boolean method7258(@OriginalArg(0) int arg0, @OriginalArg(1) Class87 arg1) {
		@Pc(11) int local11 = (Static3.anInt46 - 104) / 2;
		@Pc(17) int local17 = (Static270.anInt5194 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static403.method6234(local21, local29, local25, arg0)) {
						local40 = local29;
						if (Static471.method6782(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static505.method7152(local21, local25, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(90) int[] local90 = new int[262144];
		for (local29 = 0; local29 < local90.length; local29++) {
			local90[local29] = -16777216;
		}
		Static610.aClass20_35 = arg1.method7913(512, local90, 512, 512);
		Static484.method6947();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((((int) (Math.random() * 20.0D)) + 238) - 10 << 16) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(169) int local169 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00) << 16;
		@Pc(188) int local188 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(198) boolean[][] local198 = new boolean[Static533.anInt8904 + 3][Static533.anInt8904 + 1 + 2];
		@Pc(204) int local204;
		@Pc(208) int local208;
		@Pc(210) int local210;
		@Pc(212) int local212;
		@Pc(221) int local221;
		@Pc(229) int local229;
		@Pc(237) int local237;
		@Pc(265) int local265;
		@Pc(269) int local269;
		@Pc(326) int local326;
		@Pc(333) int local333;
		@Pc(337) int local337;
		@Pc(356) int local356;
		for (@Pc(200) int local200 = local11; local200 < local11 + 104; local200 += Static533.anInt8904) {
			for (local204 = local17; local204 < local17 + 104; local204 += Static533.anInt8904) {
				local208 = 0;
				local210 = 0;
				local212 = local200;
				if (local200 > 0) {
					local212 = local200 - 1;
					local208 += 4;
				}
				local221 = local204;
				if (local204 > 0) {
					local221 = local204 - 1;
				}
				local229 = local200 + Static533.anInt8904;
				if (local229 < 104) {
					local229++;
				}
				local237 = local204 + Static533.anInt8904;
				if (local237 < 104) {
					local210 += 4;
					local237++;
				}
				arg1.KA(0, 0, local208 + Static533.anInt8904 * 4, local210 - -(Static533.anInt8904 * 4));
				arg1.GA(-16777216);
				@Pc(273) int local273;
				for (local265 = arg0; local265 <= 3; local265++) {
					for (local269 = 0; local269 <= Static533.anInt8904; local269++) {
						for (local273 = 0; local273 <= Static533.anInt8904; local273++) {
							local198[local269][local273] = Static403.method6234(local269 + local212, local265, local273 + local221, arg0);
						}
					}
					Static178.aClass112Array2[local265].method7821(local212, local221, local229, local237, local198);
					if (!Static141.aBoolean266) {
						for (local273 = -4; local273 < Static533.anInt8904; local273++) {
							for (local326 = -4; local326 < Static533.anInt8904; local326++) {
								local333 = local200 + local273;
								local337 = local326 + local204;
								if (local11 <= local333 && local17 <= local337 && Static403.method6234(local333, local265, local337, arg0)) {
									local356 = local265;
									if (Static471.method6782(local337, local333)) {
										local356 = local265 - 1;
									}
									if (local356 >= 0) {
										Static644.method8603(local273 * 4 + local208, local40, local333, local356, local169, (Static533.anInt8904 - local326) * 4 + local210 - 4, local337, arg1);
									}
								}
							}
						}
					}
				}
				if (Static141.aBoolean266) {
					@Pc(413) Class179 local413 = Static19.aClass179Array2[arg0];
					for (local273 = 0; local273 < Static533.anInt8904; local273++) {
						for (local326 = 0; local326 < Static533.anInt8904; local326++) {
							local333 = local200 + local273;
							local337 = local326 + local204;
							local356 = local413.anIntArrayArray44[local333 - local413.anInt5187][local337 - local413.anInt5199];
							if ((local356 & 0x40240000) != 0) {
								arg1.method7898(4, 4, -1713569622, (Static533.anInt8904 - local326) * 4 + local210 - 4, local273 * 4 + local208);
							} else if ((local356 & 0x800000) != 0) {
								arg1.method7888((Static533.anInt8904 - local326) * 4 + local210 - 4, 4, -1713569622, local273 * 4 + local208);
							} else if ((local356 & 0x2000000) != 0) {
								arg1.method7921(local273 * 4 + local208 + 3, -1713569622, (Static533.anInt8904 - local326) * 4 + local210 - 4, 4);
							} else if ((local356 & 0x8000000) != 0) {
								arg1.method7888((Static533.anInt8904 - local326) * 4 + local210 + 3 - 4, 4, -1713569622, local273 * 4 + local208);
							} else if ((local356 & 0x20000000) != 0) {
								arg1.method7921(local208 + local273 * 4, -1713569622, (Static533.anInt8904 - local326) * 4 + local210 - 4, 4);
							}
						}
					}
				}
				arg1.aa(local208, local210, Static533.anInt8904 * 4, Static533.anInt8904 * 4, local188, 2);
				Static610.aClass20_35.method4597((local200 - local11) * 4 + 48, -((local204 + -local17) * 4) + (464 - Static533.anInt8904 * 4), Static533.anInt8904 * 4, Static533.anInt8904 * 4, local208, local210);
			}
		}
		arg1.la();
		arg1.GA(-16777215);
		Static539.method7534();
		Static576.anInt9510 = 0;
		Static84.aClass238_10.method5841();
		if (!Static141.aBoolean266) {
			for (local204 = local11; local204 < local11 + 104; local204++) {
				for (local208 = local17; local208 < local17 + 104; local208++) {
					for (local210 = arg0; local210 <= arg0 + 1 && local210 <= 3; local210++) {
						if (Static403.method6234(local204, local210, local208, arg0)) {
							@Pc(701) Interface27 local701 = (Interface27) Static263.method4286(local210, local204, local208);
							if (local701 == null) {
								local701 = (Interface27) Static383.method5768(local210, local204, local208, wk.class);
							}
							if (local701 == null) {
								local701 = (Interface27) Static468.method6746(local210, local204, local208);
							}
							if (local701 == null) {
								local701 = (Interface27) Static148.method2840(local210, local204, local208);
							}
							if (local701 != null) {
								@Pc(742) Class350 local742 = Static619.aClass281_4.method6734(local701.method8326());
								if (!local742.aBoolean710 || Static259.aBoolean404) {
									local229 = local742.anInt9608;
									if (local742.anIntArray665 != null) {
										for (local237 = 0; local237 < local742.anIntArray665.length; local237++) {
											if (local742.anIntArray665[local237] != -1) {
												@Pc(771) Class350 local771 = Static619.aClass281_4.method6734(local742.anIntArray665[local237]);
												if (local771.anInt9608 >= 0) {
													local229 = local771.anInt9608;
												}
											}
										}
									}
									if (local229 >= 0) {
										@Pc(790) boolean local790 = false;
										if (local229 >= 0) {
											@Pc(799) Class105 local799 = Static259.aClass248_2.method6347(local229);
											if (local799 != null && local799.aBoolean282) {
												local790 = true;
											}
										}
										local265 = local204;
										local269 = local208;
										if (local790) {
											@Pc(817) int[][] local817 = Static19.aClass179Array2[local210].anIntArrayArray44;
											local326 = Static19.aClass179Array2[local210].anInt5187;
											local333 = Static19.aClass179Array2[local210].anInt5199;
											for (local337 = 0; local337 < 10; local337++) {
												local356 = (int) (Math.random() * 4.0D);
												if (local356 == 0 && local11 < local265 && local204 - 3 < local265 && (local817[local265 - local326 - 1][local269 - local333] & 0x2C0108) == 0) {
													local265--;
												}
												if (local356 == 1 && local11 + 104 - 1 > local265 && local265 < local204 + 3 && (local817[local265 + 1 - local326][local269 - local333] & 0x2C0180) == 0) {
													local265++;
												}
												if (local356 == 2 && local17 < local269 && local269 > local208 - 3 && (local817[local265 - local326][local269 - local333 - 1] & 0x2C0102) == 0) {
													local269--;
												}
												if (local356 == 3 && local17 + 103 > local269 && local269 < local208 + 3 && (local817[local265 - local326][local269 + 1 - local333] & 0x2C0120) == 0) {
													local269++;
												}
											}
										}
										Static397.anIntArray492[Static576.anInt9510] = local742.anInt9607;
										Static299.anIntArray378[Static576.anInt9510] = local265;
										Static633.anIntArray730[Static576.anInt9510] = local269;
										Static576.anInt9510++;
									}
								}
							}
						}
					}
				}
			}
			if (Static318.aClass313_2 != null) {
				Static104.aClass97_26.anInt3014 = 1;
				Static259.aClass248_2.method6348(64, 1024);
				for (local208 = 0; local208 < Static318.aClass313_2.anInt8902; local208++) {
					local210 = Static318.aClass313_2.anIntArray621[local208];
					if (local210 >> 28 == Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124) {
						local212 = (local210 >> 14 & 0x3FFF) - Static451.anInt7933;
						local221 = (local210 & 0x3FFF) - Static470.anInt8063;
						if (local212 >= 0 && local212 < Static3.anInt46 && local221 >= 0 && Static270.anInt5194 > local221) {
							Static84.aClass238_10.method5837(new Class2_Sub15(local208));
						} else {
							@Pc(1089) Class105 local1089 = Static259.aClass248_2.method6347(Static318.aClass313_2.anIntArray622[local208]);
							if (local1089.anIntArray236 != null && local1089.anInt3339 + local212 >= 0 && local1089.anInt3336 + local212 < Static3.anInt46 && local1089.anInt3334 + local221 >= 0 && Static270.anInt5194 > local1089.anInt3329 + local221) {
								Static84.aClass238_10.method5837(new Class2_Sub15(local208));
							}
						}
					}
				}
				Static259.aClass248_2.method6348(64, 128);
				Static104.aClass97_26.anInt3014 = 2;
				Static104.aClass97_26.method2556();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIIII)I")
	public static int method7259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static331.aClass112Array3 == null) {
			return 0;
		} else if (arg4 < 3) {
			@Pc(24) int local24 = arg3 >> 9;
			@Pc(28) int local28 = arg1 >> 9;
			if (arg2 < 0 || arg0 < 0 || Static3.anInt46 - 1 < arg2 || Static270.anInt5194 - 1 < arg0) {
				return 0;
			} else if (local24 >= 1 && local28 >= 1 && local24 <= Static3.anInt46 - 1 && local28 <= Static270.anInt5194 - 1) {
				@Pc(96) boolean local96 = (Static244.aByteArrayArrayArray9[1][arg3 >> 9][arg1 >> 9] & 0x2) != 0;
				@Pc(118) boolean local118;
				@Pc(134) boolean local134;
				if ((arg3 & 0x1FF) == 0) {
					local118 = (Static244.aByteArrayArrayArray9[1][local24 - 1][arg1 >> 9] & 0x2) != 0;
					local134 = (Static244.aByteArrayArrayArray9[1][local24][arg1 >> 9] & 0x2) != 0;
					if (local134 != local118) {
						local96 = (Static244.aByteArrayArrayArray9[1][arg2][arg0] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x1FF) == 0) {
					local118 = (Static244.aByteArrayArrayArray9[1][arg3 >> 9][local28 - 1] & 0x2) != 0;
					local134 = (Static244.aByteArrayArrayArray9[1][arg3 >> 9][local28] & 0x2) != 0;
					if (local118 != local134) {
						local96 = (Static244.aByteArrayArrayArray9[1][arg2][arg0] & 0x2) != 0;
					}
				}
				if (local96) {
					arg4++;
				}
				return Static331.aClass112Array3[arg4].method7826(arg3, arg1);
			} else {
				return 0;
			}
		} else {
			return Static331.aClass112Array3[arg4].method7826(arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILclient!s;)V")
	public static void method7260(@OriginalArg(0) int arg0, @OriginalArg(1) Class112 arg1) {
		Static331.aClass112Array3[arg0] = arg1;
	}
}
