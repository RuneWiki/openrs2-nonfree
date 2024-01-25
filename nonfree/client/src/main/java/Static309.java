import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "[I")
	public static final int[] anIntArray346 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Z")
	public static boolean method4885(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static359.method5414(arg0, arg1) || Static378.method5890(arg0, arg1);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILclient!r;I)V")
	public static void method4887(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static266.anInt5352 == 0 || Static58.anInt1551 == 0) {
			return;
		}
		arg1.la(Static428.anInt8187, Static92.anInt8624, Static266.anInt5352, Static58.anInt1551);
		arg1.da(Static332.anInt6460, Static313.anInt6278, Static266.anInt5352, Static58.anInt1551);
		@Pc(35) Class81 local35 = arg1.method7842();
		local35.na(Static205.anInt4300, Static95.anInt2390, Static587.anInt10509, Static447.anInt10076, Static556.anInt10149, Static247.anInt5090);
		arg1.method7794(local35);
		@Pc(60) int local60;
		@Pc(69) int local69;
		@Pc(78) int local78;
		@Pc(81) int local81;
		@Pc(89) int local89;
		@Pc(97) int local97;
		@Pc(130) int[] local130;
		@Pc(144) int local144;
		@Pc(153) int local153;
		@Pc(162) int local162;
		@Pc(175) int local175;
		if (Static432.aClass115Array3 != null) {
			@Pc(55) int local55 = -1;
			@Pc(57) int local57 = -1;
			local60 = arg1.BA();
			local69 = local60 * (arg0 - Static428.anInt8187) / Static266.anInt5352;
			local78 = (arg2 - Static92.anInt8624) * local60 / Static58.anInt1551;
			local81 = arg1.U();
			local89 = local81 * (arg0 - Static428.anInt8187) / Static266.anInt5352;
			local97 = local81 * (arg2 - Static92.anInt8624) / Static58.anInt1551;
			@Pc(112) int[] local112 = new int[] { local69, local78, local60 };
			local35.YA(local112);
			local130 = new int[] { local89, local97, local81 };
			local35.YA(local130);
			@Pc(135) float local135 = 0.0F;
			local144 = local130[0] - local112[0];
			local153 = local130[1] - local112[1];
			local162 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				local175 = (int) ((float) local144 * local135 + (float) local112[0]);
				@Pc(179) int local179 = local175 >> 9;
				@Pc(190) int local190 = (int) ((float) local162 * local135 + (float) local112[2]);
				@Pc(194) int local194 = local190 >> 9;
				if (local179 > 0 && local194 > 0 && Static338.anInt6508 > local179 && local194 < Static390.anInt7654) {
					@Pc(211) int local211 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127;
					if (local211 < 3 && (Static266.aByteArrayArrayArray10[1][local179][local194] & 0x2) != 0) {
						local211++;
					}
					if ((float) Static432.aClass115Array3[local211].method8064(local175, local190) < local135 * (float) local153 + (float) local112[1]) {
						local55 = local175 + (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339() - 1 << 8) >> 9;
						local57 = (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.method3339() - 1 << 8) + local190 >> 9;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local55 != -1 && local57 != -1) {
				if (Static430.aBoolean586 && (Static264.anInt5328 & 0x40) != 0) {
					@Pc(340) Class155 local340 = Static539.method7544(Static286.anInt6126, Static569.anInt7644);
					if (local340 == null) {
						Static263.method4151();
					} else {
						Static437.method6478(local55, 0L, -1, local57, true, Static317.aString131, 16, " ->", false, Static398.anInt7799);
					}
				} else {
					if (Static324.aBoolean435) {
						Static437.method6478(local55, 0L, -1, local57, true, Static223.aClass152_31.method3624(Static142.anInt3088), 17, "", false, -1);
					}
					Static437.method6478(local55, 0L, -1, local57, true, Static541.aString211, 45, "", false, Static545.anInt9970);
				}
			}
		}
		@Pc(360) Class158 local360 = Static322.aClass158_13;
		for (@Pc(365) Class21_Sub4 local365 = (Class21_Sub4) local360.method3726(); local365 != null; local365 = (Class21_Sub4) local360.method3721()) {
			if ((Static21.aBoolean89 || local365.aClass21_Sub1_2.aByte127 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127) && local365.method2190(arg0, arg1, arg2)) {
				if (local365.aClass21_Sub1_2 instanceof Class21_Sub1_Sub1) {
					local60 = ((Class21_Sub1_Sub1) local365.aClass21_Sub1_2).aShort119;
					local69 = ((Class21_Sub1_Sub1) local365.aClass21_Sub1_2).aShort121;
				} else {
					local69 = local365.aClass21_Sub1_2.anInt10550 >> 9;
					local60 = local365.aClass21_Sub1_2.anInt10551 >> 9;
				}
				@Pc(503) int local503;
				@Pc(631) int local631;
				if (local365.aClass21_Sub1_2 instanceof Class21_Sub1_Sub1_Sub1_Sub2) {
					@Pc(428) Class21_Sub1_Sub1_Sub1_Sub2 local428 = (Class21_Sub1_Sub1_Sub1_Sub2) local365.aClass21_Sub1_2;
					local81 = local428.method3339();
					if ((local81 & 0x1) == 0 && (local428.anInt10551 & 0x1FF) == 0 && (local428.anInt10550 & 0x1FF) == 0 || (local81 & 0x1) == 1 && (local428.anInt10551 & 0x1FF) == 256 && (local428.anInt10550 & 0x1FF) == 256) {
						local89 = local428.anInt10551 - (local428.method3339() - 1 << 8);
						local97 = local428.anInt10550 - (local428.method3339() - 1 << 8);
						for (local503 = 0; local503 < Static137.anInt3042; local503++) {
							@Pc(516) Class4_Sub29 local516 = (Class4_Sub29) Static144.aClass221_6.method5075((long) Static24.anIntArray24[local503]);
							if (local516 != null) {
								@Pc(521) Class21_Sub1_Sub1_Sub1_Sub1 local521 = local516.aClass21_Sub1_Sub1_Sub1_Sub1_1;
								if (Static306.anInt6122 != local521.anInt4261 && local521.aBoolean295) {
									local144 = local521.anInt10551 - (local521.aClass51_1.anInt1581 - 1 << 8);
									local153 = local521.anInt10550 - (local521.aClass51_1.anInt1581 - 1 << 8);
									if (local144 >= local89 && local521.aClass51_1.anInt1581 <= local428.method3339() - (local144 - local89 >> 9) && local97 <= local153 && local521.aClass51_1.anInt1581 <= local428.method3339() - (local153 - local97 >> 9)) {
										Static546.method7655(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 != local365.aClass21_Sub1_2.aByte127, local521);
										local521.anInt4261 = Static306.anInt6122;
									}
								}
							}
						}
						local631 = Static57.anInt1513;
						@Pc(633) int[] local633 = Static447.anIntArray571;
						for (local144 = 0; local144 < local631; local144++) {
							@Pc(643) Class21_Sub1_Sub1_Sub1_Sub2 local643 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local633[local144]];
							if (local643 != null && local643.anInt4261 != Static306.anInt6122 && local428 != local643 && local643.aBoolean295) {
								local162 = local643.anInt10551 - (local643.method3339() - 1 << 8);
								local175 = local643.anInt10550 - (local643.method3339() - 1 << 8);
								if (local89 <= local162 && local643.method3339() <= local428.method3339() - (local162 - local89 >> 9) && local175 >= local97 && local643.method3339() <= local428.method3339() - (local175 - local97 >> 9)) {
									Static222.method3617(local643, local365.aClass21_Sub1_2.aByte127 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127);
									local643.anInt4261 = Static306.anInt6122;
								}
							}
						}
					}
					if (local428.anInt4261 == Static306.anInt6122) {
						continue;
					}
					Static222.method3617(local428, local365.aClass21_Sub1_2.aByte127 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127);
					local428.anInt4261 = Static306.anInt6122;
				}
				@Pc(901) int local901;
				if (local365.aClass21_Sub1_2 instanceof Class21_Sub1_Sub1_Sub1_Sub1) {
					@Pc(783) Class21_Sub1_Sub1_Sub1_Sub1 local783 = (Class21_Sub1_Sub1_Sub1_Sub1) local365.aClass21_Sub1_2;
					if (local783.aClass51_1 != null) {
						if ((local783.aClass51_1.anInt1581 & 0x1) == 0 && (local783.anInt10551 & 0x1FF) == 0 && (local783.anInt10550 & 0x1FF) == 0 || (local783.aClass51_1.anInt1581 & 0x1) == 1 && (local783.anInt10551 & 0x1FF) == 256 && (local783.anInt10550 & 0x1FF) == 256) {
							local81 = local783.anInt10551 - (local783.aClass51_1.anInt1581 - 1 << 8);
							local89 = local783.anInt10550 - (local783.aClass51_1.anInt1581 - 1 << 8);
							for (local97 = 0; local97 < Static137.anInt3042; local97++) {
								@Pc(868) Class4_Sub29 local868 = (Class4_Sub29) Static144.aClass221_6.method5075((long) Static24.anIntArray24[local97]);
								if (local868 != null) {
									@Pc(873) Class21_Sub1_Sub1_Sub1_Sub1 local873 = local868.aClass21_Sub1_Sub1_Sub1_Sub1_1;
									if (Static306.anInt6122 != local873.anInt4261 && local873 != local783 && local873.aBoolean295) {
										local901 = local873.anInt10551 - (local873.aClass51_1.anInt1581 - 1 << 8);
										local144 = local873.anInt10550 - (local873.aClass51_1.anInt1581 - 1 << 8);
										if (local901 >= local81 && local873.aClass51_1.anInt1581 <= local783.aClass51_1.anInt1581 - (local901 - local81 >> 9) && local89 <= local144 && local783.aClass51_1.anInt1581 - (local144 - local89 >> 9) >= local873.aClass51_1.anInt1581) {
											Static546.method7655(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 != local365.aClass21_Sub1_2.aByte127, local873);
											local873.anInt4261 = Static306.anInt6122;
										}
									}
								}
							}
							local503 = Static57.anInt1513;
							local130 = Static447.anIntArray571;
							for (local901 = 0; local901 < local503; local901++) {
								@Pc(984) Class21_Sub1_Sub1_Sub1_Sub2 local984 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local130[local901]];
								if (local984 != null && local984.anInt4261 != Static306.anInt6122 && local984.aBoolean295) {
									local153 = local984.anInt10551 - (local984.method3339() - 1 << 8);
									local162 = local984.anInt10550 - (local984.method3339() - 1 << 8);
									if (local81 <= local153 && local984.method3339() <= local783.aClass51_1.anInt1581 - (local153 - local81 >> 9) && local89 <= local162 && local984.method3339() <= local783.aClass51_1.anInt1581 - (local162 - local89 >> 9)) {
										Static222.method3617(local984, local365.aClass21_Sub1_2.aByte127 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127);
										local984.anInt4261 = Static306.anInt6122;
									}
								}
							}
						}
						if (local783.anInt4261 == Static306.anInt6122) {
							continue;
						}
						Static546.method7655(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 != local365.aClass21_Sub1_2.aByte127, local783);
						local783.anInt4261 = Static306.anInt6122;
					}
				}
				if (local365.aClass21_Sub1_2 instanceof Class21_Sub1_Sub4_Sub1) {
					local78 = local60 + Static242.anInt10133;
					local81 = Static157.anInt3323 + local69;
					@Pc(1147) Class4_Sub32 local1147 = (Class4_Sub32) Static17.aClass221_1.method5075((long) (local78 | local365.aClass21_Sub1_2.aByte127 << 28 | local81 << 14));
					if (local1147 != null) {
						for (@Pc(1155) Class4_Sub23 local1155 = (Class4_Sub23) local1147.aClass22_44.method885(); local1155 != null; local1155 = (Class4_Sub23) local1147.aClass22_44.method891()) {
							@Pc(1163) Class236 local1163 = Static338.aClass29_1.method977(local1155.anInt3993);
							if (Static430.aBoolean586 && Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127 == local365.aClass21_Sub1_2.aByte127) {
								@Pc(1185) Class275 local1185 = Static494.anInt9306 == -1 ? null : Static245.aClass107_2.method2503(Static494.anInt9306);
								if ((Static264.anInt5328 & 0x1) != 0 && (local1185 == null || local1163.method5330(Static494.anInt9306, local1185.anInt8186) != local1185.anInt8186)) {
									Static437.method6478(local60, (long) local1155.anInt3993, -1, local69, true, Static317.aString131, 19, Static393.aString154 + " -> <col=ff9040>" + local1163.aString139, false, Static398.anInt7799);
								}
							}
							if (local365.aClass21_Sub1_2.aByte127 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127) {
								@Pc(1240) String[] local1240 = local1163.aStringArray26;
								for (local901 = 4; local901 >= 0; local901--) {
									if (local1240 != null && local1240[local901] != null) {
										@Pc(1252) byte local1252 = 0;
										if (local901 == 0) {
											local1252 = 4;
										}
										local153 = Static542.anInt9892;
										if (local901 == 1) {
											local1252 = 46;
										}
										if (local901 == 2) {
											local1252 = 21;
										}
										if (local901 == 3) {
											local1252 = 48;
										}
										if (local1163.anInt6823 == local901) {
											local153 = local1163.anInt6807;
										}
										if (local901 == 4) {
											local1252 = 2;
										}
										if (local901 == local1163.anInt6826) {
											local153 = local1163.anInt6782;
										}
										Static437.method6478(local60, (long) local1155.anInt3993, -1, local69, true, local1240[local901], local1252, "<col=ff9040>" + local1163.aString139, false, local153);
									}
								}
							}
							Static437.method6478(local60, (long) local1155.anInt3993, -1, local69, true, Static223.aClass152_26.method3624(Static142.anInt3088), 1011, "<col=ff9040>" + local1163.aString139, local365.aClass21_Sub1_2.aByte127 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, Static112.anInt2571);
						}
					}
				}
				if (local365.aClass21_Sub1_2 instanceof Interface21) {
					@Pc(1384) Interface21 local1384 = (Interface21) local365.aClass21_Sub1_2;
					@Pc(1391) Class233 local1391 = Static103.aClass298_1.method6822(local1384.method7281());
					if (local1391.anIntArray374 != null) {
						local1391 = local1391.method5295(Static523.aClass173_1);
					}
					if (local1391 != null) {
						if (Static430.aBoolean586 && local365.aClass21_Sub1_2.aByte127 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127) {
							@Pc(1422) Class275 local1422 = Static494.anInt9306 == -1 ? null : Static245.aClass107_2.method2503(Static494.anInt9306);
							if ((Static264.anInt5328 & 0x4) != 0 && (local1422 == null || local1391.method5284(Static494.anInt9306, local1422.anInt8186) != local1422.anInt8186)) {
								Static437.method6478(local60, Static97.method1900(local1384, local60, local69), -1, local69, true, Static317.aString131, 57, Static393.aString154 + " -> <col=00ffff>" + local1391.aString137, false, Static398.anInt7799);
							}
						}
						if (local365.aClass21_Sub1_2.aByte127 == Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127) {
							@Pc(1483) String[] local1483 = local1391.aStringArray24;
							if (local1483 != null) {
								for (local97 = 4; local97 >= 0; local97--) {
									if (local1483[local97] != null) {
										@Pc(1495) short local1495 = 0;
										local631 = Static542.anInt9892;
										if (local97 == 0) {
											local1495 = 12;
										}
										if (local97 == 1) {
											local1495 = 30;
										}
										if (local97 == 2) {
											local1495 = 50;
										}
										if (local97 == 3) {
											local1495 = 22;
										}
										if (local97 == 4) {
											local1495 = 1003;
										}
										if (local97 == local1391.anInt6703) {
											local631 = local1391.anInt6700;
										}
										if (local97 == local1391.anInt6671) {
											local631 = local1391.anInt6711;
										}
										Static437.method6478(local60, Static97.method1900(local1384, local60, local69), -1, local69, true, local1483[local97], local1495, "<col=00ffff>" + local1391.aString137, false, local631);
									}
								}
							}
						}
						Static437.method6478(local60, (long) local1391.anInt6713, -1, local69, true, Static223.aClass152_26.method3624(Static142.anInt3088), 1008, "<col=00ffff>" + local1391.aString137, local365.aClass21_Sub1_2.aByte127 != Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aByte127, Static112.anInt2571);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
	public static void method4890() {
		Static228.aClass167_18.method3961();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)[I")
	public static int[] method4896() {
		return new int[] { Static9.anInt757, Static410.anInt8176, Static558.anInt10185 };
	}
}
