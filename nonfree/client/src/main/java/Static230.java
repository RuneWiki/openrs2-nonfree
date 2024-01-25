import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static230 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V")
	public static void method3622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(25) Class262 local25 = Static584.aClass262ArrayArrayArray2[arg4][arg2][arg1];
			if (local25 == null) {
				local25 = new Class262(arg4);
			}
			if (arg0 == 1) {
				local25.aShort98 = (short) arg5;
				local25.aShort99 = (short) arg3;
			} else if (arg0 == 2) {
				local25.aShort101 = (short) arg5;
				local25.aShort100 = (short) arg3;
			}
			if (Static522.aBoolean658) {
				Static372.method5397();
			}
			return;
		}
		@Pc(85) int local85;
		@Pc(90) int local90;
		@Pc(94) int local94;
		@Pc(98) int local98;
		@Pc(108) int local108;
		@Pc(120) int local120;
		if (arg0 != 8) {
			local85 = Static495.anInt8508 + (arg2 << Static394.anInt7067);
			local90 = local85 - Static495.anInt8508;
			local94 = arg1 << Static394.anInt7067;
			local98 = local94 + Static495.anInt8508;
			local108 = Static167.aClass313Array1[arg4].method9095(arg1, arg2 + 1);
			local120 = Static167.aClass313Array1[arg4].method9095(arg1 + 1, arg2);
			Static483.aClass79Array3[Static379.anInt6781++] = new Class79(arg0, arg4, local85, local90, local90, local85, local108, local120, local120 - arg3, local108 - arg3, local94, local98, local98, local94);
			return;
		}
		local85 = arg2 << Static394.anInt7067;
		local90 = Static495.anInt8508 + local85;
		local94 = arg1 << Static394.anInt7067;
		local98 = Static495.anInt8508 + local94;
		local108 = Static167.aClass313Array1[arg4].method9095(arg1, arg2);
		local120 = Static167.aClass313Array1[arg4].method9095(arg1 + 1, arg2 + 1);
		Static483.aClass79Array3[Static379.anInt6781++] = new Class79(arg0, arg4, local85, local90, local90, local85, local108, local120, local120 - arg3, local108 - arg3, local94, local98, local98, local94);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IILclient!bha;Z)V")
	public static void method3623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class28 arg2) {
		Static678.aClass28ArrayArray5[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIZIIIIIII)V")
	public static void method3624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static255.method3996(arg9)) {
			return;
		}
		if (Static280.aClass20ArrayArray1[arg9] == null) {
			Static87.method1168(Static403.aClass20ArrayArray2[arg9], -1, arg8, arg4, arg5, arg1, arg6, arg7, arg3, arg0, arg10, arg2);
		} else {
			Static87.method1168(Static280.aClass20ArrayArray1[arg9], -1, arg8, arg4, arg5, arg1, arg6, arg7, arg3, arg0, arg10, arg2);
		}
	}
}
