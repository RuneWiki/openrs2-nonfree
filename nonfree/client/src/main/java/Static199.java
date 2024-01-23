import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "[I")
	public static int[] anIntArray465;

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
	public static int anInt4467;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "Lclient!q;")
	public static Class80 aClass80_15;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Lclient!i;")
	public static Class41 aClass41_1186 = null;

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "Lclient!i;")
	private static Class41 aClass41_1187 = Static184.method2923("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "Lclient!i;")
	public static Class41 aClass41_1188 = Static184.method2923("blinken2:");

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "[Lclient!rf;")
	public static Class12_Sub3_Sub2[] aClass12_Sub3_Sub2Array1 = new Class12_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!ug", name = "h", descriptor = "Lclient!i;")
	public static Class41 aClass41_1189 = Static184.method2923("leuchten2:");

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray23 = new boolean[100];

	@OriginalMember(owner = "client!ug", name = "m", descriptor = "Lclient!i;")
	public static Class41 aClass41_1190 = aClass41_1187;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
	public static int anInt4469 = 0;

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray39 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!q;)Lclient!q;")
	public static Class80 method3100(@OriginalArg(1) Class80 arg0) {
		@Pc(19) Class80 local19 = Static76.method586(arg0);
		if (local19 == null) {
			local19 = arg0.aClass80_12;
		}
		return local19;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!lf;IIII)V")
	public static void method3101(@OriginalArg(0) Class2_Sub2_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static179.anInt4150 >= 400) {
			return;
		}
		if (arg0.anIntArray294 != null) {
			arg0 = arg0.method1902();
		}
		if (arg0 == null || !arg0.aBoolean144) {
			return;
		}
		@Pc(28) Class41 local28 = arg0.aClass41_773;
		if (arg0.anInt2665 != 0) {
			local28 = Static149.method2324(new Class41[] { local28, Static151.method2360(arg0.anInt2665, Static213.aClass12_Sub3_Sub1_1.anInt1203), Static61.aClass41_478, Static130.aClass41_1037, Static152.method2471(arg0.anInt2665), Static91.aClass41_666 });
		}
		if (Static26.anInt665 == 1) {
			Static85.method1530(arg3, Static33.aClass41_232, (short) 48, (long) arg1, Static149.method2324(new Class41[] { Static68.aClass41_561, Static119.aClass41_813, local28 }), arg2);
		} else if (!Static9.aBoolean16) {
			@Pc(151) Class41[] local151 = arg0.aClass41Array36;
			if (Static86.aBoolean115) {
				local151 = Static123.method799(local151);
			}
			@Pc(161) int local161;
			if (local151 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local151[local161] != null && (Static43.anInt1295 != 0 || !local151[local161].method1413(Static143.aClass41_904))) {
						@Pc(185) byte local185 = 0;
						if (local161 == 0) {
							local185 = 17;
						}
						if (local161 == 1) {
							local185 = 38;
						}
						if (local161 == 2) {
							local185 = 34;
						}
						if (local161 == 3) {
							local185 = 32;
						}
						if (local161 == 4) {
							local185 = 4;
						}
						Static85.method1530(arg3, local151[local161], local185, (long) arg1, Static149.method2324(new Class41[] { Static7.aClass41_61, local28 }), arg2);
					}
				}
			}
			if (Static43.anInt1295 == 0 && local151 != null) {
				for (local161 = 4; local161 >= 0; local161--) {
					if (local151[local161] != null && local151[local161].method1413(Static143.aClass41_904)) {
						@Pc(274) short local274 = 0;
						if (arg0.anInt2665 > Static213.aClass12_Sub3_Sub1_1.anInt1203) {
							local274 = 2000;
						}
						@Pc(283) short local283 = 0;
						if (local161 == 0) {
							local283 = 17;
						}
						if (local161 == 1) {
							local283 = 38;
						}
						if (local161 == 2) {
							local283 = 34;
						}
						if (local161 == 3) {
							local283 = 32;
						}
						if (local161 == 4) {
							local283 = 4;
						}
						if (local283 != 0) {
							local283 += local274;
						}
						Static85.method1530(arg3, local151[local161], local283, (long) arg1, Static149.method2324(new Class41[] { Static7.aClass41_61, local28 }), arg2);
					}
				}
			}
			Static85.method1530(arg3, Static58.aClass41_469, (short) 1002, (long) arg1, Static149.method2324(new Class41[] { Static7.aClass41_61, local28 }), arg2);
		} else if ((Static101.anInt2453 & 0x2) == 2) {
			Static85.method1530(arg3, Static177.aClass41_1092, (short) 19, (long) arg1, Static149.method2324(new Class41[] { Static26.aClass41_174, Static119.aClass41_813, local28 }), arg2);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIIBII)V")
	public static void method3102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg2) {
			Static31.method603(arg2, arg5, arg4, arg6, arg0, arg3);
		} else if (arg3 - arg2 >= Static60.anInt4779 && arg2 + arg3 <= Static11.anInt385 && Static45.anInt1337 <= arg6 - arg1 && Static17.anInt457 >= arg1 + arg6) {
			Static21.method3210(arg3, arg0, arg1, arg5, arg4, arg6, arg2);
		} else {
			Static139.method2207(arg6, arg4, arg2, arg5, arg0, arg1, arg3);
		}
	}
}
