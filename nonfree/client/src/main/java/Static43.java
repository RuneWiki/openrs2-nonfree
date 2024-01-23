import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static43 {

	@OriginalMember(owner = "client!cm", name = "c", descriptor = "J")
	public static long aLong34 = 0L;

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "I")
	public static int anInt1121 = 0;

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)I")
	public static int method816(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!ek;B)V")
	public static void method819(@OriginalArg(0) Class42 arg0) {
		Static209.aClass42_63 = arg0;
	}

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)V")
	public static void method820() {
		Static60.aBoolean97 = true;
	}
}
