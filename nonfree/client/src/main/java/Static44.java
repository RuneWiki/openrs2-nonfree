import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "F")
	public static float aFloat8;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!ph;")
	public static Class190 aClass190_2;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_26 = new Class151("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_32 = new Class214(16, 7);

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZI)V")
	public static void method688(@OriginalArg(1) int arg0) {
		Static373.anInt6618 = arg0;
		Static325.aClass167_75.method3390();
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Z")
	public static boolean method689() {
		if (Static290.aBoolean384) {
			try {
				Static460.method3422("showVideoAd", Static41.aClass124_2.anApplet1);
				return true;
			} catch (@Pc(19) Throwable local19) {
			}
		}
		return false;
	}
}
