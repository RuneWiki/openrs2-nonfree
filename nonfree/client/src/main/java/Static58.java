import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!dm", name = "t", descriptor = "Lclient!ak;")
	public static Class7 aClass7_58;

	@OriginalMember(owner = "client!dm", name = "Q", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray7;

	@OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
	public static int anInt1227;

	@OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
	public static int anInt1223 = 0;

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)J")
	public static long method998() {
		return Static247.aClass30_1.method4522();
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBII)I")
	public static int method999(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) int local18 = arg2 & 0x3;
		if (local18 == 0) {
			return arg0;
		} else if (local18 == 1) {
			return arg1;
		} else if (local18 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg1;
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIII)V")
	public static void method1000(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(13) int local13 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg0);
		@Pc(21) int local21 = Static45.method818(Static284.anInt5643, Static24.anInt556, arg2);
		@Pc(27) int local27 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg4);
		@Pc(33) int local33 = Static45.method818(Static28.anInt606, Static245.anInt1237, arg1);
		for (@Pc(35) int local35 = local13; local35 <= local21; local35++) {
			Static288.method4405(arg3, local33, local27, Static151.anIntArrayArray26[local35]);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IBI)V")
	public static void method1001(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub2_Sub11 local8 = Static163.method3579(13, arg0);
		local8.method1859();
		local8.anInt2282 = arg1;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[I[III)V")
	public static void method1007(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(21) int local21 = arg3;
		@Pc(27) int local27 = (arg3 + arg0) / 2;
		@Pc(31) int local31 = arg1[local27];
		arg1[local27] = arg1[arg0];
		arg1[arg0] = local31;
		@Pc(45) int local45 = arg2[local27];
		arg2[local27] = arg2[arg0];
		arg2[arg0] = local45;
		for (@Pc(57) int local57 = arg3; local57 < arg0; local57++) {
			if (arg1[local57] > (local57 & 0x1) + local31) {
				@Pc(77) int local77 = arg1[local57];
				arg1[local57] = arg1[local21];
				arg1[local21] = local77;
				@Pc(91) int local91 = arg2[local57];
				arg2[local57] = arg2[local21];
				arg2[local21++] = local91;
			}
		}
		arg1[arg0] = arg1[local21];
		arg1[local21] = local31;
		arg2[arg0] = arg2[local21];
		arg2[local21] = local45;
		method1007(local21 - 1, arg1, arg2, arg3);
		method1007(arg0, arg1, arg2, local21 + 1);
	}
}
