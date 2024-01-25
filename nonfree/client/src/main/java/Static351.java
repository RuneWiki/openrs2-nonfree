import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static351 {

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
	public static int anInt6519;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
	public static void method4973() {
		Static376.method5223(Static220.anInt4418);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Z")
	public static boolean method4975(@OriginalArg(0) int arg0) {
		if (arg0 == 17 || arg0 == 20 || arg0 == 48 || arg0 == 45 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1011;
		}
	}
}
