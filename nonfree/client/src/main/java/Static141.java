import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!gv", name = "e", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!gv", name = "g", descriptor = "Z")
	public static boolean aBoolean166 = true;

	@OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
	public static int anInt2521 = 0;

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	public static void method1991() {
		if (Static320.anInt5206 == -1 || Static171.anInt3113 == -1) {
			return;
		}
		@Pc(23) int local23 = Static61.anInt1104 + ((Static253.anInt4185 - Static61.anInt1104) * Static455.anInt7624 >> 16);
		Static455.anInt7624 += local23;
		if (Static455.anInt7624 < 65535) {
			Static225.aBoolean287 = false;
			Static72.aBoolean96 = false;
		} else {
			if (Static225.aBoolean287) {
				Static72.aBoolean96 = false;
			} else {
				Static72.aBoolean96 = true;
			}
			Static455.anInt7624 = 65535;
			Static225.aBoolean287 = true;
		}
		@Pc(55) float local55 = (float) Static455.anInt7624 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static50.anInt813 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(134) int local134;
		@Pc(144) int local144;
		@Pc(161) int local161;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static295.anIntArrayArrayArray7[Static320.anInt5206][local62][local64] * 3;
			local88 = Static295.anIntArrayArrayArray7[Static320.anInt5206][local62 + 1][local64] * 3;
			local121 = (Static295.anIntArrayArrayArray7[Static320.anInt5206][local62 + 2][local64] + Static295.anIntArrayArrayArray7[Static320.anInt5206][local62 + 2][local64] - Static295.anIntArrayArrayArray7[Static320.anInt5206][local62 + 3][local64]) * 3;
			local129 = Static295.anIntArrayArrayArray7[Static320.anInt5206][local62][local64];
			local134 = local88 - local76;
			local144 = local76 + local121 - local88 * 2;
			local161 = local88 + Static295.anIntArrayArrayArray7[Static320.anInt5206][local62 + 2][local64] - local129 - local121;
			local58[local64] = (float) local129 + (local55 * ((float) local144 + local55 * (float) local161) + (float) local134) * local55;
		}
		Static222.anInt3814 = (int) local58[1] * -1;
		Static393.anInt7135 = (int) local58[2] - Static366.anInt6052 * 128;
		Static235.anInt4004 = (int) local58[0] - Static365.anInt6047 * 128;
		@Pc(216) float[] local216 = new float[3];
		local88 = Static258.anInt4309 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static295.anIntArrayArrayArray7[Static171.anInt3113][local88][local121] * 3;
			local134 = Static295.anIntArrayArrayArray7[Static171.anInt3113][local88 + 1][local121] * 3;
			local144 = (Static295.anIntArrayArrayArray7[Static171.anInt3113][local88 + 2][local121] + Static295.anIntArrayArrayArray7[Static171.anInt3113][local88 + 2][local121] - Static295.anIntArrayArrayArray7[Static171.anInt3113][local88 + 3][local121]) * 3;
			local161 = Static295.anIntArrayArrayArray7[Static171.anInt3113][local88][local121];
			@Pc(292) int local292 = local134 - local129;
			@Pc(302) int local302 = local129 + local144 - local134 * 2;
			@Pc(319) int local319 = local134 + Static295.anIntArrayArrayArray7[Static171.anInt3113][local88 + 2][local121] - local144 - local161;
			local216[local121] = local55 * (local55 * ((float) local302 + local55 * (float) local319) + (float) local292) + (float) local161;
		}
		@Pc(352) float local352 = local216[0] - local58[0];
		@Pc(367) float local367 = -1.0F * (local216[1] - local58[1]);
		@Pc(375) float local375 = local216[2] - local58[2];
		@Pc(385) double local385 = Math.sqrt((double) (local352 * local352 + local375 * local375));
		Static133.anInt2435 = (int) (Math.atan2((double) local367, local385) * 2607.5945876176133D) & 0x3FFF;
		Static411.anInt6947 = (int) (-Math.atan2((double) local352, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static226.anInt3896 = Static295.anIntArrayArrayArray7[Static320.anInt5206][local62][3] + (Static455.anInt7624 * (Static295.anIntArrayArrayArray7[Static320.anInt5206][local62 + 2][3] - Static295.anIntArrayArrayArray7[Static320.anInt5206][local62][3]) >> 16);
	}
}
