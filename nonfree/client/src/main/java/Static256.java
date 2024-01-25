import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static256 {

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray15;

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
	public static int anInt5056;

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString51;

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_73 = new Class274(23, -1);

	@OriginalMember(owner = "client!jca", name = "d", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_74 = new Class274(53, 7);

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lclient!oea;[II[III)Lclient!mm;")
	public static Class1_Sub3 method4211(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		@Pc(15) byte[] local15 = new byte[arg2 * arg4];
		for (@Pc(17) int local17 = 0; local17 < arg4; local17++) {
			@Pc(27) int local27 = arg1[local17] + arg2 * local17;
			for (@Pc(29) int local29 = 0; local29 < arg3[local17]; local29++) {
				local15[local27++] = -1;
			}
		}
		return new Class1_Sub3(arg0, arg2, arg4, local15);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
	public static void method4212() throws Exception_Sub1 {
		if (Static244.anInt4841 == 1) {
			Static167.aClass87_3.method7907(Static134.anInt3047, Static183.anInt4032);
		} else {
			Static167.aClass87_3.method7907(0, 0);
		}
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIBIIIII)V")
	public static void method4214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg0 && arg5 == arg6 && arg7 == arg2 && arg4 == arg8) {
			Static385.method5798(arg4, arg6, arg3, arg2, arg1);
			return;
		}
		@Pc(28) int local28 = arg1;
		@Pc(30) int local30 = arg6;
		@Pc(34) int local34 = arg1 * 3;
		@Pc(38) int local38 = arg6 * 3;
		@Pc(42) int local42 = arg0 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg7 * 3;
		@Pc(54) int local54 = arg8 * 3;
		@Pc(64) int local64 = local42 + arg2 - local50 - arg1;
		@Pc(74) int local74 = arg4 + local46 - local54 - arg6;
		@Pc(84) int local84 = local50 + local34 - local42 - local42;
		@Pc(94) int local94 = local38 + local54 - local46 - local46;
		@Pc(99) int local99 = local42 - local34;
		@Pc(103) int local103 = local46 - local38;
		for (@Pc(105) int local105 = 128; local105 <= 4096; local105 += 128) {
			@Pc(113) int local113 = local105 * local105 >> 12;
			@Pc(119) int local119 = local105 * local113 >> 12;
			@Pc(123) int local123 = local119 * local64;
			@Pc(127) int local127 = local74 * local119;
			@Pc(131) int local131 = local113 * local84;
			@Pc(135) int local135 = local113 * local94;
			@Pc(139) int local139 = local105 * local99;
			@Pc(143) int local143 = local103 * local105;
			@Pc(154) int local154 = arg1 + (local139 + local123 + local131 >> 12);
			@Pc(164) int local164 = (local127 + local135 + local143 >> 12) + arg6;
			Static385.method5798(local164, local30, arg3, local154, local28);
			local30 = local164;
			local28 = local154;
		}
	}
}
