import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ig", name = "j", descriptor = "Lclient!wi;")
	public static Class175 aClass175_1;

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "[I")
	public static int[] anIntArray346 = new int[1];

	@OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
	public static int anInt4092 = 0;

	@OriginalMember(owner = "client!ig", name = "h", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_56 = new Class98(82, 5);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V")
	public static void method3507() {
		if (Static36.anIntArray31 != null) {
			return;
		}
		Static36.anIntArray31 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(77) double local77;
				if (local57 < 0.5D) {
					local77 = local57 * (local50 + 1.0D);
				} else {
					local77 = local50 + local57 - local57 * local50;
				}
				@Pc(94) double local94 = local57 * 2.0D - local77;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local98 * 6.0D < 1.0D) {
					local59 = local98 * (local77 - local94) * 6.0D + local94;
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local77;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = local94 + (local77 - local94) * 6.0D * (0.6666666666666666D - local98);
				} else {
					local59 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local39 * (local77 - local94) * 6.0D + local94;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local77;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (0.6666666666666666D - local39) * (local77 - local94) * 6.0D + local94;
				} else {
					local61 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = (local77 - local94) * 6.0D * local112 + local94;
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local77;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = (local77 - local94) * (0.6666666666666666D - local112) * 6.0D + local94;
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(291) int local291 = (int) (local59 * 256.0D);
			@Pc(296) int local296 = (int) (local61 * 256.0D);
			@Pc(301) int local301 = (int) (local63 * 256.0D);
			@Pc(311) int local311 = (local296 << 8) + (local291 << 16) + local301;
			Static36.anIntArray31[local26] = local311;
		}
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)[Lclient!rg;")
	public static Class275[] method3510() {
		return new Class275[] { Static66.aClass275_3, Static362.aClass275_8, Static84.aClass275_4 };
	}
}
