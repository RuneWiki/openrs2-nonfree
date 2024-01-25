import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "Lclient!pe;")
	public static Class240 aClass240_9;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "F")
	public static float aFloat193;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "Lclient!dm;")
	public static final Class73 aClass73_76 = new Class73();

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_276 = new Class88("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!lm", name = "v", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_150 = new Class45(50, 6);

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_277 = new Class88("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIIII)V")
	public static void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static208.aClass12_Sub10_Sub1_1.anInt2232 != 0 && arg3 != 0 && Static39.anInt790 < 50 && arg1 != -1) {
			Static308.aClass195Array1[Static39.anInt790++] = new Class195((byte) 2, arg1, arg3, arg0, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "(I)V")
	public static void method7817() {
		if (Static69.anIntArray673 != null) {
			return;
		}
		Static69.anIntArray673 = new int[65536];
		@Pc(28) double local28 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(30) int local30 = 0;
		for (@Pc(32) int local32 = 0; local32 < 512; local32++) {
			@Pc(45) float local45 = ((float) (local32 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(54) float local54 = (float) (local32 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(56) int local56 = 0; local56 < 128; local56++) {
				@Pc(63) float local63 = (float) local56 / 128.0F;
				@Pc(65) float local65 = 0.0F;
				@Pc(67) float local67 = 0.0F;
				@Pc(69) float local69 = 0.0F;
				@Pc(73) float local73 = local45 / 60.0F;
				@Pc(76) int local76 = (int) local73;
				@Pc(80) int local80 = local76 % 6;
				@Pc(85) float local85 = local73 - (float) local76;
				@Pc(92) float local92 = (1.0F - local54) * local63;
				@Pc(101) float local101 = local63 * (1.0F - local85 * local54);
				@Pc(112) float local112 = local63 * (1.0F - local54 * (1.0F - local85));
				if (local80 == 0) {
					local67 = local112;
					local69 = local92;
					local65 = local63;
				} else if (local80 == 1) {
					local67 = local63;
					local69 = local92;
					local65 = local101;
				} else if (local80 == 2) {
					local69 = local112;
					local67 = local63;
					local65 = local92;
				} else if (local80 == 3) {
					local69 = local63;
					local65 = local92;
					local67 = local101;
				} else if (local80 == 4) {
					local69 = local63;
					local67 = local92;
					local65 = local112;
				} else if (local80 == 5) {
					local67 = local92;
					local69 = local101;
					local65 = local63;
				}
				local65 = (float) Math.pow((double) local65, local28);
				local67 = (float) Math.pow((double) local67, local28);
				local69 = (float) Math.pow((double) local69, local28);
				@Pc(205) int local205 = (int) (local65 * 256.0F);
				@Pc(210) int local210 = (int) (local67 * 256.0F);
				@Pc(215) int local215 = (int) (local69 * 256.0F);
				@Pc(229) int local229 = (local205 << 16) + (local210 << 8) + local215 - 16777216;
				Static69.anIntArray673[local30++] = local229;
			}
		}
	}
}
