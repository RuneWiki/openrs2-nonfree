import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static5 {

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "Z")
	public static boolean aBoolean5 = false;

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(II)I")
	public static int method212(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
