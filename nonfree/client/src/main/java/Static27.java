import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!ee", name = "cb", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!ee", name = "eb", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "[I")
	public static int[] anIntArray61;

	@OriginalMember(owner = "client!ee", name = "lb", descriptor = "Z")
	public static boolean aBoolean38;

	@OriginalMember(owner = "client!ee", name = "fb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_396 = Static14.method2017("yellow:");

	@OriginalMember(owner = "client!ee", name = "V", descriptor = "Lclient!kc;")
	public static Class36 aClass36_393 = aClass36_396;

	@OriginalMember(owner = "client!ee", name = "W", descriptor = "Z")
	public static boolean aBoolean37 = false;

	@OriginalMember(owner = "client!ee", name = "X", descriptor = "Lclient!kc;")
	private static Class36 aClass36_394 = Static14.method2017("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ee", name = "Y", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][105][105];

	@OriginalMember(owner = "client!ee", name = "mb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_398 = Static14.method2017("Enter name:");

	@OriginalMember(owner = "client!ee", name = "Z", descriptor = "Lclient!kc;")
	public static Class36 aClass36_395 = aClass36_398;

	@OriginalMember(owner = "client!ee", name = "nb", descriptor = "Lclient!kc;")
	private static Class36 aClass36_399 = Static14.method2017("Use");

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_397 = aClass36_399;

	@OriginalMember(owner = "client!ee", name = "jb", descriptor = "I")
	public static int anInt747 = 0;

	@OriginalMember(owner = "client!ee", name = "ob", descriptor = "Lclient!kc;")
	public static Class36 aClass36_400 = aClass36_394;

	@OriginalMember(owner = "client!ee", name = "rb", descriptor = "Lclient!kc;")
	public static Class36 aClass36_401 = Static14.method2017("mapscene");

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	public static void method566() {
		if (!Static56.aBoolean70) {
			return;
		}
		@Pc(11) Class2_Sub1_Sub6 local11 = Static76.method1462(Static65.anInt1670, Static1.anInt5);
		if (local11 != null && local11.anObjectArray16 != null) {
			Static92.method1684(local11, local11.anObjectArray16, 0, 0, 0, null);
		}
		Static56.aBoolean70 = false;
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3 method567() {
		@Pc(9) Class2_Sub1_Sub1_Sub3 local9 = new Class2_Sub1_Sub1_Sub3();
		local9.anInt1783 = Static92.anIntArray293[0];
		@Pc(18) byte[] local18 = Static42.aByteArrayArray19[0];
		local9.anInt1782 = anIntArray60[0];
		local9.anInt1785 = Static10.anInt247;
		local9.anInt1780 = Static64.anIntArray204[0];
		local9.anInt1781 = Static36.anIntArray132[0];
		@Pc(42) int local42 = local9.anInt1783 * local9.anInt1781;
		local9.anIntArray224 = new int[local42];
		local9.anInt1784 = Static96.anInt2558;
		for (@Pc(51) int local51 = 0; local51 < local42; local51++) {
			local9.anIntArray224[local51] = Static43.anIntArray161[local18[local51] & 0xFF];
		}
		Static40.method1545();
		return local9;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!hd;B)V")
	public static void method568(@OriginalArg(0) Class2_Sub1_Sub4_Sub2 arg0) {
		if (Static113.anInt2952 == arg0.anInt2188 || arg0.anInt2168 == -1 || arg0.anInt2162 != 0 || arg0.anInt2196 + 1 > Static56.method1045(arg0.anInt2168).anIntArray288[arg0.anInt2147]) {
			@Pc(34) int local34 = arg0.anInt2188 - arg0.anInt2165;
			@Pc(44) int local44 = arg0.anInt2163 * 64 + arg0.anInt2191 * 128;
			@Pc(50) int local50 = Static113.anInt2952 - arg0.anInt2165;
			@Pc(61) int local61 = arg0.anInt2186 * 128 + arg0.anInt2163 * 64;
			@Pc(71) int local71 = arg0.anInt2163 * 64 + arg0.anInt2176 * 128;
			arg0.anInt2204 = (local50 * local71 + (local34 - local50) * local61) / local34;
			@Pc(95) int local95 = arg0.anInt2163 * 64 + arg0.anInt2182 * 128;
			arg0.anInt2149 = (local44 * (local34 - local50) + local95 * local50) / local34;
		}
		if (arg0.anInt2177 == 0) {
			arg0.anInt2170 = 1024;
		}
		if (arg0.anInt2177 == 1) {
			arg0.anInt2170 = 1536;
		}
		arg0.anInt2148 = 0;
		if (arg0.anInt2177 == 2) {
			arg0.anInt2170 = 0;
		}
		if (arg0.anInt2177 == 3) {
			arg0.anInt2170 = 512;
		}
		arg0.anInt2156 = arg0.anInt2170;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII[Lclient!ed;IIIII)V")
	public static void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class2_Sub1_Sub6[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg3 > arg2 || arg10 < arg8 || arg0 <= arg2 || arg10 >= arg9) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < arg5.length; local20++) {
			@Pc(26) Class2_Sub1_Sub6 local26 = arg5[local20];
			if (local26 != null && local26.anInt669 == arg7 && (!local26.aBoolean27 || !Static81.method1492(local26))) {
				@Pc(49) int local49 = arg3 + local26.anInt722 - arg1;
				@Pc(57) int local57 = arg8 + local26.anInt685 - arg4;
				if ((local26.anInt658 >= 0 || local26.anInt693 != 0) && arg2 >= local49 && arg10 >= local57 && arg2 < local49 + local26.anInt677 && arg10 < local57 + local26.anInt660) {
					if (local26.anInt658 >= 0) {
						Static57.anInt1494 = local26.anInt658;
					} else {
						Static57.anInt1494 = local20;
					}
				}
				if (local26.anInt676 == 8 && local49 <= arg2 && arg10 >= local57 && local49 + local26.anInt677 > arg2 && local26.anInt660 + local57 > arg10) {
					Static91.anInt2365 = local20;
				}
				if (local26.anInt676 == 0) {
					if (!local26.aBoolean27 && Static81.method1492(local26) && !Static45.method902(local20, arg6)) {
						continue;
					}
					method569(local26.anInt677 + local49, local26.anInt675, arg2, local49, local26.anInt716, arg5, arg6, local26.anInt680, local57, local26.anInt660 + local57, arg10);
					if (local26.aClass2_Sub1_Sub6Array1 != null) {
						method569(local49 + local26.anInt677, local26.anInt675, arg2, local49, local26.anInt716, local26.aClass2_Sub1_Sub6Array1, arg6, local26.anInt680, local57, local57 + local26.anInt660, arg10);
					}
					if (local26.anInt660 < local26.anInt686 && !local26.aBoolean27) {
						Static111.method2002(arg10, arg2, local26.anInt677 + local49, arg6, local26, local26.anInt660, local26.anInt686, local57);
					}
					if (!local26.aBoolean27) {
						continue;
					}
				}
				if (local26.anInt665 == 1 && arg2 >= local49 && arg10 >= local57 && local26.anInt677 + local49 > arg2 && local26.anInt660 + local57 > arg10) {
					@Pc(281) boolean local281 = false;
					if (local26.anInt694 != 0) {
						local281 = Static59.method1103(local26);
					}
					if (!local281) {
						Static34.method717(33, local26.anInt680, 0, Static105.aClass36_1352, 0, local26.aClass36_370);
					}
				}
				if (local26.anInt665 == 2 && !Static56.aBoolean70 && local49 <= arg2 && arg10 >= local57 && arg2 < local49 + local26.anInt677 && local26.anInt660 + local57 > arg10) {
					@Pc(340) Class36 local340 = Static58.method1078(local26);
					if (local340 != null) {
						Static34.method717(20, local26.anInt680, -1, Static49.method949(new Class36[] { Static20.aClass36_261, local26.aClass36_372 }), 0, local340);
					}
				}
				if (local26.anInt665 == 3 && local49 <= arg2 && local57 <= arg10 && local26.anInt677 + local49 > arg2 && arg10 < local57 + local26.anInt660) {
					@Pc(410) byte local410;
					if (arg6 == 3) {
						local410 = 16;
					} else {
						local410 = 48;
					}
					Static34.method717(local410, local26.anInt680, 0, Static105.aClass36_1352, 0, Static118.aClass36_1459);
				}
				if (local26.anInt665 == 4 && arg2 >= local49 && local57 <= arg10 && local26.anInt677 + local49 > arg2 && local57 + local26.anInt660 > arg10) {
					Static34.method717(46, local26.anInt680, 0, Static105.aClass36_1352, 0, local26.aClass36_370);
				}
				if (local26.anInt665 == 5 && local49 <= arg2 && arg10 >= local57 && local49 + local26.anInt677 > arg2 && arg10 < local26.anInt660 + local57) {
					Static34.method717(12, local26.anInt680, 0, Static105.aClass36_1352, 0, local26.aClass36_370);
				}
				if (local26.anInt665 == 6 && Static80.anInt2060 == -1 && arg2 >= local49 && arg10 >= local57 && local49 + local26.anInt677 > arg2 && arg10 < local26.anInt660 + local57) {
					Static34.method717(52, local26.anInt680, -1, Static105.aClass36_1352, 0, local26.aClass36_370);
				}
				@Pc(562) int local562;
				@Pc(556) int local556;
				if (local26.anInt676 == 2) {
					local556 = 0;
					for (@Pc(558) int local558 = 0; local558 < local26.anInt660; local558++) {
						for (local562 = 0; local562 < local26.anInt677; local562++) {
							@Pc(574) int local574 = local558 * (local26.anInt708 + 32) + local57;
							@Pc(583) int local583 = local49 + local562 * (local26.anInt690 + 32);
							if (local556 < 20) {
								local583 += local26.anIntArray51[local556];
								local574 += local26.anIntArray53[local556];
							}
							if (local583 <= arg2 && local574 <= arg10 && local583 + 32 > arg2 && arg10 < local574 + 32) {
								Static111.anInt2883 = local26.anInt680;
								Static81.anInt2062 = local556;
								if (local26.anIntArray57[local556] > 0) {
									@Pc(644) Class2_Sub1_Sub18 local644 = Static43.method832(local26.anIntArray57[local556] - 1);
									if (Static20.anInt500 == 1 && Static48.method919(Static67.method1163(local26))) {
										if (Static81.anInt2064 != local26.anInt680 || local556 != Static112.anInt2923) {
											Static34.method717(49, local26.anInt680, local556, Static49.method949(new Class36[] { Static78.aClass36_958, Static8.aClass36_118, local644.aClass36_1397 }), local644.anInt2828, aClass36_397);
										}
									} else if (!Static56.aBoolean70 || !Static48.method919(Static67.method1163(local26))) {
										@Pc(709) Class36[] local709 = local644.aClass36Array50;
										if (Static20.aBoolean17) {
											local709 = Static39.method753(local709);
										}
										@Pc(723) int local723;
										@Pc(742) byte local742;
										if (Static48.method919(Static67.method1163(local26))) {
											for (local723 = 4; local723 >= 3; local723--) {
												if (local709 != null && local709[local723] != null) {
													if (local723 == 3) {
														local742 = 55;
													} else {
														local742 = 19;
													}
													Static34.method717(local742, local26.anInt680, local556, Static49.method949(new Class36[] { Static96.aClass36_1235, local644.aClass36_1397 }), local644.anInt2828, local709[local723]);
												} else if (local723 == 4) {
													Static34.method717(19, local26.anInt680, local556, Static49.method949(new Class36[] { Static96.aClass36_1235, local644.aClass36_1397 }), local644.anInt2828, Static88.aClass36_1076);
												}
											}
										}
										if (Static103.method1907(Static67.method1163(local26))) {
											Static34.method717(56, local26.anInt680, local556, Static49.method949(new Class36[] { Static96.aClass36_1235, local644.aClass36_1397 }), local644.anInt2828, aClass36_397);
										}
										if (Static48.method919(Static67.method1163(local26)) && local709 != null) {
											for (local723 = 2; local723 >= 0; local723--) {
												if (local709[local723] != null) {
													local742 = 0;
													if (local723 == 0) {
														local742 = 2;
													}
													if (local723 == 1) {
														local742 = 24;
													}
													if (local723 == 2) {
														local742 = 27;
													}
													Static34.method717(local742, local26.anInt680, local556, Static49.method949(new Class36[] { Static96.aClass36_1235, local644.aClass36_1397 }), local644.anInt2828, local709[local723]);
												}
											}
										}
										local709 = local26.aClass36Array15;
										if (Static20.aBoolean17) {
											local709 = Static39.method753(local709);
										}
										if (local709 != null) {
											for (local723 = 4; local723 >= 0; local723--) {
												if (local709[local723] != null) {
													local742 = 0;
													if (local723 == 0) {
														local742 = 8;
													}
													if (local723 == 1) {
														local742 = 15;
													}
													if (local723 == 2) {
														local742 = 4;
													}
													if (local723 == 3) {
														local742 = 37;
													}
													if (local723 == 4) {
														local742 = 43;
													}
													Static34.method717(local742, local26.anInt680, local556, Static49.method949(new Class36[] { Static96.aClass36_1235, local644.aClass36_1397 }), local644.anInt2828, local709[local723]);
												}
											}
										}
										Static34.method717(1005, local26.anInt680, local556, Static49.method949(new Class36[] { Static96.aClass36_1235, local644.aClass36_1397 }), local644.anInt2828, Static117.aClass36_903);
									} else if ((Static88.anInt2320 & 0x10) == 16) {
										Static34.method717(14, local26.anInt680, local556, Static49.method949(new Class36[] { Static73.aClass36_890, Static8.aClass36_118, local644.aClass36_1397 }), local644.anInt2828, Static55.aClass36_1328);
									}
								}
							}
							local556++;
						}
					}
				}
				if (local26.aBoolean27) {
					if (Static56.aBoolean70) {
						if (Static104.method1917(Static67.method1163(local26)) && (Static88.anInt2320 & 0x20) == 32 && arg2 >= local49 && arg10 >= local57 && local49 + local26.anInt677 > arg2 && local26.anInt660 + local57 > arg10) {
							Static34.method717(1, local26.anInt680, local26.anInt710, Static49.method949(new Class36[] { Static73.aClass36_890, Static55.aClass36_1327, local26.aClass36_368 }), 0, Static55.aClass36_1328);
						}
					} else if (local49 <= arg2 && local57 <= arg10 && local49 + local26.anInt677 > arg2 && arg10 < local57 + local26.anInt660) {
						@Pc(1113) Class36 local1113;
						for (local556 = 9; local556 >= 5; local556--) {
							local1113 = Static91.method1657(local26, local556);
							if (local1113 != null) {
								Static34.method717(45, local26.anInt680, local26.anInt710, local26.aClass36_368, local556 + 1, local1113);
							}
						}
						local1113 = Static58.method1078(local26);
						if (local1113 != null) {
							Static34.method717(20, local26.anInt680, local26.anInt710, local26.aClass36_368, 0, local1113);
						}
						for (local562 = 4; local562 >= 0; local562--) {
							@Pc(1170) Class36 local1170 = Static91.method1657(local26, local562);
							if (local1170 != null) {
								Static34.method717(45, local26.anInt680, local26.anInt710, local26.aClass36_368, local562 + 1, local1170);
							}
						}
						if (Static107.method1938(Static67.method1163(local26))) {
							Static34.method717(52, local26.anInt680, -1, Static105.aClass36_1352, 0, local26.aClass36_370);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(B)V")
	public static void method570() {
		aClass36_393 = null;
		aClass36_399 = null;
		anIntArray61 = null;
		anIntArray60 = null;
		aClass36_400 = null;
		aClass3_Sub1_3 = null;
		aClass36_394 = null;
		aClass36_401 = null;
		aClass36_397 = null;
		aClass36_395 = null;
		aClass36_396 = null;
		aClass36_398 = null;
		anIntArrayArrayArray4 = null;
	}
}
