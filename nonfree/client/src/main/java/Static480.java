import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static480 {

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBI)Z")
	public static boolean method5982(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
