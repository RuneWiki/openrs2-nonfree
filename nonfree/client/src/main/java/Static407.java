import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "[Lclient!mk;")
	public static Class28_Sub2_Sub1_Sub1[] aClass28_Sub2_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
	public static int anInt7040;

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
	public static int anInt7039 = 0;

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
	public static int anInt7041 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method5650() {
		if (Static64.anIntArray85 != null) {
			return;
		}
		Static64.anIntArray85 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(40) double local40 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(51) double local51 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(58) double local58 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(60) double local60 = local58;
			@Pc(62) double local62 = local58;
			@Pc(64) double local64 = local58;
			if (local51 != 0.0D) {
				@Pc(81) double local81;
				if (local58 < 0.5D) {
					local81 = local58 * (local51 + 1.0D);
				} else {
					local81 = local51 + local58 - local51 * local58;
				}
				@Pc(96) double local96 = local58 * 2.0D - local81;
				@Pc(100) double local100 = local40 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local40 - 0.3333333333333333D;
				if (local100 * 6.0D < 1.0D) {
					local60 = local100 * 6.0D * (local81 - local96) + local96;
				} else if (local100 * 2.0D < 1.0D) {
					local60 = local81;
				} else if (local100 * 3.0D < 2.0D) {
					local60 = local96 + (local81 - local96) * (0.6666666666666666D - local100) * 6.0D;
				} else {
					local60 = local96;
				}
				if (local40 * 6.0D < 1.0D) {
					local62 = local40 * (local81 - local96) * 6.0D + local96;
				} else if (local40 * 2.0D < 1.0D) {
					local62 = local81;
				} else if (local40 * 3.0D < 2.0D) {
					local62 = (0.6666666666666666D - local40) * 6.0D * (local81 - local96) + local96;
				} else {
					local62 = local96;
				}
				if (local114 < 0.0D) {
					local114++;
				}
				if (local114 * 6.0D < 1.0D) {
					local64 = (local81 - local96) * 6.0D * local114 + local96;
				} else if (local114 * 2.0D < 1.0D) {
					local64 = local81;
				} else if (local114 * 3.0D < 2.0D) {
					local64 = (0.6666666666666666D - local114) * 6.0D * (local81 - local96) + local96;
				} else {
					local64 = local96;
				}
			}
			local60 = Math.pow(local60, local24);
			local62 = Math.pow(local62, local24);
			local64 = Math.pow(local64, local24);
			@Pc(293) int local293 = (int) (local60 * 256.0D);
			@Pc(298) int local298 = (int) (local62 * 256.0D);
			@Pc(303) int local303 = (int) (local64 * 256.0D);
			@Pc(314) int local314 = local303 + (local293 << 16) + (local298 << 8);
			Static64.anIntArray85[local26] = local314;
		}
	}
}
