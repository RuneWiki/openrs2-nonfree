import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
	public static int[] anIntArray129;

	@OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
	public static int anInt897;

	@OriginalMember(owner = "client!client", name = "eb", descriptor = "Lclient!fc;")
	public static Class71 aClass71_12;

	@OriginalMember(owner = "client!client", name = "F", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!client", name = "kb", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_16 = new Class41(8, -1);

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!ms;)Lclient!tc;")
	public static Class2_Sub35 method878(@OriginalArg(0) Class155 arg0) {
		@Pc(13) Class2_Sub35 local13 = (Class2_Sub35) Static360.aClass214_31.method5059(((long) arg0.anInt4166 << 32) + (long) arg0.anInt4135);
		return local13 == null ? arg0.aClass2_Sub35_2 : local13;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method880() {
		for (@Pc(1) int local1 = 0; local1 < Static392.anInt6751; local1++) {
			@Pc(6) int[] local6 = Static240.anIntArrayArray28[local1];
			for (@Pc(8) int local8 = 0; local8 < Static307.anInt5484; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method881() {
		@Pc(1) int local1 = Static168.anInt3003;
		@Pc(3) int[] local3 = Static7.anIntArray24;
		@Pc(18) boolean local18 = Static235.anInt4315 == 1 && local1 > 200 || Static235.anInt4315 == 0 && local1 > 50;
		@Pc(73) int local73;
		for (@Pc(20) int local20 = 0; local20 < local1; local20++) {
			@Pc(27) Class12_Sub1_Sub2_Sub2 local27 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local3[local20]];
			if (local27.method4716()) {
				local27.method5457();
				if (local27.aShort97 >= 0 && local27.aShort94 >= 0 && local27.aShort96 < Static392.anInt6751 && local27.aShort95 < Static307.anInt5484) {
					local27.aBoolean424 = local27.aBoolean422 ? local18 : false;
					if (local27 == Static267.aClass12_Sub1_Sub2_Sub2_1) {
						local27.anInt5361 = Integer.MAX_VALUE;
					} else {
						local73 = 0;
						if (!local27.aBoolean421) {
							local73++;
						}
						if (local27.anInt5322 > Static295.anInt5281) {
							local73 += 2;
						}
						local73 += 5 - local27.method4706() << 2;
						if (Static223.anInt4127 == 0) {
							local73 += 32;
						} else {
							local73 += 128;
						}
						local73 += 256;
						local27.anInt5361 = local73 + 1;
					}
				} else {
					local27.anInt5361 = -1;
				}
			} else {
				local27.anInt5361 = -1;
			}
		}
		for (@Pc(109) int local109 = 0; local109 < Static199.anInt3672; local109++) {
			@Pc(116) Class12_Sub1_Sub2_Sub1 local116 = Static107.aClass12_Sub1_Sub2_Sub1Array1[Static346.anIntArray730[local109]];
			if (local116.method3258() && local116.aClass240_1.method5572(Static248.aClass125_1)) {
				local116.method5457();
				if (local116.aShort97 >= 0 && local116.aShort94 >= 0 && local116.aShort96 < Static392.anInt6751 && local116.aShort95 < Static307.anInt5484) {
					@Pc(153) int local153 = 0;
					if (!local116.aBoolean421) {
						local153++;
					}
					if (local116.anInt5322 > Static295.anInt5281) {
						local153 += 2;
					}
					local153 += 5 - local116.method4706() << 2;
					if (Static223.anInt4127 == 0) {
						if (local116.aClass240_1.aBoolean484) {
							local153 += 64;
						} else {
							local153 += 128;
						}
					} else if (Static223.anInt4127 == 1) {
						if (local116.aClass240_1.aBoolean484) {
							local153 += 32;
						} else {
							local153 += 64;
						}
					}
					if (local116.aClass240_1.aBoolean483) {
						local153 += 1024;
					} else if (!local116.aClass240_1.aBoolean479) {
						local153 += 256;
					}
					local116.anInt5361 = local153 + 1;
				} else {
					local116.anInt5361 = -1;
				}
			} else {
				local116.anInt5361 = -1;
			}
		}
		for (local73 = 0; local73 < Static239.aClass97Array1.length; local73++) {
			@Pc(219) Class97 local219 = Static239.aClass97Array1[local73];
			if (local219 != null) {
				if (local219.anInt2442 == 1) {
					@Pc(230) Class12_Sub1_Sub2_Sub1 local230 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local219.anInt2444];
					if (local230 != null && local230.anInt5361 >= 0) {
						local230.anInt5361 += 2048;
					}
				} else if (local219.anInt2442 == 10) {
					@Pc(251) Class12_Sub1_Sub2_Sub2 local251 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local219.anInt2444];
					if (local251 != null && local251 != Static267.aClass12_Sub1_Sub2_Sub2_1 && local251.anInt5361 >= 0) {
						local251.anInt5361 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method882() {
		Static306.anInt5453 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static199.anInt3672; local3++) {
			@Pc(10) Class12_Sub1_Sub2_Sub1 local10 = Static107.aClass12_Sub1_Sub2_Sub1Array1[Static346.anIntArray730[local3]];
			if (local10.aBoolean421 && local10.method4701() != -1) {
				@Pc(28) int local28 = (local10.method4706() - 1) * 64 + 60;
				@Pc(35) int local35 = local10.anInt6328 - local28 >> 7;
				@Pc(42) int local42 = local10.anInt6317 - local28 >> 7;
				@Pc(49) Class12_Sub1_Sub2 local49 = Static376.method5644(local10.aByte74, local42, local35);
				if (local49 != null) {
					@Pc(54) int local54 = local49.anInt5365;
					if (local49 instanceof Class12_Sub1_Sub2_Sub1) {
						local54 += 2048;
					}
					if (local49.anInt5333 == 0 && local49.method4701() != -1) {
						Static193.anIntArray806[Static306.anInt5453] = local54;
						Static116.anIntArray257[Static306.anInt5453] = local54;
						Static306.anInt5453++;
						local49.anInt5333++;
					}
					Static193.anIntArray806[Static306.anInt5453] = local54;
					Static116.anIntArray257[Static306.anInt5453] = local10.anInt5365 + 2048;
					Static306.anInt5453++;
					local49.anInt5333++;
				}
			}
		}
		Static88.method1528(Static193.anIntArray806, Static306.anInt5453 - 1, Static116.anIntArray257, 0);
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method884() {
		@Pc(1) int local1 = Static168.anInt3003;
		@Pc(3) int[] local3 = Static7.anIntArray24;
		@Pc(11) int local11 = Static264.aBoolean342 ? local1 : local1 + Static199.anInt3672;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class12_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local3[local13]];
			} else {
				local23 = Static107.aClass12_Sub1_Sub2_Sub1Array1[Static346.anIntArray730[local13 - local1]];
			}
			if (local23.anInt5361 >= 0) {
				@Pc(39) int local39 = local23.method4706();
				if ((local39 & 0x1) == 0) {
					if ((local23.anInt6328 & 0x7F) == 0 && (local23.anInt6317 & 0x7F) == 0) {
						continue;
					}
				} else if ((local23.anInt6328 & 0x7F) == 64 && (local23.anInt6317 & 0x7F) == 64) {
					continue;
				}
				if (local23 instanceof Class12_Sub1_Sub2_Sub2 && local23.aClass2_Sub3_3 != null && Static295.anInt5281 >= local23.aClass2_Sub3_3.anInt155 && Static295.anInt5281 < local23.aClass2_Sub3_3.anInt153) {
					((Class12_Sub1_Sub2_Sub2) local23).aBoolean424 = false;
				}
				local23.anInt6322 = Static18.method508(local23.anInt6317, local23.aByte74, local23.anInt6328);
				Static326.method5033(local23, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!ms;)Lclient!ms;")
	public static Class155 method886(@OriginalArg(0) Class155 arg0) {
		@Pc(4) int local4 = method878(arg0).method5121();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static240.method3886(arg0.anInt4144);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!ms;)Z")
	public static boolean method888(@OriginalArg(0) Class155 arg0) {
		if (Static218.aBoolean304) {
			if (method878(arg0).anInt5883 != 0) {
				return false;
			}
			if (arg0.anInt4164 == 0) {
				return false;
			}
		}
		return arg0.aBoolean320;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!ms;IIIIIIIII)V")
	public static void method891(@OriginalArg(0) Class155[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class155 local6 = arg0[local1];
			if (local6 != null && local6.anInt4144 == arg1) {
				@Pc(17) int local17 = local6.anInt4189 + arg6;
				@Pc(22) int local22 = local6.anInt4206 + arg7;
				@Pc(28) int local28;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				if (local6.anInt4164 == 2) {
					local28 = arg2;
					local30 = arg3;
					local32 = arg4;
					local34 = arg5;
				} else {
					@Pc(40) int local40 = local17 + local6.anInt4170;
					@Pc(45) int local45 = local22 + local6.anInt4214;
					if (local6.anInt4164 == 9) {
						local40++;
						local45++;
					}
					local28 = local17 > arg2 ? local17 : arg2;
					local30 = local22 > arg3 ? local22 : arg3;
					local32 = local40 < arg4 ? local40 : arg4;
					local34 = local45 < arg5 ? local45 : arg5;
				}
				if (local6.anInt4164 == 0 || local6.aBoolean315 || method878(local6).anInt5883 != 0 || local6 == Static380.aClass155_38 || local6.anInt4155 == Static252.anInt4528) {
					if (!method888(local6)) {
						if (local6 == Static243.aClass155_26) {
							Static330.aBoolean447 = true;
							Static291.anInt5148 = local17;
							Static112.anInt2244 = local22;
						}
						if (local6.aBoolean322 || local28 < local32 && local30 < local34) {
							if (local6.anInt4164 == 0 && local6.aBoolean316 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								for (@Pc(151) Class2_Sub24 local151 = (Class2_Sub24) Static351.aClass210_15.method5035(); local151 != null; local151 = (Class2_Sub24) Static351.aClass210_15.method5037()) {
									if (local151.aBoolean273) {
										local151.method5745();
										local151.aClass155_23.aBoolean309 = false;
									}
								}
								if (Static137.anInt2566 == 0) {
									Static243.aClass155_26 = null;
									Static380.aClass155_38 = null;
								}
								Static388.anInt4033 = 0;
								Static388.aBoolean303 = false;
								Static364.aBoolean380 = false;
								if (!Static48.aBoolean87) {
									Static347.method5296();
								}
							}
							@Pc(207) boolean local207;
							if (Static138.aClass78_1.method1804() >= local28 && Static138.aClass78_1.method1808() >= local30 && Static138.aClass78_1.method1804() < local32 && Static138.aClass78_1.method1808() < local34) {
								local207 = true;
							} else {
								local207 = false;
							}
							if (!Static48.aBoolean87 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
								Static257.method5621(arg9 - local22, arg8 - local17, local6);
							}
							@Pc(235) boolean local235 = false;
							if (Static138.aClass78_1.method1806() && local207) {
								local235 = true;
							}
							@Pc(245) boolean local245 = false;
							if (Static345.aClass2_Sub10_1 != null && Static345.aClass2_Sub10_1.method1120() == 0 && Static345.aClass2_Sub10_1.method1124() >= local28 && Static345.aClass2_Sub10_1.method1116() >= local30 && Static345.aClass2_Sub10_1.method1124() < local32 && Static345.aClass2_Sub10_1.method1116() < local34) {
								local245 = true;
							}
							@Pc(278) int local278;
							@Pc(374) int local374;
							if (local6.aByteArray67 != null) {
								for (local278 = 0; local278 < local6.aByteArray67.length; local278++) {
									if (Static129.aClass149_1.method3685(local6.aByteArray67[local278])) {
										if (local6.anIntArray505 == null || Static295.anInt5281 >= local6.anIntArray505[local278]) {
											@Pc(310) byte local310 = local6.aByteArray68[local278];
											if (local310 == 0 || ((local310 & 0x8) == 0 || !Static129.aClass149_1.method3685(86) && !Static129.aClass149_1.method3685(82) && !Static129.aClass149_1.method3685(81)) && ((local310 & 0x2) == 0 || Static129.aClass149_1.method3685(86)) && ((local310 & 0x1) == 0 || Static129.aClass149_1.method3685(82)) && ((local310 & 0x4) == 0 || Static129.aClass149_1.method3685(81))) {
												Static360.method5471(local278 + 1, -1, "", local6.anInt4166);
												local374 = local6.anIntArray506[local278];
												if (local6.anIntArray505 == null) {
													local6.anIntArray505 = new int[local6.aByteArray67.length];
												}
												if (local374 == 0) {
													local6.anIntArray505[local278] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray505[local278] = Static295.anInt5281 + local374;
												}
											}
										}
									} else if (local6.anIntArray505 != null) {
										local6.anIntArray505[local278] = 0;
									}
								}
							}
							if (local245) {
								Static389.method5722(local6, Static345.aClass2_Sub10_1.method1116() - local22, Static345.aClass2_Sub10_1.method1124() - local17);
							}
							if (Static243.aClass155_26 != null && Static243.aClass155_26 != local6 && local207 && method878(local6).method5125()) {
								Static365.aClass155_13 = local6;
							}
							if (local6 == Static380.aClass155_38) {
								Static291.aBoolean382 = true;
								Static17.anInt415 = local17;
								Static33.anInt705 = local22;
							}
							if (local6.aBoolean315 || local6.anInt4155 != 0) {
								@Pc(459) Class2_Sub24 local459;
								if (local207 && Static32.anInt6038 != 0 && local6.anObjectArray31 != null) {
									local459 = new Class2_Sub24();
									local459.aBoolean273 = true;
									local459.aClass155_23 = local6;
									local459.anInt3669 = Static32.anInt6038;
									local459.anObjectArray5 = local6.anObjectArray31;
									Static351.aClass210_15.method5044(local459);
								}
								if (Static243.aClass155_26 != null || Static48.aBoolean87 || local6.anInt4155 != Static136.anInt2538 && Static388.anInt4033 > 0) {
									local245 = false;
									local235 = false;
									local207 = false;
								}
								@Pc(614) int local614;
								if (local6.anInt4155 != 0) {
									if (local6.anInt4155 == Static369.anInt6456 || local6.anInt4155 == Static143.anInt2604) {
										Static291.aClass155_28 = local6;
										if (Static250.aClass248_1 != null) {
											Static250.aClass248_1.method5710(Static304.aClass82_4, local6.anInt4214);
										}
										if (local6.anInt4155 == Static369.anInt6456) {
											if (!Static48.aBoolean87 && arg8 >= local28 && arg9 >= local30 && arg8 < local32 && arg9 < local34) {
												Static127.method2273(arg9, Static304.aClass82_4, arg8);
												for (@Pc(542) Class22_Sub3 local542 = (Class22_Sub3) Static183.aClass56_4.method1259(); local542 != null; local542 = (Class22_Sub3) Static183.aClass56_4.method1254()) {
													if (arg8 >= local542.anInt1101 && arg8 < local542.anInt1104 && arg9 >= local542.anInt1103 && arg9 < local542.anInt1102) {
														Static347.method5296();
														Static332.method5086(local542.aClass12_Sub1_Sub2_1);
													}
												}
											}
											Static54.method1042(local6, local22, local17);
											continue;
										}
									}
									@Pc(653) int local653;
									if (local6.anInt4155 == Static252.anInt4528) {
										if (local6.method3760(Static304.aClass82_4) == null || Static279.anInt4939 != 0 && Static279.anInt4939 != 3 || Static48.aBoolean87 || arg8 < local28 || arg9 < local30 || arg8 >= local32 || arg9 >= local34) {
											continue;
										}
										local278 = arg8 - local17;
										local614 = arg9 - local22;
										local374 = local6.anIntArray513[local614];
										if (local278 < local374 || local278 > local374 + local6.anIntArray511[local614]) {
											continue;
										}
										local278 -= local6.anInt4170 / 2;
										local614 -= local6.anInt4214 / 2;
										if (Static283.anInt5017 == 4) {
											local653 = (int) Static18.aFloat8 & 0x3FFF;
										} else {
											local653 = (int) Static18.aFloat8 + Static232.anInt4267 & 0x3FFF;
										}
										@Pc(665) int local665 = Class104.anIntArray705[local653];
										@Pc(669) int local669 = Class104.anIntArray706[local653];
										if (Static283.anInt5017 != 4) {
											local665 = local665 * (Static48.anInt942 + 256) >> 8;
											local669 = local669 * (Static48.anInt942 + 256) >> 8;
										}
										@Pc(698) int local698 = local614 * local665 + local278 * local669 >> 15;
										@Pc(708) int local708 = local614 * local669 - local278 * local665 >> 15;
										@Pc(719) int local719;
										@Pc(727) int local727;
										if (Static283.anInt5017 == 4) {
											local719 = (Static332.anInt5822 >> 7) + (local698 >> 2);
											local727 = (Static290.anInt5133 >> 7) - (local708 >> 2);
										} else {
											@Pc(736) int local736 = (Static267.aClass12_Sub1_Sub2_Sub2_1.method4706() - 1) * 64;
											local719 = (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6328 - local736 >> 7) + (local698 >> 2);
											local727 = (Static267.aClass12_Sub1_Sub2_Sub2_1.anInt6317 - local736 >> 7) - (local708 >> 2);
										}
										if (Static68.aBoolean110 && (Static26.anInt622 & 0x40) != 0) {
											@Pc(769) Class155 local769 = Static257.method5607(Static106.anInt2069, Static54.anInt1110);
											if (local769 == null) {
												Static327.method5048();
											} else {
												Static163.method2688(false, local719, " ->", local727, 2, 1L, Static363.anInt5936, local6.anInt4212, Static258.aString34, true);
											}
											continue;
										}
										if (Static209.aClass48_2 == Static77.aClass48_1) {
											Static163.method2688(false, local719, "", local727, 6, 1L, -1, -1, Static72.aClass221_52.method5229(Static189.anInt5185), true);
										}
										Static163.method2688(false, local719, "", local727, 9, 1L, -1, -1, Static73.aString17, true);
										continue;
									}
									if (local6.anInt4155 == Static136.anInt2538) {
										Static360.aClass155_37 = local6;
										if (local207) {
											Static388.aBoolean303 = true;
										}
										if (local245) {
											local278 = (int) ((double) (Static345.aClass2_Sub10_1.method1124() - local17 - local6.anInt4170 / 2) * 2.0D / (double) Static302.aFloat7);
											local614 = (int) -((double) (Static345.aClass2_Sub10_1.method1116() - local22 - local6.anInt4214 / 2) * 2.0D / (double) Static302.aFloat7);
											local374 = Static284.anInt5040 + local278 + Static302.anInt396;
											local653 = Static318.anInt4656 + local614 + Static302.anInt387;
											@Pc(883) Class2_Sub1_Sub17 local883 = Static178.method2901();
											if (local883 == null) {
												continue;
											}
											@Pc(888) int[] local888 = new int[3];
											local883.method5755(local374, local653, local888);
											if (local888 != null) {
												if (Static129.aClass149_1.method3685(82) && Static287.anInt5112 > 0) {
													Static278.method1452(local888[1], local888[2], local888[0]);
													continue;
												}
												Static364.aBoolean380 = true;
												Static290.anInt5135 = local888[0];
												Static306.anInt5447 = local888[1];
												Static360.anInt6350 = local888[2];
											}
											Static388.anInt4033 = 1;
											Static317.aBoolean438 = false;
											Static366.anInt6415 = Static138.aClass78_1.method1804();
											Static22.anInt540 = Static138.aClass78_1.method1808();
											continue;
										}
										if (local235 && Static388.anInt4033 > 0) {
											if (Static388.anInt4033 == 1 && (Static366.anInt6415 != Static138.aClass78_1.method1804() || Static22.anInt540 != Static138.aClass78_1.method1808())) {
												Static9.anInt250 = Static284.anInt5040;
												Static216.anInt3990 = Static318.anInt4656;
												Static388.anInt4033 = 2;
											}
											if (Static388.anInt4033 == 2) {
												Static317.aBoolean438 = true;
												Static71.method1293(Static9.anInt250 + (int) ((double) (Static366.anInt6415 - Static138.aClass78_1.method1804()) * 2.0D / (double) Static302.aFloat6));
												Static254.method4015(Static216.anInt3990 - (int) ((double) (Static22.anInt540 - Static138.aClass78_1.method1808()) * 2.0D / (double) Static302.aFloat6));
											}
											continue;
										}
										if (Static388.anInt4033 > 0 && !Static317.aBoolean438) {
											if ((Static334.anInt5856 == 1 || Static280.method4312()) && Static379.anInt1192 > 2) {
												Static97.method1768(Static22.anInt540, Static366.anInt6415);
											} else if (Static23.method633()) {
												Static97.method1768(Static22.anInt540, Static366.anInt6415);
											}
										}
										Static388.anInt4033 = 0;
										continue;
									}
									if (local6.anInt4155 == Static209.anInt3864) {
										if (local235) {
											Static386.method1338(local6.anInt4214, Static138.aClass78_1.method1804() - local17, local6.anInt4170, Static138.aClass78_1.method1808() - local22);
										}
										continue;
									}
									if (local6.anInt4155 == Static40.anInt6582) {
										Static179.method2925(local17, local22, local6);
										continue;
									}
								}
								if (!local6.aBoolean318 && local245) {
									local6.aBoolean318 = true;
									if (local6.anObjectArray25 != null) {
										local459 = new Class2_Sub24();
										local459.aBoolean273 = true;
										local459.aClass155_23 = local6;
										local459.anInt3666 = Static345.aClass2_Sub10_1.method1124() - local17;
										local459.anInt3669 = Static345.aClass2_Sub10_1.method1116() - local22;
										local459.anObjectArray5 = local6.anObjectArray25;
										Static351.aClass210_15.method5044(local459);
									}
								}
								if (local6.aBoolean318 && local235 && local6.anObjectArray18 != null) {
									local459 = new Class2_Sub24();
									local459.aBoolean273 = true;
									local459.aClass155_23 = local6;
									local459.anInt3666 = Static138.aClass78_1.method1804() - local17;
									local459.anInt3669 = Static138.aClass78_1.method1808() - local22;
									local459.anObjectArray5 = local6.anObjectArray18;
									Static351.aClass210_15.method5044(local459);
								}
								if (local6.aBoolean318 && !local235) {
									local6.aBoolean318 = false;
									if (local6.anObjectArray29 != null) {
										local459 = new Class2_Sub24();
										local459.aBoolean273 = true;
										local459.aClass155_23 = local6;
										local459.anInt3666 = Static138.aClass78_1.method1804() - local17;
										local459.anInt3669 = Static138.aClass78_1.method1808() - local22;
										local459.anObjectArray5 = local6.anObjectArray29;
										Static283.aClass210_34.method5044(local459);
									}
								}
								if (local235 && local6.anObjectArray28 != null) {
									local459 = new Class2_Sub24();
									local459.aBoolean273 = true;
									local459.aClass155_23 = local6;
									local459.anInt3666 = Static138.aClass78_1.method1804() - local17;
									local459.anInt3669 = Static138.aClass78_1.method1808() - local22;
									local459.anObjectArray5 = local6.anObjectArray28;
									Static351.aClass210_15.method5044(local459);
								}
								if (!local6.aBoolean309 && local207) {
									local6.aBoolean309 = true;
									if (local6.anObjectArray17 != null) {
										local459 = new Class2_Sub24();
										local459.aBoolean273 = true;
										local459.aClass155_23 = local6;
										local459.anInt3666 = Static138.aClass78_1.method1804() - local17;
										local459.anInt3669 = Static138.aClass78_1.method1808() - local22;
										local459.anObjectArray5 = local6.anObjectArray17;
										Static351.aClass210_15.method5044(local459);
									}
								}
								if (local6.aBoolean309 && local207 && local6.anObjectArray27 != null) {
									local459 = new Class2_Sub24();
									local459.aBoolean273 = true;
									local459.aClass155_23 = local6;
									local459.anInt3666 = Static138.aClass78_1.method1804() - local17;
									local459.anInt3669 = Static138.aClass78_1.method1808() - local22;
									local459.anObjectArray5 = local6.anObjectArray27;
									Static351.aClass210_15.method5044(local459);
								}
								if (local6.aBoolean309 && !local207) {
									local6.aBoolean309 = false;
									if (local6.anObjectArray20 != null) {
										local459 = new Class2_Sub24();
										local459.aBoolean273 = true;
										local459.aClass155_23 = local6;
										local459.anInt3666 = Static138.aClass78_1.method1804() - local17;
										local459.anInt3669 = Static138.aClass78_1.method1808() - local22;
										local459.anObjectArray5 = local6.anObjectArray20;
										Static283.aClass210_34.method5044(local459);
									}
								}
								if (local6.anObjectArray23 != null) {
									local459 = new Class2_Sub24();
									local459.aClass155_23 = local6;
									local459.anObjectArray5 = local6.anObjectArray23;
									Static194.aClass210_26.method5044(local459);
								}
								@Pc(1427) Class2_Sub24 local1427;
								if (local6.anObjectArray19 != null && Static189.anInt5187 > local6.anInt4216) {
									if (local6.anIntArray507 == null || Static189.anInt5187 - local6.anInt4216 > 32) {
										local459 = new Class2_Sub24();
										local459.aClass155_23 = local6;
										local459.anObjectArray5 = local6.anObjectArray19;
										Static351.aClass210_15.method5044(local459);
									} else {
										label659: for (local278 = local6.anInt4216; local278 < Static189.anInt5187; local278++) {
											local614 = Static242.anIntArray538[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray507.length; local374++) {
												if (local6.anIntArray507[local374] == local614) {
													local1427 = new Class2_Sub24();
													local1427.aClass155_23 = local6;
													local1427.anObjectArray5 = local6.anObjectArray19;
													Static351.aClass210_15.method5044(local1427);
													break label659;
												}
											}
										}
									}
									local6.anInt4216 = Static189.anInt5187;
								}
								if (local6.anObjectArray30 != null && Static297.anInt5975 > local6.anInt4191) {
									if (local6.anIntArray509 == null || Static297.anInt5975 - local6.anInt4191 > 32) {
										local459 = new Class2_Sub24();
										local459.aClass155_23 = local6;
										local459.anObjectArray5 = local6.anObjectArray30;
										Static351.aClass210_15.method5044(local459);
									} else {
										label635: for (local278 = local6.anInt4191; local278 < Static297.anInt5975; local278++) {
											local614 = Static245.anIntArray543[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray509.length; local374++) {
												if (local6.anIntArray509[local374] == local614) {
													local1427 = new Class2_Sub24();
													local1427.aClass155_23 = local6;
													local1427.anObjectArray5 = local6.anObjectArray30;
													Static351.aClass210_15.method5044(local1427);
													break label635;
												}
											}
										}
									}
									local6.anInt4191 = Static297.anInt5975;
								}
								if (local6.anObjectArray35 != null && Static92.anInt1742 > local6.anInt4185) {
									if (local6.anIntArray512 == null || Static92.anInt1742 - local6.anInt4185 > 32) {
										local459 = new Class2_Sub24();
										local459.aClass155_23 = local6;
										local459.anObjectArray5 = local6.anObjectArray35;
										Static351.aClass210_15.method5044(local459);
									} else {
										label611: for (local278 = local6.anInt4185; local278 < Static92.anInt1742; local278++) {
											local614 = Static197.anIntArray435[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray512.length; local374++) {
												if (local6.anIntArray512[local374] == local614) {
													local1427 = new Class2_Sub24();
													local1427.aClass155_23 = local6;
													local1427.anObjectArray5 = local6.anObjectArray35;
													Static351.aClass210_15.method5044(local1427);
													break label611;
												}
											}
										}
									}
									local6.anInt4185 = Static92.anInt1742;
								}
								if (local6.anObjectArray33 != null && Static207.anInt3843 > local6.anInt4186) {
									if (local6.anIntArray510 == null || Static207.anInt3843 - local6.anInt4186 > 32) {
										local459 = new Class2_Sub24();
										local459.aClass155_23 = local6;
										local459.anObjectArray5 = local6.anObjectArray33;
										Static351.aClass210_15.method5044(local459);
									} else {
										label587: for (local278 = local6.anInt4186; local278 < Static207.anInt3843; local278++) {
											local614 = Static375.anIntArray518[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray510.length; local374++) {
												if (local6.anIntArray510[local374] == local614) {
													local1427 = new Class2_Sub24();
													local1427.aClass155_23 = local6;
													local1427.anObjectArray5 = local6.anObjectArray33;
													Static351.aClass210_15.method5044(local1427);
													break label587;
												}
											}
										}
									}
									local6.anInt4186 = Static207.anInt3843;
								}
								if (local6.anObjectArray8 != null && Static286.anInt5104 > local6.anInt4197) {
									if (local6.anIntArray508 == null || Static286.anInt5104 - local6.anInt4197 > 32) {
										local459 = new Class2_Sub24();
										local459.aClass155_23 = local6;
										local459.anObjectArray5 = local6.anObjectArray8;
										Static351.aClass210_15.method5044(local459);
									} else {
										label563: for (local278 = local6.anInt4197; local278 < Static286.anInt5104; local278++) {
											local614 = Static260.anIntArray569[local278 & 0x1F];
											for (local374 = 0; local374 < local6.anIntArray508.length; local374++) {
												if (local6.anIntArray508[local374] == local614) {
													local1427 = new Class2_Sub24();
													local1427.aClass155_23 = local6;
													local1427.anObjectArray5 = local6.anObjectArray8;
													Static351.aClass210_15.method5044(local1427);
													break label563;
												}
											}
										}
									}
									local6.anInt4197 = Static286.anInt5104;
								}
								if (Static23.anInt563 > local6.anInt4175 && local6.anObjectArray10 != null) {
									local459 = new Class2_Sub24();
									local459.aClass155_23 = local6;
									local459.anObjectArray5 = local6.anObjectArray10;
									Static351.aClass210_15.method5044(local459);
								}
								if (Static357.anInt882 > local6.anInt4175 && local6.anObjectArray24 != null) {
									local459 = new Class2_Sub24();
									local459.aClass155_23 = local6;
									local459.anObjectArray5 = local6.anObjectArray24;
									Static351.aClass210_15.method5044(local459);
								}
								if (Static221.anInt4102 > local6.anInt4175 && local6.anObjectArray26 != null) {
									local459 = new Class2_Sub24();
									local459.aClass155_23 = local6;
									local459.anObjectArray5 = local6.anObjectArray26;
									Static351.aClass210_15.method5044(local459);
								}
								if (Static138.anInt2573 > local6.anInt4175 && local6.anObjectArray32 != null) {
									local459 = new Class2_Sub24();
									local459.aClass155_23 = local6;
									local459.anObjectArray5 = local6.anObjectArray32;
									Static351.aClass210_15.method5044(local459);
								}
								if (Static173.anInt3081 > local6.anInt4175 && local6.anObjectArray16 != null) {
									local459 = new Class2_Sub24();
									local459.aClass155_23 = local6;
									local459.anObjectArray5 = local6.anObjectArray16;
									Static351.aClass210_15.method5044(local459);
								}
								local6.anInt4175 = Static180.anInt3216;
								if (local6.anObjectArray21 != null) {
									for (local278 = 0; local278 < Static267.anInt4715; local278++) {
										@Pc(1895) Class2_Sub24 local1895 = new Class2_Sub24();
										local1895.aClass155_23 = local6;
										local1895.anInt3664 = Static93.aClass15Array1[local278].method3594();
										local1895.anInt3673 = Static93.aClass15Array1[local278].method3593();
										local1895.anObjectArray5 = local6.anObjectArray21;
										Static351.aClass210_15.method5044(local1895);
									}
								}
								if (Static170.aBoolean225 && local6.anObjectArray11 != null) {
									local459 = new Class2_Sub24();
									local459.aClass155_23 = local6;
									local459.anObjectArray5 = local6.anObjectArray11;
									Static351.aClass210_15.method5044(local459);
								}
							}
							if (local6.anInt4164 == 5 && local6.anInt4172 != -1) {
								local6.method3765(Static189.aClass119_3, Static80.aClass171_1).method5710(Static304.aClass82_4, local6.anInt4214);
							}
							Static58.method4852(local6);
							if (local6.anInt4164 == 0) {
								method891(arg0, local6.anInt4166, local28, local30, local32, local34, local17 - local6.anInt4174, local22 - local6.anInt4207, arg8, arg9);
								if (local6.aClass155Array2 != null) {
									method891(local6.aClass155Array2, local6.anInt4166, local28, local30, local32, local34, local17 - local6.anInt4174, local22 - local6.anInt4207, arg8, arg9);
								}
								@Pc(2017) Class2_Sub41 local2017 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local6.anInt4166);
								if (local2017 != null) {
									if (Static209.aClass48_2 == Static311.aClass48_3 && local2017.anInt6413 == 0 && !Static48.aBoolean87 && local207 && !Static218.aBoolean304) {
										Static347.method5296();
									}
									Static54.method1046(local22, arg9, local30, local28, local34, arg8, local17, local32, local2017.anInt6411);
								}
							}
						}
					}
				} else if (local28 < local32 && local30 < local34) {
					Static58.method4852(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method893(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static168.anInt3003;
		@Pc(3) int[] local3 = Static7.anIntArray24;
		@Pc(11) int local11 = Static264.aBoolean342 ? local1 : local1 + Static199.anInt3672;
		for (@Pc(13) int local13 = 0; local13 < local11; local13++) {
			@Pc(23) Class12_Sub1_Sub2 local23;
			if (local13 < local1) {
				local23 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local3[local13]];
			} else {
				local23 = Static107.aClass12_Sub1_Sub2_Sub1Array1[Static346.anIntArray730[local13 - local1]];
			}
			if (local23.aByte74 == arg0) {
				local23.anInt5333 = 0;
				if (local23.anInt5361 < 0) {
					local23.aBoolean421 = false;
				} else {
					@Pc(50) int local50 = local23.method4706();
					if ((local50 & 0x1) == 0) {
						if ((local23.anInt6328 & 0x7F) != 0 || (local23.anInt6317 & 0x7F) != 0) {
							local23.aBoolean421 = false;
							continue;
						}
					} else if ((local23.anInt6328 & 0x7F) != 64 || (local23.anInt6317 & 0x7F) != 64) {
						local23.aBoolean421 = false;
						continue;
					}
					@Pc(92) int local92;
					@Pc(97) int local97;
					@Pc(122) int local122;
					if (local50 == 1) {
						local92 = local23.anInt6328 >> 7;
						local97 = local23.anInt6317 >> 7;
						if (local23.anInt5361 != Static240.anIntArrayArray28[local92][local97]) {
							local23.aBoolean421 = true;
							continue;
						}
						if (Static280.anIntArrayArray41[local92][local97] > 1) {
							local122 = Static280.anIntArrayArray41[local92][local97]--;
							local23.aBoolean421 = true;
							continue;
						}
					} else {
						local92 = (local50 - 1) * 64 + 60;
						local97 = local23.anInt6328 - local92 >> 7;
						@Pc(151) int local151 = local23.anInt6317 - local92 >> 7;
						@Pc(158) int local158 = local23.anInt6328 + local92 >> 7;
						@Pc(165) int local165 = local23.anInt6317 + local92 >> 7;
						if (!Static128.method2282(local151, local165, local97, local158, local23.anInt5361)) {
							for (@Pc(176) int local176 = local97; local176 <= local158; local176++) {
								for (@Pc(179) int local179 = local151; local179 <= local165; local179++) {
									if (local23.anInt5361 == Static240.anIntArrayArray28[local176][local179]) {
										local122 = Static280.anIntArrayArray41[local176][local179]--;
									}
								}
							}
							local23.aBoolean421 = true;
							continue;
						}
					}
					if (local23 instanceof Class12_Sub1_Sub2_Sub2 && local23.aClass2_Sub3_3 != null && Static295.anInt5281 >= local23.aClass2_Sub3_3.anInt155 && Static295.anInt5281 < local23.aClass2_Sub3_3.anInt153) {
						((Class12_Sub1_Sub2_Sub2) local23).aBoolean424 = false;
					}
					local23.aBoolean421 = false;
					local23.anInt6322 = Static18.method508(local23.anInt6317, local23.aByte74, local23.anInt6328);
					Static326.method5033(local23, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
	public static void method894(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static168.anInt3003;
		@Pc(3) int[] local3 = Static7.anIntArray24;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static199.anInt3672; local5++) {
			@Pc(15) Class12_Sub1_Sub2 local15;
			if (local5 < local1) {
				local15 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local3[local5]];
			} else {
				local15 = Static107.aClass12_Sub1_Sub2_Sub1Array1[Static346.anIntArray730[local5 - local1]];
			}
			if (local15.aByte74 == arg0 && local15.anInt5361 >= 0) {
				@Pc(35) int local35 = local15.method4706();
				if ((local35 & 0x1) == 0) {
					if ((local15.anInt6328 & 0x7F) != 0 || (local15.anInt6317 & 0x7F) != 0) {
						continue;
					}
				} else if ((local15.anInt6328 & 0x7F) != 64 || (local15.anInt6317 & 0x7F) != 64) {
					continue;
				}
				@Pc(71) int local71;
				@Pc(76) int local76;
				@Pc(112) int local112;
				if (local35 == 1) {
					local71 = local15.anInt6328 >> 7;
					local76 = local15.anInt6317 >> 7;
					if (local15.anInt5361 > Static240.anIntArrayArray28[local71][local76]) {
						Static240.anIntArrayArray28[local71][local76] = local15.anInt5361;
						Static280.anIntArrayArray41[local71][local76] = 1;
					} else if (local15.anInt5361 == Static240.anIntArrayArray28[local71][local76]) {
						local112 = Static280.anIntArrayArray41[local71][local76]++;
					}
				} else {
					local71 = (local35 - 1) * 64 + 60;
					local76 = local15.anInt6328 - local71 >> 7;
					@Pc(138) int local138 = local15.anInt6317 - local71 >> 7;
					@Pc(145) int local145 = local15.anInt6328 + local71 >> 7;
					@Pc(152) int local152 = local15.anInt6317 + local71 >> 7;
					for (@Pc(154) int local154 = local76; local154 <= local145; local154++) {
						for (@Pc(157) int local157 = local138; local157 <= local152; local157++) {
							if (local15.anInt5361 > Static240.anIntArrayArray28[local154][local157]) {
								Static240.anIntArrayArray28[local154][local157] = local15.anInt5361;
								Static280.anIntArrayArray41[local154][local157] = 1;
							} else if (local15.anInt5361 == Static240.anIntArrayArray28[local154][local157]) {
								local112 = Static280.anIntArrayArray41[local154][local157]++;
							}
						}
					}
				}
			}
		}
	}
}
