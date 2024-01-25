import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "I")
	public static int anInt2686;

	@OriginalMember(owner = "client!gr", name = "m", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_34 = new Class154(10, 3);

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
	public static int anInt2687 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)I")
	public static int method2308(@OriginalArg(1) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return (arg0 & 0xFF80) + local47;
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(BI)I")
	public static int method2309(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
