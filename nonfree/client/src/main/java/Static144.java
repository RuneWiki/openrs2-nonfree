import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!faa", name = "k", descriptor = "Lclient!nca;")
	public static final Class228 aClass228_1 = new Class228("LIVE", 0);

	@OriginalMember(owner = "client!faa", name = "l", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIZIII)V")
	public static void method2652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg2 * arg2;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(37) int local37 = (1 - local29) * local13 + local21;
		@Pc(45) int local45 = local17 - (local29 - 1) * local25;
		@Pc(49) int local49 = local13 << 2;
		@Pc(53) int local53 = local17 << 2;
		@Pc(61) int local61 = local21 * 3;
		@Pc(74) int local74 = ((arg4 << 1) - 3) * local25;
		@Pc(80) int local80 = local53;
		@Pc(86) int local86 = local49 * (arg4 - 1);
		@Pc(109) int local109;
		@Pc(118) int local118;
		if (Static11.anInt9803 <= arg1 && Static149.anInt2949 >= arg1) {
			local109 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg0 + arg2);
			local118 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg0 - arg2);
			Static611.method8472(local109, local118, Static460.anIntArrayArray53[arg1], arg3);
		}
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local37 += local61;
					local45 += local80;
					local61 += local53;
					local80 += local53;
					local7++;
				}
			}
			if (local45 < 0) {
				local37 += local61;
				local45 += local80;
				local61 += local53;
				local80 += local53;
				local7++;
			}
			local37 += -local86;
			local45 += -local74;
			local74 -= local49;
			local86 -= local49;
			local9--;
			local109 = arg1 - local9;
			local118 = local9 + arg1;
			if (Static11.anInt9803 <= local118 && Static149.anInt2949 >= local109) {
				@Pc(212) int local212 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, local7 + arg0);
				@Pc(221) int local221 = Static269.method4423(Static630.anInt10099, Static16.anInt4339, arg0 - local7);
				if (local109 >= Static11.anInt9803) {
					Static611.method8472(local212, local221, Static460.anIntArrayArray53[local109], arg3);
				}
				if (local118 <= Static149.anInt2949) {
					Static611.method8472(local212, local221, Static460.anIntArrayArray53[local118], arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)V")
	public static void method2656() {
		if (Static103.method2142(Static485.anInt8420) || Static365.method5961(Static485.anInt8420)) {
			Static629.method8651(Static20.anInt824 >> 12, 5000, Static611.anInt9892 >> 12);
		} else {
			@Pc(20) int local20 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray310[0] >> 3;
			@Pc(27) int local27 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anIntArray309[0] >> 3;
			if (local20 >= 0 && Static634.anInt10129 >> 3 > local20 && local27 >= 0 && Static638.anInt10172 >> 3 > local27) {
				Static629.method8651(local27, 5000, local20);
			} else {
				Static629.method8651(Static638.anInt10172 >> 4, 0, Static634.anInt10129 >> 4);
			}
		}
		Static240.method8606();
		Static477.method7146();
		Static198.method7519();
		Static381.method6150();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IZ)I")
	public static int method2658(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
