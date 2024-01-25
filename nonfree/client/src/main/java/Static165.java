import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
	public static int anInt2978;

	@OriginalMember(owner = "client!gm", name = "k", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_149 = new Class296(80, 4);

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(11) Class1_Sub36 local11 = null;
		for (@Pc(16) Class1_Sub36 local16 = (Class1_Sub36) Static191.aClass37_41.method977(); local16 != null; local16 = (Class1_Sub36) Static191.aClass37_41.method971()) {
			if (arg6 == local16.anInt6243 && arg1 == local16.anInt6239 && local16.anInt6235 == arg5 && arg3 == local16.anInt6246) {
				local11 = local16;
				break;
			}
		}
		if (local11 == null) {
			local11 = new Class1_Sub36();
			local11.anInt6235 = arg5;
			local11.anInt6239 = arg1;
			local11.anInt6246 = arg3;
			local11.anInt6243 = arg6;
			if (arg1 >= 0 && arg5 >= 0 && arg1 < Static459.anInt7799 && arg5 < Static482.anInt7990) {
				Static215.method3604(local11);
			}
			Static191.aClass37_41.method970(local11);
		}
		local11.anInt6247 = arg2;
		local11.anInt6238 = -1;
		local11.anInt6234 = arg4;
		local11.anInt6236 = 0;
		local11.anInt6242 = arg0;
	}

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "([JB[I)V")
	public static void method2543(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static452.method6438(arg0, arg0.length - 1, 0, arg1);
	}
}
