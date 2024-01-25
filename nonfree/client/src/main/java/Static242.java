import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static242 {

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "[I")
	public static int[] anIntArray370;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)I")
	public static int method3738(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}
}
