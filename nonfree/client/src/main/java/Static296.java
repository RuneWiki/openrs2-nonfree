import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
	public static int anInt5749 = 0;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[Lclient!gp;")
	public static Class74_Sub1[] aClass74_Sub1Array2 = new Class74_Sub1[0];

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILjava/lang/String;Z)V")
	public static void method5068(@OriginalArg(1) String arg0, @OriginalArg(2) boolean arg1) {
		Static240.aClass165_73.anInt4890 = 1;
		@Pc(11) String local11 = arg0.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static279.anInt5425; local18++) {
			@Pc(24) Class61 local24 = Static241.method4285(local18);
			if ((!arg1 || local24.aBoolean160) && local24.anInt1827 == -1 && local24.anInt1782 == -1 && local24.anInt1779 == 0 && local24.aString74.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static243.anInt4740 = -1;
					Static37.aShortArray16 = null;
					return;
				}
				if (local16 >= local14.length) {
					@Pc(74) short[] local74 = new short[local14.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local16; local76++) {
						local74[local76] = local14[local76];
					}
					local14 = local74;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static37.aShortArray16 = local14;
		Static154.anInt3081 = 0;
		Static243.anInt4740 = local16;
		@Pc(109) String[] local109 = new String[Static243.anInt4740];
		for (@Pc(111) int local111 = 0; local111 < Static243.anInt4740; local111++) {
			local109[local111] = Static241.method4285(local14[local111]).aString74;
		}
		Static188.method3644(local109, Static37.aShortArray16);
		Static240.aClass165_73.method4495();
		Static240.aClass165_73.anInt4890 = 2;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "([[ILclient!aa;II[[BLclient!sm;Lclient!sm;ZII[[B[[B[[B)V")
	public static void method5069(@OriginalArg(0) int[][] arg0, @OriginalArg(1) Class2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) Class41 arg5, @OriginalArg(6) Class41 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) byte[][] arg10, @OriginalArg(12) byte[][] arg11) {
		if (Static258.anInt5029 == 0 && !Static71.aBoolean129) {
			Static101.method1910(arg2, arg11, arg7, arg0, arg6, arg4, arg10, arg3, arg9, arg8, arg1, arg5);
		} else {
			Static111.method2067(arg8, arg1, arg10, arg0, arg3, arg2, arg6, arg4, arg11, arg5, arg9, arg7);
		}
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!aa;III)V")
	public static void method5071(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static221.anInt4366 == 0 || Static311.anInt5995 == 0) {
			return;
		}
		arg0.method3278(Static111.anInt2269, Static86.anInt1689, Static221.anInt4366, Static311.anInt5995);
		arg0.method3250(Static174.anInt3615, Static40.anInt4333, Static221.anInt4366, Static311.anInt5995);
		@Pc(35) Class21 local35 = arg0.method3298();
		local35.method2812(Static273.anInt5336, Static73.anInt1509, Static188.anInt3907, Static311.anInt5998, Static193.anInt3951, Static126.anInt2479);
		arg0.method3239(local35);
		@Pc(68) int local68;
		@Pc(77) int local77;
		@Pc(80) int local80;
		@Pc(89) int local89;
		@Pc(98) int local98;
		if (Static243.anInt4739 == 0 && Static288.aClass41Array5 != null) {
			@Pc(55) int local55 = -1;
			@Pc(57) int local57 = -1;
			@Pc(60) int local60 = arg0.method3340();
			local68 = (arg1 - Static111.anInt2269) * local60 / Static221.anInt4366;
			local77 = local60 * (arg2 - Static86.anInt1689) / Static311.anInt5995;
			local80 = arg0.method3307();
			local89 = (arg1 - Static111.anInt2269) * local80 / Static221.anInt4366;
			local98 = (arg2 - Static86.anInt1689) * local80 / Static311.anInt5995;
			@Pc(113) int[] local113 = new int[] { local68, local77, local60 };
			local35.method2799(local113);
			@Pc(131) int[] local131 = new int[] { local89, local98, local80 };
			local35.method2799(local131);
			@Pc(136) float local136 = 0.0F;
			@Pc(145) int local145 = local131[0] - local113[0];
			@Pc(154) int local154 = local131[1] - local113[1];
			@Pc(163) int local163 = local131[2] - local113[2];
			while (local136 < 1.0F) {
				@Pc(176) int local176 = (int) ((float) local113[0] + local136 * (float) local145);
				@Pc(180) int local180 = local176 >> 7;
				@Pc(191) int local191 = (int) (local136 * (float) local163 + (float) local113[2]);
				@Pc(195) int local195 = local191 >> 7;
				if (local180 > 0 && local195 > 0 && local180 < Static48.anInt1107 && Static337.anInt6402 > local195) {
					@Pc(211) int local211 = Static285.anInt5511;
					if (local211 < 3 && (Static183.aByteArrayArrayArray7[1][local180][local195] & 0x2) != 0) {
						local211++;
					}
					if ((float) Static288.aClass41Array5[local211].method5433(local176, local191) < local136 * (float) local154 + (float) local113[1]) {
						local55 = Static130.aClass5_Sub3_Sub3_Sub1_1.method4541() * 64 + local176 - 64 >> 7;
						local57 = local191 + (Static130.aClass5_Sub3_Sub3_Sub1_1.method4541() - 1) * 64 >> 7;
						break;
					}
				}
				local136 = (float) ((double) local136 + 0.01D);
			}
			if (local55 != -1 && local57 != -1) {
				if (Static89.aBoolean156 && (Static95.anInt1903 & 0x40) != 0) {
					@Pc(305) Class177 local305 = Static323.method5412(Static90.anInt1762, Static99.anInt1953);
					if (local305 == null) {
						Static149.method2393();
					} else {
						Static164.method3162(Static181.anInt3761, local57, " ->", 0L, 3, local55, Static21.aString15);
					}
				} else {
					if (Static341.anInt2259 == 1) {
						Static164.method3162(-1, local57, "", 0L, 12, local55, Static343.aString197);
					}
					Static164.method3162(-1, local57, "", 0L, 11, local55, Static331.aString252);
				}
			}
		}
		@Pc(354) Class175 local354 = Static46.aClass175_1;
		for (@Pc(359) Class15_Sub3 local359 = (Class15_Sub3) local354.method4669(); local359 != null; local359 = (Class15_Sub3) local354.method4673()) {
			if (local359.method1110(arg1, arg0, arg2) && local359.anInt1118 == Static285.anInt5511) {
				@Pc(485) int local485;
				@Pc(497) int local497;
				if (local359.aClass5_1 instanceof Class5_Sub3_Sub3_Sub1) {
					@Pc(384) Class5_Sub3_Sub3_Sub1 local384 = (Class5_Sub3_Sub3_Sub1) local359.aClass5_1;
					local68 = local384.method4541();
					if ((local68 & 0x1) == 0 && (local384.anInt5050 & 0x7F) == 0 && (local384.anInt5047 & 0x7F) == 0 || (local68 & 0x1) == 1 && (local384.anInt5050 & 0x7F) == 64 && (local384.anInt5047 & 0x7F) == 64) {
						local77 = local384.anInt5050 + 64 - local384.method4541() * 64;
						local80 = local384.anInt5047 + 64 - local384.method4541() * 64;
						for (local89 = 0; local89 < Static338.anInt6419; local89++) {
							@Pc(459) Class5_Sub3_Sub3_Sub2 local459 = Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local89]];
							if (local459 != null && local459.anInt4952 != Static215.anInt4246 && local459.aBoolean413) {
								local485 = local459.anInt5050 + 64 - local459.aClass122_1.anInt3819 * 64;
								local497 = local459.anInt5047 - (local459.aClass122_1.anInt3819 - 1) * 64;
								if (local77 <= local485 && local459.aClass122_1.anInt3819 <= local384.method4541() - (local485 - local77 >> 7) && local497 >= local80 && local459.aClass122_1.anInt3819 <= local384.method4541() - (local497 - local80 >> 7)) {
									Static148.method4537(local459);
									local459.anInt4952 = Static215.anInt4246;
								}
							}
						}
						for (local98 = 0; local98 < Static334.anInt6370; local98++) {
							@Pc(568) Class5_Sub3_Sub3_Sub1 local568 = Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local98]];
							if (local568 != null && Static215.anInt4246 != local568.anInt4952 && local384 != local568 && local568.aBoolean413) {
								local497 = local568.anInt5050 + 64 - local568.method4541() * 64;
								@Pc(610) int local610 = local568.anInt5047 - (local568.method4541() - 1) * 64;
								if (local77 <= local497 && local568.method4541() <= local384.method4541() - (local497 - local77 >> 7) && local80 <= local610 && local568.method4541() <= local384.method4541() - (local610 - local80 >> 7)) {
									Static214.method3951(local568);
									local568.anInt4952 = Static215.anInt4246;
								}
							}
						}
					}
					if (local384.anInt4952 == Static215.anInt4246) {
						continue;
					}
					Static214.method3951(local384);
					local384.anInt4952 = Static215.anInt4246;
				}
				if (local359.aClass5_1 instanceof Class5_Sub3_Sub3_Sub2) {
					@Pc(692) Class5_Sub3_Sub3_Sub2 local692 = (Class5_Sub3_Sub3_Sub2) local359.aClass5_1;
					if (local692.aClass122_1 != null) {
						if ((local692.aClass122_1.anInt3819 & 0x1) == 0 && (local692.anInt5050 & 0x7F) == 0 && (local692.anInt5047 & 0x7F) == 0 || (local692.aClass122_1.anInt3819 & 0x1) == 1 && (local692.anInt5050 & 0x7F) == 64 && (local692.anInt5047 & 0x7F) == 64) {
							local68 = local692.anInt5050 + 64 - local692.aClass122_1.anInt3819 * 64;
							local77 = local692.anInt5047 - (local692.aClass122_1.anInt3819 - 1) * 64;
							for (local80 = 0; local80 < Static338.anInt6419; local80++) {
								@Pc(773) Class5_Sub3_Sub3_Sub2 local773 = Static169.aClass5_Sub3_Sub3_Sub2Array2[Static25.anIntArray83[local80]];
								if (local773 != null && Static215.anInt4246 != local773.anInt4952 && local692 != local773 && local773.aBoolean413) {
									local98 = local773.anInt5050 - (local773.aClass122_1.anInt3819 - 1) * 64;
									local485 = local773.anInt5047 + 64 - local773.aClass122_1.anInt3819 * 64;
									if (local98 >= local68 && local692.aClass122_1.anInt3819 - (local98 - local68 >> 7) >= local773.aClass122_1.anInt3819 && local77 <= local485 && local773.aClass122_1.anInt3819 <= local692.aClass122_1.anInt3819 - (local485 - local77 >> 7)) {
										Static148.method4537(local773);
										local773.anInt4952 = Static215.anInt4246;
									}
								}
							}
							for (local89 = 0; local89 < Static334.anInt6370; local89++) {
								@Pc(877) Class5_Sub3_Sub3_Sub1 local877 = Static254.aClass5_Sub3_Sub3_Sub1Array1[Static123.anIntArray290[local89]];
								if (local877 != null && Static215.anInt4246 != local877.anInt4952 && local877.aBoolean413) {
									local485 = local877.anInt5050 - (local877.method4541() - 1) * 64;
									local497 = local877.anInt5047 - (local877.method4541() - 1) * 64;
									if (local68 <= local485 && local877.method4541() <= local692.aClass122_1.anInt3819 - (local485 - local68 >> 7) && local497 >= local77 && local877.method4541() <= local692.aClass122_1.anInt3819 - (local497 - local77 >> 7)) {
										Static214.method3951(local877);
										local877.anInt4952 = Static215.anInt4246;
									}
								}
							}
						}
						if (local692.anInt4952 == Static215.anInt4246) {
							continue;
						}
						Static148.method4537(local692);
						local692.anInt4952 = Static215.anInt4246;
					}
				}
				if (local359.aClass5_1 instanceof Class5_Sub2_Sub1) {
					@Pc(996) Class1_Sub39 local996 = (Class1_Sub39) Static52.aClass26_4.method870((long) (local359.anInt1119 << 14 | local359.anInt1118 << 28 | local359.anInt1115));
					if (local996 != null) {
						for (@Pc(1004) Class1_Sub28 local1004 = (Class1_Sub28) local996.aClass195_47.method5030(); local1004 != null; local1004 = (Class1_Sub28) local996.aClass195_47.method5023()) {
							@Pc(1011) Class61 local1011 = Static241.method4285(local1004.anInt4495);
							if (Static243.anInt4739 == 1) {
								Static164.method3162(Static320.anInt6136, local359.anInt1119, Static285.aString222 + " -> <col=ff9040>" + local1011.aString74, (long) local1004.anInt4495, 35, local359.anInt1115, Static313.aString241);
							} else if (Static89.aBoolean156) {
								@Pc(1054) Class1_Sub1_Sub18 local1054 = Static21.anInt502 == -1 ? null : Static305.method5149(Static21.anInt502);
								if ((Static95.anInt1903 & 0x1) != 0 && (local1054 == null || local1011.method1732(Static21.anInt502, local1054.anInt5480) != local1054.anInt5480)) {
									Static164.method3162(Static181.anInt3761, local359.anInt1119, Static144.aString113 + " -> <col=ff9040>" + local1011.aString74, (long) local1004.anInt4495, 44, local359.anInt1115, Static21.aString15);
								}
							} else {
								@Pc(1104) String[] local1104 = local1011.aStringArray11;
								for (local89 = 4; local89 >= 0; local89--) {
									if (local1104 != null && local1104[local89] != null) {
										@Pc(1116) byte local1116 = 0;
										if (local89 == 0) {
											local1116 = 34;
										}
										local485 = Static57.anInt1269;
										if (local89 == 1) {
											local1116 = 10;
										}
										if (local89 == 2) {
											local1116 = 4;
										}
										if (local89 == 3) {
											local1116 = 47;
										}
										if (local1011.anInt1785 == local89) {
											local485 = local1011.anInt1816;
										}
										if (local89 == 4) {
											local1116 = 42;
										}
										if (local89 == local1011.anInt1814) {
											local485 = local1011.anInt1833;
										}
										Static164.method3162(local485, local359.anInt1119, "<col=ff9040>" + local1011.aString74, (long) local1004.anInt4495, local1116, local359.anInt1115, local1104[local89]);
									}
								}
								Static164.method3162(Static338.anInt6420, local359.anInt1119, "<col=ff9040>" + local1011.aString74, (long) local1004.anInt4495, 1002, local359.anInt1115, Static206.aString167);
							}
						}
					}
				}
				if (local359.aClass5_1 instanceof Interface8) {
					@Pc(1241) Interface8 local1241 = (Interface8) local359.aClass5_1;
					@Pc(1247) Class188 local1247 = Static126.method2405(local1241.method5697());
					if (local1247.anIntArray697 != null) {
						local1247 = local1247.method4915();
					}
					if (local1247 != null) {
						if (Static243.anInt4739 == 1) {
							Static164.method3162(Static320.anInt6136, local359.anInt1119, Static285.aString222 + " -> <col=00ffff>" + local1247.aString223, Static51.method4581(local359.anInt1115, local359.anInt1119, local1241), 23, local359.anInt1115, Static313.aString241);
						} else if (Static89.aBoolean156) {
							@Pc(1395) Class1_Sub1_Sub18 local1395 = Static21.anInt502 == -1 ? null : Static305.method5149(Static21.anInt502);
							if ((Static95.anInt1903 & 0x4) != 0 && (local1395 == null || local1247.method4906(Static21.anInt502, local1395.anInt5480) != local1395.anInt5480)) {
								Static164.method3162(Static181.anInt3761, local359.anInt1119, Static144.aString113 + " -> <col=00ffff>" + local1247.aString223, Static51.method4581(local359.anInt1115, local359.anInt1119, local1241), 29, local359.anInt1115, Static21.aString15);
							}
						} else {
							@Pc(1266) String[] local1266 = local1247.aStringArray38;
							if (local1266 != null) {
								for (local80 = 4; local80 >= 0; local80--) {
									if (local1266[local80] != null) {
										@Pc(1278) short local1278 = 0;
										if (local80 == 0) {
											local1278 = 51;
										}
										local98 = Static57.anInt1269;
										if (local80 == 1) {
											local1278 = 6;
										}
										if (local80 == 2) {
											local1278 = 60;
										}
										if (local80 == 3) {
											local1278 = 48;
										}
										if (local1247.anInt5565 == local80) {
											local98 = local1247.anInt5557;
										}
										if (local80 == 4) {
											local1278 = 1006;
										}
										if (local1247.anInt5559 == local80) {
											local98 = local1247.anInt5562;
										}
										Static164.method3162(local98, local359.anInt1119, "<col=00ffff>" + local1247.aString223, Static51.method4581(local359.anInt1115, local359.anInt1119, local1241), local1278, local359.anInt1115, local1266[local80]);
									}
								}
							}
							Static164.method3162(Static338.anInt6420, local359.anInt1119, "<col=00ffff>" + local1247.aString223, (long) local1247.anInt5535, 1008, local359.anInt1115, Static206.aString167);
						}
					}
				}
			}
		}
	}
}
