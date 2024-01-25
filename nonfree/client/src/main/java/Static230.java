import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
	public static int anInt4275;

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_94 = new Class119(64, 1);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)V")
	public static void method3465(@OriginalArg(0) int arg0) {
		if (Static120.anInt2584 == arg0) {
			return;
		}
		if (Static120.anInt2584 == 0) {
			Static192.method3070();
		}
		if (arg0 == 40) {
			Static319.method1505();
		}
		if (arg0 != 40 && Static314.aClass251_3 != null) {
			Static314.aClass251_3.method5345();
			Static314.aClass251_3 = null;
		}
		if (Static120.anInt2584 == 25 || Static120.anInt2584 == 28) {
			Static13.aClass32_4.anInt1093 = 2;
			Static5.aClass32_1.anInt1093 = 2;
			Static172.aClass32_45.anInt1093 = 2;
			Static333.aClass32_72.anInt1093 = 2;
			Static50.aClass32_20.anInt1093 = 2;
			Static14.aClass32_5.anInt1093 = 2;
			Static66.aClass32_29.anInt1093 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static180.anInt3570 = 0;
			Static162.anInt3324 = 0;
			Static268.anInt5044 = 0;
			Static44.anInt7278 = 1;
			Static407.anInt6700 = 1;
			Static210.method3247(true);
			Static13.aClass32_4.anInt1093 = 1;
			Static5.aClass32_1.anInt1093 = 1;
			Static172.aClass32_45.anInt1093 = 1;
			Static333.aClass32_72.anInt1093 = 1;
			Static50.aClass32_20.anInt1093 = 1;
			Static14.aClass32_5.anInt1093 = 1;
			Static66.aClass32_29.anInt1093 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static377.method4937();
		}
		if (arg0 == 5) {
			Static170.method2752(Static121.aClass172_3, Static405.aClass32_82);
		} else {
			Static379.method4943();
		}
		@Pc(147) boolean local147 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(162) boolean local162 = Static120.anInt2584 == 5 || Static120.anInt2584 == 10 || Static120.anInt2584 == 28;
		if (local162 != local147) {
			if (local147) {
				Static120.anInt2586 = Static267.anInt5033;
				if (Static374.aClass20_Sub1_1.anInt2341 == 0) {
					Static301.method1899();
				} else {
					Static396.method5084(Static149.aClass32_43, Static374.aClass20_Sub1_1.anInt2341, Static267.anInt5033);
				}
				Static265.aClass257_2.method5394(false);
			} else {
				Static301.method1899();
				Static265.aClass257_2.method5394(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static121.aClass172_3.method5543();
		}
		Static120.anInt2584 = arg0;
	}
}
