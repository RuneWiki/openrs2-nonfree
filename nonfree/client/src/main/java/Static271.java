import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!jd", name = "p", descriptor = "Lclient!bu;")
	public static Class54 aClass54_16;

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "[Lclient!fs;")
	public static Class134[] aClass134Array6;

	@OriginalMember(owner = "client!jd", name = "kb", descriptor = "I")
	public static int anInt4739;

	@OriginalMember(owner = "client!jd", name = "K", descriptor = "Lclient!dea;")
	public static final Class85 aClass85_4 = new Class85();

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg0 == arg3 && arg4 == arg7 && arg8 == arg6 && arg5 == arg2) {
			Static196.method2830(arg4, arg0, arg2, arg1, arg6);
			return;
		}
		@Pc(33) int local33 = arg0;
		@Pc(35) int local35 = arg4;
		@Pc(39) int local39 = arg0 * 3;
		@Pc(43) int local43 = arg4 * 3;
		@Pc(47) int local47 = arg3 * 3;
		@Pc(51) int local51 = arg7 * 3;
		@Pc(55) int local55 = arg8 * 3;
		@Pc(59) int local59 = arg5 * 3;
		@Pc(68) int local68 = local47 + arg6 - local55 - arg0;
		@Pc(78) int local78 = local51 + arg2 - arg4 - local59;
		@Pc(88) int local88 = local39 + local55 - local47 - local47;
		@Pc(98) int local98 = local43 + local59 - local51 - local51;
		@Pc(103) int local103 = local47 - local39;
		@Pc(108) int local108 = local51 - local43;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local110 * local118 >> 12;
			@Pc(128) int local128 = local124 * local68;
			@Pc(132) int local132 = local124 * local78;
			@Pc(136) int local136 = local88 * local118;
			@Pc(140) int local140 = local118 * local98;
			@Pc(144) int local144 = local103 * local110;
			@Pc(148) int local148 = local108 * local110;
			@Pc(159) int local159 = arg0 + (local144 + local128 + local136 >> 12);
			@Pc(169) int local169 = (local148 + local140 + local132 >> 12) + arg4;
			Static196.method2830(local35, local33, local169, arg1, local159);
			local33 = local159;
			local35 = local169;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(III)Z")
	public static boolean method4030(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static143.method2010(arg0, arg1) | (arg0 & 0x800) != 0 || Static552.method7996(arg0, arg1);
	}
}
