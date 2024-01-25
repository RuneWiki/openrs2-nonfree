import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
	public static int anInt3680;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "Lclient!kq;")
	public static final Class136 aClass136_6 = new Class136("WTI", 5);

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_81 = new Class55("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!rm;III)V")
	public static void method2994(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static194.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt7289 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass7_Sub30Array3[arg0.anInt7289++] = Static302.aClass74Array1[local21 - 1].aClass7_Sub30_2;
			local9 += 16L;
		}
		for (local21 = arg0.anInt7289; local21 < 4; local21++) {
			arg0.aClass7_Sub30Array3[local21] = null;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!fe;IZIZLclient!fe;)I")
	public static int method2996(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class19_Sub1 arg5) {
		@Pc(10) int local10 = Static164.method2383(arg5, arg1, arg2, arg3);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static164.method2383(arg5, arg1, arg4, arg0);
			return arg4 ? -local39 : local39;
		}
	}
}
