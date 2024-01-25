import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
	public static int anInt7967 = 1;

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!ff;")
	public static final Class101 aClass101_14 = new Class101(4, 1, 1, 1);

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString77 = null;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	public static void method6400() {
		if (Static379.anIntArray506 != null) {
			return;
		}
		Static379.anIntArray506 = new int[65536];
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
					local77 = local57 + local50 - local50 * local57;
				}
				@Pc(93) double local93 = local57 * 2.0D - local77;
				@Pc(97) double local97 = local39 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local39 - 0.3333333333333333D;
				if (local39 * 6.0D < 1.0D) {
					local61 = (local77 - local93) * 6.0D * local39 + local93;
				} else if (local39 * 2.0D < 1.0D) {
					local61 = local77;
				} else if (local39 * 3.0D < 2.0D) {
					local61 = (0.6666666666666666D - local39) * (local77 - local93) * 6.0D + local93;
				} else {
					local61 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local97 * 6.0D < 1.0D) {
					local59 = local93 + local97 * 6.0D * (local77 - local93);
				} else if (local97 * 2.0D < 1.0D) {
					local59 = local77;
				} else if (local97 * 3.0D < 2.0D) {
					local59 = (0.6666666666666666D - local97) * 6.0D * (local77 - local93) + local93;
				} else {
					local59 = local93;
				}
				if (local111 * 6.0D < 1.0D) {
					local63 = local111 * 6.0D * (local77 - local93) + local93;
				} else if (local111 * 2.0D < 1.0D) {
					local63 = local77;
				} else if (local111 * 3.0D < 2.0D) {
					local63 = (local77 - local93) * 6.0D * (0.6666666666666666D - local111) + local93;
				} else {
					local63 = local93;
				}
			}
			local59 = Math.pow(local59, local24);
			local61 = Math.pow(local61, local24);
			local63 = Math.pow(local63, local24);
			@Pc(291) int local291 = (int) (local59 * 256.0D);
			@Pc(296) int local296 = (int) (local61 * 256.0D);
			@Pc(301) int local301 = (int) (local63 * 256.0D);
			@Pc(311) int local311 = local301 + (local296 << 8) + (local291 << 16);
			Static379.anIntArray506[local26] = local311;
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!rga;Z)V")
	public static void method6401(@OriginalArg(0) Class8_Sub3 arg0) {
		if (Static514.aBoolean677) {
			Static465.aClass160Array1[Static465.aClass160Array1.length - 1].method3427(arg0);
		} else {
			Static465.method6405(arg0, Static83.aClass1_Sub18Array1);
		}
	}
}
