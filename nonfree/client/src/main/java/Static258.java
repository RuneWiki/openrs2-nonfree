import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "I")
	public static int anInt5018;

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)V")
	public static void method4653() {
		if (Static107.anIntArray176 != null) {
			return;
		}
		Static107.anIntArray176 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(36) double local36 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(56) double local56 = local54;
			@Pc(58) double local58 = local54;
			@Pc(60) double local60 = local54;
			if (local47 != 0.0D) {
				@Pc(77) double local77;
				if (local54 < 0.5D) {
					local77 = local54 * (local47 + 1.0D);
				} else {
					local77 = local54 + local47 - local47 * local54;
				}
				@Pc(92) double local92 = local54 * 2.0D - local77;
				@Pc(96) double local96 = local36 + 0.3333333333333333D;
				if (local96 > 1.0D) {
					local96--;
				}
				@Pc(110) double local110 = local36 - 0.3333333333333333D;
				if (local96 * 6.0D < 1.0D) {
					local56 = local92 + (local77 - local92) * 6.0D * local96;
				} else if (local96 * 2.0D < 1.0D) {
					local56 = local77;
				} else if (local96 * 3.0D < 2.0D) {
					local56 = local92 + (local77 - local92) * 6.0D * (0.6666666666666666D - local96);
				} else {
					local56 = local92;
				}
				if (local36 * 6.0D < 1.0D) {
					local58 = local36 * (local77 - local92) * 6.0D + local92;
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local77;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = local92 + (local77 - local92) * (-local36 + 0.6666666666666666D) * 6.0D;
				} else {
					local58 = local92;
				}
				if (local110 < 0.0D) {
					local110++;
				}
				if (local110 * 6.0D < 1.0D) {
					local60 = local92 + (local77 - local92) * 6.0D * local110;
				} else if (local110 * 2.0D < 1.0D) {
					local60 = local77;
				} else if (local110 * 3.0D < 2.0D) {
					local60 = local92 + (0.6666666666666666D - local110) * 6.0D * (local77 - local92);
				} else {
					local60 = local92;
				}
			}
			local56 = Math.pow(local56, local20);
			local58 = Math.pow(local58, local20);
			local60 = Math.pow(local60, local20);
			@Pc(288) int local288 = (int) (local56 * 256.0D);
			@Pc(293) int local293 = (int) (local58 * 256.0D);
			@Pc(298) int local298 = (int) (local60 * 256.0D);
			@Pc(308) int local308 = local298 + (local288 << 16) + (local293 << 8);
			Static107.anIntArray176[local22] = local308;
		}
	}
}
