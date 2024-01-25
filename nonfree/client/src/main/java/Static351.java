import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static351 {

	@OriginalMember(owner = "client!ls", name = "L", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!ls", name = "D", descriptor = "[I")
	public static final int[] anIntArray338 = new int[32];

	@OriginalMember(owner = "client!ls", name = "E", descriptor = "[I")
	public static int[] anIntArray339 = null;

	@OriginalMember(owner = "client!ls", name = "C", descriptor = "[I")
	public static final int[] anIntArray340 = new int[8];

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZJ)V")
	public static void method5279(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static213.method3054(arg0 - 1L);
			Static213.method3054(1L);
		} else {
			Static213.method3054(arg0);
		}
	}
}
