import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static532 {

	@OriginalMember(owner = "client!st", name = "b", descriptor = "I")
	public static int anInt9011;

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!vd;)V")
	public static void method7698(@OriginalArg(1) Class353 arg0) {
		Static501.aClass353_100 = arg0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ILclient!sca;)V")
	public static void method7704(@OriginalArg(1) Class302 arg0) {
		@Pc(12) Class302 local12 = Static129.method2117(arg0);
		@Pc(16) int local16;
		@Pc(18) int local18;
		if (local12 == null) {
			local16 = Static321.anInt6137;
			local18 = Static356.anInt6630;
		} else {
			local18 = local12.anInt8814;
			local16 = local12.anInt8801;
		}
		Static546.method7958(local16, local18, arg0, false);
		Static155.method2436(local18, local16, arg0);
	}
}
