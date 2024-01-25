import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString10 = null;

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_29 = new Class303(14, -1);

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_30 = new Class303(62, 8);

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_31 = new Class303(3, 7);

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIIIZZZ)V")
	public static void method1896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg1) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) Class119_Sub1 local21 = Static563.aClass119_Sub1Array2[local15];
		Static563.aClass119_Sub1Array2[local15] = Static563.aClass119_Sub1Array2[arg3];
		Static563.aClass119_Sub1Array2[arg3] = local21;
		for (@Pc(33) int local33 = arg1; local33 < arg3; local33++) {
			if (Static478.method6560(arg4, arg5, Static563.aClass119_Sub1Array2[local33], local21, arg0, arg2) <= 0) {
				@Pc(53) Class119_Sub1 local53 = Static563.aClass119_Sub1Array2[local33];
				Static563.aClass119_Sub1Array2[local33] = Static563.aClass119_Sub1Array2[local17];
				Static563.aClass119_Sub1Array2[local17++] = local53;
			}
		}
		Static563.aClass119_Sub1Array2[arg3] = Static563.aClass119_Sub1Array2[local17];
		Static563.aClass119_Sub1Array2[local17] = local21;
		method1896(arg0, arg1, arg2, local17 - 1, arg4, arg5);
		method1896(arg0, local17 + 1, arg2, arg3, arg4, arg5);
	}
}
