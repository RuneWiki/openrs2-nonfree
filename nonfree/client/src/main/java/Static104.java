import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static104 {

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "Z")
	public static boolean aBoolean182;

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "Lclient!mq;")
	public static Class212 aClass212_1;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
	public static final int anInt2591 = 1;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "[I")
	public static final int[] anIntArray85 = new int[14];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)V")
	public static void method2175() {
		if (Static422.anIntArray428 != null) {
			return;
		}
		Static422.anIntArray428 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(77) double local77;
				if (local57 < 0.5D) {
					local77 = (local50 + 1.0D) * local57;
				} else {
					local77 = local57 + local50 - local50 * local57;
				}
				@Pc(93) double local93 = local57 * 2.0D - local77;
				@Pc(97) double local97 = local39 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local39 - 0.3333333333333333D;
				if (local111 < 0.0D) {
					local111++;
				}
				if (local97 * 6.0D < 1.0D) {
					local59 = (local77 - local93) * 6.0D * local97 + local93;
				} else if (local97 * 2.0D < 1.0D) {
					local59 = local77;
				} else if (local97 * 3.0D < 2.0D) {
					local59 = local93 + (local77 - local93) * 6.0D * (0.6666666666666666D - local97);
				} else {
					local59 = local93;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = (local77 - local93) * 6.0D * local39 + local93;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local77;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local93 + (0.6666666666666666D - local39) * 6.0D * (local77 - local93);
				} else {
					local61 = local93;
				}
				if (local111 * 6.0D < 1.0D) {
					local63 = local93 + (local77 - local93) * 6.0D * local111;
				} else if (local111 * 2.0D < 1.0D) {
					local63 = local77;
				} else if (local111 * 3.0D < 2.0D) {
					local63 = (0.6666666666666666D - local111) * 6.0D * (local77 - local93) + local93;
				} else {
					local63 = local93;
				}
			}
			local59 = Math.pow(local59, local19);
			local61 = Math.pow(local61, local19);
			local63 = Math.pow(local63, local19);
			@Pc(289) int local289 = (int) (local59 * 256.0D);
			@Pc(294) int local294 = (int) (local61 * 256.0D);
			@Pc(299) int local299 = (int) (local63 * 256.0D);
			@Pc(309) int local309 = local299 + (local289 << 16) + (local294 << 8);
			Static422.anIntArray428[local26] = local309;
		}
	}
}
