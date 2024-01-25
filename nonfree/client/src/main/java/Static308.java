import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "[Lclient!o;")
	public static Class80[] aClass80Array17;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "[I")
	public static final int[] anIntArray515 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4263(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = arg0.charAt(local17) + (local10 << 5) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static419.method5518(arg5)) {
			return;
		}
		if (Static61.aClass89ArrayArray1[arg5] == null) {
			Static56.method995(Static166.aClass89ArrayArray2[arg5], -1, arg3, arg6, arg8, arg2, arg1, arg4, arg7, arg0);
		} else {
			Static56.method995(Static61.aClass89ArrayArray1[arg5], -1, arg3, arg6, arg8, arg2, arg1, arg4, arg7, arg0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Lclient!og;")
	public static Class178 method4265(@OriginalArg(0) int arg0) {
		@Pc(13) Class178[] local13 = Static368.method4944();
		for (@Pc(15) int local15 = 0; local15 < local13.length; local15++) {
			@Pc(21) Class178 local21 = local13[local15];
			if (arg0 == local21.anInt5057) {
				return local21;
			}
		}
		return null;
	}
}
