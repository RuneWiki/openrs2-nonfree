import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "I")
	public static int anInt171;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIZ)V")
	public static void method221(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(20) Class4_Sub48 local20 = Static335.method4615(Static463.aClass216_116, Static669.aClass196_2);
			local20.aClass4_Sub11_Sub1_2.method8838(arg0);
			Static410.method5170(local20);
		} else {
			Static237.method3386(Static636.aClass268_40, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
	public static void method222() {
		if (Static638.aClass64_4 != null) {
			Static638.aClass64_4.method2213();
		}
		if (Static585.aClass64_3 != null) {
			Static585.aClass64_3.method2213();
		}
	}
}
