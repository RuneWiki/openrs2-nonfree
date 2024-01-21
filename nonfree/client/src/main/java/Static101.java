import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!lf", name = "U", descriptor = "[[I")
	public static int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!lf", name = "S", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_929 = Static177.method3050("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!lf", name = "T", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_930 = Static177.method3050(" <col=ffffff>");

	@OriginalMember(owner = "client!lf", name = "V", descriptor = "I")
	public static int anInt2575 = 0;

	@OriginalMember(owner = "client!lf", name = "X", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_931 = Static177.method3050("(U");

	@OriginalMember(owner = "client!lf", name = "Y", descriptor = "Lclient!jd;")
	public static Class46 aClass46_932 = null;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIILclient!tg;IJZ)Z")
	public static boolean method1950(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class4_Sub1_Sub1 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static106.method2001(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BILclient!nh;)Lclient!sc;")
	public static Class4_Sub1_Sub7_Sub3 method1951(@OriginalArg(1) int arg0, @OriginalArg(2) Class62 arg1) {
		return Static178.method3063(arg0, arg1) ? Static56.method2456() : null;
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(JB)Lclient!jd;")
	public static Class46 method1952(@OriginalArg(0) long arg0) {
		return Static18.method331(arg0);
	}
}
