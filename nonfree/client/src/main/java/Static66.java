import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_34 = new Class254(102, -1);

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
	public static int anInt1548 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)V")
	public static void method1373(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class6_Sub4_Sub6 local11 = Static68.method1408(16, arg0);
		local11.method3826();
		local11.anInt4403 = arg1;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method1374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class270 local13 = local7.aClass270_1; local13 != null; local13 = local13.aClass270_2) {
			@Pc(17) Class11_Sub1 local17 = local13.aClass11_Sub1_2;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort78 == arg1 && local17.aShort80 == arg2) {
				Static476.method7284(local17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIBI)I")
	public static int method1375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIBIII)V")
	public static void method1376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = arg1 + 1;
		Static115.method2332(arg2, arg4, arg0, Static183.anIntArrayArray26[arg1]);
		@Pc(21) int local21 = arg3 - 1;
		Static115.method2332(arg2, arg4, arg0, Static183.anIntArrayArray26[arg3]);
		for (@Pc(30) int local30 = local12; local30 <= local21; local30++) {
			@Pc(36) int[] local36 = Static183.anIntArrayArray26[local30];
			local36[arg2] = local36[arg4] = arg0;
		}
	}
}
