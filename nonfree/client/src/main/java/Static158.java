import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBIII)V")
	public static void method1923(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg1 >= arg3) {
			for (local18 = arg3; local18 < arg1; local18++) {
				Static121.anIntArrayArray33[local18][arg2] = arg0;
			}
		} else {
			for (local18 = arg1; local18 < arg3; local18++) {
				Static121.anIntArrayArray33[local18][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lclient!im;")
	public static Class80_Sub1 method1924() {
		return Static130.anInt2862 >= Static313.aClass80_Sub1Array2.length ? null : Static313.aClass80_Sub1Array2[Static130.anInt2862++];
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method1925(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static319.method1419(arg0, 0, local14, 0, local11);
		return local14;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILjava/lang/String;)[B")
	public static byte[] method1927(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(18) byte[] local18 = new byte[local8];
		for (@Pc(20) int local20 = 0; local20 < local8; local20++) {
			@Pc(27) char local27 = arg0.charAt(local20);
			if (local27 > '\u0000' && local27 < '\u0080' || !(local27 < ' ' || local27 > 'ÿ')) {
				local18[local20] = (byte) local27;
			} else if (local27 == '€') {
				local18[local20] = -128;
			} else if (local27 == '‚') {
				local18[local20] = -126;
			} else if (local27 == 'ƒ') {
				local18[local20] = -125;
			} else if (local27 == '„') {
				local18[local20] = -124;
			} else if (local27 == '…') {
				local18[local20] = -123;
			} else if (local27 == '†') {
				local18[local20] = -122;
			} else if (local27 == '‡') {
				local18[local20] = -121;
			} else if (local27 == 'ˆ') {
				local18[local20] = -120;
			} else if (local27 == '‰') {
				local18[local20] = -119;
			} else if (local27 == 'Š') {
				local18[local20] = -118;
			} else if (local27 == '‹') {
				local18[local20] = -117;
			} else if (local27 == 'Œ') {
				local18[local20] = -116;
			} else if (local27 == 'Ž') {
				local18[local20] = -114;
			} else if (local27 == '‘') {
				local18[local20] = -111;
			} else if (local27 == '’') {
				local18[local20] = -110;
			} else if (local27 == '“') {
				local18[local20] = -109;
			} else if (local27 == '”') {
				local18[local20] = -108;
			} else if (local27 == '•') {
				local18[local20] = -107;
			} else if (local27 == '–') {
				local18[local20] = -106;
			} else if (local27 == '—') {
				local18[local20] = -105;
			} else if (local27 == '˜') {
				local18[local20] = -104;
			} else if (local27 == '™') {
				local18[local20] = -103;
			} else if (local27 == 'š') {
				local18[local20] = -102;
			} else if (local27 == '›') {
				local18[local20] = -101;
			} else if (local27 == 'œ') {
				local18[local20] = -100;
			} else if (local27 == 'ž') {
				local18[local20] = -98;
			} else if (local27 == 'Ÿ') {
				local18[local20] = -97;
			} else {
				local18[local20] = 63;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Lclient!lb;")
	public static Class46_Sub1 method1928() {
		@Pc(31) Class46_Sub1 local31 = new Class46_Sub1(Static300.anInt5957, Static295.anInt5893, Static250.anIntArray469[0], Static137.anIntArray227[0], Static95.anIntArray212[0], Static50.anIntArray22[0], Static34.aByteArrayArray5[0], Static234.anIntArray454);
		Static20.method432();
		return local31;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)Z")
	public static boolean method1929(@OriginalArg(1) int arg0) {
		@Pc(41) int local41;
		@Pc(43) int local43;
		@Pc(77) int local77;
		@Pc(81) int local81;
		if (Static186.aClass1_Sub3_Sub13_Sub2_3 == null) {
			if (Static294.aBoolean367 || Static146.aClass1_Sub3_Sub13_14 == null) {
				Static186.aClass1_Sub3_Sub13_Sub2_3 = new Class1_Sub3_Sub13_Sub2(512, 512);
			} else {
				Static186.aClass1_Sub3_Sub13_Sub2_3 = (Class1_Sub3_Sub13_Sub2) Static146.aClass1_Sub3_Sub13_14;
			}
			@Pc(38) int[] local38 = Static186.aClass1_Sub3_Sub13_Sub2_3.anIntArray504;
			local41 = local38.length;
			for (local43 = 0; local43 < local41; local43++) {
				local38[local43] = 1;
			}
			for (local43 = 1; local43 < 103; local43++) {
				local77 = (103 - local43) * 512 * 4 + 24628;
				for (local81 = 1; local81 < 103; local81++) {
					if ((Static303.aByteArrayArrayArray19[arg0][local81][local43] & 0x18) == 0) {
						Static232.method3682(local38, local77, arg0, local81, local43);
					}
					if (arg0 < 3 && (Static303.aByteArrayArrayArray19[arg0 + 1][local81][local43] & 0x8) != 0) {
						Static232.method3682(local38, local77, arg0 + 1, local81, local43);
					}
					local77 += 4;
				}
			}
			Static263.anInt5300 = 0;
			for (local43 = 0; local43 < 104; local43++) {
				for (local77 = 0; local77 < 104; local77++) {
					@Pc(170) long local170 = Static163.method2577(arg0, local43 + 0, local77);
					if (local170 == 0L) {
						local170 = Static228.method3616(arg0, local43 + 0, local77);
					}
					if (local170 == 0L) {
						local170 = Static270.method4100(arg0, local43 + 0, local77);
					}
					if (local170 == 0L) {
						local170 = Static272.method4131(arg0, local43 + 0, local77);
					}
					if (local170 != 0L) {
						@Pc(230) Class92 local230 = Static166.method2725((int) (local170 >>> 32) & Integer.MAX_VALUE);
						if (!local230.aBoolean201 || Static160.aBoolean229) {
							@Pc(240) int local240 = local230.anInt3213;
							if (local230.anIntArray300 != null) {
								for (@Pc(247) int local247 = 0; local247 < local230.anIntArray300.length; local247++) {
									if (local230.anIntArray300[local247] != -1) {
										@Pc(266) Class92 local266 = Static166.method2725(local230.anIntArray300[local247]);
										if (local266.anInt3213 >= 0) {
											local240 = local266.anInt3213;
										}
									}
								}
							}
							if (local240 >= 0) {
								@Pc(284) boolean local284 = false;
								@Pc(289) int local289 = local43;
								@Pc(293) Class107 local293 = Static173.method2819(local240);
								if (local293 != null && local293.aBoolean241) {
									local284 = true;
								}
								@Pc(305) int local305 = local77;
								if (local284) {
									@Pc(313) int[][] local313 = Static82.aClass75Array1[arg0].anIntArrayArray30;
									for (@Pc(315) int local315 = 0; local315 < 10; local315++) {
										@Pc(323) int local323 = (int) (Math.random() * 4.0D);
										if (local323 == 0 && local289 > 0 && local289 > local43 - 3 && (local313[local289 - 1][local305] & 0x2C0108) == 0) {
											local289--;
										}
										if (local323 == 1 && local289 < 103 && local289 < local43 + 3 && (local313[local289 + 1][local305] & 0x2C0180) == 0) {
											local289++;
										}
										if (local323 == 2 && local305 > 0 && local305 > local77 - 3 && (local313[local289][local305 - 1] & 0x2C0102) == 0) {
											local305--;
										}
										if (local323 == 3 && local305 < 103 && local77 + 3 > local305 && (local313[local289][local305 + 1] & 0x2C0120) == 0) {
											local305++;
										}
									}
								}
								Static205.anIntArray396[Static263.anInt5300] = local230.anInt3230;
								Static124.anIntArray274[Static263.anInt5300] = local289;
								Static187.anIntArray360[Static263.anInt5300] = local305;
								Static263.anInt5300++;
							}
						}
					}
				}
			}
		}
		@Pc(492) int local492 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (int) (Math.random() * 20.0D) + 228;
		Static186.aClass1_Sub3_Sub13_Sub2_3.method4218();
		local41 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (local43 = 1; local43 < 103; local43++) {
			for (local77 = 1; local77 < 103; local77++) {
				if ((Static303.aByteArrayArrayArray19[arg0][local77][local43] & 0x18) == 0 && !Static109.method1802(arg0, local41, local77, local492, local43)) {
					if (Static294.aBoolean367) {
						Static231.anIntArray448 = null;
					} else {
						Static293.aClass3_1.method2413();
					}
					return false;
				}
				if (arg0 < 3 && (Static303.aByteArrayArrayArray19[arg0 + 1][local77][local43] & 0x8) != 0 && !Static109.method1802(arg0 + 1, local41, local77, local492, local43)) {
					if (Static294.aBoolean367) {
						Static231.anIntArray448 = null;
					} else {
						Static293.aClass3_1.method2413();
					}
					return false;
				}
			}
		}
		if (Static294.aBoolean367) {
			@Pc(617) int[] local617 = Static186.aClass1_Sub3_Sub13_Sub2_3.anIntArray504;
			local77 = local617.length;
			for (local81 = 0; local81 < local77; local81++) {
				if (local617[local81] == 0) {
					local617[local81] = 1;
				}
			}
			Static146.aClass1_Sub3_Sub13_14 = new Class1_Sub3_Sub13_Sub1(Static186.aClass1_Sub3_Sub13_Sub2_3);
		} else {
			Static146.aClass1_Sub3_Sub13_14 = Static186.aClass1_Sub3_Sub13_Sub2_3;
		}
		if (Static294.aBoolean367) {
			Static231.anIntArray448 = null;
		} else {
			Static293.aClass3_1.method2413();
		}
		Static186.aClass1_Sub3_Sub13_Sub2_3 = null;
		return true;
	}
}
