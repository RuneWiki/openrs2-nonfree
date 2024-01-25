import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static239 {

	@OriginalMember(owner = "client!hw", name = "f", descriptor = "Z")
	public static boolean aBoolean367 = false;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)I")
	public static int method4275(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = (arg0 & 0x7F) * arg1 >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
