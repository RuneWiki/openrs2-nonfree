import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static579 {

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "Z")
	public static final boolean aBoolean802 = false;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(JI)V")
	public static void method8004(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static58.method750(arg0 - 1L);
			Static58.method750(1L);
		} else {
			Static58.method750(arg0);
		}
	}
}
