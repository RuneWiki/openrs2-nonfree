import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cca", name = "ab", descriptor = "I")
	public static int anInt1208 = 0;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIIIB)V")
	public static void method1199(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(10) int local10;
		if (arg2 > arg3) {
			for (local10 = arg3; local10 < arg2; local10++) {
				Static454.anIntArrayArray71[local10][arg0] = arg1;
			}
		} else {
			for (local10 = arg2; local10 < arg3; local10++) {
				Static454.anIntArrayArray71[local10][arg0] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)I")
	public static int method1200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(28) int local28 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local28;
		}
		return arg0;
	}
}
