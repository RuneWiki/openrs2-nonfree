import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cr", name = "h", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_29 = new Class73(11, 28);

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IZ)V")
	public static void method2189(@OriginalArg(1) boolean arg0) {
		Static644.method8780(Static294.anInt6026, Static30.anInt830, arg0, Static277.anInt5899);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)V")
	public static void method2190() {
		Static14.method545();
		Static245.method4396();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	public static void method2191(@OriginalArg(0) int arg0) {
		@Pc(8) Class6_Sub5_Sub19 local8 = Static348.method5721(arg0, 16);
		local8.method5174();
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(BI)V")
	public static void method2192(@OriginalArg(1) int arg0) {
		Static591.anInt9999 = 3;
		Static502.anInt7199 = 100;
		Static246.anInt5375 = arg0;
		Static451.anInt9272 = -1;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIII)V")
	public static void method2194(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(25) int local25 = arg0 * arg0;
		@Pc(29) int local29 = local25 << 1;
		@Pc(33) int local33 = local13 << 1;
		@Pc(37) int local37 = arg0 << 1;
		@Pc(47) int local47 = local13 * (1 - local37) + local29;
		@Pc(55) int local55 = local25 - local33 * (local37 - 1);
		@Pc(59) int local59 = local13 << 2;
		@Pc(63) int local63 = local25 << 2;
		@Pc(71) int local71 = local29 * 3;
		@Pc(79) int local79 = local33 * ((arg0 << 1) - 3);
		@Pc(85) int local85 = local63;
		@Pc(103) int local103;
		@Pc(112) int local112;
		if (Static633.anInt10644 <= arg3 && Static389.anInt7300 >= arg3) {
			local103 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg1 + arg2);
			local112 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg1 - arg2);
			Static571.method7990(arg4, Static173.anIntArrayArray15[arg3], local112, local103);
		}
		@Pc(126) int local126 = (arg0 - 1) * local59;
		while (local9 > 0) {
			if (local47 < 0) {
				while (local47 < 0) {
					local55 += local85;
					local47 += local71;
					local71 += local63;
					local7++;
					local85 += local63;
				}
			}
			if (local55 < 0) {
				local55 += local85;
				local47 += local71;
				local71 += local63;
				local7++;
				local85 += local63;
			}
			local47 += -local126;
			local55 += -local79;
			local126 -= local59;
			local79 -= local59;
			local9--;
			local103 = arg3 - local9;
			local112 = local9 + arg3;
			if (local112 >= Static633.anInt10644 && local103 <= Static389.anInt7300) {
				@Pc(222) int local222 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg1 + local7);
				@Pc(231) int local231 = Static465.method6957(Static7.anInt464, Static309.anInt6227, arg1 - local7);
				if (local103 >= Static633.anInt10644) {
					Static571.method7990(arg4, Static173.anIntArrayArray15[local103], local231, local222);
				}
				if (Static389.anInt7300 >= local112) {
					Static571.method7990(arg4, Static173.anIntArrayArray15[local112], local231, local222);
				}
			}
		}
	}
}
