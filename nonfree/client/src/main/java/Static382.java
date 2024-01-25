import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static382 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray45;

	@OriginalMember(owner = "client!no", name = "d", descriptor = "I")
	public static int anInt10004;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(BB)C")
	public static char method8494(@OriginalArg(1) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static605.aCharArray8[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method8495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg0 + arg4;
		@Pc(11) int local11 = arg1 + arg2;
		@Pc(20) int local20 = arg5 + arg3;
		if (!Static275.method7486(arg4, local7, local11, arg4, local11, local20, local11, local20, arg3)) {
			return false;
		} else if (Static275.method7486(arg4, local7, local11, local7, local11, local20, local11, arg3, arg3)) {
			if (Static384.anInt6759 > arg4) {
				if (!Static275.method7486(arg4, arg4, arg2, arg4, local11, local20, local11, arg3, local20)) {
					return false;
				}
				if (!Static275.method7486(arg4, arg4, arg2, arg4, local11, arg3, arg2, arg3, local20)) {
					return false;
				}
			} else if (!Static275.method7486(local7, local7, arg2, local7, local11, local20, local11, arg3, local20)) {
				return false;
			} else if (!Static275.method7486(local7, local7, arg2, local7, local11, arg3, arg2, arg3, local20)) {
				return false;
			}
			if (Static551.anInt9128 > arg3) {
				if (!Static275.method7486(arg4, local7, arg2, arg4, local11, arg3, local11, arg3, arg3)) {
					return false;
				}
				if (!Static275.method7486(arg4, local7, arg2, local7, local11, arg3, arg2, arg3, arg3)) {
					return false;
				}
			} else if (!Static275.method7486(arg4, local7, arg2, arg4, local11, local20, local11, local20, local20)) {
				return false;
			} else if (!Static275.method7486(arg4, local7, arg2, local7, local11, local20, arg2, local20, local20)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
