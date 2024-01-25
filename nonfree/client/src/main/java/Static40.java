import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
	public static int anInt1099 = 0;

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method842() {
		@Pc(7) int local7 = Static245.aBoolean67 ? Static167.anInt3454 : Static167.anInt3454 + Static271.anInt5578;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class10_Sub1_Sub2 local14;
			if (local9 < 0) {
				local14 = Static127.aClass10_Sub1_Sub2_Sub2_1;
			} else if (local9 < Static167.anInt3454) {
				local14 = Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local9]];
			} else {
				local14 = Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local9 - Static167.anInt3454]];
			}
			local14.anInt4042 = 0;
			if (local14.anInt4052 < 0) {
				local14.aBoolean308 = false;
			} else {
				@Pc(47) int local47 = local14.method3402();
				if ((local47 & 0x1) == 0) {
					if ((local14.anInt6728 & 0x7F) != 0 || (local14.anInt6726 & 0x7F) != 0) {
						local14.aBoolean308 = false;
						continue;
					}
				} else if ((local14.anInt6728 & 0x7F) != 64 || (local14.anInt6726 & 0x7F) != 64) {
					local14.aBoolean308 = false;
					continue;
				}
				@Pc(119) int local119;
				@Pc(89) int local89;
				@Pc(94) int local94;
				if (local47 == 1) {
					local89 = local14.anInt6728 >> 7;
					local94 = local14.anInt6726 >> 7;
					if (local14.anInt4052 != Static37.anIntArrayArray7[local89][local94]) {
						local14.aBoolean308 = true;
						continue;
					}
					if (Static332.anIntArrayArray55[local89][local94] > 1) {
						local119 = Static332.anIntArrayArray55[local89][local94]--;
						local14.aBoolean308 = true;
						continue;
					}
				} else {
					local89 = (local47 - 1) * 64 + 60;
					local94 = local14.anInt6728 - local89 >> 7;
					@Pc(148) int local148 = local14.anInt6726 - local89 >> 7;
					@Pc(155) int local155 = local14.anInt6728 + local89 >> 7;
					@Pc(162) int local162 = local14.anInt6726 + local89 >> 7;
					if (!Static96.method1533(local94, local148, local14.anInt4052, local155, local162)) {
						for (@Pc(173) int local173 = local94; local173 <= local155; local173++) {
							for (@Pc(176) int local176 = local148; local176 <= local162; local176++) {
								if (local14.anInt4052 == Static37.anIntArrayArray7[local173][local176]) {
									local119 = Static332.anIntArrayArray55[local173][local176]--;
								}
							}
						}
						local14.aBoolean308 = true;
						continue;
					}
				}
				if (local14 instanceof Class10_Sub1_Sub2_Sub2 && local14.anInterface4_3 != null && Static282.anInt3516 >= local14.anInt4077 && Static282.anInt3516 < local14.anInt4079) {
					((Class10_Sub1_Sub2_Sub2) local14).aBoolean311 = false;
				}
				local14.aBoolean308 = false;
				local14.anInt6722 = Static352.method5834(local14.anInt6726, local14.anInt6728, Static127.anInt2487);
				Static189.method5292(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method843() {
		for (@Pc(1) int local1 = -1; local1 < Static167.anInt3454 + Static271.anInt5578; local1++) {
			@Pc(6) Class10_Sub1_Sub2 local6;
			if (local1 < 0) {
				local6 = Static127.aClass10_Sub1_Sub2_Sub2_1;
			} else if (local1 < Static167.anInt3454) {
				local6 = Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local1]];
			} else {
				local6 = Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local1 - Static167.anInt3454]];
			}
			if (local6.anInt4052 >= 0) {
				@Pc(32) int local32 = local6.method3402();
				if ((local32 & 0x1) == 0) {
					if ((local6.anInt6728 & 0x7F) != 0 || (local6.anInt6726 & 0x7F) != 0) {
						continue;
					}
				} else if ((local6.anInt6728 & 0x7F) != 64 || (local6.anInt6726 & 0x7F) != 64) {
					continue;
				}
				@Pc(109) int local109;
				@Pc(68) int local68;
				@Pc(73) int local73;
				if (local32 == 1) {
					local68 = local6.anInt6728 >> 7;
					local73 = local6.anInt6726 >> 7;
					if (local6.anInt4052 > Static37.anIntArrayArray7[local68][local73]) {
						Static37.anIntArrayArray7[local68][local73] = local6.anInt4052;
						Static332.anIntArrayArray55[local68][local73] = 1;
					} else if (local6.anInt4052 == Static37.anIntArrayArray7[local68][local73]) {
						local109 = Static332.anIntArrayArray55[local68][local73]++;
					}
				} else {
					local68 = (local32 - 1) * 64 + 60;
					local73 = local6.anInt6728 - local68 >> 7;
					@Pc(135) int local135 = local6.anInt6726 - local68 >> 7;
					@Pc(142) int local142 = local6.anInt6728 + local68 >> 7;
					@Pc(149) int local149 = local6.anInt6726 + local68 >> 7;
					for (@Pc(151) int local151 = local73; local151 <= local142; local151++) {
						for (@Pc(154) int local154 = local135; local154 <= local149; local154++) {
							if (local6.anInt4052 > Static37.anIntArrayArray7[local151][local154]) {
								Static37.anIntArrayArray7[local151][local154] = local6.anInt4052;
								Static332.anIntArrayArray55[local151][local154] = 1;
							} else if (local6.anInt4052 == Static37.anIntArrayArray7[local151][local154]) {
								local109 = Static332.anIntArrayArray55[local151][local154]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ps;IIIIIII)V")
	public static void method844(@OriginalArg(0) Class163[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class163 local6 = arg0[local1];
			if (local6 != null && local6.anInt4918 == arg1) {
				@Pc(17) int local17 = local6.anInt5012 + arg6;
				@Pc(22) int local22 = local6.anInt4993 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4934 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4991;
					@Pc(45) int local45 = local22 + local6.anInt4935;
					if (local6.anInt4934 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (!local6.aBoolean411 || local6.anInt4934 == 0 || local6.aBoolean410 || method857(local6).anInt1311 != 0 || local6 == Static177.aClass163_12 || local6.anInt4926 == 1338) {
					if (!local6.aBoolean411 || !method859(local6)) {
						if (local6 == Static157.aClass163_11) {
							Static152.aBoolean242 = true;
							Static332.anInt6454 = local17;
							Static289.anInt5794 = local22;
						}
						if (!local6.aBoolean411 || local6.aBoolean399 || local28 < local32 && local30 < local34) {
							if (local6.anInt4934 == 0) {
								if (!local6.aBoolean411 && method859(local6) && Static139.aClass163_10 != local6) {
									continue;
								}
								if (local6.aBoolean405 && Static208.anInt4358 >= local28 && Static28.anInt538 >= local30 && Static208.anInt4358 < local32 && Static28.anInt538 < local34) {
									for (@Pc(175) Class1_Sub8 local175 = (Class1_Sub8) Static339.aClass14_37.method302(); local175 != null; local175 = (Class1_Sub8) Static339.aClass14_37.method313()) {
										if (local175.aBoolean77) {
											local175.method5796();
											local175.aClass163_3.aBoolean400 = false;
										}
									}
									if (Static143.anInt2978 == 0) {
										Static157.aClass163_11 = null;
										Static177.aClass163_12 = null;
									}
									Static148.anInt3053 = 0;
									Static278.aBoolean472 = false;
									Static205.aBoolean340 = false;
									if (!Static308.aBoolean499) {
										Static10.method166();
									}
								}
							}
							@Pc(223) boolean local223;
							if (Static208.anInt4358 >= local28 && Static28.anInt538 >= local30 && Static208.anInt4358 < local32 && Static28.anInt538 < local34) {
								local223 = true;
							} else {
								local223 = false;
							}
							if (!Static308.aBoolean499 && local223) {
								Static272.method4371(local6, Static208.anInt4358 - local17, Static28.anInt538 - local22);
							}
							if (local6.aBoolean411) {
								@Pc(244) boolean local244 = false;
								if (Static9.anInt116 == 1 && local223) {
									local244 = true;
								}
								@Pc(253) boolean local253 = false;
								if (Static171.anInt3612 == 1 && Static289.anInt5796 >= local28 && Static27.anInt4213 >= local30 && Static289.anInt5796 < local32 && Static27.anInt4213 < local34) {
									local253 = true;
								}
								@Pc(275) int local275;
								@Pc(364) int local364;
								if (local6.aByteArray55 != null) {
									for (local275 = 0; local275 < local6.aByteArray55.length; local275++) {
										if (Static112.aBooleanArray11[local6.aByteArray55[local275]]) {
											if (local6.anIntArray463 == null || Static282.anInt3516 >= local6.anIntArray463[local275]) {
												@Pc(306) byte local306 = local6.aByteArray56[local275];
												if (local306 == 0 || ((local306 & 0x8) == 0 || !Static112.aBooleanArray11[86] && !Static112.aBooleanArray11[82] && !Static112.aBooleanArray11[81]) && ((local306 & 0x2) == 0 || Static112.aBooleanArray11[86]) && ((local306 & 0x1) == 0 || Static112.aBooleanArray11[82]) && ((local306 & 0x4) == 0 || Static112.aBooleanArray11[81])) {
													Static83.method1321(-1, local6.anInt4947, local275 + 1, "");
													local364 = local6.anIntArray466[local275];
													if (local6.anIntArray463 == null) {
														local6.anIntArray463 = new int[local6.aByteArray55.length];
													}
													if (local364 == 0) {
														local6.anIntArray463[local275] = Integer.MAX_VALUE;
													} else {
														local6.anIntArray463[local275] = Static282.anInt3516 + local364;
													}
												}
											}
										} else if (local6.anIntArray463 != null) {
											local6.anIntArray463[local275] = 0;
										}
									}
								}
								if (local253) {
									Static194.method3446(local6, Static27.anInt4213 - local22, Static289.anInt5796 - local17);
								}
								if (Static157.aClass163_11 != null && Static157.aClass163_11 != local6 && local223 && method857(local6).method1094()) {
									Static269.aClass163_17 = local6;
								}
								if (local6 == Static177.aClass163_12) {
									Static144.aBoolean232 = true;
									Static10.anInt164 = local17;
									Static47.anInt1203 = local22;
								}
								if (local6.aBoolean410 || local6.anInt4926 != 0) {
									@Pc(445) Class1_Sub8 local445;
									if (local223 && Static94.anInt1786 != 0 && local6.anObjectArray25 != null) {
										local445 = new Class1_Sub8();
										local445.aBoolean77 = true;
										local445.aClass163_3 = local6;
										local445.anInt1147 = Static94.anInt1786;
										local445.anObjectArray1 = local6.anObjectArray25;
										Static339.aClass14_37.method300(local445);
									}
									if (Static157.aClass163_11 != null || Static43.aClass163_4 != null || Static308.aBoolean499 || local6.anInt4926 != 1400 && Static148.anInt3053 > 0) {
										local253 = false;
										local244 = false;
										local223 = false;
									}
									@Pc(580) int local580;
									if (local6.anInt4926 != 0) {
										if (local6.anInt4926 == 1337 || local6.anInt4926 == 1403) {
											Static233.aClass163_14 = local6;
											if (Static126.aClass199_1 != null) {
												Static126.aClass199_1.method5375(local6.anInt4935, Static217.aClass105_5);
											}
											if (local6.anInt4926 == 1337) {
												if (!Static308.aBoolean499 && local223) {
													Static285.method5001(Static217.aClass105_5);
													for (@Pc(518) Class7_Sub8 local518 = (Class7_Sub8) Static340.aClass122_7.method2626(); local518 != null; local518 = (Class7_Sub8) Static340.aClass122_7.method2630()) {
														if (Static208.anInt4358 >= local518.anInt4151 && Static208.anInt4358 < local518.anInt4149 && Static28.anInt538 >= local518.anInt4147 && Static28.anInt538 < local518.anInt4148) {
															Static10.method166();
															Static129.method2094(local518.aClass10_Sub1_Sub2_1);
														}
													}
												}
												Static63.method2281(local6, local17, local22);
												continue;
											}
										}
										@Pc(619) int local619;
										if (local6.anInt4926 == 1338) {
											if (local6.method4337(Static217.aClass105_5) == null || Static38.anInt3168 != 0 && Static38.anInt3168 != 3 || Static308.aBoolean499 || !local223) {
												continue;
											}
											local275 = Static208.anInt4358 - local17;
											local580 = Static28.anInt538 - local22;
											local364 = local6.anIntArray457[local580];
											if (local275 < local364 || local275 > local364 + local6.anIntArray456[local580]) {
												continue;
											}
											local275 -= local6.anInt4991 / 2;
											local580 -= local6.anInt4935 / 2;
											if (Static246.anInt5156 == 4) {
												local619 = (int) Static143.aFloat21 & 0x3FFF;
											} else {
												local619 = (int) Static143.aFloat21 + Static86.anInt1648 & 0x3FFF;
											}
											@Pc(631) int local631 = Class1_Sub5_Sub15.anIntArray335[local619];
											@Pc(635) int local635 = Class1_Sub5_Sub15.anIntArray333[local619];
											if (Static246.anInt5156 != 4) {
												local631 = local631 * (Static260.anInt5347 + 256) >> 8;
												local635 = local635 * (Static260.anInt5347 + 256) >> 8;
											}
											@Pc(664) int local664 = local580 * local631 + local275 * local635 >> 15;
											@Pc(674) int local674 = local580 * local635 - local275 * local631 >> 15;
											@Pc(685) int local685;
											@Pc(693) int local693;
											if (Static246.anInt5156 == 4) {
												local685 = (Static67.anInt1459 >> 7) + (local664 >> 2);
												local693 = (Static18.anInt355 >> 7) - (local674 >> 2);
											} else {
												@Pc(702) int local702 = (Static127.aClass10_Sub1_Sub2_Sub2_1.method3402() - 1) * 64;
												local685 = (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 - local702 >> 7) + (local664 >> 2);
												local693 = (Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 - local702 >> 7) - (local674 >> 2);
											}
											if (Static265.aBoolean456 && (Static45.anInt1184 & 0x40) != 0) {
												@Pc(735) Class163 local735 = Static46.method931(Static178.anInt3758, Static259.anInt5310);
												if (local735 == null) {
													Static312.method5355();
												} else {
													Static169.method2996(local693, Static224.anInt4728, Static238.aString191, 1L, " ->", 4, local685);
												}
												continue;
											}
											if (Class10_Sub1_Sub1.lb == 1) {
												Static169.method2996(local693, -1, Static340.aString260, 1L, "", 11, local685);
											}
											Static169.method2996(local693, -1, Static289.aString228, 1L, "", 60, local685);
											continue;
										}
										if (local6.anInt4926 == 1400) {
											Static105.aClass163_7 = local6;
											if (local223) {
												Static278.aBoolean472 = true;
											}
											if (local253) {
												local275 = (int) ((double) (Static289.anInt5796 - local17 - local6.anInt4991 / 2) * 2.0D / (double) Static150.aFloat19);
												local580 = (int) -((double) (Static27.anInt4213 - local22 - local6.anInt4935 / 2) * 2.0D / (double) Static150.aFloat19);
												local364 = Static22.anInt428 + local275 + Static150.anInt2643;
												local619 = Static24.anInt439 + local580 + Static150.anInt2638;
												@Pc(832) Class1_Sub2_Sub8 local832 = Static2.method29();
												if (local832 == null) {
													continue;
												}
												@Pc(837) int[] local837 = new int[3];
												local832.method3050(local837, local364, local619);
												if (local837 != null) {
													if (Static112.aBooleanArray11[82] && Static305.anInt6104 > 0) {
														Static180.method3194(local837[1], local837[2], local837[0]);
														continue;
													}
													Static205.aBoolean340 = true;
													Static317.anInt6310 = local837[0];
													Static308.anInt6034 = local837[1];
													Static142.anInt2787 = local837[2];
												}
												Static148.anInt3053 = 1;
												Static80.aBoolean551 = false;
												Static144.anInt3020 = Static208.anInt4358;
												Static171.anInt3616 = Static28.anInt538;
												continue;
											}
											if (local244 && Static148.anInt3053 > 0) {
												if (Static148.anInt3053 == 1 && (Static144.anInt3020 != Static208.anInt4358 || Static171.anInt3616 != Static28.anInt538)) {
													Static29.anInt547 = Static22.anInt428;
													Static313.anInt6219 = Static24.anInt439;
													Static148.anInt3053 = 2;
												}
												if (Static148.anInt3053 == 2) {
													Static80.aBoolean551 = true;
													Static111.method1797(Static29.anInt547 + (int) ((double) (Static144.anInt3020 - Static208.anInt4358) * 2.0D / (double) Static150.aFloat20));
													Static125.method1999(Static313.anInt6219 - (int) ((double) (Static171.anInt3616 - Static28.anInt538) * 2.0D / (double) Static150.aFloat20));
												}
												continue;
											}
											if (Static148.anInt3053 > 0 && !Static80.aBoolean551) {
												if ((Static120.anInt2335 == 1 || Static82.method1316()) && Static61.anInt1413 > 2) {
													Static55.method1101(2);
												} else if (Static325.method2372()) {
													Static55.method1101(1);
												}
											}
											Static148.anInt3053 = 0;
											continue;
										}
										if (local6.anInt4926 == 1401) {
											if (local244) {
												Static310.method5338(Static28.anInt538 - local22, local6.anInt4991, Static208.anInt4358 - local17, local6.anInt4935);
											}
											continue;
										}
										if (local6.anInt4926 == 1402) {
											Static340.method5639(local6);
											continue;
										}
										if (local6.anInt4926 == 1406) {
											Static237.method4325(local6, local22, local17);
											continue;
										}
									}
									if (!local6.aBoolean397 && local253) {
										local6.aBoolean397 = true;
										if (local6.anObjectArray9 != null) {
											local445 = new Class1_Sub8();
											local445.aBoolean77 = true;
											local445.aClass163_3 = local6;
											local445.anInt1157 = Static289.anInt5796 - local17;
											local445.anInt1147 = Static27.anInt4213 - local22;
											local445.anObjectArray1 = local6.anObjectArray9;
											Static339.aClass14_37.method300(local445);
										}
									}
									if (local6.aBoolean397 && local244 && local6.anObjectArray7 != null) {
										local445 = new Class1_Sub8();
										local445.aBoolean77 = true;
										local445.aClass163_3 = local6;
										local445.anInt1157 = Static208.anInt4358 - local17;
										local445.anInt1147 = Static28.anInt538 - local22;
										local445.anObjectArray1 = local6.anObjectArray7;
										Static339.aClass14_37.method300(local445);
									}
									if (local6.aBoolean397 && !local244) {
										local6.aBoolean397 = false;
										if (local6.anObjectArray30 != null) {
											local445 = new Class1_Sub8();
											local445.aBoolean77 = true;
											local445.aClass163_3 = local6;
											local445.anInt1157 = Static208.anInt4358 - local17;
											local445.anInt1147 = Static28.anInt538 - local22;
											local445.anObjectArray1 = local6.anObjectArray30;
											Static276.aClass14_30.method300(local445);
										}
									}
									if (local244 && local6.anObjectArray13 != null) {
										local445 = new Class1_Sub8();
										local445.aBoolean77 = true;
										local445.aClass163_3 = local6;
										local445.anInt1157 = Static208.anInt4358 - local17;
										local445.anInt1147 = Static28.anInt538 - local22;
										local445.anObjectArray1 = local6.anObjectArray13;
										Static339.aClass14_37.method300(local445);
									}
									if (!local6.aBoolean400 && local223) {
										local6.aBoolean400 = true;
										if (local6.anObjectArray27 != null) {
											local445 = new Class1_Sub8();
											local445.aBoolean77 = true;
											local445.aClass163_3 = local6;
											local445.anInt1157 = Static208.anInt4358 - local17;
											local445.anInt1147 = Static28.anInt538 - local22;
											local445.anObjectArray1 = local6.anObjectArray27;
											Static339.aClass14_37.method300(local445);
										}
									}
									if (local6.aBoolean400 && local223 && local6.anObjectArray11 != null) {
										local445 = new Class1_Sub8();
										local445.aBoolean77 = true;
										local445.aClass163_3 = local6;
										local445.anInt1157 = Static208.anInt4358 - local17;
										local445.anInt1147 = Static28.anInt538 - local22;
										local445.anObjectArray1 = local6.anObjectArray11;
										Static339.aClass14_37.method300(local445);
									}
									if (local6.aBoolean400 && !local223) {
										local6.aBoolean400 = false;
										if (local6.anObjectArray28 != null) {
											local445 = new Class1_Sub8();
											local445.aBoolean77 = true;
											local445.aClass163_3 = local6;
											local445.anInt1157 = Static208.anInt4358 - local17;
											local445.anInt1147 = Static28.anInt538 - local22;
											local445.anObjectArray1 = local6.anObjectArray28;
											Static276.aClass14_30.method300(local445);
										}
									}
									if (local6.anObjectArray26 != null) {
										local445 = new Class1_Sub8();
										local445.aClass163_3 = local6;
										local445.anObjectArray1 = local6.anObjectArray26;
										Static229.aClass14_23.method300(local445);
									}
									@Pc(1337) Class1_Sub8 local1337;
									if (local6.anObjectArray24 != null && Static330.anInt6442 > local6.anInt4913) {
										if (local6.anIntArray453 == null || Static330.anInt6442 - local6.anInt4913 > 32) {
											local445 = new Class1_Sub8();
											local445.aClass163_3 = local6;
											local445.anObjectArray1 = local6.anObjectArray24;
											Static339.aClass14_37.method300(local445);
										} else {
											label675: for (local275 = local6.anInt4913; local275 < Static330.anInt6442; local275++) {
												local580 = Static173.anIntArray347[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray453.length; local364++) {
													if (local6.anIntArray453[local364] == local580) {
														local1337 = new Class1_Sub8();
														local1337.aClass163_3 = local6;
														local1337.anObjectArray1 = local6.anObjectArray24;
														Static339.aClass14_37.method300(local1337);
														break label675;
													}
												}
											}
										}
										local6.anInt4913 = Static330.anInt6442;
									}
									if (local6.anObjectArray19 != null && Static126.anInt2453 > local6.anInt4914) {
										if (local6.anIntArray464 == null || Static126.anInt2453 - local6.anInt4914 > 32) {
											local445 = new Class1_Sub8();
											local445.aClass163_3 = local6;
											local445.anObjectArray1 = local6.anObjectArray19;
											Static339.aClass14_37.method300(local445);
										} else {
											label655: for (local275 = local6.anInt4914; local275 < Static126.anInt2453; local275++) {
												local580 = Static117.anIntArray195[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray464.length; local364++) {
													if (local6.anIntArray464[local364] == local580) {
														local1337 = new Class1_Sub8();
														local1337.aClass163_3 = local6;
														local1337.anObjectArray1 = local6.anObjectArray19;
														Static339.aClass14_37.method300(local1337);
														break label655;
													}
												}
											}
										}
										local6.anInt4914 = Static126.anInt2453;
									}
									if (local6.anObjectArray14 != null && Static204.anInt6781 > local6.anInt4930) {
										if (local6.anIntArray451 == null || Static204.anInt6781 - local6.anInt4930 > 32) {
											local445 = new Class1_Sub8();
											local445.aClass163_3 = local6;
											local445.anObjectArray1 = local6.anObjectArray14;
											Static339.aClass14_37.method300(local445);
										} else {
											label635: for (local275 = local6.anInt4930; local275 < Static204.anInt6781; local275++) {
												local580 = Static341.anIntArray663[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray451.length; local364++) {
													if (local6.anIntArray451[local364] == local580) {
														local1337 = new Class1_Sub8();
														local1337.aClass163_3 = local6;
														local1337.anObjectArray1 = local6.anObjectArray14;
														Static339.aClass14_37.method300(local1337);
														break label635;
													}
												}
											}
										}
										local6.anInt4930 = Static204.anInt6781;
									}
									if (local6.lb != null && Static246.anInt5159 > local6.anInt4996) {
										if (local6.anIntArray452 == null || Static246.anInt5159 - local6.anInt4996 > 32) {
											local445 = new Class1_Sub8();
											local445.aClass163_3 = local6;
											local445.anObjectArray1 = local6.lb;
											Static339.aClass14_37.method300(local445);
										} else {
											label615: for (local275 = local6.anInt4996; local275 < Static246.anInt5159; local275++) {
												local580 = Static217.anIntArray57[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray452.length; local364++) {
													if (local6.anIntArray452[local364] == local580) {
														local1337 = new Class1_Sub8();
														local1337.aClass163_3 = local6;
														local1337.anObjectArray1 = local6.lb;
														Static339.aClass14_37.method300(local1337);
														break label615;
													}
												}
											}
										}
										local6.anInt4996 = Static246.anInt5159;
									}
									if (local6.anObjectArray16 != null && Static322.anInt6403 > local6.anInt5004) {
										if (local6.anIntArray462 == null || Static322.anInt6403 - local6.anInt5004 > 32) {
											local445 = new Class1_Sub8();
											local445.aClass163_3 = local6;
											local445.anObjectArray1 = local6.anObjectArray16;
											Static339.aClass14_37.method300(local445);
										} else {
											label595: for (local275 = local6.anInt5004; local275 < Static322.anInt6403; local275++) {
												local580 = Static165.anIntArray330[local275 & 0x1F];
												for (local364 = 0; local364 < local6.anIntArray462.length; local364++) {
													if (local6.anIntArray462[local364] == local580) {
														local1337 = new Class1_Sub8();
														local1337.aClass163_3 = local6;
														local1337.anObjectArray1 = local6.anObjectArray16;
														Static339.aClass14_37.method300(local1337);
														break label595;
													}
												}
											}
										}
										local6.anInt5004 = Static322.anInt6403;
									}
									if (Static186.anInt3871 > local6.anInt4964 && local6.anObjectArray23 != null) {
										local445 = new Class1_Sub8();
										local445.aClass163_3 = local6;
										local445.anObjectArray1 = local6.anObjectArray23;
										Static339.aClass14_37.method300(local445);
									}
									if (Static182.anInt3808 > local6.anInt4964 && local6.anObjectArray31 != null) {
										local445 = new Class1_Sub8();
										local445.aClass163_3 = local6;
										local445.anObjectArray1 = local6.anObjectArray31;
										Static339.aClass14_37.method300(local445);
									}
									if (Static355.anInt6789 > local6.anInt4964 && local6.anObjectArray32 != null) {
										local445 = new Class1_Sub8();
										local445.aClass163_3 = local6;
										local445.anObjectArray1 = local6.anObjectArray32;
										Static339.aClass14_37.method300(local445);
									}
									if (Static246.anInt5153 > local6.anInt4964 && local6.anObjectArray8 != null) {
										local445 = new Class1_Sub8();
										local445.aClass163_3 = local6;
										local445.anObjectArray1 = local6.anObjectArray8;
										Static339.aClass14_37.method300(local445);
									}
									if (Static342.anInt2475 > local6.anInt4964 && local6.anObjectArray10 != null) {
										local445 = new Class1_Sub8();
										local445.aClass163_3 = local6;
										local445.anObjectArray1 = local6.anObjectArray10;
										Static339.aClass14_37.method300(local445);
									}
									local6.anInt4964 = Static244.anInt6207;
									if (local6.anObjectArray18 != null) {
										for (local275 = 0; local275 < Static102.anInt1950; local275++) {
											@Pc(1805) Class1_Sub8 local1805 = new Class1_Sub8();
											local1805.aClass163_3 = local6;
											local1805.anInt1156 = Static43.anIntArray67[local275];
											local1805.anInt1148 = Static12.anIntArray9[local275];
											local1805.anObjectArray1 = local6.anObjectArray18;
											Static339.aClass14_37.method300(local1805);
										}
									}
									if (Static134.aBoolean211 && local6.anObjectArray29 != null) {
										local445 = new Class1_Sub8();
										local445.aClass163_3 = local6;
										local445.anObjectArray1 = local6.anObjectArray29;
										Static339.aClass14_37.method300(local445);
									}
								}
								if (local6.anInt4934 == 5 && local6.anInt4962 != -1) {
									local6.method4333().method5375(local6.anInt4935, Static217.aClass105_5);
								}
							}
							if (!local6.aBoolean411 && Static157.aClass163_11 == null && Static43.aClass163_4 == null && !Static308.aBoolean499) {
								if ((local6.anInt4981 >= 0 || local6.anInt4963 != 0) && Static208.anInt4358 >= local28 && Static28.anInt538 >= local30 && Static208.anInt4358 < local32 && Static28.anInt538 < local34) {
									if (local6.anInt4981 >= 0) {
										Static139.aClass163_10 = arg0[local6.anInt4981];
									} else {
										Static139.aClass163_10 = local6;
									}
								}
								if (local6.anInt4934 == 8 && Static208.anInt4358 >= local28 && Static28.anInt538 >= local30 && Static208.anInt4358 < local32 && Static28.anInt538 < local34) {
									Static10.aClass163_1 = local6;
								}
								if (local6.anInt4990 > local6.anInt4935) {
									Static229.method4151(local17 + local6.anInt4991, Static208.anInt4358, local6.anInt4990, local22, local6, local6.anInt4935, Static28.anInt538);
								}
							}
							Static285.method5002(arg2, local22, arg4, arg3, local6, local17, arg5);
							if (local6.anInt4934 == 0) {
								method844(arg0, local6.anInt4947, local28, local30, local32, local34, local17 - local6.anInt4971, local22 - local6.anInt4985);
								if (local6.aClass163Array3 != null) {
									method844(local6.aClass163Array3, local6.anInt4947, local28, local30, local32, local34, local17 - local6.anInt4971, local22 - local6.anInt4985);
								}
								@Pc(1998) Class1_Sub26 local1998 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local6.anInt4947);
								if (local1998 != null) {
									if (local1998.anInt3826 == 0 && !Static308.aBoolean499 && local223 && !Static173.aBoolean279) {
										Static10.method166();
									}
									Static291.method5101(local28, local17, local30, local1998.anInt3825, local32, local34, local22);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static285.method5002(arg2, local22, arg4, arg3, local6, local17, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ps;)Lclient!ps;")
	public static Class163 method845(@OriginalArg(0) Class163 arg0) {
		@Pc(4) int local4 = method857(arg0).method1097();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static248.method22(arg0.anInt4918);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Lclient!sc;")
	public static Class181 method846(@OriginalArg(0) int arg0) {
		@Pc(12) Class181 local12 = (Class181) Static323.aClass37_110.method915((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(24) byte[] local24 = Static229.aClass134_108.method3009(arg0, 31);
		local12 = new Class181();
		if (local24 != null) {
			local12.method4907(new Class1_Sub21(local24), arg0);
		}
		Static323.aClass37_110.method922((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method850() {
		for (@Pc(1) int local1 = 0; local1 < Static43.anInt1151; local1++) {
			@Pc(6) int[] local6 = Static37.anIntArrayArray7[local1];
			for (@Pc(8) int local8 = 0; local8 < Static260.anInt5348; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method852() {
		if (Static48.aBoolean79) {
			Static73.aClass8_12 = null;
			Static48.aBoolean79 = false;
			Static350.aClass8_18 = null;
		}
	}

	@OriginalMember(owner = "client!client", name = "e", descriptor = "()V")
	public static void method853() {
		@Pc(7) int local7 = Static245.aBoolean67 ? Static167.anInt3454 : Static167.anInt3454 + Static271.anInt5578;
		for (@Pc(9) int local9 = -1; local9 < local7; local9++) {
			@Pc(14) Class10_Sub1_Sub2 local14;
			if (local9 < 0) {
				local14 = Static127.aClass10_Sub1_Sub2_Sub2_1;
			} else if (local9 < Static167.anInt3454) {
				local14 = Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local9]];
			} else {
				local14 = Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local9 - Static167.anInt3454]];
			}
			if (local14.anInt4052 >= 0) {
				@Pc(40) int local40 = local14.method3402();
				if ((local40 & 0x1) == 0) {
					if ((local14.anInt6728 & 0x7F) == 0 && (local14.anInt6726 & 0x7F) == 0) {
						continue;
					}
				} else if ((local14.anInt6728 & 0x7F) == 64 && (local14.anInt6726 & 0x7F) == 64) {
					continue;
				}
				if (local14 instanceof Class10_Sub1_Sub2_Sub2 && local14.anInterface4_3 != null && Static282.anInt3516 >= local14.anInt4077 && Static282.anInt3516 < local14.anInt4079) {
					((Class10_Sub1_Sub2_Sub2) local14).aBoolean311 = false;
				}
				local14.anInt6722 = Static352.method5834(local14.anInt6726, local14.anInt6728, Static127.anInt2487);
				Static189.method5292(local14, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "()V")
	public static void method855() {
		@Pc(14) boolean local14 = Static182.anInt3809 == 1 && Static167.anInt3454 > 200 || Static182.anInt3809 == 0 && Static167.anInt3454 > 50;
		@Pc(62) int local62;
		for (@Pc(16) int local16 = 0; local16 < Static167.anInt3454; local16++) {
			@Pc(23) Class10_Sub1_Sub2_Sub2 local23 = Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local16]];
			if (local23.method3418()) {
				local23.method5828();
				if (local23.aShort94 >= 0 && local23.aShort91 >= 0 && local23.aShort93 < Static43.anInt1151 && local23.aShort92 < Static260.anInt5348) {
					local23.aBoolean311 = local23.aBoolean307 ? local14 : false;
					local62 = 0;
					if (!local23.aBoolean308) {
						local62++;
					}
					if (local23.anInt4048 > Static282.anInt3516) {
						local62 += 2;
					}
					local62 += 5 - local23.method3402() << 2;
					if (Static190.anInt3972 == 0) {
						local62 += 32;
					} else {
						local62 += 128;
					}
					local62 += 256;
					local23.anInt4052 = local62 + 1;
				} else {
					local23.anInt4052 = -1;
				}
			} else {
				local23.anInt4052 = -1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static271.anInt5578; local98++) {
			@Pc(105) Class10_Sub1_Sub2_Sub1 local105 = Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local98]];
			if (local105.method680() && local105.aClass60_1.method1270()) {
				local105.method5828();
				if (local105.aShort94 >= 0 && local105.aShort91 >= 0 && local105.aShort93 < Static43.anInt1151 && local105.aShort92 < Static260.anInt5348) {
					@Pc(141) int local141 = 0;
					if (!local105.aBoolean308) {
						local141++;
					}
					if (local105.anInt4048 > Static282.anInt3516) {
						local141 += 2;
					}
					local141 += 5 - local105.method3402() << 2;
					if (Static190.anInt3972 == 0) {
						if (local105.aClass60_1.aBoolean105) {
							local141 += 64;
						} else {
							local141 += 128;
						}
					} else if (Static190.anInt3972 == 1) {
						if (local105.aClass60_1.aBoolean105) {
							local141 += 32;
						} else {
							local141 += 64;
						}
					}
					if (local105.aClass60_1.aBoolean102) {
						local141 += 512;
					} else if (!local105.aClass60_1.aBoolean108) {
						local141 += 256;
					}
					local105.anInt4052 = local141 + 1;
				} else {
					local105.anInt4052 = -1;
				}
			} else {
				local105.anInt4052 = -1;
			}
		}
		for (local62 = 0; local62 < Static11.aClass65Array4.length; local62++) {
			@Pc(207) Class65 local207 = Static11.aClass65Array4[local62];
			if (local207 != null) {
				if (local207.anInt1591 == 1) {
					@Pc(218) Class10_Sub1_Sub2_Sub1 local218 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local207.anInt1595];
					if (local218 != null && local218.anInt4052 >= 0) {
						local218.anInt4052 += 1024;
					}
				} else if (local207.anInt1591 == 10) {
					@Pc(239) Class10_Sub1_Sub2_Sub2 local239 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local207.anInt1595];
					if (local239 != null && local239.anInt4052 >= 0) {
						local239.anInt4052 += 1024;
					}
				}
			}
		}
		Static127.aClass10_Sub1_Sub2_Sub2_1.anInt4052 = Integer.MAX_VALUE;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "()V")
	public static void method856() {
		Static214.anInt4552 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static271.anInt5578; local3++) {
			@Pc(10) Class10_Sub1_Sub2_Sub1 local10 = Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local3]];
			if (local10.aBoolean308 && local10.method3406() != -1) {
				@Pc(28) int local28 = (local10.method3402() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6728 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6726 - local28 >> 7;
				@Pc(48) Class10_Sub1_Sub2 local48 = Static144.method2583(local35, Static127.anInt2487, local42);
				if (local48 != null) {
					@Pc(53) int local53 = local48.anInt4036;
					if (local48 instanceof Class10_Sub1_Sub2_Sub1) {
						local53 += 2048;
					}
					if (local48.anInt4042 == 0 && local48.method3406() != -1) {
						Static319.anIntArray321[Static214.anInt4552] = local53;
						Static326.anIntArray554[Static214.anInt4552] = local53;
						Static214.anInt4552++;
						local48.anInt4042++;
					}
					Static319.anIntArray321[Static214.anInt4552] = local53;
					Static326.anIntArray554[Static214.anInt4552] = local10.anInt4036 + 2048;
					Static214.anInt4552++;
					local48.anInt4042++;
				}
			}
		}
		Static233.method4189(Static319.anIntArray321, 0, Static326.anIntArray554, Static214.anInt4552 - 1);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ps;)Lclient!dj;")
	public static Class1_Sub11 method857(@OriginalArg(0) Class163 arg0) {
		@Pc(13) Class1_Sub11 local13 = (Class1_Sub11) Static226.aClass207_33.method5555(((long) arg0.anInt4947 << 32) + (long) arg0.anInt4923);
		return local13 == null ? arg0.aClass1_Sub11_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ps;)Z")
	public static boolean method859(@OriginalArg(0) Class163 arg0) {
		if (Static173.aBoolean279) {
			if (method857(arg0).anInt1311 != 0) {
				return false;
			}
			if (arg0.anInt4934 == 0) {
				return false;
			}
		}
		return arg0.aBoolean412;
	}
}
