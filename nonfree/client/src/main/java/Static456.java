import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!tg", name = "E", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	public static int anInt8316 = -1;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZZ)V")
	public static void method6972(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static450.anInt8197--;
			if (Static450.anInt8197 == 0) {
				Static77.anIntArray130 = null;
			}
		}
		if (!arg1) {
			return;
		}
		Static93.anInt1821--;
		if (Static93.anInt1821 == 0) {
			Static445.anIntArray614 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V")
	public static void method6973() {
		if (Static28.anInt525 == -1 || Static401.anInt7597 == -1) {
			return;
		}
		@Pc(24) int local24 = Static92.anInt1815 + (Static160.anInt2916 * (Static394.anInt7459 - Static92.anInt1815) >> 16);
		Static160.anInt2916 += local24;
		if (Static160.anInt2916 < 65535) {
			Static435.aBoolean585 = false;
			Static369.aBoolean520 = false;
		} else {
			Static160.anInt2916 = 65535;
			if (Static369.aBoolean520) {
				Static435.aBoolean585 = false;
			} else {
				Static435.aBoolean585 = true;
			}
			Static369.aBoolean520 = true;
		}
		@Pc(54) float local54 = (float) Static160.anInt2916 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static145.anInt2688 * 2;
		@Pc(87) int local87;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(143) int local143;
		@Pc(160) int local160;
		for (@Pc(63) int local63 = 0; local63 < 3; local63++) {
			@Pc(75) int local75 = Static16.anIntArrayArrayArray1[Static28.anInt525][local61][local63] * 3;
			local87 = Static16.anIntArrayArrayArray1[Static28.anInt525][local61 + 1][local63] * 3;
			local121 = (Static16.anIntArrayArrayArray1[Static28.anInt525][local61 + 2][local63] + Static16.anIntArrayArrayArray1[Static28.anInt525][local61 + 2][local63] - Static16.anIntArrayArrayArray1[Static28.anInt525][local61 + 3][local63]) * 3;
			local129 = Static16.anIntArrayArrayArray1[Static28.anInt525][local61][local63];
			local133 = local87 - local75;
			local143 = local75 + local121 - local87 * 2;
			local160 = Static16.anIntArrayArrayArray1[Static28.anInt525][local61 + 2][local63] + local87 - local129 - local121;
			local57[local63] = (float) local129 + local54 * (((float) local160 * local54 + (float) local143) * local54 + (float) local133);
		}
		Static187.anInt3432 = (int) local57[0] - Static238.anInt4280 * 128;
		Static329.anInt3848 = (int) local57[1] * -1;
		Static353.anInt5258 = (int) local57[2] - Static371.anInt6936 * 128;
		@Pc(216) float[] local216 = new float[3];
		local87 = Static452.anInt8228 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static16.anIntArrayArrayArray1[Static401.anInt7597][local87][local121] * 3;
			local133 = Static16.anIntArrayArrayArray1[Static401.anInt7597][local87 + 1][local121] * 3;
			local143 = (Static16.anIntArrayArrayArray1[Static401.anInt7597][local87 + 2][local121] + Static16.anIntArrayArrayArray1[Static401.anInt7597][local87 + 2][local121] - Static16.anIntArrayArrayArray1[Static401.anInt7597][local87 + 3][local121]) * 3;
			local160 = Static16.anIntArrayArrayArray1[Static401.anInt7597][local87][local121];
			@Pc(292) int local292 = local133 - local129;
			@Pc(301) int local301 = local129 + local143 - local133 * 2;
			@Pc(320) int local320 = Static16.anIntArrayArrayArray1[Static401.anInt7597][local87 + 2][local121] + local133 - local160 - local143;
			local216[local121] = (((float) local320 * local54 + (float) local301) * local54 + (float) local292) * local54 + (float) local160;
		}
		@Pc(357) float local357 = local216[0] - local57[0];
		@Pc(367) float local367 = -1.0F * (local216[1] - local57[1]);
		@Pc(375) float local375 = local216[2] - local57[2];
		@Pc(385) double local385 = Math.sqrt((double) (local357 * local357 + local375 * local375));
		Static209.anInt3769 = (int) (Math.atan2((double) local367, local385) * 2607.5945876176133D) & 0x3FFF;
		Static429.anInt7997 = (int) (-Math.atan2((double) local357, (double) local375) * 2607.5945876176133D) & 0x3FFF;
		Static344.anInt6362 = (Static160.anInt2916 * (Static16.anIntArrayArrayArray1[Static28.anInt525][local61 + 2][3] - Static16.anIntArrayArrayArray1[Static28.anInt525][local61][3]) >> 16) + Static16.anIntArrayArrayArray1[Static28.anInt525][local61][3];
	}
}
