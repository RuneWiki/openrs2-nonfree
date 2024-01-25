import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "I")
	public static int anInt2856;

	@OriginalMember(owner = "client!id", name = "c", descriptor = "Lclient!hf;")
	public static Class103 aClass103_2;

	@OriginalMember(owner = "client!id", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray25 = new int[128][128];

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg6) {
			Static366.method5135(arg0, arg4, arg5, arg6, arg2, arg3);
		} else if (arg0 - arg6 >= Static81.anInt1574 && arg6 + arg0 <= Static99.anInt1808 && Static97.anInt1796 <= arg4 - arg1 && arg1 + arg4 <= Static85.anInt1636) {
			Static230.method3599(arg3, arg4, arg5, arg2, arg0, arg6, arg1);
		} else {
			Static147.method5722(arg1, arg0, arg5, arg2, arg4, arg3, arg6);
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IILclient!qq;IIII)Lclient!cd;")
	public static Class39 method2620(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(18) long local18 = (long) arg1;
		@Pc(24) Class39 local24 = (Class39) Static392.aClass220_52.method4990(local18);
		if (local24 == null) {
			@Pc(34) Class266 local34 = Static249.method3846(arg1, Static223.aClass158_51);
			if (local34 == null) {
				return null;
			}
			if (local34.anInt7237 < 13) {
				local34.method5961();
			}
			local24 = arg2.method3496(local34, 2055, Static265.anInt4551, 64, 768);
			Static392.aClass220_52.method4996(local24, local18);
		}
		local24 = local24.method4863((byte) 2, 2055, true);
		if (arg0 != 0) {
			local24.method4907(arg0);
		}
		if (arg4 != 0) {
			local24.method4883(arg4);
		}
		if (arg3 != 0) {
			local24.method4886(arg3);
		}
		if (arg5 != 0) {
			local24.method4874(0, arg5, 0);
		}
		return local24;
	}
}
