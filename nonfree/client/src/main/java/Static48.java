import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fb", name = "J", descriptor = "I")
	public static int anInt3638;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1301 = Static120.method2057("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "[Lclient!qh;")
	public static Class1_Sub2_Sub1_Sub3_Sub2[] aClass1_Sub2_Sub1_Sub3_Sub2Array11 = new Class1_Sub2_Sub1_Sub3_Sub2[32768];

	@OriginalMember(owner = "client!fb", name = "F", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1302 = Static120.method2057("Okay");

	@OriginalMember(owner = "client!fb", name = "I", descriptor = "I")
	public static int anInt3637 = 1;

	@OriginalMember(owner = "client!fb", name = "K", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1303 = Static120.method2057("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!fb", name = "L", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1304 = aClass81_1303;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method2780() {
		aClass81_1302 = null;
		aClass1_Sub2_Sub1_Sub3_Sub2Array11 = null;
		aClass81_1301 = null;
		aClass81_1303 = null;
		aClass81_1304 = null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(III)J")
	public static long method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static167.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass42_1 == null ? 0L : local7.aClass42_1.aLong66;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I")
	public static int method2782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg3 & 0x3;
		if ((arg2 & 0x1) == 1) {
			@Pc(17) int local17 = arg0;
			arg0 = arg1;
			arg1 = local17;
		}
		if (local3 == 0) {
			return arg5;
		} else if (local3 == 1) {
			return arg4;
		} else if (local3 == 2) {
			return 7 + 1 - arg5 - arg0;
		} else {
			return 1 + 7 - arg1 - arg4;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III[Lclient!rh;IIIZI)V")
	public static void method2783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class77[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg3.length; local7++) {
			@Pc(13) Class77 local13 = arg3[local7];
			if (local13 != null && (!local13.aBoolean138 || local13.anInt3226 == 0 || local13.aBoolean129 || Static165.method2894(local13) != 0 || Static6.aClass77_3 == local13 || local13.anInt3249 == 1338) && arg7 == local13.anInt3196 && (!local13.aBoolean138 || !Static151.method2628(local13))) {
				@Pc(57) int local57 = local13.anInt3258 + arg2;
				@Pc(62) int local62 = arg6 + local13.anInt3230;
				if (Static31.aClass77_5 == local13) {
					Static146.anInt3209 = local57;
					Static183.aBoolean170 = true;
					Static160.anInt3652 = local62;
				}
				@Pc(144) int local144;
				@Pc(137) int local137;
				@Pc(129) int local129;
				@Pc(151) int local151;
				@Pc(95) int local95;
				if (local13.anInt3226 == 2) {
					local151 = arg1;
					local144 = arg5;
					local129 = arg0;
					local137 = arg4;
				} else {
					@Pc(83) int local83;
					@Pc(90) int local90;
					if (local13.anInt3226 == 9) {
						local83 = local57;
						@Pc(88) int local88 = local13.anInt3217 + local57;
						local90 = local62;
						local95 = local13.anInt3245 + local62;
						if (local88 < local57) {
							local83 = local88;
							local88 = local57;
						}
						local88++;
						if (local95 < local62) {
							local90 = local95;
							local95 = local62;
						}
						local129 = arg0 <= local88 ? arg0 : local88;
						local95++;
						local137 = arg4 < local90 ? local90 : arg4;
						local144 = arg5 < local83 ? local83 : arg5;
						local151 = local95 >= arg1 ? arg1 : local95;
					} else {
						local144 = local57 <= arg5 ? arg5 : local57;
						local90 = local62 + local13.anInt3245;
						local83 = local13.anInt3217 + local57;
						local137 = arg4 < local62 ? local62 : arg4;
						local151 = arg1 > local90 ? local90 : arg1;
						local129 = local83 < arg0 ? local83 : arg0;
					}
				}
				if (!local13.aBoolean138 || local144 < local129 && local137 < local151) {
					if (local13.anInt3249 == 1337) {
						Static51.method913(local13);
					} else {
						if (local13.anInt3226 == 0) {
							if (!local13.aBoolean138 && Static151.method2628(local13) && Static62.aClass77_9 != local13) {
								continue;
							}
							method2783(local129, local151, local57 - local13.anInt3252, arg3, local137, local144, local62 - local13.anInt3234, local13.anInt3231);
							if (local13.aClass77Array1 != null) {
								method2783(local129, local151, local57 - local13.anInt3252, local13.aClass77Array1, local137, local144, local62 - local13.anInt3234, local13.anInt3231);
							}
							@Pc(304) Class1_Sub4 local304 = (Class1_Sub4) Static119.aClass5_8.method134((long) local13.anInt3231);
							if (local304 != null) {
								Static167.method2970(local151, local304.anInt155, local137, local57, local144, local62, local129);
							}
						}
						if (local13.aBoolean138) {
							@Pc(321) boolean local321 = false;
							@Pc(323) boolean local323 = false;
							@Pc(349) boolean local349;
							if (Static36.anInt973 >= local144 && Static172.anInt3997 >= local137 && local129 > Static36.anInt973 && local151 > Static172.anInt3997) {
								local349 = true;
							} else {
								local349 = false;
							}
							if (Static118.anInt2618 == 1 && Static140.anInt3065 >= local144 && local137 <= Static119.anInt2628 && local129 > Static140.anInt3065 && local151 > Static119.anInt2628) {
								local323 = true;
							}
							if (Static1.anInt20 == 1 && local349) {
								local321 = true;
							}
							if (local13.anInt3249 == 1338) {
								if (local323) {
									Static41.method798(Static119.anInt2628 - local62, Static140.anInt3065 - local57, local13);
								}
								continue;
							}
							if (local323) {
								Static178.method3076(Static140.anInt3065 - local57, Static119.anInt2628 + -local62, local13);
							}
							if (Static31.aClass77_5 != null && local13 != Static31.aClass77_5 && local349 && Static173.method3039(Static165.method2894(local13))) {
								Static83.aClass77_11 = local13;
							}
							if (local13 == Static6.aClass77_3) {
								Static23.anInt584 = local57;
								Static128.anInt2810 = local62;
								Static18.aBoolean8 = true;
							}
							if (local13.aBoolean129) {
								@Pc(455) Class1_Sub3 local455;
								if (local349 && Static125.anInt2757 != 0 && local13.anObjectArray24 != null) {
									local455 = new Class1_Sub3();
									local455.aClass77_1 = local13;
									local455.anInt138 = Static125.anInt2757;
									local455.anObjectArray1 = local13.anObjectArray24;
									Static41.aClass30_7.method1113(local455);
								}
								if (Static31.aClass77_5 != null || Static29.aClass77_4 != null || Static149.aBoolean145) {
									local323 = false;
									local349 = false;
									local321 = false;
								}
								if (!local13.aBoolean132 && local323) {
									local13.aBoolean132 = true;
									if (local13.anObjectArray13 != null) {
										local455 = new Class1_Sub3();
										local455.anInt144 = Static140.anInt3065 - local57;
										local455.anObjectArray1 = local13.anObjectArray13;
										local455.aClass77_1 = local13;
										local455.anInt138 = Static119.anInt2628 - local62;
										Static41.aClass30_7.method1113(local455);
									}
								}
								if (local13.aBoolean132 && local321 && local13.anObjectArray10 != null) {
									local455 = new Class1_Sub3();
									local455.anInt138 = Static172.anInt3997 - local62;
									local455.aClass77_1 = local13;
									local455.anInt144 = Static36.anInt973 - local57;
									local455.anObjectArray1 = local13.anObjectArray10;
									Static41.aClass30_7.method1113(local455);
								}
								if (local13.aBoolean132 && !local321) {
									local13.aBoolean132 = false;
									if (local13.anObjectArray17 != null) {
										local455 = new Class1_Sub3();
										local455.aClass77_1 = local13;
										local455.anObjectArray1 = local13.anObjectArray17;
										local455.anInt144 = Static36.anInt973 - local57;
										local455.anInt138 = Static172.anInt3997 - local62;
										Static18.aClass30_4.method1113(local455);
									}
								}
								if (local321 && local13.anObjectArray18 != null) {
									local455 = new Class1_Sub3();
									local455.aClass77_1 = local13;
									local455.anInt144 = Static36.anInt973 - local57;
									local455.anInt138 = Static172.anInt3997 - local62;
									local455.anObjectArray1 = local13.anObjectArray18;
									Static41.aClass30_7.method1113(local455);
								}
								if (!local13.aBoolean131 && local349) {
									local13.aBoolean131 = true;
									if (local13.anObjectArray25 != null) {
										local455 = new Class1_Sub3();
										local455.anInt144 = Static36.anInt973 - local57;
										local455.anObjectArray1 = local13.anObjectArray25;
										local455.anInt138 = Static172.anInt3997 - local62;
										local455.aClass77_1 = local13;
										Static41.aClass30_7.method1113(local455);
									}
								}
								if (local13.aBoolean131 && local349 && local13.anObjectArray12 != null) {
									local455 = new Class1_Sub3();
									local455.anInt144 = Static36.anInt973 - local57;
									local455.anInt138 = Static172.anInt3997 - local62;
									local455.aClass77_1 = local13;
									local455.anObjectArray1 = local13.anObjectArray12;
									Static41.aClass30_7.method1113(local455);
								}
								if (local13.aBoolean131 && !local349) {
									local13.aBoolean131 = false;
									if (local13.anObjectArray3 != null) {
										local455 = new Class1_Sub3();
										local455.anInt138 = Static172.anInt3997 - local62;
										local455.anInt144 = Static36.anInt973 - local57;
										local455.anObjectArray1 = local13.anObjectArray3;
										local455.aClass77_1 = local13;
										Static18.aClass30_4.method1113(local455);
									}
								}
								if (local13.anObjectArray15 != null) {
									local455 = new Class1_Sub3();
									local455.anObjectArray1 = local13.anObjectArray15;
									local455.aClass77_1 = local13;
									Static64.aClass30_10.method1113(local455);
								}
								@Pc(783) int local783;
								@Pc(785) int local785;
								@Pc(801) Class1_Sub3 local801;
								if (local13.anObjectArray6 != null && Static82.anInt1884 > local13.anInt3203) {
									if (local13.anIntArray346 == null || Static82.anInt1884 - local13.anInt3203 > 32) {
										local455 = new Class1_Sub3();
										local455.anObjectArray1 = local13.anObjectArray6;
										local455.aClass77_1 = local13;
										Static41.aClass30_7.method1113(local455);
									} else {
										label386: for (local95 = local13.anInt3203; local95 < Static82.anInt1884; local95++) {
											local783 = Static114.anIntArray238[local95 & 0x1F];
											for (local785 = 0; local785 < local13.anIntArray346.length; local785++) {
												if (local783 == local13.anIntArray346[local785]) {
													local801 = new Class1_Sub3();
													local801.aClass77_1 = local13;
													local801.anObjectArray1 = local13.anObjectArray6;
													Static41.aClass30_7.method1113(local801);
													break label386;
												}
											}
										}
									}
									local13.anInt3203 = Static82.anInt1884;
								}
								if (local13.anObjectArray16 != null && Static184.anInt4114 > local13.anInt3218) {
									if (local13.anIntArray345 == null || Static184.anInt4114 - local13.anInt3218 > 32) {
										local455 = new Class1_Sub3();
										local455.aClass77_1 = local13;
										local455.anObjectArray1 = local13.anObjectArray16;
										Static41.aClass30_7.method1113(local455);
									} else {
										label362: for (local95 = local13.anInt3218; local95 < Static184.anInt4114; local95++) {
											local783 = Static118.anIntArray279[local95 & 0x1F];
											for (local785 = 0; local785 < local13.anIntArray345.length; local785++) {
												if (local13.anIntArray345[local785] == local783) {
													local801 = new Class1_Sub3();
													local801.anObjectArray1 = local13.anObjectArray16;
													local801.aClass77_1 = local13;
													Static41.aClass30_7.method1113(local801);
													break label362;
												}
											}
										}
									}
									local13.anInt3218 = Static184.anInt4114;
								}
								if (local13.anObjectArray4 != null && Static57.anInt1370 > local13.anInt3219) {
									if (local13.anIntArray347 == null || Static57.anInt1370 - local13.anInt3219 > 32) {
										local455 = new Class1_Sub3();
										local455.aClass77_1 = local13;
										local455.anObjectArray1 = local13.anObjectArray4;
										Static41.aClass30_7.method1113(local455);
									} else {
										label338: for (local95 = local13.anInt3219; local95 < Static57.anInt1370; local95++) {
											local783 = Static15.anIntArray12[local95 & 0x1F];
											for (local785 = 0; local785 < local13.anIntArray347.length; local785++) {
												if (local13.anIntArray347[local785] == local783) {
													local801 = new Class1_Sub3();
													local801.anObjectArray1 = local13.anObjectArray4;
													local801.aClass77_1 = local13;
													Static41.aClass30_7.method1113(local801);
													break label338;
												}
											}
										}
									}
									local13.anInt3219 = Static57.anInt1370;
								}
								if (Static21.anInt536 > local13.anInt3264 && local13.anObjectArray26 != null) {
									local455 = new Class1_Sub3();
									local455.anObjectArray1 = local13.anObjectArray26;
									local455.aClass77_1 = local13;
									Static41.aClass30_7.method1113(local455);
								}
								if (Static140.anInt3066 > local13.anInt3264 && local13.anObjectArray8 != null) {
									local455 = new Class1_Sub3();
									local455.anObjectArray1 = local13.anObjectArray8;
									local455.aClass77_1 = local13;
									Static41.aClass30_7.method1113(local455);
								}
								if (Static155.anInt3531 > local13.anInt3264 && local13.anObjectArray20 != null) {
									local455 = new Class1_Sub3();
									local455.anObjectArray1 = local13.anObjectArray20;
									local455.aClass77_1 = local13;
									Static41.aClass30_7.method1113(local455);
								}
								if (local13.anInt3264 < Static157.anInt3572 && local13.anObjectArray19 != null) {
									local455 = new Class1_Sub3();
									local455.anObjectArray1 = local13.anObjectArray19;
									local455.aClass77_1 = local13;
									Static41.aClass30_7.method1113(local455);
								}
								if (Static168.anInt3912 > local13.anInt3264 && local13.anObjectArray21 != null) {
									local455 = new Class1_Sub3();
									local455.anObjectArray1 = local13.anObjectArray21;
									local455.aClass77_1 = local13;
									Static41.aClass30_7.method1113(local455);
								}
								local13.anInt3264 = Static121.anInt2701;
								if (local13.anObjectArray23 != null) {
									for (local95 = 0; local95 < Static70.anInt1712; local95++) {
										@Pc(1161) Class1_Sub3 local1161 = new Class1_Sub3();
										local1161.aClass77_1 = local13;
										local1161.anInt145 = Static18.anIntArray19[local95];
										local1161.anInt142 = Static168.anIntArray416[local95];
										local1161.anObjectArray1 = local13.anObjectArray23;
										Static41.aClass30_7.method1113(local1161);
									}
								}
							}
						}
						if (!local13.aBoolean138) {
							if (Static31.aClass77_5 != null || Static29.aClass77_4 != null || Static149.aBoolean145) {
								return;
							}
							if ((local13.anInt3201 >= 0 || local13.anInt3188 != 0) && local144 <= Static36.anInt973 && Static172.anInt3997 >= local137 && Static36.anInt973 < local129 && local151 > Static172.anInt3997) {
								if (local13.anInt3201 < 0) {
									Static62.aClass77_9 = local13;
								} else {
									Static62.aClass77_9 = arg3[local13.anInt3201];
								}
							}
							if (local13.anInt3226 == 8 && local144 <= Static36.anInt973 && local137 <= Static172.anInt3997 && local129 > Static36.anInt973 && local151 > Static172.anInt3997) {
								Static53.aClass77_8 = local13;
							}
							if (local13.anInt3247 > local13.anInt3245) {
								Static117.method3138(local13, Static172.anInt3997, local62, Static36.anInt973, local13.anInt3245, local13.anInt3247, local57 + local13.anInt3217);
							}
						}
					}
				}
			}
		}
	}
}
