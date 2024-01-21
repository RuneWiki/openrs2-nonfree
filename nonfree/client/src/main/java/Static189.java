import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "Lclient!ja;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!ub", name = "ab", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_1872 = Static193.method3027("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1873 = Static193.method3027("<col=00ff80>");

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "Lclient!oc;")
	public static Class70 aClass70_1874 = aClass70_1872;

	@OriginalMember(owner = "client!ub", name = "jb", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1875 = Static193.method3027("mod_icons");

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(BII)I")
	public static int method2974(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local7 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local7;
		} else {
			return local7;
		}
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIIII)V")
	public static void method2975(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static119.anInt2428 <= arg2 - arg0 && Static200.anInt4074 >= arg0 + arg2 && arg3 - arg0 >= Static26.anInt554 && arg3 + arg0 <= Static52.anInt1117) {
			Static163.method2439(arg2, arg1, arg3, arg0);
		} else {
			Static17.method307(arg1, arg0, arg3, arg2);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLclient!ke;Lclient!ke;)V")
	public static void method2976(@OriginalArg(1) Class52 arg0, @OriginalArg(2) Class52 arg1) {
		Static123.aClass52_29 = arg1;
		Static14.aClass52_4 = arg0;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I")
	public static int method2977() {
		return 6;
	}
}
