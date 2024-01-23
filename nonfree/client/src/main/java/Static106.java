import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_19;

	@OriginalMember(owner = "client!kh", name = "d", descriptor = "Lclient!kh;")
	private static Class60 aClass60_780 = Static200.method3116("Jun");

	@OriginalMember(owner = "client!kh", name = "ub", descriptor = "Lclient!kh;")
	private static Class60 aClass60_791 = Static200.method3116("Jan");

	@OriginalMember(owner = "client!kh", name = "gb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_788 = Static200.method3116("Feb");

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "Lclient!kh;")
	private static Class60 aClass60_784 = Static200.method3116("Mar");

	@OriginalMember(owner = "client!kh", name = "m", descriptor = "Lclient!kh;")
	private static Class60 aClass60_781 = Static200.method3116("Apr");

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "Lclient!kh;")
	private static Class60 aClass60_782 = Static200.method3116("May");

	@OriginalMember(owner = "client!kh", name = "wb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_792 = Static200.method3116("Jul");

	@OriginalMember(owner = "client!kh", name = "A", descriptor = "Lclient!kh;")
	private static Class60 aClass60_785 = Static200.method3116("Aug");

	@OriginalMember(owner = "client!kh", name = "r", descriptor = "Lclient!kh;")
	private static Class60 aClass60_783 = Static200.method3116("Sep");

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "Lclient!kh;")
	private static Class60 aClass60_786 = Static200.method3116("Oct");

	@OriginalMember(owner = "client!kh", name = "ob", descriptor = "Lclient!kh;")
	private static Class60 aClass60_789 = Static200.method3116("Nov");

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "Lclient!kh;")
	private static Class60 aClass60_787 = Static200.method3116("Dec");

	@OriginalMember(owner = "client!kh", name = "j", descriptor = "[Lclient!kh;")
	public static Class60[] aClass60Array16 = new Class60[] { aClass60_791, aClass60_788, aClass60_784, aClass60_781, aClass60_782, aClass60_780, aClass60_792, aClass60_785, aClass60_783, aClass60_786, aClass60_789, aClass60_787 };

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
	public static int anInt2406 = 0;

	@OriginalMember(owner = "client!kh", name = "rb", descriptor = "Lclient!kh;")
	public static Class60 aClass60_790 = Static200.method3116("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)Z")
	public static boolean method1796(@OriginalArg(1) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIII)V")
	public static void method1817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(34) int local34;
		@Pc(46) int local46;
		if (Static79.anInt1905 == 0 && !Static75.aBoolean98) {
			@Pc(10) int local10 = Static150.anInt3353;
			@Pc(16) int local16 = Static135.anInt2931;
			@Pc(18) int local18 = Static182.anInt3877;
			@Pc(32) int local32 = local10 + (arg5 - arg1) * (local16 - local10) / arg3;
			local34 = Static177.anInt3788;
			local46 = local34 + (arg2 - arg0) * (local18 - local34) / arg4;
			Static56.method1061(0L, Static94.aClass60_708, local46, (short) 11, local32, Static149.aClass60_1155);
		}
		@Pc(64) long local64 = -1L;
		for (local34 = 0; local34 < Static140.anInt3125; local34++) {
			@Pc(72) long local72 = Static79.aLongArray5[local34];
			@Pc(79) int local79 = (int) local72 >> 7 & 0x7F;
			local46 = (int) local72 & 0x7F;
			@Pc(91) int local91 = (int) (local72 >>> 32) & Integer.MAX_VALUE;
			@Pc(98) int local98 = (int) local72 >> 29 & 0x3;
			if (local72 != local64) {
				local64 = local72;
				@Pc(180) int local180;
				if (local98 == 2 && Static176.method585(Static180.anInt3841, local46, local79, local72)) {
					@Pc(117) Class1_Sub1_Sub23 local117 = Static44.method760(local91);
					if (local117.anIntArray526 != null) {
						local117 = local117.method2938();
					}
					if (local117 == null) {
						continue;
					}
					if (Static79.anInt1905 == 1) {
						Static56.method1061(local72, Static9.aClass60_1510, local79, (short) 37, local46, Static34.method611(new Class60[] { Static108.aClass60_809, Static200.aClass60_1462, local117.aClass60_1358 }));
					} else if (!Static75.aBoolean98) {
						@Pc(170) Class60[] local170 = local117.aClass60Array28;
						if (Static141.aBoolean172) {
							local170 = Static133.method2216(local170);
						}
						if (local170 != null) {
							for (local180 = 4; local180 >= 0; local180--) {
								if (local170[local180] != null) {
									@Pc(192) short local192 = 0;
									if (local180 == 0) {
										local192 = 14;
									}
									if (local180 == 1) {
										local192 = 45;
									}
									if (local180 == 2) {
										local192 = 10;
									}
									if (local180 == 3) {
										local192 = 36;
									}
									if (local180 == 4) {
										local192 = 1002;
									}
									Static56.method1061(local72, local170[local180], local79, local192, local46, Static34.method611(new Class60[] { Static181.aClass60_1306, local117.aClass60_1358 }));
								}
							}
						}
						Static56.method1061((long) local117.anInt4033, Static34.aClass60_271, local79, (short) 1007, local46, Static34.method611(new Class60[] { Static181.aClass60_1306, local117.aClass60_1358 }));
					} else if ((Static210.anInt3912 & 0x4) == 4) {
						Static56.method1061(local72, Static36.aClass60_1324, local79, (short) 30, local46, Static34.method611(new Class60[] { Static73.aClass60_561, Static200.aClass60_1462, local117.aClass60_1358 }));
					}
				}
				@Pc(339) int local339;
				@Pc(347) Class9_Sub4_Sub2 local347;
				@Pc(394) Class9_Sub4_Sub1 local394;
				if (local98 == 1) {
					@Pc(318) Class9_Sub4_Sub2 local318 = Static1.aClass9_Sub4_Sub2Array1[local91];
					if (local318.aClass1_Sub1_Sub9_1.anInt2329 == 1 && (local318.anInt3925 & 0x7F) == 64 && (local318.anInt3903 & 0x7F) == 64) {
						for (local339 = 0; local339 < Static56.anInt1482; local339++) {
							local347 = Static1.aClass9_Sub4_Sub2Array1[Static19.anIntArray73[local339]];
							if (local347 != null && local318 != local347 && local347.aClass1_Sub1_Sub9_1.anInt2329 == 1 && local347.anInt3925 == local318.anInt3925 && local318.anInt3903 == local347.anInt3903) {
								Static144.method2486(local347.aClass1_Sub1_Sub9_1, local46, local79, Static19.anIntArray73[local339]);
							}
						}
						for (local180 = 0; local180 < Static205.anInt4356; local180++) {
							local394 = Static41.aClass9_Sub4_Sub1Array2[Static124.anIntArray353[local180]];
							if (local394 != null && local394.anInt3925 == local318.anInt3925 && local394.anInt3903 == local318.anInt3903) {
								Static217.method3440(Static124.anIntArray353[local180], local79, local46, local394);
							}
						}
					}
					Static144.method2486(local318.aClass1_Sub1_Sub9_1, local46, local79, local91);
				}
				if (local98 == 0) {
					@Pc(442) Class9_Sub4_Sub1 local442 = Static41.aClass9_Sub4_Sub1Array2[local91];
					if ((local442.anInt3925 & 0x7F) == 64 && (local442.anInt3903 & 0x7F) == 64) {
						for (local339 = 0; local339 < Static56.anInt1482; local339++) {
							local347 = Static1.aClass9_Sub4_Sub2Array1[Static19.anIntArray73[local339]];
							if (local347 != null && local347.aClass1_Sub1_Sub9_1.anInt2329 == 1 && local347.anInt3925 == local442.anInt3925 && local442.anInt3903 == local347.anInt3903) {
								Static144.method2486(local347.aClass1_Sub1_Sub9_1, local46, local79, Static19.anIntArray73[local339]);
							}
						}
						for (local180 = 0; local180 < Static205.anInt4356; local180++) {
							local394 = Static41.aClass9_Sub4_Sub1Array2[Static124.anIntArray353[local180]];
							if (local394 != null && local394 != local442 && local442.anInt3925 == local394.anInt3925 && local442.anInt3903 == local394.anInt3903) {
								Static217.method3440(Static124.anIntArray353[local180], local79, local46, local394);
							}
						}
					}
					Static217.method3440(local91, local79, local46, local442);
				}
				if (local98 == 3) {
					@Pc(564) Class19 local564 = Static128.aClass19ArrayArrayArray1[Static180.anInt3841][local46][local79];
					if (local564 != null) {
						for (@Pc(571) Class1_Sub1_Sub16 local571 = (Class1_Sub1_Sub16) local564.method613(); local571 != null; local571 = (Class1_Sub1_Sub16) local564.method617()) {
							local180 = local571.aClass9_Sub5_1.anInt1521;
							@Pc(581) Class1_Sub1_Sub18 local581 = Static191.method2990(local180);
							if (Static79.anInt1905 == 1) {
								Static56.method1061((long) local180, Static9.aClass60_1510, local79, (short) 46, local46, Static34.method611(new Class60[] { Static108.aClass60_809, Static189.aClass60_1370, local581.aClass60_1043 }));
							} else if (!Static75.aBoolean98) {
								@Pc(662) Class60[] local662 = local581.aClass60Array20;
								if (Static141.aBoolean172) {
									local662 = Static133.method2216(local662);
								}
								for (@Pc(670) int local670 = 4; local670 >= 0; local670--) {
									if (local662 != null && local662[local670] != null) {
										@Pc(684) byte local684 = 0;
										if (local670 == 0) {
											local684 = 44;
										}
										if (local670 == 1) {
											local684 = 42;
										}
										if (local670 == 2) {
											local684 = 57;
										}
										if (local670 == 3) {
											local684 = 23;
										}
										if (local670 == 4) {
											local684 = 15;
										}
										Static56.method1061((long) local180, local662[local670], local79, local684, local46, Static34.method611(new Class60[] { Static211.aClass60_1198, local581.aClass60_1043 }));
									} else if (local670 == 2) {
										Static56.method1061((long) local180, Static110.aClass60_821, local79, (short) 57, local46, Static34.method611(new Class60[] { Static211.aClass60_1198, local581.aClass60_1043 }));
									}
								}
								Static56.method1061((long) local180, Static34.aClass60_271, local79, (short) 1005, local46, Static34.method611(new Class60[] { Static211.aClass60_1198, local581.aClass60_1043 }));
							} else if ((Static210.anInt3912 & 0x1) == 1) {
								Static56.method1061((long) local180, Static36.aClass60_1324, local79, (short) 40, local46, Static34.method611(new Class60[] { Static73.aClass60_561, Static189.aClass60_1370, local581.aClass60_1043 }));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZZ[Lclient!ah;II)V")
	public static void method1822(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class6[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = 0; local12 < arg2.length; local12++) {
			@Pc(18) Class6 local18 = arg2[local12];
			if (local18 != null && arg0 == local18.anInt204) {
				Static69.method1254(local18, arg4, arg1, arg3);
				Static42.method692(local18, arg4, arg3);
				if (local18.anInt201 - local18.anInt251 < local18.anInt250) {
					local18.anInt250 = local18.anInt201 - local18.anInt251;
				}
				if (local18.anInt250 < 0) {
					local18.anInt250 = 0;
				}
				if (local18.anInt266 - local18.anInt221 < local18.anInt247) {
					local18.anInt247 = local18.anInt266 - local18.anInt221;
				}
				if (local18.anInt247 < 0) {
					local18.anInt247 = 0;
				}
				if (local18.anInt233 == 0) {
					Static178.method2848(arg1, local18);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "(B)V")
	public static void method1828() {
		Static141.aClass39_15.method1158();
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IBIIIZ[Lclient!ab;[B)V")
	public static void method1833(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class3[] arg4, @OriginalArg(7) byte[] arg5) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		for (@Pc(9) int local9 = 0; local9 < 4; local9++) {
			for (local13 = 0; local13 < 64; local13++) {
				for (local17 = 0; local17 < 64; local17++) {
					if (local13 + arg1 > 0 && arg1 + local13 < 103 && local17 + arg0 > 0 && arg0 + local17 < 103) {
						arg4[local9].anIntArrayArray1[local13 + arg1][arg0 + local17] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(101) Class1_Sub9 local101 = new Class1_Sub9(arg5);
		for (local13 = 0; local13 < 4; local13++) {
			for (local17 = 0; local17 < 64; local17++) {
				for (@Pc(111) int local111 = 0; local111 < 64; local111++) {
					Static44.method762(local101, 0, arg2, local13, arg3, arg0 + local111, arg1 + local17);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V")
	public static void method1840() {
		Static208.aClass39_27.method1158();
		Static82.aClass27_49.method963();
		Static36.aClass27_104.method963();
		Static11.aClass27_125.method963();
	}
}
