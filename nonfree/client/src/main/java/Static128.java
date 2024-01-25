import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!eg", name = "b", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_58 = new Class160(42, 2);

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!haa;)V")
	public static void method1985(@OriginalArg(0) Class4_Sub3 arg0) {
		Static554.aClass144_12.H(arg0.anInt11184, arg0.anInt11182 + (arg0.method9479() >> 1), arg0.anInt11178, Static469.anIntArray595);
		arg0.anInt11179 = Static469.anIntArray595[0];
		arg0.anInt11180 = Static469.anIntArray595[1];
		arg0.anInt11177 = Static469.anIntArray595[2];
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V")
	public static void method1986() {
		Static591.aClass347_3.method8304();
		Static591.aClass347_3.aClass14_Sub21_Sub2_1.anInt8936 = 0;
		Static591.aClass347_3.aClass160_242 = null;
		Static591.aClass347_3.anInt9628 = 0;
		Static591.aClass347_3.anInt9630 = 0;
		Static591.aClass347_3.aClass160_243 = null;
		Static591.aClass347_3.aClass160_244 = null;
		Static591.aClass347_3.aClass160_245 = null;
		Static132.anInt2081 = 0;
		Static523.method7771();
		Static81.method1382();
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local45] = null;
		}
		Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 = null;
		for (@Pc(61) int local61 = 0; local61 < Static549.anInt1216; local61++) {
			@Pc(70) Class4_Sub3_Sub3_Sub3_Sub1 local70 = Static28.aClass14_Sub44Array2[local61].aClass4_Sub3_Sub3_Sub3_Sub1_2;
			if (local70 != null) {
				local70.anInt3256 = -1;
			}
		}
		Static575.method8232();
		Static124.anInt2024 = -1;
		Static507.anInt8817 = -1;
		Static304.anInt5410 = 1;
		Static160.method2323(11);
		for (@Pc(94) int local94 = 0; local94 < 100; local94++) {
			Static415.aBooleanArray17[local94] = true;
		}
		Static411.method6198();
		Static40.aLong31 = 0L;
		Static335.aClass14_Sub47_1 = null;
	}
}
