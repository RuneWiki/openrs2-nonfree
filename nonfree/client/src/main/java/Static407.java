import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "[I")
	public static int[] anIntArray620;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "Lclient!gca;")
	public static final Class118 aClass118_46 = new Class118(32);

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	public static int anInt9051 = 0;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_303 = new Class288(28, 2);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZZLjava/lang/String;Lclient!mr;)V")
	public static void method7597(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) String arg2, @OriginalArg(4) Class226 arg3) {
		if (!arg1) {
			Static31.method573(3, arg3, arg2);
			return;
		}
		@Pc(22) String local22;
		if (Static359.aString67.startsWith("win") && arg3.aBoolean416) {
			local22 = null;
			if (Static617.anApplet2 != null) {
				local22 = Static617.anApplet2.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(40) Class108 local40 = Static31.method573(0, arg3, arg2);
				Static133.aClass226_2 = arg3;
				Static4.aClass108_1 = local40;
				Static350.aString64 = arg2;
				return;
			}
		}
		if (Static359.aString67.startsWith("mac")) {
			local22 = null;
			if (Static617.anApplet2 != null) {
				local22 = Static617.anApplet2.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg0) {
				Static31.method573(1, arg3, arg2);
				return;
			}
		}
		Static31.method573(2, arg3, arg2);
	}
}
