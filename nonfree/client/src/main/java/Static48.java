import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!pt;")
	public static Class197 aClass197_1;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!pc;")
	public static Class16 aClass16_1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIII)V")
	public static void method865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = arg1;
		@Pc(18) int local18 = arg2 * arg2;
		@Pc(22) int local22 = arg1 * arg1;
		@Pc(26) int local26 = local22 << 1;
		@Pc(30) int local30 = local18 << 1;
		@Pc(34) int local34 = arg1 << 1;
		@Pc(43) int local43 = local26 + local18 * (1 - local34);
		@Pc(51) int local51 = local22 - (local34 - 1) * local30;
		@Pc(55) int local55 = local18 << 2;
		@Pc(59) int local59 = local22 << 2;
		@Pc(67) int local67 = local26 * 3;
		@Pc(75) int local75 = local30 * ((arg1 << 1) - 3);
		@Pc(81) int local81 = local59;
		Static59.method1261(Static163.anIntArrayArray35[arg3], arg4 + arg2, -arg2 + arg4, arg0);
		@Pc(100) int local100 = (arg1 - 1) * local55;
		while (local14 > 0) {
			if (local43 < 0) {
				while (local43 < 0) {
					local51 += local81;
					local43 += local67;
					local12++;
					local67 += local59;
					local81 += local59;
				}
			}
			if (local51 < 0) {
				local43 += local67;
				local51 += local81;
				local67 += local59;
				local81 += local59;
				local12++;
			}
			local43 += -local100;
			local51 += -local75;
			local100 -= local55;
			local14--;
			local75 -= local55;
			@Pc(173) int local173 = arg3 - local14;
			@Pc(178) int local178 = arg3 + local14;
			@Pc(183) int local183 = arg4 + local12;
			@Pc(187) int local187 = arg4 - local12;
			Static59.method1261(Static163.anIntArrayArray35[local173], local183, local187, arg0);
			Static59.method1261(Static163.anIntArrayArray35[local178], local183, local187, arg0);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)V")
	public static void method870() {
		for (@Pc(10) int local10 = 0; local10 < Static427.aClass93ArrayArray3.length; local10++) {
			for (@Pc(13) int local13 = 0; local13 < Static427.aClass93ArrayArray3[local10].length; local13++) {
				Static427.aClass93ArrayArray3[local10][local13] = Static269.aClass93_1;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BZI)Lclient!du;")
	public static Class1_Sub14 method871(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class1_Sub14) Static314.aClass96_33.method2335(local17);
	}
}
