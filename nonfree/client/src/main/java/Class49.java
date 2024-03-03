import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class Class49 {

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!h;")
	public static final Class89 aClass89_223 = new Class89(15, 10);

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "[S")
	public static final short[] aShortArray122 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_128 = new Class79("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "S")
	public static short aShort86 = 1;

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "Lclient!gd;")
	public static final Class79 aClass79_129;

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!h;")
	public static final Class89 aClass89_224;

	static {
		new Class79("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
		aClass79_129 = new Class79("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");
		aClass89_224 = new Class89(31, 8);
	}
}
