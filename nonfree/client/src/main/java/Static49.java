import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
	public static int anInt1667;

	@OriginalMember(owner = "client!bn", name = "g", descriptor = "F")
	public static float aFloat59;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	public static int anInt1670 = -1;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
	public static void method1563() {
		if (Static333.anInt6626 == 7) {
			Static5.method440(false);
		} else {
			Static550.aClass41_2 = Static226.aClass41_1;
			Static226.aClass41_1 = null;
			Static119.method2558(13);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method1564(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < 1 || arg1 < 1 || arg5 > Static306.anInt6176 - 2 || Static108.anInt2930 - 2 < arg1) {
			return;
		}
		@Pc(27) int local27 = arg4;
		if (arg4 < 3 && Static3.method52(arg1, arg5)) {
			local27 = arg4 + 1;
		}
		if (Static87.aClass6_Sub33_6.aClass14_Sub3_2.method819() == 0 && !Static514.method7364(arg1, local27, arg5, Static213.anInt4581)) {
			return;
		}
		if (Static26.aClass186ArrayArrayArray1 == null) {
			return;
		}
		Static479.aClass210_Sub1_2.method5814(arg1, arg4, Static467.aClass5_13, Static313.aClass258Array1[arg4], arg2, arg5);
		if (arg0 < 0) {
			return;
		}
		@Pc(72) int local72 = Static87.aClass6_Sub33_6.aClass14_Sub11_1.method4084();
		Static87.aClass6_Sub33_6.method4996(1, Static87.aClass6_Sub33_6.aClass14_Sub11_1);
		Static479.aClass210_Sub1_2.method5812(arg0, arg1, arg6, local27, arg5, Static467.aClass5_13, arg3, arg7, arg4, Static313.aClass258Array1[arg4]);
		Static87.aClass6_Sub33_6.method4996(local72, Static87.aClass6_Sub33_6.aClass14_Sub11_1);
		return;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!uv;I[II[I)Lclient!hu;")
	public static Class1_Sub2 method1565(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int[] arg4) {
		@Pc(31) int local31;
		@Pc(41) int local41;
		@Pc(43) int local43;
		if (!arg1.method3945(Static268.aClass178_6, Static302.aClass176_8)) {
			@Pc(29) int[] local29 = new int[arg2 * arg0];
			for (local31 = 0; local31 < arg0; local31++) {
				local41 = arg3[local31] + local31 * arg2;
				for (local43 = 0; local43 < arg4[local31]; local43++) {
					local29[local41++] = -16777216;
				}
			}
			return new Class1_Sub2(arg1, arg2, arg0, local29);
		}
		@Pc(77) byte[] local77 = new byte[arg2 * arg0];
		for (local31 = 0; local31 < arg0; local31++) {
			local41 = arg2 * local31 + arg3[local31];
			for (local43 = 0; local43 < arg4[local31]; local43++) {
				local77[local41++] = -1;
			}
		}
		return new Class1_Sub2(arg1, arg2, arg0, local77);
	}
}
