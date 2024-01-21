import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!te", name = "b", descriptor = "I")
	public static int anInt2620;

	@OriginalMember(owner = "client!te", name = "f", descriptor = "Lclient!qd;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "Lclient!je;")
	private static Class40 aClass40_1425 = Static69.method1231("Attack");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "Lclient!je;")
	public static Class40 aClass40_1423 = aClass40_1425;

	@OriginalMember(owner = "client!te", name = "c", descriptor = "I")
	public static int anInt2621 = 0;

	@OriginalMember(owner = "client!te", name = "d", descriptor = "Lclient!je;")
	public static Class40 aClass40_1424 = Static69.method1231(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!te", name = "m", descriptor = "Lclient!je;")
	private static Class40 aClass40_1430 = Static69.method1231("Login limit exceeded)3");

	@OriginalMember(owner = "client!te", name = "i", descriptor = "Lclient!je;")
	public static Class40 aClass40_1426 = aClass40_1430;

	@OriginalMember(owner = "client!te", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_1427 = Static69.method1231("rect_debug=");

	@OriginalMember(owner = "client!te", name = "k", descriptor = "Lclient!je;")
	public static Class40 aClass40_1428 = Static69.method1231("(Z");

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!je;")
	public static Class40 aClass40_1429 = Static69.method1231(")4l");

	@OriginalMember(owner = "client!te", name = "o", descriptor = "I")
	public static int anInt2625 = 0;

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!je;")
	public static Class40 aClass40_1431 = Static69.method1231("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BILclient!fd;I)Lclient!qb;")
	public static Class2_Sub1_Sub2_Sub4 method1891(@OriginalArg(1) int arg0, @OriginalArg(2) Class24 arg1, @OriginalArg(3) int arg2) {
		return Static125.method2076(arg1, arg0, arg2) ? Static116.method1941() : null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
	public static void method1892() {
		aClass40_1429 = null;
		aClass40_1423 = null;
		aClass40_1427 = null;
		aClass61_1 = null;
		aClass40_1430 = null;
		aClass40_1425 = null;
		aClass40_1424 = null;
		aClass40_1428 = null;
		aClass40_1426 = null;
		aClass40_1431 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 1 || arg4 < 1 || arg0 > 102 || arg4 > 102) {
			return;
		}
		if (Static34.aBoolean60 && Static105.anInt2531 != arg3) {
			return;
		}
		@Pc(29) int local29 = 0;
		if (arg6 == 0) {
			local29 = Static111.aClass30_1.method755(arg3, arg0, arg4);
		}
		if (arg6 == 1) {
			local29 = Static111.aClass30_1.method769(arg3, arg0, arg4);
		}
		if (arg6 == 2) {
			local29 = Static111.aClass30_1.method774(arg3, arg0, arg4);
		}
		if (arg6 == 3) {
			local29 = Static111.aClass30_1.method760(arg3, arg0, arg4);
		}
		@Pc(89) int local89;
		if (local29 != 0) {
			@Pc(82) int local82 = local29 >> 14 & 0x7FFF;
			local89 = Static111.aClass30_1.method779(arg3, arg0, arg4, local29);
			@Pc(93) int local93 = local89 & 0x1F;
			@Pc(99) int local99 = local89 >> 6 & 0x3;
			@Pc(110) Class2_Sub1_Sub4 local110;
			if (arg6 == 0) {
				Static111.aClass30_1.method776(arg3, arg0, arg4);
				local110 = Static107.method1839(local82);
				if (local110.anInt1048 != 0) {
					Static70.aClass20Array1[arg3].method431(local93, arg4, local99, arg0, local110.aBoolean73);
				}
			}
			if (arg6 == 1) {
				Static111.aClass30_1.method736(arg3, arg0, arg4);
			}
			if (arg6 == 2) {
				Static111.aClass30_1.method770(arg3, arg0, arg4);
				local110 = Static107.method1839(local82);
				if (local110.anInt1036 + arg0 > 103 || arg4 + local110.anInt1036 > 103 || arg0 + local110.anInt1066 > 103 || local110.anInt1066 + arg4 > 103) {
					return;
				}
				if (local110.anInt1048 != 0) {
					Static70.aClass20Array1[arg3].method433(local110.anInt1066, arg0, local99, arg4, local110.anInt1036, local110.aBoolean73);
				}
			}
			if (arg6 == 3) {
				Static111.aClass30_1.method767(arg3, arg0, arg4);
				local110 = Static107.method1839(local82);
				if (local110.anInt1048 == 1) {
					Static70.aClass20Array1[arg3].method444(arg4, arg0);
				}
			}
		}
		if (arg1 < 0) {
			return;
		}
		local89 = arg3;
		if (arg3 < 3 && (Static66.aByteArrayArrayArray10[1][arg0][arg4] & 0x2) == 2) {
			local89 = arg3 + 1;
		}
		Static40.method721(arg4, arg2, arg1, arg5, local89, arg3, Static70.aClass20Array1[arg3], Static111.aClass30_1, arg0);
		return;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ZII)I")
	public static int method1894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class2_Sub20 local10 = (Class2_Sub20) Static63.aClass77_5.method2034((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray265.length > arg0) {
			return local10.anIntArray265[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(II)Z")
	public static boolean method1895(@OriginalArg(1) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZLclient!kc;)I")
	public static int method1896(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg1.anIntArrayArray15 == null || arg0 >= arg1.anIntArrayArray15.length) {
			return -2;
		}
		try {
			@Pc(24) int[] local24 = arg1.anIntArrayArray15[arg0];
			@Pc(26) int local26 = 0;
			@Pc(35) int local35 = 0;
			@Pc(37) byte local37 = 0;
			while (true) {
				@Pc(39) int local39 = 0;
				@Pc(41) byte local41 = 0;
				@Pc(46) int local46 = local24[local26++];
				if (local46 == 0) {
					return local35;
				}
				if (local46 == 1) {
					local39 = Static112.anIntArray297[local24[local26++]];
				}
				if (local46 == 2) {
					local39 = Static40.anIntArray109[local24[local26++]];
				}
				if (local46 == 3) {
					local39 = Static111.anIntArray294[local24[local26++]];
				}
				if (local46 == 15) {
					local41 = 1;
				}
				if (local46 == 16) {
					local41 = 2;
				}
				@Pc(107) int local107;
				@Pc(118) Class2_Sub13 local118;
				@Pc(123) int local123;
				@Pc(135) int local135;
				if (local46 == 4) {
					local107 = local24[local26++] << 16;
					@Pc(114) int local114 = local107 + local24[local26++];
					local118 = Static55.method972(local114);
					local123 = local24[local26++];
					if (local123 != -1 && (!Static102.method1800(local123).aBoolean171 || Static92.aBoolean184)) {
						for (local135 = 0; local135 < local118.anIntArray161.length; local135++) {
							if (local118.anIntArray161[local135] == local123 + 1) {
								local39 += local118.anIntArray154[local135];
							}
						}
					}
				}
				if (local46 == 5) {
					local39 = Static35.anIntArray96[local24[local26++]];
				}
				if (local46 == 17) {
					local41 = 3;
				}
				if (local46 == 6) {
					local39 = Class2_Sub10.anIntArray132[Static40.anIntArray109[local24[local26++]] - 1];
				}
				if (local46 == 7) {
					local39 = Static35.anIntArray96[local24[local26++]] * 100 / 46875;
				}
				if (local46 == 8) {
					local39 = Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1827;
				}
				if (local46 == 9) {
					for (local107 = 0; local107 < 25; local107++) {
						if (Static86.aBooleanArray26[local107]) {
							local39 += Static40.anIntArray109[local107];
						}
					}
				}
				if (local46 == 10) {
					local107 = local24[local26++] << 16;
					local107 += local24[local26++];
					local118 = Static55.method972(local107);
					local123 = local24[local26++];
					if (local123 != -1 && (!Static102.method1800(local123).aBoolean171 || Static92.aBoolean184)) {
						for (local135 = 0; local135 < local118.anIntArray161.length; local135++) {
							if (local118.anIntArray161[local135] == local123 + 1) {
								local39 = 999999999;
								break;
							}
						}
					}
				}
				if (local46 == 11) {
					local39 = Static54.anInt1414;
				}
				if (local46 == 12) {
					local39 = Static1.anInt12;
				}
				if (local46 == 13) {
					local107 = Static35.anIntArray96[local24[local26++]];
					@Pc(340) int local340 = local24[local26++];
					local39 = (0x1 << local340 & local107) == 0 ? 0 : 1;
				}
				if (local46 == 14) {
					local107 = local24[local26++];
					local39 = Static49.method881(local107);
				}
				if (local46 == 18) {
					local39 = (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1788 >> 7) + Static107.anInt2546;
				}
				if (local46 == 19) {
					local39 = (Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anInt1792 >> 7) + Static29.anInt720;
				}
				if (local46 == 20) {
					local39 = local24[local26++];
				}
				if (local41 == 0) {
					if (local37 == 0) {
						local35 += local39;
					}
					if (local37 == 1) {
						local35 -= local39;
					}
					if (local37 == 2 && local39 != 0) {
						local35 /= local39;
					}
					if (local37 == 3) {
						local35 *= local39;
					}
					local37 = 0;
				} else {
					local37 = local41;
				}
			}
		} catch (@Pc(444) Exception local444) {
			return -1;
		}
	}
}
