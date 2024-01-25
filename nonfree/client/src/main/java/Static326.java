import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Lclient!ck;")
	public static Class34 aClass34_2;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Lclient!dp;")
	public static Class53 aClass53_148;

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "[I")
	public static int[] anIntArray687 = new int[2];

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!bk;I)V")
	public static void method5426(@OriginalArg(0) Class6_Sub5 arg0) {
		if (Static39.aClass187ArrayArrayArray1 == null) {
			return;
		}
		@Pc(8) Interface7 local8 = null;
		if (arg0.anInt515 == 0) {
			local8 = (Interface7) Static9.method161(arg0.anInt513, arg0.anInt514, arg0.anInt517);
		}
		if (arg0.anInt515 == 1) {
			local8 = (Interface7) Static105.method2135(arg0.anInt513, arg0.anInt514, arg0.anInt517);
		}
		if (arg0.anInt515 == 2) {
			local8 = (Interface7) Static162.method3236(arg0.anInt513, arg0.anInt514, arg0.anInt517, sc.class);
		}
		if (arg0.anInt515 == 3) {
			local8 = (Interface7) Static68.method4012(arg0.anInt513, arg0.anInt514, arg0.anInt517);
		}
		if (local8 == null) {
			arg0.anInt510 = 0;
			arg0.anInt511 = -1;
			arg0.anInt516 = 0;
		} else {
			arg0.anInt511 = local8.method5799();
			arg0.anInt510 = local8.method5795();
			arg0.anInt516 = local8.method5793();
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILclient!pe;I)V")
	public static void method5427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class44_Sub4_Sub4 arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class128 local12 = arg2.method4716();
		@Pc(21) int local21 = arg2.anInt5089 - arg2.aClass219_7.anInt6305 & 0x3FFF;
		if (arg1 == -1) {
			if (local21 != 0 || arg2.anInt5096 > 25) {
				arg2.aBoolean358 = false;
				if (arg3 < 0 && local12.anInt3385 != -1) {
					arg2.anInt5116 = local12.anInt3385;
				} else if (arg3 <= 0 || local12.anInt3409 == -1) {
					arg2.anInt5116 = local12.anInt3384;
				} else {
					arg2.anInt5116 = local12.anInt3409;
				}
			} else if (!arg2.aBoolean358 || !local12.method3459(arg2.anInt5116)) {
				arg2.anInt5116 = local12.method3453();
				arg2.aBoolean358 = arg2.anInt5116 != -1;
			}
		} else if (arg2.anInt5103 != -1 && (local21 >= 10240 || local21 <= 2048)) {
			@Pc(209) int local209 = Static13.anIntArray22[arg0] - arg2.aClass219_7.anInt6305 & 0x3FFF;
			arg2.aBoolean358 = false;
			if (arg1 == 2 && local12.anInt3379 != -1) {
				if (local209 > 2048 && local209 <= 6144 && local12.anInt3410 != -1) {
					arg2.anInt5116 = local12.anInt3410;
				} else if (local209 >= 10240 && local209 < 14336 && local12.anInt3395 != -1) {
					arg2.anInt5116 = local12.anInt3395;
				} else if (local209 <= 6144 || local209 >= 10240 || local12.anInt3393 == -1) {
					arg2.anInt5116 = local12.anInt3379;
				} else {
					arg2.anInt5116 = local12.anInt3393;
				}
			} else if (arg1 == 0 && local12.anInt3400 != -1) {
				if (local209 > 2048 && local209 <= 6144 && local12.anInt3383 != -1) {
					arg2.anInt5116 = local12.anInt3383;
				} else if (local209 >= 10240 && local209 < 14336 && local12.anInt3374 != -1) {
					arg2.anInt5116 = local12.anInt3374;
				} else if (local209 <= 6144 || local209 >= 10240 || local12.anInt3411 == -1) {
					arg2.anInt5116 = local12.anInt3400;
				} else {
					arg2.anInt5116 = local12.anInt3411;
				}
			} else if (local209 > 2048 && local209 <= 6144 && local12.anInt3396 != -1) {
				arg2.anInt5116 = local12.anInt3396;
			} else if (local209 >= 10240 && local209 < 14336 && local12.anInt3412 != -1) {
				arg2.anInt5116 = local12.anInt3412;
			} else if (local209 <= 6144 || local209 >= 10240 || local12.anInt3375 == -1) {
				arg2.anInt5116 = local12.anInt3384;
			} else {
				arg2.anInt5116 = local12.anInt3375;
			}
		} else if (local21 == 0 && arg2.anInt5096 <= 25) {
			arg2.aBoolean358 = false;
			if (arg1 == 2 && local12.anInt3379 != -1) {
				arg2.anInt5116 = local12.anInt3379;
			} else if (arg1 == 0 && local12.anInt3400 != -1) {
				arg2.anInt5116 = local12.anInt3400;
			} else {
				arg2.anInt5116 = local12.anInt3384;
			}
		} else {
			if (arg1 == 2 && local12.anInt3379 != -1) {
				if (arg3 < 0 && local12.anInt3378 != -1) {
					arg2.anInt5116 = local12.anInt3378;
				} else if (arg3 <= 0 || local12.anInt3406 == -1) {
					arg2.anInt5116 = local12.anInt3379;
				} else {
					arg2.anInt5116 = local12.anInt3406;
				}
			} else if (arg1 == 0 && local12.anInt3400 != -1) {
				if (arg3 < 0 && local12.anInt3387 != -1) {
					arg2.anInt5116 = local12.anInt3387;
				} else if (arg3 <= 0 || local12.anInt3405 == -1) {
					arg2.anInt5116 = local12.anInt3400;
				} else {
					arg2.anInt5116 = local12.anInt3405;
				}
			} else if (arg3 < 0 && local12.anInt3376 != -1) {
				arg2.anInt5116 = local12.anInt3376;
			} else if (arg3 <= 0 || local12.anInt3401 == -1) {
				arg2.anInt5116 = local12.anInt3384;
			} else {
				arg2.anInt5116 = local12.anInt3401;
			}
			arg2.aBoolean358 = false;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII[Lclient!mb;IIIIZ)V")
	public static void method5428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class132[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
		for (@Pc(18) int local18 = 0; local18 < arg4.length; local18++) {
			@Pc(24) Class132 local24 = arg4[local18];
			if (local24 != null && (arg0 == local24.anInt3500 || arg0 == -1412584499 && Static350.aClass132_20 == local24)) {
				@Pc(72) int local72;
				if (arg1 == -1) {
					Class44.aRectangleArray21[Static25.anInt504].setBounds(local24.anInt3498 + arg7, local24.anInt3581 - -arg8, local24.anInt3507, local24.anInt3503);
					local72 = Static25.anInt504++;
				} else {
					local72 = arg1;
				}
				local24.anInt3567 = local72;
				local24.anInt3574 = Static76.anInt2853;
				if (!local24.aBoolean261 || !Static43.method759(local24)) {
					if (local24.anInt3539 > 0) {
						Static233.method4142(local24);
					}
					@Pc(102) int local102 = arg7 + local24.anInt3498;
					@Pc(107) int local107 = local24.anInt3581 + arg8;
					@Pc(110) int local110 = local24.anInt3543;
					if (Static249.aBoolean326 && (Static43.method751(local24).anInt5011 != 0 || local24.anInt3524 == 0) && local110 > 127) {
						local110 = 127;
					}
					@Pc(149) int local149;
					@Pc(155) int local155;
					if (Static350.aClass132_20 == local24) {
						if (arg0 != -1412584499 && !local24.aBoolean266) {
							Static110.aClass132Array1 = arg4;
							Static171.anInt3189 = arg7;
							Static175.anInt3286 = arg8;
							continue;
						}
						if (Static192.aBoolean276 && Static95.aBoolean127) {
							local149 = Static7.anInt149;
							local149 -= Static63.anInt1136;
							local155 = Static79.anInt1449;
							local155 -= Static336.anInt6135;
							if (local149 < Static265.anInt4935) {
								local149 = Static265.anInt4935;
							}
							if (Static265.anInt4935 + Static214.aClass132_14.anInt3507 < local149 + local24.anInt3507) {
								local149 = Static214.aClass132_14.anInt3507 + Static265.anInt4935 - local24.anInt3507;
							}
							if (local155 < Static175.anInt3297) {
								local155 = Static175.anInt3297;
							}
							local102 = local149;
							if (local24.anInt3503 + local155 > Static175.anInt3297 - -Static214.aClass132_14.anInt3503) {
								local155 = Static214.aClass132_14.anInt3503 + Static175.anInt3297 - local24.anInt3503;
							}
							local107 = local155;
						}
						if (!local24.aBoolean266) {
							local110 = 128;
						}
					}
					@Pc(264) int local264;
					@Pc(271) int local271;
					@Pc(226) int local226;
					@Pc(231) int local231;
					if (local24.anInt3524 == 2) {
						local271 = arg5;
						local149 = arg3;
						local264 = arg6;
						local155 = arg2;
					} else {
						local226 = local102 + local24.anInt3507;
						local231 = local24.anInt3503 + local107;
						local149 = arg3 >= local102 ? arg3 : local102;
						if (local24.anInt3524 == 9) {
							local226++;
							local231++;
						}
						local155 = arg2 < local107 ? local107 : arg2;
						local264 = arg6 > local226 ? local226 : arg6;
						local271 = arg5 > local231 ? local231 : arg5;
					}
					if (!local24.aBoolean261 || local149 < local264 && local271 > local155) {
						@Pc(491) int local491;
						@Pc(544) int local544;
						@Pc(546) int local546;
						@Pc(548) int local548;
						@Pc(550) int local550;
						@Pc(594) int local594;
						@Pc(520) int local520;
						@Pc(493) int local493;
						if (local24.anInt3539 != 0) {
							if (local24.anInt3539 == 1337 || local24.anInt3539 == 1403) {
								Static149.method2899(local107, local24.anInt3503, local102, local24.anInt3539 == 1403, local24.anInt3507);
								Static103.aBooleanArray18[local72] = true;
								Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
								continue;
							}
							if (local24.anInt3539 == 1338) {
								if (local24.method3534(Static289.aClass81_7) != null) {
									Static24.method359();
									Static193.method3596(local24, local107, local102, Static289.aClass81_7);
									Static120.aBooleanArray20[local72] = true;
									Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
								}
								continue;
							}
							if (local24.anInt3539 == 1339) {
								if (local24.method3534(Static289.aClass81_7) != null) {
									Static301.method5175(local24, local107, local102);
									Static120.aBooleanArray20[local72] = true;
									Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
								}
								continue;
							}
							if (local24.anInt3539 == 1400) {
								Static32.method4361(local102, local24.anInt3503, local24.anInt3507, Static289.aClass81_7, local107, Static263.anInterface2_5);
								Static103.aBooleanArray18[local72] = true;
								Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
								continue;
							}
							if (local24.anInt3539 == 1401) {
								Static300.method5154(local24.anInt3507, local107, local102, Static289.aClass81_7, local24.anInt3503);
								Static103.aBooleanArray18[local72] = true;
								Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
								continue;
							}
							if (local24.anInt3539 == 1405) {
								if (!Static28.aBoolean38 && !Static87.aBoolean118) {
									continue;
								}
								local226 = local102 + local24.anInt3507;
								local231 = local107 + 15;
								if (Static28.aBoolean38) {
									Static298.aClass30_4.method5336(local226, "Fps:" + Static118.anInt2258, -256, local231);
									local231 += 15;
									@Pc(481) Runtime local481 = Runtime.getRuntime();
									local491 = (int) ((local481.totalMemory() - local481.freeMemory()) / 1024L);
									local493 = -256;
									if (local491 > 65536) {
										local493 = -65536;
									}
									Static298.aClass30_4.method5336(local226, "Mem:" + local491 + "k", local493, local231);
									local231 += 15;
									local520 = Static289.aClass81_7.method2952() / 1024;
									Static298.aClass30_4.method5336(local226, "Offheap:" + local520 + "k", local520 <= 65536 ? -256 : -65536, local231);
									local231 += 15;
									local544 = 0;
									local546 = 0;
									local548 = 0;
									for (local550 = 0; local550 < 29; local550++) {
										local544 += Static121.aClass98_Sub1Array3[local550].method4140();
										local546 += Static121.aClass98_Sub1Array3[local550].method4145();
										local548 += Static121.aClass98_Sub1Array3[local550].method4144();
									}
									@Pc(588) int local588 = local548 * 100 / local544;
									local594 = local546 * 10000 / local544;
									@Pc(614) String local614 = "Cache:" + Static204.method3690((long) local594, true, 0, 2) + "% (" + local588 + "%)";
									Static350.aClass30_6.method5336(local226, local614, -256, local231);
									local231 += 12;
								}
								if (Static281.anInt5315 > 0) {
									Static350.aClass30_6.method5336(local226, "Particles: " + Static337.anInt6154 + " / " + Static281.anInt5315, -256, local231);
								}
								local231 += 12;
								if (Static87.aBoolean118) {
									Static350.aClass30_6.method5336(local226, "Polys: " + Static289.aClass81_7.method3018() + " Models: " + Static289.aClass81_7.method3021(), -256, local231);
									local231 += 12;
									Static350.aClass30_6.method5336(local226, "Ls: " + Static298.anInt5636 + " La: " + Static350.anInt6303 + " NPC: " + Static171.anInt3185 + " Pl: " + Static173.anInt3276, -256, local231);
									local231 += 12;
									Static279.method4825();
								}
								Static103.aBooleanArray18[local72] = true;
								continue;
							}
						}
						if (local24.anInt3524 == 0) {
							if (!local24.aBoolean261 && Static43.method759(local24) && local24 != Static153.aClass132_11) {
								continue;
							}
							if (!local24.aBoolean261) {
								if (local24.anInt3578 > local24.anInt3566 - local24.anInt3503) {
									local24.anInt3578 = local24.anInt3566 - local24.anInt3503;
								}
								if (local24.anInt3578 < 0) {
									local24.anInt3578 = 0;
								}
							}
							if (local24.anInt3539 == 1407 && Static289.aClass81_7.method3024()) {
								Static289.aClass81_7.method2961(local102, local107, local24.anInt3507, local24.anInt3503);
							}
							method5428(local24.anInt3551, local72, local155, local149, arg4, local271, local264, local102 - local24.anInt3522, -local24.anInt3578 + local107);
							if (local24.aClass132Array2 != null) {
								method5428(local24.anInt3551, local72, local155, local149, local24.aClass132Array2, local271, local264, local102 - local24.anInt3522, -local24.anInt3578 + local107);
							}
							@Pc(811) Class6_Sub30 local811 = (Class6_Sub30) Static197.aClass108_30.method2900((long) local24.anInt3551);
							if (local811 != null) {
								Static20.method302(local271, local264, local811.anInt4313, local149, local155, local102, local107, local72);
							}
							if (local24.anInt3539 == 1407 && Static289.aClass81_7.method3024()) {
								Static289.aClass81_7.method3022();
								Static115.aBoolean185 = true;
							}
							Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
						}
						if (Static162.aBooleanArray23[local72] || Static239.anInt6343 > 1) {
							if (local24.anInt3524 == 0 && !local24.aBoolean261 && local24.anInt3566 > local24.anInt3503) {
								Static166.method3282(local102 + local24.anInt3507, local24.anInt3578, local107, local24.anInt3503, local24.anInt3566);
							}
							if (local24.anInt3524 != 1) {
								@Pc(894) int local894;
								if (local24.anInt3524 == 2) {
									local226 = 0;
									for (local231 = 0; local231 < local24.anInt3536; local231++) {
										for (local894 = 0; local894 < local24.anInt3580; local894++) {
											local491 = (local24.anInt3511 + 32) * local894 + local102;
											local493 = local107 + local231 * (local24.anInt3501 + 32);
											if (local226 < 20) {
												local491 += local24.anIntArray412[local226];
												local493 += local24.anIntArray418[local226];
											}
											if (local24.anIntArray414[local226] > 0) {
												local546 = local24.anIntArray414[local226] - 1;
												if (local491 + 32 > arg3 && arg6 > local491 && arg2 < local493 + 32 && arg5 > local493 || Static313.aClass132_18 == local24 && Static65.anInt1207 == local226) {
													@Pc(1024) Class40 local1024;
													if (Static14.anInt257 == 1 && local226 == Static102.anInt5263 && local24.anInt3551 == Static338.anInt6174) {
														local1024 = Static71.method1267(local24.anInt3504, 2, local546, Static289.aClass81_7, local24.anIntArray411[local226], null, 0);
													} else {
														local1024 = Static71.method1267(local24.anInt3504, 1, local546, Static289.aClass81_7, local24.anIntArray411[local226], null, -13623264);
													}
													if (local1024 == null) {
														Static298.method5108(local24);
													} else if (local24 == Static313.aClass132_18 && local226 == Static65.anInt1207) {
														local544 = Static79.anInt1449 - Static234.anInt32;
														local520 = Static7.anInt149 - Static283.anInt5344;
														if (local544 < 5 && local544 > -5) {
															local544 = 0;
														}
														if (local520 < 5 && local520 > -5) {
															local520 = 0;
														}
														if (Static102.anInt5257 < 5) {
															local544 = 0;
															local520 = 0;
														}
														local1024.method5085(local520 + local491, local493 - -local544, 0, -2013265920);
														if (arg0 != -1) {
															@Pc(1137) Class132 local1137 = arg4[arg0 & 0xFFFF];
															@Pc(1140) int[] local1140 = new int[4];
															Static289.aClass81_7.method2989(local1140);
															local594 = local1140[1];
															@Pc(1151) int local1151 = local1140[3];
															@Pc(1172) int local1172;
															if (local594 > local493 + local544 && local1137.anInt3578 > 0) {
																local1172 = (local594 - local544 - local493) * Static133.anInt2448 / 3;
																if (local1172 > Static133.anInt2448 * 10) {
																	local1172 = Static133.anInt2448 * 10;
																}
																if (local1172 > local1137.anInt3578) {
																	local1172 = local1137.anInt3578;
																}
																Static234.anInt32 += local1172;
																local1137.anInt3578 -= local1172;
																Static298.method5108(local1137);
															}
															if (local1151 < local544 + local493 + 32 && local1137.anInt3566 - local1137.anInt3503 > local1137.anInt3578) {
																local1172 = (local493 + local544 + 32 - local1151) * Static133.anInt2448 / 3;
																if (Static133.anInt2448 * 10 < local1172) {
																	local1172 = Static133.anInt2448 * 10;
																}
																if (local1172 > local1137.anInt3566 - local1137.anInt3503 - local1137.anInt3578) {
																	local1172 = local1137.anInt3566 - local1137.anInt3503 - local1137.anInt3578;
																}
																local1137.anInt3578 += local1172;
																Static234.anInt32 -= local1172;
																Static298.method5108(local1137);
															}
														}
													} else if (Static200.aClass132_13 == local24 && Static187.anInt3514 == local226) {
														local1024.method5085(local491, local493, 0, -2013265920);
													} else {
														local1024.method5077(local491, local493);
													}
												}
											} else if (local24.anIntArray413 != null && local226 < 20) {
												@Pc(1306) Class40 local1306 = local24.method3528(Static289.aClass81_7, local226);
												if (local1306 != null) {
													local1306.method5077(local491, local493);
												} else if (Static338.aBoolean410) {
													Static298.method5108(local24);
												}
											}
											local226++;
										}
									}
								} else if (local24.anInt3524 == 3) {
									if (Static237.method4197(local24)) {
										local226 = local24.anInt3488;
										if (Static153.aClass132_11 == local24 && local24.anInt3506 != 0) {
											local226 = local24.anInt3506;
										}
									} else {
										local226 = local24.anInt3513;
										if (Static153.aClass132_11 == local24 && local24.anInt3552 != 0) {
											local226 = local24.anInt3552;
										}
									}
									if (local110 == 0) {
										if (local24.aBoolean253) {
											Static289.aClass81_7.method2962(local102, local107, local24.anInt3507, local24.anInt3503, local226, 0);
										} else {
											Static289.aClass81_7.method2992(local102, local107, local24.anInt3507, local24.anInt3503, local226, 0);
										}
									} else if (local24.aBoolean253) {
										Static289.aClass81_7.method2962(local102, local107, local24.anInt3507, local24.anInt3503, local226 & 0xFFFFFF | 255 - (local110 & 0xFF) << 24, 1);
									} else {
										Static289.aClass81_7.method2992(local102, local107, local24.anInt3507, local24.anInt3503, 255 - (local110 & 0xFF) << 24 | local226 & 0xFFFFFF, 1);
									}
								} else {
									@Pc(1462) Class30 local1462;
									if (local24.anInt3524 == 4) {
										local1462 = local24.method3530(Static289.aClass81_7);
										if (local1462 != null) {
											@Pc(1474) String local1474 = local24.aString144;
											if (Static237.method4197(local24)) {
												local231 = local24.anInt3488;
												if (local24 == Static153.aClass132_11 && local24.anInt3506 != 0) {
													local231 = local24.anInt3506;
												}
												if (local24.aString151.length() > 0) {
													local1474 = local24.aString151;
												}
											} else {
												local231 = local24.anInt3513;
												if (local24 == Static153.aClass132_11 && local24.anInt3552 != 0) {
													local231 = local24.anInt3552;
												}
											}
											if (local24.aBoolean261 && local24.anInt3508 != -1) {
												@Pc(1530) Class147 local1530 = Static211.method3762(local24.anInt3508);
												local1474 = local1530.aString170;
												if (local1474 == null) {
													local1474 = "null";
												}
												if ((local1530.anInt3997 == 1 || local24.anInt3494 != 1) && local24.anInt3494 != -1) {
													local1474 = "<col=ff9040>" + local1474 + "</col> x" + Static234.method32(local24.anInt3494);
												}
											}
											if (local24 == Static109.aClass132_7) {
												local1474 = Static316.aString271;
												local231 = local24.anInt3513;
											}
											if (!local24.aBoolean261) {
												local1474 = Static154.method3110(local1474, local24);
											}
											if (Static30.aBoolean42) {
												Static289.aClass81_7.method2953(local102, local107, local24.anInt3507 + local102, local24.anInt3503 + local107);
											}
											local1462.method5337(local102, local107, Static312.aClass40Array40, local24.anInt3491, local24.anInt3507, null, local24.anInt3520, local24.anInt3509, 0, 0, null, local1474, local231 | 0xFF000000, local24.anInt3503, local24.aBoolean257 ? -16777216 : -1);
											if (Static30.aBoolean42) {
												Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
											}
										} else if (Static338.aBoolean410) {
											Static298.method5108(local24);
										}
									} else if (local24.anInt3524 == 5) {
										@Pc(1655) Class40 local1655;
										if (!local24.aBoolean261) {
											local1655 = local24.method3525(Static237.method4197(local24), Static289.aClass81_7);
											if (local1655 != null) {
												local1655.method5077(local102, local107);
											} else if (Static338.aBoolean410) {
												Static298.method5108(local24);
											}
										} else if (local24.anInt3572 < 0) {
											if (local24.anInt3508 == -1) {
												local1655 = local24.method3525(false, Static289.aClass81_7);
											} else {
												@Pc(1692) Class21 local1692 = local24.aBoolean267 ? Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2 : null;
												local1655 = Static71.method1267(local24.anInt3504, local24.anInt3547, local24.anInt3508, Static289.aClass81_7, local24.anInt3494, local1692, local24.anInt3526 | 0xFF000000);
											}
											if (local1655 != null) {
												local231 = local1655.method5083();
												local894 = local1655.method5084();
												if (local24.aBoolean269) {
													Static289.aClass81_7.method2953(local102, local107, local102 + local24.anInt3507, local24.anInt3503 + local107);
													if (local24.anInt3583 != 0) {
														local491 = (local24.anInt3507 + local231 - 1) / local231;
														local493 = (local894 + local24.anInt3503 - 1) / local894;
														for (local520 = 0; local520 < local491; local520++) {
															for (local544 = 0; local544 < local493; local544++) {
																local1655.method5070((float) local231 / 2.0F + (float) (local102 + local231 * local520), (float) local894 / 2.0F + (float) (local544 * local894 + local107), 4096, local24.anInt3583);
															}
														}
													} else if (local110 == 0) {
														local1655.method5076(local102, local107, local24.anInt3507, local24.anInt3503, 0, 0);
													} else {
														local1655.method5076(local102, local107, local24.anInt3507, local24.anInt3503, 1, 255 - (local110 & 0xFF) << 24 | 0xFFFFFF);
													}
													Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
												} else if (local110 != 0) {
													local491 = 255 - (local110 & 0xFF) << 24 | 0xFFFFFF;
													if (local24.anInt3583 != 0) {
														local1655.method5072((float) local102 + (float) local24.anInt3507 / 2.0F, (float) local24.anInt3503 / 2.0F + (float) local107, local24.anInt3507 * 4096 / local231, local24.anInt3583, local491);
													} else if (local231 == local24.anInt3507 && local24.anInt3503 == local894) {
														local1655.method5085(local102, local107, 1, local491);
													} else {
														local1655.method5082(local102, local107, local24.anInt3507, local24.anInt3503, 1, local491, 1);
													}
												} else if (local24.anInt3583 != 0) {
													local1655.method5070((float) local102 + (float) local24.anInt3507 / 2.0F, (float) local24.anInt3503 / 2.0F + (float) local107, local24.anInt3507 * 4096 / local231, local24.anInt3583);
												} else if (local231 == local24.anInt3507 && local894 == local24.anInt3503) {
													local1655.method5077(local102, local107);
												} else {
													local1655.method5073(local102, local107, local24.anInt3507, local24.anInt3503);
												}
											} else if (Static338.aBoolean410) {
												Static298.method5108(local24);
											}
										} else {
											local24.method3521().method3404(0, local24.anInt3507, local24.anInt3503, Static289.aClass81_7, local102, local107, 0, local24.anInt3546 << 3, local24.anInt3490 << 3);
										}
									} else {
										@Pc(2065) Class147 local2065;
										if (local24.anInt3524 == 6) {
											@Pc(2040) boolean local2040 = Static237.method4197(local24);
											if (local2040) {
												local231 = local24.anInt3521;
											} else {
												local231 = local24.anInt3541;
											}
											Static165.method5483();
											@Pc(2054) Class78 local2054 = null;
											local491 = 0;
											@Pc(2091) Class21 local2091;
											@Pc(2083) Class24 local2083;
											if (local24.anInt3508 != -1) {
												local2065 = Static211.method3762(local24.anInt3508);
												if (local2065 != null) {
													local2065 = local2065.method3846(local24.anInt3494);
													local2083 = local231 == -1 ? null : Static209.method3737(local231);
													local2091 = local24.aBoolean267 ? Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2 : null;
													local2054 = local2065.method3852(local2091, local24.anInt3573, local24.anInt3534, local24.anInt3487, 1024, local2083, Static289.aClass81_7, 1);
													if (local2054 == null) {
														Static298.method5108(local24);
													} else {
														local491 = -local2054.method4639() / 2;
													}
												}
											} else if (local24.anInt3553 == 5) {
												if (local24.anInt3558 == -1) {
													local2054 = Static204.aClass21_1.method466(null, null, 1024, -1, null, Static289.aClass81_7, -1, -1, 0, -1, 0);
												} else {
													local493 = local24.anInt3558;
													@Pc(2261) Class44_Sub4_Sub4_Sub1 local2261;
													if (local493 == Static44.anInt879) {
														local2261 = Static253.aClass44_Sub4_Sub4_Sub1_1;
													} else {
														local2261 = Static343.aClass44_Sub4_Sub4_Sub1Array1[local493];
													}
													@Pc(2275) Class24 local2275 = local231 == -1 ? null : Static209.method3737(local231);
													if (local2261 != null && (local493 == 2047 || Static122.method2429(local2261.aString207) == local24.anInt3560)) {
														local2054 = local2261.aClass21_2.method466(local2275, null, 1024, local24.anInt3487, null, Static289.aClass81_7, local24.anInt3534, 0, local24.anInt3573, -1, 0);
													}
												}
											} else if (local24.anInt3553 == 8 || local24.anInt3553 == 9) {
												@Pc(2141) Class6_Sub38 local2141 = Static128.method2519(local24.anInt3558);
												local2083 = local231 == -1 ? null : Static209.method3737(local231);
												if (local2141 != null) {
													local2091 = local24.aBoolean267 ? Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2 : null;
													local2054 = local2141.method5257(local24.anInt3573, local24.anInt3560, local2091, local2083, local24.anInt3553 == 9, Static289.aClass81_7, local24.anInt3487, local24.anInt3534);
												}
											} else if (local231 == -1) {
												local2054 = local24.method3531(0, 1024, null, Static289.aClass81_7, -1, local2040, -1, Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2);
												if (local2054 == null && Static338.aBoolean410) {
													Static298.method5108(local24);
												}
											} else {
												@Pc(2215) Class24 local2215 = Static209.method3737(local231);
												local2054 = local24.method3531(local24.anInt3573, 1024, local2215, Static289.aClass81_7, local24.anInt3534, local2040, local24.anInt3487, Static253.aClass44_Sub4_Sub4_Sub1_1.aClass21_2);
												if (local2054 == null && Static338.aBoolean410) {
													Static298.method5108(local24);
												}
											}
											if (local2054 != null) {
												if (local24.anInt3538 > 0) {
													local493 = (local24.anInt3507 << 9) / local24.anInt3538;
												} else {
													local493 = 512;
												}
												if (local24.anInt3485 > 0) {
													local520 = (local24.anInt3503 << 9) / local24.anInt3485;
												} else {
													local520 = 512;
												}
												local544 = (local24.anInt3575 * local493 >> 9) + (local102 + (local24.anInt3507 / 2));
												local546 = (local520 * local24.anInt3537 >> 9) + local24.anInt3503 / 2 + local107;
												Static160.aClass72_3.method4071();
												Static289.aClass81_7.method2954(Static160.aClass72_3);
												local548 = local24.anInt3569 * Class207.anIntArray697[local24.anInt3512 << 3] >> 15;
												local550 = local24.anInt3569 * Class207.anIntArray698[local24.anInt3512 << 3] >> 15;
												Static289.aClass81_7.method2985(local544, local546, local493, local520);
												Static289.aClass81_7.method2974((float) local24.aShort50, local24.aBoolean264 ? (float) local24.aShort49 : (float) local24.aShort49 * 1.5F);
												if (Static115.aBoolean185) {
													Static289.aClass81_7.method3032();
													Static289.aClass81_7.method3023();
													Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
													Static115.aBoolean185 = false;
												}
												if (local24.lb) {
													Static289.aClass81_7.method2957(false);
												}
												if (local24.aBoolean261) {
													Static281.aClass72_5.method4072(-local24.anInt3515 << 3);
													Static281.aClass72_5.method4074(local24.anInt3570 << 3);
													Static281.aClass72_5.method4068(local24.anInt3518, local548 + local491 + local24.anInt3499, local550 - -local24.anInt3499);
												} else {
													Static281.aClass72_5.method4081(local24.anInt3570 << 3);
													Static281.aClass72_5.method4068(0, local548, local550);
												}
												Static281.aClass72_5.method4082(local24.anInt3512 << 3);
												if (Static30.aBoolean42) {
													Static289.aClass81_7.method2953(local102, local107, local24.anInt3507 + local102, local107 - -local24.anInt3503);
												}
												if (local24.aBoolean264) {
													local2054.method4653(Static281.aClass72_5, null, local24.anInt3569);
												} else {
													local2054.method4649(Static281.aClass72_5, null, 1);
												}
												if (Static30.aBoolean42) {
													Static289.aClass81_7.method3033(arg3, arg2, arg6, arg5);
												}
												if (local24.lb) {
													Static289.aClass81_7.method2957(true);
												}
											}
										} else {
											if (local24.anInt3524 == 7) {
												local1462 = local24.method3530(Static289.aClass81_7);
												if (local1462 == null) {
													if (Static338.aBoolean410) {
														Static298.method5108(local24);
													}
													continue;
												}
												local231 = 0;
												for (local894 = 0; local894 < local24.anInt3536; local894++) {
													for (local491 = 0; local491 < local24.anInt3580; local491++) {
														if (local24.anIntArray414[local231] > 0) {
															local2065 = Static211.method3762(local24.anIntArray414[local231] - 1);
															@Pc(2633) String local2633;
															if (local2065.anInt3997 != 1 && local24.anIntArray411[local231] == 1) {
																local2633 = "<col=ff9040>" + local2065.aString170 + "</col>";
															} else {
																local2633 = "<col=ff9040>" + local2065.aString170 + "</col> x" + Static234.method32(local24.anIntArray411[local231]);
															}
															local544 = local102 + (local24.anInt3511 + 115) * local491;
															local546 = local107 + local894 * (local24.anInt3501 + 12);
															if (local24.anInt3509 == 0) {
																local1462.method5345(null, local546, local24.aBoolean257 ? -16777216 : -1, Static312.aClass40Array40, local544, local24.anInt3513 | 0xFF000000, local2633);
															} else if (local24.anInt3509 == 1) {
																local1462.method5331(local546, null, local24.anInt3513 | 0xFF000000, local2633, local24.aBoolean257 ? -16777216 : -1, local544 + 57, Static312.aClass40Array40);
															} else {
																local1462.method5341(local544 + 114, Static312.aClass40Array40, local24.anInt3513 | 0xFF000000, local2633, null, local24.aBoolean257 ? -16777216 : -1, local546);
															}
														}
														local231++;
													}
												}
											}
											if (local24.anInt3524 == 8 && Static32.aClass132_15 == local24 && Static238.anInt5145 == Static41.anInt6382) {
												local226 = 0;
												local231 = 0;
												@Pc(2782) Class30 local2782 = Static298.aClass30_4;
												@Pc(2785) String local2785 = local24.aString144;
												local2785 = Static154.method3110(local2785, local24);
												@Pc(2805) String local2805;
												while (local2785.length() > 0) {
													local520 = local2785.indexOf("<br>");
													if (local520 == -1) {
														local2805 = local2785;
														local2785 = "";
													} else {
														local2805 = local2785.substring(0, local520);
														local2785 = local2785.substring(local520 + 4);
													}
													local544 = Static38.aClass26_3.method508(local2805);
													local231 += Static38.aClass26_3.anInt609 + 1;
													if (local226 < local544) {
														local226 = local544;
													}
												}
												local226 += 6;
												local231 += 7;
												local520 = local102 + local24.anInt3507 - local226 - 5;
												local544 = local107 + local24.anInt3503 + 5;
												if (local520 < local102 + 5) {
													local520 = local102 + 5;
												}
												if (local226 + local520 > arg6) {
													local520 = arg6 - local226;
												}
												if (arg5 < local231 + local544) {
													local544 = arg5 - local231;
												}
												Static289.aClass81_7.method2962(local520, local544, local226, local231, -96, 0);
												Static289.aClass81_7.method2992(local520, local544, local226, local231, -16777216, 0);
												local2785 = local24.aString144;
												local546 = local544 + Static38.aClass26_3.anInt609 + 2;
												local2785 = Static154.method3110(local2785, local24);
												while (local2785.length() > 0) {
													local548 = local2785.indexOf("<br>");
													if (local548 == -1) {
														local2805 = local2785;
														local2785 = "";
													} else {
														local2805 = local2785.substring(0, local548);
														local2785 = local2785.substring(local548 + 4);
													}
													local2782.method5340(local546, -16777216, -1, local2805, local520 + 3);
													local546 += Static38.aClass26_3.anInt609 + 1;
												}
											}
											if (local24.anInt3524 == 9) {
												if (local24.aBoolean259) {
													local491 = local107;
													local231 = local24.anInt3503 + local107;
													local894 = local102 + local24.anInt3507;
												} else {
													local491 = local24.anInt3503 + local107;
													local231 = local107;
													local894 = local102 + local24.anInt3507;
												}
												if (local24.anInt3564 == 1) {
													Static289.aClass81_7.method3043(local102, local231, local894, local491, local24.anInt3513, 0);
												} else {
													Static289.aClass81_7.method2977(local102, local231, local894, local491, local24.anInt3513, local24.anInt3564);
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ec;B)Lclient!ba;")
	public static Class6_Sub1 method5429(@OriginalArg(0) Class6_Sub10 arg0) {
		arg0.method3972();
		@Pc(18) int local18 = arg0.method3972();
		@Pc(22) Class6_Sub1 local22 = Static23.method351(local18);
		local22.anInt6204 = arg0.method3972();
		@Pc(31) int local31 = arg0.method3972();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) int local39 = arg0.method3972();
			local22.method5617(arg0, local39);
		}
		local22.method5611();
		return local22;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lclient!jq;")
	public static Class112 method5430(@OriginalArg(1) int arg0) {
		@Pc(5) Class70 local5 = Static215.aClass70_70;
		@Pc(16) Class112 local16;
		synchronized (Static215.aClass70_70) {
			local16 = (Class112) Static215.aClass70_70.method1396((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(34) byte[] local34 = Static47.aClass53_30.method1033(arg0, 3);
		local16 = new Class112();
		if (local34 != null) {
			local16.method3084(new Class6_Sub10(local34));
		}
		@Pc(54) Class70 local54 = Static215.aClass70_70;
		synchronized (Static215.aClass70_70) {
			Static215.aClass70_70.method1406(local16, (long) arg0);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIII)V")
	public static void method5431(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static240.method3872(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg5;
		@Pc(23) int local23 = -arg5;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(36) int[] local36 = Static11.anIntArrayArray11[arg3];
		@Pc(41) int local41 = arg0 - local14;
		Static14.method247(local41, arg1, local36, arg0 - arg5);
		@Pc(58) int local58 = local14 + arg0;
		Static14.method247(local58, arg4, local36, local41);
		Static14.method247(arg0 + arg5, arg1, local36, local58);
		while (local10 < local20) {
			local30 += 2;
			local32 += 2;
			local23 += local30;
			local28 += local32;
			if (local28 >= 0 && local25 >= 1) {
				Static197.anIntArray568[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(126) int[] local126;
			@Pc(133) int[] local133;
			@Pc(137) int local137;
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(150) int local150;
			@Pc(154) int local154;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				if (local14 > local20) {
					local126 = Static11.anIntArrayArray11[arg3 + local20];
					local133 = Static11.anIntArrayArray11[arg3 - local20];
					local137 = Static197.anIntArray568[local20];
					local141 = local10 + arg0;
					local146 = arg0 - local10;
					local150 = local137 + arg0;
					local154 = arg0 - local137;
					Static14.method247(local154, arg1, local126, local146);
					Static14.method247(local150, arg4, local126, local154);
					Static14.method247(local141, arg1, local126, local150);
					Static14.method247(local154, arg1, local133, local146);
					Static14.method247(local150, arg4, local133, local154);
					Static14.method247(local141, arg1, local133, local150);
				} else {
					local126 = Static11.anIntArrayArray11[local20 + arg3];
					local133 = Static11.anIntArrayArray11[arg3 - local20];
					local137 = arg0 + local10;
					local141 = arg0 - local10;
					Static14.method247(local137, arg1, local126, local141);
					Static14.method247(local137, arg1, local133, local141);
				}
			}
			local126 = Static11.anIntArrayArray11[arg3 + local10];
			local133 = Static11.anIntArrayArray11[arg3 - local10];
			local137 = local20 + arg0;
			local141 = arg0 - local20;
			if (local14 > local10) {
				local146 = local10 > local25 ? Static197.anIntArray568[local10] : local25;
				local150 = arg0 + local146;
				local154 = arg0 - local146;
				Static14.method247(local154, arg1, local126, local141);
				Static14.method247(local150, arg4, local126, local154);
				Static14.method247(local137, arg1, local126, local150);
				Static14.method247(local154, arg1, local133, local141);
				Static14.method247(local150, arg4, local133, local154);
				Static14.method247(local137, arg1, local133, local150);
			} else {
				Static14.method247(local137, arg1, local126, local141);
				Static14.method247(local137, arg1, local133, local141);
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ec;Z)Lclient!lp;")
	public static Class43_Sub2 method5432(@OriginalArg(0) Class6_Sub10 arg0) {
		return new Class43_Sub2(arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method4022(), arg0.method3996(), arg0.method3972());
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
	public static void method5434(@OriginalArg(1) int arg0) {
		@Pc(16) Class6_Sub2_Sub8 local16 = Static239.method5786(14, arg0);
		local16.method2645();
	}
}
