import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "[I")
	public static int[] anIntArray593;

	@OriginalMember(owner = "client!ul", name = "s", descriptor = "I")
	public static int anInt5706;

	@OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
	public static int anInt5707 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)I")
	public static int method4678() {
		if (Static132.aBoolean188) {
			return 0;
		} else if (Static208.method3462()) {
			return Static76.aBoolean127 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZI)Lclient!so;")
	public static Class164 method4679(@OriginalArg(1) int arg0) {
		@Pc(10) Class164 local10 = (Class164) Static47.aClass98_45.method2570((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static4.aClass155_87.method4121(0, arg0);
		local10 = new Class164();
		if (local21 != null) {
			local10.method4345(new Class3_Sub26(local21));
		}
		local10.method4343();
		Static47.aClass98_45.method2568(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4680(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static224.method4977("\n", arg0, "%0a"));
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)I")
	public static int method4681() {
		try {
			if (Static89.anInt1663 == 0) {
				if (Static176.aLong147 > Static128.method2196() - 5000L) {
					return 0;
				}
				Static203.aClass178_2 = Static274.aClass176_4.method4521(Static109.aString107, Static311.anInt6114);
				Static14.aLong8 = Static128.method2196();
				Static89.anInt1663 = 1;
			}
			if (Static14.aLong8 + 30000L < Static128.method2196()) {
				return Static108.method1764(1000);
			}
			@Pc(82) int local82;
			@Pc(125) int local125;
			if (Static89.anInt1663 == 1) {
				if (Static203.aClass178_2.anInt5649 == 2) {
					return Static108.method1764(1001);
				}
				if (Static203.aClass178_2.anInt5649 != 1) {
					return -1;
				}
				Static150.aClass139_3 = new Class139((Socket) Static203.aClass178_2.anObject6, Static274.aClass176_4);
				local82 = 0;
				if (Static134.aBoolean312) {
					local82 = Static256.anInt5288;
				}
				Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
				Static203.aClass178_2 = null;
				Static215.aClass3_Sub26_Sub1_2.method3907(23);
				Static215.aClass3_Sub26_Sub1_2.method3944(local82);
				Static150.aClass139_3.method3556(Static215.aClass3_Sub26_Sub1_2.aByteArray64, Static215.aClass3_Sub26_Sub1_2.anInt4615);
				if (Static32.aClass105_1 != null) {
					Static32.aClass105_1.method2774();
				}
				if (Static187.aClass105_2 != null) {
					Static187.aClass105_2.method2774();
				}
				local125 = Static150.aClass139_3.method3553();
				if (Static32.aClass105_1 != null) {
					Static32.aClass105_1.method2774();
				}
				if (Static187.aClass105_2 != null) {
					Static187.aClass105_2.method2774();
				}
				if (local125 != 0) {
					return Static108.method1764(local125);
				}
				Static89.anInt1663 = 2;
			}
			if (Static89.anInt1663 == 2) {
				if (Static150.aClass139_3.method3554() < 2) {
					return -1;
				}
				Static4.anInt4059 = Static150.aClass139_3.method3553();
				Static4.anInt4059 <<= 0x8;
				Static4.anInt4059 += Static150.aClass139_3.method3553();
				Static89.anInt1663 = 3;
				Static79.anInt1914 = 0;
				Static123.aByteArray33 = new byte[Static4.anInt4059];
			}
			if (Static89.anInt1663 != 3) {
				return -1;
			}
			local82 = Static150.aClass139_3.method3554();
			if (local82 < 1) {
				return -1;
			}
			if (Static4.anInt4059 - Static79.anInt1914 < local82) {
				local82 = Static4.anInt4059 - Static79.anInt1914;
			}
			Static150.aClass139_3.method3558(local82, Static123.aByteArray33, Static79.anInt1914);
			Static79.anInt1914 += local82;
			if (Static4.anInt4059 > Static79.anInt1914) {
				return -1;
			} else if (Static125.method2166(Static123.aByteArray33)) {
				local125 = 0;
				Static100.aClass87_Sub1Array1 = new Class87_Sub1[Static315.anInt6131];
				for (@Pc(246) int local246 = Static232.anInt4519; local246 <= Static13.anInt240; local246++) {
					@Pc(253) Class87_Sub1 local253 = Static102.method1627(local246);
					if (local253 != null) {
						Static100.aClass87_Sub1Array1[local125++] = local253;
					}
				}
				Static150.aClass139_3.method3559();
				Static255.anInt5259 = 0;
				Static123.aByteArray33 = null;
				Static89.anInt1663 = 0;
				Static150.aClass139_3 = null;
				Static176.aLong147 = Static128.method2196();
				return 0;
			} else {
				return Static108.method1764(1002);
			}
		} catch (@Pc(281) IOException local281) {
			return Static108.method1764(1003);
		}
	}
}
