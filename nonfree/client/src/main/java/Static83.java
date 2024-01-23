import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!gl", name = "E", descriptor = "Lclient!ai;")
	public static Class9_Sub1_Sub1 aClass9_Sub1_Sub1_1;

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "I")
	public static int anInt2246;

	@OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
	public static int anInt2232 = 0;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "I")
	public static int anInt2241 = 0;

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "S")
	public static short aShort14 = 256;

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V")
	public static void method1671() {
		if (Static99.anInt2713 == -1 || Static187.anInt4200 == -1) {
			return;
		}
		@Pc(25) int local25 = ((Static256.anInt5444 - Static84.anInt2408) * Static123.anInt1281 >> 16) + Static84.anInt2408;
		Static123.anInt1281 += local25;
		if (Static123.anInt1281 >= 65535) {
			if (Static8.aBoolean5) {
				Static137.aBoolean177 = false;
			} else {
				Static137.aBoolean177 = true;
			}
			Static8.aBoolean5 = true;
			Static123.anInt1281 = 65535;
		} else {
			Static137.aBoolean177 = false;
			Static8.aBoolean5 = false;
		}
		@Pc(55) float local55 = (float) Static123.anInt1281 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static223.anInt4896 * 2;
		@Pc(88) int local88;
		@Pc(135) int local135;
		@Pc(101) int local101;
		@Pc(93) int local93;
		@Pc(163) int local163;
		@Pc(154) int local154;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(76) int local76 = Static227.anIntArrayArrayArray11[Static99.anInt2713][local62][local64] * 3;
			local88 = Static227.anIntArrayArrayArray11[Static99.anInt2713][local62 + 1][local64] * 3;
			local93 = local88 - local76;
			local101 = Static227.anIntArrayArrayArray11[Static99.anInt2713][local62][local64];
			local135 = (Static227.anIntArrayArrayArray11[Static99.anInt2713][local62 + 2][local64] + Static227.anIntArrayArrayArray11[Static99.anInt2713][local62 + 2][local64] - Static227.anIntArrayArrayArray11[Static99.anInt2713][local62 + 3][local64]) * 3;
			local154 = Static227.anIntArrayArrayArray11[Static99.anInt2713][local62 + 2][local64] + local88 - local135 - local101;
			local163 = local76 + local135 - local88 * 2;
			local58[local64] = local55 * (((float) local163 + local55 * (float) local154) * local55 + (float) local93) + (float) local101;
		}
		Static109.anInt2904 = (int) local58[1] * -1;
		Static110.anInt2935 = (int) local58[2] - Static29.anInt907 * 128;
		Static174.anInt4003 = (int) local58[0] - Static64.anInt1786 * 128;
		@Pc(219) float[] local219 = new float[3];
		local88 = Static184.anInt4178 * 2;
		for (local135 = 0; local135 < 3; local135++) {
			local93 = Static227.anIntArrayArrayArray11[Static187.anInt4200][local88 + 1][local135] * 3;
			local101 = Static227.anIntArrayArrayArray11[Static187.anInt4200][local88][local135] * 3;
			local154 = Static227.anIntArrayArrayArray11[Static187.anInt4200][local88][local135];
			@Pc(261) int local261 = local93 - local101;
			local163 = (Static227.anIntArrayArrayArray11[Static187.anInt4200][local88 + 2][local135] + Static227.anIntArrayArrayArray11[Static187.anInt4200][local88 + 2][local135] - Static227.anIntArrayArrayArray11[Static187.anInt4200][local88 + 3][local135]) * 3;
			@Pc(303) int local303 = local101 + local163 - local93 * 2;
			@Pc(321) int local321 = local93 + Static227.anIntArrayArrayArray11[Static187.anInt4200][local88 + 2][local135] - local163 - local154;
			local219[local135] = (float) local154 + local55 * ((float) local261 + ((float) local303 + local55 * (float) local321) * local55);
		}
		@Pc(355) float local355 = (local219[1] - local58[1]) * -1.0F;
		@Pc(368) float local368 = local219[0] - local58[0];
		@Pc(377) float local377 = local219[2] - local58[2];
		@Pc(387) double local387 = Math.sqrt((double) (local368 * local368 + local377 * local377));
		Static99.aFloat21 = (float) Math.atan2((double) local355, local387);
		Static146.aFloat29 = -((float) Math.atan2((double) local368, (double) local377));
		Static200.anInt4412 = (int) ((double) Static99.aFloat21 * 325.949D) & 0x7FF;
		Static127.anInt3198 = (int) ((double) Static146.aFloat29 * 325.949D) & 0x7FF;
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)I")
	public static int method1672() {
		return Static157.aClass79_20.method2481();
	}
}
