import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!al", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray1;

	@OriginalMember(owner = "client!al", name = "u", descriptor = "[J")
	public static long[] aLongArray1;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_8 = new Class185(4, 6);

	@OriginalMember(owner = "client!al", name = "t", descriptor = "[I")
	public static final int[] anIntArray20 = new int[500];

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(BIIII)V")
	public static void method598(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(12) int local12 = -arg2;
		@Pc(14) int local14 = -1;
		Static571.method7990(arg1, Static173.anIntArrayArray15[arg3], arg0 - arg2, arg0 + arg2);
		while (local7 < local9) {
			local14 += 2;
			local12 += local14;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(51) int[] local51 = Static173.anIntArrayArray15[arg3 + local9];
				@Pc(57) int[] local57 = Static173.anIntArrayArray15[arg3 - local9];
				@Pc(61) int local61 = local7 + arg0;
				@Pc(66) int local66 = arg0 - local7;
				Static571.method7990(arg1, local51, local66, local61);
				Static571.method7990(arg1, local57, local66, local61);
			}
			@Pc(82) int local82 = local9 + arg0;
			@Pc(87) int local87 = arg0 - local9;
			@Pc(93) int[] local93 = Static173.anIntArrayArray15[arg3 + local7];
			@Pc(100) int[] local100 = Static173.anIntArrayArray15[arg3 - local7];
			Static571.method7990(arg1, local93, local87, local82);
			Static571.method7990(arg1, local100, local87, local82);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(JJ)J")
	public static long method600(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V")
	public static void method602() {
		if (Static356.anInt6904 <= 1) {
			Static87.aClass6_Sub33_6.method4996(2, Static87.aClass6_Sub33_6.aClass14_Sub21_1);
		} else {
			Static87.aClass6_Sub33_6.method4996(4, Static87.aClass6_Sub33_6.aClass14_Sub21_1);
		}
	}
}
