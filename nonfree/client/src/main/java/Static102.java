import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static102 {

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "F")
	public static float aFloat56;

	@OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
	public static int anInt2045;

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
	public static int anInt2046;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt2043 = 0;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray7 = new String[100];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	public static void method1794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static194.anInt3685 == 1) {
			Static247.method3617(arg1, Static413.aClass4_Sub39_2, arg0);
		} else if (Static194.anInt3685 == 2) {
			Static344.method4658(arg1, arg0);
		}
		Static194.anInt3685 = 0;
		Static413.aClass4_Sub39_2 = null;
	}
}
