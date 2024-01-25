import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static465 {

	@OriginalMember(owner = "client!th", name = "w", descriptor = "[I")
	public static int[] anIntArray713;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z")
	public static boolean method6933(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!th", name = "e", descriptor = "(I)V")
	public static void method6937() {
		Static423.method6491();
	}
}
