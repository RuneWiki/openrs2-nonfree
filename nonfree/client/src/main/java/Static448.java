import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "Lclient!hl;")
	public static Class104 aClass104_4;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Lclient!client;")
	public static client aClient1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "Lclient!pp;")
	public static final Class198 aClass198_9 = new Class198("", 16);

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)V")
	public static void method6550(@OriginalArg(1) int arg0) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg0, 8);
		local8.method3084();
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZLclient!hr;IIILclient!eq;I)V")
	public static void method6551(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class66 arg5) {
		if (arg0) {
			Static144.aClass87_8.method6567((Static348.anInt6272 - Static144.aClass87_8.method6565()) / 2, (Static199.anInt3767 - Static144.aClass87_8.method6561()) / 2);
			Static297.aClass87_20.method6567((Static348.anInt6272 - Static297.aClass87_20.method6565()) / 2, 18);
		}
		arg1.method4795(Static348.anInt6272 / 2, (Static4.aClass36_5 == Static87.aClass36_3 ? Static273.aClass267_65 : Static272.aClass267_64).method6581(Static161.anInt3239), Static199.anInt3767 / 2 - 26, arg4, -1);
		@Pc(61) int local61 = Static199.anInt3767 / 2 - 18;
		arg5.method4972(Static348.anInt6272 / 2 - 152, local61, 304, 34, arg3, 0);
		arg5.method4972(Static348.anInt6272 / 2 - 151, local61 + 1, 302, 32, 0, 0);
		arg5.method5004(Static348.anInt6272 / 2 - 150, local61 + 2, Static200.anInt3785 * 3, 30, arg2, 0);
		arg5.method5004(Static200.anInt3785 * 3 + Static348.anInt6272 / 2 - 150, local61 + 2, 300 - Static200.anInt3785 * 3, 30, 0, 0);
		arg1.method4795(Static348.anInt6272 / 2, Static65.aString15, Static199.anInt3767 / 2 + 4, arg4, -1);
	}
}
