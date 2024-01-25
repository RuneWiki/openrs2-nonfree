import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static192 {

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
	public static int anInt3512;

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "Lclient!et;")
	public static Class75 aClass75_1;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_53 = new Class96("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "Lclient!iq;")
	public static final Class1_Sub20 aClass1_Sub20_1 = new Class1_Sub20(0, 0);

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
	public static int anInt3513 = 0;

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_54 = new Class96("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_79 = new Class254(61, -1);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BIII)V")
	public static void method3011(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		Static228.aByteArrayArrayArray8 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)Z")
	public static boolean method3012(@OriginalArg(0) int arg0) {
		if (arg0 == 4 || arg0 == 44 || arg0 == 10 || arg0 == 49 || arg0 == 22) {
			return true;
		} else {
			return arg0 == 8 || arg0 == 1006;
		}
	}
}
