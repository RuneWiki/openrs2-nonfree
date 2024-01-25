import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "Lclient!ng;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "[[I")
	public static int[][] anIntArrayArray14;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "[I")
	public static int[] anIntArray137;

	@OriginalMember(owner = "client!client", name = "Z", descriptor = "Lclient!ct;")
	public static final Class48 aClass48_33 = new Class48(66, 2);

	@OriginalMember(owner = "client!client", name = "hb", descriptor = "[Z")
	public static final boolean[] aBooleanArray4 = new boolean[5];

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!je;)Z")
	public static boolean method804(@OriginalArg(0) Class117 arg0) {
		if (Static274.aBoolean463) {
			if (method810(arg0).anInt3451 != 0) {
				return false;
			}
			if (arg0.anInt3108 == 0) {
				return false;
			}
		}
		return arg0.aBoolean263;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!je;)Lclient!je;")
	public static Class117 method805(@OriginalArg(0) Class117 arg0) {
		@Pc(4) int local4 = method810(arg0).method2812();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static13.method107(arg0.anInt3066);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method806() {
		@Pc(1) int local1 = Static331.anInt5548;
		@Pc(3) int[] local3 = Static345.anIntArray681;
		@Pc(20) boolean local20 = Static188.aClass135_Sub1_1.anInt3377 == 1 && local1 > 200 || Static188.aClass135_Sub1_1.anInt3377 == 0 && local1 > 50;
		@Pc(75) int local75;
		for (@Pc(22) int local22 = 0; local22 < local1; local22++) {
			@Pc(29) Class25_Sub1_Sub1_Sub1 local29 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local3[local22]];
			if (local29.method466()) {
				local29.method5241();
				if (local29.aShort88 >= 0 && local29.aShort89 >= 0 && local29.aShort87 < Static92.anInt1675 && local29.aShort90 < Static262.anInt6340) {
					local29.aBoolean54 = local29.aBoolean191 ? local20 : false;
					if (local29 == Static321.aClass25_Sub1_Sub1_Sub1_2) {
						local29.anInt2316 = Integer.MAX_VALUE;
					} else {
						local75 = 0;
						if (!local29.aBoolean190) {
							local75++;
						}
						if (local29.anInt2348 > Static366.anInt5883) {
							local75 += 2;
						}
						local75 += 5 - local29.method1877() << 2;
						if (Static358.anInt5787 == 0) {
							local75 += 32;
						} else {
							local75 += 128;
						}
						local75 += 256;
						local29.anInt2316 = local75 + 1;
					}
				} else {
					local29.anInt2316 = -1;
				}
			} else {
				local29.anInt2316 = -1;
			}
		}
		for (@Pc(111) int local111 = 0; local111 < Static309.anInt5243; local111++) {
			@Pc(118) Class25_Sub1_Sub1_Sub2 local118 = Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local111]];
			if (local118.method1892() && local118.aClass59_1.method1156(Static230.aClass72_3)) {
				local118.method5241();
				if (local118.aShort88 >= 0 && local118.aShort89 >= 0 && local118.aShort87 < Static92.anInt1675 && local118.aShort90 < Static262.anInt6340) {
					@Pc(155) int local155 = 0;
					if (!local118.aBoolean190) {
						local155++;
					}
					if (local118.anInt2348 > Static366.anInt5883) {
						local155 += 2;
					}
					local155 += 5 - local118.method1877() << 2;
					if (Static358.anInt5787 == 0) {
						if (local118.aClass59_1.aBoolean129) {
							local155 += 64;
						} else {
							local155 += 128;
						}
					} else if (Static358.anInt5787 == 1) {
						if (local118.aClass59_1.aBoolean129) {
							local155 += 32;
						} else {
							local155 += 64;
						}
					}
					if (local118.aClass59_1.aBoolean126) {
						local155 += 1024;
					} else if (!local118.aClass59_1.aBoolean123) {
						local155 += 256;
					}
					local118.anInt2316 = local155 + 1;
				} else {
					local118.anInt2316 = -1;
				}
			} else {
				local118.anInt2316 = -1;
			}
		}
		for (local75 = 0; local75 < Static274.aClass11Array1.length; local75++) {
			@Pc(221) Class11 local221 = Static274.aClass11Array1[local75];
			if (local221 != null) {
				if (local221.anInt167 == 1) {
					@Pc(232) Class25_Sub1_Sub1_Sub2 local232 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local221.anInt172];
					if (local232 != null && local232.anInt2316 >= 0) {
						local232.anInt2316 += 2048;
					}
				} else if (local221.anInt167 == 10) {
					@Pc(253) Class25_Sub1_Sub1_Sub1 local253 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local221.anInt172];
					if (local253 != null && local253 != Static321.aClass25_Sub1_Sub1_Sub1_2 && local253.anInt2316 >= 0) {
						local253.anInt2316 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!je;IIIIIIIII)V")
	public static void method807(@OriginalArg(0) Class117[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class117 local6 = arg0[local1];
			if (local6 != null && local6.anInt3066 == arg1) {
				@Pc(17) int local17 = local6.anInt3072 + arg6;
				@Pc(22) int local22 = local6.anInt3104 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt3108 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt3074;
					@Pc(45) int local45 = local22 + local6.anInt3071;
					if (local6.anInt3108 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt3108 == 0 || local6.aBoolean270 || method810(local6).anInt3451 != 0 || local6 == Static197.aClass117_8 || local6.anInt3064 == Static300.anInt5108) {
					if (!method804(local6)) {
						if (local6 == Static227.aClass117_14) {
							Static334.aBoolean521 = true;
							Static123.anInt5254 = local17;
							Static47.anInt926 = local22;
						}
						if (local6.aBoolean265 || local28 < local32 && local30 < local34) {
							if (local6.anInt3108 == 0 && local6.aBoolean274 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class1_Sub39 local151 = (Class1_Sub39) Static140.aClass17_67.method202(); local151 != null; local151 = (Class1_Sub39) Static140.aClass17_67.method207()) {
									if (local151.aBoolean507) {
										local151.method5577();
										local151.aClass117_16.aBoolean272 = false;
									}
								}
								if (Static100.anInt6412 == 0) {
									Static227.aClass117_14 = null;
									Static197.aClass117_8 = null;
								}
								Static355.anInt4355 = 0;
								Static14.aBoolean17 = false;
								Static371.aBoolean238 = false;
								if (!Static65.aBoolean115) {
									Static32.method503();
								}
							}
							@Pc(207) boolean local207;
							if (Static300.aClass182_1.method4112() >= local28 && Static300.aClass182_1.method4121() >= local30 && Static300.aClass182_1.method4112() < local32 && Static300.aClass182_1.method4121() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static65.aBoolean115 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static296.method4458(arg8 - local17, arg9 - local22, local6);
							}
							@Pc(235) boolean local235 = false;
							if (Static300.aClass182_1.method4109() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static379.aClass1_Sub13_1 != null && Static379.aClass1_Sub13_1.method2558() == 0 && Static379.aClass1_Sub13_1.method2559() >= local28 && Static379.aClass1_Sub13_1.method2554() >= local30 && Static379.aClass1_Sub13_1.method2559() < local32 && Static379.aClass1_Sub13_1.method2554() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray59 != null) {
								for (local278 = 0; local278 < local6.aByteArray59.length; local278++) {
									if (Static264.aClass154_1.method3994(local6.aByteArray59[local278])) {
										if (local6.anIntArray358 == null || Static366.anInt5883 >= local6.anIntArray358[local278]) {
											@Pc(310) byte local310 = local6.aByteArray58[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static264.aClass154_1.method3994(86) && !Static264.aClass154_1.method3994(82) && !Static264.aClass154_1.method3994(81)) && ((local310 & 0x2) == 0 || Static264.aClass154_1.method3994(86)) && ((local310 & 0x1) == 0 || Static264.aClass154_1.method3994(82)) && ((local310 & 0x4) == 0 || Static264.aClass154_1.method3994(81))) {
												Static306.method4553(local278 + 1, "", -1, local6.anInt3093);
												local374 = local6.anIntArray355[local278];
												if (local6.anIntArray358 == null) {
													local6.anIntArray358 = new int[local6.aByteArray59.length];
												}
												if (local374 == 0) {
													local6.anIntArray358[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray358[local278] = Static366.anInt5883 + local374;
												}
											}
										}
									} else if (local6.anIntArray358 != null) {
										local6.anIntArray358[local278] = 0;
									}
								}
							}
							if (local245) {
								Static221.method3083(Static379.aClass1_Sub13_1.method2554() - local22, local6, Static379.aClass1_Sub13_1.method2559() - local17);
							}
							if (Static227.aClass117_14 != null && Static227.aClass117_14 != local6 && local207 && method810(local6).method2813()) {
								Static129.aClass117_2 = local6;
							}
							if (local6 == Static197.aClass117_8) {
								Static192.aBoolean335 = true;
								Static276.anInt5132 = local17;
								Static120.anInt2162 = local22;
							}
							if (local6.aBoolean270 || local6.anInt3064 != 0) {
								@Pc(459) Class1_Sub39 local459;
								if (local207 && Static180.anInt3208 != 0 && local6.anObjectArray22 != null) {
									local459 = new Class1_Sub39();
									local459.aBoolean507 = true;
									local459.aClass117_16 = local6;
									local459.anInt5360 = Static180.anInt3208;
									local459.anObjectArray34 = local6.anObjectArray22;
									Static140.aClass17_67.method199(local459);
								}
								if (Static227.aClass117_14 != null || Static65.aBoolean115 || local6.anInt3064 != Static248.anInt4156 && Static355.anInt4355 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt3064 != 0) {
									if (local6.anInt3064 == Static313.anInt5341 || local6.anInt3064 == Static287.anInt4935) {
										Static238.aClass117_11 = local6;
										if (Static177.aClass33_3 != null) {
											Static177.aClass33_3.method563(local6.anInt3071, Static66.aClass164_2);
										}
										if (local6.anInt3064 == Static313.anInt5341) {
											if (!Static65.aBoolean115 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static272.method4173(arg9, arg8, Static66.aClass164_2);
												for (@Pc(542) Class41_Sub6 local542 = (Class41_Sub6) Static245.aClass208_5.method4661(); local542 != null; local542 = (Class41_Sub6) Static245.aClass208_5.method4663()) {
													if (arg8 >= local542.anInt5561 && arg8 < local542.anInt5563 && arg9 >= local542.anInt5562 && arg9 < local542.anInt5560) {
														Static32.method503();
														Static231.method4901(local542.aClass25_Sub1_Sub1_1);
													}
												}
											}
											Static97.method1418(local22, local6, local17);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt3064 == Static300.anInt5108) {
										if (local6.method2511(Static66.aClass164_2) == null || Static222.anInt4507 != 0 && Static222.anInt4507 != 3 || Static65.aBoolean115 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray361[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray360[local614]) {
											continue;
										}
										local278 -= local6.anInt3074 / 2;
										local614 -= local6.anInt3071 / 2;
										if (Static323.anInt5463 == 4) {
											local653 = (int) Static386.aFloat82 & 0x3FFF;
										} else {
											local653 = (int) Static386.aFloat82 + Static246.anInt4136 & 0x3FFF;
										}
										@Pc(665) int local665 = Class13.anIntArray20[local653];
										@Pc(669) int local669 = Class13.anIntArray21[local653];
										if (Static323.anInt5463 != 4) {
											local665 = local665 * (Static205.anInt3600 + 256) >> 8;
											local669 = local669 * (Static205.anInt3600 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static323.anInt5463 == 4) {
											local719 = (Static85.anInt1570 >> 7) + (local698 >> 2);
											local727 = (Static16.anInt287 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static321.aClass25_Sub1_Sub1_Sub1_2.method1877() - 1) * 64;
											local719 = (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6080 - local736 >> 7) + (local698 >> 2);
											local727 = (Static321.aClass25_Sub1_Sub1_Sub1_2.anInt6077 - local736 >> 7) - (local708 >> 2);
										}
										if (Static90.aBoolean144 && (Static176.anInt3186 & 0x40) != 0) {
											@Pc(769) Class117 local769 = Static84.method1246(Static119.anInt2128, Static137.anInt2555);
											if (local769 == null) {
												Static361.method5016();
											} else {
												Static337.method4814(1L, 4, true, Static215.anInt3687, " ->", Static114.aString18, local719, local6.anInt3080, false, local727);
											}
											continue;
										}
										if (Static313.aClass94_8 == Static360.aClass94_7) {
											Static337.method4814(1L, 19, true, -1, "", Static267.aClass169_249.method3680(Static48.anInt952), local719, -1, false, local727);
										}
										Static337.method4814(1L, 51, true, -1, "", Static133.aString24, local719, -1, false, local727);
										continue;
									}
									if (local6.anInt3064 == Static248.anInt4156) {
										Static56.aClass117_1 = local6;
										if (local207) {
											Static14.aBoolean17 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static379.aClass1_Sub13_1.method2559() - local17 - local6.anInt3074 / 2) * 2.0D / (double) Static353.aFloat15);
											local614 = (int) -((double) (Static379.aClass1_Sub13_1.method2554() - local22 - local6.anInt3071 / 2) * 2.0D / (double) Static353.aFloat15);
											local374 = Static386.anInt6289 + local278 + Static353.anInt2629;
											local653 = Static299.anInt6015 + local614 + Static353.anInt2623;
											@Pc(883) Class1_Sub6_Sub4 local883 = Static275.method4234();
											if (local883 == null) {
												continue;
											}
											@Pc(888) int[] local888 = new int[3];
											local883.method1497(local888, local374, local653);
											if (local888 != null) {
												if (Static264.aClass154_1.method3994(82) && Static284.anInt4919 > 0) {
													Static325.method4730(local888[1], local888[0], local888[2]);
													continue;
												}
												Static371.aBoolean238 = true;
												Static366.anInt5881 = local888[0];
												Static295.anInt5083 = local888[1];
												Static341.anInt5634 = local888[2];
											}
											Static355.anInt4355 = 1;
											Static170.aBoolean275 = false;
											Static211.anInt3646 = Static300.aClass182_1.method4112();
											Static252.anInt4375 = Static300.aClass182_1.method4121();
											continue;
										}
										if (local235 && Static355.anInt4355 > 0) {
											if (Static355.anInt4355 == 1 && (Static211.anInt3646 != Static300.aClass182_1.method4112() || Static252.anInt4375 != Static300.aClass182_1.method4121())) {
												Static102.anInt3166 = Static386.anInt6289;
												Static90.anInt1649 = Static299.anInt6015;
												Static355.anInt4355 = 2;
											}
											if (Static355.anInt4355 == 2) {
												Static170.aBoolean275 = true;
												Static273.method4214(Static102.anInt3166 + (int) ((double) (Static211.anInt3646 - Static300.aClass182_1.method4112()) * 2.0D / (double) Static353.aFloat16));
												Static379.method5295(Static90.anInt1649 - (int) ((double) (Static252.anInt4375 - Static300.aClass182_1.method4121()) * 2.0D / (double) Static353.aFloat16));
											}
											continue;
										}
										if (Static355.anInt4355 > 0 && !Static170.aBoolean275) {
											if ((Static205.anInt3599 == 1 || Static293.method4440()) && Static215.anInt3678 > 2) {
												Static386.method5467(Static211.anInt3646, Static252.anInt4375);
											} else if (Static227.method4201()) {
												Static386.method5467(Static211.anInt3646, Static252.anInt4375);
											}
										}
										Static355.anInt4355 = 0;
										continue;
									}
									if (local6.anInt3064 == Static5.anInt63) {
										if (local235) {
											Static143.method2169(Static300.aClass182_1.method4112() - local17, local6.anInt3071, Static300.aClass182_1.method4121() - local22, local6.anInt3074);
										}
										continue;
									}
									if (local6.anInt3064 == Static284.anInt4914) {
										Static393.method5571(local22, local6, local17);
										continue;
									}
								}
								if (!local6.aBoolean264 && local245) {
									local6.aBoolean264 = true;
									if (local6.anObjectArray33 != null) {
										local459 = new Class1_Sub39();
										local459.aBoolean507 = true;
										local459.aClass117_16 = local6;
										local459.anInt5363 = Static379.aClass1_Sub13_1.method2559() - local17;
										local459.anInt5360 = Static379.aClass1_Sub13_1.method2554() - local22;
										local459.anObjectArray34 = local6.anObjectArray33;
										Static140.aClass17_67.method199(local459);
									}
								}
								if (local6.aBoolean264 && local235 && local6.anObjectArray4 != null) {
									local459 = new Class1_Sub39();
									local459.aBoolean507 = true;
									local459.aClass117_16 = local6;
									local459.anInt5363 = Static300.aClass182_1.method4112() - local17;
									local459.anInt5360 = Static300.aClass182_1.method4121() - local22;
									local459.anObjectArray34 = local6.anObjectArray4;
									Static140.aClass17_67.method199(local459);
								}
								if (local6.aBoolean264 && !local235) {
									local6.aBoolean264 = false;
									if (local6.anObjectArray12 != null) {
										local459 = new Class1_Sub39();
										local459.aBoolean507 = true;
										local459.aClass117_16 = local6;
										local459.anInt5363 = Static300.aClass182_1.method4112() - local17;
										local459.anInt5360 = Static300.aClass182_1.method4121() - local22;
										local459.anObjectArray34 = local6.anObjectArray12;
										Static22.aClass17_35.method199(local459);
									}
								}
								if (local235 && local6.anObjectArray32 != null) {
									local459 = new Class1_Sub39();
									local459.aBoolean507 = true;
									local459.aClass117_16 = local6;
									local459.anInt5363 = Static300.aClass182_1.method4112() - local17;
									local459.anInt5360 = Static300.aClass182_1.method4121() - local22;
									local459.anObjectArray34 = local6.anObjectArray32;
									Static140.aClass17_67.method199(local459);
								}
								if (!local6.aBoolean272 && local207) {
									local6.aBoolean272 = true;
									if (local6.anObjectArray28 != null) {
										local459 = new Class1_Sub39();
										local459.aBoolean507 = true;
										local459.aClass117_16 = local6;
										local459.anInt5363 = Static300.aClass182_1.method4112() - local17;
										local459.anInt5360 = Static300.aClass182_1.method4121() - local22;
										local459.anObjectArray34 = local6.anObjectArray28;
										Static140.aClass17_67.method199(local459);
									}
								}
								if (local6.aBoolean272 && local207 && local6.anObjectArray24 != null) {
									local459 = new Class1_Sub39();
									local459.aBoolean507 = true;
									local459.aClass117_16 = local6;
									local459.anInt5363 = Static300.aClass182_1.method4112() - local17;
									local459.anInt5360 = Static300.aClass182_1.method4121() - local22;
									local459.anObjectArray34 = local6.anObjectArray24;
									Static140.aClass17_67.method199(local459);
								}
								if (local6.aBoolean272 && !local207) {
									local6.aBoolean272 = false;
									if (local6.anObjectArray9 != null) {
										local459 = new Class1_Sub39();
										local459.aBoolean507 = true;
										local459.aClass117_16 = local6;
										local459.anInt5363 = Static300.aClass182_1.method4112() - local17;
										local459.anInt5360 = Static300.aClass182_1.method4121() - local22;
										local459.anObjectArray34 = local6.anObjectArray9;
										Static22.aClass17_35.method199(local459);
									}
								}
								if (local6.anObjectArray17 != null) {
									local459 = new Class1_Sub39();
									local459.aClass117_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray17;
									Static310.aClass17_64.method199(local459);
								}
								@Pc(1427) Class1_Sub39 local1427;
								if (local6.anObjectArray13 != null && Static118.anInt2106 > local6.anInt3048) {
									if (local6.anIntArray354 == null || Static118.anInt2106 - local6.anInt3048 > 32) {
										local459 = new Class1_Sub39();
										local459.aClass117_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray13;
										Static140.aClass17_67.method199(local459);
									} else {
										label659: for (local278 = local6.anInt3048; local278 < Static118.anInt2106; local278++) {
											local614 = Static130.anIntArray298[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray354.length; local374++) {
												if (local6.anIntArray354[local374] == local614) {
													local1427 = new Class1_Sub39();
													local1427.aClass117_16 = local6;
													local1427.anObjectArray34 = local6.anObjectArray13;
													Static140.aClass17_67.method199(local1427);
													break label659;
												}
											}
										}
									}
									local6.anInt3048 = Static118.anInt2106;
								}
								if (local6.anObjectArray5 != null && Static323.anInt5475 > local6.anInt3070) {
									if (local6.anIntArray359 == null || Static323.anInt5475 - local6.anInt3070 > 32) {
										local459 = new Class1_Sub39();
										local459.aClass117_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray5;
										Static140.aClass17_67.method199(local459);
									} else {
										label635: for (local278 = local6.anInt3070; local278 < Static323.anInt5475; local278++) {
											local614 = Static336.anIntArray647[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray359.length; local374++) {
												if (local6.anIntArray359[local374] == local614) {
													local1427 = new Class1_Sub39();
													local1427.aClass117_16 = local6;
													local1427.anObjectArray34 = local6.anObjectArray5;
													Static140.aClass17_67.method199(local1427);
													break label635;
												}
											}
										}
									}
									local6.anInt3070 = Static323.anInt5475;
								}
								if (local6.anObjectArray20 != null && Static345.anInt5668 > local6.anInt3099) {
									if (local6.anIntArray356 == null || Static345.anInt5668 - local6.anInt3099 > 32) {
										local459 = new Class1_Sub39();
										local459.aClass117_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray20;
										Static140.aClass17_67.method199(local459);
									} else {
										label611: for (local278 = local6.anInt3099; local278 < Static345.anInt5668; local278++) {
											local614 = Static150.anIntArray328[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray356.length; local374++) {
												if (local6.anIntArray356[local374] == local614) {
													local1427 = new Class1_Sub39();
													local1427.aClass117_16 = local6;
													local1427.anObjectArray34 = local6.anObjectArray20;
													Static140.aClass17_67.method199(local1427);
													break label611;
												}
											}
										}
									}
									local6.anInt3099 = Static345.anInt5668;
								}
								if (local6.anObjectArray7 != null && Static289.anInt5000 > local6.anInt3034) {
									if (local6.anIntArray362 == null || Static289.anInt5000 - local6.anInt3034 > 32) {
										local459 = new Class1_Sub39();
										local459.aClass117_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray7;
										Static140.aClass17_67.method199(local459);
									} else {
										label587: for (local278 = local6.anInt3034; local278 < Static289.anInt5000; local278++) {
											local614 = Static171.anIntArray365[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray362.length; local374++) {
												if (local6.anIntArray362[local374] == local614) {
													local1427 = new Class1_Sub39();
													local1427.aClass117_16 = local6;
													local1427.anObjectArray34 = local6.anObjectArray7;
													Static140.aClass17_67.method199(local1427);
													break label587;
												}
											}
										}
									}
									local6.anInt3034 = Static289.anInt5000;
								}
								if (local6.anObjectArray31 != null && Static205.anInt3603 > local6.anInt3053) {
									if (local6.anIntArray363 == null || Static205.anInt3603 - local6.anInt3053 > 32) {
										local459 = new Class1_Sub39();
										local459.aClass117_16 = local6;
										local459.anObjectArray34 = local6.anObjectArray31;
										Static140.aClass17_67.method199(local459);
									} else {
										label563: for (local278 = local6.anInt3053; local278 < Static205.anInt3603; local278++) {
											local614 = Static249.anIntArray532[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray363.length; local374++) {
												if (local6.anIntArray363[local374] == local614) {
													local1427 = new Class1_Sub39();
													local1427.aClass117_16 = local6;
													local1427.anObjectArray34 = local6.anObjectArray31;
													Static140.aClass17_67.method199(local1427);
													break label563;
												}
											}
										}
									}
									local6.anInt3053 = Static205.anInt3603;
								}
								if (Static301.anInt5122 > local6.anInt3110 && local6.anObjectArray8 != null) {
									local459 = new Class1_Sub39();
									local459.aClass117_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray8;
									Static140.aClass17_67.method199(local459);
								}
								if (Static329.anInt3952 > local6.anInt3110 && local6.anObjectArray10 != null) {
									local459 = new Class1_Sub39();
									local459.aClass117_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray10;
									Static140.aClass17_67.method199(local459);
								}
								if (Static53.anInt1107 > local6.anInt3110 && local6.anObjectArray25 != null) {
									local459 = new Class1_Sub39();
									local459.aClass117_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray25;
									Static140.aClass17_67.method199(local459);
								}
								if (Static19.anInt319 > local6.anInt3110 && local6.anObjectArray30 != null) {
									local459 = new Class1_Sub39();
									local459.aClass117_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray30;
									Static140.aClass17_67.method199(local459);
								}
								if (Static71.anInt1429 > local6.anInt3110 && local6.anObjectArray14 != null) {
									local459 = new Class1_Sub39();
									local459.aClass117_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray14;
									Static140.aClass17_67.method199(local459);
								}
								local6.anInt3110 = Static105.anInt1853;
								if (local6.anObjectArray27 != null) {
									for (local278 = 0; local278 < Static330.anInt5516; local278++) {
										@Pc(1895) Class1_Sub39 local1895 = new Class1_Sub39();
										local1895.aClass117_16 = local6;
										local1895.anInt5364 = Static389.aClass69Array1[local278].method1266();
										local1895.anInt5359 = Static389.aClass69Array1[local278].method1261();
										local1895.anObjectArray34 = local6.anObjectArray27;
										Static140.aClass17_67.method199(local1895);
									}
								}
								if (Static56.aBoolean104 && local6.anObjectArray6 != null) {
									local459 = new Class1_Sub39();
									local459.aClass117_16 = local6;
									local459.anObjectArray34 = local6.anObjectArray6;
									Static140.aClass17_67.method199(local459);
								}
							}
							if (local6.anInt3108 == 5 && local6.anInt3097 != -1) {
								local6.method2505(Static274.aClass63_1, Static301.aClass31_1).method563(local6.anInt3071, Static66.aClass164_2);
							}
							Static264.method4056(local6);
							if (local6.anInt3108 == 0) {
								method807(arg0, local6.anInt3093, local28, local30, local32, local34, local17 - local6.anInt3040, local22 - local6.anInt3089, arg8, arg9);
								if (local6.aClass117Array1 != null) {
									method807(local6.aClass117Array1, local6.anInt3093, local28, local30, local32, local34, local17 - local6.anInt3040, local22 - local6.anInt3089, arg8, arg9);
								}
								@Pc(2017) Class1_Sub38 local2017 = (Class1_Sub38) Static22.aClass77_29.method1368((long) local6.anInt3093);
								if (local2017 != null) {
									if (Static313.aClass94_8 == Static59.aClass94_3 && local2017.anInt5052 == 0 && !Static65.aBoolean115 && local207 && !Static274.aBoolean463) {
										Static32.method503();
									}
									Static310.method4623(arg8, local22, local2017.anInt5050, arg9, local34, local17, local28, local32, local30);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static264.method4056(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method808() {
		for (@Pc(1) int local1 = 0; local1 < Static92.anInt1675; local1++) {
			@Pc(6) int[] local6 = Static51.anIntArrayArray15[local1];
			for (@Pc(8) int local8 = 0; local8 < Static262.anInt6340; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!je;)Lclient!ko;")
	public static Class1_Sub22 method810(@OriginalArg(0) Class117 arg0) {
		@Pc(13) Class1_Sub22 local13 = (Class1_Sub22) Static54.aClass77_5.method1368(((long) arg0.anInt3093 << 32) + (long) arg0.anInt3043);
		return local13 == null ? arg0.aClass1_Sub22_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
	public static void method811(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static331.anInt5548;
		@Pc(3) int[] local3 = Static345.anIntArray681;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static309.anInt5243; local5++) {
			@Pc(15) Class25_Sub1_Sub1 local15;
			if (local5 < local1) {
				local15 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local3[local5]];
			} else {
				local15 = Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local5 - local1]];
			}
			if (local15.aByte70 == arg0 && local15.anInt2316 >= 0) {
				@Pc(35) int local35 = local15.method1877();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6080 & 0x7F) != 0 || (local15.anInt6077 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6080 & 0x7F) != 64 || (local15.anInt6077 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6080 >> 7;
					local76 = local15.anInt6077 >> 7;
					if (local15.anInt2316 > Static51.anIntArrayArray15[local71][local76]) {
						Static51.anIntArrayArray15[local71][local76] = local15.anInt2316;
						Static8.anIntArrayArray1[local71][local76] = 1;
					} else if (local15.anInt2316 == Static51.anIntArrayArray15[local71][local76]) {
						local112 = Static8.anIntArrayArray1[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6080 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6077 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6080 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6077 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt2316 > Static51.anIntArrayArray15[local154][local157]) {
								Static51.anIntArrayArray15[local154][local157] = local15.anInt2316;
								Static8.anIntArrayArray1[local154][local157] = 1;
							} else if (local15.anInt2316 == Static51.anIntArrayArray15[local154][local157]) {
								local112 = Static8.anIntArrayArray1[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "h", descriptor = "(I)I")
	public static int method812() {
		if (Static227.aClass117_14 == null) {
			if (!Static65.aBoolean115 && Static215.anInt3678 > 0) {
				if (Static327.aBoolean516 && Static264.aClass154_1.method3994(81) && Static215.anInt3678 > 2) {
					return ((Class1_Sub40) Static358.aClass17_66.aClass1_15.aClass1_244.aClass1_244).anInt5416;
				}
				return ((Class1_Sub40) Static358.aClass17_66.aClass1_15.aClass1_244).anInt5416;
			}
			@Pc(23) int local23 = Static300.aClass182_1.method4112();
			@Pc(27) int local27 = Static300.aClass182_1.method4121();
			@Pc(29) int local29 = Static90.anInt1655;
			@Pc(31) int local31 = Static38.anInt737;
			@Pc(33) int local33 = Static56.anInt1146;
			if (local23 > local29 && local29 + local33 > local23) {
				@Pc(51) int local51 = -1;
				@Pc(70) int local70;
				for (@Pc(53) int local53 = 0; local53 < Static215.anInt3678; local53++) {
					if (Static122.aBoolean178) {
						local70 = (Static215.anInt3678 - local53 - 1) * 16 + local31 + 33;
						if (local27 > local70 - 13 && local27 <= local70 + 3) {
							local51 = local53;
						}
					} else {
						local70 = (Static215.anInt3678 - local53 - 1) * 16 + local31 + 31;
						if (local27 > local70 - 13 && local70 + 3 >= local27) {
							local51 = local53;
						}
					}
				}
				if (local51 != -1) {
					local70 = 0;
					@Pc(127) Class186 local127 = new Class186(Static358.aClass17_66);
					for (@Pc(132) Class1_Sub40 local132 = (Class1_Sub40) local127.method4292(); local132 != null; local132 = (Class1_Sub40) local127.method4295()) {
						if (local51 == local70++) {
							return local132.anInt5416;
						}
					}
				}
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method815(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static331.anInt5548;
		@Pc(3) int[] local3 = Static345.anIntArray681;
		@Pc(11) int local11 = Static280.aBoolean471 ? local1 : local1 + Static309.anInt5243;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class25_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local3[local13]];
			} else {
				local23 = Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local13 - local1]];
			}
			if (local23.aByte70 == arg0) {
				local23.anInt2320 = 0;
				if (local23.anInt2316 < 0) {
					local23.aBoolean190 = false;
				} else {
					@Pc(50) int local50 = local23.method1877();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6080 & 0x7F) != 0 || (local23.anInt6077 & 0x7F) != 0) {
							local23.aBoolean190 = false;
							continue;
						}
					} else if ((local23.anInt6080 & 0x7F) != 64 || (local23.anInt6077 & 0x7F) != 64) {
						local23.aBoolean190 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6080 >> 7;
						local97 = local23.anInt6077 >> 7;
						if (local23.anInt2316 != Static51.anIntArrayArray15[local92][local97]) {
							local23.aBoolean190 = true;
							continue;
						}
						if (Static8.anIntArrayArray1[local92][local97] > 1) {
							local122 = Static8.anIntArrayArray1[local92][local97]--;
							local23.aBoolean190 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6080 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6077 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6080 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6077 + local92 >> 7;
						if (!Static302.method4519(local165, local97, local151, local23.anInt2316, local158)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt2316 == Static51.anIntArrayArray15[local176][local179]) {
										local122 = Static8.anIntArrayArray1[local176][local179]--;
									}
								}
							}
							local23.aBoolean190 = true;
							continue;
						}
					}
					if (local23 instanceof Class25_Sub1_Sub1_Sub1 && local23.aClass1_Sub44_3 != null && Static366.anInt5883 >= local23.aClass1_Sub44_3.anInt6143 && Static366.anInt5883 < local23.aClass1_Sub44_3.anInt6141) {
						((Class25_Sub1_Sub1_Sub1) local23).aBoolean54 = false;
					}
					local23.aBoolean190 = false;
					local23.anInt6085 = Static236.method3260(local23.aByte70, local23.anInt6077, local23.anInt6080);
					Static31.method498(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)I")
	public static int method816(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class1_Sub37 local8 = Static367.method5078(arg1, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray589.length) {
			return local8.anIntArray589[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method817() {
		Static22.anInt3895 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static309.anInt5243; local3++) {
			@Pc(10) Class25_Sub1_Sub1_Sub2 local10 = Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local3]];
			if (local10.aBoolean190 && local10.method1883() != -1) {
				@Pc(28) int local28 = (local10.method1877() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6080 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6077 - local28 >> 7;
				@Pc(49) Class25_Sub1_Sub1 local49 = Static182.method2609(local35, local10.aByte70, local42);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt2331;
					if (local49 instanceof Class25_Sub1_Sub1_Sub2) {
						local54 += 2048;
					}
					if (local49.anInt2320 == 0 && local49.method1883() != -1) {
						Static67.anIntArray181[Static22.anInt3895] = local54;
						Static54.anIntArray144[Static22.anInt3895] = local54;
						Static22.anInt3895++;
						local49.anInt2320++;
					}
					Static67.anIntArray181[Static22.anInt3895] = local54;
					Static54.anIntArray144[Static22.anInt3895] = local10.anInt2331 + 2048;
					Static22.anInt3895++;
					local49.anInt2320++;
				}
			}
		}
		Static342.method4853(0, Static67.anIntArray181, Static54.anIntArray144, Static22.anInt3895 - 1);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method821() {
		@Pc(1) int local1 = Static331.anInt5548;
		@Pc(3) int[] local3 = Static345.anIntArray681;
		@Pc(11) int local11 = Static280.aBoolean471 ? local1 : local1 + Static309.anInt5243;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class25_Sub1_Sub1 local23;
			if (local13 < local1) {
				local23 = Static225.aClass25_Sub1_Sub1_Sub1Array3[local3[local13]];
			} else {
				local23 = Static171.aClass25_Sub1_Sub1_Sub2Array1[Static131.anIntArray302[local13 - local1]];
			}
			if (local23.anInt2316 >= 0) {
				@Pc(39) int local39 = local23.method1877();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6080 & 0x7F) == 0 && (local23.anInt6077 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6080 & 0x7F) == 64 && (local23.anInt6077 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class25_Sub1_Sub1_Sub1 && local23.aClass1_Sub44_3 != null && Static366.anInt5883 >= local23.aClass1_Sub44_3.anInt6143 && Static366.anInt5883 < local23.aClass1_Sub44_3.anInt6141) {
					((Class25_Sub1_Sub1_Sub1) local23).aBoolean54 = false;
				}
				local23.anInt6085 = Static236.method3260(local23.aByte70, local23.anInt6077, local23.anInt6080);
				Static31.method498(local23, true);
			}
		}
	}
}
