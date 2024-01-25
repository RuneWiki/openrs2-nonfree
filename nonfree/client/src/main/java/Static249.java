import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static249 {

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "Lclient!ho;")
	public static Class107 aClass107_1;

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "J")
	public static long aLong139 = 0L;

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)V")
	public static void method3854() {
		if (Static427.anIntArray525 != null) {
			return;
		}
		Static427.anIntArray525 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
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
					local80 = local60 + local53 - local53 * local60;
				}
				@Pc(97) double local97 = local60 * 2.0D - local80;
				@Pc(101) double local101 = local42 + 0.3333333333333333D;
				if (local101 > 1.0D) {
					local101--;
				}
				@Pc(115) double local115 = local42 - 0.3333333333333333D;
				if (local115 < 0.0D) {
					local115++;
				}
				if (local101 * 6.0D < 1.0D) {
					local62 = local97 + local101 * (local80 - local97) * 6.0D;
				} else if (local101 * 2.0D < 1.0D) {
					local62 = local80;
				} else if (local101 * 3.0D < 2.0D) {
					local62 = (local80 - local97) * (-local101 + 0.6666666666666666D) * 6.0D + local97;
				} else {
					local62 = local97;
				}
				if (local42 * 6.0D < 1.0D) {
					local64 = local97 + local42 * (local80 - local97) * 6.0D;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local80;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = local97 + (0.6666666666666666D - local42) * 6.0D * (local80 - local97);
				} else {
					local64 = local97;
				}
				if (local115 * 6.0D < 1.0D) {
					local66 = local115 * 6.0D * (local80 - local97) + local97;
				} else if (local115 * 2.0D < 1.0D) {
					local66 = local80;
				} else if (local115 * 3.0D < 2.0D) {
					local66 = local97 + (local80 - local97) * 6.0D * (0.6666666666666666D - local115);
				} else {
					local66 = local97;
				}
			}
			local62 = Math.pow(local62, local19);
			local64 = Math.pow(local64, local19);
			local66 = Math.pow(local66, local19);
			@Pc(296) int local296 = (int) (local62 * 256.0D);
			@Pc(301) int local301 = (int) (local64 * 256.0D);
			@Pc(306) int local306 = (int) (local66 * 256.0D);
			@Pc(316) int local316 = local306 + (local301 << 8) + (local296 << 16);
			Static427.anIntArray525[local29] = local316;
		}
	}
}
