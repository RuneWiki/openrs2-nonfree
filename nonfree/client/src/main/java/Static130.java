import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!of", name = "f", descriptor = "Lclient!a;")
	public static Class1_Sub1 aClass1_Sub1_21;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!of", name = "B", descriptor = "[I")
	public static int[] anIntArray380;

	@OriginalMember(owner = "client!of", name = "L", descriptor = "Lclient!bc;")
	public static Class1 aClass1_19;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1103 = Static120.method1824(" )2>");

	@OriginalMember(owner = "client!of", name = "s", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1110 = Static120.method1824("Loading)3)3)3");

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1104 = aClass80_1110;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1105 = Static120.method1824("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!of", name = "x", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1111 = Static120.method1824("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1106 = aClass80_1111;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "[I")
	public static final int[] anIntArray379 = new int[100];

	@OriginalMember(owner = "client!of", name = "y", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1112 = Static120.method1824("Please remove ");

	@OriginalMember(owner = "client!of", name = "p", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1107 = aClass80_1112;

	@OriginalMember(owner = "client!of", name = "q", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1108 = Static120.method1824("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!of", name = "r", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1109 = aClass80_1112;

	@OriginalMember(owner = "client!of", name = "A", descriptor = "Lclient!af;")
	public static final Class5 aClass5_39 = new Class5(64);

	@OriginalMember(owner = "client!of", name = "M", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1115 = Static120.method1824("Password: ");

	@OriginalMember(owner = "client!of", name = "E", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1113 = aClass80_1115;

	@OriginalMember(owner = "client!of", name = "G", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1114 = Static120.method1824(":");

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!a;)V")
	public static void method1949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (Static158.aClass3_Sub17_4 == null) {
			Static32.method3058(true, null, 0, 255, (byte) 0, 255);
			Static67.aClass1_Sub1Array1[arg0] = arg1;
		} else {
			Static158.aClass3_Sub17_4.anInt2923 = arg0 * 8 + 5;
			@Pc(16) int local16 = Static158.aClass3_Sub17_4.method2132();
			@Pc(20) int local20 = Static158.aClass3_Sub17_4.method2132();
			arg1.method68(local16, local20);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(BIZZZ)Lclient!a;")
	public static Class1_Sub1 method1950(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(1) Class53 local1 = null;
		if (Static180.aClass74_4 != null) {
			local1 = new Class53(arg0, Static180.aClass74_4, Static66.aClass74Array1[arg0], 1000000);
		}
		return new Class1_Sub1(local1, Static175.aClass53_4, arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V")
	public static void method1951(@OriginalArg(1) boolean arg0) {
		Static54.aBoolean52 = arg0;
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(122) int local122;
		@Pc(130) int local130;
		@Pc(138) int local138;
		if (!Static54.aBoolean52) {
			local9 = Static63.aClass3_Sub17_Sub1_2.method2091();
			local13 = Static63.aClass3_Sub17_Sub1_2.method2114();
			local20 = (Static41.anInt905 - Static63.aClass3_Sub17_Sub1_2.anInt2923) / 16;
			Static92.anIntArrayArray33 = new int[local20][4];
			for (local26 = 0; local26 < local20; local26++) {
				for (local30 = 0; local30 < 4; local30++) {
					Static92.anIntArrayArray33[local26][local30] = Static63.aClass3_Sub17_Sub1_2.method2140();
				}
			}
			local30 = Static63.aClass3_Sub17_Sub1_2.method2141();
			local60 = Static63.aClass3_Sub17_Sub1_2.method2111();
			@Pc(62) boolean local62 = false;
			local66 = Static63.aClass3_Sub17_Sub1_2.method2098();
			Static151.aByteArrayArray9 = new byte[local20][];
			Static132.anIntArray382 = new int[local20];
			if ((local66 / 8 == 48 || local66 / 8 == 49) && (local60 / 8) == 48) {
				local62 = true;
			}
			if (local66 / 8 == 48 && local60 / 8 == 148) {
				local62 = true;
			}
			Static143.anIntArray394 = new int[local20];
			Static112.aByteArrayArray6 = new byte[local20][];
			Static161.anIntArray451 = new int[local20];
			local20 = 0;
			for (local122 = (local66 - 6) / 8; local122 <= (local66 + 6) / 8; local122++) {
				for (local130 = (local60 - 6) / 8; local130 <= (local60 + 6) / 8; local130++) {
					local138 = (local122 << 8) + local130;
					if (!local62 || local130 != 49 && local130 != 149 && local130 != 147 && local122 != 50 && (local122 != 49 || local130 != 47)) {
						Static161.anIntArray451[local20] = local138;
						Static143.anIntArray394[local20] = Static100.aClass1_Sub1_16.method53(Static154.method2467(new Class80[] { Static81.aClass80_677, Static83.method1219(local122), Static29.aClass80_226, Static83.method1219(local130) }));
						Static132.anIntArray382[local20] = Static100.aClass1_Sub1_16.method53(Static154.method2467(new Class80[] { Static39.aClass80_319, Static83.method1219(local122), Static29.aClass80_226, Static83.method1219(local130) }));
						local20++;
					}
				}
			}
			Static92.method2207(local30, local66, local9, local13, local60);
			return;
		}
		local9 = Static63.aClass3_Sub17_Sub1_2.method2111();
		local13 = Static63.aClass3_Sub17_Sub1_2.method2098();
		local20 = Static63.aClass3_Sub17_Sub1_2.method2111();
		local26 = Static63.aClass3_Sub17_Sub1_2.method2135();
		Static63.aClass3_Sub17_Sub1_2.method2150();
		@Pc(294) int local294;
		for (local30 = 0; local30 < 4; local30++) {
			for (local60 = 0; local60 < 13; local60++) {
				for (local66 = 0; local66 < 13; local66++) {
					local294 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
					if (local294 == 1) {
						Static103.anIntArrayArrayArray6[local30][local60][local66] = Static63.aClass3_Sub17_Sub1_2.method2152(26);
					} else {
						Static103.anIntArrayArrayArray6[local30][local60][local66] = -1;
					}
				}
			}
		}
		Static63.aClass3_Sub17_Sub1_2.method2148();
		local60 = (Static41.anInt905 - Static63.aClass3_Sub17_Sub1_2.anInt2923) / 16;
		Static92.anIntArrayArray33 = new int[local60][4];
		for (local66 = 0; local66 < local60; local66++) {
			for (local294 = 0; local294 < 4; local294++) {
				Static92.anIntArrayArray33[local66][local294] = Static63.aClass3_Sub17_Sub1_2.method2133();
			}
		}
		local294 = Static63.aClass3_Sub17_Sub1_2.method2114();
		Static132.anIntArray382 = new int[local60];
		Static112.aByteArrayArray6 = new byte[local60][];
		Static161.anIntArray451 = new int[local60];
		Static151.aByteArrayArray9 = new byte[local60][];
		Static143.anIntArray394 = new int[local60];
		local60 = 0;
		for (local122 = 0; local122 < 4; local122++) {
			for (local130 = 0; local130 < 13; local130++) {
				for (local138 = 0; local138 < 13; local138++) {
					@Pc(420) int local420 = Static103.anIntArrayArrayArray6[local122][local130][local138];
					if (local420 != -1) {
						@Pc(429) int local429 = local420 >> 14 & 0x3FF;
						@Pc(435) int local435 = local420 >> 3 & 0x7FF;
						@Pc(445) int local445 = local435 / 8 + (local429 / 8 << 8);
						for (@Pc(447) int local447 = 0; local447 < local60; local447++) {
							if (Static161.anIntArray451[local447] == local445) {
								local445 = -1;
								break;
							}
						}
						if (local445 != -1) {
							Static161.anIntArray451[local60] = local445;
							@Pc(482) int local482 = local445 & 0xFF;
							@Pc(488) int local488 = local445 >> 8 & 0xFF;
							Static143.anIntArray394[local60] = Static100.aClass1_Sub1_16.method53(Static154.method2467(new Class80[] { Static81.aClass80_677, Static83.method1219(local488), Static29.aClass80_226, Static83.method1219(local482) }));
							Static132.anIntArray382[local60] = Static100.aClass1_Sub1_16.method53(Static154.method2467(new Class80[] { Static39.aClass80_319, Static83.method1219(local488), Static29.aClass80_226, Static83.method1219(local482) }));
							local60++;
						}
					}
				}
			}
		}
		Static92.method2207(local20, local294, local26, local13, local9);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method1952() {
		Static63.aClass3_Sub17_Sub1_2.method2150();
		@Pc(15) int local15 = Static63.aClass3_Sub17_Sub1_2.method2152(8);
		@Pc(30) int local30;
		if (Static59.anInt1317 > local15) {
			for (local30 = local15; local30 < Static59.anInt1317; local30++) {
				Static36.anIntArray109[Static41.anInt906++] = Static125.anIntArray359[local30];
			}
		}
		if (Static59.anInt1317 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static59.anInt1317 = 0;
		for (local30 = 0; local30 < local15; local30++) {
			@Pc(68) int local68 = Static125.anIntArray359[local30];
			@Pc(72) Class3_Sub1_Sub5_Sub4_Sub1 local72 = Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local68];
			@Pc(77) int local77 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
			if (local77 == 0) {
				Static125.anIntArray359[Static59.anInt1317++] = local68;
				local72.anInt4314 = Static193.anInt4411;
			} else {
				@Pc(100) int local100 = Static63.aClass3_Sub17_Sub1_2.method2152(2);
				if (local100 == 0) {
					Static125.anIntArray359[Static59.anInt1317++] = local68;
					local72.anInt4314 = Static193.anInt4411;
					Static3.anIntArray24[Static33.anInt779++] = local68;
				} else {
					@Pc(142) int local142;
					@Pc(152) int local152;
					if (local100 == 1) {
						Static125.anIntArray359[Static59.anInt1317++] = local68;
						local72.anInt4314 = Static193.anInt4411;
						local142 = Static63.aClass3_Sub17_Sub1_2.method2152(3);
						local72.method3067(local142, false);
						local152 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
						if (local152 == 1) {
							Static3.anIntArray24[Static33.anInt779++] = local68;
						}
					} else if (local100 == 2) {
						Static125.anIntArray359[Static59.anInt1317++] = local68;
						local72.anInt4314 = Static193.anInt4411;
						local142 = Static63.aClass3_Sub17_Sub1_2.method2152(3);
						local72.method3067(local142, true);
						local152 = Static63.aClass3_Sub17_Sub1_2.method2152(3);
						local72.method3067(local152, true);
						@Pc(204) int local204 = Static63.aClass3_Sub17_Sub1_2.method2152(1);
						if (local204 == 1) {
							Static3.anIntArray24[Static33.anInt779++] = local68;
						}
					} else if (local100 == 3) {
						Static36.anIntArray109[Static41.anInt906++] = local68;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIIII)V")
	public static void method1959(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(5) int local5 = arg0 - arg1;
		@Pc(14) int local14 = arg2 - arg3;
		if (local14 == 0) {
			if (local5 != 0) {
				Static56.method820(arg1, arg0, arg4, arg3);
			}
		} else if (local5 == 0) {
			Static149.method2389(arg2, arg1, arg4, arg3);
		} else {
			if (local5 < 0) {
				local5 = -local5;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(58) boolean local58 = local5 > local14;
			@Pc(62) int local62;
			@Pc(68) int local68;
			if (local58) {
				local62 = arg3;
				arg3 = arg1;
				arg1 = local62;
				local68 = arg2;
				arg2 = arg0;
				arg0 = local68;
			}
			if (arg3 > arg2) {
				local62 = arg3;
				arg3 = arg2;
				local68 = arg1;
				arg1 = arg0;
				arg0 = local68;
				arg2 = local62;
			}
			local62 = arg1;
			local68 = arg2 - arg3;
			@Pc(109) int local109 = arg0 <= arg1 ? -1 : 1;
			@Pc(114) int local114 = -(local68 >> 1);
			@Pc(119) int local119 = arg0 - arg1;
			if (local119 < 0) {
				local119 = -local119;
			}
			@Pc(131) int local131;
			if (local58) {
				for (local131 = arg3; local131 <= arg2; local131++) {
					local114 += local119;
					Static96.anIntArrayArray27[local131][local62] = arg4;
					if (local114 > 0) {
						local114 -= local68;
						local62 += local109;
					}
				}
			} else {
				for (local131 = arg3; local131 <= arg2; local131++) {
					local114 += local119;
					Static96.anIntArrayArray27[local62][local131] = arg4;
					if (local114 > 0) {
						local114 -= local68;
						local62 += local109;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!oh;II)V")
	public static void method1960(@OriginalArg(0) Class3_Sub1_Sub5_Sub4 arg0, @OriginalArg(1) int arg1) {
		Static162.method2626(arg0.anInt4315, arg1, arg0.anInt4329);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(ILclient!oh;I)V")
	public static void method1962(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub5_Sub4 arg1) {
		if (Static193.anInt4411 < arg1.anInt4325) {
			Static149.method2391(arg1);
		} else if (Static193.anInt4411 > arg1.anInt4282) {
			Static2.method79(arg1);
		} else {
			Static139.method2160(arg1);
		}
		if (arg1.anInt4329 < 128 || arg1.anInt4315 < 128 || arg1.anInt4329 >= 13184 || arg1.anInt4315 >= 13184) {
			arg1.anInt4282 = 0;
			arg1.anInt4325 = 0;
			arg1.anInt4315 = arg1.anInt4277 * 64 + arg1.anIntArray513[0] * 128;
			arg1.anInt4329 = arg1.anIntArray509[0] * 128 + arg1.anInt4277 * 64;
			arg1.anInt4323 = -1;
			arg1.anInt4296 = -1;
			arg1.method3065();
		}
		if (Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1 == arg1 && (arg1.anInt4329 < 1536 || arg1.anInt4315 < 1536 || arg1.anInt4329 >= 11776 || arg1.anInt4315 >= 11776)) {
			arg1.anInt4296 = -1;
			arg1.anInt4315 = arg1.anInt4277 * 64 + arg1.anIntArray513[0] * 128;
			arg1.anInt4329 = arg1.anInt4277 * 64 + arg1.anIntArray509[0] * 128;
			arg1.anInt4323 = -1;
			arg1.anInt4282 = 0;
			arg1.anInt4325 = 0;
			arg1.method3065();
		}
		Static95.method2642(arg1);
		Static110.method1710(arg1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)I")
	public static int method1964(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(33) int local33 = (local19 * arg0 >> 12) + 40960;
		return local33 * local13 >> 12;
	}
}
