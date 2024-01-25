import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cca", name = "q", descriptor = "Z")
	public static boolean aBoolean70;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IF[BFFZILclient!j;IFIIFI)V")
	public static void method1088(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class147 arg6, @OriginalArg(9) float arg7, @OriginalArg(12) float arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(56) int local56;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg6.method6062(arg4 / (float) 128, arg1 / (float) 16, local12, arg0, arg7 * 127.0F, arg8 / (float) 128, 0);
			local42 = arg5;
			arg1 *= 2.0F;
			arg4 *= 2.0F;
			arg7 *= arg3;
			for (local56 = 0; local56 < 16384; local56++) {
				arg2[local42] = (byte) ((float) arg2[local42] + local12[local56]);
				local42++;
			}
			arg8 *= 2.0F;
		}
		local42 = arg5;
		for (local56 = 0; local56 < 16384; local56++) {
			arg2[local42] = (byte) (arg2[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!cca", name = "g", descriptor = "(I)V")
	public static void method1089() {
		@Pc(9) int local9 = (int) ((double) Static459.anInt7799 * 34.46D);
		local9 <<= 0x2;
		if (Static513.aClass122_10.method7262()) {
			local9 += 512;
		}
		Static513.aClass122_10.ta(200, local9);
	}
}
