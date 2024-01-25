import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static558 {

	@OriginalMember(owner = "client!sm", name = "L", descriptor = "I")
	public static int anInt9004;

	@OriginalMember(owner = "client!sm", name = "R", descriptor = "D")
	public static double aDouble22;

	@OriginalMember(owner = "client!sm", name = "I", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_98 = new Class240(4, -1);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lclient!uq;Lclient!uq;[IB)V")
	public static void method7351(@OriginalArg(0) Class362 arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) int[] arg2) {
		Static197.aClass362_42 = arg1;
		Static516.aClass362_111 = arg0;
		if (arg2 != null) {
			Static407.anIntArray349 = arg2;
		}
	}
}
