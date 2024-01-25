import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
	public static int anInt1207;

	@OriginalMember(owner = "client!cc", name = "s", descriptor = "I")
	public static int anInt1208;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "I")
	public static int anInt1203 = 0;

	@OriginalMember(owner = "client!cc", name = "r", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BII)Z")
	public static boolean method1143(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static153.method2167(arg1, arg0) || Static454.method6568(arg0, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)Lclient!lc;")
	public static Class202 method1145() {
		try {
			return (Class202) Class.forName("Class202_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method1146() {
		if (Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 0 && Static253.anInt4353 != Static216.anInt3669) {
			Static122.method1895(Static15.anInt438, false, 11, Static310.anInt5242);
		} else {
			Static536.method7429(Static546.aClass132_13);
			if (Static253.anInt4353 != Static26.anInt604) {
				Static369.method5323();
			}
		}
	}
}
