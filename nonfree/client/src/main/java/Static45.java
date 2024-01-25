import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
	public static int anInt825;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method705() {
		for (@Pc(1) int local1 = -1; local1 < Static22.anInt472 + Static133.anInt2579; local1++) {
			@Pc(6) Class4_Sub5_Sub2 local6;
			if (local1 < 0) {
				local6 = Static192.aClass4_Sub5_Sub2_Sub1_2;
			} else if (local1 < Static22.anInt472) {
				local6 = Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local1]];
			} else {
				local6 = Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local1 - Static22.anInt472]];
			}
			if (local6.anInt5406 >= 0) {
				@Pc(32) int local32 = local6.method4807();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt6631 & 0x7F) != 0 || (local6.anInt6632 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt6631 & 0x7F) != 64 || (local6.anInt6632 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt6631 >> 7;
					local73 = local6.anInt6632 >> 7;
					if (local6.anInt5406 > Static141.anIntArrayArray48[local68][local73]) {
						Static141.anIntArrayArray48[local68][local73] = local6.anInt5406;
						Static109.anIntArrayArray36[local68][local73] = 1;
					} else if (local6.anInt5406 == Static141.anIntArrayArray48[local68][local73]) {
						local109 = Static109.anIntArrayArray36[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt6631 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt6632 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt6631 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt6632 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt5406 > Static141.anIntArrayArray48[local151][local154]) {
								Static141.anIntArrayArray48[local151][local154] = local6.anInt5406;
								Static109.anIntArrayArray36[local151][local154] = 1;
							} else if (local6.anInt5406 == Static141.anIntArrayArray48[local151][local154]) {
								local109 = Static109.anIntArrayArray36[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method706() {
		@Pc(7) int local7 = Static133.aBoolean202 ? Static22.anInt472 : Static22.anInt472 + Static133.anInt2579;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class4_Sub5_Sub2 local14;
			if (local9 < 0) {
				local14 = Static192.aClass4_Sub5_Sub2_Sub1_2;
			} else if (local9 < Static22.anInt472) {
				local14 = Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local9]];
			} else {
				local14 = Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local9 - Static22.anInt472]];
			}
			local14.anInt5363 = 0;
			if (local14.anInt5406 < 0) {
				local14.aBoolean447 = false;
			} else {
				@Pc(47) int local47 = local14.method4807();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt6631 & 0x7F) != 0 || (local14.anInt6632 & 0x7F) != 0) {
						local14.aBoolean447 = false;
						continue;
					}
				} else if ((local14.anInt6631 & 0x7F) != 64 || (local14.anInt6632 & 0x7F) != 64) {
					local14.aBoolean447 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt6631 >> 7;
					local94 = local14.anInt6632 >> 7;
					if (local14.anInt5406 != Static141.anIntArrayArray48[local89][local94]) {
						local14.aBoolean447 = true;
						continue;
					}
					if (Static109.anIntArrayArray36[local89][local94] > 1) {
						local119 = Static109.anIntArrayArray36[local89][local94]--;
						local14.aBoolean447 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt6631 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt6632 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt6631 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt6632 + local89 >> 7;
					if (!Static133.method2379(local155, local94, local162, local14.anInt5406, local148)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt5406 == Static141.anIntArrayArray48[local173][local176]) {
									local119 = Static109.anIntArrayArray36[local173][local176]--;
								}
							}
						}
						local14.aBoolean447 = true;
						continue;
					}
				}
				if (local14 instanceof Class4_Sub5_Sub2_Sub1 && local14.anInterface5_3 != null && Static283.anInt5563 >= local14.anInt5425 && Static283.anInt5563 < local14.anInt5420) {
					((Class4_Sub5_Sub2_Sub1) local14).aBoolean367 = false;
				}
				local14.aBoolean447 = false;
				local14.anInt6633 = Static208.method3804(Static239.anInt4811, local14.anInt6631, local14.anInt6632);
				Static78.method1418(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!vg;)Lclient!vc;")
	public static Class5_Sub44 method707(@OriginalArg(0) Class201 arg0) {
		@Pc(13) Class5_Sub44 local13 = (Class5_Sub44) Static114.aClass190_10.method5466(((long) arg0.anInt6541 << 32) + (long) arg0.anInt6548);
		return local13 == null ? arg0.aClass5_Sub44_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method709() {
		for (@Pc(1) int local1 = 0; local1 < Static22.anInt481; local1++) {
			@Pc(6) int[] local6 = Static141.anIntArrayArray48[local1];
			for (@Pc(8) int local8 = 0; local8 < Static269.anInt5281; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!vg;)Z")
	public static boolean method710(@OriginalArg(0) Class201 arg0) {
		if (Static346.aBoolean577) {
			if (method707(arg0).anInt6436 != 0) {
				return false;
			}
			if (arg0.anInt6559 == 0) {
				return false;
			}
		}
		return arg0.aBoolean564;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Lclient!bm;")
	public static Class24 method712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class24 local7 = new Class24();
		local7.anInt539 = arg1 + 5 + 1;
		local7.anInt524 = arg0 + 5 + 1;
		local7.anInt542 = -1;
		local7.anInt543 = -1;
		local7.anIntArrayArray15 = new int[local7.anInt524][local7.anInt539];
		local7.method494();
		return local7;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method713(@OriginalArg(1) String arg0) {
		Static63.method4635("", 0, arg0, "", 0);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(CII)I")
	public static int method714(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local15 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local15 = 1762;
		}
		return local15;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method717() {
		Static42.anInt735 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static133.anInt2579; local3++) {
			@Pc(10) Class4_Sub5_Sub2_Sub2 local10 = Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local3]];
			if (local10.aBoolean447 && local10.method4815() != -1) {
				@Pc(28) int local28 = (local10.method4807() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6631 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6632 - local28 >> 7;
				@Pc(48) Class4_Sub5_Sub2 local48 = Static145.method2660(Static239.anInt4811, local35, local42);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt5386;
					if (local48 instanceof Class4_Sub5_Sub2_Sub2) {
						local53 += 2048;
					}
					if (local48.anInt5363 == 0 && local48.method4815() != -1) {
						Static53.anIntArray91[Static42.anInt735] = local53;
						Static178.anIntArray358[Static42.anInt735] = local53;
						Static42.anInt735++;
						local48.anInt5363++;
					}
					Static53.anIntArray91[Static42.anInt735] = local53;
					Static178.anIntArray358[Static42.anInt735] = local10.anInt5386 + 2048;
					Static42.anInt735++;
					local48.anInt5363++;
				}
			}
		}
		Static289.method5013(Static53.anIntArray91, Static178.anIntArray358, 0, Static42.anInt735 - 1);
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!vg;)Lclient!vg;")
	public static Class201 method718(@OriginalArg(0) Class201 arg0) {
		@Pc(4) int local4 = method707(arg0).method5752();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static262.method4616(arg0.anInt6491);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!vg;IIIIIIIII)V")
	public static void method719(@OriginalArg(0) Class201[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class201 local6 = arg0[local1];
			if (local6 != null && local6.anInt6491 == arg1) {
				@Pc(17) int local17 = local6.anInt6554 + arg6;
				@Pc(22) int local22 = local6.anInt6516 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6559 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6505;
					@Pc(45) int local45 = local22 + local6.anInt6510;
					if (local6.anInt6559 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6559 == 0 || local6.aBoolean563 || method707(local6).anInt6436 != 0 || local6 == Static342.aClass201_13 || local6.anInt6555 == 1338) {
					if (!method710(local6)) {
						if (local6 == Static204.aClass201_8) {
							Static322.aBoolean41 = true;
							Static353.anInt6773 = local17;
							Static250.anInt4970 = local22;
						}
						if (local6.aBoolean557 || local28 < local32 && local30 < local34) {
							if (local6.anInt6559 == 0 && local6.aBoolean567 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class5_Sub17 local151 = (Class5_Sub17) Static144.aClass103_74.method2756(); local151 != null; local151 = (Class5_Sub17) Static144.aClass103_74.method2748()) {
									if (local151.aBoolean134) {
										local151.method6005();
										local151.aClass201_3.aBoolean560 = false;
									}
								}
								if (Static104.anInt1997 == 0) {
									Static204.aClass201_8 = null;
									Static342.aClass201_13 = null;
								}
								Static284.anInt5599 = 0;
								Static167.aBoolean260 = false;
								Static326.aBoolean529 = false;
								if (!Static93.aBoolean128) {
									Static35.method575();
								}
							}
							@Pc(207) boolean local207;
							if (Static316.aClass118_3.method4054() >= local28 && Static316.aClass118_3.method4050() >= local30 && Static316.aClass118_3.method4054() < local32 && Static316.aClass118_3.method4050() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static93.aBoolean128 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static77.method1411(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(235) boolean local235 = false;
							if (Static316.aClass118_3.method4051() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static150.aClass5_Sub26_1 != null && Static150.aClass5_Sub26_1.method4481() == 0 && Static150.aClass5_Sub26_1.method4478() >= local28 && Static150.aClass5_Sub26_1.method4483() >= local30 && Static150.aClass5_Sub26_1.method4478() < local32 && Static150.aClass5_Sub26_1.method4483() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray94 != null) {
								for (local278 = 0; local278 < local6.aByteArray94.length; local278++) {
									if (Static174.aClass2_1.method1425(local6.aByteArray94[local278])) {
										if (local6.anIntArray604 == null || Static283.anInt5563 >= local6.anIntArray604[local278]) {
											@Pc(310) byte local310 = local6.aByteArray95[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static174.aClass2_1.method1425(86) && !Static174.aClass2_1.method1425(82) && !Static174.aClass2_1.method1425(81)) && ((local310 & 0x2) == 0 || Static174.aClass2_1.method1425(86)) && ((local310 & 0x1) == 0 || Static174.aClass2_1.method1425(82)) && ((local310 & 0x4) == 0 || Static174.aClass2_1.method1425(81))) {
												Static159.method2824(-1, local278 + 1, local6.anInt6541, "");
												local374 = local6.anIntArray612[local278];
												if (local6.anIntArray604 == null) {
													local6.anIntArray604 = new int[local6.aByteArray94.length];
												}
												if (local374 == 0) {
													local6.anIntArray604[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray604[local278] = Static283.anInt5563 + local374;
												}
											}
										}
									} else if (local6.anIntArray604 != null) {
										local6.anIntArray604[local278] = 0;
									}
								}
							}
							if (local245) {
								Static291.method5030(Static150.aClass5_Sub26_1.method4478() - local17, Static150.aClass5_Sub26_1.method4483() - local22, local6);
							}
							if (Static204.aClass201_8 != null && Static204.aClass201_8 != local6 && local207 && method707(local6).method5751()) {
								Static14.aClass201_1 = local6;
							}
							if (local6 == Static342.aClass201_13) {
								Static205.aBoolean336 = true;
								Static331.anInt6418 = local17;
								Static150.anInt2941 = local22;
							}
							if (local6.aBoolean563 || local6.anInt6555 != 0) {
								@Pc(459) Class5_Sub17 local459;
								if (local207 && Static156.anInt3027 != 0 && local6.anObjectArray15 != null) {
									local459 = new Class5_Sub17();
									local459.aBoolean134 = true;
									local459.aClass201_3 = local6;
									local459.anInt1849 = Static156.anInt3027;
									local459.anObjectArray1 = local6.anObjectArray15;
									Static144.aClass103_74.method2745(local459);
								}
								if (Static204.aClass201_8 != null || Static93.aBoolean128 || local6.anInt6555 != 1400 && Static284.anInt5599 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt6555 != 0) {
									if (local6.anInt6555 == 1337 || local6.anInt6555 == 1403) {
										Static257.aClass201_10 = local6;
										if (Static48.aClass184_1 != null) {
											Static48.aClass184_1.method5012(local6.anInt6510, Static236.aClass55_9);
										}
										if (local6.anInt6555 == 1337) {
											if (!Static93.aBoolean128 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static118.method2070(Static236.aClass55_9, arg8, arg9);
												for (@Pc(542) Class32_Sub1 local542 = (Class32_Sub1) Static85.aClass39_2.method806(); local542 != null; local542 = (Class32_Sub1) Static85.aClass39_2.method808()) {
													if (arg8 >= local542.anInt689 && arg8 < local542.anInt683 && arg9 >= local542.anInt688 && arg9 < local542.anInt684) {
														Static35.method575();
														Static155.method2782(local542.aClass4_Sub5_Sub2_1);
													}
												}
											}
											Static80.method1434(local6, local22, local17);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt6555 == 1338) {
										if (local6.method5811(Static236.aClass55_9) == null || Static271.anInt5299 != 0 && Static271.anInt5299 != 3 || Static93.aBoolean128 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray607[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray605[local614]) {
											continue;
										}
										local278 -= local6.anInt6505 / 2;
										local614 -= local6.anInt6510 / 2;
										if (Static53.anInt992 == 4) {
											local653 = (int) Static164.aFloat24 & 0x3FFF;
										} else {
											local653 = (int) Static164.aFloat24 + Static170.anInt3407 & 0x3FFF;
										}
										@Pc(665) int local665 = Class187.anIntArray571[local653];
										@Pc(669) int local669 = Class187.anIntArray570[local653];
										if (Static53.anInt992 != 4) {
											local665 = local665 * (Static9.anInt191 + 256) >> 8;
											local669 = local669 * (Static9.anInt191 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static53.anInt992 == 4) {
											local719 = (Static348.anInt6696 >> 7) + (local698 >> 2);
											local727 = (Static213.anInt4128 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static192.aClass4_Sub5_Sub2_Sub1_2.method4807() - 1) * 64;
											local719 = (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6631 - local736 >> 7) + (local698 >> 2);
											local727 = (Static192.aClass4_Sub5_Sub2_Sub1_2.anInt6632 - local736 >> 7) - (local708 >> 2);
										}
										if (Static54.aBoolean72 && (Static5.anInt93 & 0x40) != 0) {
											@Pc(769) Class201 local769 = Static297.method5150(Static166.anInt3318, Static240.anInt4828);
											if (local769 == null) {
												Static113.method1983();
											} else {
												Static30.method540(Static255.aString49, 30, local719, 1L, local727, Static169.anInt6216, " ->");
											}
											continue;
										}
										if (Static111.anInt2077 == 1) {
											Static30.method540(Static298.aClass85_45.method2020(Static41.anInt726), 50, local719, 1L, local727, -1, "");
										}
										Static30.method540(Static255.aString50, 13, local719, 1L, local727, -1, "");
										continue;
									}
									if (local6.anInt6555 == 1400) {
										Static188.aClass201_7 = local6;
										if (local207) {
											Static167.aBoolean260 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static150.aClass5_Sub26_1.method4478() - local17 - local6.anInt6505 / 2) * 2.0D / (double) Static290.aFloat20);
											local614 = (int) -((double) (Static150.aClass5_Sub26_1.method4483() - local22 - local6.anInt6510 / 2) * 2.0D / (double) Static290.aFloat20);
											local374 = Static32.anInt633 + local278 + Static290.anInt2776;
											local653 = Static314.anInt6098 + local614 + Static290.anInt2772;
											@Pc(873) Class5_Sub1_Sub6 local873 = Static190.method425();
											if (local873 == null) {
												continue;
											}
											@Pc(878) int[] local878 = new int[3];
											local873.method1830(local878, local374, local653);
											if (local878 != null) {
												if (Static174.aClass2_1.method1425(82) && Static262.anInt5151 > 0) {
													Static283.method4923(local878[0], local878[1], local878[2]);
													continue;
												}
												Static326.aBoolean529 = true;
												Static174.anInt3498 = local878[0];
												Static146.anInt2894 = local878[1];
												Static338.anInt6790 = local878[2];
											}
											Static284.anInt5599 = 1;
											Static294.aBoolean583 = false;
											Static95.anInt1816 = Static316.aClass118_3.method4054();
											Static139.anInt2691 = Static316.aClass118_3.method4050();
											continue;
										}
										if (local235 && Static284.anInt5599 > 0) {
											if (Static284.anInt5599 == 1 && (Static95.anInt1816 != Static316.aClass118_3.method4054() || Static139.anInt2691 != Static316.aClass118_3.method4050())) {
												Static160.anInt3180 = Static32.anInt633;
												Static93.anInt1797 = Static314.anInt6098;
												Static284.anInt5599 = 2;
											}
											if (Static284.anInt5599 == 2) {
												Static294.aBoolean583 = true;
												Static206.method3782(Static160.anInt3180 + (int) ((double) (Static95.anInt1816 - Static316.aClass118_3.method4054()) * 2.0D / (double) Static290.aFloat21));
												Static338.method6003(Static93.anInt1797 - (int) ((double) (Static139.anInt2691 - Static316.aClass118_3.method4050()) * 2.0D / (double) Static290.aFloat21));
											}
											continue;
										}
										if (Static284.anInt5599 > 0 && !Static294.aBoolean583) {
											if ((Static267.anInt5259 == 1 || Static245.method4388()) && Static160.anInt3181 > 2) {
												Static168.method3067(Static95.anInt1816, Static139.anInt2691, 2);
											} else if (Static308.method5392()) {
												Static168.method3067(Static95.anInt1816, Static139.anInt2691, 0);
											}
										}
										Static284.anInt5599 = 0;
										continue;
									}
									if (local6.anInt6555 == 1401) {
										if (local235) {
											Static87.method1561(Static316.aClass118_3.method4050() - local22, local6.anInt6510, Static316.aClass118_3.method4054() - local17, local6.anInt6505);
										}
										continue;
									}
									if (local6.anInt6555 == 1406) {
										Static36.method578(local17, local22, local6);
										continue;
									}
								}
								if (!local6.aBoolean551 && local245) {
									local6.aBoolean551 = true;
									if (local6.anObjectArray8 != null) {
										local459 = new Class5_Sub17();
										local459.aBoolean134 = true;
										local459.aClass201_3 = local6;
										local459.anInt1857 = Static150.aClass5_Sub26_1.method4478() - local17;
										local459.anInt1849 = Static150.aClass5_Sub26_1.method4483() - local22;
										local459.anObjectArray1 = local6.anObjectArray8;
										Static144.aClass103_74.method2745(local459);
									}
								}
								if (local6.aBoolean551 && local235 && local6.anObjectArray21 != null) {
									local459 = new Class5_Sub17();
									local459.aBoolean134 = true;
									local459.aClass201_3 = local6;
									local459.anInt1857 = Static316.aClass118_3.method4054() - local17;
									local459.anInt1849 = Static316.aClass118_3.method4050() - local22;
									local459.anObjectArray1 = local6.anObjectArray21;
									Static144.aClass103_74.method2745(local459);
								}
								if (local6.aBoolean551 && !local235) {
									local6.aBoolean551 = false;
									if (local6.anObjectArray26 != null) {
										local459 = new Class5_Sub17();
										local459.aBoolean134 = true;
										local459.aClass201_3 = local6;
										local459.anInt1857 = Static316.aClass118_3.method4054() - local17;
										local459.anInt1849 = Static316.aClass118_3.method4050() - local22;
										local459.anObjectArray1 = local6.anObjectArray26;
										Static229.aClass103_111.method2745(local459);
									}
								}
								if (local235 && local6.anObjectArray13 != null) {
									local459 = new Class5_Sub17();
									local459.aBoolean134 = true;
									local459.aClass201_3 = local6;
									local459.anInt1857 = Static316.aClass118_3.method4054() - local17;
									local459.anInt1849 = Static316.aClass118_3.method4050() - local22;
									local459.anObjectArray1 = local6.anObjectArray13;
									Static144.aClass103_74.method2745(local459);
								}
								if (!local6.aBoolean560 && local207) {
									local6.aBoolean560 = true;
									if (local6.anObjectArray27 != null) {
										local459 = new Class5_Sub17();
										local459.aBoolean134 = true;
										local459.aClass201_3 = local6;
										local459.anInt1857 = Static316.aClass118_3.method4054() - local17;
										local459.anInt1849 = Static316.aClass118_3.method4050() - local22;
										local459.anObjectArray1 = local6.anObjectArray27;
										Static144.aClass103_74.method2745(local459);
									}
								}
								if (local6.aBoolean560 && local207 && local6.anObjectArray10 != null) {
									local459 = new Class5_Sub17();
									local459.aBoolean134 = true;
									local459.aClass201_3 = local6;
									local459.anInt1857 = Static316.aClass118_3.method4054() - local17;
									local459.anInt1849 = Static316.aClass118_3.method4050() - local22;
									local459.anObjectArray1 = local6.anObjectArray10;
									Static144.aClass103_74.method2745(local459);
								}
								if (local6.aBoolean560 && !local207) {
									local6.aBoolean560 = false;
									if (local6.anObjectArray6 != null) {
										local459 = new Class5_Sub17();
										local459.aBoolean134 = true;
										local459.aClass201_3 = local6;
										local459.anInt1857 = Static316.aClass118_3.method4054() - local17;
										local459.anInt1849 = Static316.aClass118_3.method4050() - local22;
										local459.anObjectArray1 = local6.anObjectArray6;
										Static229.aClass103_111.method2745(local459);
									}
								}
								if (local6.anObjectArray22 != null) {
									local459 = new Class5_Sub17();
									local459.aClass201_3 = local6;
									local459.anObjectArray1 = local6.anObjectArray22;
									Static309.aClass103_146.method2745(local459);
								}
								@Pc(1419) Class5_Sub17 local1419;
								if (local6.lb != null && Static147.anInt78 > local6.anInt6550) {
									if (local6.anIntArray610 == null || Static147.anInt78 - local6.anInt6550 > 32) {
										local459 = new Class5_Sub17();
										local459.aClass201_3 = local6;
										local459.anObjectArray1 = local6.lb;
										Static144.aClass103_74.method2745(local459);
									} else {
										label657: for (local278 = local6.anInt6550; local278 < Static147.anInt78; local278++) {
											local614 = Static354.anIntArray642[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray610.length; local374++) {
												if (local6.anIntArray610[local374] == local614) {
													local1419 = new Class5_Sub17();
													local1419.aClass201_3 = local6;
													local1419.anObjectArray1 = local6.lb;
													Static144.aClass103_74.method2745(local1419);
													break label657;
												}
											}
										}
									}
									local6.anInt6550 = Static147.anInt78;
								}
								if (local6.anObjectArray28 != null && Static332.anInt6833 > local6.anInt6485) {
									if (local6.anIntArray606 == null || Static332.anInt6833 - local6.anInt6485 > 32) {
										local459 = new Class5_Sub17();
										local459.aClass201_3 = local6;
										local459.anObjectArray1 = local6.anObjectArray28;
										Static144.aClass103_74.method2745(local459);
									} else {
										label633: for (local278 = local6.anInt6485; local278 < Static332.anInt6833; local278++) {
											local614 = Static280.anIntArray533[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray606.length; local374++) {
												if (local6.anIntArray606[local374] == local614) {
													local1419 = new Class5_Sub17();
													local1419.aClass201_3 = local6;
													local1419.anObjectArray1 = local6.anObjectArray28;
													Static144.aClass103_74.method2745(local1419);
													break label633;
												}
											}
										}
									}
									local6.anInt6485 = Static332.anInt6833;
								}
								if (local6.anObjectArray17 != null && Static70.anInt1369 > local6.anInt6547) {
									if (local6.anIntArray608 == null || Static70.anInt1369 - local6.anInt6547 > 32) {
										local459 = new Class5_Sub17();
										local459.aClass201_3 = local6;
										local459.anObjectArray1 = local6.anObjectArray17;
										Static144.aClass103_74.method2745(local459);
									} else {
										label609: for (local278 = local6.anInt6547; local278 < Static70.anInt1369; local278++) {
											local614 = Static287.anIntArray548[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray608.length; local374++) {
												if (local6.anIntArray608[local374] == local614) {
													local1419 = new Class5_Sub17();
													local1419.aClass201_3 = local6;
													local1419.anObjectArray1 = local6.anObjectArray17;
													Static144.aClass103_74.method2745(local1419);
													break label609;
												}
											}
										}
									}
									local6.anInt6547 = Static70.anInt1369;
								}
								if (local6.anObjectArray24 != null && Static320.anInt6194 > local6.anInt6497) {
									if (local6.anIntArray611 == null || Static320.anInt6194 - local6.anInt6497 > 32) {
										local459 = new Class5_Sub17();
										local459.aClass201_3 = local6;
										local459.anObjectArray1 = local6.anObjectArray24;
										Static144.aClass103_74.method2745(local459);
									} else {
										label585: for (local278 = local6.anInt6497; local278 < Static320.anInt6194; local278++) {
											local614 = Static334.anIntArray602[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray611.length; local374++) {
												if (local6.anIntArray611[local374] == local614) {
													local1419 = new Class5_Sub17();
													local1419.aClass201_3 = local6;
													local1419.anObjectArray1 = local6.anObjectArray24;
													Static144.aClass103_74.method2745(local1419);
													break label585;
												}
											}
										}
									}
									local6.anInt6497 = Static320.anInt6194;
								}
								if (local6.anObjectArray14 != null && Static205.anInt4075 > local6.anInt6552) {
									if (local6.anIntArray603 == null || Static205.anInt4075 - local6.anInt6552 > 32) {
										local459 = new Class5_Sub17();
										local459.aClass201_3 = local6;
										local459.anObjectArray1 = local6.anObjectArray14;
										Static144.aClass103_74.method2745(local459);
									} else {
										label561: for (local278 = local6.anInt6552; local278 < Static205.anInt4075; local278++) {
											local614 = Static166.anIntArray350[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray603.length; local374++) {
												if (local6.anIntArray603[local374] == local614) {
													local1419 = new Class5_Sub17();
													local1419.aClass201_3 = local6;
													local1419.anObjectArray1 = local6.anObjectArray14;
													Static144.aClass103_74.method2745(local1419);
													break label561;
												}
											}
										}
									}
									local6.anInt6552 = Static205.anInt4075;
								}
								if (Static86.anInt1607 > local6.anInt6553 && local6.anObjectArray32 != null) {
									local459 = new Class5_Sub17();
									local459.aClass201_3 = local6;
									local459.anObjectArray1 = local6.anObjectArray32;
									Static144.aClass103_74.method2745(local459);
								}
								if (Static195.anInt3884 > local6.anInt6553 && local6.anObjectArray9 != null) {
									local459 = new Class5_Sub17();
									local459.aClass201_3 = local6;
									local459.anObjectArray1 = local6.anObjectArray9;
									Static144.aClass103_74.method2745(local459);
								}
								if (Static186.anInt3700 > local6.anInt6553 && local6.anObjectArray11 != null) {
									local459 = new Class5_Sub17();
									local459.aClass201_3 = local6;
									local459.anObjectArray1 = local6.anObjectArray11;
									Static144.aClass103_74.method2745(local459);
								}
								if (Static214.anInt4234 > local6.anInt6553 && local6.anObjectArray31 != null) {
									local459 = new Class5_Sub17();
									local459.aClass201_3 = local6;
									local459.anObjectArray1 = local6.anObjectArray31;
									Static144.aClass103_74.method2745(local459);
								}
								if (Static245.anInt4912 > local6.anInt6553 && local6.anObjectArray20 != null) {
									local459 = new Class5_Sub17();
									local459.aClass201_3 = local6;
									local459.anObjectArray1 = local6.anObjectArray20;
									Static144.aClass103_74.method2745(local459);
								}
								local6.anInt6553 = Static190.anInt456;
								if (local6.anObjectArray7 != null) {
									for (local278 = 0; local278 < Static258.anInt5091; local278++) {
										@Pc(1887) Class5_Sub17 local1887 = new Class5_Sub17();
										local1887.aClass201_3 = local6;
										local1887.anInt1850 = Static55.aClass19Array3[local278].method429();
										local1887.anInt1852 = Static55.aClass19Array3[local278].method427();
										local1887.anObjectArray1 = local6.anObjectArray7;
										Static144.aClass103_74.method2745(local1887);
									}
								}
								if (Static51.aBoolean68 && local6.anObjectArray19 != null) {
									local459 = new Class5_Sub17();
									local459.aClass201_3 = local6;
									local459.anObjectArray1 = local6.anObjectArray19;
									Static144.aClass103_74.method2745(local459);
								}
							}
							if (local6.anInt6559 == 5 && local6.anInt6551 != -1) {
								local6.method5808().method5012(local6.anInt6510, Static236.aClass55_9);
							}
							Static259.method4534(local6);
							if (local6.anInt6559 == 0) {
								method719(arg0, local6.anInt6541, local28, local30, local32, local34, local17 - local6.anInt6558, local22 - local6.anInt6543, arg8, arg9);
								if (local6.aClass201Array121 != null) {
									method719(local6.aClass201Array121, local6.anInt6541, local28, local30, local32, local34, local17 - local6.anInt6558, local22 - local6.anInt6543, arg8, arg9);
								}
								@Pc(2007) Class5_Sub18 local2007 = (Class5_Sub18) Static198.aClass190_21.method5466((long) local6.anInt6541);
								if (local2007 != null) {
									if (local2007.anInt1866 == 0 && !Static93.aBoolean128 && local207 && !Static346.aBoolean577) {
										Static35.method575();
									}
									Static213.method3824(local2007.anInt1871, local17, local28, local32, arg8, arg9, local30, local22, local34);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static259.method4534(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method720() {
		@Pc(7) int local7 = Static133.aBoolean202 ? Static22.anInt472 : Static22.anInt472 + Static133.anInt2579;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class4_Sub5_Sub2 local14;
			if (local9 < 0) {
				local14 = Static192.aClass4_Sub5_Sub2_Sub1_2;
			} else if (local9 < Static22.anInt472) {
				local14 = Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local9]];
			} else {
				local14 = Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local9 - Static22.anInt472]];
			}
			if (local14.anInt5406 >= 0) {
				@Pc(40) int local40 = local14.method4807();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt6631 & 0x7F) == 0 && (local14.anInt6632 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt6631 & 0x7F) == 64 && (local14.anInt6632 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class4_Sub5_Sub2_Sub1 && local14.anInterface5_3 != null && Static283.anInt5563 >= local14.anInt5425 && Static283.anInt5563 < local14.anInt5420) {
					((Class4_Sub5_Sub2_Sub1) local14).aBoolean367 = false;
				}
				local14.anInt6633 = Static208.method3804(Static239.anInt4811, local14.anInt6631, local14.anInt6632);
				Static78.method1418(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method722() {
		@Pc(14) boolean local14 = Static136.anInt2582 == 1 && Static22.anInt472 > 200 || Static136.anInt2582 == 0 && Static22.anInt472 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static22.anInt472; local16++) {
			@Pc(23) Class4_Sub5_Sub2_Sub1 local23 = Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local16]];
			if (local23.method4126()) {
				local23.method5905();
				if (local23.aShort92 >= 0 && local23.aShort93 >= 0 && local23.aShort91 < Static22.anInt481 && local23.aShort90 < Static269.anInt5281) {
					local23.aBoolean367 = local23.aBoolean446 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean447) {
						local62++;
					}
					if (local23.anInt5359 > Static283.anInt5563) {
						local62 += 2;
					}
					local62 += 5 - local23.method4807() << 2;
					if (Static29.anInt590 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt5406 = local62 + 1;
				} else {
					local23.anInt5406 = -1;
				}
			} else {
				local23.anInt5406 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static133.anInt2579; local98++) {
			@Pc(105) Class4_Sub5_Sub2_Sub2 local105 = Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local98]];
			if (local105.method4826() && local105.aClass106_1.method2833()) {
				local105.method5905();
				if (local105.aShort92 >= 0 && local105.aShort93 >= 0 && local105.aShort91 < Static22.anInt481 && local105.aShort90 < Static269.anInt5281) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean447) {
						local141++;
					}
					if (local105.anInt5359 > Static283.anInt5563) {
						local141 += 2;
					}
					local141 += 5 - local105.method4807() << 2;
					if (Static29.anInt590 == 0) {
						if (local105.aClass106_1.aBoolean245) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static29.anInt590 == 1) {
						if (local105.aClass106_1.aBoolean245) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass106_1.aBoolean247) {
						local141 += 512;
					} else if (!local105.aClass106_1.aBoolean246) {
						local141 += 256;
					}
					local105.anInt5406 = local141 + 1;
				} else {
					local105.anInt5406 = -1;
				}
			} else {
				local105.anInt5406 = -1;
			}
		}
		for (local62 = 0; local62 < Static149.aClass131Array1.length; local62++) {
			@Pc(207) Class131 local207 = Static149.aClass131Array1[local62];
			if (local207 != null) {
				if (local207.anInt3892 == 1) {
					@Pc(218) Class4_Sub5_Sub2_Sub2 local218 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local207.anInt3886];
					if (local218 != null && local218.anInt5406 >= 0) {
						local218.anInt5406 += 1024;
					}
				} else if (local207.anInt3892 == 10) {
					@Pc(239) Class4_Sub5_Sub2_Sub1 local239 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local207.anInt3886];
					if (local239 != null && local239.anInt5406 >= 0) {
						local239.anInt5406 += 1024;
					}
				}
			}
		}
		Static192.aClass4_Sub5_Sub2_Sub1_2.anInt5406 = Integer.MAX_VALUE;
	}
}
