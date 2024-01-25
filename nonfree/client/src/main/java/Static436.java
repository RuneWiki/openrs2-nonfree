import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!qj", name = "o", descriptor = "Z")
	public static boolean aBoolean546 = false;

	@OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
	public static int anInt7281 = -1;

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)I")
	public static int method6096(@OriginalArg(0) int arg0) {
		return arg0 >>> 7;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)Z")
	public static boolean method6101(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method6105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(15) int local15 = arg1 - arg0;
		@Pc(19) int local19 = arg0 + arg5;
		for (@Pc(21) int local21 = arg5; local21 < local19; local21++) {
			Static583.method7816(Static158.anIntArrayArray66[local21], arg4, arg6, arg2);
		}
		for (@Pc(37) int local37 = arg1; local37 > local15; local37--) {
			Static583.method7816(Static158.anIntArrayArray66[local37], arg4, arg6, arg2);
		}
		@Pc(56) int local56 = arg2 - arg0;
		@Pc(60) int local60 = arg0 + arg6;
		for (@Pc(62) int local62 = local19; local62 <= local15; local62++) {
			@Pc(68) int[] local68 = Static158.anIntArrayArray66[local62];
			Static583.method7816(local68, arg4, arg6, local60);
			Static583.method7816(local68, arg3, local60, local56);
			Static583.method7816(local68, arg4, local56, arg2);
		}
	}
}
