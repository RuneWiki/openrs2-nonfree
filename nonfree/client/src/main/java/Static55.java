import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!bq", name = "V", descriptor = "I")
	public static int anInt837 = -1;

	@OriginalMember(owner = "client!bq", name = "X", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "(B)V")
	public static void method732() {
		if (Static78.anInt1119 <= 0) {
			Static390.aString58 = "";
			return;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static352.aStringArray61.length; local19++) {
			if (Static352.aStringArray61[local19].indexOf("--> ") != -1) {
				local17++;
				if (local17 == Static78.anInt1119) {
					Static390.aString58 = Static352.aStringArray61[local19].substring(Static352.aStringArray61[local19].indexOf(">") + 2);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg7 && arg8 == arg5 && arg4 == arg6 && arg2 == arg1) {
			Static238.method3724(arg0, arg8, arg3, arg1, arg6);
			return;
		}
		@Pc(28) int local28 = arg0;
		@Pc(30) int local30 = arg8;
		@Pc(34) int local34 = arg0 * 3;
		@Pc(38) int local38 = arg8 * 3;
		@Pc(42) int local42 = arg7 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg2 * 3;
		@Pc(63) int local63 = local42 + arg6 - local50 - arg0;
		@Pc(73) int local73 = arg1 + local46 - local54 - arg8;
		@Pc(83) int local83 = local34 + local50 - local42 - local42;
		@Pc(92) int local92 = local38 + local54 - local46 - local46;
		@Pc(96) int local96 = local42 - local34;
		@Pc(100) int local100 = local46 - local38;
		for (@Pc(102) int local102 = 128; local102 <= 4096; local102 += 128) {
			@Pc(110) int local110 = local102 * local102 >> 12;
			@Pc(116) int local116 = local110 * local102 >> 12;
			@Pc(120) int local120 = local116 * local63;
			@Pc(124) int local124 = local73 * local116;
			@Pc(128) int local128 = local83 * local110;
			@Pc(132) int local132 = local92 * local110;
			@Pc(136) int local136 = local102 * local96;
			@Pc(140) int local140 = local100 * local102;
			@Pc(150) int local150 = (local128 + local120 + local136 >> 12) + arg0;
			@Pc(161) int local161 = arg8 + (local132 + local124 + local140 >> 12);
			Static238.method3724(local28, local30, arg3, local161, local150);
			local28 = local150;
			local30 = local161;
		}
	}
}
