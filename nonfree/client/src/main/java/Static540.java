import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static540 {

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
	public static int anInt9067;

	@OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
	public static int anInt9066 = 2;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIIBII)V")
	public static void method7591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = arg1 + arg6;
		@Pc(22) int local22 = arg0 - arg1;
		for (@Pc(24) int local24 = arg6; local24 < local17; local24++) {
			Static482.method7040(arg2, arg3, Static384.anIntArrayArray38[local24], arg4);
		}
		for (@Pc(42) int local42 = arg0; local42 > local22; local42--) {
			Static482.method7040(arg2, arg3, Static384.anIntArrayArray38[local42], arg4);
		}
		@Pc(64) int local64 = arg3 + arg1;
		@Pc(68) int local68 = arg4 - arg1;
		for (@Pc(70) int local70 = local17; local70 <= local22; local70++) {
			@Pc(78) int[] local78 = Static384.anIntArrayArray38[local70];
			Static482.method7040(arg2, arg3, local78, local64);
			Static482.method7040(arg5, local64, local78, local68);
			Static482.method7040(arg2, local68, local78, arg4);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BII)Z")
	public static boolean method7593(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0 && (arg0 & 0x37) != 0;
	}
}
