import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ns", name = "k", descriptor = "Lclient!jn;")
	public static Class124 aClass124_1;

	@OriginalMember(owner = "client!ns", name = "s", descriptor = "I")
	public static int anInt4847;

	@OriginalMember(owner = "client!ns", name = "F", descriptor = "I")
	public static int anInt4853;

	@OriginalMember(owner = "client!ns", name = "H", descriptor = "[I")
	public static int[] anIntArray425;

	@OriginalMember(owner = "client!ns", name = "l", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!ns", name = "t", descriptor = "Z")
	public static boolean aBoolean319 = false;

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIIIII)V")
	public static void method4027(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(6) int local6 = arg2; local6 <= arg3; local6++) {
			Static59.method1261(Static163.anIntArrayArray35[local6], arg0, arg4, arg1);
		}
	}
}
