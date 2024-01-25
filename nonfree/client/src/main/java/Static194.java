import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!gfa", name = "h", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!gfa", name = "g", descriptor = "[Lclient!mr;")
	public static final Interface16[] anInterface16Array1 = new Interface16[75];

	@OriginalMember(owner = "client!gfa", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray14 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "(I)V")
	public static void method3229() {
		if (Static336.anIntArray357 != null) {
			return;
		}
		Static336.anIntArray357 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(23) int local23 = 0; local23 < 65536; local23++) {
			@Pc(35) double local35 = (double) (local23 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(46) double local46 = (double) (local23 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(53) double local53 = (double) (local23 & 0x7F) / 128.0D;
			@Pc(55) double local55 = local53;
			@Pc(57) double local57 = local53;
			@Pc(59) double local59 = local53;
			if (local46 != 0.0D) {
				@Pc(75) double local75;
				if (local53 < 0.5D) {
					local75 = local53 * (local46 + 1.0D);
				} else {
					local75 = local46 + local53 - local46 * local53;
				}
				@Pc(88) double local88 = local53 * 2.0D - local75;
				@Pc(92) double local92 = local35 + 0.3333333333333333D;
				if (local92 > 1.0D) {
					local92--;
				}
				@Pc(106) double local106 = local35 - 0.3333333333333333D;
				if (local35 * 6.0D < 1.0D) {
					local57 = local88 + (local75 - local88) * 6.0D * local35;
				} else if (local35 * 2.0D < 1.0D) {
					local57 = local75;
				} else if (local35 * 3.0D < 2.0D) {
					local57 = local88 + (local75 - local88) * (-local35 + 0.6666666666666666D) * 6.0D;
				} else {
					local57 = local88;
				}
				if (local106 < 0.0D) {
					local106++;
				}
				if (local92 * 6.0D < 1.0D) {
					local55 = local88 + (local75 - local88) * 6.0D * local92;
				} else if (local92 * 2.0D < 1.0D) {
					local55 = local75;
				} else if (local92 * 3.0D < 2.0D) {
					local55 = (0.6666666666666666D - local92) * (local75 - local88) * 6.0D + local88;
				} else {
					local55 = local88;
				}
				if (local106 * 6.0D < 1.0D) {
					local59 = (local75 - local88) * 6.0D * local106 + local88;
				} else if (local106 * 2.0D < 1.0D) {
					local59 = local75;
				} else if (local106 * 3.0D < 2.0D) {
					local59 = local88 + (0.6666666666666666D - local106) * (local75 - local88) * 6.0D;
				} else {
					local59 = local88;
				}
			}
			local55 = Math.pow(local55, local17);
			local57 = Math.pow(local57, local17);
			local59 = Math.pow(local59, local17);
			@Pc(275) int local275 = (int) (local55 * 256.0D);
			@Pc(280) int local280 = (int) (local57 * 256.0D);
			@Pc(285) int local285 = (int) (local59 * 256.0D);
			@Pc(295) int local295 = local285 + (local275 << 16) + (local280 << 8);
			Static336.anIntArray357[local23] = local295;
		}
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
	public static void method3230() {
		Static386.aClass5_Sub17_Sub1_2.method2527();
		Static439.aClass5_Sub17_Sub1_3 = null;
		Static234.aClass390_55 = null;
		Static26.anInt352 = 1;
	}
}
