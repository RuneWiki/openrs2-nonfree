import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bj", name = "S", descriptor = "Lclient!kj;")
	public static Class2_Sub3_Sub12 aClass2_Sub3_Sub12_1;

	@OriginalMember(owner = "client!bj", name = "cb", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!bj", name = "Q", descriptor = "I")
	public static int anInt508 = 0;

	@OriginalMember(owner = "client!bj", name = "Z", descriptor = "F")
	public static float aFloat3 = 0.0F;

	@OriginalMember(owner = "client!bj", name = "db", descriptor = "I")
	public static int anInt518 = 0;

	@OriginalMember(owner = "client!bj", name = "fb", descriptor = "Ljava/lang/String;")
	public static String aString31 = "red:";

	@OriginalMember(owner = "client!bj", name = "gb", descriptor = "[I")
	public static int[] anIntArray35 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(II)V")
	public static void method453(@OriginalArg(1) int arg0) {
		if (arg0 == Static236.anInt4804) {
			return;
		}
		if (Static236.anInt4804 == 0) {
			Static32.method639();
		}
		if (arg0 == 40) {
			Static287.method4763();
		}
		@Pc(37) boolean local37 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 != 40 && Static254.aClass45_4 != null) {
			Static254.aClass45_4.method1045();
			Static254.aClass45_4 = null;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static34.anInt1964 = 1;
			Static148.anInt3167 = 0;
			Static281.anInt5834 = 1;
			Static44.anInt1074 = 0;
			Static268.anInt5542 = 0;
			Static150.method2607(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static58.method1123();
		}
		if (arg0 == 5) {
			Static188.method3180(Static201.aClass84_85);
		} else {
			Static28.method543();
		}
		@Pc(112) boolean local112 = Static236.anInt4804 == 5 || Static236.anInt4804 == 10 || Static236.anInt4804 == 28;
		if (local37 != local112) {
			if (local37) {
				Static149.anInt3177 = Static74.anInt1604;
				if (Static91.anInt2030 == 0) {
					Static224.method3752();
				} else {
					Static183.method3144(Static74.anInt1604, 255, Static152.aClass84_61);
				}
				Static139.aClass78_2.method1950(false);
			} else {
				Static224.method3752();
				Static139.aClass78_2.method1950(true);
			}
		}
		if (Static60.aBoolean106 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static60.method1171();
		}
		Static236.anInt4804 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method454(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(37) int local37 = 0;
			@Pc(39) long local39 = arg0;
			while (local39 != 0L) {
				local39 /= 37L;
				local37++;
			}
			@Pc(55) StringBuffer local55 = new StringBuffer(local37);
			while (arg0 != 0L) {
				@Pc(63) long local63 = arg0;
				arg0 /= 37L;
				local55.append(Static183.aCharArray3[(int) (local63 - arg0 * 37L)]);
			}
			return local55.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "(III)I")
	public static int method455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = arg0 * 57 + arg1;
		@Pc(16) int local16 = local5 ^ local5 << 13;
		@Pc(34) int local34 = Integer.MAX_VALUE & (local16 * 15731 * local16 + 789221) * local16 + 1376312589;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!wm;)V")
	public static void method456(@OriginalArg(1) Class2_Sub26 arg0) {
		label126: while (true) {
			if (arg0.aByteArray72.length > arg0.anInt5328) {
				@Pc(18) boolean local18 = false;
				@Pc(20) int local20 = 0;
				@Pc(22) int local22 = 0;
				if (arg0.method4261() == 1) {
					local20 = arg0.method4261();
					local22 = arg0.method4261();
					local18 = true;
				}
				@Pc(42) int local42 = arg0.method4261();
				@Pc(46) int local46 = arg0.method4261();
				@Pc(53) int local53 = local42 * 64 - Static115.anInt2461;
				@Pc(64) int local64 = Static52.anInt1205 + Static239.anInt4870 - local46 * 64 - 1;
				@Pc(85) int local85;
				@Pc(100) int local100;
				if (local53 >= 0 && local64 - 63 >= 0 && local53 + 63 < Static142.anInt3081 && local64 < Static52.anInt1205) {
					local85 = local53 >> 6;
					local100 = local64 >> 6;
					@Pc(154) int local154 = 0;
					while (true) {
						if (local154 >= 64) {
							continue label126;
						}
						for (@Pc(161) int local161 = 0; local161 < 64; local161++) {
							if (!local18 || local20 * 8 <= local154 && local154 < local20 * 8 + 8 && local161 >= local22 * 8 && local161 < local22 * 8 + 8) {
								@Pc(202) int local202 = arg0.method4261();
								if (local202 != 0) {
									@Pc(221) int local221;
									if ((local202 & 0x1) == 1) {
										local221 = arg0.method4261();
										if (Static119.aByteArrayArrayArray8[local85][local100] == null) {
											Static119.aByteArrayArrayArray8[local85][local100] = new byte[4096];
										}
										Static119.aByteArrayArrayArray8[local85][local100][(63 - local161 << 6) + local154] = (byte) local221;
									}
									if ((local202 & 0x2) == 2) {
										local221 = arg0.method4245();
										if (Static202.anIntArrayArrayArray10[local85][local100] == null) {
											Static202.anIntArrayArrayArray10[local85][local100] = new int[4096];
										}
										Static202.anIntArrayArrayArray10[local85][local100][(63 - local161 << 6) + local154] = local221;
									}
									if ((local202 & 0x4) == 4) {
										local221 = arg0.method4245();
										if (Static57.anIntArrayArrayArray2[local85][local100] == null) {
											Static57.anIntArrayArrayArray2[local85][local100] = new int[4096];
										}
										local221--;
										@Pc(322) Class143 local322 = Static218.method3692(local221);
										if (local322.anIntArray372 != null) {
											local322 = local322.method3641();
											if (local322 == null || local322.anInt4486 == -1) {
												continue;
											}
										}
										Static57.anIntArrayArrayArray2[local85][local100][local154 + (63 - local161 << 6)] = local322.anInt4488 + 1;
										@Pc(359) Class2_Sub20 local359 = new Class2_Sub20();
										local359.anInt3924 = local64;
										local359.anInt3928 = local53;
										local359.anInt3927 = local322.anInt4486;
										Static2.aClass1_34.method11(local359);
									}
								}
							}
						}
						local154++;
					}
				}
				local85 = 0;
				while (true) {
					if ((local18 ? 64 : 4096) <= local85) {
						continue label126;
					}
					local100 = arg0.method4261();
					if (local100 != 0) {
						if ((local100 & 0x1) == 1) {
							arg0.anInt5328++;
						}
						if ((local100 & 0x2) == 2) {
							arg0.anInt5328 += 2;
						}
						if ((local100 & 0x4) == 4) {
							arg0.anInt5328 += 3;
						}
					}
					local85++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(JB)V")
	public static void method457(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(20) int local20 = 0; local20 < Static151.anInt3192; local20++) {
			if (Static67.aLongArray25[local20] == arg0) {
				Static151.anInt3192--;
				for (@Pc(39) int local39 = local20; local39 < Static151.anInt3192; local39++) {
					Static56.aStringArray5[local39] = Static56.aStringArray5[local39 + 1];
					Static18.anIntArray29[local39] = Static18.anIntArray29[local39 + 1];
					Static124.aStringArray10[local39] = Static124.aStringArray10[local39 + 1];
					Static67.aLongArray25[local39] = Static67.aLongArray25[local39 + 1];
					Static264.anIntArray482[local39] = Static264.anIntArray482[local39 + 1];
					Static299.aBooleanArray13[local39] = Static299.aBooleanArray13[local39 + 1];
				}
				Static184.anInt3910 = Static13.anInt334;
				Static95.aClass2_Sub26_Sub1_1.method4287(231);
				Static95.aClass2_Sub26_Sub1_1.method4225(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBLjava/util/Random;)I")
	public static int method459(@OriginalArg(0) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static297.method4947(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(38) int local38 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(41) int local41;
			do {
				local41 = arg1.nextInt();
			} while (local38 <= local41);
			return Static232.method3890(arg0, local41);
		}
	}
}
