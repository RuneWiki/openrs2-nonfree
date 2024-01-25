import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Ljava/lang/String;ZLclient!ji;ZB)V")
	public static void method1861(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class124 arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3) {
			Static376.method4826(3, arg0, arg2);
			return;
		}
		@Pc(25) String local25;
		if (Static191.aString33.startsWith("win") && Static191.anInt3047 != 3) {
			local25 = null;
			if (arg2.anApplet1 != null) {
				local25 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local25 == null || !local25.equals("1")) {
				@Pc(45) Class215 local45 = Static376.method4826(0, arg0, arg2);
				Static234.aClass215_6 = local45;
				Static201.aClass124_3 = arg2;
				Static389.aString20 = arg0;
				return;
			}
		}
		if (Static191.aString33.startsWith("mac")) {
			local25 = null;
			if (arg2.anApplet1 != null) {
				local25 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local25 != null && local25.equals("1") && arg1) {
				Static376.method4826(1, arg0, arg2);
				return;
			}
		}
		Static376.method4826(2, arg0, arg2);
	}
}
