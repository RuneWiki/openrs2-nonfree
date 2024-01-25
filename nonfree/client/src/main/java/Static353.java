import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)Lclient!nt;")
	public static Class240 method4721(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class240 local7 = new Class240();
		local7.anInt6066 = -1;
		local7.anInt6070 = arg1 + 5 + 1;
		local7.anInt6073 = -1;
		local7.anInt6083 = arg0 + 5 + 1;
		local7.anIntArrayArray40 = new int[local7.anInt6070][local7.anInt6083];
		local7.method5187();
		return local7;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZII)V")
	public static void method4722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) int local5 = Static597.anInt9683;
		@Pc(7) int local7 = Static46.anInt970;
		if (Static319.aBoolean356) {
			local5 += Static274.method3801();
			local7 += Static69.method966();
		}
		@Pc(30) Class61 local30;
		if (Static28.anInt666 == 1) {
			local30 = Static611.aClass61Array16[Static587.anInt9568 / 100];
			local30.method6431(local5 - 8, local7 + -8);
			Static170.method7976(local5 + local30.method6446() - 8, local30.method6438() + -8 + local7, local5 - 8, local7 - 8);
		}
		if (Static28.anInt666 == 2) {
			local30 = Static611.aClass61Array16[Static587.anInt9568 / 100 + 4];
			local30.method6431(local5 - 8, local7 + -8);
			Static170.method7976(local5 + local30.method6446() - 8, local30.method6438() + -8 + local7, local5 - 8, local7 + -8);
		}
		Static232.method3188();
	}
}
