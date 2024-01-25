import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	@OriginalMember(owner = "client!mca", name = "P", descriptor = "I")
	public static int anInt6055;

	@OriginalMember(owner = "client!mca", name = "O", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_82 = new Class98(8, -2);

	@OriginalMember(owner = "client!mca", name = "Q", descriptor = "[I")
	public static final int[] anIntArray436 = new int[4096];

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(III)Z")
	public static boolean method4909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(28) boolean local28 = (arg0 & 0x37) == 0 ? Static317.method4952(arg0, arg1) : Static366.method5423(arg1, arg0);
		return (arg1 & 0x10000) != 0 | Static24.method349(arg0, arg1) | local28;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIIIIII)I")
	public static int method4910(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg4;
			arg4 = arg1;
			arg1 = local6;
		}
		@Pc(14) int local14 = arg2 & 0x3;
		if (local14 == 0) {
			return arg5;
		} else if (local14 == 1) {
			return arg3;
		} else if (local14 == 2) {
			return 1 + 7 - arg4 - arg5;
		} else {
			return 1 + 7 - arg1 - arg3;
		}
	}
}
