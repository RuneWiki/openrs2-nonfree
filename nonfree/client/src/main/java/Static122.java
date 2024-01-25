import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!f", name = "d", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "Lclient!fr;")
	public static final Class93 aClass93_1 = Static95.method2182();

	@OriginalMember(owner = "client!f", name = "h", descriptor = "Z")
	public static boolean aBoolean190 = false;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)V")
	public static void method2699(@OriginalArg(1) int arg0) {
		Static41.anInt1359 = 2;
		Static15.anInt836 = arg0;
		if (Static150.aString23 == null) {
			Static110.method2414(35);
		} else {
			@Pc(20) Class1_Sub13 local20 = new Class1_Sub13(Static317.method5199(Static290.method5949(Static150.aString23)));
			@Pc(24) long local24 = local20.method3015();
			Static265.aLong134 = local20.method3015();
			Static54.method3635(Static433.method6988(local24), true, "");
		}
	}
}
