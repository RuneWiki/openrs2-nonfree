import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!caa", name = "e", descriptor = "Z")
	public static boolean aBoolean106 = true;

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IILclient!qa;IBLclient!cn;)V")
	public static void method1400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class51 arg4) {
		@Pc(17) Class318 local17 = Static152.aClass160_1.method4292(arg4.anInt1614);
		if (local17.anInt9444 == -1) {
			return;
		}
		if (arg4.aBoolean135) {
			@Pc(34) int local34 = arg1 + arg4.anInt1613;
			arg1 = local34 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(46) Class104 local46 = local17.method8138(arg4.aBoolean142, arg2, arg1);
		if (local46 == null) {
			return;
		}
		@Pc(52) int local52 = arg4.anInt1636;
		@Pc(55) int local55 = arg4.anInt1615;
		if ((arg1 & 0x1) == 1) {
			local55 = arg4.anInt1636;
			local52 = arg4.anInt1615;
		}
		@Pc(69) int local69 = local46.EA();
		@Pc(72) int local72 = local46.ma();
		if (local17.aBoolean704) {
			local72 = local55 * 4;
			local69 = local52 * 4;
		}
		if (local17.anInt9445 == 0) {
			local46.method7707(arg3, arg0 + 4 - local55 * 4, local69, local72);
		} else {
			local46.ra(arg3, arg0 - (local55 - 1) * 4, local69, local72, 0, local17.anInt9445 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)Z")
	public static boolean method1401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x580) != 0;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIII)I")
	public static int method1403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static379.aByteArrayArrayArray13[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static379.aByteArrayArrayArray13[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}
}
