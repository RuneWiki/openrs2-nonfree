import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static433 {

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "I")
	public static int anInt7592;

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "[S")
	public static short[] aShortArray128;

	@OriginalMember(owner = "client!qn", name = "l", descriptor = "Lclient!nba;")
	public static final Class231 aClass231_5 = new Class231();

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(III[II)V")
	public static void method6039(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		arg3--;
		@Pc(11) int local11 = arg1 - 1;
		@Pc(15) int local15 = local11 - 7;
		while (local15 > arg3) {
			@Pc(19) int local19 = arg3 + 1;
			arg2[local19] = arg0;
			@Pc(24) int local24 = local19 + 1;
			arg2[local24] = arg0;
			@Pc(29) int local29 = local24 + 1;
			arg2[local29] = arg0;
			@Pc(34) int local34 = local29 + 1;
			arg2[local34] = arg0;
			@Pc(39) int local39 = local34 + 1;
			arg2[local39] = arg0;
			@Pc(44) int local44 = local39 + 1;
			arg2[local44] = arg0;
			@Pc(49) int local49 = local44 + 1;
			arg2[local49] = arg0;
			arg3 = local49 + 1;
			arg2[arg3] = arg0;
		}
		while (arg3 < local11) {
			arg3++;
			arg2[arg3] = arg0;
		}
	}
}
