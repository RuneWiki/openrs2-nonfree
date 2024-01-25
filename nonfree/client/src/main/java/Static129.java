import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "[I")
	public static int[] anIntArray375;

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt2828;

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
	public static int anInt2829;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
	public static int anInt2832;

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
	public static int anInt2833;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
	public static int anInt2826 = 0;

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "Lclient!fi;")
	public static final Class74 aClass74_19 = new Class74();

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIBII)V")
	public static void method2631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(55) int local55 = local13 << 2;
		@Pc(59) int local59 = local17 << 2;
		@Pc(67) int local67 = local21 * 3;
		@Pc(75) int local75 = ((arg3 << 1) - 3) * local25;
		@Pc(81) int local81 = local59;
		@Pc(87) int local87 = local55 * (arg3 - 1);
		@Pc(105) int local105;
		@Pc(114) int local114;
		if (Static142.anInt3103 <= arg0 && arg0 <= Static314.anInt6030) {
			local105 = Static270.method4496(Static168.anInt3509, arg4 + arg2, Static61.anInt1534);
			local114 = Static270.method4496(Static168.anInt3509, arg2 - arg4, Static61.anInt1534);
			Static282.method4681(arg1, local114, Static323.anIntArrayArray55[arg0], local105);
		}
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local67;
					local46 += local81;
					local81 += local59;
					local67 += local59;
					local7++;
				}
			}
			if (local46 < 0) {
				local38 += local67;
				local46 += local81;
				local7++;
				local67 += local59;
				local81 += local59;
			}
			local46 += -local75;
			local38 += -local87;
			local75 -= local55;
			local9--;
			local87 -= local55;
			local105 = arg0 - local9;
			local114 = local9 + arg0;
			if (local114 >= Static142.anInt3103 && local105 <= Static314.anInt6030) {
				@Pc(222) int local222 = Static270.method4496(Static168.anInt3509, arg2 + local7, Static61.anInt1534);
				@Pc(231) int local231 = Static270.method4496(Static168.anInt3509, arg2 - local7, Static61.anInt1534);
				if (Static142.anInt3103 <= local105) {
					Static282.method4681(arg1, local231, Static323.anIntArrayArray55[local105], local222);
				}
				if (local114 <= Static314.anInt6030) {
					Static282.method4681(arg1, local231, Static323.anIntArrayArray55[local114], local222);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
	public static void method2632(@OriginalArg(0) int arg0) {
		@Pc(13) Class7_Sub1_Sub15 local13 = Static315.method5104(14, arg0);
		local13.method4788();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IJ)V")
	public static void method2634(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static213.method3778(arg0 - 1L);
			Static213.method3778(1L);
		} else {
			Static213.method3778(arg0);
		}
	}
}
