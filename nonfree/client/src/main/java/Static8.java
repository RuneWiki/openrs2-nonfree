import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "N", descriptor = "Lclient!jd;")
	public static Class36 aClass36_7;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "[I")
	public static int[] anIntArray26 = new int[50];

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "Lclient!ke;")
	private static Class39 aClass39_80 = Static2.method66("wishes to trade with you)3");

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "[I")
	public static int[] anIntArray27 = new int[500];

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "Lclient!ke;")
	public static Class39 aClass39_81 = aClass39_80;

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "Lclient!qd;")
	public static Class54 aClass54_5 = new Class54(100);

	@OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
	public static int anInt185 = 0;

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(ILclient!jd;)V")
	public static void method121(@OriginalArg(1) Class36 arg0) {
		Static6.aClass36_75 = arg0;
		Static49.anInt1375 = Static6.aClass36_75.method1763(16);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZLclient!jd;Lclient!jd;)V")
	public static void method122(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class36 arg1, @OriginalArg(3) Class36 arg2) {
		Static29.aClass36_22 = arg2;
		Static96.aClass36_65 = arg1;
		Static5.aBoolean3 = arg0;
		Static82.anInt2218 = Static29.aClass36_22.method1763(10);
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
	public static void method123() {
		if (Static39.anInt1172 != 1) {
			return;
		}
		if (Static2.anInt91 >= 6 && Static2.anInt91 <= 106 && Static93.anInt2442 >= 467 && Static93.anInt2442 <= 499) {
			Static53.aBoolean80 = true;
			Static31.aBoolean91 = true;
			Static6.anInt2870 = (Static6.anInt2870 + 1) % 4;
			Static50.aClass2_Sub5_Sub1_2.method1302(164);
			Static50.aClass2_Sub5_Sub1_2.method1252(Static6.anInt2870);
			Static50.aClass2_Sub5_Sub1_2.method1252(Static96.anInt2634);
			Static50.aClass2_Sub5_Sub1_2.method1252(Static78.anInt2150);
		}
		if (Static2.anInt91 >= 135 && Static2.anInt91 <= 235 && Static93.anInt2442 >= 467 && Static93.anInt2442 <= 499) {
			Static53.aBoolean80 = true;
			Static96.anInt2634 = (Static96.anInt2634 + 1) % 3;
			Static31.aBoolean91 = true;
			Static50.aClass2_Sub5_Sub1_2.method1302(164);
			Static50.aClass2_Sub5_Sub1_2.method1252(Static6.anInt2870);
			Static50.aClass2_Sub5_Sub1_2.method1252(Static96.anInt2634);
			Static50.aClass2_Sub5_Sub1_2.method1252(Static78.anInt2150);
		}
		if (Static2.anInt91 >= 273 && Static2.anInt91 <= 373 && Static93.anInt2442 >= 467 && Static93.anInt2442 <= 499) {
			Static31.aBoolean91 = true;
			Static78.anInt2150 = (Static78.anInt2150 + 1) % 3;
			Static53.aBoolean80 = true;
			Static50.aClass2_Sub5_Sub1_2.method1302(164);
			Static50.aClass2_Sub5_Sub1_2.method1252(Static6.anInt2870);
			Static50.aClass2_Sub5_Sub1_2.method1252(Static96.anInt2634);
			Static50.aClass2_Sub5_Sub1_2.method1252(Static78.anInt2150);
		}
		if (Static2.anInt91 < 412 || Static2.anInt91 > 512 || Static93.anInt2442 < 467 || Static93.anInt2442 > 499) {
			return;
		}
		if (Static78.anInt2159 != -1) {
			Static87.method1642(Static31.aClass39_782, 0, Static86.aClass39_1048);
			return;
		}
		Static12.method257();
		if (Static19.anInt574 != -1) {
			Static86.aClass39_1050 = Static86.aClass39_1048;
			Static46.anInt1247 = Static78.anInt2159 = Static19.anInt574;
			Static67.aBoolean96 = false;
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
	public static void method124() {
		Static84.method2051();
		if (Static41.anInt1189 == 1) {
			Static101.aClass2_Sub1_Sub4_Sub2Array10[Static53.anInt1469 / 100].method1040(Static57.anInt1654 - 12, Static105.anInt2801 - 8 + -4);
		}
		if (Static41.anInt1189 == 2) {
			Static101.aClass2_Sub1_Sub4_Sub2Array10[Static53.anInt1469 / 100 + 4].method1040(Static57.anInt1654 - 4 - 8, Static105.anInt2801 + -8 + -4);
		}
		if (Static47.anInt1323 != -1) {
			Static15.method2039(Static47.anInt1323);
			Static6.method2060(512, 0, 0, Static47.anInt1323, -1, 0, 4, 334);
		}
		if (Static78.anInt2159 != -1) {
			Static15.method2039(Static78.anInt2159);
			Static6.method2060(512, 0, 0, Static78.anInt2159, -1, 0, 0, 334);
		}
		Static2.method55();
		if (!Static22.aBoolean36) {
			Static73.method1501();
			Static60.method1137();
		} else if (Static7.anInt162 == 0) {
			Static23.method444();
		}
		if (Static66.anInt1920 == 1) {
			Static16.aClass2_Sub1_Sub4_Sub2_1.method1040(472, 296);
		}
		@Pc(176) int local176;
		if (Static10.aBoolean10) {
			@Pc(115) byte local115 = 20;
			@Pc(117) int local117 = 16776960;
			if (Static27.anInt814 < 30 && Static35.aBoolean136) {
				local117 = 16711680;
			}
			if (Static27.anInt814 < 20 && !Static35.aBoolean136) {
				local117 = 16711680;
			}
			Static49.aClass2_Sub1_Sub4_Sub1_2.method237(Static20.method431(new Class39[] { Static31.aClass39_777, Static31.method1267(Static27.anInt814) }), 20, local117);
			@Pc(154) Runtime local154 = Runtime.getRuntime();
			local117 = 16776960;
			@Pc(166) int local166 = (int) ((local154.totalMemory() - local154.freeMemory()) / 1024L);
			if (local166 > 32768 && Static35.aBoolean136) {
				local117 = 16711680;
			}
			local176 = local115 + 15;
			if (local166 > 65536 && !Static35.aBoolean136) {
				local117 = 16711680;
			}
			Static49.aClass2_Sub1_Sub4_Sub1_2.method237(Static20.method431(new Class39[] { Static37.aClass39_471, Static31.method1267(local166), Static66.aClass39_847 }), 35, local117);
			local176 += 15;
			if (Static77.aBoolean99) {
				Static49.aClass2_Sub1_Sub4_Sub1_2.method237(Static71.aClass39_898, 50, 16711680);
				local176 += 15;
				Static77.aBoolean99 = false;
			}
			if (Static22.aBoolean35) {
				Static49.aClass2_Sub1_Sub4_Sub1_2.method237(Static60.aClass39_705, local176, 16711680);
				local176 += 15;
				Static22.aBoolean35 = false;
			}
			if (Static54.aBoolean81) {
				Static49.aClass2_Sub1_Sub4_Sub1_2.method237(Static95.aClass39_1154, local176, 16711680);
				Static54.aBoolean81 = false;
				local176 += 15;
			}
		}
		if (Static104.anInt2782 == 0) {
			return;
		}
		@Pc(248) int local248 = Static104.anInt2782 / 50;
		local176 = local248 / 60;
		@Pc(256) int local256 = local248 % 60;
		if (local256 < 10) {
			Static49.aClass2_Sub1_Sub4_Sub1_2.method234(Static20.method431(new Class39[] { Static67.aClass39_864, Static31.method1267(local176), Static88.aClass39_484, Static31.method1267(local256) }), 4, 329, 16776960);
		} else {
			Static49.aClass2_Sub1_Sub4_Sub1_2.method234(Static20.method431(new Class39[] { Static67.aClass39_864, Static31.method1267(local176), Static10.aClass39_118, Static31.method1267(local256) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!ba", name = "d", descriptor = "(B)V")
	public static void method125() {
		anIntArray27 = null;
		aClass39_81 = null;
		anIntArray26 = null;
		aClass36_7 = null;
		aClass39_80 = null;
		aClass54_5 = null;
	}
}
