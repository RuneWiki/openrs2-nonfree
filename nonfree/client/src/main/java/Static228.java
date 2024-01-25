import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
	public static void method3019() {
		for (@Pc(6) Class1_Sub38 local6 = (Class1_Sub38) Static256.aClass254_24.method5437(); local6 != null; local6 = (Class1_Sub38) Static256.aClass254_24.method5433()) {
			if (Static159.aClass82ArrayArrayArray2 == null) {
				local6.method5617();
			} else {
				@Pc(24) int local24;
				@Pc(162) Class20_Sub3 local162;
				@Pc(119) Class20_Sub2 local119;
				@Pc(75) Class20_Sub4 local75;
				@Pc(34) Class20_Sub1 local34;
				@Pc(132) Class20_Sub2_Sub3 local132;
				@Pc(88) Class20_Sub4_Sub2 local88;
				@Pc(47) Class20_Sub1_Sub2 local47;
				if (Static368.anInt6250 >= local6.anInt6266) {
					local24 = Static8.anIntArray488[local6.anInt6277];
					if (local24 == 0) {
						local34 = Static336.method4293(local6.anInt6268, local6.anInt6271, local6.anInt6265);
						if (local34 instanceof Class20_Sub1_Sub2) {
							Static213.method2838(local6.anInt6268, local6.anInt6271, local6.anInt6265);
							local47 = (Class20_Sub1_Sub2) local34;
							if (local47.aClass20_Sub1_1 != null) {
								Static204.method2781(local6.anInt6268, local6.anInt6271, local6.anInt6265, local47.aClass20_Sub1_1, null);
							}
						}
					} else if (local24 == 1) {
						local75 = Static246.method3212(local6.anInt6268, local6.anInt6271, local6.anInt6265);
						if (local75 instanceof Class20_Sub4_Sub2) {
							Static241.method3139(local6.anInt6268, local6.anInt6271, local6.anInt6265);
							local88 = (Class20_Sub4_Sub2) local75;
							if (local88.aClass20_Sub4_3 != null) {
								Static445.method5569(local6.anInt6268, local6.anInt6271, local6.anInt6265, local88.aClass20_Sub4_3, null);
							}
						}
					} else if (local24 == 2) {
						local162 = Static422.method5254(local6.anInt6268, local6.anInt6271, local6.anInt6265, mq.class);
						if (local162 instanceof Class20_Sub3_Sub5) {
							Static377.method4840(local6.anInt6268, local6.anInt6271, local6.anInt6265, mq.class);
							@Pc(183) Class20_Sub3_Sub5 local183 = (Class20_Sub3_Sub5) local162;
							if (local183.aClass20_Sub3_2 != null) {
								Static222.method2947(local183.aClass20_Sub3_2, false);
							}
						}
					} else if (local24 == 3) {
						local119 = Static261.method3366(local6.anInt6268, local6.anInt6271, local6.anInt6265);
						if (local119 instanceof Class20_Sub2_Sub3) {
							Static447.method5583(local6.anInt6268, local6.anInt6271, local6.anInt6265);
							local132 = (Class20_Sub2_Sub3) local119;
							if (local132.aClass20_Sub2_2 != null) {
								Static400.method4915(local6.anInt6268, local6.anInt6271, local6.anInt6265, local132.aClass20_Sub2_2);
							}
						}
					}
					local6.method5617();
				} else if (local6.anInt6275 == Static368.anInt6250) {
					local24 = Static8.anIntArray488[local6.anInt6277];
					if (local24 == 0) {
						local34 = Static336.method4293(local6.anInt6268, local6.anInt6271, local6.anInt6265);
						if (local34 instanceof Class20_Sub1_Sub2) {
							local6.method5617();
						} else if (Static195.method2589(local6.anInt6268, local6.anInt6271, local6.anInt6265) == null) {
							local47 = new Class20_Sub1_Sub2(local6.anInt6277, local6.anInt6269, local6.anInt6263, local6.anInt6272, local6.anInt6279, local34);
							Static204.method2781(local6.anInt6268, local6.anInt6271, local6.anInt6265, local47, null);
						} else {
							local6.method5617();
						}
					} else if (local24 == 1) {
						local75 = Static246.method3212(local6.anInt6268, local6.anInt6271, local6.anInt6265);
						if (local75 instanceof Class20_Sub4_Sub2) {
							local6.method5617();
						} else if (Static176.method2362(local6.anInt6268, local6.anInt6271, local6.anInt6265) == null) {
							local88 = new Class20_Sub4_Sub2(local6.anInt6277, local6.anInt6269, local6.anInt6263, local6.anInt6272, local6.anInt6279, local75);
							Static445.method5569(local6.anInt6268, local6.anInt6271, local6.anInt6265, local88, null);
						} else {
							local6.method5617();
						}
					} else if (local24 == 2) {
						local162 = Static422.method5254(local6.anInt6268, local6.anInt6271, local6.anInt6265, mq.class);
						if (local162 instanceof Class20_Sub3_Sub5) {
							local6.method5617();
						} else {
							Static377.method4840(local6.anInt6268, local6.anInt6271, local6.anInt6265, mq.class);
							@Pc(419) Class141 local419 = Static259.aClass95_3.method1821(local6.anInt6267);
							@Pc(437) int local437;
							@Pc(434) int local434;
							if (local6.anInt6269 == 1 || local6.anInt6269 == 3) {
								local434 = local419.anInt3423;
								local437 = local419.anInt3403;
							} else {
								local434 = local419.anInt3403;
								local437 = local419.anInt3423;
							}
							@Pc(478) Class20_Sub3_Sub5 local478 = new Class20_Sub3_Sub5(local6.anInt6277, local6.anInt6269, local6.anInt6268, local6.anInt6263, local6.anInt6272, local6.anInt6279, local6.anInt6271, local437 + local6.anInt6271 - 1, local6.anInt6265, local6.anInt6265 + local434 - 1, local162);
							Static222.method2947(local478, false);
						}
					} else if (local24 == 3) {
						local119 = Static261.method3366(local6.anInt6268, local6.anInt6271, local6.anInt6265);
						if (local119 instanceof Class20_Sub2_Sub3) {
							local6.method5617();
						} else {
							local132 = new Class20_Sub2_Sub3(local6.anInt6263, local6.anInt6272, local6.anInt6279, local119);
							Static400.method4915(local6.anInt6268, local6.anInt6271, local6.anInt6265, local132);
						}
					}
				}
			}
		}
	}
}
