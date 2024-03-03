import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!je;")
	public static Class113 aClass113_5;

	@OriginalMember(owner = "client!g", name = "c", descriptor = "I")
	public static int anInt2217;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!wm;IIIIIIILclient!gn;IZ)Lclient!gn;", line = 3)
	public static Class31 method2239(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class31 arg8, @OriginalArg(9) int arg9) {
		@Pc(6) long local6 = (long) arg4;
		@Pc(12) Class31 local12 = (Class31) Class2_Sub2_Sub8.aClass98_17.method2614(local6);
		if (local12 == null) {
			@Pc(22) Class185 local22 = Static275.method2428(Static220.aClass197_63, arg4);
			if (local22 == null) {
				return null;
			}
			local12 = arg0.method2866(local22, 1031, Static221.anInt4331, 64, 768);
			Class2_Sub2_Sub8.aClass98_17.method2626(local6, local12);
		}
		local12 = local12.method3801((byte) 2, 1031, true);
		if (arg5 != 0) {
			local12.method3834(arg5);
		}
		if (arg6 != 0) {
			local12.method3825(arg6);
		}
		if (arg3 != 0) {
			local12.method3816(arg3);
		}
		if (arg7 != 0) {
			local12.method3814(0, arg7, 0);
		}
		return local12;
	}
}
