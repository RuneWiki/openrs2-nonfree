import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!nc", name = "Ac", descriptor = "I")
	public static int anInt3567;

	@OriginalMember(owner = "client!nc", name = "Sc", descriptor = "Lclient!rn;")
	public static Class155 aClass155_80;

	@OriginalMember(owner = "client!nc", name = "id", descriptor = "Ljava/lang/String;")
	public static String aString126 = "Examine";

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(II)V")
	public static void method3042() {
		Static188.aClass98_30.method2565(50);
		Static132.aClass98_16.method2565(50);
		Static3.aClass98_1.method2565(50);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!rn;I)Lclient!qn;")
	public static Class3_Sub4_Sub12_Sub2 method3044(@OriginalArg(1) int arg0, @OriginalArg(2) Class155 arg1) {
		return Static115.method1878(0, arg1, arg0) ? Static223.method3634() : null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method3048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class3_Sub25 local7 = Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass19_1 != null && local7.aClass19_1.aLong20 == arg3) {
			return true;
		} else if (local7.aClass95_1 != null && local7.aClass95_1.aLong124 == arg3) {
			return true;
		} else if (local7.aClass13_1 != null && local7.aClass13_1.aLong15 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt4483; local46++) {
				if (local7.aClass85Array3[local46].aLong107 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V")
	public static void method3050(@OriginalArg(1) int arg0) {
		Static300.anInt5934 = arg0;
		Static157.anInt2942 = 100;
		Static135.anInt2616 = 3;
		Static257.anInt5294 = -1;
	}
}
