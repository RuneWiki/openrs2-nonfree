import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!om", name = "d", descriptor = "Lclient!m;")
	public static final Class127 aClass127_22 = new Class127();

	@OriginalMember(owner = "client!om", name = "f", descriptor = "I")
	public static int anInt4582 = 127;

	@OriginalMember(owner = "client!om", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray41 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!om", name = "h", descriptor = "I")
	public static int anInt4583 = 0;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ir;I)V")
	public static void method3901(@OriginalArg(0) Class100 arg0) {
		Static230.aClass100_124 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)V")
	public static void method3902(@OriginalArg(1) int arg0) {
		Static248.anInt4862 = arg0;
		@Pc(7) Class198 local7 = Static161.aClass198_25;
		synchronized (Static161.aClass198_25) {
			Static161.aClass198_25.method5236();
		}
		local7 = Static175.aClass198_28;
		synchronized (Static175.aClass198_28) {
			Static175.aClass198_28.method5236();
		}
		local7 = Static278.aClass198_51;
		synchronized (Static278.aClass198_51) {
			Static278.aClass198_51.method5236();
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BIIIII)V")
	public static void method3903(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(46) int local46 = local17 - local25 * (local29 - 1);
		@Pc(50) int local50 = local13 << 2;
		@Pc(54) int local54 = local17 << 2;
		@Pc(62) int local62 = local21 * 3;
		@Pc(70) int local70 = ((arg4 << 1) - 3) * local25;
		@Pc(76) int local76 = local54;
		@Pc(82) int local82 = local50 * (arg4 - 1);
		Static162.method1731(arg3 + arg1, Static196.anIntArrayArray37[arg0], arg3 - arg1, arg2);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local62;
					local46 += local76;
					local76 += local54;
					local7++;
					local62 += local54;
				}
			}
			if (local46 < 0) {
				local46 += local76;
				local38 += local62;
				local7++;
				local76 += local54;
				local62 += local54;
			}
			local38 += -local82;
			local46 += -local70;
			local82 -= local50;
			local9--;
			local70 -= local50;
			@Pc(174) int local174 = arg0 - local9;
			@Pc(178) int local178 = local9 + arg0;
			@Pc(182) int local182 = local7 + arg3;
			@Pc(187) int local187 = arg3 - local7;
			Static162.method1731(local182, Static196.anIntArrayArray37[local174], local187, arg2);
			Static162.method1731(local182, Static196.anIntArrayArray37[local178], local187, arg2);
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Lclient!kb;")
	public static Class72 method3904() {
		try {
			return (Class72) Class.forName("Class72_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
