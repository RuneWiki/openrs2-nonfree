import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZFILclient!p;I[BFFIIFFII)V")
	public static void method3757(@OriginalArg(1) float arg0, @OriginalArg(3) Class9 arg1, @OriginalArg(5) byte[] arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(9) int arg5, @OriginalArg(10) float arg6, @OriginalArg(11) float arg7, @OriginalArg(12) int arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(18) int local18;
		@Pc(56) int local56;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			local18 = arg8;
			arg1.method155(local12, arg6 / (float) 128, arg7 / (float) 16, 0, arg3 / (float) 128, arg4 * 127.0F, arg5);
			arg3 *= 2.0F;
			arg6 *= 2.0F;
			arg7 *= 2.0F;
			for (local56 = 0; local56 < 16384; local56++) {
				arg2[local18] = (byte) ((float) arg2[local18] + local12[local56]);
				local18++;
			}
			arg4 *= arg0;
		}
		local18 = arg8;
		for (local56 = 0; local56 < 16384; local56++) {
			arg2[local18] -= -127;
			local18++;
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILclient!at;II)V")
	public static void method3758(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) int arg2) {
		if (Static336.aClass16_18 != null || Static126.aBoolean52 || (arg1 == null || Static329.method3861(arg1) == null)) {
			return;
		}
		Static336.aClass16_18 = arg1;
		Static190.aClass16_9 = Static329.method3861(arg1);
		Static209.anInt3498 = arg0;
		Static284.aBoolean328 = false;
		Static366.anInt6161 = 0;
		Static143.anInt2549 = arg2;
	}
}
