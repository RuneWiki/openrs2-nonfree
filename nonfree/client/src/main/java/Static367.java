import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!paa", name = "k", descriptor = "Lclient!in;")
	public static Class146 aClass146_1;

	@OriginalMember(owner = "client!paa", name = "l", descriptor = "Lclient!je;")
	public static Class156 aClass156_1;

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "Lclient!dea;")
	public static final Class68 aClass68_53 = new Class68(8);

	@OriginalMember(owner = "client!paa", name = "h", descriptor = "[I")
	public static final int[] anIntArray470 = new int[1000];

	@OriginalMember(owner = "client!paa", name = "i", descriptor = "[F")
	public static final float[] aFloatArray55 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "([[BBLclient!gn;)V")
	public static void method5706(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class119_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt3799; local14++) {
			Static365.method5697();
			for (@Pc(20) int local20 = 0; local20 < Static37.anInt7512 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static329.anInt6247 >> 3; local24++) {
					@Pc(34) int local34 = Static116.anIntArrayArrayArray2[local14][local20][local24];
					if (local34 != -1) {
						@Pc(44) int local44 = local34 >> 24 & 0x3;
						if (!arg1.aBoolean312 || local44 == 0) {
							@Pc(55) int local55 = local34 >> 1 & 0x3;
							@Pc(61) int local61 = local34 >> 14 & 0x3FF;
							@Pc(67) int local67 = local34 >> 3 & 0x7FF;
							@Pc(77) int local77 = (local61 / 8 << 8) + local67 / 8;
							for (@Pc(79) int local79 = 0; local79 < Static443.anIntArray607.length; local79++) {
								if (Static443.anIntArray607[local79] == local77 && arg0[local79] != null) {
									@Pc(97) Class12_Sub8 local97 = new Class12_Sub8(arg0[local79]);
									arg1.method3332(local14, local20 * 8, local67, local44, local97, local55, Static510.aClass184Array1, local24 * 8, local61);
									arg1.method3341(local97, local20 * 8, local14, local61, local24 * 8, local55, local12[0] == -1 ? local12 : null, local44, Static243.aClass42_4, local67);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static476.aClass186_2 = Static114.aClass252_1.method6262(Static496.aClass60_3, local12[3], local12[1], local12[2], local12[0]);
			Static188.anInt4270 = local12[4];
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!mc;BII)V")
	public static void method5707(@OriginalArg(0) Class198 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class145 local16 = arg0.method4813(Static243.aClass42_4);
		if (local16 == null) {
			return;
		}
		Static243.aClass42_4.N(arg1, arg2, arg0.anInt5762 + arg1, arg0.anInt5715 + arg2);
		if (Static540.anInt9595 >= 3) {
			Static243.aClass42_4.G(-16777216, local16, arg1, arg2);
		} else {
			Static320.aClass84_17.method7492((float) arg0.anInt5762 / 2.0F + (float) arg1, (float) arg2 + (float) arg0.anInt5715 / 2.0F, ((int) -Static500.aFloat186 & 0x3FFF) << 2, local16, arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIZII)I")
	public static int method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(13) int local13 = arg4;
			arg4 = arg3;
			arg3 = local13;
		}
		@Pc(25) int local25 = arg2 & 0x3;
		if (local25 == 0) {
			return arg0;
		} else if (local25 == 1) {
			return 1 + 7 - arg4 - arg5;
		} else if (local25 == 2) {
			return 8 - arg3 - arg0;
		} else {
			return arg5;
		}
	}
}
