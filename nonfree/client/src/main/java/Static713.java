import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static713 {

	@OriginalMember(owner = "client!wja", name = "p", descriptor = "I")
	public static int anInt11126;

	@OriginalMember(owner = "client!wja", name = "n", descriptor = "Lclient!jr;")
	public static Class194 aClass194_3;

	@OriginalMember(owner = "client!wja", name = "i", descriptor = "Lclient!wk;")
	public static Class3_Sub22_Sub5 aClass3_Sub22_Sub5_4;

	@OriginalMember(owner = "client!wja", name = "r", descriptor = "Lclient!vba;")
	public static Class3_Sub55 aClass3_Sub55_31;

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIII)I")
	public static int method9290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		}
		@Pc(14) int local14 = 128 - arg2;
		@Pc(28) int local28 = arg2 * (arg1 & 0x7F) + (arg0 & 0x7F) * local14 >> 7;
		@Pc(59) int local59 = local14 * (arg0 & 0x380) + (arg1 & 0x380) * arg2 >> 7;
		@Pc(73) int local73 = local14 * (arg0 & 0xFC00) + (arg1 & 0xFC00) * arg2 >> 7;
		return local59 & 0x380 | local73 & 0xFC00 | local28 & 0x7F;
	}

	@OriginalMember(owner = "client!wja", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method9291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg2 == arg5 && arg8 == arg3 && arg6 == arg4 && arg1 == arg7) {
			Static120.method2066(arg0, arg8, arg5, arg4, arg7);
			return;
		}
		@Pc(45) int local45 = arg5;
		@Pc(47) int local47 = arg8;
		@Pc(51) int local51 = arg5 * 3;
		@Pc(55) int local55 = arg8 * 3;
		@Pc(59) int local59 = arg2 * 3;
		@Pc(63) int local63 = arg3 * 3;
		@Pc(67) int local67 = arg6 * 3;
		@Pc(71) int local71 = arg1 * 3;
		@Pc(81) int local81 = local59 + arg4 - arg5 - local67;
		@Pc(90) int local90 = local63 + arg7 - local71 - arg8;
		@Pc(99) int local99 = local67 + local51 - local59 - local59;
		@Pc(110) int local110 = local71 + local55 - local63 - local63;
		@Pc(115) int local115 = local59 - local51;
		@Pc(119) int local119 = local63 - local55;
		for (@Pc(121) int local121 = 128; local121 <= 4096; local121 += 128) {
			@Pc(129) int local129 = local121 * local121 >> 12;
			@Pc(135) int local135 = local121 * local129 >> 12;
			@Pc(139) int local139 = local81 * local135;
			@Pc(143) int local143 = local90 * local135;
			@Pc(147) int local147 = local129 * local99;
			@Pc(151) int local151 = local110 * local129;
			@Pc(155) int local155 = local115 * local121;
			@Pc(159) int local159 = local119 * local121;
			@Pc(170) int local170 = (local139 + local147 + local155 >> 12) + arg5;
			@Pc(180) int local180 = arg8 + (local143 + local151 + local159 >> 12);
			Static120.method2066(arg0, local47, local45, local170, local180);
			local47 = local180;
			local45 = local170;
		}
	}
}
