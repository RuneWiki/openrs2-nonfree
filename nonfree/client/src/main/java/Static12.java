import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!b", name = "h", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Z")
	public static boolean aBoolean22 = true;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_74 = Static181.method2795("Service unavailable)3");

	@OriginalMember(owner = "client!b", name = "o", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_75 = aClass83_74;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IJ)Lclient!qe;")
	public static Class83 method296(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			@Pc(29) long local29 = arg0;
			while (local29 != 0L) {
				local29 /= 37L;
				local27++;
			}
			@Pc(48) byte[] local48 = new byte[local27];
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local27--;
				local48[local27] = Static164.aByteArray39[(int) (local52 - arg0 * 37L)];
			}
			@Pc(79) Class83 local79 = new Class83();
			local79.aByteArray36 = local48;
			local79.anInt3158 = local48.length;
			return local79;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	public static void method298() {
		@Pc(11) int local11 = (Static54.aClass24_Sub4_Sub1_1.anInt3349 >> 7) + Static123.anInt2755;
		Static95.anInt2023 = 0;
		@Pc(21) int local21 = (Static54.aClass24_Sub4_Sub1_1.anInt3316 >> 7) + Static2.anInt57;
		if (local21 >= 3053 && local21 <= 3156 && local11 >= 3056 && local11 <= 3136) {
			Static95.anInt2023 = 1;
		}
		if (local21 >= 3072 && local21 <= 3118 && local11 >= 9492 && local11 <= 9535) {
			Static95.anInt2023 = 1;
		}
		if (Static95.anInt2023 == 1 && local21 >= 3139 && local21 <= 3199 && local11 >= 3008 && local11 <= 3062) {
			Static95.anInt2023 = 0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIBII)V")
	public static void method300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(14) int local14 = arg3 - arg1;
		@Pc(16) int local16 = 0;
		@Pc(20) int local20 = arg3 * arg3;
		@Pc(24) int local24 = arg0 * arg0;
		@Pc(29) int local29 = arg0 - arg1;
		@Pc(33) int local33 = local14 * local14;
		@Pc(37) int local37 = local29 * local29;
		@Pc(41) int local41 = local24 << 1;
		@Pc(45) int local45 = local20 << 1;
		@Pc(49) int local49 = local33 << 1;
		@Pc(53) int local53 = local37 << 1;
		@Pc(57) int local57 = arg0 << 1;
		@Pc(66) int local66 = local24 - (local57 - 1) * local45;
		@Pc(70) int local70 = local29 << 1;
		@Pc(79) int local79 = local53 + local33 * (1 - local70);
		@Pc(88) int local88 = local37 - (local70 - 1) * local49;
		@Pc(97) int local97 = local41 + (1 - local57) * local20;
		@Pc(101) int local101 = local20 << 2;
		@Pc(105) int local105 = local33 << 2;
		@Pc(109) int local109 = local37 << 2;
		@Pc(113) int local113 = local41 * 3;
		@Pc(117) int local117 = local24 << 2;
		@Pc(123) int local123 = local45 * (local57 - 3);
		@Pc(127) int local127 = local53 * 3;
		@Pc(133) int local133 = (arg0 - 1) * local101;
		@Pc(139) int local139 = local49 * (local70 - 3);
		@Pc(141) int local141 = local109;
		@Pc(143) int local143 = local117;
		@Pc(149) int local149 = local105 * (local29 - 1);
		@Pc(153) int[] local153 = Static14.anIntArrayArray18[arg2];
		Static22.method438(arg4 - local14, arg5, arg4 - arg3, local153);
		Static22.method438(arg4 + local14, arg6, arg4 - local14, local153);
		Static22.method438(arg4 + arg3, arg5, local14 + arg4, local153);
		while (local9 > 0) {
			if (local97 < 0) {
				while (local97 < 0) {
					local66 += local143;
					local97 += local113;
					local113 += local117;
					local143 += local117;
					local7++;
				}
			}
			if (local66 < 0) {
				local7++;
				local66 += local143;
				local143 += local117;
				local97 += local113;
				local113 += local117;
			}
			@Pc(245) boolean local245 = local29 >= local9;
			local97 += -local133;
			local9--;
			if (local245) {
				if (local79 < 0) {
					while (local79 < 0) {
						local16++;
						local79 += local127;
						local88 += local141;
						local127 += local109;
						local141 += local109;
					}
				}
				if (local88 < 0) {
					local79 += local127;
					local127 += local109;
					local16++;
					local88 += local141;
					local141 += local109;
				}
				local79 += -local149;
				local149 -= local105;
				local88 += -local139;
				local139 -= local105;
			}
			local133 -= local101;
			local66 += -local123;
			@Pc(330) int local330 = arg2 - local9;
			local123 -= local101;
			@Pc(338) int local338 = local9 + arg2;
			@Pc(342) int local342 = arg4 + local7;
			@Pc(347) int local347 = arg4 - local7;
			if (local245) {
				@Pc(354) int local354 = arg4 - local16;
				@Pc(358) int local358 = local16 + arg4;
				Static22.method438(local354, arg5, local347, Static14.anIntArrayArray18[local330]);
				Static22.method438(local358, arg6, local354, Static14.anIntArrayArray18[local330]);
				Static22.method438(local342, arg5, local358, Static14.anIntArrayArray18[local330]);
				Static22.method438(local354, arg5, local347, Static14.anIntArrayArray18[local338]);
				Static22.method438(local358, arg6, local354, Static14.anIntArrayArray18[local338]);
				Static22.method438(local342, arg5, local358, Static14.anIntArrayArray18[local338]);
			} else {
				Static22.method438(local342, arg5, local347, Static14.anIntArrayArray18[local330]);
				Static22.method438(local342, arg5, local347, Static14.anIntArrayArray18[local338]);
			}
		}
	}
}
