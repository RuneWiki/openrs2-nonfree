import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static331 {

	@OriginalMember(owner = "client!up", name = "O", descriptor = "I")
	public static int anInt6628;

	@OriginalMember(owner = "client!up", name = "S", descriptor = "[I")
	public static int[] anIntArray462;

	@OriginalMember(owner = "client!up", name = "T", descriptor = "I")
	public static int anInt6630;

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IBI)B", line = 56)
	public static byte method5957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
