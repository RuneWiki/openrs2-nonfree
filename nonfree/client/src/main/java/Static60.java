import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "[[[Lclient!cq;")
	public static Class53[][][] aClass53ArrayArrayArray1;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!vk;")
	public static Class342 aClass342_1;

	@OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
	public static int anInt983;

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!vg;")
	public static final Class340 aClass340_1 = new Class340();

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_5 = new Class244();

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method1007(@OriginalArg(1) String[] arg0) {
		@Pc(13) String[] local13 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local13[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local13[local15] = local13[local15] + arg0[local15];
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method1008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 + arg5;
		@Pc(11) int local11 = arg3 + arg1;
		@Pc(16) int local16 = arg2 + arg4;
		if (!Static193.method3363(local11, local11, local16, arg5, local16, local11, arg5, arg2, local7)) {
			return false;
		} else if (Static193.method3363(local11, local11, arg2, arg5, local16, local11, local7, arg2, local7)) {
			if (Static358.anInt6975 <= arg5) {
				if (!Static193.method3363(local11, local11, arg2, local7, local16, arg1, local7, local16, local7)) {
					return false;
				}
				if (!Static193.method3363(local11, arg1, arg2, local7, arg2, arg1, local7, local16, local7)) {
					return false;
				}
			} else if (!Static193.method3363(local11, local11, arg2, arg5, local16, arg1, arg5, local16, arg5)) {
				return false;
			} else if (!Static193.method3363(local11, arg1, arg2, arg5, arg2, arg1, arg5, local16, arg5)) {
				return false;
			}
			if (Static237.anInt4283 > arg2) {
				if (!Static193.method3363(local11, local11, arg2, arg5, arg2, arg1, arg5, arg2, local7)) {
					return false;
				}
				if (!Static193.method3363(local11, arg1, arg2, arg5, arg2, arg1, local7, arg2, local7)) {
					return false;
				}
			} else if (!Static193.method3363(local11, local11, local16, arg5, local16, arg1, arg5, local16, local7)) {
				return false;
			} else if (!Static193.method3363(local11, arg1, local16, arg5, local16, arg1, local7, local16, local7)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
