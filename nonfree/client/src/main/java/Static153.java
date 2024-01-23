import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!od", name = "g", descriptor = "I")
	public static int anInt3385;

	@OriginalMember(owner = "client!od", name = "i", descriptor = "Lclient!df;")
	public static Class27 aClass27_7;

	@OriginalMember(owner = "client!od", name = "k", descriptor = "I")
	public static int anInt3387;

	@OriginalMember(owner = "client!od", name = "b", descriptor = "Lclient!sc;")
	public static Class107 aClass107_891 = Static231.method3737("cross");

	@OriginalMember(owner = "client!od", name = "d", descriptor = "Lclient!sc;")
	public static Class107 aClass107_892 = Static231.method3737("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!od", name = "f", descriptor = "Lclient!jd;")
	public static Class61 aClass61_59 = new Class61(50);

	@OriginalMember(owner = "client!od", name = "h", descriptor = "Z")
	public static boolean aBoolean296 = true;

	@OriginalMember(owner = "client!od", name = "j", descriptor = "I")
	public static int anInt3386 = -1;

	@OriginalMember(owner = "client!od", name = "l", descriptor = "Z")
	public static boolean aBoolean297 = false;

	@OriginalMember(owner = "client!od", name = "n", descriptor = "Lclient!sc;")
	private static Class107 aClass107_894 = Static231.method3737(" more options");

	@OriginalMember(owner = "client!od", name = "m", descriptor = "Lclient!sc;")
	public static Class107 aClass107_893 = aClass107_894;

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2508(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = 2048 - arg6 & 0x7FF;
		@Pc(16) int local16 = 2048 - arg0 & 0x7FF;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg5;
		@Pc(22) int local22 = 0;
		@Pc(28) int local28;
		@Pc(39) int local39;
		if (local16 != 0) {
			local28 = Class45.anIntArray159[local16];
			local22 = -arg5 * local28 >> 16;
			local39 = Class45.anIntArray156[local16];
			local20 = arg5 * local39 >> 16;
		}
		if (local9 != 0) {
			local39 = Class45.anIntArray156[local9];
			local28 = Class45.anIntArray159[local9];
			local18 = local28 * local20 >> 16;
			local20 = local39 * local20 >> 16;
		}
		Static69.anInt1578 = arg3 - local22;
		Static122.anInt2671 = arg6;
		Static29.anInt577 = arg1 - local20;
		Static6.anInt2981 = arg0;
		Static22.anInt435 = arg4 - local18;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)Z")
	public static boolean method2510(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!uc;Lclient!jb;Lclient!jb;I)V")
	public static void method2511(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2_Sub15_Sub1 arg1, @OriginalArg(2) Class28 arg2, @OriginalArg(3) Class28 arg3) {
		Static48.aClass28_21 = arg3;
		Static13.aBoolean29 = arg0;
		Static198.aClass28_69 = arg2;
		@Pc(15) int local15 = Static198.aClass28_69.method825() - 1;
		Static58.anInt1424 = Static198.aClass28_69.method832(local15) + local15 * 256;
		Static51.aClass1_Sub2_Sub15_Sub1_3 = arg1;
	}
}
