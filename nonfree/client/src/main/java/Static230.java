import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!iw", name = "I", descriptor = "[I")
	public static final int[] anIntArray240 = new int[25];

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZ)I")
	public static int method3747(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}
}
