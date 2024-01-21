import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ub", name = "pb", descriptor = "[I")
	public static int[] anIntArray337;

	@OriginalMember(owner = "client!ub", name = "wb", descriptor = "Lclient!ec;")
	public static Class2_Sub8_Sub1 aClass2_Sub8_Sub1_2;

	@OriginalMember(owner = "client!ub", name = "yb", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
	public static int anInt3642 = 0;

	@OriginalMember(owner = "client!ub", name = "hb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2160 = Static107.method1838("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!ub", name = "ib", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2161 = Static107.method1838("Your account is already logged in)3");

	@OriginalMember(owner = "client!ub", name = "jb", descriptor = "Lclient!gg;")
	private static Class28 aClass28_2162 = Static107.method1838("The server is being updated)3");

	@OriginalMember(owner = "client!ub", name = "lb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2163 = aClass28_2161;

	@OriginalMember(owner = "client!ub", name = "ob", descriptor = "I")
	public static int anInt3645 = 0;

	@OriginalMember(owner = "client!ub", name = "qb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2164 = aClass28_2162;

	@OriginalMember(owner = "client!ub", name = "rb", descriptor = "I")
	public static int anInt3646 = 0;

	@OriginalMember(owner = "client!ub", name = "sb", descriptor = "I")
	public static int anInt3647 = 0;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(B[BIIII[Lclient!ie;)V")
	public static void method2547(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class36[] arg5) {
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 64; local7++) {
				for (@Pc(11) int local11 = 0; local11 < 64; local11++) {
					if (arg3 + local7 > 0 && arg3 + local7 < 103 && local11 + arg1 > 0 && local11 + arg1 < 103) {
						arg5[local3].anIntArrayArray15[arg3 + local7][local11 + arg1] &= 0xFEFFFFFF;
					}
				}
			}
		}
		@Pc(95) Class2_Sub2 local95 = new Class2_Sub2(arg0);
		for (@Pc(97) int local97 = 0; local97 < 4; local97++) {
			for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
				for (@Pc(105) int local105 = 0; local105 < 64; local105++) {
					Static39.method720(local105 + arg1, 0, arg4, arg2, local97, arg3 + local101, local95);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "(B)V")
	public static void method2548() {
		aClass28_2163 = null;
		aClass28_2162 = null;
		aClass28_2164 = null;
		aClass2_Sub8_Sub1_2 = null;
		anIntArray337 = null;
		aClass28_2160 = null;
		aClass28_2161 = null;
		anIntArray338 = null;
	}
}
