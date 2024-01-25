import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "Lclient!lm;")
	public static Class134 aClass134_97;

	@OriginalMember(owner = "client!ni", name = "s", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray10;

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[5];

	@OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)Lclient!qa;")
	public static Class117 method3657() {
		try {
			return (Class117) Class.forName("Class117_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
	public static void method3658() {
		@Pc(9) Class37 local9 = Static109.aClass37_38;
		synchronized (Static109.aClass37_38) {
			Static109.aClass37_38.method919();
		}
	}
}
