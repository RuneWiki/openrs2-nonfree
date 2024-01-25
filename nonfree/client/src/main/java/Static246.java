import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "S")
	public static short aShort51;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public static int anInt3873 = 0;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIII)V")
	public static void method3493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		if (arg1 < arg0) {
			for (local19 = arg1; local19 < arg0; local19++) {
				Static118.anIntArrayArray7[local19][arg2] = arg3;
			}
		} else {
			for (local19 = arg0; local19 < arg1; local19++) {
				Static118.anIntArrayArray7[local19][arg2] = arg3;
			}
		}
	}
}
