import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "Lclient!la;")
	public static Class17 aClass17_42;

	@OriginalMember(owner = "client!w", name = "c", descriptor = "Lclient!v;")
	public static Class76 aClass76_1294 = Static134.method2017("Clientscript error )2 check log for details");

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	public static int anInt2752 = 0;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "I")
	public static int anInt2753 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
	public static void method1928() {
		aClass76_1294 = null;
		aClass17_42 = null;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
	public static void method1929() {
		Static95.anIntArray312 = new int[104];
		Static132.anInt2824 = 99;
		Static29.anIntArrayArrayArray1 = new int[4][105][105];
		Static123.anIntArray392 = new int[104];
		Static31.aByteArrayArrayArray2 = new byte[4][104][104];
		Static31.aByteArrayArrayArray3 = new byte[4][104][104];
		Static129.aByteArrayArrayArray7 = new byte[4][104][104];
		Static84.aByteArrayArrayArray5 = new byte[4][105][105];
		Static124.anIntArrayArray27 = new int[105][105];
		Static49.anIntArray158 = new int[104];
		Static67.anIntArray232 = new int[104];
		Static122.anIntArray390 = new int[104];
		Static24.aByteArrayArrayArray1 = new byte[4][104][104];
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	public static void method1930() {
		try {
			if (Static79.aClass22_2 == null) {
				Static79.aClass22_2 = new Class22(Static121.aClass14_3, Static59.method1017(new Class76[] { Static115.aClass76_1182, Static133.aClass76_1321, Static95.aClass76_995 }).method1887());
			} else {
				@Pc(39) byte[] local39 = Static79.aClass22_2.method377();
				if (local39 != null) {
					@Pc(46) Class4_Sub10 local46 = new Class4_Sub10(local39);
					Static15.anInt261 = local46.method604();
					Static81.aClass61Array1 = new Class61[Static15.anInt261];
					for (@Pc(55) int local55 = 0; local55 < Static15.anInt261; local55++) {
						@Pc(65) Class61 local65 = Static81.aClass61Array1[local55] = new Class61();
						@Pc(69) int local69 = local46.method604();
						local65.aBoolean136 = (local69 & 0x8000) != 0;
						local65.anInt2309 = local69 & 0x7FFF;
						local65.aClass76_1069 = local46.method581();
						local65.anInt2314 = local46.method574();
						local65.anInt2312 = local55;
						local65.anInt2313 = Static76.method1391(local65.aClass76_1069);
					}
					Static97.method1559(Static24.anIntArray76, Static81.aClass61Array1, Static81.aClass61Array1.length - 1, Static60.anIntArray203, 0);
					Static103.aBoolean137 = true;
					Static79.aClass22_2 = null;
				}
			}
		} catch (@Pc(122) Exception local122) {
			local122.printStackTrace();
			Static79.aClass22_2 = null;
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method1931(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class4_Sub15 local7 = null;
		for (@Pc(12) Class4_Sub15 local12 = (Class4_Sub15) Static9.aClass78_2.method1916(); local12 != null; local12 = (Class4_Sub15) Static9.aClass78_2.method1920()) {
			if (local12.anInt2043 == arg1 && arg7 == local12.anInt2044 && local12.anInt2048 == arg3 && local12.anInt2049 == arg2) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class4_Sub15();
			local7.anInt2043 = arg1;
			local7.anInt2048 = arg3;
			local7.anInt2044 = arg7;
			local7.anInt2049 = arg2;
			Static54.method1756(local7);
			Static9.aClass78_2.method1914(local7);
		}
		local7.anInt2056 = arg0;
		local7.anInt2054 = arg5;
		local7.anInt2042 = arg6;
		local7.anInt2039 = arg4;
		local7.anInt2050 = arg8;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)Lclient!ia;")
	public static Class4_Sub4_Sub6 method1932(@OriginalArg(1) int arg0) {
		@Pc(10) Class4_Sub4_Sub6 local10 = (Class4_Sub4_Sub6) Static32.aClass72_14.method1781((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static48.aClass17_17.method290(5, arg0);
		local10 = new Class4_Sub4_Sub6();
		if (local25 != null) {
			local10.method835(new Class4_Sub10(local25));
		}
		Static32.aClass72_14.method1783(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(B)V")
	public static void method1933() {
		try {
			if (Static29.anInt594 == 0) {
				if (Static48.aClass75_4 != null) {
					Static48.aClass75_4.method1842();
					Static48.aClass75_4 = null;
				}
				Static24.aClass24_3 = null;
				Static24.aBoolean43 = false;
				Static29.anInt594 = 1;
				Static20.anInt424 = 0;
			}
			if (Static29.anInt594 == 1) {
				if (Static24.aClass24_3 == null) {
					Static24.aClass24_3 = Static121.aClass14_3.method193(Static104.aString4, Static6.anInt138);
				}
				if (Static24.aClass24_3.anInt814 == 2) {
					throw new IOException();
				}
				if (Static24.aClass24_3.anInt814 == 1) {
					Static48.aClass75_4 = new Class75((Socket) Static24.aClass24_3.anObject10, Static121.aClass14_3);
					Static29.anInt594 = 2;
					Static24.aClass24_3 = null;
				}
			}
			if (Static29.anInt594 == 2) {
				@Pc(70) long local70 = Static6.aLong11 = Static111.aClass76_1146.method1872();
				@Pc(77) int local77 = (int) (local70 >> 16 & 0x1FL);
				Static69.aClass4_Sub10_Sub1_2.anInt931 = 0;
				Static69.aClass4_Sub10_Sub1_2.method600(14);
				Static69.aClass4_Sub10_Sub1_2.method600(local77);
				Static48.aClass75_4.method1849(2, Static69.aClass4_Sub10_Sub1_2.aByteArray17);
				Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
				Static29.anInt594 = 3;
			}
			@Pc(119) int local119;
			if (Static29.anInt594 == 3) {
				if (Static12.aClass3_1 != null) {
					Static12.aClass3_1.method1515();
				}
				if (Static74.aClass3_2 != null) {
					Static74.aClass3_2.method1515();
				}
				local119 = Static48.aClass75_4.method1848();
				if (Static12.aClass3_1 != null) {
					Static12.aClass3_1.method1515();
				}
				if (Static74.aClass3_2 != null) {
					Static74.aClass3_2.method1515();
				}
				if (local119 != 0) {
					Static55.method980(local119);
					return;
				}
				Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
				Static29.anInt594 = 4;
			}
			if (Static29.anInt594 == 4) {
				if (Static24.aClass4_Sub10_Sub1_1.anInt931 < 8) {
					local119 = Static48.aClass75_4.method1844();
					if (8 - Static24.aClass4_Sub10_Sub1_1.anInt931 < local119) {
						local119 = 8 - Static24.aClass4_Sub10_Sub1_1.anInt931;
					}
					if (local119 > 0) {
						Static48.aClass75_4.method1843(Static24.aClass4_Sub10_Sub1_1.anInt931, Static24.aClass4_Sub10_Sub1_1.aByteArray17, local119);
						Static24.aClass4_Sub10_Sub1_1.anInt931 += local119;
					}
				}
				if (Static24.aClass4_Sub10_Sub1_1.anInt931 == 8) {
					Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
					Static47.aLong46 = Static24.aClass4_Sub10_Sub1_1.method605();
					Static29.anInt594 = 5;
				}
			}
			if (Static29.anInt594 == 5) {
				Static69.aClass4_Sub10_Sub1_2.anInt931 = 0;
				@Pc(208) int[] local208 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static47.aLong46 >> 32), (int) Static47.aLong46 };
				Static69.aClass4_Sub10_Sub1_2.method600(10);
				Static69.aClass4_Sub10_Sub1_2.method597(local208[0]);
				Static69.aClass4_Sub10_Sub1_2.method597(local208[1]);
				Static69.aClass4_Sub10_Sub1_2.method597(local208[2]);
				Static69.aClass4_Sub10_Sub1_2.method597(local208[3]);
				Static69.aClass4_Sub10_Sub1_2.method555(Static111.aClass76_1146.method1872());
				Static69.aClass4_Sub10_Sub1_2.method571(Static111.aClass76_1145);
				Static69.aClass4_Sub10_Sub1_2.method569(Static63.aBigInteger2, Static6.aBigInteger1);
				Static111.aClass4_Sub10_Sub1_3.anInt931 = 0;
				if (Static39.anInt1113 == 40) {
					Static111.aClass4_Sub10_Sub1_3.method600(18);
				} else {
					Static111.aClass4_Sub10_Sub1_3.method600(16);
				}
				Static111.aClass4_Sub10_Sub1_3.method600(Static69.aClass4_Sub10_Sub1_2.anInt931 + 93);
				Static111.aClass4_Sub10_Sub1_3.method597(469);
				Static111.aClass4_Sub10_Sub1_3.method600(Static76.aBoolean119 ? 1 : 0);
				Static45.method819(Static111.aClass4_Sub10_Sub1_3);
				Static111.aClass4_Sub10_Sub1_3.method597(Static133.aClass17_Sub1_21.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static33.aClass17_Sub1_9.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static23.aClass17_Sub1_8.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static69.aClass17_Sub1_16.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static12.aClass17_Sub1_4.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static7.aClass17_Sub1_3.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static50.aClass17_Sub1_12.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static130.aClass17_Sub1_20.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static3.aClass17_Sub1_17.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static56.aClass17_Sub1_13.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static18.aClass17_Sub1_6.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static95.aClass17_Sub1_18.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static64.aClass17_Sub1_14.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static67.aClass17_Sub1_15.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static45.aClass17_Sub1_11.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method597(Static19.aClass17_Sub1_10.anInt401);
				Static111.aClass4_Sub10_Sub1_3.method601(Static69.aClass4_Sub10_Sub1_2.aByteArray17, Static69.aClass4_Sub10_Sub1_2.anInt931);
				Static48.aClass75_4.method1849(Static111.aClass4_Sub10_Sub1_3.anInt931, Static111.aClass4_Sub10_Sub1_3.aByteArray17);
				Static69.aClass4_Sub10_Sub1_2.method610(local208);
				for (@Pc(431) int local431 = 0; local431 < 4; local431++) {
					local208[local431] += 50;
				}
				Static24.aClass4_Sub10_Sub1_1.method610(local208);
				Static29.anInt594 = 6;
			}
			if (Static29.anInt594 == 6 && Static48.aClass75_4.method1844() > 0) {
				local119 = Static48.aClass75_4.method1848();
				if (local119 == 21 && Static39.anInt1113 == 20) {
					Static29.anInt594 = 7;
				} else if (local119 == 2) {
					Static29.anInt594 = 9;
				} else if (local119 == 15 && Static39.anInt1113 == 40) {
					Static17.method231();
					return;
				} else if (local119 == 23 && Static8.anInt165 < 1) {
					Static8.anInt165++;
					Static29.anInt594 = 0;
				} else {
					Static55.method980(local119);
					return;
				}
			}
			if (Static29.anInt594 == 7 && Static48.aClass75_4.method1844() > 0) {
				Static40.anInt1135 = Static48.aClass75_4.method1848() * 60 + 180;
				Static29.anInt594 = 8;
			}
			if (Static29.anInt594 == 8) {
				Static20.anInt424 = 0;
				Static15.method180(Static59.method1017(new Class76[] { Static63.method1092(Static40.anInt1135 / 60), Static10.aClass76_92 }), Static88.aClass76_932, Static13.aClass76_107);
				if (--Static40.anInt1135 <= 0) {
					Static29.anInt594 = 0;
				}
			} else {
				if (Static29.anInt594 == 9 && Static48.aClass75_4.method1844() >= 8) {
					Static129.anInt2759 = Static48.aClass75_4.method1848();
					Static28.aBoolean47 = Static48.aClass75_4.method1848() == 1;
					Static41.anInt1148 = Static48.aClass75_4.method1848();
					Static41.anInt1148 <<= 0x8;
					Static41.anInt1148 += Static48.aClass75_4.method1848();
					Static64.anInt1653 = Static48.aClass75_4.method1848();
					Static48.aClass75_4.method1843(0, Static24.aClass4_Sub10_Sub1_1.aByteArray17, 1);
					Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
					Static48.anInt1230 = Static24.aClass4_Sub10_Sub1_1.method614();
					Static48.aClass75_4.method1843(0, Static24.aClass4_Sub10_Sub1_1.aByteArray17, 2);
					Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
					Static30.anInt1437 = Static24.aClass4_Sub10_Sub1_1.method604();
					Static29.anInt594 = 10;
				}
				if (Static29.anInt594 != 10) {
					Static20.anInt424++;
					if (Static20.anInt424 > 2000) {
						if (Static8.anInt165 < 1) {
							if (Static6.anInt138 == Static38.anInt1095) {
								Static6.anInt138 = Static34.anInt967;
							} else {
								Static6.anInt138 = Static38.anInt1095;
							}
							Static29.anInt594 = 0;
							Static8.anInt165++;
						} else {
							Static55.method980(-3);
						}
					}
				} else if (Static48.aClass75_4.method1844() >= Static30.anInt1437) {
					Static24.aClass4_Sub10_Sub1_1.anInt931 = 0;
					Static48.aClass75_4.method1843(0, Static24.aClass4_Sub10_Sub1_1.aByteArray17, Static30.anInt1437);
					Static112.method1716();
					Static72.anInt1877 = -1;
					Static23.method349(false);
					Static48.anInt1230 = -1;
				}
			}
		} catch (@Pc(735) IOException local735) {
			if (Static8.anInt165 < 1) {
				Static29.anInt594 = 0;
				Static8.anInt165++;
				if (Static6.anInt138 == Static38.anInt1095) {
					Static6.anInt138 = Static34.anInt967;
				} else {
					Static6.anInt138 = Static38.anInt1095;
				}
			} else {
				Static55.method980(-2);
			}
		}
	}
}
