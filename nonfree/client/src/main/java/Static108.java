import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_823 = Static161.method2452("You have only just left another world)3");

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "Lclient!dc;")
	public static Class20 aClass20_822 = aClass20_823;

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_824 = Static161.method2452(":tradereq:");

	@OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
	public static int anInt2202 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 >= Static27.anInt493 && Static72.anInt1572 >= arg4 && Static27.anInt493 <= arg7 && arg7 <= Static72.anInt1572 && arg8 >= Static27.anInt493 && Static72.anInt1572 >= arg8 && Static27.anInt493 <= arg5 && Static72.anInt1572 >= arg5 && Static173.anInt3464 <= arg6 && arg6 <= Static174.anInt3493 && arg0 >= Static173.anInt3464 && Static174.anInt3493 >= arg0 && arg1 >= Static173.anInt3464 && arg1 <= Static174.anInt3493 && Static173.anInt3464 <= arg2 && arg2 <= Static174.anInt3493) {
			Static10.method210(arg2, arg1, arg3, arg8, arg7, arg6, arg4, arg5, arg0);
		} else {
			Static150.method2296(arg1, arg7, arg0, arg6, arg3, arg2, arg5, arg4, arg8);
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILclient!g;II)V")
	public static void method1730(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1.anInt2254 == arg0 && arg0 != -1) {
			@Pc(22) Class5_Sub2_Sub22 local22 = Static14.method253(arg0);
			@Pc(25) int local25 = local22.anInt3662;
			if (local25 == 1) {
				arg1.anInt2265 = 0;
				arg1.anInt2223 = 0;
				arg1.anInt2262 = arg2;
				arg1.anInt2237 = 0;
				Static46.method844(false, arg1.anInt2265, arg1.anInt2241, arg1.anInt2234, local22);
			}
			if (local25 == 2) {
				arg1.anInt2223 = 0;
				return;
			}
		} else if (arg0 == -1 || arg1.anInt2254 == -1 || Static14.method253(arg0).anInt3652 >= Static14.method253(arg1.anInt2254).anInt3652) {
			arg1.anInt2254 = arg0;
			arg1.anInt2262 = arg2;
			arg1.anInt2220 = arg1.anInt2235;
			arg1.anInt2223 = 0;
			arg1.anInt2265 = 0;
			arg1.anInt2237 = 0;
			if (arg1.anInt2254 == -1) {
				return;
			}
			Static46.method844(false, arg1.anInt2265, arg1.anInt2241, arg1.anInt2234, Static14.method253(arg1.anInt2254));
		}
	}
}
