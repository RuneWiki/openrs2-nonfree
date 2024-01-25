import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static273 {

	@OriginalMember(owner = "client!jfa", name = "d", descriptor = "F")
	public static float aFloat103;

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)V")
	public static void method4432() {
		if (Static266.anInt4722 == -1 || Static134.anInt2727 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static639.anInt10150 - Static638.anInt9655) * Static246.anInt4482 >> 16) + Static638.anInt9655;
		Static246.anInt4482 += local23;
		if (Static246.anInt4482 < 65535) {
			Static218.aBoolean311 = false;
			Static464.aBoolean567 = false;
		} else {
			if (Static218.aBoolean311) {
				Static464.aBoolean567 = false;
			} else {
				Static464.aBoolean567 = true;
			}
			Static246.anInt4482 = 65535;
			Static218.aBoolean311 = true;
		}
		@Pc(55) float local55 = (float) Static246.anInt4482 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static510.anInt4841 * 2;
		@Pc(88) int local88;
		@Pc(120) int local120;
		@Pc(128) int local128;
		@Pc(132) int local132;
		@Pc(141) int local141;
		@Pc(158) int local158;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static290.anIntArrayArrayArray16[Static266.anInt4722][local62][local64] * 3;
			local88 = Static290.anIntArrayArrayArray16[Static266.anInt4722][local62 + 1][local64] * 3;
			local120 = (Static290.anIntArrayArrayArray16[Static266.anInt4722][local62 + 2][local64] + Static290.anIntArrayArrayArray16[Static266.anInt4722][local62 + 2][local64] - Static290.anIntArrayArrayArray16[Static266.anInt4722][local62 + 3][local64]) * 3;
			local128 = Static290.anIntArrayArrayArray16[Static266.anInt4722][local62][local64];
			local132 = local88 - local76;
			local141 = local120 + local76 - local88 * 2;
			local158 = local88 + Static290.anIntArrayArrayArray16[Static266.anInt4722][local62 + 2][local64] - local128 - local120;
			local58[local64] = ((float) local132 + ((float) local141 + local55 * (float) local158) * local55) * local55 + (float) local128;
		}
		Static509.anInt8222 = (int) local58[0] - Static287.anInt4910 * 512;
		Static146.anInt2945 = (int) local58[1] * -1;
		Static652.anInt10382 = (int) local58[2] - Static72.anInt1361 * 512;
		@Pc(214) float[] local214 = new float[3];
		local88 = Static247.anInt4487 * 2;
		for (local120 = 0; local120 < 3; local120++) {
			local128 = Static290.anIntArrayArrayArray16[Static134.anInt2727][local88][local120] * 3;
			local132 = Static290.anIntArrayArrayArray16[Static134.anInt2727][local88 + 1][local120] * 3;
			local141 = (Static290.anIntArrayArrayArray16[Static134.anInt2727][local88 + 2][local120] + Static290.anIntArrayArrayArray16[Static134.anInt2727][local88 + 2][local120] - Static290.anIntArrayArrayArray16[Static134.anInt2727][local88 + 3][local120]) * 3;
			local158 = Static290.anIntArrayArrayArray16[Static134.anInt2727][local88][local120];
			@Pc(290) int local290 = local132 - local128;
			@Pc(300) int local300 = local128 + local141 - local132 * 2;
			@Pc(317) int local317 = local132 + Static290.anIntArrayArrayArray16[Static134.anInt2727][local88 + 2][local120] - local158 - local141;
			local214[local120] = ((float) local290 + local55 * ((float) local300 + local55 * (float) local317)) * local55 + (float) local158;
		}
		@Pc(350) float local350 = local214[0] - local58[0];
		@Pc(361) float local361 = (local214[1] - local58[1]) * -1.0F;
		@Pc(369) float local369 = local214[2] - local58[2];
		@Pc(379) double local379 = Math.sqrt((double) (local350 * local350 + local369 * local369));
		Static520.anInt8367 = (int) (Math.atan2((double) local361, local379) * 2607.5945876176133D) & 0x3FFF;
		Static57.anInt1188 = (int) (-Math.atan2((double) local350, (double) local369) * 2607.5945876176133D) & 0x3FFF;
		Static631.anInt10060 = Static290.anIntArrayArrayArray16[Static266.anInt4722][local62][3] + (Static246.anInt4482 * (Static290.anIntArrayArrayArray16[Static266.anInt4722][local62 + 2][3] - Static290.anIntArrayArrayArray16[Static266.anInt4722][local62][3]) >> 16);
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(II)Z")
	public static boolean method4433(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 22 || arg0 == 5 || arg0 == 10 || arg0 == 49 || arg0 == 60 || arg0 == 8;
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(IIII)V")
	public static void method4434(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(40) String local40 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local40);
		Static371.method5395(local40, true, false);
	}
}
