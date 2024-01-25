import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
	public static int anInt2323;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(I)[Lclient!sj;")
	public static Class326[] method2143() {
		return new Class326[] { Static97.aClass326_1, Static97.aClass326_2, Static97.aClass326_3, Static97.aClass326_4, Static97.aClass326_5, Static97.aClass326_6, Static97.aClass326_7, Static97.aClass326_8, Static97.aClass326_9, Static97.aClass326_10, Static97.aClass326_11, Static97.aClass326_12 };
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIFIIILclient!mfa;FIFFI[BF)V")
	public static void method2144(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(4) int arg2, @OriginalArg(6) Class157 arg3, @OriginalArg(7) float arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(12) byte[] arg7, @OriginalArg(13) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(46) int local46;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg0;
			arg3.method3469(local12, arg5 / (float) 128, 0, arg4 / (float) 128, arg2, arg8 / (float) 16, arg6 * 127.0F);
			for (local46 = 0; local46 < 16384; local46++) {
				arg7[local18] = (byte) (int) ((float) arg7[local18] + local12[local46]);
				local18++;
			}
			arg5 *= 2.0F;
			arg6 *= arg1;
			arg8 *= 2.0F;
			arg4 *= 2.0F;
		}
		local18 = arg0;
		for (local46 = 0; local46 < 16384; local46++) {
			arg7[local18] = (byte) (arg7[local18] + 127);
			local18++;
		}
	}
}
