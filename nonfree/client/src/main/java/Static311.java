import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "[I")
	public static final int[] anIntArray295 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!lq", name = "m", descriptor = "F")
	public static float aFloat117 = 0.0F;

	@OriginalMember(owner = "client!lq", name = "n", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_107 = new Class56(51, -1);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!wn;[I[I[IB)V")
	public static void method4559(@OriginalArg(0) Class41_Sub2_Sub1_Sub4_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) int local13 = arg1[local7];
			@Pc(17) int local17 = arg2[local7];
			@Pc(21) int local21 = arg3[local7];
			@Pc(23) int local23 = 0;
			while (local17 != 0 && local23 < arg0.aClass152Array3.length) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass152Array3[local23] = null;
					} else {
						@Pc(47) Class185 local47 = Static545.aClass240_2.method5680(local13);
						@Pc(50) int local50 = local47.anInt4978;
						@Pc(55) Class152 local55 = arg0.aClass152Array3[local23];
						if (local55 != null) {
							if (local55.anInt4139 == local13) {
								if (local50 == 0) {
									local55 = arg0.aClass152Array3[local23] = null;
								} else if (local50 == 1) {
									local55.anInt4137 = 1;
									local55.anInt4140 = local21;
									local55.anInt4135 = 0;
									local55.anInt4136 = 0;
									local55.anInt4141 = 0;
									Static462.method6421(Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2 == arg0, arg0.anInt9444, local47, arg0.aByte117, arg0.anInt9442, 0);
								} else if (local50 == 2) {
									local55.anInt4141 = 0;
								}
							} else if (local47.anInt4981 >= Static545.aClass240_2.method5680(local55.anInt4139).anInt4981) {
								local55 = arg0.aClass152Array3[local23] = null;
							}
						}
						if (local55 == null) {
							local55 = arg0.aClass152Array3[local23] = new Class152();
							local55.anInt4140 = local21;
							local55.anInt4139 = local13;
							local55.anInt4137 = 1;
							local55.anInt4141 = 0;
							local55.anInt4136 = 0;
							local55.anInt4135 = 0;
							Static462.method6421(arg0 == Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2, arg0.anInt9444, local47, arg0.aByte117, arg0.anInt9442, 0);
						}
					}
				}
				local23++;
				local17 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IIZ)I")
	public static int method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static359.anInt6489 == -1) {
			return 1;
		}
		if (arg1 != Static60.anInt1312) {
			Static500.method6746(arg1, Static544.aClass343_17.method7222(Static256.anInt4535));
			if (Static60.anInt1312 != arg1) {
				return -1;
			}
		}
		try {
			@Pc(37) Dimension local37 = Static387.aCanvas9.getSize();
			Static525.method7021(Static544.aClass343_17.method7222(Static256.anInt4535), Static505.aClass45_11, Static569.aClass54_9, Static521.aClass134_12, true);
			@Pc(53) Class84 local53 = Static416.method5935(Static521.aClass322_141, Static359.anInt6489);
			@Pc(56) long local56 = Static158.method2936();
			Static505.aClass45_11.JA();
			Static472.aClass11_6.NA(0, Static323.anInt5468, 0);
			Static505.aClass45_11.method7367(Static472.aClass11_6);
			Static505.aClass45_11.la(local37.width / 2, local37.height / 2, 512, 512);
			Static505.aClass45_11.ra(1.0F);
			Static505.aClass45_11.VA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(97) Class60 local97 = Static505.aClass45_11.method7419(local53, 2048, 64, 64, 768);
			@Pc(99) int local99 = 0;
			label41: for (@Pc(101) int local101 = 0; local101 < 500; local101++) {
				Static505.aClass45_11.ja(0);
				Static505.aClass45_11.ya();
				for (@Pc(110) int local110 = 15; local110 >= 0; local110--) {
					for (@Pc(114) int local114 = 0; local114 <= local110; local114++) {
						Static338.aClass11_4.NA((int) ((-((float) local110 / 2.0F) + (float) local114) * (float) Static467.anInt7776), 0, Static467.anInt7776 * (local110 + 1));
						local97.method7230(Static338.aClass11_4, null, 0);
						local99++;
						if ((long) arg0 <= Static158.method2936() - local56) {
							break label41;
						}
					}
				}
			}
			Static505.aClass45_11.method7432();
			@Pc(180) long local180 = (long) (local99 * 1000) / (Static158.method2936() - local56);
			Static505.aClass45_11.ja(0);
			Static505.aClass45_11.ya();
			return (int) local180;
		} catch (@Pc(189) Throwable local189) {
			local189.printStackTrace();
			return -1;
		}
	}
}
