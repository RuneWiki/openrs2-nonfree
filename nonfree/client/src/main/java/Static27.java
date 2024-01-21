import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!f", name = "x", descriptor = "I")
	public static int anInt858;

	@OriginalMember(owner = "client!f", name = "w", descriptor = "I")
	private static final int anInt857 = 50;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "[I")
	private static int[] anIntArray120 = new int[anInt857];

	@OriginalMember(owner = "client!f", name = "c", descriptor = "[Lclient!gd;")
	private static Class23[] aClass23Array11 = new Class23[anInt857];

	@OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
	private static int[] anIntArray121 = new int[anInt857];

	@OriginalMember(owner = "client!f", name = "e", descriptor = "I")
	public static int anInt852 = 0;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "[I")
	private static int[] anIntArray122 = new int[anInt857];

	@OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
	private static int[] anIntArray123 = new int[anInt857];

	@OriginalMember(owner = "client!f", name = "h", descriptor = "[I")
	private static int[] anIntArray124 = new int[anInt857];

	@OriginalMember(owner = "client!f", name = "j", descriptor = "Lclient!gd;")
	private static Class23 aClass23_467 = Static15.method178(" ");

	@OriginalMember(owner = "client!f", name = "k", descriptor = "[I")
	public static int[] anIntArray125 = new int[] { 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800, 12800 };

	@OriginalMember(owner = "client!f", name = "l", descriptor = "Lclient!gd;")
	public static Class23 aClass23_468 = Static15.method178("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!f", name = "C", descriptor = "Lclient!gd;")
	private static Class23 aClass23_474 = Static15.method178("Loaded config");

	@OriginalMember(owner = "client!f", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_469 = aClass23_474;

	@OriginalMember(owner = "client!f", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_470 = Static15.method178("mapback");

	@OriginalMember(owner = "client!f", name = "o", descriptor = "Lclient!gd;")
	public static Class23 aClass23_471 = Static15.method178("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Lclient!gd;")
	public static Class23 aClass23_472 = aClass23_467;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "I")
	public static int anInt854 = 0;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "I")
	public static int anInt855 = 1;

	@OriginalMember(owner = "client!f", name = "t", descriptor = "[I")
	private static int[] anIntArray126 = new int[anInt857];

	@OriginalMember(owner = "client!f", name = "u", descriptor = "[I")
	private static int[] anIntArray127 = new int[anInt857];

	@OriginalMember(owner = "client!f", name = "v", descriptor = "Lclient!gd;")
	public static Class23 aClass23_473 = Static15.method178("titlebutton");

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V")
	public static void method438() {
		anIntArray126 = null;
		anIntArray127 = null;
		aClass23_472 = null;
		anIntArray124 = null;
		aClass23_468 = null;
		anIntArray125 = null;
		aClass23_474 = null;
		aClass23_469 = null;
		aClass23_473 = null;
		aClass23_471 = null;
		anIntArray120 = null;
		anIntArray121 = null;
		aClass23_467 = null;
		anIntArray122 = null;
		anIntArray123 = null;
		aClass23_470 = null;
		aClass23Array11 = null;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZIIIIII[Lclient!ee;IIII)V")
	public static void method439(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1_Sub1_Sub7[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg9 > arg4 || arg8 < arg3 || arg5 <= arg4 || arg0 <= arg8) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < arg6.length; local22++) {
			@Pc(27) Class1_Sub1_Sub7 local27 = arg6[local22];
			if (local27 != null && local27.anInt833 == arg2 && (!local27.aBoolean39 || !local27.aBoolean36 || Static82.aBoolean109)) {
				@Pc(50) int local50 = arg9 + local27.anInt816 - arg7;
				@Pc(58) int local58 = arg3 + local27.anInt820 - arg10;
				if (local27.anInt802 == 8 && local50 <= arg4 && arg8 >= local58 && local27.anInt823 + local50 > arg4 && arg8 < local27.anInt817 + local58) {
					Static37.anInt1287 = local22;
				}
				if ((local27.anInt788 >= 0 || local27.anInt835 != 0) && arg4 >= local50 && local58 <= arg8 && arg4 < local27.anInt823 + local50 && local27.anInt817 + local58 > arg8) {
					if (local27.anInt788 < 0) {
						Static57.anInt1786 = local22;
					} else {
						Static57.anInt1786 = local27.anInt788;
					}
				}
				if (local27.anInt802 == 0) {
					if (local27.aBoolean36 && !Static12.method1548(local22, arg1) && !Static82.aBoolean109) {
						continue;
					}
					method439(local27.anInt817 + local58, arg1, local27.anInt826, local58, arg4, local50 + local27.anInt823, arg6, local27.anInt832, arg8, local50, local27.anInt822);
					if (local27.aClass1_Sub1_Sub7Array1 != null) {
						method439(local27.anInt817 + local58, arg1, local27.anInt826, local58, arg4, local50 + local27.anInt823, local27.aClass1_Sub1_Sub7Array1, local27.anInt832, arg8, local50, local27.anInt822);
					}
					if (local27.anInt817 < local27.anInt807) {
						Static48.method982(arg8, arg4, local58, local27.anInt807, arg1, local27, local27.anInt817, local50 + local27.anInt823);
					}
					if (!local27.aBoolean39) {
						continue;
					}
				}
				if (local27.anInt799 == 1 && local50 <= arg4 && arg8 >= local58 && local50 + local27.anInt823 > arg4 && arg8 < local27.anInt817 + local58) {
					@Pc(246) boolean local246 = false;
					if (local27.anInt839 != 0) {
						local246 = Static54.method1050(local27);
					}
					if (!local246) {
						Static82.method1457(0, local27.anInt826, Static104.aClass23_1523, local27.aClass23_462, 21, 0);
					}
				}
				if (local27.anInt799 == 2 && Static94.anInt2487 == 0 && local50 <= arg4 && arg8 >= local58 && arg4 < local27.anInt823 + local50 && arg8 < local27.anInt817 + local58) {
					Static82.method1457(0, local27.anInt826, Static17.method233(new Class23[] { Static55.aClass23_928, local27.aClass23_460 }), local27.aClass23_463, 13, 0);
				}
				if (local27.anInt799 == 3 && arg4 >= local50 && arg8 >= local58 && arg4 < local50 + local27.anInt823 && local58 + local27.anInt817 > arg8) {
					@Pc(372) byte local372;
					if (arg1 == 3) {
						local372 = 46;
					} else {
						local372 = 18;
					}
					Static82.method1457(0, local27.anInt826, Static104.aClass23_1523, Static12.aClass23_1369, local372, 0);
				}
				if (local27.anInt799 == 4 && arg4 >= local50 && local58 <= arg8 && arg4 < local50 + local27.anInt823 && local58 + local27.anInt817 > arg8) {
					Static82.method1457(0, local27.anInt826, Static104.aClass23_1523, local27.aClass23_462, 1, 0);
				}
				if (local27.anInt799 == 5 && local50 <= arg4 && local58 <= arg8 && arg4 < local27.anInt823 + local50 && local27.anInt817 + local58 > arg8) {
					Static82.method1457(0, local27.anInt826, Static104.aClass23_1523, local27.aClass23_462, 34, 0);
				}
				if (local27.anInt799 == 6 && Static47.anInt1599 == -1 && local50 <= arg4 && arg8 >= local58 && local50 + local27.anInt823 > arg4 && arg8 < local27.anInt817 + local58) {
					Static82.method1457(0, local27.anInt826, Static104.aClass23_1523, local27.aClass23_462, 47, 0);
				}
				@Pc(534) int local534;
				if (local27.anInt802 == 2) {
					local534 = 0;
					for (@Pc(536) int local536 = 0; local536 < local27.anInt817; local536++) {
						for (@Pc(539) int local539 = 0; local539 < local27.anInt823; local539++) {
							@Pc(549) int local549 = local536 * (local27.anInt787 + 32) + local58;
							@Pc(560) int local560 = local50 + (local27.anInt810 + 32) * local539;
							if (local534 < 20) {
								local549 += local27.anIntArray113[local534];
								local560 += local27.anIntArray115[local534];
							}
							if (local560 <= arg4 && local549 <= arg8 && arg4 < local560 + 32 && arg8 < local549 + 32) {
								Static112.anInt2926 = local534;
								Static40.anInt1396 = local27.anInt826;
								if (local27.anIntArray118[local534] > 0) {
									@Pc(627) Class1_Sub1_Sub1 local627 = Static111.method1907(local27.anIntArray118[local534] - 1);
									if (Static115.anInt2955 == 1 && local27.aBoolean46) {
										if (Static26.anInt845 != local27.anInt826 || local534 != Static2.anInt2293) {
											Static82.method1457(local534, local27.anInt826, Static17.method233(new Class23[] { Static87.aClass23_1690, Static1.aClass23_63, local627.aClass23_58 }), Static73.aClass23_1201, 6, local627.anInt65);
										}
									} else if (Static94.anInt2487 != 1 || !local27.aBoolean46) {
										@Pc(728) Class23[] local728 = local627.aClass23Array2;
										if (Static5.aBoolean2) {
											local728 = Static102.method1710(local728);
										}
										@Pc(739) int local739;
										@Pc(785) byte local785;
										if (local27.aBoolean46) {
											for (local739 = 4; local739 >= 3; local739--) {
												if (local728 != null && local728[local739] != null) {
													if (local739 == 3) {
														local785 = 8;
													} else {
														local785 = 5;
													}
													Static82.method1457(local534, local27.anInt826, Static17.method233(new Class23[] { Static64.aClass23_1109, local627.aClass23_58 }), local728[local739], local785, local627.anInt65);
												} else if (local739 == 4) {
													Static82.method1457(local534, local27.anInt826, Static17.method233(new Class23[] { Static64.aClass23_1109, local627.aClass23_58 }), Static40.aClass23_734, 5, local627.anInt65);
												}
											}
										}
										if (local27.aBoolean50) {
											Static82.method1457(local534, local27.anInt826, Static17.method233(new Class23[] { Static64.aClass23_1109, local627.aClass23_58 }), Static73.aClass23_1201, 25, local627.anInt65);
										}
										if (local27.aBoolean46 && local728 != null) {
											for (local739 = 2; local739 >= 0; local739--) {
												if (local728[local739] != null) {
													local785 = 0;
													if (local739 == 0) {
														local785 = 54;
													}
													if (local739 == 1) {
														local785 = 20;
													}
													if (local739 == 2) {
														local785 = 26;
													}
													Static82.method1457(local534, local27.anInt826, Static17.method233(new Class23[] { Static64.aClass23_1109, local627.aClass23_58 }), local728[local739], local785, local627.anInt65);
												}
											}
										}
										local728 = local27.aClass23Array9;
										if (Static5.aBoolean2) {
											local728 = Static102.method1710(local728);
										}
										if (local728 != null) {
											for (local739 = 4; local739 >= 0; local739--) {
												if (local728[local739] != null) {
													local785 = 0;
													if (local739 == 0) {
														local785 = 19;
													}
													if (local739 == 1) {
														local785 = 30;
													}
													if (local739 == 2) {
														local785 = 24;
													}
													if (local739 == 3) {
														local785 = 33;
													}
													if (local739 == 4) {
														local785 = 17;
													}
													Static82.method1457(local534, local27.anInt826, Static17.method233(new Class23[] { Static64.aClass23_1109, local627.aClass23_58 }), local728[local739], local785, local627.anInt65);
												}
											}
										}
										Static82.method1457(local534, local27.anInt826, Static17.method233(new Class23[] { Static64.aClass23_1109, local627.aClass23_58 }), Static43.aClass23_773, 1006, local627.anInt65);
									} else if ((Static90.anInt2427 & 0x10) == 16) {
										Static82.method1457(local534, local27.anInt826, Static17.method233(new Class23[] { Static1.aClass23_53, Static1.aClass23_63, local627.aClass23_58 }), Static3.aClass23_96, 40, local627.anInt65);
									}
								}
							}
							local534++;
						}
					}
				}
				if (local27.aBoolean43 && Static94.anInt2487 == 1 && (Static90.anInt2427 & 0x20) == 32) {
					if (arg4 >= local50 && arg8 >= local58 && arg4 < local27.anInt823 + local50 && local27.anInt817 + local58 > arg8) {
						if (local27.anInt826 < 0) {
							Static82.method1457(local27.anInt826 & 0x7FFF, local27.anInt833, Static17.method233(new Class23[] { Static1.aClass23_53, Static70.aClass23_1015, local27.aClass23_458 }), Static3.aClass23_96, 32, 0);
						} else {
							Static82.method1457(-1, local27.anInt826, Static17.method233(new Class23[] { Static1.aClass23_53, Static70.aClass23_1015, local27.aClass23_458 }), Static3.aClass23_96, 32, 0);
						}
					}
				} else if (local27.aBoolean41 && local27.aClass23Array10 != null && Static94.anInt2487 == 0 && arg4 >= local50 && local58 <= arg8 && arg4 < local27.anInt823 + local50 && arg8 < local58 + local27.anInt817) {
					for (local534 = local27.aClass23Array10.length - 1; local534 >= 0; local534--) {
						if (local27.aClass23Array10[local534] != null) {
							if (local27.anInt826 < 0) {
								Static82.method1457(local27.anInt826 & 0x7FFF, local27.anInt833, local27.aClass23_458, local27.aClass23Array10[local534], 31, local534 + 1);
							} else {
								Static82.method1457(-1, local27.anInt826, local27.aClass23_458, local27.aClass23Array10[local534], 31, local534 + 1);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)V")
	public static void method440() {
		try {
			@Pc(2) Graphics local2 = Static26.aCanvas1.getGraphics();
			Static92.aClass34_84.method1144(357, local2, 17);
		} catch (@Pc(10) Exception local10) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(B)V")
	public static void method441() {
		@Pc(14) int local14;
		for (@Pc(7) int local7 = -1; local7 < Static2.anInt2290; local7++) {
			if (local7 == -1) {
				local14 = 2047;
			} else {
				local14 = Static63.anIntArray226[local7];
			}
			@Pc(24) Class1_Sub1_Sub2_Sub1_Sub2 local24 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[local14];
			if (local24 != null && local24.anInt2216 > 0) {
				local24.anInt2216--;
				if (local24.anInt2216 == 0) {
					local24.aClass23_1257 = null;
				}
			}
		}
		for (local14 = 0; local14 < Static20.anInt691; local14++) {
			@Pc(65) int local65 = Static98.anIntArray346[local14];
			@Pc(69) Class1_Sub1_Sub2_Sub1_Sub1 local69 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local65];
			if (local69 != null && local69.anInt2216 > 0) {
				local69.anInt2216--;
				if (local69.anInt2216 == 0) {
					local69.aClass23_1257 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
	public static void method442() {
		Static84.anInt2352 = 0;
		@Pc(149) int local149;
		for (@Pc(12) int local12 = -1; local12 < Static2.anInt2290 + Static20.anInt691; local12++) {
			@Pc(29) Class1_Sub1_Sub2_Sub1 local29;
			if (local12 == -1) {
				local29 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1;
			} else if (local12 >= Static2.anInt2290) {
				local29 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[Static98.anIntArray346[local12 - Static2.anInt2290]];
			} else {
				local29 = Static74.aClass1_Sub1_Sub2_Sub1_Sub2Array3[Static63.anIntArray226[local12]];
			}
			if (local29 != null && local29.method1387()) {
				@Pc(53) Class1_Sub1_Sub16 local53;
				if (local29 instanceof Class1_Sub1_Sub2_Sub1_Sub1) {
					local53 = ((Class1_Sub1_Sub2_Sub1_Sub1) local29).aClass1_Sub1_Sub16_1;
					if (local53.anIntArray381 != null) {
						local53 = local53.method1816();
					}
					if (local53 == null) {
						continue;
					}
				}
				if (Static2.anInt2290 <= local12) {
					local53 = ((Class1_Sub1_Sub2_Sub1_Sub1) local29).aClass1_Sub1_Sub16_1;
					if (local53.anInt2751 >= 0 && local53.anInt2751 < Static34.aClass1_Sub1_Sub6_Sub1Array2.length) {
						Static70.method1141(local29, local29.anInt2217 + 15);
						if (Static13.anInt234 > -1) {
							Static34.aClass1_Sub1_Sub6_Sub1Array2[local53.anInt2751].method798(Static13.anInt234 - 12, Static20.anInt687 + -30);
						}
					}
					if (Static80.anInt2234 == 1 && Static25.anInt759 == Static98.anIntArray346[local12 - Static2.anInt2290] && Static7.anInt176 % 20 < 10) {
						Static70.method1141(local29, local29.anInt2217 + 15);
						if (Static13.anInt234 > -1) {
							Static90.aClass1_Sub1_Sub6_Sub1Array8[0].method798(Static13.anInt234 - 12, Static20.anInt687 + -28);
						}
					}
				} else {
					@Pc(147) Class1_Sub1_Sub2_Sub1_Sub2 local147 = (Class1_Sub1_Sub2_Sub1_Sub2) local29;
					local149 = 30;
					if (local147.anInt2256 != -1 || local147.anInt2241 != -1) {
						Static70.method1141(local29, local29.anInt2217 + 15);
						if (Static13.anInt234 > -1) {
							if (local147.anInt2256 != -1) {
								Static97.aClass1_Sub1_Sub6_Sub1Array9[local147.anInt2256].method798(Static13.anInt234 - 12, Static20.anInt687 + -30);
								local149 += 25;
							}
							if (local147.anInt2241 != -1) {
								Static34.aClass1_Sub1_Sub6_Sub1Array2[local147.anInt2241].method798(Static13.anInt234 - 12, -local149 + Static20.anInt687);
								local149 += 25;
							}
						}
					}
					if (local12 >= 0 && Static80.anInt2234 == 10 && Static13.anInt235 == Static63.anIntArray226[local12]) {
						Static70.method1141(local29, local29.anInt2217 + 15);
						if (Static13.anInt234 > -1) {
							Static90.aClass1_Sub1_Sub6_Sub1Array8[1].method798(Static13.anInt234 - 12, Static20.anInt687 + -local149);
						}
					}
				}
				if (local29.aClass23_1257 != null && (local12 >= Static2.anInt2290 || Static2.anInt2292 == 0 || Static2.anInt2292 == 3 || Static2.anInt2292 == 1 && Static57.method1100(((Class1_Sub1_Sub2_Sub1_Sub2) local29).aClass23_1260))) {
					Static70.method1141(local29, local29.anInt2217);
					if (Static13.anInt234 > -1 && anInt857 > Static84.anInt2352) {
						anIntArray126[Static84.anInt2352] = Static2.aClass1_Sub1_Sub6_Sub2_13.method850(local29.aClass23_1257) / 2;
						anIntArray124[Static84.anInt2352] = Static2.aClass1_Sub1_Sub6_Sub2_13.anInt1358;
						anIntArray127[Static84.anInt2352] = Static13.anInt234;
						anIntArray123[Static84.anInt2352] = Static20.anInt687;
						anIntArray122[Static84.anInt2352] = local29.anInt2230;
						anIntArray121[Static84.anInt2352] = local29.anInt2210;
						anIntArray120[Static84.anInt2352] = local29.anInt2216;
						aClass23Array11[Static84.anInt2352] = local29.aClass23_1257;
						Static84.anInt2352++;
					}
				}
				if (local29.anInt2172 > Static7.anInt176) {
					Static70.method1141(local29, local29.anInt2217 + 15);
					if (Static13.anInt234 > -1) {
						local149 = local29.anInt2228 * 30 / local29.anInt2173;
						if (local149 > 30) {
							local149 = 30;
						}
						Static24.method1578(Static13.anInt234 - 15, Static20.anInt687 + -3, local149, 5, 65280);
						Static24.method1578(Static13.anInt234 + local149 - 15, Static20.anInt687 + -3, 30 - local149, 5, 16711680);
					}
				}
				for (local149 = 0; local149 < 4; local149++) {
					if (Static7.anInt176 < local29.anIntArray262[local149]) {
						Static70.method1141(local29, local29.anInt2217 / 2);
						if (Static13.anInt234 > -1) {
							if (local149 == 1) {
								Static20.anInt687 -= 20;
							}
							if (local149 == 2) {
								Static13.anInt234 -= 15;
								Static20.anInt687 -= 10;
							}
							if (local149 == 3) {
								Static13.anInt234 += 15;
								Static20.anInt687 -= 10;
							}
							Static73.aClass1_Sub1_Sub6_Sub1Array6[local29.anIntArray267[local149]].method798(Static13.anInt234 - 12, Static20.anInt687 - 12);
							Static63.aClass1_Sub1_Sub6_Sub2_10.method832(Static19.method274(local29.anIntArray260[local149]), Static13.anInt234, Static20.anInt687 + 4, 0);
							Static63.aClass1_Sub1_Sub6_Sub2_10.method832(Static19.method274(local29.anIntArray260[local149]), Static13.anInt234 - 1, Static20.anInt687 + 3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(493) int local493 = 0; local493 < Static84.anInt2352; local493++) {
			local149 = anIntArray127[local493];
			@Pc(502) int local502 = anIntArray123[local493];
			@Pc(506) int local506 = anIntArray126[local493];
			@Pc(510) int local510 = anIntArray124[local493];
			@Pc(512) boolean local512 = true;
			while (local512) {
				local512 = false;
				for (@Pc(517) int local517 = 0; local517 < local493; local517++) {
					if (anIntArray123[local517] - anIntArray124[local517] < local502 + 2 && local502 - local510 < anIntArray123[local517] + 2 && local149 - local506 < anIntArray127[local517] + anIntArray126[local517] && anIntArray127[local517] - anIntArray126[local517] < local149 - -local506 && local502 > anIntArray123[local517] - anIntArray124[local517]) {
						local502 = anIntArray123[local517] - anIntArray124[local517];
						local512 = true;
					}
				}
			}
			Static13.anInt234 = anIntArray127[local493];
			Static20.anInt687 = anIntArray123[local493] = local502;
			@Pc(616) Class23 local616 = aClass23Array11[local493];
			if (Static9.anInt195 == 0) {
				@Pc(620) int local620 = 16776960;
				if (anIntArray122[local493] < 6) {
					local620 = Static62.anIntArray219[anIntArray122[local493]];
				}
				if (anIntArray122[local493] == 6) {
					local620 = Static3.anInt131 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (anIntArray122[local493] == 7) {
					local620 = Static3.anInt131 % 20 >= 10 ? 65535 : 255;
				}
				if (anIntArray122[local493] == 8) {
					local620 = Static3.anInt131 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(689) int local689;
				if (anIntArray122[local493] == 9) {
					local689 = 150 - anIntArray120[local493];
					if (local689 < 50) {
						local620 = local689 * 1280 + 16711680;
					} else if (local689 < 100) {
						local620 = 16776960 - (local689 - 50) * 327680;
					} else if (local689 < 150) {
						local620 = (local689 - 100) * 5 + 65280;
					}
				}
				if (anIntArray122[local493] == 10) {
					local689 = 150 - anIntArray120[local493];
					if (local689 < 50) {
						local620 = local689 * 5 + 16711680;
					} else if (local689 < 100) {
						local620 = 16711935 - (local689 - 50) * 327680;
					} else if (local689 < 150) {
						local620 = (local689 - 100) * 327680 + 255 - (local689 - 100) * 5;
					}
				}
				if (anIntArray122[local493] == 11) {
					local689 = 150 - anIntArray120[local493];
					if (local689 < 50) {
						local620 = 16777215 - local689 * 327685;
					} else if (local689 < 100) {
						local620 = (local689 - 50) * 327685 + 65280;
					} else if (local689 < 150) {
						local620 = 32768000 + 16777215 - local689 * 327680;
					}
				}
				if (anIntArray121[local493] == 0) {
					Static2.aClass1_Sub1_Sub6_Sub2_13.method832(local616, Static13.anInt234, Static20.anInt687 + 1, 0);
					Static2.aClass1_Sub1_Sub6_Sub2_13.method832(local616, Static13.anInt234, Static20.anInt687, local620);
				}
				if (anIntArray121[local493] == 1) {
					Static2.aClass1_Sub1_Sub6_Sub2_13.method838(local616, Static13.anInt234, Static20.anInt687 + 1, 0, Static3.anInt131);
					Static2.aClass1_Sub1_Sub6_Sub2_13.method838(local616, Static13.anInt234, Static20.anInt687, local620, Static3.anInt131);
				}
				if (anIntArray121[local493] == 2) {
					Static2.aClass1_Sub1_Sub6_Sub2_13.method842(local616, Static13.anInt234, Static20.anInt687 + 1, 0, Static3.anInt131);
					Static2.aClass1_Sub1_Sub6_Sub2_13.method842(local616, Static13.anInt234, Static20.anInt687, local620, Static3.anInt131);
				}
				if (anIntArray121[local493] == 3) {
					Static2.aClass1_Sub1_Sub6_Sub2_13.method843(local616, Static13.anInt234, Static20.anInt687 + 1, 0, Static3.anInt131, 150 - anIntArray120[local493]);
					Static2.aClass1_Sub1_Sub6_Sub2_13.method843(local616, Static13.anInt234, Static20.anInt687, local620, Static3.anInt131, 150 - anIntArray120[local493]);
				}
				@Pc(951) int local951;
				if (anIntArray121[local493] == 4) {
					local689 = Static2.aClass1_Sub1_Sub6_Sub2_13.method850(local616);
					local951 = (local689 + 100) * (150 - anIntArray120[local493]) / 150;
					Static24.method1580(Static13.anInt234 - 50, 0, Static13.anInt234 + 50, 334);
					Static2.aClass1_Sub1_Sub6_Sub2_13.method836(local616, Static13.anInt234 + 50 - local951, Static20.anInt687 + 1, 0);
					Static2.aClass1_Sub1_Sub6_Sub2_13.method836(local616, Static13.anInt234 + 50 - local951, Static20.anInt687, local620);
					Static24.method1583();
				}
				if (anIntArray121[local493] == 5) {
					local951 = 0;
					local689 = 150 - anIntArray120[local493];
					Static24.method1580(0, Static20.anInt687 - Static2.aClass1_Sub1_Sub6_Sub2_13.anInt1358 - 1, 512, Static20.anInt687 + 5);
					if (local689 < 25) {
						local951 = local689 - 25;
					} else if (local689 > 125) {
						local951 = local689 - 125;
					}
					Static2.aClass1_Sub1_Sub6_Sub2_13.method832(local616, Static13.anInt234, local951 + Static20.anInt687 + 1, 0);
					Static2.aClass1_Sub1_Sub6_Sub2_13.method832(local616, Static13.anInt234, local951 + Static20.anInt687, local620);
					Static24.method1583();
				}
			} else {
				Static2.aClass1_Sub1_Sub6_Sub2_13.method832(local616, Static13.anInt234, Static20.anInt687 + 1, 0);
				Static2.aClass1_Sub1_Sub6_Sub2_13.method832(local616, Static13.anInt234, Static20.anInt687, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)Lclient!d;")
	public static Class1_Sub1_Sub5 method443(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub5 local10 = (Class1_Sub1_Sub5) Static32.aClass5_27.method98((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(36) byte[] local36 = Static13.aClass55_7.method1867(arg0, 4);
		local10 = new Class1_Sub1_Sub5();
		if (local36 != null) {
			local10.method250(new Class1_Sub5(local36), arg0);
		}
		local10.method252();
		Static32.aClass5_27.method97(local10, (long) arg0);
		return local10;
	}
}
