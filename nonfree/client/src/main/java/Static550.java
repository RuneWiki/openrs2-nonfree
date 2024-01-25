import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static550 {

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
	public static int anInt8467;

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(IJ)V")
	public static void method7219(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static216.method3229(arg0 - 1L);
			Static216.method3229(1L);
		} else {
			Static216.method3229(arg0);
		}
	}
}
