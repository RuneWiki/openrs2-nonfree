import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!jg", name = "E", descriptor = "F")
	public static float aFloat49;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "Lclient!ir;")
	public static Class110 aClass110_3;

	@OriginalMember(owner = "client!jg", name = "Q", descriptor = "Lclient!hf;")
	public static Class2_Sub21 aClass2_Sub21_1;

	@OriginalMember(owner = "client!jg", name = "tb", descriptor = "[I")
	public static final int[] anIntArray614 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZIIIIIIII)V")
	public static void method2870(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg5 && arg0 == arg3 && arg7 == arg6 && arg8 == arg2) {
			Static109.method2272(arg0, arg8, arg4, arg5, arg7);
			return;
		}
		@Pc(35) int local35 = arg5;
		@Pc(37) int local37 = arg0;
		@Pc(41) int local41 = arg5 * 3;
		@Pc(45) int local45 = arg0 * 3;
		@Pc(49) int local49 = arg1 * 3;
		@Pc(53) int local53 = arg3 * 3;
		@Pc(57) int local57 = arg6 * 3;
		@Pc(61) int local61 = arg2 * 3;
		@Pc(71) int local71 = local49 + arg7 - arg5 - local57;
		@Pc(81) int local81 = arg8 + local53 - local61 - arg0;
		@Pc(90) int local90 = local57 + local41 - local49 - local49;
		@Pc(100) int local100 = local61 + local45 - local53 - local53;
		@Pc(105) int local105 = local49 - local41;
		@Pc(110) int local110 = local53 - local45;
		for (@Pc(112) int local112 = 128; local112 <= 4096; local112 += 128) {
			@Pc(120) int local120 = local112 * local112 >> 12;
			@Pc(126) int local126 = local112 * local120 >> 12;
			@Pc(130) int local130 = local126 * local71;
			@Pc(134) int local134 = local81 * local126;
			@Pc(138) int local138 = local90 * local120;
			@Pc(142) int local142 = local120 * local100;
			@Pc(146) int local146 = local105 * local112;
			@Pc(150) int local150 = local110 * local112;
			@Pc(161) int local161 = arg5 + (local130 + local138 + local146 >> 12);
			@Pc(172) int local172 = (local134 + local142 + local150 >> 12) + arg0;
			Static109.method2272(local37, local172, arg4, local35, local161);
			local35 = local161;
			local37 = local172;
		}
	}
}
