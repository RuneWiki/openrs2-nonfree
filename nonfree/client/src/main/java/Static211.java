import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!wh", name = "K", descriptor = "I")
	public static int anInt4670 = 0;

	@OriginalMember(owner = "client!wh", name = "P", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1326 = Static81.method1507(" loggt sich aus)3");

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(II)V")
	public static void method3557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class1_Sub8 local28 = Static29.aClass1_Sub8ArrayArrayArray1[local9][arg0][arg1] = Static29.aClass1_Sub8ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt1549--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt1550; local38++) {
					@Pc(44) Class51 local44 = local28.aClass51Array1[local38];
					if ((local44.aLong68 >> 29 & 0x3L) == 2L && local44.anInt2213 == arg0 && local44.anInt2218 == arg1) {
						local44.anInt2217--;
					}
				}
			}
		}
		if (Static29.aClass1_Sub8ArrayArrayArray1[0][arg0][arg1] == null) {
			Static29.aClass1_Sub8ArrayArrayArray1[0][arg0][arg1] = new Class1_Sub8(0, arg0, arg1);
		}
		Static29.aClass1_Sub8ArrayArrayArray1[0][arg0][arg1].aClass1_Sub8_1 = local7;
		Static29.aClass1_Sub8ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg7 && arg1 == arg8 && arg0 == arg3 && arg2 == arg5) {
			Static68.method1337(arg8, arg3, arg6, arg4, arg2);
			return;
		}
		@Pc(32) int local32 = arg4;
		@Pc(34) int local34 = arg8;
		@Pc(38) int local38 = arg4 * 3;
		@Pc(42) int local42 = arg8 * 3;
		@Pc(46) int local46 = arg7 * 3;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(67) int local67 = arg2 + local50 - local58 - arg8;
		@Pc(77) int local77 = local42 + local58 - local50 - local50;
		@Pc(86) int local86 = local54 + local38 - local46 - local46;
		@Pc(91) int local91 = local46 - local38;
		@Pc(100) int local100 = local46 + arg3 - local54 - arg4;
		@Pc(105) int local105 = local50 - local42;
		for (@Pc(107) int local107 = 128; local107 <= 4096; local107 += 128) {
			@Pc(115) int local115 = local107 * local107 >> 12;
			@Pc(121) int local121 = local107 * local115 >> 12;
			@Pc(125) int local125 = local121 * local100;
			@Pc(129) int local129 = local67 * local121;
			@Pc(133) int local133 = local86 * local115;
			@Pc(137) int local137 = local77 * local115;
			@Pc(141) int local141 = local107 * local91;
			@Pc(145) int local145 = local105 * local107;
			@Pc(157) int local157 = arg4 + (local141 + local125 + local133 >> 12);
			@Pc(168) int local168 = (local137 + local129 + local145 >> 12) + arg8;
			Static68.method1337(local34, local157, arg6, local32, local168);
			local32 = local157;
			local34 = local168;
		}
	}
}
