import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "Z")
	public static boolean aBoolean184;

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(Lclient!sca;ILclient!aa;IIILjava/lang/String;Lclient!da;ILclient!hia;BI)V")
	public static void method2191(@OriginalArg(0) Class302 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6, @OriginalArg(7) Class50 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class133 arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		if (Static334.anInt6354 == 4) {
			local11 = (int) Static284.aFloat164 & 0x3FFF;
		} else {
			local11 = (int) Static284.aFloat164 + Static298.anInt6417 & 0x3FFF;
		}
		@Pc(32) int local32 = Math.max(arg0.anInt8801 / 2, arg0.anInt8814 / 2) + 10;
		@Pc(40) int local40 = arg4 * arg4 + arg5 * arg5;
		if (local32 * local32 < local40) {
			return;
		}
		@Pc(54) int local54 = Class100_Sub1.anIntArray428[local11];
		@Pc(58) int local58 = Class100_Sub1.anIntArray429[local11];
		if (Static334.anInt6354 != 4) {
			local54 = local54 * 256 / (Static620.anInt10702 + 256);
			local58 = local58 * 256 / (Static620.anInt10702 + 256);
		}
		@Pc(89) int local89 = arg4 * local58 + arg5 * local54 >> 14;
		@Pc(100) int local100 = local58 * arg5 - local54 * arg4 >> 14;
		@Pc(111) int local111 = arg9.method3639(100, (Class32[]) null, arg6);
		@Pc(117) int local117 = local89 - local111 / 2;
		@Pc(125) int local125 = arg9.method3646((Class32[]) null, arg6, 100, 0);
		if (local117 >= -arg0.anInt8801 && local117 <= arg0.anInt8801 && -arg0.anInt8814 <= local100 && local100 <= arg0.anInt8814) {
			arg7.method5742(arg3, (int[]) null, arg3 + arg0.anInt8814 / 2 - local125 - arg10 - local100, arg1, 0, arg2, 1, arg6, arg8, 0, 50, local111, arg8 + local117 + arg0.anInt8801 / 2, 0, (Class32[]) null);
		}
	}
}
