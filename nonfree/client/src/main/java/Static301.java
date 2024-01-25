import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
	public static int anInt3096;

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BLclient!pja;)V")
	public static void method2678(@OriginalArg(1) Class3_Sub37 arg0) {
		Static393.aClass302_44.method6613(arg0);
		arg0.anInt7407 = arg0.aClass3_Sub4_Sub1_2.anInt9739;
		arg0.aClass3_Sub4_Sub1_2.anInt9739 = 0;
		Static227.anInt3968 += arg0.anInt7407;
	}

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "(III)I")
	public static int method2679(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte local18;
		if (arg1 > 20000) {
			local18 = 4;
			Static443.method6043();
		} else if (arg1 > 10000) {
			Static623.method8412();
			local18 = 3;
		} else if (arg1 <= 5000) {
			Static677.method9019();
			local18 = 1;
		} else {
			local18 = 2;
			Static386.method5403();
		}
		if (arg0 != Static336.aClass3_Sub41_18.aClass14_Sub7_2.method2899()) {
			Static336.aClass3_Sub41_18.method6705(arg0, Static336.aClass3_Sub41_18.aClass14_Sub7_1);
			Static168.method2665(false, arg0);
		}
		Static219.method3247();
		return local18;
	}
}
