import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!p", name = "m", descriptor = "I")
	public static int anInt3971;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!lj;")
	public static Class1_Sub5_Sub6 aClass1_Sub5_Sub6_8;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "[I")
	public static int[] anIntArray419;

	@OriginalMember(owner = "client!p", name = "r", descriptor = "Lclient!hh;")
	public static Class74 aClass74_1 = new Class74();

	@OriginalMember(owner = "client!p", name = "u", descriptor = "I")
	public static int anInt3976 = 0;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
	public static void method3438() {
		Static120.aClass175_20.method4294();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
	public static void method3439(@OriginalArg(1) int arg0) {
		@Pc(12) Class1_Sub18 local12 = (Class1_Sub18) Static1.aClass86_1.method2136((long) arg0);
		if (local12 != null) {
			for (@Pc(19) int local19 = 0; local19 < local12.anIntArray219.length; local19++) {
				local12.anIntArray219[local19] = -1;
				local12.anIntArray218[local19] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3440(@OriginalArg(0) String arg0) {
		if (Static18.aClass1_Sub8Array1 == null) {
			return;
		}
		@Pc(12) int local12 = 0;
		@Pc(16) long local16 = Static282.method4276(arg0);
		if (local16 == 0L) {
			return;
		}
		while (local12 < Static18.aClass1_Sub8Array1.length && Static18.aClass1_Sub8Array1[local12].aLong210 != local16) {
			local12++;
		}
		if (local12 < Static18.aClass1_Sub8Array1.length && Static18.aClass1_Sub8Array1[local12] != null) {
			Static116.aClass1_Sub13_Sub1_48.method1887(145);
			Static116.aClass1_Sub13_Sub1_48.method1857(Static18.aClass1_Sub8Array1[local12].aLong210);
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)Ljava/lang/String;")
	public static String method3441(@OriginalArg(0) int arg0) {
		return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public static void method3442() {
		if (Static74.anInt1611 == 0) {
			return;
		}
		try {
			if (++Static56.anInt1210 > 2000) {
				if (Static97.aClass49_2 != null) {
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
				}
				if (Static145.anInt2812 >= 1) {
					Static104.anInt2212 = -5;
					Static74.anInt1611 = 0;
					return;
				}
				Static145.anInt2812++;
				if (Static8.anInt235 == Static23.anInt472) {
					Static8.anInt235 = Static287.anInt5204;
				} else {
					Static8.anInt235 = Static23.anInt472;
				}
				Static74.anInt1611 = 1;
				Static56.anInt1210 = 0;
			}
			if (Static74.anInt1611 == 1) {
				Static224.aClass153_5 = Static222.aClass176_3.method4371(Static252.aString164, Static8.anInt235);
				Static74.anInt1611 = 2;
			}
			@Pc(123) int local123;
			if (Static74.anInt1611 == 2) {
				if (Static224.aClass153_5.anInt4614 == 2) {
					throw new IOException();
				}
				if (Static224.aClass153_5.anInt4614 != 1) {
					return;
				}
				Static97.aClass49_2 = new Class49((Socket) Static224.aClass153_5.anObject6, Static222.aClass176_3);
				Static224.aClass153_5 = null;
				Static97.aClass49_2.method1302(Static116.aClass1_Sub13_Sub1_48.aByteArray63, Static116.aClass1_Sub13_Sub1_48.anInt2018);
				if (Static129.aClass121_2 != null) {
					Static129.aClass121_2.method3583();
				}
				if (Static13.aClass121_1 != null) {
					Static13.aClass121_1.method3583();
				}
				local123 = Static97.aClass49_2.method1301();
				if (Static129.aClass121_2 != null) {
					Static129.aClass121_2.method3583();
				}
				if (Static13.aClass121_1 != null) {
					Static13.aClass121_1.method3583();
				}
				if (local123 != 21) {
					Static74.anInt1611 = 0;
					Static104.anInt2212 = local123;
					Static97.aClass49_2.method1307();
					Static97.aClass49_2 = null;
					return;
				}
				Static74.anInt1611 = 3;
			}
			if (Static74.anInt1611 == 3) {
				if (Static97.aClass49_2.method1300() < 1) {
					return;
				}
				Static79.aStringArray11 = new String[Static97.aClass49_2.method1301()];
				Static74.anInt1611 = 4;
			}
			if (Static74.anInt1611 == 4) {
				if (Static97.aClass49_2.method1300() < Static79.aStringArray11.length * 8) {
					return;
				}
				Static10.aClass1_Sub13_Sub1_117.anInt2018 = 0;
				Static97.aClass49_2.method1303(0, Static10.aClass1_Sub13_Sub1_117.aByteArray63, Static79.aStringArray11.length * 8);
				for (local123 = 0; local123 < Static79.aStringArray11.length; local123++) {
					Static79.aStringArray11[local123] = Static136.method2356(Static10.aClass1_Sub13_Sub1_117.method1833());
				}
				Static74.anInt1611 = 0;
				Static104.anInt2212 = 21;
				Static97.aClass49_2.method1307();
				Static97.aClass49_2 = null;
				return;
			}
		} catch (@Pc(230) IOException local230) {
			if (Static97.aClass49_2 != null) {
				Static97.aClass49_2.method1307();
				Static97.aClass49_2 = null;
			}
			if (Static145.anInt2812 >= 1) {
				Static104.anInt2212 = -4;
				Static74.anInt1611 = 0;
			} else {
				Static56.anInt1210 = 0;
				Static74.anInt1611 = 1;
				Static145.anInt2812++;
				if (Static8.anInt235 == Static23.anInt472) {
					Static8.anInt235 = Static287.anInt5204;
				} else {
					Static8.anInt235 = Static23.anInt472;
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lclient!si;")
	public static Class157 method3444(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0 >> 16;
		@Pc(11) int local11 = arg0 & 0xFFFF;
		if (Static176.aClass157ArrayArray1[local7] == null || Static176.aClass157ArrayArray1[local7][local11] == null) {
			@Pc(34) boolean local34 = Static19.method322(local7);
			if (!local34) {
				return null;
			}
		}
		return Static176.aClass157ArrayArray1[local7][local11];
	}
}
