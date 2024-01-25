import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static153 {

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "I")
	public static int anInt2798;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "I")
	public static int anInt2799;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_53 = new Class231("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
	public static int anInt2793 = 0;

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_54 = new Class231("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_55 = new Class231("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)V")
	public static void method2302(@OriginalArg(1) boolean arg0) {
		if (Static216.aString73.length() == 0) {
			return;
		}
		Static338.method3179("--> " + Static216.aString73);
		Static254.method3553(Static216.aString73, arg0, false);
		Static243.anInt4160 = 0;
		Static216.aString73 = "";
		Static286.anInt5137 = 0;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)Z")
	public static boolean method2305(@OriginalArg(0) int arg0) {
		Static51.anInt840 = arg0 + 1 & 0xFFFF;
		Static89.aBoolean59 = true;
		return true;
	}
}
