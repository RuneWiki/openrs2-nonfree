import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!vf", name = "Q", descriptor = "Lclient!nf;")
	public static Class69_Sub1 aClass69_Sub1_149;

	@OriginalMember(owner = "client!vf", name = "cb", descriptor = "Lclient!vc;")
	public static Class98 aClass98_20;

	@OriginalMember(owner = "client!vf", name = "X", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1275 = Static81.method1507("Versteckt");

	@OriginalMember(owner = "client!vf", name = "Y", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1276 = Static81.method1507("gelb:");

	@OriginalMember(owner = "client!vf", name = "Z", descriptor = "I")
	public static int anInt4471 = 0;

	@OriginalMember(owner = "client!vf", name = "bb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1277 = Static81.method1507("sch-Utteln:");

	@OriginalMember(owner = "client!vf", name = "db", descriptor = "I")
	public static int anInt4473 = 127;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V")
	public static void method3375(@OriginalArg(0) int arg0) {
		Static3.anInt118 = arg0;
		Static49.anInt1247 = -1;
		Static49.anInt1247 = -1;
		Static137.method2410();
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!dj;IILclient!dj;)V")
	public static void method3377(@OriginalArg(0) Class24 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class24 arg2) {
		Static166.method2829(null, arg2, arg1, arg0, -1);
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZJII)Lclient!dj;")
	public static Class24 method3378(@OriginalArg(1) long arg0) {
		@Pc(32) long local32 = arg0 / (long) 10;
		@Pc(34) int local34 = 1;
		while (local32 != 0L) {
			local32 /= 10;
			local34++;
		}
		@Pc(50) int local50 = local34;
		if (arg0 < 0L) {
			local50 = local34 + 1;
		}
		@Pc(60) byte[] local60 = new byte[local50];
		if (arg0 < 0L) {
			local60[0] = 45;
		}
		for (@Pc(78) int local78 = 0; local78 < local34; local78++) {
			@Pc(86) int local86 = (int) (arg0 % (long) 10);
			arg0 /= 10;
			if (local86 < 0) {
				local86 = -local86;
			}
			if (local86 > 9) {
				local86 += 39;
			}
			local60[local50 - local78 - 1] = (byte) (local86 + 48);
		}
		@Pc(124) Class24 local124 = new Class24();
		local124.anInt1084 = local50;
		local124.aByteArray13 = local60;
		return local124;
	}

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)V")
	public static void method3379() {
		@Pc(1) Object local1 = Static119.anObject1;
		synchronized (Static119.anObject1) {
			if (Static52.anInt1336 == 0) {
				Static76.aClass99_1.method3421(5, new Class95());
			}
			Static52.anInt1336 = 600;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = arg4;
		@Pc(16) int local16 = arg6 - arg5;
		@Pc(21) int local21 = arg4 - arg5;
		@Pc(25) int local25 = arg6 * arg6;
		@Pc(29) int local29 = arg4 * arg4;
		@Pc(33) int local33 = local21 * local21;
		@Pc(37) int local37 = local29 << 1;
		@Pc(41) int local41 = local16 * local16;
		@Pc(45) int local45 = local25 << 1;
		@Pc(49) int local49 = local33 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local21 << 1;
		@Pc(61) int local61 = arg4 << 1;
		@Pc(70) int local70 = local25 * (1 - local61) + local37;
		@Pc(79) int local79 = (1 - local57) * local41 + local49;
		@Pc(83) int local83 = local29 << 2;
		@Pc(92) int local92 = local29 - (local61 - 1) * local45;
		@Pc(96) int local96 = local25 << 2;
		@Pc(100) int local100 = local41 << 2;
		@Pc(109) int local109 = local33 - (local57 - 1) * local53;
		@Pc(113) int local113 = local33 << 2;
		@Pc(119) int local119 = (local61 - 3) * local45;
		@Pc(123) int local123 = local37 * 3;
		@Pc(125) int local125 = local83;
		@Pc(131) int local131 = (arg4 - 1) * local96;
		@Pc(135) int local135 = local49 * 3;
		@Pc(141) int local141 = local53 * (local57 - 3);
		@Pc(147) int local147 = (local21 - 1) * local100;
		@Pc(155) int local155 = local113;
		@Pc(159) int[] local159 = Static98.anIntArrayArray16[arg3];
		Static39.method731(local159, arg0 - arg6, -local16 + arg0, arg1);
		Static39.method731(local159, arg0 - local16, local16 + arg0, arg2);
		Static39.method731(local159, local16 + arg0, arg0 - -arg6, arg1);
		while (local11 > 0) {
			@Pc(209) boolean local209 = local11 <= local21;
			if (local209) {
				if (local79 < 0) {
					while (local79 < 0) {
						local79 += local135;
						local9++;
						local109 += local155;
						local135 += local113;
						local155 += local113;
					}
				}
				if (local109 < 0) {
					local9++;
					local79 += local135;
					local135 += local113;
					local109 += local155;
					local155 += local113;
				}
				local79 += -local147;
				local147 -= local100;
				local109 += -local141;
				local141 -= local100;
			}
			if (local70 < 0) {
				while (local70 < 0) {
					local92 += local125;
					local125 += local83;
					local70 += local123;
					local3++;
					local123 += local83;
				}
			}
			local11--;
			if (local92 < 0) {
				local92 += local125;
				local125 += local83;
				local3++;
				local70 += local123;
				local123 += local83;
			}
			local70 += -local131;
			@Pc(335) int local335 = local11 + arg3;
			local131 -= local96;
			local92 += -local119;
			@Pc(349) int local349 = arg3 - local11;
			@Pc(354) int local354 = arg0 - local3;
			local119 -= local96;
			@Pc(362) int local362 = local3 + arg0;
			if (local209) {
				@Pc(389) int local389 = arg0 + local9;
				@Pc(393) int local393 = arg0 - local9;
				Static39.method731(Static98.anIntArrayArray16[local349], local354, local393, arg1);
				Static39.method731(Static98.anIntArrayArray16[local349], local393, local389, arg2);
				Static39.method731(Static98.anIntArrayArray16[local349], local389, local362, arg1);
				Static39.method731(Static98.anIntArrayArray16[local335], local354, local393, arg1);
				Static39.method731(Static98.anIntArrayArray16[local335], local393, local389, arg2);
				Static39.method731(Static98.anIntArrayArray16[local335], local389, local362, arg1);
			} else {
				Static39.method731(Static98.anIntArrayArray16[local349], local354, local362, arg1);
				Static39.method731(Static98.anIntArrayArray16[local335], local354, local362, arg1);
			}
		}
	}
}
