import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V")
	public static void method6659() {
		if (Static373.anIntArray469 != null) {
			return;
		}
		Static373.anIntArray469 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < 512; local21++) {
			@Pc(34) float local34 = ((float) (local21 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(43) float local43 = (float) (local21 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(45) int local45 = 0; local45 < 128; local45++) {
				@Pc(51) float local51 = (float) local45 / 128.0F;
				@Pc(53) float local53 = 0.0F;
				@Pc(55) float local55 = 0.0F;
				@Pc(57) float local57 = 0.0F;
				@Pc(61) float local61 = local34 / 60.0F;
				@Pc(64) int local64 = (int) local61;
				@Pc(68) int local68 = local64 % 6;
				@Pc(73) float local73 = local61 - (float) local64;
				@Pc(80) float local80 = local51 * (1.0F - local43);
				@Pc(89) float local89 = (1.0F - local73 * local43) * local51;
				@Pc(99) float local99 = (1.0F - local43 * (1.0F - local73)) * local51;
				if (local68 == 0) {
					local55 = local99;
					local53 = local51;
					local57 = local80;
				} else if (local68 == 1) {
					local57 = local80;
					local53 = local89;
					local55 = local51;
				} else if (local68 == 2) {
					local55 = local51;
					local53 = local80;
					local57 = local99;
				} else if (local68 == 3) {
					local55 = local89;
					local53 = local80;
					local57 = local51;
				} else if (local68 == 4) {
					local57 = local51;
					local55 = local80;
					local53 = local99;
				} else if (local68 == 5) {
					local53 = local51;
					local57 = local89;
					local55 = local80;
				}
				local53 = (float) Math.pow((double) local53, local17);
				local55 = (float) Math.pow((double) local55, local17);
				local57 = (float) Math.pow((double) local57, local17);
				@Pc(189) int local189 = (int) (local53 * 256.0F);
				@Pc(194) int local194 = (int) (local55 * 256.0F);
				@Pc(199) int local199 = (int) (local57 * 256.0F);
				@Pc(212) int local212 = local199 + (local189 << 16) + (local194 << 8) - 16777216;
				Static373.anIntArray469[local19++] = local212;
			}
		}
	}
}
