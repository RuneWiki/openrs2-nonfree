import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static212 {

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "[I")
	public static final int[] anIntArray244 = new int[1];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
	public static int method3141(@OriginalArg(0) int arg0) {
		return arg0 >> 11 & 0x7F;
	}
}
