import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vda", name = "m", descriptor = "I")
	public static int anInt9815;

	@OriginalMember(owner = "client!vda", name = "q", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_221 = new Class362(92, 8);

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZI)V")
	public static void method8011(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static332.anInt6370 != -1) {
				Static520.method7609(Static332.anInt6370);
			}
			for (@Pc(19) Class4_Sub37 local19 = (Class4_Sub37) Static189.aClass350_14.method8198(); local19 != null; local19 = (Class4_Sub37) Static189.aClass350_14.method8205()) {
				if (!local19.method8381()) {
					local19 = (Class4_Sub37) Static189.aClass350_14.method8198();
					if (local19 == null) {
						break;
					}
				}
				Static161.method525(false, true, local19);
			}
			Static332.anInt6370 = -1;
			Static189.aClass350_14 = new Class350(8);
			Static277.method4812();
			Static332.anInt6370 = Static150.anInt3141;
			Static487.method7235(false);
			Static523.method7617();
			Static388.method6115(Static332.anInt6370);
		}
		Static174.aString32 = "";
		Static278.aString57 = "";
		Static89.aBoolean155 = false;
		Static358.method5795();
		Static180.anInt3622 = -1;
		Static483.method7218(Static535.anInt9525);
		Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1 = new Class1_Sub4_Sub2_Sub1_Sub2();
		Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935 = Static119.anInt2717 * 512 / 2;
		Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934 = Static428.anInt8046 * 512 / 2;
		Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray463[0] = Static428.anInt8046 / 2;
		Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anIntArray462[0] = Static119.anInt2717 / 2;
		Static110.anInt2624 = 0;
		Static24.anInt387 = 0;
		if (Static166.anInt3419 == 2) {
			Static110.anInt2624 = Static293.anInt5938 << 9;
			Static24.anInt387 = Static428.anInt8060 << 9;
		} else {
			Static548.method7957();
		}
		Static214.method3551();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(B[Ljava/lang/Object;[J)V")
	public static void method8012(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static239.method7072(arg1.length - 1, arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!kfa;B)V")
	public static void method8014(@OriginalArg(0) Class1_Sub4_Sub2_Sub1_Sub1 arg0) {
		for (@Pc(16) Class4_Sub36 local16 = (Class4_Sub36) Static190.aClass244_25.method5963(); local16 != null; local16 = (Class4_Sub36) Static190.aClass244_25.method5965()) {
			if (arg0 == local16.aClass1_Sub4_Sub2_Sub1_Sub1_2) {
				if (local16.aClass4_Sub7_Sub4_1 != null) {
					Static444.aClass4_Sub7_Sub1_2.method400(local16.aClass4_Sub7_Sub4_1);
					local16.aClass4_Sub7_Sub4_1 = null;
				}
				local16.method8379();
				return;
			}
		}
	}
}
