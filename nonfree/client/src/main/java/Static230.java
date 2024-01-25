import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static230 {

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
	public static int anInt4470;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
	public static int anInt4473;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIB)B")
	public static byte method4097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
