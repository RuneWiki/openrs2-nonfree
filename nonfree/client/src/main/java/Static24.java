import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!at", name = "o", descriptor = "Lclient!ov;")
	public static Class226 aClass226_1;

	@OriginalMember(owner = "client!at", name = "v", descriptor = "I")
	public static int anInt539;

	@OriginalMember(owner = "client!at", name = "r", descriptor = "[[I")
	public static final int[][] anIntArrayArray6 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

	@OriginalMember(owner = "client!at", name = "t", descriptor = "Lclient!im;")
	public static final Class140 aClass140_11 = new Class140(61, 2);

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(JI)V")
	public static void method565(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static330.anInt6001 + Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137;
		@Pc(20) int local20 = Static220.anInt4348 + Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141;
		if (Static81.anInt1467 - local10 < -2000 || Static81.anInt1467 - local10 > 2000 || Static69.anInt1327 - local20 < -2000 || Static69.anInt1327 - local20 > 2000) {
			Static69.anInt1327 = local20;
			Static81.anInt1467 = local10;
		}
		@Pc(58) int local58;
		@Pc(66) int local66;
		if (Static81.anInt1467 != local10) {
			local58 = local10 - Static81.anInt1467;
			local66 = (int) (arg0 * (long) local58 / 320L);
			if (local58 <= 0) {
				if (local66 == 0) {
					local66 = -1;
				} else if (local66 < local58) {
					local66 = local58;
				}
			} else if (local66 == 0) {
				local66 = 1;
			} else if (local58 < local66) {
				local66 = local58;
			}
			Static81.anInt1467 += local66;
		}
		if (!Static544.aClass1_Sub22_Sub1_1.aBoolean389) {
			Static404.aFloat156 += (float) arg0 * Static71.aFloat15 / 6.0F;
			Static50.aFloat13 += (float) arg0 * Static285.aFloat109 / 6.0F;
		}
		if (Static69.anInt1327 != local20) {
			local58 = local20 - Static69.anInt1327;
			local66 = (int) ((long) local58 * arg0 / 320L);
			if (local58 <= 0) {
				if (local66 == 0) {
					local66 = -1;
				} else if (local58 > local66) {
					local66 = local58;
				}
			} else if (local66 == 0) {
				local66 = 1;
			} else if (local66 > local58) {
				local66 = local58;
			}
			Static69.anInt1327 += local66;
		}
		Static486.method6644();
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([BI)[B")
	public static byte[] method567(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static551.method3488(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIZII)V")
	public static void method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg3 - arg4;
		@Pc(14) int local14 = arg1 - arg2;
		if (local14 == 0) {
			if (local9 != 0) {
				Static52.method1028(arg3, arg4, arg0, arg2);
			}
		} else if (local9 == 0) {
			Static108.method1864(arg0, arg2, arg4, arg1);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(71) boolean local71 = local9 > local14;
			@Pc(75) int local75;
			@Pc(77) int local77;
			if (local71) {
				local75 = arg2;
				local77 = arg1;
				arg2 = arg4;
				arg4 = local75;
				arg1 = arg3;
				arg3 = local77;
			}
			if (arg1 < arg2) {
				local75 = arg2;
				local77 = arg4;
				arg2 = arg1;
				arg4 = arg3;
				arg1 = local75;
				arg3 = local77;
			}
			local75 = arg4;
			local77 = arg1 - arg2;
			@Pc(115) int local115 = arg3 - arg4;
			@Pc(120) int local120 = -(local77 >> 1);
			if (local115 < 0) {
				local115 = -local115;
			}
			@Pc(136) int local136 = arg3 > arg4 ? 1 : -1;
			@Pc(140) int local140;
			if (local71) {
				for (local140 = arg2; local140 <= arg1; local140++) {
					Static447.anIntArrayArray99[local140][local75] = arg0;
					local120 += local115;
					if (local120 > 0) {
						local120 -= local77;
						local75 += local136;
					}
				}
			} else {
				for (local140 = arg2; local140 <= arg1; local140++) {
					local120 += local115;
					Static447.anIntArrayArray99[local75][local140] = arg0;
					if (local120 > 0) {
						local75 += local136;
						local120 -= local77;
					}
				}
			}
		}
	}
}
