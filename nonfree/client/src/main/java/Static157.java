import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_55 = new Class217(36, -1);

	@OriginalMember(owner = "client!hq", name = "g", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_56 = new Class217(22, 3);

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "[I")
	public static final int[] anIntArray203 = new int[14];

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_99 = new Class189("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method2539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg4 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(30) int local30 = Static37.aShort35 + local7 * (Static402.aShort91 - Static37.aShort35) / 100;
		@Pc(36) int local36 = arg2 * local30 >> 8;
		@Pc(43) int local43 = 16384 - arg0 & 0x3FFF;
		@Pc(49) int local49 = 16384 - arg1 & 0x3FFF;
		@Pc(51) int local51 = 0;
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = local36;
		if (local43 != 0) {
			local65 = -local36 * Class3_Sub2_Sub17.anIntArray289[local43] >> 15;
			local67 = Class3_Sub2_Sub17.anIntArray290[local43] * local36 >> 15;
		}
		if (local49 != 0) {
			local51 = local67 * Class3_Sub2_Sub17.anIntArray289[local49] >> 15;
			local67 = Class3_Sub2_Sub17.anIntArray290[local49] * local67 >> 15;
		}
		Static439.anInt7400 = arg6 - local65;
		Static445.anInt7524 = 0;
		Static445.anInt7532 = arg1;
		Static298.anInt5734 = arg0;
		Static276.anInt5105 = arg5 - local51;
		Static265.anInt5008 = arg3 - local67;
	}
}
