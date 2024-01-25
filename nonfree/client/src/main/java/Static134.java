import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "[I")
	public static final int[] anIntArray146 = new int[8];

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
	public static int method1924(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
