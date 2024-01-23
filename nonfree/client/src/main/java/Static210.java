import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "B")
	public static byte aByte20;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
	public static int anInt4141 = 0;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
	public static int anInt4145 = 0;

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
	public static int anInt4147 = 1;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "I")
	public static int anInt4148 = 0;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!ph;III)Lclient!ln;")
	public static Class1_Sub1_Sub3_Sub2 method3325(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static27.method486(arg1, arg2, arg0) ? Static56.method974() : null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILclient!ph;Lclient!ph;)V")
	public static void method3326(@OriginalArg(1) Class138 arg0, @OriginalArg(2) Class138 arg1) {
		Static312.aClass138_91 = arg0;
		Static274.aClass138_76 = arg1;
		Static312.aClass138_91.method3365(36);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([Lclient!qf;IIIIIIIII)V")
	public static void method3327(@OriginalArg(0) Class146[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static291.aBoolean404) {
			Static133.method2180(arg3, arg5, arg1, arg4);
		} else {
			Static41.method739(arg3, arg5, arg1, arg4);
			Static18.method310();
		}
		for (@Pc(30) int local30 = 0; local30 < arg0.length; local30++) {
			@Pc(38) Class146 local38 = arg0[local30];
			if (local38 != null && (arg6 == local38.anInt4416 || arg6 == -1412584499 && local38 == Static9.aClass146_11)) {
				@Pc(62) int local62;
				if (arg7 == -1) {
					Static220.anIntArray527[Static156.anInt3310] = arg8 + local38.anInt4340;
					Static244.anIntArray440[Static156.anInt3310] = local38.anInt4385 + arg2;
					Static219.anIntArray345[Static156.anInt3310] = local38.anInt4345;
					Static191.anIntArray319[Static156.anInt3310] = local38.anInt4371;
					local62 = Static156.anInt3310++;
				} else {
					local62 = arg7;
				}
				local38.anInt4339 = local62;
				local38.anInt4354 = Static37.anInt757;
				if (!local38.aBoolean299 || !Static36.method654(local38)) {
					if (local38.anInt4350 > 0) {
						Static128.method2025(local38);
					}
					@Pc(119) int local119 = arg8 + local38.anInt4340;
					@Pc(124) int local124 = arg2 + local38.anInt4385;
					@Pc(127) int local127 = local38.anInt4372;
					if (Static250.aBoolean231 && (Static36.method643(local38).anInt4031 != 0 || local38.anInt4370 == 0) && local127 > 127) {
						local127 = 127;
					}
					@Pc(177) int local177;
					@Pc(179) int local179;
					if (local38 == Static9.aClass146_11) {
						if (arg6 != -1412584499 && !local38.aBoolean306) {
							Static112.anInt2220 = arg8;
							Static72.aClass146Array1 = arg0;
							Static173.anInt3608 = arg2;
							continue;
						}
						if (!local38.aBoolean306) {
							local127 = 128;
						}
						if (Static271.aBoolean369 && Static26.aBoolean32) {
							local177 = Static152.anInt3132;
							local179 = Static300.anInt5678;
							local177 -= Static168.anInt5865;
							if (local177 < Static217.anInt4265) {
								local177 = Static217.anInt4265;
							}
							if (local38.anInt4345 + local177 > Static87.aClass146_6.anInt4345 + Static217.anInt4265) {
								local177 = Static217.anInt4265 + Static87.aClass146_6.anInt4345 - local38.anInt4345;
							}
							local179 -= Static312.anInt5847;
							local119 = local177;
							if (Static217.anInt4274 > local179) {
								local179 = Static217.anInt4274;
							}
							if (Static87.aClass146_6.anInt4371 + Static217.anInt4274 < local179 + local38.anInt4371) {
								local179 = Static87.aClass146_6.anInt4371 + Static217.anInt4274 - local38.anInt4371;
							}
							local124 = local179;
						}
					}
					@Pc(263) int local263;
					@Pc(257) int local257;
					@Pc(277) int local277;
					@Pc(290) int local290;
					if (local38.anInt4370 == 2) {
						local257 = arg4;
						local177 = arg3;
						local179 = arg5;
						local263 = arg1;
					} else {
						local179 = local124 > arg5 ? local124 : arg5;
						local277 = local38.anInt4345 + local119;
						local177 = arg3 >= local119 ? arg3 : local119;
						local290 = local124 + local38.anInt4371;
						if (local38.anInt4370 == 9) {
							local277++;
							local290++;
						}
						local257 = local290 < arg4 ? local290 : arg4;
						local263 = local277 < arg1 ? local277 : arg1;
					}
					if (!local38.aBoolean299 || local263 > local177 && local257 > local179) {
						@Pc(470) int local470;
						@Pc(509) int local509;
						@Pc(527) int local527;
						@Pc(523) int local523;
						@Pc(557) int local557;
						@Pc(568) int local568;
						@Pc(588) int local588;
						@Pc(604) int local604;
						if (local38.anInt4350 != 0) {
							if (local38.anInt4350 == 1337 || local38.anInt4350 == 1403) {
								Static66.anInt1302 = local119;
								Static235.aClass146_15 = local38;
								Static110.anInt2181 = local124;
								Static144.method2296(local124, local119, local38.anInt4350 == 1403, local38.anInt4371, local38.anInt4345);
								Static132.aBooleanArray25[local62] = true;
								if (Static291.aBoolean404) {
									Static133.method2180(arg3, arg5, arg1, arg4);
								} else {
									Static41.method739(arg3, arg5, arg1, arg4);
								}
								continue;
							}
							if (local38.anInt4350 == 1338) {
								if (!local38.method3515()) {
									continue;
								}
								Static7.method106(local124, local62, local38, local119);
								if (Static291.aBoolean404) {
									Static133.method2180(arg3, arg5, arg1, arg4);
								} else {
									Static41.method739(arg3, arg5, arg1, arg4);
								}
								if (Static128.anInt2551 != 0 && Static128.anInt2551 != 3 || Static108.aBoolean161 || Static64.anInt3058 < local177 || Static268.anInt5935 < local179 || Static64.anInt3058 >= local263 || local257 <= Static268.anInt5935) {
									continue;
								}
								local277 = Static64.anInt3058 - local119;
								local290 = Static268.anInt5935 - local124;
								local470 = local38.anIntArray362[local290];
								if (local277 < local470 || local277 > local470 + local38.anIntArray363[local290]) {
									continue;
								}
								local290 -= local38.anInt4371 / 2;
								local277 -= local38.anInt4345 / 2;
								if (Static101.anInt1895 == 4) {
									local509 = (int) Static2.aFloat1 & 0x7FF;
								} else {
									local509 = (int) Static2.aFloat1 + Static39.anInt794 & 0x7FF;
								}
								local523 = Class17.anIntArray24[local509];
								local527 = Class17.anIntArray22[local509];
								if (Static101.anInt1895 != 4) {
									local527 = (Static54.anInt1055 + 256) * local527 >> 8;
									local523 = (Static54.anInt1055 + 256) * local523 >> 8;
								}
								local557 = local277 * local523 + local290 * local527 >> 11;
								local568 = local290 * local523 - local277 * local527 >> 11;
								if (Static101.anInt1895 == 4) {
									local604 = Static258.anInt5019 - local568 >> 7;
									local588 = Static97.anInt1806 + local557 >> 7;
								} else {
									local588 = local557 + Static229.aClass22_Sub3_Sub2_2.anInt4601 + 64 - Static229.aClass22_Sub3_Sub2_2.method3660() * 64 >> 7;
									local604 = Static229.aClass22_Sub3_Sub2_2.anInt4623 - local568 - (Static229.aClass22_Sub3_Sub2_2.method3660() + -1) * 64 >> 7;
								}
								if (Static91.aBoolean136 && (Static234.anInt4733 & 0x40) != 0) {
									@Pc(657) Class146 local657 = Static300.method4492(Static81.anInt1490, Static10.anInt180);
									if (local657 == null) {
										Static87.method1300();
									} else {
										Static59.method1004((short) 12, Static232.aString115, Static49.anInt937, local588, " ->", local604, 1L);
									}
									continue;
								}
								if (Static35.anInt641 == 1) {
									Static59.method1004((short) 13, Static128.aString90, -1, local588, "", local604, 1L);
								}
								Static59.method1004((short) 14, Static31.aString18, -1, local588, "", local604, 1L);
								continue;
							}
							if (local38.anInt4350 == 1339) {
								if (local38.method3515()) {
									Static195.method3175(local119, local38, local62, local124);
									if (Static291.aBoolean404) {
										Static133.method2180(arg3, arg5, arg1, arg4);
									} else {
										Static41.method739(arg3, arg5, arg1, arg4);
									}
								}
								continue;
							}
							if (local38.anInt4350 == 1400) {
								Static183.method3020(local38.anInt4371, local124, local119, local38.anInt4345);
								Static132.aBooleanArray25[local62] = true;
								Static307.aBooleanArray65[local62] = true;
								if (Static291.aBoolean404) {
									Static133.method2180(arg3, arg5, arg1, arg4);
								} else {
									Static41.method739(arg3, arg5, arg1, arg4);
								}
								continue;
							}
							if (local38.anInt4350 == 1401) {
								Static248.method3828(local119, local124, local38.anInt4371, local38.anInt4345);
								Static132.aBooleanArray25[local62] = true;
								Static307.aBooleanArray65[local62] = true;
								if (Static291.aBoolean404) {
									Static133.method2180(arg3, arg5, arg1, arg4);
								} else {
									Static41.method739(arg3, arg5, arg1, arg4);
								}
								continue;
							}
							if (local38.anInt4350 == 1402) {
								if (!Static291.aBoolean404) {
									Static252.method3849(local119, local124);
									Static132.aBooleanArray25[local62] = true;
									Static307.aBooleanArray65[local62] = true;
								}
								continue;
							}
							if (local38.anInt4350 == 1405) {
								if (!Static13.aBoolean13) {
									continue;
								}
								local277 = local38.anInt4345 + local119;
								local290 = local124 + 15;
								Static233.aClass1_Sub1_Sub12_3.method4436("Fps:" + Static136.anInt2698, local277, local290, 16776960, -1);
								local290 += 15;
								@Pc(835) Runtime local835 = Runtime.getRuntime();
								local509 = (int) ((local835.totalMemory() - local835.freeMemory()) / 1024L);
								local527 = 16776960;
								if (local509 > 65536) {
									local527 = 16711680;
								}
								Static233.aClass1_Sub1_Sub12_3.method4436("Mem:" + local509 + "k", local277, local290, local527, -1);
								local290 += 15;
								if (Static291.aBoolean404) {
									local523 = (Static74.anInt1417 + Static74.anInt1416 + Static74.anInt1418) / 1024;
									local527 = 16776960;
									if (local523 > 65536) {
										local527 = 16711680;
									}
									Static233.aClass1_Sub1_Sub12_3.method4436("Card:" + local523 + "k", local277, local290, local527, -1);
									local290 += 15;
								}
								local523 = 0;
								local557 = 0;
								local568 = 0;
								for (local588 = 0; local588 < 29; local588++) {
									local523 += Static305.aClass55_Sub1Array2[local588].method4247();
									local557 += Static305.aClass55_Sub1Array2[local588].method4243();
									local568 += Static305.aClass55_Sub1Array2[local588].method4246();
								}
								local604 = local557 * 10000 / local523;
								local588 = local568 * 100 / local523;
								@Pc(984) String local984 = "Cache:" + Static49.method865(true, 2, (long) local604, 0) + "% (" + local588 + "%)";
								Static289.aClass1_Sub1_Sub12_4.method4436(local984, local277, local290, 16776960, -1);
								local290 += 12;
								if (Static149.anInt2996 > 0) {
									Static289.aClass1_Sub1_Sub12_4.method4436("Particles: " + Static149.anInt2992 + " / " + Static149.anInt2996, local277, local290, 16776960, -1);
								}
								local290 += 12;
								Static132.aBooleanArray25[local62] = true;
								Static307.aBooleanArray65[local62] = true;
								continue;
							}
							if (local38.anInt4350 == 1406) {
								Static81.anInt1493 = local124;
								Static51.aClass146_3 = local38;
								Static36.anInt729 = local119;
								continue;
							}
						}
						if (!Static108.aBoolean161) {
							if (local38.anInt4370 == 0 && local38.aBoolean303 && local177 <= Static64.anInt3058 && Static268.anInt5935 >= local179 && local263 > Static64.anInt3058 && local257 > Static268.anInt5935 && !Static250.aBoolean231) {
								Static316.anInt5941 = 1;
								Static244.anIntArray441[0] = Static5.anInt69;
								Static241.aShortArray76[0] = 1002;
								Static213.aStringArray35[0] = Static269.aString16;
								Static54.aStringArray7[0] = "";
							}
							if (Static64.anInt3058 >= local177 && Static268.anInt5935 >= local179 && Static64.anInt3058 < local263 && Static268.anInt5935 < local257) {
								Static237.method2932(Static268.anInt5935 - local124, Static64.anInt3058 + -local119, local38);
							}
						}
						if (local38.anInt4370 == 0) {
							if (!local38.aBoolean299 && Static36.method654(local38) && Static56.aClass146_4 != local38) {
								continue;
							}
							if (!local38.aBoolean299) {
								if (local38.anInt4383 - local38.anInt4371 < local38.anInt4418) {
									local38.anInt4418 = local38.anInt4383 - local38.anInt4371;
								}
								if (local38.anInt4418 < 0) {
									local38.anInt4418 = 0;
								}
							}
							if (Static291.aBoolean404 && local38.anInt4350 == 1407) {
								Static266.method3958(local119, local124, local38.anInt4345, local38.anInt4371);
							}
							method3327(arg0, local263, local124 - local38.anInt4418, local177, local257, local179, local38.anInt4355, local62, local119 - local38.anInt4341);
							if (local38.aClass146Array2 != null) {
								method3327(local38.aClass146Array2, local263, local124 - local38.anInt4418, local177, local257, local179, local38.anInt4355, local62, local119 - local38.anInt4341);
							}
							@Pc(1243) Class1_Sub32 local1243 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local38.anInt4355);
							if (local1243 != null) {
								if (local1243.anInt5716 == 0 && !Static108.aBoolean161 && Static64.anInt3058 >= local177 && Static268.anInt5935 >= local179 && local263 > Static64.anInt3058 && local257 > Static268.anInt5935 && !Static250.aBoolean231) {
									Static244.anIntArray441[0] = Static5.anInt69;
									Static241.aShortArray76[0] = 1002;
									Static316.anInt5941 = 1;
									Static213.aStringArray35[0] = Static269.aString16;
									Static54.aStringArray7[0] = "";
								}
								Static50.method875(local124, local263, local119, local179, local257, local177, local1243.anInt5722, local62);
							}
							if (Static291.aBoolean404 && local38.anInt4350 == 1407) {
								Static266.method3959();
								Static218.aBoolean293 = true;
							}
							if (Static291.aBoolean404) {
								Static133.method2180(arg3, arg5, arg1, arg4);
							} else {
								Static41.method739(arg3, arg5, arg1, arg4);
								Static18.method310();
							}
						}
						if (Static213.aBooleanArray44[local62] || Static16.anInt245 > 1) {
							if (local38.anInt4370 == 0 && !local38.aBoolean299 && local38.anInt4371 < local38.anInt4383) {
								Static33.method560(local38.anInt4371, local38.anInt4383, local38.anInt4418, local124, local119 + local38.anInt4345);
							}
							if (local38.anInt4370 != 1) {
								if (local38.anInt4370 == 2) {
									local277 = 0;
									for (local290 = 0; local290 < local38.anInt4391; local290++) {
										for (local470 = 0; local470 < local38.anInt4357; local470++) {
											local527 = local124 + (local38.anInt4415 + 32) * local290;
											local509 = local119 + (local38.anInt4375 + 32) * local470;
											if (local277 < 20) {
												local509 += local38.anIntArray364[local277];
												local527 += local38.anIntArray354[local277];
											}
											if (local38.anIntArray358[local277] > 0) {
												local568 = local38.anIntArray358[local277] - 1;
												if (local509 + 32 > arg3 && arg1 > local509 && arg5 < local527 + 32 && arg4 > local527 || Static70.aClass146_5 == local38 && local277 == Static61.anInt1206) {
													@Pc(1529) Class1_Sub1_Sub3 local1529;
													if (Static197.anInt3990 == 1 && local277 == Static77.anInt5411 && local38.anInt4355 == Static122.anInt2468) {
														local1529 = Static315.method4652(local38.aBoolean297, 0, null, local38.anIntArray353[local277], 2, local568);
													} else {
														local1529 = Static315.method4652(local38.aBoolean297, 3153952, null, local38.anIntArray353[local277], 1, local568);
													}
													if (Static18.aBoolean19) {
														Static132.aBooleanArray25[local62] = true;
													}
													if (local1529 == null) {
														Static237.method2927(local38);
													} else if (local38 == Static70.aClass146_5 && Static61.anInt1206 == local277) {
														local523 = Static152.anInt3132 - Static130.anInt2573;
														local557 = Static300.anInt5678 - Static137.anInt2717;
														if (local523 < 5 && local523 > -5) {
															local523 = 0;
														}
														if (local557 < 5 && local557 > -5) {
															local557 = 0;
														}
														if (Static208.anInt4109 < 5) {
															local557 = 0;
															local523 = 0;
														}
														local1529.method4635(local523 + local509, local557 + local527, 128);
														if (arg6 != -1) {
															@Pc(1646) Class146 local1646 = arg0[arg6 & 0xFFFF];
															@Pc(1650) int local1650;
															@Pc(1652) int local1652;
															if (Static291.aBoolean404) {
																local1650 = Static133.anInt2677;
																local1652 = Static133.anInt2674;
															} else {
																local1650 = Static41.anInt824;
																local1652 = Static41.anInt827;
															}
															@Pc(1679) int local1679;
															if (local527 + local557 < local1650 && local1646.anInt4418 > 0) {
																local1679 = (local1650 - local527 - local557) * Static147.anInt2946 / 3;
																if (local1679 > Static147.anInt2946 * 10) {
																	local1679 = Static147.anInt2946 * 10;
																}
																if (local1679 > local1646.anInt4418) {
																	local1679 = local1646.anInt4418;
																}
																Static137.anInt2717 += local1679;
																local1646.anInt4418 -= local1679;
																Static237.method2927(local1646);
															}
															if (local557 + local527 + 32 > local1652 && local1646.anInt4418 < local1646.anInt4383 - local1646.anInt4371) {
																local1679 = (local557 + local527 + 32 - local1652) * Static147.anInt2946 / 3;
																if (Static147.anInt2946 * 10 < local1679) {
																	local1679 = Static147.anInt2946 * 10;
																}
																if (local1646.anInt4383 - local1646.anInt4418 - local1646.anInt4371 < local1679) {
																	local1679 = local1646.anInt4383 - local1646.anInt4371 - local1646.anInt4418;
																}
																Static137.anInt2717 -= local1679;
																local1646.anInt4418 += local1679;
																Static237.method2927(local1646);
															}
														}
													} else if (Static97.aClass146_8 == local38 && Static138.anInt2720 == local277) {
														local1529.method4635(local509, local527, 128);
													} else {
														local1529.method4628(local509, local527);
													}
												}
											} else if (local38.anIntArray357 != null && local277 < 20) {
												@Pc(1446) Class1_Sub1_Sub3 local1446 = local38.method3517(local277);
												if (local1446 != null) {
													local1446.method4628(local509, local527);
												} else if (Static49.aBoolean75) {
													Static237.method2927(local38);
												}
											}
											local277++;
										}
									}
								} else if (local38.anInt4370 == 3) {
									if (Static130.method2054(local38)) {
										local277 = local38.anInt4362;
										if (Static56.aClass146_4 == local38 && local38.anInt4376 != 0) {
											local277 = local38.anInt4376;
										}
									} else {
										local277 = local38.anInt4422;
										if (Static56.aClass146_4 == local38 && local38.anInt4414 != 0) {
											local277 = local38.anInt4414;
										}
									}
									if (local127 == 0) {
										if (local38.aBoolean302) {
											if (Static291.aBoolean404) {
												Static133.method2176(local119, local124, local38.anInt4345, local38.anInt4371, local277);
											} else {
												Static41.method730(local119, local124, local38.anInt4345, local38.anInt4371, local277);
											}
										} else if (Static291.aBoolean404) {
											Static133.method2164(local119, local124, local38.anInt4345, local38.anInt4371, local277);
										} else {
											Static41.method729(local119, local124, local38.anInt4345, local38.anInt4371, local277);
										}
									} else if (local38.aBoolean302) {
										if (Static291.aBoolean404) {
											Static133.method2177(local119, local124, local38.anInt4345, local38.anInt4371, local277, 256 - (local127 & 0xFF));
										} else {
											Static41.method728(local119, local124, local38.anInt4345, local38.anInt4371, local277, 256 - (local127 & 0xFF));
										}
									} else if (Static291.aBoolean404) {
										Static133.method2170(local119, local124, local38.anInt4345, local38.anInt4371, local277, 256 - (local127 & 0xFF));
									} else {
										Static41.method727(local119, local124, local38.anInt4345, local38.anInt4371, local277, 256 - (local127 & 0xFF));
									}
								} else {
									@Pc(1969) Class1_Sub1_Sub12 local1969;
									if (local38.anInt4370 == 4) {
										local1969 = local38.method3518(Static197.aClass103Array3);
										if (local1969 != null) {
											@Pc(1982) String local1982 = local38.aString146;
											if (Static130.method2054(local38)) {
												local290 = local38.anInt4362;
												if (Static56.aClass146_4 == local38 && local38.anInt4376 != 0) {
													local290 = local38.anInt4376;
												}
												if (local38.aString140.length() > 0) {
													local1982 = local38.aString140;
												}
											} else {
												local290 = local38.anInt4422;
												if (local38 == Static56.aClass146_4 && local38.anInt4414 != 0) {
													local290 = local38.anInt4414;
												}
											}
											if (local38.aBoolean299 && local38.anInt4405 != -1) {
												@Pc(2036) Class149 local2036 = Static271.method4006(local38.anInt4405);
												local1982 = local2036.aString159;
												if (local1982 == null) {
													local1982 = "null";
												}
												if ((local2036.anInt4790 == 1 || local38.anInt4344 != 1) && local38.anInt4344 != -1) {
													local1982 = "<col=ff9040>" + local1982 + "</col> x" + Static305.method4552(local38.anInt4344);
												}
											}
											if (local38 == Static92.aClass146_7) {
												local1982 = Static188.aString124;
												local290 = local38.anInt4422;
											}
											if (!local38.aBoolean299) {
												local1982 = Static14.method203(local38, local1982);
											}
											local1969.method4427(local1982, local119, local124, local38.anInt4345, local38.anInt4371, local290, local38.aBoolean305 ? 0 : -1, local38.anInt4429, local38.anInt4430, local38.anInt4403);
										} else if (Static49.aBoolean75) {
											Static237.method2927(local38);
										}
									} else if (local38.anInt4370 == 5) {
										@Pc(2191) Class1_Sub1_Sub3 local2191;
										if (!local38.aBoolean299) {
											local2191 = local38.method3519(Static130.method2054(local38));
											if (local2191 != null) {
												local2191.method4628(local119, local124);
											} else if (Static49.aBoolean75) {
												Static237.method2927(local38);
											}
										} else if (local38.anInt4365 >= 0) {
											@Pc(2131) Class190 local2131 = local38.method3511();
											if (Static291.aBoolean404) {
												local2131.method4565(0, local119, local124, local38.anInt4345, local38.anInt4371, local38.anInt4378, local38.anInt4377, 0);
											} else {
												local2131.method4562(0, local119, local124, local38.anInt4345, local38.anInt4371, local38.anInt4378, local38.anInt4377);
											}
										} else {
											if (local38.anInt4405 == -1) {
												local2191 = local38.method3519(false);
											} else if (local38.aBoolean304 && Static229.aClass22_Sub3_Sub2_2.aClass119_2 != null) {
												local2191 = Static315.method4652(local38.aBoolean297, local38.anInt4381, Static229.aClass22_Sub3_Sub2_2.aClass119_2, local38.anInt4344, local38.anInt4358, local38.anInt4405);
											} else {
												local2191 = Static315.method4652(local38.aBoolean297, local38.anInt4381, null, local38.anInt4344, local38.anInt4358, local38.anInt4405);
											}
											if (local2191 != null) {
												local290 = local2191.anInt5889;
												local470 = local2191.anInt5884;
												if (local38.aBoolean314) {
													local527 = (local470 + local38.anInt4371 - 1) / local470;
													local509 = (local290 + local38.anInt4345 - 1) / local290;
													if (Static291.aBoolean404) {
														Static133.method2163(local119, local124, local119 + local38.anInt4345, local38.anInt4371 + local124);
														@Pc(2339) boolean local2339 = Static219.method3494(local2191.anInt5875);
														@Pc(2342) Class1_Sub1_Sub3_Sub1 local2342 = (Class1_Sub1_Sub3_Sub1) local2191;
														@Pc(2347) boolean local2347 = Static219.method3494(local2191.anInt5887);
														if (local2339 && local2347) {
															if (local127 == 0) {
																local2342.method4640(local119, local124, local509, local527);
															} else {
																local2342.method4643(local119, local124, 256 - (local127 & 0xFF), local509, local527);
															}
														} else if (local2339) {
															for (local588 = 0; local588 < local527; local588++) {
																if (local127 == 0) {
																	local2342.method4640(local119, local588 * local470 + local124, local509, 1);
																} else {
																	local2342.method4643(local119, local124 + local470 * local588, -(local127 & 0xFF) + 256, local509, 1);
																}
															}
														} else if (local2347) {
															for (local588 = 0; local588 < local509; local588++) {
																if (local127 == 0) {
																	local2342.method4640(local119 + local290 * local588, local124, 1, local527);
																} else {
																	local2342.method4643(local119 + local290 * local588, local124, 256 - (local127 & 0xFF), 1, local527);
																}
															}
														} else {
															for (local588 = 0; local588 < local509; local588++) {
																for (local604 = 0; local604 < local527; local604++) {
																	if (local127 == 0) {
																		local2191.method4628(local119 + local588 * local290, local470 * local604 + local124);
																	} else {
																		local2191.method4635(local588 * local290 + local119, local124 - -(local470 * local604), 256 - (local127 & 0xFF));
																	}
																}
															}
														}
														Static133.method2180(arg3, arg5, arg1, arg4);
													} else {
														Static41.method732(local119, local124, local38.anInt4345 + local119, local38.anInt4371 + local124);
														for (local523 = 0; local523 < local509; local523++) {
															for (local557 = 0; local557 < local527; local557++) {
																if (local38.anInt4363 != 0) {
																	local2191.method4636(4096, local119 + local290 * local523 + local290 / 2, local470 * local557 + local124 + local470 / 2, local38.anInt4363);
																} else if (local127 == 0) {
																	local2191.method4628(local290 * local523 + local119, local124 + local470 * local557);
																} else {
																	local2191.method4635(local290 * local523 + local119, local557 * local470 + local124, 256 - (local127 & 0xFF));
																}
															}
														}
														Static41.method739(arg3, arg5, arg1, arg4);
													}
												} else {
													local509 = local38.anInt4345 * 4096 / local290;
													if (local38.anInt4363 != 0) {
														local2191.method4636(local509, local38.anInt4345 / 2 + local119, local124 + local38.anInt4371 / 2, local38.anInt4363);
													} else if (local127 != 0) {
														local2191.method4629(local119, local124, local38.anInt4345, local38.anInt4371, 256 - (local127 & 0xFF));
													} else if (local290 == local38.anInt4345 && local38.anInt4371 == local470) {
														local2191.method4628(local119, local124);
													} else {
														local2191.method4631(local119, local124, local38.anInt4345, local38.anInt4371);
													}
												}
											} else if (Static49.aBoolean75) {
												Static237.method2927(local38);
											}
										}
									} else {
										@Pc(2704) Class149 local2704;
										if (local38.anInt4370 == 6) {
											@Pc(2681) boolean local2681 = Static130.method2054(local38);
											if (local2681) {
												local290 = local38.anInt4433;
											} else {
												local290 = local38.anInt4367;
											}
											@Pc(2693) Class22_Sub4 local2693 = null;
											local509 = 0;
											if (local38.anInt4405 != -1) {
												local2704 = Static271.method4006(local38.anInt4405);
												if (local2704 != null) {
													local2704 = local2704.method3731(local38.anInt4344);
													@Pc(2721) Class167 local2721 = local290 == -1 ? null : Static313.method4648(local290);
													if (local38.aBoolean304 && Static229.aClass22_Sub3_Sub2_2.aClass119_2 != null) {
														local2693 = local2704.method3734(local38.anInt4408, Static229.aClass22_Sub3_Sub2_2.aClass119_2, local38.anInt4353, local38.anInt4388, 1, local2721);
													} else {
														local2693 = local2704.method3734(local38.anInt4408, null, local38.anInt4353, local38.anInt4388, 1, local2721);
													}
													if (local2693 == null) {
														Static237.method2927(local38);
													} else {
														local509 = -local2693.method4071() / 2;
													}
												}
											} else if (local38.anInt4409 == 5) {
												if (local38.anInt4389 == -1) {
													local2693 = Static51.aClass119_1.method3030(null, -1, 0, -1, 0, -1, null, -1, false, null, true);
												} else {
													local527 = local38.anInt4389;
													@Pc(2805) Class22_Sub3_Sub2 local2805;
													if (local527 == Static117.anInt2308) {
														local2805 = Static229.aClass22_Sub3_Sub2_2;
													} else {
														local2805 = Static195.aClass22_Sub3_Sub2Array1[local527];
													}
													@Pc(2819) Class167 local2819 = local290 == -1 ? null : Static313.method4648(local290);
													if (local2805 != null && (local527 == 2047 || Static2.method36(local2805.aString153) == local38.anInt4397)) {
														local2693 = local2805.aClass119_2.method3030(local2819, -1, 0, local38.anInt4388, 0, 0, null, -1, false, null, true);
													}
												}
											} else if (local290 == -1) {
												local2693 = local38.method3510(-1, 0, -1, local2681, null, Static229.aClass22_Sub3_Sub2_2.aClass119_2);
												if (local2693 == null && Static49.aBoolean75) {
													Static237.method2927(local38);
												}
											} else {
												@Pc(2863) Class167 local2863 = Static313.method4648(local290);
												local2693 = local38.method3510(local38.anInt4408, local38.anInt4353, local38.anInt4388, local2681, local2863, Static229.aClass22_Sub3_Sub2_2.aClass119_2);
												if (local2693 == null && Static49.aBoolean75) {
													Static237.method2927(local38);
												}
											}
											if (local2693 != null) {
												if (local38.anInt4402 <= 0) {
													local527 = 256;
												} else {
													local527 = (local38.anInt4345 << 8) / local38.anInt4402;
												}
												if (local38.anInt4347 > 0) {
													local523 = (local38.anInt4371 << 8) / local38.anInt4347;
												} else {
													local523 = 256;
												}
												local557 = local119 + local38.anInt4345 / 2 + (local527 * local38.anInt4356 >> 8);
												local568 = (local38.anInt4352 * local523 >> 8) + local38.anInt4371 / 2 + local124;
												if (Static291.aBoolean404) {
													if (local38.aBoolean308) {
														Static291.method4317(local557, local568, local38.anInt4366, local38.aShort24, local527, local523);
													} else {
														Static291.method4308(local557, local568, local527, local523);
														Static291.method4291((float) local38.aShort25, (float) local38.aShort24 * 1.5F);
													}
													Static291.method4293();
													Static291.method4292(true);
													Static291.method4321(false);
													Static191.method3138(Static287.anInt5449);
													if (Static218.aBoolean293) {
														Static133.method2166();
														Static291.method4315();
														Static133.method2180(arg3, arg5, arg1, arg4);
														Static218.aBoolean293 = false;
													}
													if (local38.aBoolean300) {
														Static291.method4330();
													}
													local588 = Class17.anIntArray22[local38.anInt4351] * local38.anInt4366 >> 16;
													local604 = Class17.anIntArray24[local38.anInt4351] * local38.anInt4366 >> 16;
													if (local38.aBoolean299) {
														local2693.method3571(local38.anInt4400, local38.anInt4427, local38.anInt4351, local38.anInt4343, local588 + local509 + local38.anInt4432, local604 - -local38.anInt4432, -1L);
													} else {
														local2693.method3571(local38.anInt4400, 0, local38.anInt4351, 0, local588, local604, -1L);
													}
													if (local38.aBoolean300) {
														Static291.method4333();
													}
												} else {
													Static18.method304(local557, local568);
													local588 = local38.anInt4366 * Class17.anIntArray22[local38.anInt4351] >> 16;
													local604 = local38.anInt4366 * Class17.anIntArray24[local38.anInt4351] >> 16;
													if (!local38.aBoolean299) {
														local2693.method3571(local38.anInt4400, 0, local38.anInt4351, 0, local588, local604, -1L);
													} else if (local38.aBoolean308) {
														((Class22_Sub4_Sub2) local2693).method3593(local38.anInt4400, local38.anInt4427, local38.anInt4351, local38.anInt4343, local38.anInt4432 + local509 + local588, local38.anInt4432 + local604, local38.anInt4366);
													} else {
														local2693.method3571(local38.anInt4400, local38.anInt4427, local38.anInt4351, local38.anInt4343, local509 + local588 + local38.anInt4432, local604 - -local38.anInt4432, -1L);
													}
													Static18.method315();
												}
											}
										} else {
											if (local38.anInt4370 == 7) {
												local1969 = local38.method3518(Static197.aClass103Array3);
												if (local1969 == null) {
													if (Static49.aBoolean75) {
														Static237.method2927(local38);
													}
													continue;
												}
												local290 = 0;
												for (local470 = 0; local470 < local38.anInt4391; local470++) {
													for (local509 = 0; local509 < local38.anInt4357; local509++) {
														if (local38.anIntArray358[local290] > 0) {
															local2704 = Static271.method4006(local38.anIntArray358[local290] - 1);
															@Pc(3274) String local3274;
															if (local2704.anInt4790 != 1 && local38.anIntArray353[local290] == 1) {
																local3274 = "<col=ff9040>" + local2704.aString159 + "</col>";
															} else {
																local3274 = "<col=ff9040>" + local2704.aString159 + "</col> x" + Static305.method4552(local38.anIntArray353[local290]);
															}
															local568 = local124 + (local38.anInt4415 + 12) * local470;
															local557 = (local38.anInt4375 + 115) * local509 + local119;
															if (local38.anInt4429 == 0) {
																local1969.method4421(local3274, local557, local568, local38.anInt4422, local38.aBoolean305 ? 0 : -1);
															} else if (local38.anInt4429 == 1) {
																local1969.method4432(local3274, local557 + 57, local568, local38.anInt4422, local38.aBoolean305 ? 0 : -1);
															} else {
																local1969.method4436(local3274, local557 + 115 - 1, local568, local38.anInt4422, local38.aBoolean305 ? 0 : -1);
															}
														}
														local290++;
													}
												}
											}
											if (local38.anInt4370 == 8 && local38 == Static292.aClass146_18 && Static208.anInt4106 == Static121.anInt2450) {
												local277 = 0;
												local290 = 0;
												@Pc(3388) Class1_Sub1_Sub12 local3388 = Static233.aClass1_Sub1_Sub12_3;
												@Pc(3391) String local3391 = local38.aString146;
												local3391 = Static14.method203(local38, local3391);
												@Pc(3412) String local3412;
												while (local3391.length() > 0) {
													local523 = local3391.indexOf("<br>");
													if (local523 == -1) {
														local3412 = local3391;
														local3391 = "";
													} else {
														local3412 = local3391.substring(0, local523);
														local3391 = local3391.substring(local523 + 4);
													}
													local557 = local3388.method4438(local3412);
													local290 += local3388.anInt5613 + 1;
													if (local277 < local557) {
														local277 = local557;
													}
												}
												local290 += 7;
												local277 += 6;
												local557 = local124 + local38.anInt4371 + 5;
												local523 = local119 + local38.anInt4345 - local277 - 5;
												if (local119 + 5 > local523) {
													local523 = local119 + 5;
												}
												if (arg1 < local523 + local277) {
													local523 = arg1 - local277;
												}
												if (local290 + local557 > arg4) {
													local557 = arg4 - local290;
												}
												if (Static291.aBoolean404) {
													Static133.method2176(local523, local557, local277, local290, 16777120);
													Static133.method2164(local523, local557, local277, local290, 0);
												} else {
													Static41.method730(local523, local557, local277, local290, 16777120);
													Static41.method729(local523, local557, local277, local290, 0);
												}
												local3391 = local38.aString146;
												local568 = local557 + local3388.anInt5613 + 2;
												local3391 = Static14.method203(local38, local3391);
												while (local3391.length() > 0) {
													local588 = local3391.indexOf("<br>");
													if (local588 == -1) {
														local3412 = local3391;
														local3391 = "";
													} else {
														local3412 = local3391.substring(0, local588);
														local3391 = local3391.substring(local588 + 4);
													}
													local3388.method4421(local3412, local523 + 3, local568, 0, -1);
													local568 += local3388.anInt5613 + 1;
												}
											}
											if (local38.anInt4370 == 9) {
												if (local38.aBoolean309) {
													local470 = local38.anInt4345 + local119;
													local290 = local38.anInt4371 + local124;
													local509 = local124;
												} else {
													local509 = local38.anInt4371 + local124;
													local470 = local38.anInt4345 + local119;
													local290 = local124;
												}
												if (local38.anInt4434 == 1) {
													if (Static291.aBoolean404) {
														Static133.method2165(local119, local290, local470, local509, local38.anInt4422);
													} else {
														Static41.method733(local119, local290, local470, local509, local38.anInt4422);
													}
												} else if (Static291.aBoolean404) {
													Static133.method2168(local119, local290, local470, local509, local38.anInt4422, local38.anInt4434);
												} else {
													Static41.method745(local119, local290, local470, local509, local38.anInt4422, local38.anInt4434);
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
}
