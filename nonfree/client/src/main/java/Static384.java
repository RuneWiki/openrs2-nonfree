import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "I")
	public static int anInt6759;

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "Lclient!cda;")
	public static final Class49 aClass49_5 = new Class49();

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method5952(@OriginalArg(0) Class126 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = 0;
		if (Static144.aBoolean196) {
			local7 = Static577.method8147();
			local13 = Static601.method8395();
		}
		Static221.method3417(Static649.anInt10496 + local13, Static42.anInt712, Static334.anInt5796, Static403.anInt6941 + local7, arg0);
		Static471.aClass6_12.method7214(Static403.anInt6941 + local7 + 3, Static76.aClass58_25.method1237(Static321.anInt5554), Static649.anInt10496 + local13 + 14, -1, -10660793);
		@Pc(64) int local64 = local7 + Static81.aClass13_1.method6355();
		@Pc(70) int local70 = local13 + Static81.aClass13_1.method6347();
		@Pc(74) int local74;
		@Pc(91) int local91;
		if (Static585.aBoolean771) {
			local74 = 0;
			for (@Pc(79) Class5_Sub4_Sub6 local79 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1538(); local79 != null; local79 = (Class5_Sub4_Sub6) Static616.aClass80_12.method1536()) {
				local91 = local74 * 16 + local13 + Static649.anInt10496 + 31;
				local74++;
				if (local79.anInt2325 == 1) {
					Static1.method5722(Static334.anInt5796, local91, local7 + Static403.anInt6941, arg0, -1, -256, (Class5_Sub4_Sub14) local79.aClass80_3.aClass5_Sub4_14.aClass5_Sub4_67, local70, Static42.anInt712, local64, Static649.anInt10496 + local13);
				} else {
					Static583.method8178(-256, Static42.anInt712, arg0, Static334.anInt5796, Static649.anInt10496 + local13, -1, local91, local64, local70, local79, Static403.anInt6941 + local7);
				}
			}
			if (Static472.aClass5_Sub4_Sub6_1 != null) {
				Static221.method3417(Static537.anInt8920, Static501.anInt9504, Static266.anInt4412, Static345.anInt5965, arg0);
				local74 = 0;
				Static471.aClass6_12.method7214(Static345.anInt5965 + 3, Static472.aClass5_Sub4_Sub6_1.aString36, Static537.anInt8920 + 14, -1, -10660793);
				for (@Pc(178) Class5_Sub4_Sub14 local178 = (Class5_Sub4_Sub14) Static472.aClass5_Sub4_Sub6_1.aClass80_3.method1538(); local178 != null; local178 = (Class5_Sub4_Sub14) Static472.aClass5_Sub4_Sub6_1.aClass80_3.method1536()) {
					@Pc(188) int local188 = local74 * 16 + Static537.anInt8920 + 31;
					local74++;
					Static1.method5722(Static266.anInt4412, local188, Static345.anInt5965, arg0, -1, -256, local178, local70, Static501.anInt9504, local64, Static537.anInt8920);
				}
				Static286.method7988(Static537.anInt8920, Static345.anInt5965, Static501.anInt9504, Static266.anInt4412);
			}
		} else {
			local74 = 0;
			for (@Pc(225) Class5_Sub4_Sub14 local225 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7313(); local225 != null; local225 = (Class5_Sub4_Sub14) Static607.aClass306_63.method7301()) {
				local91 = (Static642.anInt10370 - local74 - 1) * 16 + Static649.anInt10496 + local13 + 31;
				local74++;
				Static1.method5722(Static334.anInt5796, local91, Static403.anInt6941 + local7, arg0, -1, -256, local225, local70, Static42.anInt712, local64, Static649.anInt10496 + local13);
			}
		}
		Static286.method7988(local13 + Static649.anInt10496, Static403.anInt6941 + local7, Static42.anInt712, Static334.anInt5796);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(Lclient!ee;I)Lclient!ml;")
	public static Class96_Sub1_Sub1 method5953(@OriginalArg(0) Class5_Sub12 arg0) {
		@Pc(12) Class96_Sub1 local12 = Static166.method2526(arg0);
		@Pc(16) int local16 = arg0.method8595();
		return new Class96_Sub1_Sub1(local12.aClass204_13, local12.aClass288_13, local12.anInt9354, local12.anInt9359, local12.anInt9360, local12.anInt9362, local12.anInt9357, local12.anInt9361, local12.anInt9355, local12.anInt6341, local12.anInt6343, local12.anInt6337, local12.anInt6344, local12.anInt6335, local12.anInt6334, local16);
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "()V")
	public static void method5954() {
		for (@Pc(1) int local1 = Static205.anInt3601; local1 < Static36.anInt662; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static129.anInt6336; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static150.anInt2400; local7++) {
					@Pc(16) Class156 local16 = Static535.aClass156ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class14_Sub1_Sub3 local21 = local16.aClass14_Sub1_Sub3_1;
						@Pc(24) Class14_Sub1_Sub3 local24 = local16.aClass14_Sub1_Sub3_2;
						if (local21 != null && local21.method7992()) {
							Static407.method6235(local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method7992()) {
								Static407.method6235(local24, local1, local4, local7, 1, 1);
								local24.method7996(local21, Static480.aClass126_12, 0, 0, false, 0);
								local24.method8001();
							}
							local21.method8001();
						}
						for (@Pc(68) Class66 local68 = local16.aClass66_2; local68 != null; local68 = local68.aClass66_1) {
							@Pc(72) Class14_Sub1_Sub1 local72 = local68.aClass14_Sub1_Sub1_1;
							if (local72 != null && local72.method7992()) {
								Static407.method6235(local72, local1, local4, local7, local72.aShort73 + 1 - local72.aShort74, local72.aShort72 - local72.aShort71 + 1);
								local72.method8001();
							}
						}
						@Pc(108) Class14_Sub1_Sub5 local108 = local16.aClass14_Sub1_Sub5_1;
						if (local108 != null && local108.method7992()) {
							Static608.method8470(local108, local1, local4, local7);
							local108.method8001();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!ee;)Lclient!bv;")
	public static Class3_Sub2 method5955(@OriginalArg(1) Class5_Sub12 arg0) {
		return new Class3_Sub2(arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8595(), arg0.method8657(), arg0.method8657(), arg0.method8645());
	}
}
