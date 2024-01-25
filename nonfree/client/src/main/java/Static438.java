import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static438 {

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_128 = new Class45(70, 10);

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIILclient!gi;II)Lclient!es;")
	public static Class79_Sub2_Sub1 method6663(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class42_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2.aBoolean288 || Static78.method1703(arg3) && Static78.method1703(arg4)) {
			return new Class79_Sub2_Sub1(arg2, 3553, arg1, arg0, arg3, arg4, true);
		} else if (arg2.aBoolean291) {
			return new Class79_Sub2_Sub1(arg2, 34037, arg1, arg0, arg3, arg4, true);
		} else {
			return new Class79_Sub2_Sub1(arg2, arg1, arg0, arg3, arg4, Static37.method6277(arg3), Static37.method6277(arg4), true);
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)Z")
	public static boolean method6664() {
		return Static8.anInt118 > 0;
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
	public static void method6666() {
		Static3.aClass125_1.method3440();
	}
}
