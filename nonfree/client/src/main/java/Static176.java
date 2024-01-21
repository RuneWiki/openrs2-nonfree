import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!ve", name = "x", descriptor = "Lclient!ud;")
	public static Class82_Sub1 aClass82_Sub1_18;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!nd;")
	public static Class59 aClass59_29 = new Class59(50);

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1403 = Static120.method2057("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
	public static int anInt4013 = 0;

	@OriginalMember(owner = "client!ve", name = "t", descriptor = "[I")
	public static int[] anIntArray423 = new int[2048];

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1404 = Static120.method2057(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1405 = Static120.method2057(":duelfriend:");

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIII)V")
	public static void method3052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static164.anInt3767 == 0 && !Static184.aBoolean172) {
			Static175.method2242(Static185.aClass81_1375, Static149.aClass81_1213, arg2 - arg1, (short) 42, arg3 - arg0, 0L);
		}
		@Pc(32) long local32 = -1L;
		for (@Pc(39) int local39 = 0; local39 < Static124.anInt1942; local39++) {
			@Pc(45) long local45 = Static124.aLongArray3[local39];
			@Pc(50) int local50 = (int) local45 & 0x7F;
			@Pc(57) int local57 = (int) local45 >> 29 & 0x3;
			@Pc(64) int local64 = (int) local45 >> 7 & 0x7F;
			@Pc(71) int local71 = (int) (local45 >>> 32) & Integer.MAX_VALUE;
			if (local45 != local32) {
				local32 = local45;
				@Pc(192) int local192;
				if (local57 == 2 && Static67.method1201(Static44.anInt1086, local50, local64, local45)) {
					@Pc(94) Class1_Sub2_Sub8 local94 = Static14.method220(local71);
					if (local94.anIntArray108 != null) {
						local94 = local94.method936();
					}
					if (local94 == null) {
						continue;
					}
					if (Static164.anInt3767 == 1) {
						Static175.method2242(Static7.aClass81_79, Static127.method2169(new Class81[] { Static132.aClass81_1033, Static109.aClass81_850, local94.aClass81_449 }), local64, (short) 35, local50, local45);
					} else if (!Static184.aBoolean172) {
						@Pc(178) Class81[] local178 = local94.aClass81Array5;
						if (Static88.aBoolean85) {
							local178 = Static98.method1639(local178);
						}
						if (local178 != null) {
							for (local192 = 4; local192 >= 0; local192--) {
								if (local178[local192] != null) {
									@Pc(204) short local204 = 0;
									if (local192 == 0) {
										local204 = 50;
									}
									if (local192 == 1) {
										local204 = 29;
									}
									if (local192 == 2) {
										local204 = 9;
									}
									if (local192 == 3) {
										local204 = 25;
									}
									if (local192 == 4) {
										local204 = 1005;
									}
									Static175.method2242(local178[local192], Static127.method2169(new Class81[] { Static173.aClass81_1397, local94.aClass81_449 }), local64, local204, local50, local45);
								}
							}
						}
						Static175.method2242(Static11.aClass81_223, Static127.method2169(new Class81[] { Static173.aClass81_1397, local94.aClass81_449 }), local64, (short) 1002, local50, (long) local94.anInt1255);
					} else if ((Static93.anInt2064 & 0x4) == 4) {
						Static175.method2242(Static14.aClass81_127, Static127.method2169(new Class81[] { Static74.aClass81_617, Static109.aClass81_850, local94.aClass81_449 }), local64, (short) 8, local50, local45);
					}
				}
				@Pc(312) int local312;
				@Pc(320) Class1_Sub2_Sub1_Sub3_Sub2 local320;
				@Pc(363) Class1_Sub2_Sub1_Sub3_Sub1 local363;
				if (local57 == 1) {
					@Pc(287) Class1_Sub2_Sub1_Sub3_Sub2 local287 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[local71];
					if (local287.aClass1_Sub2_Sub5_1.anInt1010 == 1 && (local287.anInt3040 & 0x7F) == 64 && (local287.anInt3026 & 0x7F) == 64) {
						for (local312 = 0; local312 < Static35.anInt962; local312++) {
							local320 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[Static85.anIntArray15[local312]];
							if (local320 != null && local287 != local320 && local320.aClass1_Sub2_Sub5_1.anInt1010 == 1 && local320.anInt3040 == local287.anInt3040 && local320.anInt3026 == local287.anInt3026) {
								Static144.method2426(local50, local320.aClass1_Sub2_Sub5_1, local64, Static85.anIntArray15[local312]);
							}
						}
						for (local192 = 0; local192 < Static25.anInt645; local192++) {
							local363 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[anIntArray423[local192]];
							if (local363 != null && local363.anInt3040 == local287.anInt3040 && local363.anInt3026 == local287.anInt3026) {
								Static175.method2237(anIntArray423[local192], local363, local50, local64);
							}
						}
					}
					Static144.method2426(local50, local287.aClass1_Sub2_Sub5_1, local64, local71);
				}
				if (local57 == 0) {
					@Pc(412) Class1_Sub2_Sub1_Sub3_Sub1 local412 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[local71];
					if ((local412.anInt3040 & 0x7F) == 64 && (local412.anInt3026 & 0x7F) == 64) {
						for (local312 = 0; local312 < Static35.anInt962; local312++) {
							local320 = Static48.aClass1_Sub2_Sub1_Sub3_Sub2Array11[Static85.anIntArray15[local312]];
							if (local320 != null && local320.aClass1_Sub2_Sub5_1.anInt1010 == 1 && local320.anInt3040 == local412.anInt3040 && local320.anInt3026 == local412.anInt3026) {
								Static144.method2426(local50, local320.aClass1_Sub2_Sub5_1, local64, Static85.anIntArray15[local312]);
							}
						}
						for (local192 = 0; local192 < Static25.anInt645; local192++) {
							local363 = Static51.aClass1_Sub2_Sub1_Sub3_Sub1Array1[anIntArray423[local192]];
							if (local363 != null && local412 != local363 && local412.anInt3040 == local363.anInt3040 && local412.anInt3026 == local363.anInt3026) {
								Static175.method2237(anIntArray423[local192], local363, local50, local64);
							}
						}
					}
					Static175.method2237(local71, local412, local50, local64);
				}
				if (local57 == 3) {
					@Pc(536) Class30 local536 = Static139.aClass30ArrayArrayArray1[Static44.anInt1086][local50][local64];
					if (local536 != null) {
						for (@Pc(543) Class1_Sub2_Sub1_Sub1 local543 = (Class1_Sub2_Sub1_Sub1) local536.method1123(); local543 != null; local543 = (Class1_Sub2_Sub1_Sub1) local536.method1119()) {
							@Pc(550) Class1_Sub2_Sub12 local550 = Static54.method969(local543.anInt105);
							if (Static164.anInt3767 == 1) {
								Static175.method2242(Static7.aClass81_79, Static127.method2169(new Class81[] { Static132.aClass81_1033, aClass81_1404, local550.aClass81_843 }), local64, (short) 31, local50, (long) local543.anInt105);
							} else if (!Static184.aBoolean172) {
								@Pc(635) Class81[] local635 = local550.aClass81Array9;
								if (Static88.aBoolean85) {
									local635 = Static98.method1639(local635);
								}
								for (@Pc(643) int local643 = 4; local643 >= 0; local643--) {
									if (local635 != null && local635[local643] != null) {
										@Pc(688) byte local688 = 0;
										if (local643 == 0) {
											local688 = 15;
										}
										if (local643 == 1) {
											local688 = 38;
										}
										if (local643 == 2) {
											local688 = 32;
										}
										if (local643 == 3) {
											local688 = 20;
										}
										if (local643 == 4) {
											local688 = 28;
										}
										Static175.method2242(local635[local643], Static127.method2169(new Class81[] { Static25.aClass81_219, local550.aClass81_843 }), local64, local688, local50, (long) local543.anInt105);
									} else if (local643 == 2) {
										Static175.method2242(Static54.aClass81_454, Static127.method2169(new Class81[] { Static25.aClass81_219, local550.aClass81_843 }), local64, (short) 32, local50, (long) local543.anInt105);
									}
								}
								Static175.method2242(Static11.aClass81_223, Static127.method2169(new Class81[] { Static25.aClass81_219, local550.aClass81_843 }), local64, (short) 1001, local50, (long) local543.anInt105);
							} else if ((Static93.anInt2064 & 0x1) == 1) {
								Static175.method2242(Static14.aClass81_127, Static127.method2169(new Class81[] { Static74.aClass81_617, aClass81_1404, local550.aClass81_843 }), local64, (short) 11, local50, (long) local543.anInt105);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(III)V")
	public static void method3053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static148.aBoolean143 = true;
		Static136.anInt2921 = arg0;
		Static79.anInt1837 = arg1;
		Static92.anInt2062 = arg2;
		Static183.anInt4108 = -1;
		Static151.anInt3418 = -1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(III[[[I)V")
	public static void method3054(@OriginalArg(3) int[][][] arg0) {
		Static77.anInt1828 = 4;
		Static8.anInt164 = 104;
		Static141.anInt709 = 104;
		Static167.aClass1_Sub17ArrayArrayArray1 = new Class1_Sub17[4][104][104];
		Static19.anIntArrayArrayArray1 = new int[4][105][105];
		Static116.anIntArrayArrayArray4 = arg0;
		Static163.method2852();
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method3055() {
		aClass81_1404 = null;
		aClass82_Sub1_18 = null;
		aClass81_1403 = null;
		anIntArray424 = null;
		aClass81_1405 = null;
		aClass59_29 = null;
		anIntArray423 = null;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Lclient!b;")
	public static Class6 method3056() {
		try {
			return (Class6) Class.forName("Class6_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)V")
	public static void method3057() {
		Static178.aByteArrayArray10 = null;
		Static73.anIntArray155 = null;
		Static25.anIntArray37 = null;
		Static155.anIntArray369 = null;
		Static161.anIntArray386 = null;
		Static73.anIntArray156 = null;
	}
}
