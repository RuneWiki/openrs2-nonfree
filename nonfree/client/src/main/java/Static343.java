import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "Z")
	public static boolean aBoolean583 = false;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIII)V")
	public static void method5583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = ((arg4 << 1) - 3) * local25;
		@Pc(85) int local85 = local55;
		Static182.method3394(arg0 - arg2, Static30.anIntArrayArray10[arg3], arg1, arg2 + arg0);
		@Pc(104) int local104 = (arg4 - 1) * local51;
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local85;
					local38 += local63;
					local63 += local55;
					local85 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local38 += local63;
				local47 += local85;
				local63 += local55;
				local7++;
				local85 += local55;
			}
			local38 += -local104;
			local47 += -local71;
			local9--;
			local71 -= local51;
			local104 -= local51;
			@Pc(175) int local175 = arg3 - local9;
			@Pc(179) int local179 = local9 + arg3;
			@Pc(184) int local184 = arg0 + local7;
			@Pc(189) int local189 = arg0 - local7;
			Static182.method3394(local189, Static30.anIntArrayArray10[local175], arg1, local184);
			Static182.method3394(local189, Static30.anIntArrayArray10[local179], arg1, local184);
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIIIII)V")
	public static void method5584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static54.anInt1198 = 0;
		@Pc(179) int local179;
		@Pc(222) int local222;
		@Pc(391) int local391;
		@Pc(509) int local509;
		@Pc(275) int local275;
		@Pc(626) int local626;
		@Pc(447) int local447;
		for (@Pc(9) int local9 = -1; local9 < Static282.anInt5712 + Static156.anInt3506; local9++) {
			@Pc(13) Class34 local13 = null;
			@Pc(30) Class2_Sub2_Sub1 local30;
			if (local9 < 0) {
				local30 = Static110.aClass2_Sub2_Sub1_Sub1_1;
			} else if (local9 >= Static156.anInt3506) {
				local30 = Static101.aClass2_Sub2_Sub1_Sub2Array6[Static332.anIntArray523[local9 - Static156.anInt3506]];
				local13 = ((Class2_Sub2_Sub1_Sub2) local30).aClass34_1;
				if (local13.anIntArray108 != null) {
					local13 = local13.method748();
					if (local13 == null) {
						continue;
					}
				}
			} else {
				local30 = Static253.aClass2_Sub2_Sub1_Sub1Array1[Static39.anIntArray105[local9]];
			}
			if (local30.anInt6476 >= 0) {
				Static220.method3782(local30, local30.method5430(), arg2 >> 1, arg3 >> 1);
				if (Static257.anIntArray436[0] >= 0) {
					if (local30.aString243 != null && (local9 >= Static156.anInt3506 || Static159.anInt3589 == 0 || Static159.anInt3589 == 3 || Static159.anInt3589 == 1 && Static33.method524(((Class2_Sub2_Sub1_Sub1) local30).aString22)) && Static103.anInt3246 > Static54.anInt1198) {
						Static103.anIntArray290[Static54.anInt1198] = Static242.aClass106_7.method2879(local30.aString243) / 2;
						Static103.anIntArray293[Static54.anInt1198] = Static257.anIntArray436[0];
						Static103.anIntArray291[Static54.anInt1198] = Static257.anIntArray436[1];
						Static103.anIntArray294[Static54.anInt1198] = local30.anInt6506;
						Static103.anIntArray292[Static54.anInt1198] = local30.anInt6538;
						Static103.anIntArray289[Static54.anInt1198] = local30.anInt6497;
						Static103.aStringArray26[Static54.anInt1198] = local30.aString243;
						Static54.anInt1198++;
					}
					@Pc(165) Class60 local165 = Static310.aClass60Array17[0];
					local179 = arg0 + Static257.anIntArray436[1] - Math.max(Static242.aClass106_7.anInt3299, local165.method5687());
					@Pc(190) Class60 local190;
					@Pc(287) int local287;
					if (!local30.aBoolean568 && Static342.anInt6706 < local30.anInt6488) {
						local190 = Static310.aClass60Array17[1];
						if (local30 instanceof Class2_Sub2_Sub1_Sub2) {
							@Pc(196) Class2_Sub2_Sub1_Sub2 local196 = (Class2_Sub2_Sub1_Sub2) local30;
							@Pc(205) Class60[] local205 = (Class60[]) Static296.aClass154_90.method4222((long) local196.aClass34_1.anInt870);
							if (local205 == null) {
								@Pc(214) Class206[] local214 = Static367.method5454(Static292.aClass11_130, local196.aClass34_1.anInt870);
								if (local214 != null) {
									local205 = new Class60[local214.length];
									for (local222 = 0; local222 < local214.length; local222++) {
										local205[local222] = Static164.aClass92_7.method4506(local214[local222]);
									}
									Static296.aClass154_90.method4221((long) local196.aClass34_1.anInt870, local205);
								}
							}
							if (local205 != null && local205.length == 2) {
								local190 = local205[1];
								local165 = local205[0];
							}
						}
						local275 = arg1 + Static257.anIntArray436[0] - (local165.method5679() >> 1);
						local165.method5675(local275, local179);
						local287 = local165.method5679() * local30.anInt6496 / 255;
						Static164.aClass92_7.method4472(local275, local179, local287 + local275, local179 + local165.method5687());
						local190.method5675(local275, local179);
						Static164.aClass92_7.method4459(arg1, arg0, arg2 + arg1, arg3 + arg0);
					}
					local179 -= 2;
					if (!local30.aBoolean568) {
						if (local30.anInt6507 > Static342.anInt6706) {
							local190 = Static118.aClass60Array6[local30.aBoolean566 ? 2 : 0];
							@Pc(342) Class60 local342 = Static118.aClass60Array6[local30.aBoolean566 ? 3 : 1];
							if (local30 instanceof Class2_Sub2_Sub1_Sub2) {
								local287 = local13.lb;
								if (local287 == -1) {
									local287 = local30.method5428().anInt222;
								}
							} else {
								local287 = local30.method5428().anInt222;
							}
							if (local287 != -1) {
								@Pc(376) Class60[] local376 = (Class60[]) Static14.aClass154_6.method4222((long) local287);
								if (local376 == null) {
									@Pc(383) Class206[] local383 = Static367.method5454(Static292.aClass11_130, local287);
									if (local383 != null) {
										local376 = new Class60[local383.length];
										for (local391 = 0; local391 < local383.length; local391++) {
											local376[local391] = Static164.aClass92_7.method4506(local383[local391]);
										}
										Static14.aClass154_6.method4221((long) local287, local376);
									}
								}
								if (local376 != null && local376.length == 4) {
									local342 = local376[local30.aBoolean566 ? 3 : 1];
									local190 = local376[local30.aBoolean566 ? 2 : 0];
								}
							}
							local447 = local30.anInt6507 - Static342.anInt6706;
							if (local30.anInt6511 < local447) {
								local447 -= local30.anInt6511;
								local391 = local30.anInt6495 == 0 ? 0 : local30.anInt6495 * ((local30.anInt6502 - local447) / local30.anInt6495);
								local222 = local391 * local190.method5679() / local30.anInt6502;
							} else {
								local222 = local190.method5679();
							}
							local391 = local190.method5687();
							local179 -= local391;
							local509 = Static257.anIntArray436[0] + arg1 - (local190.method5679() >> 1);
							local190.method5675(local509, local179);
							Static164.aClass92_7.method4472(local509, local179, local222 + local509, local391 + local179);
							local342.method5675(local509, local179);
							Static164.aClass92_7.method4459(arg1, arg0, arg2 + arg1, arg3 + arg0);
							local179 -= 2;
						}
						if (Static156.anInt3506 > local9) {
							@Pc(582) Class2_Sub2_Sub1_Sub1 local582 = (Class2_Sub2_Sub1_Sub1) local30;
							if (local582.anInt715 != -1) {
								local179 -= 25;
								Static216.aClass60Array18[local582.anInt715].method5675(arg1 + Static257.anIntArray436[0] - 12, local179);
								local179 -= 2;
							}
							if (local582.anInt734 != -1) {
								local179 -= 25;
								Static19.aClass60Array19[local582.anInt734].method5675(Static257.anIntArray436[0] + arg1 - 12, local179);
								local179 -= 2;
							}
						} else if (local13.anInt880 >= 0 && local13.anInt880 < Static19.aClass60Array19.length) {
							local190 = Static19.aClass60Array19[local13.anInt880];
							local179 -= 25;
							local190.method5675(Static257.anIntArray436[0] + arg1 - (local190.method5679() >> 1), local179);
							local179 -= 2;
						}
					}
					@Pc(628) Class121[] local628;
					@Pc(636) Class121 local636;
					@Pc(662) Class60 local662;
					if (!(local30 instanceof Class2_Sub2_Sub1_Sub1)) {
						local626 = 0;
						local628 = Static190.aClass121Array1;
						for (local287 = 0; local287 < local628.length; local287++) {
							local636 = local628[local287];
							if (local636 != null && local636.anInt3844 == 1 && Static332.anIntArray523[local9 - Static156.anInt3506] == local636.anInt3846) {
								local662 = Static220.aClass60Array10[local636.anInt3848];
								if (local626 < local662.method5687()) {
									local626 = local662.method5687();
								}
								if (Static342.anInt6706 % 20 < 10) {
									local662.method5675(Static257.anIntArray436[0] + arg1 - 12, -local662.method5687() + local179);
								}
							}
						}
						if (local626 > 0) {
						}
					} else if (local9 >= 0) {
						local626 = 0;
						local628 = Static190.aClass121Array1;
						for (local287 = 0; local287 < local628.length; local287++) {
							local636 = local628[local287];
							if (local636 != null && local636.anInt3844 == 10 && Static39.anIntArray105[local9] == local636.anInt3846) {
								local662 = Static220.aClass60Array10[local636.anInt3848];
								if (local626 < local662.method5687()) {
									local626 = local662.method5687();
								}
								local662.method5675(Static257.anIntArray436[0] + arg1 - 12, -local662.method5687() + local179);
							}
						}
						if (local626 > 0) {
						}
					}
					for (local626 = 0; local626 < 4; local626++) {
						if (Static342.anInt6706 < local30.anIntArray514[local626]) {
							local275 = local30.method5430() / 2;
							Static220.method3782(local30, local275, arg2 >> 1, arg3 >> 1);
							if (Static257.anIntArray436[0] > -1) {
								if (local626 == 1) {
									Static257.anIntArray436[1] -= 20;
								}
								if (local626 == 2) {
									Static257.anIntArray436[0] -= 15;
									Static257.anIntArray436[1] -= 10;
								}
								if (local626 == 3) {
									Static257.anIntArray436[0] += 15;
									Static257.anIntArray436[1] -= 10;
								}
								Static242.aClass60Array14[local30.anIntArray513[local626]].method5675(Static257.anIntArray436[0] + arg1 - 12, Static257.anIntArray436[1] + arg0 - 12);
								Static14.aClass78_1.method4072(Integer.toString(local30.anIntArray515[local626]), arg1 + Static257.anIntArray436[0] - 1, -1, 0, Static257.anIntArray436[1] + arg0 + 3);
							}
						}
					}
				}
			}
		}
		@Pc(941) int local941;
		for (@Pc(935) int local935 = 0; local935 < Static304.anInt6131; local935++) {
			local941 = Static13.anIntArray45[local935];
			@Pc(948) Class2_Sub2_Sub1 local948;
			if (local941 < 2048) {
				local948 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local941];
			} else {
				local948 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local941 - 2048];
			}
			local179 = Static139.anIntArray282[local935];
			@Pc(969) Class2_Sub2_Sub1 local969;
			if (local179 >= 2048) {
				local969 = Static101.aClass2_Sub2_Sub1_Sub2Array6[local179 - 2048];
			} else {
				local969 = Static253.aClass2_Sub2_Sub1_Sub1Array1[local179];
			}
			Static78.method1409(--local948.anInt6508, arg1, local948, arg2, arg3, arg0, local969);
		}
		local941 = Static242.aClass106_7.anInt3309 + Static242.aClass106_7.anInt3299 + 2;
		for (@Pc(1006) int local1006 = 0; local1006 < Static54.anInt1198; local1006++) {
			local179 = Static103.anIntArray293[local1006];
			local626 = Static103.anIntArray291[local1006];
			local275 = Static103.anIntArray290[local1006];
			@Pc(1022) boolean local1022 = true;
			while (local1022) {
				local1022 = false;
				for (local447 = 0; local447 < local1006; local447++) {
					if (Static103.anIntArray291[local447] - local941 < local626 - -2 && local626 - local941 < Static103.anIntArray291[local447] + 2 && local179 - local275 < Static103.anIntArray290[local447] + Static103.anIntArray293[local447] && Static103.anIntArray293[local447] - Static103.anIntArray290[local447] < local179 + local275 && local626 > Static103.anIntArray291[local447] - local941) {
						local1022 = true;
						local626 = Static103.anIntArray291[local447] - local941;
					}
				}
			}
			Static103.anIntArray291[local1006] = local626;
			@Pc(1128) String local1128 = Static103.aStringArray26[local1006];
			if (Static297.anInt6003 == 0) {
				local222 = 16776960;
				if (Static103.anIntArray294[local1006] < 6) {
					local222 = Static80.anIntArray172[Static103.anIntArray294[local1006]];
				}
				if (Static103.anIntArray294[local1006] == 6) {
					local222 = Static230.anInt4802 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static103.anIntArray294[local1006] == 7) {
					local222 = Static230.anInt4802 % 20 < 10 ? 255 : 65535;
				}
				if (Static103.anIntArray294[local1006] == 8) {
					local222 = Static230.anInt4802 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static103.anIntArray294[local1006] == 9) {
					local391 = 150 - Static103.anIntArray289[local1006];
					if (local391 < 50) {
						local222 = local391 * 1280 + 16711680;
					} else if (local391 < 100) {
						local222 = 16776960 - (local391 - 50) * 327680;
					} else if (local391 < 150) {
						local222 = local391 * 5 + 65280 - 500;
					}
				}
				if (Static103.anIntArray294[local1006] == 10) {
					local391 = 150 - Static103.anIntArray289[local1006];
					if (local391 < 50) {
						local222 = local391 * 5 + 16711680;
					} else if (local391 < 100) {
						local222 = 16711935 - (local391 - 50) * 327680;
					} else if (local391 < 150) {
						local222 = local391 * 327680 + 255 - (local391 - 100) * 5 - 32768000;
					}
				}
				if (Static103.anIntArray294[local1006] == 11) {
					local391 = 150 - Static103.anIntArray289[local1006];
					if (local391 < 50) {
						local222 = 16777215 - local391 * 327685;
					} else if (local391 < 100) {
						local222 = (local391 - 50) * 327685 + 65280;
					} else if (local391 < 150) {
						local222 = 16777215 - (local391 - 100) * 327680;
					}
				}
				local391 = local222 | 0xFF000000;
				if (Static103.anIntArray292[local1006] == 0) {
					Static81.aClass78_2.method4072(local1128, arg1 + local179, local391, -16777216, local626 + arg0);
				}
				if (Static103.anIntArray292[local1006] == 1) {
					Static81.aClass78_2.method4066(Static230.anInt4802, local1128, arg0 + local626, local391, arg1 + local179);
				}
				if (Static103.anIntArray292[local1006] == 2) {
					Static81.aClass78_2.method4070(arg0 + local626, local1128, local391, Static230.anInt4802, local179 + arg1);
				}
				if (Static103.anIntArray292[local1006] == 3) {
					Static81.aClass78_2.method4071(arg0 + local626, local391, local179 + arg1, local1128, 150 - Static103.anIntArray289[local1006], Static230.anInt4802);
				}
				if (Static103.anIntArray292[local1006] == 4) {
					local509 = (150 - Static103.anIntArray289[local1006]) * (Static242.aClass106_7.method2879(local1128) + 100) / 150;
					Static164.aClass92_7.method4472(local179 + arg1 - 50, arg0, arg1 + local179 + 50, arg3 + arg0);
					Static81.aClass78_2.method4050(local391, local1128, arg1 + local179 + 50 - local509, -16777216, arg0 - -local626);
					Static164.aClass92_7.method4459(arg1, arg0, arg2 + arg1, arg3 + arg0);
				}
				if (Static103.anIntArray292[local1006] == 5) {
					local509 = 150 - Static103.anIntArray289[local1006];
					@Pc(1529) int local1529 = 0;
					if (local509 < 25) {
						local1529 = local509 - 25;
					} else if (local509 > 125) {
						local1529 = local509 - 125;
					}
					@Pc(1555) int local1555 = Static242.aClass106_7.anInt3309 + Static242.aClass106_7.anInt3299;
					Static164.aClass92_7.method4472(arg1, arg0 + local626 - local1555 - 1, arg2 + arg1, arg0 + local626 + 5);
					Static81.aClass78_2.method4072(local1128, local179 + arg1, local391, -16777216, local1529 + local626 + arg0);
					Static164.aClass92_7.method4459(arg1, arg0, arg1 + arg2, arg0 - -arg3);
				}
			} else {
				Static81.aClass78_2.method4072(local1128, local179 + arg1, -256, -16777216, local626 + arg0);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)I")
	public static int method5585() {
		return Static64.anInt1349;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!lo;IZ)V")
	public static void method5587(@OriginalArg(0) Class2_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class10 local9 = arg0.method5428();
		if (arg0.anInt6547 == 0) {
			Static50.anInt1103 = 0;
			arg0.anInt6548 = 0;
			Static134.anInt3070 = -1;
			return;
		}
		if (arg0.anInt6517 != -1 && arg0.anInt6490 == 0) {
			@Pc(36) Class116 local36 = Static340.method5560(arg0.anInt6517);
			if (arg0.anInt6551 > 0 && local36.anInt3754 == 0) {
				Static50.anInt1103 = 0;
				arg0.anInt6548++;
				Static134.anInt3070 = -1;
				return;
			}
			if (arg0.anInt6551 <= 0 && local36.anInt3738 == 0) {
				Static134.anInt3070 = -1;
				Static50.anInt1103 = 0;
				arg0.anInt6548++;
				return;
			}
		}
		if (arg0.anInt6482 != -1 && Static342.anInt6706 >= arg0.anInt6521) {
			@Pc(89) Class156 local89 = Static244.method4224(arg0.anInt6482);
			if (local89.aBoolean432 && local89.anInt5127 != -1) {
				@Pc(101) Class116 local101 = Static340.method5560(local89.anInt5127);
				if (arg0.anInt6551 > 0 && local101.anInt3754 == 0) {
					Static50.anInt1103 = 0;
					Static134.anInt3070 = -1;
					arg0.anInt6548++;
					return;
				}
				if (arg0.anInt6551 <= 0 && local101.anInt3738 == 0) {
					Static50.anInt1103 = 0;
					arg0.anInt6548++;
					Static134.anInt3070 = -1;
					return;
				}
			}
		}
		@Pc(138) int local138 = arg0.anInt6465;
		@Pc(141) int local141 = arg0.anInt6466;
		@Pc(158) int local158 = arg0.anIntArray518[arg0.anInt6547 - 1] * 128 + arg0.method5425() * 64;
		@Pc(174) int local174 = arg0.anIntArray517[arg0.anInt6547 - 1] * 128 + arg0.method5425() * 64;
		if (!arg1 && (local158 - local138 > 256 || local158 - local138 < -256 || local174 - local141 > 256 || local174 - local141 < -256)) {
			Static134.anInt3070 = -1;
			arg0.anInt6465 = local158;
			arg0.anInt6466 = local174;
			Static50.anInt1103 = 0;
			return;
		}
		if (local158 > local138) {
			if (local174 > local141) {
				arg0.method5437(10240);
			} else if (local141 <= local174) {
				arg0.method5437(12288);
			} else {
				arg0.method5437(14336);
			}
		} else if (local158 >= local138) {
			if (local174 > local141) {
				arg0.method5437(8192);
			} else if (local141 > local174) {
				arg0.method5437(0);
			}
		} else if (local141 < local174) {
			arg0.method5437(6144);
		} else if (local141 <= local174) {
			arg0.method5437(4096);
		} else {
			arg0.method5437(2048);
		}
		@Pc(295) int local295 = 4;
		@Pc(297) boolean local297 = true;
		if (arg0 instanceof Class2_Sub2_Sub1_Sub2) {
			local297 = ((Class2_Sub2_Sub1_Sub2) arg0).aClass34_1.aBoolean53;
		}
		if (local297) {
			@Pc(337) int local337 = arg0.anInt6501 - arg0.aClass108_7.anInt3431;
			if (local337 != 0 && arg0.anInt6479 == -1 && arg0.anInt6514 != 0) {
				local295 = 2;
			}
			if (!arg1 && arg0.anInt6547 > 2) {
				local295 = 6;
			}
			if (!arg1 && arg0.anInt6547 > 3) {
				local295 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt6547 > 1) {
				local295 = 6;
			}
			if (!arg1 && arg0.anInt6547 > 2) {
				local295 = 8;
			}
		}
		if (arg0.anInt6548 > 0 && arg0.anInt6547 > 1) {
			arg0.anInt6548--;
			local295 = 8;
		}
		@Pc(396) byte local396 = arg0.aByteArray90[arg0.anInt6547 - 1];
		if (local396 == 2) {
			local295 <<= 0x1;
		} else if (local396 == 0) {
			local295 >>= 0x1;
		}
		Static50.anInt1103 = 0;
		if (local9.anInt221 != -1) {
			local295 <<= 0x7;
			if (arg0.anInt6547 == 1) {
				@Pc(480) int local480 = arg0.anInt6552 * arg0.anInt6552;
				@Pc(501) int local501 = (local158 >= arg0.anInt6465 ? local158 - arg0.anInt6465 : -local158 + arg0.anInt6465) << 7;
				@Pc(523) int local523 = (local174 >= arg0.anInt6466 ? local174 - arg0.anInt6466 : -local174 + arg0.anInt6466) << 7;
				@Pc(534) int local534 = local523 < local501 ? local501 : local523;
				@Pc(541) int local541 = local534 * 2 * local9.anInt221;
				if (local541 < local480) {
					arg0.anInt6552 /= 2;
				} else if (local534 < local480 / 2) {
					arg0.anInt6552 -= local9.anInt221;
					if (arg0.anInt6552 < 0) {
						arg0.anInt6552 = 0;
					}
				} else if (local295 > arg0.anInt6552) {
					arg0.anInt6552 += local9.anInt221;
					if (local295 < arg0.anInt6552) {
						arg0.anInt6552 = local295;
					}
				}
			} else if (local295 > arg0.anInt6552) {
				arg0.anInt6552 += local9.anInt221;
				if (arg0.anInt6552 > local295) {
					arg0.anInt6552 = local295;
				}
			} else if (arg0.anInt6552 > 0) {
				arg0.anInt6552 -= local9.anInt221;
				if (arg0.anInt6552 < 0) {
					arg0.anInt6552 = 0;
				}
			}
			local295 = arg0.anInt6552 >> 7;
			if (local295 < 1) {
				local295 = 1;
			}
		}
		if (local138 < local158) {
			arg0.anInt6465 += local295;
			Static50.anInt1103 |= 0x4;
			if (arg0.anInt6465 > local158) {
				arg0.anInt6465 = local158;
			}
		} else if (local158 < local138) {
			arg0.anInt6465 -= local295;
			Static50.anInt1103 |= 0x8;
			if (local158 > arg0.anInt6465) {
				arg0.anInt6465 = local158;
			}
		}
		if (local174 > local141) {
			arg0.anInt6466 += local295;
			Static50.anInt1103 |= 0x1;
			if (arg0.anInt6466 > local174) {
				arg0.anInt6466 = local174;
			}
		} else if (local174 < local141) {
			arg0.anInt6466 -= local295;
			Static50.anInt1103 |= 0x2;
			if (arg0.anInt6466 < local174) {
				arg0.anInt6466 = local174;
			}
		}
		if (local295 < 8) {
			Static134.anInt3070 = local396;
		} else {
			Static134.anInt3070 = 2;
		}
		if (local158 != arg0.anInt6465 || local174 != arg0.anInt6466) {
			return;
		}
		arg0.anInt6547--;
		if (arg0.anInt6551 > 0) {
			arg0.anInt6551--;
			return;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!lo;)V")
	public static void method5589(@OriginalArg(1) Class2_Sub2_Sub1 arg0) {
		arg0.aBoolean567 = false;
		@Pc(18) Class116 local18;
		if (arg0.anInt6540 != -1) {
			local18 = Static340.method5560(arg0.anInt6540);
			if (local18 == null || local18.anIntArray330 == null) {
				arg0.aBoolean569 = false;
				arg0.anInt6540 = -1;
			} else {
				label297: {
					arg0.anInt6504++;
					if (local18.anIntArray330.length > arg0.anInt6485 && arg0.anInt6504 > local18.anIntArray329[arg0.anInt6485]) {
						arg0.anInt6518++;
						arg0.anInt6485++;
						arg0.anInt6504 = 1;
						Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg0, local18, arg0.anInt6485, arg0.anInt6465, arg0.anInt6466);
					}
					if (arg0.anInt6485 >= local18.anIntArray330.length) {
						arg0.anInt6485 = 0;
						arg0.anInt6504 = 0;
						if (arg0.aBoolean569) {
							arg0.anInt6540 = arg0.method5428().method246();
							if (arg0.anInt6540 == -1) {
								arg0.aBoolean569 = false;
								break label297;
							}
							local18 = Static340.method5560(arg0.anInt6540);
						}
						Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg0, local18, arg0.anInt6485, arg0.anInt6465, arg0.anInt6466);
					}
					arg0.anInt6518 = arg0.anInt6485 + 1;
					if (local18.anIntArray330.length <= arg0.anInt6518) {
						arg0.anInt6518 = 0;
					}
				}
			}
		}
		@Pc(194) Class116 local194;
		if (arg0.anInt6482 != -1 && Static342.anInt6706 >= arg0.anInt6521) {
			@Pc(179) Class156 local179 = Static244.method4224(arg0.anInt6482);
			@Pc(182) int local182 = local179.anInt5127;
			if (local182 == -1) {
				arg0.anInt6482 = -1;
			} else {
				label299: {
					local194 = Static340.method5560(local182);
					if (local179.aBoolean432) {
						if (local194.anInt3754 == 3) {
							if (arg0.anInt6551 > 0 && arg0.anInt6484 <= Static342.anInt6706 && arg0.anInt6491 < Static342.anInt6706) {
								arg0.anInt6482 = -1;
								break label299;
							}
						} else if (local194.anInt3754 == 1 && arg0.anInt6551 > 0 && Static342.anInt6706 >= arg0.anInt6484 && arg0.anInt6491 < Static342.anInt6706) {
							arg0.anInt6521 = Static342.anInt6706 + 1;
							break label299;
						}
					}
					if (local194 == null || local194.anIntArray330 == null) {
						arg0.anInt6482 = -1;
					} else {
						if (arg0.anInt6492 < 0) {
							arg0.anInt6492 = 0;
							Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg0, local194, 0, arg0.anInt6465, arg0.anInt6466);
						}
						arg0.anInt6525++;
						if (arg0.anInt6492 < local194.anIntArray330.length && local194.anIntArray329[arg0.anInt6492] < arg0.anInt6525) {
							arg0.anInt6525 = 1;
							arg0.anInt6492++;
							Static291.method4975(arg0 == Static110.aClass2_Sub2_Sub1_Sub1_1, local194, arg0.anInt6492, arg0.anInt6465, arg0.anInt6466);
						}
						if (local194.anIntArray330.length <= arg0.anInt6492) {
							if (local179.aBoolean432) {
								arg0.anInt6499++;
								arg0.anInt6492 -= local194.anInt3753;
								if (local194.anInt3745 <= arg0.anInt6499) {
									arg0.anInt6482 = -1;
								} else if (arg0.anInt6492 >= 0 && local194.anIntArray330.length > arg0.anInt6492) {
									Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg0, local194, arg0.anInt6492, arg0.anInt6465, arg0.anInt6466);
								} else {
									arg0.anInt6482 = -1;
								}
							} else {
								arg0.anInt6482 = -1;
							}
						}
						arg0.anInt6512 = arg0.anInt6492 + 1;
						if (arg0.anInt6512 >= local194.anIntArray330.length) {
							if (local179.aBoolean432) {
								arg0.anInt6512 -= local194.anInt3753;
								if (arg0.anInt6499 + 1 >= local194.anInt3745) {
									arg0.anInt6512 = -1;
								} else if (arg0.anInt6512 < 0 || arg0.anInt6512 >= local194.anIntArray330.length) {
									arg0.anInt6512 = -1;
								}
							} else {
								arg0.anInt6512 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6517 != -1 && arg0.anInt6490 <= 1) {
			local18 = Static340.method5560(arg0.anInt6517);
			if (local18.anInt3754 == 3) {
				if (arg0.anInt6551 > 0 && Static342.anInt6706 >= arg0.anInt6484 && Static342.anInt6706 > arg0.anInt6491) {
					arg0.anInt6517 = -1;
				}
			} else if (local18.anInt3754 == 1 && arg0.anInt6551 > 0 && arg0.anInt6484 <= Static342.anInt6706 && Static342.anInt6706 > arg0.anInt6491) {
				arg0.anInt6490 = 2;
			}
		}
		if (arg0.anInt6517 != -1 && arg0.anInt6490 == 0) {
			local18 = Static340.method5560(arg0.anInt6517);
			if (local18 == null || local18.anIntArray330 == null) {
				arg0.anInt6517 = -1;
			} else {
				arg0.anInt6493++;
				if (arg0.anInt6487 < local18.anIntArray330.length && local18.anIntArray329[arg0.anInt6487] < arg0.anInt6493) {
					arg0.anInt6487++;
					arg0.anInt6493 = 1;
					Static291.method4975(arg0 == Static110.aClass2_Sub2_Sub1_Sub1_1, local18, arg0.anInt6487, arg0.anInt6465, arg0.anInt6466);
				}
				if (arg0.anInt6487 >= local18.anIntArray330.length) {
					arg0.anInt6487 -= local18.anInt3753;
					arg0.anInt6505++;
					if (arg0.anInt6505 >= local18.anInt3745) {
						arg0.anInt6517 = -1;
					} else if (arg0.anInt6487 >= 0 && arg0.anInt6487 < local18.anIntArray330.length) {
						Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg0, local18, arg0.anInt6487, arg0.anInt6465, arg0.anInt6466);
					} else {
						arg0.anInt6517 = -1;
					}
				}
				arg0.anInt6534 = arg0.anInt6487 + 1;
				if (local18.anIntArray330.length <= arg0.anInt6534) {
					arg0.anInt6534 -= local18.anInt3753;
					if (arg0.anInt6505 + 1 >= local18.anInt3745) {
						arg0.anInt6534 = -1;
					} else if (arg0.anInt6534 < 0 || local18.anIntArray330.length <= arg0.anInt6534) {
						arg0.anInt6534 = -1;
					}
				}
				arg0.aBoolean567 = local18.aBoolean313;
			}
		}
		if (arg0.anInt6490 > 0) {
			arg0.anInt6490--;
		}
		for (@Pc(730) int local730 = 0; local730 < arg0.aClass186Array3.length; local730++) {
			@Pc(737) Class186 local737 = arg0.aClass186Array3[local730];
			if (local737 != null) {
				if (local737.anInt5816 > 0) {
					local737.anInt5816--;
				} else {
					local194 = Static340.method5560(local737.anInt5820);
					if (local194 == null || local194.anIntArray330 == null) {
						arg0.aClass186Array3[local730] = null;
					} else {
						local737.anInt5825++;
						if (local194.anIntArray330.length > local737.anInt5819 && local737.anInt5825 > local194.anIntArray329[local737.anInt5819]) {
							local737.anInt5825 = 1;
							local737.anInt5819++;
							Static291.method4975(Static110.aClass2_Sub2_Sub1_Sub1_1 == arg0, local194, local737.anInt5819, arg0.anInt6465, arg0.anInt6466);
						}
						if (local194.anIntArray330.length <= local737.anInt5819) {
							local737.anInt5815++;
							local737.anInt5819 -= local194.anInt3753;
							if (local737.anInt5815 >= local194.anInt3745) {
								arg0.aClass186Array3[local730] = null;
							} else if (local737.anInt5819 >= 0 && local737.anInt5819 < local194.anIntArray330.length) {
								Static291.method4975(arg0 == Static110.aClass2_Sub2_Sub1_Sub1_1, local194, local737.anInt5819, arg0.anInt6465, arg0.anInt6466);
							} else {
								arg0.aClass186Array3[local730] = null;
							}
						}
						local737.anInt5818 = local737.anInt5819 + 1;
						if (local194.anIntArray330.length <= local737.anInt5818) {
							local737.anInt5818 -= local194.anInt3753;
							if (local737.anInt5815 + 1 >= local194.anInt3745) {
								local737.anInt5818 = -1;
							} else if (local737.anInt5818 < 0 || local194.anIntArray330.length <= local737.anInt5818) {
								local737.anInt5818 = -1;
							}
						}
					}
				}
			}
		}
	}
}
