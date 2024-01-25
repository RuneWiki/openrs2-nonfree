import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
	public static int anInt3753;

	@OriginalMember(owner = "client!ir", name = "C", descriptor = "[Lclient!uo;")
	public static final Class320[] aClass320Array1 = new Class320[34];

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3225(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4 + arg0;
		@Pc(14) int local14 = arg2 - arg4;
		for (@Pc(16) int local16 = arg0; local16 < local9; local16++) {
			Static455.method6536(arg5, arg6, arg1, Static503.anIntArrayArray12[local16]);
		}
		@Pc(38) int local38 = arg4 + arg6;
		@Pc(42) int local42 = arg5 - arg4;
		for (@Pc(44) int local44 = arg2; local44 > local14; local44--) {
			Static455.method6536(arg5, arg6, arg1, Static503.anIntArrayArray12[local44]);
		}
		for (@Pc(64) int local64 = local9; local64 <= local14; local64++) {
			@Pc(70) int[] local70 = Static503.anIntArrayArray12[local64];
			Static455.method6536(local38, arg6, arg1, local70);
			Static455.method6536(local42, local38, arg3, local70);
			Static455.method6536(arg5, local42, arg1, local70);
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	public static void method3227() {
		Static483.aClass119_1.method4149();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static74.aLongArray2[local10] = 0L;
		}
		for (@Pc(30) int local30 = 0; local30 < 32; local30++) {
			Static146.aLongArray8[local30] = 0L;
		}
		Static415.anInt7330 = 0;
	}
}
