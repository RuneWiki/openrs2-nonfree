import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
	public static int anInt3063;

	@OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
	public static int anInt3062 = -1;

	@OriginalMember(owner = "client!hg", name = "ab", descriptor = "I")
	public static int anInt3075 = 0;

	@OriginalMember(owner = "client!hg", name = "eb", descriptor = "[I")
	public static final int[] anIntArray252 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
	public static void method2733() {
		if (Static323.anIntArray198 != null) {
			return;
		}
		Static323.anIntArray198 = new int[65536];
		@Pc(23) double local23 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(25) int local25 = 0; local25 < 65536; local25++) {
			@Pc(38) double local38 = (double) (local25 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(49) double local49 = (double) (local25 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(56) double local56 = (double) (local25 & 0x7F) / 128.0D;
			@Pc(58) double local58 = local56;
			@Pc(60) double local60 = local56;
			@Pc(62) double local62 = local56;
			if (local49 != 0.0D) {
				@Pc(79) double local79;
				if (local56 < 0.5D) {
					local79 = local56 * (local49 + 1.0D);
				} else {
					local79 = local49 + local56 - local49 * local56;
				}
				@Pc(94) double local94 = local56 * 2.0D - local79;
				@Pc(98) double local98 = local38 + 0.3333333333333333D;
				if (local98 > 1.0D) {
					local98--;
				}
				@Pc(112) double local112 = local38 - 0.3333333333333333D;
				if (local38 * 6.0D < 1.0D) {
					local60 = local38 * (local79 - local94) * 6.0D + local94;
				} else if (local38 * 2.0D < 1.0D) {
					local60 = local79;
				} else if (local38 * 3.0D < 2.0D) {
					local60 = local94 + (local79 - local94) * 6.0D * (0.6666666666666666D - local38);
				} else {
					local60 = local94;
				}
				if (local112 < 0.0D) {
					local112++;
				}
				if (local98 * 6.0D < 1.0D) {
					local58 = (local79 - local94) * 6.0D * local98 + local94;
				} else if (local98 * 2.0D < 1.0D) {
					local58 = local79;
				} else if (local98 * 3.0D < 2.0D) {
					local58 = local94 + (0.6666666666666666D - local98) * 6.0D * (local79 - local94);
				} else {
					local58 = local94;
				}
				if (local112 * 6.0D < 1.0D) {
					local62 = local94 + local112 * 6.0D * (local79 - local94);
				} else if (local112 * 2.0D < 1.0D) {
					local62 = local79;
				} else if (local112 * 3.0D < 2.0D) {
					local62 = (0.6666666666666666D - local112) * 6.0D * (local79 - local94) + local94;
				} else {
					local62 = local94;
				}
			}
			local58 = Math.pow(local58, local23);
			local60 = Math.pow(local60, local23);
			local62 = Math.pow(local62, local23);
			@Pc(293) int local293 = (int) (local58 * 256.0D);
			@Pc(298) int local298 = (int) (local60 * 256.0D);
			@Pc(303) int local303 = (int) (local62 * 256.0D);
			@Pc(313) int local313 = local303 + (local293 << 16) + (local298 << 8);
			Static323.anIntArray198[local25] = local313;
		}
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)Z")
	public static boolean method2735() {
		return Static445.anInt7575 == 0 ? Static196.aClass4_Sub7_Sub2_6.method1395() : true;
	}
}
