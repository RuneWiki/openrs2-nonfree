import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
	public static int anInt4164;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "Lclient!gj;")
	public static Class124 aClass124_6;

	@OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
	public static int anInt4166;

	@OriginalMember(owner = "client!hk", name = "j", descriptor = "[I")
	public static final int[] anIntArray328 = new int[1000];

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "Z")
	public static final boolean aBoolean295 = true;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
	public static final int[] anIntArray329 = new int[14];

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	public static void method3454() {
		if (Static123.anInt2476 == -1 || Static358.anInt6615 == -1) {
			return;
		}
		@Pc(23) int local23 = (Static225.anInt4187 * (Static36.anInt969 - Static403.anInt7398) >> 16) + Static403.anInt7398;
		Static225.anInt4187 += local23;
		if (Static225.anInt4187 < 65535) {
			Static259.aBoolean739 = false;
			Static456.aBoolean550 = false;
		} else {
			Static225.anInt4187 = 65535;
			if (Static259.aBoolean739) {
				Static456.aBoolean550 = false;
			} else {
				Static456.aBoolean550 = true;
			}
			Static259.aBoolean739 = true;
		}
		@Pc(53) float local53 = (float) Static225.anInt4187 / 65535.0F;
		@Pc(56) float[] local56 = new float[3];
		@Pc(60) int local60 = Static76.anInt1651 * 2;
		@Pc(90) int local90;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(135) int local135;
		@Pc(144) int local144;
		@Pc(162) int local162;
		for (@Pc(66) int local66 = 0; local66 < 3; local66++) {
			@Pc(78) int local78 = Static546.anIntArrayArrayArray20[Static123.anInt2476][local60][local66] * 3;
			local90 = Static546.anIntArrayArrayArray20[Static123.anInt2476][local60 + 1][local66] * 3;
			local122 = (Static546.anIntArrayArrayArray20[Static123.anInt2476][local60 + 2][local66] + Static546.anIntArrayArrayArray20[Static123.anInt2476][local60 + 2][local66] - Static546.anIntArrayArrayArray20[Static123.anInt2476][local60 + 3][local66]) * 3;
			local130 = Static546.anIntArrayArrayArray20[Static123.anInt2476][local60][local66];
			local135 = local90 - local78;
			local144 = local78 + local122 - local90 * 2;
			local162 = local90 + Static546.anIntArrayArrayArray20[Static123.anInt2476][local60 + 2][local66] - local130 - local122;
			local56[local66] = (float) local130 + local53 * (local53 * ((float) local162 * local53 + (float) local144) + (float) local135);
		}
		Static396.anInt7302 = (int) local56[1] * -1;
		Static74.anInt1618 = (int) local56[2] - Static202.anInt3755 * 512;
		Static233.anInt4273 = (int) local56[0] - Static329.anInt6225 * 512;
		@Pc(218) float[] local218 = new float[3];
		local90 = Static65.anInt1515 * 2;
		for (local122 = 0; local122 < 3; local122++) {
			local130 = Static546.anIntArrayArrayArray20[Static358.anInt6615][local90][local122] * 3;
			local135 = Static546.anIntArrayArrayArray20[Static358.anInt6615][local90 + 1][local122] * 3;
			local144 = (Static546.anIntArrayArrayArray20[Static358.anInt6615][local90 + 2][local122] + Static546.anIntArrayArrayArray20[Static358.anInt6615][local90 + 2][local122] - Static546.anIntArrayArrayArray20[Static358.anInt6615][local90 + 3][local122]) * 3;
			local162 = Static546.anIntArrayArrayArray20[Static358.anInt6615][local90][local122];
			@Pc(294) int local294 = local135 - local130;
			@Pc(303) int local303 = local130 + local144 - local135 * 2;
			@Pc(320) int local320 = local135 + Static546.anIntArrayArrayArray20[Static358.anInt6615][local90 + 2][local122] - local162 - local144;
			local218[local122] = (float) local162 + ((float) local294 + ((float) local320 * local53 + (float) local303) * local53) * local53;
		}
		@Pc(353) float local353 = local218[0] - local56[0];
		@Pc(364) float local364 = (local218[1] - local56[1]) * -1.0F;
		@Pc(373) float local373 = local218[2] - local56[2];
		@Pc(383) double local383 = Math.sqrt((double) (local373 * local373 + local353 * local353));
		Static668.anInt11106 = (int) (Math.atan2((double) local364, local383) * 2607.5945876176133D) & 0x3FFF;
		Static219.anInt4123 = (int) (-Math.atan2((double) local353, (double) local373) * 2607.5945876176133D) & 0x3FFF;
		Static4.anInt27 = Static546.anIntArrayArrayArray20[Static123.anInt2476][local60][3] + ((Static546.anIntArrayArrayArray20[Static123.anInt2476][local60 + 2][3] - Static546.anIntArrayArrayArray20[Static123.anInt2476][local60][3]) * Static225.anInt4187 >> 16);
	}
}
