import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!fha", name = "z", descriptor = "Lclient!lb;")
	public static Class221 aClass221_108;

	@OriginalMember(owner = "client!fha", name = "v", descriptor = "Z")
	public static boolean aBoolean501 = true;

	@OriginalMember(owner = "client!fha", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString97 = null;

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Ljava/lang/String;Lclient!cea;ZZILjava/lang/String;)V")
	public static void method5465(@OriginalArg(0) String arg0, @OriginalArg(1) Class47 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4) {
		if (!arg3) {
			Static8.method112(arg0, 3, arg1);
			return;
		}
		@Pc(33) String local33;
		if (Static75.aString24.startsWith("win") && arg1.aBoolean97) {
			local33 = null;
			if (Static395.anApplet1 != null) {
				local33 = Static395.anApplet1.getParameter("haveie6");
			}
			if (local33 == null || !local33.equals("1")) {
				@Pc(55) Class201 local55 = Static8.method112(arg0, 0, arg1);
				Static170.aClass47_2 = arg1;
				Static25.aClass201_1 = local55;
				Static101.aString31 = arg0;
				return;
			}
		}
		if (Static75.aString24.startsWith("mac")) {
			local33 = null;
			if (Static395.anApplet1 != null) {
				local33 = Static395.anApplet1.getParameter("havefirefox");
			}
			if (local33 != null && local33.equals("1") && arg2) {
				Static97.method1297(arg1, arg4, 1, arg0);
				return;
			}
		}
		Static8.method112(arg0, 2, arg1);
	}

	@OriginalMember(owner = "client!fha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)V")
	public static void method5466(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(3) int arg2) {
		Static167.aClass400_1 = Static532.aClass400_3;
		Static293.anInt5245 = 2;
		Static707.anInt11053 = arg2;
		Static441.method6405(false, arg0, false, arg1);
	}
}
