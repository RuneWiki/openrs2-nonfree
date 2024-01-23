import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!ul;")
	public static Class172 aClass172_34 = new Class172(50);

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23 = null;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
	public static int anInt3590 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method2908() {
		Static133.aClass172_22.method4346();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZZZI)Lclient!cg;")
	public static Class22 method2913(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		@Pc(5) Class55 local5 = null;
		if (Static246.aClass31_5 != null) {
			local5 = new Class55(arg0, Static246.aClass31_5, Static9.aClass31Array1[arg0], 1000000);
		}
		Static45.aClass39_Sub1Array1[arg0] = Static267.aClass52_1.method1402(local5, Static211.aClass55_5, arg0);
		if (arg2) {
			Static45.aClass39_Sub1Array1[arg0].method1140();
		}
		return new Class22(Static45.aClass39_Sub1Array1[arg0], arg1, arg3);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method2914(@OriginalArg(1) String arg0) {
		return Static7.method110(arg0);
	}
}
