import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!k", name = "c", descriptor = "Lclient!wu;")
	public static Class380 aClass380_68;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public static int anInt4510;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIZI)Lclient!wu;")
	public static Class380 method3899(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Class135 local5 = null;
		if (Static25.aClass254_1 != null) {
			local5 = new Class135(arg0, Static25.aClass254_1, Static167.aClass254Array1[arg0], 1000000);
		}
		Static181.aClass20_Sub1Array2[arg0] = Static442.aClass87_1.method1805(arg0, local5, Static323.aClass135_4);
		Static181.aClass20_Sub1Array2[arg0].method470();
		return new Class380(Static181.aClass20_Sub1Array2[arg0], arg2, arg1);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!wn;I)I")
	public static int method3900(@OriginalArg(0) Class2_Sub22_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method8569(2);
		@Pc(37) int local37;
		if (local10 == 0) {
			local37 = 0;
		} else if (local10 == 1) {
			local37 = arg0.method8569(5);
		} else if (local10 == 2) {
			local37 = arg0.method8569(8);
		} else {
			local37 = arg0.method8569(11);
		}
		return local37;
	}
}
