import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static169 {

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "[S")
	public static final short[] aShortArray43 = new short[] { 13, 22, 16, 25, 49, 21, 47, 2 };

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBI)B")
	public static byte method2744(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}
}
