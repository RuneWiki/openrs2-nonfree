import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "[Lclient!hh;")
	public static Class1_Sub2_Sub5_Sub3[] aClass1_Sub2_Sub5_Sub3Array1;

	@OriginalMember(owner = "client!ch", name = "o", descriptor = "I")
	public static int anInt855;

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "Lclient!di;")
	public static final Class19 aClass19_2 = new Class19();

	@OriginalMember(owner = "client!ch", name = "e", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_592 = Static118.method2249("Click to switch");

	@OriginalMember(owner = "client!ch", name = "p", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_599 = Static118.method2249(" from your friend list first)3");

	@OriginalMember(owner = "client!ch", name = "f", descriptor = "Lclient!oc;")
	public static Class65 aClass65_593 = aClass65_599;

	@OriginalMember(owner = "client!ch", name = "h", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_594 = Static118.method2249("<col=ffffff>");

	@OriginalMember(owner = "client!ch", name = "i", descriptor = "[Lclient!oc;")
	public static final Class65[] aClass65Array11 = new Class65[100];

	@OriginalMember(owner = "client!ch", name = "j", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_595 = Static118.method2249("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
	public static int anInt854 = 0;

	@OriginalMember(owner = "client!ch", name = "l", descriptor = "Lclient!oc;")
	public static Class65 aClass65_596 = aClass65_592;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_597 = Static118.method2249("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ch", name = "n", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_598 = Static118.method2249(" ");

	@OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
	public static int anInt856 = -1;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Z)V")
	public static void method560() {
		@Pc(12) int local12;
		@Pc(20) int local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		if (Static192.anInt4177 == 99) {
			local12 = Static1.aClass1_Sub14_Sub1_43.method1738();
			local20 = (local12 >> 4 & 0x7) + Static53.anInt1437;
			local26 = (local12 & 0x7) + Static52.anInt1411;
			local30 = Static1.aClass1_Sub14_Sub1_43.method1753();
			local34 = Static1.aClass1_Sub14_Sub1_43.method1753();
			local38 = Static1.aClass1_Sub14_Sub1_43.method1753();
			if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
				@Pc(58) Class91 local58 = Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local20][local26];
				if (local58 != null) {
					for (@Pc(65) Class1_Sub2_Sub18 local65 = (Class1_Sub2_Sub18) local58.method3148(); local65 != null; local65 = (Class1_Sub2_Sub18) local58.method3150()) {
						@Pc(69) Class6_Sub7 local69 = local65.aClass6_Sub7_1;
						if ((local30 & 0x7FFF) == local69.anInt3630 && local69.anInt3626 == local34) {
							local69.anInt3626 = local38;
							break;
						}
					}
					Static146.method2644(local20, local26);
				}
			}
		} else if (Static192.anInt4177 == 181) {
			local12 = Static1.aClass1_Sub14_Sub1_43.method1753();
			local20 = Static1.aClass1_Sub14_Sub1_43.method1704();
			local26 = Static1.aClass1_Sub14_Sub1_43.method1749();
			local30 = Static1.aClass1_Sub14_Sub1_43.method1738();
			local38 = Static52.anInt1411 + (local30 & 0x7);
			local34 = Static53.anInt1437 + (local30 >> 4 & 0x7);
			if (local34 >= 0 && local38 >= 0 && local34 < 104 && local38 < 104 && local12 != Static142.anInt3429) {
				@Pc(151) Class6_Sub7 local151 = new Class6_Sub7();
				local151.anInt3626 = local20;
				local151.anInt3630 = local26;
				if (Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local34][local38] == null) {
					Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local34][local38] = new Class91();
				}
				Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local34][local38].method3151(new Class1_Sub2_Sub18(local151));
				Static146.method2644(local34, local38);
			}
		} else {
			@Pc(238) int local238;
			@Pc(244) int local244;
			@Pc(250) int local250;
			@Pc(258) int local258;
			@Pc(262) int local262;
			@Pc(266) int local266;
			@Pc(254) int local254;
			if (Static192.anInt4177 == 175) {
				local12 = Static1.aClass1_Sub14_Sub1_43.method1738();
				local20 = Static53.anInt1437 + (local12 >> 4 & 0x7);
				local26 = Static52.anInt1411 + (local12 & 0x7);
				local30 = local20 + Static1.aClass1_Sub14_Sub1_43.method1720();
				local34 = Static1.aClass1_Sub14_Sub1_43.method1720() + local26;
				local38 = Static1.aClass1_Sub14_Sub1_43.method1729();
				local238 = Static1.aClass1_Sub14_Sub1_43.method1753();
				local244 = Static1.aClass1_Sub14_Sub1_43.method1738() * 4;
				local250 = Static1.aClass1_Sub14_Sub1_43.method1738() * 4;
				local254 = Static1.aClass1_Sub14_Sub1_43.method1753();
				local258 = Static1.aClass1_Sub14_Sub1_43.method1753();
				local262 = Static1.aClass1_Sub14_Sub1_43.method1738();
				local266 = Static1.aClass1_Sub14_Sub1_43.method1738();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104 && local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104 && local238 != 65535) {
					local26 = local26 * 128 + 64;
					local20 = local20 * 128 + 64;
					local30 = local30 * 128 + 64;
					local34 = local34 * 128 + 64;
					@Pc(354) Class6_Sub5 local354 = new Class6_Sub5(local238, Static207.anInt4425, local20, local26, Static171.method2896(local20, Static207.anInt4425, local26) - local244, Static174.anInt3887 + local254, Static174.anInt3887 + local258, local262, local266, local38, local250);
					local354.method1823(local30, local254 + Static174.anInt3887, -local250 + Static171.method2896(local30, Static207.anInt4425, local34), local34);
					Static78.aClass91_6.method3151(new Class1_Sub2_Sub16(local354));
				}
			} else if (Static192.anInt4177 == 196) {
				local12 = Static1.aClass1_Sub14_Sub1_43.method1738();
				local20 = Static53.anInt1437 + (local12 >> 4 & 0x7);
				local26 = Static52.anInt1411 + (local12 & 0x7);
				local30 = Static1.aClass1_Sub14_Sub1_43.method1704();
				if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
					@Pc(428) Class91 local428 = Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local20][local26];
					if (local428 != null) {
						for (@Pc(435) Class1_Sub2_Sub18 local435 = (Class1_Sub2_Sub18) local428.method3148(); local435 != null; local435 = (Class1_Sub2_Sub18) local428.method3150()) {
							if ((local30 & 0x7FFF) == local435.aClass6_Sub7_1.anInt3630) {
								local435.method3295();
								break;
							}
						}
						if (local428.method3148() == null) {
							Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local20][local26] = null;
						}
						Static146.method2644(local20, local26);
					}
				}
			} else {
				if (Static192.anInt4177 == 32) {
					local12 = Static1.aClass1_Sub14_Sub1_43.method1738();
					local20 = Static53.anInt1437 + (local12 >> 4 & 0x7);
					local26 = (local12 & 0x7) + Static52.anInt1411;
					local30 = Static1.aClass1_Sub14_Sub1_43.method1753();
					if (local30 == 65535) {
						local30 = -1;
					}
					local34 = Static1.aClass1_Sub14_Sub1_43.method1738();
					local238 = local34 & 0x7;
					local38 = local34 >> 4 & 0xF;
					local244 = Static1.aClass1_Sub14_Sub1_43.method1738();
					if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
						local250 = local38 + 1;
						if (local20 - local250 <= Static201.aClass6_Sub4_Sub1_3.anIntArray451[0] && Static201.aClass6_Sub4_Sub1_3.anIntArray451[0] <= local250 + local20 && Static201.aClass6_Sub4_Sub1_3.anIntArray455[0] >= local26 - local250 && Static201.aClass6_Sub4_Sub1_3.anIntArray455[0] <= local250 + local26 && Static53.anInt1436 != 0 && local238 > 0 && Static161.anInt3642 < 50 && local30 != -1) {
							Static111.anIntArray309[Static161.anInt3642] = local30;
							Static104.anIntArray292[Static161.anInt3642] = local238;
							Static134.anIntArray377[Static161.anInt3642] = local244;
							Static122.aClass84Array2[Static161.anInt3642] = null;
							Static53.anIntArray130[Static161.anInt3642] = local38 + (local20 << 16) + (local26 << 8);
							Static161.anInt3642++;
						}
					}
				}
				if (Static192.anInt4177 == 100) {
					local12 = Static1.aClass1_Sub14_Sub1_43.method1728();
					local20 = Static53.anInt1437 + (local12 >> 4 & 0x7);
					local26 = (local12 & 0x7) + Static52.anInt1411;
					local30 = Static1.aClass1_Sub14_Sub1_43.method1752();
					local34 = local30 >> 2;
					local38 = local30 & 0x3;
					local238 = Static140.anIntArray388[local34];
					if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
						Static155.method2720(-1, local238, local34, local20, 0, local38, Static207.anInt4425, local26, -1);
					}
				} else if (Static192.anInt4177 == 224) {
					local12 = Static1.aClass1_Sub14_Sub1_43.method1749();
					if (local12 == 65535) {
						local12 = -1;
					}
					local20 = Static1.aClass1_Sub14_Sub1_43.method1722();
					local30 = Static52.anInt1411 + (local20 & 0x7);
					local26 = Static53.anInt1437 + (local20 >> 4 & 0x7);
					local34 = Static1.aClass1_Sub14_Sub1_43.method1738();
					local238 = local34 & 0x3;
					local38 = local34 >> 2;
					local244 = Static140.anIntArray388[local38];
					if (local26 >= 0 && local30 >= 0 && local26 < 103 && local30 < 103) {
						if (local244 == 0) {
							@Pc(762) Class10 local762 = Static27.method485(Static207.anInt4425, local26, local30);
							if (local762 != null) {
								local254 = Integer.MAX_VALUE & (int) (local762.aLong20 >>> 32);
								if (local38 == 2) {
									local762.aClass6_2 = new Class6_Sub2(local254, 2, local238 + 4, Static207.anInt4425, local26, local30, local12, false, local762.aClass6_2);
									local762.aClass6_1 = new Class6_Sub2(local254, 2, local238 + 1 & 0x3, Static207.anInt4425, local26, local30, local12, false, local762.aClass6_1);
								} else {
									local762.aClass6_2 = new Class6_Sub2(local254, local38, local238, Static207.anInt4425, local26, local30, local12, false, local762.aClass6_2);
								}
							}
						}
						if (local244 == 1) {
							@Pc(837) Class88 local837 = Static60.method1058(Static207.anInt4425, local26, local30);
							if (local837 != null) {
								local254 = Integer.MAX_VALUE & (int) (local837.aLong138 >>> 32);
								if (local38 == 4 || local38 == 5) {
									local837.aClass6_10 = new Class6_Sub2(local254, 4, local238, Static207.anInt4425, local26, local30, local12, false, local837.aClass6_10);
								} else if (local38 == 6) {
									local837.aClass6_10 = new Class6_Sub2(local254, 4, local238 + 4, Static207.anInt4425, local26, local30, local12, false, local837.aClass6_10);
								} else if (local38 == 7) {
									local837.aClass6_10 = new Class6_Sub2(local254, 4, (local238 + 2 & 0x3) + 4, Static207.anInt4425, local26, local30, local12, false, local837.aClass6_10);
								} else if (local38 == 8) {
									local837.aClass6_10 = new Class6_Sub2(local254, 4, local238 + 4, Static207.anInt4425, local26, local30, local12, false, local837.aClass6_10);
									local837.aClass6_11 = new Class6_Sub2(local254, 4, (local238 + 2 & 0x3) + 4, Static207.anInt4425, local26, local30, local12, false, local837.aClass6_11);
								}
							}
						}
						if (local244 == 2) {
							@Pc(972) Class54 local972 = Static153.method2679(Static207.anInt4425, local26, local30);
							if (local38 == 11) {
								local38 = 10;
							}
							if (local972 != null) {
								local972.aClass6_5 = new Class6_Sub2((int) (local972.aLong83 >>> 32) & Integer.MAX_VALUE, local38, local238, Static207.anInt4425, local26, local30, local12, false, local972.aClass6_5);
							}
						}
						if (local244 == 3) {
							@Pc(1008) Class33 local1008 = Static130.method2492(Static207.anInt4425, local26, local30);
							if (local1008 != null) {
								local1008.aClass6_3 = new Class6_Sub2(Integer.MAX_VALUE & (int) (local1008.aLong53 >>> 32), 22, local238, Static207.anInt4425, local26, local30, local12, false, local1008.aClass6_3);
							}
						}
					}
				} else if (Static192.anInt4177 == 15) {
					local12 = Static1.aClass1_Sub14_Sub1_43.method1728();
					local20 = local12 >> 2;
					local26 = local12 & 0x3;
					local30 = Static140.anIntArray388[local20];
					local34 = Static1.aClass1_Sub14_Sub1_43.method1752();
					local38 = (local34 >> 4 & 0x7) + Static53.anInt1437;
					local238 = (local34 & 0x7) + Static52.anInt1411;
					local244 = Static1.aClass1_Sub14_Sub1_43.method1753();
					if (local38 >= 0 && local238 >= 0 && local38 < 104 && local238 < 104) {
						Static155.method2720(local244, local30, local20, local38, 0, local26, Static207.anInt4425, local238, -1);
					}
				} else if (Static192.anInt4177 == 88) {
					local12 = Static1.aClass1_Sub14_Sub1_43.method1738();
					local20 = (local12 >> 4 & 0x7) + Static53.anInt1437;
					local26 = (local12 & 0x7) + Static52.anInt1411;
					local30 = Static1.aClass1_Sub14_Sub1_43.method1753();
					local34 = Static1.aClass1_Sub14_Sub1_43.method1738();
					local38 = Static1.aClass1_Sub14_Sub1_43.method1753();
					if (local20 >= 0 && local26 >= 0 && local20 < 104 && local26 < 104) {
						local26 = local26 * 128 + 64;
						local20 = local20 * 128 + 64;
						@Pc(1181) Class6_Sub6 local1181 = new Class6_Sub6(local30, Static207.anInt4425, local20, local26, Static171.method2896(local20, Static207.anInt4425, local26) - local34, local38, Static174.anInt3887);
						Static169.aClass91_7.method3151(new Class1_Sub2_Sub23(local1181));
					}
				} else {
					if (Static192.anInt4177 == 77) {
						local12 = Static1.aClass1_Sub14_Sub1_43.method1722();
						local20 = (local12 >> 4 & 0x7) + Static53.anInt1437;
						local26 = (local12 & 0x7) + Static52.anInt1411;
						@Pc(1214) byte local1214 = Static1.aClass1_Sub14_Sub1_43.method1714();
						local34 = Static1.aClass1_Sub14_Sub1_43.method1753();
						local38 = Static1.aClass1_Sub14_Sub1_43.method1753();
						@Pc(1230) byte local1230 = Static1.aClass1_Sub14_Sub1_43.method1714();
						local244 = Static1.aClass1_Sub14_Sub1_43.method1715();
						local250 = Static1.aClass1_Sub14_Sub1_43.method1704();
						@Pc(1242) byte local1242 = Static1.aClass1_Sub14_Sub1_43.method1714();
						local258 = Static1.aClass1_Sub14_Sub1_43.method1738();
						local266 = local258 & 0x3;
						local262 = local258 >> 2;
						@Pc(1258) int local1258 = Static140.anIntArray388[local262];
						@Pc(1262) byte local1262 = Static1.aClass1_Sub14_Sub1_43.method1716();
						@Pc(1271) Class6_Sub4_Sub1 local1271;
						if (Static142.anInt3429 == local244) {
							local1271 = Static201.aClass6_Sub4_Sub1_3;
						} else {
							local1271 = Static158.aClass6_Sub4_Sub1Array1[local244];
						}
						if (local1271 != null) {
							@Pc(1282) Class1_Sub2_Sub13 local1282 = Static5.method65(local34);
							@Pc(1293) int local1293;
							@Pc(1296) int local1296;
							if (local266 == 1 || local266 == 3) {
								local1293 = local1282.anInt2001;
								local1296 = local1282.anInt1988;
							} else {
								local1293 = local1282.anInt1988;
								local1296 = local1282.anInt2001;
							}
							@Pc(1309) int local1309 = local20 + (local1293 >> 1);
							@Pc(1317) int local1317 = local20 + (local1293 + 1 >> 1);
							@Pc(1326) int local1326 = local26 + (local1296 + 1 >> 1);
							@Pc(1332) int local1332 = (local1296 >> 1) + local26;
							@Pc(1336) int[][] local1336 = Static89.anIntArrayArrayArray3[Static207.anInt4425];
							@Pc(1344) int local1344 = (local1293 << 6) + (local20 << 7);
							@Pc(1370) int local1370 = local1336[local1317][local1326] + local1336[local1309][local1326] + local1336[local1317][local1332] + local1336[local1309][local1332] >> 2;
							@Pc(1378) int local1378 = (local1296 << 6) + (local26 << 7);
							@Pc(1389) Class1_Sub2_Sub19 local1389 = local1282.method1434(local1344, local262, local1370, local266, local1378, local1336, false);
							if (local1389 != null) {
								Static155.method2720(-1, local1258, 0, local20, local38 + 1, 0, Static207.anInt4425, local26, local250 + 1);
								local1271.anInt599 = local1370;
								local1271.anInt594 = local250 + Static174.anInt3887;
								local1271.aClass6_Sub3_1 = (Class6_Sub3) local1389.aClass6_9;
								local1271.anInt598 = Static174.anInt3887 + local38;
								@Pc(1434) byte local1434;
								if (local1262 < local1230) {
									local1434 = local1230;
									local1230 = local1262;
									local1262 = local1434;
								}
								local1271.anInt608 = local20 * 128 + local1293 * 64;
								local1271.anInt612 = local1262 + local20;
								local1271.anInt610 = local1230 + local20;
								local1271.anInt609 = local1296 * 64 + local26 * 128;
								if (local1214 > local1242) {
									local1434 = local1214;
									local1214 = local1242;
									local1242 = local1434;
								}
								local1271.anInt596 = local26 + local1214;
								local1271.anInt614 = local1242 + local26;
							}
						}
					}
					if (Static192.anInt4177 == 112) {
						local12 = Static1.aClass1_Sub14_Sub1_43.method1749();
						local20 = Static1.aClass1_Sub14_Sub1_43.method1704();
						local26 = Static1.aClass1_Sub14_Sub1_43.method1752();
						local30 = (local26 >> 4 & 0x7) + Static53.anInt1437;
						local34 = (local26 & 0x7) + Static52.anInt1411;
						if (local30 >= 0 && local34 >= 0 && local30 < 104 && local34 < 104) {
							@Pc(1540) Class6_Sub7 local1540 = new Class6_Sub7();
							local1540.anInt3630 = local12;
							local1540.anInt3626 = local20;
							if (Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local30][local34] == null) {
								Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local30][local34] = new Class91();
							}
							Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local30][local34].method3151(new Class1_Sub2_Sub18(local1540));
							Static146.method2644(local30, local34);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIIZ)V")
	public static void method562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (arg4 == arg7 && arg2 == arg1 && arg6 == arg0 && arg5 == arg8) {
			Static54.method2789(arg3, arg0, arg4, arg8, arg2);
			return;
		}
		@Pc(23) int local23 = arg4;
		@Pc(27) int local27 = arg4 * 3;
		@Pc(31) int local31 = arg1 * 3;
		@Pc(35) int local35 = arg2 * 3;
		@Pc(37) int local37 = arg2;
		@Pc(41) int local41 = arg7 * 3;
		@Pc(45) int local45 = arg5 * 3;
		@Pc(49) int local49 = arg6 * 3;
		@Pc(58) int local58 = arg8 + local31 - local45 - arg2;
		@Pc(63) int local63 = local41 - local27;
		@Pc(72) int local72 = local49 + local27 - local41 - local41;
		@Pc(77) int local77 = local31 - local35;
		@Pc(87) int local87 = local45 + local35 - local31 - local31;
		@Pc(96) int local96 = local41 + arg0 - local49 - arg4;
		for (@Pc(98) int local98 = 128; local98 <= 4096; local98 += 128) {
			@Pc(106) int local106 = local98 * local98 >> 12;
			@Pc(112) int local112 = local106 * local98 >> 12;
			@Pc(116) int local116 = local58 * local112;
			@Pc(120) int local120 = local106 * local72;
			@Pc(124) int local124 = local87 * local106;
			@Pc(128) int local128 = local112 * local96;
			@Pc(132) int local132 = local63 * local98;
			@Pc(136) int local136 = local98 * local77;
			@Pc(147) int local147 = (local120 + local128 + local132 >> 12) + arg4;
			@Pc(158) int local158 = arg2 + (local136 + local116 + local124 >> 12);
			Static54.method2789(arg3, local147, local23, local158, local37);
			local37 = local158;
			local23 = local147;
		}
	}
}
