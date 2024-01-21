import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!pf", name = "Y", descriptor = "[I")
	public static int[] anIntArray336;

	@OriginalMember(owner = "client!pf", name = "bb", descriptor = "Lclient!qh;")
	public static Class3_Sub5_Sub2 aClass3_Sub5_Sub2_2;

	@OriginalMember(owner = "client!pf", name = "U", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1032 = Static65.method1172("Ausw-=hlen");

	@OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
	public static int anInt3005 = -1;

	@OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
	public static int anInt3006 = 0;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
	public static void method2145() {
		Static143.aClass57_23.method1715();
		Static128.aClass57_19.method1715();
		Static180.aClass57_32.method1715();
		Static174.aClass57_30.method1715();
		Static13.aClass57_2.method1715();
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(Z)V")
	public static void method2146() {
		for (@Pc(15) Class3_Sub15 local15 = (Class3_Sub15) Static86.aClass59_6.method1731(); local15 != null; local15 = (Class3_Sub15) Static86.aClass59_6.method1734()) {
			if (local15.aClass3_Sub2_Sub9_1 != null) {
				local15.method1572();
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!jg;III)[Lclient!ob;")
	public static Class3_Sub2_Sub3_Sub3[] method2147(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static122.method2089(arg1, arg0, arg2) ? Static30.method517() : null;
	}

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
	public static void method2148() {
		aClass3_Sub5_Sub2_2 = null;
		aClass46_1032 = null;
		anIntArray336 = null;
	}

	@OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
	public static void method2149() {
		Static142.method2373(Static63.aClass33_5);
		Static71.anInt1841++;
		if (Static84.aBoolean88 && Static64.aBoolean63) {
			@Pc(34) int local34 = Static149.anInt3582;
			@Pc(36) int local36 = Static85.anInt676;
			local34 -= Static163.anInt3627;
			if (local34 < Static122.anInt2904) {
				local34 = Static122.anInt2904;
			}
			if (Static63.aClass33_5.anInt1428 + local34 > Static30.aClass33_2.anInt1428 + Static122.anInt2904) {
				local34 = Static122.anInt2904 + Static30.aClass33_2.anInt1428 - Static63.aClass33_5.anInt1428;
			}
			local36 -= Static1.anInt15;
			@Pc(80) int local80 = local34 - Static119.anInt2823;
			if (local36 < Static29.anInt698) {
				local36 = Static29.anInt698;
			}
			@Pc(92) int local92 = Static63.aClass33_5.anInt1446;
			if (Static30.aClass33_2.anInt1424 + Static29.anInt698 < local36 + Static63.aClass33_5.anInt1424) {
				local36 = Static29.anInt698 + Static30.aClass33_2.anInt1424 - Static63.aClass33_5.anInt1424;
			}
			@Pc(118) int local118 = Static30.aClass33_2.anInt1465 + local36 - Static29.anInt698;
			@Pc(122) int local122 = local36 - anInt3005;
			if (Static63.aClass33_5.anInt1467 < Static71.anInt1841 && (local92 < local122 || -local92 > local122 || local92 < local80 || local80 < -local92)) {
				Static28.aBoolean25 = true;
			}
			@Pc(153) int local153 = local34 + Static30.aClass33_2.anInt1486 - Static122.anInt2904;
			@Pc(162) Class3_Sub14 local162;
			if (Static63.aClass33_5.anObjectArray25 != null && Static28.aBoolean25) {
				local162 = new Class3_Sub14();
				local162.anInt2221 = local118;
				local162.anInt2225 = local153;
				local162.anObjectArray28 = Static63.aClass33_5.anObjectArray25;
				local162.aClass33_10 = Static63.aClass33_5;
				Static71.method1217(local162);
			}
			if (Static56.anInt1508 == 0) {
				if (Static28.aBoolean25) {
					if (Static63.aClass33_5.anObjectArray14 != null) {
						local162 = new Class3_Sub14();
						local162.aClass33_10 = Static63.aClass33_5;
						local162.aClass33_9 = Static42.aClass33_3;
						local162.anObjectArray28 = Static63.aClass33_5.anObjectArray14;
						local162.anInt2225 = local153;
						local162.anInt2221 = local118;
						Static71.method1217(local162);
					}
					if (Static42.aClass33_3 != null && Static122.method2083(Static63.aClass33_5) != null) {
						Static133.aClass3_Sub4_Sub1_3.method233(142);
						Static133.aClass3_Sub4_Sub1_3.method181(Static42.aClass33_3.anInt1468);
						Static133.aClass3_Sub4_Sub1_3.method219(Static42.aClass33_3.anInt1434);
						Static133.aClass3_Sub4_Sub1_3.method188(Static63.aClass33_5.anInt1434);
						Static133.aClass3_Sub4_Sub1_3.method183(Static63.aClass33_5.anInt1468);
					}
				} else if ((Static167.anInt734 == 1 || Static25.method2912(Static87.anInt2129 - 1)) && Static87.anInt2129 > 2) {
					Static57.method1071();
				} else if (Static87.anInt2129 > 0) {
					Static102.method1679(Static87.anInt2129 - 1);
				}
				Static63.aClass33_5 = null;
			}
		} else if (Static71.anInt1841 > 1) {
			Static63.aClass33_5 = null;
		}
	}
}
