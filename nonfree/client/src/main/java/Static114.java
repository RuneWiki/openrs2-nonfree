import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!n", name = "n", descriptor = "I")
	public static int anInt3121;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "Lclient!sa;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "I")
	public static int anInt3115 = 1;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1025 = Static49.method1293("To play on this world move to a free area first)3");

	@OriginalMember(owner = "client!n", name = "d", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1026 = Static49.method1293("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1027 = aClass70_1025;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array7 = new Class1_Sub1_Sub1_Sub4[1000];

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1028 = Static49.method1293("cross");

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	public static int anInt3122 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIII)V")
	public static void method2298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static58.anInt1876 == 0 && !Static167.aBoolean170) {
			Static58.method1422((short) 5, 0L, arg2 - arg0, arg3 - arg1, Static90.aClass70_874, Static35.aClass70_632);
		}
		@Pc(24) long local24 = -1L;
		for (@Pc(26) int local26 = 0; local26 < Static84.anInt919; local26++) {
			@Pc(32) long local32 = Static84.aLongArray2[local26];
			@Pc(37) int local37 = (int) local32 & 0x7F;
			@Pc(44) int local44 = (int) local32 >> 29 & 0x3;
			@Pc(51) int local51 = (int) local32 >> 7 & 0x7F;
			@Pc(58) int local58 = (int) (local32 >>> 32) & Integer.MAX_VALUE;
			if (local24 != local32) {
				local24 = local32;
				@Pc(141) int local141;
				if (local44 == 2 && Static170.method3379(Static56.anInt1784, local37, local51, local32)) {
					@Pc(79) Class1_Sub1_Sub7 local79 = Static176.method3433(local58);
					if (local79.anIntArray186 != null) {
						local79 = local79.method1395();
					}
					if (local79 == null) {
						continue;
					}
					if (Static58.anInt1876 == 1) {
						Static58.method1422((short) 41, local32, local37, local51, Static170.aClass70_1480, Static160.method3210(new Class70[] { Static111.aClass70_1012, Static11.aClass70_132, local79.aClass70_573 }));
					} else if (!Static167.aBoolean170) {
						@Pc(131) Class70[] local131 = local79.aClass70Array9;
						if (Static18.aBoolean18) {
							local131 = Static174.method3425(local131);
						}
						if (local131 != null) {
							for (local141 = 4; local141 >= 0; local141--) {
								if (local131[local141] != null) {
									@Pc(153) short local153 = 0;
									if (local141 == 0) {
										local153 = 24;
									}
									if (local141 == 1) {
										local153 = 33;
									}
									if (local141 == 2) {
										local153 = 34;
									}
									if (local141 == 3) {
										local153 = 49;
									}
									if (local141 == 4) {
										local153 = 1007;
									}
									Static58.method1422(local153, local32, local37, local51, local131[local141], Static160.method3210(new Class70[] { Static137.aClass70_1217, local79.aClass70_573 }));
								}
							}
						}
						Static58.method1422((short) 1002, (long) local79.anInt1810, local37, local51, Static150.aClass70_1348, Static160.method3210(new Class70[] { Static137.aClass70_1217, local79.aClass70_573 }));
					} else if ((Static104.anInt2954 & 0x4) == 4) {
						Static58.method1422((short) 36, local32, local37, local51, Static161.aClass70_1436, Static160.method3210(new Class70[] { Static5.aClass70_59, Static11.aClass70_132, local79.aClass70_573 }));
					}
				}
				@Pc(296) int local296;
				@Pc(304) Class1_Sub1_Sub4_Sub2_Sub2 local304;
				@Pc(353) Class1_Sub1_Sub4_Sub2_Sub1 local353;
				if (local44 == 1) {
					@Pc(275) Class1_Sub1_Sub4_Sub2_Sub2 local275 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local58];
					if (local275.aClass1_Sub1_Sub13_1.anInt3234 == 1 && (local275.anInt2030 & 0x7F) == 64 && (local275.anInt2001 & 0x7F) == 64) {
						for (local296 = 0; local296 < Static86.anInt2582; local296++) {
							local304 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[Static152.anIntArray208[local296]];
							if (local304 != null && local304 != local275 && local304.aClass1_Sub1_Sub13_1.anInt3234 == 1 && local304.anInt2030 == local275.anInt2030 && local304.anInt2001 == local275.anInt2001) {
								Static169.method3345(local37, local51, Static152.anIntArray208[local296], local304.aClass1_Sub1_Sub13_1);
							}
						}
						for (local141 = 0; local141 < Static104.anInt2960; local141++) {
							local353 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[Static26.anIntArray46[local141]];
							if (local353 != null && local353.anInt2030 == local275.anInt2030 && local353.anInt2001 == local275.anInt2001) {
								Static95.method2044(local353, Static26.anIntArray46[local141], local37, local51);
							}
						}
					}
					Static169.method3345(local37, local51, local58, local275.aClass1_Sub1_Sub13_1);
				}
				if (local44 == 0) {
					@Pc(401) Class1_Sub1_Sub4_Sub2_Sub1 local401 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local58];
					if ((local401.anInt2030 & 0x7F) == 64 && (local401.anInt2001 & 0x7F) == 64) {
						for (local296 = 0; local296 < Static86.anInt2582; local296++) {
							local304 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[Static152.anIntArray208[local296]];
							if (local304 != null && local304.aClass1_Sub1_Sub13_1.anInt3234 == 1 && local304.anInt2030 == local401.anInt2030 && local304.anInt2001 == local401.anInt2001) {
								Static169.method3345(local37, local51, Static152.anIntArray208[local296], local304.aClass1_Sub1_Sub13_1);
							}
						}
						for (local141 = 0; local141 < Static104.anInt2960; local141++) {
							local353 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[Static26.anIntArray46[local141]];
							if (local353 != null && local353 != local401 && local353.anInt2030 == local401.anInt2030 && local353.anInt2001 == local401.anInt2001) {
								Static95.method2044(local353, Static26.anIntArray46[local141], local37, local51);
							}
						}
					}
					Static95.method2044(local401, local58, local37, local51);
				}
				if (local44 == 3) {
					@Pc(513) Class4 local513 = Static64.aClass4ArrayArrayArray2[Static56.anInt1784][local37][local51];
					if (local513 != null) {
						for (@Pc(520) Class1_Sub1_Sub4_Sub6 local520 = (Class1_Sub1_Sub4_Sub6) local513.method176(); local520 != null; local520 = (Class1_Sub1_Sub4_Sub6) local513.method175()) {
							@Pc(529) Class1_Sub1_Sub2 local529 = Static90.method1963(local520.anInt3603);
							if (Static58.anInt1876 == 1) {
								Static58.method1422((short) 6, (long) local520.anInt3603, local37, local51, Static170.aClass70_1480, Static160.method3210(new Class70[] { Static111.aClass70_1012, Static28.aClass70_290, local529.aClass70_49 }));
							} else if (!Static167.aBoolean170) {
								@Pc(573) Class70[] local573 = local529.aClass70Array2;
								if (Static18.aBoolean18) {
									local573 = Static174.method3425(local573);
								}
								for (@Pc(581) int local581 = 4; local581 >= 0; local581--) {
									if (local573 != null && local573[local581] != null) {
										@Pc(624) byte local624 = 0;
										if (local581 == 0) {
											local624 = 16;
										}
										if (local581 == 1) {
											local624 = 4;
										}
										if (local581 == 2) {
											local624 = 38;
										}
										if (local581 == 3) {
											local624 = 58;
										}
										if (local581 == 4) {
											local624 = 26;
										}
										Static58.method1422(local624, (long) local520.anInt3603, local37, local51, local573[local581], Static160.method3210(new Class70[] { Static169.aClass70_1465, local529.aClass70_49 }));
									} else if (local581 == 2) {
										Static58.method1422((short) 38, (long) local520.anInt3603, local37, local51, Static137.aClass70_1212, Static160.method3210(new Class70[] { Static169.aClass70_1465, local529.aClass70_49 }));
									}
								}
								Static58.method1422((short) 1005, (long) local520.anInt3603, local37, local51, Static150.aClass70_1348, Static160.method3210(new Class70[] { Static169.aClass70_1465, local529.aClass70_49 }));
							} else if ((Static104.anInt2954 & 0x1) == 1) {
								Static58.method1422((short) 57, (long) local520.anInt3603, local37, local51, Static161.aClass70_1436, Static160.method3210(new Class70[] { Static5.aClass70_59, Static28.aClass70_290, local529.aClass70_49 }));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lclient!qa;")
	public static Class1_Sub1_Sub15 method2299(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub15 local8 = (Class1_Sub1_Sub15) Static183.aClass25_30.method1302((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static88.aClass76_Sub1_8.method3316(0, arg0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class1_Sub1_Sub15();
		@Pc(35) Class1_Sub9 local35 = new Class1_Sub9(local22);
		local35.anInt1592 = local35.aByteArray25.length - 12;
		@Pc(46) int local46 = local35.method1273();
		local8.anInt3620 = local35.method1280();
		@Pc(53) int local53 = 0;
		local8.anInt3624 = local35.method1280();
		local8.anInt3622 = local35.method1280();
		local8.anInt3625 = local35.method1280();
		local35.anInt1592 = 0;
		local8.aClass70_1228 = local35.method1252();
		local8.anIntArray349 = new int[local46];
		local8.aClass70Array20 = new Class70[local46];
		local8.anIntArray350 = new int[local46];
		while (local35.anInt1592 < local35.aByteArray25.length - 12) {
			@Pc(94) int local94 = local35.method1280();
			if (local94 == 3) {
				local8.aClass70Array20[local53] = local35.method1253();
			} else if (local94 >= 100 || local94 == 21 || local94 == 38 || local94 == 39) {
				local8.anIntArray349[local53] = local35.method1234();
			} else {
				local8.anIntArray349[local53] = local35.method1273();
			}
			local8.anIntArray350[local53++] = local94;
		}
		Static183.aClass25_30.method1299(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method2300() {
		aClass70_1028 = null;
		aClass70_1027 = null;
		aClass71_1 = null;
		aClass1_Sub1_Sub1_Sub4Array7 = null;
		aClass70_1026 = null;
		aClass70_1025 = null;
	}
}
