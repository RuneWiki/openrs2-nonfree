import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bh", name = "p", descriptor = "Lclient!me;")
	public static Class1_Sub3_Sub1_Sub2 aClass1_Sub3_Sub1_Sub2_8;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
	public static int anInt3483;

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
	public static int anInt3467 = -1;

	@OriginalMember(owner = "client!bh", name = "v", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1688 = Static187.method3089("Close");

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1687 = aClass92_1688;

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Lclient!vd;")
	private static final Class92 aClass92_1690 = Static187.method3089("level)2");

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "Lclient!vd;")
	public static Class92 aClass92_1689 = aClass92_1690;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method2610(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg3 && arg2 == arg8 && arg0 == arg7 && arg4 == arg5) {
			Static59.method973(arg0, arg8, arg5, arg1, arg6);
			return;
		}
		@Pc(23) int local23 = arg1;
		@Pc(25) int local25 = arg8;
		@Pc(29) int local29 = arg1 * 3;
		@Pc(33) int local33 = arg3 * 3;
		@Pc(37) int local37 = arg8 * 3;
		@Pc(41) int local41 = arg2 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg4 * 3;
		@Pc(59) int local59 = arg0 + local33 - local45 - arg1;
		@Pc(70) int local70 = arg5 + local41 - arg8 - local49;
		@Pc(78) int local78 = local29 + local45 - local33 - local33;
		@Pc(89) int local89 = local49 + local37 - local41 - local41;
		@Pc(94) int local94 = local33 - local29;
		@Pc(99) int local99 = local41 - local37;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(109) int local109 = local101 * local101 >> 12;
			@Pc(115) int local115 = local109 * local101 >> 12;
			@Pc(119) int local119 = local115 * local59;
			@Pc(123) int local123 = local109 * local78;
			@Pc(127) int local127 = local70 * local115;
			@Pc(131) int local131 = local109 * local89;
			@Pc(135) int local135 = local99 * local101;
			@Pc(139) int local139 = local101 * local94;
			@Pc(150) int local150 = arg1 + (local123 + local119 + local139 >> 12);
			@Pc(162) int local162 = (local127 + local131 + local135 >> 12) + arg8;
			Static59.method973(local150, local25, local162, local23, arg6);
			local23 = local150;
			local25 = local162;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIZ)V")
	public static void method2611(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class55[] local12 = Static117.aClass55Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class55 local20 = local12[local14];
			if (local20 != null && local20.anInt2276 == 2) {
				Static154.method2359((local20.anInt2274 - Static138.anInt2800 << 7) + local20.anInt2279, local20.anInt2278 * 2, local20.anInt2277 + (local20.anInt2280 - Static100.anInt2141 << 7));
				if (Static23.anInt563 > -1 && Static155.anInt2981 % 20 < 10) {
					Static82.aClass1_Sub3_Sub1_Sub1Array13[local20.anInt2275].method358(arg0 + Static23.anInt563 - 12, arg1 + Static9.anInt3178 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	public static void method2615() {
		Static100.aClass47_14.method1276();
		Static201.aClass77_11.method2260();
		Static11.aClass77_1.method2260();
		Static55.aClass77_3.method2260();
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIII)V")
	public static void method2618(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static189.anInt4128 == 0 && !Static72.aBoolean100) {
			Static116.method1722(0L, Static26.aClass92_268, arg3 - arg1, -arg2 + arg0, (short) 4, Static173.aClass92_1765);
		}
		@Pc(37) long local37 = -1L;
		for (@Pc(39) int local39 = 0; local39 < Static180.anInt4483; local39++) {
			@Pc(45) long local45 = Static36.aLongArray2[local39];
			@Pc(50) int local50 = (int) local45 & 0x7F;
			@Pc(57) int local57 = Integer.MAX_VALUE & (int) (local45 >>> 32);
			@Pc(64) int local64 = (int) local45 >> 7 & 0x7F;
			@Pc(71) int local71 = (int) local45 >> 29 & 0x3;
			if (local45 != local37) {
				local37 = local45;
				@Pc(155) int local155;
				if (local71 == 2 && Static128.method1869(Static192.anInt4180, local50, local64, local45)) {
					@Pc(94) Class1_Sub3_Sub5 local94 = Static154.method2362(local57);
					if (local94.anIntArray116 != null) {
						local94 = local94.method959();
					}
					if (local94 == null) {
						continue;
					}
					if (Static189.anInt4128 == 1) {
						Static116.method1722(local45, Static208.method787(new Class92[] { Static186.aClass92_1900, Static102.aClass92_988, local94.aClass92_590 }), local50, local64, (short) 58, Static140.aClass92_1352);
					} else if (!Static72.aBoolean100) {
						@Pc(145) Class92[] local145 = local94.aClass92Array11;
						if (Static103.aBoolean129) {
							local145 = Static72.method1107(local145);
						}
						if (local145 != null) {
							for (local155 = 4; local155 >= 0; local155--) {
								if (local145[local155] != null) {
									@Pc(163) short local163 = 0;
									if (local155 == 0) {
										local163 = 9;
									}
									if (local155 == 1) {
										local163 = 51;
									}
									if (local155 == 2) {
										local163 = 16;
									}
									if (local155 == 3) {
										local163 = 11;
									}
									if (local155 == 4) {
										local163 = 1005;
									}
									Static116.method1722(local45, Static208.method787(new Class92[] { Static88.aClass92_807, local94.aClass92_590 }), local50, local64, local163, local145[local155]);
								}
							}
						}
						Static116.method1722((long) local94.anInt1389, Static208.method787(new Class92[] { Static88.aClass92_807, local94.aClass92_590 }), local50, local64, (short) 1003, Static19.aClass92_212);
					} else if ((Static19.anInt529 & 0x4) == 4) {
						Static116.method1722(local45, Static208.method787(new Class92[] { Static15.aClass92_135, Static102.aClass92_988, local94.aClass92_590 }), local50, local64, (short) 17, Static48.aClass92_516);
					}
				}
				@Pc(314) int local314;
				@Pc(322) Class8_Sub3_Sub2 local322;
				@Pc(371) Class8_Sub3_Sub1 local371;
				if (local71 == 1) {
					@Pc(289) Class8_Sub3_Sub2 local289 = Static177.aClass8_Sub3_Sub2Array1[local57];
					if (local289.aClass1_Sub3_Sub13_1.anInt2256 == 1 && (local289.anInt3600 & 0x7F) == 64 && (local289.anInt3606 & 0x7F) == 64) {
						for (local314 = 0; local314 < Static153.anInt3186; local314++) {
							local322 = Static177.aClass8_Sub3_Sub2Array1[Static103.anIntArray167[local314]];
							if (local322 != null && local322 != local289 && local322.aClass1_Sub3_Sub13_1.anInt2256 == 1 && local322.anInt3600 == local289.anInt3600 && local289.anInt3606 == local322.anInt3606) {
								Static103.method1562(local50, local322.aClass1_Sub3_Sub13_1, local64, Static103.anIntArray167[local314]);
							}
						}
						for (local155 = 0; local155 < Static35.anInt992; local155++) {
							local371 = Static47.aClass8_Sub3_Sub1Array1[Static111.anIntArray181[local155]];
							if (local371 != null && local289.anInt3600 == local371.anInt3600 && local289.anInt3606 == local371.anInt3606) {
								Static151.method2298(local64, local50, local371, Static111.anIntArray181[local155]);
							}
						}
					}
					Static103.method1562(local50, local289.aClass1_Sub3_Sub13_1, local64, local57);
				}
				if (local71 == 0) {
					@Pc(420) Class8_Sub3_Sub1 local420 = Static47.aClass8_Sub3_Sub1Array1[local57];
					if ((local420.anInt3600 & 0x7F) == 64 && (local420.anInt3606 & 0x7F) == 64) {
						for (local314 = 0; local314 < Static153.anInt3186; local314++) {
							local322 = Static177.aClass8_Sub3_Sub2Array1[Static103.anIntArray167[local314]];
							if (local322 != null && local322.aClass1_Sub3_Sub13_1.anInt2256 == 1 && local322.anInt3600 == local420.anInt3600 && local420.anInt3606 == local322.anInt3606) {
								Static103.method1562(local50, local322.aClass1_Sub3_Sub13_1, local64, Static103.anIntArray167[local314]);
							}
						}
						for (local155 = 0; local155 < Static35.anInt992; local155++) {
							local371 = Static47.aClass8_Sub3_Sub1Array1[Static111.anIntArray181[local155]];
							if (local371 != null && local371 != local420 && local371.anInt3600 == local420.anInt3600 && local371.anInt3606 == local420.anInt3606) {
								Static151.method2298(local64, local50, local371, Static111.anIntArray181[local155]);
							}
						}
					}
					Static151.method2298(local64, local50, local420, local57);
				}
				if (local71 == 3) {
					@Pc(544) Class20 local544 = Static210.aClass20ArrayArrayArray1[Static192.anInt4180][local50][local64];
					if (local544 != null) {
						for (@Pc(551) Class1_Sub3_Sub2 local551 = (Class1_Sub3_Sub2) local544.method477(); local551 != null; local551 = (Class1_Sub3_Sub2) local544.method473()) {
							local155 = local551.aClass8_Sub4_1.anInt1080;
							@Pc(561) Class1_Sub3_Sub22 local561 = Static102.method1549(local155);
							if (Static189.anInt4128 == 1) {
								Static116.method1722((long) local155, Static208.method787(new Class92[] { Static186.aClass92_1900, Static201.aClass92_2011, local561.aClass92_1846 }), local50, local64, (short) 20, Static140.aClass92_1352);
							} else if (!Static72.aBoolean100) {
								@Pc(609) Class92[] local609 = local561.aClass92Array25;
								if (Static103.aBoolean129) {
									local609 = Static72.method1107(local609);
								}
								for (@Pc(617) int local617 = 4; local617 >= 0; local617--) {
									if (local609 != null && local609[local617] != null) {
										@Pc(631) byte local631 = 0;
										if (local617 == 0) {
											local631 = 1;
										}
										if (local617 == 1) {
											local631 = 32;
										}
										if (local617 == 2) {
											local631 = 28;
										}
										if (local617 == 3) {
											local631 = 34;
										}
										if (local617 == 4) {
											local631 = 19;
										}
										Static116.method1722((long) local155, Static208.method787(new Class92[] { Static98.aClass92_936, local561.aClass92_1846 }), local50, local64, local631, local609[local617]);
									} else if (local617 == 2) {
										Static116.method1722((long) local155, Static208.method787(new Class92[] { Static98.aClass92_936, local561.aClass92_1846 }), local50, local64, (short) 28, Static107.aClass92_1033);
									}
								}
								Static116.method1722((long) local155, Static208.method787(new Class92[] { Static98.aClass92_936, local561.aClass92_1846 }), local50, local64, (short) 1002, Static19.aClass92_212);
							} else if ((Static19.anInt529 & 0x1) == 1) {
								Static116.method1722((long) local155, Static208.method787(new Class92[] { Static15.aClass92_135, Static201.aClass92_2011, local561.aClass92_1846 }), local50, local64, (short) 37, Static48.aClass92_516);
							}
						}
					}
				}
			}
		}
	}
}
