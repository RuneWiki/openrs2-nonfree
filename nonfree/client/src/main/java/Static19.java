import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
	public static int anInt384;

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "Z")
	public static boolean aBoolean25 = false;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
	public static int anInt387 = 2;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Z")
	public static boolean method393(@OriginalArg(1) int arg0) {
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(74) int local74;
		@Pc(78) int local78;
		if (Static279.aClass1_Sub1_Sub3_Sub2_3 == null) {
			if (Static291.aBoolean404 || Static104.aClass1_Sub1_Sub3_2 == null) {
				Static279.aClass1_Sub1_Sub3_Sub2_3 = new Class1_Sub1_Sub3_Sub2(512, 512);
			} else {
				Static279.aClass1_Sub1_Sub3_Sub2_3 = (Class1_Sub1_Sub3_Sub2) Static104.aClass1_Sub1_Sub3_2;
			}
			@Pc(29) int[] local29 = Static279.aClass1_Sub1_Sub3_Sub2_3.anIntArray344;
			local32 = local29.length;
			for (local34 = 0; local34 < local32; local34++) {
				local29[local34] = 1;
			}
			for (local34 = 1; local34 < 103; local34++) {
				local74 = (103 - local34) * 512 * 4 + 24628;
				for (local78 = 1; local78 < 103; local78++) {
					if ((Static94.aByteArrayArrayArray9[arg0][local78][local34] & 0x18) == 0) {
						Static103.method1605(local29, local74, arg0, local78, local34);
					}
					if (arg0 < 3 && (Static94.aByteArrayArrayArray9[arg0 + 1][local78][local34] & 0x8) != 0) {
						Static103.method1605(local29, local74, arg0 + 1, local78, local34);
					}
					local74 += 4;
				}
			}
			Static120.anInt2419 = 0;
			for (local34 = 0; local34 < 104; local34++) {
				for (local74 = 0; local74 < 104; local74++) {
					@Pc(164) long local164 = Static67.method1135(arg0, local34 + 0, local74);
					if (local164 == 0L) {
						local164 = Static278.method4120(arg0, local34 + 0, local74);
					}
					if (local164 == 0L) {
						local164 = Static27.method481(arg0, local34 + 0, local74);
					}
					if (local164 == 0L) {
						local164 = Static207.method3285(arg0, local34 + 0, local74);
					}
					if (local164 != 0L) {
						@Pc(220) Class43 local220 = Static189.method3080((int) (local164 >>> 32) & Integer.MAX_VALUE);
						if (!local220.aBoolean90 || Static235.aBoolean341) {
							@Pc(230) int local230 = local220.anInt1168;
							if (local220.anIntArray97 != null) {
								for (@Pc(235) int local235 = 0; local235 < local220.anIntArray97.length; local235++) {
									if (local220.anIntArray97[local235] != -1) {
										@Pc(254) Class43 local254 = Static189.method3080(local220.anIntArray97[local235]);
										if (local254.anInt1168 >= 0) {
											local230 = local254.anInt1168;
										}
									}
								}
							}
							if (local230 >= 0) {
								@Pc(270) boolean local270 = false;
								@Pc(274) Class81 local274 = Static50.method874(local230);
								if (local274 != null && local274.aBoolean165) {
									local270 = true;
								}
								@Pc(287) int local287 = local74;
								@Pc(292) int local292 = local34;
								if (local270) {
									@Pc(300) int[][] local300 = Static56.aClass122Array1[arg0].anIntArrayArray28;
									for (@Pc(302) int local302 = 0; local302 < 10; local302++) {
										@Pc(312) int local312 = (int) (Math.random() * 4.0D);
										if (local312 == 0 && local292 > 0 && local34 - 3 < local292 && (local300[local292 - 1][local287] & 0x2C0108) == 0) {
											local292--;
										}
										if (local312 == 1 && local292 < 103 && local34 + 3 > local292 && (local300[local292 + 1][local287] & 0x2C0180) == 0) {
											local292++;
										}
										if (local312 == 2 && local287 > 0 && local287 > local74 - 3 && (local300[local292][local287 - 1] & 0x2C0102) == 0) {
											local287--;
										}
										if (local312 == 3 && local287 < 103 && local287 < local74 + 3 && (local300[local292][local287 + 1] & 0x2C0120) == 0) {
											local287++;
										}
									}
								}
								Static267.anIntArray465[Static120.anInt2419] = local220.anInt1198;
								Static98.anIntArray148[Static120.anInt2419] = local292;
								Static207.anIntArray333[Static120.anInt2419] = local287;
								Static120.anInt2419++;
							}
						}
					}
				}
			}
		}
		Static279.aClass1_Sub1_Sub3_Sub2_3.method3470();
		@Pc(492) int local492 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
		local32 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		for (local34 = 1; local34 < 103; local34++) {
			for (local74 = 1; local74 < 103; local74++) {
				if ((Static94.aByteArrayArrayArray9[arg0][local74][local34] & 0x18) == 0 && !Static88.method1306(local34, local492, local32, arg0, local74)) {
					if (Static291.aBoolean404) {
						Static41.anIntArray62 = null;
					} else {
						Static242.aClass62_1.method4468();
					}
					return false;
				}
				if (arg0 < 3 && (Static94.aByteArrayArrayArray9[arg0 + 1][local74][local34] & 0x8) != 0 && !Static88.method1306(local34, local492, local32, arg0 + 1, local74)) {
					if (Static291.aBoolean404) {
						Static41.anIntArray62 = null;
					} else {
						Static242.aClass62_1.method4468();
					}
					return false;
				}
			}
		}
		if (Static291.aBoolean404) {
			@Pc(617) int[] local617 = Static279.aClass1_Sub1_Sub3_Sub2_3.anIntArray344;
			local74 = local617.length;
			for (local78 = 0; local78 < local74; local78++) {
				if (local617[local78] == 0) {
					local617[local78] = 1;
				}
			}
			Static104.aClass1_Sub1_Sub3_2 = new Class1_Sub1_Sub3_Sub1(Static279.aClass1_Sub1_Sub3_Sub2_3);
		} else {
			Static104.aClass1_Sub1_Sub3_2 = Static279.aClass1_Sub1_Sub3_Sub2_3;
		}
		if (Static291.aBoolean404) {
			Static41.anIntArray62 = null;
		} else {
			Static242.aClass62_1.method4468();
		}
		Static279.aClass1_Sub1_Sub3_Sub2_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Lclient!gd;")
	public static Class60 method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg1 >= Static6.anInt118 || arg2 < 0 || arg2 >= Static178.anInt3591) {
			return null;
		}
		@Pc(19) Class1_Sub17 local19 = Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2];
		if (local19 == null) {
			return null;
		}
		@Pc(25) Class60 local25 = null;
		@Pc(27) int local27 = -1;
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < local19.anInt3452; local31++) {
			@Pc(40) Class60 local40 = local19.aClass60Array3[local31];
			if ((local40.aLong64 >> 29 & 0x3L) <= 1L && local40.anInt1529 == arg1 && local40.anInt1522 == arg2 && (local40.anInt1523 > local27 || local40.anInt1537 > local29)) {
				local25 = local40;
				local27 = local40.anInt1523;
				local29 = local40.anInt1537;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method395(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(29) char local29 = arg0.charAt(local18);
			if (local29 > '\u0000' && local29 < '\u0080' || !(local29 < ' ' || local29 > 'ÿ')) {
				local11[local18] = (byte) local29;
			} else if (local29 == '€') {
				local11[local18] = -128;
			} else if (local29 == '‚') {
				local11[local18] = -126;
			} else if (local29 == 'ƒ') {
				local11[local18] = -125;
			} else if (local29 == '„') {
				local11[local18] = -124;
			} else if (local29 == '…') {
				local11[local18] = -123;
			} else if (local29 == '†') {
				local11[local18] = -122;
			} else if (local29 == '‡') {
				local11[local18] = -121;
			} else if (local29 == 'ˆ') {
				local11[local18] = -120;
			} else if (local29 == '‰') {
				local11[local18] = -119;
			} else if (local29 == 'Š') {
				local11[local18] = -118;
			} else if (local29 == '‹') {
				local11[local18] = -117;
			} else if (local29 == 'Œ') {
				local11[local18] = -116;
			} else if (local29 == 'Ž') {
				local11[local18] = -114;
			} else if (local29 == '‘') {
				local11[local18] = -111;
			} else if (local29 == '’') {
				local11[local18] = -110;
			} else if (local29 == '“') {
				local11[local18] = -109;
			} else if (local29 == '”') {
				local11[local18] = -108;
			} else if (local29 == '•') {
				local11[local18] = -107;
			} else if (local29 == '–') {
				local11[local18] = -106;
			} else if (local29 == '—') {
				local11[local18] = -105;
			} else if (local29 == '˜') {
				local11[local18] = -104;
			} else if (local29 == '™') {
				local11[local18] = -103;
			} else if (local29 == 'š') {
				local11[local18] = -102;
			} else if (local29 == '›') {
				local11[local18] = -101;
			} else if (local29 == 'œ') {
				local11[local18] = -100;
			} else if (local29 == 'ž') {
				local11[local18] = -98;
			} else if (local29 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[Lclient!qf;I)V")
	public static void method396(@OriginalArg(1) Class146[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			@Pc(20) Class146 local20 = arg0[local12];
			if (local20 != null) {
				if (local20.anInt4370 == 0) {
					if (local20.aClass146Array2 != null) {
						method396(local20.aClass146Array2, arg1);
					}
					@Pc(43) Class1_Sub32 local43 = (Class1_Sub32) Static69.aClass156_6.method3821((long) local20.anInt4355);
					if (local43 != null) {
						Static86.method1270(arg1, local43.anInt5722);
					}
				}
				@Pc(62) Class1_Sub29 local62;
				if (arg1 == 0 && local20.anObjectArray10 != null) {
					local62 = new Class1_Sub29();
					local62.aClass146_16 = local20;
					local62.anObjectArray32 = local20.anObjectArray10;
					Static171.method2886(local62);
				}
				if (arg1 == 1 && local20.anObjectArray20 != null) {
					if (local20.anInt4407 >= 0) {
						@Pc(92) Class146 local92 = Static259.method3908(local20.anInt4355);
						if (local92 == null || local92.aClass146Array2 == null || local92.aClass146Array2.length <= local20.anInt4407 || local92.aClass146Array2[local20.anInt4407] != local20) {
							continue;
						}
					}
					local62 = new Class1_Sub29();
					local62.aClass146_16 = local20;
					local62.anObjectArray32 = local20.anObjectArray20;
					Static171.method2886(local62);
				}
			}
		}
	}
}
