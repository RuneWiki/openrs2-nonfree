import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "Lclient!rg;")
	public static Class310 aClass310_59;

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "Lclient!lw;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
	public static int anInt4944 = -1;

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
	public static final int anInt4946 = 2;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public static void method4408() {
		if (Static627.anInt10294 == -1 || Static600.anInt9908 == -1) {
			return;
		}
		@Pc(25) int local25 = Static639.anInt10498 + (Static238.anInt4577 * (Static284.anInt5240 - Static639.anInt10498) >> 16);
		Static238.anInt4577 += local25;
		if (Static238.anInt4577 < 65535) {
			Static523.aBoolean627 = false;
			Static323.aBoolean404 = false;
		} else {
			if (Static523.aBoolean627) {
				Static323.aBoolean404 = false;
			} else {
				Static323.aBoolean404 = true;
			}
			Static238.anInt4577 = 65535;
			Static523.aBoolean627 = true;
		}
		@Pc(55) float local55 = (float) Static238.anInt4577 / 65535.0F;
		@Pc(58) float[] local58 = new float[3];
		@Pc(62) int local62 = Static633.anInt10642 * 2;
		@Pc(87) int local87;
		@Pc(119) int local119;
		@Pc(127) int local127;
		@Pc(132) int local132;
		@Pc(140) int local140;
		@Pc(159) int local159;
		for (@Pc(64) int local64 = 0; local64 < 3; local64++) {
			@Pc(75) int local75 = Static636.anIntArrayArrayArray19[Static627.anInt10294][local62][local64] * 3;
			local87 = Static636.anIntArrayArrayArray19[Static627.anInt10294][local62 + 1][local64] * 3;
			local119 = (Static636.anIntArrayArrayArray19[Static627.anInt10294][local62 + 2][local64] + Static636.anIntArrayArrayArray19[Static627.anInt10294][local62 + 2][local64] - Static636.anIntArrayArrayArray19[Static627.anInt10294][local62 + 3][local64]) * 3;
			local127 = Static636.anIntArrayArrayArray19[Static627.anInt10294][local62][local64];
			local132 = local87 - local75;
			local140 = local75 + local119 - local87 * 2;
			local159 = Static636.anIntArrayArrayArray19[Static627.anInt10294][local62 + 2][local64] + local87 - local119 - local127;
			local58[local64] = (float) local127 + ((float) local132 + ((float) local140 + (float) local159 * local55) * local55) * local55;
		}
		Static229.anInt4393 = (int) local58[2] - Static550.anInt9242 * 512;
		Static70.anInt1085 = (int) local58[0] - Static36.anInt617 * 512;
		Static153.anInt2372 = (int) local58[1] * -1;
		@Pc(212) float[] local212 = new float[3];
		local87 = Static406.anInt7028 * 2;
		for (local119 = 0; local119 < 3; local119++) {
			local127 = Static636.anIntArrayArrayArray19[Static600.anInt9908][local87][local119] * 3;
			local132 = Static636.anIntArrayArrayArray19[Static600.anInt9908][local87 + 1][local119] * 3;
			local140 = (Static636.anIntArrayArrayArray19[Static600.anInt9908][local87 + 2][local119] + Static636.anIntArrayArrayArray19[Static600.anInt9908][local87 + 2][local119] - Static636.anIntArrayArrayArray19[Static600.anInt9908][local87 + 3][local119]) * 3;
			local159 = Static636.anIntArrayArrayArray19[Static600.anInt9908][local87][local119];
			@Pc(286) int local286 = local132 - local127;
			@Pc(295) int local295 = local140 + local127 - local132 * 2;
			@Pc(313) int local313 = Static636.anIntArrayArrayArray19[Static600.anInt9908][local87 + 2][local119] + local132 - local159 - local140;
			local212[local119] = local55 * ((local55 * (float) local313 + (float) local295) * local55 + (float) local286) + (float) local159;
		}
		@Pc(345) float local345 = local212[0] - local58[0];
		@Pc(355) float local355 = (local212[1] - local58[1]) * -1.0F;
		@Pc(363) float local363 = local212[2] - local58[2];
		@Pc(373) double local373 = Math.sqrt((double) (local345 * local345 + local363 * local363));
		Static126.anInt9524 = (int) (Math.atan2((double) local355, local373) * 2607.5945876176133D) & 0x3FFF;
		Static669.anInt10940 = (int) (-Math.atan2((double) local345, (double) local363) * 2607.5945876176133D) & 0x3FFF;
		Static470.anInt8100 = (Static238.anInt4577 * (Static636.anIntArrayArrayArray19[Static627.anInt10294][local62 + 2][3] - Static636.anIntArrayArrayArray19[Static627.anInt10294][local62][3]) >> 16) + Static636.anIntArrayArrayArray19[Static627.anInt10294][local62][3];
	}
}
