import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "Lclient!ta;")
	public static Class2_Sub3_Sub2_Sub3 aClass2_Sub3_Sub2_Sub3_5;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
	public static int anInt4010;

	@OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
	public static int anInt4014;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "[Lclient!bf;")
	public static Class2_Sub3_Sub2_Sub1[] aClass2_Sub3_Sub2_Sub1Array10;

	@OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
	public static int anInt4018 = 0;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "Lclient!ai;")
	public static Class6 aClass6_1199 = Static38.method685("blaugr-Un:");

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)Z")
	public static boolean method2712(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[Lclient!ai;I)Lclient!ai;")
	public static Class6 method2713(@OriginalArg(1) int arg0, @OriginalArg(2) Class6[] arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg1[arg2 + local9] == null) {
				arg1[arg2 + local9] = Static161.aClass6_1128;
			}
			local3 += arg1[local9 + arg2].anInt165;
		}
		@Pc(39) byte[] local39 = new byte[local3];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < arg0; local43++) {
			@Pc(51) Class6 local51 = arg1[local43 + arg2];
			Static184.method163(local51.aByteArray2, 0, local39, local41, local51.anInt165);
			local41 += local51.anInt165;
		}
		@Pc(84) Class6 local84 = new Class6();
		local84.anInt165 = local3;
		local84.aByteArray2 = local39;
		return local84;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZI)Lclient!q;")
	public static Class2_Sub3_Sub13 method2714(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub3_Sub13 local10 = (Class2_Sub3_Sub13) Static87.aClass17_12.method505((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static92.aClass10_74.method1605(arg0, 4);
		local10 = new Class2_Sub3_Sub13();
		if (local25 != null) {
			local10.method2042(new Class2_Sub13(local25), arg0);
		}
		Static87.aClass17_12.method508((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	public static void method2716() {
		try {
			if (Static153.anInt3529 == 0) {
				if (Static166.aClass43_3 != null) {
					Static166.aClass43_3.method1236();
					Static166.aClass43_3 = null;
				}
				Static177.aClass11_8 = null;
				Static141.anInt3311 = 0;
				Static153.anInt3529 = 1;
				Static155.aBoolean160 = false;
			}
			if (Static153.anInt3529 == 1) {
				if (Static177.aClass11_8 == null) {
					Static177.aClass11_8 = Static107.aClass36_4.method1114(Static165.anInt3869, Static10.aString1);
				}
				if (Static177.aClass11_8.anInt467 == 2) {
					throw new IOException();
				}
				if (Static177.aClass11_8.anInt467 == 1) {
					Static166.aClass43_3 = new Class43((Socket) Static177.aClass11_8.anObject2, Static107.aClass36_4);
					Static153.anInt3529 = 2;
					Static177.aClass11_8 = null;
				}
			}
			if (Static153.anInt3529 == 2) {
				@Pc(68) long local68 = Static65.aLong93 = Static9.aClass6_72.method129();
				Static66.aClass2_Sub13_Sub1_2.anInt2154 = 0;
				Static66.aClass2_Sub13_Sub1_2.method1416(14);
				@Pc(82) int local82 = (int) (local68 >> 16 & 0x1FL);
				Static66.aClass2_Sub13_Sub1_2.method1416(local82);
				Static166.aClass43_3.method1241(2, Static66.aClass2_Sub13_Sub1_2.aByteArray14);
				Static153.anInt3529 = 3;
				Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
			}
			@Pc(115) int local115;
			if (Static153.anInt3529 == 3) {
				if (Static138.aClass41_3 != null) {
					Static138.aClass41_3.method1509();
				}
				if (Static160.aClass41_2 != null) {
					Static160.aClass41_2.method1509();
				}
				local115 = Static166.aClass43_3.method1238();
				if (Static138.aClass41_3 != null) {
					Static138.aClass41_3.method1509();
				}
				if (Static160.aClass41_2 != null) {
					Static160.aClass41_2.method1509();
				}
				if (local115 != 0) {
					Static104.method1725(local115);
					return;
				}
				Static153.anInt3529 = 4;
				Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
			}
			if (Static153.anInt3529 == 4) {
				if (Static64.aClass2_Sub13_Sub1_1.anInt2154 < 8) {
					local115 = Static166.aClass43_3.method1235();
					if (8 - Static64.aClass2_Sub13_Sub1_1.anInt2154 < local115) {
						local115 = 8 - Static64.aClass2_Sub13_Sub1_1.anInt2154;
					}
					if (local115 > 0) {
						Static166.aClass43_3.method1240(local115, Static64.aClass2_Sub13_Sub1_1.aByteArray14, Static64.aClass2_Sub13_Sub1_1.anInt2154);
						Static64.aClass2_Sub13_Sub1_1.anInt2154 += local115;
					}
				}
				if (Static64.aClass2_Sub13_Sub1_1.anInt2154 == 8) {
					Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
					Static64.aLong90 = Static64.aClass2_Sub13_Sub1_1.method1446();
					Static153.anInt3529 = 5;
				}
			}
			if (Static153.anInt3529 == 5) {
				Static66.aClass2_Sub13_Sub1_2.anInt2154 = 0;
				@Pc(207) int[] local207 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static64.aLong90 >> 32), (int) Static64.aLong90 };
				Static66.aClass2_Sub13_Sub1_2.method1416(10);
				Static66.aClass2_Sub13_Sub1_2.method1421(local207[0]);
				Static66.aClass2_Sub13_Sub1_2.method1421(local207[1]);
				Static66.aClass2_Sub13_Sub1_2.method1421(local207[2]);
				Static66.aClass2_Sub13_Sub1_2.method1421(local207[3]);
				Static66.aClass2_Sub13_Sub1_2.method1418(Static9.aClass6_72.method129());
				Static66.aClass2_Sub13_Sub1_2.method1404(Static9.aClass6_79);
				Static66.aClass2_Sub13_Sub1_2.method1438(Static156.aBigInteger2, Static111.aBigInteger1);
				Static111.aClass2_Sub13_Sub1_3.anInt2154 = 0;
				if (Static156.anInt3638 == 40) {
					Static111.aClass2_Sub13_Sub1_3.method1416(18);
				} else {
					Static111.aClass2_Sub13_Sub1_3.method1416(16);
				}
				Static111.aClass2_Sub13_Sub1_3.method1416(Static66.aClass2_Sub13_Sub1_2.anInt2154 + 93);
				Static111.aClass2_Sub13_Sub1_3.method1421(477);
				Static111.aClass2_Sub13_Sub1_3.method1416(Static113.aBoolean112 ? 1 : 0);
				Static82.method1318(Static111.aClass2_Sub13_Sub1_3);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static170.aClass10_Sub1_18.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static152.aClass10_Sub1_16.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static47.aClass10_Sub1_6.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static89.aClass10_Sub1_10.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static136.aClass10_Sub1_14.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static165.aClass10_Sub1_17.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static5.aClass10_Sub1_2.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static58.aClass10_Sub1_8.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static132.aClass10_Sub1_13.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static143.aClass10_Sub1_15.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static6.aClass10_Sub1_7.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static176.aClass10_Sub1_20.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static124.aClass10_Sub1_11.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static127.aClass10_Sub1_12.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static4.aClass10_Sub1_1.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1421(Static34.aClass10_Sub1_5.anInt2416);
				Static111.aClass2_Sub13_Sub1_3.method1420(Static66.aClass2_Sub13_Sub1_2.anInt2154, Static66.aClass2_Sub13_Sub1_2.aByteArray14);
				Static166.aClass43_3.method1241(Static111.aClass2_Sub13_Sub1_3.anInt2154, Static111.aClass2_Sub13_Sub1_3.aByteArray14);
				Static66.aClass2_Sub13_Sub1_2.method1456(local207);
				for (@Pc(423) int local423 = 0; local423 < 4; local423++) {
					local207[local423] += 50;
				}
				Static64.aClass2_Sub13_Sub1_1.method1456(local207);
				Static153.anInt3529 = 6;
			}
			if (Static153.anInt3529 == 6 && Static166.aClass43_3.method1235() > 0) {
				local115 = Static166.aClass43_3.method1238();
				if (local115 == 21 && Static156.anInt3638 == 20) {
					Static153.anInt3529 = 7;
				} else if (local115 == 2) {
					Static153.anInt3529 = 9;
				} else if (local115 == 15 && Static156.anInt3638 == 40) {
					Static61.method984();
					return;
				} else if (local115 == 23 && Static41.anInt1196 < 1) {
					Static41.anInt1196++;
					Static153.anInt3529 = 0;
				} else {
					Static104.method1725(local115);
					return;
				}
			}
			if (Static153.anInt3529 == 7 && Static166.aClass43_3.method1235() > 0) {
				Static111.anInt2636 = (Static166.aClass43_3.method1238() + 3) * 60;
				Static153.anInt3529 = 8;
			}
			if (Static153.anInt3529 == 8) {
				Static141.anInt3311 = 0;
				Static136.method2122(Static58.method956(new Class6[] { Static106.method2806(Static111.anInt2636 / 60), Static146.aClass6_1194 }), Static49.aClass6_373, Static134.aClass6_904);
				if (--Static111.anInt2636 <= 0) {
					Static153.anInt3529 = 0;
				}
			} else {
				if (Static153.anInt3529 == 9 && Static166.aClass43_3.method1235() >= 9) {
					Static98.anInt2447 = Static166.aClass43_3.method1238();
					Static97.anInt2400 = Static166.aClass43_3.method1238();
					Static2.aBoolean3 = Static166.aClass43_3.method1238() == 1;
					Static68.anInt1727 = Static166.aClass43_3.method1238();
					Static68.anInt1727 <<= 0x8;
					Static68.anInt1727 += Static166.aClass43_3.method1238();
					Static97.anInt2398 = Static166.aClass43_3.method1238();
					Static166.aClass43_3.method1240(1, Static64.aClass2_Sub13_Sub1_1.aByteArray14, 0);
					Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
					Static86.anInt2213 = Static64.aClass2_Sub13_Sub1_1.method1451();
					Static166.aClass43_3.method1240(2, Static64.aClass2_Sub13_Sub1_1.aByteArray14, 0);
					Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
					Static139.anInt3252 = Static64.aClass2_Sub13_Sub1_1.method1397();
					Static153.anInt3529 = 10;
				}
				if (Static153.anInt3529 != 10) {
					Static141.anInt3311++;
					if (Static141.anInt3311 > 2000) {
						if (Static41.anInt1196 < 1) {
							Static41.anInt1196++;
							if (Static120.anInt2810 == Static165.anInt3869) {
								Static165.anInt3869 = Static132.anInt3073;
							} else {
								Static165.anInt3869 = Static120.anInt2810;
							}
							Static153.anInt3529 = 0;
						} else {
							Static104.method1725(-3);
						}
					}
				} else if (Static166.aClass43_3.method1235() >= Static139.anInt3252) {
					Static64.aClass2_Sub13_Sub1_1.anInt2154 = 0;
					Static166.aClass43_3.method1240(Static139.anInt3252, Static64.aClass2_Sub13_Sub1_1.aByteArray14, 0);
					Static163.method2611();
					Static143.anInt3376 = -1;
					Static155.method2677(false);
					Static86.anInt2213 = -1;
				}
			}
		} catch (@Pc(709) IOException local709) {
			if (Static41.anInt1196 < 1) {
				Static41.anInt1196++;
				Static153.anInt3529 = 0;
				if (Static120.anInt2810 == Static165.anInt3869) {
					Static165.anInt3869 = Static132.anInt3073;
				} else {
					Static165.anInt3869 = Static120.anInt2810;
				}
			} else {
				Static104.method1725(-2);
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)Lclient!lg;")
	public static Class2_Sub3_Sub11 method2717(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub3_Sub11 local8 = (Class2_Sub3_Sub11) Static164.aClass17_26.method505((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(27) byte[] local27 = Static179.aClass10_143.method1605(arg0, 5);
		local8 = new Class2_Sub3_Sub11();
		if (local27 != null) {
			local8.method1545(new Class2_Sub13(local27));
		}
		Static164.aClass17_26.method508((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V")
	public static void method2719() {
		aClass6_1199 = null;
		aClass2_Sub3_Sub2_Sub3_5 = null;
		aClass2_Sub3_Sub2_Sub1Array10 = null;
	}
}
