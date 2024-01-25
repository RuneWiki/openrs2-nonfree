import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!et", name = "m", descriptor = "Lclient!kp;")
	public static Class147 aClass147_3 = null;

	@OriginalMember(owner = "client!et", name = "u", descriptor = "I")
	public static int anInt2079 = 1;

	@OriginalMember(owner = "client!et", name = "w", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;I)V")
	public static void method1791(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static109.anInt2181 = arg2;
		Static156.anInt3163 = 2;
		Static161.method2702(arg1, arg0);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method1793(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static364.aBoolean401) {
			try {
				@Pc(18) Class164 local18 = (Class164) Class.forName("Class164_Sub1").getDeclaredConstructor().newInstance();
				local18.method3659(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static364.aBoolean401 = true;
			}
		}
		return arg0;
	}
}
