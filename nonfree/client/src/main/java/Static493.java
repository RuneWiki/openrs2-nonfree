import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static493 {

	@OriginalMember(owner = "client!rea", name = "p", descriptor = "Lclient!nd;")
	public static Class238 aClass238_222;

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(BILclient!ria;)Ljava/lang/String;")
	public static String method6907(@OriginalArg(1) int arg0, @OriginalArg(2) Class303 arg1) {
		if (!Static79.method1734(arg1).method2649(arg0) && arg1.anObjectArray15 == null) {
			return null;
		} else if (arg1.aStringArray43 == null || arg1.aStringArray43.length <= arg0 || arg1.aStringArray43[arg0] == null || arg1.aStringArray43[arg0].trim().length() == 0) {
			return Static179.aBoolean273 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray43[arg0];
		}
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
	public static void method6908() {
		Static591.aClass37_12 = null;
		Static639.aClass31Array19 = null;
		Static4.aClass31Array1 = null;
		Static241.aClass31Array7 = null;
		Static242.aClass31Array8 = null;
		Static457.aClass31_35 = null;
		Static606.aClass31Array18 = null;
		Static158.aClass31Array5 = null;
		Static544.aClass37_8 = null;
		Static287.aClass31Array20 = null;
		Static186.aClass31Array6 = null;
		Static80.aClass31Array3 = null;
		Static39.aClass37_1 = null;
		Static22.aClass31Array2 = null;
		Static435.aClass31Array13 = null;
		Static272.aClass31Array9 = null;
		Static367.aClass31_15 = null;
		Static435.aClass31Array12 = null;
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILclient!ria;Lclient!ria;)V")
	public static void method6910(@OriginalArg(1) Class303 arg0, @OriginalArg(2) Class303 arg1) {
		@Pc(12) Class2_Sub31 local12 = Static275.method4480(Static640.aClass314_2, Static419.aClass145_132);
		local12.aClass2_Sub17_Sub1_2.method2827(arg1.anInt7962);
		local12.aClass2_Sub17_Sub1_2.method2870(arg0.anInt7983);
		local12.aClass2_Sub17_Sub1_2.method2867(arg0.anInt7962);
		local12.aClass2_Sub17_Sub1_2.method2879(arg0.anInt7964);
		local12.aClass2_Sub17_Sub1_2.method2883(arg1.anInt7964);
		local12.aClass2_Sub17_Sub1_2.method2889(arg1.anInt7983);
		Static526.method7309(local12);
	}

	@OriginalMember(owner = "client!rea", name = "a", descriptor = "(IIB)Z")
	public static boolean method6911(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
