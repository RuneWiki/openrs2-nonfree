import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!wi;")
	public static Class193 aClass193_1;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!vl;")
	public static Class186 aClass186_1 = new Class186(16);

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public static void method214() {
		Static173.aClass89_25.method2273(5);
		Static271.aClass89_43.method2273(5);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(27) int local27;
		@Pc(42) int local42;
		if (Static24.anInt662 == 0) {
			@Pc(7) int local7 = Static221.anInt4698;
			@Pc(9) int local9 = Static57.anInt6308;
			@Pc(11) int local11 = Static221.anInt4693;
			@Pc(25) int local25 = (local7 - local9) * (arg4 - arg1) / arg3 + local9;
			local27 = Static280.anInt5623;
			local42 = (local11 - local27) * (arg0 - arg2) / arg5 + local27;
			if (Static230.aBoolean185 && (Static56.anInt1257 & 0x40) != 0) {
				@Pc(54) Class191 local54 = Static205.method3267(Static8.anInt225, Static217.anInt4676);
				if (local54 == null) {
					Static269.method4059();
				} else {
					Static12.method2960(local42, Static181.anInt3978, 0L, " ->", local25, Static244.aString290, (short) 49);
				}
			} else {
				if (Static208.anInt4489 == 1) {
					Static12.method2960(local42, -1, 0L, "", local25, Static120.aString447, (short) 44);
				}
				Static12.method2960(local42, -1, 0L, "", local25, Static86.aString118, (short) 48);
			}
		}
		@Pc(103) long local103 = -1L;
		for (local27 = 0; local27 < Static38.anInt947; local27++) {
			@Pc(116) long local116 = Static95.aLongArray4[local27];
			@Pc(123) int local123 = (int) local116 >> 29 & 0x3;
			local42 = (int) local116 & 0x7F;
			@Pc(135) int local135 = (int) local116 >> 7 & 0x7F;
			@Pc(142) int local142 = (int) (local116 >>> 32) & Integer.MAX_VALUE;
			if (local103 != local116) {
				local103 = local116;
				@Pc(265) int local265;
				@Pc(276) int local276;
				if (local123 == 2 && Static178.method2875(Static185.anInt4085, local42, local135, local116)) {
					@Pc(170) Class92 local170 = Static166.method2725(local142);
					if (local170.anIntArray300 != null) {
						local170 = local170.method2323();
					}
					if (local170 == null) {
						continue;
					}
					if (Static24.anInt662 == 1) {
						Static12.method2960(local135, Static7.anInt211, local116, Static311.aString444 + " -> <col=00ffff>" + local170.aString197, local42, Static163.aString216, (short) 5);
					} else if (Static230.aBoolean185) {
						@Pc(198) Class1_Sub3_Sub7 local198 = Static101.anInt155 == -1 ? null : Static279.method4264(Static101.anInt155);
						if ((Static56.anInt1257 & 0x4) != 0 && (local198 == null || local170.method2342(Static101.anInt155, local198.anInt2417) != local198.anInt2417)) {
							Static12.method2960(local135, Static181.anInt3978, local116, Static303.aString426 + " -> <col=00ffff>" + local170.aString197, local42, Static244.aString290, (short) 45);
						}
					} else {
						@Pc(253) String[] local253 = local170.aStringArray28;
						if (Static214.aBoolean290) {
							local253 = Static242.method3788(local253);
						}
						if (local253 != null) {
							for (local265 = 4; local265 >= 0; local265--) {
								if (local253[local265] != null) {
									@Pc(274) short local274 = 0;
									local276 = -1;
									if (local265 == 0) {
										local274 = 36;
									}
									if (local265 == 1) {
										local274 = 37;
									}
									if (local265 == 2) {
										local274 = 13;
									}
									if (local265 == 3) {
										local274 = 35;
									}
									if (local265 == 4) {
										local274 = 1005;
									}
									if (local265 == local170.anInt3229) {
										local276 = local170.anInt3204;
									}
									if (local265 == local170.anInt3218) {
										local276 = local170.anInt3228;
									}
									Static12.method2960(local135, local276, local116, "<col=00ffff>" + local170.aString197, local42, local253[local265], local274);
								}
							}
						}
						Static12.method2960(local135, Static234.anInt4944, (long) local170.anInt3230, "<col=00ffff>" + local170.aString197, local42, Static31.aString50, (short) 1004);
					}
				}
				@Pc(484) Class2_Sub4_Sub1 local484;
				@Pc(524) int local524;
				@Pc(514) int local514;
				@Pc(504) int local504;
				@Pc(455) int local455;
				@Pc(471) int local471;
				@Pc(566) Class2_Sub4_Sub2 local566;
				if (local123 == 1) {
					@Pc(406) Class2_Sub4_Sub1 local406 = Static105.aClass2_Sub4_Sub1Array1[local142];
					if ((local406.aClass145_1.anInt4909 & 0x1) == 0 && (local406.anInt2846 & 0x7F) == 0 && (local406.anInt2794 & 0x7F) == 0 || (local406.aClass145_1.anInt4909 & 0x1) == 1 && (local406.anInt2846 & 0x7F) == 64 && (local406.anInt2794 & 0x7F) == 64) {
						local455 = local406.anInt2846 - (local406.aClass145_1.anInt4909 << 6);
						local265 = local406.anInt2794 - (local406.aClass145_1.anInt4909 << 6);
						local471 = local406.aClass145_1.anInt4909 << 7;
						if (Static88.aBoolean140) {
							for (local276 = 0; local276 < Static147.anInt3287; local276++) {
								local484 = Static105.aClass2_Sub4_Sub1Array1[Static100.anIntArray224[local276]];
								if (local484 != null && !local484.aBoolean179 && local406 != local484 && local484.aBoolean180) {
									local504 = local484.aClass145_1.anInt4909 << 7;
									local514 = local484.anInt2794 - (local484.aClass145_1.anInt4909 << 6);
									local524 = local484.anInt2846 - (local484.aClass145_1.anInt4909 << 6);
									if (Static36.method771(local514, local455, local504, local265, local524, local471, local471, local504)) {
										Static208.method3299(Static100.anIntArray224[local276], local484.aClass145_1, local135, local42);
										local484.aBoolean179 = true;
									}
								}
							}
							for (local276 = 0; local276 < Static16.anInt461; local276++) {
								local566 = Static155.aClass2_Sub4_Sub2Array1[Static304.anIntArray533[local276]];
								if (local566 != null && !local566.aBoolean179 && local566.aBoolean180) {
									local524 = local566.anInt2846 - (local566.method2088() << 6);
									local514 = local566.anInt2794 - (local566.method2088() << 6);
									local504 = local566.method2088() << 7;
									if (Static36.method771(local514, local455, local504, local265, local524, local471, local471, local504)) {
										Static197.method3173(local135, local566, Static304.anIntArray533[local276], local42);
										local566.aBoolean179 = true;
									}
								}
							}
						}
					}
					if (local406.aBoolean179) {
						continue;
					}
					Static208.method3299(local142, local406.aClass145_1, local135, local42);
					local406.aBoolean179 = true;
				}
				if (local123 == 0) {
					@Pc(652) Class2_Sub4_Sub2 local652 = Static155.aClass2_Sub4_Sub2Array1[local142];
					if ((local652.anInt2846 & 0x7F) == 64 && (local652.anInt2794 & 0x7F) == 64) {
						local455 = local652.anInt2846 - (local652.method2088() << 6);
						local265 = local652.anInt2794 - (local652.method2088() << 6);
						local471 = local652.method2088() << 7;
						if (Static88.aBoolean140) {
							for (local276 = 0; local276 < Static147.anInt3287; local276++) {
								local484 = Static105.aClass2_Sub4_Sub1Array1[Static100.anIntArray224[local276]];
								if (local484 != null && !local484.aBoolean179 && local484.aBoolean180) {
									local524 = local484.anInt2846 - (local484.aClass145_1.anInt4909 << 6);
									local504 = local484.aClass145_1.anInt4909 << 7;
									local514 = local484.anInt2794 - (local484.aClass145_1.anInt4909 << 6);
									if (Static36.method771(local514, local455, local504, local265, local524, local471, local471, local504)) {
										Static208.method3299(Static100.anIntArray224[local276], local484.aClass145_1, local135, local42);
										local484.aBoolean179 = true;
									}
								}
							}
							for (local276 = 0; local276 < Static16.anInt461; local276++) {
								local566 = Static155.aClass2_Sub4_Sub2Array1[Static304.anIntArray533[local276]];
								if (local566 != null && !local566.aBoolean179 && local566 != local652 && local566.aBoolean180) {
									local524 = local566.anInt2846 - (local566.method2088() << 6);
									local514 = local566.anInt2794 - (local566.method2088() << 6);
									local504 = local566.method2088() << 7;
									if (Static36.method771(local514, local455, local504, local265, local524, local471, local471, local504)) {
										Static197.method3173(local135, local566, Static304.anIntArray533[local276], local42);
										local566.aBoolean179 = true;
									}
								}
							}
						}
					}
					if (local652.aBoolean179) {
						continue;
					}
					Static197.method3173(local135, local652, local142, local42);
					local652.aBoolean179 = true;
				}
				if (local123 == 3) {
					@Pc(873) Class26 local873 = Static20.aClass26ArrayArrayArray1[Static185.anInt4085][local42][local135];
					if (local873 != null) {
						for (@Pc(881) Class1_Sub3_Sub1 local881 = (Class1_Sub3_Sub1) local873.method677(); local881 != null; local881 = (Class1_Sub3_Sub1) local873.method670()) {
							local265 = local881.aClass2_Sub7_1.anInt5219;
							@Pc(892) Class57 local892 = Static56.method1050(local265);
							if (Static24.anInt662 == 1) {
								Static12.method2960(local135, Static7.anInt211, (long) local265, Static311.aString444 + " -> <col=ff9040>" + local892.aString102, local42, Static163.aString216, (short) 23);
							} else if (Static230.aBoolean185) {
								@Pc(906) Class1_Sub3_Sub7 local906 = Static101.anInt155 == -1 ? null : Static279.method4264(Static101.anInt155);
								if ((Static56.anInt1257 & 0x1) != 0 && (local906 == null || local892.method1325(local906.anInt2417, Static101.anInt155) != local906.anInt2417)) {
									Static12.method2960(local135, Static181.anInt3978, (long) local265, Static303.aString426 + " -> <col=ff9040>" + local892.aString102, local42, Static244.aString290, (short) 30);
								}
							} else {
								@Pc(954) String[] local954 = local892.aStringArray17;
								if (Static214.aBoolean290) {
									local954 = Static242.method3788(local954);
								}
								for (@Pc(962) int local962 = 4; local962 >= 0; local962--) {
									if (local954 != null && local954[local962] != null) {
										@Pc(975) byte local975 = 0;
										local514 = -1;
										if (local962 == 0) {
											local975 = 34;
										}
										if (local892.anInt1819 == local962) {
											local514 = local892.anInt1811;
										}
										if (local892.anInt1801 == local962) {
											local514 = local892.anInt1793;
										}
										if (local962 == 1) {
											local975 = 10;
										}
										if (local962 == 2) {
											local975 = 58;
										}
										if (local962 == 3) {
											local975 = 59;
										}
										if (local962 == 4) {
											local975 = 50;
										}
										Static12.method2960(local135, local514, (long) local265, "<col=ff9040>" + local892.aString102, local42, local954[local962], local975);
									}
								}
								Static12.method2960(local135, Static234.anInt4944, (long) local265, "<col=ff9040>" + local892.aString102, local42, Static31.aString50, (short) 1009);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
	public static void method216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static161.aBoolean231 = true;
		Static25.anInt693 = arg0;
		Static206.anInt4450 = arg1;
		Static87.anInt2040 = arg2;
		Static118.anInt2549 = -1;
		Static170.anInt3813 = -1;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)Z")
	public static boolean method217(@OriginalArg(1) int arg0) {
		Static178.aBoolean247 = true;
		Static241.anInt5007 = arg0 + 1 & 0xFFFF;
		return true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZJ)V")
	public static void method218(@OriginalArg(1) long arg0) {
		if (!Static211.aBoolean285) {
			Static27.aFloat44 += Static249.aFloat50 * (float) arg0 / 40.0F;
			Static62.aFloat16 += Static96.aFloat30 * (float) arg0 / 40.0F;
		}
		@Pc(28) int local28 = Static23.anInt641;
		@Pc(30) int local30 = Static109.anInt2425;
		@Pc(42) int local42;
		@Pc(50) int local50;
		if (local30 != Static28.anInt741) {
			local42 = local30 - Static28.anInt741;
			local50 = (int) ((long) local42 * arg0 / 320L);
			if (local42 > 0) {
				if (local50 == 0) {
					local50 = 1;
				} else if (local42 < local50) {
					local50 = local42;
				}
			} else if (local50 == 0) {
				local50 = -1;
			} else if (local42 > local50) {
				local50 = local42;
			}
			Static28.anInt741 += local50;
		}
		if (local28 != Static315.anInt6303) {
			local42 = local28 - Static315.anInt6303;
			local50 = (int) ((long) local42 * arg0 / 320L);
			if (local42 <= 0) {
				if (local50 == 0) {
					local50 = -1;
				} else if (local50 < local42) {
					local50 = local42;
				}
			} else if (local50 == 0) {
				local50 = 1;
			} else if (local42 < local50) {
				local50 = local42;
			}
			Static315.anInt6303 += local50;
		}
		Static140.method2324();
	}
}
