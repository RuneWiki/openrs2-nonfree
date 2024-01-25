import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
	public static final int anInt8439 = 1339;

	@OriginalMember(owner = "client!qga", name = "p", descriptor = "[I")
	public static final int[] anIntArray583 = new int[25];

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)[Lclient!ee;")
	public static Class86[] method7100() {
		return new Class86[] { Static95.aClass86_5, Static81.aClass86_4, Static20.aClass86_1, Static567.aClass86_9, Static538.aClass86_8, Static613.aClass86_3 };
	}

	@OriginalMember(owner = "client!qga", name = "c", descriptor = "(I)V")
	public static void method7102() {
		for (@Pc(5) int local5 = 0; local5 < Static600.aClass121ArrayArray1.length; local5++) {
			for (@Pc(8) int local8 = 0; local8 < Static600.aClass121ArrayArray1[local5].length; local8++) {
				Static600.aClass121ArrayArray1[local5][local8] = Static264.aClass121_1;
			}
		}
	}

	@OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)V")
	public static void method7104() {
		if (Static349.anIntArray394 != null) {
			return;
		}
		Static349.anIntArray394 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(19) int local19 = 0; local19 < 65536; local19++) {
			@Pc(31) double local31 = (double) (local19 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(42) double local42 = (double) (local19 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(49) double local49 = (double) (local19 & 0x7F) / 128.0D;
			@Pc(51) double local51 = local49;
			@Pc(53) double local53 = local49;
			@Pc(55) double local55 = local49;
			if (local42 != 0.0D) {
				@Pc(69) double local69;
				if (local49 < 0.5D) {
					local69 = (local42 + 1.0D) * local49;
				} else {
					local69 = local42 + local49 - local49 * local42;
				}
				@Pc(84) double local84 = local49 * 2.0D - local69;
				@Pc(88) double local88 = local31 + 0.3333333333333333D;
				if (local88 > 1.0D) {
					local88--;
				}
				@Pc(102) double local102 = local31 - 0.3333333333333333D;
				if (local31 * 6.0D < 1.0D) {
					local53 = local84 + local31 * (local69 - local84) * 6.0D;
				} else if (local31 * 2.0D < 1.0D) {
					local53 = local69;
				} else if (local31 * 3.0D < 2.0D) {
					local53 = (local69 - local84) * (-local31 + 0.6666666666666666D) * 6.0D + local84;
				} else {
					local53 = local84;
				}
				if (local88 * 6.0D < 1.0D) {
					local51 = local84 + (local69 - local84) * 6.0D * local88;
				} else if (local88 * 2.0D < 1.0D) {
					local51 = local69;
				} else if (local88 * 3.0D < 2.0D) {
					local51 = local84 + (local69 - local84) * (-local88 + 0.6666666666666666D) * 6.0D;
				} else {
					local51 = local84;
				}
				if (local102 < 0.0D) {
					local102++;
				}
				if (local102 * 6.0D < 1.0D) {
					local55 = (local69 - local84) * 6.0D * local102 + local84;
				} else if (local102 * 2.0D < 1.0D) {
					local55 = local69;
				} else if (local102 * 3.0D < 2.0D) {
					local55 = (0.6666666666666666D - local102) * (-local84 + local69) * 6.0D + local84;
				} else {
					local55 = local84;
				}
			}
			local51 = Math.pow(local51, local17);
			local53 = Math.pow(local53, local17);
			local55 = Math.pow(local55, local17);
			@Pc(276) int local276 = (int) (local51 * 256.0D);
			@Pc(281) int local281 = (int) (local53 * 256.0D);
			@Pc(286) int local286 = (int) (local55 * 256.0D);
			@Pc(297) int local297 = (local281 << 8) + (local276 << 16) + local286;
			Static349.anIntArray394[local19] = local297;
		}
	}
}
