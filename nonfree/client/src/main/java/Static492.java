import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "Lclient!bi;")
	public static Class33 aClass33_7;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
	public static int anInt8088;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_129 = new Class45(36, 8);

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)I")
	public static int method6695(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Lclient!du;")
	public static Class12_Sub12 method6698() {
		if (Static2.aClass73_48 == null || Static307.aClass162_1 == null) {
			return null;
		}
		Static307.aClass162_1.method4144(Static2.aClass73_48);
		@Pc(26) Class12_Sub12 local26 = (Class12_Sub12) Static307.aClass162_1.method4145();
		if (local26 == null) {
			return null;
		} else {
			@Pc(36) Class152 local36 = Static2.aClass93_5.method2480(local26.anInt2333);
			return local36 != null && local36.aBoolean378 && local36.method4026(Static2.anInterface9_2) ? local26 : Static336.method5383();
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
	public static void method6699() {
		if (Static141.anIntArray234 != null) {
			return;
		}
		Static141.anIntArray234 = new int[65536];
		@Pc(20) double local20 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(22) int local22 = 0; local22 < 65536; local22++) {
			@Pc(41) double local41 = (double) (local22 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(52) double local52 = (double) (local22 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(59) double local59 = (double) (local22 & 0x7F) / 128.0D;
			@Pc(61) double local61 = local59;
			@Pc(63) double local63 = local59;
			@Pc(65) double local65 = local59;
			if (local52 != 0.0D) {
				@Pc(79) double local79;
				if (local59 < 0.5D) {
					local79 = (local52 + 1.0D) * local59;
				} else {
					local79 = local59 + local52 - local52 * local59;
				}
				@Pc(96) double local96 = local59 * 2.0D - local79;
				@Pc(100) double local100 = local41 + 0.3333333333333333D;
				if (local100 > 1.0D) {
					local100--;
				}
				@Pc(114) double local114 = local41 - 0.3333333333333333D;
				if (local114 < 0.0D) {
					local114++;
				}
				if (local100 * 6.0D < 1.0D) {
					local61 = local100 * 6.0D * (local79 - local96) + local96;
				} else if (local100 * 2.0D < 1.0D) {
					local61 = local79;
				} else if (local100 * 3.0D < 2.0D) {
					local61 = local96 + (0.6666666666666666D - local100) * (-local96 + local79) * 6.0D;
				} else {
					local61 = local96;
				}
				if (local41 * 6.0D < 1.0D) {
					local63 = (local79 - local96) * 6.0D * local41 + local96;
				} else if (local41 * 2.0D < 1.0D) {
					local63 = local79;
				} else if (local41 * 3.0D < 2.0D) {
					local63 = local96 + (0.6666666666666666D - local41) * 6.0D * (local79 - local96);
				} else {
					local63 = local96;
				}
				if (local114 * 6.0D < 1.0D) {
					local65 = local96 + (local79 - local96) * 6.0D * local114;
				} else if (local114 * 2.0D < 1.0D) {
					local65 = local79;
				} else if (local114 * 3.0D < 2.0D) {
					local65 = local96 + (0.6666666666666666D - local114) * 6.0D * (local79 - local96);
				} else {
					local65 = local96;
				}
			}
			local61 = Math.pow(local61, local20);
			local63 = Math.pow(local63, local20);
			local65 = Math.pow(local65, local20);
			@Pc(298) int local298 = (int) (local61 * 256.0D);
			@Pc(303) int local303 = (int) (local63 * 256.0D);
			@Pc(308) int local308 = (int) (local65 * 256.0D);
			@Pc(318) int local318 = local308 + (local303 << 8) + (local298 << 16);
			Static141.anIntArray234[local22] = local318;
		}
	}
}
