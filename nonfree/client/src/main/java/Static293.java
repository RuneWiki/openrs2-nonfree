import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static293 {

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "I")
	public static int anInt7588 = -1;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
	public static int anInt7589 = 0;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray42 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILclient!gga;Lclient!gga;B)V")
	public static void method6714(@OriginalArg(1) Class124 arg0, @OriginalArg(2) Class124 arg1) {
		Static55.aClass124_15 = arg1;
		Static295.aClass124_66 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)Z")
	public static boolean method6715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static390.method6562(arg1, arg0) & (Static340.method5708(arg1, arg0) | (arg1 & 0x2000) != 0 | Static320.method5327(arg0, arg1));
	}
}
