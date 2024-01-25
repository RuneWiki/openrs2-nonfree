import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!je", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4;

	@OriginalMember(owner = "client!je", name = "j", descriptor = "I")
	public static int anInt2900;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "J")
	public static long aLong106 = 0L;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "Lclient!ll;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIBII)V")
	public static void method2369(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(18) int local18 = arg1 - arg4;
		@Pc(22) int local22 = arg0 - arg2;
		if (local22 == 0) {
			if (local18 != 0) {
				Static151.method2444(arg2, arg4, arg3, arg1);
			}
		} else if (local18 == 0) {
			Static276.method4631(arg0, arg3, arg4, arg2);
		} else {
			if (local18 < 0) {
				local18 = -local18;
			}
			if (local22 < 0) {
				local22 = -local22;
			}
			@Pc(72) boolean local72 = local18 > local22;
			@Pc(76) int local76;
			@Pc(80) int local80;
			if (local72) {
				local76 = arg2;
				arg2 = arg4;
				local80 = arg0;
				arg0 = arg1;
				arg4 = local76;
				arg1 = local80;
			}
			if (arg2 > arg0) {
				local76 = arg2;
				arg2 = arg0;
				local80 = arg4;
				arg0 = local76;
				arg4 = arg1;
				arg1 = local80;
			}
			local76 = arg4;
			local80 = arg0 - arg2;
			@Pc(113) int local113 = arg1 - arg4;
			@Pc(118) int local118 = -(local80 >> 1);
			@Pc(125) int local125 = arg4 < arg1 ? 1 : -1;
			if (local113 < 0) {
				local113 = -local113;
			}
			@Pc(137) int local137;
			if (local72) {
				for (local137 = arg2; local137 <= arg0; local137++) {
					local118 += local113;
					Static196.anIntArrayArray37[local137][local76] = arg3;
					if (local118 > 0) {
						local118 -= local80;
						local76 += local125;
					}
				}
			} else {
				for (local137 = arg2; local137 <= arg0; local137++) {
					local118 += local113;
					Static196.anIntArrayArray37[local76][local137] = arg3;
					if (local118 > 0) {
						local76 += local125;
						local118 -= local80;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IB)Lclient!hq;")
	public static Class3_Sub7_Sub8 method2371(@OriginalArg(0) int arg0) {
		@Pc(15) Class3_Sub7_Sub8 local15 = (Class3_Sub7_Sub8) Static215.aClass188_7.method5061((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(28) byte[] local28;
		if (arg0 < 32768) {
			local28 = Static221.aClass100_94.method2319(0, arg0);
		} else {
			local28 = Static320.aClass100_54.method2319(0, arg0 & 0x7FFF);
		}
		local15 = new Class3_Sub7_Sub8();
		if (local28 != null) {
			local15.method2141(new Class3_Sub4(local28));
		}
		if (arg0 >= 32768) {
			local15.method2136();
		}
		Static215.aClass188_7.method5063(local15, (long) arg0);
		return local15;
	}
}
