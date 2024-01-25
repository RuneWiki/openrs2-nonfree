import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!vw", name = "d", descriptor = "[I")
	public static int[] anIntArray556;

	@OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
	public static int anInt10427;

	@OriginalMember(owner = "client!vw", name = "g", descriptor = "Lclient!fl;")
	public static Class104 aClass104_6;

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZB)I")
	public static int method8474(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static552.anInt9486;
		if (local10 == 0) {
			return arg0 ? 0 : Static477.anInt8411;
		} else if (local10 == 1) {
			return Static477.anInt8411;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!vw", name = "a", descriptor = "()V")
	public static void method8477() {
		Static544.method7680(anInt10427);
	}
}
