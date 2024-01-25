import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static167 {

	@OriginalMember(owner = "client!hw", name = "kb", descriptor = "I")
	public static int anInt7566 = 0;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(BJ)V")
	public static void method6157(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static214.method3026(arg0 - 1L);
			Static214.method3026(1L);
		} else {
			Static214.method3026(arg0);
		}
	}
}
