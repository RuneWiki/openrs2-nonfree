import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
	public static int anInt6713 = -1;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIIIZI)I")
	public static int method5969(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(21) int local21 = arg5;
			arg5 = arg4;
			arg4 = local21;
		}
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 + 1 - arg2 - arg5;
		} else {
			return 7 + 1 - arg0 - arg4;
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)Lclient!ifa;")
	public static Class6_Sub2_Sub9 method5971() {
		return Static627.aClass6_Sub2_Sub9_2;
	}
}
