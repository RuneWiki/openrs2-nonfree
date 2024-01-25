import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static int anInt872;

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method750(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static103.anInt6434;
		@Pc(3) int[] local3 = Static56.anIntArray110;
		@Pc(11) int local11 = Static164.aBoolean572 ? local1 : local1 + Static137.anInt2142;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) Static135.anIntArray183[local13 - local1])).aClass11_Sub1_Sub3_Sub1_2;
			}
			if (local23.aByte90 == arg0) {
				local23.anInt3312 = 0;
				if (local23.anInt3284 < 0) {
					local23.aBoolean324 = false;
				} else {
					@Pc(54) int local54 = local23.method2635();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt6428 & 0x7F) != 0 || (local23.anInt6430 & 0x7F) != 0) {
							local23.aBoolean324 = false;
							continue;
						}
					} else if ((local23.anInt6428 & 0x7F) != 64 || (local23.anInt6430 & 0x7F) != 64) {
						local23.aBoolean324 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt6428 >> 7;
						local101 = local23.anInt6430 >> 7;
						if (local23.anInt3284 != Static462.anIntArrayArray59[local96][local101]) {
							local23.aBoolean324 = true;
							continue;
						}
						if (Static180.anIntArrayArray23[local96][local101] > 1) {
							local126 = Static180.anIntArrayArray23[local96][local101]--;
							local23.aBoolean324 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt6428 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt6430 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt6428 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt6430 + local96 >> 7;
						if (!Static162.method3780(local101, local169, local155, local162, local23.anInt3284)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt3284 == Static462.anIntArrayArray59[local180][local183]) {
										local126 = Static180.anIntArrayArray23[local180][local183]--;
									}
								}
							}
							local23.aBoolean324 = true;
							continue;
						}
					}
					if (local23 instanceof Class11_Sub1_Sub3_Sub2 && local23.aClass1_Sub24_3 != null && Static98.anInt1304 >= local23.aClass1_Sub24_3.anInt3674 && Static98.anInt1304 < local23.aClass1_Sub24_3.anInt3675) {
						((Class11_Sub1_Sub3_Sub2) local23).aBoolean326 = false;
					}
					local23.aBoolean324 = false;
					local23.anInt6437 = Static135.method1732(local23.anInt6428, local23.anInt6430, local23.aByte90);
					Static95.method5201(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I")
	public static int method752(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!hm;IIIIIIIII)V")
	public static void method753(@OriginalArg(0) Class107[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class107 local6 = arg0[local1];
			if (local6 != null && local6.anInt2624 == arg1) {
				@Pc(17) int local17 = local6.anInt2594 + arg6;
				@Pc(22) int local22 = local6.anInt2618 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2598 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2648;
					@Pc(45) int local45 = local22 + local6.anInt2606;
					if (local6.anInt2598 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2598 == 0 || local6.aBoolean265 || method767(local6).anInt3891 != 0 || local6 == Static192.aClass107_9 || local6.anInt2588 == Static103.anInt6435) {
					if (!method764(local6)) {
						if (local6 == Static364.aClass107_13) {
							Static180.aBoolean320 = true;
							Static322.anInt5305 = local17;
							Static85.anInt6285 = local22;
						}
						if (local6.aBoolean254 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean260 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class1_Sub11 local148 = (Class1_Sub11) Static328.aClass14_38.method203(); local148 != null; local148 = (Class1_Sub11) Static328.aClass14_38.method208()) {
									if (local148.aBoolean139) {
										local148.method5953();
										local148.aClass107_2.aBoolean258 = false;
									}
								}
								if (Static156.anInt2548 == 0) {
									Static364.aClass107_13 = null;
									Static192.aClass107_9 = null;
								}
								Static302.anInt5060 = 0;
								Static426.aBoolean592 = false;
								Static282.aBoolean431 = false;
								if (!Static170.aBoolean282) {
									Static447.method5754();
								}
							}
							@Pc(204) boolean local204;
							if (Static181.aClass224_1.method5613() >= local28 && Static181.aClass224_1.method5615() >= local30 && Static181.aClass224_1.method5613() < local32 && Static181.aClass224_1.method5615() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static290.aBoolean449 && local204) {
								if (local6.anInt2654 >= 0) {
									Static211.anInt5191 = local6.anInt2654;
								} else if (local6.aBoolean260) {
									Static211.anInt5191 = -1;
								}
							}
							if (!Static170.aBoolean282 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static10.method4084(local6, arg9 - local22, arg8 - local17);
							}
							@Pc(248) boolean local248 = false;
							if (Static181.aClass224_1.method5620() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class1_Sub22 local263 = (Class1_Sub22) Static378.aClass14_45.method203();
							if (local263 != null && local263.method4156() == 0 && local263.method4162() >= local28 && local263.method4161() >= local30 && local263.method4162() < local32 && local263.method4161() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray26 != null) {
								for (local296 = 0; local296 < local6.aByteArray26.length; local296++) {
									if (Static269.aClass53_1.method3910(local6.aByteArray26[local296])) {
										if (local6.anIntArray212 == null || Static98.anInt1304 >= local6.anIntArray212[local296]) {
											@Pc(328) byte local328 = local6.aByteArray27[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static269.aClass53_1.method3910(86) && !Static269.aClass53_1.method3910(82) && !Static269.aClass53_1.method3910(81)) && ((local328 & 0x2) == 0 || Static269.aClass53_1.method3910(86)) && ((local328 & 0x1) == 0 || Static269.aClass53_1.method3910(82)) && ((local328 & 0x4) == 0 || Static269.aClass53_1.method3910(81))) {
												if (local296 < 10) {
													Static265.method3661("", local296 + 1, local6.anInt2660, -1);
												} else if (local296 == 10) {
													Static403.method5125();
													@Pc(399) Class1_Sub27 local399 = method767(local6);
													Static305.method4063(local6, local399.anInt3884, local399.method3034());
													Static28.aString5 = Static210.method5855(local6);
													if (Static28.aString5 == null) {
														Static28.aString5 = "Null";
													}
													Static392.aString62 = local6.aString23 + "<col=ffffff>";
												}
												local430 = local6.anIntArray204[local296];
												if (local6.anIntArray212 == null) {
													local6.anIntArray212 = new int[local6.aByteArray26.length];
												}
												if (local430 == 0) {
													local6.anIntArray212[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray212[local296] = Static98.anInt1304 + local430;
												}
											}
										}
									} else if (local6.anIntArray212 != null) {
										local6.anIntArray212[local296] = 0;
									}
								}
							}
							if (local258) {
								Static111.method1402(local263.method4161() - local22, local263.method4162() - local17, local6);
							}
							if (Static364.aClass107_13 != null && Static364.aClass107_13 != local6 && local204 && method767(local6).method3033()) {
								Static35.aClass107_1 = local6;
							}
							if (local6 == Static192.aClass107_9) {
								Static333.aBoolean496 = true;
								Static277.anInt4736 = local17;
								Static416.anInt6714 = local22;
							}
							if (local6.aBoolean265 || local6.anInt2588 != 0) {
								@Pc(515) Class1_Sub11 local515;
								if (local204 && Static426.anInt6829 != 0 && local6.anObjectArray31 != null) {
									local515 = new Class1_Sub11();
									local515.aBoolean139 = true;
									local515.aClass107_2 = local6;
									local515.anInt1182 = Static426.anInt6829;
									local515.anObjectArray2 = local6.anObjectArray31;
									Static328.aClass14_38.method205(local515);
								}
								if (Static364.aClass107_13 != null || Static170.aBoolean282 || local6.anInt2588 != Static380.anInt6112 && Static302.anInt5060 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2588 != 0) {
									if (local6.anInt2588 == Static286.anInt4796 || local6.anInt2588 == Static212.anInt3925) {
										Static440.aClass107_7 = local6;
										if (Static203.aClass197_1 != null) {
											Static203.aClass197_1.method4173(Static186.aClass117_3, local6.anInt2606);
										}
										if (local6.anInt2588 == Static286.anInt4796) {
											if (!Static170.aBoolean282 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static180.method2594(Static186.aClass117_3, arg9, arg8);
												for (@Pc(598) Class111_Sub2 local598 = (Class111_Sub2) Static57.aClass63_1.method1019(); local598 != null; local598 = (Class111_Sub2) Static57.aClass63_1.method1022()) {
													if (arg8 >= local598.anInt3588 && arg8 < local598.anInt3586 && arg9 >= local598.anInt3585 && arg9 < local598.anInt3587) {
														Static447.method5754();
														Static86.method5997(local598.aClass11_Sub1_Sub3_1);
													}
												}
											}
											Static357.method4687(local6, local22, local17);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2588 == Static103.anInt6435) {
										if (local6.method2116(Static186.aClass117_3) == null || Static61.anInt7291 != 0 && Static61.anInt7291 != 3 || Static170.aBoolean282 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray210[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray209[local670]) {
											continue;
										}
										local296 -= local6.anInt2648 / 2;
										local670 -= local6.anInt2606 / 2;
										if (Static139.anInt2147 == 4) {
											local709 = (int) Static99.aFloat9 & 0x3FFF;
										} else {
											local709 = (int) Static99.aFloat9 + Static20.anInt301 & 0x3FFF;
										}
										@Pc(721) int local721 = Class1_Sub29.anIntArray537[local709];
										@Pc(725) int local725 = Class1_Sub29.anIntArray536[local709];
										if (Static139.anInt2147 != 4) {
											local721 = local721 * (Static265.anInt4616 + 256) >> 8;
											local725 = local725 * (Static265.anInt4616 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static139.anInt2147 == 4) {
											local775 = (Static75.anInt1065 >> 7) + (local754 >> 2);
											local783 = (Static4.anInt58 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static94.aClass11_Sub1_Sub3_Sub2_1.method2635() - 1) * 64;
											local775 = (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 - local792 >> 7) + (local754 >> 2);
											local783 = (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 - local792 >> 7) - (local764 >> 2);
										}
										if (Static290.aBoolean449 && (Static226.anInt4102 & 0x40) != 0) {
											@Pc(825) Class107 local825 = Static220.method3163(Static403.anInt6355, Static276.anInt4734);
											if (local825 == null) {
												Static403.method5125();
											} else {
												Static213.method3090(1L, Static28.aString5, " ->", local775, Static313.anInt5165, false, local783, 23, true, local6.anInt2631);
											}
											continue;
										}
										if (Static94.aClass148_3 == Static93.aClass148_2) {
											Static213.method3090(1L, Static402.aClass142_101.method3118(Static63.anInt981), "", local775, -1, false, local783, 5, true, -1);
										}
										Static213.method3090(1L, Static305.aString60, "", local775, Static176.anInt3165, false, local783, 6, true, -1);
										continue;
									}
									if (local6.anInt2588 == Static380.anInt6112) {
										Static399.aClass107_14 = local6;
										if (local204) {
											Static426.aBoolean592 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method4162() - local17 - local6.anInt2648 / 2) * 2.0D / (double) Static430.aFloat55);
											local670 = (int) -((double) (local263.method4161() - local22 - local6.anInt2606 / 2) * 2.0D / (double) Static430.aFloat55);
											local430 = Static223.anInt5659 + local296 + Static430.anInt4140;
											local709 = Static173.anInt2855 + local670 + Static430.anInt4146;
											@Pc(939) Class1_Sub3_Sub16 local939 = Static60.method840();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method5113(local709, local944, local430);
											if (local944 != null) {
												if (Static269.aClass53_1.method3910(82) && Static435.anInt6026 > 0) {
													Static290.method3881(local944[2], local944[1], local944[0]);
													continue;
												}
												Static282.aBoolean431 = true;
												Static250.anInt4448 = local944[0];
												Static383.anInt6138 = local944[1];
												Static59.anInt945 = local944[2];
											}
											Static302.anInt5060 = 1;
											Static248.aBoolean410 = false;
											Static256.anInt4522 = Static181.aClass224_1.method5613();
											Static456.anInt3744 = Static181.aClass224_1.method5615();
											continue;
										}
										if (local248 && Static302.anInt5060 > 0) {
											if (Static302.anInt5060 == 1 && (Static256.anInt4522 != Static181.aClass224_1.method5613() || Static456.anInt3744 != Static181.aClass224_1.method5615())) {
												Static300.anInt5033 = Static223.anInt5659;
												Static374.anInt6021 = Static173.anInt2855;
												Static302.anInt5060 = 2;
											}
											if (Static302.anInt5060 == 2) {
												Static248.aBoolean410 = true;
												Static361.method4700(Static300.anInt5033 + (int) ((double) (Static256.anInt4522 - Static181.aClass224_1.method5613()) * 2.0D / (double) Static430.aFloat54));
												Static351.method4581(Static374.anInt6021 - (int) ((double) (Static456.anInt3744 - Static181.aClass224_1.method5615()) * 2.0D / (double) Static430.aFloat54));
											}
											continue;
										}
										if (Static302.anInt5060 > 0 && !Static248.aBoolean410) {
											if ((Static371.anInt5991 == 1 || Static373.method5948()) && Static76.anInt1078 > 2) {
												Static417.method5345(Static456.anInt3744, Static256.anInt4522);
											} else if (Static370.method4826()) {
												Static417.method5345(Static456.anInt3744, Static256.anInt4522);
											}
										}
										Static302.anInt5060 = 0;
										continue;
									}
									if (local6.anInt2588 == Static237.anInt4276) {
										if (local248) {
											Static405.method5209(local6.anInt2648, local6.anInt2606, Static181.aClass224_1.method5613() - local17, Static181.aClass224_1.method5615() - local22);
										}
										continue;
									}
									if (local6.anInt2588 == Static38.anInt550) {
										Static255.method3575(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean262 && local258) {
									local6.aBoolean262 = true;
									if (local6.anObjectArray16 != null) {
										local515 = new Class1_Sub11();
										local515.aBoolean139 = true;
										local515.aClass107_2 = local6;
										local515.anInt1183 = local263.method4162() - local17;
										local515.anInt1182 = local263.method4161() - local22;
										local515.anObjectArray2 = local6.anObjectArray16;
										Static328.aClass14_38.method205(local515);
									}
								}
								if (local6.aBoolean262 && local248 && local6.anObjectArray33 != null) {
									local515 = new Class1_Sub11();
									local515.aBoolean139 = true;
									local515.aClass107_2 = local6;
									local515.anInt1183 = Static181.aClass224_1.method5613() - local17;
									local515.anInt1182 = Static181.aClass224_1.method5615() - local22;
									local515.anObjectArray2 = local6.anObjectArray33;
									Static328.aClass14_38.method205(local515);
								}
								if (local6.aBoolean262 && !local248) {
									local6.aBoolean262 = false;
									if (local6.anObjectArray5 != null) {
										local515 = new Class1_Sub11();
										local515.aBoolean139 = true;
										local515.aClass107_2 = local6;
										local515.anInt1183 = Static181.aClass224_1.method5613() - local17;
										local515.anInt1182 = Static181.aClass224_1.method5615() - local22;
										local515.anObjectArray2 = local6.anObjectArray5;
										Static449.aClass14_51.method205(local515);
									}
								}
								if (local248 && local6.anObjectArray23 != null) {
									local515 = new Class1_Sub11();
									local515.aBoolean139 = true;
									local515.aClass107_2 = local6;
									local515.anInt1183 = Static181.aClass224_1.method5613() - local17;
									local515.anInt1182 = Static181.aClass224_1.method5615() - local22;
									local515.anObjectArray2 = local6.anObjectArray23;
									Static328.aClass14_38.method205(local515);
								}
								if (!local6.aBoolean258 && local204) {
									local6.aBoolean258 = true;
									if (local6.anObjectArray22 != null) {
										local515 = new Class1_Sub11();
										local515.aBoolean139 = true;
										local515.aClass107_2 = local6;
										local515.anInt1183 = Static181.aClass224_1.method5613() - local17;
										local515.anInt1182 = Static181.aClass224_1.method5615() - local22;
										local515.anObjectArray2 = local6.anObjectArray22;
										Static328.aClass14_38.method205(local515);
									}
								}
								if (local6.aBoolean258 && local204 && local6.anObjectArray25 != null) {
									local515 = new Class1_Sub11();
									local515.aBoolean139 = true;
									local515.aClass107_2 = local6;
									local515.anInt1183 = Static181.aClass224_1.method5613() - local17;
									local515.anInt1182 = Static181.aClass224_1.method5615() - local22;
									local515.anObjectArray2 = local6.anObjectArray25;
									Static328.aClass14_38.method205(local515);
								}
								if (local6.aBoolean258 && !local204) {
									local6.aBoolean258 = false;
									if (local6.anObjectArray30 != null) {
										local515 = new Class1_Sub11();
										local515.aBoolean139 = true;
										local515.aClass107_2 = local6;
										local515.anInt1183 = Static181.aClass224_1.method5613() - local17;
										local515.anInt1182 = Static181.aClass224_1.method5615() - local22;
										local515.anObjectArray2 = local6.anObjectArray30;
										Static449.aClass14_51.method205(local515);
									}
								}
								if (local6.anObjectArray3 != null) {
									local515 = new Class1_Sub11();
									local515.aClass107_2 = local6;
									local515.anObjectArray2 = local6.anObjectArray3;
									Static322.aClass14_34.method205(local515);
								}
								@Pc(1483) Class1_Sub11 local1483;
								if (local6.anObjectArray17 != null && Static128.anInt1969 > local6.anInt2628) {
									if (local6.anIntArray208 == null || Static128.anInt1969 - local6.anInt2628 > 32) {
										local515 = new Class1_Sub11();
										local515.aClass107_2 = local6;
										local515.anObjectArray2 = local6.anObjectArray17;
										Static328.aClass14_38.method205(local515);
									} else {
										label678: for (local296 = local6.anInt2628; local296 < Static128.anInt1969; local296++) {
											local670 = Static139.anIntArray186[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray208.length; local430++) {
												if (local6.anIntArray208[local430] == local670) {
													local1483 = new Class1_Sub11();
													local1483.aClass107_2 = local6;
													local1483.anObjectArray2 = local6.anObjectArray17;
													Static328.aClass14_38.method205(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2628 = Static128.anInt1969;
								}
								if (local6.anObjectArray12 != null && Static455.anInt7243 > local6.anInt2583) {
									if (local6.anIntArray205 == null || Static455.anInt7243 - local6.anInt2583 > 32) {
										local515 = new Class1_Sub11();
										local515.aClass107_2 = local6;
										local515.anObjectArray2 = local6.anObjectArray12;
										Static328.aClass14_38.method205(local515);
									} else {
										label654: for (local296 = local6.anInt2583; local296 < Static455.anInt7243; local296++) {
											local670 = Static288.anIntArray366[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray205.length; local430++) {
												if (local6.anIntArray205[local430] == local670) {
													local1483 = new Class1_Sub11();
													local1483.aClass107_2 = local6;
													local1483.anObjectArray2 = local6.anObjectArray12;
													Static328.aClass14_38.method205(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2583 = Static455.anInt7243;
								}
								if (local6.anObjectArray28 != null && Static46.anInt5440 > local6.anInt2653) {
									if (local6.anIntArray213 == null || Static46.anInt5440 - local6.anInt2653 > 32) {
										local515 = new Class1_Sub11();
										local515.aClass107_2 = local6;
										local515.anObjectArray2 = local6.anObjectArray28;
										Static328.aClass14_38.method205(local515);
									} else {
										label630: for (local296 = local6.anInt2653; local296 < Static46.anInt5440; local296++) {
											local670 = Static465.anIntArray520[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray213.length; local430++) {
												if (local6.anIntArray213[local430] == local670) {
													local1483 = new Class1_Sub11();
													local1483.aClass107_2 = local6;
													local1483.anObjectArray2 = local6.anObjectArray28;
													Static328.aClass14_38.method205(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2653 = Static46.anInt5440;
								}
								if (local6.anObjectArray26 != null && Static210.anInt7228 > local6.anInt2629) {
									if (local6.anIntArray207 == null || Static210.anInt7228 - local6.anInt2629 > 32) {
										local515 = new Class1_Sub11();
										local515.aClass107_2 = local6;
										local515.anObjectArray2 = local6.anObjectArray26;
										Static328.aClass14_38.method205(local515);
									} else {
										label606: for (local296 = local6.anInt2629; local296 < Static210.anInt7228; local296++) {
											local670 = Static305.anIntArray380[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray207.length; local430++) {
												if (local6.anIntArray207[local430] == local670) {
													local1483 = new Class1_Sub11();
													local1483.aClass107_2 = local6;
													local1483.anObjectArray2 = local6.anObjectArray26;
													Static328.aClass14_38.method205(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2629 = Static210.anInt7228;
								}
								if (local6.anObjectArray32 != null && Static50.anInt722 > local6.anInt2579) {
									if (local6.anIntArray206 == null || Static50.anInt722 - local6.anInt2579 > 32) {
										local515 = new Class1_Sub11();
										local515.aClass107_2 = local6;
										local515.anObjectArray2 = local6.anObjectArray32;
										Static328.aClass14_38.method205(local515);
									} else {
										label582: for (local296 = local6.anInt2579; local296 < Static50.anInt722; local296++) {
											local670 = Static395.anIntArray463[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray206.length; local430++) {
												if (local6.anIntArray206[local430] == local670) {
													local1483 = new Class1_Sub11();
													local1483.aClass107_2 = local6;
													local1483.anObjectArray2 = local6.anObjectArray32;
													Static328.aClass14_38.method205(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt2579 = Static50.anInt722;
								}
								if (Static307.anInt5109 > local6.anInt2620 && local6.anObjectArray13 != null) {
									local515 = new Class1_Sub11();
									local515.aClass107_2 = local6;
									local515.anObjectArray2 = local6.anObjectArray13;
									Static328.aClass14_38.method205(local515);
								}
								if (Static75.anInt1071 > local6.anInt2620 && local6.anObjectArray6 != null) {
									local515 = new Class1_Sub11();
									local515.aClass107_2 = local6;
									local515.anObjectArray2 = local6.anObjectArray6;
									Static328.aClass14_38.method205(local515);
								}
								if (Static386.anInt7154 > local6.anInt2620 && local6.anObjectArray21 != null) {
									local515 = new Class1_Sub11();
									local515.aClass107_2 = local6;
									local515.anObjectArray2 = local6.anObjectArray21;
									Static328.aClass14_38.method205(local515);
								}
								if (Static374.anInt6020 > local6.anInt2620 && local6.anObjectArray9 != null) {
									local515 = new Class1_Sub11();
									local515.aClass107_2 = local6;
									local515.anObjectArray2 = local6.anObjectArray9;
									Static328.aClass14_38.method205(local515);
								}
								if (Static356.anInt5794 > local6.anInt2620 && local6.anObjectArray29 != null) {
									local515 = new Class1_Sub11();
									local515.aClass107_2 = local6;
									local515.anObjectArray2 = local6.anObjectArray29;
									Static328.aClass14_38.method205(local515);
								}
								local6.anInt2620 = Static163.anInt5780;
								if (local6.anObjectArray4 != null) {
									for (local296 = 0; local296 < Static141.anInt6097; local296++) {
										@Pc(1951) Class1_Sub11 local1951 = new Class1_Sub11();
										local1951.aClass107_2 = local6;
										local1951.anInt1178 = Static340.anInterface13Array1[local296].method4455();
										local1951.anInt1185 = Static340.anInterface13Array1[local296].method4458();
										local1951.anObjectArray2 = local6.anObjectArray4;
										Static328.aClass14_38.method205(local1951);
									}
								}
								if (Static420.aBoolean588 && local6.anObjectArray27 != null) {
									local515 = new Class1_Sub11();
									local515.aClass107_2 = local6;
									local515.anObjectArray2 = local6.anObjectArray27;
									Static328.aClass14_38.method205(local515);
								}
							}
							if (local6.anInt2598 == 5 && local6.anInt2632 != -1) {
								local6.method2110(Static202.aClass237_27, Static429.aClass126_1).method4173(Static186.aClass117_3, local6.anInt2606);
							}
							Static106.method5957(local6);
							if (local6.anInt2598 == 0) {
								method753(arg0, local6.anInt2660, local28, local30, local32, local34, local17 - local6.anInt2663, local22 - local6.anInt2646, arg8, arg9);
								if (local6.aClass107Array2 != null) {
									method753(local6.aClass107Array2, local6.anInt2660, local28, local30, local32, local34, local17 - local6.anInt2663, local22 - local6.anInt2646, arg8, arg9);
								}
								@Pc(2073) Class1_Sub37 local2073 = (Class1_Sub37) Static462.aClass208_42.method4405((long) local6.anInt2660);
								if (local2073 != null) {
									if (Static94.aClass148_3 == Static59.aClass148_1 && local2073.anInt5479 == 0 && !Static170.aBoolean282 && local204 && !Static312.aBoolean465) {
										Static447.method5754();
									}
									Static401.method5189(arg8, local34, local32, local28, arg9, local17, local30, local22, local2073.anInt5481);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static106.method5957(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(II)Lclient!hm;")
	public static Class107 method754(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static45.aClass107ArrayArray1[local7] == null || Static45.aClass107ArrayArray1[local7][local11] == null) {
			@Pc(30) boolean local30 = Static95.method5202(local7);
			if (!local30) {
				return null;
			}
		}
		return Static45.aClass107ArrayArray1[local7][local11];
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method757() {
		for (@Pc(1) int local1 = 0; local1 < Static147.anInt2300; local1++) {
			@Pc(6) int[] local6 = Static462.anIntArrayArray59[local1];
			for (@Pc(8) int local8 = 0; local8 < Static293.anInt4886; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
	public static void method760(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static103.anInt6434;
		@Pc(3) int[] local3 = Static56.anIntArray110;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static137.anInt2142; local5++) {
			@Pc(15) Class11_Sub1_Sub3 local15;
			if (local5 < local1) {
				local15 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) Static135.anIntArray183[local5 - local1])).aClass11_Sub1_Sub3_Sub1_2;
			}
			if (local15.aByte90 == arg0 && local15.anInt3284 >= 0) {
				@Pc(39) int local39 = local15.method2635();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt6428 & 0x7F) != 0 || (local15.anInt6430 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6428 & 0x7F) != 64 || (local15.anInt6430 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt6428 >> 7;
					local80 = local15.anInt6430 >> 7;
					if (local15.anInt3284 > Static462.anIntArrayArray59[local75][local80]) {
						Static462.anIntArrayArray59[local75][local80] = local15.anInt3284;
						Static180.anIntArrayArray23[local75][local80] = 1;
					} else if (local15.anInt3284 == Static462.anIntArrayArray59[local75][local80]) {
						local116 = Static180.anIntArrayArray23[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt6428 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt6430 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt6428 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt6430 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt3284 > Static462.anIntArrayArray59[local158][local161]) {
								Static462.anIntArrayArray59[local158][local161] = local15.anInt3284;
								Static180.anIntArrayArray23[local158][local161] = 1;
							} else if (local15.anInt3284 == Static462.anIntArrayArray59[local158][local161]) {
								local116 = Static180.anIntArrayArray23[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method762() {
		@Pc(1) int local1 = Static103.anInt6434;
		@Pc(3) int[] local3 = Static56.anIntArray110;
		@Pc(20) boolean local20 = Static126.aClass19_Sub1_1.anInt4237 == 1 && local1 > 200 || Static126.aClass19_Sub1_1.anInt4237 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class11_Sub1_Sub3_Sub2 local29 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local3[local22]];
			if (local29.method2647()) {
				local29.method5185();
				if (local29.aShort103 >= 0 && local29.aShort101 >= 0 && local29.aShort100 < Static147.anInt2300 && local29.aShort102 < Static293.anInt4886) {
					local29.aBoolean326 = local29.aBoolean322 ? local20 : false;
					if (local29 == Static94.aClass11_Sub1_Sub3_Sub2_1) {
						local29.anInt3284 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean324) {
							local75++;
						}
						if (local29.anInt3309 > Static98.anInt1304) {
							local75 += 2;
						}
						local75 += 5 - local29.method2635() << 2;
						if (local29.aBoolean328) {
							local75 += 512;
						} else {
							if (Static167.anInt2741 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt3284 = local75 + 1;
					}
				} else {
					local29.anInt3284 = -1;
				}
			} else {
				local29.anInt3284 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static137.anInt2142; local116++) {
			@Pc(127) Class11_Sub1_Sub3_Sub1 local127 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) Static135.anIntArray183[local116])).aClass11_Sub1_Sub3_Sub1_2;
			if (local127.method1300() && local127.aClass272_1.method5909(Static32.aClass4_1)) {
				local127.method5185();
				if (local127.aShort103 >= 0 && local127.aShort101 >= 0 && local127.aShort100 < Static147.anInt2300 && local127.aShort102 < Static293.anInt4886) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean324) {
						local164++;
					}
					if (local127.anInt3309 > Static98.anInt1304) {
						local164 += 2;
					}
					local164 += 5 - local127.method2635() << 2;
					if (Static167.anInt2741 == 0) {
						if (local127.aClass272_1.aBoolean636) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static167.anInt2741 == 1) {
						if (local127.aClass272_1.aBoolean636) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass272_1.aBoolean633) {
						local164 += 1024;
					} else if (!local127.aClass272_1.aBoolean635) {
						local164 += 256;
					}
					local127.anInt3284 = local164 + 1;
				} else {
					local127.anInt3284 = -1;
				}
			} else {
				local127.anInt3284 = -1;
			}
		}
		for (local75 = 0; local75 < Static13.aClass78Array1.length; local75++) {
			@Pc(230) Class78 local230 = Static13.aClass78Array1[local75];
			if (local230 != null) {
				if (local230.anInt1697 == 1) {
					@Pc(244) Class1_Sub44 local244 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local230.anInt1704);
					if (local244 != null) {
						@Pc(249) Class11_Sub1_Sub3_Sub1 local249 = local244.aClass11_Sub1_Sub3_Sub1_2;
						if (local249.anInt3284 >= 0) {
							local249.anInt3284 += 2048;
						}
					}
				} else if (local230.anInt1697 == 10) {
					@Pc(268) Class11_Sub1_Sub3_Sub2 local268 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local230.anInt1704];
					if (local268 != null && local268 != Static94.aClass11_Sub1_Sub3_Sub2_1 && local268.anInt3284 >= 0) {
						local268.anInt3284 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!hm;)Z")
	public static boolean method764(@OriginalArg(0) Class107 arg0) {
		if (Static312.aBoolean465) {
			if (method767(arg0).anInt3891 != 0) {
				return false;
			}
			if (arg0.anInt2598 == 0) {
				return false;
			}
		}
		return arg0.aBoolean267;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IILclient!ta;Lclient!za;IILclient!hm;II)V")
	public static void method765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class73 arg2, @OriginalArg(3) Class117 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class107 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) Class128 local14 = Static205.aClass36_2.method659(arg4);
		if (local14 == null || !local14.aBoolean339 || !local14.method2737(Static32.aClass4_1)) {
			return;
		}
		@Pc(34) int local34;
		if (local14.anIntArray259 != null) {
			@Pc(32) int[] local32 = new int[local14.anIntArray259.length];
			@Pc(44) int local44;
			for (local34 = 0; local34 < local32.length / 2; local34++) {
				if (Static139.anInt2147 == 4) {
					local44 = (int) Static99.aFloat9 & 0x3FFF;
				} else {
					local44 = (int) Static99.aFloat9 + Static20.anInt301 & 0x3FFF;
				}
				@Pc(57) int local57 = Class1_Sub29.anIntArray537[local44];
				@Pc(61) int local61 = Class1_Sub29.anIntArray536[local44];
				if (Static139.anInt2147 != 4) {
					local61 = local61 * 256 / (Static265.anInt4616 + 256);
					local57 = local57 * 256 / (Static265.anInt4616 + 256);
				}
				local32[local34 * 2] = arg6 + arg5.anInt2648 / 2 + (local57 * (local14.anIntArray259[local34 * 2 + 1] * 4 + arg1) + (arg0 - -(local14.anIntArray259[local34 * 2] * 4)) * local61 >> 15);
				local32[local34 * 2 + 1] = arg5.anInt2606 / 2 + arg7 - (-((arg0 - -(local14.anIntArray259[local34 * 2] * 4)) * local57) + local61 * (arg1 + local14.anIntArray259[local34 * 2 + 1] * 4) >> 15);
			}
			Static16.method281(arg3, local32, local14.anInt3491, arg5.anIntArray210, arg5.anIntArray209);
			for (local44 = 0; local44 < local32.length / 2 - 1; local44++) {
				arg3.method5676(local32[local44 * 2], local32[local44 * 2 + 1], local32[(local44 + 1) * 2], local32[local44 * 2 + 2 + 1], local14.anInt3471, arg2, arg6, arg7);
			}
			arg3.method5676(local32[local32.length - 2], local32[local32.length - 1], local32[0], local32[1], local14.anInt3471, arg2, arg6, arg7);
		}
		@Pc(269) Class85 local269 = null;
		if (local14.anInt3486 != -1) {
			local269 = local14.method2738(false, arg3);
			if (local269 != null) {
				Static72.method928(arg0, arg5, arg6, arg2, local269, arg7, arg1);
			}
		}
		if (local14.aString36 == null) {
			return;
		}
		local34 = 0;
		if (local269 != null) {
			local34 = local269.ZA();
		}
		@Pc(303) Class137 local303 = Static300.aClass137_7;
		@Pc(305) Class252 local305 = Static106.aClass252_140;
		if (local14.anInt3493 == 1) {
			local305 = Static392.aClass252_121;
			local303 = Static464.aClass137_8;
		}
		if (local14.anInt3493 == 2) {
			local303 = Static17.aClass137_5;
			local305 = Static15.aClass252_5;
		}
		Static169.method4132(arg0, arg5, local305, arg2, arg6, local34, arg1, local14.aString36, arg7, local14.anInt3492, local303);
		return;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method766() {
		@Pc(1) int local1 = Static103.anInt6434;
		@Pc(3) int[] local3 = Static56.anIntArray110;
		@Pc(11) int local11 = Static164.aBoolean572 ? local1 : local1 + Static137.anInt2142;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class11_Sub1_Sub3 local23;
			if (local13 < local1) {
				local23 = Static399.aClass11_Sub1_Sub3_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) Static135.anIntArray183[local13 - local1])).aClass11_Sub1_Sub3_Sub1_2;
			}
			if (local23.anInt3284 >= 0) {
				@Pc(43) int local43 = local23.method2635();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt6428 & 0x7F) == 0 && (local23.anInt6430 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6428 & 0x7F) == 64 && (local23.anInt6430 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class11_Sub1_Sub3_Sub2 && local23.aClass1_Sub24_3 != null && Static98.anInt1304 >= local23.aClass1_Sub24_3.anInt3674 && Static98.anInt1304 < local23.aClass1_Sub24_3.anInt3675) {
					((Class11_Sub1_Sub3_Sub2) local23).aBoolean326 = false;
				}
				local23.anInt6437 = Static135.method1732(local23.anInt6428, local23.anInt6430, local23.aByte90);
				Static95.method5201(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!hm;)Lclient!kb;")
	public static Class1_Sub27 method767(@OriginalArg(0) Class107 arg0) {
		@Pc(13) Class1_Sub27 local13 = (Class1_Sub27) Static204.aClass208_22.method4405(((long) arg0.anInt2660 << 32) + (long) arg0.anInt2643);
		return local13 == null ? arg0.aClass1_Sub27_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method768() {
		Static87.anInt1184 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static137.anInt2142; local3++) {
			@Pc(14) Class11_Sub1_Sub3_Sub1 local14 = ((Class1_Sub44) Static46.aClass208_33.method4405((long) Static135.anIntArray183[local3])).aClass11_Sub1_Sub3_Sub1_2;
			if (local14.aBoolean324 && local14.method2636() != -1) {
				@Pc(32) int local32 = (local14.method2635() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt6428 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt6430 - local32 >> 7;
				@Pc(53) Class11_Sub1_Sub3 local53 = Static149.method1878(local14.aByte90, local39, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt3279;
					if (local53 instanceof Class11_Sub1_Sub3_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt3312 == 0 && local53.method2636() != -1) {
						Static407.anIntArray470[Static87.anInt1184] = local58;
						Static92.anIntArray309[Static87.anInt1184] = local58;
						Static87.anInt1184++;
						local53.anInt3312++;
					}
					Static407.anIntArray470[Static87.anInt1184] = local58;
					Static92.anIntArray309[Static87.anInt1184] = local14.anInt3279 + 2048;
					Static87.anInt1184++;
					local53.anInt3312++;
				}
			}
		}
		Static363.method4764(Static92.anIntArray309, 0, Static87.anInt1184 - 1, Static407.anIntArray470);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(CB)Z")
	public static boolean method769(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!hm;)Lclient!hm;")
	public static Class107 method771(@OriginalArg(0) Class107 arg0) {
		@Pc(4) int local4 = method767(arg0).method3032();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = method754(arg0.anInt2624);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
