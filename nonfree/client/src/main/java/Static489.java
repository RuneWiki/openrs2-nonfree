import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "Lclient!mo;")
	public static final Class218 aClass218_10 = new Class218("LOCAL", 4);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
	public static void method6874() {
		Static289.aClass356_25.method7802();
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIII)Lclient!to;")
	public static Class1_Sub48 method6875(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class1_Sub48 local5 = null;
		if (arg0 == 0) {
			local5 = Static320.method4867(Static442.aClass170_2, Static6.aClass319_111);
		}
		if (arg0 == 1) {
			local5 = Static320.method4867(Static442.aClass170_2, Static54.aClass319_30);
		}
		local5.aClass1_Sub20_Sub1_2.method4422(Static595.aClass31_1.method985(82) ? 1 : 0);
		local5.aClass1_Sub20_Sub1_2.method4409(arg2 + Static24.anInt674);
		local5.aClass1_Sub20_Sub1_2.method4384(arg1 + Static376.anInt6631);
		Static328.anInt5893 = arg2;
		Static275.aBoolean387 = false;
		Static90.anInt1998 = arg1;
		Static561.method5040();
		return local5;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZIIZ)Lclient!ga;")
	public static Class111 method6877(@OriginalArg(1) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(10) Class57 local10 = null;
		if (Static211.aClass259_3 != null) {
			local10 = new Class57(arg0, Static211.aClass259_3, Static460.aClass259Array1[arg0], 1000000);
		}
		Static553.aClass252_Sub1Array2[arg0] = Static226.aClass168_3.method3972(Static177.aClass57_2, local10, arg0);
		Static553.aClass252_Sub1Array2[arg0].method7928();
		return new Class111(Static553.aClass252_Sub1Array2[arg0], arg1, 1);
	}
}
