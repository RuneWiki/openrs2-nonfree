import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_93 = new Class21("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "J")
	public static long aLong171 = 0L;

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)I")
	public static int method4723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg2 & 0x1) == 1) {
			@Pc(12) int local12 = arg4;
			arg4 = arg0;
			arg0 = local12;
		}
		@Pc(20) int local20 = arg3 & 0x3;
		if (local20 == 0) {
			return arg1;
		} else if (local20 == 1) {
			return 1 + 7 - arg4 - arg5;
		} else if (local20 == 2) {
			return 8 - arg0 - arg1;
		} else {
			return arg5;
		}
	}
}
