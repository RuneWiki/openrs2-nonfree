import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method64() {
		if (Static337.anInt5635 == 1 || Static337.anInt5635 == 3 || Static337.anInt5635 != Static290.anInt5053 && (Static337.anInt5635 == 0 || Static290.anInt5053 == 0)) {
			Static76.anInt1390 = 0;
			Static379.anInt6398 = 0;
			Static63.aClass140_37.method3488();
		}
		Static290.anInt5053 = Static337.anInt5635;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method65() {
		if (Static464.anInt7828 == -1 || Static243.anInt7142 == -1) {
			return;
		}
		@Pc(23) int local23 = ((Static99.anInt1805 - Static212.anInt3711) * Static288.anInt5048 >> 16) + Static212.anInt3711;
		Static288.anInt5048 += local23;
		if (Static288.anInt5048 >= 65535) {
			Static288.anInt5048 = 65535;
			if (Static74.aBoolean89) {
				Static228.aBoolean278 = false;
			} else {
				Static228.aBoolean278 = true;
			}
			Static74.aBoolean89 = true;
		} else {
			Static228.aBoolean278 = false;
			Static74.aBoolean89 = false;
		}
		@Pc(53) float local53 = (float) Static288.anInt5048 / 65535.0F;
		@Pc(61) float[] local61 = new float[3];
		@Pc(65) int local65 = Static303.anInt5227 * 2;
		@Pc(91) int local91;
		@Pc(123) int local123;
		@Pc(131) int local131;
		@Pc(136) int local136;
		@Pc(145) int local145;
		@Pc(163) int local163;
		for (@Pc(67) int local67 = 0; local67 < 3; local67++) {
			@Pc(79) int local79 = Static270.anIntArrayArrayArray10[Static464.anInt7828][local65][local67] * 3;
			local91 = Static270.anIntArrayArrayArray10[Static464.anInt7828][local65 + 1][local67] * 3;
			local123 = (Static270.anIntArrayArrayArray10[Static464.anInt7828][local65 + 2][local67] + Static270.anIntArrayArrayArray10[Static464.anInt7828][local65 + 2][local67] - Static270.anIntArrayArrayArray10[Static464.anInt7828][local65 + 3][local67]) * 3;
			local131 = Static270.anIntArrayArrayArray10[Static464.anInt7828][local65][local67];
			local136 = local91 - local79;
			local145 = local123 + local79 - local91 * 2;
			local163 = local91 + Static270.anIntArrayArrayArray10[Static464.anInt7828][local65 + 2][local67] - local123 - local131;
			local61[local67] = (float) local131 + ((float) local136 + local53 * ((float) local163 * local53 + (float) local145)) * local53;
		}
		Static152.anInt7561 = (int) local61[2] - Static49.anInt873 * 128;
		Static410.anInt6946 = (int) local61[1] * -1;
		Static266.anInt4433 = (int) local61[0] - Static59.anInt1127 * 128;
		@Pc(219) float[] local219 = new float[3];
		local91 = Static373.anInt6325 * 2;
		for (local123 = 0; local123 < 3; local123++) {
			local131 = Static270.anIntArrayArrayArray10[Static243.anInt7142][local91][local123] * 3;
			local136 = Static270.anIntArrayArrayArray10[Static243.anInt7142][local91 + 1][local123] * 3;
			local145 = (Static270.anIntArrayArrayArray10[Static243.anInt7142][local91 + 2][local123] + Static270.anIntArrayArrayArray10[Static243.anInt7142][local91 + 2][local123] - Static270.anIntArrayArrayArray10[Static243.anInt7142][local91 + 3][local123]) * 3;
			local163 = Static270.anIntArrayArrayArray10[Static243.anInt7142][local91][local123];
			@Pc(294) int local294 = local136 - local131;
			@Pc(303) int local303 = local131 + local145 - local136 * 2;
			@Pc(320) int local320 = local136 + Static270.anIntArrayArrayArray10[Static243.anInt7142][local91 + 2][local123] - local145 - local163;
			local219[local123] = local53 * ((local53 * (float) local320 + (float) local303) * local53 + (float) local294) + (float) local163;
		}
		@Pc(354) float local354 = local219[0] - local61[0];
		@Pc(365) float local365 = (local219[1] - local61[1]) * -1.0F;
		@Pc(374) float local374 = local219[2] - local61[2];
		@Pc(384) double local384 = Math.sqrt((double) (local374 * local374 + local354 * local354));
		Static419.anInt7092 = (int) (Math.atan2((double) local365, local384) * 2607.5945876176133D) & 0x3FFF;
		Static372.anInt6317 = (int) (-Math.atan2((double) local354, (double) local374) * 2607.5945876176133D) & 0x3FFF;
		Static205.anInt5939 = Static270.anIntArrayArrayArray10[Static464.anInt7828][local65][3] + ((Static270.anIntArrayArrayArray10[Static464.anInt7828][local65 + 2][3] - Static270.anIntArrayArrayArray10[Static464.anInt7828][local65][3]) * Static288.anInt5048 >> 16);
	}
}
