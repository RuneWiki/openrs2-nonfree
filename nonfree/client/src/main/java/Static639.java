import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static639 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "Lclient!cb;")
	public static Class50 aClass50_177;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "[I")
	public static final int[] anIntArray586 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)V")
	public static void method8465(@OriginalArg(0) int arg0) {
		if (Static175.anInt2881 == 0) {
			Static537.aClass5_Sub14_Sub4_35.method3245(arg0);
		} else {
			Static332.anInt6016 = arg0;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IBIIII)V")
	public static void method8466(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg4 * arg4;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local21 << 1;
		@Pc(37) int local37 = arg0 << 1;
		@Pc(46) int local46 = local29 + local21 * (1 - local37);
		@Pc(55) int local55 = local25 - local33 * (local37 - 1);
		@Pc(59) int local59 = local21 << 2;
		@Pc(63) int local63 = local25 << 2;
		@Pc(71) int local71 = local29 * 3;
		@Pc(79) int local79 = local33 * ((arg0 << 1) - 3);
		@Pc(85) int local85 = local63;
		@Pc(91) int local91 = (arg0 - 1) * local59;
		Static343.method5202(arg1 - arg4, Static286.anIntArrayArray42[arg3], arg2, arg4 + arg1);
		while (local17 > 0) {
			if (local46 < 0) {
				while (local46 < 0) {
					local46 += local71;
					local55 += local85;
					local71 += local63;
					local85 += local63;
					local15++;
				}
			}
			if (local55 < 0) {
				local55 += local85;
				local46 += local71;
				local85 += local63;
				local71 += local63;
				local15++;
			}
			local46 += -local91;
			local55 += -local79;
			local17--;
			local91 -= local59;
			local79 -= local59;
			@Pc(171) int local171 = arg3 - local17;
			@Pc(175) int local175 = local17 + arg3;
			@Pc(179) int local179 = local15 + arg1;
			@Pc(183) int local183 = arg1 - local15;
			Static343.method5202(local183, Static286.anIntArrayArray42[local171], arg2, local179);
			Static343.method5202(local183, Static286.anIntArrayArray42[local175], arg2, local179);
		}
	}
}
