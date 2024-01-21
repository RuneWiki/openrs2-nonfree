import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cd", name = "ob", descriptor = "I")
	public static int anInt464;

	@OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
	public static int anInt456 = 0;

	@OriginalMember(owner = "client!cd", name = "kb", descriptor = "Z")
	public static final boolean aBoolean32 = false;

	@OriginalMember(owner = "client!cd", name = "lb", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray4 = new int[4][105][105];

	@OriginalMember(owner = "client!cd", name = "rb", descriptor = "[I")
	public static final int[] anIntArray33 = new int[128];

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)Z")
	public static boolean method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static137.method1962(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static210.anIntArrayArrayArray12[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static116.anInt3348) {
					if (!Static116.method2444(local10, local24, local14)) {
						return false;
					}
					if (!Static116.method2444(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static116.method2444(local10, local28, local14)) {
						return false;
					}
					if (!Static116.method2444(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static116.method2444(local10, local32, local14)) {
					return false;
				}
				if (!Static116.method2444(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static146.anInt3006) {
					if (!Static116.method2444(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static116.method2444(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static116.method2444(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static116.method2444(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static116.method2444(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static116.method2444(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static116.anInt3348) {
					if (!Static116.method2444(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static116.method2444(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static116.method2444(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static116.method2444(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static116.method2444(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static116.method2444(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static146.anInt3006) {
					if (!Static116.method2444(local10, local24, local14)) {
						return false;
					}
					if (!Static116.method2444(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static116.method2444(local10, local28, local14)) {
						return false;
					}
					if (!Static116.method2444(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static116.method2444(local10, local32, local14)) {
					return false;
				}
				if (!Static116.method2444(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static116.method2444(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static116.method2444(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static116.method2444(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static116.method2444(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static116.method2444(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V")
	public static void method392() {
		if (!Static134.aBoolean131) {
			Static136.aClass70Array48[0] = Static13.aClass70_135;
			Static49.aClass70Array21[0] = Static61.aClass70_596;
			Static35.anInt770 = 1;
			Static55.aShortArray13[0] = 1005;
		}
		if (Static63.anInt1331 != -1) {
			Static195.method3038(Static63.anInt1331);
		}
		for (@Pc(39) int local39 = 0; local39 < Static127.anInt2495; local39++) {
			if (Static165.aBooleanArray14[local39]) {
				Static70.aBooleanArray3[local39] = true;
			}
			Static38.aBooleanArray2[local39] = Static165.aBooleanArray14[local39];
			Static165.aBooleanArray14[local39] = false;
		}
		Static81.anInt1617 = -1;
		Static57.aClass6_34 = null;
		Static185.anInt3775 = -1;
		Static40.anInt869 = Static184.anInt3760;
		if (Static63.anInt1331 != -1) {
			Static127.anInt2495 = 0;
			Static113.method1643(Static203.anInt4148, 0, Static63.anInt1331, 0, -1, 0, 0, Static41.anInt876);
		}
		Static104.method3091();
		Static179.method961();
		if (Static134.aBoolean131) {
			Static127.method1771();
		} else if (Static81.anInt1617 != -1) {
			Static205.method3237(Static81.anInt1617, Static185.anInt3775);
		}
		if (Static116.anInt3351 == 3) {
			for (@Pc(109) int local109 = 0; local109 < Static127.anInt2495; local109++) {
				if (Static38.aBooleanArray2[local109]) {
					Static104.method3087(Static35.anIntArray38[local109], Static59.anIntArray136[local109], Static150.anIntArray225[local109], Static175.anIntArray292[local109], 16711935, 128);
				} else if (Static70.aBooleanArray3[local109]) {
					Static104.method3087(Static35.anIntArray38[local109], Static59.anIntArray136[local109], Static150.anIntArray225[local109], Static175.anIntArray292[local109], 16711680, 128);
				}
			}
		}
		Static165.method2462(Static144.aClass26_Sub2_Sub1_1.anInt2593, Static137.anInt2795, Static144.aClass26_Sub2_Sub1_1.anInt2611, Static211.anInt4246);
		Static211.anInt4246 = 0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lclient!ke;I)V")
	public static void method393(@OriginalArg(0) Class52 arg0) {
		Static12.aClass52_2 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IBIII)V")
	public static void method396(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static114.anInt2300 < 100) {
			Static37.method2336();
		}
		Static104.method3092(arg1, arg2, arg0 + arg1, arg2 + arg3);
		Static177.method2768();
		Static104.method3079(arg1, arg2, arg0, arg3, 0);
		@Pc(40) int local40;
		@Pc(51) int local51;
		if (Static114.anInt2300 < 100) {
			local40 = arg1 + arg0 / 2;
			local51 = arg2 + arg3 / 2 - 38;
			Static104.method3097(local40 - 152, local51, 304, 34, 9179409);
			Static104.method3097(local40 - 151, local51 - -1, 302, 32, 0);
			Static104.method3079(local40 - 150, local51 + 2, Static114.anInt2300 * 3, 30, 9179409);
			Static104.method3079(local40 + Static114.anInt2300 * 3 - 150, local51 + 2, 300 - Static114.anInt2300 * 3, 30, 0);
			Static153.aClass3_Sub3_Sub2_Sub4_Sub1_6.method3121(Static163.aClass70_1596, local40, local51 + 20, 16777215, -1);
			return;
		}
		Static85.anInt1691 = (int) ((double) (arg3 * 2) / Static87.aDouble115);
		Static136.anInt2772 = Static1.anInt1794 - (int) ((double) arg3 / Static87.aDouble115);
		Static15.anInt342 = Static156.anInt3196 - (int) ((double) arg0 / Static87.aDouble115);
		Static199.anInt4051 = (int) ((double) (arg0 * 2) / Static87.aDouble115);
		local40 = Static1.anInt1794 - (int) ((double) arg3 / Static87.aDouble115);
		@Pc(162) int local162 = Static156.anInt3196 - (int) ((double) arg0 / Static87.aDouble115);
		@Pc(171) int local171 = Static1.anInt1794 + (int) ((double) arg3 / Static87.aDouble115);
		local51 = Static156.anInt3196 + (int) ((double) arg0 / Static87.aDouble115);
		Static181.method2817(local171, local51, local162, arg0 + arg1, arg3 + arg2, local40, arg2, arg1);
		Static176.method2727(arg2 + arg3, arg2, arg1, local51, local171, arg0 + arg1, local162, local40);
		if (Static90.anInt1789 > 0) {
			Static90.anInt1789--;
		}
		if (!Static165.aBoolean151) {
			return;
		}
		@Pc(222) int local222 = arg1 + arg0 - 5;
		@Pc(229) int local229 = arg2 + arg3 - 8;
		@Pc(231) int local231 = 16776960;
		Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4.method3113(Static207.method3296(new Class70[] { Static116.aClass70_1599, Static107.method2404(Static28.anInt581) }), local222, local229, 16776960, -1);
		@Pc(254) int local254 = local229 - 15;
		@Pc(256) Runtime local256 = Runtime.getRuntime();
		@Pc(265) int local265 = (int) ((local256.totalMemory() - local256.freeMemory()) / 1024L);
		if (local265 > 32768 && Static50.aBoolean66) {
			local231 = 16711680;
		}
		if (local265 > 65536 && !Static50.aBoolean66) {
			local231 = 16711680;
		}
		Static83.aClass3_Sub3_Sub2_Sub4_Sub1_4.method3113(Static207.method3296(new Class70[] { Static209.aClass70_2090, Static107.method2404(local265), Static6.aClass70_84 }), local222, local254, local231, -1);
		local229 = local254 - 15;
	}
}
