import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "Lclient!de;")
	public static Class57 aClass57_2;

	@OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
	public static int anInt1860;

	@OriginalMember(owner = "client!lca", name = "k", descriptor = "Lclient!h;")
	public static final Class114 aClass114_33 = new Class114("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!lca", name = "r", descriptor = "Lclient!h;")
	public static final Class114 aClass114_34 = new Class114("Loading JAGMISC - ", "Lade JAGMISC - ", "Chargement JAGMISC - ", "Carregando JAGMISC - ");

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZ)Lclient!tda;")
	public static Class273 method1806(@OriginalArg(0) int arg0) {
		@Pc(11) Class273[] local11 = Static156.method3126();
		for (@Pc(13) int local13 = 0; local13 < local11.length; local13++) {
			if (arg0 == local11[local13].anInt7666) {
				return local11[local13];
			}
		}
		return null;
	}
}
