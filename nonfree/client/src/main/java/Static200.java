import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static200 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!nm;")
	public static Class119 aClass119_70;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!nm;)V")
	public static void method3417(@OriginalArg(0) Class119 arg0) {
		aClass119_70 = arg0;
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "()V")
	public static void method3418() {
		Static303.method4536();
	}
}
