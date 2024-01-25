import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
	public static int anInt6761;

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "Lclient!ul;")
	public static Class5_Sub1_Sub5 aClass5_Sub1_Sub5_2;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!raa;I)V")
	public static void method6043(@OriginalArg(0) Class295 arg0) {
		@Pc(7) Class295 local7 = Static201.method3543(arg0);
		@Pc(21) int local21;
		@Pc(18) int local18;
		if (local7 == null) {
			local21 = Static345.anInt5827;
			local18 = Static408.anInt7118;
		} else {
			local18 = local7.anInt7985;
			local21 = local7.anInt7957;
		}
		Static150.method2213(false, local21, arg0, local18);
		Static190.method2863(local18, local21, arg0);
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)I")
	public static int method6044() {
		@Pc(12) int local12 = Static505.aClass277_22.method6654();
		if (Static353.aClass277Array1.length - 1 > local12) {
			Static505.aClass277_22 = Static353.aClass277Array1[local12 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZLclient!oj;)Ljava/lang/String;")
	public static String method6045(@OriginalArg(1) Class5_Sub5_Sub15 arg0) {
		if (arg0.aString74 == null || arg0.aString74.length() == 0) {
			return arg0.aString75 == null || arg0.aString75.length() <= 0 ? arg0.aString76 : arg0.aString76 + Static174.aClass120_32.method2690(Static266.anInt4796) + arg0.aString75;
		} else if (arg0.aString75 == null || arg0.aString75.length() <= 0) {
			return arg0.aString76 + Static174.aClass120_32.method2690(Static266.anInt4796) + arg0.aString74;
		} else {
			return arg0.aString76 + Static174.aClass120_32.method2690(Static266.anInt4796) + arg0.aString75 + Static174.aClass120_32.method2690(Static266.anInt4796) + arg0.aString74;
		}
	}
}
