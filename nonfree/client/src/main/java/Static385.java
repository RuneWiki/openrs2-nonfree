import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(I)V")
	public static void method6162() {
		for (@Pc(12) Class3_Sub25 local12 = (Class3_Sub25) Static533.aClass183_58.method4795(); local12 != null; local12 = (Class3_Sub25) Static533.aClass183_58.method4793()) {
			if (Static580.aClass125ArrayArrayArray3 == null) {
				local12.method8412();
			} else {
				@Pc(32) int local32;
				@Pc(42) Class2_Sub4 local42;
				@Pc(55) Class2_Sub4_Sub3 local55;
				@Pc(128) Class2_Sub2 local128;
				@Pc(169) Class2_Sub1 local169;
				@Pc(80) Class2_Sub3 local80;
				@Pc(182) Class2_Sub1_Sub3 local182;
				@Pc(93) Class2_Sub3_Sub1 local93;
				if (Static129.anInt10429 >= local12.anInt4617) {
					local32 = Static85.anIntArray92[local12.anInt4612];
					if (local32 == 0) {
						local42 = Static496.method7511(local12.anInt4614, local12.anInt4611, local12.anInt4621);
						if (local42 instanceof Class2_Sub4_Sub3) {
							Static216.method3757(local12.anInt4614, local12.anInt4611, local12.anInt4621);
							local55 = (Class2_Sub4_Sub3) local42;
							if (local55.aClass2_Sub4_3 != null) {
								Static194.method3314(local12.anInt4614, local12.anInt4611, local12.anInt4621, local55.aClass2_Sub4_3, null);
							}
						}
					} else if (local32 == 1) {
						local80 = Static563.method8123(local12.anInt4614, local12.anInt4611, local12.anInt4621);
						if (local80 instanceof Class2_Sub3_Sub1) {
							Static78.method1786(local12.anInt4614, local12.anInt4611, local12.anInt4621);
							local93 = (Class2_Sub3_Sub1) local80;
							if (local93.aClass2_Sub3_3 != null) {
								Static165.method3091(local12.anInt4614, local12.anInt4611, local12.anInt4621, local93.aClass2_Sub3_3, null);
							}
						}
					} else if (local32 == 2) {
						local128 = Static200.method3364(local12.anInt4614, local12.anInt4611, local12.anInt4621, ut.class);
						if (local128 instanceof Class2_Sub2_Sub6) {
							Static44.method1169(local12.anInt4614, local12.anInt4611, local12.anInt4621, ut.class);
							@Pc(149) Class2_Sub2_Sub6 local149 = (Class2_Sub2_Sub6) local128;
							if (local149.aClass2_Sub2_2 != null) {
								Static319.method5520(local149.aClass2_Sub2_2, false);
							}
						}
					} else if (local32 == 3) {
						local169 = Static86.method1922(local12.anInt4614, local12.anInt4611, local12.anInt4621);
						if (local169 instanceof Class2_Sub1_Sub3) {
							Static56.method1329(local12.anInt4614, local12.anInt4611, local12.anInt4621);
							local182 = (Class2_Sub1_Sub3) local169;
							if (local182.aClass2_Sub1_2 != null) {
								Static526.method7773(local12.anInt4614, local12.anInt4611, local12.anInt4621, local182.aClass2_Sub1_2);
							}
						}
					}
					local12.method8412();
				} else if (Static129.anInt10429 == local12.anInt4615) {
					local32 = Static85.anIntArray92[local12.anInt4612];
					if (local32 == 0) {
						local42 = Static496.method7511(local12.anInt4614, local12.anInt4611, local12.anInt4621);
						if (local42 instanceof Class2_Sub4_Sub3) {
							local12.method8412();
						} else if (Static404.method6578(local12.anInt4614, local12.anInt4611, local12.anInt4621) == null) {
							local55 = new Class2_Sub4_Sub3(local12.anInt4612, local12.anInt4623, local12.anInt4606, local12.anInt4609, local12.anInt4618, local42);
							Static194.method3314(local12.anInt4614, local12.anInt4611, local12.anInt4621, local55, null);
						} else {
							local12.method8412();
						}
					} else if (local32 == 1) {
						local80 = Static563.method8123(local12.anInt4614, local12.anInt4611, local12.anInt4621);
						if (local80 instanceof Class2_Sub3_Sub1) {
							local12.method8412();
						} else if (Static128.method6028(local12.anInt4614, local12.anInt4611, local12.anInt4621) == null) {
							local93 = new Class2_Sub3_Sub1(local12.anInt4612, local12.anInt4623, local12.anInt4606, local12.anInt4609, local12.anInt4618, local80);
							Static165.method3091(local12.anInt4614, local12.anInt4611, local12.anInt4621, local93, null);
						} else {
							local12.method8412();
						}
					} else if (local32 == 2) {
						local128 = Static200.method3364(local12.anInt4614, local12.anInt4611, local12.anInt4621, ut.class);
						if (local128 instanceof Class2_Sub2_Sub6) {
							local12.method8412();
						} else {
							Static44.method1169(local12.anInt4614, local12.anInt4611, local12.anInt4621, ut.class);
							@Pc(360) Class292 local360 = Static253.aClass146_2.method3356(local12.anInt4619);
							@Pc(378) int local378;
							@Pc(375) int local375;
							if (local12.anInt4623 == 1 || local12.anInt4623 == 3) {
								local375 = local360.anInt8734;
								local378 = local360.anInt8775;
							} else {
								local375 = local360.anInt8775;
								local378 = local360.anInt8734;
							}
							@Pc(419) Class2_Sub2_Sub6 local419 = new Class2_Sub2_Sub6(local12.anInt4612, local12.anInt4623, local12.anInt4614, local12.anInt4606, local12.anInt4609, local12.anInt4618, local12.anInt4611, local378 + local12.anInt4611 - 1, local12.anInt4621, local12.anInt4621 + local375 - 1, local128);
							Static319.method5520(local419, false);
						}
					} else if (local32 == 3) {
						local169 = Static86.method1922(local12.anInt4614, local12.anInt4611, local12.anInt4621);
						if (local169 instanceof Class2_Sub1_Sub3) {
							local12.method8412();
						} else {
							local182 = new Class2_Sub1_Sub3(local12.anInt4606, local12.anInt4609, local12.anInt4618, local169);
							Static526.method7773(local12.anInt4614, local12.anInt4611, local12.anInt4621, local182);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(B)Lclient!jm;")
	public static Class47 method6163() {
		try {
			return (Class47) Class.forName("Class47_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}
}
