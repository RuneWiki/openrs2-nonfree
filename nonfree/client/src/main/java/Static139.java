import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ni", name = "q", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_2048 = Static193.method3027("Loading config )2 ");

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2049 = Static193.method3027("W-=hlen Sie eine Welt");

	@OriginalMember(owner = "client!ni", name = "v", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2050 = Static193.method3027("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!ni", name = "w", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_2051 = Static193.method3027("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
	public static int anInt4129 = 0;

	@OriginalMember(owner = "client!ni", name = "z", descriptor = "Lclient!oc;")
	public static Class70 aClass70_2052 = aClass70_2048;

	@OriginalMember(owner = "client!ni", name = "A", descriptor = "I")
	public static int anInt4130 = 0;

	@OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
	public static int anInt4131 = 0;

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V")
	public static void method3212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static208.aClass3_Sub3_Sub2_Sub2Array7[0].method2333(arg1, arg3);
		Static208.aClass3_Sub3_Sub2_Sub2Array7[1].method2333(arg1, arg2 + arg3 - 16);
		@Pc(27) int local27 = arg2 * (arg2 - 32) / arg4;
		if (local27 < 8) {
			local27 = 8;
		}
		@Pc(46) int local46 = arg0 * (arg2 - local27 - 32) / (arg4 - arg2);
		Static104.method3079(arg1, arg3 + 16, 16, arg2 - 32, Static79.anInt1593);
		Static104.method3079(arg1, local46 + arg3 + 16, 16, local27, Static45.anInt954);
		Static104.method3094(arg1, local46 + arg3 + 16, local27, Static142.anInt2892);
		Static104.method3094(arg1 + 1, local46 + arg3 + 16, local27, Static142.anInt2892);
		Static104.method3098(arg1, arg3 + local46 + 16, 16, Static142.anInt2892);
		Static104.method3098(arg1, arg3 + local46 + 17, 16, Static142.anInt2892);
		Static104.method3094(arg1 + 15, arg3 + 16 + local46, local27, Static126.anInt2493);
		Static104.method3094(arg1 + 14, local46 + (arg3 - -17), local27 - 1, Static126.anInt2493);
		Static104.method3098(arg1, arg3 + local46 + local27 + 15, 16, Static126.anInt2493);
		Static104.method3098(arg1 + 1, local27 + arg3 + 14 - -local46, 15, Static126.anInt2493);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)Z")
	public static boolean method3215(@OriginalArg(0) int arg0) {
		return arg0 == (-arg0 & arg0);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([[IB)V")
	public static void method3216(@OriginalArg(0) int[][] arg0) {
		Static157.anIntArrayArray24 = arg0;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(JI)V")
	public static void method3217(@OriginalArg(0) long arg0) {
		if ((long) 0 == arg0) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < Static61.anInt1297; local11++) {
			if (arg0 == Static183.aLongArray6[local11]) {
				Static61.anInt1297--;
				for (@Pc(32) int local32 = local11; local32 < Static61.anInt1297; local32++) {
					Static183.aLongArray6[local32] = Static183.aLongArray6[local32 + 1];
					Static160.aClass70Array58[local32] = Static160.aClass70Array58[local32 + 1];
				}
				Static33.anInt719 = Static86.anInt1703;
				Static93.aClass3_Sub4_Sub1_18.method1298(245);
				Static93.aClass3_Sub4_Sub1_18.method1250(arg0);
				return;
			}
		}
	}
}
