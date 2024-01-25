import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!bt;I)V")
	public static void method570(@OriginalArg(0) Class48 arg0) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(40) int local40;
		@Pc(50) int local50;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(79) int local79;
		@Pc(46) int local46;
		if (arg0 == Static322.aClass48_12) {
			local12 = Static474.aClass5_Sub41_Sub2_2.method7816();
			local20 = (local12 >> 4 & 0x7) + Static10.anInt172;
			local27 = Static518.anInt8632 + (local12 & 0x7);
			local31 = Static474.aClass5_Sub41_Sub2_2.method7860();
			if (local31 == 65535) {
				local31 = -1;
			}
			local40 = Static474.aClass5_Sub41_Sub2_2.method7816();
			local46 = local40 >> 4 & 0xF;
			local50 = local40 & 0x7;
			local54 = Static474.aClass5_Sub41_Sub2_2.method7816();
			local58 = Static474.aClass5_Sub41_Sub2_2.method7816();
			local62 = Static474.aClass5_Sub41_Sub2_2.method7860();
			if (local20 >= 0 && local27 >= 0 && local20 < Static201.anInt3834 && local27 < Static626.anInt10238) {
				local79 = local46 + 1;
				if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0] >= local20 - local79 && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0] <= local20 + local79 && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0] >= local27 - local79 && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0] <= local79 + local27) {
					Static424.method6287(local31, local62, local58, local54, local46 + (local27 << 8) + (local20 << 16) + (Static3.anInt14 << 24), local50);
				}
			}
		} else if (Static87.aClass48_13 == arg0) {
			Static474.aClass5_Sub41_Sub2_2.method7816();
			local12 = Static474.aClass5_Sub41_Sub2_2.method7816();
			local20 = (local12 >> 4 & 0x7) + Static10.anInt172;
			local27 = Static518.anInt8632 + (local12 & 0x7);
			local31 = Static474.aClass5_Sub41_Sub2_2.method7860();
			local40 = Static474.aClass5_Sub41_Sub2_2.method7816();
			local46 = Static474.aClass5_Sub41_Sub2_2.method7807();
			@Pc(177) String local177 = Static474.aClass5_Sub41_Sub2_2.method7847();
			Static459.method6572(local46, local40, local27, Static3.anInt14, local20, local31, local177);
		} else {
			@Pc(268) int local268;
			@Pc(289) int local289;
			@Pc(293) int local293;
			@Pc(297) int local297;
			@Pc(272) int local272;
			if (arg0 == Static437.aClass48_15) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local20 = (local12 >> 4 & 0xF) + Static10.anInt172 * 2;
				local27 = Static518.anInt8632 * 2 + (local12 & 0xF);
				local31 = Static474.aClass5_Sub41_Sub2_2.method7816();
				@Pc(225) boolean local225 = (local31 & 0x1) != 0;
				@Pc(233) boolean local233 = (local31 & 0x2) != 0;
				local50 = local233 ? local31 >> 2 : -1;
				local54 = local20 + Static474.aClass5_Sub41_Sub2_2.method7861();
				local58 = local27 + Static474.aClass5_Sub41_Sub2_2.method7861();
				local62 = Static474.aClass5_Sub41_Sub2_2.method7849();
				local79 = Static474.aClass5_Sub41_Sub2_2.method7849();
				local268 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local272 = Static474.aClass5_Sub41_Sub2_2.method7816();
				if (local233) {
					local272 = (byte) local272;
				} else {
					local272 *= 4;
				}
				local289 = Static474.aClass5_Sub41_Sub2_2.method7816() * 4;
				local293 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local297 = Static474.aClass5_Sub41_Sub2_2.method7860();
				@Pc(301) int local301 = Static474.aClass5_Sub41_Sub2_2.method7816();
				@Pc(305) int local305 = Static474.aClass5_Sub41_Sub2_2.method7860();
				if (local301 == 255) {
					local301 = -1;
				}
				if (local20 >= 0 && local27 >= 0 && local20 < Static201.anInt3834 * 2 && Static201.anInt3834 * 2 > local27 && local54 >= 0 && local58 >= 0 && Static626.anInt10238 * 2 > local54 && Static626.anInt10238 * 2 > local58 && local268 != 65535) {
					local54 *= 256;
					local58 = local58 * 256;
					local272 <<= 0x2;
					local289 <<= 0x2;
					local20 *= 256;
					local27 = local27 * 256;
					local305 <<= 0x2;
					if (local62 != 0 && local50 != -1) {
						@Pc(389) Class28_Sub1_Sub4_Sub2 local389 = null;
						@Pc(399) int local399;
						if (local62 < 0) {
							local399 = -local62 - 1;
							if (Static216.anInt4046 == local399) {
								local389 = Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1;
							} else {
								local389 = Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local399];
							}
						} else {
							local399 = local62 - 1;
							@Pc(425) Class5_Sub25 local425 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local399);
							if (local425 != null) {
								local389 = local425.aClass28_Sub1_Sub4_Sub2_Sub1_1;
							}
						}
						if (local389 != null) {
							@Pc(436) Class167 local436 = local389.method4580();
							if (local436.anIntArrayArray22 != null && local436.anIntArrayArray22[local50] != null) {
								local272 -= local436.anIntArrayArray22[local50][1];
							}
							if (local436.anIntArrayArray21 != null && local436.anIntArrayArray21[local50] != null) {
								local272 -= local436.anIntArrayArray21[local50][1];
							}
						}
					}
					@Pc(493) Class28_Sub1_Sub4_Sub3 local493 = new Class28_Sub1_Sub4_Sub3(local268, Static3.anInt14, Static3.anInt14, local20, local27, local272, local293 + Static26.anInt350, Static26.anInt350 + local297, local301, local305, local62, local79, local289, local225, local50);
					local493.method5899(Static441.method6444(Static3.anInt14, local54, local58) - local289, local58, local293 + Static26.anInt350, local54);
					Static641.aClass114_67.method2807(new Class5_Sub3_Sub12(local493));
				}
			} else if (arg0 == Static511.aClass48_16) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7799();
				local20 = Static518.anInt8632 + (local12 & 0x7);
				local27 = local20 + Static201.anInt3839;
				local31 = (local12 >> 4 & 0x7) + Static10.anInt172;
				local40 = local31 + Static153.anInt3147;
				local46 = Static474.aClass5_Sub41_Sub2_2.method7796();
				@Pc(567) Class5_Sub31 local567 = (Class5_Sub31) Static548.aClass300_41.method7188((long) (Static3.anInt14 << 28 | local27 << 14 | local40));
				if (local567 != null) {
					for (@Pc(575) Class5_Sub51 local575 = (Class5_Sub51) local567.aClass114_39.method2805(); local575 != null; local575 = (Class5_Sub51) local567.aClass114_39.method2814()) {
						if (local575.anInt9059 == (local46 & 0x7FFF)) {
							local575.method9052();
							break;
						}
					}
					if (local567.aClass114_39.method2810()) {
						local567.method9052();
					}
					if (local31 >= 0 && local20 >= 0 && local31 < Static201.anInt3834 && Static626.anInt10238 > local20) {
						Static351.method4744(Static3.anInt14, local31, local20);
					}
				}
			} else if (arg0 == Static620.aClass48_18) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7796();
				local20 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local27 = Static474.aClass5_Sub41_Sub2_2.method7799();
				local31 = (local27 & 0x7) + Static518.anInt8632;
				local40 = Static201.anInt3839 + local31;
				local46 = (local27 >> 4 & 0x7) + Static10.anInt172;
				local50 = Static153.anInt3147 + local46;
				local54 = Static474.aClass5_Sub41_Sub2_2.method7796();
				if (Static216.anInt4046 != local20) {
					@Pc(706) boolean local706 = local46 >= 0 && local31 >= 0 && local46 < Static201.anInt3834 && local31 < Static626.anInt10238;
					if (local706 || Static24.method6161(Static31.anInt483)) {
						Static245.method704(Static3.anInt14, new Class5_Sub51(local12, local54), local40, local50);
						if (local706) {
							Static351.method4744(Static3.anInt14, local46, local31);
						}
					}
				}
			} else if (arg0 == Static587.aClass48_17) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7796();
				local20 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local27 = (local20 & 0x7) + Static518.anInt8632;
				local31 = Static201.anInt3839 + local27;
				local40 = (local20 >> 4 & 0x7) + Static10.anInt172;
				local46 = local40 + Static153.anInt3147;
				local50 = Static474.aClass5_Sub41_Sub2_2.method7796();
				@Pc(795) boolean local795 = local40 >= 0 && local27 >= 0 && local40 < Static201.anInt3834 && local27 < Static626.anInt10238;
				if (local795 || Static24.method6161(Static31.anInt483)) {
					Static245.method704(Static3.anInt14, new Class5_Sub51(local50, local12), local31, local46);
					if (local795) {
						Static351.method4744(Static3.anInt14, local40, local27);
					}
				}
			} else if (arg0 == Static150.aClass48_6) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local20 = Static474.aClass5_Sub41_Sub2_2.method7816();
				Static568.aClass315_5.method7511(local12).method3918(local20);
			} else if (arg0 == Static166.aClass48_7) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local20 = Static518.anInt8632 + (local12 & 0x7);
				local27 = local20 + Static201.anInt3839;
				local31 = Static10.anInt172 + (local12 >> 4 & 0x7);
				local40 = Static153.anInt3147 + local31;
				local46 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local50 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local54 = Static474.aClass5_Sub41_Sub2_2.method7860();
				if (Static548.aClass300_41 != null) {
					@Pc(902) Class5_Sub31 local902 = (Class5_Sub31) Static548.aClass300_41.method7188((long) (local40 | Static3.anInt14 << 28 | local27 << 14));
					if (local902 != null) {
						for (@Pc(910) Class5_Sub51 local910 = (Class5_Sub51) local902.aClass114_39.method2805(); local910 != null; local910 = (Class5_Sub51) local902.aClass114_39.method2814()) {
							if (local910.anInt9059 == (local46 & 0x7FFF) && local50 == local910.anInt9060) {
								local910.method9052();
								local910.anInt9060 = local54;
								Static245.method704(Static3.anInt14, local910, local27, local40);
								break;
							}
						}
						if (local31 >= 0 && local20 >= 0 && Static201.anInt3834 > local31 && Static626.anInt10238 > local20) {
							Static351.method4744(Static3.anInt14, local31, local20);
						}
					}
				}
			} else if (Static70.aClass48_3 == arg0) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local20 = local12 >> 2;
				local27 = local12 & 0x3;
				local31 = Static286.anIntArray310[local20];
				local40 = Static474.aClass5_Sub41_Sub2_2.method7818();
				local46 = Static10.anInt172 + (local40 >> 4 & 0x7);
				local50 = (local40 & 0x7) + Static518.anInt8632;
				if (Static24.method6161(Static31.anInt483) || local46 >= 0 && local50 >= 0 && local46 < Static201.anInt3834 && Static626.anInt10238 > local50) {
					Static157.method2791(Static3.anInt14, -1, local31, local27, local50, local46, local20);
				}
			} else if (Static200.aClass48_9 == arg0) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7816();
				@Pc(1060) boolean local1060 = (local12 & 0x80) != 0;
				local27 = (local12 >> 3 & 0x7) + Static10.anInt172;
				local31 = Static518.anInt8632 + (local12 & 0x7);
				local40 = Static474.aClass5_Sub41_Sub2_2.method7861() + local27;
				local46 = local31 + Static474.aClass5_Sub41_Sub2_2.method7861();
				local50 = Static474.aClass5_Sub41_Sub2_2.method7849();
				local54 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local58 = Static474.aClass5_Sub41_Sub2_2.method7816() * 4;
				local62 = Static474.aClass5_Sub41_Sub2_2.method7816() * 4;
				local79 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local268 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local272 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local289 = Static474.aClass5_Sub41_Sub2_2.method7860();
				if (local272 == 255) {
					local272 = -1;
				}
				if (local27 >= 0 && local31 >= 0 && local27 < Static201.anInt3834 && local31 < Static626.anInt10238 && local40 >= 0 && local46 >= 0 && local40 < Static201.anInt3834 && local46 < Static626.anInt10238 && local54 != 65535) {
					local62 <<= 0x2;
					local289 <<= 0x2;
					local40 = local40 * 512 + 256;
					local27 = local27 * 512 + 256;
					local31 = local31 * 512 + 256;
					local46 = local46 * 512 + 256;
					local58 <<= 0x2;
					@Pc(1230) Class28_Sub1_Sub4_Sub3 local1230 = new Class28_Sub1_Sub4_Sub3(local54, Static3.anInt14, Static3.anInt14, local27, local31, local58, Static26.anInt350 + local79, Static26.anInt350 + local268, local272, local289, 0, local50, local62, local1060, -1);
					local1230.method5899(Static441.method6444(Static3.anInt14, local40, local46) - local62, local46, Static26.anInt350 + local79, local40);
					Static641.aClass114_67.method2807(new Class5_Sub3_Sub12(local1230));
				}
			} else if (Static401.aClass48_14 == arg0) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7818();
				local20 = (local12 >> 4 & 0x7) + Static10.anInt172;
				local27 = Static518.anInt8632 + (local12 & 0x7);
				local31 = Static474.aClass5_Sub41_Sub2_2.method7799();
				local40 = local31 >> 2;
				local46 = local31 & 0x3;
				local50 = Static286.anIntArray310[local40];
				local54 = Static474.aClass5_Sub41_Sub2_2.method7858();
				if (Static24.method6161(Static31.anInt483) || local20 >= 0 && local27 >= 0 && local20 < Static201.anInt3834 && local27 < Static626.anInt10238) {
					Static157.method2791(Static3.anInt14, local54, local50, local46, local27, local20, local40);
				}
			} else if (arg0 == Static216.aClass48_10) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7799();
				local20 = (local12 >> 4 & 0x7) + Static10.anInt172;
				local27 = Static518.anInt8632 + (local12 & 0x7);
				local31 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local40 = local31 >> 2;
				local46 = local31 & 0x3;
				local50 = Static286.anIntArray310[local40];
				local54 = Static474.aClass5_Sub41_Sub2_2.method7838();
				if (local54 == 65535) {
					local54 = -1;
				}
				Static230.method3562(local20, Static3.anInt14, local40, local54, local27, local50, local46);
			} else if (arg0 == Static430.aClass48_2) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local20 = (local12 >> 4 & 0x7) + Static10.anInt172;
				local27 = (local12 & 0x7) + Static518.anInt8632;
				local31 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local40 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local46 = Static474.aClass5_Sub41_Sub2_2.method7860();
				local50 = Static474.aClass5_Sub41_Sub2_2.method7816();
				if (local20 >= 0 && local27 >= 0 && local20 < Static201.anInt3834 && local27 < Static626.anInt10238) {
					local54 = local20 * 512 + 256;
					local58 = local27 * 512 + 256;
					local62 = Static3.anInt14;
					if (local62 < 3 && Static599.method8200(local27, local20)) {
						local62++;
					}
					@Pc(1489) Class28_Sub1_Sub4_Sub4 local1489 = new Class28_Sub1_Sub4_Sub4(local31, local46, Static26.anInt350, Static3.anInt14, local62, local54, Static441.method6444(Static3.anInt14, local54, local58) - local40, local58, local20, local20, local27, local27, local50);
					Static456.aClass114_53.method2807(new Class5_Sub3_Sub8(local1489));
				}
			} else if (Static184.aClass48_8 == arg0) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local20 = (local12 >> 4 & 0x7) + Static10.anInt172;
				local27 = Static518.anInt8632 + (local12 & 0x7);
				local31 = Static474.aClass5_Sub41_Sub2_2.method7860();
				if (local31 == 65535) {
					local31 = -1;
				}
				local40 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local46 = local40 >> 4 & 0xF;
				local50 = local40 & 0x7;
				local54 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local58 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local62 = Static474.aClass5_Sub41_Sub2_2.method7860();
				if (local20 >= 0 && local27 >= 0 && local20 < Static201.anInt3834 && Static626.anInt10238 > local27) {
					local79 = local46 + 1;
					if (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0] >= local20 - local79 && local79 + local20 >= Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray308[0] && local27 - local79 <= Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0] && Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anIntArray307[0] <= local27 + local79) {
						Static291.method7984(local46 + (Static3.anInt14 << 24) + (local20 << 16) + (local27 << 8), local54, local50, local62, local31, local58);
					}
				}
			} else if (arg0 == Static314.aClass48_11) {
				local12 = Static474.aClass5_Sub41_Sub2_2.method7818();
				local20 = Static474.aClass5_Sub41_Sub2_2.method7816();
				local27 = Static10.anInt172 + (local20 >> 4 & 0x7);
				local31 = Static518.anInt8632 + (local20 & 0x7);
				local40 = Static474.aClass5_Sub41_Sub2_2.method7860();
				@Pc(1687) Class164 local1687 = Static568.aClass315_5.method7511(local40);
				local50 = Static474.aClass5_Sub41_Sub2_2.method7799();
				local54 = local50 >> 2;
				local58 = Static286.anIntArray310[local54];
				if (local54 == 11) {
					local54 = 10;
				}
				local62 = 0;
				if (local1687.aByteArray42 != null) {
					local79 = -1;
					for (local268 = 0; local268 < local1687.aByteArray42.length; local268++) {
						if (local54 == local1687.aByteArray42[local268]) {
							local79 = local268;
							break;
						}
					}
					local62 = local1687.anIntArrayArray20[local79].length;
				}
				local79 = 0;
				if (local1687.aShortArray68 != null) {
					local79 = local1687.aShortArray68.length;
				}
				local268 = 0;
				if (local1687.aShortArray69 != null) {
					local268 = local1687.aShortArray69.length;
				}
				if ((local12 & 0x1) == 1) {
					Static600.method8228(local27, local31, local58, Static3.anInt14, (Class225) null);
				} else {
					@Pc(1768) int[] local1768 = null;
					if ((local12 & 0x2) == 2) {
						local1768 = new int[local62];
						for (local289 = 0; local289 < local62; local289++) {
							local1768[local289] = Static474.aClass5_Sub41_Sub2_2.method7860();
						}
					}
					@Pc(1792) short[] local1792 = null;
					if ((local12 & 0x4) == 4) {
						local1792 = new short[local79];
						for (local293 = 0; local293 < local79; local293++) {
							local1792[local293] = (short) Static474.aClass5_Sub41_Sub2_2.method7860();
						}
					}
					@Pc(1823) short[] local1823 = null;
					if ((local12 & 0x8) == 8) {
						local1823 = new short[local268];
						for (local297 = 0; local297 < local268; local297++) {
							local1823[local297] = (short) Static474.aClass5_Sub41_Sub2_2.method7860();
						}
					}
					Static600.method8228(local27, local31, local58, Static3.anInt14, new Class225((long) Static554.aLong260++, local1768, local1792, local1823));
				}
			} else {
				Static234.method3615((Throwable) null, "T3 - " + arg0);
				Static628.method8487(false);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[FIII[II[I[FIIII)V")
	public static void method571(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) float[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		@Pc(11) int local11 = arg2 * arg6 + arg0;
		@Pc(17) int local17 = arg3 + arg11 * arg10;
		@Pc(22) int local22 = arg6 - arg4;
		@Pc(32) int local32 = arg11 - arg4;
		@Pc(36) int local36;
		@Pc(42) int local42;
		if (arg7 == null) {
			for (local36 = 0; local36 < arg9; local36++) {
				local42 = arg4 + local11;
				while (local11 < local42) {
					arg8[local17++] = arg1[local11++];
				}
				local11 += local22;
				local17 += local32;
			}
		} else if (arg1 == null) {
			for (local36 = 0; local36 < arg9; local36++) {
				local42 = arg4 + local11;
				while (local11 < local42) {
					arg5[local17++] = arg7[local11++];
				}
				local11 += local22;
				local17 += local32;
			}
		} else {
			for (local36 = 0; local36 < arg9; local36++) {
				local42 = local11 + arg4;
				while (local11 < local42) {
					arg5[local17] = arg7[local11];
					arg8[local17++] = arg1[local11++];
				}
				local11 += local22;
				local17 += local32;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ha;IBI)V")
	public static void method572(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static27.aClass347ArrayArray1 = new Class347[arg1][arg2];
		Static367.aClass65_11 = arg0;
		if (Static285.anIntArray309 != null) {
			Static555.aClass57_3 = Static319.method4990(Static285.anIntArray309[1], Static285.anIntArray309[0], Static285.anIntArray309[3], Static285.anIntArray309[2], Static285.anIntArray309[5], Static285.anIntArray309[4]);
		}
		Static67.aClass347_1 = new Class347();
		Static160.method2806();
	}
}
