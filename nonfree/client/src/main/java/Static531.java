import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray38;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public static void method7227() {
		Static519.aClass58_43 = null;
		Static205.aClass58_24 = null;
		Static456.aClass58_41 = null;
		Static352.aClass58_33 = null;
		Static39.aClass58_26 = null;
		Static182.aClass58_22 = null;
		Static301.aClass58_27 = null;
		Static183.aClass58_23 = null;
		Static194.aClass58Array9 = null;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(Z)V")
	public static void method7229() {
		Static510.aClass139Array1 = null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
	public static Object method7230(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static567.aBoolean688) {
			try {
				@Pc(20) Class41 local20 = (Class41) Class.forName("Class41_Sub1").getDeclaredConstructor().newInstance();
				local20.method1152(arg0);
				return local20;
			} catch (@Pc(27) Throwable local27) {
				Static567.aBoolean688 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!ji;I)Lclient!vj;")
	public static Class18_Sub3 method7231(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(7) Class18 local7 = Static268.method6658(arg0);
		@Pc(11) int local11 = arg0.method6003();
		@Pc(20) int local20 = arg0.method6003();
		@Pc(24) int local24 = arg0.method6003();
		@Pc(28) int local28 = arg0.method6003();
		@Pc(32) int local32 = arg0.method6003();
		@Pc(36) int local36 = arg0.method6003();
		return new Class18_Sub3(local7.aClass319_12, local7.aClass247_12, local7.anInt6642, local7.anInt6646, local7.anInt6645, local7.anInt6643, local7.anInt6639, local7.anInt6641, local7.anInt6640, local11, local20, local24, local28, local32, local36);
	}
}
