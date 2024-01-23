import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
	public static int anInt393 = 0;

	@OriginalMember(owner = "client!ba", name = "n", descriptor = "[I")
	public static int[] anIntArray22 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
	public static int anInt403 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
	public static int method291(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -1) {
			return 12345678;
		}
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
