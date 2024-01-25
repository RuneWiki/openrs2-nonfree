import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
	public static int anInt8677;

	@OriginalMember(owner = "client!sq", name = "m", descriptor = "J")
	public static long aLong236 = -1L;

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(III)Lclient!wp;")
	public static Class13_Sub1_Sub5 method7305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static28.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class13_Sub1_Sub5 local14 = local7.aClass13_Sub1_Sub5_1;
			local7.aClass13_Sub1_Sub5_1 = null;
			Static54.method261(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIIIIIIII)V")
	public static void method7306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static221.method3025(arg6)) {
			return;
		}
		if (Static8.aClass261ArrayArray1[arg6] == null) {
			Static76.method1078(Static559.aClass261ArrayArray2[arg6], -1, arg1, arg2, arg3, arg4, arg10, arg8, arg5, arg9, arg0, arg7);
		} else {
			Static76.method1078(Static8.aClass261ArrayArray1[arg6], -1, arg1, arg2, arg3, arg4, arg10, arg8, arg5, arg9, arg0, arg7);
		}
	}
}
