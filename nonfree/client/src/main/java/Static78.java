import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
	public static int anInt1919;

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
	public static int anInt1921;

	@OriginalMember(owner = "client!ic", name = "n", descriptor = "Lclient!v;")
	public static final Class91 aClass91_6 = new Class91();

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "[I")
	public static final int[] anIntArray218 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1170 = Static118.method2249("Please enter your username)3");

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1171 = Static118.method2249("gr-Un:");

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1172 = aClass65_1170;

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
	public static int anInt1922 = 0;

	@OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
	public static volatile int anInt1923 = -1;

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!wa;I)Lclient!a;")
	public static Class1_Sub1 method1379(@OriginalArg(0) Class1_Sub14 arg0) {
		arg0.method1738();
		@Pc(13) int local13 = arg0.method1738();
		@Pc(17) Class1_Sub1 local17 = Static50.method917(local13);
		local17.anInt4454 = arg0.method1738();
		@Pc(28) int local28 = arg0.method1738();
		for (@Pc(30) int local30 = 0; local30 < local28; local30++) {
			@Pc(37) int local37 = arg0.method1738();
			local17.method3312(local37, arg0);
		}
		local17.method3301();
		return local17;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method1380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static173.method2925(arg1)) {
			Static36.aClass97Array1 = null;
			Static49.method849(arg3, arg0, Static99.aClass97ArrayArray1[arg1], -1, arg2, arg7, arg6, arg4, arg5);
			if (Static36.aClass97Array1 != null) {
				Static49.method849(arg3, arg0, Static36.aClass97Array1, -1412584499, arg2, arg7, arg6, Static167.anInt3777, Static73.anInt1796);
				Static36.aClass97Array1 = null;
			}
		} else if (arg3 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static197.aBooleanArray18[local15] = true;
			}
		} else {
			Static197.aBooleanArray18[arg3] = true;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!wd;I)Lclient!oc;")
	public static Class65 method1382(@OriginalArg(0) Class97 arg0) {
		if (Static106.method1970(Static153.method2677(arg0)) == 0) {
			return null;
		} else if (arg0.aClass65_2563 == null || arg0.aClass65_2563.method2466().method2482() == 0) {
			return Static8.aBoolean9 ? Static1.aClass65_2607 : null;
		} else {
			return arg0.aClass65_2563;
		}
	}
}
