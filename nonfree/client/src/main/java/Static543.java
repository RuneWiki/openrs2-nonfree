import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
	public static int anInt9314;

	@OriginalMember(owner = "client!vg", name = "j", descriptor = "Lclient!kfa;")
	public static final Class181 aClass181_112 = new Class181(72, 2);

	@OriginalMember(owner = "client!vg", name = "m", descriptor = "[I")
	public static final int[] anIntArray810 = new int[1];

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
	public static void method7798() {
		if (Static223.anIntArray301 != null) {
			return;
		}
		Static223.anIntArray301 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(34) double local34 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(45) double local45 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(52) double local52 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(54) double local54 = local52;
			@Pc(56) double local56 = local52;
			@Pc(58) double local58 = local52;
			if (local45 != 0.0D) {
				@Pc(75) double local75;
				if (local52 < 0.5D) {
					local75 = (local45 + 1.0D) * local52;
				} else {
					local75 = local52 + local45 - local52 * local45;
				}
				@Pc(89) double local89 = local52 * 2.0D - local75;
				@Pc(93) double local93 = local34 + 0.3333333333333333D;
				if (local93 > 1.0D) {
					local93--;
				}
				@Pc(107) double local107 = local34 - 0.3333333333333333D;
				if (local34 * 6.0D < 1.0D) {
					local56 = local34 * (local75 - local89) * 6.0D + local89;
				} else if (local34 * 2.0D < 1.0D) {
					local56 = local75;
				} else if (local34 * 3.0D < 2.0D) {
					local56 = local89 + (local75 - local89) * 6.0D * (0.6666666666666666D - local34);
				} else {
					local56 = local89;
				}
				if (local93 * 6.0D < 1.0D) {
					local54 = local93 * (local75 - local89) * 6.0D + local89;
				} else if (local93 * 2.0D < 1.0D) {
					local54 = local75;
				} else if (local93 * 3.0D < 2.0D) {
					local54 = local89 + (local75 - local89) * 6.0D * (0.6666666666666666D - local93);
				} else {
					local54 = local89;
				}
				if (local107 < 0.0D) {
					local107++;
				}
				if (local107 * 6.0D < 1.0D) {
					local58 = local89 + local107 * 6.0D * (local75 - local89);
				} else if (local107 * 2.0D < 1.0D) {
					local58 = local75;
				} else if (local107 * 3.0D < 2.0D) {
					local58 = (local75 - local89) * 6.0D * (0.6666666666666666D - local107) + local89;
				} else {
					local58 = local89;
				}
			}
			local54 = Math.pow(local54, local19);
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			@Pc(287) int local287 = (int) (local54 * 256.0D);
			@Pc(292) int local292 = (int) (local56 * 256.0D);
			@Pc(297) int local297 = (int) (local58 * 256.0D);
			@Pc(309) int local309 = (local287 << 16) - (-(local292 << 8) - local297);
			Static223.anIntArray301[local21] = local309;
		}
	}
}
