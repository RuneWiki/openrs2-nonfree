import java.awt.Container;
import java.awt.Insets;
import java.lang.reflect.Method;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "Lclient!hc;")
	public static Class51 aClass51_80;

	@OriginalMember(owner = "client!vi", name = "q", descriptor = "Lclient!pa;")
	public static Class103 aClass103_8;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "Lclient!pl;")
	public static Class109 aClass109_4;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	public static int anInt5352;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "Lclient!sg;")
	public static Class1_Sub26 aClass1_Sub26_2;

	@OriginalMember(owner = "client!vi", name = "r", descriptor = "Lclient!ab;")
	public static Class3 aClass3_24 = new Class3();

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar2 = Calendar.getInstance();

	@OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
	public static int anInt5353 = 0;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(BII)I")
	public static int method4064(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub23 local10 = (Class1_Sub23) Static249.aClass140_17.method4014((long) arg0);
		if (local10 == null) {
			return -1;
		} else if (arg1 >= 0 && local10.anIntArray342.length > arg1) {
			return local10.anIntArray342[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!hc;I)V")
	public static void method4065(@OriginalArg(0) Class51 arg0) {
		Static88.aClass51_31 = arg0;
		Static128.anInt3212 = Static88.aClass51_31.method1875(4);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public static void method4066() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("maxMemory");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Long local26 = (Long) local16.invoke(local20, (Object[]) null);
					Static169.anInt3959 = (int) (local26 / 1048576L) + 1;
				} catch (@Pc(36) Throwable local36) {
				}
			}
		} catch (@Pc(38) Exception local38) {
		}
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(B)V")
	public static void method4067() {
		if (Static156.aClass122_12 != null || Static63.aClass122_7 != null) {
			return;
		}
		@Pc(21) int local21 = Static143.anInt3469;
		@Pc(94) int local94;
		@Pc(88) int local88;
		if (!Static259.aBoolean280) {
			if (local21 == 1 && Static230.anInt5417 > 0) {
				@Pc(34) short local34 = Static57.aShortArray26[Static230.anInt5417 - 1];
				if (local34 == 36 || local34 == 1 || local34 == 3 || local34 == 46 || local34 == 31 || local34 == 47 || local34 == 25 || local34 == 17 || local34 == 35 || local34 == 41 || local34 == 58 || local34 == 1003) {
					local88 = Static161.anIntArray281[Static230.anInt5417 - 1];
					local94 = Static216.anIntArray379[Static230.anInt5417 - 1];
					@Pc(98) Class122 local98 = Static206.method3444(local88);
					@Pc(101) Class1_Sub27 local101 = Static39.method702(local98);
					if (local101.method3659() || local101.method3654()) {
						Static96.anInt2666 = 0;
						Static238.aBoolean262 = false;
						if (Static156.aClass122_12 != null) {
							Static257.method4146(Static156.aClass122_12);
						}
						Static156.aClass122_12 = Static206.method3444(local88);
						Static95.anInt2635 = Static256.anInt5442;
						Static241.anInt5183 = local94;
						Static2.anInt37 = Static133.anInt3300;
						Static257.method4146(Static156.aClass122_12);
						return;
					}
				}
			}
			if (local21 == 1 && (Static15.anInt527 == 1 && Static230.anInt5417 > 2 || Static143.method2604(Static230.anInt5417 - 1))) {
				local21 = 2;
			}
			if (local21 == 2 && Static230.anInt5417 > 0 || Static138.anInt3362 == 1) {
				Static249.method4057();
			}
			if (local21 == 1 && Static230.anInt5417 > 0 || Static138.anInt3362 == 2) {
				Static45.method949();
				return;
			}
			return;
		}
		@Pc(184) int local184;
		if (local21 != 1) {
			local184 = Static71.anInt1930;
			local94 = Static240.anInt5167;
			if (Static95.anInt2633 - 10 > local184 || local184 > Static95.anInt2633 + Static75.anInt2037 + 10 || Static48.anInt1406 - 10 > local94 || local94 > Static48.anInt1406 + Static197.anInt2398 + 10) {
				Static259.aBoolean280 = false;
				Static199.method3321(Static95.anInt2633, Static197.anInt2398, Static75.anInt2037, Static48.anInt1406);
			}
		}
		if (local21 != 1) {
			return;
		}
		local184 = Static95.anInt2633;
		local94 = Static48.anInt1406;
		local88 = Static75.anInt2037;
		@Pc(242) int local242 = Static256.anInt5442;
		@Pc(244) int local244 = Static133.anInt3300;
		@Pc(246) int local246 = -1;
		for (@Pc(248) int local248 = 0; local248 < Static230.anInt5417; local248++) {
			@Pc(265) int local265;
			if (Static4.aBoolean4) {
				local265 = local94 + (Static230.anInt5417 - local248 - 1) * 15 + 33;
				if (local242 > local184 && local88 + local184 > local242 && local265 - 13 < local244 && local265 + 3 > local244) {
					local246 = local248;
				}
			} else {
				local265 = (Static230.anInt5417 - local248 - 1) * 15 + local94 + 31;
				if (local184 < local242 && local242 < local184 + local88 && local265 - 13 < local244 && local244 < local265 + 3) {
					local246 = local248;
				}
			}
		}
		if (local246 != -1) {
			Static54.method1048(local246);
		}
		Static259.aBoolean280 = false;
		Static199.method3321(Static95.anInt2633, Static197.anInt2398, Static75.anInt2037, Static48.anInt1406);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!jd;Z)V")
	public static void method4068(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(1) boolean arg1) {
		Static33.aClass3_22.method28(arg0);
		while (true) {
			@Pc(8) Class1_Sub16 local8;
			@Pc(17) int local17;
			@Pc(20) int local20;
			@Pc(23) int local23;
			@Pc(26) int local26;
			@Pc(30) Class1_Sub16[][] local30;
			@Pc(47) Class1_Sub16 local47;
			@Pc(272) int local272;
			@Pc(677) int local677;
			@Pc(682) int local682;
			@Pc(687) int local687;
			@Pc(1023) Class144 local1023;
			@Pc(1198) int local1198;
			@Pc(1083) int local1083;
			do {
				do {
					do {
						do {
							do {
								do {
									while (true) {
										@Pc(278) Class47 var11;
										@Pc(690) int var16;
										@Pc(699) int var17;
										@Pc(711) int var18;
										@Pc(427) int var21;
										@Pc(312) boolean var22;
										@Pc(904) Class1_Sub16 var33;
										while (true) {
											do {
												local8 = (Class1_Sub16) Static33.aClass3_22.method37();
												if (local8 == null) {
													return;
												}
											} while (!local8.aBoolean157);
											local17 = local8.anInt2930;
											local20 = local8.anInt2920;
											local23 = local8.anInt2924;
											local26 = local8.anInt2933;
											local30 = Static142.aClass1_Sub16ArrayArrayArray4[local23];
											if (!local8.aBoolean159) {
												break;
											}
											if (arg1) {
												if (local23 > 0) {
													local47 = Static142.aClass1_Sub16ArrayArrayArray4[local23 - 1][local17][local20];
													if (local47 != null && local47.aBoolean157) {
														continue;
													}
												}
												if (local17 <= Static153.anInt3688 && local17 > Static46.anInt1375) {
													local47 = local30[local17 - 1][local20];
													if (local47 != null && local47.aBoolean157 && (local47.aBoolean159 || (local8.anInt2932 & 0x1) == 0)) {
														continue;
													}
												}
												if (local17 >= Static153.anInt3688 && local17 < Static131.anInt1077 - 1) {
													local47 = local30[local17 + 1][local20];
													if (local47 != null && local47.aBoolean157 && (local47.aBoolean159 || (local8.anInt2932 & 0x4) == 0)) {
														continue;
													}
												}
												if (local20 <= Static148.anInt446 && local20 > Static35.anInt973) {
													local47 = local30[local17][local20 - 1];
													if (local47 != null && local47.aBoolean157 && (local47.aBoolean159 || (local8.anInt2932 & 0x8) == 0)) {
														continue;
													}
												}
												if (local20 >= Static148.anInt446 && local20 < Static167.anInt3901 - 1) {
													local47 = local30[local17][local20 + 1];
													if (local47 != null && local47.aBoolean157 && (local47.aBoolean159 || (local8.anInt2932 & 0x2) == 0)) {
														continue;
													}
												}
											} else {
												arg1 = true;
											}
											local8.aBoolean159 = false;
											if (local8.aClass1_Sub16_1 != null) {
												local47 = local8.aClass1_Sub16_1;
												if (local47.aClass36_1 == null) {
													if (local47.aClass113_1 != null) {
														if (Static127.method2420(0, local17, local20)) {
															Static248.method4046(local47.aClass113_1, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local17, local20, true);
														} else {
															Static248.method4046(local47.aClass113_1, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local17, local20, false);
														}
													}
												} else if (Static127.method2420(0, local17, local20)) {
													Static101.method2102(local47.aClass36_1, 0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local17, local20, true);
												} else {
													Static101.method2102(local47.aClass36_1, 0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local17, local20, false);
												}
												@Pc(244) Class144 local244 = local47.aClass144_1;
												if (local244 != null) {
													local244.aClass9_8.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local244.anInt5345 - Static68.anInt1403, local244.anInt5341 - Static24.anInt815, local244.anInt5340 - Static112.anInt2954, local244.aLong176, local23, null);
												}
												for (local272 = 0; local272 < local47.anInt2929; local272++) {
													var11 = local47.aClass47Array1[local272];
													if (var11 != null) {
														var11.aClass9_1.method3588(var11.anInt2157, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, var11.anInt2155 - Static68.anInt1403, var11.anInt2145 - Static24.anInt815, var11.anInt2154 - Static112.anInt2954, var11.aLong73, local23, null);
													}
												}
											}
											var22 = false;
											if (local8.aClass36_1 == null) {
												if (local8.aClass113_1 != null) {
													if (Static127.method2420(local26, local17, local20)) {
														Static248.method4046(local8.aClass113_1, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local17, local20, true);
													} else {
														var22 = true;
														Static248.method4046(local8.aClass113_1, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local17, local20, false);
													}
												}
											} else if (Static127.method2420(local26, local17, local20)) {
												Static101.method2102(local8.aClass36_1, local26, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local17, local20, true);
											} else {
												var22 = true;
												if (local8.aClass36_1.anInt1465 != 12345678 || Static112.aBoolean162 && local23 <= Static180.anInt4134) {
													Static101.method2102(local8.aClass36_1, local26, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local17, local20, false);
												}
											}
											if (var22) {
												@Pc(392) Class148 local392 = local8.aClass148_1;
												if (local392 != null && (local392.aLong181 & 0x80000000L) != 0L) {
													local392.aClass9_10.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local392.anInt5465 - Static68.anInt1403, local392.anInt5464 - Static24.anInt815, local392.anInt5466 - Static112.anInt2954, local392.aLong181, local23, null);
												}
											}
											var21 = 0;
											local272 = 0;
											@Pc(432) Class144 local432 = local8.aClass144_1;
											@Pc(435) Class85 local435 = local8.aClass85_1;
											if (local432 != null || local435 != null) {
												if (Static153.anInt3688 == local17) {
													var21++;
												} else if (Static153.anInt3688 < local17) {
													var21 += 2;
												}
												if (Static148.anInt446 == local20) {
													var21 += 3;
												} else if (Static148.anInt446 > local20) {
													var21 += 6;
												}
												local272 = Static178.anIntArray306[var21];
												local8.anInt2923 = Static63.anIntArray135[var21];
											}
											if (local432 != null) {
												if ((local432.anInt5339 & Static226.anIntArray430[var21]) == 0) {
													local8.anInt2925 = 0;
												} else if (local432.anInt5339 == 16) {
													local8.anInt2925 = 3;
													local8.anInt2921 = Static228.anIntArray432[var21];
													local8.anInt2926 = 3 - local8.anInt2921;
												} else if (local432.anInt5339 == 32) {
													local8.anInt2925 = 6;
													local8.anInt2921 = Static217.anIntArray381[var21];
													local8.anInt2926 = 6 - local8.anInt2921;
												} else if (local432.anInt5339 == 64) {
													local8.anInt2925 = 12;
													local8.anInt2921 = Static62.anIntArray119[var21];
													local8.anInt2926 = 12 - local8.anInt2921;
												} else {
													local8.anInt2925 = 9;
													local8.anInt2921 = Static102.anIntArray202[var21];
													local8.anInt2926 = 9 - local8.anInt2921;
												}
												if ((local432.anInt5339 & local272) != 0 && !Static147.method2682(local26, local17, local20, local432.anInt5339)) {
													local432.aClass9_8.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local432.anInt5345 - Static68.anInt1403, local432.anInt5341 - Static24.anInt815, local432.anInt5340 - Static112.anInt2954, local432.aLong176, local23, null);
												}
												if ((local432.anInt5343 & local272) != 0 && !Static147.method2682(local26, local17, local20, local432.anInt5343)) {
													local432.aClass9_9.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local432.anInt5345 - Static68.anInt1403, local432.anInt5341 - Static24.anInt815, local432.anInt5340 - Static112.anInt2954, local432.aLong176, local23, null);
												}
											}
											if (local435 != null && !Static23.method442(local26, local17, local20, local435.aClass9_3.method3587())) {
												if ((local435.anInt3489 & local272) != 0) {
													local435.aClass9_3.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local435.anInt3482 + local435.anInt3479 - Static68.anInt1403, local435.anInt3484 - Static24.anInt815, local435.anInt3483 + local435.anInt3487 - Static112.anInt2954, local435.aLong111, local23, null);
												} else if (local435.anInt3489 == 256) {
													local677 = local435.anInt3482 - Static68.anInt1403;
													local682 = local435.anInt3484 - Static24.anInt815;
													local687 = local435.anInt3483 - Static112.anInt2954;
													var16 = local435.anInt3490;
													if (var16 == 1 || var16 == 2) {
														var17 = -local677;
													} else {
														var17 = local677;
													}
													if (var16 == 2 || var16 == 3) {
														var18 = -local687;
													} else {
														var18 = local687;
													}
													if (var18 < var17) {
														local435.aClass9_3.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local677 + local435.anInt3479, local682, local687 + local435.anInt3487, local435.aLong111, local23, null);
													} else if (local435.aClass9_4 != null) {
														local435.aClass9_4.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local677, local682, local687, local435.aLong111, local23, null);
													}
												}
											}
											if (var22) {
												@Pc(762) Class148 local762 = local8.aClass148_1;
												if (local762 != null && (local762.aLong181 & 0x80000000L) == 0L) {
													local762.aClass9_10.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local762.anInt5465 - Static68.anInt1403, local762.anInt5464 - Static24.anInt815, local762.anInt5466 - Static112.anInt2954, local762.aLong181, local23, null);
												}
												@Pc(798) Class127 local798 = local8.aClass127_1;
												if (local798 != null && local798.anInt4927 == 0) {
													if (local798.aClass9_5 != null) {
														local798.aClass9_5.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local798.anInt4928 - Static68.anInt1403, local798.anInt4930 - Static24.anInt815, local798.anInt4926 - Static112.anInt2954, local798.aLong162, local23, null);
													}
													if (local798.aClass9_7 != null) {
														local798.aClass9_7.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local798.anInt4928 - Static68.anInt1403, local798.anInt4930 - Static24.anInt815, local798.anInt4926 - Static112.anInt2954, local798.aLong162, local23, null);
													}
													if (local798.aClass9_6 != null) {
														local798.aClass9_6.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local798.anInt4928 - Static68.anInt1403, local798.anInt4930 - Static24.anInt815, local798.anInt4926 - Static112.anInt2954, local798.aLong162, local23, null);
													}
												}
											}
											local677 = local8.anInt2932;
											if (local677 != 0) {
												if (local17 < Static153.anInt3688 && (local677 & 0x4) != 0) {
													var33 = local30[local17 + 1][local20];
													if (var33 != null && var33.aBoolean157) {
														Static33.aClass3_22.method28(var33);
													}
												}
												if (local20 < Static148.anInt446 && (local677 & 0x2) != 0) {
													var33 = local30[local17][local20 + 1];
													if (var33 != null && var33.aBoolean157) {
														Static33.aClass3_22.method28(var33);
													}
												}
												if (local17 > Static153.anInt3688 && (local677 & 0x1) != 0) {
													var33 = local30[local17 - 1][local20];
													if (var33 != null && var33.aBoolean157) {
														Static33.aClass3_22.method28(var33);
													}
												}
												if (local20 > Static148.anInt446 && (local677 & 0x8) != 0) {
													var33 = local30[local17][local20 - 1];
													if (var33 != null && var33.aBoolean157) {
														Static33.aClass3_22.method28(var33);
													}
												}
											}
											break;
										}
										if (local8.anInt2925 != 0) {
											var22 = true;
											for (var21 = 0; var21 < local8.anInt2929; var21++) {
												if (local8.aClass47Array1[var21].anInt2149 != Static134.anInt3305 && (local8.anIntArray214[var21] & local8.anInt2925) == local8.anInt2921) {
													var22 = false;
													break;
												}
											}
											if (var22) {
												local1023 = local8.aClass144_1;
												if (!Static147.method2682(local26, local17, local20, local1023.anInt5339)) {
													local1023.aClass9_8.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local1023.anInt5345 - Static68.anInt1403, local1023.anInt5341 - Static24.anInt815, local1023.anInt5340 - Static112.anInt2954, local1023.aLong176, local23, null);
												}
												local8.anInt2925 = 0;
											}
										}
										if (!local8.aBoolean158) {
											break;
										}
										try {
											@Pc(1063) int local1063 = local8.anInt2929;
											local8.aBoolean158 = false;
											var21 = 0;
											label572: for (local272 = 0; local272 < local1063; local272++) {
												var11 = local8.aClass47Array1[local272];
												if (var11.anInt2149 != Static134.anInt3305) {
													for (local1083 = var11.anInt2146; local1083 <= var11.anInt2160; local1083++) {
														for (local677 = var11.anInt2148; local677 <= var11.anInt2158; local677++) {
															var33 = local30[local1083][local677];
															if (var33.aBoolean159) {
																local8.aBoolean158 = true;
																continue label572;
															}
															if (var33.anInt2925 != 0) {
																local687 = 0;
																if (local1083 > var11.anInt2146) {
																	local687++;
																}
																if (local1083 < var11.anInt2160) {
																	local687 += 4;
																}
																if (local677 > var11.anInt2148) {
																	local687 += 8;
																}
																if (local677 < var11.anInt2158) {
																	local687 += 2;
																}
																if ((local687 & var33.anInt2925) == local8.anInt2926) {
																	local8.aBoolean158 = true;
																	continue label572;
																}
															}
														}
													}
													Static252.aClass47Array3[var21++] = var11;
													local677 = Static153.anInt3688 - var11.anInt2146;
													local682 = var11.anInt2160 - Static153.anInt3688;
													if (local682 > local677) {
														local677 = local682;
													}
													local687 = Static148.anInt446 - var11.anInt2148;
													var16 = var11.anInt2158 - Static148.anInt446;
													if (var16 > local687) {
														var11.anInt2147 = local677 + var16;
													} else {
														var11.anInt2147 = local677 + local687;
													}
												}
											}
											while (var21 > 0) {
												local1198 = -50;
												local1083 = -1;
												@Pc(1207) Class47 local1207;
												for (local677 = 0; local677 < var21; local677++) {
													local1207 = Static252.aClass47Array3[local677];
													if (local1207.anInt2149 != Static134.anInt3305) {
														if (local1207.anInt2147 > local1198) {
															local1198 = local1207.anInt2147;
															local1083 = local677;
														} else if (local1207.anInt2147 == local1198) {
															local687 = local1207.anInt2155 - Static68.anInt1403;
															var16 = local1207.anInt2154 - Static112.anInt2954;
															var17 = Static252.aClass47Array3[local1083].anInt2155 - Static68.anInt1403;
															var18 = Static252.aClass47Array3[local1083].anInt2154 - Static112.anInt2954;
															if (local687 * local687 + var16 * var16 > var17 * var17 + var18 * var18) {
																local1083 = local677;
															}
														}
													}
												}
												if (local1083 == -1) {
													break;
												}
												local1207 = Static252.aClass47Array3[local1083];
												local1207.anInt2149 = Static134.anInt3305;
												if (!Static261.method4163(local26, local1207.anInt2146, local1207.anInt2160, local1207.anInt2148, local1207.anInt2158, local1207.aClass9_1.method3587())) {
													local1207.aClass9_1.method3588(local1207.anInt2157, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local1207.anInt2155 - Static68.anInt1403, local1207.anInt2145 - Static24.anInt815, local1207.anInt2154 - Static112.anInt2954, local1207.aLong73, local23, null);
												}
												for (local687 = local1207.anInt2146; local687 <= local1207.anInt2160; local687++) {
													for (var16 = local1207.anInt2148; var16 <= local1207.anInt2158; var16++) {
														@Pc(1333) Class1_Sub16 local1333 = local30[local687][var16];
														if (local1333.anInt2925 != 0) {
															Static33.aClass3_22.method28(local1333);
														} else if ((local687 != local17 || var16 != local20) && local1333.aBoolean157) {
															Static33.aClass3_22.method28(local1333);
														}
													}
												}
											}
											if (!local8.aBoolean158) {
												break;
											}
										} catch (@Pc(1371) Exception local1371) {
											local8.aBoolean158 = false;
											break;
										}
									}
								} while (!local8.aBoolean157);
							} while (local8.anInt2925 != 0);
							if (local17 > Static153.anInt3688 || local17 <= Static46.anInt1375) {
								break;
							}
							local47 = local30[local17 - 1][local20];
						} while (local47 != null && local47.aBoolean157);
						if (local17 < Static153.anInt3688 || local17 >= Static131.anInt1077 - 1) {
							break;
						}
						local47 = local30[local17 + 1][local20];
					} while (local47 != null && local47.aBoolean157);
					if (local20 > Static148.anInt446 || local20 <= Static35.anInt973) {
						break;
					}
					local47 = local30[local17][local20 - 1];
				} while (local47 != null && local47.aBoolean157);
				if (local20 < Static148.anInt446 || local20 >= Static167.anInt3901 - 1) {
					break;
				}
				local47 = local30[local17][local20 + 1];
			} while (local47 != null && local47.aBoolean157);
			local8.aBoolean157 = false;
			Static262.anInt5505--;
			@Pc(1475) Class127 local1475 = local8.aClass127_1;
			if (local1475 != null && local1475.anInt4927 != 0) {
				if (local1475.aClass9_5 != null) {
					local1475.aClass9_5.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local1475.anInt4928 - Static68.anInt1403, local1475.anInt4930 - Static24.anInt815 - local1475.anInt4927, local1475.anInt4926 - Static112.anInt2954, local1475.aLong162, local23, null);
				}
				if (local1475.aClass9_7 != null) {
					local1475.aClass9_7.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local1475.anInt4928 - Static68.anInt1403, local1475.anInt4930 - Static24.anInt815 - local1475.anInt4927, local1475.anInt4926 - Static112.anInt2954, local1475.aLong162, local23, null);
				}
				if (local1475.aClass9_6 != null) {
					local1475.aClass9_6.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local1475.anInt4928 - Static68.anInt1403, local1475.anInt4930 - Static24.anInt815 - local1475.anInt4927, local1475.anInt4926 - Static112.anInt2954, local1475.aLong162, local23, null);
				}
			}
			if (local8.anInt2923 != 0) {
				@Pc(1576) Class85 local1576 = local8.aClass85_1;
				if (local1576 != null && !Static23.method442(local26, local17, local20, local1576.aClass9_3.method3587())) {
					if ((local1576.anInt3489 & local8.anInt2923) != 0) {
						local1576.aClass9_3.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local1576.anInt3482 + local1576.anInt3479 - Static68.anInt1403, local1576.anInt3484 - Static24.anInt815, local1576.anInt3483 + local1576.anInt3487 - Static112.anInt2954, local1576.aLong111, local23, null);
					} else if (local1576.anInt3489 == 256) {
						local272 = local1576.anInt3482 - Static68.anInt1403;
						local1198 = local1576.anInt3484 - Static24.anInt815;
						local1083 = local1576.anInt3483 - Static112.anInt2954;
						local677 = local1576.anInt3490;
						if (local677 == 1 || local677 == 2) {
							local682 = -local272;
						} else {
							local682 = local272;
						}
						if (local677 == 2 || local677 == 3) {
							local687 = -local1083;
						} else {
							local687 = local1083;
						}
						if (local687 >= local682) {
							local1576.aClass9_3.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local272 + local1576.anInt3479, local1198, local1083 + local1576.anInt3487, local1576.aLong111, local23, null);
						} else if (local1576.aClass9_4 != null) {
							local1576.aClass9_4.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local272, local1198, local1083, local1576.aLong111, local23, null);
						}
					}
				}
				local1023 = local8.aClass144_1;
				if (local1023 != null) {
					if ((local1023.anInt5343 & local8.anInt2923) != 0 && !Static147.method2682(local26, local17, local20, local1023.anInt5343)) {
						local1023.aClass9_9.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local1023.anInt5345 - Static68.anInt1403, local1023.anInt5341 - Static24.anInt815, local1023.anInt5340 - Static112.anInt2954, local1023.aLong176, local23, null);
					}
					if ((local1023.anInt5339 & local8.anInt2923) != 0 && !Static147.method2682(local26, local17, local20, local1023.anInt5339)) {
						local1023.aClass9_8.method3588(0, Static144.anInt3491, Static80.anInt2170, Static66.anInt1840, Static236.anInt5123, local1023.anInt5345 - Static68.anInt1403, local1023.anInt5341 - Static24.anInt815, local1023.anInt5340 - Static112.anInt2954, local1023.aLong176, local23, null);
					}
				}
			}
			@Pc(1806) Class1_Sub16 local1806;
			if (local23 < Static256.anInt5440 - 1) {
				local1806 = Static142.aClass1_Sub16ArrayArrayArray4[local23 + 1][local17][local20];
				if (local1806 != null && local1806.aBoolean157) {
					Static33.aClass3_22.method28(local1806);
				}
			}
			if (local17 < Static153.anInt3688) {
				local1806 = local30[local17 + 1][local20];
				if (local1806 != null && local1806.aBoolean157) {
					Static33.aClass3_22.method28(local1806);
				}
			}
			if (local20 < Static148.anInt446) {
				local1806 = local30[local17][local20 + 1];
				if (local1806 != null && local1806.aBoolean157) {
					Static33.aClass3_22.method28(local1806);
				}
			}
			if (local17 > Static153.anInt3688) {
				local1806 = local30[local17 - 1][local20];
				if (local1806 != null && local1806.aBoolean157) {
					Static33.aClass3_22.method28(local1806);
				}
			}
			if (local20 > Static148.anInt446) {
				local1806 = local30[local17][local20 - 1];
				if (local1806 != null && local1806.aBoolean157) {
					Static33.aClass3_22.method28(local1806);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(JB)Ljava/lang/String;")
	public static String method4070(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(25) int local25 = 0;
			@Pc(35) long local35 = arg0;
			while (local35 != 0L) {
				local35 /= 37L;
				local25++;
			}
			@Pc(53) StringBuffer local53 = new StringBuffer(local25);
			while (arg0 != 0L) {
				@Pc(57) long local57 = arg0;
				arg0 /= 37L;
				local53.append(Static249.aCharArray5[(int) (local57 - arg0 * 37L)]);
			}
			return local53.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZZIBIII)V")
	public static void method4071(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 == 3) {
			method4071(true, true, arg2, -1, -1, Static57.anInt1587);
			return;
		}
		@Pc(23) Container local23;
		if (Static88.aFrame2 != null) {
			local23 = Static88.aFrame2;
		} else if (Static42.aFrame1 == null) {
			local23 = Static38.aClass28_1.anApplet1;
		} else {
			local23 = Static42.aFrame1;
		}
		Static101.anInt2760 = local23.getSize().width;
		Static39.anInt1098 = local23.getSize().height;
		@Pc(48) Insets local48;
		if (Static42.aFrame1 == local23) {
			local48 = Static42.aFrame1.getInsets();
			Static101.anInt2760 -= local48.left + local48.right;
			Static39.anInt1098 -= local48.bottom + local48.top;
		}
		if (arg5 >= 2) {
			Static123.anInt1284 = 0;
			Static58.anInt1620 = 0;
			Static200.anInt4411 = Static101.anInt2760;
			anInt5352 = Static39.anInt1098;
		} else {
			Static123.anInt1284 = 0;
			Static200.anInt4411 = 765;
			Static58.anInt1620 = (Static101.anInt2760 - 765) / 2;
			anInt5352 = 503;
		}
		if (arg1) {
			Static218.method3556(Static98.aCanvas1);
			Static117.method2318(Static98.aCanvas1);
			if (Static261.aClass62_1 != null) {
				Static261.aClass62_1.method2137(Static98.aCanvas1);
			}
			Static35.aClient1.method698();
			Static178.method3055(Static98.aCanvas1);
			Static4.method81(Static98.aCanvas1);
			if (Static261.aClass62_1 != null) {
				Static261.aClass62_1.method2135(Static98.aCanvas1);
			}
		} else {
			Static98.aCanvas1.setSize(Static200.anInt4411, anInt5352);
			if (local23 == Static42.aFrame1) {
				local48 = Static42.aFrame1.getInsets();
				Static98.aCanvas1.setLocation(Static58.anInt1620 + local48.left, local48.top - -Static123.anInt1284);
			} else {
				Static98.aCanvas1.setLocation(Static58.anInt1620, Static123.anInt1284);
			}
		}
		if (arg5 > 0) {
			method4071(true, true, arg2, -1, -1, 0);
			return;
		}
		Static257.aBoolean279 = !Static25.method507();
		if (Static140.anInt3388 != -1) {
			Static249.method4058(true);
		}
		if (Static34.aClass109_2 != null && (Static224.anInt4922 == 30 || Static224.anInt4922 == 25)) {
			Static181.method3122();
		}
		for (@Pc(194) int local194 = 0; local194 < 100; local194++) {
			Static198.aBooleanArray19[local194] = true;
		}
		Static122.aBoolean170 = true;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)V")
	public static void method4072(@OriginalArg(0) int arg0) {
		@Pc(4) Class1_Sub2_Sub18 local4 = Static13.method232(arg0, 8);
		local4.method3805();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method4073(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}
}
