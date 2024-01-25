import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static423 {

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
	public static boolean method5615(@OriginalArg(0) int arg0) {
		if (arg0 == 45 || arg0 == 20 || arg0 == 58 || arg0 == 15 || arg0 == 4) {
			return true;
		} else {
			return arg0 == 10 || arg0 == 1003;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V")
	public static void method5619() {
		Static300.method5746();
	}
}
