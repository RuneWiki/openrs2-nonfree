import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gg", name = "O", descriptor = "Lclient!tj;")
	public static Class191 aClass191_1;

	@OriginalMember(owner = "client!gg", name = "N", descriptor = "[I")
	public static final int[] anIntArray131 = new int[32];

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
	public static void method2047(@OriginalArg(0) int arg0) {
		@Pc(10) Class5_Sub9_Sub16 local10 = Static239.method4052(4, arg0);
		local10.method4138();
	}

	@OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
	public static void method2048() {
		Static331.aClass42_54.method1054();
	}

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(III)I")
	public static int method2053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (arg0 + local12) / arg1 - local12;
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!en;I)V")
	public static void method2055(@OriginalArg(0) Class59 arg0) {
		if (Static188.aBoolean264) {
			Static330.method1923(arg0);
		} else {
			Static213.method3766(arg0);
		}
	}
}
