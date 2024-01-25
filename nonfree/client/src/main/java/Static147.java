import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!ff", name = "I", descriptor = "Lclient!mu;")
	public static Class238 aClass238_1;

	@OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
	public static int anInt2575;

	@OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
	public static int anInt2574 = 0;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZILclient!cd;I)V")
	public static void method2183(@OriginalArg(1) int arg0, @OriginalArg(2) Class48 arg1, @OriginalArg(3) int arg2) {
		Static20.aClass48ArrayArray1[arg0][arg2] = arg1;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIIII)V")
	public static void method2184(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17 = arg2 + arg5;
		@Pc(22) int local22 = arg0 - arg5;
		for (@Pc(24) int local24 = arg2; local24 < local17; local24++) {
			Static491.method7219(Static249.anIntArrayArray23[local24], arg4, arg3, arg1);
		}
		for (@Pc(44) int local44 = arg0; local44 > local22; local44--) {
			Static491.method7219(Static249.anIntArrayArray23[local44], arg4, arg3, arg1);
		}
		@Pc(63) int local63 = arg4 + arg5;
		@Pc(68) int local68 = arg1 - arg5;
		for (@Pc(70) int local70 = local17; local70 <= local22; local70++) {
			@Pc(76) int[] local76 = Static249.anIntArrayArray23[local70];
			Static491.method7219(local76, arg4, arg3, local63);
			Static491.method7219(local76, local68, arg3, arg1);
		}
	}
}
