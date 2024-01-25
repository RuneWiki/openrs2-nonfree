import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static3 {

	@OriginalMember(owner = "client!aaa", name = "z", descriptor = "I")
	public static int anInt2070 = 0;

	@OriginalMember(owner = "client!aaa", name = "A", descriptor = "I")
	public static int anInt2071 = 0;

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)B")
	public static byte method1718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
