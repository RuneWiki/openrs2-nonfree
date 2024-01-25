import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "Lclient!uv;")
	public static final Class340 aClass340_6 = new Class340();

	@OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
	public static int anInt3710 = 0;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
	public static void method3237() {
		if (Static171.anIntArray212 != null) {
			return;
		}
		Static171.anIntArray212 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(27) int local27 = 0; local27 < 65536; local27++) {
			@Pc(41) double local41 = (double) (local27 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local27 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local27 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(82) double local82;
				if (local59 < 0.5D) {
					local82 = local59 * (local52 + 1.0D);
				} else {
					local82 = local52 + local59 - local52 * local59;
				}
				@Pc(96) double local96 = local59 * 2.0D - local82;
				@Pc(100) double local100 = local41 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local41 - 0.3333333333333333D;
				if (local114 < 0.0D) {
					local114++;
				}
				if (local100 * 6.0D < 1.0D) {
					local61 = local100 * 6.0D * (local82 - local96) + local96;
				} else if (local100 * 2.0D < 1.0D) {
					local61 = local82;
				} else if (local100 * 3.0D < 2.0D) {
					local61 = local96 + (0.6666666666666666D - local100) * (local82 - local96) * 6.0D;
				} else {
					local61 = local96;
				}
				if (local41 * 6.0D < 1.0D) {
					local63 = local41 * (local82 - local96) * 6.0D + local96;
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local82;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = local96 + (0.6666666666666666D - local41) * 6.0D * (local82 - local96);
				} else {
					local63 = local96;
				}
				if (local114 * 6.0D < 1.0D) {
					local65 = (local82 - local96) * 6.0D * local114 + local96;
				} else if (local114 * 2.0D < 1.0D) {
					local65 = local82;
				} else if (local114 * 3.0D < 2.0D) {
					local65 = local96 + (0.6666666666666666D - local114) * (-local96 + local82) * 6.0D;
				} else {
					local65 = local96;
				}
			}
			local61 = Math.pow(local61, local20);
			local63 = Math.pow(local63, local20);
			local65 = Math.pow(local65, local20);
			@Pc(292) int local292 = (int) (local61 * 256.0D);
			@Pc(297) int local297 = (int) (local63 * 256.0D);
			@Pc(302) int local302 = (int) (local65 * 256.0D);
			@Pc(312) int local312 = local302 + (local292 << 16) + (local297 << 8);
			Static171.anIntArray212[local27] = local312;
		}
	}
}
