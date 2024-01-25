import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_71 = new Class216(63, 4);

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method3333() {
		Static331.method4565(Static507.aClass199_12);
		Static9.anInt10387++;
		if (Static436.aBoolean594 && Static584.aBoolean331) {
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			if (Static423.aBoolean517) {
				local24 = Static383.method8455();
				local26 = Static286.method4120();
			}
			@Pc(40) int local40 = local24 + Static373.aClass161_1.method5903();
			@Pc(47) int local47 = Static373.aClass161_1.method5898() + local26;
			local40 -= Static156.anInt2899;
			local47 -= Static624.anInt9782;
			if (Static205.anInt3341 > local40) {
				local40 = Static205.anInt3341;
			}
			if (Static469.anInt7448 > local47) {
				local47 = Static469.anInt7448;
			}
			if (Static389.aClass199_10.anInt5035 + Static205.anInt3341 < Static507.aClass199_12.anInt5035 + local40) {
				local40 = Static205.anInt3341 + Static389.aClass199_10.anInt5035 - Static507.aClass199_12.anInt5035;
			}
			if (Static507.aClass199_12.anInt4994 + local47 > Static389.aClass199_10.anInt4994 + Static469.anInt7448) {
				local47 = Static469.anInt7448 + Static389.aClass199_10.anInt4994 - Static507.aClass199_12.anInt4994;
			}
			@Pc(118) int local118 = local40 + Static389.aClass199_10.anInt5031 - Static205.anInt3341;
			@Pc(132) int local132 = local47 + Static389.aClass199_10.anInt4977 - Static469.anInt7448;
			@Pc(147) Class4_Sub25 local147;
			if (Static373.aClass161_1.method5904()) {
				if (Static507.aClass199_12.anInt4947 < Static9.anInt10387) {
					@Pc(221) int local221 = local40 - Static23.anInt516;
					@Pc(226) int local226 = local47 - Static146.anInt2668;
					if (local221 > Static507.aClass199_12.anInt4991 || -Static507.aClass199_12.anInt4991 > local221 || local226 > Static507.aClass199_12.anInt4991 || local226 < -Static507.aClass199_12.anInt4991) {
						Static495.aBoolean605 = true;
					}
				}
				if (Static507.aClass199_12.anObjectArray6 != null && Static495.aBoolean605) {
					local147 = new Class4_Sub25();
					local147.aClass199_6 = Static507.aClass199_12;
					local147.anObjectArray2 = Static507.aClass199_12.anObjectArray6;
					local147.anInt4279 = local132;
					local147.anInt4282 = local118;
					Static237.method3393(local147);
				}
			} else {
				if (Static495.aBoolean605) {
					Static124.method2204();
					if (Static507.aClass199_12.anObjectArray7 != null) {
						local147 = new Class4_Sub25();
						local147.anObjectArray2 = Static507.aClass199_12.anObjectArray7;
						local147.aClass199_6 = Static507.aClass199_12;
						local147.aClass199_5 = Static620.aClass199_15;
						local147.anInt4282 = local118;
						local147.anInt4279 = local132;
						Static237.method3393(local147);
					}
					if (Static620.aClass199_15 != null && Static75.method1607(Static507.aClass199_12) != null) {
						Static200.method3059(Static620.aClass199_15, Static507.aClass199_12);
					}
				} else if ((Static18.anInt6908 == 1 || Static327.method4497()) && Static574.anInt8895 > 2) {
					Static159.method2742(Static624.anInt9782 + Static146.anInt2668, Static156.anInt2899 + Static23.anInt516);
				} else if (Static47.method833()) {
					Static159.method2742(Static624.anInt9782 + Static146.anInt2668, Static156.anInt2899 + Static23.anInt516);
				}
				Static507.aClass199_12 = null;
			}
		} else if (Static9.anInt10387 > 1) {
			Static507.aClass199_12 = null;
		}
	}
}
