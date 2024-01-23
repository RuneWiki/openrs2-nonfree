import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
	public static int anInt4223;

	@OriginalMember(owner = "client!qb", name = "V", descriptor = "Lclient!db;")
	public static Class31 aClass31_32 = new Class31(200);

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
	public static int anInt4227 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([[F[[F[[IZIZIII[Z[IZ[[IBIZILclient!rc;II[[FZ)V")
	public static void method3344(@OriginalArg(0) float[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) int[][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean[] arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int[][] arg11, @OriginalArg(13) byte arg12, @OriginalArg(14) int arg13, @OriginalArg(15) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) Class1_Sub25 arg16, @OriginalArg(18) int arg17, @OriginalArg(19) int arg18, @OriginalArg(20) float[][] arg19, @OriginalArg(21) boolean arg20) {
		@Pc(15) int local15 = (arg4 ? 255 : 0) + (arg5 << 8);
		@Pc(29) int local29 = (arg14 ? 255 : 0) + (arg15 << 8);
		@Pc(39) int local39 = (arg10 ? 255 : 0) + (arg3 << 8);
		@Pc(50) int local50 = (arg13 << 8) + (arg20 ? 255 : 0);
		@Pc(56) int[] local56 = new int[arg9.length / 2];
		for (@Pc(58) int local58 = 0; local58 < local56.length; local58++) {
			@Pc(70) int local70 = arg9[local58 + local58 + 1];
			@Pc(76) int local76 = arg9[local58 + local58];
			@Pc(89) int[][] local89 = arg11 == null || arg8 == null || !arg8[local58] ? arg2 : arg11;
			local56[local58] = Static55.method931(arg12, arg19, false, local50, local29, local70, arg1, arg7, (float) arg17, arg0, local15, local89, arg11, local39, arg18, local76, arg16);
		}
		arg16.method3601(arg6, arg7, arg18, local56, null, false);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!j;III)V")
	public static void method3345(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub19 local12;
		if (arg2 < Static44.anInt996) {
			local12 = Static130.aClass1_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass167_1 != null && local12.aClass167_1.aClass6_9.method3835()) {
				arg0.method3840(local12.aClass167_1.aClass6_9, 128, 0, 0, true);
			}
		}
		if (arg3 < Static44.anInt996) {
			local12 = Static130.aClass1_Sub19ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass167_1 != null && local12.aClass167_1.aClass6_9.method3835()) {
				arg0.method3840(local12.aClass167_1.aClass6_9, 0, 0, 128, true);
			}
		}
		if (arg2 < Static44.anInt996 && arg3 < Static14.anInt369) {
			local12 = Static130.aClass1_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass167_1 != null && local12.aClass167_1.aClass6_9.method3835()) {
				arg0.method3840(local12.aClass167_1.aClass6_9, 128, 0, 128, true);
			}
		}
		if (arg2 < Static44.anInt996 && arg3 > 0) {
			local12 = Static130.aClass1_Sub19ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass167_1 != null && local12.aClass167_1.aClass6_9.method3835()) {
				arg0.method3840(local12.aClass167_1.aClass6_9, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([IB[Ljava/lang/Object;)V")
	public static void method3346(@OriginalArg(0) int[] arg0, @OriginalArg(2) Object[] arg1) {
		Static82.method1398(arg0.length - 1, 0, arg0, arg1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIIIIIZ)V")
	public static void method3348(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6) {
		if (!arg6 && Static75.anInt1495 == arg4 && arg3 == Static179.anInt3322 && (Static92.anInt1754 == arg2 || Static39.method718())) {
			return;
		}
		Static75.anInt1495 = arg4;
		Static179.anInt3322 = arg3;
		Static92.anInt1754 = arg2;
		if (Static39.method718()) {
			Static92.anInt1754 = 0;
		}
		if (arg0) {
			Static299.method4554(28);
		} else {
			Static299.method4554(25);
		}
		Static195.method2964(true, Static4.aString6);
		@Pc(62) int local62 = Static224.anInt4695;
		Static224.anInt4695 = (arg4 - 6) * 8;
		@Pc(70) int local70 = Static158.anInt2961;
		Static158.anInt2961 = (arg3 - 6) * 8;
		Static70.aClass1_Sub2_Sub13_1 = Static26.method445(Static179.anInt3322 * 8, Static75.anInt1495 * 8);
		@Pc(92) int local92 = Static224.anInt4695 - local62;
		@Pc(97) int local97 = Static158.anInt2961 - local70;
		Static3.aClass50_1 = null;
		@Pc(118) int local118;
		@Pc(125) Class6_Sub6_Sub1 local125;
		@Pc(172) int local172;
		if (arg0) {
			Static293.anInt5831 = 0;
			for (local118 = 0; local118 < 32768; local118++) {
				local125 = Static211.aClass6_Sub6_Sub1Array2[local118];
				if (local125 != null) {
					local125.anInt4569 -= local97 * 128;
					local125.anInt4562 -= local92 * 128;
					if (local125.anInt4562 >= 0 && local125.anInt4562 <= 13184 && local125.anInt4569 >= 0 && local125.anInt4569 <= 13184) {
						for (local172 = 0; local172 < 10; local172++) {
							local125.anIntArray519[local172] -= local92;
							local125.anIntArray516[local172] -= local97;
						}
						Static75.anIntArray178[Static293.anInt5831++] = local118;
					} else {
						Static211.aClass6_Sub6_Sub1Array2[local118].method3458(null);
						Static211.aClass6_Sub6_Sub1Array2[local118] = null;
					}
				}
			}
		} else {
			for (local118 = 0; local118 < 32768; local118++) {
				local125 = Static211.aClass6_Sub6_Sub1Array2[local118];
				if (local125 != null) {
					for (local172 = 0; local172 < 10; local172++) {
						local125.anIntArray519[local172] -= local92;
						local125.anIntArray516[local172] -= local97;
					}
					local125.anInt4569 -= local97 * 128;
					local125.anInt4562 -= local92 * 128;
				}
			}
		}
		for (local118 = 0; local118 < 2048; local118++) {
			@Pc(276) Class6_Sub6_Sub2 local276 = Static77.aClass6_Sub6_Sub2Array1[local118];
			if (local276 != null) {
				for (local172 = 0; local172 < 10; local172++) {
					local276.anIntArray519[local172] -= local92;
					local276.anIntArray516[local172] -= local97;
				}
				local276.anInt4569 -= local97 * 128;
				local276.anInt4562 -= local92 * 128;
			}
		}
		@Pc(323) byte local323 = 104;
		Static159.anInt2978 = arg2;
		@Pc(327) byte local327 = 0;
		@Pc(329) byte local329 = 1;
		Static28.aClass6_Sub6_Sub2_1.method3519(arg1, arg5, false);
		if (local92 < 0) {
			local323 = -1;
			local327 = 103;
			local329 = -1;
		}
		@Pc(345) byte local345 = 1;
		@Pc(347) byte local347 = 0;
		@Pc(349) byte local349 = 104;
		if (local97 < 0) {
			local345 = -1;
			local349 = -1;
			local347 = 103;
		}
		for (@Pc(361) int local361 = local327; local361 != local323; local361 += local329) {
			for (@Pc(366) int local366 = local347; local366 != local349; local366 += local345) {
				@Pc(373) int local373 = local92 + local361;
				@Pc(378) int local378 = local366 + local97;
				for (@Pc(380) int local380 = 0; local380 < 4; local380++) {
					if (local373 >= 0 && local378 >= 0 && local373 < 104 && local378 < 104) {
						Static4.aClass69ArrayArrayArray1[local380][local361][local366] = Static4.aClass69ArrayArrayArray1[local380][local373][local378];
					} else {
						Static4.aClass69ArrayArrayArray1[local380][local361][local366] = null;
					}
				}
			}
		}
		for (@Pc(445) Class1_Sub24 local445 = (Class1_Sub24) Static16.aClass69_2.method1636(); local445 != null; local445 = (Class1_Sub24) Static16.aClass69_2.method1631()) {
			local445.anInt4100 -= local97;
			local445.anInt4112 -= local92;
			if (local445.anInt4112 < 0 || local445.anInt4100 < 0 || local445.anInt4112 >= 104 || local445.anInt4100 >= 104) {
				local445.method4534();
			}
		}
		if (Static30.anInt663 != 0) {
			Static30.anInt663 -= local92;
			Static24.anInt554 -= local97;
		}
		if (arg0) {
			Static298.anInt5904 -= local92;
			Static182.anInt3398 -= local92 * 128;
			Static53.anInt1117 -= local97;
			Static68.anInt4743 -= local97 * 128;
			Static192.anInt5400 -= local97;
			Static253.anInt5155 -= local92;
		} else {
			Static109.anInt2057 = 1;
		}
		Static25.anInt2862 = 0;
		if (Static240.aBoolean369 && arg0 && (Math.abs(local92) > 104 || Math.abs(local97) > 104)) {
			Static192.method4141();
		}
		Static98.anInt1879 = -1;
		Static44.aClass69_5.method1629();
		Static70.aClass69_6.method1629();
	}
}
