import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZLclient!lh;)V")
	public static void method4026(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class16_Sub1_Sub5_Sub1 arg1) {
		if (Static407.anInt6710 >= 400) {
			return;
		}
		if (Static1.aClass16_Sub1_Sub5_Sub1_1 != arg1) {
			@Pc(85) String local85;
			@Pc(139) int local139;
			if (arg1.anInt4336 == 0) {
				@Pc(89) boolean local89 = true;
				if (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4330 != -1 && arg1.anInt4330 != -1) {
					@Pc(114) int local114 = Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4345 > arg1.anInt4345 ? Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4345 : arg1.anInt4345;
					@Pc(129) int local129 = arg1.anInt4330 > Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4330 ? Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4330 : arg1.anInt4330;
					local139 = local114 * 10 / 100 + local129 + 5;
					@Pc(146) int local146 = Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4345 - arg1.anInt4345;
					if (local146 < 0) {
						local146 = -local146;
					}
					if (local146 > local139) {
						local89 = false;
					}
				}
				@Pc(176) String local176 = Static317.aClass121_2 == Static393.aClass121_3 ? Static4.aClass83_121.method2267(Static178.anInt3423) : Static320.aClass83_118.method2267(Static178.anInt3423);
				if (arg1.anInt4345 >= arg1.anInt4332) {
					local85 = arg1.method3428() + (local89 ? Static272.method3907(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4345, arg1.anInt4345) : "<col=ffffff>") + " (" + local176 + arg1.anInt4345 + ")";
				} else {
					local85 = arg1.method3428() + (local89 ? Static272.method3907(Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4345, arg1.anInt4345) : "<col=ffffff>") + " (" + local176 + arg1.anInt4345 + "+" + (arg1.anInt4332 - arg1.anInt4345) + ")";
				}
			} else {
				local85 = arg1.method3428() + " (" + Static126.aClass83_49.method2267(Static178.anInt3423) + arg1.anInt4336 + ")";
			}
			if (Static341.aBoolean599) {
				if (!arg0 && (Static434.anInt7378 & 0x8) != 0) {
					Static380.method5017(46, false, (long) arg1.anInt6037, 0, Static49.aString28 + " -> <col=ffffff>" + local85, true, Static388.aString62, 0, -1, Static273.anInt5120);
				}
			} else if (arg0) {
				Static380.method5017(-1, true, 0L, 0, "", false, "<col=cccccc>" + local85, 0, 0, -1);
			} else {
				for (@Pc(282) int local282 = 7; local282 >= 0; local282--) {
					if (Static349.aStringArray29[local282] != null) {
						@Pc(290) short local290 = 0;
						if (Static393.aClass121_3 == Static196.aClass121_1 && Static349.aStringArray29[local282].equalsIgnoreCase(Static81.aClass83_33.method2267(Static178.anInt3423))) {
							if (arg1.anInt4345 > Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4345) {
								local290 = 2000;
							}
							if (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4328 != 0 && arg1.anInt4328 != 0) {
								if (Static1.aClass16_Sub1_Sub5_Sub1_1.anInt4328 == arg1.anInt4328) {
									local290 = 2000;
								} else {
									local290 = 0;
								}
							}
						} else if (Static217.aBooleanArray13[local282]) {
							local290 = 2000;
						}
						@Pc(351) short local351 = (short) (local290 + Static385.aShortArray232[local282]);
						local139 = Static272.anIntArray333[local282] == -1 ? Static207.anInt5453 : Static272.anIntArray333[local282];
						Static380.method5017(local351, false, (long) arg1.anInt6037, 0, "<col=ffffff>" + local85, true, Static349.aStringArray29[local282], 0, -1, local139);
					}
				}
			}
			if (!arg0) {
				for (@Pc(440) Class4_Sub39 local440 = (Class4_Sub39) Static206.aClass183_28.method4140(); local440 != null; local440 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
					if (local440.anInt5699 == 44) {
						local440.aString56 = "<col=ffffff>" + local85;
						return;
					}
				}
			}
		} else if (Static341.aBoolean599 && (Static434.anInt7378 & 0x10) != 0) {
			Static380.method5017(8, false, 0L, 0, Static49.aString28 + " -> <col=ffffff>" + Static223.aClass83_91.method2267(Static178.anInt3423), true, Static388.aString62, 0, -1, Static273.anInt5120);
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIII)V")
	public static void method4027(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static33.anInt606;
		Static225.anInt4371 = 0;
		@Pc(11) int[] local11 = Static99.anIntArray157;
		@Pc(187) int local187;
		@Pc(216) int local216;
		@Pc(263) int local263;
		@Pc(338) int local338;
		@Pc(427) int local427;
		@Pc(867) int local867;
		@Pc(560) int local560;
		for (@Pc(13) int local13 = 0; local13 < Static12.anInt163 + local7; local13++) {
			@Pc(17) Class264 local17 = null;
			@Pc(30) Class16_Sub1_Sub5 local30;
			if (local7 > local13) {
				local30 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local11[local13]];
			} else {
				local30 = Static143.aClass16_Sub1_Sub5_Sub2Array1[Static342.anIntArray412[local13 - local7]];
				local17 = ((Class16_Sub1_Sub5_Sub2) local30).aClass264_1;
				if (local17.anIntArray544 != null) {
					local17 = local17.method5574(Static257.aClass114_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt6025 >= 0 && (local30.anInt6061 == Static361.anInt6264 || local30.aByte82 == Static1.aClass16_Sub1_Sub5_Sub1_1.aByte82)) {
				Static369.method4939(arg0 >> 1, arg3 >> 1, local30.method4755(), local30);
				if (Static449.anIntArray557[0] >= 0) {
					if (local30.aString60 != null && (local13 >= local7 || Static14.anInt189 == 0 || Static14.anInt189 == 3 || Static14.anInt189 == 1 && Static147.method2458(((Class16_Sub1_Sub5_Sub1) local30).aString44)) && Static403.anInt6670 > Static225.anInt4371) {
						Static403.anIntArray508[Static225.anInt4371] = Static118.aClass89_5.method2340(local30.aString60) / 2;
						Static403.anIntArray511[Static225.anInt4371] = Static449.anIntArray557[0];
						Static403.anIntArray509[Static225.anInt4371] = Static449.anIntArray557[1];
						Static403.anIntArray507[Static225.anInt4371] = local30.anInt6084;
						Static403.anIntArray510[Static225.anInt4371] = local30.anInt6064;
						Static403.anIntArray512[Static225.anInt4371] = local30.anInt6077;
						Static403.aStringArray36[Static225.anInt4371] = local30.aString60;
						Static225.anInt4371++;
					}
					local187 = Static449.anIntArray557[1] + arg1;
					@Pc(248) Class57[] local248;
					@Pc(255) Class18[] local255;
					@Pc(311) Class57 local311;
					if (local30.aBoolean561 || local30.anInt6072 <= Static24.anInt5323) {
						local187 -= Math.max(Static118.aClass89_5.anInt2783, Static151.aClass57Array8[0].ma());
					} else {
						@Pc(202) byte local202 = 1;
						if (local7 > local13) {
							@Pc(211) Class16_Sub1_Sub5_Sub1 local211 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local11[local13]];
							local216 = local30.method4757().anInt4692;
							if (local211.aBoolean400) {
								local202 = 2;
							}
						} else {
							local216 = local17.anInt7204;
							if (local216 == -1) {
								local216 = local30.method4757().anInt4692;
							}
						}
						@Pc(238) Class57[] local238 = Static151.aClass57Array8;
						if (local216 != -1) {
							local248 = (Class57[]) Static261.aClass68_27.method1787((long) local216);
							if (local248 == null) {
								local255 = Static456.method327(Static293.aClass76_60, local216);
								if (local255 != null) {
									local248 = new Class57[local255.length];
									for (local263 = 0; local263 < local255.length; local263++) {
										local248[local263] = Static122.aClass19_16.method4308(local255[local263]);
									}
									Static261.aClass68_27.method1779((long) local216, local248);
								}
							}
							if (local248 != null && local248.length >= 2) {
								local238 = local248;
							}
						}
						if (local202 >= local238.length) {
							local202 = 1;
						}
						@Pc(307) Class57 local307 = local238[0];
						local311 = local238[local202];
						local187 -= Math.max(Static118.aClass89_5.anInt2783, local307.ma());
						local263 = Static449.anIntArray557[0] + arg2 - (local307.la() >> 1);
						local338 = local307.la() * local30.anInt6026 / 255;
						if (local30.anInt6026 > 0 && local338 < 2) {
							local338 = 2;
						}
						local307.method5534(local263, local187);
						Static122.aClass19_16.fa(local263, local187, local263 + local338, local307.ma() + local187);
						local311.method5534(local263, local187);
						Static122.aClass19_16.OA(arg2, arg1, arg0 + arg2, arg1 + arg3);
					}
					local187 -= 2;
					if (!local30.aBoolean561) {
						@Pc(408) Class57 local408;
						if (Static24.anInt5323 < local30.anInt6035) {
							local408 = Static410.aClass57Array17[local30.aBoolean559 ? 2 : 0];
							@Pc(417) Class57 local417 = Static410.aClass57Array17[local30.aBoolean559 ? 3 : 1];
							if (local30 instanceof Class16_Sub1_Sub5_Sub2) {
								local427 = local17.anInt7218;
								if (local427 == -1) {
									local427 = local30.method4757().anInt4673;
								}
							} else {
								local427 = local30.method4757().anInt4673;
							}
							if (local427 != -1) {
								local248 = (Class57[]) Static200.aClass68_22.method1787((long) local427);
								if (local248 == null) {
									local255 = Static456.method327(Static293.aClass76_60, local427);
									if (local255 != null) {
										local248 = new Class57[local255.length];
										for (local263 = 0; local263 < local255.length; local263++) {
											local248[local263] = Static122.aClass19_16.method4308(local255[local263]);
										}
										Static200.aClass68_22.method1779((long) local427, local248);
									}
								}
								if (local248 != null && local248.length == 4) {
									local408 = local248[local30.aBoolean559 ? 2 : 0];
									local417 = local248[local30.aBoolean559 ? 3 : 1];
								}
							}
							@Pc(526) int local526 = local30.anInt6035 - Static24.anInt5323;
							if (local30.anInt6051 < local526) {
								local526 -= local30.anInt6051;
								local263 = local30.anInt6054 == 0 ? 0 : local30.anInt6054 * ((local30.anInt6041 - local526) / local30.anInt6054);
								local560 = local408.la() * local263 / local30.anInt6041;
							} else {
								local560 = local408.la();
							}
							local263 = local408.ma();
							local187 -= local263;
							local338 = Static449.anIntArray557[0] + arg2 - (local408.la() >> 1);
							local408.method5534(local338, local187);
							Static122.aClass19_16.fa(local338, local187, local338 + local560, local263 + local187);
							local417.method5534(local338, local187);
							local187 -= 2;
							Static122.aClass19_16.OA(arg2, arg1, arg2 + arg0, arg1 - -arg3);
						}
						if (local13 < local7) {
							@Pc(620) Class16_Sub1_Sub5_Sub1 local620 = (Class16_Sub1_Sub5_Sub1) local30;
							if (local620.anInt4339 != -1) {
								local187 -= 25;
								Static185.aClass57Array9[local620.anInt4339].method5534(Static449.anIntArray557[0] + arg2 - 12, local187);
								local187 -= 2;
							}
							if (local620.anInt4346 != -1) {
								local187 -= 25;
								Static107.aClass57Array6[local620.anInt4346].method5534(arg2 + Static449.anIntArray557[0] - 12, local187);
								local187 -= 2;
							}
						} else if (local17.anInt7205 >= 0 && local17.anInt7205 < Static107.aClass57Array6.length) {
							local408 = Static107.aClass57Array6[local17.anInt7205];
							local187 -= 25;
							local408.method5534(Static449.anIntArray557[0] + arg2 - (local408.la() >> 1), local187);
							local187 -= 2;
						}
					}
					@Pc(697) Class38[] local697;
					@Pc(705) Class38 local705;
					if (!(local30 instanceof Class16_Sub1_Sub5_Sub1)) {
						local216 = 0;
						local697 = Static306.aClass38Array1;
						for (local427 = 0; local427 < local697.length; local427++) {
							local705 = local697[local427];
							if (local705 != null && local705.anInt891 == 1 && Static342.anIntArray412[local13 - local7] == local705.anInt885) {
								local311 = Static59.aClass57Array3[local705.anInt886];
								if (local311.ma() > local216) {
									local216 = local311.ma();
								}
								if (Static24.anInt5323 % 20 < 10) {
									local311.method5534(arg2 + Static449.anIntArray557[0] - 12, local187 + -local311.ma());
								}
							}
						}
						if (local216 > 0) {
						}
					} else if (local13 >= 0) {
						local216 = 0;
						local697 = Static306.aClass38Array1;
						for (local427 = 0; local427 < local697.length; local427++) {
							local705 = local697[local427];
							if (local705 != null && local705.anInt891 == 10 && local11[local13] == local705.anInt885) {
								local311 = Static59.aClass57Array3[local705.anInt886];
								if (local216 < local311.ma()) {
									local216 = local311.ma();
								}
								local311.method5534(Static449.anIntArray557[0] + arg2 - 12, local187 - local311.ma());
							}
						}
						if (local216 > 0) {
						}
					}
					for (local216 = 0; local216 < 4; local216++) {
						if (Static24.anInt5323 < local30.anIntArray424[local216]) {
							local867 = local30.method4755() / 2;
							Static369.method4939(arg0 >> 1, arg3 >> 1, local867, local30);
							if (Static449.anIntArray557[0] > -1) {
								if (local216 == 1) {
									Static449.anIntArray557[1] -= 20;
								}
								if (local216 == 2) {
									Static449.anIntArray557[1] -= 10;
									Static449.anIntArray557[0] -= 15;
								}
								if (local216 == 3) {
									Static449.anIntArray557[1] -= 10;
									Static449.anIntArray557[0] += 15;
								}
								Static349.aClass57Array14[local30.anIntArray425[local216]].method5534(arg2 + Static449.anIntArray557[0] - 12, Static449.anIntArray557[1] + -12 + arg1);
								Static43.aClass46_12.method5056(arg2 + Static449.anIntArray557[0] - 1, -1, arg1 + 3 - -Static449.anIntArray557[1], 0, Integer.toString(local30.anIntArray422[local216]));
							}
						}
					}
				}
			}
		}
		@Pc(1004) int local1004;
		for (@Pc(998) int local998 = 0; local998 < Static304.anInt5369; local998++) {
			local1004 = Static225.anIntArray290[local998];
			@Pc(1011) Class16_Sub1_Sub5 local1011;
			if (local1004 < 2048) {
				local1011 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local1004];
			} else {
				local1011 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local1004 - 2048];
			}
			local216 = Static414.anIntArray525[local998];
			@Pc(1034) Class16_Sub1_Sub5 local1034;
			if (local216 >= 2048) {
				local1034 = Static143.aClass16_Sub1_Sub5_Sub2Array1[local216 - 2048];
			} else {
				local1034 = Static267.aClass16_Sub1_Sub5_Sub1Array1[local216];
			}
			method4030(arg1, arg2, local1034, local1011, --local1011.anInt6071, arg0, arg3);
		}
		local1004 = Static118.aClass89_5.anInt2778 + Static118.aClass89_5.anInt2783 + 2;
		for (local187 = 0; local187 < Static225.anInt4371; local187++) {
			local216 = Static403.anIntArray511[local187];
			local867 = Static403.anIntArray509[local187];
			local427 = Static403.anIntArray508[local187];
			@Pc(1087) boolean local1087 = true;
			while (local1087) {
				local1087 = false;
				for (local560 = 0; local560 < local187; local560++) {
					if (Static403.anIntArray509[local560] - local1004 < local867 + 2 && Static403.anIntArray509[local560] + 2 > local867 - local1004 && Static403.anIntArray508[local560] + Static403.anIntArray511[local560] > local216 - local427 && Static403.anIntArray511[local560] - Static403.anIntArray508[local560] < local427 + local216 && local867 > Static403.anIntArray509[local560] - local1004) {
						local867 = Static403.anIntArray509[local560] - local1004;
						local1087 = true;
					}
				}
			}
			Static403.anIntArray509[local187] = local867;
			@Pc(1184) String local1184 = Static403.aStringArray36[local187];
			if (Static189.anInt3572 == 0) {
				local263 = 16776960;
				if (Static403.anIntArray507[local187] < 6) {
					local263 = Static223.anIntArray283[Static403.anIntArray507[local187]];
				}
				if (Static403.anIntArray507[local187] == 6) {
					local263 = Static361.anInt6264 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static403.anIntArray507[local187] == 7) {
					local263 = Static361.anInt6264 % 20 >= 10 ? 65535 : 255;
				}
				if (Static403.anIntArray507[local187] == 8) {
					local263 = Static361.anInt6264 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static403.anIntArray507[local187] == 9) {
					local338 = 150 - Static403.anIntArray512[local187];
					if (local338 < 50) {
						local263 = local338 * 1280 + 16711680;
					} else if (local338 < 100) {
						local263 = 16776960 - (local338 - 50) * 327680;
					} else if (local338 < 150) {
						local263 = (local338 - 100) * 5 + 65280;
					}
				}
				if (Static403.anIntArray507[local187] == 10) {
					local338 = 150 - Static403.anIntArray512[local187];
					if (local338 < 50) {
						local263 = local338 * 5 + 16711680;
					} else if (local338 < 100) {
						local263 = 16711935 - (local338 - 50) * 327680;
					} else if (local338 < 150) {
						local263 = (local338 - 100) * 327680 + 255 + 500 - local338 * 5;
					}
				}
				if (Static403.anIntArray507[local187] == 11) {
					local338 = 150 - Static403.anIntArray512[local187];
					if (local338 < 50) {
						local263 = 16777215 - local338 * 327685;
					} else if (local338 < 100) {
						local263 = local338 * 327685 + 65280 - 16384250;
					} else if (local338 < 150) {
						local263 = 32768000 + 16777215 - local338 * 327680;
					}
				}
				local338 = local263 | 0xFF000000;
				if (Static403.anIntArray510[local187] == 0) {
					Static331.aClass46_10.method5056(arg2 + local216, local338, local867 + arg1, -16777216, local1184);
				}
				if (Static403.anIntArray510[local187] == 1) {
					Static331.aClass46_10.method5050(local338, local1184, local867 + arg1, local216 + arg2, Static361.anInt6264);
				}
				if (Static403.anIntArray510[local187] == 2) {
					Static331.aClass46_10.method5046(arg1 + local867, local216 + arg2, local1184, Static361.anInt6264, local338);
				}
				if (Static403.anIntArray510[local187] == 3) {
					Static331.aClass46_10.method5064(local338, arg1 + local867, local1184, arg2 + local216, Static361.anInt6264, 150 - Static403.anIntArray512[local187]);
				}
				@Pc(1537) int local1537;
				if (Static403.anIntArray510[local187] == 4) {
					local1537 = (150 - Static403.anIntArray512[local187]) * (Static118.aClass89_5.method2340(local1184) + 100) / 150;
					Static122.aClass19_16.fa(arg2 + local216 - 50, arg1, arg2 + local216 + 50, arg1 - -arg3);
					Static331.aClass46_10.method5058(-16777216, local338, local1184, arg1 + local867, arg2 + 50 + local216 - local1537);
					Static122.aClass19_16.OA(arg2, arg1, arg0 + arg2, arg3 + arg1);
				}
				if (Static403.anIntArray510[local187] == 5) {
					local1537 = 150 - Static403.anIntArray512[local187];
					@Pc(1595) int local1595 = 0;
					if (local1537 < 25) {
						local1595 = local1537 - 25;
					} else if (local1537 > 125) {
						local1595 = local1537 - 125;
					}
					@Pc(1621) int local1621 = Static118.aClass89_5.anInt2783 + Static118.aClass89_5.anInt2778;
					Static122.aClass19_16.fa(arg2, local867 + arg1 - local1621 - 1, arg2 - -arg0, local867 + arg1 + 5);
					Static331.aClass46_10.method5056(local216 + arg2, local338, local867 + arg1 + local1595, -16777216, local1184);
					Static122.aClass19_16.OA(arg2, arg1, arg0 + arg2, arg3 + arg1);
				}
			} else {
				Static331.aClass46_10.method5056(arg2 + local216, -256, local867 + arg1, -16777216, local1184);
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZIIILclient!r;Lclient!r;IIII)V")
	private static void method4030(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class16_Sub1_Sub5 arg2, @OriginalArg(5) Class16_Sub1_Sub5 arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		@Pc(7) int local7 = arg2.method4756();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class57 local20 = (Class57) Static386.aClass68_23.method1787((long) local7);
		if (local20 == null) {
			@Pc(27) Class18[] local27 = Static456.method327(Static293.aClass76_60, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static122.aClass19_16.method4308(local27[0]);
			Static386.aClass68_23.method1779((long) local7, local20);
		}
		Static378.method3226(arg3.anInt6893, arg3.anInt6892, arg3.method4751() * 64, arg5 >> 1, 0, arg3.aByte82, arg6 >> 1);
		@Pc(73) int local73 = Static449.anIntArray557[0] + arg1 - 18;
		@Pc(81) int local81 = local73 + arg4 / 4 * 18;
		@Pc(91) int local91 = Static449.anIntArray557[1] + arg0 - 16 - 54;
		@Pc(99) int local99 = local91 + arg4 % 4 * 18;
		local20.method5534(local81, local99);
		if (arg3 == arg2) {
			Static122.aClass19_16.method4295(local81 - 1, -256, 18, 18, local99 - 1);
		}
		@Pc(121) Class3_Sub4 local121 = Static411.method5273();
		local121.anInt4019 = local81;
		local121.anInt4023 = local99;
		local121.anInt4022 = local81 + 16;
		local121.aClass16_Sub1_Sub5_1 = arg2;
		local121.anInt4021 = local99 + 16;
		Static101.aClass84_5.method2305(local121);
	}
}
