import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!eg", name = "e", descriptor = "Lclient!ab;")
	public static Class3 aClass3_24;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "[I")
	public static final int[] anIntArray253 = new int[1000];

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1377 = Static187.method3089("welle2:");

	@OriginalMember(owner = "client!eg", name = "c", descriptor = "I")
	public static int anInt2856 = 0;

	@OriginalMember(owner = "client!eg", name = "f", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1378 = Static187.method3089(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V")
	public static void method2108() {
		while (true) {
			if (Static18.aClass1_Sub14_Sub1_2.method3065(Static63.anInt3562) >= 27) {
				@Pc(20) int local20 = Static18.aClass1_Sub14_Sub1_2.method3070(15);
				if (local20 != 32767) {
					@Pc(25) boolean local25 = false;
					if (Static177.aClass8_Sub3_Sub2Array1[local20] == null) {
						Static177.aClass8_Sub3_Sub2Array1[local20] = new Class8_Sub3_Sub2();
						local25 = true;
					}
					@Pc(41) Class8_Sub3_Sub2 local41 = Static177.aClass8_Sub3_Sub2Array1[local20];
					Static103.anIntArray167[Static153.anInt3186++] = local20;
					local41.anInt3595 = Static155.anInt2981;
					local41.aClass1_Sub3_Sub13_1 = Static27.method494(Static18.aClass1_Sub14_Sub1_2.method3070(14));
					@Pc(65) int local65 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
					@Pc(72) int local72 = Static41.anIntArray84[Static18.aClass1_Sub14_Sub1_2.method3070(3)];
					if (local25) {
						local41.anInt3577 = local41.anInt3611 = local72;
					}
					@Pc(85) int local85 = Static18.aClass1_Sub14_Sub1_2.method3070(1);
					if (local85 == 1) {
						Static111.anIntArray183[Static147.anInt2991++] = local20;
					}
					@Pc(103) int local103 = Static18.aClass1_Sub14_Sub1_2.method3070(5);
					if (local103 > 15) {
						local103 -= 32;
					}
					@Pc(114) int local114 = Static18.aClass1_Sub14_Sub1_2.method3070(5);
					local41.anInt3583 = local41.aClass1_Sub3_Sub13_1.anInt2256;
					local41.anInt3601 = local41.aClass1_Sub3_Sub13_1.anInt2250;
					if (local114 > 15) {
						local114 -= 32;
					}
					local41.anInt3602 = local41.aClass1_Sub3_Sub13_1.anInt2262;
					local41.anInt3571 = local41.aClass1_Sub3_Sub13_1.anInt2253;
					local41.anInt3597 = local41.aClass1_Sub3_Sub13_1.anInt2248;
					local41.anInt3565 = local41.aClass1_Sub3_Sub13_1.anInt2251;
					local41.anInt3576 = local41.aClass1_Sub3_Sub13_1.anInt2260;
					local41.anInt3574 = local41.aClass1_Sub3_Sub13_1.anInt2263;
					if (local41.anInt3597 == 0) {
						local41.anInt3611 = 0;
					}
					local41.anInt3610 = local41.aClass1_Sub3_Sub13_1.anInt2258;
					local41.method2678(Static15.aClass8_Sub3_Sub1_1.anIntArray309[0] + local103, local114 + Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], local65 == 1);
					continue;
				}
			}
			Static18.aClass1_Sub14_Sub1_2.method3072();
			return;
		}
	}
}
