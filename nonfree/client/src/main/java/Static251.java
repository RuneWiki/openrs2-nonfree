import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!s", name = "P", descriptor = "Lclient!nk;")
	public static Class121 aClass121_110;

	@OriginalMember(owner = "client!s", name = "Q", descriptor = "Lclient!ol;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!s", name = "R", descriptor = "I")
	public static int anInt4554;

	@OriginalMember(owner = "client!s", name = "C", descriptor = "Lclient!vh;")
	public static Class187 aClass187_128 = new Class187(500);

	@OriginalMember(owner = "client!s", name = "O", descriptor = "Z")
	public static boolean aBoolean314 = false;

	@OriginalMember(owner = "client!s", name = "S", descriptor = "I")
	public static int anInt4555 = 99;

	@OriginalMember(owner = "client!s", name = "T", descriptor = "[Lclient!ad;")
	public static Class5[] aClass5Array1 = new Class5[8];

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Lclient!vj;")
	public static Class29_Sub1 method3959() {
		Static62.anInt1196 = 0;
		return Static182.method2992();
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V")
	public static void method3962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7;
		@Pc(14) int local14;
		for (local7 = arg3; local7 <= arg3 + arg4; local7++) {
			for (local14 = arg2; local14 <= arg2 + arg1; local14++) {
				if (local14 >= 0 && local14 < 104 && local7 >= 0 && local7 < 104) {
					Static174.aByteArrayArrayArray11[arg0][local14][local7] = 127;
				}
			}
		}
		for (local7 = arg3; local7 < arg4 + arg3; local7++) {
			for (local14 = arg2; local14 < arg2 + arg1; local14++) {
				if (local14 >= 0 && local14 < 104 && local7 >= 0 && local7 < 104) {
					Static24.anIntArrayArrayArray2[arg0][local14][local7] = arg0 <= 0 ? 0 : Static24.anIntArrayArrayArray2[arg0 - 1][local14][local7];
				}
			}
		}
		if (arg2 > 0 && arg2 < 104) {
			for (local7 = arg3 + 1; local7 < arg4 + arg3; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static24.anIntArrayArrayArray2[arg0][arg2][local7] = Static24.anIntArrayArrayArray2[arg0][arg2 - 1][local7];
				}
			}
		}
		if (arg3 > 0 && arg3 < 104) {
			for (local7 = arg2 + 1; local7 < arg2 + arg1; local7++) {
				if (local7 >= 0 && local7 < 104) {
					Static24.anIntArrayArrayArray2[arg0][local7][arg3] = Static24.anIntArrayArrayArray2[arg0][local7][arg3 - 1];
				}
			}
		}
		if (arg2 < 0 || arg3 < 0 || arg2 >= 104 || arg3 >= 104) {
			return;
		}
		if (arg0 == 0) {
			if (arg2 > 0 && Static24.anIntArrayArrayArray2[arg0][arg2 - 1][arg3] != 0) {
				Static24.anIntArrayArrayArray2[arg0][arg2][arg3] = Static24.anIntArrayArrayArray2[arg0][arg2 - 1][arg3];
			} else if (arg3 > 0 && Static24.anIntArrayArrayArray2[arg0][arg2][arg3 - 1] != 0) {
				Static24.anIntArrayArrayArray2[arg0][arg2][arg3] = Static24.anIntArrayArrayArray2[arg0][arg2][arg3 - 1];
			} else if (arg2 > 0 && arg3 > 0 && Static24.anIntArrayArrayArray2[arg0][arg2 - 1][arg3 - 1] != 0) {
				Static24.anIntArrayArrayArray2[arg0][arg2][arg3] = Static24.anIntArrayArrayArray2[arg0][arg2 - 1][arg3 - 1];
			}
		} else if (arg2 > 0 && Static24.anIntArrayArrayArray2[arg0 - 1][arg2 - 1][arg3] != Static24.anIntArrayArrayArray2[arg0][arg2 - 1][arg3]) {
			Static24.anIntArrayArrayArray2[arg0][arg2][arg3] = Static24.anIntArrayArrayArray2[arg0][arg2 - 1][arg3];
		} else if (arg3 > 0 && Static24.anIntArrayArrayArray2[arg0 - 1][arg2][arg3 - 1] != Static24.anIntArrayArrayArray2[arg0][arg2][arg3 - 1]) {
			Static24.anIntArrayArrayArray2[arg0][arg2][arg3] = Static24.anIntArrayArrayArray2[arg0][arg2][arg3 - 1];
		} else if (arg2 > 0 && arg3 > 0 && Static24.anIntArrayArrayArray2[arg0][arg2 - 1][arg3 - 1] != Static24.anIntArrayArrayArray2[arg0 - 1][arg2 - 1][arg3 - 1]) {
			Static24.anIntArrayArrayArray2[arg0][arg2][arg3] = Static24.anIntArrayArrayArray2[arg0][arg2 - 1][arg3 - 1];
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIB)I")
	public static int method3965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = arg2 & 0x3;
		if (local15 == 0) {
			return arg1;
		} else if (local15 == 1) {
			return arg0;
		} else if (local15 == 2) {
			return 1023 - arg1;
		} else {
			return 1023 - arg0;
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)Z")
	public static boolean method3966(@OriginalArg(1) int arg0) {
		@Pc(35) int local35;
		@Pc(37) int local37;
		@Pc(78) int local78;
		@Pc(82) int local82;
		if (Static90.aClass1_Sub2_Sub1_Sub2_1 == null) {
			if (Static156.aBoolean211 || Static15.aClass1_Sub2_Sub1_1 == null) {
				Static90.aClass1_Sub2_Sub1_Sub2_1 = new Class1_Sub2_Sub1_Sub2(512, 512);
			} else {
				Static90.aClass1_Sub2_Sub1_Sub2_1 = (Class1_Sub2_Sub1_Sub2) Static15.aClass1_Sub2_Sub1_1;
			}
			@Pc(32) int[] local32 = Static90.aClass1_Sub2_Sub1_Sub2_1.anIntArray391;
			local35 = local32.length;
			for (local37 = 0; local37 < local35; local37++) {
				local32[local37] = 1;
			}
			for (local37 = 1; local37 < 103; local37++) {
				local78 = (103 - local37) * 4 * 512 + 24628;
				for (local82 = 1; local82 < 103; local82++) {
					if ((Static104.aByteArrayArrayArray3[arg0][local82][local37] & 0x18) == 0) {
						Static34.method3911(local32, local78, arg0, local82, local37);
					}
					if (arg0 < 3 && (Static104.aByteArrayArrayArray3[arg0 + 1][local82][local37] & 0x8) != 0) {
						Static34.method3911(local32, local78, arg0 + 1, local82, local37);
					}
					local78 += 4;
				}
			}
			Static287.anInt5146 = 0;
			for (local37 = 0; local37 < 104; local37++) {
				for (local78 = 0; local78 < 104; local78++) {
					@Pc(169) long local169 = Static38.method3321(arg0, local37 + 0, local78);
					if (local169 == 0L) {
						local169 = Static86.method1602(arg0, local37 + 0, local78);
					}
					if (local169 == 0L) {
						local169 = Static30.method495(arg0, local37 + 0, local78);
					}
					if (local169 == 0L) {
						local169 = Static74.method1466(arg0, local37 + 0, local78);
					}
					if (local169 != 0L) {
						@Pc(232) Class71 local232 = Static255.method4052(Integer.MAX_VALUE & (int) (local169 >>> 32));
						if (!local232.aBoolean139 || Static254.aBoolean315) {
							@Pc(242) int local242 = local232.anInt2357;
							if (local232.anIntArray209 != null) {
								for (@Pc(247) int local247 = 0; local247 < local232.anIntArray209.length; local247++) {
									if (local232.anIntArray209[local247] != -1) {
										@Pc(270) Class71 local270 = Static255.method4052(local232.anIntArray209[local247]);
										if (local270.anInt2357 >= 0) {
											local242 = local270.anInt2357;
										}
									}
								}
							}
							if (local242 >= 0) {
								@Pc(290) boolean local290 = false;
								@Pc(294) Class175 local294 = Static210.method3349(local242);
								if (local294 != null && local294.aBoolean343) {
									local290 = true;
								}
								@Pc(307) int local307 = local37;
								@Pc(311) int local311 = local78;
								if (local290) {
									@Pc(319) int[][] local319 = Static240.aClass118Array1[arg0].anIntArrayArray28;
									for (@Pc(321) int local321 = 0; local321 < 10; local321++) {
										@Pc(331) int local331 = (int) (Math.random() * 4.0D);
										if (local331 == 0 && local307 > 0 && local307 > local37 - 3 && (local319[local307 - 1][local311] & 0x2C0108) == 0) {
											local307--;
										}
										if (local331 == 1 && local307 < 103 && local37 + 3 > local307 && (local319[local307 + 1][local311] & 0x2C0180) == 0) {
											local307++;
										}
										if (local331 == 2 && local311 > 0 && local78 - 3 < local311 && (local319[local307][local311 - 1] & 0x2C0102) == 0) {
											local311--;
										}
										if (local331 == 3 && local311 < 103 && local78 + 3 > local311 && (local319[local307][local311 + 1] & 0x2C0120) == 0) {
											local311++;
										}
									}
								}
								Static97.anIntArray171[Static287.anInt5146] = local232.anInt2388;
								Static239.anIntArray370[Static287.anInt5146] = local307;
								Static138.anIntArray234[Static287.anInt5146] = local311;
								Static287.anInt5146++;
							}
						}
					}
				}
			}
		}
		Static90.aClass1_Sub2_Sub1_Sub2_1.method3859();
		@Pc(502) int local502 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) - 10 + 238 << 8) + 228;
		local35 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (local37 = 1; local37 < 103; local37++) {
			for (local78 = 1; local78 < 103; local78++) {
				if ((Static104.aByteArrayArrayArray3[arg0][local78][local37] & 0x18) == 0 && !Static141.method2436(local37, local78, arg0, local35, local502)) {
					if (Static156.aBoolean211) {
						Static25.anIntArray27 = null;
					} else {
						Static94.aClass58_3.method2968();
					}
					return false;
				}
				if (arg0 < 3 && (Static104.aByteArrayArrayArray3[arg0 + 1][local78][local37] & 0x8) != 0 && !Static141.method2436(local37, local78, arg0 + 1, local35, local502)) {
					if (Static156.aBoolean211) {
						Static25.anIntArray27 = null;
					} else {
						Static94.aClass58_3.method2968();
					}
					return false;
				}
			}
		}
		if (Static156.aBoolean211) {
			@Pc(631) int[] local631 = Static90.aClass1_Sub2_Sub1_Sub2_1.anIntArray391;
			local82 = local631.length;
			for (@Pc(636) int local636 = 0; local636 < local82; local636++) {
				if (local631[local636] == 0) {
					local631[local636] = 1;
				}
			}
			Static15.aClass1_Sub2_Sub1_1 = new Class1_Sub2_Sub1_Sub1(Static90.aClass1_Sub2_Sub1_Sub2_1);
		} else {
			Static15.aClass1_Sub2_Sub1_1 = Static90.aClass1_Sub2_Sub1_Sub2_1;
		}
		if (Static156.aBoolean211) {
			Static25.anIntArray27 = null;
		} else {
			Static94.aClass58_3.method2968();
		}
		Static90.aClass1_Sub2_Sub1_Sub2_1 = null;
		return true;
	}

	@OriginalMember(owner = "client!s", name = "d", descriptor = "(B)[Lclient!fe;")
	public static Class23_Sub1[] method3967() {
		@Pc(14) Class23_Sub1[] local14 = new Class23_Sub1[Static94.anInt3439];
		for (@Pc(16) int local16 = 0; local16 < Static94.anInt3439; local16++) {
			local14[local16] = new Class23_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[local16], Static254.anIntArray412[local16], Static160.anIntArray267[local16], Static235.anIntArray468[local16], Static69.aByteArrayArray15[local16], Static83.anIntArray144);
		}
		Static117.method2101();
		return local14;
	}

	@OriginalMember(owner = "client!s", name = "b", descriptor = "(BI)V")
	public static void method3968(@OriginalArg(1) int arg0) {
		Static45.anInt929 = arg0;
		Static27.anInt483 = -1;
		Static124.anInt5509 = 3;
		Static200.anInt3847 = 100;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IB)I")
	public static int method3969(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return 0;
		}
		@Pc(19) Class1_Sub7 local19 = (Class1_Sub7) Static229.aClass142_19.method3543((long) arg0);
		if (local19 == null) {
			return Static53.method966(arg0).anInt3999;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(39) int local39 = 0; local39 < local19.anIntArray23.length; local39++) {
			if (local19.anIntArray23[local39] == -1) {
				local29++;
			}
		}
		return local29 + Static53.method966(arg0).anInt3999 - local19.anIntArray23.length;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!ji;ILclient!nk;Lclient!nk;)V")
	public static void method3970(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) Class121 arg1, @OriginalArg(3) Class121 arg2) {
		Static22.anInterface3_1 = arg0;
		aClass121_110 = arg2;
		Static11.aClass121_8 = arg1;
		if (Static11.aClass121_8 != null) {
			Static285.anInt5125 = Static11.aClass121_8.method3125(1);
		}
		if (aClass121_110 != null) {
			Static162.anInt3211 = aClass121_110.method3125(1);
		}
	}
}
