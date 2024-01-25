import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!um", name = "l", descriptor = "[S")
	public static short[] aShortArray113 = new short[256];

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
	public static void method5599() {
		if (Static81.anIntArray100 != null) {
			return;
		}
		Static81.anIntArray100 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(40) double local40 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(51) double local51 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(58) double local58 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(60) double local60 = local58;
			@Pc(62) double local62 = local58;
			@Pc(64) double local64 = local58;
			if (local51 != 0.0D) {
				@Pc(78) double local78;
				if (local58 < 0.5D) {
					local78 = (local51 + 1.0D) * local58;
				} else {
					local78 = local51 + local58 - local51 * local58;
				}
				@Pc(96) double local96 = local58 * 2.0D - local78;
				@Pc(100) double local100 = local40 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local40 - 0.3333333333333333D;
				if (local40 * 6.0D < 1.0D) {
					local62 = local40 * (local78 - local96) * 6.0D + local96;
				} else if (local40 * 2.0D < 1.0D) {
					local62 = local78;
				} else if (local40 * 3.0D < 2.0D) {
					local62 = local96 + (local78 - local96) * (0.6666666666666666D - local40) * 6.0D;
				} else {
					local62 = local96;
				}
				if (local100 * 6.0D < 1.0D) {
					local60 = (local78 - local96) * 6.0D * local100 + local96;
				} else if (local100 * 2.0D < 1.0D) {
					local60 = local78;
				} else if (local100 * 3.0D < 2.0D) {
					local60 = local96 + (0.6666666666666666D - local100) * (local78 - local96) * 6.0D;
				} else {
					local60 = local96;
				}
				if (local114 < 0.0D) {
					local114++;
				}
				if (local114 * 6.0D < 1.0D) {
					local64 = local96 + local114 * 6.0D * (local78 - local96);
				} else if (local114 * 2.0D < 1.0D) {
					local64 = local78;
				} else if (local114 * 3.0D < 2.0D) {
					local64 = local96 + (local78 - local96) * (0.6666666666666666D - local114) * 6.0D;
				} else {
					local64 = local96;
				}
			}
			local60 = Math.pow(local60, local20);
			local62 = Math.pow(local62, local20);
			local64 = Math.pow(local64, local20);
			@Pc(292) int local292 = (int) (local60 * 256.0D);
			@Pc(297) int local297 = (int) (local62 * 256.0D);
			@Pc(302) int local302 = (int) (local64 * 256.0D);
			@Pc(312) int local312 = local302 + (local297 << 8) + (local292 << 16);
			Static81.anIntArray100[local26] = local312;
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)V")
	public static void method5604() {
		Static210.aClass26_39.method333();
	}
}
