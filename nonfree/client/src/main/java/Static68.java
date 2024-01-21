import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!md", name = "i", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_19;

	@OriginalMember(owner = "client!md", name = "n", descriptor = "J")
	public static long aLong73;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1055 = Static106.method1849(" loggt sich aus)3");

	@OriginalMember(owner = "client!md", name = "m", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1062 = Static106.method1849("wave2:");

	@OriginalMember(owner = "client!md", name = "b", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1056 = aClass66_1062;

	@OriginalMember(owner = "client!md", name = "d", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1057 = Static106.method1849("Select a world");

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1058 = aClass66_1057;

	@OriginalMember(owner = "client!md", name = "g", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1059 = Static106.method1849("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!md", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1060 = Static106.method1849("<col=ff9040>");

	@OriginalMember(owner = "client!md", name = "k", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1061 = Static106.method1849(" weitere Optionen");

	@OriginalMember(owner = "client!md", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1063 = aClass66_1062;

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(ILclient!gf;Lclient!gf;)V")
	public static void method1377(@OriginalArg(1) Class1_Sub1_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) Class1_Sub1_Sub2_Sub2_Sub1 arg1) {
		if (Static60.aBoolean74) {
			Static34.method69(arg1, arg0);
			return;
		}
		if (Static11.anInt398 == 0 || Static11.anInt398 == 5) {
			arg0.method781(Static116.aClass66_1569, 382, 225, 16777215, -1);
			Static115.method1662(230, 233, 304, 34, 9179409);
			Static115.method1662(231, 234, 302, 32, 0);
			Static115.method1670(232, 235, Static11.anInt397 * 3, 30, 9179409);
			Static115.method1670(Static11.anInt397 * 3 + 232, 235, 300 - Static11.anInt397 * 3, 30, 0);
			arg0.method781(Static109.aClass66_1462, 382, 256, 16777215, -1);
		}
		@Pc(92) short local92;
		@Pc(116) int local116;
		if (Static11.anInt398 == 20) {
			local92 = 211;
			Static96.aClass1_Sub1_Sub2_Sub3_5.method997(382 - Static96.aClass1_Sub1_Sub2_Sub3_5.anInt1432 / 2, -(Static96.aClass1_Sub1_Sub2_Sub3_5.anInt1429 / 2) + 271);
			arg0.method781(Static109.aClass66_1479, 382, 211, 16776960, 0);
			local116 = local92 + 15;
			arg0.method781(Static109.aClass66_1452, 382, 226, 16776960, 0);
			@Pc(124) int local124 = local116 + 15;
			arg0.method781(Static109.aClass66_1491, 382, 241, 16776960, 0);
			@Pc(132) int local132 = local124 + 15;
			@Pc(133) int local133 = local132 + 10;
			arg0.method790(Static41.method897(new Class66[] { Static133.aClass66_1738, Static110.method772(Static109.aClass66_1489) }), 272, 266, 16777215, 0);
			@Pc(153) int local153 = local133 + 15;
			arg0.method790(Static41.method897(new Class66[] { Static84.aClass66_1199, Static109.aClass66_1472.method1827() }), 274, 281, 16777215, 0);
			@Pc(174) int local174 = local153 + 15;
		}
		if (Static11.anInt398 == 10) {
			Static96.aClass1_Sub1_Sub2_Sub3_5.method997(202, 171);
			if (Static80.anInt2175 == 0) {
				local92 = 251;
				arg0.method781(Static87.aClass66_1275, 382, 251, 16776960, 0);
				local116 = local92 + 30;
				Static89.aClass1_Sub1_Sub2_Sub3_2.method997(229, 271);
				arg0.method773(Static127.aClass66_1692, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static89.aClass1_Sub1_Sub2_Sub3_2.method997(389, 271);
				arg0.method773(Static104.aClass66_1428, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static80.anInt2175 == 2) {
				local92 = 211;
				arg0.method781(Static109.aClass66_1479, 382, 211, 16776960, 0);
				local116 = local92 + 15;
				arg0.method781(Static109.aClass66_1452, 382, 226, 16776960, 0);
				local116 += 15;
				arg0.method781(Static109.aClass66_1491, 382, 241, 16776960, 0);
				local116 += 15;
				local116 += 10;
				arg0.method790(Static41.method897(new Class66[] { Static133.aClass66_1738, Static110.method772(Static109.aClass66_1489), Static22.anInt636 % 40 < 20 & Static54.anInt1753 == 0 ? Static15.aClass66_1754 : Static109.aClass66_1463 }), 272, 266, 16777215, 0);
				local116 += 15;
				arg0.method790(Static41.method897(new Class66[] { Static84.aClass66_1199, Static109.aClass66_1472.method1827(), Static22.anInt636 % 40 < 20 & Static54.anInt1753 == 1 ? Static15.aClass66_1754 : Static109.aClass66_1463 }), 274, 281, 16777215, 0);
				local116 += 15;
				Static89.aClass1_Sub1_Sub2_Sub3_2.method997(229, 301);
				arg0.method781(Static16.aClass66_312, 302, 326, 16777215, 0);
				Static89.aClass1_Sub1_Sub2_Sub3_2.method997(389, 301);
				arg0.method781(Static102.aClass66_1421, 462, 326, 16777215, 0);
			} else if (Static80.anInt2175 == 3) {
				arg0.method781(Static19.aClass66_369, 382, 211, 16776960, 0);
				local92 = 236;
				arg0.method781(Static14.aClass66_301, 382, 236, 16777215, 0);
				local116 = local92 + 15;
				arg0.method781(Static32.aClass66_493, 382, 251, 16777215, 0);
				local116 += 15;
				arg0.method781(Static85.aClass66_1218, 382, 266, 16777215, 0);
				local116 += 15;
				arg0.method781(Static8.aClass66_213, 382, 281, 16777215, 0);
				Static89.aClass1_Sub1_Sub2_Sub3_2.method997(309, 301);
				arg0.method781(Static102.aClass66_1421, 382, 326, 16777215, 0);
				local116 += 15;
			}
		}
		if (Static20.anInt616 != 1) {
			if (Static111.anInt2655 > 0) {
				Static54.method1234(Static111.anInt2655);
				Static111.anInt2655 = 0;
			}
			Static41.method899();
		}
		Static84.aClass1_Sub1_Sub2_Sub3Array9[Static13.aBoolean18 ? 1 : 0].method997(725, 463);
		if (Static11.anInt398 > 5 && Static109.anInt2626 != 2 && Static129.anInt2913 == 0) {
			if (Static86.aClass1_Sub1_Sub2_Sub3_1 == null) {
				Static86.aClass1_Sub1_Sub2_Sub3_1 = Static124.method2009(Static112.aClass5_Sub1_26, Static109.aClass66_1463, Static61.aClass66_977);
			} else {
				Static86.aClass1_Sub1_Sub2_Sub3_1.method997(5, 463);
				arg0.method781(Static41.method897(new Class66[] { Static51.aClass66_853, Static129.aClass66_1703, Static88.method1632(Static118.anInt2768) }), 55, 478, 16777215, 0);
				if (Static71.aClass83_1 == null) {
					arg1.method781(Static92.aClass66_1325, 55, 492, 16777215, 0);
				} else {
					arg1.method781(Static26.aClass66_440, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(616) Graphics local616 = Static104.aCanvas1.getGraphics();
			Static3.aClass6_1.method906(local616);
		} catch (@Pc(628) Exception local628) {
			Static104.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(BLclient!mc;)Lclient!sc;")
	public static Class66 method1378(@OriginalArg(1) Class1_Sub12 arg0) {
		return Static11.method362(arg0);
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIIZLclient!he;I)V")
	public static void method1379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class1_Sub10 arg5, @OriginalArg(7) int arg6) {
		if (Static28.aBoolean32) {
			Static58.anInt1821 = 32;
		} else {
			Static58.anInt1821 = 0;
		}
		Static28.aBoolean32 = false;
		@Pc(133) int local133;
		if (Static122.anInt2828 != 0) {
			if (arg4 >= arg1 && arg1 + 16 > arg4 && arg2 <= arg0 && arg2 + 16 > arg0) {
				arg5.anInt1396 -= 4;
				Static70.method537(arg5);
			} else if (arg1 <= arg4 && arg4 < arg1 + 16 && arg0 >= arg6 + arg2 - 16 && arg2 + arg6 > arg0) {
				arg5.anInt1396 += 4;
				Static70.method537(arg5);
			} else if (arg4 >= arg1 - Static58.anInt1821 && arg1 + Static58.anInt1821 + 16 > arg4 && arg0 >= arg2 + 16 && arg2 + arg6 - 16 > arg0) {
				local133 = arg6 * (arg6 - 32) / arg3;
				if (local133 < 8) {
					local133 = 8;
				}
				@Pc(150) int local150 = arg0 - arg2 - local133 / 2 - 16;
				@Pc(157) int local157 = arg6 - local133 - 32;
				arg5.anInt1396 = (arg3 - arg6) * local150 / local157;
				Static70.method537(arg5);
				Static28.aBoolean32 = true;
			}
		}
		if (Static121.anInt2808 == 0) {
			return;
		}
		local133 = arg5.anInt1367;
		if (arg4 >= arg1 - local133 && arg0 >= arg2 && arg1 + 16 > arg4 && arg2 + arg6 >= arg0) {
			arg5.anInt1396 += Static121.anInt2808 * 45;
			Static70.method537(arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(III)I")
	public static int method1380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (arg1 + local12) / arg0 - local12;
	}

	@OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
	public static void method1381() {
		aClass66_1056 = null;
		aClass66_1057 = null;
		aClass66_1062 = null;
		aClass66_1060 = null;
		aClass5_Sub1_19 = null;
		aClass66_1055 = null;
		aClass66_1059 = null;
		aClass66_1061 = null;
		aClass66_1063 = null;
		aClass66_1058 = null;
	}
}
