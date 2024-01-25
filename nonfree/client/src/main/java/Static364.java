import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static364 {

	@OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
	public static int anInt7216;

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "I")
	public static int anInt7221;

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_72 = new Class230(55, 4);

	@OriginalMember(owner = "client!ob", name = "H", descriptor = "Lclient!ki;")
	public static Class183 aClass183_46 = new Class183();

	@OriginalMember(owner = "client!ob", name = "L", descriptor = "[I")
	public static int[] anIntArray461 = new int[2];

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IFIFFI[FIBIIII)V")
	public static void method6004(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		@Pc(3) int local3 = arg0 - arg8;
		@Pc(11) int local11 = arg11 - arg9;
		@Pc(15) int local15 = arg5 - arg2;
		@Pc(36) float local36 = (float) local11 * arg6[0] + (float) local15 * arg6[1] + (float) local3 * arg6[2];
		@Pc(57) float local57 = (float) local15 * arg6[4] + arg6[3] * (float) local11 + arg6[5] * (float) local3;
		@Pc(78) float local78 = (float) local11 * arg6[6] + (float) local15 * arg6[7] + arg6[8] * (float) local3;
		@Pc(98) float local98;
		@Pc(92) float local92;
		if (arg7 == 0) {
			local92 = arg1 + 0.5F - local78;
			local98 = local36 + arg3 + 0.5F;
		} else if (arg7 == 1) {
			local92 = local78 + arg1 + 0.5F;
			local98 = arg3 + local36 + 0.5F;
		} else if (arg7 == 2) {
			local92 = arg4 + 0.5F - local57;
			local98 = arg3 + 0.5F - local36;
		} else if (arg7 == 3) {
			local98 = local36 + arg3 + 0.5F;
			local92 = arg4 + 0.5F - local57;
		} else if (arg7 == 4) {
			local92 = arg4 + 0.5F - local57;
			local98 = arg1 + local78 + 0.5F;
		} else {
			local98 = arg1 + 0.5F - local78;
			local92 = arg4 + 0.5F - local57;
		}
		@Pc(201) float local201;
		if (arg10 == 1) {
			local201 = local98;
			local98 = -local92;
			local92 = local201;
		} else if (arg10 == 2) {
			local92 = -local92;
			local98 = -local98;
		} else if (arg10 == 3) {
			local201 = local98;
			local98 = local92;
			local92 = -local201;
		}
		Static367.aFloat152 = local98;
		Static523.aFloat186 = local92;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIILclient!oa;)V")
	public static void method6006(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class15 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static121.anInt3868 == 0 || Static276.anInt5860 == 0) {
			return;
		}
		arg2.m(Static477.anInt8923, Static556.anInt9967, Static121.anInt3868, Static276.anInt5860);
		arg2.ca(Static206.anInt8799, Static572.anInt10083, Static121.anInt3868, Static276.anInt5860);
		@Pc(36) Class255 local36 = arg2.method5294();
		local36.pa(Static122.anInt2790, Static24.anInt770, Static333.anInt6932, Static562.anInt9991, Static223.anInt4519, Static556.anInt9968);
		arg2.method5291(local36);
		@Pc(56) int local56;
		@Pc(65) int local65;
		@Pc(74) int local74;
		@Pc(77) int local77;
		@Pc(86) int local86;
		@Pc(95) int local95;
		@Pc(110) int[] local110;
		@Pc(142) int local142;
		@Pc(150) int local150;
		if (Static381.aClass4Array2 != null) {
			@Pc(51) int local51 = -1;
			@Pc(53) int local53 = -1;
			local56 = arg2.U();
			local65 = local56 * (arg1 - Static477.anInt8923) / Static121.anInt3868;
			local74 = (arg0 - Static556.anInt9967) * local56 / Static276.anInt5860;
			local77 = arg2.IA();
			local86 = local77 * (arg1 - Static477.anInt8923) / Static121.anInt3868;
			local95 = (arg0 - Static556.anInt9967) * local77 / Static276.anInt5860;
			local110 = new int[] { local65, local74, local56 };
			local36.O(local110);
			@Pc(128) int[] local128 = new int[] { local86, local95, local77 };
			local36.O(local128);
			@Pc(133) float local133 = 0.0F;
			local142 = local128[0] - local110[0];
			local150 = local128[1] - local110[1];
			@Pc(159) int local159 = local128[2] - local110[2];
			while (local133 < 1.0F) {
				@Pc(171) int local171 = (int) (local133 * (float) local142 + (float) local110[0]);
				@Pc(175) int local175 = local171 >> 9;
				@Pc(186) int local186 = (int) ((float) local159 * local133 + (float) local110[2]);
				@Pc(190) int local190 = local186 >> 9;
				if (local175 > 0 && local190 > 0 && local175 < Static460.anInt8640 && Static292.anInt7682 > local190) {
					@Pc(213) int local213 = Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103;
					if (local213 < 3 && (Static576.aByteArrayArrayArray21[1][local175][local190] & 0x2) != 0) {
						local213++;
					}
					if ((float) Static381.aClass4Array2[local213].sa(local171, local186) < (float) local150 * local133 + (float) local110[1]) {
						local51 = (Static443.aClass2_Sub2_Sub1_Sub1_2.method6311() - 1 << 8) + local171 >> 9;
						local53 = local186 + (Static443.aClass2_Sub2_Sub1_Sub1_2.method6311() - 1 << 8) >> 9;
						break;
					}
				}
				local133 = (float) ((double) local133 + 0.01D);
			}
			if (local51 != -1 && local53 != -1) {
				if (Static594.aBoolean851 && (Static564.anInt10012 & 0x40) != 0) {
					@Pc(305) Class305 local305 = Static282.method4864(Static352.anInt7064, Static317.anInt9395);
					if (local305 == null) {
						Static583.method7888();
					} else {
						Static200.method3365(local53, " ->", 0L, Static590.aString133, 19, -1, false, Static120.anInt2749, local51, true);
					}
				} else {
					if (Static581.aClass335_4 == Static329.aClass335_3) {
						Static200.method3365(local53, "", 0L, Static139.aClass101_26.method2841(Static126.anInt2904), 3, -1, false, -1, local51, true);
					}
					Static200.method3365(local53, "", 0L, Static591.aString134, 30, -1, false, Static446.anInt8510, local51, true);
				}
			}
		}
		@Pc(359) Class134 local359 = Static166.aClass134_4;
		for (@Pc(364) Class55_Sub6 local364 = (Class55_Sub6) local359.method3233(); local364 != null; local364 = (Class55_Sub6) local359.method3230()) {
			if ((Static489.aBoolean757 || Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 == local364.anInt8011) && local364.method6621(arg0, arg2, arg1)) {
				@Pc(489) int local489;
				@Pc(501) int local501;
				if (local364.aClass2_1 instanceof Class2_Sub2_Sub1_Sub1) {
					@Pc(387) Class2_Sub2_Sub1_Sub1 local387 = (Class2_Sub2_Sub1_Sub1) local364.aClass2_1;
					local65 = local387.method6311();
					if ((local65 & 0x1) == 0 && (local387.anInt9398 & 0x1FF) == 0 && (local387.anInt9396 & 0x1FF) == 0 || (local65 & 0x1) == 1 && (local387.anInt9398 & 0x1FF) == 256 && (local387.anInt9396 & 0x1FF) == 256) {
						local74 = local387.anInt9398 - (local387.method6311() - 1 << 8);
						local77 = local387.anInt9396 - (local387.method6311() - 1 << 8);
						for (local86 = 0; local86 < Static268.anInt5680; local86++) {
							@Pc(464) Class3_Sub46 local464 = (Class3_Sub46) Static331.aClass25_25.method946((long) Static304.anIntArray377[local86]);
							if (local464 != null) {
								@Pc(469) Class2_Sub2_Sub1_Sub2 local469 = local464.aClass2_Sub2_Sub1_Sub2_2;
								if (local469.anInt7608 != Static129.anInt10429 && local469.aBoolean647) {
									local489 = local469.anInt9398 - (local469.aClass169_1.anInt4979 - 1 << 8);
									local501 = local469.anInt9396 - (local469.aClass169_1.anInt4979 - 1 << 8);
									if (local74 <= local489 && local469.aClass169_1.anInt4979 <= local387.method6311() - (local489 - local74 >> 9) && local501 >= local77 && local469.aClass169_1.anInt4979 <= local387.method6311() - (local501 - local77 >> 9)) {
										Static557.method1632(Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 != local364.anInt8011, local469);
										local469.anInt7608 = Static129.anInt10429;
									}
								}
							}
						}
						local95 = Static455.anInt8611;
						local110 = Static492.anIntArray589;
						for (local489 = 0; local489 < local95; local489++) {
							@Pc(579) Class2_Sub2_Sub1_Sub1 local579 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local110[local489]];
							if (local579 != null && local579.anInt7608 != Static129.anInt10429 && local579 != local387 && local579.aBoolean647) {
								local142 = local579.anInt9398 - (local579.method6311() - 1 << 8);
								local150 = local579.anInt9396 - (local579.method6311() - 1 << 8);
								if (local142 >= local74 && local579.method6311() <= local387.method6311() - (local142 - local74 >> 9) && local77 <= local150 && local579.method6311() <= local387.method6311() - (local150 - local77 >> 9)) {
									Static411.method6653(local364.anInt8011 != Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, local579);
									local579.anInt7608 = Static129.anInt10429;
								}
							}
						}
					}
					if (local387.anInt7608 == Static129.anInt10429) {
						continue;
					}
					Static411.method6653(local364.anInt8011 != Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, local387);
					local387.anInt7608 = Static129.anInt10429;
				}
				@Pc(829) int local829;
				if (local364.aClass2_1 instanceof Class2_Sub2_Sub1_Sub2) {
					@Pc(718) Class2_Sub2_Sub1_Sub2 local718 = (Class2_Sub2_Sub1_Sub2) local364.aClass2_1;
					if (local718.aClass169_1 != null) {
						if ((local718.aClass169_1.anInt4979 & 0x1) == 0 && (local718.anInt9398 & 0x1FF) == 0 && (local718.anInt9396 & 0x1FF) == 0 || (local718.aClass169_1.anInt4979 & 0x1) == 1 && (local718.anInt9398 & 0x1FF) == 256 && (local718.anInt9396 & 0x1FF) == 256) {
							local65 = local718.anInt9398 - (local718.aClass169_1.anInt4979 - 1 << 8);
							local74 = local718.anInt9396 - (local718.aClass169_1.anInt4979 - 1 << 8);
							for (local77 = 0; local77 < Static268.anInt5680; local77++) {
								@Pc(801) Class3_Sub46 local801 = (Class3_Sub46) Static331.aClass25_25.method946((long) Static304.anIntArray377[local77]);
								if (local801 != null) {
									@Pc(806) Class2_Sub2_Sub1_Sub2 local806 = local801.aClass2_Sub2_Sub1_Sub2_2;
									if (local806.anInt7608 != Static129.anInt10429 && local718 != local806 && local806.aBoolean647) {
										local829 = local806.anInt9398 - (local806.aClass169_1.anInt4979 - 1 << 8);
										local489 = local806.anInt9396 - (local806.aClass169_1.anInt4979 - 1 << 8);
										if (local829 >= local65 && local718.aClass169_1.anInt4979 - (local829 - local65 >> 9) >= local806.aClass169_1.anInt4979 && local489 >= local74 && local806.aClass169_1.anInt4979 <= local718.aClass169_1.anInt4979 - (local489 - local74 >> 9)) {
											Static557.method1632(Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 != local364.anInt8011, local806);
											local806.anInt7608 = Static129.anInt10429;
										}
									}
								}
							}
							local86 = Static455.anInt8611;
							@Pc(905) int[] local905 = Static492.anIntArray589;
							for (local829 = 0; local829 < local86; local829++) {
								@Pc(914) Class2_Sub2_Sub1_Sub1 local914 = Static378.aClass2_Sub2_Sub1_Sub1Array10[local905[local829]];
								if (local914 != null && Static129.anInt10429 != local914.anInt7608 && local914.aBoolean647) {
									local501 = local914.anInt9398 - (local914.method6311() - 1 << 8);
									local142 = local914.anInt9396 - (local914.method6311() - 1 << 8);
									if (local65 <= local501 && local914.method6311() <= local718.aClass169_1.anInt4979 - (local501 - local65 >> 9) && local142 >= local74 && local914.method6311() <= local718.aClass169_1.anInt4979 - (local142 - local74 >> 9)) {
										Static411.method6653(local364.anInt8011 != Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, local914);
										local914.anInt7608 = Static129.anInt10429;
									}
								}
							}
						}
						if (local718.anInt7608 == Static129.anInt10429) {
							continue;
						}
						Static557.method1632(local364.anInt8011 != Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, local718);
						local718.anInt7608 = Static129.anInt10429;
					}
				}
				if (local364.aClass2_1 instanceof Class2_Sub5_Sub1) {
					local56 = local364.anInt8009 + Static230.anInt4667;
					local65 = Static563.anInt10006 + local364.anInt8007;
					@Pc(1072) Class3_Sub30 local1072 = (Class3_Sub30) Static30.aClass25_5.method946((long) (local65 << 14 | local364.anInt8011 << 28 | local56));
					if (local1072 != null) {
						for (@Pc(1080) Class3_Sub10 local1080 = (Class3_Sub10) local1072.aClass183_37.method4786(); local1080 != null; local1080 = (Class3_Sub10) local1072.aClass183_37.method4791()) {
							@Pc(1087) Class18 local1087 = Static517.aClass23_2.method901(local1080.anInt1852);
							if (Static594.aBoolean851 && Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 == local364.anInt8011) {
								@Pc(1105) Class240 local1105 = Static115.anInt2652 == -1 ? null : Static299.aClass17_2.method758(Static115.anInt2652);
								if ((Static564.anInt10012 & 0x1) != 0 && (local1105 == null || local1087.method763(local1105.anInt7291, Static115.anInt2652) != local1105.anInt7291)) {
									Static200.method3365(local364.anInt8007, Static569.aString131 + " -> <col=ff9040>" + local1087.aString6, (long) local1080.anInt1852, Static590.aString133, 21, -1, false, Static120.anInt2749, local364.anInt8009, true);
								}
							}
							if (local364.anInt8011 == Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103) {
								@Pc(1169) String[] local1169 = local1087.aStringArray3;
								for (local829 = 4; local829 >= 0; local829--) {
									if (local1169 != null && local1169[local829] != null) {
										@Pc(1180) byte local1180 = 0;
										if (local829 == 0) {
											local1180 = 16;
										}
										local501 = Static64.anInt1638;
										if (local829 == 1) {
											local1180 = 51;
										}
										if (local829 == 2) {
											local1180 = 44;
										}
										if (local829 == 3) {
											local1180 = 23;
										}
										if (local829 == local1087.anInt626) {
											local501 = local1087.anInt645;
										}
										if (local829 == 4) {
											local1180 = 4;
										}
										if (local1087.anInt628 == local829) {
											local501 = local1087.anInt654;
										}
										Static200.method3365(local364.anInt8007, "<col=ff9040>" + local1087.aString6, (long) local1080.anInt1852, local1169[local829], local1180, -1, false, local501, local364.anInt8009, true);
									}
								}
							}
							Static200.method3365(local364.anInt8007, "<col=ff9040>" + local1087.aString6, (long) local1080.anInt1852, Static139.aClass101_21.method2841(Static126.anInt2904), 1002, -1, Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 != local364.anInt8011, Static330.anInt6858, local364.anInt8009, true);
						}
					}
				}
				if (local364.aClass2_1 instanceof Interface22) {
					@Pc(1314) Interface22 local1314 = (Interface22) local364.aClass2_1;
					@Pc(1321) Class292 local1321 = Static253.aClass146_2.method3356(local1314.method8398());
					if (local1321.anIntArray571 != null) {
						local1321 = local1321.method7198(Static588.aClass322_1);
					}
					if (local1321 != null) {
						if (Static594.aBoolean851 && local364.anInt8011 == Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103) {
							@Pc(1349) Class240 local1349 = Static115.anInt2652 == -1 ? null : Static299.aClass17_2.method758(Static115.anInt2652);
							if ((Static564.anInt10012 & 0x4) != 0 && (local1349 == null || local1321.method7193(local1349.anInt7291, Static115.anInt2652) != local1349.anInt7291)) {
								Static200.method3365(local364.anInt8007, Static569.aString131 + " -> <col=00ffff>" + local1321.aString98, Static329.method5695(local364.anInt8007, local1314, local364.anInt8009), Static590.aString133, 60, -1, false, Static120.anInt2749, local364.anInt8009, true);
							}
						}
						if (Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103 == local364.anInt8011) {
							@Pc(1414) String[] local1414 = local1321.aStringArray30;
							if (local1414 != null) {
								for (local77 = 4; local77 >= 0; local77--) {
									if (local1414[local77] != null) {
										@Pc(1425) short local1425 = 0;
										if (local77 == 0) {
											local1425 = 49;
										}
										local95 = Static64.anInt1638;
										if (local77 == 1) {
											local1425 = 48;
										}
										if (local77 == 2) {
											local1425 = 18;
										}
										if (local77 == 3) {
											local1425 = 57;
										}
										if (local77 == 4) {
											local1425 = 1006;
										}
										if (local1321.anInt8739 == local77) {
											local95 = local1321.anInt8737;
										}
										if (local77 == local1321.anInt8736) {
											local95 = local1321.anInt8766;
										}
										Static200.method3365(local364.anInt8007, "<col=00ffff>" + local1321.aString98, Static329.method5695(local364.anInt8007, local1314, local364.anInt8009), local1414[local77], local1425, -1, false, local95, local364.anInt8009, true);
									}
								}
							}
						}
						Static200.method3365(local364.anInt8007, "<col=00ffff>" + local1321.aString98, (long) local1321.anInt8757, Static139.aClass101_21.method2841(Static126.anInt2904), 1004, -1, local364.anInt8011 != Static443.aClass2_Sub2_Sub1_Sub1_2.aByte103, Static330.anInt6858, local364.anInt8009, true);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)I")
	public static int method6010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(20) int local20 = 255 - local7;
		@Pc(38) int local38 = (local7 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		return ((local20 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local20 & 0xFF0000) >>> 8) + local38;
	}
}
