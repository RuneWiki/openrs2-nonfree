import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static520 {

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "Lclient!ega;")
	public static final Class93 aClass93_4 = new Class93();

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "[I")
	public static final int[] anIntArray475 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method7109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(23) int local23;
		if (Static20.method345(arg5)) {
			local23 = 0;
			@Pc(46) int local46 = 0;
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = 0;
			@Pc(52) int local52 = 0;
			if (Static377.aBoolean419) {
				local52 = Static191.anInt10376;
				local48 = Static56.anInt973;
				local46 = Static534.anInt8529;
				local50 = Static552.anInt8732;
				local23 = Static248.anInt4331;
				Static191.anInt10376 = 1;
			}
			if (Static17.aClass238ArrayArray1[arg5] == null) {
				Static469.method6636(arg2, arg6, -1, Static397.aClass238ArrayArray2[arg5], arg1 < 0, arg4, arg0, arg7, arg1, arg3);
			} else {
				Static469.method6636(arg2, arg6, -1, Static17.aClass238ArrayArray1[arg5], arg1 < 0, arg4, arg0, arg7, arg1, arg3);
			}
			if (Static377.aBoolean419) {
				if (arg1 >= 0 && Static191.anInt10376 == 2) {
					Static395.method5811(Static534.anInt8529, Static56.anInt973, Static552.anInt8732, Static248.anInt4331);
				}
				Static248.anInt4331 = local23;
				Static191.anInt10376 = local52;
				Static534.anInt8529 = local46;
				Static56.anInt973 = local48;
				Static552.anInt8732 = local50;
			}
		} else if (arg1 == -1) {
			for (local23 = 0; local23 < 100; local23++) {
				Static325.aBooleanArray15[local23] = true;
			}
		} else {
			Static325.aBooleanArray15[arg1] = true;
		}
	}
}
