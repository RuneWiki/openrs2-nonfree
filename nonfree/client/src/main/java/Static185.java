import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	public static int anInt3844;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray12;

	@OriginalMember(owner = "client!s", name = "p", descriptor = "[I")
	public static int[] anIntArray433;

	@OriginalMember(owner = "client!s", name = "q", descriptor = "[Lclient!hh;")
	public static Class50[] aClass50Array72;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1242 = Static186.method3527("purple:");

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1241 = aClass50_1242;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	public static int anInt3842 = 0;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "[I")
	public static int[] anIntArray431 = new int[5];

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	public static int anInt3845 = 1;

	@OriginalMember(owner = "client!s", name = "j", descriptor = "I")
	public static int anInt3847 = 0;

	@OriginalMember(owner = "client!s", name = "k", descriptor = "I")
	public static int anInt3848 = 0;

	@OriginalMember(owner = "client!s", name = "l", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1243 = aClass50_1242;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)Z")
	public static boolean method3082(@OriginalArg(0) int arg0) {
		return (arg0 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
	public static void method3083(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static1.method31(arg0)) {
			return;
		}
		@Pc(19) Class93[] local19 = Static54.aClass93ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local19.length; local21++) {
			@Pc(27) Class93 local27 = local19[local21];
			if (local27.anObjectArray14 != null) {
				@Pc(34) Class1_Sub29 local34 = new Class1_Sub29();
				local34.aClass93_119 = local27;
				local34.anObjectArray33 = local27.anObjectArray14;
				Static63.method973(local34, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg4 && arg3 == arg5 && arg7 == arg1 && arg6 == arg2) {
			Static219.method2422(arg0, arg1, arg3, arg8, arg2);
			return;
		}
		@Pc(28) int local28 = arg0;
		@Pc(30) int local30 = arg3;
		@Pc(34) int local34 = arg0 * 3;
		@Pc(38) int local38 = arg3 * 3;
		@Pc(42) int local42 = arg4 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg7 * 3;
		@Pc(60) int local60 = arg1 + local42 - arg0 - local50;
		@Pc(64) int local64 = arg6 * 3;
		@Pc(75) int local75 = arg2 + local46 - arg3 - local64;
		@Pc(86) int local86 = local50 + local34 - local42 - local42;
		@Pc(96) int local96 = local64 + local38 - local46 - local46;
		@Pc(101) int local101 = local42 - local34;
		@Pc(106) int local106 = local46 - local38;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local108 * local116 >> 12;
			@Pc(126) int local126 = local60 * local122;
			@Pc(130) int local130 = local86 * local116;
			@Pc(134) int local134 = local116 * local96;
			@Pc(138) int local138 = local75 * local122;
			@Pc(142) int local142 = local106 * local108;
			@Pc(146) int local146 = local101 * local108;
			@Pc(156) int local156 = (local138 + local134 + local142 >> 12) + arg3;
			@Pc(167) int local167 = arg0 + (local130 + local126 + local146 >> 12);
			Static219.method2422(local28, local167, local30, arg8, local156);
			local28 = local167;
			local30 = local156;
		}
	}

	@OriginalMember(owner = "client!s", name = "c", descriptor = "(II)V")
	public static void method3086() {
		Static150.aClass84_25.method2577(50);
		Static111.aClass84_22.method2577(50);
		Static199.aClass84_33.method2577(50);
	}
}
