import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lclient!ga;Z)V")
	public static void method3384(@OriginalArg(0) Class111 arg0) {
		Static428.anInt4964 = arg0.method2462("p11_full");
		Static474.anInt1074 = arg0.method2462("p12_full");
		Static178.anInt3195 = arg0.method2462("b12_full");
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)Z")
	public static boolean method3385() {
		return Static293.method4616("jaclib") ? Static293.method4616("hw3d") : false;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIBII)V")
	public static void method3386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 - arg1 >= Static487.anInt8210 && Static278.anInt5111 >= arg1 + arg0 && Static126.anInt6658 <= arg2 - arg1 && Static494.anInt8295 >= arg2 + arg1) {
			Static177.method1852(arg3, arg0, arg2, arg1);
		} else {
			Static579.method7774(arg1, arg0, arg2, arg3);
		}
	}
}
