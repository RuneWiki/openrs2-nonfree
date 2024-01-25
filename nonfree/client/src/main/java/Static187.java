import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "Lclient!ms;")
	public static Class225 aClass225_2;

	@OriginalMember(owner = "client!hf", name = "h", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_27 = new Class344(76, 4);

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBI)Z")
	public static boolean method3084(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([ILclient!vo;Lclient!vo;B)V")
	public static void method3085(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class348 arg1, @OriginalArg(2) Class348 arg2) {
		Static386.aClass348_93 = arg1;
		Static1.aClass348_53 = arg2;
		if (arg0 != null) {
			Static459.anIntArray457 = arg0;
		}
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public static void method3086() {
		if (Static394.anIntArray413 != null) {
			return;
		}
		Static394.anIntArray413 = new int[65536];
		@Pc(24) double local24 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(39) double local39 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(50) double local50 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(57) double local57 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(59) double local59 = local57;
			@Pc(61) double local61 = local57;
			@Pc(63) double local63 = local57;
			if (local50 != 0.0D) {
				@Pc(79) double local79;
				if (local57 < 0.5D) {
					local79 = (local50 + 1.0D) * local57;
				} else {
					local79 = local57 + local50 - local57 * local50;
				}
				@Pc(94) double local94 = local57 * 2.0D - local79;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local39 * 6.0D < 1.0D) {
					local61 = local94 + (local79 - local94) * 6.0D * local39;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (0.6666666666666666D - local39) * 6.0D * (local79 - local94) + local94;
				} else {
					local61 = local94;
				}
				if (local98 * 6.0D < 1.0D) {
					local59 = local98 * (local79 - local94) * 6.0D + local94;
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local79;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = local94 + (0.6666666666666666D - local98) * 6.0D * (local79 - local94);
				} else {
					local59 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = local94 + (local79 - local94) * 6.0D * local112;
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = local94 + (local79 - local94) * 6.0D * (0.6666666666666666D - local112);
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(293) int local293 = (int) (local59 * 256.0D);
			@Pc(298) int local298 = (int) (local61 * 256.0D);
			@Pc(303) int local303 = (int) (local63 * 256.0D);
			@Pc(314) int local314 = (local293 << 16) - (-(local298 << 8) - local303);
			Static394.anIntArray413[local26] = local314;
		}
	}
}
