import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!ar", name = "n", descriptor = "Lclient!ir;")
	public static Class100 aClass100_10;

	@OriginalMember(owner = "client!ar", name = "l", descriptor = "Lclient!uc;")
	public static Class198 aClass198_6 = new Class198(64);

	@OriginalMember(owner = "client!ar", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString7 = "";

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method386(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V")
	public static void method388() {
		Static296.aClass198_54.method5236();
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IBI)I")
	public static int method389(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(46) int local46 = (arg0 & 0x7F) * 96 >> 7;
			if (local46 < 2) {
				local46 = 2;
			} else if (local46 > 126) {
				local46 = 126;
			}
			return (arg0 & 0xFF80) + local46;
		}
	}
}
