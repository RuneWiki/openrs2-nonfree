import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fa", name = "r", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_555 = Static193.method3027("::fpsoff");

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!ri;")
	public static final Class85 aClass85_8 = new Class85(64);

	@OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
	public static int anInt1129 = 0;

	@OriginalMember(owner = "client!fa", name = "y", descriptor = "I")
	public static int anInt1131 = 0;

	@OriginalMember(owner = "client!fa", name = "z", descriptor = "[I")
	public static final int[] anIntArray63 = new int[50];

	@OriginalMember(owner = "client!fa", name = "B", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_556 = Static193.method3027("sl_stars");

	@OriginalMember(owner = "client!fa", name = "D", descriptor = "Z")
	public static boolean aBoolean71 = false;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)I")
	public static int method841(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local9 * local32 >> 12;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method842(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg4 == arg2 && arg6 == arg7 && arg3 == arg0 && arg5 == arg8) {
			Static131.method1839(arg5, arg0, arg1, arg6, arg4);
			return;
		}
		@Pc(32) int local32 = arg6;
		@Pc(34) int local34 = arg4;
		@Pc(38) int local38 = arg4 * 3;
		@Pc(42) int local42 = arg6 * 3;
		@Pc(46) int local46 = arg7 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg3 * 3;
		@Pc(58) int local58 = arg2 * 3;
		@Pc(67) int local67 = local58 + arg0 - local54 - arg4;
		@Pc(78) int local78 = arg5 + local46 - arg6 - local50;
		@Pc(88) int local88 = local54 + local38 - local58 - local58;
		@Pc(97) int local97 = local42 + local50 - local46 - local46;
		@Pc(102) int local102 = local58 - local38;
		@Pc(107) int local107 = local46 - local42;
		for (@Pc(109) int local109 = 128; local109 <= 4096; local109 += 128) {
			@Pc(117) int local117 = local109 * local109 >> 12;
			@Pc(123) int local123 = local109 * local117 >> 12;
			@Pc(127) int local127 = local123 * local67;
			@Pc(131) int local131 = local88 * local117;
			@Pc(135) int local135 = local117 * local97;
			@Pc(139) int local139 = local102 * local109;
			@Pc(143) int local143 = local109 * local107;
			@Pc(147) int local147 = local123 * local78;
			@Pc(157) int local157 = (local143 + local147 + local135 >> 12) + arg6;
			@Pc(167) int local167 = arg4 + (local139 + local127 + local131 >> 12);
			Static131.method1839(local157, local167, arg1, local32, local34);
			local34 = local167;
			local32 = local157;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BII)I")
	public static int method843(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub7 local10 = (Class3_Sub7) Static145.aClass40_10.method1029((long) arg1);
		if (local10 == null) {
			return 0;
		} else if (arg0 >= 0 && local10.anIntArray62.length > arg0) {
			return local10.anIntArray62[arg0];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V")
	public static void method845() {
		Static126.aClass85_26.method2557();
	}
}
