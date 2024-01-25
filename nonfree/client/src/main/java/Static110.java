import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "Lclient!kr;")
	public static final Class216 aClass216_6 = new Class216();

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "Lclient!uj;")
	public static final Class371 aClass371_1 = new Class371("WTI", "office", "_wti", 5);

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "Lclient!lv;")
	public static Class3_Sub32 aClass3_Sub32_1 = null;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
	public static void method1959() {
		if (Static96.anInterface23Array1 == null) {
			return;
		}
		@Pc(10) Interface23[] local10 = Static96.anInterface23Array1;
		for (@Pc(12) int local12 = 0; local12 < local10.length; local12++) {
			@Pc(18) Interface23 local18 = local10[local12];
			local18.method8327();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
	public static void method1961() {
		for (@Pc(10) Class3_Sub4_Sub9 local10 = (Class3_Sub4_Sub9) Static59.aClass136_6.method3509(); local10 != null; local10 = (Class3_Sub4_Sub9) Static59.aClass136_6.method3506()) {
			@Pc(15) Class19_Sub1_Sub3_Sub4 local15 = local10.aClass19_Sub1_Sub3_Sub4_1;
			local15.method6656();
			if (local15.method6651()) {
				local10.method9446();
				local15.method6650();
			} else if (Static584.aClass262ArrayArrayArray2 != null && local15.method6657()) {
				Static137.method2240(local15, true);
			}
		}
	}
}
