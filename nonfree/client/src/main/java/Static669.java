import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static669 {

	@OriginalMember(owner = "client!wl", name = "f", descriptor = "I")
	public static int anInt10276;

	@OriginalMember(owner = "client!wl", name = "g", descriptor = "Lclient!hh;")
	public static Class6 aClass6_38;

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V")
	public static void method8385() {
		if (Static537.anIntArray457 != null) {
			return;
		}
		Static537.anIntArray457 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(80) double local80;
				if (local57 < 0.5D) {
					local80 = (local50 + 1.0D) * local57;
				} else {
					local80 = local50 + local57 - local50 * local57;
				}
				@Pc(94) double local94 = local57 * 2.0D - local80;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local98 * 6.0D < 1.0D) {
					local59 = (local80 - local94) * 6.0D * local98 + local94;
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local80;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = (0.6666666666666666D - local98) * (-local94 + local80) * 6.0D + local94;
				} else {
					local59 = local94;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local39 * 6.0D * (local80 - local94) + local94;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local80;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (local80 - local94) * (-local39 + 0.6666666666666666D) * 6.0D + local94;
				} else {
					local61 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = local94 + local112 * 6.0D * (local80 - local94);
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local80;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = local94 + (0.6666666666666666D - local112) * (local80 - local94) * 6.0D;
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(290) int local290 = (int) (local59 * 256.0D);
			@Pc(295) int local295 = (int) (local61 * 256.0D);
			@Pc(300) int local300 = (int) (local63 * 256.0D);
			@Pc(311) int local311 = (local290 << 16) - (-(local295 << 8) - local300);
			Static537.anIntArray457[local26] = local311;
		}
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIB)Z")
	public static boolean method8386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static516.method6724(arg0, arg1) | Static278.method4065(arg0, arg1) | Static67.method1221(arg0, arg1)) & Static614.method8321(arg1, arg0);
	}

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(CZ)Z")
	public static boolean method8387(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
