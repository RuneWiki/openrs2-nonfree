import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static41 {

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "Lclient!rd;")
	public static Class1_Sub20 aClass1_Sub20_1;

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "I")
	public static int anInt1057 = 0;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "I")
	public static int anInt1059 = 0;

	@OriginalMember(owner = "client!ga", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_494 = Static45.method1937("null");

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!af;")
	public static Class5 aClass5_495 = Static45.method1937("<col=ff7000>");

	@OriginalMember(owner = "client!ga", name = "o", descriptor = "Lclient!af;")
	public static Class5 aClass5_496 = Static45.method1937("Stufe)2");

	@OriginalMember(owner = "client!ga", name = "q", descriptor = "Lclient!af;")
	private static Class5 aClass5_497 = Static45.method1937("Sorry invited players only)3");

	@OriginalMember(owner = "client!ga", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_498 = aClass5_497;

	@OriginalMember(owner = "client!ga", name = "s", descriptor = "Lclient!af;")
	public static Class5 aClass5_499 = Static45.method1937("(Udns");

	@OriginalMember(owner = "client!ga", name = "t", descriptor = "Lclient!af;")
	private static Class5 aClass5_500 = Static45.method1937("You can(Wt add yourself to your own friend list");

	@OriginalMember(owner = "client!ga", name = "u", descriptor = "Lclient!af;")
	public static Class5 aClass5_501 = aClass5_500;

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)V")
	public static void method784() {
		aClass5_498 = null;
		aClass5_495 = null;
		Class26.anIntArray184 = null;
		aClass5_499 = null;
		aClass5_500 = null;
		aClass1_Sub20_1 = null;
		aClass5_497 = null;
		aClass5_496 = null;
		aClass5_494 = null;
		aClass5_501 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
	public static int method785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == -2) {
			return 12345678;
		} else if (arg1 == -1) {
			if (arg0 < 0) {
				arg0 = 0;
			} else if (arg0 > 127) {
				arg0 = 127;
			}
			return 127 - arg0;
		} else {
			arg0 = arg0 * (arg1 & 0x7F) / 128;
			if (arg0 < 2) {
				arg0 = 2;
			} else if (arg0 > 126) {
				arg0 = 126;
			}
			return (arg1 & 0xFF80) + arg0;
		}
	}
}
