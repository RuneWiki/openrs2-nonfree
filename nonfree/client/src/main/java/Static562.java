import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
	public static int anInt9418;

	@OriginalMember(owner = "client!vl", name = "y", descriptor = "F")
	public static float aFloat199;

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
	public static void method7747() {
		if (Static170.anIntArray696 != null) {
			return;
		}
		Static170.anIntArray696 = new int[65536];
		@Pc(27) double local27 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(29) int local29 = 0; local29 < 65536; local29++) {
			@Pc(42) double local42 = (double) (local29 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(53) double local53 = (double) (local29 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(60) double local60 = (double) (local29 & 0x7F) / 128.0D;
			@Pc(62) double local62 = local60;
			@Pc(64) double local64 = local60;
			@Pc(66) double local66 = local60;
			if (local53 != 0.0D) {
				@Pc(80) double local80;
				if (local60 < 0.5D) {
					local80 = (local53 + 1.0D) * local60;
				} else {
					local80 = local60 + local53 - local60 * local53;
				}
				@Pc(98) double local98 = local60 * 2.0D - local80;
				@Pc(102) double local102 = local42 + 0.3333333333333333D;
				if (local102 > 1.0D) {
					local102--;
				}
				@Pc(116) double local116 = local42 - 0.3333333333333333D;
				if (local102 * 6.0D < 1.0D) {
					local62 = (local80 - local98) * 6.0D * local102 + local98;
				} else if (local102 * 2.0D < 1.0D) {
					local62 = local80;
				} else if (local102 * 3.0D < 2.0D) {
					local62 = local98 + (local80 - local98) * 6.0D * (0.6666666666666666D - local102);
				} else {
					local62 = local98;
				}
				if (local116 < 0.0D) {
					local116++;
				}
				if (local42 * 6.0D < 1.0D) {
					local64 = local98 + (local80 - local98) * 6.0D * local42;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local80;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = local98 + (0.6666666666666666D - local42) * (-local98 + local80) * 6.0D;
				} else {
					local64 = local98;
				}
				if (local116 * 6.0D < 1.0D) {
					local66 = local98 + (local80 - local98) * 6.0D * local116;
				} else if (local116 * 2.0D < 1.0D) {
					local66 = local80;
				} else if (local116 * 3.0D < 2.0D) {
					local66 = local98 + (local80 - local98) * (-local116 + 0.6666666666666666D) * 6.0D;
				} else {
					local66 = local98;
				}
			}
			local62 = Math.pow(local62, local27);
			local64 = Math.pow(local64, local27);
			local66 = Math.pow(local66, local27);
			@Pc(296) int local296 = (int) (local62 * 256.0D);
			@Pc(301) int local301 = (int) (local64 * 256.0D);
			@Pc(306) int local306 = (int) (local66 * 256.0D);
			@Pc(316) int local316 = (local301 << 8) + (local296 << 16) + local306;
			Static170.anIntArray696[local29] = local316;
		}
	}
}
