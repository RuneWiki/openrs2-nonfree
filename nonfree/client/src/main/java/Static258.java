import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "I")
	public static int anInt4069;

	@OriginalMember(owner = "client!je", name = "e", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "Lclient!eaa;")
	public static final Class80 aClass80_4 = new Class80("WTWIP", 3);

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public static int anInt4071 = 0;

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
	public static void method3534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg0 + 1;
		Static134.method1841(Static543.anIntArrayArray57[arg0], arg4, arg3, arg1);
		@Pc(17) int local17 = arg2 - 1;
		Static134.method1841(Static543.anIntArrayArray57[arg2], arg4, arg3, arg1);
		for (@Pc(29) int local29 = local4; local29 <= local17; local29++) {
			@Pc(35) int[] local35 = Static543.anIntArrayArray57[local29];
			local35[arg4] = local35[arg3] = arg1;
		}
	}
}
