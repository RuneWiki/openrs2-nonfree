import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "Lclient!dc;")
	public static Class45 aClass45_3;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
	public static int anInt6116 = 0;

	@OriginalMember(owner = "client!sm", name = "r", descriptor = "Lclient!hl;")
	public static final Class96 aClass96_31 = new Class96(64);

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method5054(@OriginalArg(1) Class240 arg0) {
		if (!Static449.aBoolean564) {
			return;
		}
		if (arg0.anObjectArray29 != null) {
			@Pc(16) Class240 local16 = Static231.method3929(Static383.anInt6696, Static344.anInt6075);
			if (local16 != null) {
				@Pc(22) Class4_Sub10 local22 = new Class4_Sub10();
				local22.aClass240_6 = local16;
				local22.aClass240_5 = arg0;
				local22.anObjectArray4 = arg0.anObjectArray29;
				Static64.method1462(local22);
			}
		}
		Static448.method6134(Static443.aClass212_96);
		Static457.aClass4_Sub20_Sub1_5.method4561(arg0.anInt6909);
		Static457.aClass4_Sub20_Sub1_5.method4610(arg0.anInt6876);
		Static457.aClass4_Sub20_Sub1_5.method4571(Static344.anInt6075);
		Static457.aClass4_Sub20_Sub1_5.method4615(Static383.anInt6696);
		Static457.aClass4_Sub20_Sub1_5.method4571(Static25.anInt464);
		Static457.aClass4_Sub20_Sub1_5.method4587(arg0.anInt6885);
	}
}
