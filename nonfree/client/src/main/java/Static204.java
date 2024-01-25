import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_47 = new Class208(22, 4);

	@OriginalMember(owner = "client!ht", name = "A", descriptor = "Z")
	public static boolean aBoolean276 = true;

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)Z")
	public static boolean method3114(@OriginalArg(0) int arg0) {
		return arg0 == 0;
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
	public static void method3116() {
		if (Static281.anIntArray289 != null) {
			return;
		}
		Static281.anIntArray289 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
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
				@Pc(89) float local89 = (1.0F - local50) * local59;
				@Pc(98) float local98 = (1.0F - local82 * local50) * local59;
				@Pc(109) float local109 = (1.0F - local50 * (1.0F - local82)) * local59;
				if (local76 == 0) {
					local63 = local109;
					local65 = local89;
					local61 = local59;
				} else if (local76 == 1) {
					local61 = local98;
					local65 = local89;
					local63 = local59;
				} else if (local76 == 2) {
					local63 = local59;
					local61 = local89;
					local65 = local109;
				} else if (local76 == 3) {
					local65 = local59;
					local61 = local89;
					local63 = local98;
				} else if (local76 == 4) {
					local63 = local89;
					local65 = local59;
					local61 = local109;
				} else if (local76 == 5) {
					local63 = local89;
					local65 = local98;
					local61 = local59;
				}
				local61 = (float) Math.pow((double) local61, local19);
				local63 = (float) Math.pow((double) local63, local19);
				local65 = (float) Math.pow((double) local65, local19);
				@Pc(202) int local202 = (int) (local61 * 256.0F);
				@Pc(207) int local207 = (int) (local63 * 256.0F);
				@Pc(212) int local212 = (int) (local65 * 256.0F);
				@Pc(225) int local225 = local212 + (local207 << 8) + (local202 << 16) - 16777216;
				Static281.anIntArray289[local21++] = local225;
			}
		}
	}
}
