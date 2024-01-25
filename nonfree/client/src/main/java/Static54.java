import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "Lclient!la;")
	public static final Class136 aClass136_20 = new Class136(62, -2);

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Lclient!of;")
	public static final Class174 aClass174_34 = new Class174(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
	public static final int anInt1060 = -1;

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
	public static int anInt1061 = 0;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "Lclient!la;")
	public static final Class136 aClass136_21 = new Class136(1, 2);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1043() {
		@Pc(1) int local1 = Static271.anInt4534;
		@Pc(3) int[] local3 = Static215.anIntArray267;
		@Pc(11) int local11 = Static358.aBoolean420 ? local1 : local1 + Static379.anInt6398;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub2_Sub6 local23;
			if (local13 < local1) {
				local23 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) Static198.anIntArray225[local13 - local1])).aClass1_Sub2_Sub6_Sub1_2;
			}
			if (local23.anInt7598 >= 0) {
				@Pc(43) int local43 = local23.method6204();
				if ((local43 & 0x1) == 0) {
					if ((local23.anInt7560 & 0x7F) == 0 && (local23.anInt7557 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt7560 & 0x7F) == 64 && (local23.anInt7557 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class1_Sub2_Sub6_Sub2 && local23.aClass3_Sub47_3 != null && Static172.anInt3107 >= local23.aClass3_Sub47_3.anInt7693 && Static172.anInt3107 < local23.aClass3_Sub47_3.anInt7701) {
					((Class1_Sub2_Sub6_Sub2) local23).aBoolean513 = false;
				}
				local23.anInt7563 = Static181.method4212(local23.aByte101, local23.anInt7557, local23.anInt7560);
				Static114.method1845(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ga;)Z")
	public static boolean method1044(@OriginalArg(0) Class82 arg0) {
		if (Static64.aBoolean82) {
			if (method1060(arg0).anInt6593 != 0) {
				return false;
			}
			if (arg0.anInt2252 == 0) {
				return false;
			}
		}
		return arg0.aBoolean169;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1045() {
		@Pc(1) int local1 = Static271.anInt4534;
		@Pc(3) int[] local3 = Static215.anIntArray267;
		@Pc(20) boolean local20 = Static39.aClass79_Sub1_1.anInt2152 == 1 && local1 > 200 || Static39.aClass79_Sub1_1.anInt2152 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class1_Sub2_Sub6_Sub2 local29 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local3[local22]];
			if (local29.method6208()) {
				local29.method6187();
				if (local29.aShort108 >= 0 && local29.aShort107 >= 0 && local29.aShort109 < Static373.anInt6324 && local29.aShort110 < Static291.anInt5062) {
					local29.aBoolean513 = local29.aBoolean507 ? local20 : false;
					if (local29 == Static203.aClass1_Sub2_Sub6_Sub2_1) {
						local29.anInt7598 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean510) {
							local75++;
						}
						if (local29.anInt7607 > Static172.anInt3107) {
							local75 += 2;
						}
						local75 += 5 - local29.method6204() << 2;
						if (local29.aBoolean512) {
							local75 += 512;
						} else {
							if (Static342.anInt5741 == 0) {
								local75 += 32;
							} else {
								local75 += 128;
							}
							local75 += 256;
						}
						local29.anInt7598 = local75 + 1;
					}
				} else {
					local29.anInt7598 = -1;
				}
			} else {
				local29.anInt7598 = -1;
			}
		}
		for (@Pc(116) int local116 = 0; local116 < Static379.anInt6398; local116++) {
			@Pc(127) Class1_Sub2_Sub6_Sub1 local127 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) Static198.anIntArray225[local116])).aClass1_Sub2_Sub6_Sub1_2;
			if (local127.method5636() && local127.aClass158_1.method3709(Static119.aClass47_1)) {
				local127.method6187();
				if (local127.aShort108 >= 0 && local127.aShort107 >= 0 && local127.aShort109 < Static373.anInt6324 && local127.aShort110 < Static291.anInt5062) {
					@Pc(164) int local164 = 0;
					if (!local127.aBoolean510) {
						local164++;
					}
					if (local127.anInt7607 > Static172.anInt3107) {
						local164 += 2;
					}
					local164 += 5 - local127.method6204() << 2;
					if (Static342.anInt5741 == 0) {
						if (local127.aClass158_1.aBoolean322) {
							local164 += 64;
						} else {
							local164 += 128;
						}
					} else if (Static342.anInt5741 == 1) {
						if (local127.aClass158_1.aBoolean322) {
							local164 += 32;
						} else {
							local164 += 64;
						}
					}
					if (local127.aClass158_1.aBoolean324) {
						local164 += 1024;
					} else if (!local127.aClass158_1.aBoolean327) {
						local164 += 256;
					}
					local127.anInt7598 = local164 + 1;
				} else {
					local127.anInt7598 = -1;
				}
			} else {
				local127.anInt7598 = -1;
			}
		}
		for (local75 = 0; local75 < Static138.aClass36Array1.length; local75++) {
			@Pc(230) Class36 local230 = Static138.aClass36Array1[local75];
			if (local230 != null) {
				if (local230.anInt1123 == 1) {
					@Pc(244) Class3_Sub40 local244 = (Class3_Sub40) Static63.aClass140_37.method3490((long) local230.anInt1122);
					if (local244 != null) {
						@Pc(249) Class1_Sub2_Sub6_Sub1 local249 = local244.aClass1_Sub2_Sub6_Sub1_2;
						if (local249.anInt7598 >= 0) {
							local249.anInt7598 += 2048;
						}
					}
				} else if (local230.anInt1123 == 10) {
					@Pc(268) Class1_Sub2_Sub6_Sub2 local268 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local230.anInt1122];
					if (local268 != null && local268 != Static203.aClass1_Sub2_Sub6_Sub2_1 && local268.anInt7598 >= 0) {
						local268.anInt7598 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!uu;Lclient!uu;Lclient!qa;B)V")
	public static void method1048(@OriginalArg(0) Class250 arg0, @OriginalArg(1) Class250 arg1, @OriginalArg(2) Class167 arg2) {
		Static215.aClass124_10 = Static398.method5469(arg1, Static200.anInt3583);
		Static275.aClass18_3 = arg2.method5995(Static215.aClass124_10, Static467.method3627(arg0, Static200.anInt3583));
		Static298.aClass124_11 = Static398.method5469(arg1, Static110.anInt1951);
		Static244.aClass18_1 = arg2.method5995(Static298.aClass124_11, Static467.method3627(arg0, Static110.anInt1951));
		Static251.aClass124_14 = Static398.method5469(arg1, Static339.anInt5693);
		Static266.aClass18_2 = arg2.method5995(Static251.aClass124_14, Static467.method3627(arg0, Static339.anInt5693));
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1050() {
		Static360.anInt6139 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static379.anInt6398; local3++) {
			@Pc(14) Class1_Sub2_Sub6_Sub1 local14 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) Static198.anIntArray225[local3])).aClass1_Sub2_Sub6_Sub1_2;
			if (local14.aBoolean510 && local14.method6206() != -1) {
				@Pc(32) int local32 = (local14.method6204() - 1) * 64 + 60;
				@Pc(39) int local39 = local14.anInt7560 - local32 >> 7;
				@Pc(46) int local46 = local14.anInt7557 - local32 >> 7;
				@Pc(53) Class1_Sub2_Sub6 local53 = Static202.method3096(local46, local14.aByte101, local39);
				if (local53 != null) {
					@Pc(58) int local58 = local53.anInt7621;
					if (local53 instanceof Class1_Sub2_Sub6_Sub1) {
						local58 += 2048;
					}
					if (local53.anInt7636 == 0 && local53.method6206() != -1) {
						Static240.anIntArray390[Static360.anInt6139] = local58;
						Static301.anIntArray330[Static360.anInt6139] = local58;
						Static360.anInt6139++;
						local53.anInt7636++;
					}
					Static240.anIntArray390[Static360.anInt6139] = local58;
					Static301.anIntArray330[Static360.anInt6139] = local14.anInt7621 + 2048;
					Static360.anInt6139++;
					local53.anInt7636++;
				}
			}
		}
		Static300.method4285(Static240.anIntArray390, Static360.anInt6139 - 1, 0, Static301.anIntArray330);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ga;IIIIIIIII)V")
	public static void method1053(@OriginalArg(0) Class82[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class82 local6 = arg0[local1];
			if (local6 != null && local6.anInt2259 == arg1) {
				@Pc(17) int local17 = local6.anInt2210 + arg6;
				@Pc(22) int local22 = local6.anInt2199 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt2252 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt2192;
					@Pc(45) int local45 = local22 + local6.anInt2216;
					if (local6.anInt2252 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt2252 == 0 || local6.aBoolean182 || method1060(local6).anInt6593 != 0 || local6 == Static260.aClass82_22 || local6.anInt2201 == Static228.anInt3817) {
					if (!method1044(local6)) {
						if (local6 == Static296.aClass82_16) {
							Static184.aBoolean255 = true;
							Static244.anInt4150 = local17;
							Static365.anInt6194 = local22;
						}
						if (local6.aBoolean178 || local28 < local32 && local30 < local34) {
							if (local6.aBoolean168 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(148) Class3_Sub15 local148 = (Class3_Sub15) Static458.aClass193_69.method4519(); local148 != null; local148 = (Class3_Sub15) Static458.aClass193_69.method4525()) {
									if (local148.aBoolean109) {
										local148.method6288();
										local148.aClass82_1.aBoolean179 = false;
									}
								}
								if (Static254.anInt5710 == 0) {
									Static296.aClass82_16 = null;
									Static260.aClass82_22 = null;
								}
								Static20.anInt6289 = 0;
								Static21.aBoolean515 = false;
								Static10.aBoolean5 = false;
								if (!Static367.aBoolean425) {
									Static447.method6092();
								}
							}
							@Pc(204) boolean local204;
							if (Static171.aClass50_1.method4993() >= local28 && Static171.aClass50_1.method4989() >= local30 && Static171.aClass50_1.method4993() < local32 && Static171.aClass50_1.method4989() < local34) {
								local204 = true;
							} else {
								local204 = false;
							}
							if (!Static73.aBoolean88 && local204) {
								if (local6.anInt2243 >= 0) {
									Static302.anInt5198 = local6.anInt2243;
								} else if (local6.aBoolean168) {
									Static302.anInt5198 = -1;
								}
							}
							if (!Static367.aBoolean425 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static427.method5827(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(248) boolean local248 = false;
							if (Static171.aClass50_1.method4995() && local204) {
								local248 = true;
							}
							@Pc(258) boolean local258 = false;
							@Pc(263) Class3_Sub5 local263 = (Class3_Sub5) Static273.aClass193_38.method4519();
							if (local263 != null && local263.method5404() == 0 && local263.method5408() >= local28 && local263.method5406() >= local30 && local263.method5408() < local32 && local263.method5406() < local34) {
								local258 = true;
							}
							@Pc(296) int local296;
							@Pc(430) int local430;
							if (local6.aByteArray41 != null) {
								for (local296 = 0; local296 < local6.aByteArray41.length; local296++) {
									if (Static137.aClass143_1.method5471(local6.aByteArray41[local296])) {
										if (local6.anIntArray108 == null || Static172.anInt3107 >= local6.anIntArray108[local296]) {
											@Pc(328) byte local328 = local6.aByteArray40[local296];
											if (local328 == 0 || ((local328 & 0x8) == 0 || !Static137.aClass143_1.method5471(86) && !Static137.aClass143_1.method5471(82) && !Static137.aClass143_1.method5471(81)) && ((local328 & 0x2) == 0 || Static137.aClass143_1.method5471(86)) && ((local328 & 0x1) == 0 || Static137.aClass143_1.method5471(82)) && ((local328 & 0x4) == 0 || Static137.aClass143_1.method5471(81))) {
												if (local296 < 10) {
													Static300.method4283(local6.anInt2208, "", local296 + 1, -1);
												} else if (local296 == 10) {
													Static178.method2853();
													@Pc(399) Class3_Sub42 local399 = method1060(local6);
													Static294.method4202(local399.method5454(), local6, local399.anInt6590);
													Static320.aString12 = Static363.method5076(local6);
													if (Static320.aString12 == null) {
														Static320.aString12 = "Null";
													}
													Static296.aString56 = local6.aString34 + "<col=ffffff>";
												}
												local430 = local6.anIntArray104[local296];
												if (local6.anIntArray108 == null) {
													local6.anIntArray108 = new int[local6.aByteArray41.length];
												}
												if (local430 == 0) {
													local6.anIntArray108[local296] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray108[local296] = Static172.anInt3107 + local430;
												}
											}
										}
									} else if (local6.anIntArray108 != null) {
										local6.anIntArray108[local296] = 0;
									}
								}
							}
							if (local258) {
								Static278.method3849(local6, local263.method5408() - local17, local263.method5406() - local22);
							}
							if (Static296.aClass82_16 != null && Static296.aClass82_16 != local6 && local204 && method1060(local6).method5451()) {
								Static225.aClass82_14 = local6;
							}
							if (local6 == Static260.aClass82_22) {
								Static280.aBoolean333 = true;
								Static1.anInt7721 = local17;
								Static201.anInt3586 = local22;
							}
							if (local6.aBoolean182 || local6.anInt2201 != 0) {
								@Pc(515) Class3_Sub15 local515;
								if (local204 && Static461.anInt7758 != 0 && local6.anObjectArray27 != null) {
									local515 = new Class3_Sub15();
									local515.aBoolean109 = true;
									local515.aClass82_1 = local6;
									local515.anInt1786 = Static461.anInt7758;
									local515.anObjectArray3 = local6.anObjectArray27;
									Static458.aClass193_69.method4527(local515);
								}
								if (Static296.aClass82_16 != null || Static367.aBoolean425 || local6.anInt2201 != Static352.anInt5987 && Static20.anInt6289 > 0) {
									local258 = false;
									local248 = false;
									local204 = false;
								}
								@Pc(670) int local670;
								if (local6.anInt2201 != 0) {
									if (local6.anInt2201 == Static228.anInt3814 || local6.anInt2201 == Static388.anInt6534) {
										Static135.aClass82_9 = local6;
										if (Static460.aClass64_1 != null) {
											Static460.aClass64_1.method1678(local6.anInt2216, Static413.aClass167_11);
										}
										if (local6.anInt2201 == Static228.anInt3814) {
											if (!Static367.aBoolean425 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static173.method3104(arg8, Static413.aClass167_11, arg9);
												for (@Pc(598) Class23_Sub2 local598 = (Class23_Sub2) Static185.aClass194_4.method4577(); local598 != null; local598 = (Class23_Sub2) Static185.aClass194_4.method4580()) {
													if (arg8 >= local598.anInt892 && arg8 < local598.anInt890 && arg9 >= local598.anInt893 && arg9 < local598.anInt889) {
														Static447.method6092();
														Static168.method2584(local598.aClass1_Sub2_Sub6_1);
													}
												}
											}
											Static228.method3280(local6, local17, local22);
											continue;
										}
									}
									@Pc(709) int local709;
									if (local6.anInt2201 == Static228.anInt3817) {
										if (local6.method1970(Static413.aClass167_11) == null || Static439.anInt7311 != 0 && Static439.anInt7311 != 3 || Static367.aBoolean425 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local296 = arg8 - local17;
										local670 = arg9 - local22;
										local430 = local6.anIntArray111[local670];
										if (local296 < local430 || local296 > local430 + local6.anIntArray107[local670]) {
											continue;
										}
										local296 -= local6.anInt2192 / 2;
										local670 -= local6.anInt2216 / 2;
										if (Static27.anInt490 == 4) {
											local709 = (int) Static19.aFloat6 & 0x3FFF;
										} else {
											local709 = (int) Static19.aFloat6 + Static139.anInt2475 & 0x3FFF;
										}
										@Pc(721) int local721 = Class65.anIntArray88[local709];
										@Pc(725) int local725 = Class65.anIntArray87[local709];
										if (Static27.anInt490 != 4) {
											local721 = local721 * (Static197.anInt3551 + 256) >> 8;
											local725 = local725 * (Static197.anInt3551 + 256) >> 8;
										}
										@Pc(754) int local754 = local670 * local721 + local296 * local725 >> 15;
										@Pc(764) int local764 = local670 * local725 - local296 * local721 >> 15;
										@Pc(775) int local775;
										@Pc(783) int local783;
										if (Static27.anInt490 == 4) {
											local775 = (Static370.anInt6269 >> 7) + (local754 >> 2);
											local783 = (Static180.anInt3334 >> 7) - (local764 >> 2);
										} else {
											@Pc(792) int local792 = (Static203.aClass1_Sub2_Sub6_Sub2_1.method6204() - 1) * 64;
											local775 = (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560 - local792 >> 7) + (local754 >> 2);
											local783 = (Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 - local792 >> 7) - (local764 >> 2);
										}
										if (Static73.aBoolean88 && (Static385.anInt6504 & 0x40) != 0) {
											@Pc(825) Class82 local825 = Static360.method5048(Static102.anInt1846, Static327.anInt5460);
											if (local825 == null) {
												Static178.method2853();
											} else {
												Static359.method5021(false, 50, local783, true, " ->", local6.anInt2200, Static336.anInt5620, Static320.aString12, 1L, local775);
											}
											continue;
										}
										if (Static154.aClass113_3 == Static427.aClass113_4) {
											Static359.method5021(false, 9, local783, true, "", -1, -1, Static386.aClass174_185.method4208(Static300.anInt5192), 1L, local775);
										}
										Static359.method5021(false, 8, local783, true, "", -1, Static413.anInt6976, Static225.aString47, 1L, local775);
										continue;
									}
									if (local6.anInt2201 == Static352.anInt5987) {
										Static381.aClass82_24 = local6;
										if (local204) {
											Static21.aBoolean515 = true;
										}
										if (local258) {
											local296 = (int) ((double) (local263.method5408() - local17 - local6.anInt2192 / 2) * 2.0D / (double) Static211.aFloat3);
											local670 = (int) -((double) (local263.method5406() - local22 - local6.anInt2216 / 2) * 2.0D / (double) Static211.aFloat3);
											local430 = Static34.anInt3343 + local296 + Static211.anInt278;
											local709 = Static436.anInt7297 + local670 + Static211.anInt276;
											@Pc(939) Class3_Sub3_Sub13 local939 = Static24.method2484();
											if (local939 == null) {
												continue;
											}
											@Pc(944) int[] local944 = new int[3];
											local939.method3011(local709, local944, local430);
											if (local944 != null) {
												if (Static137.aClass143_1.method5471(82) && Static300.anInt5196 > 0) {
													Static365.method5103(local944[1], local944[2], local944[0]);
													continue;
												}
												Static10.aBoolean5 = true;
												Static63.anInt7098 = local944[0];
												Static13.anInt222 = local944[1];
												Static425.anInt2164 = local944[2];
											}
											Static20.anInt6289 = 1;
											Static48.aBoolean58 = false;
											Static233.anInt3984 = Static171.aClass50_1.method4993();
											Static317.anInt5362 = Static171.aClass50_1.method4989();
											continue;
										}
										if (local248 && Static20.anInt6289 > 0) {
											if (Static20.anInt6289 == 1 && (Static233.anInt3984 != Static171.aClass50_1.method4993() || Static317.anInt5362 != Static171.aClass50_1.method4989())) {
												Static372.anInt6315 = Static34.anInt3343;
												Static326.anInt5457 = Static436.anInt7297;
												Static20.anInt6289 = 2;
											}
											if (Static20.anInt6289 == 2) {
												Static48.aBoolean58 = true;
												Static343.method4792(Static372.anInt6315 + (int) ((double) (Static233.anInt3984 - Static171.aClass50_1.method4993()) * 2.0D / (double) Static211.aFloat4));
												Static422.method4717(Static326.anInt5457 - (int) ((double) (Static317.anInt5362 - Static171.aClass50_1.method4989()) * 2.0D / (double) Static211.aFloat4));
											}
											continue;
										}
										if (Static20.anInt6289 > 0 && !Static48.aBoolean58) {
											if ((Static29.anInt5767 == 1 || Static383.method5318()) && Static276.anInt4608 > 2) {
												Static2.method53(Static233.anInt3984, Static317.anInt5362);
											} else if (Static383.method5321()) {
												Static2.method53(Static233.anInt3984, Static317.anInt5362);
											}
										}
										Static20.anInt6289 = 0;
										continue;
									}
									if (local6.anInt2201 == Static407.anInt6719) {
										if (local248) {
											Static275.method3808(Static171.aClass50_1.method4989() - local22, Static171.aClass50_1.method4993() - local17, local6.anInt2192, local6.anInt2216);
										}
										continue;
									}
									if (local6.anInt2201 == Static367.anInt6209) {
										Static257.method3591(local22, local17, local6);
										continue;
									}
								}
								if (!local6.aBoolean171 && local258) {
									local6.aBoolean171 = true;
									if (local6.anObjectArray29 != null) {
										local515 = new Class3_Sub15();
										local515.aBoolean109 = true;
										local515.aClass82_1 = local6;
										local515.anInt1787 = local263.method5408() - local17;
										local515.anInt1786 = local263.method5406() - local22;
										local515.anObjectArray3 = local6.anObjectArray29;
										Static458.aClass193_69.method4527(local515);
									}
								}
								if (local6.aBoolean171 && local248 && local6.anObjectArray17 != null) {
									local515 = new Class3_Sub15();
									local515.aBoolean109 = true;
									local515.aClass82_1 = local6;
									local515.anInt1787 = Static171.aClass50_1.method4993() - local17;
									local515.anInt1786 = Static171.aClass50_1.method4989() - local22;
									local515.anObjectArray3 = local6.anObjectArray17;
									Static458.aClass193_69.method4527(local515);
								}
								if (local6.aBoolean171 && !local248) {
									local6.aBoolean171 = false;
									if (local6.anObjectArray13 != null) {
										local515 = new Class3_Sub15();
										local515.aBoolean109 = true;
										local515.aClass82_1 = local6;
										local515.anInt1787 = Static171.aClass50_1.method4993() - local17;
										local515.anInt1786 = Static171.aClass50_1.method4989() - local22;
										local515.anObjectArray3 = local6.anObjectArray13;
										Static93.aClass193_20.method4527(local515);
									}
								}
								if (local248 && local6.anObjectArray21 != null) {
									local515 = new Class3_Sub15();
									local515.aBoolean109 = true;
									local515.aClass82_1 = local6;
									local515.anInt1787 = Static171.aClass50_1.method4993() - local17;
									local515.anInt1786 = Static171.aClass50_1.method4989() - local22;
									local515.anObjectArray3 = local6.anObjectArray21;
									Static458.aClass193_69.method4527(local515);
								}
								if (!local6.aBoolean179 && local204) {
									local6.aBoolean179 = true;
									if (local6.anObjectArray28 != null) {
										local515 = new Class3_Sub15();
										local515.aBoolean109 = true;
										local515.aClass82_1 = local6;
										local515.anInt1787 = Static171.aClass50_1.method4993() - local17;
										local515.anInt1786 = Static171.aClass50_1.method4989() - local22;
										local515.anObjectArray3 = local6.anObjectArray28;
										Static458.aClass193_69.method4527(local515);
									}
								}
								if (local6.aBoolean179 && local204 && local6.anObjectArray6 != null) {
									local515 = new Class3_Sub15();
									local515.aBoolean109 = true;
									local515.aClass82_1 = local6;
									local515.anInt1787 = Static171.aClass50_1.method4993() - local17;
									local515.anInt1786 = Static171.aClass50_1.method4989() - local22;
									local515.anObjectArray3 = local6.anObjectArray6;
									Static458.aClass193_69.method4527(local515);
								}
								if (local6.aBoolean179 && !local204) {
									local6.aBoolean179 = false;
									if (local6.anObjectArray33 != null) {
										local515 = new Class3_Sub15();
										local515.aBoolean109 = true;
										local515.aClass82_1 = local6;
										local515.anInt1787 = Static171.aClass50_1.method4993() - local17;
										local515.anInt1786 = Static171.aClass50_1.method4989() - local22;
										local515.anObjectArray3 = local6.anObjectArray33;
										Static93.aClass193_20.method4527(local515);
									}
								}
								if (local6.anObjectArray24 != null) {
									local515 = new Class3_Sub15();
									local515.aClass82_1 = local6;
									local515.anObjectArray3 = local6.anObjectArray24;
									Static336.aClass193_56.method4527(local515);
								}
								@Pc(1483) Class3_Sub15 local1483;
								if (local6.anObjectArray11 != null && Static464.anInt7831 > local6.anInt2191) {
									if (local6.lb == null || Static464.anInt7831 - local6.anInt2191 > 32) {
										local515 = new Class3_Sub15();
										local515.aClass82_1 = local6;
										local515.anObjectArray3 = local6.anObjectArray11;
										Static458.aClass193_69.method4527(local515);
									} else {
										label678: for (local296 = local6.anInt2191; local296 < Static464.anInt7831; local296++) {
											local670 = Static237.anIntArray264[local296 & 0x1F];
											for (local430 = 0; local430 < local6.lb.length; local430++) {
												if (local6.lb[local430] == local670) {
													local1483 = new Class3_Sub15();
													local1483.aClass82_1 = local6;
													local1483.anObjectArray3 = local6.anObjectArray11;
													Static458.aClass193_69.method4527(local1483);
													break label678;
												}
											}
										}
									}
									local6.anInt2191 = Static464.anInt7831;
								}
								if (local6.anObjectArray14 != null && Static369.anInt6266 > local6.anInt2223) {
									if (local6.anIntArray110 == null || Static369.anInt6266 - local6.anInt2223 > 32) {
										local515 = new Class3_Sub15();
										local515.aClass82_1 = local6;
										local515.anObjectArray3 = local6.anObjectArray14;
										Static458.aClass193_69.method4527(local515);
									} else {
										label654: for (local296 = local6.anInt2223; local296 < Static369.anInt6266; local296++) {
											local670 = Static416.anIntArray446[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray110.length; local430++) {
												if (local6.anIntArray110[local430] == local670) {
													local1483 = new Class3_Sub15();
													local1483.aClass82_1 = local6;
													local1483.anObjectArray3 = local6.anObjectArray14;
													Static458.aClass193_69.method4527(local1483);
													break label654;
												}
											}
										}
									}
									local6.anInt2223 = Static369.anInt6266;
								}
								if (local6.anObjectArray34 != null && Static201.anInt3591 > local6.anInt2206) {
									if (local6.anIntArray109 == null || Static201.anInt3591 - local6.anInt2206 > 32) {
										local515 = new Class3_Sub15();
										local515.aClass82_1 = local6;
										local515.anObjectArray3 = local6.anObjectArray34;
										Static458.aClass193_69.method4527(local515);
									} else {
										label630: for (local296 = local6.anInt2206; local296 < Static201.anInt3591; local296++) {
											local670 = Static284.anIntArray321[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray109.length; local430++) {
												if (local6.anIntArray109[local430] == local670) {
													local1483 = new Class3_Sub15();
													local1483.aClass82_1 = local6;
													local1483.anObjectArray3 = local6.anObjectArray34;
													Static458.aClass193_69.method4527(local1483);
													break label630;
												}
											}
										}
									}
									local6.anInt2206 = Static201.anInt3591;
								}
								if (local6.anObjectArray7 != null && Static433.anInt7251 > local6.anInt2221) {
									if (local6.anIntArray105 == null || Static433.anInt7251 - local6.anInt2221 > 32) {
										local515 = new Class3_Sub15();
										local515.aClass82_1 = local6;
										local515.anObjectArray3 = local6.anObjectArray7;
										Static458.aClass193_69.method4527(local515);
									} else {
										label606: for (local296 = local6.anInt2221; local296 < Static433.anInt7251; local296++) {
											local670 = Static247.anIntArray417[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray105.length; local430++) {
												if (local6.anIntArray105[local430] == local670) {
													local1483 = new Class3_Sub15();
													local1483.aClass82_1 = local6;
													local1483.anObjectArray3 = local6.anObjectArray7;
													Static458.aClass193_69.method4527(local1483);
													break label606;
												}
											}
										}
									}
									local6.anInt2221 = Static433.anInt7251;
								}
								if (local6.anObjectArray20 != null && Static197.anInt3553 > local6.anInt2234) {
									if (local6.anIntArray106 == null || Static197.anInt3553 - local6.anInt2234 > 32) {
										local515 = new Class3_Sub15();
										local515.aClass82_1 = local6;
										local515.anObjectArray3 = local6.anObjectArray20;
										Static458.aClass193_69.method4527(local515);
									} else {
										label582: for (local296 = local6.anInt2234; local296 < Static197.anInt3553; local296++) {
											local670 = Static389.anIntArray212[local296 & 0x1F];
											for (local430 = 0; local430 < local6.anIntArray106.length; local430++) {
												if (local6.anIntArray106[local430] == local670) {
													local1483 = new Class3_Sub15();
													local1483.aClass82_1 = local6;
													local1483.anObjectArray3 = local6.anObjectArray20;
													Static458.aClass193_69.method4527(local1483);
													break label582;
												}
											}
										}
									}
									local6.anInt2234 = Static197.anInt3553;
								}
								if (Static367.anInt6208 > local6.anInt2228 && local6.anObjectArray18 != null) {
									local515 = new Class3_Sub15();
									local515.aClass82_1 = local6;
									local515.anObjectArray3 = local6.anObjectArray18;
									Static458.aClass193_69.method4527(local515);
								}
								if (Static414.anInt7474 > local6.anInt2228 && local6.anObjectArray22 != null) {
									local515 = new Class3_Sub15();
									local515.aClass82_1 = local6;
									local515.anObjectArray3 = local6.anObjectArray22;
									Static458.aClass193_69.method4527(local515);
								}
								if (Static390.anInt6539 > local6.anInt2228 && local6.anObjectArray25 != null) {
									local515 = new Class3_Sub15();
									local515.aClass82_1 = local6;
									local515.anObjectArray3 = local6.anObjectArray25;
									Static458.aClass193_69.method4527(local515);
								}
								if (Static324.anInt5429 > local6.anInt2228 && local6.anObjectArray16 != null) {
									local515 = new Class3_Sub15();
									local515.aClass82_1 = local6;
									local515.anObjectArray3 = local6.anObjectArray16;
									Static458.aClass193_69.method4527(local515);
								}
								if (Static457.anInt7712 > local6.anInt2228 && local6.anObjectArray12 != null) {
									local515 = new Class3_Sub15();
									local515.aClass82_1 = local6;
									local515.anObjectArray3 = local6.anObjectArray12;
									Static458.aClass193_69.method4527(local515);
								}
								local6.anInt2228 = Static125.anInt2284;
								if (local6.anObjectArray23 != null) {
									for (local296 = 0; local296 < Static179.anInt3325; local296++) {
										@Pc(1951) Class3_Sub15 local1951 = new Class3_Sub15();
										local1951.aClass82_1 = local6;
										local1951.anInt1789 = Static37.anInterface3Array1[local296].method418();
										local1951.anInt1784 = Static37.anInterface3Array1[local296].method417();
										local1951.anObjectArray3 = local6.anObjectArray23;
										Static458.aClass193_69.method4527(local1951);
									}
								}
								if (Static228.aBoolean278 && local6.anObjectArray19 != null) {
									local515 = new Class3_Sub15();
									local515.aClass82_1 = local6;
									local515.anObjectArray3 = local6.anObjectArray19;
									Static458.aClass193_69.method4527(local515);
								}
							}
							if (local6.anInt2252 == 5 && local6.anInt2258 != -1) {
								local6.method1976(Static335.aClass58_1, Static448.aClass172_1).method1678(local6.anInt2216, Static413.aClass167_11);
							}
							Static240.method5193(local6);
							if (local6.anInt2252 == 0) {
								method1053(arg0, local6.anInt2208, local28, local30, local32, local34, local17 - local6.anInt2245, local22 - local6.anInt2263, arg8, arg9);
								if (local6.aClass82Array1 != null) {
									method1053(local6.aClass82Array1, local6.anInt2208, local28, local30, local32, local34, local17 - local6.anInt2245, local22 - local6.anInt2263, arg8, arg9);
								}
								@Pc(2073) Class3_Sub10 local2073 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local6.anInt2208);
								if (local2073 != null) {
									if (Static154.aClass113_3 == Static145.aClass113_2 && local2073.anInt831 == 0 && !Static367.aBoolean425 && local204 && !Static64.aBoolean82) {
										Static447.method6092();
									}
									Static420.method5753(local34, local22, local30, local32, arg8, arg9, local2073.anInt827, local28, local17);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static240.method5193(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ga;)Lclient!ga;")
	public static Class82 method1054(@OriginalArg(0) Class82 arg0) {
		@Pc(4) int local4 = method1060(arg0).method5455();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static180.method2857(arg0.anInt2259);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1056(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static271.anInt4534;
		@Pc(3) int[] local3 = Static215.anIntArray267;
		@Pc(11) int local11 = Static358.aBoolean420 ? local1 : local1 + Static379.anInt6398;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class1_Sub2_Sub6 local23;
			if (local13 < local1) {
				local23 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local3[local13]];
			} else {
				local23 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) Static198.anIntArray225[local13 - local1])).aClass1_Sub2_Sub6_Sub1_2;
			}
			if (local23.aByte101 == arg0) {
				local23.anInt7636 = 0;
				if (local23.anInt7598 < 0) {
					local23.aBoolean510 = false;
				} else {
					@Pc(54) int local54 = local23.method6204();
					if ((local54 & 0x1) == 0) {
						if ((local23.anInt7560 & 0x7F) != 0 || (local23.anInt7557 & 0x7F) != 0) {
							local23.aBoolean510 = false;
							continue;
						}
					} else if ((local23.anInt7560 & 0x7F) != 64 || (local23.anInt7557 & 0x7F) != 64) {
						local23.aBoolean510 = false;
						continue;
					}
					@Pc(96) int local96;
					@Pc(101) int local101;
					@Pc(126) int local126;
					if (local54 == 1) {
						local96 = local23.anInt7560 >> 7;
						local101 = local23.anInt7557 >> 7;
						if (local23.anInt7598 != Static392.anIntArrayArray56[local96][local101]) {
							local23.aBoolean510 = true;
							continue;
						}
						if (Static200.anIntArrayArray26[local96][local101] > 1) {
							local126 = Static200.anIntArrayArray26[local96][local101]--;
							local23.aBoolean510 = true;
							continue;
						}
					} else {
						local96 = (local54 - 1) * 64 + 60;
						local101 = local23.anInt7560 - local96 >> 7;
						@Pc(155) int local155 = local23.anInt7557 - local96 >> 7;
						@Pc(162) int local162 = local23.anInt7560 + local96 >> 7;
						@Pc(169) int local169 = local23.anInt7557 + local96 >> 7;
						if (!Static437.method5911(local162, local101, local169, local155, local23.anInt7598)) {
							for (@Pc(180) int local180 = local101; local180 <= local162; local180++) {
								for (@Pc(183) int local183 = local155; local183 <= local169; local183++) {
									if (local23.anInt7598 == Static392.anIntArrayArray56[local180][local183]) {
										local126 = Static200.anIntArrayArray26[local180][local183]--;
									}
								}
							}
							local23.aBoolean510 = true;
							continue;
						}
					}
					if (local23 instanceof Class1_Sub2_Sub6_Sub2 && local23.aClass3_Sub47_3 != null && Static172.anInt3107 >= local23.aClass3_Sub47_3.anInt7693 && Static172.anInt3107 < local23.aClass3_Sub47_3.anInt7701) {
						((Class1_Sub2_Sub6_Sub2) local23).aBoolean513 = false;
					}
					local23.aBoolean510 = false;
					local23.anInt7563 = Static181.method4212(local23.aByte101, local23.anInt7557, local23.anInt7560);
					Static114.method1845(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method1057(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static271.anInt4534;
		@Pc(3) int[] local3 = Static215.anIntArray267;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static379.anInt6398; local5++) {
			@Pc(15) Class1_Sub2_Sub6 local15;
			if (local5 < local1) {
				local15 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local3[local5]];
			} else {
				local15 = ((Class3_Sub40) Static63.aClass140_37.method3490((long) Static198.anIntArray225[local5 - local1])).aClass1_Sub2_Sub6_Sub1_2;
			}
			if (local15.aByte101 == arg0 && local15.anInt7598 >= 0) {
				@Pc(39) int local39 = local15.method6204();
				if ((local39 & 0x1) == 0) {
					if ((local15.anInt7560 & 0x7F) != 0 || (local15.anInt7557 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt7560 & 0x7F) != 64 || (local15.anInt7557 & 0x7F) != 64) {
					continue;
				}
				@Pc(75) int local75;
				@Pc(80) int local80;
				@Pc(116) int local116;
				if (local39 == 1) {
					local75 = local15.anInt7560 >> 7;
					local80 = local15.anInt7557 >> 7;
					if (local15.anInt7598 > Static392.anIntArrayArray56[local75][local80]) {
						Static392.anIntArrayArray56[local75][local80] = local15.anInt7598;
						Static200.anIntArrayArray26[local75][local80] = 1;
					} else if (local15.anInt7598 == Static392.anIntArrayArray56[local75][local80]) {
						local116 = Static200.anIntArrayArray26[local75][local80]++;
					}
				} else {
					local75 = (local39 - 1) * 64 + 60;
					local80 = local15.anInt7560 - local75 >> 7;
					@Pc(142) int local142 = local15.anInt7557 - local75 >> 7;
					@Pc(149) int local149 = local15.anInt7560 + local75 >> 7;
					@Pc(156) int local156 = local15.anInt7557 + local75 >> 7;
					for (@Pc(158) int local158 = local80; local158 <= local149; local158++) {
						for (@Pc(161) int local161 = local142; local161 <= local156; local161++) {
							if (local15.anInt7598 > Static392.anIntArrayArray56[local158][local161]) {
								Static392.anIntArrayArray56[local158][local161] = local15.anInt7598;
								Static200.anIntArrayArray26[local158][local161] = 1;
							} else if (local15.anInt7598 == Static392.anIntArrayArray56[local158][local161]) {
								local116 = Static200.anIntArrayArray26[local158][local161]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ga;)Lclient!tl;")
	public static Class3_Sub42 method1060(@OriginalArg(0) Class82 arg0) {
		@Pc(13) Class3_Sub42 local13 = (Class3_Sub42) Static228.aClass140_25.method3490(((long) arg0.anInt2208 << 32) + (long) arg0.anInt2209);
		return local13 == null ? arg0.aClass3_Sub42_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1061() {
		for (@Pc(1) int local1 = 0; local1 < Static373.anInt6324; local1++) {
			@Pc(6) int[] local6 = Static392.anIntArrayArray56[local1];
			for (@Pc(8) int local8 = 0; local8 < Static291.anInt5062; local8++) {
				local6[local8] = 0;
			}
		}
	}
}
