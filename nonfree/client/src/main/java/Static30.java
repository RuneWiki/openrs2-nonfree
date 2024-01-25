import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bq", name = "F", descriptor = "I")
	public static int anInt542;

	@OriginalMember(owner = "client!bq", name = "H", descriptor = "Lclient!nq;")
	public static Class144 aClass144_8;

	@OriginalMember(owner = "client!bq", name = "M", descriptor = "Lclient!ai;")
	public static Class9 aClass9_1;

	@OriginalMember(owner = "client!bq", name = "K", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_3 = new Class26(100);

	@OriginalMember(owner = "client!bq", name = "L", descriptor = "Lclient!kn;")
	public static final Class117 aClass117_15 = new Class117("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!bq", name = "O", descriptor = "[I")
	public static int[] anIntArray34 = new int[2];

	@OriginalMember(owner = "client!bq", name = "P", descriptor = "I")
	public static int anInt546 = 0;

	@OriginalMember(owner = "client!bq", name = "R", descriptor = "[I")
	public static final int[] anIntArray35 = new int[14];

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(ZLclient!ko;ZLjava/lang/String;I)V")
	public static void method430(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) String arg3) {
		if (!arg0) {
			Static135.method2123(arg1, arg3, 3);
			return;
		}
		@Pc(22) String local22;
		if (Static167.aString32.startsWith("win") && Static167.anInt3322 != 3) {
			local22 = null;
			if (arg1.anApplet1 != null) {
				local22 = arg1.anApplet1.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(42) Class2 local42 = Static135.method2123(arg1, arg3, 0);
				Static103.aClass2_4 = local42;
				Static32.aString8 = arg3;
				Static59.aClass118_1 = arg1;
				return;
			}
		}
		if (Static167.aString32.startsWith("mac")) {
			local22 = null;
			if (arg1.anApplet1 != null) {
				local22 = arg1.anApplet1.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg2) {
				Static135.method2123(arg1, arg3, 1);
				return;
			}
		}
		Static135.method2123(arg1, arg3, 2);
	}
}
