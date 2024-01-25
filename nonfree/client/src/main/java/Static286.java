import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static286 {

	@OriginalMember(owner = "client!lw", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray22;

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "Lclient!rca;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "Lclient!ql;")
	public static Class1_Sub15_Sub1 aClass1_Sub15_Sub1_1;

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "I")
	public static int anInt5501 = 2;

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_83 = new Class252(71, 3);

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZIIZI)Lclient!dn;")
	public static Class69 method5044(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class90 local10 = null;
		if (Static45.aClass265_1 != null) {
			local10 = new Class90(arg1, Static45.aClass265_1, Static522.aClass265Array1[arg1], 1000000);
		}
		Static161.aClass235_Sub1Array1[arg1] = Static291.aClass172_1.method4732(local10, arg1, Static199.aClass90_2);
		if (arg0) {
			Static161.aClass235_Sub1Array1[arg1].method6227();
		}
		return new Class69(Static161.aClass235_Sub1Array1[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
	public static String method5045(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1, @OriginalArg(3) String arg2) {
		for (@Pc(9) int local9 = arg2.indexOf(arg0); local9 != -1; local9 = arg2.indexOf(arg0, arg1.length() + local9)) {
			arg2 = arg2.substring(0, local9) + arg1 + arg2.substring(local9 + arg0.length());
		}
		return arg2;
	}
}
