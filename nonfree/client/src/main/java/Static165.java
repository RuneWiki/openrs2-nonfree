import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
	public static int anInt3680;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1418 = Static120.method1824("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1419 = Static120.method1824(" loggt sich ein)3");

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "Lclient!of;")
	public static final Class70 aClass70_23 = new Class70();

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1420 = aClass80_1418;

	@OriginalMember(owner = "client!sg", name = "w", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1421 = Static120.method1824("(R");

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2655(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 >= Static172.anInt3861 && Static85.anInt1779 >= arg4 && Static34.anInt790 <= arg6 && Static17.anInt440 >= arg1) {
			Static108.method2100(arg6, arg3, arg5, arg2, arg1, arg4, arg0);
		} else {
			Static173.method2788(arg3, arg5, arg1, arg0, arg4, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
	public static void method2658() {
		for (@Pc(17) Class3_Sub1_Sub5_Sub2 local17 = (Class3_Sub1_Sub5_Sub2) Static151.aClass70_21.method1953(); local17 != null; local17 = (Class3_Sub1_Sub5_Sub2) Static151.aClass70_21.method1948()) {
			if (local17.anInt1871 != Static153.anInt673 || local17.aBoolean71) {
				local17.method3159();
			} else if (Static193.anInt4411 >= local17.anInt1877) {
				local17.method1308(Static152.anInt3407);
				if (local17.aBoolean71) {
					local17.method3159();
				} else {
					Static49.method738(local17.anInt1871, local17.anInt1876, local17.anInt1881, local17.anInt1879, 60, local17, 0, -1L, false);
				}
			}
		}
	}
}
