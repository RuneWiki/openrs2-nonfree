import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "Lclient!tg;")
	public static Class4_Sub1_Sub18 aClass4_Sub1_Sub18_1;

	@OriginalMember(owner = "client!gk", name = "i", descriptor = "[I")
	public static int[] anIntArray234;

	@OriginalMember(owner = "client!gk", name = "j", descriptor = "Lclient!bf;")
	public static Class4_Sub5 aClass4_Sub5_2;

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)I")
	public static int method2411() {
		return 13;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V")
	public static void method2413() {
		Static429.aClass83_60.method2346();
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIIII)V")
	public static void method2414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg4 + 1;
		Static236.method3990(arg2, arg1, Static400.anIntArrayArray54[arg4], arg3);
		@Pc(25) int local25 = arg0 - 1;
		Static236.method3990(arg2, arg1, Static400.anIntArrayArray54[arg0], arg3);
		for (@Pc(31) int local31 = local6; local31 <= local25; local31++) {
			@Pc(37) int[] local37 = Static400.anIntArrayArray54[local31];
			local37[arg1] = local37[arg2] = arg3;
		}
	}
}
