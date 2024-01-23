import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!ka", name = "O", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!ka", name = "W", descriptor = "Lclient!jj;")
	public static Class8_Sub1_Sub5_Sub2 aClass8_Sub1_Sub5_Sub2_3;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
	public static int anInt2621 = -1;

	@OriginalMember(owner = "client!ka", name = "sb", descriptor = "Ljava/lang/String;")
	public static String aString98 = " more options";

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V")
	public static void method2123(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = Static46.anInt1044;
		@Pc(7) int local7 = Static185.anInt3689;
		@Pc(9) int local9 = Static56.anInt1246;
		@Pc(11) int local11 = Static170.anInt3411;
		@Pc(14) int local14 = (int) Static201.aFloat36;
		@Pc(16) int local16 = Static293.anInt5684;
		if (local14 < Static215.anInt4428 / 256) {
			local14 = Static215.anInt4428 / 256;
		}
		@Pc(36) int local36 = Static28.anInt690 + (int) Static82.aFloat20 & 0x7FF;
		if (Static134.aBooleanArray8[4] && Static269.anIntArray376[4] + 128 > local14) {
			local14 = Static269.anIntArray376[4] + 128;
		}
		Static163.method3405(local36, Static163.anInt4477, arg0, local14, Static59.method927(Static21.aClass36_Sub3_Sub1_1.anInt4117, Static21.aClass36_Sub3_Sub1_1.anInt4118, Static34.anInt770) - 50, local14 * 3 + 600, Static194.anInt3891);
		if (local5 == Static46.anInt1044 && Static170.anInt3411 == local11 && local7 == Static185.anInt3689 && Static56.anInt1246 == local9 && local16 == Static293.anInt5684) {
			Static172.anInt3428 = 1;
			return;
		}
		Static293.anInt5688 = 10;
		Static31.anInt738 = 10;
		if (local5 < Static46.anInt1044) {
			local5 += Static31.anInt738 + (Static46.anInt1044 - local5) * Static293.anInt5688 / 1000;
			if (Static46.anInt1044 > local5) {
				Static46.anInt1044 = local5;
			}
		}
		if (local11 < Static170.anInt3411) {
			local11 += Static293.anInt5688 * (Static170.anInt3411 - local11) / 1000 + Static31.anInt738;
			if (local11 < Static170.anInt3411) {
				Static170.anInt3411 = local11;
			}
		}
		if (local11 > Static170.anInt3411) {
			local11 -= Static31.anInt738 + (local11 - Static170.anInt3411) * Static293.anInt5688 / 1000;
			if (Static170.anInt3411 < local11) {
				Static170.anInt3411 = local11;
			}
		}
		Static176.anInt3474 = 10;
		if (local7 < Static185.anInt3689) {
			local7 += Static31.anInt738 + Static293.anInt5688 * (Static185.anInt3689 - local7) / 1000;
			if (Static185.anInt3689 > local7) {
				Static185.anInt3689 = local7;
			}
		}
		if (Static46.anInt1044 < local5) {
			local5 -= Static31.anInt738 + Static293.anInt5688 * (local5 - Static46.anInt1044) / 1000;
			if (Static46.anInt1044 < local5) {
				Static46.anInt1044 = local5;
			}
		}
		Static151.anInt4072 = 10;
		if (Static56.anInt1246 > local9) {
			local9 += Static176.anInt3474 + Static151.anInt4072 * (Static56.anInt1246 - local9) / 1000;
			if (local9 < Static56.anInt1246) {
				Static56.anInt1246 = local9;
			}
		}
		@Pc(271) int local271 = Static293.anInt5684 - local16;
		if (Static185.anInt3689 < local7) {
			local7 -= Static31.anInt738 + (local7 - Static185.anInt3689) * Static293.anInt5688 / 1000;
			if (local7 > Static185.anInt3689) {
				Static185.anInt3689 = local7;
			}
		}
		if (local9 > Static56.anInt1246) {
			local9 -= (local9 - Static56.anInt1246) * Static151.anInt4072 / 1000 + Static176.anInt3474;
			if (local9 > Static56.anInt1246) {
				Static56.anInt1246 = local9;
			}
		}
		if (local271 > 1024) {
			local271 -= 2048;
		}
		if (local271 < -1024) {
			local271 += 2048;
		}
		if (local271 > 0) {
			local16 += Static176.anInt3474 + Static151.anInt4072 * local271 / 1000;
			local16 &= 0x7FF;
		}
		if (local271 < 0) {
			local16 -= Static151.anInt4072 * -local271 / 1000 + Static176.anInt3474;
			local16 &= 0x7FF;
		}
		@Pc(377) int local377 = Static293.anInt5684 - local16;
		if (local377 > 1024) {
			local377 -= 2048;
		}
		if (local377 < -1024) {
			local377 += 2048;
		}
		if (local377 >= 0 || local271 <= 0 || local377 > 0 && local271 < 0) {
			Static293.anInt5684 = local16;
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZB)V")
	public static void method2137(@OriginalArg(0) boolean arg0) {
		@Pc(6) Class8_Sub12 local6;
		for (local6 = (Class8_Sub12) Static52.aClass182_5.method4319(); local6 != null; local6 = (Class8_Sub12) Static52.aClass182_5.method4329()) {
			if (local6.aClass8_Sub8_Sub4_3 != null) {
				Static84.aClass8_Sub8_Sub1_1.method837(local6.aClass8_Sub8_Sub4_3);
				local6.aClass8_Sub8_Sub4_3 = null;
			}
			if (local6.aClass8_Sub8_Sub4_2 != null) {
				Static84.aClass8_Sub8_Sub1_1.method837(local6.aClass8_Sub8_Sub4_2);
				local6.aClass8_Sub8_Sub4_2 = null;
			}
			local6.method4273();
		}
		if (!arg0) {
			return;
		}
		for (local6 = (Class8_Sub12) Static191.aClass182_24.method4319(); local6 != null; local6 = (Class8_Sub12) Static191.aClass182_24.method4329()) {
			if (local6.aClass8_Sub8_Sub4_3 != null) {
				Static84.aClass8_Sub8_Sub1_1.method837(local6.aClass8_Sub8_Sub4_3);
				local6.aClass8_Sub8_Sub4_3 = null;
			}
			local6.method4273();
		}
		for (local6 = (Class8_Sub12) Static247.aClass129_29.method3035(); local6 != null; local6 = (Class8_Sub12) Static247.aClass129_29.method3048()) {
			if (local6.aClass8_Sub8_Sub4_3 != null) {
				Static84.aClass8_Sub8_Sub1_1.method837(local6.aClass8_Sub8_Sub4_3);
				local6.aClass8_Sub8_Sub4_3 = null;
			}
			local6.method4273();
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIIBIII)V")
	public static void method2144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class159 local8 = Static260.method3916(arg2, arg1);
		if (local8 != null && local8.anObjectArray9 != null) {
			@Pc(18) Class8_Sub14 local18 = new Class8_Sub14();
			local18.anObjectArray1 = local8.anObjectArray9;
			local18.aClass159_10 = local8;
			Static173.method2688(local18);
		}
		Static57.anInt1261 = arg3;
		Static9.anInt85 = arg0;
		Static106.anInt2200 = arg1;
		Static167.anInt3364 = arg4;
		Static215.aBoolean357 = true;
		Static234.anInt4722 = arg5;
		anInt2621 = arg2;
		Static128.method2075(local8);
	}
}
