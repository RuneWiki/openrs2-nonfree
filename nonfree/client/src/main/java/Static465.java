import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!tca", name = "K", descriptor = "Ljava/lang/Object;")
	public static Object anObject17;

	@OriginalMember(owner = "client!tca", name = "F", descriptor = "I")
	public static int anInt8475 = 0;

	@OriginalMember(owner = "client!tca", name = "H", descriptor = "[I")
	public static final int[] anIntArray632 = new int[5];

	@OriginalMember(owner = "client!tca", name = "J", descriptor = "I")
	public static int anInt8477 = 0;

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZILclient!dj;ZLjava/lang/String;)V")
	public static void method6966(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3) {
		if (!arg2) {
			Static116.method2387(arg1, 3, arg3);
			return;
		}
		@Pc(25) String local25;
		if (Static92.aString17.startsWith("win") && Static92.anInt2161 != 3) {
			local25 = null;
			if (arg1.anApplet1 != null) {
				local25 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local25 == null || !local25.equals("1")) {
				@Pc(45) Class55 local45 = Static116.method2387(arg1, 0, arg3);
				Static385.aString100 = arg3;
				Static445.aClass71_4 = arg1;
				Static121.aClass55_5 = local45;
				return;
			}
		}
		if (Static92.aString17.startsWith("mac")) {
			local25 = null;
			if (arg1.anApplet1 != null) {
				local25 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local25 != null && local25.equals("1") && arg0) {
				Static116.method2387(arg1, 1, arg3);
				return;
			}
		}
		Static116.method2387(arg1, 2, arg3);
	}
}
