import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static565 {

	@OriginalMember(owner = "client!vl", name = "oc", descriptor = "I")
	public static int anInt9104;

	@OriginalMember(owner = "client!vl", name = "Mc", descriptor = "Lclient!ln;")
	public static Class204 aClass204_5;

	@OriginalMember(owner = "client!vl", name = "Nc", descriptor = "Lclient!om;")
	public static Class246 aClass246_261;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(CILjava/lang/String;)I")
	public static int method7528(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(12) int local12 = 0;
		@Pc(15) int local15 = arg1.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			if (arg0 == arg1.charAt(local17)) {
				local12++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZI)I")
	public static int method7534(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		arg0 = arg0 * (arg1 & 0x7F) >> 7;
		if (arg0 < 2) {
			arg0 = 2;
		} else if (arg0 > 126) {
			arg0 = 126;
		}
		return arg0 + (arg1 & 0xFF80);
	}
}
