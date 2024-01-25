import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "Z")
	public static boolean aBoolean73 = false;

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
	public static int anInt905 = -1;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)Z")
	public static boolean method795(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Ljava/lang/String;Lclient!gt;ZIZ)V")
	public static void method798(@OriginalArg(0) String arg0, @OriginalArg(1) Class93 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg2) {
			Static3.method38(3, arg0, arg1);
			return;
		}
		@Pc(24) String local24;
		if (Static144.aString29.startsWith("win") && Static144.anInt2596 != 3) {
			local24 = null;
			if (arg1.anApplet1 != null) {
				local24 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local24 == null || !local24.equals("1")) {
				@Pc(44) Class268 local44 = Static3.method38(0, arg0, arg1);
				Static320.aClass268_7 = local44;
				Static431.aClass93_5 = arg1;
				Static110.aString15 = arg0;
				return;
			}
		}
		if (Static144.aString29.startsWith("mac")) {
			local24 = null;
			if (arg1.anApplet1 != null) {
				local24 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local24 != null && local24.equals("1") && arg3) {
				Static3.method38(1, arg0, arg1);
				return;
			}
		}
		Static3.method38(2, arg0, arg1);
	}
}
