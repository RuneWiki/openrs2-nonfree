import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!ae;")
	public static Class5_Sub1 aClass5_Sub1_26;

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
	public static int anInt2669 = 0;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!tc", name = "g", descriptor = "Lclient!kb;")
	public static Class38 aClass38_2 = new Class38();

	@OriginalMember(owner = "client!tc", name = "h", descriptor = "Lclient!rc;")
	public static Class61 aClass61_16 = new Class61();

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1521 = Static106.method1849("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
	public static int anInt2674 = 1;

	@OriginalMember(owner = "client!tc", name = "l", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1522 = Static106.method1849("null");

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V")
	public static void method1881() {
		Static70.method537(Static35.aClass1_Sub10_6);
		Static17.anInt566++;
		if (Static11.aBoolean17 && Static4.aBoolean9) {
			@Pc(24) int local24 = Static50.anInt1542;
			local24 -= Static120.anInt2784;
			@Pc(30) int local30 = Static13.anInt462;
			if (local24 < Static114.anInt2711) {
				local24 = Static114.anInt2711;
			}
			local30 -= Static19.anInt607;
			if (local30 < Static38.anInt2852) {
				local30 = Static38.anInt2852;
			}
			if (Static35.aClass1_Sub10_6.anInt1367 + local24 > Static114.anInt2711 - -Static29.aClass1_Sub10_5.anInt1367) {
				local24 = Static29.aClass1_Sub10_5.anInt1367 + Static114.anInt2711 - Static35.aClass1_Sub10_6.anInt1367;
			}
			if (Static29.aClass1_Sub10_5.anInt1345 + Static38.anInt2852 < Static35.aClass1_Sub10_6.anInt1345 + local30) {
				local30 = Static38.anInt2852 + Static29.aClass1_Sub10_5.anInt1345 - Static35.aClass1_Sub10_6.anInt1345;
			}
			@Pc(93) int local93 = Static35.aClass1_Sub10_6.anInt1394;
			@Pc(98) int local98 = local30 - Static25.anInt691;
			@Pc(102) int local102 = local24 - Static90.anInt1842;
			@Pc(110) int local110 = Static29.aClass1_Sub10_5.anInt1369 + local24 - Static114.anInt2711;
			if (Static35.aClass1_Sub10_6.anInt1357 < Static17.anInt566 && (local93 < local102 || local102 < -local93 || local98 > local93 || -local93 > local98)) {
				Static19.aBoolean28 = true;
			}
			@Pc(142) int local142 = local30 + Static29.aClass1_Sub10_5.anInt1396 - Static38.anInt2852;
			@Pc(151) Class1_Sub5 local151;
			if (Static35.aClass1_Sub10_6.anObjectArray9 != null && Static19.aBoolean28) {
				local151 = new Class1_Sub5();
				local151.anInt465 = local110;
				local151.anObjectArray3 = Static35.aClass1_Sub10_6.anObjectArray9;
				local151.anInt459 = local142;
				local151.aClass1_Sub10_1 = Static35.aClass1_Sub10_6;
				Static38.method2005(local151);
			}
			if (Static122.anInt2828 == 0) {
				if (Static19.aBoolean28) {
					if (Static35.aClass1_Sub10_6.anObjectArray20 != null) {
						local151 = new Class1_Sub5();
						local151.aClass1_Sub10_2 = Static22.aClass1_Sub10_3;
						local151.anInt465 = local110;
						local151.anInt459 = local142;
						local151.anObjectArray3 = Static35.aClass1_Sub10_6.anObjectArray20;
						local151.aClass1_Sub10_1 = Static35.aClass1_Sub10_6;
						Static38.method2005(local151);
					}
					if (Static22.aClass1_Sub10_3 != null && Static128.method2033(Static35.aClass1_Sub10_6) != null) {
						Static127.aClass1_Sub12_Sub1_2.method1227(0);
						Static127.aClass1_Sub12_Sub1_2.method1196(Static35.aClass1_Sub10_6.anInt1348);
						Static127.aClass1_Sub12_Sub1_2.method1196(Static22.aClass1_Sub10_3.anInt1348);
						Static127.aClass1_Sub12_Sub1_2.method1200(Static22.aClass1_Sub10_3.anInt1371);
						Static127.aClass1_Sub12_Sub1_2.method1217(Static35.aClass1_Sub10_6.anInt1371);
					}
				} else if ((Static39.anInt1007 == 1 || Static111.method1878(Static5.anInt228 - 1)) && Static5.anInt228 > 2) {
					Static5.method160();
				} else if (Static5.anInt228 > 0) {
					Static19.method487(Static5.anInt228 - 1);
				}
				Static35.aClass1_Sub10_6 = null;
			}
		} else if (Static17.anInt566 > 1) {
			Static35.aClass1_Sub10_6 = null;
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)Z")
	public static boolean method1882(@OriginalArg(0) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)I")
	public static int method1883(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -1) {
			return 12345678;
		}
		arg1 = (arg0 & 0x7F) * arg1 / 128;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
	public static void method1884() {
		aClass66_1521 = null;
		aClass61_16 = null;
		aClass5_Sub1_26 = null;
		aClass66_1522 = null;
		aClass38_2 = null;
	}
}
