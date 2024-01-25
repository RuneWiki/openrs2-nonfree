import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IFFF)F")
	public static float method3390(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * (arg1 - arg0) + arg0;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)Z")
	public static boolean method3391(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	public static void method3392() {
		if (Static351.anIntArray458 != null) {
			return;
		}
		Static351.anIntArray458 = new int[65536];
		@Pc(21) double local21 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < 512; local25++) {
			@Pc(37) float local37 = ((float) (local25 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(46) float local46 = (float) (local25 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(48) int local48 = 0; local48 < 128; local48++) {
				@Pc(54) float local54 = (float) local48 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local37 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(76) float local76 = local64 - (float) local67;
				@Pc(83) float local83 = local54 * (1.0F - local46);
				@Pc(91) float local91 = (1.0F - local76 * local46) * local54;
				@Pc(103) float local103 = local54 * (1.0F - (1.0F - local76) * local46);
				if (local71 == 0) {
					local58 = local103;
					local60 = local83;
					local56 = local54;
				} else if (local71 == 1) {
					local60 = local83;
					local56 = local91;
					local58 = local54;
				} else if (local71 == 2) {
					local56 = local83;
					local60 = local103;
					local58 = local54;
				} else if (local71 == 3) {
					local60 = local54;
					local58 = local91;
					local56 = local83;
				} else if (local71 == 4) {
					local58 = local83;
					local56 = local103;
					local60 = local54;
				} else if (local71 == 5) {
					local56 = local54;
					local58 = local83;
					local60 = local91;
				}
				local56 = (float) Math.pow((double) local56, local21);
				local58 = (float) Math.pow((double) local58, local21);
				local60 = (float) Math.pow((double) local60, local21);
				@Pc(195) int local195 = (int) (local56 * 256.0F);
				@Pc(200) int local200 = (int) (local58 * 256.0F);
				@Pc(205) int local205 = (int) (local60 * 256.0F);
				@Pc(218) int local218 = (local195 << 16) + (local200 << 8) + local205 - 16777216;
				Static351.anIntArray458[local23++] = local218;
			}
		}
	}
}
