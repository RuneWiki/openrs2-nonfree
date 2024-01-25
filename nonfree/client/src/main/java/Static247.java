import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IB)Lclient!co;")
	public static Class14_Sub2_Sub6 method4199(@OriginalArg(0) int arg0) {
		@Pc(10) Class14_Sub2_Sub6 local10 = (Class14_Sub2_Sub6) Static470.aClass378_3.method9082((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static413.aClass310_89.method7803(0, arg0);
		if (local21 == null || local21.length <= 1) {
			return null;
		}
		try {
			local10 = Static180.method2648(local21);
		} catch (@Pc(48) Exception local48) {
			throw new RuntimeException(local48.getMessage() + " S: " + arg0);
		}
		Static470.aClass378_3.method9078(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ZII)I")
	public static int method4200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(46) int local46 = Static230.method3884(arg1 + 45365, 4, arg0 + 91923) + (Static230.method3884(arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (Static230.method3884(arg1, 1, arg0) - 128 >> 2) - 128;
		local46 = (int) ((double) local46 * 0.3D) + 35;
		if (local46 < 10) {
			local46 = 10;
		} else if (local46 > 60) {
			local46 = 60;
		}
		return local46;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method4204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = arg5 + arg0;
		@Pc(12) int local12 = arg4 + arg3;
		@Pc(16) int local16 = arg1 + arg2;
		if (!Static485.method7311(local12, arg2, local12, arg0, local16, local12, local16, local7, arg0)) {
			return false;
		} else if (Static485.method7311(local12, arg2, local12, arg0, local16, local12, arg2, local7, local7)) {
			if (arg0 >= Static543.anInt9224) {
				if (!Static485.method7311(local12, local16, arg4, local7, local16, local12, arg2, local7, local7)) {
					return false;
				}
				if (!Static485.method7311(arg4, local16, arg4, local7, arg2, local12, arg2, local7, local7)) {
					return false;
				}
			} else if (!Static485.method7311(local12, local16, arg4, arg0, local16, local12, arg2, arg0, arg0)) {
				return false;
			} else if (!Static485.method7311(arg4, local16, arg4, arg0, arg2, local12, arg2, arg0, arg0)) {
				return false;
			}
			if (arg2 < Static277.anInt5150) {
				if (!Static485.method7311(local12, arg2, arg4, arg0, arg2, local12, arg2, local7, arg0)) {
					return false;
				}
				if (!Static485.method7311(arg4, arg2, arg4, arg0, arg2, local12, arg2, local7, local7)) {
					return false;
				}
			} else if (!Static485.method7311(local12, local16, arg4, arg0, local16, local12, local16, local7, arg0)) {
				return false;
			} else if (!Static485.method7311(arg4, local16, arg4, arg0, local16, local12, local16, local7, local7)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
