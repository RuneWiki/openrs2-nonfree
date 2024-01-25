import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
	public static int anInt5295;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
	public static int anInt5296;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!od;ZLjava/lang/String;Z)V")
	public static void method4372(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class180 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		if (!arg2) {
			Static323.method4606(arg3, arg1, 3);
			return;
		}
		@Pc(18) String local18;
		if (Static282.aString50.startsWith("win") && Static282.anInt4930 != 3) {
			local18 = null;
			if (arg1.anApplet1 != null) {
				local18 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local18 == null || !local18.equals("1")) {
				@Pc(38) Class9 local38 = Static323.method4606(arg3, arg1, 0);
				Static209.aString32 = arg3;
				Static99.aClass180_2 = arg1;
				Static53.aClass9_4 = local38;
				return;
			}
		}
		if (Static282.aString50.startsWith("mac")) {
			local18 = null;
			if (arg1.anApplet1 != null) {
				local18 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local18 != null && local18.equals("1") && arg0) {
				Static323.method4606(arg3, arg1, 1);
				return;
			}
		}
		Static323.method4606(arg3, arg1, 2);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(FIBFLclient!hj;IIFFFI)[B")
	public static byte[] method4373(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) Class103 arg2, @OriginalArg(7) float arg3, @OriginalArg(8) float arg4, @OriginalArg(9) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static213.method3370(0, arg2, arg5, arg3, arg0, local10, arg4, arg1);
		return local10;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4374(@OriginalArg(1) String arg0) {
		System.exit(1);
	}
}
