import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static219 {

	@OriginalMember(owner = "client!jca", name = "h", descriptor = "I")
	public static int anInt4316;

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[128][128];

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_62 = new Class45("Profiling", "Profiling", "Profilage", "Profiling");

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
	public static final int anInt4314 = -1;

	@OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
	public static int anInt4315 = 0;

	@OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
	public static int anInt4317 = -1;

	@OriginalMember(owner = "client!jca", name = "p", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_63 = new Class45("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method4015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg6 == arg1 && arg4 == arg0 && arg5 == arg7 && arg3 == arg2) {
			Static271.method4830(arg5, arg0, arg3, arg8, arg6);
			return;
		}
		@Pc(37) int local37 = arg6;
		@Pc(39) int local39 = arg0;
		@Pc(43) int local43 = arg6 * 3;
		@Pc(47) int local47 = arg0 * 3;
		@Pc(51) int local51 = arg1 * 3;
		@Pc(55) int local55 = arg4 * 3;
		@Pc(59) int local59 = arg7 * 3;
		@Pc(63) int local63 = arg2 * 3;
		@Pc(73) int local73 = arg5 + local51 - arg6 - local59;
		@Pc(84) int local84 = arg3 + local55 - arg0 - local63;
		@Pc(94) int local94 = local59 + local43 - local51 - local51;
		@Pc(104) int local104 = local63 + local47 - local55 - local55;
		@Pc(108) int local108 = local51 - local43;
		@Pc(112) int local112 = local55 - local47;
		for (@Pc(114) int local114 = 128; local114 <= 4096; local114 += 128) {
			@Pc(122) int local122 = local114 * local114 >> 12;
			@Pc(128) int local128 = local114 * local122 >> 12;
			@Pc(132) int local132 = local73 * local128;
			@Pc(136) int local136 = local84 * local128;
			@Pc(140) int local140 = local94 * local122;
			@Pc(144) int local144 = local104 * local122;
			@Pc(148) int local148 = local108 * local114;
			@Pc(152) int local152 = local112 * local114;
			@Pc(162) int local162 = (local148 + local140 + local132 >> 12) + arg6;
			@Pc(172) int local172 = (local152 + local136 + local144 >> 12) + arg0;
			Static271.method4830(local162, local39, local172, arg8, local37);
			local39 = local172;
			local37 = local162;
		}
	}
}
