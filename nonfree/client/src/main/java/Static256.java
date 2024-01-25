import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static256 {

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "F")
	public static float aFloat60;

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "[I")
	public static final int[] anIntArray436 = new int[14];

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(II)Z")
	public static boolean method3623(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 4;
	}
}
