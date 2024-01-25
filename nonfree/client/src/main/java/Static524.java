import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "Lclient!tda;")
	public static final Class273 aClass273_13 = new Class273(8, 0, 4, 1);

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "Lclient!aq;")
	public static final Class16 aClass16_20 = new Class16(1);

	@OriginalMember(owner = "client!vv", name = "e", descriptor = "Lclient!bu;")
	public static final Class38 aClass38_75 = new Class38();

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(B)V")
	public static void method7447() {
		Static126.aClass60_1.method5382();
		Static42.aClass191_1.method5146();
		Static496.aClient1.method1724();
		Static78.aCanvas7.setBackground(Color.black);
		Static119.anInt2862 = -1;
		Static126.aClass60_1 = Static129.method2829(Static78.aCanvas7);
		Static42.aClass191_1 = Static420.method6256(Static78.aCanvas7);
	}

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lclient!gw;I)Lclient!pv;")
	public static Class1_Sub3 method7448(@OriginalArg(0) Class1_Sub13 arg0) {
		arg0.method3043();
		@Pc(13) int local13 = arg0.method3043();
		@Pc(17) Class1_Sub3 local17 = Static291.method4909(local13);
		local17.anInt9370 = arg0.method3043();
		@Pc(26) int local26 = arg0.method3043();
		for (@Pc(33) int local33 = 0; local33 < local26; local33++) {
			@Pc(39) int local39 = arg0.method3043();
			local17.method7901(arg0, local39);
		}
		local17.method7912();
		return local17;
	}
}
