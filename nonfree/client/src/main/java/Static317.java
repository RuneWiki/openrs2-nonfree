import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!lv", name = "f", descriptor = "[Lclient!f;")
	public static Class38[] aClass38Array17;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "Lclient!nw;")
	public static final Class247 aClass247_2 = new Class247();

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
	public static int anInt5332 = -1;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_68 = new Class154(40, -1);

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(I)V")
	public static void method4597() {
		if (Static570.aBoolean772) {
			return;
		}
		Static570.aBoolean772 = true;
		Static122.aBoolean139 = true;
		if (Static257.aClass2_Sub35_Sub1_1.aBoolean638) {
			Static541.aFloat128 = (int) Static541.aFloat128 - 17 & 0xFFFFFFF0;
		} else {
			Static452.aFloat192 += (-Static452.aFloat192 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
	public static void method4598() {
		if (Static2.anInt12 == -1 || Static264.anInt4328 == -1) {
			return;
		}
		@Pc(24) int local24 = ((Static568.anInt9276 - Static371.anInt6215) * Static532.anInt8752 >> 16) + Static371.anInt6215;
		Static532.anInt8752 += local24;
		if (Static532.anInt8752 < 65535) {
			Static30.aBoolean29 = false;
			Static570.aBoolean771 = false;
		} else {
			Static532.anInt8752 = 65535;
			if (Static30.aBoolean29) {
				Static570.aBoolean771 = false;
			} else {
				Static570.aBoolean771 = true;
			}
			Static30.aBoolean29 = true;
		}
		@Pc(54) float local54 = (float) Static532.anInt8752 / 65535.0F;
		@Pc(57) float[] local57 = new float[3];
		@Pc(61) int local61 = Static217.anInt3144 * 2;
		@Pc(92) int local92;
		@Pc(125) int local125;
		@Pc(133) int local133;
		@Pc(138) int local138;
		@Pc(146) int local146;
		@Pc(164) int local164;
		for (@Pc(68) int local68 = 0; local68 < 3; local68++) {
			@Pc(80) int local80 = Static594.anIntArrayArrayArray20[Static2.anInt12][local61][local68] * 3;
			local92 = Static594.anIntArrayArrayArray20[Static2.anInt12][local61 + 1][local68] * 3;
			local125 = (Static594.anIntArrayArrayArray20[Static2.anInt12][local61 + 2][local68] + Static594.anIntArrayArrayArray20[Static2.anInt12][local61 + 2][local68] - Static594.anIntArrayArrayArray20[Static2.anInt12][local61 + 3][local68]) * 3;
			local133 = Static594.anIntArrayArrayArray20[Static2.anInt12][local61][local68];
			local138 = local92 - local80;
			local146 = local125 + local80 - local92 * 2;
			local164 = local92 + Static594.anIntArrayArrayArray20[Static2.anInt12][local61 + 2][local68] - local133 - local125;
			local57[local68] = (float) local133 + local54 * (local54 * ((float) local164 * local54 + (float) local146) + (float) local138);
		}
		Static151.anInt2436 = (int) local57[1] * -1;
		Static469.anInt7519 = (int) local57[2] - Static310.anInt5129 * 512;
		Static285.anInt2206 = (int) local57[0] - Static485.anInt7725 * 512;
		@Pc(217) float[] local217 = new float[3];
		local92 = Static337.anInt5571 * 2;
		for (local125 = 0; local125 < 3; local125++) {
			local133 = Static594.anIntArrayArrayArray20[Static264.anInt4328][local92][local125] * 3;
			local138 = Static594.anIntArrayArrayArray20[Static264.anInt4328][local92 + 1][local125] * 3;
			local146 = (Static594.anIntArrayArrayArray20[Static264.anInt4328][local92 + 2][local125] + Static594.anIntArrayArrayArray20[Static264.anInt4328][local92 + 2][local125] - Static594.anIntArrayArrayArray20[Static264.anInt4328][local92 + 3][local125]) * 3;
			local164 = Static594.anIntArrayArrayArray20[Static264.anInt4328][local92][local125];
			@Pc(294) int local294 = local138 - local133;
			@Pc(302) int local302 = local146 + local133 - local138 * 2;
			@Pc(320) int local320 = local138 + Static594.anIntArrayArrayArray20[Static264.anInt4328][local92 + 2][local125] - local146 - local164;
			local217[local125] = local54 * ((float) local294 + local54 * ((float) local320 * local54 + (float) local302)) + (float) local164;
		}
		@Pc(352) float local352 = local217[0] - local57[0];
		@Pc(363) float local363 = -1.0F * (local217[1] - local57[1]);
		@Pc(372) float local372 = local217[2] - local57[2];
		@Pc(382) double local382 = Math.sqrt((double) (local372 * local372 + local352 * local352));
		Static396.anInt6527 = (int) (Math.atan2((double) local363, local382) * 2607.5945876176133D) & 0x3FFF;
		Static584.anInt9487 = (int) (-Math.atan2((double) local352, (double) local372) * 2607.5945876176133D) & 0x3FFF;
		Static140.anInt4804 = Static594.anIntArrayArrayArray20[Static2.anInt12][local61][3] + (Static532.anInt8752 * (Static594.anIntArrayArrayArray20[Static2.anInt12][local61 + 2][3] - Static594.anIntArrayArrayArray20[Static2.anInt12][local61][3]) >> 16);
	}
}
