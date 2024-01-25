import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static358 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "Z")
	public static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IB)Z")
	public static boolean method5157(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}
}
