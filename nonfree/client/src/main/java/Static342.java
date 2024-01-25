import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBII)V")
	public static void method5282(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class14_Sub3_Sub9 local9 = Static142.method2219((long) arg0, 11);
		local9.method2817();
		local9.anInt3413 = arg1;
		local9.anInt3419 = arg2;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILclient!ie;IZIIIILclient!aa;Lclient!mea;Ljava/lang/String;Lclient!da;)V")
	public static void method5284(@OriginalArg(0) int arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class1 arg7, @OriginalArg(9) Class230 arg8, @OriginalArg(10) String arg9, @OriginalArg(11) Class38 arg10) {
		@Pc(21) int local21;
		if (Static378.anInt6935 == 4) {
			local21 = (int) Static543.aFloat228 & 0x3FFF;
		} else {
			local21 = Static470.anInt10171 + (int) Static543.aFloat228 & 0x3FFF;
		}
		@Pc(42) int local42 = Math.max(arg8.anInt6703 / 2, arg8.anInt6701 / 2) + 10;
		@Pc(50) int local50 = arg4 * arg4 + arg5 * arg5;
		if (local42 * local42 < local50) {
			return;
		}
		@Pc(60) int local60 = Class32.anIntArray76[local21];
		@Pc(64) int local64 = Class32.anIntArray77[local21];
		if (Static378.anInt6935 != 4) {
			local64 = local64 * 256 / (Static422.anInt7593 + 256);
			local60 = local60 * 256 / (Static422.anInt7593 + 256);
		}
		@Pc(95) int local95 = local60 * arg4 + arg5 * local64 >> 14;
		@Pc(106) int local106 = arg4 * local64 - arg5 * local60 >> 14;
		@Pc(113) int local113 = arg1.method3599((Class20[]) null, arg9, 100);
		@Pc(121) int local121 = arg1.method3607(100, (Class20[]) null, arg9, 0);
		@Pc(127) int local127 = local95 - local113 / 2;
		if (local127 >= -arg8.anInt6703 && arg8.anInt6703 >= local127 && local106 >= -arg8.anInt6701 && arg8.anInt6701 >= local106) {
			arg10.method8994(arg2, (Class20[]) null, 0, local113, arg2 + arg8.anInt6701 / 2 - local121 - arg0 - local106, 1, 0, arg9, 50, (int[]) null, arg6 + local127 + arg8.anInt6703 / 2, arg6, arg3, arg7, 0);
		}
	}
}
