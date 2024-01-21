import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ff", name = "N", descriptor = "Lclient!ce;")
	public static Class5_Sub6 aClass5_Sub6_1;

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "Lclient!de;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!ff", name = "M", descriptor = "[I")
	public static final int[] anIntArray104 = new int[100];

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	public static int anInt1112 = 0;

	@OriginalMember(owner = "client!ff", name = "P", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_372 = Static161.method2452("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!ff", name = "Q", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_373 = Static161.method2452("k");

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIJ)Z")
	public static boolean method912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3) {
		@Pc(7) Class5_Sub3 local7 = Static157.aClass5_Sub3ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return false;
		} else if (local7.aClass86_1 != null && local7.aClass86_1.aLong190 == arg3) {
			return true;
		} else if (local7.aClass29_1 != null && local7.aClass29_1.aLong61 == arg3) {
			return true;
		} else if (local7.aClass73_1 != null && local7.aClass73_1.aLong154 == arg3) {
			return true;
		} else {
			for (@Pc(46) int local46 = 0; local46 < local7.anInt333; local46++) {
				if (local7.aClass43Array1[local46].aLong102 == arg3) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIIII)V")
	public static void method913(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static37.method1027(arg1)) {
			Static94.method1540(-1, arg5, arg0, arg3, Static155.aClass69ArrayArray1[arg1], arg6, arg4, arg2);
		}
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(II)Lclient!uf;")
	public static Class5_Sub2_Sub24 method914(@OriginalArg(1) int arg0) {
		@Pc(10) Class5_Sub2_Sub24 local10 = (Class5_Sub2_Sub24) Static106.aClass8_22.method227((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static191.aClass23_72.method738(arg0, 1);
		local10 = new Class5_Sub2_Sub24();
		if (local20 != null) {
			local10.method2906(arg0, new Class5_Sub6(local20));
		}
		Static106.aClass8_22.method232((long) arg0, local10);
		return local10;
	}
}
