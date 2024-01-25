import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!pp", name = "L", descriptor = "I")
	public static int anInt7477;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
	public static int anInt7470 = 0;

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "Z")
	public static boolean aBoolean585 = false;

	@OriginalMember(owner = "client!pp", name = "J", descriptor = "I")
	public static int anInt7475 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIZI)V")
	public static void method6501(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static255.aClass66_18.method1994((long) arg0) != null) {
			return;
		}
		if (Static321.aBoolean375) {
			@Pc(24) Class4_Sub34 local24 = new Class4_Sub34(arg0, new Class105_Sub1(4096, Static636.aClass34_126, arg0), arg2, arg1);
			local24.aClass105_Sub1_1.method2532(Static93.aStringArray11[Static164.anInt2984]);
			Static255.aClass66_18.method1985(local24, (long) arg0);
		} else {
			Static11.method221(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ[Lclient!kq;IIIIIZII)V")
	public static void method6502(@OriginalArg(0) int arg0, @OriginalArg(2) Class199[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
		for (@Pc(13) int local13 = 0; local13 < arg1.length; local13++) {
			@Pc(19) Class199 local19 = arg1[local13];
			if (local19 != null && (arg6 == local19.anInt4982 || arg6 == -1412584499 && local19 == Static507.aClass199_12)) {
				@Pc(39) int local39 = local19.anInt4973 + arg4;
				@Pc(44) int local44 = local19.anInt5028 + arg9;
				@Pc(51) int local51 = local19.anInt5035 + local39 + 1;
				@Pc(58) int local58 = local19.anInt4994 + local44 + 1;
				@Pc(63) int local63;
				if (arg0 == -1) {
					Class4_Sub5_Sub21.aRectangleArray2[Static463.anInt7418].setBounds(arg4 + local19.anInt4973, local19.anInt5028 - -arg9, local19.anInt5035, local19.anInt4994);
					local63 = Static463.anInt7418++;
				} else {
					local63 = arg0;
				}
				local19.anInt5037 = Static177.anInt3088;
				local19.anInt5001 = local63;
				if (!Static75.method1611(local19)) {
					if (local19.anInt4955 != 0) {
						Static460.method6421(local19);
					}
					@Pc(111) int local111 = arg4 + local19.anInt4973;
					@Pc(116) int local116 = local19.anInt5028 + arg9;
					@Pc(118) int local118 = 0;
					@Pc(120) int local120 = 0;
					if (Static423.aBoolean517) {
						local118 = Static383.method8455();
						local120 = Static286.method4120();
					}
					@Pc(131) int local131 = local19.anInt5027;
					if (Static110.aBoolean147 && (Static75.method1604(local19).anInt890 != 0 || local19.anInt4966 == 0) && local131 > 127) {
						local131 = 127;
					}
					@Pc(190) int local190;
					@Pc(196) int local196;
					if (local19 == Static507.aClass199_12) {
						if (arg6 != -1412584499 && (Static146.anInt2670 == local19.anInt5010 || local19.anInt5010 == Static199.anInt3294)) {
							Static514.aClass199Array2 = arg1;
							Static453.anInt7323 = arg4;
							Static489.anInt7678 = arg9;
							continue;
						}
						if (Static495.aBoolean605 && Static584.aBoolean331) {
							local190 = local118 + Static373.aClass161_1.method5903();
							local196 = local120 + Static373.aClass161_1.method5898();
							local190 -= Static156.anInt2899;
							local196 -= Static624.anInt9782;
							if (Static205.anInt3341 > local190) {
								local190 = Static205.anInt3341;
							}
							if (Static469.anInt7448 > local196) {
								local196 = Static469.anInt7448;
							}
							if (Static389.aClass199_10.anInt5035 + Static205.anInt3341 < local190 - -local19.anInt5035) {
								local190 = Static205.anInt3341 + Static389.aClass199_10.anInt5035 - local19.anInt5035;
							}
							if (local19.anInt4994 + local196 > Static469.anInt7448 - -Static389.aClass199_10.anInt4994) {
								local196 = Static469.anInt7448 + Static389.aClass199_10.anInt4994 - local19.anInt4994;
							}
							local111 = local190;
							local116 = local196;
						}
						if (Static199.anInt3294 == local19.anInt5010) {
							local131 = 128;
						}
					}
					@Pc(331) int local331;
					@Pc(320) int local320;
					@Pc(280) int local280;
					@Pc(285) int local285;
					if (local19.anInt4966 == 2) {
						local320 = arg3;
						local190 = arg5;
						local331 = arg2;
						local196 = arg8;
					} else {
						local280 = local111 + local19.anInt5035;
						local285 = local116 + local19.anInt4994;
						local196 = local116 <= arg8 ? arg8 : local116;
						if (local19.anInt4966 == 9) {
							local285++;
							local280++;
						}
						local190 = local111 > arg5 ? local111 : arg5;
						local320 = arg3 > local285 ? local285 : arg3;
						local331 = local280 >= arg2 ? arg2 : local280;
					}
					if (local331 > local190 && local196 < local320) {
						@Pc(626) int local626;
						@Pc(676) int local676;
						@Pc(770) int local770;
						@Pc(772) int local772;
						@Pc(657) int local657;
						@Pc(659) int local659;
						if (local19.anInt4955 != 0) {
							if (Static468.anInt7445 == local19.anInt4955 || Static365.anInt5492 == local19.anInt4955) {
								Static369.method4868(local111, local116, local19);
								if (!Static423.aBoolean517) {
									Static663.method8788(local111, local116, local19.anInt4994, local19.anInt5035, Static365.anInt5492 == local19.anInt4955);
									Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
								}
								Static109.aBooleanArray4[local63] = true;
								continue;
							}
							if (local19.anInt4955 == Static257.anInt4174) {
								if (local19.method4428(Static582.aClass33_13) != null) {
									Static253.method3677();
									Static494.method6887(Static582.aClass33_13, local116, local19, local111);
									Static387.aBooleanArray12[local63] = true;
									Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
									if (Static423.aBoolean517) {
										if (arg7) {
											Static100.method2025(local44, local51, local39, local58);
										} else {
											Static464.method6456(local51, local58, local44, local39);
										}
									}
								}
								continue;
							}
							if (local19.anInt4955 == Static228.anInt3638) {
								Static587.method7738(local111, Static582.aClass33_13, local19, local116);
								continue;
							}
							if (local19.anInt4955 == Static213.anInt3454) {
								Static407.method2214(Static582.aClass33_13, local116, local111, local19, local19.anInt4950 % 64);
								continue;
							}
							if (Static51.anInt1109 == local19.anInt4955) {
								if (local19.method4428(Static582.aClass33_13) != null) {
									Static391.method5049(local19, local116, local111);
									Static387.aBooleanArray12[local63] = true;
									Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
									if (Static423.aBoolean517) {
										if (arg7) {
											Static100.method2025(local44, local51, local39, local58);
										} else {
											Static464.method6456(local51, local58, local44, local39);
										}
									}
								}
								continue;
							}
							if (Static60.anInt1290 == local19.anInt4955) {
								Static491.method6677(local19.anInt5035, local111, local116, Static582.aClass33_13, local19.anInt4994, Static57.anInterface9_4);
								Static109.aBooleanArray4[local63] = true;
								Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
								continue;
							}
							if (local19.anInt4955 == Static265.anInt4285) {
								Static80.method1705(local116, local111, Static582.aClass33_13, local19.anInt5035, local19.anInt4994);
								Static109.aBooleanArray4[local63] = true;
								Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
								continue;
							}
							if (Static117.anInt2248 == local19.anInt4955) {
								if (!Static492.aBoolean603 && !Static620.aBoolean705) {
									continue;
								}
								local280 = local19.anInt5035 + local111;
								local285 = local116 + 15;
								if (Static423.aBoolean517) {
									if (arg7) {
										Static100.method2025(local44, local51, local39, local58);
									} else {
										Static464.method6456(local51, local58, local44, local39);
									}
								}
								if (Static492.aBoolean603) {
									local626 = -256;
									if (Static555.anInt8559 < 20) {
										local626 = -65536;
									}
									Static189.aClass56_5.method8057("Fps:" + Static555.anInt8559, local285, local280, local626, -1);
									local285 += 15;
									@Pc(648) Runtime local648 = Runtime.getRuntime();
									local657 = (int) ((local648.totalMemory() - local648.freeMemory()) / 1024L);
									local659 = -256;
									if (local657 > 98304) {
										local659 = -65536;
										if (Static207.aBoolean732) {
											Static642.method8558();
											for (local676 = 0; local676 < 10; local676++) {
												System.gc();
											}
											local657 = (int) ((local648.totalMemory() - local648.freeMemory()) / 1024L);
											if (local657 > 65536) {
												Static417.method5293("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static189.aClass56_5.method8057("Mem:" + local657 + "k", local285, local280, local659, -1);
									local285 += 15;
									Static189.aClass56_5.method8057("In:" + Static192.anInt3229 + "B/s Out:" + Static125.anInt2341 + "B/s", local285, local280, -256, -1);
									local285 += 15;
									local676 = Static582.aClass33_13.E() / 1024;
									Static189.aClass56_5.method8057("Offheap:" + local676 + "k", local285, local280, local676 <= 65536 ? -256 : -65536, -1);
									local285 += 15;
									local770 = 0;
									local772 = 0;
									@Pc(774) int local774 = 0;
									for (@Pc(776) int local776 = 0; local776 < 37; local776++) {
										if (Static558.aClass89_Sub1Array2[local776] != null) {
											local770 += Static558.aClass89_Sub1Array2[local776].method2244();
											local772 += Static558.aClass89_Sub1Array2[local776].method2240();
											local774 += Static558.aClass89_Sub1Array2[local776].method2242();
										}
									}
									@Pc(816) int local816 = local774 * 100 / local770;
									@Pc(822) int local822 = local772 * 10000 / local770;
									@Pc(842) String local842 = "Cache:" + Static34.method8333((long) local822, true, 0, 2) + "% (" + local816 + "%)";
									Static302.aClass56_9.method8057(local842, local285, local280, -256, -1);
									local285 += 12;
								}
								if (Static516.anInt8026 > 0) {
									Static302.aClass56_9.method8057("Particles: " + Static561.anInt8624 + " / " + Static516.anInt8026, local285, local280, -256, -1);
								}
								local285 += 12;
								if (Static620.aBoolean705) {
									Static302.aClass56_9.method8057("Polys: " + Static582.aClass33_13.I() + " Models: " + Static582.aClass33_13.M(), local285, local280, -256, -1);
									local285 += 12;
									Static302.aClass56_9.method8057("Ls: " + Static132.anInt2477 + " La: " + Static631.anInt9865 + " NPC: " + Static619.anInt9720 + " Pl: " + Static444.anInt6928, local285, local280, -256, -1);
									Static314.method4358();
									local285 += 12;
								}
								Static109.aBooleanArray4[local63] = true;
								continue;
							}
						}
						@Pc(1005) Class4_Sub28 local1005;
						if (local19.anInt4966 == 0) {
							if (local19.anInt4955 == Static528.anInt8183 && Static582.aClass33_13.method8136()) {
								Static582.aClass33_13.method8080(local111, local116, local19.anInt5035, local19.anInt4994);
							}
							method6502(local63, arg1, local331, local320, local111 - local19.anInt5031, local190, local19.anInt5041, arg7, local196, local116 - local19.anInt4977);
							if (local19.aClass199Array1 != null) {
								method6502(local63, local19.aClass199Array1, local331, local320, local111 - local19.anInt5031, local190, local19.anInt5041, arg7, local196, local116 - local19.anInt4977);
							}
							local1005 = (Class4_Sub28) Static242.aClass66_17.method1994((long) local19.anInt5041);
							if (local1005 != null) {
								Static539.method7217(local331, local196, local111, local190, local63, local320, local1005.anInt4697, local116);
							}
							if (local19.anInt4955 == Static528.anInt8183 && Static582.aClass33_13.method8136()) {
								Static582.aClass33_13.method8149();
							}
							Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
						}
						if (Static146.aBooleanArray6[local63] || Static602.anInt9261 > 1) {
							if (local19.anInt4966 == 3) {
								if (local131 == 0) {
									if (local19.aBoolean382) {
										Static582.aClass33_13.aa(local111, local116, local19.anInt5035, local19.anInt4994, local19.anInt4950, 0);
									} else {
										Static582.aClass33_13.method8142(local111, local116, local19.anInt5035, local19.anInt4994, local19.anInt4950, 0);
									}
								} else if (local19.aBoolean382) {
									Static582.aClass33_13.aa(local111, local116, local19.anInt5035, local19.anInt4994, local19.anInt4950 & 0xFFFFFF | 255 - (local131 & 0xFF) << 24, 1);
								} else {
									Static582.aClass33_13.method8142(local111, local116, local19.anInt5035, local19.anInt4994, 255 - (local131 & 0xFF) << 24 | local19.anInt4950 & 0xFFFFFF, 1);
								}
								if (Static423.aBoolean517) {
									if (arg7) {
										Static100.method2025(local44, local51, local39, local58);
									} else {
										Static464.method6456(local51, local58, local44, local39);
									}
								}
							} else {
								@Pc(1185) Class110 local1185;
								if (local19.anInt4966 == 4) {
									@Pc(1160) Class56 local1160 = local19.method4420(Static582.aClass33_13);
									if (local1160 != null) {
										local285 = local19.anInt4950;
										@Pc(1175) String local1175 = local19.aString52;
										if (local19.anInt5002 != -1) {
											local1185 = Static532.aClass255_2.method5210(local19.anInt5002);
											local1175 = local1185.aString24;
											if (local1175 == null) {
												local1175 = "null";
											}
											if ((local1185.anInt2797 == 1 || local19.anInt5032 != 1) && local19.anInt5032 != -1) {
												local1175 = "<col=ff9040>" + local1175 + "</col> x" + Static127.method2250(local19.anInt5032);
											}
										}
										if (local19.anInt4951 != -1) {
											local1175 = Static527.method7105(local19.anInt4951);
											if (local1175 == null) {
												local1175 = "";
											}
										}
										if (Static451.aClass199_11 == local19) {
											local1175 = Static279.aClass179_31.method4066(Static164.anInt2984);
											local285 = local19.anInt4950;
										}
										if (Static620.aBoolean706) {
											Static582.aClass33_13.T(local111, local116, local111 + local19.anInt5035, local19.anInt4994 + local116);
										}
										local1160.method8063(Static638.aClass17Array18, 255 - (local131 & 0xFF) << 24 | local285, local111, local1175, 0, local19.anInt4984, local116, local19.anInt4999, 0, local19.anInt4986, local19.anInt4994, local19.anInt4987, local19.aBoolean383 ? 255 - (local131 & 0xFF) << 24 : -1, (int[]) null, (Class1) null, local19.anInt5035);
										if (Static620.aBoolean706) {
											Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
										}
										if (local1175.trim().length() > 0) {
											if (!Static620.aBoolean706) {
												@Pc(1352) Class31 local1352 = Static17.method323(local19.anInt4980, Static582.aClass33_13);
												local657 = local1352.method1020(Static638.aClass17Array18, local1175, local19.anInt5035);
												local659 = local1352.method1021(Static638.aClass17Array18, local19.anInt4984, local19.anInt5035, local1175);
												if (Static423.aBoolean517) {
													if (arg7) {
														Static100.method2025(local116, local111 + local657, local111, local659 + local116);
													} else {
														Static464.method6456(local111 + local657, local116 + local659, local116, local111);
													}
												}
											} else if (Static423.aBoolean517) {
												if (arg7) {
													Static100.method2025(local44, local51, local39, local58);
												} else {
													Static464.method6456(local51, local58, local44, local39);
												}
											}
										}
									} else if (Static427.aBoolean520) {
										Static331.method4565(local19);
									}
								} else {
									@Pc(1495) int local1495;
									if (local19.anInt4966 == 5) {
										if (local19.anInt4998 < 0) {
											@Pc(1424) Class17 local1424;
											if (local19.anInt5002 != -1) {
												@Pc(1441) Class245 local1441 = local19.aBoolean384 ? Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 : null;
												local1424 = Static532.aClass255_2.method5207(Static582.aClass33_13, local19.anInt5032, local19.anInt5022 | 0xFF000000, local19.anInt5016, local19.anInt5034, local1441, local19.anInt5002);
											} else if (local19.anInt4951 == -1) {
												local1424 = local19.method4410(Static582.aClass33_13);
											} else {
												local1424 = Static278.method4063(local19.anInt4951, Static582.aClass33_13);
											}
											if (local1424 != null) {
												local285 = local1424.method5256();
												local626 = local1424.method5251();
												local1495 = (local19.anInt4950 == 0 ? 16777215 : local19.anInt4950 & 0xFFFFFF) | 255 - (local131 & 0xFF) << 24;
												if (local19.aBoolean385) {
													Static582.aClass33_13.T(local111, local116, local111 + local19.anInt5035, local116 - -local19.anInt4994);
													if (local19.anInt5017 != 0) {
														local657 = (local19.anInt5035 + local285 - 1) / local285;
														local659 = (local626 + local19.anInt4994 - 1) / local626;
														for (local676 = 0; local676 < local657; local676++) {
															for (local770 = 0; local770 < local659; local770++) {
																if (local19.anInt4950 == 0) {
																	local1424.method5252((float) (local111 + local676 * local285) + (float) local285 / 2.0F, (float) local626 / 2.0F + (float) (local116 + local626 * local770), 4096, local19.anInt5017);
																} else {
																	local1424.method5265((float) local285 / 2.0F + (float) (local676 * local285 + local111), (float) (local116 + local626 * local770) + (float) local626 / 2.0F, 4096, local19.anInt5017, local1495);
																}
															}
														}
													} else if (local19.anInt4950 == 0 && local131 == 0) {
														local1424.method5261(local111, local116, local19.anInt5035, local19.anInt4994);
													} else {
														local1424.method5255(local111, local116, local19.anInt5035, local19.anInt4994, 0, local1495, 1);
													}
													Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
												} else if (local19.anInt4950 == 0 && local131 == 0) {
													if (local19.anInt5017 != 0) {
														local1424.method5252((float) local111 + (float) local19.anInt5035 / 2.0F, (float) local19.anInt4994 / 2.0F + (float) local116, local19.anInt5035 * 4096 / local285, local19.anInt5017);
													} else if (local285 == local19.anInt5035 && local19.anInt4994 == local626) {
														local1424.method5246(local111, local116);
													} else {
														local1424.method5245(local111, local116, local19.anInt5035, local19.anInt4994);
													}
												} else if (local19.anInt5017 != 0) {
													local1424.method5265((float) local19.anInt5035 / 2.0F + (float) local111, (float) local116 + (float) local19.anInt4994 / 2.0F, local19.anInt5035 * 4096 / local285, local19.anInt5017, local1495);
												} else if (local285 == local19.anInt5035 && local19.anInt4994 == local626) {
													local1424.method5260(local111, local116, 0, local1495, 1);
												} else {
													local1424.method5259(local111, local116, local19.anInt5035, local19.anInt4994, 0, local1495, 1);
												}
											} else if (Static427.aBoolean520) {
												Static331.method4565(local19);
											}
										} else {
											local19.method4430(Static153.aClass344_1, Static422.aClass273_1).method7316(local19.anInt5035, 0, local19.anInt5007 << 3, local111, local19.anInt5019 << 3, local19.anInt4994, local116, Static582.aClass33_13, 0);
										}
										if (Static423.aBoolean517) {
											if (arg7) {
												Static100.method2025(local44, local51, local39, local58);
											} else {
												Static464.method6456(local51, local58, local44, local39);
											}
										}
									} else if (local19.anInt4966 == 6) {
										Static606.method7955();
										local1005 = null;
										@Pc(1851) Class62 local1851 = null;
										local626 = 0;
										@Pc(2026) Class124 local2026;
										@Pc(2036) Class245 local2036;
										if (local19.anInt5002 != -1) {
											local1185 = Static532.aClass255_2.method5210(local19.anInt5002);
											if (local1185 != null) {
												local1185 = local1185.method2626(local19.anInt5032);
												local2026 = local19.anInt4948 == -1 ? null : Static99.aClass2_1.method22(local19.anInt4948);
												local2036 = local19.aBoolean384 ? Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 : null;
												local1851 = local1185.method2608(Static582.aClass33_13, local19.anInt4985, 1, local2036, local19.anInt4960, local19.anInt5014, local2026, 2048);
												if (local1851 == null) {
													Static331.method4565(local19);
												} else {
													local626 = -local1851.fa() >> 1;
												}
											}
										} else if (local19.anInt5039 == 5) {
											local1495 = local19.anInt4956;
											if (local1495 >= 0 && local1495 < 2048) {
												@Pc(1875) Class3_Sub1_Sub2_Sub2_Sub1 local1875 = Static180.aClass3_Sub1_Sub2_Sub2_Sub1Array20[local1495];
												@Pc(1888) Class124 local1888 = local19.anInt4948 == -1 ? null : Static99.aClass2_1.method22(local19.anInt4948);
												if (local1875 != null && (local1495 == Static184.anInt3149 || Static330.method4560(local1875.aString37) == local19.anInt4983)) {
													local1851 = local1875.aClass245_1.method5068(2048, Static582.aClass33_13, Static99.aClass2_1, local19.anInt4985, Static255.aClass380_1, -1, local19.anInt5014, (Class124) null, 0, (int[]) null, Static526.aClass293_1, 0, Static532.aClass255_2, 0, local1888, (Class143[]) null, Static511.aClass254_1, local19.anInt4960, Static116.aClass177_1);
												}
											}
										} else if (local19.anInt5039 == 8 || local19.anInt5039 == 9) {
											@Pc(2013) Class4_Sub54 local2013 = Static473.method6525(local19.anInt4956, false);
											local2026 = local19.anInt4948 == -1 ? null : Static99.aClass2_1.method22(local19.anInt4948);
											if (local2013 != null) {
												local2036 = local19.aBoolean384 ? Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1 : null;
												local1851 = local2013.method8910(local19.anInt4960, local19.anInt5039 == 9, local19.anInt4983, local19.anInt5014, Static582.aClass33_13, local2026, local19.anInt4985, local2036);
											}
										} else if (local19.anInt4948 == -1) {
											local1851 = local19.method4413(-1, 2048, local1005, -1, (Class124) null, Static526.aClass293_1, Static532.aClass255_2, Static116.aClass177_1, Static99.aClass2_1, Static582.aClass33_13, Static511.aClass254_1, Static255.aClass380_1, 0, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1);
											if (local1851 == null && Static427.aBoolean520) {
												Static331.method4565(local19);
											}
										} else {
											@Pc(1977) Class124 local1977 = Static99.aClass2_1.method22(local19.anInt4948);
											local1851 = local19.method4413(local19.anInt5014, 2048, local1005, local19.anInt4985, local1977, Static526.aClass293_1, Static532.aClass255_2, Static116.aClass177_1, Static99.aClass2_1, Static582.aClass33_13, Static511.aClass254_1, Static255.aClass380_1, local19.anInt4960, Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aClass245_1);
											if (local1851 == null && Static427.aBoolean520) {
												Static331.method4565(local19);
											}
										}
										if (local1851 != null) {
											if (local19.anInt4953 > 0) {
												local1495 = (local19.anInt5035 << 9) / local19.anInt4953;
											} else {
												local1495 = 512;
											}
											if (local19.anInt4996 > 0) {
												local657 = (local19.anInt4994 << 9) / local19.anInt4996;
											} else {
												local657 = 512;
											}
											local659 = local111 + local19.anInt5035 / 2;
											local676 = local116 + local19.anInt4994 / 2;
											if (!local19.aBoolean388) {
												local676 += local657 * local19.anInt4949 >> 9;
												local659 += local19.anInt5004 * local1495 >> 9;
											}
											Static149.aClass92_2.method3853();
											Static582.aClass33_13.method8133(Static149.aClass92_2);
											Static582.aClass33_13.DA(local659, local676, local1495, local657);
											Static582.aClass33_13.ya();
											if (local19.aBoolean379) {
												Static582.aClass33_13.C(false);
											}
											if (local19.aBoolean388) {
												Static440.aClass92_7.method3852(local19.anInt4972);
												Static440.aClass92_7.method3861(local19.anInt5006);
												Static440.aClass92_7.method3860(local19.anInt4957);
												Static440.aClass92_7.method3851(local19.anInt5004, local19.anInt4949, local19.anInt5042);
											} else {
												local770 = Class4_Sub2_Sub26.anIntArray563[local19.anInt4972 << 3] * (local19.anInt4961 << 2) >> 14;
												local772 = (local19.anInt4961 << 2) * Class4_Sub2_Sub26.anIntArray562[local19.anInt4972 << 3] >> 14;
												Static440.aClass92_7.method3868(-local19.anInt4957 << 3);
												Static440.aClass92_7.method3861(local19.anInt5006 << 3);
												Static440.aClass92_7.method3851(local19.lb << 2, local626 + (local19.anInt5021 << 2) + local770, local772 + (local19.anInt5021 << 2));
												Static440.aClass92_7.method3866(local19.anInt4972 << 3);
											}
											local19.method4414(Static177.anInt3088, local1851, Static440.aClass92_7, Static582.aClass33_13);
											if (Static620.aBoolean706) {
												Static582.aClass33_13.T(local111, local116, local111 + local19.anInt5035, local116 - -local19.anInt4994);
											}
											if (local19.aBoolean388) {
												if (local19.aBoolean378) {
													local1851.method7332(Static440.aClass92_7, (Class3_Sub4) null, local19.anInt4961, 1);
												} else {
													local1851.method7335(Static440.aClass92_7, (Class3_Sub4) null, 1);
													if (local19.aClass3_Sub7_5 != null) {
														Static582.aClass33_13.method8085(local19.aClass3_Sub7_5.method7312());
													}
												}
											} else if (local19.aBoolean378) {
												local1851.method7332(Static440.aClass92_7, (Class3_Sub4) null, local19.anInt4961 << 2, 1);
											} else {
												local1851.method7335(Static440.aClass92_7, (Class3_Sub4) null, 1);
												if (local19.aClass3_Sub7_5 != null) {
													Static582.aClass33_13.method8085(local19.aClass3_Sub7_5.method7312());
												}
											}
											if (Static620.aBoolean706) {
												Static582.aClass33_13.KA(arg5, arg8, arg2, arg3);
											}
											if (local19.aBoolean379) {
												Static582.aClass33_13.C(true);
											}
										}
										if (Static423.aBoolean517) {
											if (arg7) {
												Static100.method2025(local44, local51, local39, local58);
											} else {
												Static464.method6456(local51, local58, local44, local39);
											}
										}
									} else if (local19.anInt4966 == 9) {
										if (local19.aBoolean372) {
											local1495 = local116;
											local285 = local116 + local19.anInt4994;
											local626 = local111 + local19.anInt5035;
										} else {
											local626 = local19.anInt5035 + local111;
											local285 = local116;
											local1495 = local19.anInt4994 + local116;
										}
										if (local19.anInt5008 == 1) {
											Static582.aClass33_13.method8096(local111, local285, local626, local1495, local19.anInt4950, 0);
										} else {
											Static582.aClass33_13.method8091(local111, local285, local626, local1495, local19.anInt4950, local19.anInt5008);
										}
										if (Static423.aBoolean517) {
											if (arg7) {
												Static100.method2025(local44, local51, local39, local58);
											} else {
												Static464.method6456(local51, local58, local44, local39);
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

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V")
	public static void method6503(@OriginalArg(0) boolean arg0) {
		Static196.method3045(Static357.anInt5421, Static632.anInt9867, arg0, Static77.anInt1630);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIBLclient!bt;)Lclient!bj;")
	public static Class4_Sub5_Sub3 method6504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class34 arg2) {
		@Pc(14) Class4_Sub11 local14 = new Class4_Sub11(arg2.method1239(arg0, arg1));
		@Pc(49) Class4_Sub5_Sub3 local49 = new Class4_Sub5_Sub3(arg1, local14.method8853(), local14.method8853(), local14.method8850(), local14.method8850(), local14.method8865() == 1, local14.method8865(), local14.method8865());
		@Pc(53) int local53 = local14.method8865();
		for (@Pc(63) int local63 = 0; local63 < local53; local63++) {
			local49.aClass163_10.method3646(new Class4_Sub40(local14.method8865(), local14.method8859(), local14.method8859(), local14.method8859(), local14.method8859(), local14.method8859(), local14.method8859(), local14.method8859(), local14.method8859()));
		}
		local49.method806();
		return local49;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!oq;Lclient!oq;I)V")
	public static void method6505(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_338 != null) {
			arg1.method9000();
		}
		arg1.aClass4_337 = arg0;
		arg1.aClass4_338 = arg0.aClass4_338;
		arg1.aClass4_338.aClass4_337 = arg1;
		arg1.aClass4_337.aClass4_338 = arg1;
	}
}
