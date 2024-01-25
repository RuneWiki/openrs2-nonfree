import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "Lclient!fba;")
	public static final Class102 aClass102_30 = new Class102(4);

	@OriginalMember(owner = "client!ju", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString58 = null;

	@OriginalMember(owner = "client!ju", name = "i", descriptor = "Z")
	public static boolean aBoolean329 = false;

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "[I")
	public static final int[] anIntArray269 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	public static void method4518() {
		if (Static40.anInt1258 == 0) {
			return;
		}
		try {
			if (++Static562.anInt9393 > 2000) {
				if (Static413.aClass230_1 != null) {
					Static413.aClass230_1.method6028();
					Static413.aClass230_1 = null;
				}
				if (Static583.anInt9562 >= 2) {
					Static40.anInt1258 = 0;
					Static78.anInt1910 = -5;
					return;
				}
				Static44.aClass363_2.method8469();
				Static562.anInt9393 = 0;
				Static583.anInt9562++;
				Static40.anInt1258 = 1;
			}
			if (Static40.anInt1258 == 1) {
				Static422.aClass304_4 = Static44.aClass363_2.method8471(Static205.aClass138_2);
				Static40.anInt1258 = 2;
			}
			if (Static40.anInt1258 == 2) {
				if (Static422.aClass304_4.anInt8838 == 2) {
					throw new IOException();
				}
				if (Static422.aClass304_4.anInt8838 != 1) {
					return;
				}
				Static413.aClass230_1 = Static343.method5748((Socket) Static422.aClass304_4.anObject16);
				Static422.aClass304_4 = null;
				Static154.method2812();
				Static40.anInt1258 = 4;
			}
			if (Static40.anInt1258 == 4) {
				if (!Static413.aClass230_1.method6031(1)) {
					return;
				}
				Static413.aClass230_1.method6029(Static30.aClass3_Sub3_Sub2_1.aByteArray54, 1, 0);
				@Pc(116) int local116 = Static30.aClass3_Sub3_Sub2_1.aByteArray54[0] & 0xFF;
				Static40.anInt1258 = 0;
				Static78.anInt1910 = local116;
				Static413.aClass230_1.method6028();
				Static413.aClass230_1 = null;
				return;
			}
		} catch (@Pc(127) IOException local127) {
			if (Static413.aClass230_1 != null) {
				Static413.aClass230_1.method6028();
				Static413.aClass230_1 = null;
			}
			if (Static583.anInt9562 < 2) {
				Static44.aClass363_2.method8469();
				Static562.anInt9393 = 0;
				Static583.anInt9562++;
				Static40.anInt1258 = 1;
			} else {
				Static78.anInt1910 = -4;
				Static40.anInt1258 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)I")
	public static int method4519() {
		@Pc(10) byte local10;
		if (Static131.anInt2701 < 96) {
			local10 = 1;
			Static154.method2818();
		} else {
			@Pc(18) int local18 = Static49.method1447();
			if (local18 <= 100) {
				local10 = 4;
				Static103.method2140();
			} else if (local18 <= 500) {
				Static481.method7182();
				local10 = 3;
			} else if (local18 > 1000) {
				local10 = 1;
				Static154.method2818();
			} else {
				Static634.method8680();
				local10 = 2;
			}
		}
		if (Static262.aClass3_Sub27_12.aClass21_Sub1_1.method1025() != 0) {
			Static262.aClass3_Sub27_12.method3234(0, Static262.aClass3_Sub27_12.aClass21_Sub1_2);
			Static441.method6865(false, 0);
		}
		Static108.method2177();
		return local10;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(CI)Z")
	public static boolean method4520(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
