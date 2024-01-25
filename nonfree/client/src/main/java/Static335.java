import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!lf", name = "Bd", descriptor = "Lclient!daa;")
	public static Class70 aClass70_3;

	@OriginalMember(owner = "client!lf", name = "Cd", descriptor = "I")
	public static int anInt5701;

	@OriginalMember(owner = "client!lf", name = "ve", descriptor = "Z")
	public static boolean aBoolean359;

	@OriginalMember(owner = "client!lf", name = "xe", descriptor = "I")
	public static int anInt5741;

	@OriginalMember(owner = "client!lf", name = "Mc", descriptor = "Lclient!mw;")
	public static final Class240 aClass240_56 = new Class240(34, 8);

	@OriginalMember(owner = "client!lf", name = "ie", descriptor = "Lclient!haa;")
	public static final Class3_Sub23 aClass3_Sub23_1 = new Class3_Sub23(0, 0);

	@OriginalMember(owner = "client!lf", name = "Ce", descriptor = "Z")
	public static boolean aBoolean360 = false;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIBIIII)V")
	public static void method4848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (Static300.anInt5091 <= arg5 && Static629.anInt10412 >= arg5 && arg2 >= Static300.anInt5091 && Static629.anInt10412 >= arg2 && arg8 >= Static300.anInt5091 && arg8 <= Static629.anInt10412 && Static300.anInt5091 <= arg7 && arg7 <= Static629.anInt10412 && Static617.anInt6260 <= arg4 && arg4 <= Static229.anInt4089 && Static617.anInt6260 <= arg3 && Static229.anInt4089 >= arg3 && Static617.anInt6260 <= arg6 && Static229.anInt4089 >= arg6 && arg0 >= Static617.anInt6260 && arg0 <= Static229.anInt4089) {
			Static240.method3644(arg1, arg5, arg0, arg6, arg2, arg3, arg4, arg7, arg8);
		} else {
			Static626.method8457(arg1, arg8, arg5, arg0, arg6, arg4, arg3, arg2, arg7);
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JIII)V")
	public static void method4902(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = (int) arg0 >> 14 & 0x1F;
		@Pc(17) int local17 = (int) arg0 >> 20 & 0x3;
		@Pc(28) int local28 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static539.method6916(local10, arg1, 0, 0, local17, true, 0, arg2);
			return;
		}
		@Pc(48) Class216 local48 = Static466.aClass340_6.method7665(local28);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (local17 == 0 || local17 == 2) {
			local61 = local48.anInt5949;
			local64 = local48.anInt5947;
		} else {
			local61 = local48.anInt5947;
			local64 = local48.anInt5949;
		}
		@Pc(75) int local75 = local48.anInt5993;
		if (local17 != 0) {
			local75 = (local75 << local17 & 0xF) + (local75 >> 4 - local17);
		}
		Static539.method6916(0, arg1, local61, local64, 0, true, local75, arg2);
	}
}
