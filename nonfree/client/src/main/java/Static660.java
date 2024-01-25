import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static660 {

	@OriginalMember(owner = "client!um", name = "y", descriptor = "[[[Lclient!tr;")
	public static Class364[][][] aClass364ArrayArrayArray3;

	@OriginalMember(owner = "client!um", name = "w", descriptor = "[Lclient!aea;")
	public static Class8[] aClass8Array1;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "I")
	public static int anInt10119 = 0;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!da;Lclient!aa;Lclient!nt;ILjava/lang/String;Lclient!hw;IIIII)V")
	public static void method8621(@OriginalArg(1) Class57 arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) Class270 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) String arg4, @OriginalArg(6) Class169 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(13) int local13;
		if (Static262.anInt4081 == 4) {
			local13 = (int) Static382.aFloat40 & 0x3FFF;
		} else {
			local13 = Static194.anInt3310 + (int) Static382.aFloat40 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg2.anInt7015 / 2, arg2.anInt7045 / 2) + 10;
		@Pc(41) int local41 = arg7 * arg7 + arg10 * arg10;
		if (local41 > local32 * local32) {
			return;
		}
		@Pc(52) int local52 = Class3_Sub7_Sub17_Sub1.anIntArray549[local13];
		@Pc(56) int local56 = Class3_Sub7_Sub17_Sub1.anIntArray548[local13];
		if (Static262.anInt4081 != 4) {
			local56 = local56 * 256 / (Static402.anInt6239 + 256);
			local52 = local52 * 256 / (Static402.anInt6239 + 256);
		}
		@Pc(86) int local86 = arg10 * local52 + arg7 * local56 >> 14;
		@Pc(97) int local97 = local56 * arg10 - local52 * arg7 >> 14;
		@Pc(104) int local104 = arg5.method3652(100, (Class178[]) null, arg4);
		@Pc(112) int local112 = arg5.method3651(0, (Class178[]) null, 100, arg4);
		@Pc(118) int local118 = local86 - local104 / 2;
		if (local118 >= -arg2.anInt7015 && arg2.anInt7015 >= local118 && -arg2.anInt7045 <= local97 && local97 <= arg2.anInt7045) {
			arg0.method9135(arg3, arg6 + arg2.anInt7045 / 2 - local97 - arg8 - local112, (int[]) null, arg6, arg9, (Class178[]) null, 0, arg2.anInt7015 / 2 + arg3 + local118, 50, 0, arg4, 0, arg1, 1, local104);
		}
	}
}
