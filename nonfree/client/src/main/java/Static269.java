import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ul", name = "Q", descriptor = "Lclient!mn;")
	public static Class115 aClass115_16;

	@OriginalMember(owner = "client!ul", name = "S", descriptor = "J")
	public static long aLong281 = 0L;

	@OriginalMember(owner = "client!ul", name = "W", descriptor = "Lclient!ec;")
	public static Class46 aClass46_38 = new Class46(64);

	@OriginalMember(owner = "client!ul", name = "Z", descriptor = "I")
	public static int anInt5585 = 1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method4486(@OriginalArg(1) Class2_Sub26 arg0) {
		if (arg0.aByteArray72.length - arg0.anInt5328 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4261();
		if (local21 < 0 || local21 > 11) {
			return;
		}
		@Pc(34) byte local34;
		if (local21 == 11) {
			local34 = 33;
		} else if (local21 == 10) {
			local34 = 32;
		} else if (local21 == 9) {
			local34 = 31;
		} else if (local21 == 8) {
			local34 = 30;
		} else if (local21 == 7) {
			local34 = 29;
		} else if (local21 == 6) {
			local34 = 28;
		} else if (local21 == 5) {
			local34 = 28;
		} else if (local21 == 4) {
			local34 = 24;
		} else if (local21 == 3) {
			local34 = 23;
		} else if (local21 == 2) {
			local34 = 22;
		} else if (local21 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (arg0.aByteArray72.length - arg0.anInt5328 < local34) {
			return;
		}
		Static105.anInt2269 = arg0.method4261();
		if (Static105.anInt2269 < 1) {
			Static105.anInt2269 = 1;
		} else if (Static105.anInt2269 > 4) {
			Static105.anInt2269 = 4;
		}
		Static255.method4118(arg0.method4261() == 1);
		Static43.aBoolean77 = arg0.method4261() == 1;
		Static106.aBoolean183 = arg0.method4261() == 1;
		Static126.aBoolean211 = arg0.method4261() == 1;
		Static150.aBoolean262 = arg0.method4261() == 1;
		Static242.aBoolean414 = arg0.method4261() == 1;
		Static96.aBoolean166 = arg0.method4261() == 1;
		Static284.aBoolean475 = arg0.method4261() == 1;
		Static195.anInt4041 = arg0.method4261();
		if (Static195.anInt4041 > 2) {
			Static195.anInt4041 = 2;
		}
		if (local21 >= 2) {
			Static56.aBoolean96 = arg0.method4261() == 1;
		} else {
			Static56.aBoolean96 = arg0.method4261() == 1;
			arg0.method4261();
		}
		Static233.aBoolean407 = arg0.method4261() == 1;
		Static102.aBoolean176 = arg0.method4261() == 1;
		Static84.anInt817 = arg0.method4261();
		if (Static84.anInt817 > 2) {
			Static84.anInt817 = 2;
		}
		Static287.anInt5952 = Static84.anInt817;
		Static183.aBoolean332 = arg0.method4261() == 1;
		Static214.anInt4468 = arg0.method4261();
		if (Static214.anInt4468 > 127) {
			Static214.anInt4468 = 127;
		}
		Static91.anInt2030 = arg0.method4261();
		Static144.anInt3122 = arg0.method4261();
		if (Static144.anInt3122 > 127) {
			Static144.anInt3122 = 127;
		}
		if (local21 >= 1) {
			Static163.anInt3419 = arg0.method4242();
			Static267.anInt4121 = arg0.method4242();
		}
		if (local21 >= 3 && local21 < 6) {
			arg0.method4261();
		}
		if (local21 >= 4) {
			@Pc(364) int local364 = arg0.method4261();
			if (Static171.anInt3655 < 96) {
				local364 = 0;
			}
			Static179.method3100(local364);
		}
		if (local21 >= 5) {
			Static225.anInt4698 = arg0.method4228();
		}
		if (local21 >= 6) {
			Static2.anInt5946 = arg0.method4261();
		}
		if (local21 >= 7) {
			Static133.aBoolean220 = arg0.method4261() == 1;
		}
		if (local21 >= 8) {
			Static236.aBoolean408 = arg0.method4261() == 1;
		}
		if (local21 >= 9) {
			Static171.anInt3648 = arg0.method4261();
		}
		if (local21 >= 10) {
			Static97.aBoolean169 = arg0.method4261() != 0;
		}
		if (local21 >= 11) {
			Static246.aBoolean422 = arg0.method4261() != 0;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIII[Lclient!mn;III)V")
	public static void method4488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class115[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (Static60.aBoolean106) {
			Static94.method1752(arg5, arg8, arg1, arg4);
		} else {
			Static160.method2781(arg5, arg8, arg1, arg4);
			Static93.method1725();
		}
		for (@Pc(18) int local18 = 0; local18 < arg6.length; local18++) {
			@Pc(26) Class115 local26 = arg6[local18];
			if (local26 != null && (arg2 == local26.anInt3525 || arg2 == -1412584499 && local26 == Static23.aClass115_3)) {
				@Pc(77) int local77;
				if (arg7 == -1) {
					Static12.anIntArray14[Static231.anInt4776] = local26.anInt3556 + arg0;
					Static113.anIntArray166[Static231.anInt4776] = local26.anInt3536 + arg3;
					Static295.anIntArray526[Static231.anInt4776] = local26.anInt3555;
					Static264.anIntArray483[Static231.anInt4776] = local26.anInt3487;
					local77 = Static231.anInt4776++;
				} else {
					local77 = arg7;
				}
				local26.anInt3471 = local77;
				local26.anInt3542 = Static148.anInt3168;
				if (!local26.aBoolean291 || !Static35.method701(local26)) {
					if (local26.anInt3544 > 0) {
						Static64.method1249(local26);
					}
					@Pc(105) int local105 = arg3 + local26.anInt3536;
					@Pc(111) int local111 = local26.anInt3556 + arg0;
					@Pc(114) int local114 = local26.anInt3500;
					if (Static202.aBoolean348 && (Static35.method708(local26).anInt1534 != 0 || local26.anInt3538 == 0) && local114 > 127) {
						local114 = 127;
					}
					@Pc(159) int local159;
					@Pc(195) int local195;
					if (Static23.aClass115_3 == local26) {
						if (arg2 != -1412584499 && !local26.aBoolean293) {
							Static185.aClass115Array2 = arg6;
							Static156.anInt5522 = arg0;
							Static150.anInt3182 = arg3;
							continue;
						}
						if (Static242.aBoolean412 && Static197.aBoolean343) {
							local159 = Static86.anInt1911;
							local159 -= Static250.anInt4975;
							if (Static297.anInt6214 > local159) {
								local159 = Static297.anInt6214;
							}
							if (Static297.anInt6214 + Static11.aClass115_1.anInt3555 < local159 - -local26.anInt3555) {
								local159 = Static11.aClass115_1.anInt3555 + Static297.anInt6214 - local26.anInt3555;
							}
							local195 = Static238.anInt4852;
							local195 -= Static90.anInt2002;
							if (local195 < Static191.anInt706) {
								local195 = Static191.anInt706;
							}
							if (local195 + local26.anInt3487 > Static11.aClass115_1.anInt3487 + Static191.anInt706) {
								local195 = Static191.anInt706 + Static11.aClass115_1.anInt3487 - local26.anInt3487;
							}
							local105 = local195;
							local111 = local159;
						}
						if (!local26.aBoolean293) {
							local114 = 128;
						}
					}
					@Pc(279) int local279;
					@Pc(301) int local301;
					@Pc(259) int local259;
					@Pc(254) int local254;
					if (local26.anInt3538 == 2) {
						local159 = arg5;
						local195 = arg8;
						local301 = arg4;
						local279 = arg1;
					} else {
						local159 = local111 > arg5 ? local111 : arg5;
						local254 = local105 + local26.anInt3487;
						local259 = local26.anInt3555 + local111;
						if (local26.anInt3538 == 9) {
							local254++;
							local259++;
						}
						local279 = local259 >= arg1 ? arg1 : local259;
						local195 = local105 > arg8 ? local105 : arg8;
						local301 = arg4 <= local254 ? arg4 : local254;
					}
					if (!local26.aBoolean291 || local279 > local159 && local195 < local301) {
						@Pc(455) int local455;
						@Pc(489) int local489;
						@Pc(493) int local493;
						@Pc(505) int local505;
						@Pc(523) int local523;
						@Pc(548) int local548;
						@Pc(538) int local538;
						@Pc(565) int local565;
						if (local26.anInt3544 != 0) {
							if (local26.anInt3544 == 1337 || local26.anInt3544 == 1403) {
								Static197.anInt4133 = local105;
								Static180.anInt3872 = local111;
								Static74.aClass115_8 = local26;
								Static65.method1259(local26.anInt3487, local26.anInt3544 == 1403, local105, local111, local26.anInt3555);
								Static165.aBooleanArray16[local77] = true;
								if (Static60.aBoolean106) {
									Static94.method1752(arg5, arg8, arg1, arg4);
								} else {
									Static160.method2781(arg5, arg8, arg1, arg4);
								}
								continue;
							}
							if (local26.anInt3544 == 1338) {
								if (!local26.method2864()) {
									continue;
								}
								Static87.method1632(local111, local77, local26, local105);
								if (Static60.aBoolean106) {
									Static94.method1752(arg5, arg8, arg1, arg4);
								} else {
									Static160.method2781(arg5, arg8, arg1, arg4);
								}
								if (Static110.anInt2374 != 0 && Static110.anInt2374 != 3 || Static299.aBoolean203 || Static9.anInt275 < local159 || local195 > Static68.anInt1506 || Static9.anInt275 >= local279 || local301 <= Static68.anInt1506) {
									continue;
								}
								local259 = Static9.anInt275 - local111;
								local254 = Static68.anInt1506 - local105;
								local455 = local26.anIntArray269[local254];
								if (local455 > local259 || local455 + local26.anIntArray277[local254] < local259) {
									continue;
								}
								local254 -= local26.anInt3487 / 2;
								local259 -= local26.anInt3555 / 2;
								local489 = Static293.anInt6086 + (int) Static142.aFloat31 & 0x7FF;
								local493 = Class66.anIntArray148[local489];
								local493 = (Static266.anInt5527 + 256) * local493 >> 8;
								local505 = Class66.anIntArray153[local489];
								local505 = (Static266.anInt5527 + 256) * local505 >> 8;
								local523 = local259 * local505 + local254 * local493 >> 11;
								local538 = Static111.aClass36_Sub3_Sub2_1.anInt5093 + local523 - (Static111.aClass36_Sub3_Sub2_1.method4097() - 1) * 64 >> 7;
								local548 = local254 * local505 - local493 * local259 >> 11;
								local565 = Static111.aClass36_Sub3_Sub2_1.anInt5109 - local548 - (Static111.aClass36_Sub3_Sub2_1.method4097() + -1) * 64 >> 7;
								if (Static133.aBoolean219 && (Static212.anInt4455 & 0x40) != 0) {
									@Pc(576) Class115 local576 = Static266.method4442(Static25.anInt5783, Static297.anInt6213);
									if (local576 == null) {
										Static207.method3484();
									} else {
										Static32.method642((short) 26, local565, 1L, Static112.anInt2421, local538, " ->", Static296.aString299);
									}
									continue;
								}
								if (Static84.anInt825 == 1) {
									Static32.method642((short) 13, local565, 1L, -1, local538, "", Static156.aString259);
								}
								Static32.method642((short) 6, local565, 1L, -1, local538, "", Static69.aString79);
								continue;
							}
							if (local26.anInt3544 == 1339) {
								if (local26.method2864()) {
									Static148.method2600(local105, local26, local111, local77);
									if (Static60.aBoolean106) {
										Static94.method1752(arg5, arg8, arg1, arg4);
									} else {
										Static160.method2781(arg5, arg8, arg1, arg4);
									}
								}
								continue;
							}
							if (local26.anInt3544 == 1400) {
								Static17.method364(local26.anInt3555, local105, local111, local26.anInt3487);
								Static165.aBooleanArray16[local77] = true;
								Static90.aBooleanArray9[local77] = true;
								if (Static60.aBoolean106) {
									Static94.method1752(arg5, arg8, arg1, arg4);
								} else {
									Static160.method2781(arg5, arg8, arg1, arg4);
								}
								continue;
							}
							if (local26.anInt3544 == 1401) {
								Static137.method2429(local26.anInt3555, local111, local26.anInt3487, local105);
								Static165.aBooleanArray16[local77] = true;
								Static90.aBooleanArray9[local77] = true;
								if (Static60.aBoolean106) {
									Static94.method1752(arg5, arg8, arg1, arg4);
								} else {
									Static160.method2781(arg5, arg8, arg1, arg4);
								}
								continue;
							}
							if (local26.anInt3544 == 1402) {
								if (!Static60.aBoolean106) {
									Static291.method4822(local111, local105);
									Static165.aBooleanArray16[local77] = true;
									Static90.aBooleanArray9[local77] = true;
								}
								continue;
							}
							if (local26.anInt3544 == 1405) {
								if (!Static173.aBoolean307) {
									continue;
								}
								local254 = local105 + 15;
								local259 = local111 + local26.anInt3555;
								Static208.aClass2_Sub3_Sub5_3.method3314("Fps:" + Static104.anInt2261, local259, local254, 16776960, -1);
								@Pc(779) Runtime local779 = Runtime.getRuntime();
								local489 = (int) ((local779.totalMemory() - local779.freeMemory()) / 1024L);
								local254 += 15;
								local493 = 16776960;
								if (local489 > 65536) {
									local493 = 16711680;
								}
								Static208.aClass2_Sub3_Sub5_3.method3314("Mem:" + local489 + "k", local259, local254, local493, -1);
								local254 += 15;
								if (Static60.aBoolean106) {
									local493 = 16776960;
									local505 = (Static256.anInt5188 + Static256.anInt5187 + Static256.anInt5186) / 1024;
									if (local505 > 65536) {
										local493 = 16711680;
									}
									Static208.aClass2_Sub3_Sub5_3.method3314("Card:" + local505 + "k", local259, local254, local493, -1);
									local254 += 15;
								}
								local505 = 0;
								local548 = 0;
								local523 = 0;
								for (local538 = 0; local538 < 29; local538++) {
									local505 += Static172.aClass63_Sub1Array2[local538].method3804();
									local523 += Static172.aClass63_Sub1Array2[local538].method3809();
									local548 += Static172.aClass63_Sub1Array2[local538].method3800();
								}
								local538 = local548 * 100 / local505;
								local565 = local523 * 10000 / local505;
								@Pc(929) String local929 = "Cache:" + Static61.method2450(true, 2, (long) local565, 0) + "% (" + local538 + "%)";
								Static162.aClass2_Sub3_Sub5_2.method3314(local929, local259, local254, 16776960, -1);
								local254 += 12;
								Static165.aBooleanArray16[local77] = true;
								Static90.aBooleanArray9[local77] = true;
								continue;
							}
							if (local26.anInt3544 == 1406) {
								Static272.anInt5669 = local105;
								Static104.aClass115_9 = local26;
								Static226.anInt1976 = local111;
								continue;
							}
						}
						if (!Static299.aBoolean203) {
							if (local26.anInt3538 == 0 && local26.aBoolean295 && Static9.anInt275 >= local159 && Static68.anInt1506 >= local195 && local279 > Static9.anInt275 && Static68.anInt1506 < local301 && !Static202.aBoolean348) {
								Static250.aStringArray28[0] = Static224.aString233;
								Static214.aStringArray22[0] = "";
								Static77.anIntArray116[0] = Static260.anInt5409;
								Static216.anInt4481 = 1;
								Static289.aShortArray93[0] = 1005;
							}
							if (Static9.anInt275 >= local159 && Static68.anInt1506 >= local195 && local279 > Static9.anInt275 && Static68.anInt1506 < local301) {
								Static190.method3490(local26, Static68.anInt1506 - local105, Static9.anInt275 + -local111);
							}
						}
						if (local26.anInt3538 == 0) {
							if (!local26.aBoolean291 && Static35.method701(local26) && local26 != Static109.aClass115_10) {
								continue;
							}
							if (!local26.aBoolean291) {
								if (local26.anInt3464 - local26.anInt3487 < local26.anInt3514) {
									local26.anInt3514 = local26.anInt3464 - local26.anInt3487;
								}
								if (local26.anInt3514 < 0) {
									local26.anInt3514 = 0;
								}
							}
							if (Static60.aBoolean106 && local26.anInt3544 == 1407) {
								Static276.method4593(local111, local105, local26.anInt3555, local26.anInt3487);
							}
							method4488(local111 - local26.anInt3529, local279, local26.anInt3552, local105 - local26.anInt3514, local301, local159, arg6, local77, local195);
							if (local26.aClass115Array1 != null) {
								method4488(local111 - local26.anInt3529, local279, local26.anInt3552, local105 - local26.anInt3514, local301, local159, local26.aClass115Array1, local77, local195);
							}
							@Pc(1158) Class2_Sub15 local1158 = (Class2_Sub15) Static152.aClass79_14.method2002((long) local26.anInt3552);
							if (local1158 != null) {
								if (local1158.anInt2420 == 0 && !Static299.aBoolean203 && local159 <= Static9.anInt275 && local195 <= Static68.anInt1506 && local279 > Static9.anInt275 && Static68.anInt1506 < local301 && !Static202.aBoolean348) {
									Static250.aStringArray28[0] = Static224.aString233;
									Static214.aStringArray22[0] = "";
									Static289.aShortArray93[0] = 1005;
									Static216.anInt4481 = 1;
									Static77.anIntArray116[0] = Static260.anInt5409;
								}
								Static11.method252(local195, local301, local105, local279, local111, local1158.anInt2424, local77, local159);
							}
							if (Static60.aBoolean106 && local26.anInt3544 == 1407) {
								Static276.method4596();
							}
							if (Static60.aBoolean106) {
								Static94.method1752(arg5, arg8, arg1, arg4);
							} else {
								Static160.method2781(arg5, arg8, arg1, arg4);
								Static93.method1725();
							}
						}
						if (Static222.aBooleanArray21[local77] || Static219.anInt4589 > 1) {
							if (local26.anInt3538 == 0 && !local26.aBoolean291 && local26.anInt3464 > local26.anInt3487) {
								Static165.method2848(local26.anInt3464, local111 + local26.anInt3555, local26.anInt3514, local26.anInt3487, local105);
							}
							if (local26.anInt3538 != 1) {
								if (local26.anInt3538 == 2) {
									local259 = 0;
									for (local254 = 0; local254 < local26.anInt3475; local254++) {
										for (local455 = 0; local455 < local26.anInt3530; local455++) {
											local493 = local254 * (local26.anInt3492 + 32) + local105;
											local489 = local111 + local455 * (local26.anInt3489 + 32);
											if (local259 < 20) {
												local493 += local26.anIntArray273[local259];
												local489 += local26.anIntArray278[local259];
											}
											if (local26.anIntArray271[local259] > 0) {
												local548 = local26.anIntArray271[local259] - 1;
												if (local489 + 32 > arg5 && arg1 > local489 && arg8 < local493 + 32 && arg4 > local493 || Static292.aClass115_17 == local26 && Static91.anInt2033 == local259) {
													@Pc(1463) Class2_Sub3_Sub1 local1463;
													if (Static106.anInt2305 == 1 && local259 == Static183.anInt3887 && Static15.anInt352 == local26.anInt3552) {
														local1463 = Static226.method1672(local26.aBoolean282, local26.anIntArray270[local259], local548, 0, 2, null);
													} else {
														local1463 = Static226.method1672(local26.aBoolean282, local26.anIntArray270[local259], local548, 3153952, 1, null);
													}
													if (Static93.aBoolean161) {
														Static165.aBooleanArray16[local77] = true;
													}
													if (local1463 == null) {
														Static298.method4263(local26);
													} else if (local26 == Static292.aClass115_17 && local259 == Static91.anInt2033) {
														local505 = Static86.anInt1911 - Static173.anInt3684;
														if (local505 < 5 && local505 > -5) {
															local505 = 0;
														}
														local523 = Static238.anInt4852 - Static140.anInt3024;
														if (local523 < 5 && local523 > -5) {
															local523 = 0;
														}
														if (Static221.anInt4606 < 5) {
															local505 = 0;
															local523 = 0;
														}
														local1463.method4360(local505 + local489, local523 + local493, 128);
														if (arg2 != -1) {
															@Pc(1589) Class115 local1589 = arg6[arg2 & 0xFFFF];
															@Pc(1595) int local1595;
															@Pc(1593) int local1593;
															if (Static60.aBoolean106) {
																local1595 = Static94.anInt2053;
																local1593 = Static94.anInt2052;
															} else {
																local1593 = Static160.anInt3392;
																local1595 = Static160.anInt3391;
															}
															@Pc(1628) int local1628;
															if (local1595 > local523 + local493 && local1589.anInt3514 > 0) {
																local1628 = Static37.anInt906 * (local1595 - local493 - local523) / 3;
																if (local1628 > Static37.anInt906 * 10) {
																	local1628 = Static37.anInt906 * 10;
																}
																if (local1589.anInt3514 < local1628) {
																	local1628 = local1589.anInt3514;
																}
																local1589.anInt3514 -= local1628;
																Static140.anInt3024 += local1628;
																Static298.method4263(local1589);
															}
															if (local523 + local493 + 32 > local1593 && local1589.anInt3514 < local1589.anInt3464 - local1589.anInt3487) {
																local1628 = (local493 + local523 + 32 - local1593) * Static37.anInt906 / 3;
																if (local1628 > Static37.anInt906 * 10) {
																	local1628 = Static37.anInt906 * 10;
																}
																if (local1628 > local1589.anInt3464 - local1589.anInt3514 - local1589.anInt3487) {
																	local1628 = local1589.anInt3464 - local1589.anInt3487 - local1589.anInt3514;
																}
																local1589.anInt3514 += local1628;
																Static140.anInt3024 -= local1628;
																Static298.method4263(local1589);
															}
														}
													} else if (Static198.aClass115_13 == local26 && local259 == Static16.anInt394) {
														local1463.method4360(local489, local493, 128);
													} else {
														local1463.method4367(local489, local493);
													}
												}
											} else if (local26.anIntArray266 != null && local259 < 20) {
												@Pc(1370) Class2_Sub3_Sub1 local1370 = local26.method2860(local259);
												if (local1370 != null) {
													local1370.method4367(local489, local493);
												} else if (Static72.aBoolean128) {
													Static298.method4263(local26);
												}
											}
											local259++;
										}
									}
								} else if (local26.anInt3538 == 3) {
									if (Static262.method4939(local26)) {
										local259 = local26.anInt3510;
										if (local26 == Static109.aClass115_10 && local26.anInt3506 != 0) {
											local259 = local26.anInt3506;
										}
									} else {
										local259 = local26.anInt3543;
										if (local26 == Static109.aClass115_10 && local26.anInt3520 != 0) {
											local259 = local26.anInt3520;
										}
									}
									if (local114 == 0) {
										if (local26.aBoolean290) {
											if (Static60.aBoolean106) {
												Static94.method1758(local111, local105, local26.anInt3555, local26.anInt3487, local259);
											} else {
												Static160.method2788(local111, local105, local26.anInt3555, local26.anInt3487, local259);
											}
										} else if (Static60.aBoolean106) {
											Static94.method1756(local111, local105, local26.anInt3555, local26.anInt3487, local259);
										} else {
											Static160.method2782(local111, local105, local26.anInt3555, local26.anInt3487, local259);
										}
									} else if (local26.aBoolean290) {
										if (Static60.aBoolean106) {
											Static94.method1747(local111, local105, local26.anInt3555, local26.anInt3487, local259, 256 - (local114 & 0xFF));
										} else {
											Static160.method2779(local111, local105, local26.anInt3555, local26.anInt3487, local259, 256 - (local114 & 0xFF));
										}
									} else if (Static60.aBoolean106) {
										Static94.method1757(local111, local105, local26.anInt3555, local26.anInt3487, local259, 256 - (local114 & 0xFF));
									} else {
										Static160.method2778(local111, local105, local26.anInt3555, local26.anInt3487, local259, 256 - (local114 & 0xFF));
									}
								} else {
									@Pc(1933) Class2_Sub3_Sub5 local1933;
									if (local26.anInt3538 == 4) {
										local1933 = local26.method2851(Static4.aClass71Array1);
										if (local1933 != null) {
											@Pc(1948) String local1948 = local26.aString171;
											if (Static262.method4939(local26)) {
												local254 = local26.anInt3510;
												if (local26 == Static109.aClass115_10 && local26.anInt3506 != 0) {
													local254 = local26.anInt3506;
												}
												if (local26.aString174.length() > 0) {
													local1948 = local26.aString174;
												}
											} else {
												local254 = local26.anInt3543;
												if (Static109.aClass115_10 == local26 && local26.anInt3520 != 0) {
													local254 = local26.anInt3520;
												}
											}
											if (local26.aBoolean291 && local26.anInt3504 != -1) {
												@Pc(2006) Class155 local2006 = Static152.method2616(local26.anInt3504);
												local1948 = local2006.aString239;
												if (local1948 == null) {
													local1948 = "null";
												}
												if ((local2006.anInt4820 == 1 || local26.anInt3470 != 1) && local26.anInt3470 != -1) {
													local1948 = "<col=ff9040>" + local1948 + "</col> x" + Static58.method1126(local26.anInt3470);
												}
											}
											if (local26 == Static50.aClass115_6) {
												local254 = local26.anInt3543;
												local1948 = Static148.aString151;
											}
											if (!local26.aBoolean291) {
												local1948 = Static184.method3154(local1948, local26);
											}
											local1933.method3309(local1948, local111, local105, local26.anInt3555, local26.anInt3487, local254, local26.aBoolean297 ? 0 : -1, local26.anInt3511, local26.anInt3477, local26.anInt3512);
										} else if (Static72.aBoolean128) {
											Static298.method4263(local26);
										}
									} else if (local26.anInt3538 == 5) {
										@Pc(2106) Class2_Sub3_Sub1 local2106;
										if (!local26.aBoolean291) {
											local2106 = local26.method2854(Static262.method4939(local26));
											if (local2106 != null) {
												local2106.method4367(local111, local105);
											} else if (Static72.aBoolean128) {
												Static298.method4263(local26);
											}
										} else if (local26.anInt3488 >= 0) {
											@Pc(2620) Class137 local2620 = local26.method2857();
											if (Static60.aBoolean106) {
												local2620.method3431(0, local111, local105, local26.anInt3555, local26.anInt3487, local26.anInt3473, local26.anInt3479, 0);
											} else {
												local2620.method3429(0, local111, local105, local26.anInt3555, local26.anInt3487, local26.anInt3473, local26.anInt3479);
											}
										} else {
											if (local26.anInt3504 == -1) {
												local2106 = local26.method2854(false);
											} else if (local26.aBoolean298 && Static111.aClass36_Sub3_Sub2_1.aClass126_2 != null) {
												local2106 = Static226.method1672(local26.aBoolean282, local26.anInt3470, local26.anInt3504, local26.anInt3526, local26.anInt3527, Static111.aClass36_Sub3_Sub2_1.aClass126_2);
											} else {
												local2106 = Static226.method1672(local26.aBoolean282, local26.anInt3470, local26.anInt3504, local26.anInt3526, local26.anInt3527, null);
											}
											if (local2106 != null) {
												local254 = local2106.anInt5466;
												local455 = local2106.anInt5457;
												if (local26.aBoolean285) {
													local489 = (local26.anInt3555 + local254 - 1) / local254;
													local493 = (local26.anInt3487 + local455 - 1) / local455;
													if (Static60.aBoolean106) {
														@Pc(2222) Class2_Sub3_Sub1_Sub2 local2222 = (Class2_Sub3_Sub1_Sub2) local2106;
														Static94.method1754(local111, local105, local111 + local26.anInt3555, local105 + local26.anInt3487);
														@Pc(2241) boolean local2241 = Static297.method4947(local2106.anInt5453);
														@Pc(2246) boolean local2246 = Static297.method4947(local2106.anInt5462);
														if (local2241 && local2246) {
															if (local114 == 0) {
																local2222.method616(local111, local105, local489, local493);
															} else {
																local2222.method619(local111, local105, 256 - (local114 & 0xFF), local489, local493);
															}
														} else if (local2241) {
															for (local538 = 0; local538 < local493; local538++) {
																if (local114 == 0) {
																	local2222.method616(local111, local455 * local538 + local105, local489, 1);
																} else {
																	local2222.method619(local111, local538 * local455 + local105, -(local114 & 0xFF) + 256, local489, 1);
																}
															}
														} else if (local2246) {
															for (local538 = 0; local538 < local489; local538++) {
																if (local114 == 0) {
																	local2222.method616(local111 + local538 * local254, local105, 1, local493);
																} else {
																	local2222.method619(local254 * local538 + local111, local105, 256 - (local114 & 0xFF), 1, local493);
																}
															}
														} else {
															for (local538 = 0; local538 < local489; local538++) {
																for (local565 = 0; local565 < local493; local565++) {
																	if (local114 == 0) {
																		local2106.method4367(local538 * local254 + local111, local105 + local565 * local455);
																	} else {
																		local2106.method4360(local111 + local538 * local254, local455 * local565 + local105, 256 - (local114 & 0xFF));
																	}
																}
															}
														}
														Static94.method1752(arg5, arg8, arg1, arg4);
													} else {
														Static160.method2789(local111, local105, local111 + local26.anInt3555, local105 + local26.anInt3487);
														for (local505 = 0; local505 < local489; local505++) {
															for (local523 = 0; local523 < local493; local523++) {
																if (local26.anInt3484 != 0) {
																	local2106.method4368(local105 + local455 * local523 + local455 / 2, local26.anInt3484, 4096, local254 / 2 + local505 * local254 + local111);
																} else if (local114 == 0) {
																	local2106.method4367(local111 + local505 * local254, local105 - -(local455 * local523));
																} else {
																	local2106.method4360(local254 * local505 + local111, local455 * local523 + local105, 256 - (local114 & 0xFF));
																}
															}
														}
														Static160.method2781(arg5, arg8, arg1, arg4);
													}
												} else {
													local489 = local26.anInt3555 * 4096 / local254;
													if (local26.anInt3484 != 0) {
														local2106.method4368(local105 + local26.anInt3487 / 2, local26.anInt3484, local489, local111 + local26.anInt3555 / 2);
													} else if (local114 != 0) {
														local2106.method4371(local111, local105, local26.anInt3555, local26.anInt3487, 256 - (local114 & 0xFF));
													} else if (local254 == local26.anInt3555 && local455 == local26.anInt3487) {
														local2106.method4367(local111, local105);
													} else {
														local2106.method4363(local111, local105, local26.anInt3555, local26.anInt3487);
													}
												}
											} else if (Static72.aBoolean128) {
												Static298.method4263(local26);
											}
										}
									} else {
										@Pc(2824) Class155 local2824;
										if (local26.anInt3538 == 6) {
											@Pc(2662) Class36_Sub2 local2662 = null;
											@Pc(2666) boolean local2666 = Static262.method4939(local26);
											if (local2666) {
												local254 = local26.anInt3472;
											} else {
												local254 = local26.anInt3490;
											}
											local489 = 0;
											if (local26.anInt3504 != -1) {
												local2824 = Static152.method2616(local26.anInt3504);
												if (local2824 != null) {
													local2824 = local2824.method3926(local26.anInt3470);
													@Pc(2844) Class15 local2844 = local254 == -1 ? null : Static35.method706(local254);
													if (local26.aBoolean298 && Static111.aClass36_Sub3_Sub2_1.aClass126_2 != null) {
														local2662 = local2824.method3934(local2844, local26.anInt3474, 1, local26.anInt3478, local26.anInt3507, Static111.aClass36_Sub3_Sub2_1.aClass126_2);
													} else {
														local2662 = local2824.method3934(local2844, local26.anInt3474, 1, local26.anInt3478, local26.anInt3507, null);
													}
													if (local2662 == null) {
														Static298.method4263(local26);
													} else {
														local489 = -local2662.method4881() / 2;
													}
												}
											} else if (local26.anInt3483 == 5) {
												if (local26.anInt3465 == -1) {
													local2662 = Static127.aClass126_1.method3189(-1, null, null, -1, null, 0, 0, -1, -1);
												} else {
													local493 = local26.anInt3465 & 0x7FF;
													if (local493 == Static11.anInt298) {
														local493 = 2047;
													}
													@Pc(2710) Class36_Sub3_Sub2 local2710 = Static212.aClass36_Sub3_Sub2Array1[local493];
													@Pc(2721) Class15 local2721 = local254 == -1 ? null : Static35.method706(local254);
													if (local2710 != null && (int) Static61.method2447(local2710.aString249) << 11 == (local26.anInt3465 & 0xFFFFF800)) {
														local2662 = local2710.aClass126_2.method3189(-1, local2721, null, local26.anInt3474, null, 0, 0, 0, -1);
													}
												}
											} else if (local254 == -1) {
												local2662 = local26.method2861(null, Static111.aClass36_Sub3_Sub2_1.aClass126_2, -1, local2666, -1, 0);
												if (local2662 == null && Static72.aBoolean128) {
													Static298.method4263(local26);
												}
											} else {
												@Pc(2797) Class15 local2797 = Static35.method706(local254);
												local2662 = local26.method2861(local2797, Static111.aClass36_Sub3_Sub2_1.aClass126_2, local26.anInt3507, local2666, local26.anInt3474, local26.anInt3478);
												if (local2662 == null && Static72.aBoolean128) {
													Static298.method4263(local26);
												}
											}
											if (local2662 != null) {
												if (local26.anInt3476 <= 0) {
													local493 = 256;
												} else {
													local493 = (local26.anInt3555 << 8) / local26.anInt3476;
												}
												local523 = local111 + local26.anInt3555 / 2 + (local26.anInt3549 * local493 >> 8);
												if (local26.anInt3547 <= 0) {
													local505 = 256;
												} else {
													local505 = (local26.anInt3487 << 8) / local26.anInt3547;
												}
												local548 = local26.anInt3487 / 2 + local105 + (local26.anInt3521 * local505 >> 8);
												if (Static60.aBoolean106) {
													if (local26.aBoolean284) {
														Static60.method1154(local523, local548, local26.anInt3524, local26.aShort18, local493, local505);
													} else {
														Static60.method1159(local523, local548, local493, local505);
														Static60.method1144((float) local26.aShort17, (float) local26.aShort18 * 1.5F);
													}
													Static60.method1170();
													Static60.method1178(true);
													Static60.method1151(false);
													Static31.method512(Static105.anInt2269);
													if (Static295.aBoolean488) {
														Static94.method1750();
														Static60.method1137();
														Static94.method1752(arg5, arg8, arg1, arg4);
														Static295.aBoolean488 = false;
													}
													if (local26.aBoolean280) {
														Static60.method1158();
													}
													local565 = local26.anInt3524 * Class66.anIntArray153[local26.anInt3557] >> 16;
													local538 = Class66.anIntArray148[local26.anInt3557] * local26.anInt3524 >> 16;
													if (local26.aBoolean291) {
														local2662.method3846(local26.anInt3480, local26.anInt3481, local26.anInt3557, local26.anInt3546, local26.anInt3550 + local538 + local489, local565 - -local26.anInt3550, -1L);
													} else {
														local2662.method3846(local26.anInt3480, 0, local26.anInt3557, 0, local538, local565, -1L);
													}
													if (local26.aBoolean280) {
														Static60.method1145();
													}
												} else {
													Static93.method1734(local523, local548);
													local538 = local26.anInt3524 * Class66.anIntArray148[local26.anInt3557] >> 16;
													local565 = local26.anInt3524 * Class66.anIntArray153[local26.anInt3557] >> 16;
													if (!local26.aBoolean291) {
														local2662.method3846(local26.anInt3480, 0, local26.anInt3557, 0, local538, local565, -1L);
													} else if (local26.aBoolean284) {
														((Class36_Sub2_Sub2) local2662).method3867(local26.anInt3480, local26.anInt3481, local26.anInt3557, local26.anInt3546, local26.anInt3550 + local538 + local489, local565 + local26.anInt3550, local26.anInt3524);
													} else {
														local2662.method3846(local26.anInt3480, local26.anInt3481, local26.anInt3557, local26.anInt3546, local26.anInt3550 + local489 + local538, local26.anInt3550 + local565, -1L);
													}
													Static93.method1741();
												}
											}
										} else {
											if (local26.anInt3538 == 7) {
												local1933 = local26.method2851(Static4.aClass71Array1);
												if (local1933 == null) {
													if (Static72.aBoolean128) {
														Static298.method4263(local26);
													}
													continue;
												}
												local254 = 0;
												for (local455 = 0; local455 < local26.anInt3475; local455++) {
													for (local489 = 0; local489 < local26.anInt3530; local489++) {
														if (local26.anIntArray271[local254] > 0) {
															local2824 = Static152.method2616(local26.anIntArray271[local254] - 1);
															@Pc(3261) String local3261;
															if (local2824.anInt4820 != 1 && local26.anIntArray270[local254] == 1) {
																local3261 = "<col=ff9040>" + local2824.aString239 + "</col>";
															} else {
																local3261 = "<col=ff9040>" + local2824.aString239 + "</col> x" + Static58.method1126(local26.anIntArray270[local254]);
															}
															local523 = (local26.anInt3489 + 115) * local489 + local111;
															local548 = (local26.anInt3492 + 12) * local455 + local105;
															if (local26.anInt3511 == 0) {
																local1933.method3317(local3261, local523, local548, local26.anInt3543, local26.aBoolean297 ? 0 : -1);
															} else if (local26.anInt3511 == 1) {
																local1933.method3308(local3261, local523 + 57, local548, local26.anInt3543, local26.aBoolean297 ? 0 : -1);
															} else {
																local1933.method3314(local3261, local523 + 115 - 1, local548, local26.anInt3543, local26.aBoolean297 ? 0 : -1);
															}
														}
														local254++;
													}
												}
											}
											if (local26.anInt3538 == 8 && Static238.aClass115_15 == local26 && Static201.anInt4204 == Static51.anInt1197) {
												local254 = 0;
												local259 = 0;
												@Pc(3381) Class2_Sub3_Sub5 local3381 = Static208.aClass2_Sub3_Sub5_3;
												@Pc(3384) String local3384 = local26.aString171;
												local3384 = Static184.method3154(local3384, local26);
												@Pc(3409) String local3409;
												while (local3384.length() > 0) {
													local505 = local3384.indexOf("<br>");
													if (local505 == -1) {
														local3409 = local3384;
														local3384 = "";
													} else {
														local3409 = local3384.substring(0, local505);
														local3384 = local3384.substring(local505 + 4);
													}
													local523 = local3381.method3325(local3409);
													if (local523 > local259) {
														local259 = local523;
													}
													local254 += local3381.anInt4070 + 1;
												}
												local254 += 7;
												local259 += 6;
												local505 = local111 + local26.anInt3555 - local259 - 5;
												local523 = local26.anInt3487 + local105 + 5;
												if (arg4 < local523 + local254) {
													local523 = arg4 - local254;
												}
												if (local111 + 5 > local505) {
													local505 = local111 + 5;
												}
												if (arg1 < local259 + local505) {
													local505 = arg1 - local259;
												}
												if (Static60.aBoolean106) {
													Static94.method1758(local505, local523, local259, local254, 16777120);
													Static94.method1756(local505, local523, local259, local254, 0);
												} else {
													Static160.method2788(local505, local523, local259, local254, 16777120);
													Static160.method2782(local505, local523, local259, local254, 0);
												}
												local3384 = local26.aString171;
												local548 = local523 + local3381.anInt4070 + 2;
												local3384 = Static184.method3154(local3384, local26);
												while (local3384.length() > 0) {
													local538 = local3384.indexOf("<br>");
													if (local538 == -1) {
														local3409 = local3384;
														local3384 = "";
													} else {
														local3409 = local3384.substring(0, local538);
														local3384 = local3384.substring(local538 + 4);
													}
													local3381.method3317(local3409, local505 + 3, local548, 0, -1);
													local548 += local3381.anInt4070 + 1;
												}
											}
											if (local26.anInt3538 == 9) {
												if (local26.aBoolean288) {
													local455 = local111 + local26.anInt3555;
													local254 = local105 + local26.anInt3487;
													local489 = local105;
												} else {
													local455 = local26.anInt3555 + local111;
													local489 = local105 + local26.anInt3487;
													local254 = local105;
												}
												if (local26.anInt3517 == 1) {
													if (Static60.aBoolean106) {
														Static94.method1749(local111, local254, local455, local489, local26.anInt3543);
													} else {
														Static160.method2792(local111, local254, local455, local489, local26.anInt3543);
													}
												} else if (Static60.aBoolean106) {
													Static94.method1761(local111, local254, local455, local489, local26.anInt3543, local26.anInt3517);
												} else {
													Static160.method2796(local111, local254, local455, local489, local26.anInt3543, local26.anInt3517);
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
