import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_125 = new Class56(109, 3);

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
	public static int anInt3606 = -1;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "[I")
	public static final int[] anIntArray264 = new int[] { 28, 35, 40, 44 };

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)V")
	public static void method2856(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class133[] local3 = Static62.aClass133Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class133 local11 = local3[local5];
			if (local11 != null && local11.anInt3345 == 2) {
				Static379.method4958(arg1 >> 1, local11.anInt3344, local11.anInt3338, arg3 >> 1, local11.anInt3340, local11.anInt3348 * 2);
				if (Static73.anIntArray111[0] > -1 && Static265.anInt4371 % 20 < 10) {
					Static412.aClass95Array15[local11.anInt3343].method5821(arg2 + Static73.anIntArray111[0] - 12, arg0 + -28 - -Static73.anIntArray111[1]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(II)I")
	public static int method2859(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static299.method3891(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z")
	public static boolean method2860(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
