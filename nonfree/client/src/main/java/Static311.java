import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public static int anInt5380 = -1;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "Z")
	public static boolean aBoolean418 = true;

	@OriginalMember(owner = "client!se", name = "g", descriptor = "I")
	public static final int anInt5382 = 1405;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
	public static void method4792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) int local12 = arg4 + 1;
		Static349.method5265(arg2, arg3, arg0, Static325.anIntArrayArray50[arg4]);
		@Pc(21) int local21 = arg1 - 1;
		Static349.method5265(arg2, arg3, arg0, Static325.anIntArrayArray50[arg1]);
		for (@Pc(29) int local29 = local12; local29 <= local21; local29++) {
			@Pc(35) int[] local35 = Static325.anIntArrayArray50[local29];
			local35[arg2] = local35[arg3] = arg0;
		}
	}
}
