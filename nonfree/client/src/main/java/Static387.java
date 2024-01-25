import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "[S")
	public static final short[] aShortArray88 = new short[] { 58, 50, 22, 21, 23, 8, 18, 60 };

	@OriginalMember(owner = "client!nt", name = "p", descriptor = "[I")
	public static final int[] anIntArray446 = new int[1000];

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method5174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg1 + arg2;
		@Pc(11) int local11 = arg3 + arg5;
		@Pc(16) int local16 = arg0 + arg4;
		if (!Static260.method3556(arg2, arg2, local16, local11, local16, local11, local7, arg0, local11)) {
			return false;
		} else if (Static260.method3556(local7, arg2, arg0, local11, local16, local11, local7, arg0, local11)) {
			if (arg2 < Static23.anInt553) {
				if (!Static260.method3556(arg2, arg2, arg0, local11, local16, arg5, arg2, local16, local11)) {
					return false;
				}
				if (!Static260.method3556(arg2, arg2, arg0, arg5, arg0, arg5, arg2, local16, local11)) {
					return false;
				}
			} else if (!Static260.method3556(local7, local7, arg0, local11, local16, arg5, local7, local16, local11)) {
				return false;
			} else if (!Static260.method3556(local7, local7, arg0, arg5, arg0, arg5, local7, local16, local11)) {
				return false;
			}
			if (Static516.anInt6572 <= arg0) {
				if (!Static260.method3556(arg2, arg2, local16, local11, local16, arg5, local7, local16, local11)) {
					return false;
				}
				if (!Static260.method3556(local7, arg2, local16, arg5, local16, arg5, local7, local16, local11)) {
					return false;
				}
			} else if (!Static260.method3556(arg2, arg2, arg0, local11, arg0, arg5, local7, arg0, local11)) {
				return false;
			} else if (!Static260.method3556(local7, arg2, arg0, arg5, arg0, arg5, local7, arg0, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(II[BIII)V")
	public static void method5183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(20) int local20 = arg3 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local20--;
			if (local20 < 0) {
				local20 = arg3 - arg0 & 0x3;
				while (true) {
					local20--;
					if (local20 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(29) int local29 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg1 = local39 + 1;
			arg2[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "(III)Lclient!su;")
	public static Class325 method5191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass325_1;
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IILclient!paa;)I")
	public static int method5193(@OriginalArg(0) int arg0, @OriginalArg(2) Class261 arg1) {
		if (!Static76.method1071(arg1).method6882(arg0) && arg1.anObjectArray4 == null) {
			return -1;
		} else if (arg1.anIntArray491 == null || arg1.anIntArray491.length <= arg0) {
			return -1;
		} else {
			return arg1.anIntArray491[arg0];
		}
	}
}
