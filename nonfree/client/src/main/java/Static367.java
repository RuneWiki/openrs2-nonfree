import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!md", name = "l", descriptor = "I")
	public static int anInt5512;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ZJ)V")
	public static void method4842(@OriginalArg(1) long arg0) {
		Static33.aCalendar25.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!md", name = "c", descriptor = "(II)V")
	public static void method4847(@OriginalArg(0) int arg0) {
		Static456.anInt7332 = arg0;
		Static499.aClass352_55.method7659();
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method4849() {
		if (Static411.anIntArray448 != null) {
			return;
		}
		Static411.anIntArray448 = new int[65536];
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
					local80 = local53 + local60 - local53 * local60;
				}
				@Pc(96) double local96 = local60 * 2.0D - local80;
				@Pc(100) double local100 = local42 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local42 - 0.3333333333333333D;
				if (local100 * 6.0D < 1.0D) {
					local62 = local96 + local100 * (local80 - local96) * 6.0D;
				} else if (local100 * 2.0D < 1.0D) {
					local62 = local80;
				} else if (local100 * 3.0D < 2.0D) {
					local62 = (local80 - local96) * (0.6666666666666666D - local100) * 6.0D + local96;
				} else {
					local62 = local96;
				}
				if (local114 < 0.0D) {
					local114++;
				}
				if (local42 * 6.0D < 1.0D) {
					local64 = local96 + (local80 - local96) * 6.0D * local42;
				} else if (local42 * 2.0D < 1.0D) {
					local64 = local80;
				} else if (local42 * 3.0D < 2.0D) {
					local64 = (local80 - local96) * 6.0D * (0.6666666666666666D - local42) + local96;
				} else {
					local64 = local96;
				}
				if (local114 * 6.0D < 1.0D) {
					local66 = local96 + local114 * (local80 - local96) * 6.0D;
				} else if (local114 * 2.0D < 1.0D) {
					local66 = local80;
				} else if (local114 * 3.0D < 2.0D) {
					local66 = (0.6666666666666666D - local114) * 6.0D * (local80 - local96) + local96;
				} else {
					local66 = local96;
				}
			}
			local62 = Math.pow(local62, local27);
			local64 = Math.pow(local64, local27);
			local66 = Math.pow(local66, local27);
			@Pc(293) int local293 = (int) (local62 * 256.0D);
			@Pc(298) int local298 = (int) (local64 * 256.0D);
			@Pc(303) int local303 = (int) (local66 * 256.0D);
			@Pc(314) int local314 = local303 + (local293 << 16) + (local298 << 8);
			Static411.anIntArray448[local29] = local314;
		}
	}
}
