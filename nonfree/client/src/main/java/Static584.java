import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wf", name = "k", descriptor = "F")
	public static float aFloat242;

	@OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
	public static int anInt9487;

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_165 = new Class349(5, 8);

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Lclient!nw;")
	public static final Class247 aClass247_5 = new Class247();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BI)V")
	public static void method7572(@OriginalArg(1) int arg0) {
		if (!Static257.aClass2_Sub35_Sub1_1.aBoolean641) {
			arg0 = -1;
		}
		if (arg0 == Static37.anInt678) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class98 local25 = Static23.aClass110_1.method2018(arg0);
			@Pc(29) Class344 local29 = local25.method1771();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static169.aClass99_2.method1779(local29.method7128(), new Point(local25.anInt2139, local25.anInt2137), local29.method7120(), local29.method7118(), Static9.aCanvas1);
				Static37.anInt678 = arg0;
			}
		}
		if (arg0 == -1 && Static37.anInt678 != -1) {
			Static169.aClass99_2.method1779(-1, new Point(), -1, null, Static9.aCanvas1);
			Static37.anInt678 = -1;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method7575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (Static130.anInt2131 <= arg0 && arg6 <= Static89.anInt1576 && Static275.anInt4756 <= arg4 && arg5 <= Static48.anInt898) {
			Static4.method53(arg5, arg3, arg1, arg0, arg4, arg6, arg2);
		} else {
			Static89.method1349(arg4, arg3, arg0, arg2, arg5, arg1, arg6);
		}
	}
}
