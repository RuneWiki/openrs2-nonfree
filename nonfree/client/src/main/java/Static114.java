import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array5;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1615 = Static118.method2249("Null");

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1620 = Static118.method2249("flash3:");

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1616 = aClass65_1620;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_1621 = Static118.method2249("Continue");

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1617 = aClass65_1621;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Lclient!oc;")
	public static Class65 aClass65_1618 = aClass65_1620;

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1619 = Static118.method2249("Fps:");

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1622 = Static118.method2249("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	public static int anInt2802 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIII)V")
	public static void method2107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(34) int local34 = local13 << 2;
		@Pc(38) int local38 = arg4 << 1;
		@Pc(46) int local46 = local17 - local25 * (local38 - 1);
		@Pc(50) int local50 = local17 << 2;
		@Pc(58) int local58 = local21 * 3;
		@Pc(66) int local66 = ((arg4 << 1) - 3) * local25;
		@Pc(72) int local72 = (arg4 - 1) * local34;
		@Pc(90) int local90;
		@Pc(99) int local99;
		if (arg2 >= Static206.anInt4385 && Static133.anInt3309 >= arg2) {
			local90 = Static100.method1896(Static23.anInt685, arg3 + arg0, Static71.anInt1744);
			local99 = Static100.method1896(Static23.anInt685, arg0 - arg3, Static71.anInt1744);
			Static51.method893(arg1, Static40.anIntArrayArray11[arg2], local90, local99);
		}
		@Pc(113) int local113 = local50;
		@Pc(122) int local122 = local21 + (1 - local38) * local13;
		while (local9 > 0) {
			if (local122 < 0) {
				while (local122 < 0) {
					local46 += local113;
					local122 += local58;
					local58 += local50;
					local113 += local50;
					local7++;
				}
			}
			if (local46 < 0) {
				local46 += local113;
				local122 += local58;
				local7++;
				local113 += local50;
				local58 += local50;
			}
			local46 += -local66;
			local122 += -local72;
			local72 -= local34;
			local66 -= local34;
			local9--;
			local99 = local9 + arg2;
			local90 = arg2 - local9;
			if (Static206.anInt4385 <= local99 && local90 <= Static133.anInt3309) {
				@Pc(222) int local222 = Static100.method1896(Static23.anInt685, local7 + arg0, Static71.anInt1744);
				@Pc(230) int local230 = Static100.method1896(Static23.anInt685, arg0 - local7, Static71.anInt1744);
				if (local90 >= Static206.anInt4385) {
					Static51.method893(arg1, Static40.anIntArrayArray11[local90], local222, local230);
				}
				if (Static133.anInt3309 >= local99) {
					Static51.method893(arg1, Static40.anIntArrayArray11[local99], local222, local230);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)Lclient!ga;")
	public static Class1_Sub2_Sub11 method2108(@OriginalArg(1) int arg0) {
		@Pc(11) Class1_Sub2_Sub11 local11 = (Class1_Sub2_Sub11) Static52.aClass87_27.method3062((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(29) byte[] local29 = Static16.aClass60_2.method2340(Static80.method1413(arg0), Static154.method2694(arg0));
		local11 = new Class1_Sub2_Sub11();
		local11.anInt1599 = arg0;
		if (local29 != null) {
			local11.method1079(new Class1_Sub14(local29));
		}
		local11.method1074();
		Static52.aClass87_27.method3068(local11, (long) arg0);
		return local11;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILclient!w;I)V")
	public static void method2109(@OriginalArg(1) Class6_Sub4 arg0, @OriginalArg(2) int arg1) {
		Static55.method972(arg0.anInt3976, arg0.anInt3934, arg1);
	}
}
