import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ua", name = "mb", descriptor = "I")
	public static int anInt3610 = 0;

	@OriginalMember(owner = "client!ua", name = "nb", descriptor = "[I")
	public static int[] anIntArray335 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!ua", name = "rb", descriptor = "Lclient!gg;")
	public static Class28 aClass28_2138 = Static107.method1838("Zu viele Verbindungen von Ihrer Adresse)3");

	@OriginalMember(owner = "client!ua", name = "tb", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
	public static void method2523() {
		aClass28_2138 = null;
		anIntArray335 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BILclient!jc;I)Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3 method2524(@OriginalArg(1) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) int arg2) {
		return Static108.method1851(arg1, arg0, arg2) ? Static88.method1582() : null;
	}

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
	public static void method2525() {
		Static128.aClass2_Sub2_Sub1_2.method1711(230);
		Static128.aClass2_Sub2_Sub1_2.method1666(0L);
	}

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
	public static void method2526() {
		while (true) {
			if (Static151.aClass2_Sub2_Sub1_3.method1716(Static103.anInt2571) >= 27) {
				@Pc(18) int local18 = Static151.aClass2_Sub2_Sub1_3.method1713(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local18] == null) {
						Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local18] = new Class2_Sub4_Sub1_Sub1_Sub1();
						local23 = true;
					}
					@Pc(39) Class2_Sub4_Sub1_Sub1_Sub1 local39 = Static55.aClass2_Sub4_Sub1_Sub1_Sub1Array1[local18];
					Static129.anIntArray274[Static29.anInt884++] = local18;
					local39.anInt1650 = Static156.anInt3491;
					local39.aClass2_Sub4_Sub4_1 = Static127.method2066(Static151.aClass2_Sub2_Sub1_3.method1713(14));
					@Pc(63) int local63 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
					@Pc(68) int local68 = Static151.aClass2_Sub2_Sub1_3.method1713(1);
					if (local68 == 1) {
						Static3.anIntArray228[Static83.anInt2114++] = local18;
					}
					@Pc(84) int local84 = Static151.aClass2_Sub2_Sub1_3.method1713(5);
					if (local84 > 15) {
						local84 -= 32;
					}
					@Pc(95) int local95 = Static151.aClass2_Sub2_Sub1_3.method1713(5);
					@Pc(102) int local102 = Static131.anIntArray277[Static151.aClass2_Sub2_Sub1_3.method1713(3)];
					local39.anInt1628 = local39.aClass2_Sub4_Sub4_1.anInt840;
					local39.anInt1618 = local39.aClass2_Sub4_Sub4_1.anInt854;
					local39.anInt1610 = local39.aClass2_Sub4_Sub4_1.anInt849;
					local39.anInt1649 = local39.aClass2_Sub4_Sub4_1.anInt848;
					if (local95 > 15) {
						local95 -= 32;
					}
					local39.anInt1639 = local39.aClass2_Sub4_Sub4_1.anInt865;
					local39.anInt1646 = local39.aClass2_Sub4_Sub4_1.anInt868;
					if (local23) {
						local39.anInt1623 = local39.anInt1603 = local102;
					}
					local39.anInt1619 = local39.aClass2_Sub4_Sub4_1.anInt842;
					local39.anInt1612 = local39.aClass2_Sub4_Sub4_1.anInt853;
					if (local39.anInt1612 == 0) {
						local39.anInt1603 = 0;
					}
					local39.anInt1608 = local39.aClass2_Sub4_Sub4_1.anInt841;
					local39.method1101(Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0] + local95, local63 == 1, Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0] + local84);
					continue;
				}
			}
			Static151.aClass2_Sub2_Sub1_3.method1717();
			return;
		}
	}
}
