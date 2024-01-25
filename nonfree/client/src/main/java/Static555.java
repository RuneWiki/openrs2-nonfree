import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static555 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IBI)Z")
	public static boolean method7560(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIB)V")
	public static void method7565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(28) Class39 local28 = Static292.aClass39ArrayArrayArray2[arg0][arg3][arg2];
		if (local28 != null) {
			if (arg1 == 1) {
				local28.aShort4 = 0;
			} else if (arg1 == 2) {
				local28.aShort7 = 0;
			}
		}
		Static583.method7801();
	}
}
