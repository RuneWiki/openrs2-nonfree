import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static253 {

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "Lclient!da;")
	public static Class59 aClass59_5;

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)I")
	public static int method4435(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
