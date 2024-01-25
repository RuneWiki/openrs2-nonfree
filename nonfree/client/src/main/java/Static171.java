import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!jt", name = "c", descriptor = "(B)V")
	public static void method3040() {
		Static14.aBoolean33 = true;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZLjava/lang/String;ILclient!kd;Z)V")
	public static void method3041(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) Class123 arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static326.method5242(arg1, arg2, 3);
			return;
		}
		@Pc(20) String local20;
		if (Static175.aString32.startsWith("win") && Static175.anInt3717 != 3) {
			local20 = null;
			if (arg2.anApplet1 != null) {
				local20 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local20 == null || !local20.equals("1")) {
				@Pc(40) Class86 local40 = Static326.method5242(arg1, arg2, 0);
				Static259.aString46 = arg1;
				Static162.aClass86_4 = local40;
				Static222.aClass123_4 = arg2;
				return;
			}
		}
		if (Static175.aString32.startsWith("mac")) {
			local20 = null;
			if (arg2.anApplet1 != null) {
				local20 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local20 != null && local20.equals("1") && arg0) {
				Static326.method5242(arg1, arg2, 1);
				return;
			}
		}
		Static326.method5242(arg1, arg2, 2);
	}
}
