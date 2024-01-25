import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)Z")
	public static boolean method3281(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
	public static void method3282() {
		if (Static77.anIntArray130 != null) {
			return;
		}
		Static77.anIntArray130 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < 512; local23++) {
			@Pc(36) float local36 = ((float) (local23 >> 3) / 64.0F + 0.0078125F) * 360.0F;
			@Pc(45) float local45 = (float) (local23 & 0x7) / 8.0F + 0.0625F;
			for (@Pc(47) int local47 = 0; local47 < 128; local47++) {
				@Pc(54) float local54 = (float) local47 / 128.0F;
				@Pc(56) float local56 = 0.0F;
				@Pc(58) float local58 = 0.0F;
				@Pc(60) float local60 = 0.0F;
				@Pc(64) float local64 = local36 / 60.0F;
				@Pc(67) int local67 = (int) local64;
				@Pc(71) int local71 = local67 % 6;
				@Pc(77) float local77 = (float) -local67 + local64;
				@Pc(83) float local83 = (1.0F - local45) * local54;
				@Pc(92) float local92 = local54 * (1.0F - local45 * local77);
				@Pc(104) float local104 = (1.0F - (1.0F - local77) * local45) * local54;
				if (local71 == 0) {
					local60 = local83;
					local58 = local104;
					local56 = local54;
				} else if (local71 == 1) {
					local56 = local92;
					local60 = local83;
					local58 = local54;
				} else if (local71 == 2) {
					local60 = local104;
					local56 = local83;
					local58 = local54;
				} else if (local71 == 3) {
					local60 = local54;
					local56 = local83;
					local58 = local92;
				} else if (local71 == 4) {
					local58 = local83;
					local60 = local54;
					local56 = local104;
				} else if (local71 == 5) {
					local56 = local54;
					local60 = local92;
					local58 = local83;
				}
				local56 = (float) Math.pow((double) local56, local19);
				local58 = (float) Math.pow((double) local58, local19);
				local60 = (float) Math.pow((double) local60, local19);
				@Pc(192) int local192 = (int) (local56 * 256.0F);
				@Pc(197) int local197 = (int) (local58 * 256.0F);
				@Pc(202) int local202 = (int) (local60 * 256.0F);
				@Pc(216) int local216 = local202 + (local192 << 16) + (local197 << 8) - 16777216;
				Static77.anIntArray130[local21++] = local216;
			}
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!dda;Lclient!dda;I)V")
	public static void method3283(@OriginalArg(0) Class53 arg0, @OriginalArg(1) Class53 arg1) {
		Static521.aClass53_145 = arg0;
		Static425.aClass53_106 = arg1;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IBI)Z")
	public static boolean method3284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
