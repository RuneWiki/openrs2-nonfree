import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
	public static int anInt8031;

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_222 = new Class202("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!sl", name = "h", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_223 = new Class202("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "Lclient!wo;")
	public static final Class316 aClass316_4 = new Class316();

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "[I")
	public static final int[] anIntArray612 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
	public static int anInt8032 = 0;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZLjava/lang/String;)I")
	public static int method6722(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static12.anInt264; local11++) {
			if (arg0.equalsIgnoreCase(Static145.aStringArray15[local11])) {
				return local11;
			}
		}
		return -1;
	}
}
