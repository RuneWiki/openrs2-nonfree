import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!eea;")
	public static Class84 aClass84_3;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Lclient!qk;")
	public static Class288 aClass288_90;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray42 = new boolean[200];

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2198(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg0 && arg3 == arg5 && arg8 == arg2 && arg1 == arg6) {
			Static582.method7927(arg6, arg5, arg4, arg2, arg0);
			return;
		}
		@Pc(48) int local48 = arg0;
		@Pc(50) int local50 = arg5;
		@Pc(54) int local54 = arg0 * 3;
		@Pc(58) int local58 = arg5 * 3;
		@Pc(62) int local62 = arg7 * 3;
		@Pc(66) int local66 = arg3 * 3;
		@Pc(70) int local70 = arg8 * 3;
		@Pc(74) int local74 = arg1 * 3;
		@Pc(83) int local83 = arg2 + local62 - arg0 - local70;
		@Pc(92) int local92 = arg6 + local66 - local74 - arg5;
		@Pc(102) int local102 = local70 + local54 - local62 - local62;
		@Pc(112) int local112 = local58 + local74 - local66 - local66;
		@Pc(116) int local116 = local62 - local54;
		@Pc(121) int local121 = local66 - local58;
		for (@Pc(123) int local123 = 128; local123 <= 4096; local123 += 128) {
			@Pc(131) int local131 = local123 * local123 >> 12;
			@Pc(137) int local137 = local123 * local131 >> 12;
			@Pc(141) int local141 = local137 * local83;
			@Pc(145) int local145 = local92 * local137;
			@Pc(149) int local149 = local102 * local131;
			@Pc(153) int local153 = local131 * local112;
			@Pc(157) int local157 = local123 * local116;
			@Pc(161) int local161 = local123 * local121;
			@Pc(172) int local172 = (local157 + local141 + local149 >> 12) + arg0;
			@Pc(184) int local184 = arg5 + (local161 + local145 + local153 >> 12);
			Static582.method7927(local184, local50, arg4, local172, local48);
			local48 = local172;
			local50 = local184;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z")
	public static boolean method2200(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 6 || arg0 == 20 || arg0 == 47 || arg0 == 17 || arg0 == 49 || arg0 == 9;
	}
}
