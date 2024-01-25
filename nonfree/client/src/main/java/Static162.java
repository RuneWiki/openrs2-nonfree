import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "I")
	public static int anInt3758;

	@OriginalMember(owner = "client!gm", name = "h", descriptor = "I")
	public static int anInt3762;

	@OriginalMember(owner = "client!gm", name = "d", descriptor = "I")
	public static int anInt3760 = 0;

	@OriginalMember(owner = "client!gm", name = "e", descriptor = "[I")
	public static final int[] anIntArray297 = new int[8];

	@OriginalMember(owner = "client!gm", name = "g", descriptor = "I")
	public static int anInt3761 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IBIII)V")
	public static void method3309(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10;
		if (arg2 >= arg1) {
			for (local10 = arg1; local10 < arg2; local10++) {
				Static228.anIntArrayArray46[local10][arg3] = arg0;
			}
		} else {
			for (local10 = arg2; local10 < arg1; local10++) {
				Static228.anIntArrayArray46[local10][arg3] = arg0;
			}
		}
	}
}
