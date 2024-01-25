import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_64 = new Class159("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "I")
	public static int anInt1144 = 0;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_65 = new Class159("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	public static int anInt1146 = 1;

	@OriginalMember(owner = "client!cl", name = "t", descriptor = "I")
	public static int anInt1147 = 0;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method840(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = (local15 << 5) + (long) arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(II)Lclient!ao;")
	public static Class10_Sub1 method841(@OriginalArg(0) int arg0) {
		return Static2.aBoolean7 && Static140.anInt3220 <= arg0 && arg0 <= Static77.anInt2071 ? Static223.aClass10_Sub1Array2[arg0 - Static140.anInt3220] : null;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!tj;I)V")
	public static void method842(@OriginalArg(0) Class193 arg0) {
		Static56.aClass193_15 = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILclient!tj;)V")
	public static void method848(@OriginalArg(1) Class193 arg0) {
		Static134.aClass193_50 = arg0;
		Static134.aClass193_50.method5055(35);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IB)V")
	public static void method849() {
		Static40.aClass198_39.method5202(5);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)Lclient!fl;")
	public static Class8_Sub2 method852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static273.aClass128ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass8_Sub2_1;
	}
}
