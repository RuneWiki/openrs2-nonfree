import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static468 {

	@OriginalMember(owner = "client!rq", name = "M", descriptor = "[[Lclient!pn;")
	public static Class25_Sub2[][] aClass25_Sub2ArrayArray4;

	@OriginalMember(owner = "client!rq", name = "ab", descriptor = "Lclient!ri;")
	public static Class284 aClass284_131;

	@OriginalMember(owner = "client!rq", name = "W", descriptor = "Lclient!pw;")
	public static final Class265 aClass265_8 = new Class265();

	@OriginalMember(owner = "client!rq", name = "bb", descriptor = "[I")
	public static final int[] anIntArray481 = new int[3];

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method6414(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local19 > local11 && Static454.method6256(arg0.charAt(local11))) {
			local11++;
		}
		while (local11 < local19 && Static454.method6256(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(58) int local58 = local19 - local11;
		if (local58 < 1 || local58 > 12) {
			return null;
		}
		@Pc(75) StringBuffer local75 = new StringBuffer(local58);
		for (@Pc(77) int local77 = local11; local77 < local19; local77++) {
			@Pc(83) char local83 = arg0.charAt(local77);
			if (Static260.method4015(local83)) {
				@Pc(91) char local91 = Static44.method8135(local83);
				if (local91 != '\u0000') {
					local75.append(local91);
				}
			}
		}
		if (local75.length() == 0) {
			return null;
		} else {
			return local75.toString();
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg0 && arg2 == arg1 && arg3 == arg4 && arg8 == arg6) {
			Static80.method1850(arg8, arg1, arg3, arg7, arg5);
			return;
		}
		@Pc(36) int local36 = arg7;
		@Pc(38) int local38 = arg1;
		@Pc(42) int local42 = arg7 * 3;
		@Pc(46) int local46 = arg1 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(58) int local58 = arg4 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(73) int local73 = arg3 + local50 - local58 - arg7;
		@Pc(83) int local83 = arg8 + local54 - arg1 - local62;
		@Pc(93) int local93 = local42 + local58 - local50 - local50;
		@Pc(102) int local102 = local62 + local46 - local54 - local54;
		@Pc(107) int local107 = local50 - local42;
		@Pc(112) int local112 = local54 - local46;
		for (@Pc(114) int local114 = 128; local114 <= 4096; local114 += 128) {
			@Pc(122) int local122 = local114 * local114 >> 12;
			@Pc(128) int local128 = local122 * local114 >> 12;
			@Pc(132) int local132 = local128 * local73;
			@Pc(136) int local136 = local83 * local128;
			@Pc(140) int local140 = local122 * local93;
			@Pc(144) int local144 = local122 * local102;
			@Pc(148) int local148 = local114 * local107;
			@Pc(152) int local152 = local114 * local112;
			@Pc(164) int local164 = arg7 + (local140 + local132 + local148 >> 12);
			@Pc(175) int local175 = (local136 + local144 + local152 >> 12) + arg1;
			Static80.method1850(local175, local38, local164, local36, arg5);
			local36 = local164;
			local38 = local175;
		}
	}
}
