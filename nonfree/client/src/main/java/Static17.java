import java.io.IOException;
import java.net.Socket;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bb", name = "jb", descriptor = "I")
	public static int anInt485;

	@OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
	public static int anInt477 = 0;

	@OriginalMember(owner = "client!bb", name = "Z", descriptor = "[I")
	public static int[] anIntArray19 = new int[14];

	@OriginalMember(owner = "client!bb", name = "fb", descriptor = "Ljava/util/Random;")
	public static Random aRandom1 = new Random();

	@OriginalMember(owner = "client!bb", name = "ib", descriptor = "Lclient!vj;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)I")
	public static int method315() {
		try {
			if (Static46.anInt1042 == 0) {
				if (Static71.method1143() - 5000L < Static66.aLong154) {
					return 0;
				}
				Static39.aClass163_4 = Static199.aClass17_3.method445(Static267.aString190, Static33.anInt764);
				Static12.aLong8 = Static71.method1143();
				Static46.anInt1042 = 1;
			}
			if (Static71.method1143() > Static12.aLong8 + 30000L) {
				return Static85.method1383(1000);
			}
			@Pc(92) int local92;
			@Pc(129) int local129;
			if (Static46.anInt1042 == 1) {
				if (Static39.aClass163_4.anInt5259 == 2) {
					return Static85.method1383(1001);
				}
				if (Static39.aClass163_4.anInt5259 != 1) {
					return -1;
				}
				Static95.aClass92_4 = new Class92((Socket) Static39.aClass163_4.anObject7, Static199.aClass17_3);
				Static66.aClass8_Sub2_Sub1_4.anInt2955 = 0;
				Static39.aClass163_4 = null;
				local92 = 0;
				if (Static158.aBoolean272) {
					local92 = Static285.anInt5618;
				}
				Static66.aClass8_Sub2_Sub1_4.method2340(23);
				Static66.aClass8_Sub2_Sub1_4.method2330(local92);
				Static95.aClass92_4.method2178(Static66.aClass8_Sub2_Sub1_4.aByteArray24, Static66.aClass8_Sub2_Sub1_4.anInt2955);
				if (Static153.aClass111_2 != null) {
					Static153.aClass111_2.method4153();
				}
				if (Static79.aClass111_1 != null) {
					Static79.aClass111_1.method4153();
				}
				local129 = Static95.aClass92_4.method2177();
				if (Static153.aClass111_2 != null) {
					Static153.aClass111_2.method4153();
				}
				if (Static79.aClass111_1 != null) {
					Static79.aClass111_1.method4153();
				}
				if (local129 != 0) {
					return Static85.method1383(local129);
				}
				Static46.anInt1042 = 2;
			}
			if (Static46.anInt1042 == 2) {
				if (Static95.aClass92_4.method2175() < 2) {
					return -1;
				}
				Static111.anInt2294 = Static95.aClass92_4.method2177();
				Static111.anInt2294 <<= 0x8;
				Static111.anInt2294 += Static95.aClass92_4.method2177();
				Static239.anInt4788 = 0;
				Static122.aByteArray17 = new byte[Static111.anInt2294];
				Static46.anInt1042 = 3;
			}
			if (Static46.anInt1042 != 3) {
				return -1;
			}
			local92 = Static95.aClass92_4.method2175();
			if (local92 < 1) {
				return -1;
			}
			if (local92 > Static111.anInt2294 - Static239.anInt4788) {
				local92 = Static111.anInt2294 - Static239.anInt4788;
			}
			Static95.aClass92_4.method2182(Static239.anInt4788, local92, Static122.aByteArray17);
			Static239.anInt4788 += local92;
			if (Static111.anInt2294 > Static239.anInt4788) {
				return -1;
			} else if (Static267.method4017(Static122.aByteArray17)) {
				Static51.aClass13_Sub1Array1 = new Class13_Sub1[Static94.anInt1963];
				local129 = 0;
				for (@Pc(243) int local243 = Static270.anInt5333; local243 <= Static10.anInt104; local243++) {
					@Pc(250) Class13_Sub1 local250 = Static39.method611(local243);
					if (local250 != null) {
						Static51.aClass13_Sub1Array1[local129++] = local250;
					}
				}
				Static95.aClass92_4.method2176();
				Static288.anInt1355 = 0;
				Static95.aClass92_4 = null;
				Static122.aByteArray17 = null;
				Static46.anInt1042 = 0;
				Static66.aLong154 = Static71.method1143();
				return 0;
			} else {
				return Static85.method1383(1002);
			}
		} catch (@Pc(280) IOException local280) {
			return Static85.method1383(1003);
		}
	}

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "(I)V")
	public static void method316() {
		@Pc(12) int local12 = Static195.method2233();
		if (local12 == 0) {
			Static123.aByteArrayArrayArray5 = null;
			Static9.method81(0);
		} else if (local12 == 1) {
			Static271.method4041((byte) 0);
			Static9.method81(512);
			if (Static170.aByteArrayArrayArray9 != null) {
				Static93.method1490();
			}
		} else {
			Static271.method4041((byte) (Static207.anInt4304 - 4 & 0xFF));
			Static9.method81(2);
		}
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
	public static void method317() {
		if (Static247.anInt5536 == 5) {
			Static247.anInt5536 = 6;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLjava/lang/String;)J")
	public static long method318(@OriginalArg(1) String arg0) {
		@Pc(7) long local7 = 0L;
		@Pc(15) int local15 = arg0.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			local7 = (local7 << 5) - (local7 - ((long) arg0.charAt(local17)));
		}
		return local7;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)I")
	public static int method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return (arg2 >> 1) + (arg0 >> 5 << 7) + (arg1 >> 2 << 10);
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4 < 0 || arg0 < 0 || arg4 >= 103 || arg0 >= 103) {
			return;
		}
		@Pc(37) int local37;
		if (arg6 == 0) {
			@Pc(26) Class134 local26 = Static169.method2663(arg3, arg4, arg0);
			if (local26 != null) {
				local37 = (int) (local26.aLong147 >>> 32) & Integer.MAX_VALUE;
				if (arg1 == 2) {
					local26.aClass36_6 = new Class36_Sub4(local37, 2, arg2 + 4, arg3, arg4, arg0, arg5, false, local26.aClass36_6);
					local26.aClass36_7 = new Class36_Sub4(local37, 2, arg2 + 1 & 0x3, arg3, arg4, arg0, arg5, false, local26.aClass36_7);
				} else {
					local26.aClass36_6 = new Class36_Sub4(local37, arg1, arg2, arg3, arg4, arg0, arg5, false, local26.aClass36_6);
				}
			}
		}
		if (arg6 == 1) {
			@Pc(104) Class141 local104 = Static11.method2357(arg3, arg4, arg0);
			if (local104 != null) {
				local37 = Integer.MAX_VALUE & (int) (local104.aLong166 >>> 32);
				if (arg1 == 4 || arg1 == 5) {
					local104.aClass36_8 = new Class36_Sub4(local37, 4, arg2, arg3, arg4, arg0, arg5, false, local104.aClass36_8);
				} else if (arg1 == 6) {
					local104.aClass36_8 = new Class36_Sub4(local37, 4, arg2 + 4, arg3, arg4, arg0, arg5, false, local104.aClass36_8);
				} else if (arg1 == 7) {
					local104.aClass36_8 = new Class36_Sub4(local37, 4, (arg2 + 2 & 0x3) + 4, arg3, arg4, arg0, arg5, false, local104.aClass36_8);
				} else if (arg1 == 8) {
					local104.aClass36_8 = new Class36_Sub4(local37, 4, arg2 + 4, arg3, arg4, arg0, arg5, false, local104.aClass36_8);
					local104.aClass36_9 = new Class36_Sub4(local37, 4, (arg2 + 2 & 0x3) + 4, arg3, arg4, arg0, arg5, false, local104.aClass36_9);
				}
			}
		}
		if (arg6 == 2) {
			if (arg1 == 11) {
				arg1 = 10;
			}
			@Pc(250) Class170 local250 = Static234.method3559(arg3, arg4, arg0);
			if (local250 != null) {
				local250.aClass36_10 = new Class36_Sub4(Integer.MAX_VALUE & (int) (local250.aLong196 >>> 32), arg1, arg2, arg3, arg4, arg0, arg5, false, local250.aClass36_10);
			}
		}
		if (arg6 == 3) {
			@Pc(283) Class120 local283 = Static176.method2710(arg3, arg4, arg0);
			if (local283 != null) {
				local283.aClass36_5 = new Class36_Sub4(Integer.MAX_VALUE & (int) (local283.aLong127 >>> 32), 22, arg2, arg3, arg4, arg0, arg5, false, local283.aClass36_5);
			}
		}
	}
}
