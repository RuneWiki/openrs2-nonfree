import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
	public static int anInt4381;

	@OriginalMember(owner = "client!lr", name = "j", descriptor = "Lclient!bda;")
	public static Class31 aClass31_3;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
	public static int anInt4375 = -1;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBLclient!hn;Lclient!gs;)V")
	public static void method3630(@OriginalArg(0) int arg0, @OriginalArg(2) Class149 arg1, @OriginalArg(3) Class11_Sub1 arg2) {
		if (Static74.anInt1598 >= 50 || (arg1 == null || arg1.anIntArrayArray34 == null || arg1.anIntArrayArray34.length <= arg0 || arg1.anIntArrayArray34[arg0] == null)) {
			return;
		}
		@Pc(30) int local30 = arg1.anIntArrayArray34[arg0][0];
		@Pc(34) int local34 = local30 >> 8;
		@Pc(40) int local40 = local30 >> 5 & 0x7;
		@Pc(59) int local59;
		if (arg1.anIntArrayArray34[arg0].length > 1) {
			local59 = (int) ((double) arg1.anIntArrayArray34[arg0].length * Math.random());
			if (local59 > 0) {
				local34 = arg1.anIntArrayArray34[arg0][local59];
			}
		}
		@Pc(72) int local72 = local30 & 0x1F;
		local59 = 256;
		if (arg1.anIntArray307 != null && arg1.anIntArray310 != null) {
			local59 = (int) ((double) (arg1.anIntArray310[arg0] - arg1.anIntArray307[arg0]) * Math.random()) + arg1.anIntArray307[arg0];
		}
		@Pc(110) int local110 = arg1.anIntArray309 == null ? 255 : arg1.anIntArray309[arg0];
		if (local72 == 0) {
			if (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 == arg2) {
				if (!arg1.aBoolean378) {
					Static447.method6629(local59, local40, local110, local34, 0);
					return;
				}
				Static411.method6320(local59, local34, local110, local40, false, 0);
			}
		} else if (Static404.aClass2_Sub13_2.aClass33_Sub1_4.method810() != 0) {
			@Pc(148) int local148 = arg2.anInt9925 - 256 >> 9;
			@Pc(160) int local160 = arg2.anInt9929 - 256 >> 9;
			@Pc(181) int local181 = Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2 == arg2 ? 0 : local72 + (arg2.aByte124 << 24) + (local148 << 16) + (local160 << 8);
			Static492.aClass208Array1[Static74.anInt1598++] = new Class208((byte) (arg1.aBoolean378 ? 2 : 1), local34, local40, 0, local110, local181, local59, arg2);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)I")
	public static int method3632(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I[Lclient!dm;IIIZIIIII)V")
	public static void method3635(@OriginalArg(0) int arg0, @OriginalArg(1) Class78[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(16) Class78 local16 = arg1[local11];
			if (local16 != null && (arg6 == local16.anInt1967 || arg6 == -1412584499 && Static112.aClass78_4 == local16)) {
				@Pc(38) int local38 = arg8 + local16.anInt1928;
				@Pc(44) int local44 = local16.anInt2005 + arg7;
				@Pc(51) int local51 = local16.anInt1964 + local38 + 1;
				@Pc(59) int local59 = local44 + local16.anInt1991 + 1;
				@Pc(84) int local84;
				if (arg3 == -1) {
					Class2_Sub5_Sub21.aRectangleArray2[Static320.anInt5804].setBounds(arg8 + local16.anInt1928, arg7 + local16.anInt2005, local16.anInt1964, local16.anInt1991);
					local84 = Static320.anInt5804++;
				} else {
					local84 = arg3;
				}
				local16.anInt1969 = local84;
				local16.anInt1965 = Static325.anInt5888;
				if (!Static69.method1336(local16)) {
					if (local16.anInt1940 != 0) {
						Static474.method6802(local16);
					}
					@Pc(111) int local111 = local16.anInt1928 + arg8;
					@Pc(117) int local117 = local16.anInt2005 + arg7;
					@Pc(119) int local119 = 0;
					@Pc(121) int local121 = 0;
					if (Static558.aBoolean680) {
						local119 = Static257.method4233();
						local121 = Static290.method4545();
					}
					@Pc(132) int local132 = local16.anInt1935;
					if (Static612.aBoolean735 && (Static69.method1332(local16).anInt7661 != 0 || local16.anInt1955 == 0) && local132 > 127) {
						local132 = 127;
					}
					@Pc(183) int local183;
					@Pc(189) int local189;
					if (local16 == Static112.aClass78_4) {
						if (arg6 != -1412584499 && (Static446.anInt7905 == local16.anInt2007 || local16.anInt2007 == Static397.anInt7109)) {
							Static52.anInt10195 = arg8;
							Static419.anInt7640 = arg7;
							Static258.aClass78Array32 = arg1;
							continue;
						}
						if (Static57.aBoolean82 && Static642.aBoolean759) {
							local183 = Static6.aClass40_1.method4504() + local119;
							local189 = local121 + Static6.aClass40_1.method4499();
							local189 -= Static150.anInt3484;
							local183 -= Static622.anInt10098;
							if (local183 < Static30.anInt6666) {
								local183 = Static30.anInt6666;
							}
							if (Static30.anInt6666 + Static217.aClass78_7.anInt1964 < local16.anInt1964 + local183) {
								local183 = Static217.aClass78_7.anInt1964 + Static30.anInt6666 - local16.anInt1964;
							}
							if (local189 < Static580.anInt9544) {
								local189 = Static580.anInt9544;
							}
							if (local16.anInt1991 + local189 > Static580.anInt9544 - -Static217.aClass78_7.anInt1991) {
								local189 = Static580.anInt9544 + Static217.aClass78_7.anInt1991 - local16.anInt1991;
							}
							local111 = local183;
							local117 = local189;
						}
						if (local16.anInt2007 == Static397.anInt7109) {
							local132 = 128;
						}
					}
					@Pc(310) int local310;
					@Pc(317) int local317;
					@Pc(272) int local272;
					@Pc(277) int local277;
					if (local16.anInt1955 == 2) {
						local310 = arg0;
						local189 = arg5;
						local317 = arg2;
						local183 = arg9;
					} else {
						local272 = local16.anInt1964 + local111;
						local277 = local16.anInt1991 + local117;
						if (local16.anInt1955 == 9) {
							local272++;
							local277++;
						}
						local189 = arg5 >= local117 ? arg5 : local117;
						local183 = arg9 < local111 ? local111 : arg9;
						local310 = local272 >= arg0 ? arg0 : local272;
						local317 = local277 >= arg2 ? arg2 : local277;
					}
					if (local310 > local183 && local189 < local317) {
						@Pc(577) int local577;
						@Pc(611) int local611;
						@Pc(620) int local620;
						@Pc(717) int local717;
						@Pc(609) int local609;
						if (local16.anInt1940 != 0) {
							if (Static227.anInt4636 == local16.anInt1940 || Static493.anInt8410 == local16.anInt1940) {
								Static98.method1679(local111, local117, local16);
								if (!Static558.aBoolean680) {
									Static464.method6724(local16.anInt1991, local111, Static493.anInt8410 == local16.anInt1940, local16.anInt1964, local117);
									Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
								}
								Static618.aBooleanArray50[local84] = true;
								continue;
							}
							if (local16.anInt1940 == Static17.anInt566) {
								if (local16.method1693(Static600.aClass87_15) != null) {
									Static77.method1461();
									Static42.method846(local16, Static600.aClass87_15, local117, local111);
									Static473.aBooleanArray43[local84] = true;
									Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
									if (Static558.aBoolean680) {
										if (arg4) {
											Static233.method3884(local59, local44, local38, local51);
										} else {
											Static495.method7076(local51, local44, local38, local59);
										}
									}
								}
								continue;
							}
							if (Static459.anInt8439 == local16.anInt1940) {
								if (local16.method1693(Static600.aClass87_15) != null) {
									Static62.method1194(local117, local16, local111);
									Static473.aBooleanArray43[local84] = true;
									Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
									if (Static558.aBoolean680) {
										if (arg4) {
											Static233.method3884(local59, local44, local38, local51);
										} else {
											Static495.method7076(local51, local44, local38, local59);
										}
									}
								}
								continue;
							}
							if (local16.anInt1940 == Static87.anInt1791) {
								Static422.method6410(Static23.anInterface6_1, local16.anInt1964, local16.anInt1991, local117, local111, Static600.aClass87_15);
								Static618.aBooleanArray50[local84] = true;
								Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
								continue;
							}
							if (Static78.anInt1694 == local16.anInt1940) {
								Static149.method7699(local16.anInt1991, local117, Static600.aClass87_15, local16.anInt1964, local111);
								Static618.aBooleanArray50[local84] = true;
								Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
								continue;
							}
							if (local16.anInt1940 == Static296.anInt5549) {
								if (!Static465.aBoolean604 && !Static45.aBoolean505) {
									continue;
								}
								local272 = local111 + local16.anInt1964;
								local277 = local117 + 15;
								if (Static558.aBoolean680) {
									if (arg4) {
										Static233.method3884(local59, local44, local38, local51);
									} else {
										Static495.method7076(local51, local44, local38, local59);
									}
								}
								if (Static465.aBoolean604) {
									local577 = -256;
									if (Static93.anInt1859 < 20) {
										local577 = -65536;
									}
									Static428.aClass64_11.method7504(local272, -1, local577, "Fps:" + Static93.anInt1859, local277);
									local277 += 15;
									@Pc(599) Runtime local599 = Runtime.getRuntime();
									local609 = (int) ((local599.totalMemory() - local599.freeMemory()) / 1024L);
									local611 = -256;
									if (local609 > 98304) {
										if (Static321.aBoolean756) {
											Static532.method7451();
											for (local620 = 0; local620 < 10; local620++) {
												System.gc();
											}
											local609 = (int) ((local599.totalMemory() - local599.freeMemory()) / 1024L);
											if (local609 > 65536) {
												Static74.method1384("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local611 = -65536;
									}
									Static428.aClass64_11.method7504(local272, -1, local611, "Mem:" + local609 + "k", local277);
									local277 += 15;
									Static428.aClass64_11.method7504(local272, -1, -256, "In:" + Static417.anInt7626 + "B/s Out:" + Static290.anInt5465 + "B/s", local277);
									local277 += 15;
									local620 = Static600.aClass87_15.E() / 1024;
									Static428.aClass64_11.method7504(local272, -1, ~local620 < -65537 ? -65536 : -256, "Offheap:" + local620 + "k", local277);
									local277 += 15;
									local717 = 0;
									@Pc(719) int local719 = 0;
									@Pc(721) int local721 = 0;
									for (@Pc(723) int local723 = 0; local723 < 37; local723++) {
										if (Static8.aClass167_Sub1Array1[local723] != null) {
											local717 += Static8.aClass167_Sub1Array1[local723].method6960();
											local719 += Static8.aClass167_Sub1Array1[local723].method6961();
											local721 += Static8.aClass167_Sub1Array1[local723].method6959();
										}
									}
									@Pc(764) int local764 = local721 * 100 / local717;
									@Pc(770) int local770 = local719 * 10000 / local717;
									@Pc(792) String local792 = "Cache:" + Static593.method8170(true, 2, 0, (long) local770) + "% (" + local764 + "%)";
									Static573.aClass64_15.method7504(local272, -1, -256, local792, local277);
									local277 += 12;
								}
								if (Static561.anInt9276 > 0) {
									Static573.aClass64_15.method7504(local272, -1, -256, "Particles: " + Static586.anInt9638 + " / " + Static561.anInt9276, local277);
								}
								local277 += 12;
								if (Static45.aBoolean505) {
									Static573.aClass64_15.method7504(local272, -1, -256, "Polys: " + Static600.aClass87_15.I() + " Models: " + Static600.aClass87_15.M(), local277);
									local277 += 12;
									Static573.aClass64_15.method7504(local272, -1, -256, "Ls: " + Static113.anInt2174 + " La: " + Static299.anInt5574 + " NPC: " + Static121.anInt2899 + " Pl: " + Static443.anInt7853, local277);
									local277 += 12;
									Static566.method1787();
								}
								Static618.aBooleanArray50[local84] = true;
								continue;
							}
						}
						if (local16.anInt1955 == 0) {
							if (local16.anInt1940 == Static618.anInt10050 && Static600.aClass87_15.method7914()) {
								Static600.aClass87_15.method7960(local111, local117, local16.anInt1964, local16.anInt1991);
							}
							method3635(local310, arg1, local317, local84, arg4, local189, local16.anInt1968, local117 - local16.anInt2009, -local16.anInt1966 + local111, local183);
							if (local16.aClass78Array9 != null) {
								method3635(local310, local16.aClass78Array9, local317, local84, arg4, local189, local16.anInt1968, local117 - local16.anInt2009, local111 + -local16.anInt1966, local183);
							}
							@Pc(957) Class2_Sub37 local957 = (Class2_Sub37) Static206.aClass222_14.method5468((long) local16.anInt1968);
							if (local957 != null) {
								Static572.method7866(local183, local957.anInt6848, local317, local117, local189, local310, local111, local84);
							}
							if (Static618.anInt10050 == local16.anInt1940 && Static600.aClass87_15.method7914()) {
								Static600.aClass87_15.method7893();
							}
							Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
						}
						if (Static286.aBooleanArray42[local84] || Static41.anInt941 > 1) {
							if (local16.anInt1955 == 3) {
								if (local132 == 0) {
									if (local16.aBoolean170) {
										Static600.aClass87_15.aa(local111, local117, local16.anInt1964, local16.anInt1991, local16.anInt2013, 0);
									} else {
										Static600.aClass87_15.method7954(local111, local117, local16.anInt1964, local16.anInt1991, local16.anInt2013, 0);
									}
								} else if (local16.aBoolean170) {
									Static600.aClass87_15.aa(local111, local117, local16.anInt1964, local16.anInt1991, 255 - (local132 & 0xFF) << 24 | local16.anInt2013 & 0xFFFFFF, 1);
								} else {
									Static600.aClass87_15.method7954(local111, local117, local16.anInt1964, local16.anInt1991, 255 - (local132 & 0xFF) << 24 | local16.anInt2013 & 0xFFFFFF, 1);
								}
								if (Static558.aBoolean680) {
									if (arg4) {
										Static233.method3884(local59, local44, local38, local51);
									} else {
										Static495.method7076(local51, local44, local38, local59);
									}
								}
							} else if (local16.anInt1955 == 4) {
								@Pc(1100) Class64 local1100 = local16.method1699(Static600.aClass87_15);
								if (local1100 != null) {
									local277 = local16.anInt2013;
									@Pc(1116) String local1116 = local16.aString25;
									if (local16.anInt2006 != -1) {
										@Pc(1126) Class245 local1126 = Static570.aClass267_2.method6597(local16.anInt2006);
										local1116 = local1126.aString72;
										if (local1116 == null) {
											local1116 = "null";
										}
										if ((local1126.anInt7464 == 1 || local16.anInt1944 != 1) && local16.anInt1944 != -1) {
											local1116 = "<col=ff9040>" + local1116 + "</col> x" + Static189.method3428(local16.anInt1944);
										}
									}
									if (local16.anInt1976 != -1) {
										local1116 = Static174.method3222(local16.anInt1976);
										if (local1116 == null) {
											local1116 = "";
										}
									}
									if (Static97.aClass78_2 == local16) {
										local1116 = Static628.aClass369_31.method8475(Static377.anInt6756);
										local277 = local16.anInt2013;
									}
									if (Static568.aBoolean683) {
										Static600.aClass87_15.T(local111, local117, local111 + local16.anInt1964, local117 - -local16.anInt1991);
									}
									local1100.method7500(local111, local16.anInt1988, null, local16.aBoolean164 ? 255 - (local132 & 0xFF) << 24 : -1, 0, Static539.aClass20Array13, local277 | 255 - (local132 & 0xFF) << 24, local16.anInt1981, local16.anInt1991, local16.anInt1990, local117, local1116, null, local16.anInt1964, local16.anInt1997, 0);
									if (Static568.aBoolean683) {
										Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
									}
									if (local1116.trim().length() > 0) {
										if (!Static568.aBoolean683) {
											@Pc(1269) Class114 local1269 = Static307.method4722(Static600.aClass87_15, local16.anInt1975);
											local609 = local1269.method3012(local16.anInt1964, Static539.aClass20Array13, local1116);
											local611 = local1269.method3017(Static539.aClass20Array13, local16.anInt1988, local16.anInt1964, local1116);
											if (Static558.aBoolean680) {
												if (arg4) {
													Static233.method3884(local611 + local117, local117, local111, local111 + local609);
												} else {
													Static495.method7076(local609 + local111, local117, local111, local117 + local611);
												}
											}
										} else if (Static558.aBoolean680) {
											if (arg4) {
												Static233.method3884(local59, local44, local38, local51);
											} else {
												Static495.method7076(local51, local44, local38, local59);
											}
										}
									}
								} else if (Static490.aBoolean626) {
									Static397.method6022(local16);
								}
							} else {
								@Pc(1424) int local1424;
								if (local16.anInt1955 == 5) {
									if (local16.anInt1945 < 0) {
										@Pc(1371) Class20 local1371;
										if (local16.anInt2006 != -1) {
											@Pc(1353) Class163 local1353 = local16.aBoolean166 ? Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1 : null;
											local1371 = Static570.aClass267_2.method6602(local16.anInt2006, local16.anInt1953, local16.anInt1944, Static600.aClass87_15, local16.anInt1970 | 0xFF000000, local16.anInt1943, local1353);
										} else if (local16.anInt1976 == -1) {
											local1371 = local16.method1695(Static600.aClass87_15);
										} else {
											local1371 = Static470.method6759(Static600.aClass87_15, local16.anInt1976);
										}
										if (local1371 != null) {
											local277 = local1371.method4588();
											local577 = local1371.method4576();
											local1424 = 255 - (local132 & 0xFF) << 24 | (local16.anInt2013 == 0 ? 16777215 : local16.anInt2013 & 0xFFFFFF);
											if (local16.aBoolean163) {
												Static600.aClass87_15.T(local111, local117, local16.anInt1964 + local111, local117 - -local16.anInt1991);
												if (local16.anInt1994 != 0) {
													local609 = (local277 + local16.anInt1964 - 1) / local277;
													local611 = (local16.anInt1991 + local577 - 1) / local577;
													for (local620 = 0; local620 < local609; local620++) {
														for (local717 = 0; local717 < local611; local717++) {
															if (local16.anInt2013 == 0) {
																local1371.method4578((float) local277 / 2.0F + (float) (local277 * local620 + local111), (float) local577 / 2.0F + (float) (local117 + local577 * local717), 4096, local16.anInt1994);
															} else {
																local1371.method4593((float) (local277 * local620 + local111) + (float) local277 / 2.0F, (float) (local577 * local717 + local117) + (float) local577 / 2.0F, 4096, local16.anInt1994, local1424);
															}
														}
													}
												} else if (local16.anInt2013 == 0 && local132 == 0) {
													local1371.method4584(local111, local117, local16.anInt1964, local16.anInt1991);
												} else {
													local1371.method4577(local111, local117, local16.anInt1964, local16.anInt1991, 0, local1424, 1);
												}
												Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
											} else if (local16.anInt2013 == 0 && local132 == 0) {
												if (local16.anInt1994 != 0) {
													local1371.method4578((float) local16.anInt1964 / 2.0F + (float) local111, (float) local117 + (float) local16.anInt1991 / 2.0F, local16.anInt1964 * 4096 / local277, local16.anInt1994);
												} else if (local16.anInt1964 == local277 && local16.anInt1991 == local577) {
													local1371.method4582(local111, local117);
												} else {
													local1371.method4583(local111, local117, local16.anInt1964, local16.anInt1991);
												}
											} else if (local16.anInt1994 != 0) {
												local1371.method4593((float) local111 + (float) local16.anInt1964 / 2.0F, (float) local117 + (float) local16.anInt1991 / 2.0F, local16.anInt1964 * 4096 / local277, local16.anInt1994, local1424);
											} else if (local277 == local16.anInt1964 && local16.anInt1991 == local577) {
												local1371.method4581(local111, local117, 0, local1424, 1);
											} else {
												local1371.method4596(local111, local117, local16.anInt1964, local16.anInt1991, 0, local1424, 1);
											}
										} else if (Static490.aBoolean626) {
											Static397.method6022(local16);
										}
									} else {
										local16.method1702(Static571.aClass169_1, Static576.aClass343_1).method326(local117, local16.anInt1991, local16.anInt1958 << 3, local16.anInt1964, local16.anInt1952 << 3, Static600.aClass87_15, 0, 0, local111);
									}
									if (Static558.aBoolean680) {
										if (arg4) {
											Static233.method3884(local59, local44, local38, local51);
										} else {
											Static495.method7076(local51, local44, local38, local59);
										}
									}
								} else if (local16.anInt1955 == 6) {
									Static484.method6947();
									@Pc(1761) Class25 local1761 = null;
									local277 = 0;
									@Pc(1939) Class149 local1939;
									@Pc(1949) Class163 local1949;
									if (local16.anInt2006 != -1) {
										@Pc(1979) Class245 local1979 = Static570.aClass267_2.method6597(local16.anInt2006);
										if (local1979 != null) {
											local1979 = local1979.method6269(local16.anInt1944);
											local1939 = local16.anInt2003 == -1 ? null : Static185.aClass303_1.method7201(local16.anInt2003);
											local1949 = local16.aBoolean166 ? Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1 : null;
											local1761 = local1979.method6281(local1949, local1939, local16.anInt1973, 2048, local16.anInt1925, 1, local16.anInt1946, Static600.aClass87_15);
											if (local1761 == null) {
												Static397.method6022(local16);
											} else {
												local277 = -local1761.fa() >> 1;
											}
										}
									} else if (local16.anInt2002 == 5) {
										local577 = local16.anInt1962;
										if (local577 >= 0 && local577 < 2048) {
											@Pc(1787) Class11_Sub1_Sub1_Sub2_Sub1 local1787 = Static572.aClass11_Sub1_Sub1_Sub2_Sub1Array1[local577];
											@Pc(1802) Class149 local1802 = local16.anInt2003 == -1 ? null : Static185.aClass303_1.method7201(local16.anInt2003);
											if (local1787 != null && (Static182.anInt4021 == local577 || Static282.method4462(local1787.aString4) == local16.anInt1983)) {
												local1761 = local1787.aClass163_1.method4027(local16.anInt1946, 0, local16.anInt1925, null, 0, 0, null, local16.anInt1973, Static438.aClass198_1, null, Static341.aClass76_1, Static185.aClass303_1, -1, Static182.aClass140_1, 2048, Static489.aClass344_1, Static600.aClass87_15, local1802, Static570.aClass267_2);
											}
										}
									} else if (local16.anInt2002 == 8 || local16.anInt2002 == 9) {
										@Pc(1926) Class2_Sub22 local1926 = Static284.method8371(false, local16.anInt1962);
										local1939 = local16.anInt2003 == -1 ? null : Static185.aClass303_1.method7201(local16.anInt2003);
										if (local1926 != null) {
											local1949 = local16.aBoolean166 ? Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1 : null;
											local1761 = local1926.method2598(local16.anInt1946, local16.anInt2002 == 9, local16.anInt1925, local16.anInt1983, Static600.aClass87_15, local1949, local1939, local16.anInt1973);
										}
									} else if (local16.anInt2003 == -1) {
										local1761 = local16.method1700(-1, Static438.aClass198_1, null, Static489.aClass344_1, Static185.aClass303_1, 2048, Static570.aClass267_2, Static341.aClass76_1, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1, Static182.aClass140_1, Static600.aClass87_15, 0, -1);
										if (local1761 == null && Static490.aBoolean626) {
											Static397.method6022(local16);
										}
									} else {
										@Pc(1891) Class149 local1891 = Static185.aClass303_1.method7201(local16.anInt2003);
										local1761 = local16.method1700(local16.anInt1925, Static438.aClass198_1, local1891, Static489.aClass344_1, Static185.aClass303_1, 2048, Static570.aClass267_2, Static341.aClass76_1, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aClass163_1, Static182.aClass140_1, Static600.aClass87_15, local16.anInt1946, local16.anInt1973);
										if (local1761 == null && Static490.aBoolean626) {
											Static397.method6022(local16);
										}
									}
									if (local1761 != null) {
										if (local16.anInt1982 > 0) {
											local577 = (local16.anInt1964 << 9) / local16.anInt1982;
										} else {
											local577 = 512;
										}
										if (local16.anInt2015 > 0) {
											local1424 = (local16.anInt1991 << 9) / local16.anInt2015;
										} else {
											local1424 = 512;
										}
										local609 = local16.anInt1964 / 2 + local111;
										local611 = local117 + local16.anInt1991 / 2;
										if (!local16.aBoolean177) {
											local609 += local16.anInt1938 * local577 >> 9;
											local611 += local1424 * local16.anInt1977 >> 9;
										}
										Static386.aClass6_27.method6706();
										Static600.aClass87_15.method7896(Static386.aClass6_27);
										Static600.aClass87_15.DA(local609, local611, local577, local1424);
										Static600.aClass87_15.ya();
										if (local16.aBoolean176) {
											Static600.aClass87_15.C(false);
										}
										if (local16.aBoolean177) {
											Class6_Sub2.lb.method6699(local16.anInt2014);
											Class6_Sub2.lb.method6708(local16.anInt1937);
											Class6_Sub2.lb.method6711(local16.anInt1995);
											Class6_Sub2.lb.method6694(local16.anInt1938, local16.anInt1977, local16.anInt2010);
										} else {
											local620 = (local16.anInt1947 << 2) * Class353.anIntArray681[local16.anInt2014 << 3] >> 14;
											local717 = (local16.anInt1947 << 2) * Class353.anIntArray682[local16.anInt2014 << 3] >> 14;
											Class6_Sub2.lb.method6710(-local16.anInt1995 << 3);
											Class6_Sub2.lb.method6708(local16.anInt1937 << 3);
											Class6_Sub2.lb.method6694(local16.anInt1960 << 2, local620 + (local16.anInt1954 << 2) + local277, local717 - -(local16.anInt1954 << 2));
											Class6_Sub2.lb.method6705(local16.anInt2014 << 3);
										}
										local16.method1688(Static600.aClass87_15, Static325.anInt5888, local1761, Class6_Sub2.lb);
										if (Static568.aBoolean683) {
											Static600.aClass87_15.T(local111, local117, local111 + local16.anInt1964, local16.anInt1991 + local117);
										}
										if (local16.aBoolean177) {
											if (local16.aBoolean179) {
												local1761.method7725(Class6_Sub2.lb, null, local16.anInt1947, 1);
											} else {
												local1761.method7735(Class6_Sub2.lb, null, 1);
												if (local16.aClass11_Sub4_3 != null) {
													Static600.aClass87_15.method7939(local16.aClass11_Sub4_3.method2633());
												}
											}
										} else if (local16.aBoolean179) {
											local1761.method7725(Class6_Sub2.lb, null, local16.anInt1947 << 2, 1);
										} else {
											local1761.method7735(Class6_Sub2.lb, null, 1);
											if (local16.aClass11_Sub4_3 != null) {
												Static600.aClass87_15.method7939(local16.aClass11_Sub4_3.method2633());
											}
										}
										if (Static568.aBoolean683) {
											Static600.aClass87_15.KA(arg9, arg5, arg0, arg2);
										}
										if (local16.aBoolean176) {
											Static600.aClass87_15.C(true);
										}
									}
									if (Static558.aBoolean680) {
										if (arg4) {
											Static233.method3884(local59, local44, local38, local51);
										} else {
											Static495.method7076(local51, local44, local38, local59);
										}
									}
								} else if (local16.anInt1955 == 9) {
									if (local16.aBoolean175) {
										local1424 = local117;
										local277 = local16.anInt1991 + local117;
										local577 = local16.anInt1964 + local111;
									} else {
										local277 = local117;
										local577 = local16.anInt1964 + local111;
										local1424 = local16.anInt1991 + local117;
									}
									if (local16.anInt1927 == 1) {
										Static600.aClass87_15.method7906(local111, local277, local577, local1424, local16.anInt2013, 0);
									} else {
										Static600.aClass87_15.method7961(local111, local277, local577, local1424, local16.anInt2013, local16.anInt1927);
									}
									if (Static558.aBoolean680) {
										if (arg4) {
											Static233.method3884(local59, local44, local38, local51);
										} else {
											Static495.method7076(local51, local44, local38, local59);
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
