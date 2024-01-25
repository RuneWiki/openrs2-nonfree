import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Lclient!et;")
	public static Class101 aClass101_1;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public static int anInt4034 = -1;

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	public static void method3707() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static322.aBooleanArray14[local7] = false;
		}
		Static555.anInt8761 = -1;
		Static35.anInt522 = -1;
		Static426.anInt7111 = 1;
		Static134.anInt2209 = 0;
		Static177.anInt3350 = 0;
		Static417.anInt7039 = -1;
		Static227.anInt9451 = -1;
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
	public static void method3709() {
		if (Static408.anIntArray407 != null) {
			return;
		}
		Static408.anIntArray407 = new int[65536];
		@Pc(30) double local30 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(32) int local32 = 0; local32 < 65536; local32++) {
			@Pc(46) double local46 = (double) (local32 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(57) double local57 = (double) (local32 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(64) double local64 = (double) (local32 & 0x7F) / 128.0D;
			@Pc(66) double local66 = local64;
			@Pc(68) double local68 = local64;
			@Pc(70) double local70 = local64;
			if (local57 != 0.0D) {
				@Pc(86) double local86;
				if (local64 < 0.5D) {
					local86 = local64 * (local57 + 1.0D);
				} else {
					local86 = local57 + local64 - local64 * local57;
				}
				@Pc(102) double local102 = local64 * 2.0D - local86;
				@Pc(106) double local106 = local46 + 0.3333333333333333D;
				if (local106 > 1.0D) {
					local106--;
				}
				@Pc(120) double local120 = local46 - 0.3333333333333333D;
				if (local106 * 6.0D < 1.0D) {
					local66 = local102 + local106 * (local86 - local102) * 6.0D;
				} else if (local106 * 2.0D < 1.0D) {
					local66 = local86;
				} else if (local106 * 3.0D < 2.0D) {
					local66 = local102 + (local86 - local102) * 6.0D * (0.6666666666666666D - local106);
				} else {
					local66 = local102;
				}
				if (local46 * 6.0D < 1.0D) {
					local68 = local102 + (local86 - local102) * 6.0D * local46;
				} else if (local46 * 2.0D < 1.0D) {
					local68 = local86;
				} else if (local46 * 3.0D < 2.0D) {
					local68 = local102 + (local86 - local102) * 6.0D * (0.6666666666666666D - local46);
				} else {
					local68 = local102;
				}
				if (local120 < 0.0D) {
					local120++;
				}
				if (local120 * 6.0D < 1.0D) {
					local70 = local102 + local120 * (local86 - local102) * 6.0D;
				} else if (local120 * 2.0D < 1.0D) {
					local70 = local86;
				} else if (local120 * 3.0D < 2.0D) {
					local70 = local102 + (0.6666666666666666D - local120) * 6.0D * (local86 - local102);
				} else {
					local70 = local102;
				}
			}
			local66 = Math.pow(local66, local30);
			local68 = Math.pow(local68, local30);
			local70 = Math.pow(local70, local30);
			@Pc(311) int local311 = (int) (local66 * 256.0D);
			@Pc(316) int local316 = (int) (local68 * 256.0D);
			@Pc(321) int local321 = (int) (local70 * 256.0D);
			@Pc(332) int local332 = (local311 << 16) - (-(local316 << 8) - local321);
			Static408.anIntArray407[local32] = local332;
		}
	}
}
