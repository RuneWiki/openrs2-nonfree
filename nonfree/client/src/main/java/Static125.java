import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
	public static int anInt2666;

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
	public static int anInt2664 = 1;

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
	public static int anInt2668 = 0;

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
	public static void method2441() {
		if (Static295.anInt5862 == -1 || Static58.anInt1028 == -1) {
			return;
		}
		@Pc(23) int local23 = Static339.anInt6621 + ((Static144.anInt3084 - Static339.anInt6621) * Static240.anInt5120 >> 16);
		Static240.anInt5120 += local23;
		if (Static240.anInt5120 >= 65535) {
			Static240.anInt5120 = 65535;
			if (Static284.aBoolean508) {
				Static211.aBoolean560 = false;
			} else {
				Static211.aBoolean560 = true;
			}
			Static284.aBoolean508 = true;
		} else {
			Static284.aBoolean508 = false;
			Static211.aBoolean560 = false;
		}
		@Pc(53) float local53 = (float) Static240.anInt5120 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(60) int local60 = Static228.anInt4941 * 2;
		@Pc(86) int local86;
		@Pc(118) int local118;
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(140) int local140;
		@Pc(158) int local158;
		for (@Pc(62) int local62 = 0; local62 < 3; local62++) {
			@Pc(74) int local74 = Static132.anIntArrayArrayArray6[Static295.anInt5862][local60][local62] * 3;
			local86 = Static132.anIntArrayArrayArray6[Static295.anInt5862][local60 + 1][local62] * 3;
			local118 = (Static132.anIntArrayArrayArray6[Static295.anInt5862][local60 + 2][local62] + Static132.anIntArrayArrayArray6[Static295.anInt5862][local60 + 2][local62] - Static132.anIntArrayArrayArray6[Static295.anInt5862][local60 + 3][local62]) * 3;
			local126 = Static132.anIntArrayArrayArray6[Static295.anInt5862][local60][local62];
			local131 = local86 - local74;
			local140 = local74 + local118 - local86 * 2;
			local158 = Static132.anIntArrayArrayArray6[Static295.anInt5862][local60 + 2][local62] + local86 - local126 - local118;
			local56[local62] = (float) local126 + local53 * ((float) local131 + ((float) local140 + (float) local158 * local53) * local53);
		}
		Static166.anInt3804 = (int) local56[0] - Static150.anInt3453 * 128;
		Static23.anInt356 = (int) local56[1] * -1;
		Static51.anInt879 = (int) local56[2] - Static287.anInt5776 * 128;
		@Pc(214) float[] local214 = new float[3];
		local86 = Static348.anInt2689 * 2;
		for (local118 = 0; local118 < 3; local118++) {
			local126 = Static132.anIntArrayArrayArray6[Static58.anInt1028][local86][local118] * 3;
			local131 = Static132.anIntArrayArrayArray6[Static58.anInt1028][local86 + 1][local118] * 3;
			local140 = (Static132.anIntArrayArrayArray6[Static58.anInt1028][local86 + 2][local118] + Static132.anIntArrayArrayArray6[Static58.anInt1028][local86 + 2][local118] - Static132.anIntArrayArrayArray6[Static58.anInt1028][local86 + 3][local118]) * 3;
			local158 = Static132.anIntArrayArrayArray6[Static58.anInt1028][local86][local118];
			@Pc(288) int local288 = local131 - local126;
			@Pc(297) int local297 = local140 + local126 - local131 * 2;
			@Pc(316) int local316 = Static132.anIntArrayArrayArray6[Static58.anInt1028][local86 + 2][local118] + local131 - local158 - local140;
			local214[local118] = (float) local158 + ((float) local288 + ((float) local297 + (float) local316 * local53) * local53) * local53;
		}
		@Pc(348) float local348 = local214[0] - local56[0];
		@Pc(359) float local359 = -1.0F * (local214[1] - local56[1]);
		@Pc(368) float local368 = local214[2] - local56[2];
		@Pc(378) double local378 = Math.sqrt((double) (local348 * local348 + local368 * local368));
		Static168.anInt3820 = (int) (Math.atan2((double) local359, local378) * 2607.5945876176133D) & 0x3FFF;
		Static195.anInt4286 = (int) (-Math.atan2((double) local348, (double) local368) * 2607.5945876176133D) & 0x3FFF;
		Static234.anInt5031 = ((Static132.anIntArrayArrayArray6[Static295.anInt5862][local60 + 2][3] - Static132.anIntArrayArrayArray6[Static295.anInt5862][local60][3]) * Static240.anInt5120 >> 16) + Static132.anIntArrayArrayArray6[Static295.anInt5862][local60][3];
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
	public static void method2445() {
		Static291.aClass107_33.method3012();
	}
}
