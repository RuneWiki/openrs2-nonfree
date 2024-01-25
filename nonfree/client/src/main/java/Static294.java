import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!le", name = "H", descriptor = "I")
	public static int anInt5440;

	@OriginalMember(owner = "client!le", name = "N", descriptor = "[Lclient!xa;")
	public static Class13[] aClass13Array19;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!eh;I)Lclient!pg;")
	public static Class170_Sub2 method4612(@OriginalArg(0) Class4_Sub9 arg0) {
		return new Class170_Sub2(arg0.method6003(), arg0.method6003(), arg0.method6003(), arg0.method6003(), arg0.method6023(), arg0.method6023(), arg0.method6015());
	}

	@OriginalMember(owner = "client!le", name = "e", descriptor = "(B)V")
	public static void method4613() {
		@Pc(9) int[] local9 = new int[Static195.aClass99_1.anInt3088];
		@Pc(11) int local11 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static195.aClass99_1.anInt3088; local13++) {
			@Pc(20) Class222 local20 = Static195.aClass99_1.method2798(local13);
			if (local20.anInt5822 >= 0 || local20.anInt5773 >= 0) {
				local9[local11++] = local13;
			}
		}
		Static273.anIntArray447 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static273.anIntArray447[local52] = local9[local52];
		}
	}
}
