import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static169 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_22;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "Lclient!tg;")
	public static Class3_Sub19_Sub3 aClass3_Sub19_Sub3_2;

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1633 = Static193.method3027("::rect_debug");

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1634 = Static193.method3027(" <col=ffff00>");

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1635 = Static193.method3027("::fpson");

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_1636 = Static193.method3027("M");

	@OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
	public static final int anInt3432 = 0;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
	public static int method2553(@OriginalArg(0) int arg0) {
		return arg0 >>> 10;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class3_Sub6 local7 = Static118.aClass3_Sub6ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass36_1 != null && local7.aClass36_1.aLong37 == arg3) {
			return true;
		} else if (local7.aClass83_1 != null && local7.aClass83_1.aLong111 == arg3) {
			return true;
		} else if (local7.aClass64_1 != null && local7.aClass64_1.aLong78 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt827; local46++) {
				if (local7.aClass99Array1[local46].aLong144 == arg3) {
					return true;
				}
			}
			return false;
		}
	}
}
