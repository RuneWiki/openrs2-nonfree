import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!me", name = "O", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_77 = new Class231("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

	@OriginalMember(owner = "client!me", name = "U", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_106 = new Class25(61, 0);

	@OriginalMember(owner = "client!me", name = "X", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_78 = new Class231("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!me", name = "Z", descriptor = "[I")
	public static final int[] anIntArray390 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
	public static void method3538() {
		Static170.aClass188_31.method4156();
	}

	@OriginalMember(owner = "client!me", name = "f", descriptor = "(I)Z")
	public static boolean method3539() {
		if (Static303.aBoolean325) {
			try {
				if ((Boolean) Static471.method4356(Static138.aClass194_2.anApplet1, "showingVideoAd")) {
					return false;
				}
				return true;
			} catch (@Pc(24) Throwable local24) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IILjava/net/Socket;)Lclient!gl;")
	public static Class66 method3540(@OriginalArg(2) Socket arg0) throws IOException {
		return new Class66_Sub1(arg0, 5000);
	}
}
