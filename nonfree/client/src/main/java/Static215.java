import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "Lclient!ts;")
	public static Class193 aClass193_3;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_83 = new Class93("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_84 = new Class93("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
	public static int anInt4141 = 0;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
	public static void method3807() {
		for (@Pc(14) Class2_Sub11_Sub11 local14 = (Class2_Sub11_Sub11) Static260.aClass216_40.method5992(); local14 != null; local14 = (Class2_Sub11_Sub11) Static260.aClass216_40.method6000()) {
			@Pc(19) Class62_Sub1_Sub3 local19 = local14.aClass62_Sub1_Sub3_1;
			if (local19.aByte56 != Static182.anInt3603 || Static212.anInt4090 > local19.anInt2691) {
				local14.method5945();
				local19.method2615();
			} else if (local19.anInt2709 <= Static212.anInt4090) {
				if (local19.anInt2697 > 0) {
					@Pc(53) Class62_Sub1_Sub2_Sub1 local53 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local19.anInt2697 - 1];
					if (local53 != null && local53.anInt5289 >= 0 && Static95.anInt6381 * 128 > local53.anInt5289 && local53.anInt5280 >= 0 && Static237.anInt4532 * 128 > local53.anInt5280) {
						local19.method2614(Static138.method2745(local19.aByte56, local53.anInt5289, local53.anInt5280) - local19.anInt2681, Static212.anInt4090, local53.anInt5280, local53.anInt5289);
					}
				}
				if (local19.anInt2697 < 0) {
					@Pc(111) int local111 = -local19.anInt2697 - 1;
					@Pc(116) Class62_Sub1_Sub2_Sub2 local116;
					if (local111 == Static40.anInt797) {
						local116 = Static41.aClass62_Sub1_Sub2_Sub2_2;
					} else {
						local116 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local111];
					}
					if (local116 != null && local116.anInt5289 >= 0 && Static95.anInt6381 * 128 > local116.anInt5289 && local116.anInt5280 >= 0 && local116.anInt5280 < Static237.anInt4532 * 128) {
						local19.method2614(Static138.method2745(local19.aByte56, local116.anInt5289, local116.anInt5280) - local19.anInt2681, Static212.anInt4090, local116.anInt5280, local116.anInt5289);
					}
				}
				local19.method2609(Static220.anInt4246);
				Static289.method5131(local19, true);
			}
		}
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
	public static void method3811() {
		if (Static263.anInt5396 == 10 || Static263.anInt5396 == 28) {
			Static202.method3642(Static287.anInt5819 >> 10, Static290.anInt5837 >> 10);
		} else {
			Static202.method3642(Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0] >> 3, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0] >> 3);
		}
		Static208.method3730();
		Static19.method674();
		Static116.method2493();
		Static147.method415();
	}
}
