import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static59 {

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_18 = new Class67("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour...", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(B)V")
	public static void method1189() {
		Static179.anInt4933 = 0;
		Static255.aClass71_43.method2088();
		Static228.aBoolean342 = false;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(FFBF)F")
	public static float method1192(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2) {
		return arg2 + arg1 * (arg0 - arg2);
	}
}
