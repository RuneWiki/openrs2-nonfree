import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "Lclient!uf;")
	public static final Class326 aClass326_46 = new Class326(10);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6608(@OriginalArg(1) String arg0) {
		if (!arg0.equals("")) {
			@Pc(17) Class1_Sub48 local17 = Static320.method4867(Static442.aClass170_2, Static416.aClass319_131);
			local17.aClass1_Sub20_Sub1_2.method4378(Static419.method5867(arg0));
			local17.aClass1_Sub20_Sub1_2.method4399(arg0);
			Static34.method813(local17);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IBII)I")
	public static int method6610(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < arg1) {
			return arg1;
		} else if (arg0 <= arg2) {
			return arg0;
		} else {
			return arg2;
		}
	}
}
