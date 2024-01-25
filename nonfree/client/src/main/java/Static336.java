import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!mt", name = "f", descriptor = "F")
	public static float aFloat152;

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "F")
	public static float aFloat153;

	@OriginalMember(owner = "client!mt", name = "e", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_107 = new Class319(45, -1);

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_108 = new Class319(18, 8);

	@OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
	public static int anInt5967 = 1;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
	public static void method5019() {
		if (Static279.anIntArray313 != null) {
			return;
		}
		Static279.anIntArray313 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(25) int local25 = 0; local25 < 65536; local25++) {
			@Pc(38) double local38 = (double) (local25 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(49) double local49 = (double) (local25 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(56) double local56 = (double) (local25 & 0x7F) / 128.0D;
			@Pc(58) double local58 = local56;
			@Pc(60) double local60 = local56;
			@Pc(62) double local62 = local56;
			if (local49 != 0.0D) {
				@Pc(76) double local76;
				if (local56 < 0.5D) {
					local76 = local56 * (local49 + 1.0D);
				} else {
					local76 = local56 + local49 - local49 * local56;
				}
				@Pc(94) double local94 = local56 * 2.0D - local76;
				@Pc(98) double local98 = local38 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local38 - 0.3333333333333333D;
				if (local38 * 6.0D < 1.0D) {
					local60 = local94 + local38 * 6.0D * (local76 - local94);
				} else if (local38 * 2.0D < 1.0D) {
					local60 = local76;
				} else if (local38 * 3.0D < 2.0D) {
					local60 = local94 + (local76 - local94) * (0.6666666666666666D - local38) * 6.0D;
				} else {
					local60 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local98 * 6.0D < 1.0D) {
					local58 = local94 + (local76 - local94) * 6.0D * local98;
				} else if (local98 * 2.0D < 1.0D) {
					local58 = local76;
				} else if (local98 * 3.0D < 2.0D) {
					local58 = (0.6666666666666666D - local98) * 6.0D * (local76 - local94) + local94;
				} else {
					local58 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local62 = (local76 - local94) * 6.0D * local112 + local94;
				} else if (local112 * 2.0D < 1.0D) {
					local62 = local76;
				} else if (local112 * 3.0D < 2.0D) {
					local62 = local94 + (local76 - local94) * (0.6666666666666666D - local112) * 6.0D;
				} else {
					local62 = local94;
				}
			}
			local58 = Math.pow(local58, local19);
			local60 = Math.pow(local60, local19);
			local62 = Math.pow(local62, local19);
			@Pc(289) int local289 = (int) (local58 * 256.0D);
			@Pc(294) int local294 = (int) (local60 * 256.0D);
			@Pc(299) int local299 = (int) (local62 * 256.0D);
			@Pc(309) int local309 = local299 + (local294 << 8) + (local289 << 16);
			Static279.anIntArray313[local25] = local309;
		}
	}
}
