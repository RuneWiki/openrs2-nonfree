import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
	public static int anInt4072;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_88 = new Class263(24, -1);

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "Z")
	public static boolean aBoolean248 = false;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIIZI)Lclient!qq;")
	public static Class1_Sub39 method3156(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class1_Sub39 local7 = new Class1_Sub39();
		local7.anInt6172 = arg3;
		local7.anInt6174 = arg0;
		Static177.aClass38_18.method766(local7, (long) arg1);
		Static96.method1654(arg3);
		@Pc(31) Class68 local31 = Static300.method4351(arg1);
		if (local31 != null) {
			Static446.method6042(local31);
		}
		if (Static18.aClass68_1 != null) {
			Static446.method6042(Static18.aClass68_1);
			Static18.aClass68_1 = null;
		}
		Static194.method3147();
		if (local31 != null) {
			Static238.method3609(local31, !arg2);
		}
		if (!arg2) {
			Static178.method2998(arg3);
		}
		if (!arg2 && Static456.anInt1594 != -1) {
			Static434.method5793(Static456.anInt1594, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(CB)Z")
	public static boolean method3158(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Lclient!ed;")
	public static Class69 method3159() {
		try {
			return (Class69) Class.forName("Class69_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
