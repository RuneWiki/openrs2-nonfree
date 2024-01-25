import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static565 {

	@OriginalMember(owner = "client!vj", name = "w", descriptor = "[I")
	public static int[] anIntArray492;

	@OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
	public static int anInt6658;

	@OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
	public static int anInt6649 = 0;

	@OriginalMember(owner = "client!vj", name = "u", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_124 = new Class73(58, 0);

	@OriginalMember(owner = "client!vj", name = "y", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_125 = new Class73(87, -2);

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIB)Z")
	public static boolean method5598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;BI)I")
	public static int method5599(@OriginalArg(0) String arg0) {
		return Static234.method4082(16, arg0);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIIII)V")
	public static void method5600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 - arg2 >= Static13.anInt7634 && Static461.anInt7899 >= arg1 + arg2 && Static583.anInt9478 <= arg5 - arg2 && Static415.anInt9494 >= arg5 + arg2) {
			Static20.method727(arg2, arg4, arg5, arg1, arg0, arg3);
		} else {
			Static339.method5270(arg5, arg3, arg4, arg1, arg0, arg2);
		}
	}
}
