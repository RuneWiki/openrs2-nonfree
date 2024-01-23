import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!sa", name = "K", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
	public static volatile int anInt5162 = 0;

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[I")
	public static int[] anIntArray533 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "[Lclient!ij;")
	public static Class1_Sub2_Sub12[] aClass1_Sub2_Sub12Array2 = new Class1_Sub2_Sub12[14];

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public static void method4067() {
		if (Static193.anInt4302 == -1 || Static217.anInt4819 == -1) {
			return;
		}
		@Pc(26) int local26 = Static45.anInt1322 + (Static152.anInt3527 * (Static110.anInt2372 - Static45.anInt1322) >> 16);
		Static152.anInt3527 += local26;
		if (Static152.anInt3527 < 65535) {
			Static152.aBoolean182 = false;
			Static158.aBoolean189 = false;
		} else {
			Static152.anInt3527 = 65535;
			if (Static152.aBoolean182) {
				Static158.aBoolean189 = false;
			} else {
				Static158.aBoolean189 = true;
			}
			Static152.aBoolean182 = true;
		}
		@Pc(56) float local56 = (float) Static152.anInt3527 / 65535.0F;
		@Pc(59) float[] local59 = new float[3];
		@Pc(63) int local63 = Static175.anInt3975 * 2;
		@Pc(80) int local80;
		@Pc(92) int local92;
		@Pc(125) int local125;
		@Pc(133) int local133;
		@Pc(138) int local138;
		@Pc(165) int local165;
		@Pc(156) int local156;
		for (@Pc(65) int local65 = 0; local65 < 3; local65++) {
			local80 = Static101.anIntArrayArrayArray14[Static193.anInt4302][local63][local65] * 3;
			local92 = Static101.anIntArrayArrayArray14[Static193.anInt4302][local63 + 1][local65] * 3;
			local125 = (Static101.anIntArrayArrayArray14[Static193.anInt4302][local63 + 2][local65] + Static101.anIntArrayArrayArray14[Static193.anInt4302][local63 + 2][local65] - Static101.anIntArrayArrayArray14[Static193.anInt4302][local63 + 3][local65]) * 3;
			local133 = Static101.anIntArrayArrayArray14[Static193.anInt4302][local63][local65];
			local138 = local92 - local80;
			local156 = local92 + Static101.anIntArrayArrayArray14[Static193.anInt4302][local63 + 2][local65] - local125 - local133;
			local165 = local125 + local80 - local92 * 2;
			local59[local65] = ((float) local138 + ((float) local165 + local56 * (float) local156) * local56) * local56 + (float) local133;
		}
		Static157.anInt3612 = (int) local59[2] - Static266.anInt5790 * 128;
		Static229.anInt5072 = (int) local59[0] - Static82.anInt1972 * 128;
		local80 = Static189.anInt4212 * 2;
		Static48.anInt1350 = (int) local59[1] * -1;
		@Pc(221) float[] local221 = new float[3];
		for (local92 = 0; local92 < 3; local92++) {
			local125 = Static101.anIntArrayArrayArray14[Static217.anInt4819][local80][local92] * 3;
			local133 = Static101.anIntArrayArrayArray14[Static217.anInt4819][local80 + 1][local92] * 3;
			local138 = (Static101.anIntArrayArrayArray14[Static217.anInt4819][local80 + 2][local92] + Static101.anIntArrayArrayArray14[Static217.anInt4819][local80 + 2][local92] - Static101.anIntArrayArrayArray14[Static217.anInt4819][local80 + 3][local92]) * 3;
			local165 = Static101.anIntArrayArrayArray14[Static217.anInt4819][local80][local92];
			local156 = local133 - local125;
			@Pc(303) int local303 = local125 + local138 - local133 * 2;
			@Pc(321) int local321 = local133 + Static101.anIntArrayArrayArray14[Static217.anInt4819][local80 + 2][local92] - local165 - local138;
			local221[local92] = (float) local165 + (local56 * ((float) local303 + (float) local321 * local56) + (float) local156) * local56;
		}
		@Pc(352) float local352 = local221[0] - local59[0];
		@Pc(368) float local368 = -1.0F * (local221[1] - local59[1]);
		@Pc(376) float local376 = local221[2] - local59[2];
		@Pc(386) double local386 = Math.sqrt((double) (local376 * local376 + local352 * local352));
		Static273.aFloat193 = (float) Math.atan2((double) local368, local386);
		Static27.aFloat21 = -((float) Math.atan2((double) local352, (double) local376));
		Static97.anInt6055 = (int) ((double) Static27.aFloat21 * 325.949D) & 0x7FF;
		Static38.anInt1151 = (int) ((double) Static273.aFloat193 * 325.949D) & 0x7FF;
	}
}
