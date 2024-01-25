import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!du", name = "i", descriptor = "Lclient!ba;")
	public static Class23 aClass23_5;

	@OriginalMember(owner = "client!du", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray13 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Ljava/lang/Object;")
	public static volatile Object anObject3 = null;

	@OriginalMember(owner = "client!du", name = "g", descriptor = "[I")
	public static final int[] anIntArray123 = new int[3];

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method1877(@OriginalArg(1) String arg0) {
		Static114.method1983("", "", "", 0, arg0, 0);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg5 == arg1 && arg2 == arg8 && arg3 == arg6 && arg4 == arg7) {
			Static95.method1801(arg8, arg3, arg0, arg4, arg5);
			return;
		}
		@Pc(48) int local48 = arg5;
		@Pc(50) int local50 = arg8;
		@Pc(54) int local54 = arg5 * 3;
		@Pc(58) int local58 = arg8 * 3;
		@Pc(62) int local62 = arg1 * 3;
		@Pc(66) int local66 = arg2 * 3;
		@Pc(70) int local70 = arg6 * 3;
		@Pc(74) int local74 = arg7 * 3;
		@Pc(84) int local84 = local62 + arg3 - arg5 - local70;
		@Pc(93) int local93 = local66 + arg4 - local74 - arg8;
		@Pc(102) int local102 = local54 + local70 - local62 - local62;
		@Pc(113) int local113 = local74 + local58 - local66 - local66;
		@Pc(117) int local117 = local62 - local54;
		@Pc(121) int local121 = local66 - local58;
		for (@Pc(123) int local123 = 128; local123 <= 4096; local123 += 128) {
			@Pc(131) int local131 = local123 * local123 >> 12;
			@Pc(137) int local137 = local131 * local123 >> 12;
			@Pc(141) int local141 = local137 * local84;
			@Pc(145) int local145 = local137 * local93;
			@Pc(149) int local149 = local102 * local131;
			@Pc(153) int local153 = local113 * local131;
			@Pc(157) int local157 = local117 * local123;
			@Pc(161) int local161 = local121 * local123;
			@Pc(172) int local172 = arg5 + (local157 + local149 + local141 >> 12);
			@Pc(183) int local183 = (local153 + local145 + local161 >> 12) + arg8;
			Static95.method1801(local50, local172, arg0, local183, local48);
			local50 = local183;
			local48 = local172;
		}
	}
}
