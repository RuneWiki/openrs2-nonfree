import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
	public static int anInt4879 = 0;

	@OriginalMember(owner = "client!fi", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString58 = "";

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
	public static final int[] anIntArray311 = new int[8];

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Z")
	public static boolean aBoolean554 = false;

	@OriginalMember(owner = "client!fi", name = "p", descriptor = "[S")
	public static short[] aShortArray75 = new short[256];

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZBZ)V")
	public static void method3817(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1) {
		if (arg0) {
			Static288.anInt5046--;
			if (Static288.anInt5046 == 0) {
				Static134.anIntArray161 = null;
			}
		}
		if (arg1) {
			Static134.anInt2410--;
			if (Static134.anInt2410 == 0) {
				Static160.anIntArray183 = null;
			}
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3819(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static427.anInt7214 <= arg2 && arg6 <= Static434.anInt7302 && arg5 >= Static289.anInt5053 && arg1 <= Static93.anInt1676) {
			Static295.method4030(arg4, arg6, arg5, arg3, arg0, arg1, arg2);
		} else {
			Static64.method1067(arg1, arg6, arg2, arg3, arg4, arg5, arg0);
		}
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V")
	public static void method3822(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg1 + arg3) / 2;
		@Pc(12) int local12 = arg3;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg1];
		arg2[arg1] = local16;
		@Pc(30) Object local30 = arg0[local10];
		arg0[local10] = arg0[arg1];
		arg0[arg1] = local30;
		@Pc(50) int local50 = ~local16 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(52) int local52 = arg3; local52 < arg1; local52++) {
			if (arg2[local52] < (long) (local52 & local50) + local16) {
				@Pc(69) long local69 = arg2[local52];
				arg2[local52] = arg2[local12];
				arg2[local12] = local69;
				@Pc(83) Object local83 = arg0[local52];
				arg0[local52] = arg0[local12];
				arg0[local12++] = local83;
			}
		}
		arg2[arg1] = arg2[local12];
		arg2[local12] = local16;
		arg0[arg1] = arg0[local12];
		arg0[local12] = local30;
		method3822(arg0, local12 - 1, arg2, arg3);
		method3822(arg0, arg1, arg2, local12 + 1);
	}
}
