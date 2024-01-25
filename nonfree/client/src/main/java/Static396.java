import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!oca", name = "B", descriptor = "Lclient!uu;")
	public static Class343 aClass343_190;

	@OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method6241(@OriginalArg(0) String arg0) {
		if (Class82_Sub3_Sub1.aString25.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class82_Sub3_Sub1.aString25.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class82_Sub3_Sub1.aString25.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!oca", name = "b", descriptor = "(ILclient!dc;)Lclient!fq;")
	public static Class35_Sub2 method6242(@OriginalArg(1) Class3_Sub9 arg0) {
		@Pc(7) Class35 local7 = Static232.method3992(arg0);
		@Pc(11) int local11 = arg0.method5585();
		@Pc(20) int local20 = arg0.method5585();
		@Pc(24) int local24 = arg0.method5610();
		return new Class35_Sub2(local7.aClass293_11, local7.aClass15_12, local7.anInt9052, local7.anInt9054, local7.anInt9053, local7.anInt9046, local7.anInt9050, local7.anInt9045, local7.anInt9055, local11, local20, local24);
	}

	@OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V")
	public static void method6246() {
		Static554.aClient1.method1309();
		Static357.method5760();
		Static278.aClass194_159 = null;
		Static427.aClass194_241 = null;
		Static269.anInt5252 = 0;
		Static381.anInt6903 = 0;
		Static47.aClass3_Sub9_Sub2_1.anInt6453 = 0;
		Static409.aClass194_231 = null;
		Static272.method4517();
		Static606.anInt9791 = 0;
		Static398.anInt7117 = 0;
		Static95.aClass253Array1 = null;
		Static468.anInt8022 = 0;
		Static9.aString1 = null;
	}
}
