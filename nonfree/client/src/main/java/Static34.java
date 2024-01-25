import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "J")
	public static long aLong23;

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "F")
	public static float aFloat1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!bca", name = "i", descriptor = "Ljava/lang/Class;")
	private static Class aClass3;

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "J")
	public static long aLong22 = 0L;

	@OriginalMember(owner = "client!bca", name = "h", descriptor = "Lclient!ch;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public static boolean method446(@OriginalArg(0) String arg0) {
		return Static491.method7285(arg0, aClass3 == null ? (aClass3 = Class32.a("jaa")) : aClass3);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(IB)[I")
	public static int[] method447(@OriginalArg(0) int arg0) {
		@Pc(6) int[] local6 = new int[3];
		Static302.method4852(Static313.method4965(arg0));
		local6[0] = Static390.aCalendar1.get(5);
		local6[1] = Static390.aCalendar1.get(2);
		local6[2] = Static390.aCalendar1.get(1);
		return local6;
	}
}
