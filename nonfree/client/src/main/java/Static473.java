import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!qr", name = "Pb", descriptor = "I")
	public static int anInt7597;

	@OriginalMember(owner = "client!qr", name = "Fb", descriptor = "I")
	public static int anInt7589 = 0;

	@OriginalMember(owner = "client!qr", name = "Jb", descriptor = "I")
	public static int anInt7592 = -1;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BIIIIII)V")
	public static void method6402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg5 - arg3;
		@Pc(14) int local14 = arg3 + arg0;
		for (@Pc(16) int local16 = arg0; local16 < local14; local16++) {
			Static134.method1841(Static543.anIntArrayArray57[local16], arg2, arg4, arg1);
		}
		@Pc(39) int local39 = arg4 - arg3;
		@Pc(44) int local44 = arg2 + arg3;
		for (@Pc(46) int local46 = arg5; local46 > local10; local46--) {
			Static134.method1841(Static543.anIntArrayArray57[local46], arg2, arg4, arg1);
		}
		for (@Pc(62) int local62 = local14; local62 <= local10; local62++) {
			@Pc(68) int[] local68 = Static543.anIntArrayArray57[local62];
			Static134.method1841(local68, arg2, local44, arg1);
			Static134.method1841(local68, local39, arg4, arg1);
		}
	}
}
