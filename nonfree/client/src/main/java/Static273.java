import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static273 {

	@OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
	public static int anInt4616 = -1;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)Z")
	public static boolean method3792(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
