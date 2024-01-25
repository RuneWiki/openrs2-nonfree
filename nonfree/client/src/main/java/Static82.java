import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString79;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Lclient!hq;")
	public static Class105 aClass105_4;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!ho;")
	public static final Class103 aClass103_258 = new Class103(82, -1);

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Lclient!d;")
	public static final Class48 aClass48_7 = new Class48("stellardawn", 1);

	@OriginalMember(owner = "client!e", name = "m", descriptor = "[I")
	public static final int[] anIntArray521 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(III)I")
	public static int method5960(@OriginalArg(0) int arg0) {
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
}
