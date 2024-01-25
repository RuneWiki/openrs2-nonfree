import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static25 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	public static int anInt615;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public static int anInt618;

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Lclient!o;")
	public static Class137 aClass137_1;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_11 = new Class158("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!be", name = "n", descriptor = "[I")
	public static final int[] anIntArray45 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_8 = new Class177(59, -1);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
	public static void method517() {
		Static306.method4410();
		Static389.method5419(Static12.aClass34_Sub1_1.aBoolean443);
		Static193.aClass31_2 = Static176.method2982(0, Static150.aClass183_3, 22050, Static443.aCanvas33);
		Static193.aClass31_2.method2004(Static253.aClass1_Sub19_Sub3_3);
		Static99.aClass31_1 = Static176.method2982(1, Static150.aClass183_3, 2048, Static443.aCanvas33);
		Static99.aClass31_1.method2004(Static12.aClass1_Sub19_Sub2_1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)Z")
	public static boolean method518(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
	public static int method519(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
