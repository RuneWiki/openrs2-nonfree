import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static143 {

	@OriginalMember(owner = "client!gs", name = "O", descriptor = "I")
	public static int anInt2595;

	@OriginalMember(owner = "client!gs", name = "N", descriptor = "I")
	public static int anInt2594 = 0;

	@OriginalMember(owner = "client!gs", name = "P", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_36 = new Class194(53, 6);

	@OriginalMember(owner = "client!gs", name = "R", descriptor = "J")
	public static long aLong81 = 0L;

	@OriginalMember(owner = "client!gs", name = "S", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!gs", name = "T", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_37 = new Class194(61, -1);

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "(I)V")
	public static void method2067() {
		if (Static412.anInt6868 == -1 || Static294.anInt4616 == -1) {
			return;
		}
		@Pc(25) int local25 = ((Static156.anInt2708 - Static152.anInt2701) * Static401.anInt2162 >> 16) + Static152.anInt2701;
		Static401.anInt2162 += local25;
		if (Static401.anInt2162 < 65535) {
			Static286.aBoolean293 = false;
			Static311.aBoolean336 = false;
		} else {
			Static401.anInt2162 = 65535;
			if (Static286.aBoolean293) {
				Static311.aBoolean336 = false;
			} else {
				Static311.aBoolean336 = true;
			}
			Static286.aBoolean293 = true;
		}
		@Pc(55) float local55 = (float) Static401.anInt2162 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static398.anInt6493 * 2;
		@Pc(88) int local88;
		@Pc(121) int local121;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(142) int local142;
		@Pc(160) int local160;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static222.anIntArrayArrayArray10[Static412.anInt6868][local62][local64] * 3;
			local88 = Static222.anIntArrayArrayArray10[Static412.anInt6868][local62 + 1][local64] * 3;
			local121 = (Static222.anIntArrayArrayArray10[Static412.anInt6868][local62 + 2][local64] + Static222.anIntArrayArrayArray10[Static412.anInt6868][local62 + 2][local64] - Static222.anIntArrayArrayArray10[Static412.anInt6868][local62 + 3][local64]) * 3;
			local129 = Static222.anIntArrayArrayArray10[Static412.anInt6868][local62][local64];
			local133 = local88 - local76;
			local142 = local121 + local76 - local88 * 2;
			local160 = local88 + Static222.anIntArrayArrayArray10[Static412.anInt6868][local62 + 2][local64] - local121 - local129;
			local58[local64] = (float) local129 + local55 * ((float) local133 + local55 * (local55 * (float) local160 + (float) local142));
		}
		Static393.anInt4184 = (int) local58[2] - Static226.anInt3768 * 128;
		Static116.anInt1977 = (int) local58[0] - Static31.anInt618 * 128;
		Static444.anInt7360 = (int) local58[1] * -1;
		@Pc(212) float[] local212 = new float[3];
		local88 = Static15.anInt344 * 2;
		for (local121 = 0; local121 < 3; local121++) {
			local129 = Static222.anIntArrayArrayArray10[Static294.anInt4616][local88][local121] * 3;
			local133 = Static222.anIntArrayArrayArray10[Static294.anInt4616][local88 + 1][local121] * 3;
			local142 = (Static222.anIntArrayArrayArray10[Static294.anInt4616][local88 + 2][local121] + Static222.anIntArrayArrayArray10[Static294.anInt4616][local88 + 2][local121] - Static222.anIntArrayArrayArray10[Static294.anInt4616][local88 + 3][local121]) * 3;
			local160 = Static222.anIntArrayArrayArray10[Static294.anInt4616][local88][local121];
			@Pc(288) int local288 = local133 - local129;
			@Pc(297) int local297 = local129 + local142 - local133 * 2;
			@Pc(315) int local315 = local133 + Static222.anIntArrayArrayArray10[Static294.anInt4616][local88 + 2][local121] - local160 - local142;
			local212[local121] = (float) local160 + ((float) local288 + (local55 * (float) local315 + (float) local297) * local55) * local55;
		}
		@Pc(347) float local347 = local212[0] - local58[0];
		@Pc(365) float local365 = -1.0F * (local212[1] - local58[1]);
		@Pc(373) float local373 = local212[2] - local58[2];
		@Pc(383) double local383 = Math.sqrt((double) (local347 * local347 + local373 * local373));
		Static248.anInt3998 = (int) (Math.atan2((double) local365, local383) * 2607.5945876176133D) & 0x3FFF;
		Static442.anInt7328 = (int) (-Math.atan2((double) local347, (double) local373) * 2607.5945876176133D) & 0x3FFF;
		Static194.anInt3230 = Static222.anIntArrayArrayArray10[Static412.anInt6868][local62][3] + (Static401.anInt2162 * (Static222.anIntArrayArrayArray10[Static412.anInt6868][local62 + 2][3] - Static222.anIntArrayArrayArray10[Static412.anInt6868][local62][3]) >> 16);
	}

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "(I)V")
	public static void method2068() {
		@Pc(16) Class5_Sub2_Sub9 local16 = Static72.method1073(15, 0);
		local16.method3024();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method2070(@OriginalArg(0) String arg0) {
		if (Static286.aStringArray33 == null) {
			Static301.method3744();
		}
		@Pc(14) String[] local14 = Static73.method1083('\n', arg0);
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			for (@Pc(22) int local22 = Static36.anInt723; local22 > 0; local22--) {
				Static286.aStringArray33[local22] = Static286.aStringArray33[local22 - 1];
			}
			Static286.aStringArray33[0] = local14[local16];
			if (Static36.anInt723 < Static286.aStringArray33.length - 1) {
				if (Static193.anInt3219 > 0) {
					Static193.anInt3219++;
				}
				Static36.anInt723++;
			}
		}
	}
}
