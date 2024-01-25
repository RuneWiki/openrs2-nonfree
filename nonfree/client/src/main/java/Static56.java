import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "Lclient!za;")
	public static Class50 aClass50_1;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
	public static int[] anIntArray89;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_24 = new Class27(77, -1);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method987() {
		for (@Pc(1) int local1 = 0; local1 < Static2.anInt7; local1++) {
			@Pc(6) int[] local6 = Static53.anIntArrayArray5[local1];
			for (@Pc(8) int local8 = 0; local8 < Static17.anInt315; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
	public static void method988(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static270.anInt4754;
		@Pc(3) int[] local3 = Static53.anIntArray79;
		@Pc(11) int local11 = Static182.aBoolean240 ? local1 : local1 + Static219.anInt4155;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class24_Sub3_Sub2 local23;
			if (local13 < local1) {
				local23 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) Static57.anIntArray91[local13 - local1])).aClass24_Sub3_Sub2_Sub1_2;
			}
			if (local23.aByte98 == arg0) {
				local23.anInt6266 = 0;
				if (local23.anInt6263 < 0) {
					local23.aBoolean404 = false;
				} else {
					@Pc(54) int local54 = local23.method4919();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt7092 & 0x7F) != 0 || (local23.anInt7094 & 0x7F) != 0) {
							local23.aBoolean404 = false;
							continue;
						}
					} else if ((local23.anInt7092 & 0x7F) != 64 || (local23.anInt7094 & 0x7F) != 64) {
						local23.aBoolean404 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt7092 >> 7;
						local101 = local23.anInt7094 >> 7;
						if (local23.anInt6263 != Static53.anIntArrayArray5[local96][local101]) {
							local23.aBoolean404 = true;
							continue;
						}
						if (Static215.anIntArrayArray38[local96][local101] > 1) {
							local126 = Static215.anIntArrayArray38[local96][local101]--;
							local23.aBoolean404 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt7092 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt7094 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt7092 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt7094 + local96 >> 7;
						if (!Static155.method2634(local162, local101, local23.anInt6263, local155, local169)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt6263 == Static53.anIntArrayArray5[local180][local183]) {
										local126 = Static215.anIntArrayArray38[local180][local183]--;
									}
								}
							}
							local23.aBoolean404 = true;
							continue;
						}
					}
					if (local23 instanceof Class24_Sub3_Sub2_Sub2 && local23.aClass10_Sub34_3 != null && Static400.anInt6752 >= local23.aClass10_Sub34_3.anInt5319 && Static400.anInt6752 < local23.aClass10_Sub34_3.anInt5326) {
						((Class24_Sub3_Sub2_Sub2) local23).aBoolean406 = false;
					}
					local23.aBoolean404 = false;
					local23.anInt7096 = Static326.method4459(local23.aByte98, local23.anInt7092, local23.anInt7094);
					Static10.method119(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BFFF)F")
	public static float method989(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return (arg1 - arg0) * arg2 + arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIII)V")
	private static void method990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static143.anInt2861 / (float) Static143.anInt2868;
		@Pc(11) int local11 = arg1;
		@Pc(13) int local13 = arg2;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg1 * local9);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(45) int local45 = arg0 - (arg2 - local13) / 2;
		@Pc(54) int local54 = arg3 - (arg1 - local11) / 2;
		Static370.anInt6392 = -1;
		Static90.anInt1909 = Static143.anInt2868 * local54 / local11;
		Static126.anInt2600 = -1;
		Static55.anInt999 = Static143.anInt2861 - local45 * Static143.anInt2861 / local13;
		Static14.method198();
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!za;BJ)V")
	public static void method993(@OriginalArg(0) Class50 arg0, @OriginalArg(2) long arg1) {
		Static104.anInt2115 = 0;
		Static151.anInt3117 = Static260.anInt4625;
		Static260.anInt4625 = 0;
		@Pc(14) long local14 = Static220.method3314();
		for (@Pc(19) Class40_Sub6 local19 = (Class40_Sub6) Static364.aClass240_5.method5227(); local19 != null; local19 = (Class40_Sub6) Static364.aClass240_5.method5230()) {
			if (local19.method4092(arg0, arg1)) {
				Static104.anInt2115++;
			}
		}
		if (Static262.aBoolean315 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static364.aClass240_5.method5231() + ", running: " + Static104.anInt2115 + ". Particles: " + Static260.anInt4625 + ". Time taken: " + (Static220.method3314() - local14) + "ms");
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method994() {
		Static192.anInt3853 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static219.anInt4155; local3++) {
			@Pc(14) Class24_Sub3_Sub2_Sub1 local14 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) Static57.anIntArray91[local3])).aClass24_Sub3_Sub2_Sub1_2;
			if (local14.aBoolean404 && local14.method4908() != -1) {
				@Pc(32) int local32 = (local14.method4919() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt7092 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt7094 - local32 >> 7;
				@Pc(53) Class24_Sub3_Sub2 local53 = Static350.method4748(local39, local14.aByte98, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt6228;
					if (local53 instanceof Class24_Sub3_Sub2_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt6266 == 0 && local53.method4908() != -1) {
						Static187.anIntArray377[Static192.anInt3853] = local58;
						Static150.anIntArray296[Static192.anInt3853] = local58;
						Static192.anInt3853++;
						local53.anInt6266++;
					}
					Static187.anIntArray377[Static192.anInt3853] = local58;
					Static150.anIntArray296[Static192.anInt3853] = local14.anInt6228 + 2048;
					Static192.anInt3853++;
					local53.anInt6266++;
				}
			}
		}
		Static38.method528(0, Static192.anInt3853 - 1, Static187.anIntArray377, Static150.anIntArray296);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!gh;IIIIIIIII)V")
	public static void method995(@OriginalArg(0) Class89[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class89 local6 = arg0[local1];
			if (local6 != null && local6.anInt2694 == arg1) {
				@Pc(17) int local17 = local6.anInt2678 + arg6;
				@Pc(22) int local22 = local6.anInt2721 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2727 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2703;
					@Pc(45) int local45 = local22 + local6.anInt2682;
					if (local6.anInt2727 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2727 == 0 || local6.aBoolean197 || method1002(local6).anInt5644 != 0 || local6 == Static67.aClass89_2 || local6.anInt2715 == Static356.anInt6055) {
					if (!method998(local6)) {
						if (local6 == Static458.aClass89_14) {
							Static44.aBoolean49 = true;
							Static310.anInt5396 = local17;
							Static313.anInt5430 = local22;
						}
						if (local6.aBoolean201 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean192 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class10_Sub40 local148 = (Class10_Sub40) Static72.aClass163_15.method3620(); local148 != null; local148 = (Class10_Sub40) Static72.aClass163_15.method3621()) {
									if (local148.aBoolean417) {
										local148.method6033();
										local148.aClass89_12.aBoolean196 = false;
									}
								}
								if (Static233.anInt4304 == 0) {
									Static458.aClass89_14 = null;
									Static67.aClass89_2 = null;
								}
								Static443.anInt7416 = 0;
								Static73.aBoolean105 = false;
								Static159.aBoolean219 = false;
								if (!Static35.aBoolean37) {
									Static35.method482();
								}
							}
							@Pc(204) boolean local204;
							if (Static113.aClass13_1.method4116() >= local28 && Static113.aClass13_1.method4123() >= local30 && Static113.aClass13_1.method4116() < local32 && Static113.aClass13_1.method4123() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static401.aBoolean489 && local204) {
								if (local6.anInt2718 >= 0) {
									Static40.anInt656 = local6.anInt2718;
								} else if (local6.aBoolean192) {
									Static40.anInt656 = -1;
								}
							}
							if (!Static35.aBoolean37 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static95.method1721(local6, arg9 - local22, arg8 - local17);
							}
							@Pc(248) boolean local248 = false;
							if (Static113.aClass13_1.method4115() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class10_Sub16 local263 = (Class10_Sub16) Static173.aClass163_29.method3620();
							if (local263 != null && local263.method1924() == 0 && local263.method1921() >= local28 && local263.method1923() >= local30 && local263.method1921() < local32 && local263.method1923() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray29 != null) {
								for (local296 = 0; local296 < local6.aByteArray29.length; local296++) {
									if (Static197.aClass245_1.method5907(local6.aByteArray29[local296])) {
										if (local6.anIntArray273 == null || Static400.anInt6752 >= local6.anIntArray273[local296]) {
											@Pc(328) byte local328 = local6.aByteArray28[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static197.aClass245_1.method5907(86) && !Static197.aClass245_1.method5907(82) && !Static197.aClass245_1.method5907(81)) && ((local328 & 0x2) == 0 || Static197.aClass245_1.method5907(86)) && ((local328 & 0x1) == 0 || Static197.aClass245_1.method5907(82)) && ((local328 & 0x4) == 0 || Static197.aClass245_1.method5907(81))) {
												if (local296 < 10) {
													Static344.method4661(local296 + 1, local6.anInt2677, "", -1);
												} else if (local296 == 10) {
													Static456.method6051();
													@Pc(399) Class10_Sub38 local399 = method1002(local6);
													Static382.method5564(local399.anInt5651, local399.method4502(), local6);
													Static312.aString52 = Static11.method162(local6);
													if (Static312.aString52 == null) {
														Static312.aString52 = "Null";
													}
													Static70.aString10 = local6.aString18 + "<col=ffffff>";
												}
												local430 = local6.anIntArray271[local296];
												if (local6.anIntArray273 == null) {
													local6.anIntArray273 = new int[local6.aByteArray29.length];
												}
												if (local430 == 0) {
													local6.anIntArray273[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray273[local296] = Static400.anInt6752 + local430;
												}
											}
										}
									} else if (local6.anIntArray273 != null) {
										local6.anIntArray273[local296] = 0;
									}
								}
							}
							if (local258) {
								Static57.method1016(local263.method1923() - local22, local6, local263.method1921() - local17);
							}
							if (Static458.aClass89_14 != null && Static458.aClass89_14 != local6 && local204 && method1002(local6).method4509()) {
								Static356.aClass89_10 = local6;
							}
							if (local6 == Static67.aClass89_2) {
								Static48.aBoolean51 = true;
								Static415.anInt6935 = local17;
								Static385.anInt6587 = local22;
							}
							if (local6.aBoolean197 || local6.anInt2715 != 0) {
								@Pc(515) Class10_Sub40 local515;
								if (local204 && Static93.anInt7570 != 0 && local6.anObjectArray23 != null) {
									local515 = new Class10_Sub40();
									local515.aBoolean417 = true;
									local515.aClass89_12 = local6;
									local515.anInt6386 = Static93.anInt7570;
									local515.anObjectArray36 = local6.anObjectArray23;
									Static72.aClass163_15.method3613(local515);
								}
								if (Static458.aClass89_14 != null || Static35.aBoolean37 || local6.anInt2715 != Static265.anInt4701 && Static443.anInt7416 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2715 != 0) {
									if (local6.anInt2715 == Static411.anInt6879 || local6.anInt2715 == Static337.anInt5682) {
										Static76.aClass89_3 = local6;
										if (Static378.aClass230_1 != null) {
											Static378.aClass230_1.method5129(Static412.aClass50_8, local6.anInt2682);
										}
										if (local6.anInt2715 == Static411.anInt6879) {
											if (!Static35.aBoolean37 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static309.method4271(arg9, arg8, Static412.aClass50_8);
												for (@Pc(598) Class40_Sub3 local598 = (Class40_Sub3) Static427.aClass240_7.method5227(); local598 != null; local598 = (Class40_Sub3) Static427.aClass240_7.method5230()) {
													if (arg8 >= local598.anInt2648 && arg8 < local598.anInt2647 && arg9 >= local598.anInt2646 && arg9 < local598.anInt2650) {
														Static35.method482();
														Static90.method1687(local598.aClass24_Sub3_Sub2_1);
													}
												}
											}
											Static48.method839(local22, local17, local6);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2715 == Static356.anInt6055) {
										if (local6.method2292(Static412.aClass50_8) == null || Static166.anInt3290 != 0 && Static166.anInt3290 != 3 || Static35.aBoolean37 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray272[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray270[local670]) {
											continue;
										}
										local296 -= local6.anInt2703 / 2;
										local670 -= local6.anInt2682 / 2;
										if (Static157.anInt3176 == 4) {
											local709 = (int) Static149.aFloat53 & 0x3FFF;
										} else {
											local709 = (int) Static149.aFloat53 + Static419.anInt7040 & 0x3FFF;
										}
										@Pc(721) int local721 = Class250.anIntArray675[local709];
										@Pc(725) int local725 = Class250.anIntArray674[local709];
										if (Static157.anInt3176 != 4) {
											local721 = local721 * (Static394.anInt6667 + 256) >> 8;
											local725 = local725 * (Static394.anInt6667 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static157.anInt3176 == 4) {
											local775 = (Static187.anInt3752 >> 7) + (local754 >> 2);
											local783 = (Static131.anInt2737 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static263.aClass24_Sub3_Sub2_Sub2_4.method4919() - 1) * 64;
											local775 = (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7092 - local792 >> 7) + (local754 >> 2);
											local783 = (Static263.aClass24_Sub3_Sub2_Sub2_4.anInt7094 - local792 >> 7) - (local764 >> 2);
										}
										if (Static401.aBoolean489 && (Static46.anInt880 & 0x40) != 0) {
											@Pc(825) Class89 local825 = Static397.method5275(Static219.anInt4156, Static273.anInt4773);
											if (local825 == null) {
												Static456.method6051();
											} else {
												Static260.method3744(Static312.aString52, 49, 1L, local775, false, Static24.anInt394, " ->", true, local6.anInt2670, local783);
											}
											continue;
										}
										if (Static102.aClass147_3 == Static424.aClass147_4) {
											Static260.method3744(Static121.aClass182_94.method4155(Static191.anInt3842), 48, 1L, local775, false, -1, "", true, -1, local783);
										}
										Static260.method3744(Static175.aString13, 5, 1L, local775, false, Static286.anInt5020, "", true, -1, local783);
										continue;
									}
									if (local6.anInt2715 == Static265.anInt4701) {
										Static11.aClass89_1 = local6;
										if (local204) {
											Static73.aBoolean105 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method1921() - local17 - local6.anInt2703 / 2) * 2.0D / (double) Static143.aFloat50);
											local670 = (int) -((double) (local263.method1923() - local22 - local6.anInt2682 / 2) * 2.0D / (double) Static143.aFloat50);
											local430 = Static90.anInt1909 + local296 + Static143.anInt2867;
											local709 = Static55.anInt999 + local670 + Static143.anInt2863;
											@Pc(939) Class10_Sub1_Sub2 local939 = Static363.method4867();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method197(local709, local430, local944);
											if (local944 != null) {
												if (Static197.aClass245_1.method5907(82) && Static200.anInt3974 > 0) {
													Static297.method4135(local944[2], local944[1], local944[0]);
													continue;
												}
												Static159.aBoolean219 = true;
												Static397.anInt6730 = local944[0];
												Static429.anInt7210 = local944[1];
												Static288.anInt5044 = local944[2];
											}
											Static443.anInt7416 = 1;
											Static54.aBoolean60 = false;
											Static200.anInt3972 = Static113.aClass13_1.method4116();
											Static182.anInt3704 = Static113.aClass13_1.method4123();
											continue;
										}
										if (local248 && Static443.anInt7416 > 0) {
											if (Static443.anInt7416 == 1 && (Static200.anInt3972 != Static113.aClass13_1.method4116() || Static182.anInt3704 != Static113.aClass13_1.method4123())) {
												Static349.anInt5977 = Static90.anInt1909;
												Static343.anInt5850 = Static55.anInt999;
												Static443.anInt7416 = 2;
											}
											if (Static443.anInt7416 == 2) {
												Static54.aBoolean60 = true;
												Static383.method5149(Static349.anInt5977 + (int) ((double) (Static200.anInt3972 - Static113.aClass13_1.method4116()) * 2.0D / (double) Static143.aFloat49));
												Static80.method1521(Static343.anInt5850 - (int) ((double) (Static182.anInt3704 - Static113.aClass13_1.method4123()) * 2.0D / (double) Static143.aFloat49));
											}
											continue;
										}
										if (Static443.anInt7416 > 0 && !Static54.aBoolean60) {
											if ((Static334.anInt5660 == 1 || Static282.method4003()) && Static207.anInt4055 > 2) {
												Static130.method2266(Static182.anInt3704, Static200.anInt3972);
											} else if (Static51.method865()) {
												Static130.method2266(Static182.anInt3704, Static200.anInt3972);
											}
										}
										Static443.anInt7416 = 0;
										continue;
									}
									if (local6.anInt2715 == Static288.anInt5048) {
										if (local248) {
											method990(Static113.aClass13_1.method4123() - local22, local6.anInt2703, local6.anInt2682, Static113.aClass13_1.method4116() - local17);
										}
										continue;
									}
									if (local6.anInt2715 == Static50.anInt908) {
										Static58.method1018(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean203 && local258) {
									local6.aBoolean203 = true;
									if (local6.anObjectArray33 != null) {
										local515 = new Class10_Sub40();
										local515.aBoolean417 = true;
										local515.aClass89_12 = local6;
										local515.anInt6391 = local263.method1921() - local17;
										local515.anInt6386 = local263.method1923() - local22;
										local515.anObjectArray36 = local6.anObjectArray33;
										Static72.aClass163_15.method3613(local515);
									}
								}
								if (local6.aBoolean203 && local248 && local6.anObjectArray11 != null) {
									local515 = new Class10_Sub40();
									local515.aBoolean417 = true;
									local515.aClass89_12 = local6;
									local515.anInt6391 = Static113.aClass13_1.method4116() - local17;
									local515.anInt6386 = Static113.aClass13_1.method4123() - local22;
									local515.anObjectArray36 = local6.anObjectArray11;
									Static72.aClass163_15.method3613(local515);
								}
								if (local6.aBoolean203 && !local248) {
									local6.aBoolean203 = false;
									if (local6.anObjectArray7 != null) {
										local515 = new Class10_Sub40();
										local515.aBoolean417 = true;
										local515.aClass89_12 = local6;
										local515.anInt6391 = Static113.aClass13_1.method4116() - local17;
										local515.anInt6386 = Static113.aClass13_1.method4123() - local22;
										local515.anObjectArray36 = local6.anObjectArray7;
										Static353.aClass163_39.method3613(local515);
									}
								}
								if (local248 && local6.anObjectArray4 != null) {
									local515 = new Class10_Sub40();
									local515.aBoolean417 = true;
									local515.aClass89_12 = local6;
									local515.anInt6391 = Static113.aClass13_1.method4116() - local17;
									local515.anInt6386 = Static113.aClass13_1.method4123() - local22;
									local515.anObjectArray36 = local6.anObjectArray4;
									Static72.aClass163_15.method3613(local515);
								}
								if (!local6.aBoolean196 && local204) {
									local6.aBoolean196 = true;
									if (local6.anObjectArray24 != null) {
										local515 = new Class10_Sub40();
										local515.aBoolean417 = true;
										local515.aClass89_12 = local6;
										local515.anInt6391 = Static113.aClass13_1.method4116() - local17;
										local515.anInt6386 = Static113.aClass13_1.method4123() - local22;
										local515.anObjectArray36 = local6.anObjectArray24;
										Static72.aClass163_15.method3613(local515);
									}
								}
								if (local6.aBoolean196 && local204 && local6.anObjectArray20 != null) {
									local515 = new Class10_Sub40();
									local515.aBoolean417 = true;
									local515.aClass89_12 = local6;
									local515.anInt6391 = Static113.aClass13_1.method4116() - local17;
									local515.anInt6386 = Static113.aClass13_1.method4123() - local22;
									local515.anObjectArray36 = local6.anObjectArray20;
									Static72.aClass163_15.method3613(local515);
								}
								if (local6.aBoolean196 && !local204) {
									local6.aBoolean196 = false;
									if (local6.anObjectArray28 != null) {
										local515 = new Class10_Sub40();
										local515.aBoolean417 = true;
										local515.aClass89_12 = local6;
										local515.anInt6391 = Static113.aClass13_1.method4116() - local17;
										local515.anInt6386 = Static113.aClass13_1.method4123() - local22;
										local515.anObjectArray36 = local6.anObjectArray28;
										Static353.aClass163_39.method3613(local515);
									}
								}
								if (local6.anObjectArray30 != null) {
									local515 = new Class10_Sub40();
									local515.aClass89_12 = local6;
									local515.anObjectArray36 = local6.anObjectArray30;
									Static292.aClass163_34.method3613(local515);
								}
								@Pc(1483) Class10_Sub40 local1483;
								if (local6.anObjectArray27 != null && Static374.anInt6425 > local6.anInt2726) {
									if (local6.anIntArray267 == null || Static374.anInt6425 - local6.anInt2726 > 32) {
										local515 = new Class10_Sub40();
										local515.aClass89_12 = local6;
										local515.anObjectArray36 = local6.anObjectArray27;
										Static72.aClass163_15.method3613(local515);
									} else {
										label678: for (local296 = local6.anInt2726; local296 < Static374.anInt6425; local296++) {
											local670 = Static236.anIntArray428[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray267.length; local430++) {
												if (local6.anIntArray267[local430] == local670) {
													local1483 = new Class10_Sub40();
													local1483.aClass89_12 = local6;
													local1483.anObjectArray36 = local6.anObjectArray27;
													Static72.aClass163_15.method3613(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2726 = Static374.anInt6425;
								}
								if (local6.anObjectArray5 != null && Static43.anInt727 > local6.anInt2702) {
									if (local6.anIntArray274 == null || Static43.anInt727 - local6.anInt2702 > 32) {
										local515 = new Class10_Sub40();
										local515.aClass89_12 = local6;
										local515.anObjectArray36 = local6.anObjectArray5;
										Static72.aClass163_15.method3613(local515);
									} else {
										label654: for (local296 = local6.anInt2702; local296 < Static43.anInt727; local296++) {
											local670 = Static93.anIntArray749[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray274.length; local430++) {
												if (local6.anIntArray274[local430] == local670) {
													local1483 = new Class10_Sub40();
													local1483.aClass89_12 = local6;
													local1483.anObjectArray36 = local6.anObjectArray5;
													Static72.aClass163_15.method3613(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2702 = Static43.anInt727;
								}
								if (local6.anObjectArray31 != null && Static76.anInt1552 > local6.anInt2679) {
									if (local6.anIntArray265 == null || Static76.anInt1552 - local6.anInt2679 > 32) {
										local515 = new Class10_Sub40();
										local515.aClass89_12 = local6;
										local515.anObjectArray36 = local6.anObjectArray31;
										Static72.aClass163_15.method3613(local515);
									} else {
										label630: for (local296 = local6.anInt2679; local296 < Static76.anInt1552; local296++) {
											local670 = Static422.anIntArray683[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray265.length; local430++) {
												if (local6.anIntArray265[local430] == local670) {
													local1483 = new Class10_Sub40();
													local1483.aClass89_12 = local6;
													local1483.anObjectArray36 = local6.anObjectArray31;
													Static72.aClass163_15.method3613(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2679 = Static76.anInt1552;
								}
								if (local6.anObjectArray8 != null && Static253.anInt4566 > local6.anInt2695) {
									if (local6.anIntArray266 == null || Static253.anInt4566 - local6.anInt2695 > 32) {
										local515 = new Class10_Sub40();
										local515.aClass89_12 = local6;
										local515.anObjectArray36 = local6.anObjectArray8;
										Static72.aClass163_15.method3613(local515);
									} else {
										label606: for (local296 = local6.anInt2695; local296 < Static253.anInt4566; local296++) {
											local670 = Static48.anIntArray71[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray266.length; local430++) {
												if (local6.anIntArray266[local430] == local670) {
													local1483 = new Class10_Sub40();
													local1483.aClass89_12 = local6;
													local1483.anObjectArray36 = local6.anObjectArray8;
													Static72.aClass163_15.method3613(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2695 = Static253.anInt4566;
								}
								if (local6.anObjectArray14 != null && Static180.anInt3686 > local6.lb) {
									if (local6.anIntArray268 == null || Static180.anInt3686 - local6.lb > 32) {
										local515 = new Class10_Sub40();
										local515.aClass89_12 = local6;
										local515.anObjectArray36 = local6.anObjectArray14;
										Static72.aClass163_15.method3613(local515);
									} else {
										label582: for (local296 = local6.lb; local296 < Static180.anInt3686; local296++) {
											local670 = Static50.anIntArray73[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray268.length; local430++) {
												if (local6.anIntArray268[local430] == local670) {
													local1483 = new Class10_Sub40();
													local1483.aClass89_12 = local6;
													local1483.anObjectArray36 = local6.anObjectArray14;
													Static72.aClass163_15.method3613(local1483);
													break label582;
												}
											}
										}
									}
									local6.lb = Static180.anInt3686;
								}
								if (Static277.anInt4825 > local6.anInt2666 && local6.anObjectArray17 != null) {
									local515 = new Class10_Sub40();
									local515.aClass89_12 = local6;
									local515.anObjectArray36 = local6.anObjectArray17;
									Static72.aClass163_15.method3613(local515);
								}
								if (Static320.anInt5509 > local6.anInt2666 && local6.anObjectArray29 != null) {
									local515 = new Class10_Sub40();
									local515.aClass89_12 = local6;
									local515.anObjectArray36 = local6.anObjectArray29;
									Static72.aClass163_15.method3613(local515);
								}
								if (Static20.anInt356 > local6.anInt2666 && local6.anObjectArray13 != null) {
									local515 = new Class10_Sub40();
									local515.aClass89_12 = local6;
									local515.anObjectArray36 = local6.anObjectArray13;
									Static72.aClass163_15.method3613(local515);
								}
								if (Static281.anInt6556 > local6.anInt2666 && local6.anObjectArray16 != null) {
									local515 = new Class10_Sub40();
									local515.aClass89_12 = local6;
									local515.anObjectArray36 = local6.anObjectArray16;
									Static72.aClass163_15.method3613(local515);
								}
								if (Static80.anInt1678 > local6.anInt2666 && local6.anObjectArray6 != null) {
									local515 = new Class10_Sub40();
									local515.aClass89_12 = local6;
									local515.anObjectArray36 = local6.anObjectArray6;
									Static72.aClass163_15.method3613(local515);
								}
								local6.anInt2666 = Static193.anInt3856;
								if (local6.anObjectArray15 != null) {
									for (local296 = 0; local296 < Static35.anInt574; local296++) {
										@Pc(1951) Class10_Sub40 local1951 = new Class10_Sub40();
										local1951.aClass89_12 = local6;
										local1951.anInt6384 = Static121.aClass3Array1[local296].method3434();
										local1951.anInt6387 = Static121.aClass3Array1[local296].method3429();
										local1951.anObjectArray36 = local6.anObjectArray15;
										Static72.aClass163_15.method3613(local1951);
									}
								}
								if (Static366.aBoolean409 && local6.anObjectArray32 != null) {
									local515 = new Class10_Sub40();
									local515.aClass89_12 = local6;
									local515.anObjectArray36 = local6.anObjectArray32;
									Static72.aClass163_15.method3613(local515);
								}
							}
							if (local6.anInt2727 == 5 && local6.anInt2744 != -1) {
								local6.method2290(Static88.aClass47_2, Static314.aClass158_1).method5129(Static412.aClass50_8, local6.anInt2682);
							}
							Static105.method1848(local6);
							if (local6.anInt2727 == 0) {
								method995(arg0, local6.anInt2677, local28, local30, local32, local34, local17 - local6.anInt2725, local22 - local6.anInt2699, arg8, arg9);
								if (local6.aClass89Array1 != null) {
									method995(local6.aClass89Array1, local6.anInt2677, local28, local30, local32, local34, local17 - local6.anInt2725, local22 - local6.anInt2699, arg8, arg9);
								}
								@Pc(2073) Class10_Sub21 local2073 = (Class10_Sub21) Static114.aClass167_12.method3709((long) local6.anInt2677);
								if (local2073 != null) {
									if (Static102.aClass147_3 == Static53.aClass147_2 && local2073.anInt3643 == 0 && !Static35.aBoolean37 && local204 && !Static372.aBoolean418) {
										Static35.method482();
									}
									Static308.method4264(arg9, local17, local34, local28, local22, local2073.anInt3646, local30, arg8, local32);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static105.method1848(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!gh;)Z")
	public static boolean method998(@OriginalArg(0) Class89 arg0) {
		if (Static372.aBoolean418) {
			if (method1002(arg0).anInt5644 != 0) {
				return false;
			}
			if (arg0.anInt2727 == 0) {
				return false;
			}
		}
		return arg0.aBoolean198;
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method999(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static270.anInt4754;
		@Pc(3) int[] local3 = Static53.anIntArray79;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static219.anInt4155; local5++) {
			@Pc(15) Class24_Sub3_Sub2 local15;
			if (local5 < local1) {
				local15 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) Static57.anIntArray91[local5 - local1])).aClass24_Sub3_Sub2_Sub1_2;
			}
			if (local15.aByte98 == arg0 && local15.anInt6263 >= 0) {
				@Pc(39) int local39 = local15.method4919();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt7092 & 0x7F) != 0 || (local15.anInt7094 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7092 & 0x7F) != 64 || (local15.anInt7094 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt7092 >> 7;
					local80 = local15.anInt7094 >> 7;
					if (local15.anInt6263 > Static53.anIntArrayArray5[local75][local80]) {
						Static53.anIntArrayArray5[local75][local80] = local15.anInt6263;
						Static215.anIntArrayArray38[local75][local80] = 1;
					} else if (local15.anInt6263 == Static53.anIntArrayArray5[local75][local80]) {
						local116 = Static215.anIntArrayArray38[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt7092 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt7094 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt7092 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt7094 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt6263 > Static53.anIntArrayArray5[local158][local161]) {
								Static53.anIntArrayArray5[local158][local161] = local15.anInt6263;
								Static215.anIntArrayArray38[local158][local161] = 1;
							} else if (local15.anInt6263 == Static53.anIntArrayArray5[local158][local161]) {
								local116 = Static215.anIntArrayArray38[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1000() {
		@Pc(1) int local1 = Static270.anInt4754;
		@Pc(3) int[] local3 = Static53.anIntArray79;
		@Pc(11) int local11 = Static182.aBoolean240 ? local1 : local1 + Static219.anInt4155;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class24_Sub3_Sub2 local23;
			if (local13 < local1) {
				local23 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) Static57.anIntArray91[local13 - local1])).aClass24_Sub3_Sub2_Sub1_2;
			}
			if (local23.anInt6263 >= 0) {
				@Pc(43) int local43 = local23.method4919();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt7092 & 0x7F) == 0 && (local23.anInt7094 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7092 & 0x7F) == 64 && (local23.anInt7094 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class24_Sub3_Sub2_Sub2 && local23.aClass10_Sub34_3 != null && Static400.anInt6752 >= local23.aClass10_Sub34_3.anInt5319 && Static400.anInt6752 < local23.aClass10_Sub34_3.anInt5326) {
					((Class24_Sub3_Sub2_Sub2) local23).aBoolean406 = false;
				}
				local23.anInt7096 = Static326.method4459(local23.aByte98, local23.anInt7092, local23.anInt7094);
				Static10.method119(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!gh;)Lclient!qm;")
	public static Class10_Sub38 method1002(@OriginalArg(0) Class89 arg0) {
		@Pc(13) Class10_Sub38 local13 = (Class10_Sub38) Static25.aClass167_7.method3709(((long) arg0.anInt2677 << 32) + (long) arg0.anInt2720);
		return local13 == null ? arg0.aClass10_Sub38_1 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1004() {
		@Pc(1) int local1 = Static270.anInt4754;
		@Pc(3) int[] local3 = Static53.anIntArray79;
		@Pc(20) boolean local20 = Static361.aClass85_Sub1_1.anInt2489 == 1 && local1 > 200 || Static361.aClass85_Sub1_1.anInt2489 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class24_Sub3_Sub2_Sub2 local29 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local3[local22]];
			if (local29.method4924()) {
				local29.method5580();
				if (local29.aShort107 >= 0 && local29.aShort105 >= 0 && local29.aShort106 < Static2.anInt7 && local29.aShort104 < Static17.anInt315) {
					local29.aBoolean406 = local29.aBoolean403 ? local20 : false;
					if (local29 == Static263.aClass24_Sub3_Sub2_Sub2_4) {
						local29.anInt6263 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean404) {
							local75++;
						}
						if (local29.anInt6253 > Static400.anInt6752) {
							local75 += 2;
						}
						local75 += 5 - local29.method4919() << 2;
						if (local29.aBoolean408) {
							local75 += 512;
						} else {
							if (Static227.anInt3925 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt6263 = local75 + 1;
					}
				} else {
					local29.anInt6263 = -1;
				}
			} else {
				local29.anInt6263 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static219.anInt4155; local116++) {
			@Pc(127) Class24_Sub3_Sub2_Sub1 local127 = ((Class10_Sub26) Static424.aClass167_33.method3709((long) Static57.anIntArray91[local116])).aClass24_Sub3_Sub2_Sub1_2;
			if (local127.method2890() && local127.aClass222_1.method4946(Static329.aClass201_9)) {
				local127.method5580();
				if (local127.aShort107 >= 0 && local127.aShort105 >= 0 && local127.aShort106 < Static2.anInt7 && local127.aShort104 < Static17.anInt315) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean404) {
						local164++;
					}
					if (local127.anInt6253 > Static400.anInt6752) {
						local164 += 2;
					}
					local164 += 5 - local127.method4919() << 2;
					if (Static227.anInt3925 == 0) {
						if (local127.aClass222_1.aBoolean416) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static227.anInt3925 == 1) {
						if (local127.aClass222_1.aBoolean416) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass222_1.aBoolean413) {
						local164 += 1024;
					} else if (!local127.aClass222_1.aBoolean410) {
						local164 += 256;
					}
					local127.anInt6263 = local164 + 1;
				} else {
					local127.anInt6263 = -1;
				}
			} else {
				local127.anInt6263 = -1;
			}
		}
		for (local75 = 0; local75 < Static362.aClass65Array1.length; local75++) {
			@Pc(230) Class65 local230 = Static362.aClass65Array1[local75];
			if (local230 != null) {
				if (local230.anInt1850 == 1) {
					@Pc(244) Class10_Sub26 local244 = (Class10_Sub26) Static424.aClass167_33.method3709((long) local230.anInt1856);
					if (local244 != null) {
						@Pc(249) Class24_Sub3_Sub2_Sub1 local249 = local244.aClass24_Sub3_Sub2_Sub1_2;
						if (local249.anInt6263 >= 0) {
							local249.anInt6263 += 2048;
						}
					}
				} else if (local230.anInt1850 == 10) {
					@Pc(268) Class24_Sub3_Sub2_Sub2 local268 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local230.anInt1856];
					if (local268 != null && local268 != Static263.aClass24_Sub3_Sub2_Sub2_4 && local268.anInt6263 >= 0) {
						local268.anInt6263 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!gh;)Lclient!gh;")
	public static Class89 method1005(@OriginalArg(0) Class89 arg0) {
		@Pc(4) int local4 = method1002(arg0).method4501();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static40.method557(arg0.anInt2694);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IBI)Z")
	public static boolean method1009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x180) != 0;
	}
}
