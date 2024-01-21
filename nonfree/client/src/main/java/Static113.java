import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!tb", name = "O", descriptor = "[I")
	public static int[] anIntArray436;

	@OriginalMember(owner = "client!tb", name = "C", descriptor = "I")
	public static int anInt2820 = 0;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "Z")
	public static boolean aBoolean226 = false;

	@OriginalMember(owner = "client!tb", name = "I", descriptor = "I")
	public static int anInt2825 = 0;

	@OriginalMember(owner = "client!tb", name = "Q", descriptor = "I")
	public static int anInt2832 = 0;

	@OriginalMember(owner = "client!tb", name = "T", descriptor = "Lclient!kd;")
	private static Class39 aClass39_1354 = Static108.method1915("Error connecting to server)3");

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "Lclient!kd;")
	public static Class39 aClass39_1355 = aClass39_1354;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method1972(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static71.method1248(arg5)) {
			Static96.method1617(0, arg3, -1, arg2, arg1, arg6, Static102.aClass1_Sub1_Sub1ArrayArray1[arg5], arg4, arg7, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!a;IB)Lclient!kd;")
	public static Class39 method1973(@OriginalArg(0) Class1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (!Static62.method2034(arg1, Static129.method2213(arg0))) {
			return null;
		} else if (arg0.aClass39Array2 == null || arg1 >= arg0.aClass39Array2.length || arg0.aClass39Array2[arg1] == null || arg0.aClass39Array2[arg1].method1183().method1175() == 0) {
			return Static120.aBoolean252 ? Static30.method601(new Class39[] { Static51.aClass39_670, Static69.method1226(arg1) }) : null;
		} else {
			return arg0.aClass39Array2[arg1];
		}
	}

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "(B)V")
	public static void method1974() {
		anIntArray436 = null;
		aClass39_1355 = null;
		aClass39_1354 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method1975() {
		try {
			@Pc(2) Graphics local2 = Static16.aCanvas10.getGraphics();
			Static22.aClass6_6.method2067(0, 4, local2);
			Static25.aClass6_7.method2067(0, 357, local2);
			Static47.aClass6_11.method2067(722, 4, local2);
			Static21.aClass6_5.method2067(743, 205, local2);
			Static44.aClass6_10.method2067(0, 0, local2);
			Static51.aClass6_12.method2067(516, 4, local2);
			Static33.aClass6_8.method2067(516, 205, local2);
			Static35.aClass6_9.method2067(496, 357, local2);
			Static118.aClass6_20.method2067(0, 338, local2);
		} catch (@Pc(58) Exception local58) {
			Static16.aCanvas10.repaint();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BLclient!gd;Lclient!gd;)V")
	public static void method1976(@OriginalArg(1) Class1_Sub1_Sub4_Sub3 arg0, @OriginalArg(2) Class1_Sub1_Sub4_Sub3 arg1) {
		if (Static53.aClass1_Sub1_Sub4_Sub4Array7 == null) {
			Static53.aClass1_Sub1_Sub4_Sub4Array7 = Static117.method2020(Static64.aClass39_825, Static4.aClass62_Sub1_7, Static38.aClass39_540);
		}
		if (Static107.aClass1_Sub1_Sub4_Sub1Array10 == null) {
			Static107.aClass1_Sub1_Sub4_Sub1Array10 = Static3.method72(Static4.aClass62_Sub1_7, Static29.aClass39_451, Static38.aClass39_540);
		}
		if (Static70.aClass1_Sub1_Sub4_Sub1Array7 == null) {
			Static70.aClass1_Sub1_Sub4_Sub1Array7 = Static3.method72(Static4.aClass62_Sub1_7, Static87.aClass39_1010, Static38.aClass39_540);
		}
		if (Static77.aClass1_Sub1_Sub4_Sub1Array9 == null) {
			Static77.aClass1_Sub1_Sub4_Sub1Array9 = Static3.method72(Static4.aClass62_Sub1_7, Static88.aClass39_1063, Static38.aClass39_540);
		}
		Static15.method1503(0, 23, 765, 480, 0);
		Static15.method1509(0, 0, 125, 23, 12425273, 9135624);
		Static15.method1509(125, 0, 640, 23, 5197647, 2697513);
		arg1.method741(Static103.aClass39_1275, 62, 15, 0, -1);
		if (Static77.aClass1_Sub1_Sub4_Sub1Array9 != null) {
			Static77.aClass1_Sub1_Sub4_Sub1Array9[1].method492(140, 1);
			arg0.method753(Static25.aClass39_414, 152, 10, 16777215, -1);
			Static77.aClass1_Sub1_Sub4_Sub1Array9[0].method492(140, 12);
			arg0.method753(Static93.aClass39_1131, 152, 21, 16777215, -1);
		}
		if (Static70.aClass1_Sub1_Sub4_Sub1Array7 != null) {
			if (Static122.anIntArray466[0] == 0 && Static101.anIntArray393[0] == 0) {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[2].method492(280, 4);
			} else {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[0].method492(280, 4);
			}
			if (Static122.anIntArray466[0] == 0 && Static101.anIntArray393[0] == 1) {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[3].method492(295, 4);
			} else {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[1].method492(295, 4);
			}
			arg1.method753(Static88.aClass39_1061, 312, 17, 16777215, -1);
			if (Static122.anIntArray466[0] == 1 && Static101.anIntArray393[0] == 0) {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[2].method492(390, 4);
			} else {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[0].method492(390, 4);
			}
			if (Static122.anIntArray466[0] == 1 && Static101.anIntArray393[0] == 1) {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[3].method492(405, 4);
			} else {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[1].method492(405, 4);
			}
			arg1.method753(Static103.aClass39_1274, 422, 17, 16777215, -1);
			if (Static122.anIntArray466[0] == 2 && Static101.anIntArray393[0] == 0) {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[2].method492(500, 4);
			} else {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[0].method492(500, 4);
			}
			if (Static122.anIntArray466[0] == 2 && Static101.anIntArray393[0] == 1) {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[3].method492(515, 4);
			} else {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[1].method492(515, 4);
			}
			arg1.method753(Static86.aClass39_1043, 532, 17, 16777215, -1);
			if (Static122.anIntArray466[0] == 3 && Static101.anIntArray393[0] == 0) {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[2].method492(610, 4);
			} else {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[0].method492(610, 4);
			}
			if (Static122.anIntArray466[0] == 3 && Static101.anIntArray393[0] == 1) {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[3].method492(625, 4);
			} else {
				Static70.aClass1_Sub1_Sub4_Sub1Array7[1].method492(625, 4);
			}
			arg1.method753(Static12.aClass39_236, 642, 17, 16777215, -1);
		}
		Static15.method1503(708, 4, 50, 16, 0);
		arg0.method741(Static121.aClass39_1429, 733, 16, 16777215, -1);
		Static97.anInt3128 = -1;
		if (Static53.aClass1_Sub1_Sub4_Sub4Array7 != null) {
			@Pc(380) int local380 = 8;
			@Pc(388) int local388 = 24;
			@Pc(390) int local390;
			@Pc(392) int local392;
			do {
				local390 = local388;
				local392 = local380;
				if (Static11.anInt499 <= local388 * (local380 - 1)) {
					local380--;
				}
				if (Static11.anInt499 <= local380 * (local388 - 1)) {
					local388--;
				}
				if (Static11.anInt499 <= local380 * (local388 - 1)) {
					local388--;
				}
			} while (local390 != local388 || local380 != local392);
			local390 = (765 - local380 * 88) / (local380 + 1);
			if (local390 > 5) {
				local390 = 5;
			}
			local392 = (480 - local388 * 19) / (local388 + 1);
			@Pc(472) int local472 = (765 - local390 * (local380 - 1) - local380 * 88) / 2;
			if (local392 > 5) {
				local392 = 5;
			}
			@Pc(495) int local495 = (480 - (local388 - 1) * local392 - local388 * 19) / 2;
			@Pc(499) int local499 = local495 + 23;
			@Pc(501) int local501 = 0;
			@Pc(503) int local503 = local472;
			for (@Pc(505) int local505 = 0; local505 < Static11.anInt499; local505++) {
				@Pc(511) Class80 local511 = Static86.aClass80Array1[local505];
				@Pc(513) boolean local513 = true;
				@Pc(518) Class39 local518 = Static69.method1226(local511.anInt3149);
				if (local511.anInt3149 == -1) {
					local513 = false;
					local518 = Static122.aClass39_1432;
				} else if (local511.anInt3149 > 1980) {
					local518 = Static49.aClass39_651;
					local513 = false;
				}
				if (Static29.anInt971 >= local503 && local499 <= Static3.anInt150 && local503 + 88 > Static29.anInt971 && local499 + 19 > Static3.anInt150 && local513) {
					Static97.anInt3128 = local505;
					Static53.aClass1_Sub1_Sub4_Sub4Array7[local511.aBoolean253 ? 1 : 0].method1537(local503, local499);
				} else {
					Static53.aClass1_Sub1_Sub4_Sub4Array7[local511.aBoolean253 ? 1 : 0].method1520(local503, local499);
				}
				if (Static107.aClass1_Sub1_Sub4_Sub1Array10 != null) {
					Static107.aClass1_Sub1_Sub4_Sub1Array10[local511.anInt3157 + (local511.aBoolean253 ? 8 : 0)].method492(local503 + 29, local499);
				}
				arg1.method741(Static69.method1226(local511.anInt3153), local503 + 15, local499 + 9 + 5, 0, -1);
				arg0.method741(local518, local503 + 60, local499 + 14, 268435455, -1);
				local499 += local392 + 19;
				local501++;
				if (local388 <= local501) {
					local499 = local495 + 23;
					local503 += local390 + 88;
					local501 = 0;
				}
			}
		}
		try {
			@Pc(682) Graphics local682 = Static16.aCanvas10.getGraphics();
			Static79.aClass6_18.method2067(0, 0, local682);
		} catch (@Pc(690) Exception local690) {
			Static16.aCanvas10.repaint();
		}
	}
}
