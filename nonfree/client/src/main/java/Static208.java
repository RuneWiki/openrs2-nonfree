import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!kg", name = "W", descriptor = "Lclient!dk;")
	public static Class54 aClass54_60;

	@OriginalMember(owner = "client!kg", name = "ab", descriptor = "Lclient!rb;")
	public static Class211 aClass211_83;

	@OriginalMember(owner = "client!kg", name = "H", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_114 = new Class102(7, 3);

	@OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
	public static int anInt3482 = 0;

	@OriginalMember(owner = "client!kg", name = "Y", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_82 = new Class211(74, -1);

	@OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
	public static int anInt3487 = 0;

	@OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
	public static int anInt3488 = 0;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z")
	public static boolean method2798(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class192 local8 = Static50.aClass190_1.method4218(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local8.method4233(arg0);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIIII)V")
	public static void method2799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 - arg3 >= Static317.anInt6670 && arg3 + arg2 <= Static215.anInt3546 && Static219.anInt6125 <= arg0 - arg3 && arg3 + arg0 <= Static155.anInt2670) {
			Static84.method1209(arg1, arg0, arg2, arg3);
		} else {
			Static85.method1356(arg3, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Z")
	public static boolean method2800() {
		return Static76.anInt1460 == 0 ? Static84.aClass2_Sub1_Sub2_3.method600() : true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method2801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 == arg4) {
			Static220.method2912(arg1, arg4, arg2, arg3, arg5, arg6);
		} else if (arg2 - arg4 >= Static317.anInt6670 && Static215.anInt3546 >= arg4 + arg2 && Static219.anInt6125 <= arg1 - arg0 && arg0 + arg1 <= Static155.anInt2670) {
			Static339.method4555(arg5, arg0, arg6, arg3, arg4, arg1, arg2);
		} else {
			Static161.method4786(arg5, arg4, arg0, arg2, arg3, arg1, arg6);
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!dk;Lclient!dk;ILclient!dk;Lclient!br;)Z")
	public static boolean method2802(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class54 arg1, @OriginalArg(3) Class54 arg2, @OriginalArg(4) Class2_Sub1_Sub2 arg3) {
		Static84.aClass2_Sub1_Sub2_3 = arg3;
		Static407.aClass54_108 = arg1;
		Static354.aClass54_97 = arg2;
		Static10.aClass54_1 = arg0;
		return true;
	}
}
