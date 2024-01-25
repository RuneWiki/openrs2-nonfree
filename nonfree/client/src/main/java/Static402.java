import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!og", name = "E", descriptor = "[[S")
	public static short[][] aShortArrayArray19;

	@OriginalMember(owner = "client!og", name = "H", descriptor = "I")
	public static int anInt9328;

	@OriginalMember(owner = "client!og", name = "K", descriptor = "I")
	public static int anInt9331;

	@OriginalMember(owner = "client!og", name = "F", descriptor = "I")
	public static int anInt9327 = 0;

	@OriginalMember(owner = "client!og", name = "G", descriptor = "Lclient!du;")
	public static final Class81 aClass81_65 = new Class81(64);

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
	public static boolean method8007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!og", name = "i", descriptor = "(I)V")
	public static void method8008() {
		if (Static643.anIntArray836 != null) {
			return;
		}
		Static643.anIntArray836 = new int[65536];
		@Pc(19) double local19 = Math.random() * 0.03D + 0.7D - 0.015D;
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
					local77 = (local50 + 1.0D) * local57;
				} else {
					local77 = local57 + local50 - local57 * local50;
				}
				@Pc(94) double local94 = local57 * 2.0D - local77;
				@Pc(98) double local98 = local39 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local39 - 0.3333333333333333D;
				if (local98 * 6.0D < 1.0D) {
					local59 = (local77 - local94) * 6.0D * local98 + local94;
				} else if (local98 * 2.0D < 1.0D) {
					local59 = local77;
				} else if (local98 * 3.0D < 2.0D) {
					local59 = (0.6666666666666666D - local98) * 6.0D * (local77 - local94) + local94;
				} else {
					local59 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local39 * 6.0D < 1.0D) {
					local61 = local94 + (local77 - local94) * 6.0D * local39;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local77;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = local94 + (local77 - local94) * (-local39 + 0.6666666666666666D) * 6.0D;
				} else {
					local61 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local63 = local94 + (local77 - local94) * 6.0D * local112;
				} else if (local112 * 2.0D < 1.0D) {
					local63 = local77;
				} else if (local112 * 3.0D < 2.0D) {
					local63 = (local77 - local94) * 6.0D * (0.6666666666666666D - local112) + local94;
				} else {
					local63 = local94;
				}
			}
			local59 = Math.pow(local59, local19);
			local61 = Math.pow(local61, local19);
			local63 = Math.pow(local63, local19);
			@Pc(293) int local293 = (int) (local59 * 256.0D);
			@Pc(298) int local298 = (int) (local61 * 256.0D);
			@Pc(303) int local303 = (int) (local63 * 256.0D);
			@Pc(313) int local313 = (local293 << 16) + (local298 << 8) + local303;
			Static643.anIntArray836[local26] = local313;
		}
	}
}
