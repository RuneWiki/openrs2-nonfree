import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
	public static int anInt4794;

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
	public static int anInt4796;

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
	public static int anInt4797;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)[Lclient!ti;")
	public static Class168[] method3849() {
		if (Static287.aClass168Array1 == null) {
			@Pc(16) Class168[] local16 = Static210.method3508(Static164.aClass102_2);
			@Pc(20) Class168[] local20 = new Class168[local16.length];
			@Pc(22) int local22 = 0;
			label54: for (@Pc(24) int local24 = 0; local24 < local16.length; local24++) {
				@Pc(36) Class168 local36 = local16[local24];
				if ((local36.anInt5416 <= 0 || local36.anInt5416 >= 24) && local36.anInt5413 >= 800 && local36.anInt5415 >= 600) {
					for (@Pc(58) int local58 = 0; local58 < local22; local58++) {
						@Pc(69) Class168 local69 = local20[local58];
						if (local69.anInt5413 == local36.anInt5413 && local69.anInt5415 == local36.anInt5415) {
							if (local69.anInt5416 < local36.anInt5416) {
								local20[local58] = local36;
							}
							continue label54;
						}
					}
					local20[local22] = local36;
					local22++;
				}
			}
			Static287.aClass168Array1 = new Class168[local22];
			Static323.method3556(local20, 0, Static287.aClass168Array1, 0, local22);
			@Pc(128) int[] local128 = new int[Static287.aClass168Array1.length];
			for (@Pc(130) int local130 = 0; local130 < Static287.aClass168Array1.length; local130++) {
				@Pc(138) Class168 local138 = Static287.aClass168Array1[local130];
				local128[local130] = local138.anInt5413 * local138.anInt5415;
			}
			Static6.method114(local128, Static287.aClass168Array1);
		}
		return Static287.aClass168Array1;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lclient!ml;IIIII)V")
	public static void method3850(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static46.anInt1155) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static38.anInt954) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static232.anInt4680 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class2_Sub13 local71 = Static52.aClass2_Sub13ArrayArrayArray1[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static9.anIntArrayArrayArray7[local17][local28][local39] + Static9.anIntArrayArrayArray7[local17][local28 + 1][local39] + Static9.anIntArrayArrayArray7[local17][local28][local39 + 1] + Static9.anIntArrayArrayArray7[local17][local28 + 1][local39 + 1]) / 4 - (Static9.anIntArrayArrayArray7[arg1][arg2][arg3] + Static9.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + Static9.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + Static9.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class122 local161 = local71.aClass122_1;
									if (local161 != null) {
										if (local161.aClass15_3.method4278()) {
											arg0.method4279(local161.aClass15_3, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass15_2 != null && local161.aClass15_2.method4278()) {
											arg0.method4279(local161.aClass15_2, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt1544; local232++) {
										@Pc(241) Class170 local241 = local71.aClass170Array1[local232];
										if (local241 != null && local241.aClass15_9.method4278() && (local28 == local241.anInt5433 || local28 == local3) && (local39 == local241.anInt5437 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt5435 + 1 - local241.anInt5433;
											@Pc(278) int local278 = local241.anInt5448 + 1 - local241.anInt5437;
											arg0.method4279(local241.aClass15_9, (local241.anInt5433 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt5437 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method3851() {
		Static275.aClass2_Sub8_Sub14_8 = null;
		Static73.aClass2_Sub8_Sub14_3 = null;
		Static234.aClass2_Sub8_Sub14_7 = null;
		Static223.aClass2_Sub8_Sub14_6 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB[Lclient!g;)V")
	public static void method3853(@OriginalArg(0) int arg0, @OriginalArg(2) Class56[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(11) Class56 local11 = arg1[local3];
			if (local11 != null) {
				if (local11.anInt2092 == 0) {
					if (local11.aClass56Array1 != null) {
						method3853(arg0, local11.aClass56Array1);
					}
					@Pc(36) Class2_Sub4 local36 = (Class2_Sub4) Static132.aClass101_8.method2867((long) local11.anInt2096);
					if (local36 != null) {
						Static73.method1398(arg0, local36.anInt274);
					}
				}
				@Pc(54) Class2_Sub12 local54;
				if (arg0 == 0 && local11.anObjectArray23 != null) {
					local54 = new Class2_Sub12();
					local54.aClass56_6 = local11;
					local54.anObjectArray1 = local11.anObjectArray23;
					Static204.method3467(local54);
				}
				if (arg0 == 1 && local11.anObjectArray17 != null) {
					if (local11.anInt2056 >= 0) {
						@Pc(82) Class56 local82 = Static38.method715(local11.anInt2096);
						if (local82 == null || local82.aClass56Array1 == null || local82.aClass56Array1.length <= local11.anInt2056 || local82.aClass56Array1[local11.anInt2056] != local11) {
							continue;
						}
					}
					local54 = new Class2_Sub12();
					local54.anObjectArray1 = local11.anObjectArray17;
					local54.aClass56_6 = local11;
					Static204.method3467(local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3854(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) int local12 = arg0.length();
		@Pc(14) int local14;
		for (local14 = 0; local12 > local14 && Static131.method2421(arg0.charAt(local14)); local14++) {
		}
		while (local12 > local14 && Static131.method2421(arg0.charAt(local12 - 1))) {
			local12--;
		}
		@Pc(54) int local54 = local12 - local14;
		if (local54 < 1 || local54 > 20) {
			return null;
		}
		@Pc(72) StringBuffer local72 = new StringBuffer(local54);
		for (@Pc(74) int local74 = local14; local74 < local12; local74++) {
			@Pc(81) char local81 = arg0.charAt(local74);
			if (Static170.method3087(local81)) {
				@Pc(91) char local91 = Static123.method2203(local81);
				if (local91 != '\u0000') {
					local72.append(local91);
				}
			}
		}
		if (local72.length() == 0) {
			return null;
		} else {
			return local72.toString();
		}
	}
}
