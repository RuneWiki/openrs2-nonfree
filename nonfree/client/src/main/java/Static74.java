import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "Lclient!sc;")
	public static Class1_Sub12_Sub4 aClass1_Sub12_Sub4_1;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
	public static int anInt2127 = 0;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
	public static void method1563() {
		aClass1_Sub12_Sub4_1 = null;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	public static void method1564() {
		Static125.method2300(Static162.aClass20_11);
		Static159.anInt3767++;
		if (Static115.aBoolean227 && Static178.aBoolean312) {
			@Pc(29) int local29 = Static14.anInt481;
			local29 -= Static148.anInt3590;
			if (local29 < Static45.anInt1489) {
				local29 = Static45.anInt1489;
			}
			@Pc(44) int local44 = Static86.anInt2447;
			if (Static162.aClass20_11.anInt1559 + local29 > Static45.anInt1489 - -Static83.aClass20_6.anInt1559) {
				local29 = Static45.anInt1489 + Static83.aClass20_6.anInt1559 - Static162.aClass20_11.anInt1559;
			}
			local44 -= Static143.anInt3530;
			@Pc(76) int local76 = local29 - Static3.anInt108;
			@Pc(79) int local79 = Static162.aClass20_11.anInt1574;
			if (local44 < Static109.anInt2974) {
				local44 = Static109.anInt2974;
			}
			@Pc(97) int local97 = local29 + Static83.aClass20_6.anInt1604 - Static45.anInt1489;
			if (Static162.aClass20_11.anInt1603 + local44 > Static109.anInt2974 + Static83.aClass20_6.anInt1603) {
				local44 = Static109.anInt2974 + Static83.aClass20_6.anInt1603 - Static162.aClass20_11.anInt1603;
			}
			@Pc(122) int local122 = local44 - Static93.anInt2717;
			@Pc(130) int local130 = Static83.aClass20_6.anInt1592 + local44 - Static109.anInt2974;
			if (Static162.aClass20_11.anInt1596 < Static159.anInt3767 && (local79 < local76 || -local79 > local76 || local122 > local79 || -local79 > local122)) {
				Static12.aBoolean39 = true;
			}
			@Pc(167) Class1_Sub23 local167;
			if (Static162.aClass20_11.anObjectArray7 != null && Static12.aBoolean39) {
				local167 = new Class1_Sub23();
				local167.anInt4010 = local130;
				local167.anInt4015 = local97;
				local167.aClass20_13 = Static162.aClass20_11;
				local167.anObjectArray29 = Static162.aClass20_11.anObjectArray7;
				Static1.method43(local167);
			}
			if (Static148.anInt3596 == 0) {
				if (Static12.aBoolean39) {
					if (Static162.aClass20_11.anObjectArray12 != null) {
						local167 = new Class1_Sub23();
						local167.aClass20_14 = Static110.aClass20_8;
						local167.anInt4010 = local130;
						local167.anInt4015 = local97;
						local167.anObjectArray29 = Static162.aClass20_11.anObjectArray12;
						local167.aClass20_13 = Static162.aClass20_11;
						Static1.method43(local167);
					}
					if (Static110.aClass20_8 != null && Static71.method1486(Static162.aClass20_11) != null) {
						Static1.aClass1_Sub8_Sub1_1.method1654(10);
						Static1.aClass1_Sub8_Sub1_1.method1635(Static110.aClass20_8.anInt1630);
						Static1.aClass1_Sub8_Sub1_1.method1640(Static162.aClass20_11.anInt1630);
						Static1.aClass1_Sub8_Sub1_1.method1614(Static162.aClass20_11.anInt1608);
						Static1.aClass1_Sub8_Sub1_1.method1614(Static110.aClass20_8.anInt1608);
					}
				} else if ((Static187.anInt4123 == 1 || Static145.method2574(Static53.anInt1722 - 1)) && Static53.anInt1722 > 2) {
					Static69.method1458();
				} else if (Static53.anInt1722 > 0) {
					Static17.method651(Static53.anInt1722 - 1);
				}
				Static162.aClass20_11 = null;
			}
		} else if (Static159.anInt3767 > 1) {
			Static162.aClass20_11 = null;
		}
	}
}
