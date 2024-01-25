import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
	public static int anInt2718;

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "J")
	public static long aLong79;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject13;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "[I")
	public static final int[] anIntArray241 = new int[1000];

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2476(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(14) int local14 = arg4;
		@Pc(16) int local16 = 0;
		@Pc(21) int local21 = arg5 - arg0;
		@Pc(26) int local26 = arg4 - arg0;
		@Pc(30) int local30 = arg5 * arg5;
		@Pc(34) int local34 = arg4 * arg4;
		@Pc(38) int local38 = local21 * local21;
		@Pc(42) int local42 = local26 * local26;
		@Pc(46) int local46 = local34 << 1;
		@Pc(50) int local50 = local30 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg4 << 1;
		@Pc(66) int local66 = local26 << 1;
		@Pc(74) int local74 = local46 + local30 * (1 - local62);
		@Pc(83) int local83 = local34 - (local62 - 1) * local50;
		@Pc(93) int local93 = (1 - local66) * local38 + local54;
		@Pc(102) int local102 = local42 - local58 * (local66 - 1);
		@Pc(106) int local106 = local30 << 2;
		@Pc(110) int local110 = local34 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = local50 * (local62 - 3);
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = local58 * (local66 - 3);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = local106 * (arg4 - 1);
		@Pc(148) int local148 = local118;
		@Pc(154) int local154 = (local26 - 1) * local114;
		@Pc(158) int[] local158 = Static176.anIntArrayArray28[arg6];
		Static337.method5150(arg1 - local21, arg2, arg1 - arg5, local158);
		Static337.method5150(arg1 + local21, arg3, arg1 - local21, local158);
		Static337.method5150(arg1 + arg5, arg2, local21 + arg1, local158);
		while (local14 > 0) {
			@Pc(198) boolean local198 = local14 <= local26;
			if (local198) {
				if (local93 < 0) {
					while (local93 < 0) {
						local102 += local148;
						local93 += local132;
						local148 += local118;
						local132 += local118;
						local16++;
					}
				}
				if (local102 < 0) {
					local93 += local132;
					local102 += local148;
					local132 += local118;
					local148 += local118;
					local16++;
				}
				local93 += -local154;
				local102 += -local138;
				local138 -= local114;
				local154 -= local114;
			}
			if (local74 < 0) {
				while (local74 < 0) {
					local83 += local140;
					local74 += local122;
					local140 += local110;
					local122 += local110;
					local7++;
				}
			}
			if (local83 < 0) {
				local83 += local140;
				local74 += local122;
				local7++;
				local140 += local110;
				local122 += local110;
			}
			local74 += -local146;
			local83 += -local128;
			local146 -= local106;
			local14--;
			local128 -= local106;
			@Pc(329) int local329 = arg6 - local14;
			@Pc(333) int local333 = arg6 + local14;
			@Pc(337) int local337 = local7 + arg1;
			@Pc(342) int local342 = arg1 - local7;
			if (local198) {
				@Pc(349) int local349 = arg1 + local16;
				@Pc(354) int local354 = arg1 - local16;
				Static337.method5150(local354, arg2, local342, Static176.anIntArrayArray28[local329]);
				Static337.method5150(local349, arg3, local354, Static176.anIntArrayArray28[local329]);
				Static337.method5150(local337, arg2, local349, Static176.anIntArrayArray28[local329]);
				Static337.method5150(local354, arg2, local342, Static176.anIntArrayArray28[local333]);
				Static337.method5150(local349, arg3, local354, Static176.anIntArrayArray28[local333]);
				Static337.method5150(local337, arg2, local349, Static176.anIntArrayArray28[local333]);
			} else {
				Static337.method5150(local337, arg2, local342, Static176.anIntArrayArray28[local329]);
				Static337.method5150(local337, arg2, local342, Static176.anIntArrayArray28[local333]);
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII[BI)Z")
	public static boolean method2477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class3_Sub11 local12 = new Class3_Sub11(arg3);
		@Pc(14) int local14 = -1;
		label68: while (true) {
			@Pc(18) int local18 = local12.method3089();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(94) Class23 local94;
				do {
					@Pc(67) int local67;
					@Pc(71) int local71;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local31) {
										local39 = local12.method3138();
										if (local39 == 0) {
											continue label68;
										}
										local12.method3118();
									}
									local39 = local12.method3138();
									if (local39 == 0) {
										continue label68;
									}
									local29 += local39 - 1;
									@Pc(51) int local51 = local29 & 0x3F;
									@Pc(57) int local57 = local29 >> 6 & 0x3F;
									local63 = local12.method3118() >> 2;
									local67 = arg2 + local57;
									local71 = arg1 + local51;
								} while (local67 <= 0);
							} while (local71 <= 0);
						} while (arg0 - 1 <= local67);
					} while (arg4 - 1 <= local71);
					local94 = Static476.aClass69_5.method2181(local14);
				} while (local63 == 22 && !Static278.aClass3_Sub13_Sub1_1.aBoolean413 && local94.anInt772 == 0 && local94.anInt770 != 1 && !local94.aBoolean67);
				local31 = true;
				if (!local94.method585()) {
					Static49.anInt1056++;
					local7 = false;
				}
			}
		}
	}
}
