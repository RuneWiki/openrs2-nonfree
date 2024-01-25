import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "[Lclient!oq;")
	public static Class2_Sub1[] aClass2_Sub1Array4;

	@OriginalMember(owner = "client!rk", name = "v", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_302 = new Class179(93, 7);

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "Lclient!o;")
	public static final Class246 aClass246_30 = new Class246(7, 0, 1, 1);

	@OriginalMember(owner = "client!rk", name = "A", descriptor = "[J")
	public static final long[] aLongArray21 = new long[32];

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Lclient!sha;Lclient!ha;III)V")
	public static void method7261(@OriginalArg(0) Class321 arg0, @OriginalArg(1) Class132 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(11) int local11 = 63; local11 >= 0; local11--) {
			@Pc(29) int local29 = (local11 & 0x3F) << 10 | 0x3F | 0x380;
			Static144.method2110(true, false);
			@Pc(37) int local37 = Static70.anIntArray71[local29];
			Static557.method7881(false, true);
			arg1.aa(arg3, (arg0.anInt9077 * (63 - local11) >> 6) + arg2, arg0.anInt9103, (arg0.anInt9077 >> 6) + 1, local37, 0);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIBIIIII)V")
	public static void method7263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg6 + arg1;
		@Pc(14) int local14 = arg2 - arg1;
		for (@Pc(21) int local21 = arg6; local21 < local9; local21++) {
			Static270.method3998(arg0, arg4, arg3, Static173.anIntArrayArray15[local21]);
		}
		@Pc(39) int local39 = arg1 + arg4;
		for (@Pc(41) int local41 = arg2; local41 > local14; local41--) {
			Static270.method3998(arg0, arg4, arg3, Static173.anIntArrayArray15[local41]);
		}
		@Pc(62) int local62 = arg3 - arg1;
		for (@Pc(64) int local64 = local9; local64 <= local14; local64++) {
			@Pc(70) int[] local70 = Static173.anIntArrayArray15[local64];
			Static270.method3998(arg0, arg4, local39, local70);
			Static270.method3998(arg5, local39, local62, local70);
			Static270.method3998(arg0, local62, arg3, local70);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Lclient!pu;")
	public static Class277 method7264(@OriginalArg(0) int arg0) {
		return arg0 >= 0 && arg0 < 100 ? Static558.aClass277Array1[arg0] : null;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIIIII)V")
	public static void method7265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = Static154.method2176(arg4, Static292.anInt4921, Static55.anInt4238);
		@Pc(19) int local19 = Static154.method2176(arg0, Static292.anInt4921, Static55.anInt4238);
		@Pc(25) int local25 = Static154.method2176(arg5, Static153.anInt2554, Static502.anInt8456);
		@Pc(31) int local31 = Static154.method2176(arg1, Static153.anInt2554, Static502.anInt8456);
		@Pc(41) int local41 = Static154.method2176(arg4 + arg3, Static292.anInt4921, Static55.anInt4238);
		@Pc(50) int local50 = Static154.method2176(arg0 - arg3, Static292.anInt4921, Static55.anInt4238);
		for (@Pc(52) int local52 = local13; local52 < local41; local52++) {
			Static270.method3998(arg2, local25, local31, Static173.anIntArrayArray15[local52]);
		}
		for (@Pc(76) int local76 = local19; local76 > local50; local76--) {
			Static270.method3998(arg2, local25, local31, Static173.anIntArrayArray15[local76]);
		}
		@Pc(105) int local105 = Static154.method2176(arg5 + arg3, Static153.anInt2554, Static502.anInt8456);
		@Pc(113) int local113 = Static154.method2176(arg1 - arg3, Static153.anInt2554, Static502.anInt8456);
		for (@Pc(115) int local115 = local41; local115 <= local50; local115++) {
			@Pc(121) int[] local121 = Static173.anIntArrayArray15[local115];
			Static270.method3998(arg2, local25, local105, local121);
			Static270.method3998(arg2, local113, local31, local121);
		}
	}
}
