import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!iw", name = "g", descriptor = "I")
	public static int anInt1414;

	@OriginalMember(owner = "client!iw", name = "d", descriptor = "Lclient!ida;")
	public static Class3_Sub7_Sub13 aClass3_Sub7_Sub13_2 = null;

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "Lclient!st;")
	public static final Class314 aClass314_29 = new Class314(1, -1);

	@OriginalMember(owner = "client!iw", name = "f", descriptor = "Lclient!fv;")
	public static final Class117 aClass117_2 = new Class117();

	@OriginalMember(owner = "client!iw", name = "h", descriptor = "I")
	public static final int anInt1415 = 1407;

	@OriginalMember(owner = "client!iw", name = "i", descriptor = "Lclient!kr;")
	public static final Class194 aClass194_53 = new Class194(65, -2);

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZZLjava/lang/String;BLclient!rp;)V")
	public static void method1240(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(4) Class298 arg3) {
		if (!arg1) {
			Static38.method708(3, arg2, arg3);
			return;
		}
		@Pc(22) String local22;
		if (Static501.aString78.startsWith("win") && arg3.aBoolean613) {
			local22 = null;
			if (Static303.anApplet3 != null) {
				local22 = Static303.anApplet3.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(40) Class174 local40 = Static38.method708(0, arg2, arg3);
				Static113.aClass174_3 = local40;
				Static596.aClass298_14 = arg3;
				Static413.aString62 = arg2;
				return;
			}
		}
		if (Static501.aString78.startsWith("mac")) {
			local22 = null;
			if (Static303.anApplet3 != null) {
				local22 = Static303.anApplet3.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg0) {
				Static38.method708(1, arg2, arg3);
				return;
			}
		}
		Static38.method708(2, arg2, arg3);
	}
}
