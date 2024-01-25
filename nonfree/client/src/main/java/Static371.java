import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!nu", name = "h", descriptor = "I")
	public static int anInt6556;

	@OriginalMember(owner = "client!nu", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString57 = "";

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIIIBII)V")
	public static void method5504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg1 + arg4;
		@Pc(19) int local19 = arg3 - arg4;
		for (@Pc(21) int local21 = arg1; local21 < local14; local21++) {
			Static276.method3099(arg6, Static582.anIntArrayArray69[local21], arg2, arg0);
		}
		@Pc(43) int local43 = arg0 - arg4;
		for (@Pc(45) int local45 = arg3; local45 > local19; local45--) {
			Static276.method3099(arg6, Static582.anIntArrayArray69[local45], arg2, arg0);
		}
		@Pc(67) int local67 = arg4 + arg6;
		for (@Pc(69) int local69 = local14; local69 <= local19; local69++) {
			@Pc(75) int[] local75 = Static582.anIntArrayArray69[local69];
			Static276.method3099(arg6, local75, arg2, local67);
			Static276.method3099(local67, local75, arg5, local43);
			Static276.method3099(local43, local75, arg2, arg0);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IILclient!qi;IB)V")
	public static void method5505(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray510[0];
		@Pc(23) int local23 = arg1.anIntArray509[0];
		if (local10 < 0 || Static188.anInt3850 <= local10 || local23 < 0 || local23 >= Static49.anInt1174 || (arg2 < 0 || Static188.anInt3850 <= arg2 || arg0 < 0 || arg0 >= Static49.anInt1174)) {
			return;
		}
		@Pc(77) int local77 = Static101.method1504(Static44.anIntArray59, 0, local10, 0, arg0, true, 0, Static495.aClass355Array1[arg1.aByte112], local23, arg2, arg1.method6165(), Static287.anIntArray362, -4, 0);
		if (local77 >= 1 && local77 <= 3) {
			for (@Pc(89) int local89 = 0; local89 < local77 - 1; local89++) {
				arg1.method6177(Static287.anIntArray362[local89], (byte) 2, Static44.anIntArray59[local89]);
			}
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIII)V")
	public static void method5506(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static270.anInt1805 / (float) Static270.anInt1797;
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = arg0;
		if ((float) 1 > local9) {
			local13 = (int) ((float) arg3 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(40) int local40 = arg2 - (arg0 - local13) / 2;
		@Pc(48) int local48 = arg1 - (arg3 - local11) / 2;
		Static75.anInt1651 = Static270.anInt1805 - local40 * Static270.anInt1805 / local13;
		Static415.anInt7185 = -1;
		Static264.anInt4873 = -1;
		Static549.anInt8926 = local48 * Static270.anInt1797 / local11;
		Static246.method3822();
	}
}
