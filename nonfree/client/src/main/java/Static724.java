import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static724 {

	@OriginalMember(owner = "client!wt", name = "f", descriptor = "Lclient!kw;")
	public static Class178 aClass178_34;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "Lclient!wc;")
	public static final Class397 aClass397_193 = new Class397(140, 6);

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)V")
	public static void method9566(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static589.anInt8959 != -1) {
				Static137.method2384(Static589.anInt8959);
			}
			for (@Pc(18) Class3_Sub20 local18 = (Class3_Sub20) Static432.aClass313_34.method7103(); local18 != null; local18 = (Class3_Sub20) Static432.aClass313_34.method7110()) {
				if (!local18.method9597()) {
					local18 = (Class3_Sub20) Static432.aClass313_34.method7103();
					if (local18 == null) {
						break;
					}
				}
				Static46.method1229(true, false, local18);
			}
			Static589.anInt8959 = -1;
			Static432.aClass313_34 = new Class313(8);
			Static490.method6634();
			Static589.anInt8959 = Static29.aClass378_1.anInt10093;
			Static614.method7866(false);
			Static402.method5423();
			Static540.method7159(Static589.anInt8959);
		}
		Static576.method9252();
		Static374.aBoolean376 = false;
		Static700.method9283();
		Static167.anInt2966 = -1;
		Static126.method2306(Static52.anInt1387);
		Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2 = new Class9_Sub1_Sub1_Sub2_Sub1();
		Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10695 = Static646.anInt9979 * 512 / 2;
		Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray644[0] = Static497.anInt7926 / 2;
		Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anInt10694 = Static497.anInt7926 * 512 / 2;
		Static263.anInt4101 = 0;
		Static305.anInt4908 = 0;
		Static604.aClass9_Sub1_Sub1_Sub2_Sub1_2.anIntArray643[0] = Static646.anInt9979 / 2;
		if (Static262.anInt4081 == 2) {
			Static305.anInt4908 = Static114.anInt2375 << 9;
			Static263.anInt4101 = Static528.anInt8244 << 9;
		} else {
			Static26.method929();
		}
		Static509.method6646();
	}
}
