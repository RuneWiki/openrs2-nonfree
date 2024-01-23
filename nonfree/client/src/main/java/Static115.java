import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
	public static int anInt2284;

	@OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
	public static int anInt2287;

	@OriginalMember(owner = "client!ii", name = "p", descriptor = "[J")
	public static long[] aLongArray48 = new long[32];

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)V")
	public static void method1838(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub2 local8 = Static46.method824(3, arg0);
		local8.method299();
	}

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
	public static void method1841() {
		while (true) {
			if (Static237.aClass1_Sub14_Sub1_7.method2662(Static127.anInt2543) >= 11) {
				@Pc(18) int local18 = Static237.aClass1_Sub14_Sub1_7.method2657(11);
				if (local18 != 2047) {
					@Pc(27) boolean local27 = false;
					if (Static195.aClass22_Sub3_Sub2Array1[local18] == null) {
						Static195.aClass22_Sub3_Sub2Array1[local18] = new Class22_Sub3_Sub2();
						local27 = true;
						if (Static280.aClass1_Sub14Array1[local18] != null) {
							Static195.aClass22_Sub3_Sub2Array1[local18].method3668(Static280.aClass1_Sub14Array1[local18], local18);
						}
					}
					Static46.anIntArray79[Static222.anInt4329++] = local18;
					@Pc(68) Class22_Sub3_Sub2 local68 = Static195.aClass22_Sub3_Sub2Array1[local18];
					local68.anInt4614 = Static37.anInt757;
					@Pc(76) int local76 = Static237.aClass1_Sub14_Sub1_7.method2657(5);
					@Pc(81) int local81 = Static237.aClass1_Sub14_Sub1_7.method2657(5);
					if (local76 > 15) {
						local76 -= 32;
					}
					if (local81 > 15) {
						local81 -= 32;
					}
					@Pc(103) int local103 = Static224.anIntArray361[Static237.aClass1_Sub14_Sub1_7.method2657(3)];
					if (local27) {
						local68.anInt4561 = local68.anInt4649 = local103;
					}
					@Pc(117) int local117 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
					if (local117 == 1) {
						Static158.anIntArray179[Static17.anInt300++] = local18;
					}
					@Pc(138) int local138 = Static237.aClass1_Sub14_Sub1_7.method2657(1);
					local68.method3661(Static229.aClass22_Sub3_Sub2_2.anIntArray427[0] + local76, local81 + Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local138 == 1);
					continue;
				}
			}
			Static237.aClass1_Sub14_Sub1_7.method2663();
			return;
		}
	}

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
	public static void method1842() {
		Static38.anInt771 = -1;
		Static290.anInt5498 = 0;
		Static289.anInt5491 = 0;
		Static92.anInt1758 = 1;
		Static297.anInt5629 = 0;
		Static213.anInt4207 = -3;
		Static67.aBoolean109 = false;
	}
}
