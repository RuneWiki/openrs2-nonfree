import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!po", name = "g", descriptor = "Lclient!id;")
	public static final Class142 aClass142_17 = new Class142("", 11);

	@OriginalMember(owner = "client!po", name = "h", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_117 = new Class40("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!po", name = "i", descriptor = "I")
	public static int anInt7374 = -1;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(III)I")
	public static int method6003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 >> 31 & arg1 - 1;
		return local11 + ((arg0 >>> 31) + arg0) % arg1;
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(BII)Z")
	public static boolean method6005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static124.method2347(arg0, arg1) || Static119.method2282(arg1, arg0);
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!aj;)V")
	public static void method6007(@OriginalArg(1) Class5_Sub3_Sub1 arg0) {
		arg0.method519();
		@Pc(10) int local10 = Static510.anInt8653;
		@Pc(20) Class15_Sub2_Sub1_Sub1 local20 = Static35.aClass15_Sub2_Sub1_Sub1_1 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local10] = new Class15_Sub2_Sub1_Sub1();
		local20.anInt4745 = local10;
		@Pc(28) int local28 = arg0.method524(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray306[0] = local39 - Static515.anInt3214;
		local20.anInt8492 = (local20.anIntArray306[0] << 7) + (local20.method4035() << 6);
		local20.anIntArray307[0] = local43 - Static338.anInt6353;
		local20.anInt8493 = (local20.anIntArray307[0] << 7) + (local20.method4035() << 6);
		Static367.anInt6860 = local20.aByte91 = local33;
		if (Static294.aClass5_Sub3Array2[local10] != null) {
			local20.method803(Static294.aClass5_Sub3Array2[local10]);
		}
		Static103.anInt992 = 0;
		Static523.anIntArray682[Static103.anInt992++] = local10;
		Static92.aByteArray31[local10] = 0;
		Static427.anInt7533 = 0;
		for (@Pc(121) int local121 = 1; local121 < 2048; local121++) {
			if (local121 != local10) {
				@Pc(131) int local131 = arg0.method524(18);
				@Pc(135) int local135 = local131 >> 16;
				@Pc(141) int local141 = local131 >> 8 & 0xFF;
				@Pc(145) int local145 = local131 & 0xFF;
				@Pc(153) Class205 local153 = Static543.aClass205Array2[local121] = new Class205();
				local153.anInt6255 = local145 + (local141 << 14) + (local135 << 28);
				local153.anInt6253 = 0;
				local153.aBoolean427 = false;
				local153.anInt6254 = -1;
				Static412.anIntArray568[Static427.anInt7533++] = local121;
				Static92.aByteArray31[local121] = 0;
			}
		}
		arg0.method532();
	}
}
