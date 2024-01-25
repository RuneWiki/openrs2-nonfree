import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static68 {

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "Lclient!vg;")
	public static Class250 aClass250_2 = null;

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_42 = new Class151("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IBI)I")
	public static int method1045(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
