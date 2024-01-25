import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
	public static int anInt2567;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray17;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "[I")
	public static final int[] anIntArray335 = new int[4];

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method2691(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		if (arg4 < 128 || arg3 < 128 || arg4 > Static153.anInt2883 * 128 - 256 || arg3 > Static246.anInt4606 * 128 - 256) {
			Static158.anIntArray632[0] = Static158.anIntArray632[1] = -1;
			return;
		}
		@Pc(64) int local64 = Static306.method5249(arg3, arg4, Static343.anInt6225) - arg5;
		Static160.aClass72_3.method4068(arg1, 0, 0);
		Static289.aClass81_7.method2954(Static160.aClass72_3);
		Static289.aClass81_7.method3027(arg4, local64, arg3, Static158.anIntArray632);
		Static160.aClass72_3.method4068(-arg1, 0, 0);
		Static289.aClass81_7.method2954(Static160.aClass72_3);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IZII[Ljava/lang/Object;)V")
	public static void method2692(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) int local16 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local16;
		@Pc(30) Object local30 = arg3[local10];
		arg3[local10] = arg3[arg1];
		arg3[arg1] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg1; local42++) {
			if (arg0[local42] < local16 + (local42 & 0x1)) {
				@Pc(61) int local61 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12] = local61;
				@Pc(75) Object local75 = arg3[local42];
				arg3[local42] = arg3[local12];
				arg3[local12++] = local75;
			}
		}
		arg0[arg1] = arg0[local12];
		arg0[local12] = local16;
		arg3[arg1] = arg3[local12];
		arg3[local12] = local30;
		method2692(arg0, local12 - 1, arg2, arg3);
		method2692(arg0, arg1, local12 + 1, arg3);
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIIIIIIII)V")
	public static void method2694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < 1 || arg0 < 1 || Static153.anInt2883 - 2 < arg2 || arg0 > Static246.anInt4606 - 2) {
			return;
		}
		if (!Static16.method287() && !Static247.method4078(arg2, arg0, Static77.anInt1421, arg1)) {
			return;
		}
		if (Static39.aClass187ArrayArrayArray1 == null) {
			return;
		}
		@Pc(45) int local45 = arg1;
		if (arg1 < 3 && Static222.method3934(arg2, arg0)) {
			local45 = arg1 + 1;
		}
		Static54.method947(arg4, Static289.aClass81_7, arg0, local45, arg2, arg1, Static334.aClass27Array1[arg1]);
		if (arg7 < 0) {
			return;
		}
		@Pc(69) boolean local69 = Static293.aBoolean382;
		Static293.aBoolean382 = true;
		Static96.method1743(arg7, arg2, arg1, false, arg0, local45, arg5, false, arg6, arg3, Static289.aClass81_7, Static334.aClass27Array1[arg1]);
		Static293.aBoolean382 = local69;
		return;
	}
}
