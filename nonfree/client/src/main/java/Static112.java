import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array9;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!ha;")
	public static Class25_Sub1 aClass25_Sub1_17;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	public static int anInt3117;

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
	public static int anInt3118;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "[Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4[] aClass3_Sub1_Sub2_Sub4Array10;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!p;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_18;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!ad;")
	public static Class5 aClass5_21 = new Class5();

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
	public static int anInt3110 = 0;

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "Lclient!eb;")
	public static Class17 aClass17_50 = new Class17(64);

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1314 = Static59.method1195("<)4col>");

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Z")
	public static boolean aBoolean108 = true;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method2068() {
		@Pc(7) boolean local7 = true;
		Static130.method2302(false);
		Static21.anInt869 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static28.aByteArrayArray16.length; local14++) {
			if (Static82.anIntArray265[local14] != -1 && Static28.aByteArrayArray16[local14] == null) {
				Static28.aByteArrayArray16[local14] = aClass25_Sub1_17.method931(0, Static82.anIntArray265[local14]);
				if (Static28.aByteArrayArray16[local14] == null) {
					Static21.anInt869++;
					local7 = false;
				}
			}
			if (Static43.anIntArray161[local14] != -1 && Static48.aByteArrayArray11[local14] == null) {
				Static48.aByteArrayArray11[local14] = aClass25_Sub1_17.method932(Static103.anIntArrayArray74[local14], Static43.anIntArray161[local14], 0);
				if (Static48.aByteArrayArray11[local14] == null) {
					local7 = false;
					Static21.anInt869++;
				}
			}
		}
		if (!local7) {
			Static93.anInt2678 = 1;
			return;
		}
		Static79.anInt2485 = 0;
		local7 = true;
		@Pc(121) int local121;
		@Pc(132) int local132;
		for (@Pc(102) int local102 = 0; local102 < Static28.aByteArrayArray16.length; local102++) {
			@Pc(108) byte[] local108 = Static48.aByteArrayArray11[local102];
			if (local108 != null) {
				local121 = (Static12.anIntArray52[local102] >> 8) * 64 - anInt3118;
				local132 = (Static12.anIntArray52[local102] & 0xFF) * 64 - Static13.anInt410;
				if (Static42.aBoolean45) {
					local121 = 10;
					local132 = 10;
				}
				local7 &= Static65.method1350(local121, local132, local108);
			}
		}
		if (!local7) {
			Static93.anInt2678 = 2;
			return;
		}
		if (Static93.anInt2678 != 0) {
			Static99.method1974(Static62.aClass60_857, true, Static30.aClass60_407);
		}
		Static100.method1983();
		Static74.method1544();
		Static100.method1983();
		Static13.aClass58_1.method1762();
		Static100.method1983();
		System.gc();
		for (@Pc(186) int local186 = 0; local186 < 4; local186++) {
			Static89.aClass72Array1[local186].method2107();
		}
		@Pc(207) int local207;
		for (local121 = 0; local121 < 4; local121++) {
			for (local132 = 0; local132 < 104; local132++) {
				for (local207 = 0; local207 < 104; local207++) {
					Static60.aByteArrayArrayArray4[local121][local132][local207] = 0;
				}
			}
		}
		Static100.method1983();
		Static63.method1971();
		local132 = Static28.aByteArrayArray16.length;
		Static57.method2260();
		Static130.method2302(true);
		@Pc(260) int local260;
		@Pc(271) int local271;
		@Pc(386) int local386;
		@Pc(318) int local318;
		@Pc(376) int local376;
		if (!Static42.aBoolean45) {
			@Pc(275) byte[] local275;
			for (local207 = 0; local207 < local132; local207++) {
				local260 = (Static12.anIntArray52[local207] >> 8) * 64 - anInt3118;
				local271 = (Static12.anIntArray52[local207] & 0xFF) * 64 - Static13.anInt410;
				local275 = Static28.aByteArrayArray16[local207];
				if (local275 != null) {
					Static100.method1983();
					Static21.method562(local260, local275, local271, Static89.aClass72Array1, (Static77.anInt2427 - 6) * 8, (Static2.anInt118 - 6) * 8);
				}
			}
			for (local260 = 0; local260 < local132; local260++) {
				local318 = (Static12.anIntArray52[local260] & 0xFF) * 64 - Static13.anInt410;
				@Pc(322) byte[] local322 = Static28.aByteArrayArray16[local260];
				local271 = (Static12.anIntArray52[local260] >> 8) * 64 - anInt3118;
				if (local322 == null && Static77.anInt2427 < 800) {
					Static100.method1983();
					Static67.method1383(local271, 64, 64, local318);
				}
			}
			Static130.method2302(true);
			for (local271 = 0; local271 < local132; local271++) {
				local275 = Static48.aByteArrayArray11[local271];
				if (local275 != null) {
					local376 = (Static12.anIntArray52[local271] >> 8) * 64 - anInt3118;
					local386 = (Static12.anIntArray52[local271] & 0xFF) * 64 - Static13.anInt410;
					Static100.method1983();
					Static122.method482(local376, local275, Static13.aClass58_1, local386, Static89.aClass72Array1);
				}
			}
		}
		@Pc(447) int local447;
		@Pc(459) int local459;
		if (Static42.aBoolean45) {
			@Pc(453) int local453;
			@Pc(469) int local469;
			@Pc(471) int local471;
			for (local207 = 0; local207 < 4; local207++) {
				Static100.method1983();
				for (local260 = 0; local260 < 13; local260++) {
					for (local271 = 0; local271 < 13; local271++) {
						local376 = Static127.anIntArrayArrayArray6[local207][local260][local271];
						@Pc(431) boolean local431 = false;
						if (local376 != -1) {
							local386 = local376 >> 24 & 0x3;
							local447 = local376 >> 1 & 0x3;
							local453 = local376 >> 3 & 0x7FF;
							local459 = local376 >> 14 & 0x3FF;
							local469 = local453 / 8 + (local459 / 8 << 8);
							for (local471 = 0; local471 < Static12.anIntArray52.length; local471++) {
								if (local469 == Static12.anIntArray52[local471] && Static28.aByteArrayArray16[local471] != null) {
									local431 = true;
									Static36.method794(Static89.aClass72Array1, (local459 & 0x7) * 8, (local453 & 0x7) * 8, local260 * 8, local271 * 8, local207, local386, local447, Static28.aByteArrayArray16[local471]);
									break;
								}
							}
						}
						if (!local431) {
							Static95.method1790(local271 * 8, local260 * 8, local207);
						}
					}
				}
			}
			for (local260 = 0; local260 < 13; local260++) {
				for (local271 = 0; local271 < 13; local271++) {
					local318 = Static127.anIntArrayArrayArray6[0][local260][local271];
					if (local318 == -1) {
						Static67.method1383(local260 * 8, 8, 8, local271 * 8);
					}
				}
			}
			Static130.method2302(true);
			for (local271 = 0; local271 < 4; local271++) {
				Static100.method1983();
				for (local318 = 0; local318 < 13; local318++) {
					for (local376 = 0; local376 < 13; local376++) {
						local386 = Static127.anIntArrayArrayArray6[local271][local318][local376];
						if (local386 != -1) {
							local447 = local386 >> 24 & 0x3;
							local459 = local386 >> 1 & 0x3;
							local453 = local386 >> 14 & 0x3FF;
							local469 = local386 >> 3 & 0x7FF;
							local471 = (local453 / 8 << 8) + local469 / 8;
							for (@Pc(647) int local647 = 0; local647 < Static12.anIntArray52.length; local647++) {
								if (Static12.anIntArray52[local647] == local471 && Static48.aByteArrayArray11[local647] != null) {
									Static27.method653(local271, local318 * 8, local459, (local453 & 0x7) * 8, (local469 & 0x7) * 8, Static48.aByteArrayArray11[local647], Static13.aClass58_1, local376 * 8, Static89.aClass72Array1, local447);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static130.method2302(true);
		Static74.method1544();
		Static100.method1983();
		method2071(Static89.aClass72Array1, Static13.aClass58_1);
		Static130.method2302(true);
		local207 = Static15.anInt636;
		if (Static119.anInt3243 < local207) {
			local207 = Static119.anInt3243;
		}
		if (local207 < Static119.anInt3243 - 1) {
		}
		if (Static14.aBoolean15) {
			Static13.aClass58_1.method1741(Static15.anInt636);
		} else {
			Static13.aClass58_1.method1741(0);
		}
		for (local260 = 0; local260 < 104; local260++) {
			for (local271 = 0; local271 < 104; local271++) {
				Static54.method1139(local271, local260);
			}
		}
		Static100.method1983();
		Static50.method1073();
		Static48.aClass17_25.method646();
		if (Static73.aFrame1 != null) {
			Static81.aClass3_Sub12_Sub1_2.method1980(97);
			Static81.aClass3_Sub12_Sub1_2.method1966(1057001181);
		}
		if (!Static42.aBoolean45) {
			local271 = (Static2.anInt118 - 6) / 8;
			local318 = (Static2.anInt118 + 6) / 8;
			local386 = (Static77.anInt2427 + 6) / 8;
			local376 = (Static77.anInt2427 - 6) / 8;
			for (local447 = local271 - 1; local447 <= local318 + 1; local447++) {
				for (local459 = local376 - 1; local459 <= local386 + 1; local459++) {
					if (local271 > local447 || local318 < local447 || local459 < local376 || local459 > local386) {
						aClass25_Sub1_17.method923(Static60.method1211(new Class60[] { Static16.aClass60_265, Static65.method1341(local447), Static72.aClass60_964, Static65.method1341(local459) }));
						aClass25_Sub1_17.method923(Static60.method1211(new Class60[] { Static83.aClass60_1100, Static65.method1341(local447), Static72.aClass60_964, Static65.method1341(local459) }));
					}
				}
			}
		}
		if (Static114.anInt3185 == -1) {
			Static50.method1075(30);
		} else {
			Static50.method1075(35);
		}
		Static100.method1983();
		Static63.method1931();
		Static81.aClass3_Sub12_Sub1_2.method1980(31);
		Static118.method2139();
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Z")
	public static boolean method2069() {
		@Pc(13) long local13 = Static102.method1996();
		@Pc(19) int local19 = (int) (local13 - Static39.aLong43);
		Static39.aLong43 = local13;
		if (local19 > 200) {
			local19 = 200;
		}
		Static105.anInt3027 += local19;
		if (Static48.anInt1548 == 0 && Static98.anInt2826 == 0 && Static48.anInt1544 == 0 && Static30.anInt1030 == 0) {
			return true;
		} else if (Static105.aClass47_4 == null) {
			return false;
		} else {
			try {
				if (Static105.anInt3027 > 30000) {
					throw new IOException();
				}
				@Pc(63) Class3_Sub1_Sub4 local63;
				@Pc(68) Class3_Sub12 local68;
				while (Static98.anInt2826 < 20 && Static30.anInt1030 > 0) {
					local63 = (Class3_Sub1_Sub4) Static58.aClass82_6.method2306();
					local68 = new Class3_Sub12(4);
					local68.method1937(1);
					local68.method1934((int) local63.aLong107);
					Static105.aClass47_4.method1562(local68.aByteArray77, 4);
					Static39.aClass82_4.method2303(local63, local63.aLong107);
					Static98.anInt2826++;
					Static30.anInt1030--;
				}
				while (Static48.anInt1548 < 20 && Static48.anInt1544 > 0) {
					local63 = (Class3_Sub1_Sub4) Static128.aClass43_2.method1386();
					local68 = new Class3_Sub12(4);
					local68.method1937(0);
					local68.method1934((int) local63.aLong107);
					Static105.aClass47_4.method1562(local68.aByteArray77, 4);
					local63.method2270();
					Static29.aClass82_3.method2303(local63, local63.aLong107);
					Static48.anInt1544--;
					Static48.anInt1548++;
				}
				for (@Pc(162) int local162 = 0; local162 < 100; local162++) {
					@Pc(170) int local170 = Static105.aClass47_4.method1557();
					if (local170 < 0) {
						throw new IOException();
					}
					if (local170 == 0) {
						break;
					}
					Static105.anInt3027 = 0;
					@Pc(185) byte local185 = 0;
					if (Static85.aClass3_Sub1_Sub4_1 == null) {
						local185 = 8;
					} else if (Static55.anInt1758 == 0) {
						local185 = 1;
					}
					@Pc(206) int local206;
					@Pc(223) int local223;
					@Pc(273) int local273;
					@Pc(288) int local288;
					if (local185 > 0) {
						local206 = local185 - Static119.aClass3_Sub12_8.anInt2886;
						if (local206 > local170) {
							local206 = local170;
						}
						Static105.aClass47_4.method1555(local206, Static119.aClass3_Sub12_8.anInt2886, Static119.aClass3_Sub12_8.aByteArray77);
						if (Static28.aByte13 != 0) {
							for (local223 = 0; local223 < local206; local223++) {
								Static119.aClass3_Sub12_8.aByteArray77[local223 + Static119.aClass3_Sub12_8.anInt2886] ^= Static28.aByte13;
							}
						}
						Static119.aClass3_Sub12_8.anInt2886 += local206;
						if (Static119.aClass3_Sub12_8.anInt2886 < local185) {
							break;
						}
						if (Static85.aClass3_Sub1_Sub4_1 == null) {
							Static119.aClass3_Sub12_8.anInt2886 = 0;
							local223 = Static119.aClass3_Sub12_8.method1936();
							local273 = Static119.aClass3_Sub12_8.method1963();
							@Pc(280) long local280 = (long) (local273 + (local223 << 16));
							@Pc(284) int local284 = Static119.aClass3_Sub12_8.method1936();
							local288 = Static119.aClass3_Sub12_8.method1920();
							@Pc(294) Class3_Sub1_Sub4 local294 = (Class3_Sub1_Sub4) Static39.aClass82_4.method2305(local280);
							Static68.aBoolean71 = true;
							if (local294 == null) {
								local294 = (Class3_Sub1_Sub4) Static29.aClass82_3.method2305(local280);
								Static68.aBoolean71 = false;
							}
							if (local294 == null) {
								throw new IOException();
							}
							@Pc(318) int local318 = local284 == 0 ? 5 : 9;
							Static85.aClass3_Sub1_Sub4_1 = local294;
							Static124.aClass3_Sub12_7 = new Class3_Sub12(Static85.aClass3_Sub1_Sub4_1.aByte6 + local288 + local318);
							Static124.aClass3_Sub12_7.method1937(local284);
							Static124.aClass3_Sub12_7.method1966(local288);
							Static119.aClass3_Sub12_8.anInt2886 = 0;
							Static55.anInt1758 = 8;
						} else if (Static55.anInt1758 == 0) {
							if (Static119.aClass3_Sub12_8.aByteArray77[0] == -1) {
								Static55.anInt1758 = 1;
								Static119.aClass3_Sub12_8.anInt2886 = 0;
							} else {
								Static85.aClass3_Sub1_Sub4_1 = null;
							}
						}
					} else {
						local206 = Static124.aClass3_Sub12_7.aByteArray77.length - Static85.aClass3_Sub1_Sub4_1.aByte6;
						local223 = 512 - Static55.anInt1758;
						if (local223 > local206 - Static124.aClass3_Sub12_7.anInt2886) {
							local223 = local206 - Static124.aClass3_Sub12_7.anInt2886;
						}
						if (local170 < local223) {
							local223 = local170;
						}
						Static105.aClass47_4.method1555(local223, Static124.aClass3_Sub12_7.anInt2886, Static124.aClass3_Sub12_7.aByteArray77);
						if (Static28.aByte13 != 0) {
							for (local273 = 0; local273 < local223; local273++) {
								Static124.aClass3_Sub12_7.aByteArray77[local273 + Static124.aClass3_Sub12_7.anInt2886] ^= Static28.aByte13;
							}
						}
						Static124.aClass3_Sub12_7.anInt2886 += local223;
						Static55.anInt1758 += local223;
						if (local206 == Static124.aClass3_Sub12_7.anInt2886) {
							if (Static85.aClass3_Sub1_Sub4_1.aLong107 == 16711935L) {
								Static63.aClass3_Sub12_6 = Static124.aClass3_Sub12_7;
								for (local273 = 0; local273 < 256; local273++) {
									@Pc(545) Class25_Sub1 local545 = Static63.aClass25_Sub1Array2[local273];
									if (local545 != null) {
										Static63.aClass3_Sub12_6.anInt2886 = local273 * 8 + 5;
										local288 = Static63.aClass3_Sub12_6.method1920();
										@Pc(562) int local562 = Static63.aClass3_Sub12_6.method1920();
										local545.method944(local562, local288);
									}
								}
							} else {
								Static56.aCRC32_2.reset();
								Static56.aCRC32_2.update(Static124.aClass3_Sub12_7.aByteArray77, 0, local206);
								local273 = (int) Static56.aCRC32_2.getValue();
								if (Static85.aClass3_Sub1_Sub4_1.anInt864 != local273) {
									try {
										Static105.aClass47_4.method1564();
									} catch (@Pc(489) Exception local489) {
									}
									Static10.anInt323++;
									Static105.aClass47_4 = null;
									Static28.aByte13 = (byte) (Math.random() * 255.0D + 1.0D);
									return false;
								}
								Static10.anInt323 = 0;
								Static108.anInt3059 = 0;
								Static85.aClass3_Sub1_Sub4_1.aClass25_Sub1_2.method943((Static85.aClass3_Sub1_Sub4_1.aLong107 & 0xFF0000L) == 16711680L, Static124.aClass3_Sub12_7.aByteArray77, Static68.aBoolean71, (int) (Static85.aClass3_Sub1_Sub4_1.aLong107 & 0xFFFFL));
							}
							Static85.aClass3_Sub1_Sub4_1.method2264();
							Static124.aClass3_Sub12_7 = null;
							if (Static68.aBoolean71) {
								Static98.anInt2826--;
							} else {
								Static48.anInt1548--;
							}
							Static55.anInt1758 = 0;
							Static85.aClass3_Sub1_Sub4_1 = null;
						} else {
							if (Static55.anInt1758 != 512) {
								break;
							}
							Static55.anInt1758 = 0;
						}
					}
				}
				return true;
			} catch (@Pc(599) IOException local599) {
				try {
					Static105.aClass47_4.method1564();
				} catch (@Pc(604) Exception local604) {
				}
				Static108.anInt3059++;
				Static105.aClass47_4 = null;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!jb;ILclient!jb;)V")
	public static void method2070(@OriginalArg(0) Class25 arg0, @OriginalArg(2) Class25 arg1) {
		Static70.aClass25_22 = arg0;
		Static120.aClass25_33 = arg1;
		Static29.anInt1010 = Static120.aClass25_33.method911(3);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([Lclient!td;ILclient!qb;)V")
	private static void method2071(@OriginalArg(0) Class72[] arg0, @OriginalArg(2) Class58 arg1) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		@Pc(35) int local35;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local16 = 0; local16 < 104; local16++) {
				for (local20 = 0; local20 < 104; local20++) {
					if ((Static60.aByteArrayArrayArray4[local7][local16][local20] & 0x1) == 1) {
						local35 = local7;
						if ((Static60.aByteArrayArrayArray4[1][local16][local20] & 0x2) == 2) {
							local35 = local7 - 1;
						}
						if (local35 >= 0) {
							arg0[local35].method2097(local16, local20);
						}
					}
				}
			}
		}
		Static11.anInt351 += (int) (Math.random() * 5.0D) - 2;
		Static11.anInt333 += (int) (Math.random() * 5.0D) - 2;
		if (Static11.anInt351 < -16) {
			Static11.anInt351 = -16;
		}
		if (Static11.anInt351 > 16) {
			Static11.anInt351 = 16;
		}
		if (Static11.anInt333 < -8) {
			Static11.anInt333 = -8;
		}
		if (Static11.anInt333 > 8) {
			Static11.anInt333 = 8;
		}
		@Pc(136) int local136;
		@Pc(138) int local138;
		@Pc(142) int local142;
		@Pc(164) int local164;
		@Pc(185) int local185;
		@Pc(198) int local198;
		@Pc(204) int local204;
		@Pc(208) int local208;
		@Pc(214) int local214;
		@Pc(231) int local231;
		@Pc(280) int local280;
		@Pc(508) int local508;
		@Pc(512) int local512;
		@Pc(646) int local646;
		@Pc(656) int local656;
		@Pc(683) int local683;
		for (local16 = 0; local16 < 4; local16++) {
			@Pc(126) byte[][] local126 = Static11.aByteArrayArrayArray1[local16];
			local35 = (int) Math.sqrt(5100.0D);
			local136 = local35 * 768 >> 8;
			for (local138 = 1; local138 < 103; local138++) {
				for (local142 = 1; local142 < 103; local142++) {
					local164 = Static51.anIntArrayArrayArray3[local16][local142 + 1][local138] - Static51.anIntArrayArrayArray3[local16][local142 - 1][local138];
					local185 = Static51.anIntArrayArrayArray3[local16][local142][local138 + 1] - Static51.anIntArrayArrayArray3[local16][local142][local138 - 1];
					local198 = (int) Math.sqrt((double) (local185 * local185 + local164 * local164 + 65536));
					local204 = (local164 << 8) / local198;
					local208 = 65536 / local198;
					local214 = (local185 << 8) / local198;
					local231 = (local214 * -50 + local208 * -10 + local204 * -50) / local136 + 96;
					local280 = (local126[local142][local138 - 1] >> 2) + ((local126[local142 - 1][local138] >> 2) - (-(local126[local142 + 1][local138] >> 3) - (local126[local142][local138 + 1] >> 3) - (local126[local142][local138] >> 1)));
					Static39.anIntArrayArray37[local142][local138] = local231 - local280;
				}
			}
			for (local142 = 0; local142 < 104; local142++) {
				Static18.anIntArray79[local142] = 0;
				Static63.anIntArray307[local142] = 0;
				Static26.anIntArray124[local142] = 0;
				Static32.anIntArray134[local142] = 0;
				Static14.anIntArray57[local142] = 0;
			}
			for (local164 = -5; local164 < 109; local164++) {
				for (local185 = 0; local185 < 104; local185++) {
					local198 = local164 + 5;
					@Pc(404) int local404;
					if (local198 >= 0 && local198 < 104) {
						local204 = Static55.aByteArrayArrayArray3[local16][local198][local185] & 0xFF;
						if (local204 > 0) {
							@Pc(368) Class3_Sub1_Sub5 local368 = Static74.method1553(local204 - 1);
							Static18.anIntArray79[local185] += local368.anInt923;
							Static63.anIntArray307[local185] += local368.anInt918;
							Static26.anIntArray124[local185] += local368.anInt925;
							Static32.anIntArray134[local185] += local368.anInt922;
							local404 = Static14.anIntArray57[local185]++;
						}
					}
					local204 = local164 - 5;
					if (local204 >= 0 && local204 < 104) {
						local208 = Static55.aByteArrayArrayArray3[local16][local204][local185] & 0xFF;
						if (local208 > 0) {
							@Pc(439) Class3_Sub1_Sub5 local439 = Static74.method1553(local208 - 1);
							Static18.anIntArray79[local185] -= local439.anInt923;
							Static63.anIntArray307[local185] -= local439.anInt918;
							Static26.anIntArray124[local185] -= local439.anInt925;
							Static32.anIntArray134[local185] -= local439.anInt922;
							local404 = Static14.anIntArray57[local185]--;
						}
					}
				}
				if (local164 >= 1 && local164 < 103) {
					local204 = 0;
					local198 = 0;
					local208 = 0;
					local214 = 0;
					local231 = 0;
					for (local280 = -5; local280 < 109; local280++) {
						local508 = local280 + 5;
						local512 = local280 - 5;
						if (local508 >= 0 && local508 < 104) {
							local214 += Static32.anIntArray134[local508];
							local198 += Static18.anIntArray79[local508];
							local204 += Static63.anIntArray307[local508];
							local231 += Static14.anIntArray57[local508];
							local208 += Static26.anIntArray124[local508];
						}
						if (local512 >= 0 && local512 < 104) {
							local198 -= Static18.anIntArray79[local512];
							local214 -= Static32.anIntArray134[local512];
							local204 -= Static63.anIntArray307[local512];
							local231 -= Static14.anIntArray57[local512];
							local208 -= Static26.anIntArray124[local512];
						}
						if (local280 >= 1 && local280 < 103 && (!Static14.aBoolean15 || (Static60.aByteArrayArrayArray4[0][local164][local280] & 0x2) != 0 || (Static60.aByteArrayArrayArray4[local16][local164][local280] & 0x10) == 0 && Static95.method1786(local16, local164, local280) == Static54.anInt1750)) {
							if (Static15.anInt636 > local16) {
								Static15.anInt636 = local16;
							}
							local646 = Static55.aByteArrayArrayArray3[local16][local164][local280] & 0xFF;
							local656 = Static125.aByteArrayArrayArray7[local16][local164][local280] & 0xFF;
							if (local646 > 0 || local656 > 0) {
								@Pc(675) int local675 = Static51.anIntArrayArrayArray3[local16][local164 + 1][local280 + 1];
								local683 = Static51.anIntArrayArrayArray3[local16][local164][local280];
								@Pc(693) int local693 = Static51.anIntArrayArrayArray3[local16][local164 + 1][local280];
								@Pc(703) int local703 = Static51.anIntArrayArrayArray3[local16][local164][local280 + 1];
								@Pc(709) int local709 = Static39.anIntArrayArray37[local164][local280];
								@Pc(717) int local717 = Static39.anIntArrayArray37[local164 + 1][local280];
								@Pc(727) int local727 = Static39.anIntArrayArray37[local164 + 1][local280 + 1];
								@Pc(735) int local735 = Static39.anIntArrayArray37[local164][local280 + 1];
								@Pc(737) int local737 = -1;
								@Pc(739) int local739 = -1;
								@Pc(754) int local754;
								@Pc(748) int local748;
								if (local646 > 0) {
									local748 = local204 / local231;
									local754 = local198 * 256 / local214;
									@Pc(758) int local758 = local208 / local231;
									local737 = Static126.method2279(local758, local754, local748);
									local758 += Static11.anInt351;
									if (local758 < 0) {
										local758 = 0;
									} else if (local758 > 255) {
										local758 = 255;
									}
									local754 = local754 + Static11.anInt333 & 0xFF;
									local739 = Static126.method2279(local758, local754, local748);
								}
								if (local16 > 0) {
									@Pc(798) boolean local798 = true;
									if (local646 == 0 && Static101.aByteArrayArrayArray6[local16][local164][local280] != 0) {
										local798 = false;
									}
									if (local656 > 0 && !Static57.method2262(local656 - 1).aBoolean64) {
										local798 = false;
									}
									if (local798 && local693 == local683 && local675 == local683 && local703 == local683) {
										Static27.anIntArrayArrayArray1[local16][local164][local280] |= 0x924;
									}
								}
								local754 = 0;
								if (local739 != -1) {
									local754 = Static7.anIntArray42[Static33.method758(96, local739)];
								}
								if (local656 == 0) {
									arg1.method1770(local16, local164, local280, 0, 0, -1, local683, local693, local675, local703, Static33.method758(local709, local737), Static33.method758(local717, local737), Static33.method758(local727, local737), Static33.method758(local735, local737), 0, 0, 0, 0, local754, 0);
								} else {
									local748 = Static101.aByteArrayArrayArray6[local16][local164][local280] + 1;
									@Pc(890) byte local890 = Static36.aByteArrayArrayArray2[local16][local164][local280];
									@Pc(896) Class3_Sub1_Sub12 local896 = Static57.method2262(local656 - 1);
									@Pc(899) int local899 = local896.anInt1939;
									@Pc(908) int local908;
									@Pc(906) int local906;
									@Pc(943) int local943;
									@Pc(936) int local936;
									if (local899 >= 0) {
										local906 = Static7.anInterface1_1.method1163(local899);
										local908 = -1;
									} else if (local896.anInt1928 == 16711935) {
										local908 = -2;
										local906 = -2;
										local899 = -1;
									} else {
										local908 = Static126.method2279(local896.anInt1931, local896.anInt1945, local896.anInt1934);
										local936 = Static11.anInt351 + local896.anInt1931;
										local943 = Static11.anInt333 + local896.anInt1945 & 0xFF;
										if (local936 < 0) {
											local936 = 0;
										} else if (local936 > 255) {
											local936 = 255;
										}
										local906 = Static126.method2279(local936, local943, local896.anInt1934);
									}
									local943 = 0;
									if (local906 != -2) {
										local943 = Static7.anIntArray42[Static65.method1344(local906, 96)];
									}
									if (local896.anInt1930 != -1) {
										local936 = local896.anInt1935 + Static11.anInt333 & 0xFF;
										@Pc(996) int local996 = Static11.anInt351 + local896.anInt1926;
										if (local996 < 0) {
											local996 = 0;
										} else if (local996 > 255) {
											local996 = 255;
										}
										local906 = Static126.method2279(local996, local936, local896.anInt1925);
										local943 = Static7.anIntArray42[Static65.method1344(local906, 96)];
									}
									arg1.method1770(local16, local164, local280, local748, local890, local899, local683, local693, local675, local703, Static33.method758(local709, local737), Static33.method758(local717, local737), Static33.method758(local727, local737), Static33.method758(local735, local737), Static65.method1344(local908, local709), Static65.method1344(local908, local717), Static65.method1344(local908, local727), Static65.method1344(local908, local735), local754, local943);
								}
							}
						}
					}
				}
			}
			for (local185 = 1; local185 < 103; local185++) {
				for (local198 = 1; local198 < 103; local198++) {
					arg1.method1736(local16, local198, local185, Static95.method1786(local16, local198, local185));
				}
			}
			Static55.aByteArrayArrayArray3[local16] = null;
			Static125.aByteArrayArrayArray7[local16] = null;
			Static101.aByteArrayArrayArray6[local16] = null;
			Static36.aByteArrayArrayArray2[local16] = null;
			Static11.aByteArrayArrayArray1[local16] = null;
		}
		arg1.method1749();
		for (local20 = 0; local20 < 104; local20++) {
			for (local35 = 0; local35 < 104; local35++) {
				if ((Static60.aByteArrayArrayArray4[1][local20][local35] & 0x2) == 2) {
					arg1.method1780(local20, local35);
				}
			}
		}
		local35 = 1;
		local136 = 2;
		local138 = 4;
		for (local142 = 0; local142 < 4; local142++) {
			if (local142 > 0) {
				local136 <<= 0x3;
				local35 <<= 0x3;
				local138 <<= 0x3;
			}
			for (local164 = 0; local164 <= local142; local164++) {
				for (local185 = 0; local185 <= 104; local185++) {
					for (local198 = 0; local198 <= 104; local198++) {
						if ((Static27.anIntArrayArrayArray1[local164][local198][local185] & local35) != 0) {
							local204 = local185;
							local214 = local164;
							for (local208 = local185; local208 < 104 && (Static27.anIntArrayArrayArray1[local164][local198][local208 + 1] & local35) != 0; local208++) {
							}
							while (local204 > 0 && (local35 & Static27.anIntArrayArrayArray1[local164][local198][local204 - 1]) != 0) {
								local204--;
							}
							local231 = local164;
							label347: while (local214 > 0) {
								for (local280 = local204; local280 <= local208; local280++) {
									if ((local35 & Static27.anIntArrayArrayArray1[local214 - 1][local198][local280]) == 0) {
										break label347;
									}
								}
								local214--;
							}
							label336: while (local231 < local142) {
								for (local280 = local204; local280 <= local208; local280++) {
									if ((Static27.anIntArrayArrayArray1[local231 + 1][local198][local280] & local35) == 0) {
										break label336;
									}
								}
								local231++;
							}
							local280 = (local231 + 1 - local214) * (local208 + 1 - local204);
							if (local280 >= 8) {
								local512 = Static51.anIntArrayArrayArray3[local231][local198][local204] - 240;
								local646 = Static51.anIntArrayArrayArray3[local214][local198][local204];
								Static94.method1761(local142, 1, local198 * 128, local198 * 128, local204 * 128, local208 * 128 + 128, local512, local646);
								for (local656 = local214; local656 <= local231; local656++) {
									for (local683 = local204; local683 <= local208; local683++) {
										Static27.anIntArrayArrayArray1[local656][local198][local683] &= ~local35;
									}
								}
							}
						}
						if ((local136 & Static27.anIntArrayArrayArray1[local164][local198][local185]) != 0) {
							local204 = local198;
							for (local208 = local198; local208 < 104 && (local136 & Static27.anIntArrayArrayArray1[local164][local208 + 1][local185]) != 0; local208++) {
							}
							local214 = local164;
							local231 = local164;
							while (local204 > 0 && (Static27.anIntArrayArrayArray1[local164][local204 - 1][local185] & local136) != 0) {
								local204--;
							}
							label401: while (local214 > 0) {
								for (local280 = local204; local280 <= local208; local280++) {
									if ((local136 & Static27.anIntArrayArrayArray1[local214 - 1][local280][local185]) == 0) {
										break label401;
									}
								}
								local214--;
							}
							label390: while (local231 < local142) {
								for (local280 = local204; local280 <= local208; local280++) {
									if ((local136 & Static27.anIntArrayArrayArray1[local231 + 1][local280][local185]) == 0) {
										break label390;
									}
								}
								local231++;
							}
							local280 = (local208 + 1 - local204) * (local231 + 1 - local214);
							if (local280 >= 8) {
								local512 = Static51.anIntArrayArrayArray3[local231][local204][local185] - 240;
								local646 = Static51.anIntArrayArrayArray3[local214][local204][local185];
								Static94.method1761(local142, 2, local204 * 128, local208 * 128 + 128, local185 * 128, local185 * 128, local512, local646);
								for (local656 = local214; local656 <= local231; local656++) {
									for (local683 = local204; local683 <= local208; local683++) {
										Static27.anIntArrayArrayArray1[local656][local683][local185] &= ~local136;
									}
								}
							}
						}
						if ((local138 & Static27.anIntArrayArrayArray1[local164][local198][local185]) != 0) {
							local214 = local185;
							local208 = local198;
							while (local214 > 0 && (local138 & Static27.anIntArrayArrayArray1[local164][local198][local214 - 1]) != 0) {
								local214--;
							}
							local231 = local185;
							local204 = local198;
							while (local231 < 104 && (local138 & Static27.anIntArrayArrayArray1[local164][local198][local231 + 1]) != 0) {
								local231++;
							}
							label455: while (local204 > 0) {
								for (local280 = local214; local280 <= local231; local280++) {
									if ((Static27.anIntArrayArrayArray1[local164][local204 - 1][local280] & local138) == 0) {
										break label455;
									}
								}
								local204--;
							}
							label444: while (local208 < 104) {
								for (local280 = local214; local280 <= local231; local280++) {
									if ((Static27.anIntArrayArrayArray1[local164][local208 + 1][local280] & local138) == 0) {
										break label444;
									}
								}
								local208++;
							}
							if ((local208 + 1 - local204) * (-local214 + 1 + local231) >= 4) {
								local280 = Static51.anIntArrayArrayArray3[local164][local204][local214];
								Static94.method1761(local142, 4, local204 * 128, local208 * 128 + 128, local214 * 128, local231 * 128 + 128, local280, local280);
								for (local508 = local204; local508 <= local208; local508++) {
									for (local512 = local214; local512 <= local231; local512++) {
										Static27.anIntArrayArrayArray1[local164][local508][local512] &= ~local138;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!mf;)Z")
	public static boolean method2072(@OriginalArg(1) Class3_Sub15 arg0) {
		@Pc(8) int local8 = arg0.anInt2293;
		if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
			if (local8 >= 801) {
				local8 -= 701;
			} else if (local8 >= 701) {
				local8 -= 601;
			} else if (local8 < 101) {
				local8--;
			} else {
				local8 -= 101;
			}
			Static118.method2137(0, 13, Static60.method1211(new Class60[] { Static57.aClass60_1411, Static54.aClass60Array6[local8] }), 0, Static83.aClass60_1105, 0);
			Static118.method2137(0, 11, Static60.method1211(new Class60[] { Static57.aClass60_1411, Static54.aClass60Array6[local8] }), 0, Static78.aClass60_1037, 0);
			return true;
		} else if (local8 >= 401 && local8 <= 500) {
			Static118.method2137(0, 22, Static60.method1211(new Class60[] { Static57.aClass60_1411, arg0.aClass60_969 }), 0, Static83.aClass60_1105, 0);
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V")
	public static void method2073() {
		aClass32_1 = null;
		aClass3_Sub1_Sub2_Sub4_18 = null;
		aClass3_Sub1_Sub2_Sub4Array9 = null;
		aClass5_21 = null;
		aClass60_1314 = null;
		aClass25_Sub1_17 = null;
		aClass3_Sub1_Sub2_Sub4Array10 = null;
		aClass17_50 = null;
	}
}
