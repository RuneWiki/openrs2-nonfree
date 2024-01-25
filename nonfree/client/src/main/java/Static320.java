import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static320 {

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
	public static int anInt5358;

	@OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
	public static int anInt5361;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_83 = new Class171(132, 12);

	@OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
	public static int anInt5359 = 0;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)Lclient!nba;")
	public static Class3_Sub5_Sub14 method4597(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub5_Sub14 local10 = (Class3_Sub5_Sub14) Static527.aClass325_2.method7319((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static413.aClass362_88.method8368(arg0, 0);
		if (local22 == null || local22.length <= 1) {
			return null;
		}
		try {
			local10 = Static460.method6185(local22);
		} catch (@Pc(41) Exception local41) {
			throw new RuntimeException(local41.getMessage() + " S: " + arg0);
		}
		Static527.aClass325_2.method7322(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method4599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg4 + arg5;
		@Pc(12) int local12 = arg2 + arg1;
		@Pc(17) int local17 = arg0 + arg3;
		if (!Static118.method7907(arg4, local12, local12, arg4, arg0, local7, local17, local12, local17)) {
			return false;
		} else if (Static118.method7907(arg4, local12, local12, local7, arg0, local7, local17, local12, arg0)) {
			if (arg4 >= Static632.anInt10468) {
				if (!Static118.method7907(local7, arg2, local12, local7, local17, local7, local17, local12, arg0)) {
					return false;
				}
				if (!Static118.method7907(local7, arg2, local12, local7, local17, local7, arg0, arg2, arg0)) {
					return false;
				}
			} else if (!Static118.method7907(arg4, arg2, local12, arg4, local17, arg4, local17, local12, arg0)) {
				return false;
			} else if (!Static118.method7907(arg4, arg2, local12, arg4, local17, arg4, arg0, arg2, arg0)) {
				return false;
			}
			if (Static332.anInt5506 > arg0) {
				if (!Static118.method7907(arg4, arg2, local12, arg4, arg0, local7, arg0, local12, arg0)) {
					return false;
				}
				if (!Static118.method7907(arg4, arg2, local12, local7, arg0, local7, arg0, arg2, arg0)) {
					return false;
				}
			} else if (!Static118.method7907(arg4, arg2, local12, arg4, local17, local7, local17, local12, local17)) {
				return false;
			} else if (!Static118.method7907(arg4, arg2, local12, local7, local17, local7, local17, arg2, local17)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
