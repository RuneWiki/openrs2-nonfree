import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
	public static int anInt2970;

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)V")
	public static void method2751() {
		if (Static120.anIntArray152 != null) {
			return;
		}
		Static120.anIntArray152 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(41) double local41 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(79) double local79;
				if (local59 < 0.5D) {
					local79 = (local52 + 1.0D) * local59;
				} else {
					local79 = local52 + local59 - local52 * local59;
				}
				@Pc(95) double local95 = local59 * 2.0D - local79;
				@Pc(99) double local99 = local41 + 0.3333333333333333D;
				if (local99 > 1.0D) {
					local99--;
				}
				@Pc(113) double local113 = local41 - 0.3333333333333333D;
				if (local99 * 6.0D < 1.0D) {
					local61 = (local79 - local95) * 6.0D * local99 + local95;
				} else if (local99 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local99 * 3.0D < 2.0D) {
					local61 = local95 + (0.6666666666666666D - local99) * 6.0D * (local79 - local95);
				} else {
					local61 = local95;
				}
				if (local41 * 6.0D < 1.0D) {
					local63 = local95 + (local79 - local95) * 6.0D * local41;
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = local95 + (local79 - local95) * 6.0D * (0.6666666666666666D - local41);
				} else {
					local63 = local95;
				}
				if (local113 < 0.0D) {
					local113++;
				}
				if (local113 * 6.0D < 1.0D) {
					local65 = local95 + local113 * (local79 - local95) * 6.0D;
				} else if (local113 * 2.0D < 1.0D) {
					local65 = local79;
				} else if (local113 * 3.0D < 2.0D) {
					local65 = (local79 - local95) * (-local113 + 0.6666666666666666D) * 6.0D + local95;
				} else {
					local65 = local95;
				}
			}
			local61 = Math.pow(local61, local20);
			local63 = Math.pow(local63, local20);
			local65 = Math.pow(local65, local20);
			@Pc(293) int local293 = (int) (local61 * 256.0D);
			@Pc(298) int local298 = (int) (local63 * 256.0D);
			@Pc(303) int local303 = (int) (local65 * 256.0D);
			@Pc(314) int local314 = (local298 << 8) + (local293 << 16) + local303;
			Static120.anIntArray152[local22] = local314;
		}
	}
}
