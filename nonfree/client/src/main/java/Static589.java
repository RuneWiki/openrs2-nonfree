import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static589 {

	@OriginalMember(owner = "client!wp", name = "dd", descriptor = "J")
	public static long aLong274 = 0L;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(JB)V")
	public static void method7892(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static254.method3913(arg0 - 1L);
			Static254.method3913(1L);
		} else {
			Static254.method3913(arg0);
		}
	}
}
