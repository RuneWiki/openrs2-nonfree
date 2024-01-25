import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static523 {

	@OriginalMember(owner = "client!sj", name = "m", descriptor = "J")
	public static long aLong230;

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "Z")
	public static boolean aBoolean713 = false;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIBIIII)I")
	public static int method7487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg4 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg1;
			arg1 = local10;
		}
		@Pc(18) int local18 = arg3 & 0x3;
		if (local18 == 0) {
			return arg2;
		} else if (local18 == 1) {
			return arg0;
		} else if (local18 == 2) {
			return 1 + 7 - arg5 - arg2;
		} else {
			return 1 + 7 - arg1 - arg0;
		}
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I")
	public static int method7488(@OriginalArg(1) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z")
	public static boolean method7489(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) boolean local25 = (arg0 & 0x37) == 0 ? Static130.method1926(arg0, arg1) : Static386.method5963(arg0, arg1);
		return Static601.method8391(arg1, arg0) | (arg1 & 0x10000) != 0 | local25;
	}
}
