import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static147 {

	@OriginalMember(owner = "client!h", name = "c", descriptor = "I")
	public static int anInt2653;

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_47 = new Class198("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_48 = new Class198("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!h", name = "e", descriptor = "I")
	public static int anInt2654 = -1;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Z")
	public static boolean method2135(@OriginalArg(1) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
