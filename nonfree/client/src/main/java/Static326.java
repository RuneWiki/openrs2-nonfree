import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static326 {

	@OriginalMember(owner = "client!kw", name = "b", descriptor = "[I")
	public static final int[] anIntArray486 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)I")
	public static int method4968(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
