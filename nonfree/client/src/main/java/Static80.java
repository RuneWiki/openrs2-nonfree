import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!em", name = "q", descriptor = "[Lclient!kr;")
	public static Class46[] aClass46Array12;

	@OriginalMember(owner = "client!em", name = "u", descriptor = "Lclient!iq;")
	public static Class104 aClass104_54;

	@OriginalMember(owner = "client!em", name = "y", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!em", name = "n", descriptor = "[I")
	public static final int[] anIntArray125 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!em", name = "o", descriptor = "Lclient!fh;")
	public static Class68 aClass68_8 = null;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Z")
	public static boolean method1627(@OriginalArg(0) int arg0) {
		return arg0 == 60 || arg0 == 9 || arg0 == 1006 || arg0 == 25 || arg0 == 21;
	}

	@OriginalMember(owner = "client!em", name = "c", descriptor = "(B)V")
	public static void method1628() {
		if (Static231.aBoolean433 && Static166.aClass25_1.method398(81) && Static225.anInt4918 > 2) {
			Static140.method2719((Class2_Sub31) Static103.aClass180_24.aClass2_207.aClass2_252.aClass2_252);
		} else {
			Static140.method2719((Class2_Sub31) Static103.aClass180_24.aClass2_207.aClass2_252);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ZLclient!je;B)V")
	public static void method1629(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2_Sub3_Sub1 arg1) {
		if (Static225.anInt4918 >= 400 || arg1 == Static177.aClass1_Sub2_Sub3_Sub1_1) {
			return;
		}
		@Pc(145) String local145;
		@Pc(77) int local77;
		if (arg1.anInt3408 == 0) {
			@Pc(32) boolean local32 = true;
			if (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3411 != -1 && arg1.anInt3411 != -1) {
				@Pc(51) int local51 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3388 <= arg1.anInt3388 ? arg1.anInt3388 : Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3388;
				@Pc(66) int local66 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3411 < arg1.anInt3411 ? Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3411 : arg1.anInt3411;
				local77 = local66 + local51 * 10 / 100 + 5;
				@Pc(84) int local84 = Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3388 - arg1.anInt3388;
				if (local84 < 0) {
					local84 = -local84;
				}
				if (local84 > local77) {
					local32 = false;
				}
			}
			@Pc(110) String local110 = Static13.aClass172_1 == Static150.aClass172_3 ? Static166.aClass140_90.method4155(Static239.anInt2803) : Static171.aClass140_92.method4155(Static239.anInt2803);
			if (arg1.anInt3396 <= arg1.anInt3388) {
				local145 = arg1.method2966() + (local32 ? Static334.method5450(Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3388, arg1.anInt3388) : "<col=ffffff>") + " (" + local110 + arg1.anInt3388 + ")";
			} else {
				local145 = arg1.method2966() + (local32 ? Static334.method5450(Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3388, arg1.anInt3388) : "<col=ffffff>") + " (" + local110 + arg1.anInt3388 + "+" + (arg1.anInt3396 - arg1.anInt3388) + ")";
			}
		} else {
			local145 = arg1.method2966() + " (" + Static354.aClass140_161.method4155(Static239.anInt2803) + arg1.anInt3408 + ")";
		}
		if (Static60.aBoolean109) {
			if (!arg0 && (Static7.anInt142 & 0x8) != 0) {
				Static104.method2071(0, 19, 0, false, Static295.aString63, Static228.aString46 + " -> <col=ffffff>" + local145, Static333.anInt6459, (long) arg1.anInt6896, true);
			}
		} else if (arg0) {
			Static104.method2071(0, 0, 0, true, "<col=cccccc>" + local145, "", -1, 0L, false);
		} else {
			for (@Pc(235) int local235 = 7; local235 >= 0; local235--) {
				if (Static153.aStringArray21[local235] != null) {
					@Pc(243) short local243 = 0;
					if (Static30.aClass172_2 == Static13.aClass172_1 && Static153.aStringArray21[local235].equalsIgnoreCase(Static243.aClass140_122.method4155(Static239.anInt2803))) {
						if (arg1.anInt3388 > Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3388) {
							local243 = 2000;
						}
						if (Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3401 != 0 && arg1.anInt3401 != 0) {
							if (arg1.anInt3401 == Static177.aClass1_Sub2_Sub3_Sub1_1.anInt3401) {
								local243 = 2000;
							} else {
								local243 = 0;
							}
						}
					} else if (Static304.aBooleanArray27[local235]) {
						local243 = 2000;
					}
					@Pc(302) short local302 = (short) (Static233.aShortArray91[local235] + local243);
					local77 = Static215.anIntArray348[local235] == -1 ? Static189.anInt4126 : Static215.anIntArray348[local235];
					Static104.method2071(0, local302, 0, false, Static153.aStringArray21[local235], "<col=ffffff>" + local145, local77, (long) arg1.anInt6896, true);
				}
			}
		}
		if (arg0) {
			return;
		}
		for (@Pc(385) Class2_Sub31 local385 = (Class2_Sub31) Static103.aClass180_24.method4919(); local385 != null; local385 = (Class2_Sub31) Static103.aClass180_24.method4916()) {
			if (local385.anInt5368 == 20) {
				local385.aString51 = "<col=ffffff>" + local145;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 >= Static108.anInt2266 && arg0 <= Static205.anInt4504 && Static197.anInt4298 <= arg3 && Static38.anInt553 >= arg4) {
			Static226.method4192(arg3, arg4, arg1, arg5, arg2, arg6, arg0);
		} else {
			Static184.method3493(arg5, arg6, arg4, arg1, arg2, arg0, arg3);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II[I[Ljava/lang/Object;I)V")
	public static void method1631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg0) / 2;
		@Pc(12) int local12 = arg0;
		@Pc(16) int local16 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local30;
		for (@Pc(42) int local42 = arg0; local42 < arg1; local42++) {
			if (arg2[local42] < local16 + (local42 & 0x1)) {
				@Pc(57) int local57 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12] = local57;
				@Pc(71) Object local71 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12++] = local71;
			}
		}
		arg2[arg1] = arg2[local12];
		arg2[local12] = local16;
		arg3[arg1] = arg3[local12];
		arg3[local12] = local30;
		method1631(arg0, local12 - 1, arg2, arg3);
		method1631(local12 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!em", name = "b", descriptor = "(II)I")
	public static int method1632(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
