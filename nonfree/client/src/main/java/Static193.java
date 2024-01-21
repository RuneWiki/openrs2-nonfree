import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!uc", name = "M", descriptor = "Lclient!nb;")
	public static Class66 aClass66_8;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1390 = Static151.method2243("Fallen lassen");

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1391 = Static151.method2243("underlay)3dat");

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1392 = Static151.method2243("mapscene");

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
	public static int anInt3996 = 2;

	@OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
	public static int anInt4004 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method2761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(BI)V")
	public static void method2762(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class2_Sub19 local6 = (Class2_Sub19) Static209.aClass58_15.method1709(); local6 != null; local6 = (Class2_Sub19) Static209.aClass58_15.method1705()) {
			if ((local6.aLong148 >> 48 & 0xFFFFL) == (long) arg0) {
				local6.method3183();
			}
		}
	}
}
