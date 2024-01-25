import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static150 {

	@OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
	public static int anInt2730;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
	public static int anInt2733;

	@OriginalMember(owner = "client!hi", name = "x", descriptor = "Ljava/lang/String;")
	public static String aString22 = "";

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(III)Z")
	public static boolean method2110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)I")
	public static int method2111() {
		return 16;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
	public static void method2112() {
		if (Static226.aClass53_1 != null) {
			Static226.aClass53_1.method5620();
		}
		if (Static413.aClass53_2 != null) {
			Static413.aClass53_2.method5620();
		}
	}
}
