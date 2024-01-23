import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!fe", name = "p", descriptor = "Lclient!pa;")
	public static Class86 aClass86_21;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "S")
	public static short aShort4 = 1;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "Lclient!hh;")
	public static Class50 aClass50_428 = Static186.method3527("blinken2:");

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(JI)V")
	public static void method917(@OriginalArg(0) long arg0) {
		if (arg0 != 0L) {
			Static32.aClass1_Sub17_Sub1_1.method2182(169);
			Static32.aClass1_Sub17_Sub1_1.method2171(arg0);
		}
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public static void method919() {
		Static42.aClass84_18.method2585();
		Static224.aClass84_6.method2585();
		Static1.aClass84_1.method2585();
		Static102.aClass84_21.method2585();
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIII)V")
	public static void method920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		Static107.method1641(arg0 - arg2, arg3, Static139.anIntArrayArray21[arg1], arg2 + arg0);
		@Pc(21) int local21 = arg4;
		@Pc(30) int local30 = arg2 * arg2;
		@Pc(34) int local34 = arg4 * arg4;
		@Pc(38) int local38 = local34 << 1;
		@Pc(42) int local42 = local30 << 1;
		@Pc(46) int local46 = arg4 << 1;
		@Pc(55) int local55 = local38 + local30 * (1 - local46);
		@Pc(63) int local63 = local34 - (local46 - 1) * local42;
		@Pc(67) int local67 = local30 << 2;
		@Pc(71) int local71 = local34 << 2;
		@Pc(79) int local79 = local38 * 3;
		@Pc(87) int local87 = local42 * ((arg4 << 1) - 3);
		@Pc(93) int local93 = local71;
		@Pc(99) int local99 = local67 * (arg4 - 1);
		while (local21 > 0) {
			if (local55 < 0) {
				while (local55 < 0) {
					local55 += local79;
					local63 += local93;
					local79 += local71;
					local93 += local71;
					local7++;
				}
			}
			local21--;
			if (local63 < 0) {
				local7++;
				local55 += local79;
				local63 += local93;
				local79 += local71;
				local93 += local71;
			}
			@Pc(152) int local152 = arg1 - local21;
			@Pc(156) int local156 = arg0 + local7;
			@Pc(161) int local161 = arg1 + local21;
			local55 += -local99;
			local63 += -local87;
			local99 -= local67;
			@Pc(180) int local180 = arg0 - local7;
			local87 -= local67;
			Static107.method1641(local180, arg3, Static139.anIntArrayArray21[local152], local156);
			Static107.method1641(local180, arg3, Static139.anIntArrayArray21[local161], local156);
		}
	}
}
