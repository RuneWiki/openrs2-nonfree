import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_131 = new Class67("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_132 = new Class67("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!sca", name = "m", descriptor = "Lclient!raa;")
	public static final Class253 aClass253_13 = new Class253("LOCAL", 4);

	@OriginalMember(owner = "client!sca", name = "o", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_144 = new Class133(93, 10);

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
	public static void method6637() {
		Static333.method5283(10);
		Static356.method5584();
		System.gc();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIB)Z")
	public static boolean method6638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
