import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
	public static int anInt10398;

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	public static int anInt10400;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII)V")
	public static void method8780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg2 + 1;
		Static270.method3998(arg0, arg3, arg1, Static173.anIntArrayArray15[arg2]);
		@Pc(20) int local20 = arg4 - 1;
		Static270.method3998(arg0, arg3, arg1, Static173.anIntArrayArray15[arg4]);
		for (@Pc(29) int local29 = local11; local29 <= local20; local29++) {
			@Pc(35) int[] local35 = Static173.anIntArrayArray15[local29];
			local35[arg3] = local35[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(III)Z")
	public static boolean method8781(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
