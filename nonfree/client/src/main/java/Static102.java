import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
	public static int anInt2210;

	@OriginalMember(owner = "client!kd", name = "eb", descriptor = "Lclient!ab;")
	public static Class3 aClass3_18;

	@OriginalMember(owner = "client!kd", name = "V", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_988 = Static187.method3089(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!kd", name = "Y", descriptor = "I")
	public static int anInt2207 = 0;

	@OriginalMember(owner = "client!kd", name = "gb", descriptor = "[J")
	public static final long[] aLongArray6 = new long[32];

	@OriginalMember(owner = "client!kd", name = "hb", descriptor = "I")
	public static int anInt2214 = 0;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static24.method463(arg6)) {
			Static152.aClass11Array2 = null;
			Static149.method2261(arg2, -1, arg1, arg4, Static194.aClass11ArrayArray1[arg6], arg3, arg0, arg5, arg7);
			if (Static152.aClass11Array2 != null) {
				Static149.method2261(Static33.anInt803, -1412584499, arg1, arg4, Static152.aClass11Array2, arg3, arg0, Static28.anInt640, arg7);
				Static152.aClass11Array2 = null;
			}
		} else if (arg1 == -1) {
			for (@Pc(30) int local30 = 0; local30 < 100; local30++) {
				Static84.aBooleanArray5[local30] = true;
			}
		} else {
			Static84.aBooleanArray5[arg1] = true;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIILclient!fj;I)V")
	public static void method1547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub3_Sub5 arg4) {
		@Pc(7) Class1_Sub19 local7 = new Class1_Sub19();
		local7.anInt2646 = arg4.anInt1419 * 128;
		local7.anInt2654 = arg4.anInt1401;
		local7.anInt2647 = arg4.anInt1421;
		local7.anInt2649 = arg1 * 128;
		local7.anIntArray203 = arg4.anIntArray118;
		local7.anInt2651 = arg2;
		local7.anInt2645 = arg4.anInt1422;
		local7.anInt2655 = arg0 * 128;
		@Pc(49) int local49 = arg4.anInt1408;
		@Pc(52) int local52 = arg4.anInt1399;
		if (arg3 == 1 || arg3 == 3) {
			local49 = arg4.anInt1399;
			local52 = arg4.anInt1408;
		}
		local7.anInt2644 = (arg1 + local52) * 128;
		local7.anInt2650 = (arg0 + local49) * 128;
		if (arg4.anIntArray116 != null) {
			local7.aClass1_Sub3_Sub5_1 = arg4;
			local7.method1862();
		}
		Static49.aClass20_3.method466(local7);
		if (local7.anIntArray203 != null) {
			local7.anInt2656 = (int) (Math.random() * (double) (local7.anInt2647 - local7.anInt2645)) + local7.anInt2645;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)Lclient!vd;")
	public static Class92 method1548(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static208.method787(new Class92[] { Static186.aClass92_1898, Static49.method872(arg0), Static159.aClass92_1616 });
		} else if (arg0 < 10000000) {
			return Static208.method787(new Class92[] { Static173.aClass92_1764, Static49.method872(arg0 / 1000), Static19.aClass92_213, Static159.aClass92_1616 });
		} else {
			return Static208.method787(new Class92[] { Static131.aClass92_1311, Static49.method872(arg0 / 1000000), Static45.aClass92_485, Static159.aClass92_1616 });
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)Lclient!tf;")
	public static Class1_Sub3_Sub22 method1549(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub22 local10 = (Class1_Sub3_Sub22) Static16.aClass47_6.method1281((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static73.aClass3_12.method3265(Static24.method459(arg0), Static61.method996(arg0));
		local10 = new Class1_Sub3_Sub22();
		local10.anInt3864 = arg0;
		if (local24 != null) {
			local10.method2932(new Class1_Sub14(local24));
		}
		local10.method2934();
		if (local10.anInt3870 != -1) {
			local10.method2936(method1549(local10.anInt3873), method1549(local10.anInt3870));
		}
		if (local10.anInt3884 != -1) {
			local10.method2926(method1549(local10.anInt3888), method1549(local10.anInt3884));
		}
		if (!Static202.aBoolean240 && local10.aBoolean219) {
			local10.anInt3891 = 0;
			local10.aClass92Array25 = null;
			local10.aBoolean220 = false;
			local10.aClass92Array26 = null;
			local10.aClass92_1846 = Static189.aClass92_1933;
		}
		Static16.aClass47_6.method1273((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(II)Lclient!vd;")
	public static Class92 method1550(@OriginalArg(0) int arg0) {
		return Static208.method787(new Class92[] { Static49.method872(arg0 >> 24 & 0xFF), Static84.aClass92_777, Static49.method872(arg0 >> 16 & 0xFF), Static84.aClass92_777, Static49.method872(arg0 >> 8 & 0xFF), Static84.aClass92_777, Static49.method872(arg0 & 0xFF) });
	}
}
