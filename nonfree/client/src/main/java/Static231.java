import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
	public static int anInt4426;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	public static int anInt4427 = -50;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public static void method3705() {
		if (Static274.anIntArray337 != null) {
			return;
		}
		Static274.anIntArray337 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(21) int local21 = 0; local21 < 65536; local21++) {
			@Pc(34) double local34 = (double) (local21 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(45) double local45 = (double) (local21 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(52) double local52 = (double) (local21 & 0x7F) / 128.0D;
			@Pc(54) double local54 = local52;
			@Pc(56) double local56 = local52;
			@Pc(58) double local58 = local52;
			if (local45 != 0.0D) {
				@Pc(72) double local72;
				if (local52 < 0.5D) {
					local72 = (local45 + 1.0D) * local52;
				} else {
					local72 = local52 + local45 - local52 * local45;
				}
				@Pc(89) double local89 = local52 * 2.0D - local72;
				@Pc(93) double local93 = local34 + 0.3333333333333333D;
				if (local93 > 1.0D) {
					local93--;
				}
				@Pc(107) double local107 = local34 - 0.3333333333333333D;
				if (local34 * 6.0D < 1.0D) {
					local56 = local89 + (local72 - local89) * 6.0D * local34;
				} else if (local34 * 2.0D < 1.0D) {
					local56 = local72;
				} else if (local34 * 3.0D < 2.0D) {
					local56 = local89 + (local72 - local89) * (0.6666666666666666D - local34) * 6.0D;
				} else {
					local56 = local89;
				}
				if (local107 < 0.0D) {
					local107++;
				}
				if (local93 * 6.0D < 1.0D) {
					local54 = local93 * 6.0D * (local72 - local89) + local89;
				} else if (local93 * 2.0D < 1.0D) {
					local54 = local72;
				} else if (local93 * 3.0D < 2.0D) {
					local54 = local89 + (0.6666666666666666D - local93) * 6.0D * (local72 - local89);
				} else {
					local54 = local89;
				}
				if (local107 * 6.0D < 1.0D) {
					local58 = local89 + local107 * (local72 - local89) * 6.0D;
				} else if (local107 * 2.0D < 1.0D) {
					local58 = local72;
				} else if (local107 * 3.0D < 2.0D) {
					local58 = (local72 - local89) * (-local107 + 0.6666666666666666D) * 6.0D + local89;
				} else {
					local58 = local89;
				}
			}
			local54 = Math.pow(local54, local19);
			local56 = Math.pow(local56, local19);
			local58 = Math.pow(local58, local19);
			@Pc(289) int local289 = (int) (local54 * 256.0D);
			@Pc(294) int local294 = (int) (local56 * 256.0D);
			@Pc(299) int local299 = (int) (local58 * 256.0D);
			@Pc(309) int local309 = (local289 << 16) + (local294 << 8) + local299;
			Static274.anIntArray337[local21] = local309;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Z")
	public static boolean method3708(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)S")
	public static short method3710(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(37) int local37 = local19 <= 64 ? local15 * local19 >> 7 : local15 * (127 - local19) >> 7;
		@Pc(41) int local41 = local19 + local37;
		@Pc(54) int local54;
		if (local41 == 0) {
			local54 = local37 << 1;
		} else {
			local54 = (local37 << 8) / local41;
		}
		return (short) (local41 | local54 >> 4 << 7 | local9 << 10);
	}
}
