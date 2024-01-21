import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!k", name = "L", descriptor = "[[S")
	public static short[][] aShortArrayArray4 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
	public static int anInt1490 = 0;

	@OriginalMember(owner = "client!k", name = "Ob", descriptor = "Lclient!v;")
	private static Class76 aClass76_637 = Static134.method2017("Connecting to server)3)3)3");

	@OriginalMember(owner = "client!k", name = "db", descriptor = "Lclient!v;")
	public static Class76 aClass76_635 = aClass76_637;

	@OriginalMember(owner = "client!k", name = "Mb", descriptor = "I")
	public static volatile int anInt1523 = 0;

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
	public static void method992() {
		for (@Pc(6) Class4_Sub1 local6 = (Class4_Sub1) Static56.aClass78_6.method1916(); local6 != null; local6 = (Class4_Sub1) Static56.aClass78_6.method1920()) {
			if (local6.aClass4_Sub4_Sub8_1 != null) {
				local6.method74();
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V")
	public static void method997(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class4_Sub3 local18 = (Class4_Sub3) Static114.aClass28_11.method775(); local18 != null; local18 = (Class4_Sub3) Static114.aClass28_11.method771()) {
			if ((local18.aLong99 >> 48 & 0xFFFFL) == (long) arg0) {
				local18.method2004();
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)V")
	public static void method1000() {
		Static38.aByteArrayArray3 = null;
		Static49.anIntArray159 = null;
		Static31.anIntArray96 = null;
		Static25.anIntArray80 = null;
		Static34.anIntArray107 = null;
		Static102.anIntArray321 = null;
	}

	@OriginalMember(owner = "client!k", name = "h", descriptor = "(I)V")
	public static void method1001() {
		aClass76_637 = null;
		aShortArrayArray4 = null;
		aClass76_635 = null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!ne;I)Lclient!v;")
	public static Class76 method1004(@OriginalArg(1) Class4_Sub10 arg0) {
		try {
			@Pc(7) Class76 local7 = new Class76();
			local7.anInt2668 = arg0.method568();
			if (local7.anInt2668 > 32767) {
				local7.anInt2668 = 32767;
			}
			local7.aByteArray71 = new byte[local7.anInt2668];
			arg0.anInt931 += Static110.aClass23_1.method387(local7.aByteArray71, 0, arg0.aByteArray17, local7.anInt2668, arg0.anInt931);
			return local7;
		} catch (@Pc(52) Exception local52) {
			return Static105.aClass76_1105;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!qb;IILclient!dc;)V")
	public static void method1005(@OriginalArg(0) Class58 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class17_Sub1 arg2) {
		@Pc(3) Class4_Sub5 local3 = new Class4_Sub5();
		local3.aClass17_Sub1_5 = arg2;
		local3.aLong99 = arg1;
		local3.aClass58_1 = arg0;
		local3.anInt243 = 1;
		@Pc(22) Class78 local22 = Static8.aClass78_1;
		synchronized (Static8.aClass78_1) {
			Static8.aClass78_1.method1914(local3);
		}
		Static24.method352();
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII[Lclient!na;ILclient!wc;II[BI)V")
	public static void method1009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class50[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		@Pc(18) Class4_Sub10 local18 = new Class4_Sub10(arg8);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method568();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method568();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(56) int local56 = local35 >> 6 & 0x3F;
				@Pc(60) int local60 = local35 & 0x3F;
				@Pc(64) int local64 = local35 >> 12;
				@Pc(68) int local68 = local18.method599();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				if (arg6 == local64 && local56 >= arg0 && arg0 + 8 > local56 && arg9 <= local60 && arg9 + 8 > local60) {
					@Pc(119) Class4_Sub4_Sub8 local119 = Static104.method1600(local20);
					@Pc(136) int local136 = Static1.method1(arg1, local56 & 0x7, local76, local119.anInt1505, local119.anInt1498, local60 & 0x7) + arg7;
					@Pc(153) int local153 = Static30.method970(local76, local56 & 0x7, arg1, local119.anInt1498, local119.anInt1505, local60 & 0x7) + arg4;
					if (local136 > 0 && local153 > 0 && local136 < 103 && local153 < 103) {
						@Pc(173) int local173 = arg2;
						@Pc(175) Class50 local175 = null;
						if ((Static62.aByteArrayArrayArray4[1][local136][local153] & 0x2) == 2) {
							local173 = arg2 - 1;
						}
						if (local173 >= 0) {
							local175 = arg3[local173];
						}
						Static88.method1468(local136, arg5, local175, local153, local20, arg1 + local76 & 0x3, arg2, local72);
					}
				}
			}
		}
	}
}
