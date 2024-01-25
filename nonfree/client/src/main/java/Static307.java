import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
	public static int anInt5539;

	@OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
	public static int anInt5544;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "Z")
	public static boolean aBoolean415 = false;

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!wv;I)V")
	public static void method4727(@OriginalArg(0) Class365 arg0) {
		if (!Static22.aBoolean43) {
			return;
		}
		if (arg0.anObjectArray18 != null) {
			@Pc(18) Class365 local18 = Static583.method7803(Static365.anInt6484, Static39.anInt1026);
			if (local18 != null) {
				@Pc(24) Class1_Sub2 local24 = new Class1_Sub2();
				local24.aClass365_1 = arg0;
				local24.anObjectArray1 = arg0.anObjectArray18;
				local24.aClass365_2 = local18;
				Static145.method2353(local24);
			}
		}
		@Pc(41) Class1_Sub48 local41 = Static320.method4867(Static442.aClass170_2, Static300.aClass319_99);
		local41.aClass1_Sub20_Sub1_2.method4421(arg0.anInt9646);
		local41.aClass1_Sub20_Sub1_2.method4402(arg0.anInt9573);
		local41.aClass1_Sub20_Sub1_2.method4421(Static365.anInt6484);
		local41.aClass1_Sub20_Sub1_2.method4402(Static141.anInt2722);
		local41.aClass1_Sub20_Sub1_2.method4402(Static39.anInt1026);
		local41.aClass1_Sub20_Sub1_2.method4409(arg0.anInt9603);
		Static34.method813(local41);
	}
}
