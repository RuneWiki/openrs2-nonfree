import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!client", name = "U", descriptor = "I")
	public static int anInt1123 = 0;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "I")
	public static int anInt1132 = -1;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)V")
	public static void method1012(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg0 >> 6) + "," + (arg1 >> 6) + "," + (arg0 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static421.method4464(local35, true);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
	public static boolean method1013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!tq;)Lclient!tq;")
	public static Class239 method1014(@OriginalArg(0) Class239 arg0) {
		@Pc(4) int local4 = method1017(arg0).method4843();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static299.method4387(arg0.anInt6479);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!tq;)Lclient!rf;")
	public static Class6_Sub30 method1017(@OriginalArg(0) Class239 arg0) {
		@Pc(13) Class6_Sub30 local13 = (Class6_Sub30) Static345.aClass137_29.method3175(((long) arg0.anInt6423 << 32) + (long) arg0.anInt6487);
		return local13 == null ? arg0.aClass6_Sub30_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1018() {
		Static42.anInt910 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static147.anInt7038; local3++) {
			@Pc(10) Class3_Sub3_Sub6_Sub2 local10 = Static450.aClass3_Sub3_Sub6_Sub2Array1[Static345.anIntArray507[local3]];
			if (local10.aBoolean451 && local10.method5508() != -1) {
				@Pc(28) int local28 = (local10.method5512() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6675 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6677 - local28 >> 7;
				@Pc(49) Class3_Sub3_Sub6 local49 = Static248.method3821(local10.aByte93, local42, local35);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6731;
					if (local49 instanceof Class3_Sub3_Sub6_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt6687 == 0 && local49.method5508() != -1) {
						Static160.anIntArray265[Static42.anInt910] = local54;
						Static179.anIntArray288[Static42.anInt910] = local54;
						Static42.anInt910++;
						local49.anInt6687++;
					}
					Static160.anIntArray265[Static42.anInt910] = local54;
					Static179.anIntArray288[Static42.anInt910] = local10.anInt6731 + 2048;
					Static42.anInt910++;
					local49.anInt6687++;
				}
			}
		}
		Static164.method2685(0, Static179.anIntArray288, Static42.anInt910 - 1, Static160.anIntArray265);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1019() {
		@Pc(1) int local1 = Static416.anInt4773;
		@Pc(3) int[] local3 = Static5.anIntArray3;
		@Pc(11) int local11 = Static149.aBoolean194 ? local1 : local1 + Static147.anInt7038;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub3_Sub6 local23;
			if (local13 < local1) {
				local23 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local3[local13]];
			} else {
				local23 = Static450.aClass3_Sub3_Sub6_Sub2Array1[Static345.anIntArray507[local13 - local1]];
			}
			if (local23.anInt6693 >= 0) {
				@Pc(39) int local39 = local23.method5512();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6675 & 0x7F) == 0 && (local23.anInt6677 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6675 & 0x7F) == 64 && (local23.anInt6677 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class3_Sub3_Sub6_Sub1 && local23.aClass6_Sub28_3 != null && Static125.anInt2225 >= local23.aClass6_Sub28_3.anInt5228 && Static125.anInt2225 < local23.aClass6_Sub28_3.anInt5229) {
					((Class3_Sub3_Sub6_Sub1) local23).aBoolean379 = false;
				}
				local23.anInt6673 = Static165.method2689(local23.anInt6675, local23.aByte93, local23.anInt6677);
				Static9.method128(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1022() {
		@Pc(1) int local1 = Static416.anInt4773;
		@Pc(3) int[] local3 = Static5.anIntArray3;
		@Pc(20) boolean local20 = Static8.aClass173_Sub1_1.anInt4407 == 1 && local1 > 200 || Static8.aClass173_Sub1_1.anInt4407 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class3_Sub3_Sub6_Sub1 local29 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local3[local22]];
			if (local29.method4693()) {
				local29.method5505();
				if (local29.aShort97 >= 0 && local29.aShort95 >= 0 && local29.aShort98 < Static84.anInt1632 && local29.aShort96 < Static261.anInt4480) {
					local29.aBoolean379 = local29.aBoolean453 ? local20 : false;
					if (local29 == Static134.aClass3_Sub3_Sub6_Sub1_1) {
						local29.anInt6693 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean451) {
							local75++;
						}
						if (local29.anInt6746 > Static125.anInt2225) {
							local75 += 2;
						}
						local75 += 5 - local29.method5512() << 2;
						if (local29.aBoolean377) {
							local75 += 512;
						} else {
							if (Static339.anInt5698 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6693 = local75 + 1;
					}
				} else {
					local29.anInt6693 = -1;
				}
			} else {
				local29.anInt6693 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static147.anInt7038; local116++) {
			@Pc(123) Class3_Sub3_Sub6_Sub2 local123 = Static450.aClass3_Sub3_Sub6_Sub2Array1[Static345.anIntArray507[local116]];
			if (local123.method5527() && local123.aClass17_1.method289(Static71.aClass126_1)) {
				local123.method5505();
				if (local123.aShort97 >= 0 && local123.aShort95 >= 0 && local123.aShort98 < Static84.anInt1632 && local123.aShort96 < Static261.anInt4480) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean451) {
						local160++;
					}
					if (local123.anInt6746 > Static125.anInt2225) {
						local160 += 2;
					}
					local160 += 5 - local123.method5512() << 2;
					if (Static339.anInt5698 == 0) {
						if (local123.aClass17_1.aBoolean18) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static339.anInt5698 == 1) {
						if (local123.aClass17_1.aBoolean18) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass17_1.aBoolean22) {
						local160 += 1024;
					} else if (!local123.aClass17_1.aBoolean20) {
						local160 += 256;
					}
					local123.anInt6693 = local160 + 1;
				} else {
					local123.anInt6693 = -1;
				}
			} else {
				local123.anInt6693 = -1;
			}
		}
		for (local75 = 0; local75 < Static190.aClass107Array1.length; local75++) {
			@Pc(226) Class107 local226 = Static190.aClass107Array1[local75];
			if (local226 != null) {
				if (local226.anInt2681 == 1) {
					@Pc(237) Class3_Sub3_Sub6_Sub2 local237 = Static450.aClass3_Sub3_Sub6_Sub2Array1[local226.anInt2683];
					if (local237 != null && local237.anInt6693 >= 0) {
						local237.anInt6693 += 2048;
					}
				} else if (local226.anInt2681 == 10) {
					@Pc(258) Class3_Sub3_Sub6_Sub1 local258 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local226.anInt2683];
					if (local258 != null && local258 != Static134.aClass3_Sub3_Sub6_Sub1_1 && local258.anInt6693 >= 0) {
						local258.anInt6693 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!tq;IIIIIIIII)V")
	public static void method1025(@OriginalArg(0) Class239[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class239 local6 = arg0[local1];
			if (local6 != null && local6.anInt6479 == arg1) {
				@Pc(17) int local17 = local6.anInt6484 + arg6;
				@Pc(22) int local22 = local6.anInt6483 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt6447 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt6435;
					@Pc(45) int local45 = local22 + local6.anInt6408;
					if (local6.anInt6447 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt6447 == 0 || local6.aBoolean431 || method1017(local6).anInt5768 != 0 || local6 == Static419.aClass239_16 || local6.anInt6442 == Static404.anInt6765) {
					if (!method1028(local6)) {
						if (local6 == Static332.aClass239_12) {
							Static178.aBoolean96 = true;
							Static263.anInt4509 = local17;
							Static374.anInt6201 = local22;
						}
						if (local6.aBoolean433 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean426 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class6_Sub29 local148 = (Class6_Sub29) Static357.aClass88_41.method1882(); local148 != null; local148 = (Class6_Sub29) Static357.aClass88_41.method1891()) {
									if (local148.aBoolean363) {
										local148.method5977();
										local148.aClass239_10.aBoolean441 = false;
									}
								}
								if (Static4.anInt33 == 0) {
									Static332.aClass239_12 = null;
									Static419.aClass239_16 = null;
								}
								Static203.anInt3586 = 0;
								Static93.aBoolean145 = false;
								Static19.aBoolean16 = false;
								if (!Static206.aBoolean239) {
									Static95.method1651();
								}
							}
							@Pc(204) boolean local204;
							if (Static37.aClass71_26.method1618() >= local28 && Static37.aClass71_26.method1624() >= local30 && Static37.aClass71_26.method1618() < local32 && Static37.aClass71_26.method1624() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static274.aBoolean336 && local204) {
								if (local6.anInt6465 >= 0) {
									anInt1132 = local6.anInt6465;
								} else if (local6.aBoolean426) {
									anInt1132 = -1;
								}
							}
							if (!Static206.aBoolean239 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static426.method5814(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(248) boolean local248 = false;
							if (Static37.aClass71_26.method1628() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class6_Sub7 local263 = (Class6_Sub7) Static254.aClass88_34.method1882();
							if (local263 != null && local263.method1261() == 0 && local263.method1257() >= local28 && local263.method1258() >= local30 && local263.method1257() < local32 && local263.method1258() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray82 != null) {
								for (local296 = 0; local296 < local6.aByteArray82.length; local296++) {
									if (Static326.aClass86_1.method1867(local6.aByteArray82[local296])) {
										if (local6.anIntArray559 == null || Static125.anInt2225 >= local6.anIntArray559[local296]) {
											@Pc(328) byte local328 = local6.aByteArray81[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static326.aClass86_1.method1867(86) && !Static326.aClass86_1.method1867(82) && !Static326.aClass86_1.method1867(81)) && ((local328 & 0x2) == 0 || Static326.aClass86_1.method1867(86)) && ((local328 & 0x1) == 0 || Static326.aClass86_1.method1867(82)) && ((local328 & 0x4) == 0 || Static326.aClass86_1.method1867(81))) {
												if (local296 < 10) {
													Static401.method5466(-1, local6.anInt6423, "", local296 + 1);
												} else if (local296 == 10) {
													Static12.method160();
													@Pc(399) Class6_Sub30 local399 = method1017(local6);
													Static270.method4109(local399.anInt5763, local6, local399.method4842());
													Static26.aString21 = Static4.method30(local6);
													if (Static26.aString21 == null) {
														Static26.aString21 = "Null";
													}
													Static263.aString38 = local6.aString56 + "<col=ffffff>";
												}
												local430 = local6.anIntArray565[local296];
												if (local6.anIntArray559 == null) {
													local6.anIntArray559 = new int[local6.aByteArray82.length];
												}
												if (local430 == 0) {
													local6.anIntArray559[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray559[local296] = Static125.anInt2225 + local430;
												}
											}
										}
									} else if (local6.anIntArray559 != null) {
										local6.anIntArray559[local296] = 0;
									}
								}
							}
							if (local258) {
								Static244.method3775(local263.method1257() - local17, local6, local263.method1258() - local22);
							}
							if (Static332.aClass239_12 != null && Static332.aClass239_12 != local6 && local204 && method1017(local6).method4841()) {
								Static297.aClass239_6 = local6;
							}
							if (local6 == Static419.aClass239_16) {
								Static6.aBoolean9 = true;
								Static407.anInt6817 = local17;
								Static343.anInt5750 = local22;
							}
							if (local6.aBoolean431 || local6.anInt6442 != 0) {
								@Pc(515) Class6_Sub29 local515;
								if (local204 && Static238.anInt4074 != 0 && local6.anObjectArray34 != null) {
									local515 = new Class6_Sub29();
									local515.aBoolean363 = true;
									local515.aClass239_10 = local6;
									local515.anInt5268 = Static238.anInt4074;
									local515.anObjectArray4 = local6.anObjectArray34;
									Static357.aClass88_41.method1878(local515);
								}
								if (Static332.aClass239_12 != null || Static206.aBoolean239 || local6.anInt6442 != Static319.anInt5201 && Static203.anInt3586 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt6442 != 0) {
									if (local6.anInt6442 == Static286.anInt4821 || local6.anInt6442 == Static127.anInt2253) {
										Static389.aClass239_14 = local6;
										if (Static243.aClass46_1 != null) {
											Static243.aClass46_1.method1232(Static44.aClass28_14, local6.anInt6408);
										}
										if (local6.anInt6442 == Static286.anInt4821) {
											if (!Static206.aBoolean239 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static211.method3274(Static44.aClass28_14, arg8, arg9);
												for (@Pc(598) Class48_Sub4 local598 = (Class48_Sub4) Static328.aClass128_9.method2831(); local598 != null; local598 = (Class48_Sub4) Static328.aClass128_9.method2832()) {
													if (arg8 >= local598.anInt2675 && arg8 < local598.anInt2677 && arg9 >= local598.anInt2678 && arg9 < local598.anInt2676) {
														Static95.method1651();
														Static364.method5132(local598.aClass3_Sub3_Sub6_1);
													}
												}
											}
											Static311.method4459(local22, local17, local6);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt6442 == Static404.anInt6765) {
										if (local6.method5364(Static44.aClass28_14) == null || Static392.anInt6523 != 0 && Static392.anInt6523 != 3 || Static206.aBoolean239 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray566[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray560[local670]) {
											continue;
										}
										local296 -= local6.anInt6435 / 2;
										local670 -= local6.anInt6408 / 2;
										if (Static9.anInt164 == 4) {
											local709 = (int) Static397.aFloat99 & 0x3FFF;
										} else {
											local709 = (int) Static397.aFloat99 + Static71.anInt1484 & 0x3FFF;
										}
										@Pc(721) int local721 = Class6_Sub1_Sub18.anIntArray642[local709];
										@Pc(725) int local725 = Class6_Sub1_Sub18.anIntArray643[local709];
										if (Static9.anInt164 != 4) {
											local721 = local721 * (Static393.anInt5623 + 256) >> 8;
											local725 = local725 * (Static393.anInt5623 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static9.anInt164 == 4) {
											local775 = (Static375.anInt6234 >> 7) + (local754 >> 2);
											local783 = (Static45.anInt923 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static134.aClass3_Sub3_Sub6_Sub1_1.method5512() - 1) * 64;
											local775 = (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6675 - local792 >> 7) + (local754 >> 2);
											local783 = (Static134.aClass3_Sub3_Sub6_Sub1_1.anInt6677 - local792 >> 7) - (local764 >> 2);
										}
										if (Static274.aBoolean336 && (Static172.anInt3044 & 0x40) != 0) {
											@Pc(825) Class239 local825 = Static316.method5795(Static321.anInt5236, Static391.anInt2016);
											if (local825 == null) {
												Static12.method160();
											} else {
												Static361.method5112(" ->", 20, local783, local775, Static60.anInt1241, true, Static26.aString21, local6.anInt6492, 1L, false);
											}
											continue;
										}
										if (Static323.aClass44_4 == Static193.aClass44_3) {
											Static361.method5112("", 11, local783, local775, -1, true, Static320.aClass231_92.method5138(Static382.anInt6289), -1, 1L, false);
										}
										Static361.method5112("", 13, local783, local775, Static149.anInt2680, true, Static329.aString50, -1, 1L, false);
										continue;
									}
									if (local6.anInt6442 == Static319.anInt5201) {
										Static332.aClass239_11 = local6;
										if (local204) {
											Static93.aBoolean145 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method1257() - local17 - local6.anInt6435 / 2) * 2.0D / (double) Static36.aFloat47);
											local670 = (int) -((double) (local263.method1258() - local22 - local6.anInt6408 / 2) * 2.0D / (double) Static36.aFloat47);
											local430 = Static187.anInt3261 + local296 + Static36.anInt2246;
											local709 = Static70.anInt1464 + local670 + Static36.anInt2243;
											@Pc(939) Class6_Sub1_Sub4 local939 = Static201.method3174();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method1071(local944, local709, local430);
											if (local944 != null) {
												if (Static326.aClass86_1.method1867(82) && Static221.anInt3810 > 0) {
													method1012(local944[1], local944[2], local944[0]);
													continue;
												}
												Static19.aBoolean16 = true;
												Static266.anInt4570 = local944[0];
												Static316.anInt7083 = local944[1];
												Static229.anInt3886 = local944[2];
											}
											Static203.anInt3586 = 1;
											Static35.aBoolean70 = false;
											Static108.anInt1929 = Static37.aClass71_26.method1618();
											Static241.anInt4098 = Static37.aClass71_26.method1624();
											continue;
										}
										if (local248 && Static203.anInt3586 > 0) {
											if (Static203.anInt3586 == 1 && (Static108.anInt1929 != Static37.aClass71_26.method1618() || Static241.anInt4098 != Static37.aClass71_26.method1624())) {
												Static58.anInt1225 = Static187.anInt3261;
												Static88.anInt1668 = Static70.anInt1464;
												Static203.anInt3586 = 2;
											}
											if (Static203.anInt3586 == 2) {
												Static35.aBoolean70 = true;
												Static445.method5943(Static58.anInt1225 + (int) ((double) (Static108.anInt1929 - Static37.aClass71_26.method1618()) * 2.0D / (double) Static36.aFloat46));
												Static56.method1051(Static88.anInt1668 - (int) ((double) (Static241.anInt4098 - Static37.aClass71_26.method1624()) * 2.0D / (double) Static36.aFloat46));
											}
											continue;
										}
										if (Static203.anInt3586 > 0 && !Static35.aBoolean70) {
											if ((Static112.anInt6364 == 1 || Static208.method3243()) && Static228.anInt3878 > 2) {
												Static255.method3940(Static241.anInt4098, Static108.anInt1929);
											} else if (Static422.method5699()) {
												Static255.method3940(Static241.anInt4098, Static108.anInt1929);
											}
										}
										Static203.anInt3586 = 0;
										continue;
									}
									if (local6.anInt6442 == Static41.anInt905) {
										if (local248) {
											Static223.method3406(Static37.aClass71_26.method1618() - local17, local6.anInt6435, Static37.aClass71_26.method1624() - local22, local6.anInt6408);
										}
										continue;
									}
									if (local6.anInt6442 == Static128.anInt2277) {
										Static297.method4368(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean440 && local258) {
									local6.aBoolean440 = true;
									if (local6.anObjectArray10 != null) {
										local515 = new Class6_Sub29();
										local515.aBoolean363 = true;
										local515.aClass239_10 = local6;
										local515.anInt5273 = local263.method1257() - local17;
										local515.anInt5268 = local263.method1258() - local22;
										local515.anObjectArray4 = local6.anObjectArray10;
										Static357.aClass88_41.method1878(local515);
									}
								}
								if (local6.aBoolean440 && local248 && local6.anObjectArray27 != null) {
									local515 = new Class6_Sub29();
									local515.aBoolean363 = true;
									local515.aClass239_10 = local6;
									local515.anInt5273 = Static37.aClass71_26.method1618() - local17;
									local515.anInt5268 = Static37.aClass71_26.method1624() - local22;
									local515.anObjectArray4 = local6.anObjectArray27;
									Static357.aClass88_41.method1878(local515);
								}
								if (local6.aBoolean440 && !local248) {
									local6.aBoolean440 = false;
									if (local6.anObjectArray24 != null) {
										local515 = new Class6_Sub29();
										local515.aBoolean363 = true;
										local515.aClass239_10 = local6;
										local515.anInt5273 = Static37.aClass71_26.method1618() - local17;
										local515.anInt5268 = Static37.aClass71_26.method1624() - local22;
										local515.anObjectArray4 = local6.anObjectArray24;
										Static446.aClass88_47.method1878(local515);
									}
								}
								if (local248 && local6.anObjectArray20 != null) {
									local515 = new Class6_Sub29();
									local515.aBoolean363 = true;
									local515.aClass239_10 = local6;
									local515.anInt5273 = Static37.aClass71_26.method1618() - local17;
									local515.anInt5268 = Static37.aClass71_26.method1624() - local22;
									local515.anObjectArray4 = local6.anObjectArray20;
									Static357.aClass88_41.method1878(local515);
								}
								if (!local6.aBoolean441 && local204) {
									local6.aBoolean441 = true;
									if (local6.anObjectArray30 != null) {
										local515 = new Class6_Sub29();
										local515.aBoolean363 = true;
										local515.aClass239_10 = local6;
										local515.anInt5273 = Static37.aClass71_26.method1618() - local17;
										local515.anInt5268 = Static37.aClass71_26.method1624() - local22;
										local515.anObjectArray4 = local6.anObjectArray30;
										Static357.aClass88_41.method1878(local515);
									}
								}
								if (local6.aBoolean441 && local204 && local6.anObjectArray17 != null) {
									local515 = new Class6_Sub29();
									local515.aBoolean363 = true;
									local515.aClass239_10 = local6;
									local515.anInt5273 = Static37.aClass71_26.method1618() - local17;
									local515.anInt5268 = Static37.aClass71_26.method1624() - local22;
									local515.anObjectArray4 = local6.anObjectArray17;
									Static357.aClass88_41.method1878(local515);
								}
								if (local6.aBoolean441 && !local204) {
									local6.aBoolean441 = false;
									if (local6.anObjectArray5 != null) {
										local515 = new Class6_Sub29();
										local515.aBoolean363 = true;
										local515.aClass239_10 = local6;
										local515.anInt5273 = Static37.aClass71_26.method1618() - local17;
										local515.anInt5268 = Static37.aClass71_26.method1624() - local22;
										local515.anObjectArray4 = local6.anObjectArray5;
										Static446.aClass88_47.method1878(local515);
									}
								}
								if (local6.anObjectArray6 != null) {
									local515 = new Class6_Sub29();
									local515.aClass239_10 = local6;
									local515.anObjectArray4 = local6.anObjectArray6;
									Static384.aClass88_42.method1878(local515);
								}
								@Pc(1483) Class6_Sub29 local1483;
								if (local6.anObjectArray14 != null && Static71.anInt1485 > local6.anInt6422) {
									if (local6.anIntArray563 == null || Static71.anInt1485 - local6.anInt6422 > 32) {
										local515 = new Class6_Sub29();
										local515.aClass239_10 = local6;
										local515.anObjectArray4 = local6.anObjectArray14;
										Static357.aClass88_41.method1878(local515);
									} else {
										label678: for (local296 = local6.anInt6422; local296 < Static71.anInt1485; local296++) {
											local670 = Static104.anIntArray199[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray563.length; local430++) {
												if (local6.anIntArray563[local430] == local670) {
													local1483 = new Class6_Sub29();
													local1483.aClass239_10 = local6;
													local1483.anObjectArray4 = local6.anObjectArray14;
													Static357.aClass88_41.method1878(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt6422 = Static71.anInt1485;
								}
								if (local6.anObjectArray25 != null && Static332.anInt5636 > local6.anInt6497) {
									if (local6.anIntArray557 == null || Static332.anInt5636 - local6.anInt6497 > 32) {
										local515 = new Class6_Sub29();
										local515.aClass239_10 = local6;
										local515.anObjectArray4 = local6.anObjectArray25;
										Static357.aClass88_41.method1878(local515);
									} else {
										label654: for (local296 = local6.anInt6497; local296 < Static332.anInt5636; local296++) {
											local670 = Static335.anIntArray501[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray557.length; local430++) {
												if (local6.anIntArray557[local430] == local670) {
													local1483 = new Class6_Sub29();
													local1483.aClass239_10 = local6;
													local1483.anObjectArray4 = local6.anObjectArray25;
													Static357.aClass88_41.method1878(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt6497 = Static332.anInt5636;
								}
								if (local6.anObjectArray28 != null && Static383.anInt6311 > local6.anInt6491) {
									if (local6.anIntArray562 == null || Static383.anInt6311 - local6.anInt6491 > 32) {
										local515 = new Class6_Sub29();
										local515.aClass239_10 = local6;
										local515.anObjectArray4 = local6.anObjectArray28;
										Static357.aClass88_41.method1878(local515);
									} else {
										label630: for (local296 = local6.anInt6491; local296 < Static383.anInt6311; local296++) {
											local670 = Static254.anIntArray328[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray562.length; local430++) {
												if (local6.anIntArray562[local430] == local670) {
													local1483 = new Class6_Sub29();
													local1483.aClass239_10 = local6;
													local1483.anObjectArray4 = local6.anObjectArray28;
													Static357.aClass88_41.method1878(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt6491 = Static383.anInt6311;
								}
								if (local6.anObjectArray26 != null && Static10.anInt6501 > local6.anInt6418) {
									if (local6.anIntArray564 == null || Static10.anInt6501 - local6.anInt6418 > 32) {
										local515 = new Class6_Sub29();
										local515.aClass239_10 = local6;
										local515.anObjectArray4 = local6.anObjectArray26;
										Static357.aClass88_41.method1878(local515);
									} else {
										label606: for (local296 = local6.anInt6418; local296 < Static10.anInt6501; local296++) {
											local670 = Static286.anIntArray432[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray564.length; local430++) {
												if (local6.anIntArray564[local430] == local670) {
													local1483 = new Class6_Sub29();
													local1483.aClass239_10 = local6;
													local1483.anObjectArray4 = local6.anObjectArray26;
													Static357.aClass88_41.method1878(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt6418 = Static10.anInt6501;
								}
								if (local6.anObjectArray23 != null && Static60.anInt1237 > local6.anInt6428) {
									if (local6.anIntArray561 == null || Static60.anInt1237 - local6.anInt6428 > 32) {
										local515 = new Class6_Sub29();
										local515.aClass239_10 = local6;
										local515.anObjectArray4 = local6.anObjectArray23;
										Static357.aClass88_41.method1878(local515);
									} else {
										label582: for (local296 = local6.anInt6428; local296 < Static60.anInt1237; local296++) {
											local670 = Static45.anIntArray55[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray561.length; local430++) {
												if (local6.anIntArray561[local430] == local670) {
													local1483 = new Class6_Sub29();
													local1483.aClass239_10 = local6;
													local1483.anObjectArray4 = local6.anObjectArray23;
													Static357.aClass88_41.method1878(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt6428 = Static60.anInt1237;
								}
								if (Static402.anInt6641 > local6.anInt6470 && local6.anObjectArray9 != null) {
									local515 = new Class6_Sub29();
									local515.aClass239_10 = local6;
									local515.anObjectArray4 = local6.anObjectArray9;
									Static357.aClass88_41.method1878(local515);
								}
								if (Static31.anInt507 > local6.anInt6470 && local6.anObjectArray11 != null) {
									local515 = new Class6_Sub29();
									local515.aClass239_10 = local6;
									local515.anObjectArray4 = local6.anObjectArray11;
									Static357.aClass88_41.method1878(local515);
								}
								if (Static276.anInt4712 > local6.anInt6470 && local6.anObjectArray15 != null) {
									local515 = new Class6_Sub29();
									local515.aClass239_10 = local6;
									local515.anObjectArray4 = local6.anObjectArray15;
									Static357.aClass88_41.method1878(local515);
								}
								if (Static349.anInt5884 > local6.anInt6470 && local6.anObjectArray29 != null) {
									local515 = new Class6_Sub29();
									local515.aClass239_10 = local6;
									local515.anObjectArray4 = local6.anObjectArray29;
									Static357.aClass88_41.method1878(local515);
								}
								if (Static29.anInt445 > local6.anInt6470 && local6.anObjectArray33 != null) {
									local515 = new Class6_Sub29();
									local515.aClass239_10 = local6;
									local515.anObjectArray4 = local6.anObjectArray33;
									Static357.aClass88_41.method1878(local515);
								}
								local6.anInt6470 = Static323.anInt5265;
								if (local6.anObjectArray7 != null) {
									for (local296 = 0; local296 < Static203.anInt3583; local296++) {
										@Pc(1951) Class6_Sub29 local1951 = new Class6_Sub29();
										local1951.aClass239_10 = local6;
										local1951.anInt5267 = Static370.aClass139Array1[local296].method3202();
										local1951.anInt5272 = Static370.aClass139Array1[local296].method3201();
										local1951.anObjectArray4 = local6.anObjectArray7;
										Static357.aClass88_41.method1878(local1951);
									}
								}
								if (Static26.aBoolean176 && local6.anObjectArray19 != null) {
									local515 = new Class6_Sub29();
									local515.aClass239_10 = local6;
									local515.anObjectArray4 = local6.anObjectArray19;
									Static357.aClass88_41.method1878(local515);
								}
							}
							if (local6.anInt6447 == 5 && local6.anInt6409 != -1) {
								local6.method5366(Static187.aClass217_1, Static251.aClass147_1).method1232(Static44.aClass28_14, local6.anInt6408);
							}
							Static61.method1135(local6);
							if (local6.anInt6447 == 0) {
								method1025(arg0, local6.anInt6423, local28, local30, local32, local34, local17 - local6.anInt6495, local22 - local6.anInt6438, arg8, arg9);
								if (local6.aClass239Array1 != null) {
									method1025(local6.aClass239Array1, local6.anInt6423, local28, local30, local32, local34, local17 - local6.anInt6495, local22 - local6.anInt6438, arg8, arg9);
								}
								@Pc(2073) Class6_Sub16 local2073 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local6.anInt6423);
								if (local2073 != null) {
									if (Static323.aClass44_4 == Static307.aClass44_2 && local2073.anInt2717 == 0 && !Static206.aBoolean239 && local204 && !Static268.aBoolean330) {
										Static95.method1651();
									}
									Static119.method1909(local17, arg9, local2073.anInt2715, local22, local30, local32, local34, local28, arg8);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static61.method1135(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ut;B)V")
	public static void method1026(@OriginalArg(0) Class6_Sub43 arg0) {
		if (Static30.aClass189ArrayArrayArray2 == null) {
			return;
		}
		@Pc(8) Interface10 local8 = null;
		if (arg0.anInt6915 == 0) {
			local8 = (Interface10) Static428.method5836(arg0.anInt6914, arg0.anInt6925, arg0.anInt6918);
		}
		if (arg0.anInt6915 == 1) {
			local8 = (Interface10) Static64.method1227(arg0.anInt6914, arg0.anInt6925, arg0.anInt6918);
		}
		if (arg0.anInt6915 == 2) {
			local8 = (Interface10) Static49.method903(arg0.anInt6914, arg0.anInt6925, arg0.anInt6918, tf.class);
		}
		if (arg0.anInt6915 == 3) {
			local8 = (Interface10) Static91.method1566(arg0.anInt6914, arg0.anInt6925, arg0.anInt6918);
		}
		if (local8 == null) {
			arg0.anInt6916 = -1;
			arg0.anInt6921 = 0;
			arg0.anInt6926 = 0;
		} else {
			arg0.anInt6916 = local8.method5812();
			arg0.anInt6926 = local8.method5807();
			arg0.anInt6921 = local8.method5811();
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1027() {
		for (@Pc(1) int local1 = 0; local1 < Static84.anInt1632; local1++) {
			@Pc(6) int[] local6 = Static91.anIntArrayArray20[local1];
			for (@Pc(8) int local8 = 0; local8 < Static261.anInt4480; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!tq;)Z")
	public static boolean method1028(@OriginalArg(0) Class239 arg0) {
		if (Static268.aBoolean330) {
			if (method1017(arg0).anInt5768 != 0) {
				return false;
			}
			if (arg0.anInt6447 == 0) {
				return false;
			}
		}
		return arg0.aBoolean428;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1029(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static416.anInt4773;
		@Pc(3) int[] local3 = Static5.anIntArray3;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static147.anInt7038; local5++) {
			@Pc(15) Class3_Sub3_Sub6 local15;
			if (local5 < local1) {
				local15 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local3[local5]];
			} else {
				local15 = Static450.aClass3_Sub3_Sub6_Sub2Array1[Static345.anIntArray507[local5 - local1]];
			}
			if (local15.aByte93 == arg0 && local15.anInt6693 >= 0) {
				@Pc(35) int local35 = local15.method5512();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6675 & 0x7F) != 0 || (local15.anInt6677 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6675 & 0x7F) != 64 || (local15.anInt6677 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6675 >> 7;
					local76 = local15.anInt6677 >> 7;
					if (local15.anInt6693 > Static91.anIntArrayArray20[local71][local76]) {
						Static91.anIntArrayArray20[local71][local76] = local15.anInt6693;
						Static265.anIntArrayArray38[local71][local76] = 1;
					} else if (local15.anInt6693 == Static91.anIntArrayArray20[local71][local76]) {
						local112 = Static265.anIntArrayArray38[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6675 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6677 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6675 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6677 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6693 > Static91.anIntArrayArray20[local154][local157]) {
								Static91.anIntArrayArray20[local154][local157] = local15.anInt6693;
								Static265.anIntArrayArray38[local154][local157] = 1;
							} else if (local15.anInt6693 == Static91.anIntArrayArray20[local154][local157]) {
								local112 = Static265.anIntArrayArray38[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method1030(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static416.anInt4773;
		@Pc(3) int[] local3 = Static5.anIntArray3;
		@Pc(11) int local11 = Static149.aBoolean194 ? local1 : local1 + Static147.anInt7038;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub3_Sub6 local23;
			if (local13 < local1) {
				local23 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local3[local13]];
			} else {
				local23 = Static450.aClass3_Sub3_Sub6_Sub2Array1[Static345.anIntArray507[local13 - local1]];
			}
			if (local23.aByte93 == arg0) {
				local23.anInt6687 = 0;
				if (local23.anInt6693 < 0) {
					local23.aBoolean451 = false;
				} else {
					@Pc(50) int local50 = local23.method5512();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6675 & 0x7F) != 0 || (local23.anInt6677 & 0x7F) != 0) {
							local23.aBoolean451 = false;
							continue;
						}
					} else if ((local23.anInt6675 & 0x7F) != 64 || (local23.anInt6677 & 0x7F) != 64) {
						local23.aBoolean451 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6675 >> 7;
						local97 = local23.anInt6677 >> 7;
						if (local23.anInt6693 != Static91.anIntArrayArray20[local92][local97]) {
							local23.aBoolean451 = true;
							continue;
						}
						if (Static265.anIntArrayArray38[local92][local97] > 1) {
							local122 = Static265.anIntArrayArray38[local92][local97]--;
							local23.aBoolean451 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6675 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6677 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6675 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6677 + local92 >> 7;
						if (!Static434.method5875(local23.anInt6693, local151, local165, local97, local158)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6693 == Static91.anIntArrayArray20[local176][local179]) {
										local122 = Static265.anIntArrayArray38[local176][local179]--;
									}
								}
							}
							local23.aBoolean451 = true;
							continue;
						}
					}
					if (local23 instanceof Class3_Sub3_Sub6_Sub1 && local23.aClass6_Sub28_3 != null && Static125.anInt2225 >= local23.aClass6_Sub28_3.anInt5228 && Static125.anInt2225 < local23.aClass6_Sub28_3.anInt5229) {
						((Class3_Sub3_Sub6_Sub1) local23).aBoolean379 = false;
					}
					local23.aBoolean451 = false;
					local23.anInt6673 = Static165.method2689(local23.anInt6675, local23.aByte93, local23.anInt6677);
					Static9.method128(local23, true);
				}
			}
		}
	}
}
