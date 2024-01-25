import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "Lclient!pf;")
	public static Class156 aClass156_126;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
	public static int anInt6755 = -2;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)V")
	public static void method5702(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(21) int local21;
		if (Static339.anInt6549 != arg0) {
			Static73.anIntArray91 = new int[arg0];
			for (local21 = 0; local21 < arg0; local21++) {
				Static73.anIntArray91[local21] = (local21 << 12) / arg0;
			}
			Static323.anInt6272 = arg0 - 1;
			Static339.anInt6549 = arg0;
			Static57.anInt1090 = arg0 * 32;
		}
		if (Static113.anInt2160 == arg1) {
			return;
		}
		if (arg1 == Static339.anInt6549) {
			Static155.anIntArray196 = Static73.anIntArray91;
		} else {
			Static155.anIntArray196 = new int[arg1];
			for (local21 = 0; local21 < arg1; local21++) {
				Static155.anIntArray196[local21] = (local21 << 12) / arg1;
			}
		}
		Static113.anInt2160 = arg1;
		Static75.anInt1419 = arg1 - 1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIZIIZ)V")
	public static void method5705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg2 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) Class157_Sub1 local24 = Static165.aClass157_Sub1Array5[local18];
		Static165.aClass157_Sub1Array5[local18] = Static165.aClass157_Sub1Array5[arg2];
		Static165.aClass157_Sub1Array5[arg2] = local24;
		for (@Pc(36) int local36 = arg1; local36 < arg2; local36++) {
			if (Static313.method5274(arg5, Static165.aClass157_Sub1Array5[local36], arg3, local24, arg4, arg0) <= 0) {
				@Pc(56) Class157_Sub1 local56 = Static165.aClass157_Sub1Array5[local36];
				Static165.aClass157_Sub1Array5[local36] = Static165.aClass157_Sub1Array5[local20];
				Static165.aClass157_Sub1Array5[local20++] = local56;
			}
		}
		Static165.aClass157_Sub1Array5[arg2] = Static165.aClass157_Sub1Array5[local20];
		Static165.aClass157_Sub1Array5[local20] = local24;
		method5705(arg0, arg1, local20 - 1, arg3, arg4, arg5);
		method5705(arg0, local20 + 1, arg2, arg3, arg4, arg5);
	}
}
