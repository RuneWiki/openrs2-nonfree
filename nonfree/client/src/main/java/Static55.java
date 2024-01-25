import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!client", name = "S", descriptor = "I")
	public static int anInt1493 = 0;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[I")
	public static final int[] anIntArray93 = new int[14];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!jb;)Lclient!jb;")
	public static Class126 method1115(@OriginalArg(0) Class126 arg0) {
		@Pc(4) int local4 = method1118(arg0).method4446();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static53.method1056(arg0.anInt3405);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!jb;IIIIIIIII)V")
	public static void method1117(@OriginalArg(0) Class126[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class126 local6 = arg0[local1];
			if (local6 != null && local6.anInt3405 == arg1) {
				@Pc(17) int local17 = local6.anInt3406 + arg6;
				@Pc(22) int local22 = local6.anInt3415 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt3426 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt3421;
					@Pc(45) int local45 = local22 + local6.anInt3442;
					if (local6.anInt3426 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt3426 == 0 || local6.aBoolean248 || method1118(local6).anInt5771 != 0 || local6 == Static171.aClass126_6 || local6.anInt3434 == Static73.anInt1748) {
					if (!method1119(local6)) {
						if (local6 == Static15.aClass126_1) {
							Static41.aBoolean55 = true;
							Static20.anInt1992 = local17;
							Static150.anInt2845 = local22;
						}
						if (local6.aBoolean245 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean253 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class4_Sub40 local148 = (Class4_Sub40) Static447.aClass258_49.method5538(); local148 != null; local148 = (Class4_Sub40) Static447.aClass258_49.method5528()) {
									if (local148.aBoolean456) {
										local148.method5854();
										local148.aClass126_16.aBoolean250 = false;
									}
								}
								if (Static49.anInt1345 == 0) {
									Static15.aClass126_1 = null;
									Static171.aClass126_6 = null;
								}
								Static200.anInt3846 = 0;
								Static78.aBoolean122 = false;
								Static348.aBoolean431 = false;
								if (!Static346.aBoolean427) {
									Static158.method2336();
								}
							}
							@Pc(204) boolean local204;
							if (Static284.aClass12_1.method4220() >= local28 && Static284.aClass12_1.method4219() >= local30 && Static284.aClass12_1.method4220() < local32 && Static284.aClass12_1.method4219() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static222.aBoolean305 && local204) {
								if (local6.anInt3457 >= 0) {
									Static52.anInt1389 = local6.anInt3457;
								} else if (local6.aBoolean253) {
									Static52.anInt1389 = -1;
								}
							}
							if (!Static346.aBoolean427 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static105.method1660(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(248) boolean local248 = false;
							if (Static284.aClass12_1.method4210() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class4_Sub10 local263 = (Class4_Sub10) Static157.aClass258_24.method5538();
							if (local263 != null && local263.method1653() == 0 && local263.method1648() >= local28 && local263.method1652() >= local30 && local263.method1648() < local32 && local263.method1652() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray36 != null) {
								for (local296 = 0; local296 < local6.aByteArray36.length; local296++) {
									if (Static23.aClass14_1.method1510(local6.aByteArray36[local296])) {
										if (local6.anIntArray284 == null || Static175.anInt3261 >= local6.anIntArray284[local296]) {
											@Pc(328) byte local328 = local6.aByteArray35[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static23.aClass14_1.method1510(86) && !Static23.aClass14_1.method1510(82) && !Static23.aClass14_1.method1510(81)) && ((local328 & 0x2) == 0 || Static23.aClass14_1.method1510(86)) && ((local328 & 0x1) == 0 || Static23.aClass14_1.method1510(82)) && ((local328 & 0x4) == 0 || Static23.aClass14_1.method1510(81))) {
												if (local296 < 10) {
													Static346.method4897(-1, local296 + 1, local6.anInt3397, "");
												} else if (local296 == 10) {
													Static1.method29();
													@Pc(399) Class4_Sub34 local399 = method1118(local6);
													Static409.method5390(local399.method4447(), local399.anInt5773, local6);
													Static279.aString50 = Static169.method2490(local6);
													if (Static279.aString50 == null) {
														Static279.aString50 = "Null";
													}
													Static178.aString37 = local6.aString38 + "<col=ffffff>";
												}
												local430 = local6.anIntArray281[local296];
												if (local6.anIntArray284 == null) {
													local6.anIntArray284 = new int[local6.aByteArray36.length];
												}
												if (local430 == 0) {
													local6.anIntArray284[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray284[local296] = Static175.anInt3261 + local430;
												}
											}
										}
									} else if (local6.anIntArray284 != null) {
										local6.anIntArray284[local296] = 0;
									}
								}
							}
							if (local258) {
								Static292.method4054(local263.method1652() - local22, local263.method1648() - local17, local6);
							}
							if (Static15.aClass126_1 != null && Static15.aClass126_1 != local6 && local204 && method1118(local6).method4444()) {
								Static218.aClass126_11 = local6;
							}
							if (local6 == Static171.aClass126_6) {
								Static343.aBoolean424 = true;
								Static286.anInt5206 = local17;
								Static224.anInt4138 = local22;
							}
							if (local6.aBoolean248 || local6.anInt3434 != 0) {
								@Pc(515) Class4_Sub40 local515;
								if (local204 && Static430.anInt7165 != 0 && local6.anObjectArray24 != null) {
									local515 = new Class4_Sub40();
									local515.aBoolean456 = true;
									local515.aClass126_16 = local6;
									local515.anInt6874 = Static430.anInt7165;
									local515.anObjectArray35 = local6.anObjectArray24;
									Static447.aClass258_49.method5526(local515);
								}
								if (Static15.aClass126_1 != null || Static346.aBoolean427 || local6.anInt3434 != Static150.anInt2842 && Static200.anInt3846 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt3434 != 0) {
									if (local6.anInt3434 == Static30.anInt695 || local6.anInt3434 == Static12.anInt385) {
										Static310.aClass126_13 = local6;
										if (Static132.aClass129_1 != null) {
											Static132.aClass129_1.method2794(local6.anInt3442, Static16.aClass30_11);
										}
										if (local6.anInt3434 == Static30.anInt695) {
											if (!Static346.aBoolean427 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static420.method5855(arg8, arg9, Static16.aClass30_11);
												for (@Pc(598) Class41_Sub5 local598 = (Class41_Sub5) Static391.aClass27_8.method730(); local598 != null; local598 = (Class41_Sub5) Static391.aClass27_8.method735()) {
													if (arg8 >= local598.anInt5446 && arg8 < local598.anInt5450 && arg9 >= local598.anInt5451 && arg9 < local598.anInt5447) {
														Static158.method2336();
														Static26.method531(local598.aClass6_Sub2_Sub1_1);
													}
												}
											}
											Static253.method3465(local17, local22, local6);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt3434 == Static73.anInt1748) {
										if (local6.method2671(Static16.aClass30_11) == null || Static421.anInt7104 != 0 && Static421.anInt7104 != 3 || Static346.aBoolean427 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray282[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray285[local670]) {
											continue;
										}
										local296 -= local6.anInt3421 / 2;
										local670 -= local6.anInt3442 / 2;
										if (Static134.anInt2621 == 4) {
											local709 = (int) Static146.aFloat82 & 0x3FFF;
										} else {
											local709 = (int) Static146.aFloat82 + Static94.anInt2046 & 0x3FFF;
										}
										@Pc(721) int local721 = Class56.anIntArray119[local709];
										@Pc(725) int local725 = Class56.anIntArray120[local709];
										if (Static134.anInt2621 != 4) {
											local721 = local721 * (Static109.anInt6939 + 256) >> 8;
											local725 = local725 * (Static109.anInt6939 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static134.anInt2621 == 4) {
											local775 = (Static207.anInt3914 >> 7) + (local754 >> 2);
											local783 = (Static110.anInt2331 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static375.aClass6_Sub2_Sub1_Sub1_3.method4763() - 1) * 64;
											local775 = (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6062 - local792 >> 7) + (local754 >> 2);
											local783 = (Static375.aClass6_Sub2_Sub1_Sub1_3.anInt6061 - local792 >> 7) - (local764 >> 2);
										}
										if (Static222.aBoolean305 && (Static234.anInt4263 & 0x40) != 0) {
											@Pc(825) Class126 local825 = Static299.method4154(Static8.anInt336, Static14.anInt5474);
											if (local825 == null) {
												Static1.method29();
											} else {
												Static191.method2806(local775, 1L, false, Static195.anInt2838, true, Static279.aString50, " ->", local783, local6.anInt3395, 58);
											}
											continue;
										}
										if (Static441.aClass95_5 == Static128.aClass95_1) {
											Static191.method2806(local775, 1L, false, -1, true, Static249.aClass242_62.method5320(Static139.anInt2670), "", local783, -1, 20);
										}
										Static191.method2806(local775, 1L, false, Static138.anInt2663, true, Static119.aString22, "", local783, -1, 48);
										continue;
									}
									if (local6.anInt3434 == Static150.anInt2842) {
										Static124.aClass126_5 = local6;
										if (local204) {
											Static78.aBoolean122 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method1648() - local17 - local6.anInt3421 / 2) * 2.0D / (double) Static137.aFloat153);
											local670 = (int) -((double) (local263.method1652() - local22 - local6.anInt3442 / 2) * 2.0D / (double) Static137.aFloat153);
											local430 = Static348.anInt6296 + local296 + Static137.anInt5581;
											local709 = Static4.anInt162 + local670 + Static137.anInt5584;
											@Pc(939) Class4_Sub1_Sub16 local939 = Static181.method2911();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method4922(local430, local709, local944);
											if (local944 != null) {
												if (Static23.aClass14_1.method1510(82) && Static189.anInt3643 > 0) {
													Static215.method5518(local944[0], local944[2], local944[1]);
													continue;
												}
												Static348.aBoolean431 = true;
												Static144.anInt2719 = local944[0];
												Static226.anInt745 = local944[1];
												Static388.anInt6739 = local944[2];
											}
											Static200.anInt3846 = 1;
											Static292.aBoolean360 = false;
											Static31.anInt729 = Static284.aClass12_1.method4220();
											Static383.anInt6698 = Static284.aClass12_1.method4219();
											continue;
										}
										if (local248 && Static200.anInt3846 > 0) {
											if (Static200.anInt3846 == 1 && (Static31.anInt729 != Static284.aClass12_1.method4220() || Static383.anInt6698 != Static284.aClass12_1.method4219())) {
												Static189.anInt3632 = Static348.anInt6296;
												Static359.anInt6427 = Static4.anInt162;
												Static200.anInt3846 = 2;
											}
											if (Static200.anInt3846 == 2) {
												Static292.aBoolean360 = true;
												Static79.method1391(Static189.anInt3632 + (int) ((double) (Static31.anInt729 - Static284.aClass12_1.method4220()) * 2.0D / (double) Static137.aFloat154));
												Static74.method1344(Static359.anInt6427 - (int) ((double) (Static383.anInt6698 - Static284.aClass12_1.method4219()) * 2.0D / (double) Static137.aFloat154));
											}
											continue;
										}
										if (Static200.anInt3846 > 0 && !Static292.aBoolean360) {
											if ((Static424.anInt7121 == 1 || Static270.method3651()) && Static83.anInt1893 > 2) {
												Static301.method4176(Static383.anInt6698, Static31.anInt729);
											} else if (Static20.method1516()) {
												Static301.method4176(Static383.anInt6698, Static31.anInt729);
											}
										}
										Static200.anInt3846 = 0;
										continue;
									}
									if (local6.anInt3434 == Static245.anInt4488) {
										if (local248) {
											Static326.method2431(Static284.aClass12_1.method4219() - local22, local6.anInt3442, local6.anInt3421, Static284.aClass12_1.method4220() - local17);
										}
										continue;
									}
									if (local6.anInt3434 == Static53.anInt1392) {
										Static95.method1553(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean257 && local258) {
									local6.aBoolean257 = true;
									if (local6.anObjectArray29 != null) {
										local515 = new Class4_Sub40();
										local515.aBoolean456 = true;
										local515.aClass126_16 = local6;
										local515.anInt6868 = local263.method1648() - local17;
										local515.anInt6874 = local263.method1652() - local22;
										local515.anObjectArray35 = local6.anObjectArray29;
										Static447.aClass258_49.method5526(local515);
									}
								}
								if (local6.aBoolean257 && local248 && local6.anObjectArray15 != null) {
									local515 = new Class4_Sub40();
									local515.aBoolean456 = true;
									local515.aClass126_16 = local6;
									local515.anInt6868 = Static284.aClass12_1.method4220() - local17;
									local515.anInt6874 = Static284.aClass12_1.method4219() - local22;
									local515.anObjectArray35 = local6.anObjectArray15;
									Static447.aClass258_49.method5526(local515);
								}
								if (local6.aBoolean257 && !local248) {
									local6.aBoolean257 = false;
									if (local6.anObjectArray30 != null) {
										local515 = new Class4_Sub40();
										local515.aBoolean456 = true;
										local515.aClass126_16 = local6;
										local515.anInt6868 = Static284.aClass12_1.method4220() - local17;
										local515.anInt6874 = Static284.aClass12_1.method4219() - local22;
										local515.anObjectArray35 = local6.anObjectArray30;
										Static332.aClass258_40.method5526(local515);
									}
								}
								if (local248 && local6.anObjectArray26 != null) {
									local515 = new Class4_Sub40();
									local515.aBoolean456 = true;
									local515.aClass126_16 = local6;
									local515.anInt6868 = Static284.aClass12_1.method4220() - local17;
									local515.anInt6874 = Static284.aClass12_1.method4219() - local22;
									local515.anObjectArray35 = local6.anObjectArray26;
									Static447.aClass258_49.method5526(local515);
								}
								if (!local6.aBoolean250 && local204) {
									local6.aBoolean250 = true;
									if (local6.anObjectArray22 != null) {
										local515 = new Class4_Sub40();
										local515.aBoolean456 = true;
										local515.aClass126_16 = local6;
										local515.anInt6868 = Static284.aClass12_1.method4220() - local17;
										local515.anInt6874 = Static284.aClass12_1.method4219() - local22;
										local515.anObjectArray35 = local6.anObjectArray22;
										Static447.aClass258_49.method5526(local515);
									}
								}
								if (local6.aBoolean250 && local204 && local6.anObjectArray3 != null) {
									local515 = new Class4_Sub40();
									local515.aBoolean456 = true;
									local515.aClass126_16 = local6;
									local515.anInt6868 = Static284.aClass12_1.method4220() - local17;
									local515.anInt6874 = Static284.aClass12_1.method4219() - local22;
									local515.anObjectArray35 = local6.anObjectArray3;
									Static447.aClass258_49.method5526(local515);
								}
								if (local6.aBoolean250 && !local204) {
									local6.aBoolean250 = false;
									if (local6.anObjectArray10 != null) {
										local515 = new Class4_Sub40();
										local515.aBoolean456 = true;
										local515.aClass126_16 = local6;
										local515.anInt6868 = Static284.aClass12_1.method4220() - local17;
										local515.anInt6874 = Static284.aClass12_1.method4219() - local22;
										local515.anObjectArray35 = local6.anObjectArray10;
										Static332.aClass258_40.method5526(local515);
									}
								}
								if (local6.anObjectArray27 != null) {
									local515 = new Class4_Sub40();
									local515.aClass126_16 = local6;
									local515.anObjectArray35 = local6.anObjectArray27;
									Static362.aClass258_44.method5526(local515);
								}
								@Pc(1483) Class4_Sub40 local1483;
								if (local6.anObjectArray8 != null && Static138.anInt2666 > local6.anInt3430) {
									if (local6.anIntArray286 == null || Static138.anInt2666 - local6.anInt3430 > 32) {
										local515 = new Class4_Sub40();
										local515.aClass126_16 = local6;
										local515.anObjectArray35 = local6.anObjectArray8;
										Static447.aClass258_49.method5526(local515);
									} else {
										label678: for (local296 = local6.anInt3430; local296 < Static138.anInt2666; local296++) {
											local670 = Static298.anIntArray465[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray286.length; local430++) {
												if (local6.anIntArray286[local430] == local670) {
													local1483 = new Class4_Sub40();
													local1483.aClass126_16 = local6;
													local1483.anObjectArray35 = local6.anObjectArray8;
													Static447.aClass258_49.method5526(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt3430 = Static138.anInt2666;
								}
								if (local6.lb != null && Static22.anInt6851 > local6.anInt3449) {
									if (local6.anIntArray283 == null || Static22.anInt6851 - local6.anInt3449 > 32) {
										local515 = new Class4_Sub40();
										local515.aClass126_16 = local6;
										local515.anObjectArray35 = local6.lb;
										Static447.aClass258_49.method5526(local515);
									} else {
										label654: for (local296 = local6.anInt3449; local296 < Static22.anInt6851; local296++) {
											local670 = Static1.anIntArray1[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray283.length; local430++) {
												if (local6.anIntArray283[local430] == local670) {
													local1483 = new Class4_Sub40();
													local1483.aClass126_16 = local6;
													local1483.anObjectArray35 = local6.lb;
													Static447.aClass258_49.method5526(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt3449 = Static22.anInt6851;
								}
								if (local6.anObjectArray23 != null && Static124.anInt2537 > local6.anInt3438) {
									if (local6.anIntArray287 == null || Static124.anInt2537 - local6.anInt3438 > 32) {
										local515 = new Class4_Sub40();
										local515.aClass126_16 = local6;
										local515.anObjectArray35 = local6.anObjectArray23;
										Static447.aClass258_49.method5526(local515);
									} else {
										label630: for (local296 = local6.anInt3438; local296 < Static124.anInt2537; local296++) {
											local670 = Static278.anIntArray641[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray287.length; local430++) {
												if (local6.anIntArray287[local430] == local670) {
													local1483 = new Class4_Sub40();
													local1483.aClass126_16 = local6;
													local1483.anObjectArray35 = local6.anObjectArray23;
													Static447.aClass258_49.method5526(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt3438 = Static124.anInt2537;
								}
								if (local6.anObjectArray12 != null && Static138.anInt2664 > local6.anInt3451) {
									if (local6.anIntArray280 == null || Static138.anInt2664 - local6.anInt3451 > 32) {
										local515 = new Class4_Sub40();
										local515.aClass126_16 = local6;
										local515.anObjectArray35 = local6.anObjectArray12;
										Static447.aClass258_49.method5526(local515);
									} else {
										label606: for (local296 = local6.anInt3451; local296 < Static138.anInt2664; local296++) {
											local670 = Static93.anIntArray126[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray280.length; local430++) {
												if (local6.anIntArray280[local430] == local670) {
													local1483 = new Class4_Sub40();
													local1483.aClass126_16 = local6;
													local1483.anObjectArray35 = local6.anObjectArray12;
													Static447.aClass258_49.method5526(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt3451 = Static138.anInt2664;
								}
								if (local6.anObjectArray19 != null && Static69.anInt1700 > local6.anInt3467) {
									if (local6.anIntArray288 == null || Static69.anInt1700 - local6.anInt3467 > 32) {
										local515 = new Class4_Sub40();
										local515.aClass126_16 = local6;
										local515.anObjectArray35 = local6.anObjectArray19;
										Static447.aClass258_49.method5526(local515);
									} else {
										label582: for (local296 = local6.anInt3467; local296 < Static69.anInt1700; local296++) {
											local670 = Static210.anIntArray325[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray288.length; local430++) {
												if (local6.anIntArray288[local430] == local670) {
													local1483 = new Class4_Sub40();
													local1483.aClass126_16 = local6;
													local1483.anObjectArray35 = local6.anObjectArray19;
													Static447.aClass258_49.method5526(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt3467 = Static69.anInt1700;
								}
								if (Static207.anInt3915 > local6.anInt3425 && local6.anObjectArray11 != null) {
									local515 = new Class4_Sub40();
									local515.aClass126_16 = local6;
									local515.anObjectArray35 = local6.anObjectArray11;
									Static447.aClass258_49.method5526(local515);
								}
								if (Static35.anInt830 > local6.anInt3425 && local6.anObjectArray18 != null) {
									local515 = new Class4_Sub40();
									local515.aClass126_16 = local6;
									local515.anObjectArray35 = local6.anObjectArray18;
									Static447.aClass258_49.method5526(local515);
								}
								if (Static359.anInt6422 > local6.anInt3425 && local6.anObjectArray9 != null) {
									local515 = new Class4_Sub40();
									local515.aClass126_16 = local6;
									local515.anObjectArray35 = local6.anObjectArray9;
									Static447.aClass258_49.method5526(local515);
								}
								if (Static162.anInt6354 > local6.anInt3425 && local6.anObjectArray5 != null) {
									local515 = new Class4_Sub40();
									local515.aClass126_16 = local6;
									local515.anObjectArray35 = local6.anObjectArray5;
									Static447.aClass258_49.method5526(local515);
								}
								if (Static41.anInt1028 > local6.anInt3425 && local6.anObjectArray4 != null) {
									local515 = new Class4_Sub40();
									local515.aClass126_16 = local6;
									local515.anObjectArray35 = local6.anObjectArray4;
									Static447.aClass258_49.method5526(local515);
								}
								local6.anInt3425 = Static190.anInt3670;
								if (local6.anObjectArray13 != null) {
									for (local296 = 0; local296 < Static83.anInt1892; local296++) {
										@Pc(1951) Class4_Sub40 local1951 = new Class4_Sub40();
										local1951.aClass126_16 = local6;
										local1951.anInt6875 = Static344.aClass150Array1[local296].method3231();
										local1951.anInt6871 = Static344.aClass150Array1[local296].method3230();
										local1951.anObjectArray35 = local6.anObjectArray13;
										Static447.aClass258_49.method5526(local1951);
									}
								}
								if (Static79.aBoolean123 && local6.anObjectArray17 != null) {
									local515 = new Class4_Sub40();
									local515.aClass126_16 = local6;
									local515.anObjectArray35 = local6.anObjectArray17;
									Static447.aClass258_49.method5526(local515);
								}
							}
							if (local6.anInt3426 == 5 && local6.anInt3464 != -1) {
								local6.method2679(Static447.aClass78_1, Static316.aClass88_4).method2794(local6.anInt3442, Static16.aClass30_11);
							}
							Static381.method5202(local6);
							if (local6.anInt3426 == 0) {
								method1117(arg0, local6.anInt3397, local28, local30, local32, local34, local17 - local6.anInt3458, local22 - local6.anInt3444, arg8, arg9);
								if (local6.aClass126Array3 != null) {
									method1117(local6.aClass126Array3, local6.anInt3397, local28, local30, local32, local34, local17 - local6.anInt3458, local22 - local6.anInt3444, arg8, arg9);
								}
								@Pc(2073) Class4_Sub4 local2073 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local6.anInt3397);
								if (local2073 != null) {
									if (Static441.aClass95_5 == Static162.aClass95_7 && local2073.anInt574 == 0 && !Static346.aBoolean427 && local204 && !Static197.aBoolean436) {
										Static158.method2336();
									}
									Static423.method4747(arg8, local17, local22, local2073.anInt573, arg9, local34, local32, local30, local28);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static381.method5202(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!jb;)Lclient!qj;")
	public static Class4_Sub34 method1118(@OriginalArg(0) Class126 arg0) {
		@Pc(13) Class4_Sub34 local13 = (Class4_Sub34) Static385.aClass196_32.method4477(((long) arg0.anInt3397 << 32) + (long) arg0.anInt3392);
		return local13 == null ? arg0.aClass4_Sub34_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!jb;)Z")
	public static boolean method1119(@OriginalArg(0) Class126 arg0) {
		if (Static197.aBoolean436) {
			if (method1118(arg0).anInt5771 != 0) {
				return false;
			}
			if (arg0.anInt3426 == 0) {
				return false;
			}
		}
		return arg0.aBoolean252;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1120() {
		Static260.anInt7575 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static249.anInt4520; local3++) {
			@Pc(10) Class6_Sub2_Sub1_Sub2 local10 = Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local3]];
			if (local10.aBoolean422 && local10.method4757() != -1) {
				@Pc(28) int local28 = (local10.method4763() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6062 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6061 - local28 >> 7;
				@Pc(49) Class6_Sub2_Sub1 local49 = Static273.method3700(local42, local35, local10.aByte86);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt6078;
					if (local49 instanceof Class6_Sub2_Sub1_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt6123 == 0 && local49.method4757() != -1) {
						Static150.anIntArray239[Static260.anInt7575] = local54;
						Static25.anIntArray56[Static260.anInt7575] = local54;
						Static260.anInt7575++;
						local49.anInt6123++;
					}
					Static150.anIntArray239[Static260.anInt7575] = local54;
					Static25.anIntArray56[Static260.anInt7575] = local10.anInt6078 + 2048;
					Static260.anInt7575++;
					local49.anInt6123++;
				}
			}
		}
		Static227.method3154(Static260.anInt7575 - 1, Static150.anIntArray239, 0, Static25.anIntArray56);
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1121() {
		@Pc(1) int local1 = Static58.anInt4352;
		@Pc(3) int[] local3 = Static144.anIntArray186;
		@Pc(20) boolean local20 = Static126.aClass67_Sub1_1.anInt5856 == 1 && local1 > 200 || Static126.aClass67_Sub1_1.anInt5856 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class6_Sub2_Sub1_Sub1 local29 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local3[local22]];
			if (local29.method714()) {
				local29.method4749();
				if (local29.aShort82 >= 0 && local29.aShort85 >= 0 && local29.aShort84 < Static126.anInt2569 && local29.aShort83 < Static190.anInt3697) {
					local29.aBoolean53 = local29.aBoolean421 ? local20 : false;
					if (local29 == Static375.aClass6_Sub2_Sub1_Sub1_3) {
						local29.anInt6074 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean422) {
							local75++;
						}
						if (local29.anInt6119 > Static175.anInt3261) {
							local75 += 2;
						}
						local75 += 5 - local29.method4763() << 2;
						if (local29.aBoolean54) {
							local75 += 512;
						} else {
							if (Static175.anInt3265 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6074 = local75 + 1;
					}
				} else {
					local29.anInt6074 = -1;
				}
			} else {
				local29.anInt6074 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static249.anInt4520; local116++) {
			@Pc(123) Class6_Sub2_Sub1_Sub2 local123 = Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local116]];
			if (local123.method4777() && local123.aClass243_1.method5339(Static155.aClass149_1)) {
				local123.method4749();
				if (local123.aShort82 >= 0 && local123.aShort85 >= 0 && local123.aShort84 < Static126.anInt2569 && local123.aShort83 < Static190.anInt3697) {
					@Pc(160) int local160 = 0;
					if (!local123.aBoolean422) {
						local160++;
					}
					if (local123.anInt6119 > Static175.anInt3261) {
						local160 += 2;
					}
					local160 += 5 - local123.method4763() << 2;
					if (Static175.anInt3265 == 0) {
						if (local123.aClass243_1.aBoolean457) {
							local160 += 64;
						} else {
							local160 += 128;
						}
					} else if (Static175.anInt3265 == 1) {
						if (local123.aClass243_1.aBoolean457) {
							local160 += 32;
						} else {
							local160 += 64;
						}
					}
					if (local123.aClass243_1.aBoolean459) {
						local160 += 1024;
					} else if (!local123.aClass243_1.aBoolean460) {
						local160 += 256;
					}
					local123.anInt6074 = local160 + 1;
				} else {
					local123.anInt6074 = -1;
				}
			} else {
				local123.anInt6074 = -1;
			}
		}
		for (local75 = 0; local75 < Static118.aClass80Array1.length; local75++) {
			@Pc(226) Class80 local226 = Static118.aClass80Array1[local75];
			if (local226 != null) {
				if (local226.anInt2470 == 1) {
					@Pc(237) Class6_Sub2_Sub1_Sub2 local237 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local226.anInt2465];
					if (local237 != null && local237.anInt6074 >= 0) {
						local237.anInt6074 += 2048;
					}
				} else if (local226.anInt2470 == 10) {
					@Pc(258) Class6_Sub2_Sub1_Sub1 local258 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local226.anInt2465];
					if (local258 != null && local258 != Static375.aClass6_Sub2_Sub1_Sub1_3 && local258.anInt6074 >= 0) {
						local258.anInt6074 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)V")
	public static void method1122(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg0, 9);
		local8.method2761();
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method1123(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static58.anInt4352;
		@Pc(3) int[] local3 = Static144.anIntArray186;
		@Pc(11) int local11 = Static258.aBoolean341 ? local1 : local1 + Static249.anInt4520;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class6_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local13 - local1]];
			}
			if (local23.aByte86 == arg0) {
				local23.anInt6123 = 0;
				if (local23.anInt6074 < 0) {
					local23.aBoolean422 = false;
				} else {
					@Pc(50) int local50 = local23.method4763();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6062 & 0x7F) != 0 || (local23.anInt6061 & 0x7F) != 0) {
							local23.aBoolean422 = false;
							continue;
						}
					} else if ((local23.anInt6062 & 0x7F) != 64 || (local23.anInt6061 & 0x7F) != 64) {
						local23.aBoolean422 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6062 >> 7;
						local97 = local23.anInt6061 >> 7;
						if (local23.anInt6074 != Static28.anIntArrayArray9[local92][local97]) {
							local23.aBoolean422 = true;
							continue;
						}
						if (Static239.anIntArrayArray38[local92][local97] > 1) {
							local122 = Static239.anIntArrayArray38[local92][local97]--;
							local23.aBoolean422 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6062 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6061 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6062 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6061 + local92 >> 7;
						if (!Static380.method5182(local23.anInt6074, local165, local158, local97, local151)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt6074 == Static28.anIntArrayArray9[local176][local179]) {
										local122 = Static239.anIntArrayArray38[local176][local179]--;
									}
								}
							}
							local23.aBoolean422 = true;
							continue;
						}
					}
					if (local23 instanceof Class6_Sub2_Sub1_Sub1 && local23.aClass4_Sub13_3 != null && Static175.anInt3261 >= local23.aClass4_Sub13_3.anInt2496 && Static175.anInt3261 < local23.aClass4_Sub13_3.anInt2487) {
						((Class6_Sub2_Sub1_Sub1) local23).aBoolean53 = false;
					}
					local23.aBoolean422 = false;
					local23.anInt6067 = Static222.method3109(local23.anInt6062, local23.aByte86, local23.anInt6061);
					Static235.method3268(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(B)I")
	public static int method1124() {
		return 6;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1127(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static58.anInt4352;
		@Pc(3) int[] local3 = Static144.anIntArray186;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static249.anInt4520; local5++) {
			@Pc(15) Class6_Sub2_Sub1 local15;
			if (local5 < local1) {
				local15 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local3[local5]];
			} else {
				local15 = Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local5 - local1]];
			}
			if (local15.aByte86 == arg0 && local15.anInt6074 >= 0) {
				@Pc(35) int local35 = local15.method4763();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6062 & 0x7F) != 0 || (local15.anInt6061 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6062 & 0x7F) != 64 || (local15.anInt6061 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6062 >> 7;
					local76 = local15.anInt6061 >> 7;
					if (local15.anInt6074 > Static28.anIntArrayArray9[local71][local76]) {
						Static28.anIntArrayArray9[local71][local76] = local15.anInt6074;
						Static239.anIntArrayArray38[local71][local76] = 1;
					} else if (local15.anInt6074 == Static28.anIntArrayArray9[local71][local76]) {
						local112 = Static239.anIntArrayArray38[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6062 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6061 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6062 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6061 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt6074 > Static28.anIntArrayArray9[local154][local157]) {
								Static28.anIntArrayArray9[local154][local157] = local15.anInt6074;
								Static239.anIntArrayArray38[local154][local157] = 1;
							} else if (local15.anInt6074 == Static28.anIntArrayArray9[local154][local157]) {
								local112 = Static239.anIntArrayArray38[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1130() {
		for (@Pc(1) int local1 = 0; local1 < Static126.anInt2569; local1++) {
			@Pc(6) int[] local6 = Static28.anIntArrayArray9[local1];
			for (@Pc(8) int local8 = 0; local8 < Static190.anInt3697; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1133() {
		@Pc(1) int local1 = Static58.anInt4352;
		@Pc(3) int[] local3 = Static144.anIntArray186;
		@Pc(11) int local11 = Static258.aBoolean341 ? local1 : local1 + Static249.anInt4520;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class6_Sub2_Sub1 local23;
			if (local13 < local1) {
				local23 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local3[local13]];
			} else {
				local23 = Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local13 - local1]];
			}
			if (local23.anInt6074 >= 0) {
				@Pc(39) int local39 = local23.method4763();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6062 & 0x7F) == 0 && (local23.anInt6061 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6062 & 0x7F) == 64 && (local23.anInt6061 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class6_Sub2_Sub1_Sub1 && local23.aClass4_Sub13_3 != null && Static175.anInt3261 >= local23.aClass4_Sub13_3.anInt2496 && Static175.anInt3261 < local23.aClass4_Sub13_3.anInt2487) {
					((Class6_Sub2_Sub1_Sub1) local23).aBoolean53 = false;
				}
				local23.anInt6067 = Static222.method3109(local23.anInt6062, local23.aByte86, local23.anInt6061);
				Static235.method3268(local23, true);
			}
		}
	}
}
