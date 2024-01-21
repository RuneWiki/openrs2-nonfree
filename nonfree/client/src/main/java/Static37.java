import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!g", name = "z", descriptor = "I")
	public static int anInt895;

	@OriginalMember(owner = "client!g", name = "I", descriptor = "I")
	public static int anInt901;

	@OriginalMember(owner = "client!g", name = "J", descriptor = "[I")
	public static int[] anIntArray105;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "I")
	public static int anInt903;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "I")
	public static int anInt896 = 0;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "Lclient!ec;")
	private static Class22 aClass22_254 = Static60.method1113("You can(Wt add yourself to your own ignore list");

	@OriginalMember(owner = "client!g", name = "H", descriptor = "Lclient!ec;")
	public static Class22 aClass22_255 = Static60.method1113("<)4col>");

	@OriginalMember(owner = "client!g", name = "L", descriptor = "Lclient!ec;")
	public static Class22 aClass22_256 = Static60.method1113("::errortest");

	@OriginalMember(owner = "client!g", name = "R", descriptor = "Lclient!ec;")
	private static Class22 aClass22_260 = Static60.method1113("and choose the (Wcreate account(W");

	@OriginalMember(owner = "client!g", name = "O", descriptor = "Lclient!ec;")
	public static Class22 aClass22_257 = aClass22_260;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "Lclient!ec;")
	private static Class22 aClass22_259 = Static60.method1113("Loaded config");

	@OriginalMember(owner = "client!g", name = "P", descriptor = "Lclient!ec;")
	public static Class22 aClass22_258 = aClass22_259;

	@OriginalMember(owner = "client!g", name = "U", descriptor = "Lclient!ec;")
	public static Class22 aClass22_261 = aClass22_254;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method583() {
		try {
			if (Static44.anInt1212 == 0) {
				if (Static120.aClass6_4 != null) {
					Static120.aClass6_4.method136();
					Static120.aClass6_4 = null;
				}
				Static34.anInt857 = 0;
				Static9.aClass12_2 = null;
				Static68.aBoolean48 = false;
				Static44.anInt1212 = 1;
			}
			if (Static44.anInt1212 == 1) {
				if (Static9.aClass12_2 == null) {
					Static9.aClass12_2 = Static130.aClass17_4.method389(Static128.aString4, Static34.anInt859);
				}
				if (Static9.aClass12_2.anInt373 == 2) {
					throw new IOException();
				}
				if (Static9.aClass12_2.anInt373 == 1) {
					Static120.aClass6_4 = new Class6((Socket) Static9.aClass12_2.anObject1, Static130.aClass17_4);
					Static9.aClass12_2 = null;
					Static44.anInt1212 = 2;
				}
			}
			if (Static44.anInt1212 == 2) {
				@Pc(82) long local82 = Static80.aLong68 = Static61.aClass22_476.method468();
				@Pc(89) int local89 = (int) (local82 >> 16 & 0x1FL);
				Static38.aClass4_Sub11_Sub1_1.anInt1099 = 0;
				Static38.aClass4_Sub11_Sub1_1.method701(14);
				Static38.aClass4_Sub11_Sub1_1.method701(local89);
				Static120.aClass6_4.method133(Static38.aClass4_Sub11_Sub1_1.aByteArray9, 2);
				Static44.anInt1212 = 3;
				Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
			}
			@Pc(131) int local131;
			if (Static44.anInt1212 == 3) {
				if (Static31.aClass15_2 != null) {
					Static31.aClass15_2.method1193();
				}
				if (Static25.aClass15_1 != null) {
					Static25.aClass15_1.method1193();
				}
				local131 = Static120.aClass6_4.method130();
				if (Static31.aClass15_2 != null) {
					Static31.aClass15_2.method1193();
				}
				if (Static25.aClass15_1 != null) {
					Static25.aClass15_1.method1193();
				}
				if (local131 != 0) {
					Static55.method729(local131);
					return;
				}
				Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
				Static44.anInt1212 = 4;
			}
			if (Static44.anInt1212 == 4) {
				if (Static133.aClass4_Sub11_Sub1_3.anInt1099 < 8) {
					local131 = Static120.aClass6_4.method135();
					if (local131 > 8 - Static133.aClass4_Sub11_Sub1_3.anInt1099) {
						local131 = 8 - Static133.aClass4_Sub11_Sub1_3.anInt1099;
					}
					if (local131 > 0) {
						Static120.aClass6_4.method134(Static133.aClass4_Sub11_Sub1_3.anInt1099, Static133.aClass4_Sub11_Sub1_3.aByteArray9, local131);
						Static133.aClass4_Sub11_Sub1_3.anInt1099 += local131;
					}
				}
				if (Static133.aClass4_Sub11_Sub1_3.anInt1099 == 8) {
					Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
					Static85.aLong71 = Static133.aClass4_Sub11_Sub1_3.method714();
					Static44.anInt1212 = 5;
				}
			}
			if (Static44.anInt1212 == 5) {
				Static38.aClass4_Sub11_Sub1_1.anInt1099 = 0;
				@Pc(222) int[] local222 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static85.aLong71 >> 32), (int) Static85.aLong71 };
				Static38.aClass4_Sub11_Sub1_1.method701(10);
				Static38.aClass4_Sub11_Sub1_1.method717(local222[0]);
				Static38.aClass4_Sub11_Sub1_1.method717(local222[1]);
				Static38.aClass4_Sub11_Sub1_1.method717(local222[2]);
				Static38.aClass4_Sub11_Sub1_1.method717(local222[3]);
				Static38.aClass4_Sub11_Sub1_1.method728(Static61.aClass22_476.method468());
				Static38.aClass4_Sub11_Sub1_1.method708(Static61.aClass22_470);
				Static38.aClass4_Sub11_Sub1_1.method739(Static128.aBigInteger2, Static53.aBigInteger1);
				Static116.aClass4_Sub11_Sub1_2.anInt1099 = 0;
				if (Static112.anInt2775 == 40) {
					Static116.aClass4_Sub11_Sub1_2.method701(18);
				} else {
					Static116.aClass4_Sub11_Sub1_2.method701(16);
				}
				Static116.aClass4_Sub11_Sub1_2.method701(Static38.aClass4_Sub11_Sub1_1.anInt1099 + 93);
				Static116.aClass4_Sub11_Sub1_2.method717(468);
				Static116.aClass4_Sub11_Sub1_2.method701(Static130.aBoolean279 ? 1 : 0);
				Static123.method2001(Static116.aClass4_Sub11_Sub1_2);
				Static116.aClass4_Sub11_Sub1_2.method717(Static76.aClass20_Sub1_48.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static33.aClass20_Sub1_22.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static53.aClass20_Sub1_39.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static55.aClass20_Sub1_29.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static1.aClass20_Sub1_1.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static112.aClass20_Sub1_70.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static103.aClass20_Sub1_66.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static124.aClass20_Sub1_77.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static26.aClass20_Sub1_25.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static68.aClass20_Sub1_14.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static59.aClass20_Sub1_43.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static80.aClass20_Sub1_55.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static80.aClass20_Sub1_54.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static132.aClass20_Sub1_82.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static85.aClass20_Sub1_57.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method717(Static123.aClass20_Sub1_81.anInt925);
				Static116.aClass4_Sub11_Sub1_2.method730(Static38.aClass4_Sub11_Sub1_1.anInt1099, Static38.aClass4_Sub11_Sub1_1.aByteArray9);
				Static120.aClass6_4.method133(Static116.aClass4_Sub11_Sub1_2.aByteArray9, Static116.aClass4_Sub11_Sub1_2.anInt1099);
				Static38.aClass4_Sub11_Sub1_1.method755(local222);
				for (@Pc(433) int local433 = 0; local433 < 4; local433++) {
					local222[local433] += 50;
				}
				Static133.aClass4_Sub11_Sub1_3.method755(local222);
				Static44.anInt1212 = 6;
			}
			if (Static44.anInt1212 == 6 && Static120.aClass6_4.method135() > 0) {
				local131 = Static120.aClass6_4.method130();
				if (local131 == 21 && Static112.anInt2775 == 20) {
					Static44.anInt1212 = 7;
				} else if (local131 == 2) {
					Static44.anInt1212 = 9;
				} else if (local131 == 15 && Static112.anInt2775 == 40) {
					Static45.method881();
					return;
				} else if (local131 == 23 && Static110.anInt2733 < 1) {
					Static44.anInt1212 = 0;
					Static110.anInt2733++;
				} else {
					Static55.method729(local131);
					return;
				}
			}
			if (Static44.anInt1212 == 7 && Static120.aClass6_4.method135() > 0) {
				Static97.anInt2562 = Static120.aClass6_4.method130() * 60 + 180;
				Static44.anInt1212 = 8;
			}
			if (Static44.anInt1212 == 8) {
				Static34.anInt857 = 0;
				Static95.method1192(Static67.aClass22_505, Static44.method856(new Class22[] { Static134.method2042(Static97.anInt2562 / 60), Static23.aClass22_155 }), Static13.aClass22_92);
				if (--Static97.anInt2562 <= 0) {
					Static44.anInt1212 = 0;
				}
			} else {
				if (Static44.anInt1212 == 9 && Static120.aClass6_4.method135() >= 8) {
					Static122.anInt1377 = Static120.aClass6_4.method130();
					Static90.aBoolean213 = Static120.aClass6_4.method130() == 1;
					Static32.anInt824 = Static120.aClass6_4.method130();
					Static32.anInt824 <<= 0x8;
					Static32.anInt824 += Static120.aClass6_4.method130();
					Static133.anInt3136 = Static120.aClass6_4.method130();
					Static120.aClass6_4.method134(0, Static133.aClass4_Sub11_Sub1_3.aByteArray9, 1);
					Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
					Static72.anInt1915 = Static133.aClass4_Sub11_Sub1_3.method746();
					Static120.aClass6_4.method134(0, Static133.aClass4_Sub11_Sub1_3.aByteArray9, 2);
					Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
					Static96.anInt2463 = Static133.aClass4_Sub11_Sub1_3.method718();
					Static44.anInt1212 = 10;
				}
				if (Static44.anInt1212 != 10) {
					Static34.anInt857++;
					if (Static34.anInt857 > 2000) {
						if (Static110.anInt2733 < 1) {
							if (Static34.anInt859 == Static22.anInt2810) {
								Static34.anInt859 = Static11.anInt2984;
							} else {
								Static34.anInt859 = Static22.anInt2810;
							}
							Static44.anInt1212 = 0;
							Static110.anInt2733++;
						} else {
							Static55.method729(-3);
						}
					}
				} else if (Static120.aClass6_4.method135() >= Static96.anInt2463) {
					Static133.aClass4_Sub11_Sub1_3.anInt1099 = 0;
					Static120.aClass6_4.method134(0, Static133.aClass4_Sub11_Sub1_3.aByteArray9, Static96.anInt2463);
					Static106.method1751();
					Static51.anInt1473 = -1;
					Static4.method39(false);
					Static72.anInt1915 = -1;
				}
			}
		} catch (@Pc(713) IOException local713) {
			if (Static110.anInt2733 < 1) {
				Static110.anInt2733++;
				if (Static22.anInt2810 == Static34.anInt859) {
					Static34.anInt859 = Static11.anInt2984;
				} else {
					Static34.anInt859 = Static22.anInt2810;
				}
				Static44.anInt1212 = 0;
			} else {
				Static55.method729(-2);
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
	public static void method584() {
		for (@Pc(3) int local3 = 0; local3 < Static50.anInt1405; local3++) {
			@Pc(9) int local9 = Static51.anIntArray146[local3];
			@Pc(13) Class4_Sub1_Sub3_Sub2_Sub1 local13 = Static44.aClass4_Sub1_Sub3_Sub2_Sub1Array1[local9];
			@Pc(19) int local19 = Static133.aClass4_Sub11_Sub1_3.method719();
			if ((local19 & 0x80) != 0) {
				local19 += Static133.aClass4_Sub11_Sub1_3.method719() << 8;
			}
			method587(local13, local9, local19);
		}
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
	public static void method585() {
		aClass22_256 = null;
		aClass22_259 = null;
		aClass22_254 = null;
		anIntArray105 = null;
		aClass22_260 = null;
		aClass22_261 = null;
		aClass22_258 = null;
		aClass22_257 = null;
		aClass22_255 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(BLclient!ka;II)V")
	private static void method587(@OriginalArg(1) Class4_Sub1_Sub3_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17;
		if ((arg2 & 0x400) != 0) {
			arg0.anInt2489 = Static133.aClass4_Sub11_Sub1_3.method706();
			local17 = Static133.aClass4_Sub11_Sub1_3.method712();
			arg0.anInt2466 = Static117.anInt2877 + (local17 & 0xFFFF);
			arg0.anInt2485 = local17 >> 16;
			if (arg0.anInt2489 == 65535) {
				arg0.anInt2489 = -1;
			}
			arg0.anInt2464 = 0;
			arg0.anInt2507 = 0;
			if (Static117.anInt2877 < arg0.anInt2466) {
				arg0.anInt2507 = -1;
			}
		}
		@Pc(66) int local66;
		if ((arg2 & 0x20) != 0) {
			local17 = Static133.aClass4_Sub11_Sub1_3.method716();
			local66 = Static133.aClass4_Sub11_Sub1_3.method719();
			arg0.method1615(Static117.anInt2877, local66, local17);
			arg0.anInt2456 = Static117.anInt2877 + 300;
			arg0.anInt2508 = Static133.aClass4_Sub11_Sub1_3.method722();
			arg0.anInt2493 = Static133.aClass4_Sub11_Sub1_3.method716();
		}
		if ((arg2 & 0x4) != 0) {
			local17 = Static133.aClass4_Sub11_Sub1_3.method718();
			local66 = Static133.aClass4_Sub11_Sub1_3.method707();
			if (local17 == 65535) {
				local17 = -1;
			}
			Static112.method1796(local66, arg0, local17);
		}
		if ((arg2 & 0x10) != 0) {
			local17 = Static133.aClass4_Sub11_Sub1_3.method706();
			local66 = Static133.aClass4_Sub11_Sub1_3.method719();
			@Pc(128) int local128 = Static133.aClass4_Sub11_Sub1_3.method722();
			@Pc(131) int local131 = Static133.aClass4_Sub11_Sub1_3.anInt1099;
			if (arg0.aClass22_444 != null && arg0.aClass21_2 != null) {
				@Pc(139) boolean local139 = false;
				@Pc(144) long local144 = arg0.aClass22_444.method468();
				if (local66 <= 1) {
					for (@Pc(149) int local149 = 0; local149 < Static88.anInt2348; local149++) {
						if (local144 == Static85.aLongArray5[local149]) {
							local139 = true;
							break;
						}
					}
				}
				if (!local139 && Static79.anInt2177 == 0) {
					Static108.aClass4_Sub11_5.anInt1099 = 0;
					Static133.aClass4_Sub11_Sub1_3.method744(local128, Static108.aClass4_Sub11_5.aByteArray9);
					Static108.aClass4_Sub11_5.anInt1099 = 0;
					@Pc(197) Class22 local197 = Static81.method1393(Static107.method1754(Static108.aClass4_Sub11_5).method467());
					arg0.aClass22_715 = local197.method484();
					arg0.anInt2468 = 150;
					arg0.anInt2506 = local17 >> 8;
					arg0.anInt2502 = local17 & 0xFF;
					if (local66 == 2 || local66 == 3) {
						Static65.method1153(local197, 1, Static44.method856(new Class22[] { Static122.aClass22_342, arg0.aClass22_444 }));
					} else if (local66 == 1) {
						Static65.method1153(local197, 1, Static44.method856(new Class22[] { Static120.aClass22_909, arg0.aClass22_444 }));
					} else {
						Static65.method1153(local197, 2, arg0.aClass22_444);
					}
				}
			}
			Static133.aClass4_Sub11_Sub1_3.anInt1099 = local128 + local131;
		}
		if ((arg2 & 0x200) != 0) {
			arg0.anInt2472 = Static133.aClass4_Sub11_Sub1_3.method707();
			arg0.anInt2479 = Static133.aClass4_Sub11_Sub1_3.method707();
			arg0.anInt2455 = Static133.aClass4_Sub11_Sub1_3.method719();
			arg0.anInt2494 = Static133.aClass4_Sub11_Sub1_3.method707();
			arg0.anInt2488 = Static133.aClass4_Sub11_Sub1_3.method706() + Static117.anInt2877;
			arg0.anInt2482 = Static133.aClass4_Sub11_Sub1_3.method718() + Static117.anInt2877;
			arg0.anInt2504 = Static133.aClass4_Sub11_Sub1_3.method719();
			arg0.anInt2460 = 1;
			arg0.anInt2501 = 0;
		}
		if ((arg2 & 0x100) != 0) {
			local17 = Static133.aClass4_Sub11_Sub1_3.method722();
			local66 = Static133.aClass4_Sub11_Sub1_3.method707();
			arg0.method1615(Static117.anInt2877, local66, local17);
			arg0.anInt2456 = Static117.anInt2877 + 300;
			arg0.anInt2508 = Static133.aClass4_Sub11_Sub1_3.method719();
			arg0.anInt2493 = Static133.aClass4_Sub11_Sub1_3.method716();
		}
		if ((arg2 & 0x2) != 0) {
			arg0.aClass22_715 = Static133.aClass4_Sub11_Sub1_3.method742();
			if (arg0.aClass22_715.method469(0) == 126) {
				arg0.aClass22_715 = arg0.aClass22_715.method477(1);
				Static65.method1153(arg0.aClass22_715, 2, arg0.aClass22_444);
			} else if (arg0 == Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1) {
				Static65.method1153(arg0.aClass22_715, 2, arg0.aClass22_444);
			}
			arg0.anInt2468 = 150;
			arg0.anInt2502 = 0;
			arg0.anInt2506 = 0;
		}
		if ((arg2 & 0x8) != 0) {
			arg0.anInt2509 = Static133.aClass4_Sub11_Sub1_3.method706();
			if (arg0.anInt2509 == 65535) {
				arg0.anInt2509 = -1;
			}
		}
		if ((arg2 & 0x40) != 0) {
			local17 = Static133.aClass4_Sub11_Sub1_3.method722();
			@Pc(456) byte[] local456 = new byte[local17];
			@Pc(461) Class4_Sub11 local461 = new Class4_Sub11(local456);
			Static133.aClass4_Sub11_Sub1_3.method726(local456, local17);
			Static120.aClass4_Sub11Array1[arg1] = local461;
			arg0.method1092(local461);
		}
		if ((arg2 & 0x1) != 0) {
			arg0.anInt2495 = Static133.aClass4_Sub11_Sub1_3.method706();
			arg0.anInt2461 = Static133.aClass4_Sub11_Sub1_3.method711();
		}
	}
}
