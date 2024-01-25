import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static612 {

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "Ljava/lang/Object;")
	public static Object anObject18;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "Lclient!iv;")
	public static final Class168 aClass168_5 = new Class168("WIP", 2);

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
	public static int anInt8415 = -1;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([F[II[F[IIIIIIBII)V")
	public static void method7247(@OriginalArg(0) float[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg9 + arg2 * arg10;
		@Pc(18) int local18 = arg11 * arg7 + arg6;
		@Pc(23) int local23 = arg2 - arg5;
		@Pc(28) int local28 = arg7 - arg5;
		@Pc(39) int local39;
		@Pc(45) int local45;
		if (arg1 == null) {
			for (local39 = 0; local39 < arg8; local39++) {
				local45 = local11 + arg5;
				while (local11 < local45) {
					arg3[local18++] = arg0[local11++];
				}
				local18 += local28;
				local11 += local23;
			}
		} else if (arg0 == null) {
			for (local39 = 0; local39 < arg8; local39++) {
				local45 = arg5 + local11;
				while (local11 < local45) {
					arg4[local18++] = arg1[local11++];
				}
				local18 += local28;
				local11 += local23;
			}
		} else {
			for (local39 = 0; local39 < arg8; local39++) {
				local45 = local11 + arg5;
				while (local11 < local45) {
					arg4[local18] = arg1[local11];
					arg3[local18++] = arg0[local11++];
				}
				local11 += local23;
				local18 += local28;
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZIIII)V")
	public static void method7250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static117.method5173(Static346.anInt5494, arg1, Static640.anInt10333);
		@Pc(17) int local17 = Static117.method5173(Static346.anInt5494, arg2, Static640.anInt10333);
		@Pc(23) int local23 = Static117.method5173(Static566.anInt9279, arg0, Static392.anInt6753);
		@Pc(29) int local29 = Static117.method5173(Static566.anInt9279, arg4, Static392.anInt6753);
		@Pc(38) int local38 = Static117.method5173(Static346.anInt5494, arg1 + arg3, Static640.anInt10333);
		@Pc(47) int local47 = Static117.method5173(Static346.anInt5494, arg2 - arg3, Static640.anInt10333);
		for (@Pc(54) int local54 = local11; local54 < local38; local54++) {
			Static188.method3208(local29, arg5, local23, Static349.anIntArrayArray71[local54]);
		}
		for (@Pc(70) int local70 = local17; local70 > local47; local70--) {
			Static188.method3208(local29, arg5, local23, Static349.anIntArrayArray71[local70]);
		}
		@Pc(93) int local93 = Static117.method5173(Static566.anInt9279, arg0 + arg3, Static392.anInt6753);
		@Pc(102) int local102 = Static117.method5173(Static566.anInt9279, arg4 - arg3, Static392.anInt6753);
		for (@Pc(104) int local104 = local38; local104 <= local47; local104++) {
			@Pc(110) int[] local110 = Static349.anIntArrayArray71[local104];
			Static188.method3208(local93, arg5, local23, local110);
			Static188.method3208(local29, arg5, local102, local110);
		}
	}
}
