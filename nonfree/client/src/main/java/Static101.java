import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1502 = Static118.method2249("wave:");

	@OriginalMember(owner = "client!ki", name = "q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1499 = aClass65_1502;

	@OriginalMember(owner = "client!ki", name = "t", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1500 = aClass65_1502;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
	public static int anInt2533 = 0;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "[I")
	public static final int[] anIntArray288 = new int[500];

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1501 = Static118.method2249("Hidden)2");

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "I")
	public static int anInt2537 = 0;

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
	public static int anInt2540 = -1;

	@OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
	public static int anInt2541 = 2;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)Z")
	public static boolean method1908(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!wa;Z)V")
	public static void method1910(@OriginalArg(0) Class1_Sub14 arg0) {
		if (Static39.aClass72_1 != null) {
			try {
				Static39.aClass72_1.method2633(0L);
				Static39.aClass72_1.method2625(24, arg0.anInt2306, arg0.aByteArray29);
			} catch (@Pc(24) Exception local24) {
			}
		}
		arg0.anInt2306 += 24;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method1911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class93 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class93(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static83.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static83.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub7(local14, arg1, arg2);
				}
			}
			Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass93_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class93(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static83.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static83.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub7(local14, arg1, arg2);
				}
			}
			Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass93_1 = local12;
		} else {
			@Pc(134) Class76 local134 = new Class76(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static83.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static83.aClass1_Sub7ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub7(local14, arg1, arg2);
				}
			}
			Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2].aClass76_1 = local134;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)I")
	public static int method1912(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(II)Z")
	public static boolean method1913(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return false;
		}
		@Pc(14) int local14 = Static162.aShortArray52[arg0];
		if (local14 >= 2000) {
			local14 -= 2000;
		}
		return local14 == 1003;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIII)V")
	public static void method1914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg4 - arg0 >= Static71.anInt1744 && arg0 + arg4 <= Static23.anInt685 && Static206.anInt4385 <= arg1 - arg0 && Static133.anInt3309 >= arg0 + arg1) {
			Static189.method3138(arg5, arg1, arg2, arg0, arg4, arg3);
		} else {
			Static165.method2850(arg1, arg5, arg0, arg3, arg2, arg4);
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z")
	public static boolean method1915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 >> arg1 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V")
	public static void method1916() {
		Static132.aClass97_11 = null;
		Static131.aByteArrayArrayArray84 = null;
		Static145.aByteArrayArrayArray90 = null;
		Static90.aByteArrayArrayArray117 = null;
		Static40.anIntArrayArrayArray1 = null;
		Static154.anIntArrayArrayArray6 = null;
		Static91.aByteArrayArrayArray55 = null;
		Static139.aByteArrayArrayArray89 = null;
		Static159.aByteArrayArrayArray96 = null;
		Static108.anInt2648 = 0;
		Static18.anIntArray48 = null;
		Static31.aClass91_1.method3147();
		Static182.aClass91_21.method3147();
		Static39.aClass1_Sub2_Sub5_Sub5_2 = null;
		Static204.aClass1_Sub2_Sub5_Sub5_9 = null;
		Static77.aClass1_Sub2_Sub5_Sub5_6 = null;
		Static20.aClass1_Sub2_Sub5_Sub5_1 = null;
		Static50.aClass1_Sub2_Sub5_Sub5_4 = null;
		Static60.aClass1_Sub2_Sub5_Sub5_5 = null;
		Static105.aClass1_Sub2_Sub5_Sub5_7 = null;
		Static133.aClass1_Sub2_Sub5_Sub5_8 = null;
	}
}
