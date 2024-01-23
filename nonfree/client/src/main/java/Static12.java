import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!hc;")
	public static Class51 aClass51_2;

	@OriginalMember(owner = "client!al", name = "f", descriptor = "I")
	public static int anInt503 = 0;

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	public static int anInt504 = 0;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(I)Lclient!lg;")
	public static Class68 method225() {
		try {
			return (Class68) Class.forName("Class68_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return new Class68_Sub1();
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
	public static String method227(@OriginalArg(1) String arg0) {
		@Pc(12) int local12 = Static55.method1068(arg0);
		return local12 == -1 ? "" : Static48.method983(Static254.aClass151_2.aStringArray39[local12], " ", "<br>");
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V")
	public static void method228() {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(CI)C")
	public static char method229(@OriginalArg(0) char arg0) {
		return arg0 == 'µ' || arg0 == 'ƒ' ? arg0 : Character.toTitleCase(arg0);
	}
}
