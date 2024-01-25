import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
	public static int anInt4906;

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
	public static int anInt4907;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "Lclient!wca;")
	public static Class234_Sub1 aClass234_Sub1_5;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!lr", name = "k", descriptor = "[I")
	public static final int[] anIntArray270 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!lr", name = "n", descriptor = "[I")
	public static final int[] anIntArray271 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
	public static int anInt4911 = 0;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	public static void method3919() {
		if (Static226.anIntArray212 != null) {
			return;
		}
		Static226.anIntArray212 = new int[65536];
		@Pc(28) double local28 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(30) int local30 = 0; local30 < 65536; local30++) {
			@Pc(44) double local44 = (double) (local30 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(55) double local55 = (double) (local30 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(62) double local62 = (double) (local30 & 0x7F) / 128.0D;
			@Pc(64) double local64 = local62;
			@Pc(66) double local66 = local62;
			@Pc(68) double local68 = local62;
			if (local55 != 0.0D) {
				@Pc(84) double local84;
				if (local62 < 0.5D) {
					local84 = local62 * (local55 + 1.0D);
				} else {
					local84 = local62 + local55 - local55 * local62;
				}
				@Pc(98) double local98 = local62 * 2.0D - local84;
				@Pc(102) double local102 = local44 + 0.3333333333333333D;
				if (local102 > 1.0D) {
					local102--;
				}
				@Pc(116) double local116 = local44 - 0.3333333333333333D;
				if (local44 * 6.0D < 1.0D) {
					local66 = local98 + (local84 - local98) * 6.0D * local44;
				} else if (local44 * 2.0D < 1.0D) {
					local66 = local84;
				} else if (local44 * 3.0D < 2.0D) {
					local66 = local98 + (0.6666666666666666D - local44) * (-local98 + local84) * 6.0D;
				} else {
					local66 = local98;
				}
				if (local116 < 0.0D) {
					local116++;
				}
				if (local102 * 6.0D < 1.0D) {
					local64 = (local84 - local98) * 6.0D * local102 + local98;
				} else if (local102 * 2.0D < 1.0D) {
					local64 = local84;
				} else if (local102 * 3.0D < 2.0D) {
					local64 = local98 + (local84 - local98) * (-local102 + 0.6666666666666666D) * 6.0D;
				} else {
					local64 = local98;
				}
				if (local116 * 6.0D < 1.0D) {
					local68 = (local84 - local98) * 6.0D * local116 + local98;
				} else if (local116 * 2.0D < 1.0D) {
					local68 = local84;
				} else if (local116 * 3.0D < 2.0D) {
					local68 = (local84 - local98) * (0.6666666666666666D - local116) * 6.0D + local98;
				} else {
					local68 = local98;
				}
			}
			local64 = Math.pow(local64, local28);
			local66 = Math.pow(local66, local28);
			local68 = Math.pow(local68, local28);
			@Pc(297) int local297 = (int) (local64 * 256.0D);
			@Pc(302) int local302 = (int) (local66 * 256.0D);
			@Pc(307) int local307 = (int) (local68 * 256.0D);
			@Pc(317) int local317 = local307 + (local297 << 16) + (local302 << 8);
			Static226.anIntArray212[local30] = local317;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IBI)Z")
	public static boolean method3922(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static442.method6236(arg0, arg1) | (arg0 & 0x800) != 0 || Static391.method5620(arg1, arg0);
	}
}
