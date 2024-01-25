import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Z")
	public static boolean aBoolean190;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
	public static int anInt2910 = -1;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
	public static final int[] anIntArray140 = new int[8];

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < 1 || arg7 < 1 || arg6 > Static634.anInt10129 - 2 || Static638.anInt10172 - 2 < arg7) {
			return;
		}
		@Pc(34) int local34 = arg3;
		if (arg3 < 3 && Static486.method7232(arg7, arg6)) {
			local34 = arg3 + 1;
		}
		if (Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 0 && !Static24.method994(Static35.anInt1167, local34, arg7, arg6)) {
			return;
		}
		if (Static330.aClass77ArrayArrayArray2 == null) {
			return;
		}
		Static493.aClass81_Sub1_1.method2296(arg6, arg3, arg2, Static323.aClass5_9, Static271.aClass105Array1[arg3], arg7);
		if (arg0 < 0) {
			return;
		}
		@Pc(85) int local85 = Static262.aClass3_Sub27_12.aClass21_Sub22_1.method6900();
		Static262.aClass3_Sub27_12.method3234(1, Static262.aClass3_Sub27_12.aClass21_Sub22_1);
		Static493.aClass81_Sub1_1.method2288(local34, arg1, arg0, arg3, Static323.aClass5_9, arg4, arg7, arg6, arg5, Static271.aClass105Array1[arg3]);
		Static262.aClass3_Sub27_12.method3234(local85, Static262.aClass3_Sub27_12.aClass21_Sub22_1);
		return;
	}
}
