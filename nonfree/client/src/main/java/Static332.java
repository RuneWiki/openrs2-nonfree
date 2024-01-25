import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "Lclient!ra;")
	public static Class170 aClass170_119;

	@OriginalMember(owner = "client!vi", name = "X", descriptor = "[[I")
	public static int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
	public static int anInt6258 = 1;

	@OriginalMember(owner = "client!vi", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString362 = null;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIIIII)V")
	public static void method5559(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg1; local11 <= arg3; local11++) {
			Static247.method3552(arg4, arg0, anIntArrayArray56[local11], arg2);
		}
	}
}
