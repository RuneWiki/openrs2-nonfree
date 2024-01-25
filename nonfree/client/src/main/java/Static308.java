import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
	public static int anInt6687;

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "J")
	public static volatile long aLong253 = 0L;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)V")
	public static void method5553() {
		if (Static133.anIntArray277 != null) {
			return;
		}
		Static133.anIntArray277 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(27) int local27 = 0; local27 < 65536; local27++) {
			@Pc(41) double local41 = (double) (local27 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local27 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local27 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(82) double local82;
				if (local59 < 0.5D) {
					local82 = (local52 + 1.0D) * local59;
				} else {
					local82 = local52 + local59 - local59 * local52;
				}
				@Pc(97) double local97 = local59 * 2.0D - local82;
				@Pc(101) double local101 = local41 + 0.3333333333333333D;
				if (local101 > 1.0D) {
					local101--;
				}
				@Pc(115) double local115 = local41 - 0.3333333333333333D;
				if (local115 < 0.0D) {
					local115++;
				}
				if (local41 * 6.0D < 1.0D) {
					local63 = (local82 - local97) * 6.0D * local41 + local97;
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local82;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = local97 + (local82 - local97) * (0.6666666666666666D - local41) * 6.0D;
				} else {
					local63 = local97;
				}
				if (local101 * 6.0D < 1.0D) {
					local61 = local97 + local101 * 6.0D * (local82 - local97);
				} else if (local101 * 2.0D < 1.0D) {
					local61 = local82;
				} else if (local101 * 3.0D < 2.0D) {
					local61 = (local82 - local97) * 6.0D * (0.6666666666666666D - local101) + local97;
				} else {
					local61 = local97;
				}
				if (local115 * 6.0D < 1.0D) {
					local65 = local97 + local115 * 6.0D * (local82 - local97);
				} else if (local115 * 2.0D < 1.0D) {
					local65 = local82;
				} else if (local115 * 3.0D < 2.0D) {
					local65 = local97 + (local82 - local97) * 6.0D * (0.6666666666666666D - local115);
				} else {
					local65 = local97;
				}
			}
			local61 = Math.pow(local61, local20);
			local63 = Math.pow(local63, local20);
			local65 = Math.pow(local65, local20);
			@Pc(294) int local294 = (int) (local61 * 256.0D);
			@Pc(299) int local299 = (int) (local63 * 256.0D);
			@Pc(304) int local304 = (int) (local65 * 256.0D);
			@Pc(314) int local314 = local304 + (local299 << 8) + (local294 << 16);
			Static133.anIntArray277[local27] = local314;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZI)V")
	public static void method5554(@OriginalArg(1) int arg0) {
		Static346.method5624();
		Static344.method5597();
		@Pc(12) int local12 = Static22.method397(arg0).anInt6348;
		if (local12 == 0) {
			return;
		}
		@Pc(28) int local28 = Static103.anIntArray295[arg0];
		if (local12 == 5) {
			Static82.anInt1737 = local28;
		}
		if (local12 == 9) {
			Static252.anInt5237 = local28;
		}
		if (local12 == 6) {
			Static297.anInt6003 = local28;
		}
	}
}
