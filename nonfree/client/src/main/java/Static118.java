import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
	public static int anInt2280;

	@OriginalMember(owner = "client!eaa", name = "d", descriptor = "[I")
	public static int[] anIntArray124;

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "Lclient!lga;")
	public static Class223 aClass223_25;

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
	public static int anInt2281;

	@OriginalMember(owner = "client!eaa", name = "i", descriptor = "Lclient!cb;")
	public static final Class51 aClass51_4 = new Class51();

	@OriginalMember(owner = "client!eaa", name = "h", descriptor = "[I")
	public static final int[] anIntArray123 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_34 = new Class241(2, 7);

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Lclient!ft;ZLjava/lang/String;IZLjava/lang/String;)V")
	public static void method2175(@OriginalArg(0) Class122 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4) {
		if (!arg1) {
			Static583.method8132(arg0, 3, arg4);
			return;
		}
		@Pc(34) String local34;
		if (Static174.aString36.startsWith("win") && arg0.aBoolean281) {
			local34 = null;
			if (Static371.anApplet1 != null) {
				local34 = Static371.anApplet1.getParameter("haveie6");
			}
			if (local34 == null || !local34.equals("1")) {
				@Pc(56) Class380 local56 = Static583.method8132(arg0, 0, arg4);
				Static657.aClass122_37 = arg0;
				Static185.aString42 = arg4;
				Static656.aClass380_9 = local56;
				return;
			}
		}
		if (Static174.aString36.startsWith("mac")) {
			local34 = null;
			if (Static371.anApplet1 != null) {
				local34 = Static371.anApplet1.getParameter("havefirefox");
			}
			if (local34 != null && local34.equals("1") && arg3) {
				Static591.method8212(arg4, 1, arg2, arg0);
				return;
			}
		}
		Static583.method8132(arg0, 2, arg4);
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(JB)I")
	public static int method2177(@OriginalArg(0) long arg0) {
		Static302.method4852(arg0);
		return Static390.aCalendar1.get(1);
	}
}
