import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static518 {

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
	public static int anInt9446 = 0;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "([II[[[BII[IIIZII[I[IB[IIZI)V")
	public static void method7858(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[][][] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) byte arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14, @OriginalArg(17) int arg15) {
		if (Static66.anInt10075 == -1) {
			return;
		}
		@Pc(12) int[] local12 = Static214.aClass20_7.Y();
		@Pc(16) int local16 = local12[0];
		@Pc(20) int local20 = local12[1];
		@Pc(24) int local24 = local12[2];
		@Pc(28) int local28 = local12[3];
		@Pc(30) int local30 = local24;
		@Pc(32) int local32 = local28;
		if (Static66.anInt10075 == 1) {
			local30 = (int) ((double) local24 * (double) Static353.anInt7031 / (double) Static506.anInt9325);
			local32 = (int) ((double) Static353.anInt7031 * (double) local28 / (double) Static506.anInt9325);
		}
		if (!Static240.aBoolean380) {
			if (Static66.anInt10075 == 1) {
				Static242.method4503();
			}
			@Pc(67) int local67 = arg5 - Static256.anInt5492;
			@Pc(72) int local72 = arg8 - Static226.anInt4994;
			@Pc(77) int local77 = arg6 - Static322.anInt6569;
			@Pc(99) int local99 = (int) ((Static539.aDouble20 * (double) local67 + (double) local72 * Static78.aDouble1 + (double) local77 * Static136.aDouble6) * (double) local30 / (double) arg15);
			@Pc(121) int local121 = (int) (((double) local77 * Static332.aDouble16 + (double) local67 * Static361.aDouble18 + (double) local72 * Static619.aDouble29) * (double) local32 / (double) arg15);
			@Pc(136) double local136 = (double) local77 * Static240.aDouble9 + Static245.aDouble10 * (double) local72 + (double) local67 * Static271.aDouble30;
			@Pc(142) int local142 = local99 + Static495.anInt9127 - Static94.anInt9085;
			@Pc(149) int local149 = Static83.anInt2550 + local121 - Static138.anInt3381;
			@Pc(153) int local153 = Static487.anInt9598 + local142;
			@Pc(157) int local157 = Static353.anInt7031 + local149;
			if (local142 >= 0 && local149 >= 0 && local153 <= Static37.anInt816 && Static506.anInt9325 >= local157 || Static66.anInt10075 == 2) {
				Static114.anInt3048 = local142;
				Static272.anInt5779 = local149;
				if (Static66.anInt10075 == 2) {
					Static329.aDouble15 = -local136;
				}
			} else if (local153 > 0 && local157 > 0 && local142 < Static37.anInt816 && Static506.anInt9325 > local149) {
				@Pc(206) int local206 = local142 - Static495.anInt9127;
				@Pc(210) int local210 = local149 - Static83.anInt2550;
				@Pc(212) int local212 = 0;
				@Pc(214) int local214 = 0;
				@Pc(216) int local216 = 0;
				@Pc(218) int local218 = 0;
				@Pc(220) double local220 = 0.0D;
				if (Static66.anInt10075 == 0) {
					local220 = local136 + Static329.aDouble15;
					local212 = local206;
					local214 = local210;
				} else if (Static66.anInt10075 == 1) {
					local216 = local206 / Static267.anInt5684;
					local218 = local210 / Static11.anInt6559;
					local212 = local216 * Static267.anInt5684;
					local214 = local218 * Static11.anInt6559;
					local220 = (local136 + Static329.aDouble15) * (double) (local210 * local214 + local212 * local206) / (double) (local210 * local210 + local206 * local206);
				}
				local220 = -local220;
				@Pc(283) int local283 = 0;
				@Pc(285) int local285 = 0;
				@Pc(287) int local287 = 0;
				@Pc(289) int local289 = 0;
				@Pc(291) int local291 = 0;
				@Pc(298) int local298;
				@Pc(303) int local303;
				@Pc(317) int local317;
				@Pc(315) int local315;
				if (local212 >= 0) {
					local298 = 0;
					local303 = Static37.anInt816 - local212;
					if (Static66.anInt10075 == 1) {
						local291 = local216;
						local287 = Static228.anInt5033 - local216;
					}
					local315 = local212;
					local317 = local303;
				} else {
					local303 = Static37.anInt816 + local212;
					local317 = 0;
					local298 = -local212;
					local315 = local298;
					if (Static66.anInt10075 == 1) {
						local291 = -local216;
						local287 = 0;
					}
				}
				@Pc(340) int local340 = 0;
				@Pc(352) int local352;
				@Pc(350) int local350;
				@Pc(354) int local354;
				@Pc(356) int local356;
				@Pc(358) int local358;
				if (local214 >= 0) {
					local350 = Static506.anInt9325 - local214;
					local352 = 0;
					local354 = local350;
					local356 = local214;
					local358 = 0;
					if (Static66.anInt10075 == 1) {
						local289 = 0;
						local285 = local218;
						local283 = Static548.anInt9814 - local218;
						local340 = local283;
					}
				} else {
					local352 = -local214;
					local354 = 0;
					local350 = Static506.anInt9325 + local214;
					local356 = local352;
					local358 = local352;
					if (Static66.anInt10075 == 1) {
						local285 = -local218;
						local283 = 0;
						local340 = local218 + Static548.anInt9814;
						local289 = local285;
					}
				}
				@Pc(410) Class325 local410 = Static423.aClass182_3.aClass325_4;
				@Pc(424) int local424;
				for (@Pc(415) Class3_Sub4 local415 = (Class3_Sub4) local410.method8016(); local415 != null; local415 = (Class3_Sub4) local410.method8022()) {
					@Pc(420) Class3_Sub3[] local420 = local415.aClass3_Sub3Array1;
					@Pc(422) boolean local422 = true;
					for (local424 = 0; local424 < local420.length; local424++) {
						@Pc(430) Class3_Sub3 local430 = local420[local424];
						@Pc(433) int local433 = local430.anInt5420;
						@Pc(436) int local436 = local430.anInt5417;
						@Pc(439) int local439 = local430.anInt5421;
						@Pc(442) int local442 = local430.anInt5419;
						@Pc(445) int local445 = local430.anInt5418;
						@Pc(452) int local452;
						local430.anInt5419 = local452 = local442 - local214;
						@Pc(460) int local460;
						local430.anInt5420 = local460 = local433 - local212;
						@Pc(468) int local468;
						local430.anInt5421 = local468 = local439 - local212;
						@Pc(476) int local476;
						local430.anInt5417 = local476 = local436 - local214;
						if (local422) {
							@Pc(489) int local489 = (local468 > local460 ? local460 : local468) - local445;
							if (Static37.anInt816 >= local489) {
								@Pc(510) int local510 = (local476 < local452 ? local476 : local452) - local445;
								if (Static506.anInt9325 >= local510) {
									@Pc(527) int local527 = (local460 < local468 ? local468 : local460) + local445;
									if (local527 >= 0) {
										@Pc(541) int local541 = (local452 > local476 ? local452 : local476) + local445;
										if (local541 >= 0) {
											local422 = false;
										}
									}
								}
							}
						}
					}
					if (local422) {
						local415.method8909();
						Static211.method4175(local415);
					}
				}
				if (Static66.anInt10075 == 0) {
					Static214.aClass20_7.method7290(Static208.anInterface14_1);
				}
				Static214.aClass20_7.F(-local212, -local214);
				Static214.aClass20_7.b(local298, local352, local303, local350, local220);
				Static475.method8451(Static329.aDouble15 + local220);
				Static318.aDouble13 = local220 + Static329.aDouble15;
				if (Static66.anInt10075 == 1) {
					Static160.anInt3991 = local20 - Static138.anInt3381 - local214;
					Static507.anInt9337 = local32;
					Static368.anInt7332 = local16 - Static94.anInt9085 - local212;
					Static190.anInt4466 = local30;
					Static214.aClass20_7.DA(Static368.anInt7332, Static160.anInt3991, Static190.anInt4466, Static507.anInt9337);
				} else {
					Static190.anInt4466 = local30;
					Static160.anInt3991 = local20 + Static83.anInt2550 - Static138.anInt3381 - local214;
					Static368.anInt7332 = local16 + Static495.anInt9127 - Static94.anInt9085 - local212;
					Static507.anInt9337 = local32;
					Static214.aClass20_7.DA(Static368.anInt7332, Static160.anInt3991, Static190.anInt4466, Static507.anInt9337);
				}
				Static421.method6793(Static423.aClass182_3);
				if (local356 > 0) {
					Static214.aClass20_7.KA(0, local354, Static37.anInt816, local356 + local354);
					Static214.aClass20_7.ya();
					Static214.aClass20_7.GA(Static306.anInt6356);
					Static187.method3896(arg14, arg5, arg8, arg6, arg1, arg4, arg10, arg11, arg13, arg0, arg3, arg12, arg9, arg2, arg7, arg15, 1, false);
				}
				if (local315 > 0) {
					Static214.aClass20_7.KA(local317, local358, local317 + local315, local358 + local350);
					Static214.aClass20_7.ya();
					Static214.aClass20_7.GA(Static306.anInt6356);
					Static187.method3896(arg14, arg5, arg8, arg6, arg1, arg4, arg10, arg11, arg13, arg0, arg3, arg12, arg9, arg2, arg7, arg15, 1, false);
				}
				Static214.aClass20_7.la();
				Static583.method8647();
				if (Static66.anInt10075 == 0) {
					Static214.aClass20_7.method7275();
				}
				Static138.anInt3381 += local214;
				Static94.anInt9085 += local212;
				Static329.aDouble15 += local220;
				Static272.anInt5779 = local121 + Static83.anInt2550 - Static138.anInt3381;
				Static114.anInt3048 = Static495.anInt9127 + local99 - Static94.anInt9085;
				if (Static66.anInt10075 == 1) {
					Static90.anInt2649 += local216;
					Static605.anInt10972 += local218;
					for (@Pc(787) int local787 = 0; local787 < Static548.anInt9814; local787++) {
						@Pc(799) int local799 = Static126.method2964(local787 + Static605.anInt10972, Static548.anInt9814) * Static228.anInt5033;
						for (local424 = 0; local424 < Static228.anInt5033; local424++) {
							@Pc(812) int local812 = Static126.method2964(local424 + Static90.anInt2649, Static228.anInt5033) + local799;
							@Pc(854) boolean local854 = local787 >= local283 && local285 + local283 > local787 || local787 >= local289 && local289 + local340 > local787 && local424 >= local287 && local424 < local287 + local291;
							Static326.anInterface14Array1[local812].method8987(Static267.anInt5684 * local424, local787 * Static11.anInt6559, Static267.anInt5684, Static11.anInt6559, local854);
						}
					}
				}
			} else {
				Static240.aBoolean380 = true;
			}
		}
		if (Static240.aBoolean380) {
			Static322.anInt6569 = arg6;
			Static226.anInt4994 = arg8;
			Static272.anInt5779 = Static83.anInt2550;
			Static94.anInt9085 = 0;
			Static114.anInt3048 = Static495.anInt9127;
			Static256.anInt5492 = arg5;
			Static138.anInt3381 = 0;
			Static329.aDouble15 = 0.0D;
			if (Static66.anInt10075 == 0) {
				Static214.aClass20_7.method7290(Static208.anInterface14_1);
			}
			Static214.aClass20_7.la();
			Static214.aClass20_7.ya();
			Static214.aClass20_7.GA(Static306.anInt6356);
			Static251.aClass30_9.method4658(Static256.anInt5492, Static226.anInt4994, Static322.anInt6569, Static293.anInt6193, Static619.anInt10830, Static224.anInt4987);
			Static214.aClass20_7.method7241(Static251.aClass30_9);
			if (Static66.anInt10075 == 1) {
				Static160.anInt3991 = local20;
				Static368.anInt7332 = local16;
				Static507.anInt9337 = local32;
				Static190.anInt4466 = local30;
				Static214.aClass20_7.DA(Static368.anInt7332, Static160.anInt3991, Static190.anInt4466, Static507.anInt9337);
			} else {
				Static368.anInt7332 = local16 + Static495.anInt9127;
				Static160.anInt3991 = Static83.anInt2550 + local20;
				Static190.anInt4466 = local30;
				Static507.anInt9337 = local32;
				Static214.aClass20_7.DA(Static368.anInt7332, Static160.anInt3991, Static190.anInt4466, Static507.anInt9337);
			}
			Static318.aDouble13 = 0.0D;
			Static423.aClass182_3.method5402();
			Static421.method6793(Static423.aClass182_3);
			Static187.method3896(arg14, arg5, arg8, arg6, arg1, arg4, arg10, arg11, arg13, arg0, arg3, arg12, arg9, arg2, arg7, arg15, 1, false);
			Static583.method8647();
			Static240.aBoolean380 = false;
			if (Static66.anInt10075 == 0) {
				Static214.aClass20_7.method7275();
			}
			if (Static66.anInt10075 == 1) {
				Static482.method7519();
			}
		}
		if (Static66.anInt10075 == 0) {
			Static208.anInterface14_1.method8986(Static114.anInt3048, Static272.anInt5779, Static487.anInt9598, Static353.anInt7031, 0, 0);
		}
		Static579.anInt10337++;
		Static475.method8451(Static329.aDouble15);
		Static79.aDouble2 = Static329.aDouble15;
		if (Static66.anInt10075 == 0 || Static66.anInt10075 == 2) {
			if (Static66.anInt10075 == 2) {
				Static214.aClass20_7.GA(Static306.anInt6356);
				Static214.aClass20_7.ya();
			}
			Static469.anInt8829 = local30;
			Static377.anInt7391 = local32;
			Static335.anInt6739 = local16 + Static495.anInt9127 - Static114.anInt3048 - Static94.anInt9085;
			Static294.anInt6199 = local20 + Static83.anInt2550 - Static272.anInt5779 - Static138.anInt3381;
			Static214.aClass20_7.DA(Static335.anInt6739, Static294.anInt6199, Static469.anInt8829, Static377.anInt7391);
		} else if (Static66.anInt10075 == 1) {
			Static469.anInt8829 = local30;
			Static335.anInt6739 = local16 - Static94.anInt9085;
			Static294.anInt6199 = local20 - Static138.anInt3381;
			Static377.anInt7391 = local32;
			Static214.aClass20_7.DA(Static335.anInt6739, Static294.anInt6199, Static469.anInt8829, Static377.anInt7391);
			Static214.aClass20_7.KA(Static114.anInt3048, Static272.anInt5779, Static114.anInt3048 + Static487.anInt9598, Static353.anInt7031 + Static272.anInt5779);
		}
		Static187.method3896(arg14, arg5, arg8, arg6, arg1, arg4, arg10, arg11, arg13, arg0, arg3, arg12, arg9, arg2, arg7, arg15, Static66.anInt10075 == 2 ? 0 : 2, Static66.anInt10075 == 1);
		Static214.aClass20_7.la();
		Static214.aClass20_7.DA(local16, local20, local24, local28);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILclient!kda;)V")
	public static void method7859(@OriginalArg(1) Class3_Sub1_Sub3_Sub3 arg0) {
		@Pc(15) Class130 local15;
		if (arg0.anInt6064 != -1) {
			local15 = Static195.aClass193_1.method5573(arg0.anInt6064);
			if (local15 == null || local15.anIntArray237 == null) {
				arg0.aBoolean450 = false;
				arg0.anInt6064 = -1;
			} else {
				label357: {
					arg0.anInt6019++;
					if (arg0.anInt6047 < local15.anIntArray237.length && local15.anIntArray242[arg0.anInt6047] < arg0.anInt6019) {
						arg0.anInt6099++;
						arg0.anInt6047++;
						arg0.anInt6019 = 1;
						if (!arg0.aBoolean454) {
							Static609.method8918(arg0, arg0.anInt6047, local15);
						}
					}
					if (arg0.anInt6047 >= local15.anIntArray237.length) {
						arg0.anInt6047 = 0;
						arg0.anInt6019 = 0;
						if (arg0.aBoolean450) {
							arg0.anInt6064 = arg0.method5200().method7838();
							if (arg0.anInt6064 == -1) {
								arg0.aBoolean450 = false;
								break label357;
							}
							local15 = Static195.aClass193_1.method5573(arg0.anInt6064);
						}
						if (!arg0.aBoolean454) {
							Static609.method8918(arg0, arg0.anInt6047, local15);
						}
					}
					arg0.anInt6099 = arg0.anInt6047 + 1;
					if (local15.anIntArray237 == null) {
						arg0.anInt6064 = -1;
						arg0.aBoolean450 = false;
					} else if (arg0.anInt6099 >= local15.anIntArray237.length) {
						arg0.anInt6099 = 0;
					}
				}
			}
		}
		@Pc(161) int local161;
		@Pc(169) Class130 local169;
		@Pc(158) Class109 local158;
		if (arg0.anInt6065 != -1 && Static407.anInt7704 >= arg0.anInt6032) {
			local158 = Static459.aClass62_2.method2250(arg0.anInt6065);
			local161 = local158.anInt3971;
			if (local161 == -1) {
				arg0.anInt6065 = -1;
			} else {
				label358: {
					local169 = Static195.aClass193_1.method5573(local161);
					if (local158.aBoolean296) {
						if (local169.anInt4711 == 3) {
							if (arg0.anInt6103 > 0 && arg0.anInt6042 <= Static407.anInt7704 && Static407.anInt7704 > arg0.anInt6091) {
								arg0.anInt6065 = -1;
								break label358;
							}
						} else if (local169.anInt4711 == 1 && arg0.anInt6103 > 0 && arg0.anInt6042 <= Static407.anInt7704 && Static407.anInt7704 > arg0.anInt6091) {
							arg0.anInt6032 = Static407.anInt7704 + 1;
							break label358;
						}
					}
					if (local169 == null || local169.anIntArray237 == null) {
						arg0.anInt6065 = -1;
					} else {
						if (arg0.anInt6043 < 0) {
							arg0.anInt6043 = 0;
							if (!arg0.aBoolean454) {
								Static609.method8918(arg0, 0, local169);
							}
						}
						arg0.anInt6045++;
						if (arg0.anInt6043 < local169.anIntArray237.length && local169.anIntArray242[arg0.anInt6043] < arg0.anInt6045) {
							arg0.anInt6043++;
							arg0.anInt6045 = 1;
							if (!arg0.aBoolean454) {
								Static609.method8918(arg0, arg0.anInt6043, local169);
							}
						}
						if (local169.anIntArray237.length <= arg0.anInt6043) {
							if (local158.aBoolean296) {
								arg0.anInt6094++;
								arg0.anInt6043 -= local169.anInt4698;
								if (local169.anInt4702 <= arg0.anInt6094) {
									arg0.anInt6065 = -1;
								} else if (arg0.anInt6043 < 0 || arg0.anInt6043 >= local169.anIntArray237.length) {
									arg0.anInt6065 = -1;
								} else if (!arg0.aBoolean454) {
									Static609.method8918(arg0, arg0.anInt6043, local169);
								}
							} else {
								arg0.anInt6065 = -1;
							}
						}
						arg0.anInt6077 = arg0.anInt6043 + 1;
						if (local169.anIntArray237.length <= arg0.anInt6077) {
							if (local158.aBoolean296) {
								arg0.anInt6077 -= local169.anInt4698;
								if (arg0.anInt6094 + 1 >= local169.anInt4702) {
									arg0.anInt6077 = -1;
								} else if (arg0.anInt6077 < 0 || local169.anIntArray237.length <= arg0.anInt6077) {
									arg0.anInt6077 = -1;
								}
							} else {
								arg0.anInt6077 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6084 != -1 && Static407.anInt7704 >= arg0.anInt6024) {
			local158 = Static459.aClass62_2.method2250(arg0.anInt6084);
			local161 = local158.anInt3971;
			if (local161 == -1) {
				arg0.anInt6084 = -1;
			} else {
				label362: {
					local169 = Static195.aClass193_1.method5573(local161);
					if (local158.aBoolean296) {
						if (local169.anInt4711 == 3) {
							if (arg0.anInt6103 > 0 && Static407.anInt7704 >= arg0.anInt6042 && Static407.anInt7704 > arg0.anInt6091) {
								arg0.anInt6084 = -1;
								break label362;
							}
						} else if (local169.anInt4711 == 1 && arg0.anInt6103 > 0 && Static407.anInt7704 >= arg0.anInt6042 && arg0.anInt6091 < Static407.anInt7704) {
							arg0.anInt6024 = Static407.anInt7704 + 1;
							break label362;
						}
					}
					if (local169 == null || local169.anIntArray237 == null) {
						arg0.anInt6084 = -1;
					} else {
						if (arg0.anInt6031 < 0) {
							arg0.anInt6031 = 0;
							if (!arg0.aBoolean454) {
								Static609.method8918(arg0, 0, local169);
							}
						}
						arg0.anInt6068++;
						if (local169.anIntArray237.length > arg0.anInt6031 && local169.anIntArray242[arg0.anInt6031] < arg0.anInt6068) {
							arg0.anInt6031++;
							arg0.anInt6068 = 1;
							if (!arg0.aBoolean454) {
								Static609.method8918(arg0, arg0.anInt6031, local169);
							}
						}
						if (arg0.anInt6031 >= local169.anIntArray237.length) {
							if (local158.aBoolean296) {
								arg0.anInt6062++;
								arg0.anInt6031 -= local169.anInt4698;
								if (local169.anInt4702 <= arg0.anInt6062) {
									arg0.anInt6084 = -1;
								} else if (arg0.anInt6031 < 0 || arg0.anInt6031 >= local169.anIntArray237.length) {
									arg0.anInt6084 = -1;
								} else if (!arg0.aBoolean454) {
									Static609.method8918(arg0, arg0.anInt6031, local169);
								}
							} else {
								arg0.anInt6084 = -1;
							}
						}
						arg0.anInt6071 = arg0.anInt6031 + 1;
						if (local169.anIntArray237.length <= arg0.anInt6071) {
							if (local158.aBoolean296) {
								arg0.anInt6071 -= local169.anInt4698;
								if (arg0.anInt6062 + 1 >= local169.anInt4702) {
									arg0.anInt6071 = -1;
								} else if (arg0.anInt6071 < 0 || local169.anIntArray237.length <= arg0.anInt6071) {
									arg0.anInt6071 = -1;
								}
							} else {
								arg0.anInt6071 = -1;
							}
						}
					}
				}
			}
		}
		if (arg0.anInt6079 != -1 && arg0.anInt6029 <= 1) {
			local15 = Static195.aClass193_1.method5573(arg0.anInt6079);
			if (local15.anInt4711 == 3) {
				if (arg0.anInt6103 > 0 && arg0.anInt6042 <= Static407.anInt7704 && Static407.anInt7704 > arg0.anInt6091) {
					arg0.anInt6079 = -1;
					arg0.anIntArray349 = null;
				}
			} else if (local15.anInt4711 == 1 && arg0.anInt6103 > 0 && arg0.anInt6042 <= Static407.anInt7704 && arg0.anInt6091 < Static407.anInt7704) {
				arg0.anInt6029 = 2;
			}
		}
		if (arg0.anInt6079 != -1 && arg0.anInt6029 == 0) {
			local15 = Static195.aClass193_1.method5573(arg0.anInt6079);
			if (local15 == null || local15.anIntArray237 == null) {
				arg0.anInt6079 = -1;
				arg0.anIntArray349 = null;
			} else {
				arg0.anInt6037++;
				if (local15.anIntArray237.length > arg0.anInt6063 && arg0.anInt6037 > local15.anIntArray242[arg0.anInt6063]) {
					arg0.anInt6063++;
					arg0.anInt6037 = 1;
					if (!arg0.aBoolean454) {
						Static609.method8918(arg0, arg0.anInt6063, local15);
					}
				}
				if (local15.anIntArray237.length <= arg0.anInt6063) {
					arg0.anInt6063 -= local15.anInt4698;
					arg0.anInt6086++;
					if (local15.anInt4702 <= arg0.anInt6086) {
						arg0.anIntArray349 = null;
						arg0.anInt6079 = -1;
					} else if (arg0.anInt6063 < 0 || local15.anIntArray237.length <= arg0.anInt6063) {
						arg0.anIntArray349 = null;
						arg0.anInt6079 = -1;
					} else if (!arg0.aBoolean454) {
						Static609.method8918(arg0, arg0.anInt6063, local15);
					}
				}
				arg0.anInt6046 = arg0.anInt6063 + 1;
				if (arg0.anInt6046 >= local15.anIntArray237.length) {
					arg0.anInt6046 -= local15.anInt4698;
					if (local15.anInt4702 <= arg0.anInt6086 + 1) {
						arg0.anInt6046 = -1;
					} else if (arg0.anInt6046 < 0 || local15.anIntArray237.length <= arg0.anInt6046) {
						arg0.anInt6046 = -1;
					}
				}
			}
		}
		if (arg0.anInt6029 > 0) {
			arg0.anInt6029--;
		}
		for (local161 = 0; local161 < arg0.aClass274Array3.length; local161++) {
			@Pc(975) Class274 local975 = arg0.aClass274Array3[local161];
			if (local975 != null) {
				if (local975.anInt8347 > 0) {
					local975.anInt8347--;
				} else {
					@Pc(994) Class130 local994 = Static195.aClass193_1.method5573(local975.anInt8352);
					if (local994 == null || local994.anIntArray237 == null) {
						arg0.aClass274Array3[local161] = null;
					} else {
						local975.anInt8354++;
						if (local975.anInt8349 < local994.anIntArray237.length && local994.anIntArray242[local975.anInt8349] < local975.anInt8354) {
							local975.anInt8349++;
							local975.anInt8354 = 1;
							if (!arg0.aBoolean454) {
								Static609.method8918(arg0, local975.anInt8349, local994);
							}
						}
						if (local975.anInt8349 >= local994.anIntArray237.length) {
							local975.anInt8349 -= local994.anInt4698;
							local975.anInt8345++;
							if (local975.anInt8345 >= local994.anInt4702) {
								arg0.aClass274Array3[local161] = null;
							} else if (local975.anInt8349 < 0 || local994.anIntArray237.length <= local975.anInt8349) {
								arg0.aClass274Array3[local161] = null;
							} else if (!arg0.aBoolean454) {
								Static609.method8918(arg0, local975.anInt8349, local994);
							}
						}
						local975.anInt8353 = local975.anInt8349 + 1;
						if (local994.anIntArray237.length <= local975.anInt8353) {
							local975.anInt8353 -= local994.anInt4698;
							if (local994.anInt4702 <= local975.anInt8345 + 1) {
								local975.anInt8353 = -1;
							} else if (local975.anInt8353 < 0 || local994.anIntArray237.length <= local975.anInt8353) {
								local975.anInt8353 = -1;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIII)Lclient!wh;")
	public static Class78 method7860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg3 * 76724863L ^ (long) arg0 * 32147369L ^ (long) arg1 * 986053L ^ (long) arg2 * 67481L ^ (long) arg4 * 97549L ^ (long) arg5 * 475427L;
		@Pc(39) Class78 local39 = (Class78) Static179.aClass169_27.method5002(local33);
		if (local39 == null) {
			local39 = Static273.aClass20_8.method7300(arg2, arg4, arg5, arg1, arg0, arg3);
			Static179.aClass169_27.method5001(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z")
	public static boolean method7861(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
