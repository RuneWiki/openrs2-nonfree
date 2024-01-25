import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static388 {

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "I")
	public static int anInt6440 = 0;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIB)B")
	public static byte method5694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
