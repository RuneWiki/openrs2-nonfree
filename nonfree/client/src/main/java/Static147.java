import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!sa", name = "nb", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1411 = Static169.method2903("Create a free account");

	@OriginalMember(owner = "client!sa", name = "Z", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1409 = aClass23_1411;

	@OriginalMember(owner = "client!sa", name = "fb", descriptor = "I")
	public static int anInt3708 = 0;

	@OriginalMember(owner = "client!sa", name = "kb", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1410 = Static169.method2903("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
	public static void method2549() {
		aClass23_1411 = null;
		aClass23_1409 = null;
		aClass23_1410 = null;
	}

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)V")
	public static void method2550() {
		while (true) {
			if (Static35.aClass1_Sub8_Sub1_2.method907(Static103.anInt2645) >= 27) {
				@Pc(12) int local12 = Static35.aClass1_Sub8_Sub1_2.method911(15);
				if (local12 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] == null) {
						local19 = true;
						Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12] = new Class1_Sub1_Sub1_Sub1_Sub2();
					}
					@Pc(35) Class1_Sub1_Sub1_Sub1_Sub2 local35 = Static154.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local12];
					Static141.anIntArray476[Static86.anInt2307++] = local12;
					local35.anInt1834 = Static26.anInt845;
					@Pc(53) int local53 = Static57.anIntArray225[Static35.aClass1_Sub8_Sub1_2.method911(3)];
					if (local19) {
						local35.anInt1860 = local35.anInt1843 = local53;
					}
					@Pc(66) int local66 = Static35.aClass1_Sub8_Sub1_2.method911(5);
					@Pc(71) int local71 = Static35.aClass1_Sub8_Sub1_2.method911(5);
					if (local71 > 15) {
						local71 -= 32;
					}
					if (local66 > 15) {
						local66 -= 32;
					}
					@Pc(84) int local84 = Static35.aClass1_Sub8_Sub1_2.method911(1);
					local35.aClass1_Sub1_Sub9_1 = Static2.method111(Static35.aClass1_Sub8_Sub1_2.method911(14));
					@Pc(97) int local97 = Static35.aClass1_Sub8_Sub1_2.method911(1);
					if (local97 == 1) {
						Static60.anIntArray611[Static104.anInt2660++] = local12;
					}
					local35.anInt1820 = local35.aClass1_Sub1_Sub9_1.anInt1541;
					local35.anInt1850 = local35.aClass1_Sub1_Sub9_1.anInt1533;
					local35.anInt1864 = local35.aClass1_Sub1_Sub9_1.anInt1520;
					local35.anInt1817 = local35.aClass1_Sub1_Sub9_1.anInt1526;
					local35.anInt1824 = local35.aClass1_Sub1_Sub9_1.anInt1540;
					local35.anInt1823 = local35.aClass1_Sub1_Sub9_1.anInt1511;
					local35.anInt1859 = local35.aClass1_Sub1_Sub9_1.anInt1517;
					local35.anInt1829 = local35.aClass1_Sub1_Sub9_1.anInt1528;
					local35.anInt1819 = local35.aClass1_Sub1_Sub9_1.anInt1527;
					if (local35.anInt1819 == 0) {
						local35.anInt1843 = 0;
					}
					local35.method1217(Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0] + local71, Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0] - -local66, local84 == 1);
					continue;
				}
			}
			Static35.aClass1_Sub8_Sub1_2.method918();
			return;
		}
	}
}
