import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static57 {

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "[I")
	public static int[] anIntArray187;

	@OriginalMember(owner = "client!g", name = "xb", descriptor = "Lclient!u;")
	public static Class76 aClass76_49;

	@OriginalMember(owner = "client!g", name = "db", descriptor = "[B")
	public static byte[] aByteArray32 = new byte[520];

	@OriginalMember(owner = "client!g", name = "Ob", descriptor = "Lclient!rf;")
	private static Class70 aClass70_576 = Static49.method1293("flash2:");

	@OriginalMember(owner = "client!g", name = "lb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_572 = aClass70_576;

	@OriginalMember(owner = "client!g", name = "zb", descriptor = "I")
	public static int anInt1834 = -1;

	@OriginalMember(owner = "client!g", name = "Kb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_574 = Static49.method1293("<col=ffffff>");

	@OriginalMember(owner = "client!g", name = "Lb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_575 = aClass70_576;

	@OriginalMember(owner = "client!g", name = "f", descriptor = "(I)V")
	public static void method1394() {
		if (Static20.aClass39_6 != null || Static110.aClass39_30 != null) {
			return;
		}
		@Pc(24) int local24 = Static63.anInt1966;
		@Pc(95) int local95;
		@Pc(101) int local101;
		if (Static32.aBoolean47) {
			@Pc(192) int local192;
			if (local24 != 1) {
				local192 = Static21.anInt591;
				local95 = Static70.anInt2156;
				if (local192 < Static110.anInt3091 - 10 || Static170.anInt4398 + Static110.anInt3091 + 10 < local192 || local95 < Static18.anInt481 - 10 || Static3.anInt150 + Static18.anInt481 + 10 < local95) {
					Static32.aBoolean47 = false;
					Static169.method3346(Static110.anInt3091, Static18.anInt481, Static3.anInt150, Static170.anInt4398);
				}
			}
			if (local24 != 1) {
				return;
			}
			local192 = Static110.anInt3091;
			local101 = Static170.anInt4398;
			local95 = Static18.anInt481;
			@Pc(241) int local241 = Static170.anInt4392;
			@Pc(243) int local243 = Static15.anInt450;
			@Pc(245) int local245 = -1;
			for (@Pc(247) int local247 = 0; local247 < Static162.anInt4331; local247++) {
				@Pc(261) int local261 = (Static162.anInt4331 - local247 - 1) * 15 + local95 + 31;
				if (local192 < local241 && local192 + local101 > local241 && local243 > local261 - 13 && local243 < local261 + 3) {
					local245 = local247;
				}
			}
			if (local245 != -1) {
				Static71.method1642(local245);
			}
			Static32.aBoolean47 = false;
			Static169.method3346(Static110.anInt3091, Static18.anInt481, Static3.anInt150, Static170.anInt4398);
			return;
		}
		if (local24 == 1 && Static162.anInt4331 > 0) {
			@Pc(37) short local37 = Static20.aShortArray7[Static162.anInt4331 - 1];
			if (local37 == 10 || local37 == 13 || local37 == 39 || local37 == 30 || local37 == 51 || local37 == 42 || local37 == 22 || local37 == 31 || local37 == 21 || local37 == 44 || local37 == 32 || local37 == 1001) {
				local95 = Static170.anIntArray420[Static162.anInt4331 - 1];
				local101 = Static80.anIntArray241[Static162.anInt4331 - 1];
				@Pc(105) Class39 local105 = Static128.method3227(local101);
				if (Static7.method244(Static20.method439(local105)) || Static95.method2046(Static20.method439(local105))) {
					Static166.aBoolean162 = false;
					Static69.anInt2126 = 0;
					if (Static20.aClass39_6 != null) {
						Static171.method3407(Static20.aClass39_6);
					}
					Static20.aClass39_6 = Static128.method3227(local101);
					Static77.anInt2390 = Static15.anInt450;
					Static140.anInt3677 = Static170.anInt4392;
					Static146.anInt3839 = local95;
					Static171.method3407(Static20.aClass39_6);
					return;
				}
			}
		}
		if (local24 == 1 && (Static154.anInt4063 == 1 && Static162.anInt4331 > 2 || Static108.method2265(Static162.anInt4331 - 1))) {
			local24 = 2;
		}
		if (local24 == 1 && Static162.anInt4331 > 0) {
			Static71.method1642(Static162.anInt4331 - 1);
		}
		if (local24 == 2 && Static162.anInt4331 > 0) {
			Static26.method551();
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "i", descriptor = "(I)V")
	public static void method1403() {
		aClass70_572 = null;
		aClass76_49 = null;
		aClass70_574 = null;
		anIntArray187 = null;
		aClass70_576 = null;
		aClass70_575 = null;
		aByteArray32 = null;
	}

	@OriginalMember(owner = "client!g", name = "d", descriptor = "(B)V")
	public static void method1406() {
		Static79.aBoolean91 = false;
		Static162.aBoolean167 = false;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!ig;IILclient!rh;I)V")
	public static void method1408(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1_Sub1_Sub1_Sub4 arg4, @OriginalArg(6) int arg5) {
		if (arg4 == null) {
			return;
		}
		@Pc(13) int local13 = Static71.anInt2223 + Static50.anInt1667 & 0x7FF;
		@Pc(25) int local25 = Math.max(arg1.anInt2340 / 2, arg1.anInt2369 / 2) + 10;
		@Pc(33) int local33 = arg2 * arg2 + arg3 * arg3;
		if (local33 > local25 * local25) {
			return;
		}
		@Pc(43) int local43 = Class1_Sub1_Sub1_Sub1.anIntArray11[local13];
		@Pc(51) int local51 = local43 * 256 / (Static25.anInt692 + 256);
		@Pc(55) int local55 = Class1_Sub1_Sub1_Sub1.anIntArray8[local13];
		@Pc(63) int local63 = local55 * 256 / (Static25.anInt692 + 256);
		@Pc(74) int local74 = arg2 * local51 + local63 * arg3 >> 16;
		@Pc(89) int local89 = local63 * arg2 - arg3 * local51 >> 16;
		arg4.method3028(local74 + arg5 + arg1.anInt2340 / 2 - arg4.anInt3972 / 2, -(arg4.anInt3970 / 2) + -local89 + arg1.anInt2369 / 2 + arg0, arg1.anIntArray230, arg1.anIntArray234);
	}
}
