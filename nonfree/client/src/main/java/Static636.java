import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "[F")
	public static final float[] aFloatArray61 = new float[16];

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(FFFFIFFI)F")
	public static float method8645(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6) {
		@Pc(7) float local7 = 0.0F;
		@Pc(12) float local12 = arg2 - arg0;
		@Pc(17) float local17 = arg3 - arg1;
		@Pc(21) float local21 = arg4 - arg5;
		@Pc(23) float local23 = 0.0F;
		@Pc(32) float local32 = 0.0F;
		@Pc(34) float local34 = 0.0F;
		while (local7 < 1.1F) {
			@Pc(44) float local44 = arg0 + local12 * local7;
			@Pc(50) float local50 = arg1 + local7 * local17;
			@Pc(56) float local56 = local21 * local7 + arg5;
			@Pc(61) int local61 = (int) local44 >> 9;
			@Pc(66) int local66 = (int) local56 >> 9;
			if (local61 > 0 && local66 > 0 && Static426.anInt6942 > local61 && local66 < Static280.anInt6752) {
				@Pc(99) int local99 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.aByte133;
				if (local99 < 3 && (Static392.aByteArrayArrayArray16[1][local61][local66] & 0x2) != 0) {
					local99++;
				}
				@Pc(129) int local129 = Static126.aClass133Array1[local99].method8214((int) local44, (int) local56);
				if ((float) local129 < local50) {
					if (arg6 < 2) {
						return local7;
					}
					return method8645(local23, local32, local44, local50, local56, local34, arg6 - 1) * 0.1F + local7 - 0.1F;
				}
			}
			local7 += 0.1F;
			local34 = local56;
			local23 = local44;
			local32 = local50;
		}
		return -1.0F;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIJ)Lclient!nj;")
	public static Class2_Sub6_Sub12 method8647(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1) {
		@Pc(24) Class2_Sub6_Sub12 local24 = (Class2_Sub6_Sub12) Static354.aClass218_25.method5095(arg1 | (long) arg0 << 56, 0);
		if (local24 == null) {
			local24 = new Class2_Sub6_Sub12(arg0, arg1);
			Static354.aClass218_25.method5099(local24, local24.aLong352);
		}
		return local24;
	}
}
