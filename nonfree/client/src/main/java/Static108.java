import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "Lclient!qn;")
	public static Class211 aClass211_8;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_10 = new Class56(44, 8);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIII)V")
	public static void method139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = Static413.aClass49_Sub1_1.anInt3203 * arg2 >> 8;
		if (arg0 == -1 && !Static26.aBoolean37) {
			Static46.method611();
		} else if (arg0 != -1 && (arg0 != Static267.anInt4386 || !Static221.method3007()) && local6 != 0 && !Static26.aBoolean37) {
			Static158.method1754(local6, arg0, arg1, Static231.aClass211_62);
		}
		Static267.anInt4386 = arg0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "([Ljava/lang/Object;[IZ)V")
	public static void method141(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static365.method4856(arg0, arg1.length - 1, arg1, 0);
	}
}
