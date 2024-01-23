import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
	public static int anInt2581;

	@OriginalMember(owner = "client!jc", name = "W", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!jc", name = "Q", descriptor = "Lclient!en;")
	public static Class1_Sub14_Sub1 aClass1_Sub14_Sub1_3 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method2219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 + arg0 > arg7 && arg2 + arg7 > arg0) {
			return arg4 < arg3 + arg6 && arg3 < arg4 + arg1;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "(I)V")
	public static void method2224() {
		Static79.aClass187_49.method4530();
	}
}
