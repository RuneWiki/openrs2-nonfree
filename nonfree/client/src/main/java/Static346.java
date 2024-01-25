import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static346 {

	@OriginalMember(owner = "client!qt", name = "F", descriptor = "[I")
	public static int[] anIntArray401;

	@OriginalMember(owner = "client!qt", name = "D", descriptor = "Lclient!ne;")
	public static final Class170 aClass170_9 = new Class170("LOCAL", 4);

	@OriginalMember(owner = "client!qt", name = "H", descriptor = "F")
	public static float aFloat136 = 0.0F;

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIII)I")
	public static int method4497(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) int local13 = 255 - arg0;
		@Pc(31) int local31 = ((arg2 & 0xFF00FF) * arg0 & 0xFF00FF00 | arg0 * (arg2 & 0xFF00) & 0xFF0000) >>> 8;
		return local31 + (((arg1 & 0xFF00FF) * local13 & 0xFF00FF00 | (arg1 & 0xFF00) * local13 & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IIIIIB)V")
	public static void method4499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(5) int local5 = arg4 + 1;
		Static291.method3606(arg3, Static133.anIntArrayArray15[arg4], arg1, arg0);
		@Pc(18) int local18 = arg2 - 1;
		Static291.method3606(arg3, Static133.anIntArrayArray15[arg2], arg1, arg0);
		for (@Pc(29) int local29 = local5; local29 <= local18; local29++) {
			@Pc(35) int[] local35 = Static133.anIntArrayArray15[local29];
			local35[arg0] = local35[arg3] = arg1;
		}
	}
}
