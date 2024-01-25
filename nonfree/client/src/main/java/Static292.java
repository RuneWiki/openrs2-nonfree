import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static292 {

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "[[[Lclient!bt;")
	public static Class39[][][] aClass39ArrayArrayArray2;

	@OriginalMember(owner = "client!ld", name = "H", descriptor = "Lclient!tf;")
	public static final Class316 aClass316_8 = new Class316(12, 19);

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "Lclient!eca;")
	public static final Class82 aClass82_4 = new Class82();

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "Z")
	public static volatile boolean aBoolean411 = false;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method4109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 + arg3;
		@Pc(16) int local16 = arg2 + arg1;
		@Pc(21) int local21 = arg5 + arg4;
		if (!Static188.method2907(local16, arg5, arg3, local16, local21, local21, local7, arg3, local16)) {
			return false;
		} else if (Static188.method2907(local16, arg5, local7, local16, arg5, local21, local7, arg3, local16)) {
			if (Static75.anInt9088 > arg3) {
				if (!Static188.method2907(local16, local21, arg3, local16, arg5, local21, arg3, arg3, arg1)) {
					return false;
				}
				if (!Static188.method2907(arg1, local21, arg3, local16, arg5, arg5, arg3, arg3, arg1)) {
					return false;
				}
			} else if (!Static188.method2907(local16, local21, local7, local16, arg5, local21, local7, local7, arg1)) {
				return false;
			} else if (!Static188.method2907(arg1, local21, local7, local16, arg5, arg5, local7, local7, arg1)) {
				return false;
			}
			if (arg5 < Static108.anInt2137) {
				if (!Static188.method2907(local16, arg5, arg3, local16, arg5, arg5, local7, arg3, arg1)) {
					return false;
				}
				if (!Static188.method2907(arg1, arg5, local7, local16, arg5, arg5, local7, arg3, arg1)) {
					return false;
				}
			} else if (!Static188.method2907(local16, local21, arg3, local16, local21, local21, local7, arg3, arg1)) {
				return false;
			} else if (!Static188.method2907(arg1, local21, local7, local16, local21, local21, local7, arg3, arg1)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([BI)[B")
	public static byte[] method4110(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static598.method1173(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}
}
