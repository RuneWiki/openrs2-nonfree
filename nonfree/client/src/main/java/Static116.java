import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!et", name = "i", descriptor = "I")
	public static int anInt2331;

	@OriginalMember(owner = "client!et", name = "m", descriptor = "I")
	public static int anInt2332;

	@OriginalMember(owner = "client!et", name = "r", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_32 = new Class243(52, -1);

	@OriginalMember(owner = "client!et", name = "t", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_70 = new Class202("Loading JAGDX - ", "Lade JAGDX - ", "Chargement JAGDX - ", "Carregando JAGDX - ");

	@OriginalMember(owner = "client!et", name = "u", descriptor = "Z")
	public static boolean aBoolean205 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;ZLclient!uf;ZB)V")
	public static void method2246(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class283 arg2, @OriginalArg(3) boolean arg3) {
		if (!arg1) {
			Static504.method7418(arg2, 3, arg0);
			return;
		}
		@Pc(22) String local22;
		if (Static482.aString187.startsWith("win") && Static482.anInt8574 != 3) {
			local22 = null;
			if (arg2.anApplet1 != null) {
				local22 = arg2.anApplet1.getParameter("haveie6");
			}
			if (local22 == null || !local22.equals("1")) {
				@Pc(42) Class20 local42 = Static504.method7418(arg2, 0, arg0);
				Static519.aClass283_5 = arg2;
				Static530.aClass20_9 = local42;
				Static343.aString137 = arg0;
				return;
			}
		}
		if (Static482.aString187.startsWith("mac")) {
			local22 = null;
			if (arg2.anApplet1 != null) {
				local22 = arg2.anApplet1.getParameter("havefirefox");
			}
			if (local22 != null && local22.equals("1") && arg3) {
				Static504.method7418(arg2, 1, arg0);
				return;
			}
		}
		Static504.method7418(arg2, 2, arg0);
	}
}
