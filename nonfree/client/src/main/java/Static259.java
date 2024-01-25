import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static259 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public static int anInt4284;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
	public static int anInt4285 = 1;

	@OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
	public static int anInt4287 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Z")
	public static boolean method3656(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
