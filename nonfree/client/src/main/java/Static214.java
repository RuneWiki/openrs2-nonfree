import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
	public static int anInt4248;

	@OriginalMember(owner = "client!qg", name = "d", descriptor = "Lclient!db;")
	public static Class31 aClass31_34 = new Class31(64);

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Z")
	public static boolean aBoolean322 = false;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
	public static void method3385() {
		Static47.aClass31_45.method850();
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)I")
	public static int method3386() {
		try {
			if (Static203.anInt3998 == 0) {
				if (Static92.aLong57 > Static252.method3964() - 5000L) {
					return 0;
				}
				Static4.aClass118_2 = Static13.aClass84_3.method1964(Static160.aString103, Static121.anInt2345);
				Static265.aLong169 = Static252.method3964();
				Static203.anInt3998 = 1;
			}
			if (Static252.method3964() > Static265.aLong169 + 30000L) {
				return Static202.method3141(1000);
			}
			@Pc(86) int local86;
			@Pc(122) int local122;
			if (Static203.anInt3998 == 1) {
				if (Static4.aClass118_2.anInt3187 == 2) {
					return Static202.method3141(1001);
				}
				if (Static4.aClass118_2.anInt3187 != 1) {
					return -1;
				}
				Static155.aClass73_3 = new Class73((Socket) Static4.aClass118_2.anObject3, Static13.aClass84_3);
				Static4.aClass118_2 = null;
				Static270.aClass1_Sub18_Sub1_3.anInt3911 = 0;
				local86 = 0;
				if (Static103.aBoolean139) {
					local86 = Static166.anInt3065;
				}
				Static270.aClass1_Sub18_Sub1_3.method3093(23);
				Static270.aClass1_Sub18_Sub1_3.method3119(local86);
				Static155.aClass73_3.method1685(Static270.aClass1_Sub18_Sub1_3.anInt3911, Static270.aClass1_Sub18_Sub1_3.aByteArray71);
				if (Static72.aClass24_1 != null) {
					Static72.aClass24_1.method2458();
				}
				if (Static159.aClass24_2 != null) {
					Static159.aClass24_2.method2458();
				}
				local122 = Static155.aClass73_3.method1686();
				if (Static72.aClass24_1 != null) {
					Static72.aClass24_1.method2458();
				}
				if (Static159.aClass24_2 != null) {
					Static159.aClass24_2.method2458();
				}
				if (local122 != 0) {
					return Static202.method3141(local122);
				}
				Static203.anInt3998 = 2;
			}
			if (Static203.anInt3998 == 2) {
				if (Static155.aClass73_3.method1687() < 2) {
					return -1;
				}
				Static23.anInt5823 = Static155.aClass73_3.method1686();
				Static23.anInt5823 <<= 0x8;
				Static23.anInt5823 += Static155.aClass73_3.method1686();
				Static203.anInt3998 = 3;
				Static160.anInt2983 = 0;
				Static30.aByteArray6 = new byte[Static23.anInt5823];
			}
			if (Static203.anInt3998 != 3) {
				return -1;
			}
			local86 = Static155.aClass73_3.method1687();
			if (local86 < 1) {
				return -1;
			}
			if (Static23.anInt5823 - Static160.anInt2983 < local86) {
				local86 = Static23.anInt5823 - Static160.anInt2983;
			}
			Static155.aClass73_3.method1689(local86, Static30.aByteArray6, Static160.anInt2983);
			Static160.anInt2983 += local86;
			if (Static160.anInt2983 < Static23.anInt5823) {
				return -1;
			} else if (Static8.method180(Static30.aByteArray6)) {
				local122 = 0;
				Static32.aClass152_Sub1Array1 = new Class152_Sub1[Static110.anInt2065];
				for (@Pc(244) int local244 = Static4.anInt162; local244 <= Static249.anInt5052; local244++) {
					@Pc(255) Class152_Sub1 local255 = Static207.method3232(local244);
					if (local255 != null) {
						Static32.aClass152_Sub1Array1[local122++] = local255;
					}
				}
				Static155.aClass73_3.method1691();
				Static155.aClass73_3 = null;
				Static30.aByteArray6 = null;
				Static203.anInt3998 = 0;
				Static163.anInt4688 = 0;
				Static92.aLong57 = Static252.method3964();
				return 0;
			} else {
				return Static202.method3141(1002);
			}
		} catch (@Pc(284) IOException local284) {
			return Static202.method3141(1003);
		}
	}

	@OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
	public static void method3388() {
		@Pc(2) Class112 local2 = Static179.aClass112_1;
		synchronized (Static179.aClass112_1) {
			Static113.anInt2117++;
			Static211.anInt959 = Static155.anInt2871;
			Static224.anInt4700 = Static192.anInt5397;
			Static293.anInt5833 = Static20.anInt461;
			Static143.anInt2663 = Static94.anInt1785;
			Static207.anInt4122 = Static289.anInt5736;
			Static72.anInt1427 = Static251.anInt5124;
			Static82.aLong54 = Static287.aLong189;
			Static94.anInt1785 = 0;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)Z")
	public static boolean method3389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(9) int local9 = arg3 * Static166.anInt3056 + arg0 * Static190.anInt3638 >> 16;
		@Pc(19) int local19 = arg3 * Static190.anInt3638 - arg0 * Static166.anInt3056 >> 16;
		@Pc(29) int local29 = arg1 * Static71.anInt1411 + local19 * Static295.anInt5859 >> 16;
		@Pc(39) int local39 = arg1 * Static295.anInt5859 - local19 * Static71.anInt1411 >> 16;
		if (local29 < 1) {
			local29 = 1;
		}
		@Pc(50) int local50 = (local9 << 9) / local29;
		@Pc(56) int local56 = (local39 << 9) / local29;
		@Pc(66) int local66 = arg2 * Static71.anInt1411 + local19 * Static295.anInt5859 >> 16;
		@Pc(76) int local76 = arg2 * Static295.anInt5859 - local19 * Static71.anInt1411 >> 16;
		if (local66 < 1) {
			local66 = 1;
		}
		@Pc(87) int local87 = (local9 << 9) / local66;
		@Pc(93) int local93 = (local76 << 9) / local66;
		if (local29 < 50 && local66 < 50) {
			return false;
		} else if (local29 > arg4 && local66 > arg4) {
			return false;
		} else if (local50 < Static77.anInt1560 && local87 < Static77.anInt1560) {
			return false;
		} else if (local50 > Static211.anInt958 && local87 > Static211.anInt958) {
			return false;
		} else if (local56 < Static17.anInt409 && local93 < Static17.anInt409) {
			return false;
		} else {
			return local56 <= Static150.anInt2786 || local93 <= Static150.anInt2786;
		}
	}

	@OriginalMember(owner = "client!qg", name = "b", descriptor = "(B)V")
	public static void method3390() {
		Static204.aClass31_30.method855();
	}
}
