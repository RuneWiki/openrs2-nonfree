import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!dha", name = "K", descriptor = "[Lclient!bha;")
	public static Class38[] aClass38Array1;

	@OriginalMember(owner = "client!dha", name = "M", descriptor = "Lclient!ha;")
	public static Class65 aClass65_3;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(Z)V")
	public static void method2063() {
		Static518.anInt8627++;
		Static292.anInt5669 = 0;
		Static256.anInt4715 = 0;
		Static327.method5083();
		Static281.method4526();
		Static621.method8426();
		@Pc(21) boolean local21 = false;
		@Pc(29) int local29;
		for (@Pc(23) int local23 = 0; local23 < Static292.anInt5669; local23++) {
			local29 = Static618.anIntArray553[local23];
			@Pc(36) Class5_Sub25 local36 = (Class5_Sub25) Static56.aClass300_8.method7188((long) local29);
			@Pc(39) Class28_Sub1_Sub4_Sub2_Sub1 local39 = local36.aClass28_Sub1_Sub4_Sub2_Sub1_1;
			if (Static493.aBoolean702 && Static427.method6302(local29)) {
				Static531.method7463();
			}
			if (local39.anInt5452 != Static518.anInt8627) {
				if (local39.aClass134_1.method3271()) {
					Static46.method609(local39);
				}
				local39.method3061((Class134) null);
				local36.method9052();
				local21 = true;
			}
		}
		if (local21) {
			Static37.anInt617 = Static56.aClass300_8.method7190();
			Static56.aClass300_8.method7184(Static317.aClass5_Sub25Array1);
		}
		if (Static474.aClass5_Sub41_Sub2_2.anInt9230 != Static630.anInt10261) {
			throw new RuntimeException("gnp1 pos:" + Static474.aClass5_Sub41_Sub2_2.anInt9230 + " psize:" + Static630.anInt10261);
		}
		for (local29 = 0; local29 < Static36.anInt607; local29++) {
			if (Static56.aClass300_8.method7188((long) Static588.anIntArray533[local29]) == null) {
				throw new RuntimeException("gnp2 pos:" + local29 + " size:" + Static36.anInt607);
			}
		}
		if (Static37.anInt617 - Static36.anInt607 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static37.anInt617 - Static36.anInt607));
		}
		for (@Pc(167) int local167 = 0; local167 < Static37.anInt617; local167++) {
			if (Static518.anInt8627 != Static317.aClass5_Sub25Array1[local167].aClass28_Sub1_Sub4_Sub2_Sub1_1.anInt5452) {
				throw new RuntimeException("gnp4 uk:" + Static317.aClass5_Sub25Array1[local167].aClass28_Sub1_Sub4_Sub2_Sub1_1.anInt5512);
			}
		}
	}
}
