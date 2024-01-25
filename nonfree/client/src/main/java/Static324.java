import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!l", name = "b", descriptor = "I")
	public static int anInt6012 = 0;

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V")
	public static void method5052(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub6_Sub7 local9 = Static198.method3146((long) arg0, 4);
		local9.method1709();
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIB)I")
	public static int method5053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg1 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(19) int local19 = arg3;
			arg3 = arg4;
			arg4 = local19;
		}
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 + 1 - arg5 - arg3;
		} else if (local3 == 2) {
			return 1 + 7 - arg4 - arg0;
		} else {
			return arg5;
		}
	}
}
