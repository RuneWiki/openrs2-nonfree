import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "Lclient!of;")
	public static final Class174 aClass174_181 = new Class174("Your friends list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

	@OriginalMember(owner = "client!sn", name = "y", descriptor = "Ljava/lang/String;")
	public static String aString60 = "";

	@OriginalMember(owner = "client!sn", name = "C", descriptor = "Lclient!ip;")
	public static final Class111 aClass111_10 = new Class111("", 17);

	@OriginalMember(owner = "client!sn", name = "D", descriptor = "Lclient!la;")
	public static final Class136 aClass136_174 = new Class136(37, -1);

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(BII)B")
	public static byte method5247(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBIIII)I")
	public static int method5250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static178.aClass55Array1 == null) {
			return 0;
		}
		if (arg0 < 3) {
			@Pc(21) int local21 = arg2 >> 7;
			@Pc(25) int local25 = arg3 >> 7;
			if (arg1 < 0 || arg4 < 0 || arg1 > Static373.anInt6324 - 1 || Static291.anInt5062 - 1 < arg4) {
				return 0;
			}
			if (local21 < 1 || local25 < 1 || local21 > Static373.anInt6324 - 1 || Static291.anInt5062 - 1 < local25) {
				return 0;
			}
			@Pc(95) boolean local95 = (Static360.aByteArrayArrayArray16[1][arg2 >> 7][arg3 >> 7] & 0x2) != 0;
			@Pc(117) boolean local117;
			@Pc(136) boolean local136;
			if ((arg2 & 0x7F) == 0) {
				local117 = (Static360.aByteArrayArrayArray16[1][local21 - 1][arg3 >> 7] & 0x2) != 0;
				local136 = (Static360.aByteArrayArrayArray16[1][local21][arg3 >> 7] & 0x2) != 0;
				if (local136 != local117) {
					local95 = (Static360.aByteArrayArrayArray16[1][arg1][arg4] & 0x2) != 0;
				}
			}
			if ((arg3 & 0x7F) == 0) {
				local117 = (Static360.aByteArrayArrayArray16[1][arg2 >> 7][local25 - 1] & 0x2) != 0;
				local136 = (Static360.aByteArrayArrayArray16[1][arg2 >> 7][local25] & 0x2) != 0;
				if (local136 != local117) {
					local95 = (Static360.aByteArrayArrayArray16[1][arg1][arg4] & 0x2) != 0;
				}
			}
			if (local95) {
				arg0++;
			}
		}
		return Static178.aClass55Array1[arg0].R(arg2, arg3);
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V")
	public static void method5251() {
		if (Static225.anIntArray253 != null) {
			return;
		}
		Static225.anIntArray253 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < 512; local28++) {
			@Pc(41) float local41 = ((float) (local28 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(50) float local50 = (float) (local28 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(52) int local52 = 0; local52 < 128; local52++) {
				@Pc(59) float local59 = (float) local52 / 128.0F;
				@Pc(61) float local61 = 0.0F;
				@Pc(63) float local63 = 0.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(69) float local69 = local41 / 60.0F;
				@Pc(72) int local72 = (int) local69;
				@Pc(76) int local76 = local72 % 6;
				@Pc(82) float local82 = (float) -local72 + local69;
				@Pc(89) float local89 = local59 * (1.0F - local50);
				@Pc(98) float local98 = local59 * (1.0F - local50 * local82);
				@Pc(110) float local110 = local59 * (1.0F - (1.0F - local82) * local50);
				if (local76 == 0) {
					local65 = local89;
					local61 = local59;
					local63 = local110;
				} else if (local76 == 1) {
					local61 = local98;
					local65 = local89;
					local63 = local59;
				} else if (local76 == 2) {
					local63 = local59;
					local65 = local110;
					local61 = local89;
				} else if (local76 == 3) {
					local61 = local89;
					local63 = local98;
					local65 = local59;
				} else if (local76 == 4) {
					local61 = local110;
					local63 = local89;
					local65 = local59;
				} else if (local76 == 5) {
					local61 = local59;
					local65 = local98;
					local63 = local89;
				}
				local61 = (float) Math.pow((double) local61, local24);
				local63 = (float) Math.pow((double) local63, local24);
				local65 = (float) Math.pow((double) local65, local24);
				@Pc(202) int local202 = (int) (local61 * 256.0F);
				@Pc(207) int local207 = (int) (local63 * 256.0F);
				@Pc(212) int local212 = (int) (local65 * 256.0F);
				@Pc(225) int local225 = (local202 << 16) + (local207 << 8) + local212 - 16777216;
				Static225.anIntArray253[local26++] = local225;
			}
		}
	}
}
