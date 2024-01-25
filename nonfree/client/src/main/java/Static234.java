import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!jr", name = "z", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_49 = new Class243(17, -1);

	@OriginalMember(owner = "client!jr", name = "C", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_14 = new Class245(8, 0, 4, 1);

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)V")
	public static void method3654() {
		Static117.aClass286_4.method7232();
		Static16.aClass16_3.method570();
		Static289.aClass125_1.method3175();
		Static505.aClass206_4.method5330();
		Static21.aClass255_2.method6588();
		Static464.aClass115_1.method2971();
		Static396.aClass157_2.method3750();
		Static305.aClass14_1.method558();
		Static79.aClass80_1.method2318();
		Static266.aClass230_1.method6001();
		Static492.aClass218_1.method5793();
		Static537.aClass112_4.method2958();
		Static387.aClass56_4.method1683();
		Static221.aClass225_1.method5910();
		Static66.aClass247_1.method6471();
		Static222.aClass299_2.method7463();
		Static171.aClass131_1.method3295();
		Static129.aClass100_1.method2653();
		Static70.aClass61_1.method1761();
		Static172.aClass211_2.method5369();
		Static316.method4860();
		Static358.method5792();
		Static249.method3957();
		Static127.method2385();
		Static30.aClass231_8.method6227();
		Static202.aClass231_37.method6227();
		Static253.aClass231_43.method6227();
		Static392.aClass231_57.method6227();
		Static258.aClass231_44.method6227();
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(BI)V")
	public static void method3655(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class2 local10 = Static275.aClass127_42.method3203(); local10 != null; local10 = Static275.aClass127_42.method3212()) {
			if ((long) arg0 == (local10.aLong241 >> 48 & 0xFFFFL)) {
				local10.method7802();
			}
		}
	}
}
