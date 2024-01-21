import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "Lclient!ub;")
	public static Class1_Sub11_Sub3 aClass1_Sub11_Sub3_2;

	@OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
	public static int anInt4011;

	@OriginalMember(owner = "client!ud", name = "e", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1529 = Static169.method2903("leuchten2:");

	@OriginalMember(owner = "client!ud", name = "f", descriptor = "[Lclient!ed;")
	public static Class23[] aClass23Array22 = new Class23[100];

	@OriginalMember(owner = "client!ud", name = "k", descriptor = "Lclient!td;")
	public static Class79 aClass79_25 = new Class79(64);

	@OriginalMember(owner = "client!ud", name = "n", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1530 = Static169.method2903("headicons_hint");

	@OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
	public static int anInt4012 = 0;

	@OriginalMember(owner = "client!ud", name = "r", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1531 = Static169.method2903(")3runescape)3com");

	@OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
	public static int anInt4013 = 0;

	@OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
	public static int anInt4014 = 0;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
	public static void method2825() {
		aClass23_1529 = null;
		aClass23_1530 = null;
		aClass23Array22 = null;
		aClass1_Sub11_Sub3_2 = null;
		aClass23_1531 = null;
		aClass79_25 = null;
	}

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
	public static void method2827() {
		while (true) {
			if (Static35.aClass1_Sub8_Sub1_2.method907(Static103.anInt2645) >= 11) {
				@Pc(19) int local19 = Static35.aClass1_Sub8_Sub1_2.method911(11);
				if (local19 != 2047) {
					@Pc(24) boolean local24 = false;
					if (Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19] == null) {
						local24 = true;
						Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19] = new Class1_Sub1_Sub1_Sub1_Sub1();
						if (Static36.aClass1_Sub8Array1[local19] != null) {
							Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19].method95(Static36.aClass1_Sub8Array1[local19]);
						}
					}
					Static112.anIntArray382[Static152.anInt3549++] = local19;
					@Pc(60) Class1_Sub1_Sub1_Sub1_Sub1 local60 = Static9.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local19];
					local60.anInt1834 = Static26.anInt845;
					@Pc(68) int local68 = Static35.aClass1_Sub8_Sub1_2.method911(5);
					@Pc(73) int local73 = Static35.aClass1_Sub8_Sub1_2.method911(1);
					if (local68 > 15) {
						local68 -= 32;
					}
					@Pc(84) int local84 = Static35.aClass1_Sub8_Sub1_2.method911(1);
					if (local84 == 1) {
						Static60.anIntArray611[Static104.anInt2660++] = local19;
					}
					@Pc(104) int local104 = Static57.anIntArray225[Static35.aClass1_Sub8_Sub1_2.method911(3)];
					if (local24) {
						local60.anInt1860 = local60.anInt1843 = local104;
					}
					@Pc(117) int local117 = Static35.aClass1_Sub8_Sub1_2.method911(5);
					if (local117 > 15) {
						local117 -= 32;
					}
					local60.method1217(local68 + Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray250[0], local117 + Static60.aClass1_Sub1_Sub1_Sub1_Sub1_103.anIntArray248[0], local73 == 1);
					continue;
				}
			}
			Static35.aClass1_Sub8_Sub1_2.method918();
			return;
		}
	}
}
