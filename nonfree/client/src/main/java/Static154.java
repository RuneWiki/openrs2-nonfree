import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!f", name = "z", descriptor = "I")
	public static int anInt6135 = 0;

	@OriginalMember(owner = "client!f", name = "D", descriptor = "Z")
	public static boolean aBoolean424 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IZIIIII)I")
	public static int method5199(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(13) int local13 = arg0;
			arg0 = arg2;
			arg2 = local13;
		}
		@Pc(25) int local25 = arg5 & 0x3;
		if (local25 == 0) {
			return arg4;
		} else if (local25 == 1) {
			return 1 + 7 - arg0 - arg3;
		} else if (local25 == 2) {
			return 1 + 7 - arg2 - arg4;
		} else {
			return arg3;
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIII)I")
	public static int method5200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 255 - arg0;
		@Pc(25) int local25 = (arg0 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
		return ((local7 * (arg2 & 0xFF00FF) & 0xFF00FF00 | local7 * (arg2 & 0xFF00) & 0xFF0000) >>> 8) + local25;
	}
}
