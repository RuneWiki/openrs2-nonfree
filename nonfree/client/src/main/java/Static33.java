import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(Z)V")
	public static void method831() {
		Static222.anInt4457 = 0;
		Static164.anInt3458 = 0;
		Static64.method1510();
		Static124.method2600();
		Static292.method4997();
		Static275.method4675();
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static164.anInt3458; local23++) {
			local29 = Static4.anIntArray6[local23];
			if (Static153.anInt3257 != Static29.aClass10_Sub3_Sub3_Sub2Array3[local29].anInt5927) {
				if (Static29.aClass10_Sub3_Sub3_Sub2Array3[local29].anInt6020 > 0) {
					Static136.method2750(Static29.aClass10_Sub3_Sub3_Sub2Array3[local29]);
				}
				Static29.aClass10_Sub3_Sub3_Sub2Array3[local29] = null;
			}
		}
		if (Static327.anInt6307 != Static30.aClass14_Sub4_Sub2_1.anInt2637) {
			throw new RuntimeException("gpp1 pos:" + Static30.aClass14_Sub4_Sub2_1.anInt2637 + " psize:" + Static327.anInt6307);
		}
		for (local29 = 0; local29 < Static307.anInt2887; local29++) {
			if (Static29.aClass10_Sub3_Sub3_Sub2Array3[Static213.anIntArray380[local29]] == null) {
				throw new RuntimeException("gpp2 pos:" + local29 + " size:" + Static307.anInt2887);
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)Lclient!vg;")
	public static Class14_Sub37 method835(@OriginalArg(1) int arg0) {
		return (Class14_Sub37) Static316.aClass25_15.method691((long) arg0);
	}
}
