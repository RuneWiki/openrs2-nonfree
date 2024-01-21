import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ge", name = "fb", descriptor = "I")
	public static int anInt1059;

	@OriginalMember(owner = "client!ge", name = "rb", descriptor = "I")
	public static int anInt1068;

	@OriginalMember(owner = "client!ge", name = "db", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!ge", name = "nb", descriptor = "Ljava/util/zip/CRC32;")
	private static CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!ge", name = "tb", descriptor = "I")
	public static volatile int anInt1070 = 0;

	@OriginalMember(owner = "client!ge", name = "ub", descriptor = "Z")
	public static boolean aBoolean48 = false;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
	public static void method704() {
		while (true) {
			@Pc(13) Class61 local13 = Static33.aClass61_5;
			@Pc(20) Class4_Sub23 local20;
			synchronized (Static33.aClass61_5) {
				local20 = (Class4_Sub23) Static47.aClass61_7.method1641();
			}
			if (local20 == null) {
				return;
			}
			local20.aClass20_Sub1_18.method492(false, local20.aClass75_4, local20.aByteArray34, (int) local20.aLong155);
		}
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(B)Z")
	public static boolean method705() {
		@Pc(8) long local8 = Static23.method431();
		@Pc(14) int local14 = (int) (local8 - Static127.aLong154);
		Static127.aLong154 = local8;
		if (local14 > 200) {
			local14 = 200;
		}
		Static105.anInt2066 += local14;
		if (Static131.anInt3206 == 0 && Static13.anInt349 == 0 && Static4.anInt65 == 0 && Static2.anInt16 == 0) {
			return true;
		} else if (Static106.aClass69_4 == null) {
			return false;
		} else {
			try {
				if (Static105.anInt2066 > 30000) {
					throw new IOException();
				}
				@Pc(67) Class4_Sub2_Sub8 local67;
				@Pc(72) Class4_Sub16 local72;
				while (Static13.anInt349 < 20 && Static2.anInt16 > 0) {
					local67 = (Class4_Sub2_Sub8) Static16.aClass42_5.method1049();
					local72 = new Class4_Sub16(4);
					local72.method1459(1);
					local72.method1452((int) local67.aLong155);
					Static106.aClass69_4.method1860(4, local72.aByteArray22);
					Static104.aClass42_10.method1056(local67, local67.aLong155);
					Static13.anInt349++;
					Static2.anInt16--;
				}
				while (Static131.anInt3206 < 20 && Static4.anInt65 > 0) {
					local67 = (Class4_Sub2_Sub8) Static82.aClass7_2.method182();
					local72 = new Class4_Sub16(4);
					local72.method1459(0);
					local72.method1452((int) local67.aLong155);
					Static106.aClass69_4.method1860(4, local72.aByteArray22);
					local67.method2201();
					Static82.aClass42_9.method1056(local67, local67.aLong155);
					Static131.anInt3206++;
					Static4.anInt65--;
				}
				for (@Pc(171) int local171 = 0; local171 < 100; local171++) {
					@Pc(177) int local177 = Static106.aClass69_4.method1863();
					if (local177 < 0) {
						throw new IOException();
					}
					if (local177 == 0) {
						break;
					}
					Static105.anInt2066 = 0;
					@Pc(195) byte local195 = 0;
					if (Static8.aClass4_Sub2_Sub8_1 == null) {
						local195 = 8;
					} else if (Static70.anInt1726 == 0) {
						local195 = 1;
					}
					@Pc(218) int local218;
					@Pc(223) int local223;
					@Pc(263) int local263;
					@Pc(337) int local337;
					if (local195 <= 0) {
						local218 = Static125.aClass4_Sub16_6.aByteArray22.length - Static8.aClass4_Sub2_Sub8_1.aByte3;
						local223 = 512 - Static70.anInt1726;
						if (local223 > local218 - Static125.aClass4_Sub16_6.anInt2019) {
							local223 = local218 - Static125.aClass4_Sub16_6.anInt2019;
						}
						if (local177 < local223) {
							local223 = local177;
						}
						Static106.aClass69_4.method1855(local223, Static125.aClass4_Sub16_6.anInt2019, Static125.aClass4_Sub16_6.aByteArray22);
						if (Static112.aByte7 != 0) {
							for (local263 = 0; local263 < local223; local263++) {
								Static125.aClass4_Sub16_6.aByteArray22[local263 + Static125.aClass4_Sub16_6.anInt2019] ^= Static112.aByte7;
							}
						}
						Static125.aClass4_Sub16_6.anInt2019 += local223;
						Static70.anInt1726 += local223;
						if (Static125.aClass4_Sub16_6.anInt2019 == local218) {
							if (Static8.aClass4_Sub2_Sub8_1.aLong155 == 16711935L) {
								Static52.aClass4_Sub16_3 = Static125.aClass4_Sub16_6;
								for (local263 = 0; local263 < 256; local263++) {
									@Pc(324) Class20_Sub1 local324 = Static27.aClass20_Sub1Array1[local263];
									if (local324 != null) {
										Static52.aClass4_Sub16_3.anInt2019 = local263 * 8 + 5;
										local337 = Static52.aClass4_Sub16_3.method1486();
										@Pc(341) int local341 = Static52.aClass4_Sub16_3.method1486();
										local324.method501(local337, local341);
									}
								}
							} else {
								aCRC32_1.reset();
								aCRC32_1.update(Static125.aClass4_Sub16_6.aByteArray22, 0, local218);
								local263 = (int) aCRC32_1.getValue();
								if (Static8.aClass4_Sub2_Sub8_1.anInt1166 != local263) {
									try {
										Static106.aClass69_4.method1859();
									} catch (@Pc(375) Exception local375) {
									}
									Static106.aClass69_4 = null;
									Static112.aByte7 = (byte) (Math.random() * 255.0D + 1.0D);
									Static131.anInt3205++;
									return false;
								}
								Static64.anInt1659 = 0;
								Static131.anInt3205 = 0;
								Static8.aClass4_Sub2_Sub8_1.aClass20_Sub1_7.method498((Static8.aClass4_Sub2_Sub8_1.aLong155 & 0xFF0000L) == 16711680L, Static125.aClass4_Sub16_6.aByteArray22, Static116.aBoolean139, (int) (Static8.aClass4_Sub2_Sub8_1.aLong155 & 0xFFFFL));
							}
							Static8.aClass4_Sub2_Sub8_1.method2189();
							if (Static116.aBoolean139) {
								Static13.anInt349--;
							} else {
								Static131.anInt3206--;
							}
							Static125.aClass4_Sub16_6 = null;
							Static70.anInt1726 = 0;
							Static8.aClass4_Sub2_Sub8_1 = null;
						} else {
							if (Static70.anInt1726 != 512) {
								break;
							}
							Static70.anInt1726 = 0;
						}
					} else {
						local218 = local195 - Static69.aClass4_Sub16_4.anInt2019;
						if (local177 < local218) {
							local218 = local177;
						}
						Static106.aClass69_4.method1855(local218, Static69.aClass4_Sub16_4.anInt2019, Static69.aClass4_Sub16_4.aByteArray22);
						if (Static112.aByte7 != 0) {
							for (local223 = 0; local223 < local218; local223++) {
								Static69.aClass4_Sub16_4.aByteArray22[Static69.aClass4_Sub16_4.anInt2019 + local223] ^= Static112.aByte7;
							}
						}
						Static69.aClass4_Sub16_4.anInt2019 += local218;
						if (local195 > Static69.aClass4_Sub16_4.anInt2019) {
							break;
						}
						if (Static8.aClass4_Sub2_Sub8_1 == null) {
							Static69.aClass4_Sub16_4.anInt2019 = 0;
							local223 = Static69.aClass4_Sub16_4.method1474();
							local263 = Static69.aClass4_Sub16_4.method1490();
							@Pc(525) int local525 = Static69.aClass4_Sub16_4.method1474();
							local337 = Static69.aClass4_Sub16_4.method1486();
							@Pc(537) long local537 = (long) ((local223 << 16) + local263);
							@Pc(543) Class4_Sub2_Sub8 local543 = (Class4_Sub2_Sub8) Static104.aClass42_10.method1055(local537);
							Static116.aBoolean139 = true;
							if (local543 == null) {
								local543 = (Class4_Sub2_Sub8) Static82.aClass42_9.method1055(local537);
								Static116.aBoolean139 = false;
							}
							if (local543 == null) {
								throw new IOException();
							}
							Static8.aClass4_Sub2_Sub8_1 = local543;
							@Pc(569) int local569 = local525 == 0 ? 5 : 9;
							Static125.aClass4_Sub16_6 = new Class4_Sub16(local337 + local569 + Static8.aClass4_Sub2_Sub8_1.aByte3);
							Static125.aClass4_Sub16_6.method1459(local525);
							Static125.aClass4_Sub16_6.method1489(local337);
							Static70.anInt1726 = 8;
							Static69.aClass4_Sub16_4.anInt2019 = 0;
						} else if (Static70.anInt1726 == 0) {
							if (Static69.aClass4_Sub16_4.aByteArray22[0] == -1) {
								Static69.aClass4_Sub16_4.anInt2019 = 0;
								Static70.anInt1726 = 1;
							} else {
								Static8.aClass4_Sub2_Sub8_1 = null;
							}
						}
					}
				}
				return true;
			} catch (@Pc(623) IOException local623) {
				try {
					Static106.aClass69_4.method1859();
				} catch (@Pc(628) Exception local628) {
				}
				Static106.aClass69_4 = null;
				Static64.anInt1659++;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(III[Lclient!ja;)Lclient!ja;")
	public static Class39 method706(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class39[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			if (arg2[arg1 + local17] == null) {
				arg2[local17 + arg1] = Static26.aClass39_376;
			}
			local7 += arg2[local17 + arg1].anInt1481;
		}
		@Pc(48) byte[] local48 = new byte[local7];
		@Pc(50) int local50 = 0;
		@Pc(60) Class39 local60;
		for (@Pc(52) int local52 = 0; local52 < arg0; local52++) {
			local60 = arg2[arg1 + local52];
			Static134.method1168(local60.aByteArray10, 0, local48, local50, local60.anInt1481);
			local50 += local60.anInt1481;
		}
		local60 = new Class39();
		local60.anInt1481 = local7;
		local60.aByteArray10 = local48;
		return local60;
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!fe;ZILclient!s;)V")
	public static void method707(@OriginalArg(0) Class29 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub16 arg2) {
		@Pc(9) Class4_Sub22 local9 = new Class4_Sub22();
		local9.anInt3020 = arg2.method1474();
		local9.anInt3022 = arg2.method1486();
		local9.anIntArray323 = new int[local9.anInt3020];
		local9.anIntArray321 = new int[local9.anInt3020];
		local9.aByteArrayArrayArray6 = new byte[local9.anInt3020][][];
		local9.aClass16Array2 = new Class16[local9.anInt3020];
		local9.anIntArray322 = new int[local9.anInt3020];
		local9.aClass16Array1 = new Class16[local9.anInt3020];
		for (@Pc(51) int local51 = 0; local51 < local9.anInt3020; local51++) {
			try {
				@Pc(57) int local57 = arg2.method1474();
				@Pc(88) String local88;
				@Pc(97) String local97;
				@Pc(101) int local101;
				if (local57 == 0 || local57 == 1 || local57 == 2) {
					local88 = new String(arg2.method1464().method965());
					local101 = 0;
					local97 = new String(arg2.method1464().method965());
					if (local57 == 1) {
						local101 = arg2.method1486();
					}
					local9.anIntArray321[local51] = local57;
					local9.anIntArray322[local51] = local101;
					local9.aClass16Array1[local51] = arg0.method604(Static110.method1959(local88), local97);
				} else if (local57 == 3 || local57 == 4) {
					local88 = new String(arg2.method1464().method965());
					local97 = new String(arg2.method1464().method965());
					local101 = arg2.method1474();
					@Pc(104) String[] local104 = new String[local101];
					for (@Pc(106) int local106 = 0; local106 < local101; local106++) {
						local104[local106] = new String(arg2.method1464().method965());
					}
					@Pc(126) byte[][] local126 = new byte[local101][];
					@Pc(139) int local139;
					if (local57 == 3) {
						for (@Pc(133) int local133 = 0; local133 < local101; local133++) {
							local139 = arg2.method1486();
							local126[local133] = new byte[local139];
							arg2.method1483(local126[local133], local139);
						}
					}
					local9.anIntArray321[local51] = local57;
					@Pc(168) Class[] local168 = new Class[local101];
					for (local139 = 0; local139 < local101; local139++) {
						local168[local139] = Static110.method1959(local104[local139]);
					}
					local9.aClass16Array2[local51] = arg0.method602(local168, Static110.method1959(local88), local97);
					local9.aByteArrayArrayArray6[local51] = local126;
				}
			} catch (@Pc(253) ClassNotFoundException local253) {
				local9.anIntArray323[local51] = -1;
			} catch (@Pc(260) SecurityException local260) {
				local9.anIntArray323[local51] = -2;
			} catch (@Pc(267) NullPointerException local267) {
				local9.anIntArray323[local51] = -3;
			} catch (@Pc(274) Exception local274) {
				local9.anIntArray323[local51] = -4;
			} catch (@Pc(281) Throwable local281) {
				local9.anIntArray323[local51] = -5;
			}
		}
		Static10.aClass61_1.method1635(local9);
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!ja;ZLclient!s;)I")
	public static int method708(@OriginalArg(0) Class39 arg0, @OriginalArg(2) Class4_Sub16 arg1) {
		@Pc(15) int local15 = arg1.anInt2019;
		arg1.method1460(arg0.anInt1481);
		arg1.anInt2019 += Static102.aClass44_1.method1126(0, arg0.anInt1481, arg1.aByteArray22, arg1.anInt2019, arg0.aByteArray10);
		return arg1.anInt2019 - local15;
	}

	@OriginalMember(owner = "client!ge", name = "d", descriptor = "(II)V")
	public static void method709(@OriginalArg(1) int arg0) {
		if (!Static27.method502(arg0)) {
			return;
		}
		@Pc(14) Class4_Sub5[] local14 = Static109.aClass4_Sub5ArrayArray1[arg0];
		for (@Pc(21) int local21 = 0; local21 < local14.length; local21++) {
			@Pc(27) Class4_Sub5 local27 = local14[local21];
			if (local27 != null) {
				local27.anInt1226 = 0;
				local27.anInt1261 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIIIIII)V")
	public static void method710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 1 || arg5 < 1 || arg3 > 102 || arg5 > 102) {
			return;
		}
		if (Static123.aBoolean150 && Static131.anInt3202 != arg4) {
			return;
		}
		@Pc(33) int local33 = 0;
		if (arg6 == 0) {
			local33 = Static101.aClass43_1.method1099(arg4, arg3, arg5);
		}
		if (arg6 == 1) {
			local33 = Static101.aClass43_1.method1087(arg4, arg3, arg5);
		}
		if (arg6 == 2) {
			local33 = Static101.aClass43_1.method1117(arg4, arg3, arg5);
		}
		if (arg6 == 3) {
			local33 = Static101.aClass43_1.method1113(arg4, arg3, arg5);
		}
		@Pc(86) int local86;
		if (local33 != 0) {
			local86 = Static101.aClass43_1.method1075(arg4, arg3, arg5, local33);
			@Pc(90) int local90 = local86 & 0x1F;
			@Pc(96) int local96 = local86 >> 6 & 0x3;
			@Pc(102) int local102 = local33 >> 14 & 0x7FFF;
			@Pc(113) Class4_Sub2_Sub10 local113;
			if (arg6 == 0) {
				Static101.aClass43_1.method1088(arg4, arg3, arg5);
				local113 = Static73.method1207(local102);
				if (local113.anInt1407 != 0) {
					Static109.aClass81Array1[arg4].method2219(local113.aBoolean75, arg5, local96, local90, arg3);
				}
			}
			if (arg6 == 1) {
				Static101.aClass43_1.method1083(arg4, arg3, arg5);
			}
			if (arg6 == 2) {
				Static101.aClass43_1.method1121(arg4, arg3, arg5);
				local113 = Static73.method1207(local102);
				if (local113.anInt1410 + arg3 > 103 || arg5 + local113.anInt1410 > 103 || local113.anInt1413 + arg3 > 103 || arg5 + local113.anInt1413 > 103) {
					return;
				}
				if (local113.anInt1407 != 0) {
					Static109.aClass81Array1[arg4].method2223(arg5, local113.aBoolean75, arg3, local96, local113.anInt1413, local113.anInt1410);
				}
			}
			if (arg6 == 3) {
				Static101.aClass43_1.method1077(arg4, arg3, arg5);
				local113 = Static73.method1207(local102);
				if (local113.anInt1407 == 1) {
					Static109.aClass81Array1[arg4].method2222(arg5, arg3);
				}
			}
		}
		if (arg0 < 0) {
			return;
		}
		local86 = arg4;
		if (arg4 < 3 && (Static131.aByteArrayArrayArray7[1][arg3][arg5] & 0x2) == 2) {
			local86 = arg4 + 1;
		}
		Static49.method799(arg1, local86, arg5, arg0, arg2, arg4, Static109.aClass81Array1[arg4], arg3, Static101.aClass43_1);
	}

	@OriginalMember(owner = "client!ge", name = "f", descriptor = "(B)V")
	public static void method711() {
		Static10.aClass61_1 = new Class61();
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	public static void method712() {
		aCRC32_1 = null;
		aLongArray3 = null;
	}
}
