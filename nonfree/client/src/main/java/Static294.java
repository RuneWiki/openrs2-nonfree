import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static294 {

	@OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
	public static int anInt5951;

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "[I")
	public static final int[] anIntArray350 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZI)B")
	public static byte method4883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
