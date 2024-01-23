import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class93 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "Z")
	public boolean aBoolean237;

	@OriginalMember(owner = "client!lb", name = "i", descriptor = "J")
	private long aLong119;

	@OriginalMember(owner = "client!lb", name = "k", descriptor = "J")
	private long aLong120;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "I")
	private int anInt3212;

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!lb", name = "v", descriptor = "[I")
	public int[] anIntArray295;

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
	public int anInt3216;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	private void method2584() {
		@Pc(14) long local14 = this.aLong120;
		this.aLong120 = -1L;
		@Pc(19) long[] local19 = Class92.aLongArray6;
		this.aLong120 = this.aLong120 >>> 8 ^ local19[(int) (((long) (this.anInt3212 >> 8) ^ this.aLong120) & 0xFFL)];
		this.aLong120 = local19[(int) (((long) this.anInt3212 ^ this.aLong120) & 0xFFL)] ^ this.aLong120 >>> 8;
		@Pc(59) int local59;
		for (local59 = 0; local59 < 12; local59++) {
			this.aLong120 = local19[(int) ((this.aLong120 ^ (long) (this.anIntArray294[local59] >> 24)) & 0xFFL)] ^ this.aLong120 >>> 8;
			this.aLong120 = local19[(int) (((long) (this.anIntArray294[local59] >> 16) ^ this.aLong120) & 0xFFL)] ^ this.aLong120 >>> 8;
			this.aLong120 = this.aLong120 >>> 8 ^ local19[(int) ((this.aLong120 ^ (long) (this.anIntArray294[local59] >> 8)) & 0xFFL)];
			this.aLong120 = local19[(int) (((long) this.anIntArray294[local59] ^ this.aLong120) & 0xFFL)] ^ this.aLong120 >>> 8;
		}
		for (local59 = 0; local59 < 5; local59++) {
			this.aLong120 = local19[(int) ((this.aLong120 ^ (long) this.anIntArray295[local59]) & 0xFFL)] ^ this.aLong120 >>> 8;
		}
		this.aLong120 = this.aLong120 >>> 8 ^ local19[(int) (((long) (this.aBoolean237 ? 1 : 0) ^ this.aLong120) & 0xFFL)];
		if (local14 != 0L && local14 != this.aLong120) {
			Static205.aClass135_23.method3319(local14);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILclient!om;[Lclient!ac;IIILclient!om;IZIB)Lclient!q;")
	public Class14_Sub6 method2589(@OriginalArg(0) int arg0, @OriginalArg(1) Class125 arg1, @OriginalArg(2) Class3[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class125 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		if (this.anInt3216 != -1) {
			return Static205.method3293(this.anInt3216).method1272(arg0, arg7, arg2, arg3, arg1, arg6, arg5, arg8, arg4);
		}
		@Pc(29) int[] local29 = this.anIntArray294;
		@Pc(32) long local32 = this.aLong120;
		if (arg1 != null && (arg1.anInt3950 >= 0 || arg1.anInt3947 >= 0)) {
			local29 = new int[12];
			for (@Pc(50) int local50 = 0; local50 < 12; local50++) {
				local29[local50] = this.anIntArray294[local50];
			}
			if (arg1.anInt3950 >= 0) {
				if (arg1.anInt3950 == 65535) {
					local29[5] = 0;
					local32 ^= 0xFFFFFFFF00000000L;
				} else {
					local29[5] = arg1.anInt3950 | 0x40000000;
					local32 ^= (long) local29[5] << 32;
				}
			}
			if (arg1.anInt3947 >= 0) {
				if (arg1.anInt3947 == 65535) {
					local29[3] = 0;
					local32 ^= 0xFFFFFFFFL;
				} else {
					local29[3] = arg1.anInt3947 | 0x40000000;
					local32 ^= local29[3];
				}
			}
		}
		@Pc(136) Class14_Sub6 local136 = (Class14_Sub6) Static205.aClass135_23.method3316(local32);
		@Pc(141) boolean local141;
		@Pc(345) int local345;
		@Pc(331) int local331;
		@Pc(359) int local359;
		@Pc(366) int local366;
		@Pc(352) int local352;
		@Pc(437) int local437;
		@Pc(443) int local443;
		@Pc(461) int local461;
		@Pc(467) int local467;
		@Pc(510) int local510;
		@Pc(338) int local338;
		if (local136 == null) {
			local141 = false;
			@Pc(152) int local152;
			for (@Pc(143) int local143 = 0; local143 < 12; local143++) {
				local152 = local29[local143];
				if ((local152 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local152) != 0 && !Static188.method3145(local152 & 0x3FFFFFFF).method3002()) {
						local141 = true;
					}
				} else if (!Static112.method2060(local152 & 0x3FFFFFFF).method1247(this.aBoolean237)) {
					local141 = true;
				}
			}
			if (local141) {
				if (this.aLong119 != -1L) {
					local136 = (Class14_Sub6) Static205.aClass135_23.method3316(this.aLong119);
				}
				if (local136 == null) {
					return null;
				}
			}
			if (local136 == null) {
				@Pc(220) Class14_Sub3[] local220 = new Class14_Sub3[12];
				@Pc(231) int local231;
				for (local152 = 0; local152 < 12; local152++) {
					local231 = local29[local152];
					@Pc(248) Class14_Sub3 local248;
					if ((local231 & 0x40000000) != 0) {
						local248 = Static112.method2060(local231 & 0x3FFFFFFF).method1261(this.aBoolean237);
						if (local248 != null) {
							local220[local152] = local248;
						}
					} else if ((local231 & Integer.MIN_VALUE) != 0) {
						local248 = Static188.method3145(local231 & 0x3FFFFFFF).method2995();
						if (local248 != null) {
							local220[local152] = local248;
						}
					}
				}
				@Pc(285) Class164 local285 = null;
				if (this.anInt3212 != -1) {
					local285 = Static215.method3403(this.anInt3212);
				}
				if (local285 != null && local285.anIntArrayArray35 != null) {
					for (local231 = 0; local231 < local285.anIntArrayArray35.length; local231++) {
						if (local285.anIntArrayArray35[local231] != null && local220[local231] != null) {
							local331 = local285.anIntArrayArray35[local231][2];
							local338 = local285.anIntArrayArray35[local231][0];
							local345 = local285.anIntArrayArray35[local231][1];
							local352 = local285.anIntArrayArray35[local231][5];
							local359 = local285.anIntArrayArray35[local231][3];
							local366 = local285.anIntArrayArray35[local231][4];
							if (this.anIntArrayArray16 == null) {
								this.anIntArrayArray16 = new int[local285.anIntArrayArray35.length][];
							}
							if (this.anIntArrayArray16[local231] == null) {
								@Pc(390) int[] local390 = this.anIntArrayArray16[local231] = new int[15];
								if (local359 == 0 && local366 == 0 && local352 == 0) {
									local390[0] = local390[4] = local390[8] = 32768;
									local390[12] = -local338;
									local390[13] = -local345;
									local390[14] = -local331;
								} else {
									local437 = Class68.anIntArray226[local359] >> 1;
									local443 = Class68.anIntArray229[local359] >> 1;
									@Pc(449) int local449 = Class68.anIntArray226[local366] >> 1;
									@Pc(455) int local455 = Class68.anIntArray229[local366] >> 1;
									local461 = Class68.anIntArray226[local352] >> 1;
									local467 = Class68.anIntArray229[local352] >> 1;
									local390[8] = local437 * local449 + 16384 >> 15;
									local390[4] = local437 * local461 + 16384 >> 15;
									local390[5] = -local443;
									local390[3] = local437 * local467 + 16384 >> 15;
									local510 = local461 * local443 + 16384 >> 15;
									local390[1] = local455 * local510 + local449 * -local467 + 16384 >> 15;
									local390[2] = local455 * local437 + 16384 >> 15;
									@Pc(543) int local543 = local467 * local443 + 16384 >> 15;
									local390[0] = local543 * local455 + local449 * local461 + 16384 >> 15;
									local390[7] = local510 * local449 + -local455 * -local467 + 16384 >> 15;
									local390[6] = local449 * local543 + local461 * -local455 + 16384 >> 15;
									local390[13] = local390[7] * -local331 + local390[4] * -local345 + -local338 * local390[1] + 16384 >> 15;
									local390[12] = -local345 * local390[3] + local390[0] * -local338 + -local331 * local390[6] + 16384 >> 15;
									local390[14] = -local338 * local390[2] + local390[5] * -local345 + local390[8] * -local331 + 16384 >> 15;
								}
								local390[10] = local345;
								local390[9] = local338;
								local390[11] = local331;
							}
							if (local359 != 0 || local366 != 0 || local352 != 0) {
								local220[local231].method997(local359, local366, local352);
							}
							if (local338 != 0 || local345 != 0 || local331 != 0) {
								local220[local231].method995(local338, local345, local331);
							}
						}
					}
				}
				@Pc(736) Class14_Sub3 local736 = new Class14_Sub3(local220, local220.length);
				for (local338 = 0; local338 < 5; local338++) {
					if (Static267.aShortArrayArray6[local338].length > this.anIntArray295[local338]) {
						local736.method982(Static140.aShortArray51[local338], Static267.aShortArrayArray6[local338][this.anIntArray295[local338]]);
					}
					if (this.anIntArray295[local338] < Static162.aShortArrayArray2[local338].length) {
						local736.method982(Static211.aShortArray74[local338], Static162.aShortArrayArray2[local338][this.anIntArray295[local338]]);
					}
				}
				local136 = local736.method984(64, 850, -30, -50, -30);
				if (Static277.aBoolean412) {
					((Class14_Sub6_Sub1) local136).method2459(false, false, true, false, false, true);
				}
				Static205.aClass135_23.method3321(local32, local136);
				this.aLong119 = local32;
			}
		}
		@Pc(827) boolean local827 = false;
		@Pc(829) boolean local829 = false;
		local141 = false;
		local338 = arg2 == null ? 0 : arg2.length;
		@Pc(840) boolean local840 = false;
		@Pc(976) int local976;
		for (local345 = 0; local345 < local338; local345++) {
			if (arg2[local345] != null) {
				@Pc(856) Class125 local856 = Static90.method1591(arg2[local345].anInt110);
				if (local856.anIntArray357 != null) {
					Static83.aClass125Array2[local345] = local856;
					local141 = true;
					local359 = arg2[local345].anInt103;
					local366 = arg2[local345].anInt101;
					local352 = local856.anIntArray357[local359];
					Static2.aClass1_Sub2_Sub10Array1[local345] = Static274.method4179(local352 >>> 16);
					local352 &= 0xFFFF;
					Static223.anIntArray394[local345] = local352;
					if (Static2.aClass1_Sub2_Sub10Array1[local345] != null) {
						local829 |= Static2.aClass1_Sub2_Sub10Array1[local345].method1587(local352);
						local827 |= Static2.aClass1_Sub2_Sub10Array1[local345].method1589(local352);
						local840 |= local856.aBoolean302;
					}
					if ((local856.aBoolean298 || Static297.aBoolean453) && local366 != -1 && local366 < local856.anIntArray357.length) {
						Static62.anIntArray135[local345] = local856.anIntArray356[local359];
						Static188.anIntArray349[local345] = arg2[local345].anInt102;
						local976 = local856.anIntArray357[local366];
						Static201.aClass1_Sub2_Sub10Array7[local345] = Static274.method4179(local976 >>> 16);
						@Pc(988) int local988 = local976 & 0xFFFF;
						Static164.anIntArray312[local345] = local988;
						if (Static201.aClass1_Sub2_Sub10Array7[local345] != null) {
							local829 |= Static201.aClass1_Sub2_Sub10Array7[local345].method1587(local988);
							local827 |= Static201.aClass1_Sub2_Sub10Array7[local345].method1589(local988);
						}
					} else {
						Static62.anIntArray135[local345] = 0;
						Static188.anIntArray349[local345] = 0;
						Static201.aClass1_Sub2_Sub10Array7[local345] = null;
						Static164.anIntArray312[local345] = -1;
					}
				}
			}
		}
		if (!local141 && arg1 == null && arg6 == null) {
			return local136;
		}
		local331 = -1;
		@Pc(1032) Class1_Sub2_Sub10 local1032 = null;
		local359 = 0;
		@Pc(1036) Class1_Sub2_Sub10 local1036 = null;
		local345 = -1;
		if (arg1 != null) {
			local345 = arg1.anIntArray357[arg8];
			local976 = local345 >>> 16;
			local1036 = Static274.method4179(local976);
			local345 &= 0xFFFF;
			if (local1036 != null) {
				local829 |= local1036.method1587(local345);
				local827 |= local1036.method1589(local345);
				local840 |= arg1.aBoolean302;
			}
			if ((arg1.aBoolean298 || Static297.aBoolean453) && arg4 != -1 && arg1.anIntArray357.length > arg4) {
				local359 = arg1.anIntArray356[arg8];
				local331 = arg1.anIntArray357[arg4];
				local437 = local331 >>> 16;
				local331 &= 0xFFFF;
				if (local976 == local437) {
					local1032 = local1036;
				} else {
					local1032 = Static274.method4179(local331 >>> 16);
				}
				if (local1032 != null) {
					local829 |= local1032.method1587(local331);
					local827 |= local1032.method1589(local331);
				}
			}
		}
		local976 = -1;
		local437 = -1;
		local443 = 0;
		@Pc(1151) Class1_Sub2_Sub10 local1151 = null;
		@Pc(1153) Class1_Sub2_Sub10 local1153 = null;
		if (arg6 != null) {
			local976 = arg6.anIntArray357[arg5];
			local461 = local976 >>> 16;
			local976 &= 0xFFFF;
			local1151 = Static274.method4179(local461);
			if (local1151 != null) {
				local829 |= local1151.method1587(local976);
				local827 |= local1151.method1589(local976);
				local840 |= arg6.aBoolean302;
			}
			if ((arg6.aBoolean298 || Static297.aBoolean453) && arg3 != -1 && arg6.anIntArray357.length > arg3) {
				local443 = arg6.anIntArray356[arg5];
				local437 = arg6.anIntArray357[arg3];
				local467 = local437 >>> 16;
				local437 &= 0xFFFF;
				if (local461 == local467) {
					local1153 = local1151;
				} else {
					local1153 = Static274.method4179(local437 >>> 16);
				}
				if (local1153 != null) {
					local829 |= local1153.method1587(local437);
					local827 |= local1153.method1589(local437);
				}
			}
		}
		@Pc(1279) Class14_Sub6 local1279 = local136.method4104(!local827, !local829, !local840);
		local467 = 0;
		local510 = 1;
		while (local467 < local338) {
			if (Static2.aClass1_Sub2_Sub10Array1[local467] != null) {
				local1279.method4125(Static2.aClass1_Sub2_Sub10Array1[local467], Static223.anIntArray394[local467], Static201.aClass1_Sub2_Sub10Array7[local467], Static164.anIntArray312[local467], Static188.anIntArray349[local467] - 1, Static62.anIntArray135[local467], local510, Static83.aClass125Array2[local467].aBoolean302, this.anIntArrayArray16[local467]);
			}
			local510 <<= 0x1;
			local467++;
		}
		if (local1036 != null && local1151 != null) {
			local1279.method4110(local1036, local345, local1032, local331, arg0 - 1, local359, local1151, local976, local1153, local437, arg7 - 1, local443, arg1.aBooleanArray39, arg6.aBoolean302 | arg1.aBoolean302);
		} else if (local1036 != null) {
			local1279.method4105(local1036, local345, local1032, local331, arg0 - 1, local359, arg1.aBoolean302);
		} else if (local1151 != null) {
			local1279.method4105(local1151, local976, local1153, local437, arg7 - 1, local443, arg6.aBoolean302);
		}
		for (local467 = 0; local467 < local338; local467++) {
			Static2.aClass1_Sub2_Sub10Array1[local467] = null;
			Static201.aClass1_Sub2_Sub10Array7[local467] = null;
			Static83.aClass125Array2[local467] = null;
		}
		return local1279;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBLclient!om;IIII)Lclient!q;")
	public Class14_Sub6 method2590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class125 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) long local18 = (long) arg6 << 32 | (long) (arg3 << 16) | (long) arg1;
		@Pc(24) Class14_Sub6 local24 = (Class14_Sub6) Static232.aClass135_28.method3316(local18);
		if (local24 == null) {
			@Pc(30) Class14_Sub3[] local30 = new Class14_Sub3[3];
			@Pc(32) int local32 = 0;
			if (!Static188.method3145(arg1).method3000() || !Static188.method3145(arg3).method3000() || !Static188.method3145(arg6).method3000()) {
				return null;
			}
			@Pc(58) Class14_Sub3 local58 = Static188.method3145(arg1).method2998();
			if (local58 != null) {
				local32++;
				local30[0] = local58;
			}
			local58 = Static188.method3145(arg3).method2998();
			if (local58 != null) {
				local30[local32++] = local58;
			}
			local58 = Static188.method3145(arg6).method2998();
			if (local58 != null) {
				local30[local32++] = local58;
			}
			local58 = new Class14_Sub3(local30, local32);
			for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
				if (this.anIntArray295[local101] < Static267.aShortArrayArray6[local101].length) {
					local58.method982(Static140.aShortArray51[local101], Static267.aShortArrayArray6[local101][this.anIntArray295[local101]]);
				}
				if (this.anIntArray295[local101] < Static162.aShortArrayArray2[local101].length) {
					local58.method982(Static211.aShortArray74[local101], Static162.aShortArrayArray2[local101][this.anIntArray295[local101]]);
				}
			}
			local24 = local58.method984(64, 768, -50, -10, -50);
			Static232.aClass135_28.method3321(local18, local24);
		}
		if (arg2 != null) {
			local24 = arg2.method3165(arg4, arg5, arg0, local24);
		}
		return local24;
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)I")
	public int method2591() {
		return this.anInt3216 == -1 ? this.anIntArray294[1] + (this.anIntArray295[4] << 20) + (this.anIntArray295[0] << 25) + (this.anIntArray294[0] << 15) - (-(this.anIntArray294[8] << 10) - (this.anIntArray294[11] << 5)) : 305419896 - -Static205.method3293(this.anInt3216).anInt1572;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(III)V")
	public void method2592(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = Static296.anIntArray554[arg1];
		if (0 != this.anIntArray294[local11] && Static188.method3145(arg0) != null) {
			this.anIntArray294[local11] = Integer.MIN_VALUE | arg0;
			this.method2584();
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILclient!om;II)Lclient!q;")
	public Class14_Sub6 method2594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class125 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt3216 != -1) {
			return Static205.method3293(this.anInt3216).method1281(arg2, arg0, arg1, arg3);
		}
		@Pc(39) Class14_Sub6 local39 = (Class14_Sub6) Static232.aClass135_28.method3316(this.aLong120);
		if (local39 == null) {
			@Pc(45) boolean local45 = false;
			@Pc(57) int local57;
			for (@Pc(47) int local47 = 0; local47 < 12; local47++) {
				local57 = this.anIntArray294[local47];
				if ((local57 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local57) != 0 && !Static188.method3145(local57 & 0x3FFFFFFF).method3000()) {
						local45 = true;
					}
				} else if (!Static112.method2060(local57 & 0x3FFFFFFF).method1248(this.aBoolean237)) {
					local45 = true;
				}
			}
			if (local45) {
				return null;
			}
			@Pc(105) Class14_Sub3[] local105 = new Class14_Sub3[12];
			local57 = 0;
			@Pc(119) int local119;
			for (@Pc(109) int local109 = 0; local109 < 12; local109++) {
				local119 = this.anIntArray294[local109];
				@Pc(133) Class14_Sub3 local133;
				if ((local119 & 0x40000000) != 0) {
					local133 = Static112.method2060(local119 & 0x3FFFFFFF).method1258(this.aBoolean237);
					if (local133 != null) {
						local105[local57++] = local133;
					}
				} else if ((Integer.MIN_VALUE & local119) != 0) {
					local133 = Static188.method3145(local119 & 0x3FFFFFFF).method2998();
					if (local133 != null) {
						local105[local57++] = local133;
					}
				}
			}
			@Pc(173) Class14_Sub3 local173 = new Class14_Sub3(local105, local57);
			for (local119 = 0; local119 < 5; local119++) {
				if (Static267.aShortArrayArray6[local119].length > this.anIntArray295[local119]) {
					local173.method982(Static140.aShortArray51[local119], Static267.aShortArrayArray6[local119][this.anIntArray295[local119]]);
				}
				if (this.anIntArray295[local119] < Static162.aShortArrayArray2[local119].length) {
					local173.method982(Static211.aShortArray74[local119], Static162.aShortArrayArray2[local119][this.anIntArray295[local119]]);
				}
			}
			local39 = local173.method984(64, 768, -50, -10, -50);
			Static232.aClass135_28.method3321(this.aLong120, local39);
		}
		if (arg2 != null) {
			local39 = arg2.method3165(arg3, arg1, arg0, local39);
		}
		return local39;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II[I[IIZ)V")
	public void method2595(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg3 != this.anInt3212) {
			this.anInt3212 = arg3;
			this.anIntArrayArray16 = null;
		}
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(32) int local32 = 0; local32 < 8; local32++) {
				for (@Pc(39) int local39 = 0; local39 < Static63.anInt1345; local39++) {
					@Pc(50) Class112 local50 = Static188.method3145(local39);
					if (local50 != null && !local50.aBoolean281 && (arg4 ? Static154.anIntArray299[local32] : Static74.anIntArray152[local32]) == local50.anInt3737) {
						arg2[Static296.anIntArray554[local32]] = Integer.MIN_VALUE | local39;
						break;
					}
				}
			}
		}
		this.anIntArray295 = arg1;
		this.anInt3216 = arg0;
		this.aBoolean237 = arg4;
		this.anIntArray294 = arg2;
		this.method2584();
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(III)V")
	public void method2597(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray295[arg1] = arg0;
		this.method2584();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V")
	public void method2598(@OriginalArg(0) boolean arg0) {
		this.aBoolean237 = arg0;
		this.method2584();
	}
}
