import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bf", name = "J", descriptor = "Lclient!dn;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!bf", name = "L", descriptor = "[I")
	public static int[] anIntArray42;

	@OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
	public static int anInt579;

	@OriginalMember(owner = "client!bf", name = "V", descriptor = "[S")
	public static short[] aShortArray5;

	@OriginalMember(owner = "client!bf", name = "W", descriptor = "Lclient!pf;")
	public static Class36_Sub3_Sub1 aClass36_Sub3_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLclient!pk;)I")
	public static int method391(@OriginalArg(1) Class132 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method3166(Static16.anInt3523)) {
			local10++;
		}
		if (arg0.method3166(Static58.anInt2231)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "(B)V")
	public static void method393() {
		if (Static211.anInt4338 == 2) {
			if (Static99.anInt2070 == Static127.anInt2559 && Static232.anInt4701 == Static229.anInt4666) {
				Static211.anInt4338 = 0;
				if (Static269.aBoolean399 && Static36.aBooleanArray2[81] && Static185.anInt3679 > 2) {
					Static28.method479(Static185.anInt3679 - 2);
				} else {
					Static28.method479(Static185.anInt3679 - 1);
				}
			}
		} else if (Static127.anInt2559 == Static59.anInt1292 && Static89.anInt1907 == Static229.anInt4666) {
			Static211.anInt4338 = 0;
			if (Static269.aBoolean399 && Static36.aBooleanArray2[81] && Static185.anInt3679 > 2) {
				Static28.method479(Static185.anInt3679 - 2);
			} else {
				Static28.method479(Static185.anInt3679 - 1);
			}
		} else {
			Static99.anInt2070 = Static59.anInt1292;
			Static232.anInt4701 = Static89.anInt1907;
			Static211.anInt4338 = 2;
		}
	}

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "(B)V")
	public static void method394() {
		Static242.method3646();
		Static212.aClass8_Sub1_Sub7_9 = null;
		Static136.anInt2741 = -1;
		Static123.method1978();
		Static29.aClass125_9.method2950();
		Static105.aClass77_1 = new Class77();
		((Class49_Sub1) Static96.anInterface4_1).method1275();
		Static131.method2094();
		Static186.aClass28Array1 = new Class28[255];
		Static186.anInt3748 = 0;
		Static205.method3252();
		Static6.method54();
		Static274.method4076();
		Static15.method286(false);
		Static120.method1938();
		Static219.method3425();
		for (@Pc(46) int local46 = 0; local46 < 2048; local46++) {
			@Pc(53) Class36_Sub3_Sub1 local53 = Static230.aClass36_Sub3_Sub1Array1[local46];
			if (local53 != null) {
				local53.anObject4 = null;
			}
		}
		if (Static116.aBoolean188) {
			Static6.method43();
			Static256.method3840(Static270.aBoolean450);
			Static223.method3486();
		}
		Static105.method1705(Static145.aClass132_55, Static35.aClass132_13);
		Static63.method979(Static145.aClass132_55);
		Static230.aClass8_Sub1_Sub7_10 = null;
		Static58.aClass8_Sub1_Sub7_5 = null;
		Static211.aClass8_Sub1_Sub7_8 = null;
		Static46.aClass8_Sub1_Sub7_1 = null;
		Static175.aClass8_Sub1_Sub7_6 = null;
		if (Static23.anInt618 == 5) {
			Static213.method3342(Static145.aClass132_55);
		}
		if (Static23.anInt618 == 10) {
			Static179.method2743(false);
		}
		if (Static23.anInt618 == 30) {
			Static49.method774(25);
		}
	}
}
