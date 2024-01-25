import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!fga", name = "f", descriptor = "[I")
	public static int[] anIntArray141;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "Lclient!gda;")
	public static Class126 aClass126_88;

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray6 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!fga", name = "b", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_50 = new Class156(84, -2);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(I)V")
	public static void method2791() {
		if (Static555.anInt8761 == -1 || Static35.anInt522 == -1) {
			return;
		}
		@Pc(26) int local26 = ((Static375.anInt7799 - Static473.anInt7693) * Static456.anInt7383 >> 16) + Static473.anInt7693;
		Static456.anInt7383 += local26;
		if (Static456.anInt7383 < 65535) {
			Static131.aBoolean148 = false;
			Static133.aBoolean150 = false;
		} else {
			if (Static133.aBoolean150) {
				Static131.aBoolean148 = false;
			} else {
				Static131.aBoolean148 = true;
			}
			Static456.anInt7383 = 65535;
			Static133.aBoolean150 = true;
		}
		@Pc(66) float local66 = (float) Static456.anInt7383 / 65535.0F;
		@Pc(69) float[] local69 = new float[3];
		@Pc(73) int local73 = Static237.anInt4099 * 2;
		@Pc(101) int local101;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(148) int local148;
		@Pc(157) int local157;
		@Pc(175) int local175;
		for (@Pc(75) int local75 = 0; local75 < 3; local75++) {
			@Pc(89) int local89 = Static499.anIntArrayArrayArray17[Static555.anInt8761][local73][local75] * 3;
			local101 = Static499.anIntArrayArrayArray17[Static555.anInt8761][local73 + 1][local75] * 3;
			local135 = (Static499.anIntArrayArrayArray17[Static555.anInt8761][local73 + 2][local75] + Static499.anIntArrayArrayArray17[Static555.anInt8761][local73 + 2][local75] - Static499.anIntArrayArrayArray17[Static555.anInt8761][local73 + 3][local75]) * 3;
			local143 = Static499.anIntArrayArrayArray17[Static555.anInt8761][local73][local75];
			local148 = local101 - local89;
			local157 = local135 + local89 - local101 * 2;
			local175 = local101 + Static499.anIntArrayArrayArray17[Static555.anInt8761][local73 + 2][local75] - local143 - local135;
			local69[local75] = local66 * ((float) local148 + local66 * ((float) local175 * local66 + (float) local157)) + (float) local143;
		}
		Static42.anInt703 = (int) local69[1] * -1;
		Static141.anInt2764 = (int) local69[0] - Static315.anInt5380 * 512;
		Static282.anInt5025 = (int) local69[2] - Static290.anInt5128 * 512;
		@Pc(230) float[] local230 = new float[3];
		local101 = Static227.anInt9454 * 2;
		for (local135 = 0; local135 < 3; local135++) {
			local143 = Static499.anIntArrayArrayArray17[Static35.anInt522][local101][local135] * 3;
			local148 = Static499.anIntArrayArrayArray17[Static35.anInt522][local101 + 1][local135] * 3;
			local157 = (Static499.anIntArrayArrayArray17[Static35.anInt522][local101 + 2][local135] + Static499.anIntArrayArrayArray17[Static35.anInt522][local101 + 2][local135] - Static499.anIntArrayArrayArray17[Static35.anInt522][local101 + 3][local135]) * 3;
			local175 = Static499.anIntArrayArrayArray17[Static35.anInt522][local101][local135];
			@Pc(311) int local311 = local148 - local143;
			@Pc(320) int local320 = local143 + local157 - local148 * 2;
			@Pc(337) int local337 = local148 + Static499.anIntArrayArrayArray17[Static35.anInt522][local101 - -2][local135] - local157 - local175;
			local230[local135] = (float) local175 + local66 * ((float) local311 + (local66 * (float) local337 + (float) local320) * local66);
		}
		@Pc(369) float local369 = local230[0] - local69[0];
		@Pc(380) float local380 = (local230[1] - local69[1]) * -1.0F;
		@Pc(388) float local388 = local230[2] - local69[2];
		@Pc(398) double local398 = Math.sqrt((double) (local388 * local388 + local369 * local369));
		Static96.anInt10862 = (int) (Math.atan2((double) local380, local398) * 2607.5945876176133D) & 0x3FFF;
		Static542.anInt8612 = (int) (-Math.atan2((double) local369, (double) local388) * 2607.5945876176133D) & 0x3FFF;
		Static331.anInt5582 = ((Static499.anIntArrayArrayArray17[Static555.anInt8761][local73 + 2][3] - Static499.anIntArrayArrayArray17[Static555.anInt8761][local73][3]) * Static456.anInt7383 >> 16) + Static499.anIntArrayArrayArray17[Static555.anInt8761][local73][3];
	}
}
