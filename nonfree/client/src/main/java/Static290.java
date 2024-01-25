import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!om", name = "Cb", descriptor = "I")
	public static int anInt5115;

	@OriginalMember(owner = "client!om", name = "Gb", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_68 = new Class84("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!om", name = "Hb", descriptor = "Z")
	public static boolean aBoolean332 = true;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "(II)V")
	public static void method4151(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static403.anInt6978 - Static411.anInt7189;
		if (local7 >= 100) {
			Static310.anInt5540 = 1;
			return;
		}
		@Pc(18) int local18 = (int) Static144.aFloat36;
		if (local18 < Static275.anInt221 >> 8) {
			local18 = Static275.anInt221 >> 8;
		}
		if (Static193.aBooleanArray3[4] && local18 < Static129.anIntArray212[4] + 128) {
			local18 = Static129.anIntArray212[4] + 128;
		}
		@Pc(55) int local55 = Static12.anInt322 + (int) Static274.aFloat78 & 0x3FFF;
		Static32.method559(Static289.method4078(Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068, Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065, Static152.anInt2600) - 50, (local18 >> 3) * 3 + 600 << 0, Static202.anInt3669, Static220.anInt3977, arg0, local18, local55);
		@Pc(104) float local104 = 1.0F - (float) ((100 - local7) * (-local7 + 100) * (100 - local7)) / 1000000.0F;
		Static306.anInt5497 = (int) ((float) Static412.anInt7192 + (float) (Static306.anInt5497 - Static412.anInt7192) * local104);
		Static239.anInt4284 = (int) ((float) (Static239.anInt4284 - Static293.anInt5152) * local104 + (float) Static293.anInt5152);
		Static402.anInt6941 = (int) ((float) (Static402.anInt6941 - Static179.anInt3226) * local104 + (float) Static179.anInt3226);
		Static254.anInt4567 = (int) ((float) (Static254.anInt4567 - Static419.anInt7274) * local104 + (float) Static419.anInt7274);
		@Pc(155) int local155 = Static94.anInt1775 - Static162.anInt2966;
		if (local155 > 8192) {
			local155 -= 16384;
		} else if (local155 < -8192) {
			local155 += 16384;
		}
		Static94.anInt1775 = (int) ((float) local155 * local104 + (float) Static162.anInt2966);
		Static94.anInt1775 &= 0x3FFF;
	}
}
