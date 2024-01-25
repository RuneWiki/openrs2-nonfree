import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!cl", name = "I", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!cl", name = "K", descriptor = "[I")
	public static int[] anIntArray145;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "Lclient!nt;")
	public static final Class238 aClass238_8 = new Class238();

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIII)I")
	public static int method1283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg2 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(10) int local10 = arg5;
			arg5 = arg0;
			arg0 = local10;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1 + 7 - arg5 - arg4;
		} else if (local3 == 2) {
			return 8 - arg1 - arg0;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	public static void method1285() {
		if (Static585.anInt9601 == 6) {
			Static585.anInt9601 = 7;
		}
	}
}
