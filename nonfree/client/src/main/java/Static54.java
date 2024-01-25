import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!gba;IIILjava/lang/String;ILclient!fa;IBLclient!kga;ILclient!ta;)V")
	public static void method825(@OriginalArg(0) Class115 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class98 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class196 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) Class91 arg10) {
		@Pc(15) int local15;
		if (Static555.anInt9335 == 4) {
			local15 = (int) Static477.aFloat164 & 0x3FFF;
		} else {
			local15 = (int) Static477.aFloat164 + Static402.anInt6978 & 0x3FFF;
		}
		@Pc(34) int local34 = Math.max(arg0.anInt3474 / 2, arg0.anInt3481 / 2) + 10;
		@Pc(46) int local46 = arg9 * arg9 + arg5 * arg5;
		if (local34 * local34 < local46) {
			return;
		}
		@Pc(60) int local60 = Class4_Sub11.anIntArray148[local15];
		@Pc(64) int local64 = Class4_Sub11.anIntArray147[local15];
		if (Static555.anInt9335 != 4) {
			local60 = local60 * 256 / (Static380.anInt6751 + 256);
			local64 = local64 * 256 / (Static380.anInt6751 + 256);
		}
		@Pc(93) int local93 = local64 * arg5 + arg9 * local60 >> 14;
		@Pc(104) int local104 = arg9 * local64 - arg5 * local60 >> 14;
		@Pc(111) int local111 = arg8.method4380(arg4, null, 100);
		@Pc(117) int local117 = local93 - local111 / 2;
		@Pc(125) int local125 = arg8.method4379(0, null, arg4, 100);
		if (-arg0.anInt3474 <= local117 && arg0.anInt3474 >= local117 && -arg0.anInt3481 <= local104 && local104 <= arg0.anInt3481) {
			arg10.method7465(0, 0, arg0.anInt3481 / 2 + arg3 - arg2 - local104 - local125, 50, 0, arg0.anInt3474 / 2 + local117 + arg1, arg4, arg1, null, null, arg3, local111, arg7, 1, arg6);
		}
	}
}
