import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)I")
	public static int method3473() {
		return Static323.anInt5519;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZ)V")
	public static void method3474() {
		Static303.anInt7492 = -1;
		Static2.aClass82_1 = null;
		Static255.anInt1147 = 1;
		Static48.anInt814 = 0;
		Static31.anInt497 = 2;
		Static128.aBoolean263 = false;
		Static72.anInt1316 = -1;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
	public static void method3475() {
		if (Static160.anIntArray183 != null) {
			return;
		}
		Static160.anIntArray183 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(36) double local36 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(47) double local47 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(54) double local54 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(56) double local56 = local54;
			@Pc(58) double local58 = local54;
			@Pc(60) double local60 = local54;
			if (local47 != 0.0D) {
				@Pc(74) double local74;
				if (local54 < 0.5D) {
					local74 = local54 * (local47 + 1.0D);
				} else {
					local74 = local47 + local54 - local47 * local54;
				}
				@Pc(91) double local91 = local54 * 2.0D - local74;
				@Pc(95) double local95 = local36 + 0.3333333333333333D;
				if (local95 > 1.0D) {
					local95--;
				}
				@Pc(109) double local109 = local36 - 0.3333333333333333D;
				if (local109 < 0.0D) {
					local109++;
				}
				if (local95 * 6.0D < 1.0D) {
					local56 = local91 + local95 * 6.0D * (local74 - local91);
				} else if (local95 * 2.0D < 1.0D) {
					local56 = local74;
				} else if (local95 * 3.0D < 2.0D) {
					local56 = local91 + (local74 - local91) * (-local95 + 0.6666666666666666D) * 6.0D;
				} else {
					local56 = local91;
				}
				if (local36 * 6.0D < 1.0D) {
					local58 = local36 * 6.0D * (local74 - local91) + local91;
				} else if (local36 * 2.0D < 1.0D) {
					local58 = local74;
				} else if (local36 * 3.0D < 2.0D) {
					local58 = local91 + (0.6666666666666666D - local36) * 6.0D * (local74 - local91);
				} else {
					local58 = local91;
				}
				if (local109 * 6.0D < 1.0D) {
					local60 = local91 + (local74 - local91) * 6.0D * local109;
				} else if (local109 * 2.0D < 1.0D) {
					local60 = local74;
				} else if (local109 * 3.0D < 2.0D) {
					local60 = local91 + (local74 - local91) * (-local109 + 0.6666666666666666D) * 6.0D;
				} else {
					local60 = local91;
				}
			}
			local56 = Math.pow(local56, local20);
			local58 = Math.pow(local58, local20);
			local60 = Math.pow(local60, local20);
			@Pc(292) int local292 = (int) (local56 * 256.0D);
			@Pc(297) int local297 = (int) (local58 * 256.0D);
			@Pc(302) int local302 = (int) (local60 * 256.0D);
			@Pc(312) int local312 = (local292 << 16) + (local297 << 8) + local302;
			Static160.anIntArray183[local22] = local312;
		}
	}
}
