import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!jm", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray28;

	@OriginalMember(owner = "client!jm", name = "q", descriptor = "I")
	public static int anInt3190 = 0;

	@OriginalMember(owner = "client!jm", name = "v", descriptor = "I")
	public static int anInt3193 = -1;

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V")
	public static void method2982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg4 + 1;
		Static205.method3670(arg1, arg0, Static146.anIntArrayArray91[arg4], arg3);
		@Pc(19) int local19 = arg2 - 1;
		Static205.method3670(arg1, arg0, Static146.anIntArrayArray91[arg2], arg3);
		for (@Pc(25) int local25 = local10; local25 <= local19; local25++) {
			@Pc(31) int[] local31 = Static146.anIntArrayArray91[local25];
			local31[arg3] = local31[arg0] = arg1;
		}
	}
}
