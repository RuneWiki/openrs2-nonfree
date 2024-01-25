import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static308 {

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "[I")
	public static int[] anIntArray360;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	public static int anInt6237 = 0;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IC)Z")
	public static boolean method5079(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
