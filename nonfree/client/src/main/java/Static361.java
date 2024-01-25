import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!se", name = "B", descriptor = "[S")
	public static short[] aShortArray98;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILclient!lf;Lclient!lf;)V")
	public static void method4639(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26_Sub3 arg3, @OriginalArg(4) Class26_Sub3 arg4) {
		@Pc(4) Class223 local4 = Static165.method2394(arg0, arg1, arg2);
		if (local4 != null) {
			local4.aClass26_Sub3_2 = arg3;
			local4.aClass26_Sub3_1 = arg4;
		}
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Lclient!ok;Z)V")
	public static void method4640(@OriginalArg(0) Class178 arg0) {
		Static217.aClass178_60 = arg0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!ok;ILclient!ya;)V")
	public static void method4642(@OriginalArg(0) Class178 arg0, @OriginalArg(2) Class51 arg1) {
		if (Static297.aBoolean308) {
			return;
		}
		arg1.p(0);
		Static126.aClass11_7 = arg1.method5308(Static469.method5143(arg0, Static59.anInt1066));
		Static126.aClass11_7.method4394((Static251.anInt4258 - Static126.aClass11_7.j()) / 2, (Static286.anInt4051 - Static126.aClass11_7.T()) / 2);
		Static344.aClass11_18 = arg1.method5308(Static469.method5143(arg0, Static382.anInt6131));
		Static344.aClass11_18.method4394((Static251.anInt4258 - Static344.aClass11_18.j()) / 2, 18);
		Static297.aBoolean308 = true;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZLclient!ec;ILjava/lang/String;)V")
	public static void method4643(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(4) String arg3) {
		if (!arg0) {
			Static21.method225(3, arg2, arg3);
			return;
		}
		@Pc(24) String local24;
		if (Static85.aString10.startsWith("win") && Static85.anInt1679 != 3) {
			local24 = null;
			if (arg2.anApplet1 != null) {
				local24 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local24 == null || !local24.equals("1")) {
				@Pc(44) Class236 local44 = Static21.method225(0, arg2, arg3);
				Static11.aClass61_1 = arg2;
				Static184.aString36 = arg3;
				Static457.aClass236_8 = local44;
				return;
			}
		}
		if (Static85.aString10.startsWith("mac")) {
			local24 = null;
			if (arg2.anApplet1 != null) {
				local24 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local24 != null && local24.equals("1") && arg1) {
				Static21.method225(1, arg2, arg3);
				return;
			}
		}
		Static21.method225(2, arg2, arg3);
	}
}
