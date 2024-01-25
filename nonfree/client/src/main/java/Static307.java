import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!ls", name = "j", descriptor = "Lclient!xa;")
	public static Class66 aClass66_16;

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
	public static int anInt1465 = 16777215;

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "[I")
	public static final int[] anIntArray100 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIIIII)V")
	public static void method1300(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg3) {
			Static298.method4855(arg1, arg2, arg4, arg0);
		} else if (Static376.anInt7071 <= arg2 - arg1 && Class179_Sub2.lb >= arg1 + arg2 && Static96.anInt2302 <= arg4 - arg3 && arg3 + arg4 <= Static289.anInt5545) {
			Static257.method4469(arg1, arg3, arg2, arg4, arg0);
		} else {
			Static210.method3840(arg4, arg3, arg1, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V")
	public static void method1301() {
		if (Static512.method7258(Static325.anInt6149) || Static140.method2631(Static325.anInt6149)) {
			Static496.method7450(Static390.anInt7318 >> 12, Static86.anInt2132 >> 12, 5000);
		} else {
			@Pc(18) int local18 = Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray526[0] >> 3;
			@Pc(25) int local25 = Static350.aClass11_Sub1_Sub1_Sub2_4.anIntArray527[0] >> 3;
			if (local18 >= 0 && Static228.anInt4746 >> 3 > local18 && local25 >= 0 && local25 < Static44.anInt1275 >> 3) {
				Static496.method7450(local25, local18, 5000);
			} else {
				Static496.method7450(Static44.anInt1275 >> 4, Static228.anInt4746 >> 4, 0);
			}
		}
		Static385.method6069();
		Static41.method1126();
		Static3.method5141();
		Static320.method5181();
	}
}
