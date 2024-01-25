import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!client", name = "nb", descriptor = "[I")
	public static int[] anIntArray107;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt2398 = 0;

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "Lclient!uh;")
	public static final Class341 aClass341_25 = new Class341();

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method2234(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static71.anInt3990;
		@Pc(3) int[] local3 = Static549.anIntArray643;
		@Pc(11) int local11 = Static34.aBoolean61 ? local1 : local1 + Static398.anInt7589;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub1_Sub3_Sub3 local23;
			if (local13 < local1) {
				local23 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) Static301.anIntArray367[local13 - local1])).aClass3_Sub1_Sub3_Sub3_Sub1_2;
			}
			if (local23.aByte132 == arg0) {
				local23.anInt6058 = 0;
				if (local23.anInt6078 < 0) {
					local23.aBoolean454 = false;
				} else {
					@Pc(54) int local54 = local23.method5214();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10303 & 0x1FF) != 0 || (local23.anInt10310 & 0x1FF) != 0) {
							local23.aBoolean454 = false;
							continue;
						}
					} else if ((local23.anInt10303 & 0x1FF) != 256 || (local23.anInt10310 & 0x1FF) != 256) {
						local23.aBoolean454 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10303 >> 9;
						local101 = local23.anInt10310 >> 9;
						if (local23.anInt6078 != Static198.anIntArrayArray19[local96][local101]) {
							local23.aBoolean454 = true;
							continue;
						}
						if (Static345.anIntArrayArray34[local96][local101] > 1) {
							local126 = Static345.anIntArrayArray34[local96][local101]--;
							local23.aBoolean454 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10303 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10310 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10303 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10310 + local96 >> 9;
						if (!Static347.method5936(local155, local162, local23.anInt6078, local101, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt6078 == Static198.anIntArrayArray19[local180][local183]) {
										local126 = Static345.anIntArrayArray34[local180][local183]--;
									}
								}
							}
							local23.aBoolean454 = true;
							continue;
						}
					}
					local23.aBoolean454 = false;
					local23.anInt10306 = Static590.method8716(local23.anInt10303, local23.aByte132, local23.anInt10310);
					Static324.method5602(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!at;)Lclient!wb;")
	public static Class2_Sub50 method2235(@OriginalArg(0) Class24 arg0) {
		@Pc(13) Class2_Sub50 local13 = (Class2_Sub50) Static514.aClass99_71.method3056(((long) arg0.anInt510 << 32) + (long) arg0.anInt439);
		return local13 == null ? arg0.aClass2_Sub50_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method2236() {
		Static246.anInt5332 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static398.anInt7589; local3++) {
			@Pc(14) Class3_Sub1_Sub3_Sub3_Sub1 local14 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) Static301.anIntArray367[local3])).aClass3_Sub1_Sub3_Sub3_Sub1_2;
			if (local14.aBoolean454 && local14.method5203() != -1) {
				@Pc(32) int local32 = (local14.method5214() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10303 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10310 - local32 >> 9;
				@Pc(53) Class3_Sub1_Sub3_Sub3 local53 = Static315.method5486(local39, local14.aByte132, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt6083;
					if (local53 instanceof Class3_Sub1_Sub3_Sub3_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt6058 == 0 && local53.method5203() != -1) {
						Static628.anIntArray707[Static246.anInt5332] = local58;
						Static60.anIntArray88[Static246.anInt5332] = local58;
						Static246.anInt5332++;
						local53.anInt6058++;
					}
					Static628.anIntArray707[Static246.anInt5332] = local58;
					Static60.anIntArray88[Static246.anInt5332] = local14.anInt6083 + 2048;
					Static246.anInt5332++;
					local53.anInt6058++;
				}
			}
		}
		Static232.method4414(Static60.anIntArray88, Static628.anIntArray707, 0, Static246.anInt5332 - 1);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!at;IIIIIIIIIII)V")
	public static void method2237(@OriginalArg(0) Class24[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class24 local6 = arg0[local1];
			if (local6 != null && local6.anInt511 == arg1) {
				@Pc(17) int local17 = local6.anInt495 + arg6;
				@Pc(22) int local22 = local6.anInt465 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt480 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt441;
					local45 = local22 + local6.anInt488;
					if (local6.anInt480 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt480 == 0 || local6.aBoolean28 || method2235(local6).anInt10800 != 0 || local6 == Static102.aClass24_7 || local6.anInt474 == Static63.anInt2060 || local6.anInt474 == Static634.anInt11010) {
					if (!method2241(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static487.aBoolean676) {
							local40 = Static465.method7210();
							local45 = Static207.method4090();
						}
						if (local6 == Static612.aClass24_17 && Static635.method9199(Static612.aClass24_17) != null) {
							Static172.aBoolean307 = true;
							Static626.anInt1466 = local17;
							Static399.anInt7613 = local22;
						}
						if (local6.aBoolean27 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean38 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class2_Sub44 local168 = (Class2_Sub44) Static98.aClass341_28.method8524(); local168 != null; local168 = (Class2_Sub44) Static98.aClass341_28.method8519()) {
									if (local168.aBoolean655) {
										local168.method9253();
										local168.aClass24_15.aBoolean33 = false;
									}
								}
								if (Static170.anInt10313 == 0) {
									Static612.aClass24_17 = null;
									Static102.aClass24_7 = null;
								}
								Static606.anInt10699 = 0;
								Static58.aBoolean730 = false;
								Static524.aBoolean714 = false;
								if (!Static65.aBoolean754) {
									Static364.method6173();
								}
							}
							@Pc(232) boolean local232;
							if (Static628.aClass9_1.method803() + local40 >= local28 && Static628.aClass9_1.method800() + local45 >= local30 && Static628.aClass9_1.method803() + local40 < local32 && Static628.aClass9_1.method800() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static475.aBoolean695 && local232) {
								if (local6.anInt449 >= 0) {
									Static151.anInt3895 = local6.anInt449;
								} else if (local6.aBoolean38) {
									Static151.anInt3895 = -1;
								}
							}
							if (!Static65.aBoolean754 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static543.method8146(arg11 - local22, arg10 - local17, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static628.aClass9_1.method801() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class2_Sub9 local291 = (Class2_Sub9) Static253.aClass341_64.method8524();
							if (local291 != null && local291.method7081() == 0 && local291.method7079() + local40 >= local28 && local291.method7082() + local45 >= local30 && local291.method7079() + local40 < local32 && local291.method7082() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray15 != null && !Static458.method7145()) {
								for (local335 = 0; local335 < local6.aByteArray15.length; local335++) {
									if (Static449.aClass90_1.method8781(local6.aByteArray15[local335])) {
										if (local6.anIntArray31 == null || Static407.anInt7704 >= local6.anIntArray31[local335]) {
											@Pc(367) byte local367 = local6.aByteArray17[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static449.aClass90_1.method8781(86) && !Static449.aClass90_1.method8781(82) && !Static449.aClass90_1.method8781(81)) && ((local367 & 0x2) == 0 || Static449.aClass90_1.method8781(86)) && ((local367 & 0x1) == 0 || Static449.aClass90_1.method8781(82)) && ((local367 & 0x4) == 0 || Static449.aClass90_1.method8781(81))) {
												if (local335 < 10) {
													Static206.method4084(-1, "", local335 + 1, local6.anInt510);
												} else if (local335 == 10) {
													Static117.method2902();
													@Pc(438) Class2_Sub50 local438 = method2235(local6);
													Static114.method2845(local438.anInt10795, local438.method9008(), local6);
													Static225.aString48 = Static345.method5921(local6);
													if (Static225.aString48 == null) {
														Static225.aString48 = "Null";
													}
													Static225.aString47 = local6.aString3 + "<col=ffffff>";
												}
												local469 = local6.anIntArray27[local335];
												if (local6.anIntArray31 == null) {
													local6.anIntArray31 = new int[local6.aByteArray15.length];
												}
												if (local469 == 0) {
													local6.anIntArray31[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray31[local335] = Static407.anInt7704 + local469;
												}
											}
										}
									} else if (local6.anIntArray31 != null) {
										local6.anIntArray31[local335] = 0;
									}
								}
							}
							if (local286) {
								Static343.method5883(local6, local40 + local291.method7079() - local17, local45 + local291.method7082() - local22);
							}
							if (Static612.aClass24_17 != null && Static612.aClass24_17 != local6 && local232 && method2235(local6).method9003()) {
								Static320.aClass24_13 = local6;
							}
							if (local6 == Static102.aClass24_7) {
								Static133.aBoolean254 = true;
								Static146.anInt3560 = local17;
								Static239.anInt5180 = local22;
							}
							if (local6.aBoolean28 || local6.anInt474 != 0) {
								@Pc(558) Class2_Sub44 local558;
								if (local232 && Static341.anInt6870 != 0 && local6.anObjectArray20 != null) {
									local558 = new Class2_Sub44();
									local558.aBoolean655 = true;
									local558.aClass24_15 = local6;
									local558.anInt9083 = Static341.anInt6870;
									local558.anObjectArray32 = local6.anObjectArray20;
									Static98.aClass341_28.method8528(local558);
								}
								if (Static612.aClass24_17 != null || Static65.aBoolean754 || local6.anInt474 != Static55.anInt8363 && Static606.anInt10699 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt474 != 0) {
									if (local6.anInt474 == Static392.anInt7538 || local6.anInt474 == Static69.anInt2217) {
										Static2.aClass24_8 = local6;
										if (Static566.aClass376_1 != null) {
											Static566.aClass376_1.method9209(Static186.aClass20_4, local6.anInt488);
										}
										if (local6.anInt474 == Static392.anInt7538) {
											if (Static65.aBoolean754 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static90.method2494(Static186.aClass20_4, arg8, arg9);
											@Pc(641) Class3_Sub6 local641 = (Class3_Sub6) Static512.aClass325_7.method8016();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt8495 && arg10 < local641.anInt8493 && arg11 >= local641.anInt8494 && arg11 < local641.anInt8492) {
													Static364.method6173();
													Static426.method6846(local641.aClass3_Sub1_Sub3_Sub3_1);
												}
												local641 = (Class3_Sub6) Static512.aClass325_7.method8022();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt474 == Static63.anInt2060) {
										if (local6.method611(Static186.aClass20_4) == null || Static566.anInt10156 != 0 && Static566.anInt10156 != 3 || Static65.aBoolean754 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray24[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray30[local708]) {
											continue;
										}
										local335 -= local6.anInt441 / 2;
										local708 -= local6.anInt488 / 2;
										if (Static496.anInt9165 == 4) {
											local747 = (int) Static72.aFloat68 & 0x3FFF;
										} else {
											local747 = (int) Static72.aFloat68 + Static563.anInt10146 & 0x3FFF;
										}
										@Pc(759) int local759 = Class177.anIntArray361[local747];
										@Pc(763) int local763 = Class177.anIntArray360[local747];
										if (Static496.anInt9165 != 4) {
											local759 = local759 * (Static183.anInt4411 + 256) >> 8;
											local763 = local763 * (Static183.anInt4411 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static496.anInt9165 == 4) {
											local813 = (Static173.anInt4166 >> 9) + (local792 >> 2);
											local821 = (Static176.anInt4216 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.method5214() - 1) * 256;
											local813 = (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 - local830 >> 9) + (local792 >> 2);
											local821 = (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 - local830 >> 9) - (local802 >> 2);
										}
										if (Static475.aBoolean695 && (Static237.anInt5148 & 0x40) != 0) {
											@Pc(863) Class24 local863 = Static330.method5694(Static194.anInt4509, Static397.anInt7582);
											if (local863 == null) {
												Static117.method2902();
											} else {
												Static202.method4065(false, " ->", local821, true, local813, local6.anInt501, true, 15, (long) (local6.anInt439 << 0 | local6.anInt510), Static225.aString48, 1L, Static183.anInt4410);
											}
											continue;
										}
										if (Static423.aClass316_4 == Static557.aClass316_6) {
											Static202.method4065(false, "", local821, true, local813, -1, true, 12, 0L, Static588.aClass351_29.method8691(Static476.anInt8915), 1L, -1);
										}
										Static202.method4065(false, "", local821, true, local813, -1, true, 19, 0L, Static282.aString60, 1L, Static10.anInt160);
										continue;
									}
									if (local6.anInt474 == Static55.anInt8363) {
										Static50.aClass24_5 = local6;
										if (local232) {
											Static58.aBoolean730 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method7079() - local17 - local6.anInt441 / 2) * 2.0D / (double) Static303.aFloat5);
											local708 = (int) -((double) (local45 + local291.method7082() - local22 - local6.anInt488 / 2) * 2.0D / (double) Static303.aFloat5);
											local469 = Static491.anInt9082 + local335 + Static303.anInt110;
											local747 = Static536.anInt9677 + local708 + Static303.anInt108;
											@Pc(994) Class2_Sub6_Sub4 local994 = Static421.method6788();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method2559(local747, local469, local999);
											if (local999 != null) {
												if (Static449.aClass90_1.method8781(82) && Static468.anInt8823 > 0) {
													Static147.method3257(local999[2], local999[0], local999[1]);
													continue;
												}
												Static524.aBoolean714 = true;
												Static567.anInt10184 = local999[0];
												Static512.anInt9375 = local999[1];
												Static30.anInt670 = local999[2];
											}
											Static606.anInt10699 = 1;
											Static259.aBoolean420 = false;
											Static257.anInt5500 = Static628.aClass9_1.method803();
											Static505.anInt9315 = Static628.aClass9_1.method800();
											continue;
										}
										if (local276 && Static606.anInt10699 > 0) {
											if (Static606.anInt10699 == 1 && (Static257.anInt5500 != Static628.aClass9_1.method803() || Static505.anInt9315 != Static628.aClass9_1.method800())) {
												Static452.anInt8389 = Static491.anInt9082;
												Static119.anInt3152 = Static536.anInt9677;
												Static606.anInt10699 = 2;
											}
											if (Static606.anInt10699 == 2) {
												Static259.aBoolean420 = true;
												Static415.method6711(Static452.anInt8389 + (int) ((double) (Static257.anInt5500 - Static628.aClass9_1.method803()) * 2.0D / (double) Static303.aFloat6));
												Static585.method8656(Static119.anInt3152 - (int) ((double) (Static505.anInt9315 - Static628.aClass9_1.method800()) * 2.0D / (double) Static303.aFloat6));
											}
											continue;
										}
										if (Static606.anInt10699 > 0 && !Static259.aBoolean420) {
											if ((Static578.anInt8192 == 1 || Static578.method7000()) && Static298.anInt6262 > 2) {
												Static327.method5619(Static257.anInt5500, Static505.anInt9315);
											} else if (Static192.method3945()) {
												Static327.method5619(Static257.anInt5500, Static505.anInt9315);
											}
										}
										Static606.anInt10699 = 0;
										continue;
									}
									if (local6.anInt474 == Static501.anInt9260) {
										if (local276) {
											Static117.method2900(local6.anInt441, local6.anInt488, local40 + Static628.aClass9_1.method803() - local17, local45 + Static628.aClass9_1.method800() - local22);
										}
										continue;
									}
									if (local6.anInt474 == Static634.anInt11010) {
										Static437.method6921(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean41 && local286) {
									local6.aBoolean41 = true;
									if (local6.anObjectArray16 != null) {
										local558 = new Class2_Sub44();
										local558.aBoolean655 = true;
										local558.aClass24_15 = local6;
										local558.anInt9077 = local40 + local291.method7079() - local17;
										local558.anInt9083 = local45 + local291.method7082() - local22;
										local558.anObjectArray32 = local6.anObjectArray16;
										Static98.aClass341_28.method8528(local558);
									}
								}
								if (local6.aBoolean41 && local276 && local6.anObjectArray19 != null) {
									local558 = new Class2_Sub44();
									local558.aBoolean655 = true;
									local558.aClass24_15 = local6;
									local558.anInt9077 = local40 + Static628.aClass9_1.method803() - local17;
									local558.anInt9083 = local45 + Static628.aClass9_1.method800() - local22;
									local558.anObjectArray32 = local6.anObjectArray19;
									Static98.aClass341_28.method8528(local558);
								}
								if (local6.aBoolean41 && !local276) {
									local6.aBoolean41 = false;
									if (local6.anObjectArray13 != null) {
										local558 = new Class2_Sub44();
										local558.aBoolean655 = true;
										local558.aClass24_15 = local6;
										local558.anInt9077 = local40 + Static628.aClass9_1.method803() - local17;
										local558.anInt9083 = local45 + Static628.aClass9_1.method800() - local22;
										local558.anObjectArray32 = local6.anObjectArray13;
										Static156.aClass341_37.method8528(local558);
									}
								}
								if (local276 && local6.anObjectArray21 != null) {
									local558 = new Class2_Sub44();
									local558.aBoolean655 = true;
									local558.aClass24_15 = local6;
									local558.anInt9077 = local40 + Static628.aClass9_1.method803() - local17;
									local558.anInt9083 = local45 + Static628.aClass9_1.method800() - local22;
									local558.anObjectArray32 = local6.anObjectArray21;
									Static98.aClass341_28.method8528(local558);
								}
								if (!local6.aBoolean33 && local232) {
									local6.aBoolean33 = true;
									if (local6.anObjectArray23 != null) {
										local558 = new Class2_Sub44();
										local558.aBoolean655 = true;
										local558.aClass24_15 = local6;
										local558.anInt9077 = local40 + Static628.aClass9_1.method803() - local17;
										local558.anInt9083 = local45 + Static628.aClass9_1.method800() - local22;
										local558.anObjectArray32 = local6.anObjectArray23;
										Static98.aClass341_28.method8528(local558);
									}
								}
								if (local6.aBoolean33 && local232 && local6.anObjectArray29 != null) {
									local558 = new Class2_Sub44();
									local558.aBoolean655 = true;
									local558.aClass24_15 = local6;
									local558.anInt9077 = local40 + Static628.aClass9_1.method803() - local17;
									local558.anInt9083 = local45 + Static628.aClass9_1.method800() - local22;
									local558.anObjectArray32 = local6.anObjectArray29;
									Static98.aClass341_28.method8528(local558);
								}
								if (local6.aBoolean33 && !local232) {
									local6.aBoolean33 = false;
									if (local6.anObjectArray4 != null) {
										local558 = new Class2_Sub44();
										local558.aBoolean655 = true;
										local558.aClass24_15 = local6;
										local558.anInt9077 = local40 + Static628.aClass9_1.method803() - local17;
										local558.anInt9083 = local45 + Static628.aClass9_1.method800() - local22;
										local558.anObjectArray32 = local6.anObjectArray4;
										Static156.aClass341_37.method8528(local558);
									}
								}
								if (local6.anObjectArray17 != null) {
									local558 = new Class2_Sub44();
									local558.aClass24_15 = local6;
									local558.anObjectArray32 = local6.anObjectArray17;
									Static488.aClass341_57.method8528(local558);
								}
								@Pc(1570) Class2_Sub44 local1570;
								if (local6.anObjectArray5 != null && Static65.anInt11083 > local6.anInt460) {
									if (local6.anIntArray32 == null || Static65.anInt11083 - local6.anInt460 > 32) {
										local558 = new Class2_Sub44();
										local558.aClass24_15 = local6;
										local558.anObjectArray32 = local6.anObjectArray5;
										Static98.aClass341_28.method8528(local558);
									} else {
										label687: for (local335 = local6.anInt460; local335 < Static65.anInt11083; local335++) {
											local708 = Static350.anIntArray439[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray32.length; local469++) {
												if (local6.anIntArray32[local469] == local708) {
													local1570 = new Class2_Sub44();
													local1570.aClass24_15 = local6;
													local1570.anObjectArray32 = local6.anObjectArray5;
													Static98.aClass341_28.method8528(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt460 = Static65.anInt11083;
								}
								if (local6.anObjectArray9 != null && Static604.anInt10622 > local6.anInt502) {
									if (local6.anIntArray33 == null || Static604.anInt10622 - local6.anInt502 > 32) {
										local558 = new Class2_Sub44();
										local558.aClass24_15 = local6;
										local558.anObjectArray32 = local6.anObjectArray9;
										Static98.aClass341_28.method8528(local558);
									} else {
										label663: for (local335 = local6.anInt502; local335 < Static604.anInt10622; local335++) {
											local708 = Static613.anIntArray689[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray33.length; local469++) {
												if (local6.anIntArray33[local469] == local708) {
													local1570 = new Class2_Sub44();
													local1570.aClass24_15 = local6;
													local1570.anObjectArray32 = local6.anObjectArray9;
													Static98.aClass341_28.method8528(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt502 = Static604.anInt10622;
								}
								if (local6.anObjectArray18 != null && Static609.anInt10690 > local6.anInt452) {
									if (local6.anIntArray25 == null || Static609.anInt10690 - local6.anInt452 > 32) {
										local558 = new Class2_Sub44();
										local558.aClass24_15 = local6;
										local558.anObjectArray32 = local6.anObjectArray18;
										Static98.aClass341_28.method8528(local558);
									} else {
										label639: for (local335 = local6.anInt452; local335 < Static609.anInt10690; local335++) {
											local708 = Static93.anIntArray129[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray25.length; local469++) {
												if (local6.anIntArray25[local469] == local708) {
													local1570 = new Class2_Sub44();
													local1570.aClass24_15 = local6;
													local1570.anObjectArray32 = local6.anObjectArray18;
													Static98.aClass341_28.method8528(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt452 = Static609.anInt10690;
								}
								if (local6.anObjectArray14 != null && Static349.anInt6960 > local6.anInt451) {
									if (local6.anIntArray29 == null || Static349.anInt6960 - local6.anInt451 > 32) {
										local558 = new Class2_Sub44();
										local558.aClass24_15 = local6;
										local558.anObjectArray32 = local6.anObjectArray14;
										Static98.aClass341_28.method8528(local558);
									} else {
										label615: for (local335 = local6.anInt451; local335 < Static349.anInt6960; local335++) {
											local708 = Static478.anIntArray575[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray29.length; local469++) {
												if (local6.anIntArray29[local469] == local708) {
													local1570 = new Class2_Sub44();
													local1570.aClass24_15 = local6;
													local1570.anObjectArray32 = local6.anObjectArray14;
													Static98.aClass341_28.method8528(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt451 = Static349.anInt6960;
								}
								if (local6.anObjectArray1 != null && Static91.anInt2652 > local6.anInt445) {
									if (local6.anIntArray28 == null || Static91.anInt2652 - local6.anInt445 > 32) {
										local558 = new Class2_Sub44();
										local558.aClass24_15 = local6;
										local558.anObjectArray32 = local6.anObjectArray1;
										Static98.aClass341_28.method8528(local558);
									} else {
										label591: for (local335 = local6.anInt445; local335 < Static91.anInt2652; local335++) {
											local708 = Static478.anIntArray574[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray28.length; local469++) {
												if (local6.anIntArray28[local469] == local708) {
													local1570 = new Class2_Sub44();
													local1570.aClass24_15 = local6;
													local1570.anObjectArray32 = local6.anObjectArray1;
													Static98.aClass341_28.method8528(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt445 = Static91.anInt2652;
								}
								if (Static328.anInt6626 > local6.anInt453 && local6.anObjectArray25 != null) {
									local558 = new Class2_Sub44();
									local558.aClass24_15 = local6;
									local558.anObjectArray32 = local6.anObjectArray25;
									Static98.aClass341_28.method8528(local558);
								}
								if (Static373.anInt7362 > local6.anInt453 && local6.lb != null) {
									local558 = new Class2_Sub44();
									local558.aClass24_15 = local6;
									local558.anObjectArray32 = local6.lb;
									Static98.aClass341_28.method8528(local558);
								}
								if (Static518.anInt9446 > local6.anInt453 && local6.anObjectArray15 != null) {
									local558 = new Class2_Sub44();
									local558.aClass24_15 = local6;
									local558.anObjectArray32 = local6.anObjectArray15;
									Static98.aClass341_28.method8528(local558);
								}
								if (Static462.anInt8469 > local6.anInt453 && local6.anObjectArray22 != null) {
									local558 = new Class2_Sub44();
									local558.aClass24_15 = local6;
									local558.anObjectArray32 = local6.anObjectArray22;
									Static98.aClass341_28.method8528(local558);
								}
								if (Static62.anInt2039 > local6.anInt453 && local6.anObjectArray28 != null) {
									local558 = new Class2_Sub44();
									local558.aClass24_15 = local6;
									local558.anObjectArray32 = local6.anObjectArray28;
									Static98.aClass341_28.method8528(local558);
								}
								local6.anInt453 = Static7.anInt132;
								if (local6.anObjectArray26 != null) {
									for (local335 = 0; local335 < Static266.anInt5672; local335++) {
										@Pc(2038) Class2_Sub44 local2038 = new Class2_Sub44();
										local2038.aClass24_15 = local6;
										local2038.anInt9081 = Static332.anInterface16Array1[local335].method4435();
										local2038.anInt9076 = Static332.anInterface16Array1[local335].method4433();
										local2038.anObjectArray32 = local6.anObjectArray26;
										Static98.aClass341_28.method8528(local2038);
									}
								}
								if (Static123.aBoolean251 && local6.anObjectArray6 != null) {
									local558 = new Class2_Sub44();
									local558.aClass24_15 = local6;
									local558.anObjectArray32 = local6.anObjectArray6;
									Static98.aClass341_28.method8528(local558);
								}
							}
							if (local6.anInt480 == 5 && local6.anInt440 != -1) {
								local6.method630(Static371.aClass137_1, Static227.aClass190_1).method9209(Static186.aClass20_4, local6.anInt488);
							}
							Static210.method4127(local6);
							if (local6.anInt480 == 0) {
								method2237(arg0, local6.anInt510, local28, local30, local32, local34, local17 - local6.anInt463, local22 - local6.anInt467, arg8, arg9, arg10, arg11);
								if (local6.aClass24Array1 != null) {
									method2237(local6.aClass24Array1, local6.anInt510, local28, local30, local32, local34, local17 - local6.anInt463, local22 - local6.anInt467, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class2_Sub48 local2164 = (Class2_Sub48) Static372.aClass99_51.method3056((long) local6.anInt510);
								if (local2164 != null) {
									if (Static423.aClass316_4 == Static195.aClass316_2 && local2164.anInt10127 == 0 && !Static65.aBoolean754 && local232 && !Static591.aBoolean480) {
										Static364.method6173();
									}
									Static449.method7069(local2164.anInt10125, local17, local28, local32, arg9, arg8, arg10, local34, local22, arg11, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static210.method4127(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!at;)Lclient!at;")
	public static Class24 method2238(@OriginalArg(0) Class24 arg0) {
		@Pc(4) int local4 = method2235(arg0).method9005();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static87.method8101(arg0.anInt511);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method2239() {
		for (@Pc(1) int local1 = 0; local1 < Static47.anInt1794; local1++) {
			@Pc(6) int[] local6 = Static198.anIntArrayArray19[local1];
			for (@Pc(8) int local8 = 0; local8 < Static209.anInt4742; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!at;)Z")
	public static boolean method2241(@OriginalArg(0) Class24 arg0) {
		if (Static591.aBoolean480) {
			if (method2235(arg0).anInt10800 != 0) {
				return false;
			}
			if (arg0.anInt480 == 0) {
				return false;
			}
		}
		return arg0.aBoolean43;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method2242() {
		@Pc(1) int local1 = Static71.anInt3990;
		@Pc(3) int[] local3 = Static549.anIntArray643;
		@Pc(11) int local11 = Static34.aBoolean61 ? local1 : local1 + Static398.anInt7589;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class3_Sub1_Sub3_Sub3 local23;
			if (local13 < local1) {
				local23 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) Static301.anIntArray367[local13 - local1])).aClass3_Sub1_Sub3_Sub3_Sub1_2;
			}
			if (local23.anInt6078 >= 0) {
				@Pc(43) int local43 = local23.method5214();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10303 & 0x1FF) == 0 && (local23.anInt10310 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10303 & 0x1FF) == 256 && (local23.anInt10310 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10306 = Static590.method8716(local23.anInt10303, local23.aByte132, local23.anInt10310);
				Static324.method5602(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method2245() {
		@Pc(1) int local1 = Static71.anInt3990;
		@Pc(3) int[] local3 = Static549.anIntArray643;
		@Pc(8) int local8 = Static74.aClass2_Sub13_5.aClass14_Sub20_1.method6845();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class3_Sub1_Sub3_Sub3_Sub2 local32 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local3[local25]];
			if (!local32.method5227()) {
				local32.anInt6078 = -1;
			} else if (local32.aBoolean460) {
				local32.anInt6078 = -1;
			} else {
				local32.method8219();
				if (local32.aShort118 >= 0 && local32.aShort120 >= 0 && local32.aShort121 < Static47.anInt1794 && local32.aShort119 < Static209.anInt4742) {
					local32.aBoolean458 = local32.aBoolean450 ? local23 : false;
					if (local32 == Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2) {
						local32.anInt6078 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean454) {
							local85++;
						}
						if (local32.anInt6030 > Static407.anInt7704) {
							local85 += 2;
						}
						local85 += 5 - local32.method5214() << 2;
						if (local32.aBoolean461) {
							local85 += 512;
						} else {
							if (Static235.anInt5132 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt6078 = local85 + 1;
					}
				} else {
					local32.anInt6078 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static398.anInt7589; local126++) {
			@Pc(137) Class3_Sub1_Sub3_Sub3_Sub1 local137 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) Static301.anIntArray367[local126])).aClass3_Sub1_Sub3_Sub3_Sub1_2;
			if (local137.method3403() && local137.aClass27_1.method729(Static286.aClass263_3)) {
				local137.method8219();
				if (local137.aShort118 >= 0 && local137.aShort120 >= 0 && local137.aShort121 < Static47.anInt1794 && local137.aShort119 < Static209.anInt4742) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean454) {
						local174++;
					}
					if (local137.anInt6030 > Static407.anInt7704) {
						local174 += 2;
					}
					local174 += 5 - local137.method5214() << 2;
					if (Static235.anInt5132 == 0) {
						if (local137.aClass27_1.aBoolean51) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static235.anInt5132 == 1) {
						if (local137.aClass27_1.aBoolean51) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass27_1.aBoolean50) {
						local174 += 1024;
					} else if (!local137.aClass27_1.aBoolean54) {
						local174 += 256;
					}
					local137.anInt6078 = local174 + 1;
				} else {
					local137.anInt6078 = -1;
				}
			} else {
				local137.anInt6078 = -1;
			}
		}
		for (local85 = 0; local85 < Static351.aClass373Array1.length; local85++) {
			@Pc(240) Class373 local240 = Static351.aClass373Array1[local85];
			if (local240 != null) {
				if (local240.anInt11021 == 1) {
					@Pc(254) Class2_Sub33 local254 = (Class2_Sub33) Static600.aClass99_79.method3056((long) local240.anInt11014);
					if (local254 != null) {
						@Pc(259) Class3_Sub1_Sub3_Sub3_Sub1 local259 = local254.aClass3_Sub1_Sub3_Sub3_Sub1_2;
						if (local259.anInt6078 >= 0) {
							local259.anInt6078 += 2048;
						}
					}
				} else if (local240.anInt11021 == 10) {
					@Pc(278) Class3_Sub1_Sub3_Sub3_Sub2 local278 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local240.anInt11014];
					if (local278 != null && local278 != Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2 && local278.anInt6078 >= 0) {
						local278.anInt6078 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
	public static void method2247(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static71.anInt3990;
		@Pc(3) int[] local3 = Static549.anIntArray643;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static398.anInt7589; local5++) {
			@Pc(15) Class3_Sub1_Sub3_Sub3 local15;
			if (local5 < local1) {
				local15 = Static618.aClass3_Sub1_Sub3_Sub3_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) Static301.anIntArray367[local5 - local1])).aClass3_Sub1_Sub3_Sub3_Sub1_2;
			}
			if (local15.aByte132 == arg0 && local15.anInt6078 >= 0) {
				@Pc(39) int local39 = local15.method5214();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10303 & 0x1FF) != 0 || (local15.anInt10310 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10303 & 0x1FF) != 256 || (local15.anInt10310 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10303 >> 9;
					local80 = local15.anInt10310 >> 9;
					if (local15.anInt6078 > Static198.anIntArrayArray19[local75][local80]) {
						Static198.anIntArrayArray19[local75][local80] = local15.anInt6078;
						Static345.anIntArrayArray34[local75][local80] = 1;
					} else if (local15.anInt6078 == Static198.anIntArrayArray19[local75][local80]) {
						local116 = Static345.anIntArrayArray34[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10303 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10310 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10303 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10310 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt6078 > Static198.anIntArrayArray19[local158][local161]) {
								Static198.anIntArrayArray19[local158][local161] = local15.anInt6078;
								Static345.anIntArrayArray34[local158][local161] = 1;
							} else if (local15.anInt6078 == Static198.anIntArrayArray19[local158][local161]) {
								local116 = Static345.anIntArrayArray34[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}
}
