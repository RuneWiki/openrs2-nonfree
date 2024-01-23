import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray13;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "Lclient!hk;")
	public static Class71_Sub1 aClass71_Sub1_4 = null;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
	public static int anInt5047 = 0;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIII)V")
	public static void method4070(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = Static91.anInt2030 * arg0 >> 8;
		if (local9 != 0 && arg2 != -1) {
			Static173.method2976(Static233.aClass84_106, local9, arg2);
			Static145.aBoolean257 = true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)Lclient!in;")
	public static Class2_Sub3_Sub10 method4071(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub10 local10 = (Class2_Sub3_Sub10) Static37.aClass53_1.method1254((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static182.aClass84_76.method2127(arg0, 5);
		local10 = new Class2_Sub3_Sub10();
		if (local20 != null) {
			local10.method2070(new Class2_Sub26(local20));
		}
		Static37.aClass53_1.method1258((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!jd;Lclient!jd;B)V")
	public static void method4073(@OriginalArg(0) Class84 arg0, @OriginalArg(1) Class84 arg1) {
		Static162.aClass2_Sub3_Sub5_2 = Static20.method1064(Static92.anInt2040, arg0, arg1);
		if (Static60.aBoolean106) {
			Static234.aClass2_Sub3_Sub5_Sub1_2 = Static295.method4893(arg1, Static92.anInt2040, arg0);
		} else {
			Static234.aClass2_Sub3_Sub5_Sub1_2 = (Class2_Sub3_Sub5_Sub1) Static162.aClass2_Sub3_Sub5_2;
		}
		Static208.aClass2_Sub3_Sub5_3 = Static20.method1064(Static207.anInt4319, arg0, arg1);
		Static153.aClass2_Sub3_Sub5_1 = Static20.method1064(Static120.anInt2577, arg0, arg1);
	}
}
