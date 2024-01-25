import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static135 {

	@OriginalMember(owner = "client!ik", name = "b", descriptor = "[I")
	public static int[] anIntArray261;

	@OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
	public static int anInt2874 = 0;

	@OriginalMember(owner = "client!ik", name = "j", descriptor = "[I")
	public static final int[] anIntArray263 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)I")
	public static int method2733(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		arg0 = (arg1 & 0x7F) * arg0 >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return (arg1 & 0xFF80) + arg0;
	}
}
