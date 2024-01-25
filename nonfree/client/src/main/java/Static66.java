import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Lclient!gf;")
	public static final Class96 aClass96_21 = new Class96("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!dc", name = "r", descriptor = "S")
	public static short aShort17 = 256;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIBI)V")
	public static void method992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class241 local9 = Static237.aClass241ArrayArray1[arg2][arg1];
		Static397.method5468(local9 == null ? Static181.aClass241_1 : local9, arg0);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZIBI)I")
	public static int method993(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) Class1_Sub13 local19 = Static379.method5347(arg2, arg0);
		if (local19 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(31) int local31 = 0;
			for (@Pc(33) int local33 = 0; local33 < local19.anIntArray80.length; local33++) {
				if (arg1 == local19.anIntArray82[local33]) {
					local31 += local19.anIntArray80[local33];
				}
			}
			return local31;
		}
	}
}
