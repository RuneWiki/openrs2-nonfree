import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static472 {

	@OriginalMember(owner = "client!qa", name = "d", descriptor = "Lclient!d;")
	public static Interface7 anInterface7_10;

	// $FF: synthetic field
	@OriginalMember(owner = "client!qa", name = "j", descriptor = "Ljava/lang/Class;")
	private static Class aClass21;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public static boolean method6674(@OriginalArg(1) String arg0) {
		return Static90.method1405(arg0, aClass21 == null ? (aClass21 = Class296.a("cv")) : aClass21);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILclient!mj;II)V")
	public static void method6676(@OriginalArg(1) Class238 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static670.anInt6249 = arg2;
		Static260.anInt4664 = arg1;
		Static505.aClass238_14 = arg0;
	}
}
