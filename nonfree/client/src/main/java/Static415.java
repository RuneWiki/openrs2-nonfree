import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "[I")
	public static final int[] anIntArray460 = new int[2];

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	public static int anInt7192 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method6398(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static555.aClass96Array3 == Static216.aClass96Array1) {
			return;
		}
		@Pc(10) int local10 = Static524.aClass96Array2[arg1].method8077(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(25) Class96 local25 = Static524.aClass96Array2[local12];
				if (local25 != null) {
					local25.wa(arg0, arg2, local10 - local25.method8077(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
