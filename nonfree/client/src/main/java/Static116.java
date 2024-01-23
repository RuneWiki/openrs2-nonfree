import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public static int anInt5594;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "Lclient!km;")
	public static Class91 aClass91_205;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "Z")
	public static boolean aBoolean450 = true;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString333 = "flash3:";

	@OriginalMember(owner = "client!im", name = "g", descriptor = "I")
	public static int anInt5593 = -1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)I")
	public static int method4438(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ZIIZ)V")
	public static void method4440(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(123) int local123;
		@Pc(113) int local113;
		@Pc(130) int local130;
		@Pc(147) int local147;
		@Pc(162) int local162;
		@Pc(176) int local176;
		for (@Pc(11) int local11 = 0; local11 < Static233.anInt4582; local11++) {
			@Pc(20) Class14_Sub2_Sub2 local20 = Static254.aClass14_Sub2_Sub2Array1[Static281.anIntArray464[local11]];
			if (local20 != null && local20.method3647() && local20.aClass46_1.method1282()) {
				@Pc(36) int local36 = local20.method3656();
				if (arg0) {
					if (!local20.aClass46_1.aBoolean110) {
						continue;
					}
				} else if (local20.aClass46_1.aBoolean113 != arg2 || arg1 != 0 && arg1 != local36) {
					continue;
				}
				if (local36 == 1) {
					if ((local20.anInt4680 & 0x7F) == 64 && (local20.anInt4630 & 0x7F) == 64) {
						local123 = local20.anInt4680 >> 7;
						local113 = local20.anInt4630 >> 7;
						if (local123 >= 0 && local123 < 104 && local113 >= 0 && local113 < 104) {
							local176 = Static225.anIntArrayArray28[local123][local113]++;
						}
					}
				} else if (((local36 & 0x1) != 0 || (local20.anInt4680 & 0x7F) == 0 && (local20.anInt4630 & 0x7F) == 0) && ((local36 & 0x1) != 1 || (local20.anInt4680 & 0x7F) == 64 && (local20.anInt4630 & 0x7F) == 64)) {
					local113 = local20.anInt4630 - local36 * 64 >> 7;
					local123 = local20.anInt4680 - local36 * 64 >> 7;
					local130 = local123 + local20.method3656();
					if (local123 < 0) {
						local123 = 0;
					}
					if (local130 > 104) {
						local130 = 104;
					}
					local147 = local20.method3656() + local113;
					if (local113 < 0) {
						local113 = 0;
					}
					if (local147 > 104) {
						local147 = 104;
					}
					for (local162 = local123; local162 < local130; local162++) {
						for (@Pc(167) int local167 = local113; local167 < local147; local167++) {
							local176 = Static225.anIntArrayArray28[local162][local167]++;
						}
					}
				}
			}
		}
		label210: for (@Pc(241) int local241 = 0; local241 < Static233.anInt4582; local241++) {
			@Pc(254) Class14_Sub2_Sub2 local254 = Static254.aClass14_Sub2_Sub2Array1[Static281.anIntArray464[local241]];
			@Pc(263) long local263 = (long) Static281.anIntArray464[local241] << 32 | 0x20000000L;
			if (local254 != null && local254.method3647() && local254.aClass46_1.method1282()) {
				local123 = local254.method3656();
				if (arg0) {
					if (!local254.aClass46_1.aBoolean110) {
						continue;
					}
				} else if (arg2 != local254.aClass46_1.aBoolean113 || arg1 != 0 && local123 != arg1) {
					continue;
				}
				local254.aBoolean358 = true;
				if (local123 == 1) {
					if ((local254.anInt4680 & 0x7F) == 64 && (local254.anInt4630 & 0x7F) == 64) {
						local113 = local254.anInt4680 >> 7;
						local130 = local254.anInt4630 >> 7;
						if (local113 < 0 || local113 >= 104 || local130 < 0 || local130 >= 104) {
							continue;
						}
						if (Static225.anIntArrayArray28[local113][local130] > 1) {
							local176 = Static225.anIntArrayArray28[local113][local130]--;
							continue;
						}
					}
				} else if ((local123 & 0x1) == 0 && (local254.anInt4680 & 0x7F) == 0 && (local254.anInt4630 & 0x7F) == 0 || (local123 & 0x1) == 1 && (local254.anInt4680 & 0x7F) == 64 && (local254.anInt4630 & 0x7F) == 64) {
					local130 = local254.anInt4630 - local123 * 64 >> 7;
					local113 = local254.anInt4680 - local123 * 64 >> 7;
					local147 = local123 + local113;
					if (local113 < 0) {
						local113 = 0;
					}
					if (local147 > 104) {
						local147 = 104;
					}
					@Pc(392) boolean local392 = true;
					local162 = local130 + local123;
					if (local162 > 104) {
						local162 = 104;
					}
					if (local130 < 0) {
						local130 = 0;
					}
					@Pc(410) int local410;
					@Pc(415) int local415;
					for (local410 = local113; local410 < local147; local410++) {
						for (local415 = local130; local415 < local162; local415++) {
							if (Static225.anIntArrayArray28[local410][local415] <= 1) {
								local392 = false;
								break;
							}
						}
					}
					if (local392) {
						local410 = local113;
						while (true) {
							if (local410 >= local147) {
								continue label210;
							}
							for (local415 = local130; local415 < local162; local415++) {
								local176 = Static225.anIntArrayArray28[local410][local415]--;
							}
							local410++;
						}
					}
				}
				if (!local254.aClass46_1.aBoolean111) {
					local263 |= Long.MIN_VALUE;
				}
				local254.aBoolean358 = false;
				local254.anInt4694 = Static20.method383(local254.anInt4630, Static140.anInt3034, local254.anInt4680);
				Static22.method423(Static140.anInt3034, local254.anInt4680, local254.anInt4630, local254.anInt4694, (local123 - 1) * 64 + 60, local254, local254.anInt4681, local263, local254.aBoolean356);
			}
		}
	}
}
