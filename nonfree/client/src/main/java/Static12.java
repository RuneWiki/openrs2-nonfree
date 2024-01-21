import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!b", name = "db", descriptor = "Lclient!sd;")
	public static Class60 aClass60_1;

	@OriginalMember(owner = "client!b", name = "ob", descriptor = "[I")
	public static final int[] anIntArray34 = new int[] { 1, 0, 0, 0, 1, 0, 2 };

	@OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
	public static int anInt306 = -1;

	@OriginalMember(owner = "client!b", name = "Qb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_230 = Static118.method2249("::noclip");

	@OriginalMember(owner = "client!b", name = "Ub", descriptor = "[I")
	public static final int[] anIntArray37 = new int[] { 2, 2, 4, 2, 1, 8, 4 };

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ILclient!sd;Lclient!sd;II)Lclient!jh;")
	public static Class1_Sub2_Sub5_Sub4_Sub1 method222(@OriginalArg(0) int arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(4) int arg3) {
		return Static178.method3023(arg0, arg2, arg3) ? Static202.method1747(arg1.method2340(arg0, arg3)) : null;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIBIII)V")
	public static void method225(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 1 || arg6 < 1 || arg5 > 102 || arg6 > 102) {
			return;
		}
		if (Static13.aBoolean36 && arg2 != Static207.anInt4425) {
			return;
		}
		@Pc(35) int local35 = arg2;
		if (arg2 < 3 && (Static106.aByteArrayArrayArray67[1][arg5][arg6] & 0x2) == 2) {
			local35 = arg2 + 1;
		}
		Static122.method2639(Static83.aClass57Array1[arg2], arg5, arg2, local35, arg6, arg0);
		if (arg3 >= 0) {
			Static134.method2559(arg3, arg1, arg5, local35, false, Static83.aClass57Array1[arg2], arg2, arg6, false, arg4);
			return;
		}
	}
}
