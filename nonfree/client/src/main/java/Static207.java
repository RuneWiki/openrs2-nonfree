import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
	public static int anInt4554;

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "[I")
	public static int[] anIntArray350 = new int[50];

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString312 = "purple:";

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIIBI)V")
	public static void method3448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = arg2 - arg0;
		@Pc(20) int local20 = arg6 - arg5;
		@Pc(28) int local28 = (arg4 - arg1 << 16) / local15;
		@Pc(36) int local36 = (arg3 - arg7 << 16) / local20;
		Static87.method1873(local28, arg0, arg6, arg7, local36, arg1, arg2, arg5);
	}
}
