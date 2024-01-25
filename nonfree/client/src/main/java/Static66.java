import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "[Lclient!ek;")
	public static Class56[] aClass56Array1;

	@OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
	public static int anInt1751 = 1;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!o;III[Z)V")
	public static void method1584(@OriginalArg(0) Class4_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static261.aClass60Array2 == Static77.aClass60Array1) {
			return;
		}
		@Pc(9) int local9 = Static304.aClass60Array3[arg1].method2270(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class60 local22 = Static304.aClass60Array3[local11];
				if (local22 != null) {
					local22.method2265(arg0, arg2, local9 - local22.method2270(arg2, arg3), arg3);
				}
			}
		}
	}
}
