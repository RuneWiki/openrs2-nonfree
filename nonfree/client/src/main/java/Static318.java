import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!jma", name = "x", descriptor = "I")
	public static int anInt1773 = -1;

	@OriginalMember(owner = "client!jma", name = "a", descriptor = "(ILclient!ika;)Lclient!iba;")
	public static Class171 method1659(@OriginalArg(1) Class3_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method2048(255);
		@Pc(14) Class223 local14 = Static525.method7024()[arg0.method2048(255)];
		@Pc(21) Class352 local21 = Static588.method7593()[arg0.method2048(255)];
		@Pc(25) int local25 = arg0.method2017();
		@Pc(29) int local29 = arg0.method2017();
		@Pc(33) int local33 = arg0.method2028(-14795);
		@Pc(37) int local37 = arg0.method2028(-14795);
		@Pc(41) int local41 = arg0.method2036();
		@Pc(47) int local47 = arg0.method2036();
		@Pc(51) int local51 = arg0.method2036();
		@Pc(63) boolean local63 = arg0.method2048(255) == 1;
		return new Class171(local7, local14, local21, local25, local29, local33, local37, local41, local47, local51, local63);
	}

	@OriginalMember(owner = "client!jma", name = "c", descriptor = "(I)V")
	public static void method1660() {
		if (Static397.aClass325_1 != null) {
			Static397.aClass325_1.method7278();
		}
		if (Static503.aThread6 == null) {
			return;
		}
		while (true) {
			try {
				Static503.aThread6.join();
				break;
			} catch (@Pc(17) InterruptedException local17) {
			}
		}
	}
}
