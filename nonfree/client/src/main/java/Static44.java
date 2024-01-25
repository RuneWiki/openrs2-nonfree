import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt1404;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!wo;")
	public static Class216 aClass216_10;

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
	public static int anInt1403 = 0;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1012() {
		@Pc(14) boolean local14 = Static323.anInt6216 == 1 && Static357.anInt4331 > 200 || Static323.anInt6216 == 0 && Static357.anInt4331 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static357.anInt4331; local16++) {
			@Pc(23) Class17_Sub1_Sub1_Sub1 local23 = Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local16]];
			if (local23.method558()) {
				local23.method4487();
				if (local23.aShort75 >= 0 && local23.aShort77 >= 0 && local23.aShort74 < Static233.anInt5573 && local23.aShort76 < Static134.anInt2971) {
					local23.aBoolean81 = local23.aBoolean471 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean473) {
						local62++;
					}
					if (local23.lb > Static5.anInt208) {
						local62 += 2;
					}
					local62 += 5 - local23.method4318() << 2;
					if (Static154.anInt3394 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt4842 = local62 + 1;
				} else {
					local23.anInt4842 = -1;
				}
			} else {
				local23.anInt4842 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static5.anInt200; local98++) {
			@Pc(105) Class17_Sub1_Sub1_Sub2 local105 = Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local98]];
			if (local105.method4333() && local105.aClass213_1.method5485()) {
				local105.method4487();
				if (local105.aShort75 >= 0 && local105.aShort77 >= 0 && local105.aShort74 < Static233.anInt5573 && local105.aShort76 < Static134.anInt2971) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean473) {
						local141++;
					}
					if (local105.lb > Static5.anInt208) {
						local141 += 2;
					}
					local141 += 5 - local105.method4318() << 2;
					if (Static154.anInt3394 == 0) {
						if (local105.aClass213_1.aBoolean636) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static154.anInt3394 == 1) {
						if (local105.aClass213_1.aBoolean636) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass213_1.aBoolean641) {
						local141 += 512;
					} else if (!local105.aClass213_1.aBoolean640) {
						local141 += 256;
					}
					local105.anInt4842 = local141 + 1;
				} else {
					local105.anInt4842 = -1;
				}
			} else {
				local105.anInt4842 = -1;
			}
		}
		for (local62 = 0; local62 < Static340.aClass105Array1.length; local62++) {
			@Pc(207) Class105 local207 = Static340.aClass105Array1[local62];
			if (local207 != null) {
				if (local207.anInt3081 == 1) {
					@Pc(218) Class17_Sub1_Sub1_Sub2 local218 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local207.anInt3076];
					if (local218 != null && local218.anInt4842 >= 0) {
						local218.anInt4842 += 1024;
					}
				} else if (local207.anInt3081 == 10) {
					@Pc(239) Class17_Sub1_Sub1_Sub1 local239 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local207.anInt3076];
					if (local239 != null && local239.anInt4842 >= 0) {
						local239.anInt4842 += 1024;
					}
				}
			}
		}
		Static198.aClass17_Sub1_Sub1_Sub1_3.anInt4842 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!aq;)Z")
	public static boolean method1013(@OriginalArg(0) Class12 arg0) {
		if (Static185.aBoolean369) {
			if (method1023(arg0).anInt6683 != 0) {
				return false;
			}
			if (arg0.anInt416 == 0) {
				return false;
			}
		}
		return arg0.aBoolean50;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!aq;)Lclient!aq;")
	public static Class12 method1014(@OriginalArg(0) Class12 arg0) {
		@Pc(4) int local4 = method1023(arg0).method5590();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static9.method319(arg0.anInt459);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!aq;IIIIIIIII)V")
	public static void method1016(@OriginalArg(0) Class12[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class12 local6 = arg0[local1];
			if (local6 != null && local6.anInt459 == arg1) {
				@Pc(17) int local17 = local6.anInt423 + arg6;
				@Pc(22) int local22 = local6.anInt447 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt416 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.lb;
					@Pc(45) int local45 = local22 + local6.anInt446;
					if (local6.anInt416 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt416 == 0 || local6.aBoolean41 || method1023(local6).anInt6683 != 0 || local6 == Static285.aClass12_12 || local6.anInt435 == 1338) {
					if (!method1013(local6)) {
						if (local6 == Static28.aClass12_3) {
							Static315.aBoolean594 = true;
							Static63.anInt5672 = local17;
							Static296.anInt5814 = local22;
						}
						if (local6.aBoolean45 || local28 < local32 && local30 < local34) {
							if (local6.anInt416 == 0 && local6.aBoolean35 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class1_Sub16 local151 = (Class1_Sub16) Static247.aClass16_28.method410(); local151 != null; local151 = (Class1_Sub16) Static247.aClass16_28.method419()) {
									if (local151.aBoolean250) {
										local151.method5628();
										local151.aClass12_5.aBoolean43 = false;
									}
								}
								if (Static30.anInt1224 == 0) {
									Static28.aClass12_3 = null;
									Static285.aClass12_12 = null;
								}
								Static174.anInt3787 = 0;
								Static320.aBoolean514 = false;
								Static129.aBoolean271 = false;
								if (!Static146.aBoolean308) {
									Static98.method2066();
								}
							}
							@Pc(207) boolean local207;
							if (Static222.aClass84_1.method5408() >= local28 && Static222.aClass84_1.method5406() >= local30 && Static222.aClass84_1.method5408() < local32 && Static222.aClass84_1.method5406() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static146.aBoolean308 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static249.method4473(local6, arg8 - local17, arg9 - local22);
							}
							@Pc(235) boolean local235 = false;
							if (Static222.aClass84_1.method5413() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static305.aClass1_Sub21_1 != null && Static305.aClass1_Sub21_1.method2701() == 0 && Static305.aClass1_Sub21_1.method2704() >= local28 && Static305.aClass1_Sub21_1.method2703() >= local30 && Static305.aClass1_Sub21_1.method2704() < local32 && Static305.aClass1_Sub21_1.method2703() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray6 != null) {
								for (local278 = 0; local278 < local6.aByteArray6.length; local278++) {
									if (Static57.aClass171_1.method4638(local6.aByteArray6[local278])) {
										if (local6.anIntArray54 == null || Static5.anInt208 >= local6.anIntArray54[local278]) {
											@Pc(310) byte local310 = local6.aByteArray5[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static57.aClass171_1.method4638(86) && !Static57.aClass171_1.method4638(82) && !Static57.aClass171_1.method4638(81)) && ((local310 & 0x2) == 0 || Static57.aClass171_1.method4638(86)) && ((local310 & 0x1) == 0 || Static57.aClass171_1.method4638(82)) && ((local310 & 0x4) == 0 || Static57.aClass171_1.method4638(81))) {
												Static62.method1539("", -1, local278 + 1, local6.anInt465);
												local374 = local6.anIntArray52[local278];
												if (local6.anIntArray54 == null) {
													local6.anIntArray54 = new int[local6.aByteArray6.length];
												}
												if (local374 == 0) {
													local6.anIntArray54[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray54[local278] = Static5.anInt208 + local374;
												}
											}
										}
									} else if (local6.anIntArray54 != null) {
										local6.anIntArray54[local278] = 0;
									}
								}
							}
							if (local245) {
								Static96.method5289(local6, Static305.aClass1_Sub21_1.method2703() - local22, Static305.aClass1_Sub21_1.method2704() - local17);
							}
							if (Static28.aClass12_3 != null && Static28.aClass12_3 != local6 && local207 && method1023(local6).method5591()) {
								Static244.aClass12_15 = local6;
							}
							if (local6 == Static285.aClass12_12) {
								Static198.aBoolean118 = true;
								Static318.anInt6136 = local17;
								Static101.anInt2415 = local22;
							}
							if (local6.aBoolean41 || local6.anInt435 != 0) {
								@Pc(459) Class1_Sub16 local459;
								if (local207 && Static195.anInt4169 != 0 && local6.anObjectArray2 != null) {
									local459 = new Class1_Sub16();
									local459.aBoolean250 = true;
									local459.aClass12_5 = local6;
									local459.anInt2538 = Static195.anInt4169;
									local459.anObjectArray34 = local6.anObjectArray2;
									Static247.aClass16_28.method416(local459);
								}
								if (Static28.aClass12_3 != null || Static146.aBoolean308 || local6.anInt435 != 1400 && Static174.anInt3787 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt435 != 0) {
									if (local6.anInt435 == 1337 || local6.anInt435 == 1403) {
										Static173.aClass12_8 = local6;
										if (Static127.aClass212_1 != null) {
											Static127.aClass212_1.method5470(local6.anInt446, Static208.aClass32_11);
										}
										if (local6.anInt435 == 1337) {
											if (!Static146.aBoolean308 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static136.method2779(arg8, arg9, Static208.aClass32_11);
												for (@Pc(542) Class8_Sub7 local542 = (Class8_Sub7) Static49.aClass217_1.method5683(); local542 != null; local542 = (Class8_Sub7) Static49.aClass217_1.method5679()) {
													if (arg8 >= local542.anInt4109 && arg8 < local542.anInt4110 && arg9 >= local542.anInt4111 && arg9 < local542.anInt4115) {
														Static98.method2066();
														Static113.method2457(local542.aClass17_Sub1_Sub1_1);
													}
												}
											}
											Static163.method3262(local6, local22, local17);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt435 == 1338) {
										if (local6.method367(Static208.aClass32_11) == null || Static144.anInt3144 != 0 && Static144.anInt3144 != 3 || Static146.aBoolean308 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray46[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray47[local614]) {
											continue;
										}
										local278 -= local6.lb / 2;
										local614 -= local6.anInt446 / 2;
										if (Static147.anInt3204 == 4) {
											local653 = (int) Static75.aFloat13 & 0x3FFF;
										} else {
											local653 = (int) Static75.aFloat13 + Static337.anInt6461 & 0x3FFF;
										}
										@Pc(665) int local665 = Class1_Sub3_Sub8.anIntArray159[local653];
										@Pc(669) int local669 = Class1_Sub3_Sub8.anIntArray156[local653];
										if (Static147.anInt3204 != 4) {
											local665 = local665 * (Static287.anInt5748 + 256) >> 8;
											local669 = local669 * (Static287.anInt5748 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static147.anInt3204 == 4) {
											local719 = (Static133.anInt2962 >> 7) + (local698 >> 2);
											local727 = (Static77.anInt2010 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static198.aClass17_Sub1_Sub1_Sub1_3.method4318() - 1) * 64;
											local719 = (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 - local736 >> 7) + (local698 >> 2);
											local727 = (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 - local736 >> 7) - (local708 >> 2);
										}
										if (Static91.aBoolean214 && (Static257.anInt5340 & 0x40) != 0) {
											@Pc(769) Class12 local769 = Static209.method3975(Static97.anInt5544, Static349.anInt6682);
											if (local769 == null) {
												Static96.method5290();
											} else {
												Static58.method1506(Static175.anInt3793, " ->", local727, 1L, Static24.aString15, local719, 60);
											}
											continue;
										}
										if (Static8.anInt5875 == 1) {
											Static58.method1506(-1, "", local727, 1L, Static113.aClass34_82.method1285(Static259.anInt2907), local719, 59);
										}
										Static58.method1506(-1, "", local727, 1L, Static328.aString61, local719, 21);
										continue;
									}
									if (local6.anInt435 == 1400) {
										Static72.aClass12_4 = local6;
										if (local207) {
											Static320.aBoolean514 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static305.aClass1_Sub21_1.method2704() - local17 - local6.lb / 2) * 2.0D / (double) Static79.aFloat49);
											local614 = (int) -((double) (Static305.aClass1_Sub21_1.method2703() - local22 - local6.anInt446 / 2) * 2.0D / (double) Static79.aFloat49);
											local374 = Static62.anInt1771 + local278 + Static79.anInt4162;
											local653 = Static169.anInt3636 + local614 + Static79.anInt4157;
											@Pc(873) Class1_Sub4_Sub1 local873 = Static228.method4245();
											if (local873 == null) {
												continue;
											}
											@Pc(878) int[] local878 = new int[3];
											local873.method317(local878, local653, local374);
											if (local878 != null) {
												if (Static57.aClass171_1.method4638(82) && Static342.anInt2998 > 0) {
													Static88.method1916(local878[2], local878[0], local878[1]);
													continue;
												}
												Static129.aBoolean271 = true;
												Static5.anInt194 = local878[0];
												Static72.anInt1932 = local878[1];
												Static192.anInt4116 = local878[2];
											}
											Static174.anInt3787 = 1;
											Static246.aBoolean485 = false;
											Static136.anInt3010 = Static222.aClass84_1.method5408();
											Static306.anInt6042 = Static222.aClass84_1.method5406();
											continue;
										}
										if (local235 && Static174.anInt3787 > 0) {
											if (Static174.anInt3787 == 1 && (Static136.anInt3010 != Static222.aClass84_1.method5408() || Static306.anInt6042 != Static222.aClass84_1.method5406())) {
												Static55.anInt1657 = Static62.anInt1771;
												Static23.anInt932 = Static169.anInt3636;
												Static174.anInt3787 = 2;
											}
											if (Static174.anInt3787 == 2) {
												Static246.aBoolean485 = true;
												Static185.method3615(Static55.anInt1657 + (int) ((double) (Static136.anInt3010 - Static222.aClass84_1.method5408()) * 2.0D / (double) Static79.aFloat50));
												Static123.method2595(Static23.anInt932 - (int) ((double) (Static306.anInt6042 - Static222.aClass84_1.method5406()) * 2.0D / (double) Static79.aFloat50));
											}
											continue;
										}
										if (Static174.anInt3787 > 0 && !Static246.aBoolean485) {
											if ((Static270.anInt5519 == 1 || method1030()) && Static115.anInt2635 > 2) {
												Static307.method5153(2, Static136.anInt3010, Static306.anInt6042);
											} else if (Static72.method1686()) {
												Static307.method5153(0, Static136.anInt3010, Static306.anInt6042);
											}
										}
										Static174.anInt3787 = 0;
										continue;
									}
									if (local6.anInt435 == 1401) {
										if (local235) {
											Static112.method2424(Static222.aClass84_1.method5406() - local22, local6.anInt446, local6.lb, Static222.aClass84_1.method5408() - local17);
										}
										continue;
									}
									if (local6.anInt435 == 1406) {
										Static13.method382(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean49 && local245) {
									local6.aBoolean49 = true;
									if (local6.anObjectArray23 != null) {
										local459 = new Class1_Sub16();
										local459.aBoolean250 = true;
										local459.aClass12_5 = local6;
										local459.anInt2536 = Static305.aClass1_Sub21_1.method2704() - local17;
										local459.anInt2538 = Static305.aClass1_Sub21_1.method2703() - local22;
										local459.anObjectArray34 = local6.anObjectArray23;
										Static247.aClass16_28.method416(local459);
									}
								}
								if (local6.aBoolean49 && local235 && local6.anObjectArray19 != null) {
									local459 = new Class1_Sub16();
									local459.aBoolean250 = true;
									local459.aClass12_5 = local6;
									local459.anInt2536 = Static222.aClass84_1.method5408() - local17;
									local459.anInt2538 = Static222.aClass84_1.method5406() - local22;
									local459.anObjectArray34 = local6.anObjectArray19;
									Static247.aClass16_28.method416(local459);
								}
								if (local6.aBoolean49 && !local235) {
									local6.aBoolean49 = false;
									if (local6.anObjectArray6 != null) {
										local459 = new Class1_Sub16();
										local459.aBoolean250 = true;
										local459.aClass12_5 = local6;
										local459.anInt2536 = Static222.aClass84_1.method5408() - local17;
										local459.anInt2538 = Static222.aClass84_1.method5406() - local22;
										local459.anObjectArray34 = local6.anObjectArray6;
										Static197.aClass16_25.method416(local459);
									}
								}
								if (local235 && local6.anObjectArray24 != null) {
									local459 = new Class1_Sub16();
									local459.aBoolean250 = true;
									local459.aClass12_5 = local6;
									local459.anInt2536 = Static222.aClass84_1.method5408() - local17;
									local459.anInt2538 = Static222.aClass84_1.method5406() - local22;
									local459.anObjectArray34 = local6.anObjectArray24;
									Static247.aClass16_28.method416(local459);
								}
								if (!local6.aBoolean43 && local207) {
									local6.aBoolean43 = true;
									if (local6.anObjectArray12 != null) {
										local459 = new Class1_Sub16();
										local459.aBoolean250 = true;
										local459.aClass12_5 = local6;
										local459.anInt2536 = Static222.aClass84_1.method5408() - local17;
										local459.anInt2538 = Static222.aClass84_1.method5406() - local22;
										local459.anObjectArray34 = local6.anObjectArray12;
										Static247.aClass16_28.method416(local459);
									}
								}
								if (local6.aBoolean43 && local207 && local6.anObjectArray30 != null) {
									local459 = new Class1_Sub16();
									local459.aBoolean250 = true;
									local459.aClass12_5 = local6;
									local459.anInt2536 = Static222.aClass84_1.method5408() - local17;
									local459.anInt2538 = Static222.aClass84_1.method5406() - local22;
									local459.anObjectArray34 = local6.anObjectArray30;
									Static247.aClass16_28.method416(local459);
								}
								if (local6.aBoolean43 && !local207) {
									local6.aBoolean43 = false;
									if (local6.anObjectArray11 != null) {
										local459 = new Class1_Sub16();
										local459.aBoolean250 = true;
										local459.aClass12_5 = local6;
										local459.anInt2536 = Static222.aClass84_1.method5408() - local17;
										local459.anInt2538 = Static222.aClass84_1.method5406() - local22;
										local459.anObjectArray34 = local6.anObjectArray11;
										Static197.aClass16_25.method416(local459);
									}
								}
								if (local6.anObjectArray15 != null) {
									local459 = new Class1_Sub16();
									local459.aClass12_5 = local6;
									local459.anObjectArray34 = local6.anObjectArray15;
									Static230.aClass16_27.method416(local459);
								}
								@Pc(1419) Class1_Sub16 local1419;
								if (local6.anObjectArray5 != null && Static137.anInt3036 > local6.anInt457) {
									if (local6.anIntArray60 == null || Static137.anInt3036 - local6.anInt457 > 32) {
										local459 = new Class1_Sub16();
										local459.aClass12_5 = local6;
										local459.anObjectArray34 = local6.anObjectArray5;
										Static247.aClass16_28.method416(local459);
									} else {
										label657: for (local278 = local6.anInt457; local278 < Static137.anInt3036; local278++) {
											local614 = Static315.anIntArray498[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray60.length; local374++) {
												if (local6.anIntArray60[local374] == local614) {
													local1419 = new Class1_Sub16();
													local1419.aClass12_5 = local6;
													local1419.anObjectArray34 = local6.anObjectArray5;
													Static247.aClass16_28.method416(local1419);
													break label657;
												}
											}
										}
									}
									local6.anInt457 = Static137.anInt3036;
								}
								if (local6.anObjectArray21 != null && Static93.anInt2300 > local6.anInt439) {
									if (local6.anIntArray59 == null || Static93.anInt2300 - local6.anInt439 > 32) {
										local459 = new Class1_Sub16();
										local459.aClass12_5 = local6;
										local459.anObjectArray34 = local6.anObjectArray21;
										Static247.aClass16_28.method416(local459);
									} else {
										label633: for (local278 = local6.anInt439; local278 < Static93.anInt2300; local278++) {
											local614 = Static351.anIntArray530[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray59.length; local374++) {
												if (local6.anIntArray59[local374] == local614) {
													local1419 = new Class1_Sub16();
													local1419.aClass12_5 = local6;
													local1419.anObjectArray34 = local6.anObjectArray21;
													Static247.aClass16_28.method416(local1419);
													break label633;
												}
											}
										}
									}
									local6.anInt439 = Static93.anInt2300;
								}
								if (local6.anObjectArray29 != null && Static170.anInt3655 > local6.anInt421) {
									if (local6.anIntArray55 == null || Static170.anInt3655 - local6.anInt421 > 32) {
										local459 = new Class1_Sub16();
										local459.aClass12_5 = local6;
										local459.anObjectArray34 = local6.anObjectArray29;
										Static247.aClass16_28.method416(local459);
									} else {
										label609: for (local278 = local6.anInt421; local278 < Static170.anInt3655; local278++) {
											local614 = Static157.anIntArray437[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray55.length; local374++) {
												if (local6.anIntArray55[local374] == local614) {
													local1419 = new Class1_Sub16();
													local1419.aClass12_5 = local6;
													local1419.anObjectArray34 = local6.anObjectArray29;
													Static247.aClass16_28.method416(local1419);
													break label609;
												}
											}
										}
									}
									local6.anInt421 = Static170.anInt3655;
								}
								if (local6.anObjectArray10 != null && Static111.anInt2597 > local6.anInt389) {
									if (local6.anIntArray50 == null || Static111.anInt2597 - local6.anInt389 > 32) {
										local459 = new Class1_Sub16();
										local459.aClass12_5 = local6;
										local459.anObjectArray34 = local6.anObjectArray10;
										Static247.aClass16_28.method416(local459);
									} else {
										label585: for (local278 = local6.anInt389; local278 < Static111.anInt2597; local278++) {
											local614 = Static345.anIntArray526[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray50.length; local374++) {
												if (local6.anIntArray50[local374] == local614) {
													local1419 = new Class1_Sub16();
													local1419.aClass12_5 = local6;
													local1419.anObjectArray34 = local6.anObjectArray10;
													Static247.aClass16_28.method416(local1419);
													break label585;
												}
											}
										}
									}
									local6.anInt389 = Static111.anInt2597;
								}
								if (local6.anObjectArray9 != null && Static356.anInt6802 > local6.anInt429) {
									if (local6.anIntArray48 == null || Static356.anInt6802 - local6.anInt429 > 32) {
										local459 = new Class1_Sub16();
										local459.aClass12_5 = local6;
										local459.anObjectArray34 = local6.anObjectArray9;
										Static247.aClass16_28.method416(local459);
									} else {
										label561: for (local278 = local6.anInt429; local278 < Static356.anInt6802; local278++) {
											local614 = Static4.anIntArray19[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray48.length; local374++) {
												if (local6.anIntArray48[local374] == local614) {
													local1419 = new Class1_Sub16();
													local1419.aClass12_5 = local6;
													local1419.anObjectArray34 = local6.anObjectArray9;
													Static247.aClass16_28.method416(local1419);
													break label561;
												}
											}
										}
									}
									local6.anInt429 = Static356.anInt6802;
								}
								if (Static89.anInt2233 > local6.anInt428 && local6.anObjectArray16 != null) {
									local459 = new Class1_Sub16();
									local459.aClass12_5 = local6;
									local459.anObjectArray34 = local6.anObjectArray16;
									Static247.aClass16_28.method416(local459);
								}
								if (Static88.anInt2213 > local6.anInt428 && local6.anObjectArray22 != null) {
									local459 = new Class1_Sub16();
									local459.aClass12_5 = local6;
									local459.anObjectArray34 = local6.anObjectArray22;
									Static247.aClass16_28.method416(local459);
								}
								if (Static128.anInt6687 > local6.anInt428 && local6.anObjectArray14 != null) {
									local459 = new Class1_Sub16();
									local459.aClass12_5 = local6;
									local459.anObjectArray34 = local6.anObjectArray14;
									Static247.aClass16_28.method416(local459);
								}
								if (Static27.anInt1010 > local6.anInt428 && local6.anObjectArray27 != null) {
									local459 = new Class1_Sub16();
									local459.aClass12_5 = local6;
									local459.anObjectArray34 = local6.anObjectArray27;
									Static247.aClass16_28.method416(local459);
								}
								if (Static260.anInt5590 > local6.anInt428 && local6.anObjectArray25 != null) {
									local459 = new Class1_Sub16();
									local459.aClass12_5 = local6;
									local459.anObjectArray34 = local6.anObjectArray25;
									Static247.aClass16_28.method416(local459);
								}
								local6.anInt428 = Static314.anInt6116;
								if (local6.anObjectArray13 != null) {
									for (local278 = 0; local278 < Static111.anInt2598; local278++) {
										@Pc(1887) Class1_Sub16 local1887 = new Class1_Sub16();
										local1887.aClass12_5 = local6;
										local1887.anInt2537 = Static256.aClass85Array1[local278].method2448();
										local1887.anInt2532 = Static256.aClass85Array1[local278].method2443();
										local1887.anObjectArray34 = local6.anObjectArray13;
										Static247.aClass16_28.method416(local1887);
									}
								}
								if (Static42.aBoolean128 && local6.anObjectArray4 != null) {
									local459 = new Class1_Sub16();
									local459.aClass12_5 = local6;
									local459.anObjectArray34 = local6.anObjectArray4;
									Static247.aClass16_28.method416(local459);
								}
							}
							if (local6.anInt416 == 5 && local6.anInt440 != -1) {
								local6.method366().method5470(local6.anInt446, Static208.aClass32_11);
							}
							Static267.method4704(local6);
							if (local6.anInt416 == 0) {
								method1016(arg0, local6.anInt465, local28, local30, local32, local34, local17 - local6.anInt400, local22 - local6.anInt419, arg8, arg9);
								if (local6.aClass12Array3 != null) {
									method1016(local6.aClass12Array3, local6.anInt465, local28, local30, local32, local34, local17 - local6.anInt400, local22 - local6.anInt419, arg8, arg9);
								}
								@Pc(2007) Class1_Sub37 local2007 = (Class1_Sub37) Static351.aClass197_33.method5157((long) local6.anInt465);
								if (local2007 != null) {
									if (local2007.anInt6278 == 0 && !Static146.aBoolean308 && local207 && !Static185.aBoolean369) {
										Static98.method2066();
									}
									Static227.method4237(local22, local32, local17, arg9, local30, local2007.anInt6281, arg8, local34, local28);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static267.method4704(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1019() {
		for (@Pc(1) int local1 = -1; local1 < Static357.anInt4331 + Static5.anInt200; local1++) {
			@Pc(6) Class17_Sub1_Sub1 local6;
			if (local1 < 0) {
				local6 = Static198.aClass17_Sub1_Sub1_Sub1_3;
			} else if (local1 < Static357.anInt4331) {
				local6 = Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local1]];
			} else {
				local6 = Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local1 - Static357.anInt4331]];
			}
			if (local6.anInt4842 >= 0) {
				@Pc(32) int local32 = local6.method4318();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt5109 & 0x7F) != 0 || (local6.anInt5108 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt5109 & 0x7F) != 64 || (local6.anInt5108 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt5109 >> 7;
					local73 = local6.anInt5108 >> 7;
					if (local6.anInt4842 > Static193.anIntArrayArray44[local68][local73]) {
						Static193.anIntArrayArray44[local68][local73] = local6.anInt4842;
						Static114.anIntArrayArray48[local68][local73] = 1;
					} else if (local6.anInt4842 == Static193.anIntArrayArray44[local68][local73]) {
						local109 = Static114.anIntArrayArray48[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt5109 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt5108 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt5109 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt5108 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt4842 > Static193.anIntArrayArray44[local151][local154]) {
								Static193.anIntArrayArray44[local151][local154] = local6.anInt4842;
								Static114.anIntArrayArray48[local151][local154] = 1;
							} else if (local6.anInt4842 == Static193.anIntArrayArray44[local151][local154]) {
								local109 = Static114.anIntArrayArray48[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1022() {
		@Pc(7) int local7 = Static282.aBoolean649 ? Static357.anInt4331 : Static357.anInt4331 + Static5.anInt200;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class17_Sub1_Sub1 local14;
			if (local9 < 0) {
				local14 = Static198.aClass17_Sub1_Sub1_Sub1_3;
			} else if (local9 < Static357.anInt4331) {
				local14 = Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local9]];
			} else {
				local14 = Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local9 - Static357.anInt4331]];
			}
			local14.anInt4860 = 0;
			if (local14.anInt4842 < 0) {
				local14.aBoolean473 = false;
			} else {
				@Pc(47) int local47 = local14.method4318();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt5109 & 0x7F) != 0 || (local14.anInt5108 & 0x7F) != 0) {
						local14.aBoolean473 = false;
						continue;
					}
				} else if ((local14.anInt5109 & 0x7F) != 64 || (local14.anInt5108 & 0x7F) != 64) {
					local14.aBoolean473 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt5109 >> 7;
					local94 = local14.anInt5108 >> 7;
					if (local14.anInt4842 != Static193.anIntArrayArray44[local89][local94]) {
						local14.aBoolean473 = true;
						continue;
					}
					if (Static114.anIntArrayArray48[local89][local94] > 1) {
						local119 = Static114.anIntArrayArray48[local89][local94]--;
						local14.aBoolean473 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt5109 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt5108 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt5109 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt5108 + local89 >> 7;
					if (!Static233.method4781(local148, local155, local94, local162, local14.anInt4842)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt4842 == Static193.anIntArrayArray44[local173][local176]) {
									local119 = Static114.anIntArrayArray48[local173][local176]--;
								}
							}
						}
						local14.aBoolean473 = true;
						continue;
					}
				}
				if (local14 instanceof Class17_Sub1_Sub1_Sub1 && local14.anInterface5_3 != null && Static5.anInt208 >= local14.anInt4894 && Static5.anInt208 < local14.anInt4898) {
					((Class17_Sub1_Sub1_Sub1) local14).aBoolean81 = false;
				}
				local14.aBoolean473 = false;
				local14.anInt5112 = Static94.method2022(local14.anInt5108, local14.anInt5109, Static242.anInt6745);
				Static63.method4865(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!aq;)Lclient!wi;")
	public static Class1_Sub42 method1023(@OriginalArg(0) Class12 arg0) {
		@Pc(13) Class1_Sub42 local13 = (Class1_Sub42) Static264.aClass197_32.method5157(((long) arg0.anInt465 << 32) + (long) arg0.anInt410);
		return local13 == null ? arg0.aClass1_Sub42_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)I")
	public static int method1024() {
		if (Static197.aFrame2 == null) {
			return Static21.aBoolean83 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1026() {
		Static103.anInt2458 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static5.anInt200; local3++) {
			@Pc(10) Class17_Sub1_Sub1_Sub2 local10 = Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local3]];
			if (local10.aBoolean473 && local10.method4328() != -1) {
				@Pc(28) int local28 = (local10.method4318() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt5109 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt5108 - local28 >> 7;
				@Pc(48) Class17_Sub1_Sub1 local48 = Static282.method5533(local35, local42, Static242.anInt6745);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt4867;
					if (local48 instanceof Class17_Sub1_Sub1_Sub2) {
						local53 += 2048;
					}
					if (local48.anInt4860 == 0 && local48.method4328() != -1) {
						Static110.anIntArray514[Static103.anInt2458] = local53;
						Static8.anIntArray493[Static103.anInt2458] = local53;
						Static103.anInt2458++;
						local48.anInt4860++;
					}
					Static110.anIntArray514[Static103.anInt2458] = local53;
					Static8.anIntArray493[Static103.anInt2458] = local10.anInt4867 + 2048;
					Static103.anInt2458++;
					local48.anInt4860++;
				}
			}
		}
		Static152.method4089(0, Static103.anInt2458 - 1, Static110.anIntArray514, Static8.anIntArray493);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg2) {
			Static173.method3438(arg6, arg4, arg0, arg2, arg3, arg5);
		} else if (Static268.anInt5477 <= arg4 - arg2 && Static342.anInt3000 >= arg4 + arg2 && arg3 - arg1 >= Static197.anInt4211 && arg1 + arg3 <= Static326.anInt2469) {
			Static90.method1958(arg2, arg3, arg4, arg0, arg5, arg1, arg6);
		} else {
			Static134.method2752(arg5, arg4, arg1, arg2, arg6, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method1028() {
		for (@Pc(1) int local1 = 0; local1 < Static233.anInt5573; local1++) {
			@Pc(6) int[] local6 = Static193.anIntArrayArray44[local1];
			for (@Pc(8) int local8 = 0; local8 < Static134.anInt2971; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method1029() {
		@Pc(7) int local7 = Static282.aBoolean649 ? Static357.anInt4331 : Static357.anInt4331 + Static5.anInt200;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class17_Sub1_Sub1 local14;
			if (local9 < 0) {
				local14 = Static198.aClass17_Sub1_Sub1_Sub1_3;
			} else if (local9 < Static357.anInt4331) {
				local14 = Static102.aClass17_Sub1_Sub1_Sub1Array1[Static298.anIntArray492[local9]];
			} else {
				local14 = Static140.aClass17_Sub1_Sub1_Sub2Array1[Static171.anIntArray333[local9 - Static357.anInt4331]];
			}
			if (local14.anInt4842 >= 0) {
				@Pc(40) int local40 = local14.method4318();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt5109 & 0x7F) == 0 && (local14.anInt5108 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt5109 & 0x7F) == 64 && (local14.anInt5108 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class17_Sub1_Sub1_Sub1 && local14.anInterface5_3 != null && Static5.anInt208 >= local14.anInt4894 && Static5.anInt208 < local14.anInt4898) {
					((Class17_Sub1_Sub1_Sub1) local14).aBoolean81 = false;
				}
				local14.anInt5112 = Static94.method2022(local14.anInt5108, local14.anInt5109, Static242.anInt6745);
				Static63.method4865(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)Z")
	public static boolean method1030() {
		@Pc(8) Class1_Sub23 local8 = (Class1_Sub23) Static188.aClass16_22.aClass1_25.aClass1_251;
		if (local8 == null || local8 == Static188.aClass16_22.aClass1_25) {
			return false;
		} else {
			if (local8.anInt3588 >= 2000) {
				local8.anInt3588 -= 2000;
			}
			return local8.anInt3588 == 1010;
		}
	}
}
