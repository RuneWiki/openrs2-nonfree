import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static265 {

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "[I")
	public static int[] anIntArray281 = new int[2];

	@OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
	public static int anInt3379 = -50;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(JB)V")
	public static void method3147(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static520.method7935(arg0 - 1L);
			Static520.method7935(1L);
		} else {
			Static520.method7935(arg0);
		}
	}
}
