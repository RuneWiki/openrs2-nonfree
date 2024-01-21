import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "[I")
	public static int[] anIntArray84;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_360 = Static151.method2243("Jan");

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_370 = Static151.method2243("Please try using a different world)3");

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "Lclient!mb;")
	public static Class62 aClass62_361 = aClass62_370;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_362 = Static151.method2243("May");

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "Lclient!mb;")
	public static Class62 aClass62_363 = aClass62_370;

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_364 = Static151.method2243("Aug");

	@OriginalMember(owner = "client!fc", name = "i", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_365 = Static151.method2243("Jun");

	@OriginalMember(owner = "client!fc", name = "I", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_380 = Static151.method2243("Feb");

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_377 = Static151.method2243("Mar");

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_379 = Static151.method2243("Apr");

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_369 = Static151.method2243("Jul");

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_367 = Static151.method2243("Sep");

	@OriginalMember(owner = "client!fc", name = "k", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_366 = Static151.method2243("Oct");

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_368 = Static151.method2243("Nov");

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_375 = Static151.method2243("Dec");

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array30 = new Class62[] { aClass62_360, aClass62_380, aClass62_377, aClass62_379, aClass62_362, aClass62_365, aClass62_369, aClass62_364, aClass62_367, aClass62_366, aClass62_368, aClass62_375 };

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!mb;")
	public static Class62 aClass62_371 = aClass62_370;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!mb;")
	public static Class62 aClass62_372 = aClass62_370;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_373 = Static151.method2243("Service unavailable)3");

	@OriginalMember(owner = "client!fc", name = "t", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_374 = aClass62_373;

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "[I")
	public static final int[] anIntArray85 = new int[50];

	@OriginalMember(owner = "client!fc", name = "D", descriptor = "Lclient!mb;")
	public static Class62 aClass62_376 = aClass62_370;

	@OriginalMember(owner = "client!fc", name = "G", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_378 = Static151.method2243("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "Lclient!mb;")
	public static Class62 aClass62_381 = aClass62_370;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIII)I")
	public static int method775(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIBIIIIII)V")
	public static void method777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg8 == arg7 && arg2 == arg4 && arg6 == arg5 && arg3 == arg1) {
			Static194.method2778(arg0, arg1, arg2, arg6, arg7);
			return;
		}
		@Pc(35) int local35 = arg7;
		@Pc(37) int local37 = arg2;
		@Pc(41) int local41 = arg2 * 3;
		@Pc(45) int local45 = arg7 * 3;
		@Pc(49) int local49 = arg8 * 3;
		@Pc(53) int local53 = arg4 * 3;
		@Pc(57) int local57 = arg5 * 3;
		@Pc(61) int local61 = arg3 * 3;
		@Pc(71) int local71 = local49 + arg6 - arg7 - local57;
		@Pc(80) int local80 = arg1 + local53 - local61 - arg2;
		@Pc(90) int local90 = local57 + local45 - local49 - local49;
		@Pc(99) int local99 = local41 + local61 - local53 - local53;
		@Pc(103) int local103 = local49 - local45;
		@Pc(108) int local108 = local53 - local41;
		for (@Pc(110) int local110 = 128; local110 <= 4096; local110 += 128) {
			@Pc(118) int local118 = local110 * local110 >> 12;
			@Pc(124) int local124 = local110 * local118 >> 12;
			@Pc(128) int local128 = local124 * local80;
			@Pc(132) int local132 = local99 * local118;
			@Pc(136) int local136 = local71 * local124;
			@Pc(140) int local140 = local103 * local110;
			@Pc(144) int local144 = local90 * local118;
			@Pc(148) int local148 = local110 * local108;
			@Pc(161) int local161 = arg7 + (local136 + local144 + local140 >> 12);
			@Pc(173) int local173 = (local128 + local132 + local148 >> 12) + arg2;
			Static194.method2778(arg0, local173, local37, local161, local35);
			local35 = local161;
			local37 = local173;
		}
	}
}
