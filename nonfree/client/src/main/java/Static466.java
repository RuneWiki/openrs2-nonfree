import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!ro", name = "b", descriptor = "I")
	public static int anInt8096;

	@OriginalMember(owner = "client!ro", name = "c", descriptor = "[I")
	public static int[] anIntArray478;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
	public static int anInt8097;

	@OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
	public static int anInt8098 = -1;

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!k;BZLjava/lang/String;Z)V")
	public static void method6370(@OriginalArg(0) Class168 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static56.method1376(arg0, arg2, 3);
			return;
		}
		@Pc(26) String local26;
		if (Static268.aString130.startsWith("win") && arg0.aBoolean334) {
			local26 = null;
			if (Static304.anApplet1 != null) {
				local26 = Static304.anApplet1.getParameter("haveie6");
			}
			if (local26 == null || !local26.equals("1")) {
				@Pc(44) Class309 local44 = Static56.method1376(arg0, arg2, 0);
				Static521.aClass168_16 = arg0;
				Static505.aString234 = arg2;
				Static122.aClass309_3 = local44;
				return;
			}
		}
		if (Static268.aString130.startsWith("mac")) {
			local26 = null;
			if (Static304.anApplet1 != null) {
				local26 = Static304.anApplet1.getParameter("havefirefox");
			}
			if (local26 != null && local26.equals("1") && arg1) {
				Static56.method1376(arg0, arg2, 1);
				return;
			}
		}
		Static56.method1376(arg0, arg2, 2);
	}
}
