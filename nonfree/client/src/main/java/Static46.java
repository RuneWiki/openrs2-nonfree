import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
	public static int anInt4326;

	@OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
	public static int anInt4332;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1653 = Static169.method2903("green:");

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1649 = aClass23_1653;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1650 = Static169.method2903(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1652 = Static169.method2903("No response from server)3");

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1651 = aClass23_1652;

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
	public static int anInt4321 = 0;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "[I")
	public static int[] anIntArray606 = new int[2000];

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1654 = Static169.method2903("Titelbild geladen)3");

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1655 = aClass23_1653;

	@OriginalMember(owner = "client!fc", name = "Y", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1656 = Static169.method2903("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Z)V")
	public static void method3121() {
		aClass23_1649 = null;
		aClass23_1650 = null;
		aClass23_1656 = null;
		aClass23_1654 = null;
		aClass23_1655 = null;
		aClass23_1652 = null;
		aClass23_1653 = null;
		aClass23_1651 = null;
		anIntArray606 = null;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(Z)V")
	public static void method3123() {
		for (@Pc(7) int local7 = 0; local7 < Static104.anInt2660; local7++) {
			@Pc(18) int local18 = Static60.anIntArray611[local7];
			@Pc(22) Class1_Sub1_Sub1_Sub1_Sub2 local22 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local18];
			@Pc(26) int local26 = Static35.aClass1_Sub8_Sub1_2.method861();
			if ((local26 & 0x8) != 0) {
				local22.anInt1840 = Static35.aClass1_Sub8_Sub1_2.method878();
				local22.anInt1833 = Static35.aClass1_Sub8_Sub1_2.method886();
			}
			if ((local26 & 0x40) != 0) {
				local22.aClass1_Sub1_Sub9_1 = Static2.method111(Static35.aClass1_Sub8_Sub1_2.method886());
				local22.anInt1817 = local22.aClass1_Sub1_Sub9_1.anInt1526;
				local22.anInt1824 = local22.aClass1_Sub1_Sub9_1.anInt1540;
				local22.anInt1850 = local22.aClass1_Sub1_Sub9_1.anInt1533;
				local22.anInt1864 = local22.aClass1_Sub1_Sub9_1.anInt1520;
				local22.anInt1829 = local22.aClass1_Sub1_Sub9_1.anInt1528;
				local22.anInt1819 = local22.aClass1_Sub1_Sub9_1.anInt1527;
				local22.anInt1820 = local22.aClass1_Sub1_Sub9_1.anInt1541;
				local22.anInt1859 = local22.aClass1_Sub1_Sub9_1.anInt1517;
				local22.anInt1823 = local22.aClass1_Sub1_Sub9_1.anInt1511;
			}
			@Pc(111) int local111;
			@Pc(115) int local115;
			if ((local26 & 0x10) != 0) {
				local111 = Static35.aClass1_Sub8_Sub1_2.method866();
				local115 = Static35.aClass1_Sub8_Sub1_2.method883();
				local22.method1221(local111, local115, Static26.anInt845);
				local22.anInt1810 = Static26.anInt845 + 300;
				local22.anInt1852 = Static35.aClass1_Sub8_Sub1_2.method883();
				local22.anInt1831 = Static35.aClass1_Sub8_Sub1_2.method861();
			}
			if ((local26 & 0x2) != 0) {
				local111 = Static35.aClass1_Sub8_Sub1_2.method901();
				local115 = Static35.aClass1_Sub8_Sub1_2.method866();
				local22.method1221(local111, local115, Static26.anInt845);
				local22.anInt1810 = Static26.anInt845 + 300;
				local22.anInt1852 = Static35.aClass1_Sub8_Sub1_2.method861();
				local22.anInt1831 = Static35.aClass1_Sub8_Sub1_2.method901();
			}
			if ((local26 & 0x1) != 0) {
				local111 = Static35.aClass1_Sub8_Sub1_2.method886();
				if (local111 == 65535) {
					local111 = -1;
				}
				local115 = Static35.aClass1_Sub8_Sub1_2.method883();
				if (local111 == local22.anInt1842 && local111 != -1) {
					@Pc(240) int local240 = Static157.method2652(local111).anInt4297;
					if (local240 == 1) {
						local22.anInt1846 = local115;
						local22.anInt1812 = 0;
						local22.anInt1849 = 0;
						local22.anInt1862 = 0;
					}
					if (local240 == 2) {
						local22.anInt1812 = 0;
					}
				} else if (local111 == -1 || local22.anInt1842 == -1 || Static157.method2652(local111).anInt4287 >= Static157.method2652(local22.anInt1842).anInt4287) {
					local22.anInt1812 = 0;
					local22.anInt1849 = 0;
					local22.anInt1846 = local115;
					local22.anInt1839 = local22.anInt1863;
					local22.anInt1842 = local111;
					local22.anInt1862 = 0;
				}
			}
			if ((local26 & 0x80) != 0) {
				local22.aClass23_676 = Static35.aClass1_Sub8_Sub1_2.method864();
				local22.anInt1844 = 100;
			}
			if ((local26 & 0x20) != 0) {
				local22.anInt1865 = Static35.aClass1_Sub8_Sub1_2.method902();
				if (local22.anInt1865 == 65535) {
					local22.anInt1865 = -1;
				}
			}
			if ((local26 & 0x4) != 0) {
				local22.anInt1853 = Static35.aClass1_Sub8_Sub1_2.method902();
				local111 = Static35.aClass1_Sub8_Sub1_2.method868();
				if (local22.anInt1853 == 65535) {
					local22.anInt1853 = -1;
				}
				local22.anInt1836 = (local111 & 0xFFFF) + Static26.anInt845;
				local22.anInt1821 = 0;
				local22.anInt1855 = local111 >> 16;
				local22.anInt1822 = 0;
				if (local22.anInt1836 > Static26.anInt845) {
					local22.anInt1822 = -1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(JB)V")
	public static void method3124(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static37.anInt996 >= 100 && Static61.anInt1648 != 1 || Static37.anInt996 >= 200) {
			Static73.method1339(Static149.aClass23_1416, Static101.aClass23_1001, 0);
			return;
		}
		@Pc(33) Class23 local33 = Static8.method183(arg0).method667();
		for (@Pc(35) int local35 = 0; local35 < Static37.anInt996; local35++) {
			if (Static106.aLongArray5[local35] == arg0) {
				Static73.method1339(Static149.method2571(new Class23[] { local33, Static76.aClass23_755 }), Static101.aClass23_1001, 0);
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static65.anInt3673; local70++) {
			if (arg0 == Static70.aLongArray4[local70]) {
				Static73.method1339(Static149.method2571(new Class23[] { Static65.aClass23_1389, local33, Static90.aClass23_902 }), Static101.aClass23_1001, 0);
				return;
			}
		}
		if (local33.method651(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.aClass23_68)) {
			Static73.method1339(Static2.aClass23_76, Static101.aClass23_1001, 0);
			return;
		}
		Static133.aClass23Array19[Static37.anInt996] = local33;
		Static106.aLongArray5[Static37.anInt996] = arg0;
		Static72.anIntArray264[Static37.anInt996] = 0;
		Static70.anIntArray255[Static37.anInt996] = 0;
		Static23.anInt698 = Static176.anInt4191;
		Static37.anInt996++;
		Static25.aClass1_Sub8_Sub1_1.method919(118);
		Static25.aClass1_Sub8_Sub1_1.method873(arg0);
	}
}
