import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "I")
	public static int anInt6076;

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
	public static void method5391() {
		if (Static349.anIntArray330 != null) {
			return;
		}
		Static349.anIntArray330 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(39) double local39 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(77) double local77;
				if (local57 < 0.5D) {
					local77 = (local50 + 1.0D) * local57;
				} else {
					local77 = local50 + local57 - local50 * local57;
				}
				@Pc(95) double local95 = local57 * 2.0D - local77;
				@Pc(99) double local99 = local39 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local39 - 0.3333333333333333D;
				if (local113 < 0.0D) {
					local113++;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local95 + local39 * (local77 - local95) * 6.0D;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local77;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local95 + (local77 - local95) * 6.0D * (0.6666666666666666D - local39);
				} else {
					local61 = local95;
				}
				if (local99 * 6.0D < 1.0D) {
					local59 = local95 + (local77 - local95) * 6.0D * local99;
				} else if (local99 * 2.0D < 1.0D) {
					local59 = local77;
				} else if (local99 * 3.0D < 2.0D) {
					local59 = (0.6666666666666666D - local99) * (local77 - local95) * 6.0D + local95;
				} else {
					local59 = local95;
				}
				if (local113 * 6.0D < 1.0D) {
					local63 = (local77 - local95) * 6.0D * local113 + local95;
				} else if (local113 * 2.0D < 1.0D) {
					local63 = local77;
				} else if (local113 * 3.0D < 2.0D) {
					local63 = (local77 - local95) * (0.6666666666666666D - local113) * 6.0D + local95;
				} else {
					local63 = local95;
				}
			}
			local59 = Math.pow(local59, local19);
			local61 = Math.pow(local61, local19);
			local63 = Math.pow(local63, local19);
			@Pc(290) int local290 = (int) (local59 * 256.0D);
			@Pc(295) int local295 = (int) (local61 * 256.0D);
			@Pc(300) int local300 = (int) (local63 * 256.0D);
			@Pc(310) int local310 = (local295 << 8) + (local290 << 16) + local300;
			Static349.anIntArray330[local21] = local310;
		}
	}
}
