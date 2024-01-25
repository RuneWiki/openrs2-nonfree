import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static261 {

	@OriginalMember(owner = "client!jp", name = "G", descriptor = "Lclient!tp;")
	public static Class331 aClass331_8;

	@OriginalMember(owner = "client!jp", name = "J", descriptor = "I")
	public static int anInt5609;

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
	public static int anInt5610;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)I")
	public static int method4598(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return arg1 + (arg0 & 0xFF80);
	}
}
