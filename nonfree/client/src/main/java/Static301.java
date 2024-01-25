import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!jda", name = "i", descriptor = "Lclient!ula;")
	public static final Class379 aClass379_9 = new Class379("LOCAL", "", "local", 4);

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg2 && arg6 == arg3 && arg4 == arg5 && arg1 == arg0) {
			Static90.method4199(arg8, arg6, arg0, arg7, arg4);
			return;
		}
		@Pc(43) int local43 = arg7;
		@Pc(45) int local45 = arg6;
		@Pc(49) int local49 = arg7 * 3;
		@Pc(53) int local53 = arg6 * 3;
		@Pc(57) int local57 = arg2 * 3;
		@Pc(61) int local61 = arg3 * 3;
		@Pc(65) int local65 = arg5 * 3;
		@Pc(69) int local69 = arg1 * 3;
		@Pc(78) int local78 = local57 + arg4 - local65 - arg7;
		@Pc(88) int local88 = local61 + arg0 - local69 - arg6;
		@Pc(98) int local98 = local65 + local49 - local57 - local57;
		@Pc(108) int local108 = local53 + local69 - local61 - local61;
		@Pc(112) int local112 = local57 - local49;
		@Pc(117) int local117 = local61 - local53;
		for (@Pc(119) int local119 = 128; local119 <= 4096; local119 += 128) {
			@Pc(127) int local127 = local119 * local119 >> 12;
			@Pc(133) int local133 = local119 * local127 >> 12;
			@Pc(137) int local137 = local78 * local133;
			@Pc(141) int local141 = local88 * local133;
			@Pc(145) int local145 = local98 * local127;
			@Pc(149) int local149 = local127 * local108;
			@Pc(153) int local153 = local112 * local119;
			@Pc(157) int local157 = local117 * local119;
			@Pc(167) int local167 = arg7 + (local137 + local145 + local153 >> 12);
			@Pc(178) int local178 = arg6 + (local157 + local149 + local141 >> 12);
			Static90.method4199(arg8, local45, local178, local43, local167);
			local45 = local178;
			local43 = local167;
		}
	}
}
