import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "Lclient!of;")
	public static final Class174 aClass174_189 = new Class174("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "Lclient!la;")
	public static final Class136 aClass136_180 = new Class136(51, 9);

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_170 = new Class163(24, 7);

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)I")
	public static int method5430(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 31;
		return (arg0 + local7) / arg1 - local7;
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
	public static void method5432(@OriginalArg(0) int arg0) {
		if (Static345.anInt5823 == arg0) {
			return;
		}
		if (Static345.anInt5823 == 0) {
			Static279.method3854();
		}
		if (arg0 == 12) {
			Static383.method5320(Static378.aString60, Static154.anInt2803, Static217.aString10);
		}
		if (arg0 != 12 && Static401.aClass116_2 != null) {
			Static401.aClass116_2.method2920();
			Static401.aClass116_2 = null;
		}
		if (arg0 == 2) {
			Static273.method3786(Static343.anInt5785 != Static404.anInt6677);
		}
		if (arg0 == 6) {
			Static309.method4361(Static27.anInt487 != Static343.anInt5785);
		}
		if (arg0 == 4) {
			Static183.method2883(Static378.aString60, Static217.aString10);
		} else if (arg0 == 5) {
			Static383.method5320(Static378.aString60, Static154.anInt2803, Static217.aString10);
		} else if (arg0 == 8) {
			Static383.method5320(Static378.aString60, Static154.anInt2803, Static217.aString10);
		} else if (arg0 == 11) {
			Static183.method2883(Static378.aString60, Static217.aString10);
		}
		if (Static195.method3032(Static345.anInt5823)) {
			Static326.aClass250_81.anInt7168 = 2;
			Static333.aClass250_83.anInt7168 = 2;
			Static30.aClass250_13.anInt7168 = 2;
			Static441.aClass250_102.anInt7168 = 2;
			Static171.aClass250_48.anInt7168 = 2;
			Static324.aClass250_80.anInt7168 = 2;
			Static6.aClass250_1.anInt7168 = 2;
		}
		if (Static195.method3032(arg0)) {
			Static316.anInt5346 = 1;
			Static84.anInt6077 = 1;
			Static188.anInt3447 = 0;
			Static430.anInt7238 = 0;
			Static266.anInt4438 = 0;
			Static126.method1992(true);
			Static326.aClass250_81.anInt7168 = 1;
			Static333.aClass250_83.anInt7168 = 1;
			Static30.aClass250_13.anInt7168 = 1;
			Static441.aClass250_102.anInt7168 = 1;
			Static171.aClass250_48.anInt7168 = 1;
			Static324.aClass250_80.anInt7168 = 1;
			Static6.aClass250_1.anInt7168 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static50.method930();
		}
		if (arg0 == 1) {
			Static258.method3604(Static8.aClass250_2, Static413.aClass167_11);
		} else {
			Static429.method5844();
		}
		@Pc(211) boolean local211 = arg0 == 1 || Static48.method914(arg0) || Static213.method3197(arg0);
		@Pc(228) boolean local228 = Static345.anInt5823 == 1 || Static48.method914(Static345.anInt5823) || Static213.method3197(Static345.anInt5823);
		if (local228 != local211) {
			if (local211) {
				Static81.anInt1464 = Static109.anInt1934;
				if (Static39.aClass79_Sub1_1.anInt2147 == 0) {
					Static60.method1134();
				} else {
					Static293.method4197(Static39.aClass79_Sub1_1.anInt2147, Static109.anInt1934, Static28.aClass250_12);
				}
				Static338.aClass191_3.method4512(false);
			} else {
				Static60.method1134();
				Static338.aClass191_3.method4512(true);
			}
		}
		if (Static195.method3032(arg0) || arg0 == 12) {
			Static413.aClass167_11.method5987();
		}
		Static345.anInt5823 = arg0;
	}
}
