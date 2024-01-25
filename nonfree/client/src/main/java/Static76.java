import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "Lclient!hca;")
	public static Class139 aClass139_2;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_59 = new Class194(60, 6);

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "[I")
	public static int[] anIntArray107 = new int[2];

	@OriginalMember(owner = "client!client", name = "wb", descriptor = "F")
	public static float aFloat25 = 1.0F;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!uv;)Lclient!uia;")
	public static Class3_Sub50 method1311(@OriginalArg(0) Class344 arg0) {
		@Pc(13) Class3_Sub50 local13 = (Class3_Sub50) Static389.aClass25_29.method426(((long) arg0.anInt9571 << 32) + (long) arg0.anInt9586);
		return local13 == null ? arg0.aClass3_Sub50_3 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1312() {
		for (@Pc(1) int local1 = 0; local1 < Static399.anInt7121; local1++) {
			@Pc(6) int[] local6 = Static273.anIntArrayArray24[local1];
			for (@Pc(8) int local8 = 0; local8 < Static24.anInt345; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
	public static void method1315(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static174.anInt3362;
		@Pc(3) int[] local3 = Static495.anIntArray529;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static596.anInt9702; local5++) {
			@Pc(15) Class9_Sub2_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local3[local5]];
			} else {
				local15 = ((Class3_Sub43) Static545.aClass25_40.method426((long) Static43.anIntArray50[local5 - local1])).aClass9_Sub2_Sub1_Sub2_Sub2_2;
			}
			if (local15.aByte127 == arg0 && local15.anInt10208 >= 0) {
				@Pc(39) int local39 = local15.method8619();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt10152 & 0x1FF) != 0 || (local15.anInt10158 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt10152 & 0x1FF) != 256 || (local15.anInt10158 & 0x1FF) != 256) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt10152 >> 9;
					local80 = local15.anInt10158 >> 9;
					if (local15.anInt10208 > Static273.anIntArrayArray24[local75][local80]) {
						Static273.anIntArrayArray24[local75][local80] = local15.anInt10208;
						Static314.anIntArrayArray25[local75][local80] = 1;
					} else if (local15.anInt10208 == Static273.anIntArrayArray24[local75][local80]) {
						local116 = Static314.anIntArrayArray25[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 256 + 60;
					local80 = local15.anInt10152 - local75 >> 9;
					@Pc(142) int local142 = local15.anInt10158 - local75 >> 9;
					@Pc(149) int local149 = local15.anInt10152 + local75 >> 9;
					@Pc(156) int local156 = local15.anInt10158 + local75 >> 9;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt10208 > Static273.anIntArrayArray24[local158][local161]) {
								Static273.anIntArrayArray24[local158][local161] = local15.anInt10208;
								Static314.anIntArrayArray25[local158][local161] = 1;
							} else if (local15.anInt10208 == Static273.anIntArrayArray24[local158][local161]) {
								local116 = Static314.anIntArrayArray25[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1317() {
		Static260.anInt5076 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static596.anInt9702; local3++) {
			@Pc(14) Class9_Sub2_Sub1_Sub2_Sub2 local14 = ((Class3_Sub43) Static545.aClass25_40.method426((long) Static43.anIntArray50[local3])).aClass9_Sub2_Sub1_Sub2_Sub2_2;
			if (local14.aBoolean772 && local14.method8627() != -1) {
				@Pc(32) int local32 = (local14.method8619() - 1) * 256 + 252;
				@Pc(39) int local39 = local14.anInt10152 - local32 >> 9;
				@Pc(46) int local46 = local14.anInt10158 - local32 >> 9;
				@Pc(53) Class9_Sub2_Sub1_Sub2 local53 = Static337.method5432(local39, local14.aByte127, local46);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt10204;
					if (local53 instanceof Class9_Sub2_Sub1_Sub2_Sub2) {
						local58 += 2048;
					}
					if (local53.anInt10176 == 0 && local53.method8627() != -1) {
						Static166.anIntArray203[Static260.anInt5076] = local58;
						Static199.anIntArray218[Static260.anInt5076] = local58;
						Static260.anInt5076++;
						local53.anInt10176++;
					}
					Static166.anIntArray203[Static260.anInt5076] = local58;
					Static199.anIntArray218[Static260.anInt5076] = local14.anInt10204 + 2048;
					Static260.anInt5076++;
					local53.anInt10176++;
				}
			}
		}
		Static305.method5148(Static166.anIntArray203, Static260.anInt5076 - 1, Static199.anIntArray218, 0);
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)[Lclient!rg;")
	public static Class293[] method1319() {
		return new Class293[] { Static527.aClass293_10, Static406.aClass293_7, Static595.aClass293_13 };
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1320(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static174.anInt3362;
		@Pc(3) int[] local3 = Static495.anIntArray529;
		@Pc(11) int local11 = Static536.aBoolean672 ? local1 : local1 + Static596.anInt9702;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class9_Sub2_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub43) Static545.aClass25_40.method426((long) Static43.anIntArray50[local13 - local1])).aClass9_Sub2_Sub1_Sub2_Sub2_2;
			}
			if (local23.aByte127 == arg0) {
				local23.anInt10176 = 0;
				if (local23.anInt10208 < 0) {
					local23.aBoolean772 = false;
				} else {
					@Pc(54) int local54 = local23.method8619();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt10152 & 0x1FF) != 0 || (local23.anInt10158 & 0x1FF) != 0) {
							local23.aBoolean772 = false;
							continue;
						}
					} else if ((local23.anInt10152 & 0x1FF) != 256 || (local23.anInt10158 & 0x1FF) != 256) {
						local23.aBoolean772 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt10152 >> 9;
						local101 = local23.anInt10158 >> 9;
						if (local23.anInt10208 != Static273.anIntArrayArray24[local96][local101]) {
							local23.aBoolean772 = true;
							continue;
						}
						if (Static314.anIntArrayArray25[local96][local101] > 1) {
							local126 = Static314.anIntArrayArray25[local96][local101]--;
							local23.aBoolean772 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 256 + 252;
						local101 = local23.anInt10152 - local96 >> 9;
						@Pc(155) int local155 = local23.anInt10158 - local96 >> 9;
						@Pc(162) int local162 = local23.anInt10152 + local96 >> 9;
						@Pc(169) int local169 = local23.anInt10158 + local96 >> 9;
						if (!Static180.method2958(local169, local23.anInt10208, local162, local155, local101)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt10208 == Static273.anIntArrayArray24[local180][local183]) {
										local126 = Static314.anIntArrayArray25[local180][local183]--;
									}
								}
							}
							local23.aBoolean772 = true;
							continue;
						}
					}
					local23.aBoolean772 = false;
					local23.anInt10154 = Static594.method8211(local23.anInt10152, local23.anInt10158, local23.aByte127);
					Static627.method8508(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!uv;)Lclient!uv;")
	public static Class344 method1321(@OriginalArg(0) Class344 arg0) {
		@Pc(4) int local4 = method1311(arg0).method8090();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static324.method5363(arg0.anInt9632);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!uv;IIIIIIIIIII)V")
	public static void method1322(@OriginalArg(0) Class344[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label800: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class344 local6 = arg0[local1];
			if (local6 != null && local6.anInt9632 == arg1) {
				@Pc(17) int local17 = local6.anInt9569 + arg6;
				@Pc(22) int local22 = local6.anInt9573 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(40) int local40;
				@Pc(45) int local45;
				if (local6.anInt9554 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					local40 = local17 + local6.anInt9546;
					local45 = local22 + local6.anInt9602;
					if (local6.anInt9554 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt9554 == 0 || local6.aBoolean716 || method1311(local6).anInt9447 != 0 || local6 == Static495.aClass344_11 || local6.anInt9604 == Static587.anInt9531 || local6.anInt9604 == Static64.anInt1104) {
					if (!method1324(local6)) {
						local40 = 0;
						local45 = 0;
						if (Static80.aBoolean118) {
							local40 = Static211.method3297();
							local45 = Static551.method7856();
						}
						if (local6 == Static429.aClass344_9 && Static494.method7226(Static429.aClass344_9) != null) {
							Static377.aBoolean497 = true;
							Static275.anInt5304 = local17;
							Static6.anInt79 = local22;
						}
						if (local6.aBoolean725 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean727 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								for (@Pc(168) Class3_Sub36 local168 = (Class3_Sub36) Static361.aClass216_48.method5457(); local168 != null; local168 = (Class3_Sub36) Static361.aClass216_48.method5458()) {
									if (local168.aBoolean504) {
										local168.method8682();
										local168.aClass344_6.aBoolean723 = false;
									}
								}
								if (Static206.anInt3779 == 0) {
									Static429.aClass344_9 = null;
									Static495.aClass344_11 = null;
								}
								Static348.anInt6494 = 0;
								Static406.aBoolean515 = false;
								Static227.aBoolean337 = false;
								if (!Static253.aBoolean362) {
									Static638.method8582();
								}
							}
							@Pc(232) boolean local232;
							if (Static281.aClass49_1.method2426() + local40 >= local28 && Static281.aClass49_1.method2429() + local45 >= local30 && Static281.aClass49_1.method2426() + local40 < local32 && Static281.aClass49_1.method2429() + local45 < local34) {
								local232 = true;
							} else {
								local232 = false;
							}
							if (!Static425.aBoolean536 && local232) {
								if (local6.anInt9547 >= 0) {
									Static80.anInt1600 = local6.anInt9547;
								} else if (local6.aBoolean727) {
									Static80.anInt1600 = -1;
								}
							}
							if (!Static253.aBoolean362 && arg10 >= local28 && arg11 >= local30 && arg10 < local32 && arg11 < local34) {
								Static235.method4015(arg11 - local22, arg10 - local17, local6);
							}
							@Pc(276) boolean local276 = false;
							if (Static281.aClass49_1.method2433() && local232) {
								local276 = true;
							}
							@Pc(286) boolean local286 = false;
							@Pc(291) Class3_Sub21 local291 = (Class3_Sub21) Static172.aClass216_29.method5457();
							if (local291 != null && local291.method5059() == 0 && local291.method5064() + local40 >= local28 && local291.method5060() + local45 >= local30 && local291.method5064() + local40 < local32 && local291.method5060() + local45 < local34) {
								local286 = true;
							}
							@Pc(335) int local335;
							@Pc(469) int local469;
							if (local6.aByteArray95 != null && !Static204.method3222()) {
								for (local335 = 0; local335 < local6.aByteArray95.length; local335++) {
									if (Static476.aClass62_2.method1421(local6.aByteArray95[local335])) {
										if (local6.anIntArray604 == null || Static304.anInt8391 >= local6.anIntArray604[local335]) {
											@Pc(367) byte local367 = local6.aByteArray96[local335];
											if (local367 == 0 || ((local367 & 0x8) == 0 || !Static476.aClass62_2.method1421(86) && !Static476.aClass62_2.method1421(82) && !Static476.aClass62_2.method1421(81)) && ((local367 & 0x2) == 0 || Static476.aClass62_2.method1421(86)) && ((local367 & 0x1) == 0 || Static476.aClass62_2.method1421(82)) && ((local367 & 0x4) == 0 || Static476.aClass62_2.method1421(81))) {
												if (local335 < 10) {
													Static554.method7878(-1, "", local335 + 1, local6.anInt9571);
												} else if (local335 == 10) {
													Static409.method6364();
													@Pc(438) Class3_Sub50 local438 = method1311(local6);
													Static163.method2789(local6, local438.anInt9448, local438.method8089());
													Static323.aString46 = Static374.method5191(local6);
													if (Static323.aString46 == null) {
														Static323.aString46 = "Null";
													}
													Static372.aString48 = local6.aString93 + "<col=ffffff>";
												}
												local469 = local6.anIntArray599[local335];
												if (local6.anIntArray604 == null) {
													local6.anIntArray604 = new int[local6.aByteArray95.length];
												}
												if (local469 == 0) {
													local6.anIntArray604[local335] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray604[local335] = Static304.anInt8391 + local469;
												}
											}
										}
									} else if (local6.anIntArray604 != null) {
										local6.anIntArray604[local335] = 0;
									}
								}
							}
							if (local286) {
								Static390.method6096(local45 + local291.method5060() - local22, local40 + local291.method5064() - local17, local6);
							}
							if (Static429.aClass344_9 != null && Static429.aClass344_9 != local6 && local232 && method1311(local6).method8092()) {
								Static554.aClass344_13 = local6;
							}
							if (local6 == Static495.aClass344_11) {
								Static28.aBoolean21 = true;
								Static355.anInt10009 = local17;
								Static322.anInt6165 = local22;
							}
							if (local6.aBoolean716 || local6.anInt9604 != 0) {
								@Pc(558) Class3_Sub36 local558;
								if (local232 && Static548.anInt9874 != 0 && local6.anObjectArray3 != null) {
									local558 = new Class3_Sub36();
									local558.aBoolean504 = true;
									local558.aClass344_6 = local6;
									local558.anInt6956 = Static548.anInt9874;
									local558.anObjectArray1 = local6.anObjectArray3;
									Static361.aClass216_48.method5449(local558);
								}
								if (Static429.aClass344_9 != null || Static253.aBoolean362 || local6.anInt9604 != Static280.anInt5388 && Static348.anInt6494 > 0) {
									local286 = false;
									local276 = false;
									local232 = false;
								}
								@Pc(708) int local708;
								if (local6.anInt9604 != 0) {
									if (local6.anInt9604 == Static601.anInt9746 || local6.anInt9604 == Static282.anInt5419) {
										Static529.aClass344_12 = local6;
										if (Static626.aClass137_1 != null) {
											Static626.aClass137_1.method3192(local6.anInt9602, Static266.aClass82_8);
										}
										if (local6.anInt9604 == Static601.anInt9746) {
											if (Static253.aBoolean362 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
												continue;
											}
											Static170.method2823(arg8, Static266.aClass82_8, arg9);
											@Pc(641) Class9_Sub9 local641 = (Class9_Sub9) Static371.aClass139_9.method3198();
											while (true) {
												if (local641 == null) {
													continue label800;
												}
												if (arg10 >= local641.anInt6858 && arg10 < local641.anInt6859 && arg11 >= local641.anInt6860 && arg11 < local641.anInt6862) {
													Static638.method8582();
													Static196.method3130(local641.aClass9_Sub2_Sub1_Sub2_1);
												}
												local641 = (Class9_Sub9) Static371.aClass139_9.method3205();
											}
										}
									}
									@Pc(747) int local747;
									if (local6.anInt9604 == Static587.anInt9531) {
										if (local6.method8166(Static266.aClass82_8) == null || Static322.anInt6163 != 0 && Static322.anInt6163 != 3 || Static253.aBoolean362 || arg10 < local28 || arg11 < local30 || arg10 >= local32 || arg11 >= local34) {
											continue;
										}
										local335 = arg10 - local17;
										local708 = arg11 - local22;
										local469 = local6.anIntArray602[local708];
										if (local335 < local469 || local335 > local469 + local6.anIntArray600[local708]) {
											continue;
										}
										local335 -= local6.anInt9546 / 2;
										local708 -= local6.anInt9602 / 2;
										if (Static471.anInt8064 == 4) {
											local747 = (int) Static170.aFloat71 & 0x3FFF;
										} else {
											local747 = (int) Static170.aFloat71 + Static579.anInt9458 & 0x3FFF;
										}
										@Pc(759) int local759 = Class3_Sub13.anIntArray147[local747];
										@Pc(763) int local763 = Class3_Sub13.anIntArray146[local747];
										if (Static471.anInt8064 != 4) {
											local759 = local759 * (Static296.anInt5883 + 256) >> 8;
											local763 = local763 * (Static296.anInt5883 + 256) >> 8;
										}
										@Pc(792) int local792 = local708 * local759 + local335 * local763 >> 14;
										@Pc(802) int local802 = local708 * local763 - local335 * local759 >> 14;
										@Pc(813) int local813;
										@Pc(821) int local821;
										if (Static471.anInt8064 == 4) {
											local813 = (Static49.anInt971 >> 9) + (local792 >> 2);
											local821 = (Static528.anInt8946 >> 9) - (local802 >> 2);
										} else {
											@Pc(830) int local830 = (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.method8619() - 1) * 256;
											local813 = (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 - local830 >> 9) + (local792 >> 2);
											local821 = (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 - local830 >> 9) - (local802 >> 2);
										}
										if (Static425.aBoolean536 && (Static95.anInt1910 & 0x40) != 0) {
											@Pc(863) Class344 local863 = Static258.method4328(Static491.anInt8353, Static260.anInt5074);
											if (local863 == null) {
												Static409.method6364();
											} else {
												Static139.method2380(true, Static551.anInt9151, false, local6.anInt9567, " ->", (long) (local6.anInt9586 << 0 | local6.anInt9571), true, local821, 1L, local813, 58, Static323.aString46);
											}
											continue;
										}
										if (Static431.aClass133_11 == Static300.aClass133_17) {
											Static139.method2380(true, -1, false, -1, "", 0L, true, local821, 1L, local813, 59, Static369.aClass235_30.method5893(Static455.anInt7738));
										}
										Static139.method2380(true, Static90.anInt8334, false, -1, "", 0L, true, local821, 1L, local813, 8, Static461.aString68);
										continue;
									}
									if (local6.anInt9604 == Static280.anInt5388) {
										Static165.aClass344_4 = local6;
										if (local232) {
											Static406.aBoolean515 = true;
										}
										if (local286) {
											local335 = (int) ((double) (local40 + local291.method5064() - local17 - local6.anInt9546 / 2) * 2.0D / (double) Static598.aFloat67);
											local708 = (int) -((double) (local45 + local291.method5060() - local22 - local6.anInt9602 / 2) * 2.0D / (double) Static598.aFloat67);
											local469 = Static122.anInt2649 + local335 + Static598.anInt2992;
											local747 = Static168.anInt3275 + local708 + Static598.anInt2995;
											@Pc(994) Class3_Sub7_Sub6 local994 = Static321.method5308();
											if (local994 == null) {
												continue;
											}
											@Pc(999) int[] local999 = new int[3];
											local994.method1569(local999, local469, local747);
											if (local999 != null) {
												if (Static476.aClass62_2.method1421(82) && Static544.anInt9130 > 0) {
													Static99.method7008(local999[0], local999[2], local999[1]);
													continue;
												}
												Static227.aBoolean337 = true;
												Static516.anInt8715 = local999[0];
												Static537.anInt9060 = local999[1];
												Static282.anInt5417 = local999[2];
											}
											Static348.anInt6494 = 1;
											Static578.aBoolean709 = false;
											Static73.anInt1444 = Static281.aClass49_1.method2426();
											Static114.anInt2516 = Static281.aClass49_1.method2429();
											continue;
										}
										if (local276 && Static348.anInt6494 > 0) {
											if (Static348.anInt6494 == 1 && (Static73.anInt1444 != Static281.aClass49_1.method2426() || Static114.anInt2516 != Static281.aClass49_1.method2429())) {
												Static546.anInt9142 = Static122.anInt2649;
												Static328.anInt6237 = Static168.anInt3275;
												Static348.anInt6494 = 2;
											}
											if (Static348.anInt6494 == 2) {
												Static578.aBoolean709 = true;
												Static130.method2307(Static546.anInt9142 + (int) ((double) (Static73.anInt1444 - Static281.aClass49_1.method2426()) * 2.0D / (double) Static598.aFloat68));
												Static372.method5915(Static328.anInt6237 - (int) ((double) (Static114.anInt2516 - Static281.aClass49_1.method2429()) * 2.0D / (double) Static598.aFloat68));
											}
											continue;
										}
										if (Static348.anInt6494 > 0 && !Static578.aBoolean709) {
											if ((Static646.anInt4678 == 1 || Static40.method735()) && Static285.anInt7798 > 2) {
												Static49.method918(Static73.anInt1444, Static114.anInt2516);
											} else if (Static506.method7359()) {
												Static49.method918(Static73.anInt1444, Static114.anInt2516);
											}
										}
										Static348.anInt6494 = 0;
										continue;
									}
									if (local6.anInt9604 == Static576.anInt9430) {
										if (local276) {
											Static570.method3077(local40 + Static281.aClass49_1.method2426() - local17, local45 + Static281.aClass49_1.method2429() - local22, local6.anInt9546, local6.anInt9602);
										}
										continue;
									}
									if (local6.anInt9604 == Static64.anInt1104) {
										Static558.method7940(local6, local17, local22);
										continue;
									}
								}
								if (!local6.aBoolean721 && local286) {
									local6.aBoolean721 = true;
									if (local6.anObjectArray29 != null) {
										local558 = new Class3_Sub36();
										local558.aBoolean504 = true;
										local558.aClass344_6 = local6;
										local558.anInt6951 = local40 + local291.method5064() - local17;
										local558.anInt6956 = local45 + local291.method5060() - local22;
										local558.anObjectArray1 = local6.anObjectArray29;
										Static361.aClass216_48.method5449(local558);
									}
								}
								if (local6.aBoolean721 && local276 && local6.anObjectArray4 != null) {
									local558 = new Class3_Sub36();
									local558.aBoolean504 = true;
									local558.aClass344_6 = local6;
									local558.anInt6951 = local40 + Static281.aClass49_1.method2426() - local17;
									local558.anInt6956 = local45 + Static281.aClass49_1.method2429() - local22;
									local558.anObjectArray1 = local6.anObjectArray4;
									Static361.aClass216_48.method5449(local558);
								}
								if (local6.aBoolean721 && !local276) {
									local6.aBoolean721 = false;
									if (local6.anObjectArray12 != null) {
										local558 = new Class3_Sub36();
										local558.aBoolean504 = true;
										local558.aClass344_6 = local6;
										local558.anInt6951 = local40 + Static281.aClass49_1.method2426() - local17;
										local558.anInt6956 = local45 + Static281.aClass49_1.method2429() - local22;
										local558.anObjectArray1 = local6.anObjectArray12;
										Static459.aClass216_56.method5449(local558);
									}
								}
								if (local276 && local6.anObjectArray11 != null) {
									local558 = new Class3_Sub36();
									local558.aBoolean504 = true;
									local558.aClass344_6 = local6;
									local558.anInt6951 = local40 + Static281.aClass49_1.method2426() - local17;
									local558.anInt6956 = local45 + Static281.aClass49_1.method2429() - local22;
									local558.anObjectArray1 = local6.anObjectArray11;
									Static361.aClass216_48.method5449(local558);
								}
								if (!local6.aBoolean723 && local232) {
									local6.aBoolean723 = true;
									if (local6.anObjectArray5 != null) {
										local558 = new Class3_Sub36();
										local558.aBoolean504 = true;
										local558.aClass344_6 = local6;
										local558.anInt6951 = local40 + Static281.aClass49_1.method2426() - local17;
										local558.anInt6956 = local45 + Static281.aClass49_1.method2429() - local22;
										local558.anObjectArray1 = local6.anObjectArray5;
										Static361.aClass216_48.method5449(local558);
									}
								}
								if (local6.aBoolean723 && local232 && local6.anObjectArray25 != null) {
									local558 = new Class3_Sub36();
									local558.aBoolean504 = true;
									local558.aClass344_6 = local6;
									local558.anInt6951 = local40 + Static281.aClass49_1.method2426() - local17;
									local558.anInt6956 = local45 + Static281.aClass49_1.method2429() - local22;
									local558.anObjectArray1 = local6.anObjectArray25;
									Static361.aClass216_48.method5449(local558);
								}
								if (local6.aBoolean723 && !local232) {
									local6.aBoolean723 = false;
									if (local6.anObjectArray16 != null) {
										local558 = new Class3_Sub36();
										local558.aBoolean504 = true;
										local558.aClass344_6 = local6;
										local558.anInt6951 = local40 + Static281.aClass49_1.method2426() - local17;
										local558.anInt6956 = local45 + Static281.aClass49_1.method2429() - local22;
										local558.anObjectArray1 = local6.anObjectArray16;
										Static459.aClass216_56.method5449(local558);
									}
								}
								if (local6.anObjectArray18 != null) {
									local558 = new Class3_Sub36();
									local558.aClass344_6 = local6;
									local558.anObjectArray1 = local6.anObjectArray18;
									Static140.aClass216_22.method5449(local558);
								}
								@Pc(1570) Class3_Sub36 local1570;
								if (local6.anObjectArray13 != null && Static71.anInt1423 > local6.anInt9628) {
									if (local6.anIntArray603 == null || Static71.anInt1423 - local6.anInt9628 > 32) {
										local558 = new Class3_Sub36();
										local558.aClass344_6 = local6;
										local558.anObjectArray1 = local6.anObjectArray13;
										Static361.aClass216_48.method5449(local558);
									} else {
										label687: for (local335 = local6.anInt9628; local335 < Static71.anInt1423; local335++) {
											local708 = Static325.anIntArray122[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray603.length; local469++) {
												if (local6.anIntArray603[local469] == local708) {
													local1570 = new Class3_Sub36();
													local1570.aClass344_6 = local6;
													local1570.anObjectArray1 = local6.anObjectArray13;
													Static361.aClass216_48.method5449(local1570);
													break label687;
												}
											}
										}
									}
									local6.anInt9628 = Static71.anInt1423;
								}
								if (local6.anObjectArray24 != null && Static128.anInt1669 > local6.anInt9580) {
									if (local6.anIntArray601 == null || Static128.anInt1669 - local6.anInt9580 > 32) {
										local558 = new Class3_Sub36();
										local558.aClass344_6 = local6;
										local558.anObjectArray1 = local6.anObjectArray24;
										Static361.aClass216_48.method5449(local558);
									} else {
										label663: for (local335 = local6.anInt9580; local335 < Static128.anInt1669; local335++) {
											local708 = Static105.anIntArray138[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray601.length; local469++) {
												if (local6.anIntArray601[local469] == local708) {
													local1570 = new Class3_Sub36();
													local1570.aClass344_6 = local6;
													local1570.anObjectArray1 = local6.anObjectArray24;
													Static361.aClass216_48.method5449(local1570);
													break label663;
												}
											}
										}
									}
									local6.anInt9580 = Static128.anInt1669;
								}
								if (local6.anObjectArray27 != null && Static64.anInt1101 > local6.anInt9595) {
									if (local6.anIntArray597 == null || Static64.anInt1101 - local6.anInt9595 > 32) {
										local558 = new Class3_Sub36();
										local558.aClass344_6 = local6;
										local558.anObjectArray1 = local6.anObjectArray27;
										Static361.aClass216_48.method5449(local558);
									} else {
										label639: for (local335 = local6.anInt9595; local335 < Static64.anInt1101; local335++) {
											local708 = Static428.anIntArray449[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray597.length; local469++) {
												if (local6.anIntArray597[local469] == local708) {
													local1570 = new Class3_Sub36();
													local1570.aClass344_6 = local6;
													local1570.anObjectArray1 = local6.anObjectArray27;
													Static361.aClass216_48.method5449(local1570);
													break label639;
												}
											}
										}
									}
									local6.anInt9595 = Static64.anInt1101;
								}
								if (local6.anObjectArray32 != null && Static88.anInt1731 > local6.anInt9617) {
									if (local6.anIntArray598 == null || Static88.anInt1731 - local6.anInt9617 > 32) {
										local558 = new Class3_Sub36();
										local558.aClass344_6 = local6;
										local558.anObjectArray1 = local6.anObjectArray32;
										Static361.aClass216_48.method5449(local558);
									} else {
										label615: for (local335 = local6.anInt9617; local335 < Static88.anInt1731; local335++) {
											local708 = Static597.anIntArray612[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray598.length; local469++) {
												if (local6.anIntArray598[local469] == local708) {
													local1570 = new Class3_Sub36();
													local1570.aClass344_6 = local6;
													local1570.anObjectArray1 = local6.anObjectArray32;
													Static361.aClass216_48.method5449(local1570);
													break label615;
												}
											}
										}
									}
									local6.anInt9617 = Static88.anInt1731;
								}
								if (local6.anObjectArray33 != null && Static632.anInt10072 > local6.anInt9592) {
									if (local6.anIntArray606 == null || Static632.anInt10072 - local6.anInt9592 > 32) {
										local558 = new Class3_Sub36();
										local558.aClass344_6 = local6;
										local558.anObjectArray1 = local6.anObjectArray33;
										Static361.aClass216_48.method5449(local558);
									} else {
										label591: for (local335 = local6.anInt9592; local335 < Static632.anInt10072; local335++) {
											local708 = Static478.anIntArray498[local335 & 0x1F];
											for (local469 = 0; local469 < local6.anIntArray606.length; local469++) {
												if (local6.anIntArray606[local469] == local708) {
													local1570 = new Class3_Sub36();
													local1570.aClass344_6 = local6;
													local1570.anObjectArray1 = local6.anObjectArray33;
													Static361.aClass216_48.method5449(local1570);
													break label591;
												}
											}
										}
									}
									local6.anInt9592 = Static632.anInt10072;
								}
								if (Static372.anInt6808 > local6.anInt9576 && local6.anObjectArray19 != null) {
									local558 = new Class3_Sub36();
									local558.aClass344_6 = local6;
									local558.anObjectArray1 = local6.anObjectArray19;
									Static361.aClass216_48.method5449(local558);
								}
								if (Static492.anInt8360 > local6.anInt9576 && local6.anObjectArray15 != null) {
									local558 = new Class3_Sub36();
									local558.aClass344_6 = local6;
									local558.anObjectArray1 = local6.anObjectArray15;
									Static361.aClass216_48.method5449(local558);
								}
								if (Static570.anInt3589 > local6.anInt9576 && local6.anObjectArray22 != null) {
									local558 = new Class3_Sub36();
									local558.aClass344_6 = local6;
									local558.anObjectArray1 = local6.anObjectArray22;
									Static361.aClass216_48.method5449(local558);
								}
								if (Static518.anInt8723 > local6.anInt9576 && local6.anObjectArray28 != null) {
									local558 = new Class3_Sub36();
									local558.aClass344_6 = local6;
									local558.anObjectArray1 = local6.anObjectArray28;
									Static361.aClass216_48.method5449(local558);
								}
								if (Static500.anInt8429 > local6.anInt9576 && local6.anObjectArray14 != null) {
									local558 = new Class3_Sub36();
									local558.aClass344_6 = local6;
									local558.anObjectArray1 = local6.anObjectArray14;
									Static361.aClass216_48.method5449(local558);
								}
								local6.anInt9576 = Static303.anInt8405;
								if (local6.anObjectArray31 != null) {
									for (local335 = 0; local335 < Static227.anInt4609; local335++) {
										@Pc(2038) Class3_Sub36 local2038 = new Class3_Sub36();
										local2038.aClass344_6 = local6;
										local2038.anInt6953 = Static512.anInterface26Array1[local335].method214();
										local2038.anInt6957 = Static512.anInterface26Array1[local335].method211();
										local2038.anObjectArray1 = local6.anObjectArray31;
										Static361.aClass216_48.method5449(local2038);
									}
								}
								if (Static529.aBoolean670 && local6.anObjectArray17 != null) {
									local558 = new Class3_Sub36();
									local558.aClass344_6 = local6;
									local558.anObjectArray1 = local6.anObjectArray17;
									Static361.aClass216_48.method5449(local558);
								}
							}
							if (local6.anInt9554 == 5 && local6.anInt9575 != -1) {
								local6.method8181(Static148.aClass212_1, Static166.aClass310_1).method3192(local6.anInt9602, Static266.aClass82_8);
							}
							Static496.method783(local6);
							if (local6.anInt9554 == 0) {
								method1322(arg0, local6.anInt9571, local28, local30, local32, local34, local17 - local6.anInt9621, local22 - local6.anInt9618, arg8, arg9, arg10, arg11);
								if (local6.aClass344Array2 != null) {
									method1322(local6.aClass344Array2, local6.anInt9571, local28, local30, local32, local34, local17 - local6.anInt9621, local22 - local6.anInt9618, arg8, arg9, arg10, arg11);
								}
								@Pc(2164) Class3_Sub1 local2164 = (Class3_Sub1) Static128.aClass25_7.method426((long) local6.anInt9571);
								if (local2164 != null) {
									if (Static431.aClass133_11 == Static483.aClass133_14 && local2164.anInt25 == 0 && !Static253.aBoolean362 && local232 && !Static349.aBoolean768) {
										Static638.method8582();
									}
									Static531.method7701(local32, arg10, local2164.anInt24, arg9, local22, local30, local17, arg11, local28, arg8, local34);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static496.method783(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!uv;)Z")
	public static boolean method1324(@OriginalArg(0) Class344 arg0) {
		if (Static349.aBoolean768) {
			if (method1311(arg0).anInt9447 != 0) {
				return false;
			}
			if (arg0.anInt9554 == 0) {
				return false;
			}
		}
		return arg0.aBoolean730;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1326() {
		@Pc(1) int local1 = Static174.anInt3362;
		@Pc(3) int[] local3 = Static495.anIntArray529;
		@Pc(11) int local11 = Static536.aBoolean672 ? local1 : local1 + Static596.anInt9702;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class9_Sub2_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub43) Static545.aClass25_40.method426((long) Static43.anIntArray50[local13 - local1])).aClass9_Sub2_Sub1_Sub2_Sub2_2;
			}
			if (local23.anInt10208 >= 0) {
				@Pc(43) int local43 = local23.method8619();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt10152 & 0x1FF) == 0 && (local23.anInt10158 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local23.anInt10152 & 0x1FF) == 256 && (local23.anInt10158 & 0x1FF) == 256) {
					continue;
				}
				local23.anInt10154 = Static594.method8211(local23.anInt10152, local23.anInt10158, local23.aByte127);
				Static627.method8508(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1327() {
		@Pc(1) int local1 = Static174.anInt3362;
		@Pc(3) int[] local3 = Static495.anIntArray529;
		@Pc(8) int local8 = Static32.aClass3_Sub41_3.aClass7_Sub18_1.method6276();
		@Pc(23) boolean local23 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(85) int local85;
		for (@Pc(25) int local25 = 0; local25 < local1; local25++) {
			@Pc(32) Class9_Sub2_Sub1_Sub2_Sub1 local32 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local3[local25]];
			if (!local32.method1156()) {
				local32.anInt10208 = -1;
			} else if (local32.aBoolean77) {
				local32.anInt10208 = -1;
			} else {
				local32.method8616();
				if (local32.aShort126 >= 0 && local32.aShort124 >= 0 && local32.aShort127 < Static399.anInt7121 && local32.aShort125 < Static24.anInt345) {
					local32.aBoolean82 = local32.aBoolean773 ? local23 : false;
					if (local32 == Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1) {
						local32.anInt10208 = Integer.MAX_VALUE;
					} else {
						local85 = 0;
						if (!local32.aBoolean772) {
							local85++;
						}
						if (local32.anInt10194 > Static304.anInt8391) {
							local85 += 2;
						}
						local85 += 5 - local32.method8619() << 2;
						if (local32.aBoolean80) {
							local85 += 512;
						} else {
							if (Static224.anInt4539 == 0) {
								local85 += 32;
							} else {
								local85 += 128;
							}
							local85 += 256;
						}
						local32.anInt10208 = local85 + 1;
					}
				} else {
					local32.anInt10208 = -1;
				}
			}
		}
		for (@Pc(126) int local126 = 0; local126 < Static596.anInt9702; local126++) {
			@Pc(137) Class9_Sub2_Sub1_Sub2_Sub2 local137 = ((Class3_Sub43) Static545.aClass25_40.method426((long) Static43.anIntArray50[local126])).aClass9_Sub2_Sub1_Sub2_Sub2_2;
			if (local137.method8638() && local137.aClass309_1.method7592(Static183.aClass285_1)) {
				local137.method8616();
				if (local137.aShort126 >= 0 && local137.aShort124 >= 0 && local137.aShort127 < Static399.anInt7121 && local137.aShort125 < Static24.anInt345) {
					@Pc(174) int local174 = 0;
					if (!local137.aBoolean772) {
						local174++;
					}
					if (local137.anInt10194 > Static304.anInt8391) {
						local174 += 2;
					}
					local174 += 5 - local137.method8619() << 2;
					if (Static224.anInt4539 == 0) {
						if (local137.aClass309_1.aBoolean662) {
							local174 += 64;
						} else {
							local174 += 128;
						}
					} else if (Static224.anInt4539 == 1) {
						if (local137.aClass309_1.aBoolean662) {
							local174 += 32;
						} else {
							local174 += 64;
						}
					}
					if (local137.aClass309_1.aBoolean658) {
						local174 += 1024;
					} else if (!local137.aClass309_1.aBoolean661) {
						local174 += 256;
					}
					local137.anInt10208 = local174 + 1;
				} else {
					local137.anInt10208 = -1;
				}
			} else {
				local137.anInt10208 = -1;
			}
		}
		for (local85 = 0; local85 < Static16.aClass118Array1.length; local85++) {
			@Pc(240) Class118 local240 = Static16.aClass118Array1[local85];
			if (local240 != null) {
				if (local240.anInt3289 == 1) {
					@Pc(254) Class3_Sub43 local254 = (Class3_Sub43) Static545.aClass25_40.method426((long) local240.anInt3290);
					if (local254 != null) {
						@Pc(259) Class9_Sub2_Sub1_Sub2_Sub2 local259 = local254.aClass9_Sub2_Sub1_Sub2_Sub2_2;
						if (local259.anInt10208 >= 0) {
							local259.anInt10208 += 2048;
						}
					}
				} else if (local240.anInt3289 == 10) {
					@Pc(278) Class9_Sub2_Sub1_Sub2_Sub1 local278 = Static507.aClass9_Sub2_Sub1_Sub2_Sub1Array1[local240.anInt3290];
					if (local278 != null && local278 != Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1 && local278.anInt10208 >= 0) {
						local278.anInt10208 += 2048;
					}
				}
			}
		}
	}
}
