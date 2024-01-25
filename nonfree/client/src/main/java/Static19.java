import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static19 {

	@OriginalMember(owner = "client!al", name = "a", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!al", name = "c", descriptor = "I")
	public static int anInt418;

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)Z")
	public static boolean method522(@OriginalArg(0) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public static void method523(@OriginalArg(1) int arg0) {
		Static344.anInt7754 = arg0;
		Static424.aClass69_43.method1905();
	}
}
