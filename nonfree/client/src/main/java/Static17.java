import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "Lclient!rd;")
	public static Class64 aClass64_14;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "Lclient!sb;")
	public static Class25 aClass25_23;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub4_Sub2Array1;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "Lclient!ad;")
	public static Class4 aClass4_198 = Static75.method1216("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "Lclient!ad;")
	public static Class4 aClass4_199 = Static75.method1216("Side panel redrawn");

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "Lclient!ad;")
	private static Class4 aClass4_200 = Static75.method1216("Loaded interfaces");

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "Lclient!ad;")
	public static Class4 aClass4_201 = Static75.method1216("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_202 = aClass4_200;

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
	public static volatile int anInt377 = 0;

	@OriginalMember(owner = "client!ce", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_203 = Static75.method1216(":0");

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!ad;")
	private static Class4 aClass4_206 = Static75.method1216("Prepared sound engine");

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_204 = aClass4_206;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_205 = Static75.method1216("overlay_multiway");

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
	public static int anInt378 = 0;

	@OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
	public static int anInt379 = 0;

	@OriginalMember(owner = "client!ce", name = "t", descriptor = "[I")
	public static int[] anIntArray35 = new int[50];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
	public static void method237() {
		@Pc(3) Class68 local3 = Static5.aClass68_1;
		synchronized (Static5.aClass68_1) {
			Static25.anInt760 = Static39.anInt1067;
			@Pc(16) int local16;
			if (Static19.anInt478 >= 0) {
				while (Static19.anInt478 != Static49.anInt1211) {
					local16 = Static23.anIntArray39[Static49.anInt1211];
					Static49.anInt1211 = Static49.anInt1211 + 1 & 0x7F;
					if (local16 < 0) {
						Static39.aBooleanArray8[~local16] = false;
					} else {
						Static39.aBooleanArray8[local16] = true;
					}
				}
			} else {
				for (local16 = 0; local16 < 112; local16++) {
					Static39.aBooleanArray8[local16] = false;
				}
				Static19.anInt478 = Static49.anInt1211;
			}
			Static39.anInt1067 = Static103.anInt2530;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([Lclient!rc;IIIIIIIIIII)V")
	public static void method238(@OriginalArg(0) Class3_Sub1_Sub14[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 > arg7 || arg1 < arg4 || arg6 <= arg7 || arg5 <= arg1) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < arg0.length; local28++) {
			@Pc(34) Class3_Sub1_Sub14 local34 = arg0[local28];
			if (local34 != null && local34.anInt2097 == arg10) {
				@Pc(47) int local47 = local34.anInt2132 + arg2;
				@Pc(54) int local54 = local34.anInt2077 + arg4 - arg8;
				if ((local34.anInt2096 >= 0 || local34.anInt2114 != 0) && local47 <= arg7 && arg1 >= local54 && arg7 < local34.anInt2130 + local47 && arg1 < local54 + local34.anInt2117) {
					if (local34.anInt2096 < 0) {
						Static90.anInt2817 = local28;
					} else {
						Static90.anInt2817 = local34.anInt2096;
					}
				}
				if (local34.anInt2128 == 8 && local47 <= arg7 && arg1 >= local54 && arg7 < local47 + local34.anInt2130 && arg1 < local34.anInt2117 + local54) {
					Static67.anInt1650 = local28;
				}
				if (local34.anInt2128 != 0) {
					if (local34.anInt2112 == 1 && local47 <= arg7 && local54 <= arg1 && local34.anInt2130 + local47 > arg7 && local54 + local34.anInt2117 > arg1) {
						@Pc(253) boolean local253 = false;
						if (local34.anInt2087 != 0) {
							local253 = Static88.method1387(local34);
						}
						if (!local253) {
							Static62.method1082(Static113.aClass4_1604, 50, local34.aClass4_1184, 0, 0, (arg3 << 16) + local28);
						}
					}
					if (local34.anInt2112 == 2 && Static101.anInt2512 == 0 && arg7 >= local47 && local54 <= arg1 && arg7 < local34.anInt2130 + local47 && local54 + local34.anInt2117 > arg1) {
						Static62.method1082(Static60.method1012(new Class4[] { Static34.aClass4_522, local34.aClass4_1190 }), 22, local34.aClass4_1185, 0, 0, (arg3 << 16) + local28);
					}
					if (local34.anInt2112 == 3 && local47 <= arg7 && local54 <= arg1 && arg7 < local47 + local34.anInt2130 && local54 + local34.anInt2117 > arg1) {
						@Pc(393) byte local393;
						if (arg9 == 3) {
							local393 = 65;
						} else {
							local393 = 49;
						}
						Static62.method1082(Static113.aClass4_1604, local393, Static28.aClass4_405, 0, 0, (arg3 << 16) + local28);
					}
					if (local34.anInt2112 == 4 && arg7 >= local47 && arg1 >= local54 && local34.anInt2130 + local47 > arg7 && local34.anInt2117 + local54 > arg1) {
						Static62.method1082(Static113.aClass4_1604, 41, local34.aClass4_1184, 0, 0, local28 + (arg3 << 16));
					}
					if (local34.anInt2112 == 5 && local47 <= arg7 && local54 <= arg1 && arg7 < local47 + local34.anInt2130 && arg1 < local54 + local34.anInt2117) {
						Static62.method1082(Static113.aClass4_1604, 43, local34.aClass4_1184, 0, 0, local28 + (arg3 << 16));
					}
					if (local34.anInt2112 == 6 && Static69.anInt2250 == -1 && arg7 >= local47 && local54 <= arg1 && arg7 < local47 + local34.anInt2130 && local54 + local34.anInt2117 > arg1) {
						Static62.method1082(Static113.aClass4_1604, 30, local34.aClass4_1184, 0, 0, local28 + (arg3 << 16));
					}
					@Pc(567) int local567;
					if (local34.anInt2128 == 2) {
						local567 = 0;
						for (@Pc(569) int local569 = 0; local569 < local34.anInt2117; local569++) {
							for (@Pc(573) int local573 = 0; local573 < local34.anInt2130; local573++) {
								@Pc(584) int local584 = local573 * (local34.anInt2098 + 32) + local47;
								@Pc(594) int local594 = (local34.anInt2085 + 32) * local569 + local54;
								if (local567 < 20) {
									local594 += local34.anIntArray271[local567];
									local584 += local34.anIntArray269[local567];
								}
								if (arg7 >= local584 && local594 <= arg1 && arg7 < local584 + 32 && local594 + 32 > arg1) {
									Static30.anInt943 = local567;
									Static60.anInt1463 = (arg3 << 16) + local28;
									if (local34.anIntArray274[local567] > 0) {
										@Pc(658) Class3_Sub1_Sub2 local658 = Static3.method1550(local34.anIntArray274[local567] - 1);
										if (Static98.anInt2368 == 1 && local34.aBoolean168) {
											if (Static78.anInt434 != local28 + (arg3 << 16) || local567 != Static22.anInt498) {
												Static62.method1082(Static60.method1012(new Class4[] { Static48.aClass4_630, Static52.aClass4_675, local658.aClass4_347 }), 21, Static9.aClass4_163, local658.anInt720, local567, (arg3 << 16) + local28);
											}
										} else if (Static101.anInt2512 != 1 || !local34.aBoolean168) {
											@Pc(721) Class4[] local721 = local658.aClass4Array3;
											if (Static15.aBoolean25) {
												local721 = Static82.method1292(local721);
											}
											@Pc(732) int local732;
											@Pc(751) byte local751;
											if (local34.aBoolean168) {
												for (local732 = 4; local732 >= 3; local732--) {
													if (local721 != null && local721[local732] != null) {
														if (local732 == 3) {
															local751 = 42;
														} else {
															local751 = 55;
														}
														Static62.method1082(Static60.method1012(new Class4[] { Static101.aClass4_1391, local658.aClass4_347 }), local751, local721[local732], local658.anInt720, local567, (arg3 << 16) + local28);
													} else if (local732 == 4) {
														Static62.method1082(Static60.method1012(new Class4[] { Static101.aClass4_1391, local658.aClass4_347 }), 55, Static39.aClass4_543, local658.anInt720, local567, local28 + (arg3 << 16));
													}
												}
											}
											if (local34.aBoolean170) {
												Static62.method1082(Static60.method1012(new Class4[] { Static101.aClass4_1391, local658.aClass4_347 }), 14, Static9.aClass4_163, local658.anInt720, local567, (arg3 << 16) + local28);
											}
											if (local34.aBoolean168 && local721 != null) {
												for (local732 = 2; local732 >= 0; local732--) {
													if (local721[local732] != null) {
														local751 = 0;
														if (local732 == 0) {
															local751 = 27;
														}
														if (local732 == 1) {
															local751 = 32;
														}
														if (local732 == 2) {
															local751 = 7;
														}
														Static62.method1082(Static60.method1012(new Class4[] { Static101.aClass4_1391, local658.aClass4_347 }), local751, local721[local732], local658.anInt720, local567, local28 + (arg3 << 16));
													}
												}
											}
											local721 = local34.aClass4Array17;
											if (Static15.aBoolean25) {
												local721 = Static82.method1292(local721);
											}
											if (local721 != null) {
												for (local732 = 4; local732 >= 0; local732--) {
													if (local721[local732] != null) {
														local751 = 0;
														if (local732 == 0) {
															local751 = 60;
														}
														if (local732 == 1) {
															local751 = 25;
														}
														if (local732 == 2) {
															local751 = 40;
														}
														if (local732 == 3) {
															local751 = 26;
														}
														if (local732 == 4) {
															local751 = 3;
														}
														Static62.method1082(Static60.method1012(new Class4[] { Static101.aClass4_1391, local658.aClass4_347 }), local751, local721[local732], local658.anInt720, local567, local28 + (arg3 << 16));
													}
												}
											}
											Static62.method1082(Static60.method1012(new Class4[] { Static101.aClass4_1391, local658.aClass4_347 }), 1003, Static47.aClass4_602, local658.anInt720, local567, (arg3 << 16) + local28);
										} else if ((Static63.anInt1604 & 0x10) == 16) {
											Static62.method1082(Static60.method1012(new Class4[] { Static34.aClass4_519, Static52.aClass4_675, local658.aClass4_347 }), 28, Static92.aClass4_1188, local658.anInt720, local567, local28 + (arg3 << 16));
										}
									}
								}
								local567++;
							}
						}
					}
					if (local34.aBoolean167 && local34.aClass4Array16 != null && local47 <= arg7 && local54 <= arg1 && arg7 < local47 + local34.anInt2130 && arg1 < local34.anInt2117 + local54) {
						for (local567 = local34.aClass4Array16.length - 1; local567 >= 0; local567--) {
							@Pc(1141) byte local1141 = 0;
							if (local567 == 0) {
								local1141 = 33;
							}
							if (local567 == 1) {
								local1141 = 64;
							}
							if (local567 == 2) {
								local1141 = 39;
							}
							if (local567 == 3) {
								local1141 = 31;
							}
							if (local567 == 4) {
								local1141 = 15;
							}
							if (local567 == 5) {
								local1141 = 37;
							}
							if (local567 == 6) {
								local1141 = 16;
							}
							if (local567 == 7) {
								local1141 = 46;
							}
							if (local567 == 8) {
								local1141 = 66;
							}
							if (local567 == 9) {
								local1141 = 51;
							}
							if (local34.aClass4Array16[local567] != null) {
								if (local34.anInt2092 < 0) {
									Static62.method1082(Static113.aClass4_1604, local1141, local34.aClass4Array16[local567], 0, local34.anInt2092 & 0x7FFF, local34.anInt2097);
								} else {
									Static62.method1082(Static113.aClass4_1604, local1141, local34.aClass4Array16[local567], 0, 0, local34.anInt2092);
								}
							}
						}
					}
				} else if (!local34.aBoolean163 || Static4.method114(arg9, local28) || Static13.aBoolean22) {
					method238(arg0, arg1, local47, arg3, local54, local54 + local34.anInt2117, local47 - -local34.anInt2130, arg7, local34.anInt2082, arg9, local28);
					if (local34.aClass3_Sub1_Sub14Array1 != null) {
						method238(local34.aClass3_Sub1_Sub14Array1, arg1, local47, arg3, local54, local34.anInt2117 + local54, local34.anInt2130 + local47, arg7, local34.anInt2082, arg9, local34.anInt2092);
					}
					if (local34.anInt2078 > local34.anInt2117) {
						Static22.method302(arg9, local34.anInt2117, local34.anInt2130 + local47, arg1, local54, local34, arg7, local34.anInt2078);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method239() {
		aClass25_23 = null;
		anIntArray35 = null;
		aClass4_201 = null;
		aClass4_200 = null;
		aClass3_Sub1_Sub4_Sub2Array1 = null;
		aClass4_205 = null;
		aClass64_14 = null;
		aClass4_202 = null;
		aClass4_199 = null;
		aClass4_203 = null;
		aClass4_198 = null;
		aClass4_206 = null;
		aClass4_204 = null;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public static void method240() {
		if (Static54.aClass31_4 != null) {
			Static54.aClass31_4.method717();
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!ab;I)V")
	public static void method241(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0) {
		if (arg0.anInt2303 == Static60.anInt1489 || arg0.anInt2320 == -1 || arg0.anInt2318 != 0 || arg0.anInt2297 + 1 > Static67.method1107(arg0.anInt2320).anIntArray224[arg0.anInt2339]) {
			@Pc(35) int local35 = arg0.anInt2303 - arg0.anInt2334;
			@Pc(41) int local41 = Static60.anInt1489 - arg0.anInt2334;
			@Pc(51) int local51 = arg0.anInt2319 * 64 + arg0.anInt2304 * 128;
			@Pc(61) int local61 = arg0.anInt2319 * 64 + arg0.anInt2336 * 128;
			@Pc(71) int local71 = arg0.anInt2319 * 64 + arg0.anInt2300 * 128;
			@Pc(81) int local81 = arg0.anInt2311 * 128 + arg0.anInt2319 * 64;
			arg0.anInt2348 = (local81 * local41 + (local35 - local41) * local61) / local35;
			arg0.anInt2342 = (local51 * (local35 - local41) + local71 * local41) / local35;
		}
		arg0.anInt2337 = 0;
		if (arg0.anInt2316 == 0) {
			arg0.anInt2290 = 1024;
		}
		if (arg0.anInt2316 == 1) {
			arg0.anInt2290 = 1536;
		}
		if (arg0.anInt2316 == 2) {
			arg0.anInt2290 = 0;
		}
		if (arg0.anInt2316 == 3) {
			arg0.anInt2290 = 512;
		}
		arg0.anInt2293 = arg0.anInt2290;
	}
}
