import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!no", name = "g", descriptor = "Lclient!tda;")
	public static Class5_Sub15_Sub4 aClass5_Sub15_Sub4_3;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_150 = new Class150(44, 20);

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)V")
	public static void method5136() {
		if (Static403.anIntArray560 != null) {
			return;
		}
		Static403.anIntArray560 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
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
				@Pc(81) float local81 = local69 - (float) local72;
				@Pc(88) float local88 = (1.0F - local50) * local59;
				@Pc(97) float local97 = local59 * (1.0F - local50 * local81);
				@Pc(108) float local108 = (1.0F - (1.0F - local81) * local50) * local59;
				if (local76 == 0) {
					local65 = local88;
					local63 = local108;
					local61 = local59;
				} else if (local76 == 1) {
					local65 = local88;
					local61 = local97;
					local63 = local59;
				} else if (local76 == 2) {
					local63 = local59;
					local65 = local108;
					local61 = local88;
				} else if (local76 == 3) {
					local63 = local97;
					local65 = local59;
					local61 = local88;
				} else if (local76 == 4) {
					local61 = local108;
					local63 = local88;
					local65 = local59;
				} else if (local76 == 5) {
					local65 = local97;
					local61 = local59;
					local63 = local88;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(202) int local202 = (int) (local61 * 256.0F);
				@Pc(207) int local207 = (int) (local63 * 256.0F);
				@Pc(212) int local212 = (int) (local65 * 256.0F);
				@Pc(224) int local224 = local212 + (local202 << 16) + (local207 << 8) - 16777216;
				Static403.anIntArray560[local26++] = local224;
			}
		}
	}
}
