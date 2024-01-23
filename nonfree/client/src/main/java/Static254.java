import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!w", name = "P", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!w", name = "U", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!w", name = "X", descriptor = "Lclient!wl;")
	public static Class151 aClass151_2;

	@OriginalMember(owner = "client!w", name = "Q", descriptor = "[[I")
	public static int[][] anIntArrayArray39 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!hc;ZBLclient!hc;)V")
	public static void method4103(@OriginalArg(0) Class51 arg0, @OriginalArg(3) Class51 arg1) {
		Static256.aBoolean277 = true;
		Static60.aClass51_22 = arg1;
		Static29.aClass51_11 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIZ)V")
	public static void method4104(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Static92.aClass7Array4[0].method1521(arg0, arg2);
		@Pc(17) int local17 = (arg4 - 32) * arg4 / arg1;
		if (local17 < 8) {
			local17 = 8;
		}
		Static92.aClass7Array4[1].method1521(arg0, arg2 + arg4 - 16);
		@Pc(46) int local46 = (arg4 - local17 - 32) * arg3 / (arg1 - arg4);
		Static189.method3193(arg0, arg2 + 16, 16, arg4 - 32, Static75.anInt2040);
		Static189.method3193(arg0, local46 + arg2 + 16, 16, local17, Static80.anInt2174);
		Static189.method3180(arg0, arg2 + local46 + 16, local17, Static194.anInt4331);
		Static189.method3180(arg0 + 1, arg2 + 16 + local46, local17, Static194.anInt4331);
		Static189.method3188(arg0, arg2 + local46 + 16, 16, Static194.anInt4331);
		Static189.method3188(arg0, arg2 + local46 + 17, 16, Static194.anInt4331);
		Static189.method3180(arg0 + 15, arg2 + 16 + local46, local17, Static176.anInt4047);
		Static189.method3180(arg0 + 14, local46 + 17 + arg2, local17 - 1, Static176.anInt4047);
		Static189.method3188(arg0, local17 + local46 + arg2 + 15, 16, Static176.anInt4047);
		Static189.method3188(arg0 + 1, local46 + arg2 + 14 + local17, 15, Static176.anInt4047);
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)I")
	public static int method4105() {
		if (Static178.aBoolean200) {
			return 0;
		} else if (Static25.method507()) {
			return Static3.aBoolean3 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method4106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class36 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class36(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static142.aClass1_Sub16ArrayArrayArray4[local14][arg1][arg2] == null) {
					Static142.aClass1_Sub16ArrayArrayArray4[local14][arg1][arg2] = new Class1_Sub16(local14, arg1, arg2);
				}
			}
			Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2].aClass36_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class36(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static142.aClass1_Sub16ArrayArrayArray4[local14][arg1][arg2] == null) {
					Static142.aClass1_Sub16ArrayArrayArray4[local14][arg1][arg2] = new Class1_Sub16(local14, arg1, arg2);
				}
			}
			Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2].aClass36_1 = local12;
		} else {
			@Pc(134) Class113 local134 = new Class113(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static142.aClass1_Sub16ArrayArrayArray4[local14][arg1][arg2] == null) {
					Static142.aClass1_Sub16ArrayArrayArray4[local14][arg1][arg2] = new Class1_Sub16(local14, arg1, arg2);
				}
			}
			Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2].aClass113_1 = local134;
		}
	}
}
