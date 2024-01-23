import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!qo", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString245 = "Loading config - ";

	@OriginalMember(owner = "client!qo", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString246 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!qo", name = "Y", descriptor = "I")
	public static int anInt4319 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method3671(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 >= Static29.anInt517 && Static11.anInt170 >= arg7 && Static29.anInt517 <= arg8 && arg8 <= Static11.anInt170 && arg3 >= Static29.anInt517 && arg3 <= Static11.anInt170 && arg0 >= Static29.anInt517 && Static11.anInt170 >= arg0 && Static98.anInt2007 <= arg5 && arg5 <= Static213.anInt4452 && Static98.anInt2007 <= arg2 && arg2 <= Static213.anInt4452 && Static98.anInt2007 <= arg1 && Static213.anInt4452 >= arg1 && arg6 >= Static98.anInt2007 && arg6 <= Static213.anInt4452) {
			Static245.method3876(arg5, arg3, arg6, arg8, arg7, arg2, arg0, arg1, arg4);
		} else {
			Static252.method3972(arg8, arg0, arg1, arg5, arg4, arg2, arg7, arg6, arg3);
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!lf;)Lclient!tl;")
	public static Class172 method3672(@OriginalArg(1) Class1_Sub14 arg0) {
		@Pc(7) Class172 local7 = new Class172();
		local7.anInt4960 = arg0.method1386();
		local7.aClass1_Sub2_Sub7_1 = Static235.method4486(local7.anInt4960);
		return local7;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZII)I")
	public static int method3673(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return 7 - arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!gi;I)V")
	public static void method3674(@OriginalArg(1) Class15_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt5564 > Static313.anInt2966) {
			Static294.method4480(arg0);
		} else if (arg0.anInt5571 >= Static313.anInt2966) {
			Static5.method34(arg0);
		} else {
			Static293.method4478(arg0);
		}
		if (arg0.anInt5559 < 128 || arg0.anInt5557 < 128 || arg0.anInt5559 >= 13184 || arg0.anInt5557 >= 13184) {
			arg0.anInt5571 = 0;
			arg0.anInt5510 = -1;
			arg0.anInt5564 = 0;
			arg0.anInt5594 = -1;
			arg0.anInt5559 = arg0.anIntArray501[0] * 128 + arg0.method4702() * 64;
			arg0.anInt5557 = arg0.anIntArray504[0] * 128 + arg0.method4702() * 64;
			arg0.method4701();
		}
		if (Static90.aClass15_Sub5_Sub2_2 == arg0 && (arg0.anInt5559 < 1536 || arg0.anInt5557 < 1536 || arg0.anInt5559 >= 11776 || arg0.anInt5557 >= 11776)) {
			arg0.anInt5564 = 0;
			arg0.anInt5594 = -1;
			arg0.anInt5510 = -1;
			arg0.anInt5571 = 0;
			arg0.anInt5559 = arg0.anIntArray501[0] * 128 + arg0.method4702() * 64;
			arg0.anInt5557 = arg0.anIntArray504[0] * 128 + arg0.method4702() * 64;
			arg0.method4701();
		}
		Static263.method4151(arg0);
		Static22.method367(arg0);
	}
}
