import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
	public static int anInt1380;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_19 = new Class109(64);

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_34 = new Class103();

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IZ)V")
	public static void method1325(@OriginalArg(1) boolean arg0) {
		@Pc(11) int[] local11 = null;
		@Pc(17) byte local17;
		@Pc(15) byte[][] local15;
		if (arg0) {
			local17 = 1;
			local15 = Static318.aByteArrayArray20;
		} else {
			local15 = Static245.aByteArrayArray15;
			local17 = 4;
		}
		for (@Pc(25) int local25 = 0; local25 < local17; local25++) {
			Static315.method5535();
			for (@Pc(30) int local30 = 0; local30 < Static22.anInt481 >> 3; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static269.anInt5281 >> 3; local34++) {
					@Pc(38) boolean local38 = false;
					@Pc(46) int local46 = Static342.anIntArrayArrayArray13[local25][local30][local34];
					if (local46 != -1) {
						@Pc(55) int local55 = local46 >> 24 & 0x3;
						if (!arg0 || local55 == 0) {
							@Pc(68) int local68 = local46 >> 1 & 0x3;
							@Pc(74) int local74 = local46 >> 14 & 0x3FF;
							@Pc(80) int local80 = local46 >> 3 & 0x7FF;
							@Pc(90) int local90 = (local74 / 8 << 8) + local80 / 8;
							for (@Pc(92) int local92 = 0; local92 < Static198.anIntArray387.length; local92++) {
								if (local90 == Static198.anIntArray387[local92] && local15[local92] != null) {
									@Pc(127) int[] local127 = Static280.method4875(Static236.aClass55_9, arg0, local34 * 8, local80, local30 * 8, local55, Static152.aClass24Array3, local25, local15[local92], local68, local74);
									local38 = true;
									if (local11 == null && local127 != null) {
										local11 = local127;
									}
									break;
								}
							}
						}
					}
					if (!local38) {
						Static194.method3451(local34 * 8, local25, local30 * 8, 8, 8);
					}
				}
			}
		}
		if (local11 == null) {
			Static48.aClass184_1 = null;
		} else {
			Static48.aClass184_1 = Static214.method3926(local11[1], local11[2], local11[0], local11[3]);
			Static24.anInt6106 = local11[4];
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
	public static boolean method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static238.anInt4783; local1++) {
			@Pc(6) Class197 local6 = Static149.aClass197Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt6294 == 1) {
				local15 = local6.anInt6292 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt6289 + (local6.anInt6287 * local15 >> 8);
					local37 = local6.anInt6283 + (local6.anInt6288 * local15 >> 8);
					local47 = local6.anInt6277 + (local6.anInt6279 * local15 >> 8);
					local57 = local6.anInt6280 + (local6.anInt6282 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6294 == 2) {
				local15 = arg0 - local6.anInt6292;
				if (local15 > 0) {
					local27 = local6.anInt6289 + (local6.anInt6287 * local15 >> 8);
					local37 = local6.anInt6283 + (local6.anInt6288 * local15 >> 8);
					local47 = local6.anInt6277 + (local6.anInt6279 * local15 >> 8);
					local57 = local6.anInt6280 + (local6.anInt6282 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6294 == 3) {
				local15 = local6.anInt6289 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt6292 + (local6.anInt6285 * local15 >> 8);
					local37 = local6.anInt6290 + (local6.anInt6297 * local15 >> 8);
					local47 = local6.anInt6277 + (local6.anInt6279 * local15 >> 8);
					local57 = local6.anInt6280 + (local6.anInt6282 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6294 == 4) {
				local15 = arg2 - local6.anInt6289;
				if (local15 > 0) {
					local27 = local6.anInt6292 + (local6.anInt6285 * local15 >> 8);
					local37 = local6.anInt6290 + (local6.anInt6297 * local15 >> 8);
					local47 = local6.anInt6277 + (local6.anInt6279 * local15 >> 8);
					local57 = local6.anInt6280 + (local6.anInt6282 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt6294 == 5) {
				local15 = arg1 - local6.anInt6277;
				if (local15 > 0) {
					local27 = local6.anInt6292 + (local6.anInt6285 * local15 >> 8);
					local37 = local6.anInt6290 + (local6.anInt6297 * local15 >> 8);
					local47 = local6.anInt6289 + (local6.anInt6287 * local15 >> 8);
					local57 = local6.anInt6283 + (local6.anInt6288 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V")
	public static void method1327() {
		while (true) {
			if (Static187.aClass5_Sub12_Sub2_4.method5119(Static54.anInt1000) >= 27) {
				@Pc(18) int local18 = Static187.aClass5_Sub12_Sub2_4.method5120(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static280.aClass4_Sub5_Sub2_Sub2Array1[local18] == null) {
						Static280.aClass4_Sub5_Sub2_Sub2Array1[local18] = new Class4_Sub5_Sub2_Sub2();
						Static280.aClass4_Sub5_Sub2_Sub2Array1[local18].anInt5386 = local18;
						local23 = true;
					}
					@Pc(44) Class4_Sub5_Sub2_Sub2 local44 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local18];
					Static95.anIntArray160[Static133.anInt2579++] = local18;
					local44.anInt5350 = Static283.anInt5563;
					if (local44.aClass106_1 != null && local44.aClass106_1.method2822()) {
						Static161.method2843(local44);
					}
					@Pc(71) int local71 = Static187.aClass5_Sub12_Sub2_4.method5120(5);
					if (local71 > 15) {
						local71 -= 32;
					}
					@Pc(88) int local88 = Static187.aClass5_Sub12_Sub2_4.method5120(3) + 4 << 11 & 0x3D29;
					@Pc(93) int local93 = Static187.aClass5_Sub12_Sub2_4.method5120(5);
					if (local93 > 15) {
						local93 -= 32;
					}
					@Pc(102) int local102 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
					if (local102 == 1) {
						Static76.anIntArray118[Static195.anInt3883++] = local18;
					}
					local44.method4821(Static22.method442(Static187.aClass5_Sub12_Sub2_4.method5120(14)));
					@Pc(129) int local129 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
					local44.method4813(local44.aClass106_1.anInt3135);
					local44.anInt5392 = local44.aClass106_1.anInt3130 << 3;
					if (local44.anInt5392 == 0) {
						local44.method4812(0);
					} else if (local23) {
						local44.method4812(local88);
					}
					local44.method4802(local44.method4807(), local129 == 1, local71 + Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0], local93 + Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0], Static239.anInt4811);
					if (local44.aClass106_1.method2822()) {
						Static114.method1985(null, 0, local44.anIntArray522[0], null, local44, local44.anIntArray523[0], Static239.anInt4811);
					}
					continue;
				}
			}
			Static187.aClass5_Sub12_Sub2_4.method5121();
			return;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILclient!ne;)V")
	public static void method1328(@OriginalArg(1) Class139 arg0) {
		@Pc(9) Class92 local9 = null;
		try {
			@Pc(13) Class16 local13 = arg0.method3868();
			while (local13.anInt381 == 0) {
				Static20.method408(1L);
			}
			if (local13.anInt381 == 1) {
				local9 = (Class92) local13.anObject1;
				@Pc(34) Class5_Sub12 local34 = Static101.method1806();
				local9.method2386(0, local34.anInt5731, local34.aByteArray90);
			}
		} catch (@Pc(44) Exception local44) {
		}
		try {
			if (local9 != null) {
				local9.method2387();
			}
		} catch (@Pc(51) Exception local51) {
		}
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V")
	public static void method1329() {
		Static187.aClass5_Sub12_Sub2_4.method5124();
		@Pc(15) int local15 = Static187.aClass5_Sub12_Sub2_4.method5120(8);
		@Pc(24) int local24;
		if (local15 < Static133.anInt2579) {
			for (local24 = local15; local24 < Static133.anInt2579; local24++) {
				Static86.anIntArray135[Static200.anInt3972++] = Static95.anIntArray160[local24];
			}
		}
		if (local15 > Static133.anInt2579) {
			throw new RuntimeException("gnpov1");
		}
		Static133.anInt2579 = 0;
		for (local24 = 0; local24 < local15; local24++) {
			@Pc(67) int local67 = Static95.anIntArray160[local24];
			@Pc(71) Class4_Sub5_Sub2_Sub2 local71 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local67];
			@Pc(76) int local76 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
			if (local76 == 0) {
				Static95.anIntArray160[Static133.anInt2579++] = local67;
				local71.anInt5350 = Static283.anInt5563;
			} else {
				@Pc(96) int local96 = Static187.aClass5_Sub12_Sub2_4.method5120(2);
				if (local96 == 0) {
					Static95.anIntArray160[Static133.anInt2579++] = local67;
					local71.anInt5350 = Static283.anInt5563;
					Static76.anIntArray118[Static195.anInt3883++] = local67;
				} else {
					@Pc(138) int local138;
					@Pc(148) int local148;
					if (local96 == 1) {
						Static95.anIntArray160[Static133.anInt2579++] = local67;
						local71.anInt5350 = Static283.anInt5563;
						local138 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
						local71.method4818(1, local138);
						local148 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
						if (local148 == 1) {
							Static76.anIntArray118[Static195.anInt3883++] = local67;
						}
					} else if (local96 == 2) {
						Static95.anIntArray160[Static133.anInt2579++] = local67;
						local71.anInt5350 = Static283.anInt5563;
						if (Static187.aClass5_Sub12_Sub2_4.method5120(1) == 1) {
							local138 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
							local71.method4818(2, local138);
							local148 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
							local71.method4818(2, local148);
						} else {
							local138 = Static187.aClass5_Sub12_Sub2_4.method5120(3);
							local71.method4818(0, local138);
						}
						local138 = Static187.aClass5_Sub12_Sub2_4.method5120(1);
						if (local138 == 1) {
							Static76.anIntArray118[Static195.anInt3883++] = local67;
						}
					} else if (local96 == 3) {
						Static86.anIntArray135[Static200.anInt3972++] = local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;")
	public static Object method1331(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static5.aBoolean9) {
			try {
				@Pc(23) Class22 local23 = (Class22) Class.forName("Class22_Sub1").getDeclaredConstructor().newInstance();
				local23.method5487(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static5.aBoolean9 = true;
			}
		}
		return arg0;
	}
}
