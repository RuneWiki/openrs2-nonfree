import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public static int anInt2648;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "Lclient!qc;")
	public static Class3_Sub1_Sub4_Sub3_Sub1 aClass3_Sub1_Sub4_Sub3_Sub1_3;

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[5][5000];

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public static int anInt2651 = -1;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	public static volatile int anInt2653 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1831(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1832(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static183.aClass83_1);
		arg0.addMouseMotionListener(Static183.aClass83_1);
		arg0.addFocusListener(Static183.aClass83_1);
	}
}
