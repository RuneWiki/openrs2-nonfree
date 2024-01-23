import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "Lclient!nm;")
	public static Class119 aClass119_19;

	@OriginalMember(owner = "client!em", name = "d", descriptor = "Lclient!nm;")
	public static Class119 aClass119_20;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(B)Lclient!pi;")
	public static Class47 method1156() {
		try {
			return (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return null;
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(II)V")
	public static void method1157(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub5_Sub21 local8 = Static278.method4266(12, arg0);
		local8.method4064();
	}
}
