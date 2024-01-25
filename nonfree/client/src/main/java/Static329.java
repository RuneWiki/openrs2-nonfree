import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "[Lclient!j;")
	public static Class101[] aClass101Array2;

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "[I")
	public static final int[] anIntArray335 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
	public static int anInt3942 = 0;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!tj;I)V")
	public static void method3590(@OriginalArg(0) Class193 arg0) {
		Static322.aClass193_37 = arg0;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIBZ)Lclient!ks;")
	public static Class4_Sub25 method3593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		@Pc(7) Class4_Sub25 local7 = new Class4_Sub25();
		local7.anInt3695 = arg1;
		local7.anInt3697 = arg2;
		Static270.aClass43_29.method1276(local7, (long) arg0);
		Static355.method5669(arg1);
		@Pc(31) Class21 local31 = Static92.method534(arg0);
		if (local31 != null) {
			Static349.method5536(local31);
		}
		if (Static16.aClass21_1 != null) {
			Static349.method5536(Static16.aClass21_1);
			Static16.aClass21_1 = null;
		}
		Static193.method3860();
		if (local31 != null) {
			Static150.method3012(local31, !arg3);
		}
		if (!arg3) {
			Static164.method3191(arg1);
		}
		if (!arg3 && Static357.anInt6821 != -1) {
			Static318.method5242(1, Static357.anInt6821);
		}
		return local7;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method3596(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static180.anIntArrayArrayArray21[arg0][local16][local20] == -Static218.anInt4453) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(142) int local142 = (arg3 << 7) + 2;
			@Pc(151) int local151 = Static261.aClass60Array2[arg0].method2264(arg1, arg3) + arg5;
			if (!Static218.method3955(local20, local151, local142)) {
				return false;
			}
			@Pc(164) int local164 = (arg2 << 7) - 1;
			if (!Static218.method3955(local164, local151, local142)) {
				return false;
			}
			@Pc(177) int local177 = (arg4 << 7) - 1;
			if (!Static218.method3955(local20, local151, local177)) {
				return false;
			} else if (Static218.method3955(local164, local151, local177)) {
				return true;
			} else {
				return false;
			}
		} else if (Static143.method2962(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static218.method3955(local16 + 1, Static261.aClass60Array2[arg0].method2264(arg1, arg3) + arg5, local20 + 1) && Static218.method3955(local16 + 128 - 1, Static261.aClass60Array2[arg0].method2264(arg1 + 1, arg3) + arg5, local20 + 1) && Static218.method3955(local16 + 128 - 1, Static261.aClass60Array2[arg0].method2264(arg1 + 1, arg3 + 1) + arg5, local20 + 128 - 1) && Static218.method3955(local16 + 1, Static261.aClass60Array2[arg0].method2264(arg1, arg3 + 1) + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIII)V")
	public static void method3597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static5.anInt2965 <= arg3 - arg4 && arg4 + arg3 <= Static220.anInt6565 && Static349.anInt6619 <= arg2 - arg4 && arg2 + arg4 <= Static195.anInt4097) {
			Static16.method291(arg2, arg0, arg3, arg5, arg1, arg4);
		} else {
			Static42.method834(arg2, arg5, arg1, arg0, arg4, arg3);
		}
	}
}
