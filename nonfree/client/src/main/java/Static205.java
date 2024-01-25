import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
	public static int anInt4092;

	@OriginalMember(owner = "client!hea", name = "z", descriptor = "I")
	public static int anInt4087 = 0;

	@OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
	public static int anInt4091 = 0;

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(ZI)I")
	public static int method3576(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!hea", name = "a", descriptor = "(Lclient!ge;ZBZLjava/lang/String;)V")
	public static void method3578(@OriginalArg(0) Class112 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg1) {
			Static60.method1079(arg3, arg0, 3);
			return;
		}
		@Pc(22) String local22;
		if (Static177.aString41.startsWith("win") && arg0.aBoolean263) {
			local22 = null;
			if (Static42.anApplet1 != null) {
				local22 = Static42.anApplet1.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(40) Class328 local40 = Static60.method1079(arg3, arg0, 0);
				Static233.aClass112_2 = arg0;
				Static352.aString81 = arg3;
				Static431.aClass328_6 = local40;
				return;
			}
		}
		if (Static177.aString41.startsWith("mac")) {
			local22 = null;
			if (Static42.anApplet1 != null) {
				local22 = Static42.anApplet1.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg2) {
				Static60.method1079(arg3, arg0, 1);
				return;
			}
		}
		Static60.method1079(arg3, arg0, 2);
	}
}
