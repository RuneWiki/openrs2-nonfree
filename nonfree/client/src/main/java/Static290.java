import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static290 {

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "[I")
	public static int[] anIntArray541;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
	public static int anInt5686;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "Lclient!ek;")
	public static Class42 aClass42_105;

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "[S")
	public static short[] aShortArray85 = new short[500];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)Lclient!td;")
	public static Class167 method4492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub13 local7 = Static52.aClass2_Sub13ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class167 local14 = local7.aClass167_1;
			local7.aClass167_1 = null;
			return local14;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIIIBII)V")
	public static void method4493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10;
		@Pc(41) int local41;
		if (Static73.anInt1823 == 0) {
			@Pc(8) int local8 = Static263.anInt5196;
			local10 = Static185.anInt5543;
			@Pc(12) int local12 = Static185.anInt5539;
			@Pc(14) int local14 = Static246.anInt4876;
			@Pc(28) int local28 = local14 + (local12 - local14) * (arg3 - arg5) / arg4;
			local41 = local10 + (local8 - local10) * (arg0 - arg1) / arg2;
			if (Static287.aBoolean373 && (Static237.anInt4771 & 0x40) != 0) {
				@Pc(84) Class56 local84 = Static15.method273(Static220.anInt4519, Static239.anInt4787);
				if (local84 == null) {
					Static82.method1482();
				} else {
					Static206.method3478(" ->", 0L, local41, (short) 25, Static251.aString167, local28, Static312.anInt5126);
				}
			} else {
				if (Static162.anInt3614 == 1) {
					Static206.method3478("", 0L, local41, (short) 35, Static29.aString26, local28, -1);
				}
				Static206.method3478("", 0L, local41, (short) 31, Static219.aString153, local28, -1);
			}
		}
		@Pc(105) long local105 = -1L;
		for (local10 = 0; local10 < Static121.anInt2669; local10++) {
			@Pc(119) long local119 = Static196.aLongArray7[local10];
			@Pc(126) int local126 = (int) local119 >> 7 & 0x7F;
			@Pc(133) int local133 = (int) local119 >> 29 & 0x3;
			local41 = (int) local119 & 0x7F;
			@Pc(145) int local145 = Integer.MAX_VALUE & (int) (local119 >>> 32);
			if (local119 != local105) {
				local105 = local119;
				@Pc(281) int local281;
				@Pc(295) int local295;
				if (local133 == 2 && Static108.method1848(Static32.anInt876, local41, local126, local119)) {
					@Pc(169) Class146 local169 = Static10.method158(local145);
					if (local169.anIntArray467 != null) {
						local169 = local169.method3815();
					}
					if (local169 == null) {
						continue;
					}
					if (Static73.anInt1823 == 1) {
						Static206.method3478(Static4.aString3 + " -> <col=00ffff>" + local169.aString162, local119, local126, (short) 36, Static21.aString22, local41, Static269.anInt5273);
					} else if (Static287.aBoolean373) {
						@Pc(220) Class2_Sub8_Sub24 local220 = Static161.anInt3604 == -1 ? null : Static270.method3460(Static161.anInt3604);
						if ((Static237.anInt4771 & 0x4) != 0 && (local220 == null || local169.method3828(Static161.anInt3604, local220.anInt5989) != local220.anInt5989)) {
							Static206.method3478(Static96.aString83 + " -> <col=00ffff>" + local169.aString162, local119, local126, (short) 2, Static251.aString167, local41, Static312.anInt5126);
						}
					} else {
						@Pc(269) String[] local269 = local169.aStringArray37;
						if (Static262.aBoolean344) {
							local269 = Static103.method1789(local269);
						}
						if (local269 != null) {
							for (local281 = 4; local281 >= 0; local281--) {
								if (local269[local281] != null) {
									local295 = -1;
									@Pc(297) short local297 = 0;
									if (local281 == local169.anInt4735) {
										local295 = local169.anInt4737;
									}
									if (local169.anInt4743 == local281) {
										local295 = local169.anInt4725;
									}
									if (local281 == 0) {
										local297 = 5;
									}
									if (local281 == 1) {
										local297 = 10;
									}
									if (local281 == 2) {
										local297 = 28;
									}
									if (local281 == 3) {
										local297 = 3;
									}
									if (local281 == 4) {
										local297 = 1007;
									}
									Static206.method3478("<col=00ffff>" + local169.aString162, local119, local126, local297, local269[local281], local41, local295);
								}
							}
						}
						Static206.method3478("<col=00ffff>" + local169.aString162, (long) local169.anInt4724, local126, (short) 1012, Static234.aString161, local41, Static294.anInt5732);
					}
				}
				@Pc(482) Class15_Sub2_Sub1 local482;
				@Pc(505) int local505;
				@Pc(521) int local521;
				@Pc(511) int local511;
				@Pc(452) int local452;
				@Pc(468) int local468;
				@Pc(558) Class15_Sub2_Sub2 local558;
				if (local133 == 1) {
					@Pc(401) Class15_Sub2_Sub1 local401 = Static35.aClass15_Sub2_Sub1Array2[local145];
					if ((local401.aClass188_1.anInt5867 & 0x1) == 0 && (local401.anInt5358 & 0x7F) == 0 && (local401.anInt5371 & 0x7F) == 0 || (local401.aClass188_1.anInt5867 & 0x1) == 1 && (local401.anInt5358 & 0x7F) == 64 && (local401.anInt5371 & 0x7F) == 64) {
						local452 = local401.anInt5358 - (local401.aClass188_1.anInt5867 << 6);
						local281 = local401.anInt5371 - (local401.aClass188_1.anInt5867 << 6);
						local468 = local401.aClass188_1.anInt5867 << 7;
						if (Static200.aBoolean283) {
							for (local295 = 0; local295 < Static57.anInt1448; local295++) {
								local482 = Static35.aClass15_Sub2_Sub1Array2[Static89.anIntArray194[local295]];
								if (local482 != null && !local482.aBoolean354 && local482 != local401 && local482.aBoolean357) {
									local505 = local482.anInt5358 - (local482.aClass188_1.anInt5867 << 6);
									local511 = local482.aClass188_1.anInt5867 << 7;
									local521 = local482.anInt5371 - (local482.aClass188_1.anInt5867 << 6);
									if (Static88.method1569(local505, local468, local511, local281, local468, local521, local511, local452)) {
										Static146.method2596(Static89.anIntArray194[local295], local41, local482.aClass188_1, local126);
										local482.aBoolean354 = true;
									}
								}
							}
							for (local295 = 0; local295 < Static191.anInt4008; local295++) {
								local558 = Static188.aClass15_Sub2_Sub2Array41[Static246.anIntArray479[local295]];
								if (local558 != null && !local558.aBoolean354 && local558.aBoolean357) {
									local505 = local558.anInt5358 - (local558.method4286() << 6);
									local521 = local558.anInt5371 - (local558.method4286() << 6);
									local511 = local558.method4286() << 7;
									if (Static88.method1569(local505, local468, local511, local281, local468, local521, local511, local452)) {
										Static244.method3896(Static246.anIntArray479[local295], local41, local126, local558);
										local558.aBoolean354 = true;
									}
								}
							}
						}
					}
					if (local401.aBoolean354) {
						continue;
					}
					Static146.method2596(local145, local41, local401.aClass188_1, local126);
					local401.aBoolean354 = true;
				}
				if (local133 == 0) {
					@Pc(639) Class15_Sub2_Sub2 local639 = Static188.aClass15_Sub2_Sub2Array41[local145];
					if ((local639.anInt5358 & 0x7F) == 64 && (local639.anInt5371 & 0x7F) == 64) {
						local452 = local639.anInt5358 - (local639.method4286() << 6);
						local281 = local639.anInt5371 - (local639.method4286() << 6);
						local468 = local639.method4286() << 7;
						if (Static200.aBoolean283) {
							for (local295 = 0; local295 < Static57.anInt1448; local295++) {
								local482 = Static35.aClass15_Sub2_Sub1Array2[Static89.anIntArray194[local295]];
								if (local482 != null && !local482.aBoolean354 && local482.aBoolean357) {
									local505 = local482.anInt5358 - (local482.aClass188_1.anInt5867 << 6);
									local521 = local482.anInt5371 - (local482.aClass188_1.anInt5867 << 6);
									local511 = local482.aClass188_1.anInt5867 << 7;
									if (Static88.method1569(local505, local468, local511, local281, local468, local521, local511, local452)) {
										Static146.method2596(Static89.anIntArray194[local295], local41, local482.aClass188_1, local126);
										local482.aBoolean354 = true;
									}
								}
							}
							for (local295 = 0; local295 < Static191.anInt4008; local295++) {
								local558 = Static188.aClass15_Sub2_Sub2Array41[Static246.anIntArray479[local295]];
								if (local558 != null && !local558.aBoolean354 && local639 != local558 && local558.aBoolean357) {
									local505 = local558.anInt5358 - (local558.method4286() << 6);
									local521 = local558.anInt5371 - (local558.method4286() << 6);
									local511 = local558.method4286() << 7;
									if (Static88.method1569(local505, local468, local511, local281, local468, local521, local511, local452)) {
										Static244.method3896(Static246.anIntArray479[local295], local41, local126, local558);
										local558.aBoolean354 = true;
									}
								}
							}
						}
					}
					if (local639.aBoolean354) {
						continue;
					}
					Static244.method3896(local145, local41, local126, local639);
					local639.aBoolean354 = true;
				}
				if (local133 == 3) {
					@Pc(853) Class44 local853 = Static121.aClass44ArrayArrayArray1[Static32.anInt876][local41][local126];
					if (local853 != null) {
						for (@Pc(862) Class2_Sub8_Sub19 local862 = (Class2_Sub8_Sub19) local853.method1350(); local862 != null; local862 = (Class2_Sub8_Sub19) local853.method1357()) {
							local281 = local862.aClass15_Sub1_1.anInt462;
							@Pc(872) Class60 local872 = Static87.method1546(local281);
							if (Static73.anInt1823 == 1) {
								Static206.method3478(Static4.aString3 + " -> <col=ff9040>" + local872.aString81, (long) local281, local126, (short) 24, Static21.aString22, local41, Static269.anInt5273);
							} else if (Static287.aBoolean373) {
								@Pc(1017) Class2_Sub8_Sub24 local1017 = Static161.anInt3604 == -1 ? null : Static270.method3460(Static161.anInt3604);
								if ((Static237.anInt4771 & 0x1) != 0 && (local1017 == null || local872.method1644(Static161.anInt3604, local1017.anInt5989) != local1017.anInt5989)) {
									Static206.method3478(Static96.aString83 + " -> <col=ff9040>" + local872.aString81, (long) local281, local126, (short) 39, Static251.aString167, local41, Static312.anInt5126);
								}
							} else {
								@Pc(886) String[] local886 = local872.aStringArray16;
								if (Static262.aBoolean344) {
									local886 = Static103.method1789(local886);
								}
								for (@Pc(895) int local895 = 4; local895 >= 0; local895--) {
									if (local886 != null && local886[local895] != null) {
										@Pc(908) byte local908 = 0;
										if (local895 == 0) {
											local908 = 1;
										}
										if (local895 == 1) {
											local908 = 18;
										}
										local521 = -1;
										if (local895 == 2) {
											local908 = 59;
										}
										if (local895 == 3) {
											local908 = 42;
										}
										if (local895 == 4) {
											local908 = 15;
										}
										if (local872.anInt2210 == local895) {
											local521 = local872.anInt2243;
										}
										if (local895 == local872.anInt2235) {
											local521 = local872.anInt2224;
										}
										Static206.method3478("<col=ff9040>" + local872.aString81, (long) local281, local126, local908, local886[local895], local41, local521);
									}
								}
								Static206.method3478("<col=ff9040>" + local872.aString81, (long) local281, local126, (short) 1002, Static234.aString161, local41, Static294.anInt5732);
							}
						}
					}
				}
			}
		}
	}
}
