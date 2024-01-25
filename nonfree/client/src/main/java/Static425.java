import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!paa", name = "ib", descriptor = "Lclient!nd;")
	public static Class238 aClass238_197;

	@OriginalMember(owner = "client!paa", name = "kb", descriptor = "Lclient!sq;")
	public static Class319 aClass319_4;

	@OriginalMember(owner = "client!paa", name = "mb", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!paa", name = "ab", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_159 = new Class200(65, 20);

	@OriginalMember(owner = "client!paa", name = "gb", descriptor = "Lclient!kg;")
	public static final Class200 aClass200_160 = new Class200(101, -1);

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIILclient!ha;IBILjava/lang/String;)V")
	public static void method6214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) String arg5) {
		if (Static432.aClass31_25 == null || Static132.aClass31_7 == null) {
			if (Static497.aClass238_223.method5568(Static558.anInt9219) && Static497.aClass238_223.method5568(Static551.anInt8858)) {
				Static432.aClass31_25 = arg2.method8141(Static654.method3455(Static497.aClass238_223, Static558.anInt9219, 0), true);
				@Pc(32) Class139 local32 = Static654.method3455(Static497.aClass238_223, Static551.anInt8858, 0);
				Static132.aClass31_7 = arg2.method8141(local32, true);
				local32.method3459();
				Static121.aClass31_6 = arg2.method8141(local32, true);
			} else {
				arg2.aa(arg1, arg4, arg0, 20, 255 - Static19.anInt418 << 24 | Static436.anInt7170, 1);
			}
		}
		if (Static432.aClass31_25 != null && Static132.aClass31_7 != null) {
			@Pc(75) int local75 = (arg0 - Static132.aClass31_7.method8801() * 2) / Static432.aClass31_25.method8801();
			for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
				Static432.aClass31_25.method8793(Static132.aClass31_7.method8801() + arg1 + local77 * Static432.aClass31_25.method8801(), arg4);
			}
			Static132.aClass31_7.method8793(arg1, arg4);
			Static121.aClass31_6.method8793(arg1 + arg0 - Static121.aClass31_6.method8801(), arg4);
		}
		Static544.aClass37_8.method6067(Static316.anInt5593 | 0xFF000000, arg5, -1, arg1 + 3, arg4 + 14);
		arg2.aa(arg1, arg4 + 20, arg0, arg3 - 20, Static436.anInt7170 | -Static19.anInt418 + 255 << 24, 1);
	}
}
