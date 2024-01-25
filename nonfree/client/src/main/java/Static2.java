import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aaa", name = "k", descriptor = "Lclient!cb;")
	public static Class50 aClass50_3;

	@OriginalMember(owner = "client!aaa", name = "s", descriptor = "I")
	public static int anInt22;

	@OriginalMember(owner = "client!aaa", name = "c", descriptor = "(I)Lclient!uja;")
	public static Class60 method35() {
		try {
			return (Class60) Class.forName("Class60_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class60_Sub2();
		}
	}

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(III)Z")
	public static boolean method38(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static156.method2375(arg1, arg0) | (arg1 & 0x60000) != 0 || Static93.method1446(arg1, arg0) || Static224.method3190(arg1, arg0);
	}
}
