import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Lclient!vm;")
	public static Class259 aClass259_1;

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!bq;")
	public static Class35 aClass35_7;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
	public static int anInt3100 = 1;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ILclient!ap;)I")
	public static int method2273(@OriginalArg(1) Class1_Sub3_Sub1 arg0) {
		@Pc(8) int local8 = arg0.method321(2);
		@Pc(13) int local13;
		if (local8 == 0) {
			local13 = 0;
		} else if (local8 == 1) {
			local13 = arg0.method321(5);
		} else if (local8 == 2) {
			local13 = arg0.method321(8);
		} else {
			local13 = arg0.method321(11);
		}
		return local13;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIFFFI[BLclient!al;IFIF)V")
	public static void method2274(@OriginalArg(2) int arg0, @OriginalArg(4) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(7) int arg4, @OriginalArg(8) byte[] arg5, @OriginalArg(9) Class12 arg6, @OriginalArg(11) float arg7, @OriginalArg(13) float arg8) {
		@Pc(10) float[] local10 = new float[16384];
		@Pc(39) int local39;
		@Pc(41) int local41;
		for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
			arg6.method2663(arg7 / (float) 16, 0, arg0, arg8 / (float) 128, local10, arg1 / (float) 128, arg3 * 127.0F);
			local39 = arg4;
			for (local41 = 0; local41 < 16384; local41++) {
				arg5[local39] = (byte) ((float) arg5[local39] + local10[local41]);
				local39++;
			}
			arg7 *= 2.0F;
			arg1 *= 2.0F;
			arg3 *= arg2;
			arg8 *= 2.0F;
		}
		local39 = arg4;
		for (local41 = 0; local41 < 16384; local41++) {
			arg5[local39] = (byte) (arg5[local39] + 127);
			local39++;
		}
	}
}
