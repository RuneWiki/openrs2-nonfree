import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
	public static int anInt8160;

	@OriginalMember(owner = "client!qea", name = "l", descriptor = "Lclient!mg;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "[I")
	public static final int[] anIntArray591 = new int[32];

	@OriginalMember(owner = "client!qea", name = "i", descriptor = "Z")
	public static boolean aBoolean549 = false;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "(Ljava/lang/String;ZLclient!br;ZILjava/lang/String;)V")
	public static void method6990(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class47 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) String arg4) {
		if (!arg3) {
			Static36.method1128(arg2, 3, arg0);
			return;
		}
		@Pc(33) String local33;
		if (Static60.aString26.startsWith("win") && arg2.aBoolean105) {
			local33 = null;
			if (Static41.anApplet1 != null) {
				local33 = Static41.anApplet1.getParameter("haveie6");
			}
			if (local33 == null || !local33.equals("1")) {
				@Pc(55) Class338 local55 = Static36.method1128(arg2, 0, arg0);
				Static536.aString105 = arg0;
				Static206.aClass47_4 = arg2;
				Static241.aClass338_4 = local55;
				return;
			}
		}
		if (Static60.aString26.startsWith("mac")) {
			local33 = null;
			if (Static41.anApplet1 != null) {
				local33 = Static41.anApplet1.getParameter("havefirefox");
			}
			if (local33 != null && local33.equals("1") && arg1) {
				Static537.method7125(1, arg2, arg4, arg0);
				return;
			}
		}
		Static36.method1128(arg2, 2, arg0);
	}
}
