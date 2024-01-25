import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "Lclient!em;")
	public static final Class83 aClass83_101 = new Class83(85, -1);

	@OriginalMember(owner = "client!kd", name = "kb", descriptor = "I")
	public static int anInt4867 = -1;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "(I)V")
	public static void method3875() {
		if (Static100.aBoolean116) {
			return;
		}
		Static344.method5118(Static368.aClass360ArrayArrayArray18);
		if (Static156.aClass360ArrayArrayArray8 != null) {
			Static344.method5118(Static156.aClass360ArrayArrayArray8);
		}
		Static100.aBoolean116 = true;
	}

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "(B)V")
	public static void method3877() {
		Static255.method3718();
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6) {
		if (arg5 < 512 || arg3 < 512 || arg5 > (Static458.anInt9736 - 2) * 512 || (Static378.anInt6747 - 2) * 512 < arg3) {
			Static70.anIntArray59[0] = Static70.anIntArray59[1] = -1;
			return;
		}
		@Pc(44) int local44 = Static538.method6114(arg0, arg3, arg5) - arg2;
		Static160.aClass34_1.U(arg4, 0, 0);
		Static31.aClass78_18.method6812(Static160.aClass34_1);
		Static31.aClass78_18.AA(arg5, local44, arg3, Static70.anIntArray59);
		Static160.aClass34_1.U(-arg4, 0, 0);
		Static31.aClass78_18.method6812(Static160.aClass34_1);
	}
}
