import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "Lclient!mda;")
	public static Class49 aClass49_1;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIII)V")
	public static void method6383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(12) int local12 = -arg3;
		Static188.method3208(arg0 + arg3, arg2, arg0 - arg3, Static349.anIntArrayArray71[arg1]);
		@Pc(31) int local31 = -1;
		while (local9 > local7) {
			local31 += 2;
			local12 += local31;
			local7++;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(54) int[] local54 = Static349.anIntArrayArray71[local9 + arg1];
				@Pc(61) int[] local61 = Static349.anIntArrayArray71[arg1 - local9];
				@Pc(66) int local66 = arg0 + local7;
				@Pc(71) int local71 = arg0 - local7;
				Static188.method3208(local66, arg2, local71, local54);
				Static188.method3208(local66, arg2, local71, local61);
			}
			@Pc(88) int local88 = arg0 + local9;
			@Pc(93) int local93 = arg0 - local9;
			@Pc(100) int[] local100 = Static349.anIntArrayArray71[arg1 + local7];
			@Pc(106) int[] local106 = Static349.anIntArrayArray71[arg1 - local7];
			Static188.method3208(local88, arg2, local93, local100);
			Static188.method3208(local88, arg2, local93, local106);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(IBIIIIII)V")
	public static void method6385(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(10) int local10 = arg5 - arg3;
		@Pc(15) int local15 = arg2 + arg3;
		for (@Pc(17) int local17 = arg2; local17 < local15; local17++) {
			Static188.method3208(arg4, arg6, arg0, Static349.anIntArrayArray71[local17]);
		}
		@Pc(39) int local39 = arg4 - arg3;
		@Pc(43) int local43 = arg3 + arg0;
		for (@Pc(45) int local45 = arg5; local45 > local10; local45--) {
			Static188.method3208(arg4, arg6, arg0, Static349.anIntArrayArray71[local45]);
		}
		for (@Pc(70) int local70 = local15; local70 <= local10; local70++) {
			@Pc(76) int[] local76 = Static349.anIntArrayArray71[local70];
			Static188.method3208(local43, arg6, arg0, local76);
			Static188.method3208(local39, arg1, local43, local76);
			Static188.method3208(arg4, arg6, local39, local76);
		}
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZJ)V")
	public static void method6386(@OriginalArg(1) long arg0) {
		@Pc(11) int local11 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8037 + Static605.anInt10017;
		@Pc(21) int local21 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anInt8034 + Static538.anInt8671;
		if (Static145.anInt3035 - local11 < -2000 || Static145.anInt3035 - local11 > 2000 || Static553.anInt9177 - local21 < -2000 || Static553.anInt9177 - local21 > 2000) {
			Static553.anInt9177 = local21;
			Static145.anInt3035 = local11;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (local11 != Static145.anInt3035) {
			local63 = local11 - Static145.anInt3035;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 > 0) {
				if (local71 == 0) {
					local71 = 1;
				} else if (local63 < local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = -1;
			} else if (local63 > local71) {
				local71 = local63;
			}
			Static145.anInt3035 += local71;
		}
		Static464.aFloat130 += Static431.aFloat131 * (float) arg0 / 6.0F;
		Static225.aFloat85 += (float) arg0 * Static383.aFloat185 / 6.0F;
		if (Static553.anInt9177 != local21) {
			local63 = local21 - Static553.anInt9177;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 > 0) {
				if (local71 == 0) {
					local71 = 1;
				} else if (local63 < local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = -1;
			} else if (local63 > local71) {
				local71 = local63;
			}
			Static553.anInt9177 += local71;
		}
		Static209.method3510();
	}
}
