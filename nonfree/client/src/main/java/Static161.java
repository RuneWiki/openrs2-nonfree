import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!sba;")
	public static Class291 aClass291_1;

	@OriginalMember(owner = "client!gb", name = "u", descriptor = "Lclient!up;")
	public static Class333 aClass333_1;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[Lclient!lr;")
	public static Class208_Sub1[] aClass208_Sub1Array1 = new Class208_Sub1[0];

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!wv;Lclient!wv;)V")
	public static void method2483(@OriginalArg(1) Class365 arg0, @OriginalArg(2) Class365 arg1) {
		@Pc(12) Class1_Sub48 local12 = Static320.method4867(Static442.aClass170_2, Static567.aClass319_165);
		local12.aClass1_Sub20_Sub1_2.method4421(arg0.anInt9646);
		local12.aClass1_Sub20_Sub1_2.method4381(arg0.anInt9603);
		local12.aClass1_Sub20_Sub1_2.method4402(arg0.anInt9573);
		local12.aClass1_Sub20_Sub1_2.method4409(arg1.anInt9573);
		local12.aClass1_Sub20_Sub1_2.method4384(arg1.anInt9603);
		local12.aClass1_Sub20_Sub1_2.method4400(arg1.anInt9646);
		Static34.method813(local12);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!wv;)Ljava/lang/String;")
	public static String method2491(@OriginalArg(1) Class365 arg0) {
		if (Static72.method1565(arg0).method4818() == 0) {
			return null;
		} else if (arg0.aString97 == null || arg0.aString97.trim().length() == 0) {
			return Static484.aBoolean581 ? "Hidden-use" : null;
		} else {
			return arg0.aString97;
		}
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)V")
	public static void method2497() {
		Static53.anInt1363 = 0;
		@Pc(18) int local18 = (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8796 >> 9) + Static376.anInt6631;
		@Pc(25) int local25 = (Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.anInt8795 >> 9) + Static24.anInt674;
		if (local18 >= 3053 && local18 <= 3156 && local25 >= 3056 && local25 <= 3136) {
			Static53.anInt1363 = 1;
		}
		if (local18 >= 3072 && local18 <= 3118 && local25 >= 9492 && local25 <= 9535) {
			Static53.anInt1363 = 1;
		}
		if (Static53.anInt1363 == 1 && local18 >= 3139 && local18 <= 3199 && local25 >= 3008 && local25 <= 3062) {
			Static53.anInt1363 = 0;
		}
	}
}
