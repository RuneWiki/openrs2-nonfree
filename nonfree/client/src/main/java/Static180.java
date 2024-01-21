import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!wf", name = "ob", descriptor = "I")
	public static int anInt3941;

	@OriginalMember(owner = "client!wf", name = "bb", descriptor = "Lclient!b;")
	public static Class7 aClass7_29 = new Class7(64);

	@OriginalMember(owner = "client!wf", name = "cb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_2095 = Static122.method531("Texturen geladen)3");

	@OriginalMember(owner = "client!wf", name = "ib", descriptor = "I")
	public static int anInt3936 = -1;

	@OriginalMember(owner = "client!wf", name = "mb", descriptor = "[I")
	public static int[] anIntArray429 = new int[5];

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)V")
	public static void method2774() {
		anIntArray429 = null;
		aClass73_2095 = null;
		aClass7_29 = null;
	}

	@OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)V")
	public static void method2775() {
		try {
			if (Static43.anInt1011 == 0) {
				if (Static42.aClass2_2 != null) {
					Static42.aClass2_2.method12();
					Static42.aClass2_2 = null;
				}
				Static63.aClass29_4 = null;
				Static126.anInt2937 = 0;
				Static14.aBoolean25 = false;
				Static43.anInt1011 = 1;
			}
			if (Static43.anInt1011 == 1) {
				if (Static63.aClass29_4 == null) {
					Static63.aClass29_4 = Static32.aClass39_2.method1228(Static105.anInt2370, Static65.aString2);
				}
				if (Static63.aClass29_4.anInt1375 == 2) {
					throw new IOException();
				}
				if (Static63.aClass29_4.anInt1375 == 1) {
					Static42.aClass2_2 = new Class2((Socket) Static63.aClass29_4.anObject2, Static32.aClass39_2);
					Static63.aClass29_4 = null;
					Static43.anInt1011 = 2;
				}
			}
			if (Static43.anInt1011 == 2) {
				@Pc(71) long local71 = Static38.aLong148 = Static12.aClass73_171.method2425();
				Static139.aClass3_Sub12_Sub1_3.anInt1793 = 0;
				Static139.aClass3_Sub12_Sub1_3.method1383(14);
				@Pc(85) int local85 = (int) (local71 >> 16 & 0x1FL);
				Static139.aClass3_Sub12_Sub1_3.method1383(local85);
				Static42.aClass2_2.method15(2, Static139.aClass3_Sub12_Sub1_3.aByteArray16);
				Static43.anInt1011 = 3;
				Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
			}
			@Pc(120) int local120;
			if (Static43.anInt1011 == 3) {
				if (Static79.aClass5_1 != null) {
					Static79.aClass5_1.method2598();
				}
				if (Static137.aClass5_2 != null) {
					Static137.aClass5_2.method2598();
				}
				local120 = Static42.aClass2_2.method10();
				if (Static79.aClass5_1 != null) {
					Static79.aClass5_1.method2598();
				}
				if (Static137.aClass5_2 != null) {
					Static137.aClass5_2.method2598();
				}
				if (local120 != 0) {
					Static119.method2069(local120);
					return;
				}
				Static43.anInt1011 = 4;
				Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
			}
			if (Static43.anInt1011 == 4) {
				if (Static159.aClass3_Sub12_Sub1_4.anInt1793 < 8) {
					local120 = Static42.aClass2_2.method16();
					if (8 - Static159.aClass3_Sub12_Sub1_4.anInt1793 < local120) {
						local120 = 8 - Static159.aClass3_Sub12_Sub1_4.anInt1793;
					}
					if (local120 > 0) {
						Static42.aClass2_2.method13(Static159.aClass3_Sub12_Sub1_4.aByteArray16, Static159.aClass3_Sub12_Sub1_4.anInt1793, local120);
						Static159.aClass3_Sub12_Sub1_4.anInt1793 += local120;
					}
				}
				if (Static159.aClass3_Sub12_Sub1_4.anInt1793 == 8) {
					Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
					Static140.aLong149 = Static159.aClass3_Sub12_Sub1_4.method1339();
					Static43.anInt1011 = 5;
				}
			}
			if (Static43.anInt1011 == 5) {
				Static139.aClass3_Sub12_Sub1_3.anInt1793 = 0;
				@Pc(215) int[] local215 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static140.aLong149 >> 32), (int) Static140.aLong149 };
				Static139.aClass3_Sub12_Sub1_3.method1383(10);
				Static139.aClass3_Sub12_Sub1_3.method1392(local215[0]);
				Static139.aClass3_Sub12_Sub1_3.method1392(local215[1]);
				Static139.aClass3_Sub12_Sub1_3.method1392(local215[2]);
				Static139.aClass3_Sub12_Sub1_3.method1392(local215[3]);
				Static139.aClass3_Sub12_Sub1_3.method1382(Static12.aClass73_171.method2425());
				Static139.aClass3_Sub12_Sub1_3.method1350(Static12.aClass73_172);
				Static139.aClass3_Sub12_Sub1_3.method1385(Static44.aBigInteger3, Static127.aBigInteger2);
				Static10.aClass3_Sub12_Sub1_1.anInt1793 = 0;
				if (Static25.anInt717 == 40) {
					Static10.aClass3_Sub12_Sub1_1.method1383(18);
				} else {
					Static10.aClass3_Sub12_Sub1_1.method1383(16);
				}
				Static10.aClass3_Sub12_Sub1_1.method1383(Static139.aClass3_Sub12_Sub1_3.anInt1793 + 93);
				Static10.aClass3_Sub12_Sub1_1.method1392(476);
				Static10.aClass3_Sub12_Sub1_1.method1383(Static85.aBoolean127 ? 1 : 0);
				Static112.method2032(Static10.aClass3_Sub12_Sub1_1);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static150.aClass13_Sub1_19.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static153.aClass13_Sub1_18.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static84.aClass13_Sub1_9.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static57.aClass13_Sub1_6.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static129.aClass13_Sub1_16.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static125.aClass13_Sub1_15.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static11.aClass13_Sub1_4.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static86.aClass13_Sub1_10.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static3.aClass13_Sub1_1.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static108.aClass13_Sub1_12.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static58.aClass13_Sub1_7.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static16.aClass13_Sub1_5.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static117.aClass13_Sub1_13.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static179.aClass13_Sub1_20.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static121.aClass13_Sub1_14.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1392(Static93.aClass13_Sub1_11.anInt474);
				Static10.aClass3_Sub12_Sub1_1.method1345(Static139.aClass3_Sub12_Sub1_3.aByteArray16, Static139.aClass3_Sub12_Sub1_3.anInt1793);
				Static42.aClass2_2.method15(Static10.aClass3_Sub12_Sub1_1.anInt1793, Static10.aClass3_Sub12_Sub1_1.aByteArray16);
				Static139.aClass3_Sub12_Sub1_3.method1401(local215);
				for (@Pc(438) int local438 = 0; local438 < 4; local438++) {
					local215[local438] += 50;
				}
				Static159.aClass3_Sub12_Sub1_4.method1401(local215);
				Static43.anInt1011 = 6;
			}
			if (Static43.anInt1011 == 6 && Static42.aClass2_2.method16() > 0) {
				local120 = Static42.aClass2_2.method10();
				if (local120 == 21 && Static25.anInt717 == 20) {
					Static43.anInt1011 = 7;
				} else if (local120 == 2) {
					Static43.anInt1011 = 9;
				} else if (local120 == 15 && Static25.anInt717 == 40) {
					Static99.method1707();
					return;
				} else if (local120 == 23 && Static117.anInt2796 < 1) {
					Static117.anInt2796++;
					Static43.anInt1011 = 0;
				} else {
					Static119.method2069(local120);
					return;
				}
			}
			if (Static43.anInt1011 == 7 && Static42.aClass2_2.method16() > 0) {
				Static72.anInt1642 = Static42.aClass2_2.method10() * 60 + 180;
				Static43.anInt1011 = 8;
			}
			if (Static43.anInt1011 == 8) {
				Static126.anInt2937 = 0;
				Static154.method2486(Static50.aClass73_661, Static19.method372(new Class73[] { Static154.method2485(Static72.anInt1642 / 60), Static86.aClass73_1049 }), Static138.aClass73_1751);
				if (--Static72.anInt1642 <= 0) {
					Static43.anInt1011 = 0;
				}
			} else {
				if (Static43.anInt1011 == 9 && Static42.aClass2_2.method16() >= 9) {
					Static91.anInt2031 = Static42.aClass2_2.method10();
					Static34.anInt832 = Static42.aClass2_2.method10();
					Static109.aBoolean174 = Static42.aClass2_2.method10() == 1;
					Static61.anInt1455 = Static42.aClass2_2.method10();
					Static61.anInt1455 <<= 0x8;
					Static61.anInt1455 += Static42.aClass2_2.method10();
					Static12.anInt292 = Static42.aClass2_2.method10();
					Static42.aClass2_2.method13(Static159.aClass3_Sub12_Sub1_4.aByteArray16, 0, 1);
					Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
					Static132.anInt3019 = Static159.aClass3_Sub12_Sub1_4.method1399();
					Static42.aClass2_2.method13(Static159.aClass3_Sub12_Sub1_4.aByteArray16, 0, 2);
					Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
					Static17.anInt3783 = Static159.aClass3_Sub12_Sub1_4.method1359();
					Static43.anInt1011 = 10;
				}
				if (Static43.anInt1011 != 10) {
					Static126.anInt2937++;
					if (Static126.anInt2937 > 2000) {
						if (Static117.anInt2796 < 1) {
							if (Static103.anInt2328 == Static105.anInt2370) {
								Static105.anInt2370 = Static98.anInt2187;
							} else {
								Static105.anInt2370 = Static103.anInt2328;
							}
							Static117.anInt2796++;
							Static43.anInt1011 = 0;
						} else {
							Static119.method2069(-3);
						}
					}
				} else if (Static42.aClass2_2.method16() >= Static17.anInt3783) {
					Static159.aClass3_Sub12_Sub1_4.anInt1793 = 0;
					Static42.aClass2_2.method13(Static159.aClass3_Sub12_Sub1_4.aByteArray16, 0, Static17.anInt3783);
					Static81.method1410();
					Static26.anInt719 = -1;
					Static28.method567(false);
					Static132.anInt3019 = -1;
				}
			}
		} catch (@Pc(719) IOException local719) {
			if (Static117.anInt2796 < 1) {
				Static117.anInt2796++;
				if (Static105.anInt2370 == Static103.anInt2328) {
					Static105.anInt2370 = Static98.anInt2187;
				} else {
					Static105.anInt2370 = Static103.anInt2328;
				}
				Static43.anInt1011 = 0;
			} else {
				Static119.method2069(-2);
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "g", descriptor = "(I)V")
	public static void method2776() {
		for (@Pc(14) Class3_Sub1_Sub4_Sub3 local14 = (Class3_Sub1_Sub4_Sub3) Static121.aClass72_38.method2401(); local14 != null; local14 = (Class3_Sub1_Sub4_Sub3) Static121.aClass72_38.method2407()) {
			if (local14.anInt1276 != Static147.anInt3309 || local14.aBoolean86) {
				local14.method2783();
			} else if (Static44.anInt1024 >= local14.anInt1273) {
				local14.method965(Static165.anInt320);
				if (local14.aBoolean86) {
					local14.method2783();
				} else {
					Static119.aClass35_1.method1144(local14.anInt1276, local14.anInt1284, local14.anInt1280, local14.anInt1275, 60, local14, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "(III)I")
	public static int method2777(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(IIII)I")
	public static int method2780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return 7 - arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return arg2;
		}
	}

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(III)I")
	public static int method2781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(24) int local24 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local24;
		}
		return arg1;
	}
}
