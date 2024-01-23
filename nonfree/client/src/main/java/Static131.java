import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!mj", name = "K", descriptor = "[[S")
	public static short[][] aShortArrayArray3;

	@OriginalMember(owner = "client!mj", name = "N", descriptor = "[J")
	public static long[] aLongArray9 = new long[100];

	@OriginalMember(owner = "client!mj", name = "V", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1029 = Static64.method1101("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
	public static void method2274() {
		if (Static37.anInt889 == 0) {
			return;
		}
		try {
			if (Static37.anInt889 == 1) {
				if (Static72.aClass38_4.anInt1236 == 2) {
					throw new IOException();
				}
				if (Static72.aClass38_4.anInt1236 != 1) {
					return;
				}
				Static192.aClass11_36 = new Class11((Socket) Static72.aClass38_4.anObject3, Static51.aClass72_3);
				Static72.aClass38_4 = null;
				Static192.aClass11_36.method269(Static167.aClass1_Sub16_Sub1_2.anInt4860, Static167.aClass1_Sub16_Sub1_2.aByteArray62);
				Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
				Static37.anInt889 = 2;
			}
			@Pc(78) int local78;
			if (Static37.anInt889 == 2) {
				if (Static200.aClass42_2 != null) {
					Static200.aClass42_2.method2734();
				}
				if (Static92.aClass42_1 != null) {
					Static92.aClass42_1.method2734();
				}
				local78 = Static192.aClass11_36.method275();
				if (Static200.aClass42_2 != null) {
					Static200.aClass42_2.method2734();
				}
				if (Static92.aClass42_1 != null) {
					Static92.aClass42_1.method2734();
				}
				if (local78 < 0) {
					return;
				}
				if (Static176.anInt3867 == 1) {
					if (local78 == 0) {
						Static201.anInt4264 = 3;
					} else {
						Static201.anInt4264 = local78;
					}
				}
				if (Static176.anInt3867 == 2) {
					if (local78 == 0) {
						Static128.anInt4777 = 3;
					} else if (local78 == 21) {
						Static37.anInt889 = 3;
						return;
					} else {
						Static128.anInt4777 = local78;
					}
				}
				Static37.anInt889 = 0;
				if (Static176.anInt3867 == 3) {
					if (local78 == 0) {
						Static107.anInt2390 = 3;
					} else {
						Static107.anInt2390 = local78;
					}
				}
				Static176.anInt3867 = 0;
				if (Static192.aClass11_36 != null) {
					Static192.aClass11_36.method271();
				}
				Static192.aClass11_36 = null;
			}
			if (Static37.anInt889 == 3) {
				local78 = Static192.aClass11_36.method273();
				if (local78 > 0) {
					Static197.aClass51Array14 = new Class51[Static192.aClass11_36.method275()];
					Static37.anInt889 = 4;
				}
			}
			if (Static37.anInt889 == 4) {
				local78 = Static192.aClass11_36.method273();
				if (local78 >= Static197.aClass51Array14.length * 8) {
					Static225.aClass1_Sub16_Sub1_4.anInt4860 = 0;
					Static192.aClass11_36.method274(Static225.aClass1_Sub16_Sub1_4.aByteArray62, 0, Static197.aClass51Array14.length * 8);
					for (@Pc(200) int local200 = 0; local200 < Static197.aClass51Array14.length; local200++) {
						Static197.aClass51Array14[local200] = Static202.method3323(Static225.aClass1_Sub16_Sub1_4.method3791());
					}
					Static37.anInt889 = 0;
					Static128.anInt4777 = 21;
					Static176.anInt3867 = 0;
					if (Static192.aClass11_36 != null) {
						Static192.aClass11_36.method271();
					}
					Static192.aClass11_36 = null;
					return;
				}
			}
		} catch (@Pc(232) IOException local232) {
			Static107.anInt2390 = 3;
			Static128.anInt4777 = 3;
			Static201.anInt4264 = 3;
			Static37.anInt889 = 0;
			Static176.anInt3867 = 0;
			if (Static192.aClass11_36 != null) {
				Static192.aClass11_36.method271();
			}
			Static192.aClass11_36 = null;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BILclient!ia;)V")
	public static void method2280(@OriginalArg(1) int arg0, @OriginalArg(2) Class51 arg1) {
		Static167.aClass1_Sub16_Sub1_2.method3823(234);
		Static167.aClass1_Sub16_Sub1_2.method3790(arg0);
		Static167.aClass1_Sub16_Sub1_2.method3786(arg1.method1388());
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!me;I)V")
	public static void method2283(@OriginalArg(1) int arg0, @OriginalArg(2) Class71 arg1, @OriginalArg(3) int arg2) {
		if (arg1.aByte9 == 0) {
			arg1.anInt2804 = arg1.anInt2781;
		} else if (arg1.aByte9 == 1) {
			arg1.anInt2804 = arg1.anInt2781 + (arg2 - arg1.anInt2835) / 2;
		} else if (arg1.aByte9 == 2) {
			arg1.anInt2804 = arg2 - arg1.anInt2835 - arg1.anInt2781;
		} else if (arg1.aByte9 == 3) {
			arg1.anInt2804 = arg2 * arg1.anInt2781 >> 14;
		} else if (arg1.aByte9 == 4) {
			arg1.anInt2804 = (arg1.anInt2781 * arg2 >> 14) + (arg2 - arg1.anInt2835) / 2;
		} else {
			arg1.anInt2804 = arg2 - arg1.anInt2835 - (arg2 * arg1.anInt2781 >> 14);
		}
		if (arg1.aByte10 == 0) {
			arg1.anInt2858 = arg1.anInt2834;
		} else if (arg1.aByte10 == 1) {
			arg1.anInt2858 = arg1.anInt2834 + (arg0 - arg1.anInt2802) / 2;
		} else if (arg1.aByte10 == 2) {
			arg1.anInt2858 = arg0 - arg1.anInt2834 - arg1.anInt2802;
		} else if (arg1.aByte10 == 3) {
			arg1.anInt2858 = arg0 * arg1.anInt2834 >> 14;
		} else if (arg1.aByte10 == 4) {
			arg1.anInt2858 = (arg1.anInt2834 * arg0 >> 14) + (arg0 - arg1.anInt2802) / 2;
		} else {
			arg1.anInt2858 = arg0 - (arg0 * arg1.anInt2834 >> 14) - arg1.anInt2802;
		}
		if (!Static135.aBoolean135 || Static33.method587(arg1) == 0 && arg1.anInt2777 != 0) {
			return;
		}
		if (arg1.anInt2804 < 0) {
			arg1.anInt2804 = 0;
		} else if (arg1.anInt2804 + arg1.anInt2835 > arg2) {
			arg1.anInt2804 = arg2 - arg1.anInt2835;
		}
		if (arg1.anInt2858 < 0) {
			arg1.anInt2858 = 0;
		} else if (arg0 < arg1.anInt2802 + arg1.anInt2858) {
			arg1.anInt2858 = arg0 - arg1.anInt2802;
			return;
		}
	}
}
