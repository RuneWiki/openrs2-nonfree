import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!client", name = "T", descriptor = "Lclient!qe;")
	public static final Class160 aClass160_1 = new Class160();

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1039() {
		@Pc(14) boolean local14 = Static326.anInt6624 == 1 && Static214.anInt4133 > 200 || Static326.anInt6624 == 0 && Static214.anInt4133 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static214.anInt4133; local16++) {
			@Pc(23) Class62_Sub1_Sub2_Sub2 local23 = Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local16]];
			if (local23.method4790()) {
				local23.method4763();
				if (local23.aShort84 >= 0 && local23.aShort83 >= 0 && local23.aShort86 < Static95.anInt6381 && local23.aShort85 < Static237.anInt4532) {
					local23.aBoolean486 = local23.aBoolean484 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean482) {
						local62++;
					}
					if (local23.anInt5301 > Static212.anInt4090) {
						local62 += 2;
					}
					local62 += 5 - local23.method4777() << 2;
					if (Static333.anInt6676 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt5330 = local62 + 1;
				} else {
					local23.anInt5330 = -1;
				}
			} else {
				local23.anInt5330 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static169.anInt3463; local98++) {
			@Pc(105) Class62_Sub1_Sub2_Sub1 local105 = Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local98]];
			if (local105.method4720() && local105.aClass186_1.method5210()) {
				local105.method4763();
				if (local105.aShort84 >= 0 && local105.aShort83 >= 0 && local105.aShort86 < Static95.anInt6381 && local105.aShort85 < Static237.anInt4532) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean482) {
						local141++;
					}
					if (local105.anInt5301 > Static212.anInt4090) {
						local141 += 2;
					}
					local141 += 5 - local105.method4777() << 2;
					if (Static333.anInt6676 == 0) {
						if (local105.aClass186_1.aBoolean528) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static333.anInt6676 == 1) {
						if (local105.aClass186_1.aBoolean528) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass186_1.aBoolean532) {
						local141 += 512;
					} else if (!local105.aClass186_1.aBoolean527) {
						local141 += 256;
					}
					local105.anInt5330 = local141 + 1;
				} else {
					local105.anInt5330 = -1;
				}
			} else {
				local105.anInt5330 = -1;
			}
		}
		for (local62 = 0; local62 < Static264.aClass189Array1.length; local62++) {
			@Pc(207) Class189 local207 = Static264.aClass189Array1[local62];
			if (local207 != null) {
				if (local207.anInt6225 == 1) {
					@Pc(218) Class62_Sub1_Sub2_Sub1 local218 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local207.anInt6219];
					if (local218 != null && local218.anInt5330 >= 0) {
						local218.anInt5330 += 1024;
					}
				} else if (local207.anInt6225 == 10) {
					@Pc(239) Class62_Sub1_Sub2_Sub2 local239 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local207.anInt6219];
					if (local239 != null && local239.anInt5330 >= 0) {
						local239.anInt5330 += 1024;
					}
				}
			}
		}
		Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5330 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIII)V")
	public static void method1042(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static124.anInt4221 <= arg3 - arg0 && arg0 + arg3 <= Static96.anInt2180 && Static228.anInt920 <= arg1 - arg0 && Static307.anInt6214 >= arg0 + arg1) {
			Static10.method371(arg2, arg1, arg0, arg3);
		} else {
			Static282.method5078(arg2, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1043() {
		for (@Pc(1) int local1 = -1; local1 < Static214.anInt4133 + Static169.anInt3463; local1++) {
			@Pc(6) Class62_Sub1_Sub2 local6;
			if (local1 < 0) {
				local6 = Static41.aClass62_Sub1_Sub2_Sub2_2;
			} else if (local1 < Static214.anInt4133) {
				local6 = Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local1]];
			} else {
				local6 = Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local1 - Static214.anInt4133]];
			}
			if (local6.anInt5330 >= 0) {
				@Pc(32) int local32 = local6.method4777();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt5289 & 0x7F) != 0 || (local6.anInt5280 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt5289 & 0x7F) != 64 || (local6.anInt5280 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt5289 >> 7;
					local73 = local6.anInt5280 >> 7;
					if (local6.anInt5330 > Static10.anIntArrayArray12[local68][local73]) {
						Static10.anIntArrayArray12[local68][local73] = local6.anInt5330;
						Static320.anIntArrayArray166[local68][local73] = 1;
					} else if (local6.anInt5330 == Static10.anIntArrayArray12[local68][local73]) {
						local109 = Static320.anIntArrayArray166[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt5289 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt5280 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt5289 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt5280 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt5330 > Static10.anIntArrayArray12[local151][local154]) {
								Static10.anIntArrayArray12[local151][local154] = local6.anInt5330;
								Static320.anIntArrayArray166[local151][local154] = 1;
							} else if (local6.anInt5330 == Static10.anIntArrayArray12[local151][local154]) {
								local109 = Static320.anIntArrayArray166[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1048() {
		@Pc(7) int local7 = Static31.aBoolean67 ? Static214.anInt4133 : Static214.anInt4133 + Static169.anInt3463;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class62_Sub1_Sub2 local14;
			if (local9 < 0) {
				local14 = Static41.aClass62_Sub1_Sub2_Sub2_2;
			} else if (local9 < Static214.anInt4133) {
				local14 = Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local9]];
			} else {
				local14 = Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local9 - Static214.anInt4133]];
			}
			local14.anInt5302 = 0;
			if (local14.anInt5330 < 0) {
				local14.aBoolean482 = false;
			} else {
				@Pc(47) int local47 = local14.method4777();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt5289 & 0x7F) != 0 || (local14.anInt5280 & 0x7F) != 0) {
						local14.aBoolean482 = false;
						continue;
					}
				} else if ((local14.anInt5289 & 0x7F) != 64 || (local14.anInt5280 & 0x7F) != 64) {
					local14.aBoolean482 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt5289 >> 7;
					local94 = local14.anInt5280 >> 7;
					if (local14.anInt5330 != Static10.anIntArrayArray12[local89][local94]) {
						local14.aBoolean482 = true;
						continue;
					}
					if (Static320.anIntArrayArray166[local89][local94] > 1) {
						local119 = Static320.anIntArrayArray166[local89][local94]--;
						local14.aBoolean482 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt5289 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt5280 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt5289 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt5280 + local89 >> 7;
					if (!Static203.method3126(local14.anInt5330, local162, local94, local155, local148)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt5330 == Static10.anIntArrayArray12[local173][local176]) {
									local119 = Static320.anIntArrayArray166[local173][local176]--;
								}
							}
						}
						local14.aBoolean482 = true;
						continue;
					}
				}
				if (local14 instanceof Class62_Sub1_Sub2_Sub2 && local14.anInterface9_3 != null && Static212.anInt4090 >= local14.anInt5364 && Static212.anInt4090 < local14.anInt5368) {
					((Class62_Sub1_Sub2_Sub2) local14).aBoolean486 = false;
				}
				local14.aBoolean482 = false;
				local14.anInt5291 = Static138.method2745(Static182.anInt3603, local14.anInt5289, local14.anInt5280);
				Static289.method5131(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1049() {
		for (@Pc(1) int local1 = 0; local1 < Static95.anInt6381; local1++) {
			@Pc(6) int[] local6 = Static10.anIntArrayArray12[local1];
			for (@Pc(8) int local8 = 0; local8 < Static237.anInt4532; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!on;)Lclient!on;")
	public static Class146 method1050(@OriginalArg(0) Class146 arg0) {
		@Pc(4) int local4 = method1056(arg0).method715();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static1.method16(arg0.anInt4458);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZIIIIII)V")
	public static void method1051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg0 < 128 || arg1 < 128 || Static95.anInt6381 * 128 - 256 < arg0 || arg1 > Static237.anInt4532 * 128 - 256) {
			Static239.anIntArray366[0] = Static239.anIntArray366[1] = -1;
			return;
		}
		@Pc(49) int local49 = Static138.method2745(Static182.anInt3603, arg0, arg1) - arg4;
		Static88.aClass133_4.method4333(arg3, 0, 0);
		Static147.aClass4_2.method4233(Static88.aClass133_4);
		Static147.aClass4_2.method4221(arg0, local49, arg1, Static239.anIntArray366);
		Static88.aClass133_4.method4333(-arg3, 0, 0);
		Static147.aClass4_2.method4233(Static88.aClass133_4);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!on;IIIIIIIII)V")
	public static void method1052(@OriginalArg(0) Class146[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class146 local6 = arg0[local1];
			if (local6 != null && local6.anInt4458 == arg1) {
				@Pc(17) int local17 = local6.anInt4442 + arg6;
				@Pc(22) int local22 = local6.anInt4460 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4419 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4468;
					@Pc(45) int local45 = local22 + local6.anInt4414;
					if (local6.anInt4419 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4419 == 0 || local6.aBoolean400 || method1056(local6).anInt478 != 0 || local6 == Static163.aClass146_5 || local6.anInt4440 == 1338) {
					if (!method1054(local6)) {
						if (local6 == Static285.aClass146_14) {
							Static304.aBoolean546 = true;
							Static101.anInt2295 = local17;
							Static287.anInt5820 = local22;
						}
						if (local6.aBoolean407 || local28 < local32 && local30 < local34) {
							if (local6.anInt4419 == 0 && local6.aBoolean405 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class2_Sub44 local151 = (Class2_Sub44) Static356.aClass216_46.method5992(); local151 != null; local151 = (Class2_Sub44) Static356.aClass216_46.method6000()) {
									if (local151.aBoolean605) {
										local151.method5945();
										local151.aClass146_18.aBoolean406 = false;
									}
								}
								if (Static76.anInt1623 == 0) {
									Static285.aClass146_14 = null;
									Static163.aClass146_5 = null;
								}
								Static61.anInt1330 = 0;
								Static126.aBoolean237 = false;
								Static301.aBoolean460 = false;
								if (!Static29.aBoolean66) {
									Static300.method5153();
								}
							}
							@Pc(207) boolean local207;
							if (Static284.aClass61_1.method2658() >= local28 && Static284.aClass61_1.method2659() >= local30 && Static284.aClass61_1.method2658() < local32 && Static284.aClass61_1.method2659() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static29.aBoolean66 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static273.method4967(arg9 - local22, local6, arg8 - local17);
							}
							@Pc(235) boolean local235 = false;
							if (Static284.aClass61_1.method2660() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static187.aClass2_Sub16_1 != null && Static187.aClass2_Sub16_1.method1562() == 0 && Static187.aClass2_Sub16_1.method1557() >= local28 && Static187.aClass2_Sub16_1.method1564() >= local30 && Static187.aClass2_Sub16_1.method1557() < local32 && Static187.aClass2_Sub16_1.method1564() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray55 != null) {
								for (local278 = 0; local278 < local6.aByteArray55.length; local278++) {
									if (Static92.aClass97_2.method5672(local6.aByteArray55[local278])) {
										if (local6.anIntArray350 == null || Static212.anInt4090 >= local6.anIntArray350[local278]) {
											@Pc(310) byte local310 = local6.aByteArray54[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static92.aClass97_2.method5672(86) && !Static92.aClass97_2.method5672(82) && !Static92.aClass97_2.method5672(81)) && ((local310 & 0x2) == 0 || Static92.aClass97_2.method5672(86)) && ((local310 & 0x1) == 0 || Static92.aClass97_2.method5672(82)) && ((local310 & 0x4) == 0 || Static92.aClass97_2.method5672(81))) {
												Static32.method792(local278 + 1, local6.anInt4450, "", -1);
												local374 = local6.anIntArray353[local278];
												if (local6.anIntArray350 == null) {
													local6.anIntArray350 = new int[local6.aByteArray55.length];
												}
												if (local374 == 0) {
													local6.anIntArray350[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray350[local278] = Static212.anInt4090 + local374;
												}
											}
										}
									} else if (local6.anIntArray350 != null) {
										local6.anIntArray350[local278] = 0;
									}
								}
							}
							if (local245) {
								Static109.method2354(local6, Static187.aClass2_Sub16_1.method1557() - local17, Static187.aClass2_Sub16_1.method1564() - local22);
							}
							if (Static285.aClass146_14 != null && Static285.aClass146_14 != local6 && local207 && method1056(local6).method709()) {
								Static236.aClass146_13 = local6;
							}
							if (local6 == Static163.aClass146_5) {
								Static305.aBoolean549 = true;
								Static139.anInt2886 = local17;
								Static50.anInt1115 = local22;
							}
							if (local6.aBoolean400 || local6.anInt4440 != 0) {
								@Pc(459) Class2_Sub44 local459;
								if (local207 && Static333.anInt6673 != 0 && local6.anObjectArray21 != null) {
									local459 = new Class2_Sub44();
									local459.aBoolean605 = true;
									local459.aClass146_18 = local6;
									local459.anInt6912 = Static333.anInt6673;
									local459.anObjectArray35 = local6.anObjectArray21;
									Static356.aClass216_46.method5995(local459);
								}
								if (Static285.aClass146_14 != null || Static29.aBoolean66 || local6.anInt4440 != 1400 && Static61.anInt1330 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt4440 != 0) {
									if (local6.anInt4440 == 1337 || local6.anInt4440 == 1403) {
										Static120.aClass146_9 = local6;
										if (Static89.aClass18_1 != null) {
											Static89.aClass18_1.method691(local6.anInt4414, Static147.aClass4_2);
										}
										if (local6.anInt4440 == 1337) {
											if (!Static29.aBoolean66 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static73.method3199(arg9, Static147.aClass4_2, arg8);
												for (@Pc(542) Class55_Sub2 local542 = (Class55_Sub2) Static348.aClass67_9.method2098(); local542 != null; local542 = (Class55_Sub2) Static348.aClass67_9.method2104()) {
													if (arg8 >= local542.anInt2389 && arg8 < local542.anInt2387 && arg9 >= local542.anInt2386 && arg9 < local542.anInt2388) {
														Static300.method5153();
														Static12.method426(local542.aClass62_Sub1_Sub2_1);
													}
												}
											}
											Static177.method3262(local22, local6, local17);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt4440 == 1338) {
										if (local6.method4042(Static147.aClass4_2) == null || Static260.anInt5271 != 0 && Static260.anInt5271 != 3 || Static29.aBoolean66 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray351[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray347[local614]) {
											continue;
										}
										local278 -= local6.anInt4468 / 2;
										local614 -= local6.anInt4414 / 2;
										if (Static182.anInt3602 == 4) {
											local653 = (int) Static92.aFloat28 & 0x3FFF;
										} else {
											local653 = (int) Static92.aFloat28 + Static256.anInt5068 & 0x3FFF;
										}
										@Pc(665) int local665 = Class24.anIntArray35[local653];
										@Pc(669) int local669 = Class24.anIntArray36[local653];
										if (Static182.anInt3602 != 4) {
											local665 = local665 * (Static331.anInt3201 + 256) >> 8;
											local669 = local669 * (Static331.anInt3201 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static182.anInt3602 == 4) {
											local719 = (Static24.anInt501 >> 7) + (local698 >> 2);
											local727 = (Static347.anInt4215 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static41.aClass62_Sub1_Sub2_Sub2_2.method4777() - 1) * 64;
											local719 = (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 - local736 >> 7) + (local698 >> 2);
											local727 = (Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 - local736 >> 7) - (local708 >> 2);
										}
										if (Static262.aBoolean479 && (Static326.anInt6614 & 0x40) != 0) {
											@Pc(769) Class146 local769 = Static86.method1928(Static7.anInt157, Static48.anInt1094);
											if (local769 == null) {
												Static52.method1198();
											} else {
												Static53.method1208(local719, " ->", Static273.anInt5579, Static165.aString29, 1L, local727, 12);
											}
											continue;
										}
										if (Static41.anInt830 == 1) {
											Static53.method1208(local719, "", -1, Static10.aClass93_6.method2819(Static21.anInt455), 1L, local727, 45);
										}
										Static53.method1208(local719, "", -1, Static7.aString1, 1L, local727, 21);
										continue;
									}
									if (local6.anInt4440 == 1400) {
										Static162.aClass146_10 = local6;
										if (local207) {
											Static126.aBoolean237 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static187.aClass2_Sub16_1.method1557() - local17 - local6.anInt4468 / 2) * 2.0D / (double) Static127.aFloat34);
											local614 = (int) -((double) (Static187.aClass2_Sub16_1.method1564() - local22 - local6.anInt4414 / 2) * 2.0D / (double) Static127.aFloat34);
											local374 = Static210.anInt4066 + local278 + Static127.anInt1568;
											local653 = Static109.anInt2412 + local614 + Static127.anInt1567;
											@Pc(873) Class2_Sub11_Sub6 local873 = Static323.method5667();
											if (local873 == null) {
												continue;
											}
											@Pc(878) int[] local878 = new int[3];
											local873.method2392(local653, local878, local374);
											if (local878 != null) {
												if (Static92.aClass97_2.method5672(82) && Static295.anInt5969 > 0) {
													Static302.method5307(local878[1], local878[2], local878[0]);
													continue;
												}
												Static301.aBoolean460 = true;
												Static304.anInt6121 = local878[0];
												Static35.anInt625 = local878[1];
												Static164.anInt3291 = local878[2];
											}
											Static61.anInt1330 = 1;
											Static255.aBoolean461 = false;
											Static52.anInt1118 = Static284.aClass61_1.method2658();
											Static39.anInt780 = Static284.aClass61_1.method2659();
											continue;
										}
										if (local235 && Static61.anInt1330 > 0) {
											if (Static61.anInt1330 == 1 && (Static52.anInt1118 != Static284.aClass61_1.method2658() || Static39.anInt780 != Static284.aClass61_1.method2659())) {
												Static286.anInt5807 = Static210.anInt4066;
												Static256.anInt5079 = Static109.anInt2412;
												Static61.anInt1330 = 2;
											}
											if (Static61.anInt1330 == 2) {
												Static255.aBoolean461 = true;
												Static284.method5095(Static286.anInt5807 + (int) ((double) (Static52.anInt1118 - Static284.aClass61_1.method2658()) * 2.0D / (double) Static127.aFloat33));
												Static260.method4740(Static256.anInt5079 - (int) ((double) (Static39.anInt780 - Static284.aClass61_1.method2659()) * 2.0D / (double) Static127.aFloat33));
											}
											continue;
										}
										if (Static61.anInt1330 > 0 && !Static255.aBoolean461) {
											if ((Static277.anInt5640 == 1 || Static182.method3299()) && Static117.anInt2590 > 2) {
												Static223.method3932(2, Static39.anInt780, Static52.anInt1118);
											} else if (Static163.method1558()) {
												Static223.method3932(0, Static39.anInt780, Static52.anInt1118);
											}
										}
										Static61.anInt1330 = 0;
										continue;
									}
									if (local6.anInt4440 == 1401) {
										if (local235) {
											Static120.method2509(local6.anInt4468, local6.anInt4414, Static284.aClass61_1.method2658() - local17, Static284.aClass61_1.method2659() - local22);
										}
										continue;
									}
									if (local6.anInt4440 == 1406) {
										Static161.method3039(local6, local22, local17);
										continue;
									}
								}
								if (!local6.aBoolean398 && local245) {
									local6.aBoolean398 = true;
									if (local6.anObjectArray14 != null) {
										local459 = new Class2_Sub44();
										local459.aBoolean605 = true;
										local459.aClass146_18 = local6;
										local459.anInt6908 = Static187.aClass2_Sub16_1.method1557() - local17;
										local459.anInt6912 = Static187.aClass2_Sub16_1.method1564() - local22;
										local459.anObjectArray35 = local6.anObjectArray14;
										Static356.aClass216_46.method5995(local459);
									}
								}
								if (local6.aBoolean398 && local235 && local6.anObjectArray20 != null) {
									local459 = new Class2_Sub44();
									local459.aBoolean605 = true;
									local459.aClass146_18 = local6;
									local459.anInt6908 = Static284.aClass61_1.method2658() - local17;
									local459.anInt6912 = Static284.aClass61_1.method2659() - local22;
									local459.anObjectArray35 = local6.anObjectArray20;
									Static356.aClass216_46.method5995(local459);
								}
								if (local6.aBoolean398 && !local235) {
									local6.aBoolean398 = false;
									if (local6.anObjectArray8 != null) {
										local459 = new Class2_Sub44();
										local459.aBoolean605 = true;
										local459.aClass146_18 = local6;
										local459.anInt6908 = Static284.aClass61_1.method2658() - local17;
										local459.anInt6912 = Static284.aClass61_1.method2659() - local22;
										local459.anObjectArray35 = local6.anObjectArray8;
										Static164.aClass216_32.method5995(local459);
									}
								}
								if (local235 && local6.anObjectArray30 != null) {
									local459 = new Class2_Sub44();
									local459.aBoolean605 = true;
									local459.aClass146_18 = local6;
									local459.anInt6908 = Static284.aClass61_1.method2658() - local17;
									local459.anInt6912 = Static284.aClass61_1.method2659() - local22;
									local459.anObjectArray35 = local6.anObjectArray30;
									Static356.aClass216_46.method5995(local459);
								}
								if (!local6.aBoolean406 && local207) {
									local6.aBoolean406 = true;
									if (local6.anObjectArray19 != null) {
										local459 = new Class2_Sub44();
										local459.aBoolean605 = true;
										local459.aClass146_18 = local6;
										local459.anInt6908 = Static284.aClass61_1.method2658() - local17;
										local459.anInt6912 = Static284.aClass61_1.method2659() - local22;
										local459.anObjectArray35 = local6.anObjectArray19;
										Static356.aClass216_46.method5995(local459);
									}
								}
								if (local6.aBoolean406 && local207 && local6.anObjectArray23 != null) {
									local459 = new Class2_Sub44();
									local459.aBoolean605 = true;
									local459.aClass146_18 = local6;
									local459.anInt6908 = Static284.aClass61_1.method2658() - local17;
									local459.anInt6912 = Static284.aClass61_1.method2659() - local22;
									local459.anObjectArray35 = local6.anObjectArray23;
									Static356.aClass216_46.method5995(local459);
								}
								if (local6.aBoolean406 && !local207) {
									local6.aBoolean406 = false;
									if (local6.anObjectArray7 != null) {
										local459 = new Class2_Sub44();
										local459.aBoolean605 = true;
										local459.aClass146_18 = local6;
										local459.anInt6908 = Static284.aClass61_1.method2658() - local17;
										local459.anInt6912 = Static284.aClass61_1.method2659() - local22;
										local459.anObjectArray35 = local6.anObjectArray7;
										Static164.aClass216_32.method5995(local459);
									}
								}
								if (local6.anObjectArray27 != null) {
									local459 = new Class2_Sub44();
									local459.aClass146_18 = local6;
									local459.anObjectArray35 = local6.anObjectArray27;
									Static23.aClass216_16.method5995(local459);
								}
								@Pc(1419) Class2_Sub44 local1419;
								if (local6.anObjectArray32 != null && Static84.anInt1824 > local6.anInt4423) {
									if (local6.anIntArray349 == null || Static84.anInt1824 - local6.anInt4423 > 32) {
										local459 = new Class2_Sub44();
										local459.aClass146_18 = local6;
										local459.anObjectArray35 = local6.anObjectArray32;
										Static356.aClass216_46.method5995(local459);
									} else {
										label657: for (local278 = local6.anInt4423; local278 < Static84.anInt1824; local278++) {
											local614 = Static218.anIntArray331[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray349.length; local374++) {
												if (local6.anIntArray349[local374] == local614) {
													local1419 = new Class2_Sub44();
													local1419.aClass146_18 = local6;
													local1419.anObjectArray35 = local6.anObjectArray32;
													Static356.aClass216_46.method5995(local1419);
													break label657;
												}
											}
										}
									}
									local6.anInt4423 = Static84.anInt1824;
								}
								if (local6.anObjectArray28 != null && Static156.anInt3173 > local6.anInt4421) {
									if (local6.anIntArray346 == null || Static156.anInt3173 - local6.anInt4421 > 32) {
										local459 = new Class2_Sub44();
										local459.aClass146_18 = local6;
										local459.anObjectArray35 = local6.anObjectArray28;
										Static356.aClass216_46.method5995(local459);
									} else {
										label633: for (local278 = local6.anInt4421; local278 < Static156.anInt3173; local278++) {
											local614 = Static177.anIntArray292[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray346.length; local374++) {
												if (local6.anIntArray346[local374] == local614) {
													local1419 = new Class2_Sub44();
													local1419.aClass146_18 = local6;
													local1419.anObjectArray35 = local6.anObjectArray28;
													Static356.aClass216_46.method5995(local1419);
													break label633;
												}
											}
										}
									}
									local6.anInt4421 = Static156.anInt3173;
								}
								if (local6.anObjectArray25 != null && Static215.anInt4141 > local6.anInt4477) {
									if (local6.anIntArray354 == null || Static215.anInt4141 - local6.anInt4477 > 32) {
										local459 = new Class2_Sub44();
										local459.aClass146_18 = local6;
										local459.anObjectArray35 = local6.anObjectArray25;
										Static356.aClass216_46.method5995(local459);
									} else {
										label609: for (local278 = local6.anInt4477; local278 < Static215.anInt4141; local278++) {
											local614 = Static221.anIntArray336[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray354.length; local374++) {
												if (local6.anIntArray354[local374] == local614) {
													local1419 = new Class2_Sub44();
													local1419.aClass146_18 = local6;
													local1419.anObjectArray35 = local6.anObjectArray25;
													Static356.aClass216_46.method5995(local1419);
													break label609;
												}
											}
										}
									}
									local6.anInt4477 = Static215.anInt4141;
								}
								if (local6.anObjectArray29 != null && Static146.anInt3018 > local6.anInt4486) {
									if (local6.anIntArray352 == null || Static146.anInt3018 - local6.anInt4486 > 32) {
										local459 = new Class2_Sub44();
										local459.aClass146_18 = local6;
										local459.anObjectArray35 = local6.anObjectArray29;
										Static356.aClass216_46.method5995(local459);
									} else {
										label585: for (local278 = local6.anInt4486; local278 < Static146.anInt3018; local278++) {
											local614 = Static157.anIntArray268[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray352.length; local374++) {
												if (local6.anIntArray352[local374] == local614) {
													local1419 = new Class2_Sub44();
													local1419.aClass146_18 = local6;
													local1419.anObjectArray35 = local6.anObjectArray29;
													Static356.aClass216_46.method5995(local1419);
													break label585;
												}
											}
										}
									}
									local6.anInt4486 = Static146.anInt3018;
								}
								if (local6.anObjectArray12 != null && Static145.anInt6944 > local6.anInt4453) {
									if (local6.anIntArray348 == null || Static145.anInt6944 - local6.anInt4453 > 32) {
										local459 = new Class2_Sub44();
										local459.aClass146_18 = local6;
										local459.anObjectArray35 = local6.anObjectArray12;
										Static356.aClass216_46.method5995(local459);
									} else {
										label561: for (local278 = local6.anInt4453; local278 < Static145.anInt6944; local278++) {
											local614 = Static41.anIntArray78[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray348.length; local374++) {
												if (local6.anIntArray348[local374] == local614) {
													local1419 = new Class2_Sub44();
													local1419.aClass146_18 = local6;
													local1419.anObjectArray35 = local6.anObjectArray12;
													Static356.aClass216_46.method5995(local1419);
													break label561;
												}
											}
										}
									}
									local6.anInt4453 = Static145.anInt6944;
								}
								if (Static68.anInt1468 > local6.anInt4476 && local6.anObjectArray5 != null) {
									local459 = new Class2_Sub44();
									local459.aClass146_18 = local6;
									local459.anObjectArray35 = local6.anObjectArray5;
									Static356.aClass216_46.method5995(local459);
								}
								if (Static266.anInt5439 > local6.anInt4476 && local6.anObjectArray15 != null) {
									local459 = new Class2_Sub44();
									local459.aClass146_18 = local6;
									local459.anObjectArray35 = local6.anObjectArray15;
									Static356.aClass216_46.method5995(local459);
								}
								if (Static214.anInt4132 > local6.anInt4476 && local6.anObjectArray13 != null) {
									local459 = new Class2_Sub44();
									local459.aClass146_18 = local6;
									local459.anObjectArray35 = local6.anObjectArray13;
									Static356.aClass216_46.method5995(local459);
								}
								if (Static77.anInt1706 > local6.anInt4476 && local6.anObjectArray18 != null) {
									local459 = new Class2_Sub44();
									local459.aClass146_18 = local6;
									local459.anObjectArray35 = local6.anObjectArray18;
									Static356.aClass216_46.method5995(local459);
								}
								if (Static164.anInt3284 > local6.anInt4476 && local6.anObjectArray6 != null) {
									local459 = new Class2_Sub44();
									local459.aClass146_18 = local6;
									local459.anObjectArray35 = local6.anObjectArray6;
									Static356.aClass216_46.method5995(local459);
								}
								local6.anInt4476 = Static157.anInt3179;
								if (local6.anObjectArray16 != null) {
									for (local278 = 0; local278 < Static49.anInt1100; local278++) {
										@Pc(1887) Class2_Sub44 local1887 = new Class2_Sub44();
										local1887.aClass146_18 = local6;
										local1887.anInt6905 = Static138.aClass69Array1[local278].method5553();
										local1887.anInt6910 = Static138.aClass69Array1[local278].method5546();
										local1887.anObjectArray35 = local6.anObjectArray16;
										Static356.aClass216_46.method5995(local1887);
									}
								}
								if (Static99.aBoolean196 && local6.anObjectArray9 != null) {
									local459 = new Class2_Sub44();
									local459.aClass146_18 = local6;
									local459.anObjectArray35 = local6.anObjectArray9;
									Static356.aClass216_46.method5995(local459);
								}
							}
							if (local6.anInt4419 == 5 && local6.anInt4444 != -1) {
								local6.method4048().method691(local6.anInt4414, Static147.aClass4_2);
							}
							Static262.method4745(local6);
							if (local6.anInt4419 == 0) {
								method1052(arg0, local6.anInt4450, local28, local30, local32, local34, local17 - local6.anInt4487, local22 - local6.anInt4483, arg8, arg9);
								if (local6.aClass146Array2 != null) {
									method1052(local6.aClass146Array2, local6.anInt4450, local28, local30, local32, local34, local17 - local6.anInt4487, local22 - local6.anInt4483, arg8, arg9);
								}
								@Pc(2007) Class2_Sub8 local2007 = (Class2_Sub8) Static273.aClass199_25.method5751((long) local6.anInt4450);
								if (local2007 != null) {
									if (local2007.anInt699 == 0 && !Static29.aBoolean66 && local207 && !Static300.aBoolean520) {
										Static300.method5153();
									}
									Static343.method5926(local2007.anInt694, local34, arg9, local32, local22, arg8, local30, local28, local17);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static262.method4745(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method1053() {
		Static32.anInt589 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static169.anInt3463; local3++) {
			@Pc(10) Class62_Sub1_Sub2_Sub1 local10 = Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local3]];
			if (local10.aBoolean482 && local10.method4769() != -1) {
				@Pc(28) int local28 = (local10.method4777() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt5289 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt5280 - local28 >> 7;
				@Pc(48) Class62_Sub1_Sub2 local48 = Static70.method1585(local42, Static182.anInt3603, local35);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt5328;
					if (local48 instanceof Class62_Sub1_Sub2_Sub1) {
						local53 += 2048;
					}
					if (local48.anInt5302 == 0 && local48.method4769() != -1) {
						Static161.anIntArray276[Static32.anInt589] = local53;
						Static167.anIntArray286[Static32.anInt589] = local53;
						Static32.anInt589++;
						local48.anInt5302++;
					}
					Static161.anIntArray276[Static32.anInt589] = local53;
					Static167.anIntArray286[Static32.anInt589] = local10.anInt5328 + 2048;
					Static32.anInt589++;
					local48.anInt5302++;
				}
			}
		}
		Static267.method4825(0, Static167.anIntArray286, Static32.anInt589 - 1, Static161.anIntArray276);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!on;)Z")
	public static boolean method1054(@OriginalArg(0) Class146 arg0) {
		if (Static300.aBoolean520) {
			if (method1056(arg0).anInt478 != 0) {
				return false;
			}
			if (arg0.anInt4419 == 0) {
				return false;
			}
		}
		return arg0.aBoolean404;
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method1055() {
		@Pc(7) int local7 = Static31.aBoolean67 ? Static214.anInt4133 : Static214.anInt4133 + Static169.anInt3463;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class62_Sub1_Sub2 local14;
			if (local9 < 0) {
				local14 = Static41.aClass62_Sub1_Sub2_Sub2_2;
			} else if (local9 < Static214.anInt4133) {
				local14 = Static129.aClass62_Sub1_Sub2_Sub2Array1[Static103.anIntArray218[local9]];
			} else {
				local14 = Static37.aClass62_Sub1_Sub2_Sub1Array1[Static98.anIntArray215[local9 - Static214.anInt4133]];
			}
			if (local14.anInt5330 >= 0) {
				@Pc(40) int local40 = local14.method4777();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt5289 & 0x7F) == 0 && (local14.anInt5280 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt5289 & 0x7F) == 64 && (local14.anInt5280 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class62_Sub1_Sub2_Sub2 && local14.anInterface9_3 != null && Static212.anInt4090 >= local14.anInt5364 && Static212.anInt4090 < local14.anInt5368) {
					((Class62_Sub1_Sub2_Sub2) local14).aBoolean486 = false;
				}
				local14.anInt5291 = Static138.method2745(Static182.anInt3603, local14.anInt5289, local14.anInt5280);
				Static289.method5131(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!on;)Lclient!bi;")
	public static Class2_Sub5 method1056(@OriginalArg(0) Class146 arg0) {
		@Pc(13) Class2_Sub5 local13 = (Class2_Sub5) Static179.aClass199_18.method5751(((long) arg0.anInt4450 << 32) + (long) arg0.anInt4493);
		return local13 == null ? arg0.aClass2_Sub5_2 : local13;
	}
}
