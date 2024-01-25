import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static231 {

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString35;

	@OriginalMember(owner = "client!ida", name = "n", descriptor = "[I")
	public static int[] anIntArray259;

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_30 = new Class109();

	@OriginalMember(owner = "client!ida", name = "k", descriptor = "[I")
	public static final int[] anIntArray258 = new int[1];

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIBI)V")
	public static void method3184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 < arg0) {
			Static134.method1841(Static543.anIntArrayArray57[arg2], arg1, arg0, arg3);
		} else {
			Static134.method1841(Static543.anIntArrayArray57[arg2], arg0, arg1, arg3);
		}
	}
}
