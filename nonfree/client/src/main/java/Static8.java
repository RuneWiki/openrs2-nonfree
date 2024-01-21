import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	public static int anInt291;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Z")
	public static boolean aBoolean27;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	public static int anInt292;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "[Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2[] aClass2_Sub1_Sub3_Sub2Array1;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	public static int anInt298;

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
	public static int anInt305;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public static int anInt288 = 0;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "[I")
	public static int[] anIntArray46 = new int[2000];

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "[I")
	public static int[] anIntArray47 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "[Lclient!lc;")
	public static Class31[] aClass31Array5 = new Class31[100];

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
	public static int anInt302 = 0;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BLclient!lc;Lclient!kc;Lclient!lc;)Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1 method198(@OriginalArg(1) Class31 arg0, @OriginalArg(2) Class11 arg1, @OriginalArg(3) Class31 arg2) {
		@Pc(8) int local8 = arg1.method345(arg0);
		@Pc(19) int local19 = arg1.method334(local8, arg2);
		return Static42.method1055(arg1, local19, local8);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!ib;B)V")
	public static void method199(@OriginalArg(0) Class2_Sub1_Sub4_Sub6 arg0) {
		arg0.aBoolean102 = false;
		@Pc(16) Class2_Sub1_Sub10 local16;
		if (arg0.anInt1988 != -1) {
			local16 = Static54.method1158(arg0.anInt1988);
			arg0.anInt2008++;
			if (arg0.anInt2005 < local16.anIntArray292.length && arg0.anInt2008 > local16.anIntArray293[arg0.anInt2005]) {
				arg0.anInt2008 = 1;
				arg0.anInt2005++;
			}
			if (local16.anIntArray292.length <= arg0.anInt2005) {
				arg0.anInt2005 = 0;
				arg0.anInt2008 = 0;
			}
		}
		if (arg0.anInt1995 != -1 && Static49.anInt2694 >= arg0.anInt1990) {
			if (arg0.anInt1983 < 0) {
				arg0.anInt1983 = 0;
			}
			@Pc(90) int local90 = Static75.method1409(arg0.anInt1995).anInt2572;
			if (local90 == -1) {
				arg0.anInt1995 = -1;
			} else {
				@Pc(103) Class2_Sub1_Sub10 local103 = Static54.method1158(local90);
				arg0.anInt1978++;
				if (local103.anIntArray292.length > arg0.anInt1983 && local103.anIntArray293[arg0.anInt1983] < arg0.anInt1978) {
					arg0.anInt1978 = 1;
					arg0.anInt1983++;
				}
				if (local103.anIntArray292.length <= arg0.anInt1983 && (arg0.anInt1983 < 0 || arg0.anInt1983 >= local103.anIntArray292.length)) {
					arg0.anInt1995 = -1;
				}
			}
		}
		if (arg0.anInt2014 != -1 && arg0.anInt1986 <= 1) {
			local16 = Static54.method1158(arg0.anInt2014);
			if (local16.anInt2096 == 1 && arg0.anInt1996 > 0 && arg0.anInt2018 <= Static49.anInt2694 && arg0.anInt2027 < Static49.anInt2694) {
				arg0.anInt1986 = 1;
				return;
			}
		}
		if (arg0.anInt2014 != -1 && arg0.anInt1986 == 0) {
			local16 = Static54.method1158(arg0.anInt2014);
			arg0.anInt1977++;
			if (arg0.anInt1987 < local16.anIntArray292.length && arg0.anInt1977 > local16.anIntArray293[arg0.anInt1987]) {
				arg0.anInt1977 = 1;
				arg0.anInt1987++;
			}
			if (local16.anIntArray292.length <= arg0.anInt1987) {
				arg0.anInt1987 -= local16.anInt2094;
				arg0.anInt1980++;
				if (arg0.anInt1980 >= local16.anInt2097) {
					arg0.anInt2014 = -1;
				}
				if (arg0.anInt1987 < 0 || arg0.anInt1987 >= local16.anIntArray292.length) {
					arg0.anInt2014 = -1;
				}
			}
			arg0.aBoolean102 = local16.aBoolean107;
		}
		if (arg0.anInt1986 > 0) {
			arg0.anInt1986--;
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public static void method201() {
		aClass2_Sub1_Sub3_Sub2Array1 = null;
		anIntArray46 = null;
		anIntArray47 = null;
		aClass31Array5 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIBII)V")
	public static void method202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static40.method1277(arg2) || (arg5 > arg6 || arg8 > arg7 || arg6 >= arg4 || arg3 <= arg7)) {
			return;
		}
		@Pc(47) Class2_Sub1_Sub2[] local47 = Static89.aClass2_Sub1_Sub2ArrayArray1[arg2];
		for (@Pc(49) int local49 = 0; local49 < local47.length; local49++) {
			@Pc(55) Class2_Sub1_Sub2 local55 = local47[local49];
			if (local55 != null && arg9 == local55.anInt240) {
				@Pc(68) int local68 = local55.anInt267 + arg5;
				@Pc(76) int local76 = arg8 + local55.anInt263 - arg0;
				if ((local55.anInt277 >= 0 || local55.anInt242 != 0) && local68 <= arg6 && local76 <= arg7 && local68 + local55.anInt272 > arg6 && arg7 < local55.anInt248 + local76) {
					if (local55.anInt277 >= 0) {
						Static25.anInt1112 = local55.anInt277;
					} else {
						Static25.anInt1112 = local49;
					}
				}
				if (local55.anInt270 == 8 && arg6 >= local68 && arg7 >= local76 && arg6 < local68 + local55.anInt272 && arg7 < local55.anInt248 + local76) {
					Static58.anInt1939 = local49;
				}
				if (local55.anInt270 != 0) {
					if (local55.anInt257 == 1 && arg6 >= local68 && arg7 >= local76 && local68 + local55.anInt272 > arg6 && local76 + local55.anInt248 > arg7) {
						@Pc(230) boolean local230 = false;
						if (local55.anInt278 != 0) {
							local230 = Static67.method1369(local55);
						}
						if (!local230) {
							Static17.method523(local49 + (arg2 << 16), local55.aClass31_93, 44, 0, 0);
						}
					}
					if (local55.anInt257 == 2 && Static47.anInt1737 == 0 && arg6 >= local68 && local76 <= arg7 && local55.anInt272 + local68 > arg6 && local55.anInt248 + local76 > arg7) {
						@Pc(289) Class31 local289 = local55.aClass31_97;
						if (local289.method1209(Static34.aClass31_449) != -1) {
							local289 = local289.method1213(local289.method1209(Static34.aClass31_449), 0);
						}
						Static17.method523((arg2 << 16) + local49, Static37.method974(new Class31[] { local289, Static75.aClass31_783, local55.aClass31_101 }), 52, 0, 0);
					}
					if (local55.anInt257 == 3 && arg6 >= local68 && local76 <= arg7 && arg6 < local68 + local55.anInt272 && local76 + local55.anInt248 > arg7) {
						@Pc(380) byte local380;
						if (arg1 == 3) {
							local380 = 56;
						} else {
							local380 = 49;
						}
						Static17.method523((arg2 << 16) + local49, Static60.aClass31_723, local380, 0, 0);
					}
					if (local55.anInt257 == 4 && local68 <= arg6 && local76 <= arg7 && local68 + local55.anInt272 > arg6 && arg7 < local76 + local55.anInt248) {
						Static17.method523(local49 + (arg2 << 16), local55.aClass31_93, 14, 0, 0);
					}
					if (local55.anInt257 == 5 && arg6 >= local68 && local76 <= arg7 && arg6 < local55.anInt272 + local68 && arg7 < local55.anInt248 + local76) {
						Static17.method523((arg2 << 16) + local49, local55.aClass31_93, 35, 0, 0);
					}
					if (local55.anInt257 == 6 && !Static60.aBoolean104 && local68 <= arg6 && arg7 >= local76 && local68 + local55.anInt272 > arg6 && local76 + local55.anInt248 > arg7) {
						Static17.method523((arg2 << 16) + local49, local55.aClass31_93, 7, 0, 0);
					}
					if (local55.anInt270 == 2) {
						@Pc(537) int local537 = 0;
						for (@Pc(539) int local539 = 0; local539 < local55.anInt248; local539++) {
							for (@Pc(543) int local543 = 0; local543 < local55.anInt272; local543++) {
								@Pc(555) int local555 = local68 + local543 * (local55.anInt239 + 32);
								@Pc(564) int local564 = local539 * (local55.anInt251 + 32) + local76;
								if (local537 < 20) {
									local564 += local55.anIntArray41[local537];
									local555 += local55.anIntArray39[local537];
								}
								if (arg6 >= local555 && arg7 >= local564 && local555 + 32 > arg6 && arg7 < local564 + 32) {
									Static9.anInt319 = (arg2 << 16) + local49;
									Static42.anInt1583 = local537;
									if (local55.anIntArray40[local537] > 0) {
										@Pc(638) Class2_Sub1_Sub13 local638 = Static7.method178(local55.anIntArray40[local537] - 1);
										if (Static63.anInt2118 == 1 && local55.aBoolean22) {
											if (Static95.anInt2560 != local49 + (arg2 << 16) || Static27.anInt1159 != local537) {
												Static17.method523(local49 + (arg2 << 16), Static37.method974(new Class31[] { Static10.aClass31_132, Static40.aClass31_711, Static19.aClass31_286, local638.aClass31_861 }), 32, local638.anInt2481, local537);
											}
										} else if (Static47.anInt1737 != 1 || !local55.aBoolean22) {
											@Pc(757) Class31[] local757 = local638.aClass31Array11;
											if (Static66.aBoolean112) {
												local757 = Static92.method1049(local757);
											}
											@Pc(768) int local768;
											@Pc(783) byte local783;
											if (local55.aBoolean22) {
												for (local768 = 4; local768 >= 3; local768--) {
													if (local757 != null && local757[local768] != null) {
														if (local768 == 3) {
															local783 = 19;
														} else {
															local783 = 29;
														}
														Static17.method523((arg2 << 16) + local49, Static37.method974(new Class31[] { local757[local768], Static11.aClass31_168, local638.aClass31_861 }), local783, local638.anInt2481, local537);
													} else if (local768 == 4) {
														Static17.method523((arg2 << 16) + local49, Static37.method974(new Class31[] { Static53.aClass31_637, local638.aClass31_861 }), 29, local638.anInt2481, local537);
													}
												}
											}
											if (local55.aBoolean24) {
												Static17.method523((arg2 << 16) + local49, Static37.method974(new Class31[] { Static18.aClass31_265, local638.aClass31_861 }), 33, local638.anInt2481, local537);
											}
											if (local55.aBoolean22 && local757 != null) {
												for (local768 = 2; local768 >= 0; local768--) {
													if (local757[local768] != null) {
														local783 = 0;
														if (local768 == 0) {
															local783 = 36;
														}
														if (local768 == 1) {
															local783 = 51;
														}
														if (local768 == 2) {
															local783 = 5;
														}
														Static17.method523((arg2 << 16) + local49, Static37.method974(new Class31[] { local757[local768], Static11.aClass31_168, local638.aClass31_861 }), local783, local638.anInt2481, local537);
													}
												}
											}
											local757 = local55.aClass31Array4;
											if (Static66.aBoolean112) {
												local757 = Static92.method1049(local757);
											}
											if (local757 != null) {
												for (local768 = 4; local768 >= 0; local768--) {
													if (local757[local768] != null) {
														local783 = 0;
														if (local768 == 0) {
															local783 = 55;
														}
														if (local768 == 1) {
															local783 = 22;
														}
														if (local768 == 2) {
															local783 = 15;
														}
														if (local768 == 3) {
															local783 = 21;
														}
														if (local768 == 4) {
															local783 = 18;
														}
														Static17.method523(local49 + (arg2 << 16), Static37.method974(new Class31[] { local757[local768], Static11.aClass31_168, local638.aClass31_861 }), local783, local638.anInt2481, local537);
													}
												}
											}
											Static17.method523(local49 + (arg2 << 16), Static37.method974(new Class31[] { Static75.aClass31_781, local638.aClass31_861 }), 1005, local638.anInt2481, local537);
										} else if ((Static105.anInt2787 & 0x10) == 16) {
											Static17.method523((arg2 << 16) + local49, Static37.method974(new Class31[] { Static85.aClass31_866, Static11.aClass31_168, local638.aClass31_861 }), 8, local638.anInt2481, local537);
										}
									}
								}
								local537++;
							}
						}
					}
				} else if (!local55.aBoolean17 || Static14.method421(local49, arg1) || Static61.aBoolean106) {
					method202(local55.anInt256, arg1, arg2, local76 + local55.anInt248, local55.anInt272 + local68, local68, arg6, arg7, local76, local49);
					if (local55.anInt275 > local55.anInt248) {
						Static18.method532(arg6, local76, arg1, arg7, local55, local55.anInt275, local68 + local55.anInt272, local55.anInt248);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
	public static void method203() {
		if (Static87.aClass1_1 == null) {
			return;
		}
		if (Static83.anInt2318 >= 0) {
			if (Static57.anInt2684 > 0) {
				Static3.anInt126 += Static86.anInt2335;
				Static87.aClass1_1.method1046(Static83.anInt2318, Static3.anInt126);
				Static57.anInt2684--;
				if (Static57.anInt2684 == 0) {
					Static87.aClass1_1.method1050();
					Static83.anInt2318 = -1;
					Static57.anInt2684 = 20;
				}
			}
		} else if (Static57.anInt2684 > 0) {
			Static57.anInt2684--;
			if (Static57.anInt2684 == 0) {
				Static87.aClass1_1.method1041();
				Static3.anInt126 = 0;
				if (Static83.aByteArray21 != null) {
					Static83.anInt2318 = Static45.anInt1601;
					Static87.aClass1_1.method1048(Static103.aBoolean153, Static45.anInt1601, Static83.aByteArray21);
					Static83.aByteArray21 = null;
				}
			}
		}
		Static87.aClass1_1.method1051();
	}
}
