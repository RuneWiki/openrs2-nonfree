import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static486 {

	@OriginalMember(owner = "client!sg", name = "p", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_157 = new Class56(24, 6);

	@OriginalMember(owner = "client!sg", name = "t", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_87 = new Class303(73, 8);

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
	public static int anInt7950 = 0;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)Z")
	public static boolean method6608(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V")
	public static void method6610(@OriginalArg(0) int arg0) {
		Static500.method6746(arg0, Static544.aClass343_16.method7222(Static256.anInt4535));
	}
}
