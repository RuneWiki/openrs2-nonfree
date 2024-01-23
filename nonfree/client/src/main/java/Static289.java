import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "I")
	public static int anInt5162 = 3353893;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method4410(@OriginalArg(1) int arg0) {
		@Pc(19) byte[] local19;
		if (arg0 == 100 && Static134.anInt5645 > 0) {
			local19 = Static11.aByteArrayArray1[--Static134.anInt5645];
			Static11.aByteArrayArray1[Static134.anInt5645] = null;
			return local19;
		} else if (arg0 == 5000 && Static311.anInt5695 > 0) {
			local19 = Static242.aByteArrayArray12[--Static311.anInt5695];
			Static242.aByteArrayArray12[Static311.anInt5695] = null;
			return local19;
		} else if (arg0 == 30000 && Static168.anInt3296 > 0) {
			local19 = Static221.aByteArrayArray9[--Static168.anInt3296];
			Static221.aByteArrayArray9[Static168.anInt3296] = null;
			return local19;
		} else {
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public static void method4411() {
		if (Static300.method4552() != 2) {
			return;
		}
		@Pc(20) byte local20 = (byte) (Static188.anInt3597 - 4 & 0xFF);
		@Pc(24) int local24 = Static188.anInt3597 % 104;
		@Pc(26) int local26;
		@Pc(31) int local31;
		for (local26 = 0; local26 < 4; local26++) {
			for (local31 = 0; local31 < 104; local31++) {
				Static257.aByteArrayArrayArray20[local26][local24][local31] = local20;
			}
		}
		if (Static65.anInt1300 == 3) {
			return;
		}
		for (local26 = 0; local26 < 2; local26++) {
			Static72.anIntArray471[local26] = -1000000;
			Static272.anIntArray506[local26] = 1000000;
			Static179.anIntArray292[local26] = 0;
			Static7.anIntArray6[local26] = 1000000;
			Static236.anIntArray367[local26] = 0;
		}
		if (Static167.anInt3292 != 1) {
			local26 = Static69.method4275(Static233.anInt4252, Static65.anInt1300, Static94.anInt3434);
			if (local26 - Static306.anInt5420 < 800 && (Static104.aByteArrayArrayArray3[Static65.anInt1300][Static94.anInt3434 >> 7][Static233.anInt4252 >> 7] & 0x4) != 0) {
				Static266.method4191(1, Static233.anInt4252 >> 7, Static105.aClass1_Sub33ArrayArrayArray2, Static94.anInt3434 >> 7, false);
			}
			return;
		}
		if ((Static104.aByteArrayArrayArray3[Static65.anInt1300][Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7][Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7] & 0x4) != 0) {
			Static266.method4191(0, Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7, Static105.aClass1_Sub33ArrayArrayArray2, Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7, false);
		}
		if (Static277.anInt4987 >= 310) {
			return;
		}
		local26 = Static94.anInt3434 >> 7;
		local31 = Static233.anInt4252 >> 7;
		@Pc(181) int local181 = Static90.aClass15_Sub5_Sub2_2.anInt5557 >> 7;
		@Pc(189) int local189;
		if (local31 < local181) {
			local189 = local181 - local31;
		} else {
			local189 = local31 - local181;
		}
		@Pc(201) int local201 = Static90.aClass15_Sub5_Sub2_2.anInt5559 >> 7;
		@Pc(212) int local212;
		if (local26 >= local201) {
			local212 = local26 - local201;
		} else {
			local212 = local201 - local26;
		}
		if (local212 == 0 && local189 == 0 || local212 <= -104 || local212 >= 104 || local189 <= -104 || local189 >= 104) {
			Static159.method2733(null, "RC: " + local26 + "," + local31 + " " + local201 + "," + local181 + " " + Static199.anInt3817 + "," + Static192.anInt3637);
			return;
		}
		@Pc(289) int local289;
		@Pc(291) int local291;
		if (local212 > local189) {
			local291 = 32768;
			local289 = local189 * 65536 / local212;
			while (local26 != local201) {
				if (local26 < local201) {
					local26++;
				} else if (local26 > local201) {
					local26--;
				}
				if ((Static104.aByteArrayArrayArray3[Static65.anInt1300][local26][local31] & 0x4) != 0) {
					Static266.method4191(1, local31, Static105.aClass1_Sub33ArrayArrayArray2, local26, false);
					break;
				}
				local291 += local289;
				if (local291 >= 65536) {
					local291 -= 65536;
					if (local31 < local181) {
						local31++;
					} else if (local31 > local181) {
						local31--;
					}
					if ((Static104.aByteArrayArrayArray3[Static65.anInt1300][local26][local31] & 0x4) != 0) {
						Static266.method4191(1, local31, Static105.aClass1_Sub33ArrayArrayArray2, local26, false);
						break;
					}
				}
			}
			return;
		}
		local289 = local212 * 65536 / local189;
		local291 = 32768;
		while (local181 != local31) {
			if (local31 < local181) {
				local31++;
			} else if (local31 > local181) {
				local31--;
			}
			if ((Static104.aByteArrayArrayArray3[Static65.anInt1300][local26][local31] & 0x4) != 0) {
				Static266.method4191(1, local31, Static105.aClass1_Sub33ArrayArrayArray2, local26, false);
				break;
			}
			local291 += local289;
			if (local291 >= 65536) {
				if (local201 > local26) {
					local26++;
				} else if (local26 > local201) {
					local26--;
				}
				local291 -= 65536;
				if ((Static104.aByteArrayArrayArray3[Static65.anInt1300][local26][local31] & 0x4) != 0) {
					Static266.method4191(1, local31, Static105.aClass1_Sub33ArrayArrayArray2, local26, false);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!hi;BLjava/lang/String;)Ljava/lang/String;")
	public static String method4412(@OriginalArg(0) Class66 arg0, @OriginalArg(2) String arg1) {
		if (arg1.indexOf("%") == -1) {
			return arg1;
		}
		while (true) {
			@Pc(17) int local17 = arg1.indexOf("%1");
			if (local17 == -1) {
				while (true) {
					local17 = arg1.indexOf("%2");
					if (local17 == -1) {
						while (true) {
							local17 = arg1.indexOf("%3");
							if (local17 == -1) {
								while (true) {
									local17 = arg1.indexOf("%4");
									if (local17 == -1) {
										while (true) {
											local17 = arg1.indexOf("%5");
											if (local17 == -1) {
												while (true) {
													local17 = arg1.indexOf("%dns");
													if (local17 == -1) {
														return arg1;
													}
													@Pc(192) String local192 = "";
													if (Static98.aClass185_1 != null) {
														if (Static98.aClass185_1.anObject6 == null) {
															local192 = Static73.method1461(Static98.aClass185_1.anInt5277);
														} else {
															local192 = (String) Static98.aClass185_1.anObject6;
														}
													}
													arg1 = arg1.substring(0, local17) + local192 + arg1.substring(local17 + 4);
												}
											}
											arg1 = arg1.substring(0, local17) + Static313.method2572(Static63.method2806(arg0, 4)) + arg1.substring(local17 + 2);
										}
									}
									arg1 = arg1.substring(0, local17) + Static313.method2572(Static63.method2806(arg0, 3)) + arg1.substring(local17 + 2);
								}
							}
							arg1 = arg1.substring(0, local17) + Static313.method2572(Static63.method2806(arg0, 2)) + arg1.substring(local17 + 2);
						}
					}
					arg1 = arg1.substring(0, local17) + Static313.method2572(Static63.method2806(arg0, 1)) + arg1.substring(local17 + 2);
				}
			}
			arg1 = arg1.substring(0, local17) + Static313.method2572(Static63.method2806(arg0, 0)) + arg1.substring(local17 + 2);
		}
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Lclient!pa;")
	public static Class1_Sub2_Sub1 method4413() {
		@Pc(13) int local13 = Static160.anIntArray267[0] * Static235.anIntArray468[0];
		@Pc(17) byte[] local17 = Static69.aByteArrayArray15[0];
		@Pc(20) int[] local20 = new int[local13];
		for (@Pc(22) int local22 = 0; local22 < local13; local22++) {
			local20[local22] = Static83.anIntArray144[local17[local22] & 0xFF];
		}
		@Pc(71) Class1_Sub2_Sub1 local71;
		if (Static156.aBoolean211) {
			local71 = new Class1_Sub2_Sub1_Sub1(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[0], Static254.anIntArray412[0], Static160.anIntArray267[0], Static235.anIntArray468[0], local20);
		} else {
			local71 = new Class1_Sub2_Sub1_Sub2(Static299.anInt5347, Static130.anInt2594, Static244.anIntArray389[0], Static254.anIntArray412[0], Static160.anIntArray267[0], Static235.anIntArray468[0], local20);
		}
		Static117.method2101();
		return local71;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!nk;II)[Lclient!fe;")
	public static Class23_Sub1[] method4414(@OriginalArg(0) Class121 arg0, @OriginalArg(2) int arg1) {
		return Static31.method501(arg0, arg1) ? Static251.method3967() : null;
	}
}
