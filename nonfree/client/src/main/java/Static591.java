import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static591 {

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "Lclient!km;")
	public static Class195 aClass195_1;

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "Lclient!fm;")
	public static final Class110 aClass110_1 = new Class110();

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(IIBI)V")
	public static void method8031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1007) {
			Static300.method4136(Static548.aClass260_10, arg1, arg0);
		} else if (arg2 == 1012) {
			Static300.method4136(Static364.aClass260_6, arg1, arg0);
		} else if (arg2 == 1006) {
			Static300.method4136(Static313.aClass260_5, arg1, arg0);
			return;
		} else if (arg2 == 1003) {
			Static300.method4136(Static8.aClass260_1, arg1, arg0);
			return;
		} else if (arg2 == 1010) {
			Static300.method4136(Static169.aClass260_2, arg1, arg0);
			return;
		}
	}
}
