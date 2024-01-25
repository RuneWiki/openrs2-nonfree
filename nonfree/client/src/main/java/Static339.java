import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!re", name = "h", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas7;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V")
	public static void method4702() {
		for (@Pc(10) Class2_Sub13 local10 = (Class2_Sub13) Static131.aClass14_25.method309(); local10 != null; local10 = (Class2_Sub13) Static131.aClass14_25.method311()) {
			if (Static440.aClass106ArrayArrayArray3 == null) {
				local10.method5866();
			} else {
				@Pc(44) int local44;
				@Pc(266) Class3_Sub5 local266;
				@Pc(302) Class3_Sub5_Sub3 local302;
				@Pc(211) Class3_Sub3 local211;
				@Pc(72) Class3_Sub2 local72;
				@Pc(174) Class3_Sub1 local174;
				@Pc(247) Class3_Sub3_Sub3 local247;
				@Pc(193) Class3_Sub1_Sub1 local193;
				if (local10.anInt2350 <= Static131.anInt2821) {
					local44 = Static284.anIntArray418[local10.anInt2356];
					if (local44 == 0) {
						local266 = Static215.method3376(local10.anInt2358, local10.anInt2349, local10.anInt2352);
						if (local266 instanceof Class3_Sub5_Sub3) {
							Static195.method3066(local10.anInt2358, local10.anInt2349, local10.anInt2352);
							local302 = (Class3_Sub5_Sub3) local266;
							if (local302.aClass3_Sub5_3 != null) {
								Static173.method2817(local10.anInt2358, local10.anInt2349, local10.anInt2352, local302.aClass3_Sub5_3, null);
							}
						}
					} else if (local44 == 1) {
						local211 = Static414.method5443(local10.anInt2358, local10.anInt2349, local10.anInt2352);
						if (local211 instanceof Class3_Sub3_Sub3) {
							Static8.method204(local10.anInt2358, local10.anInt2349, local10.anInt2352);
							local247 = (Class3_Sub3_Sub3) local211;
							if (local247.aClass3_Sub3_3 != null) {
								Static87.method1703(local10.anInt2358, local10.anInt2349, local10.anInt2352, local247.aClass3_Sub3_3, null);
							}
						}
					} else if (local44 == 2) {
						local72 = Static455.method4456(local10.anInt2358, local10.anInt2349, local10.anInt2352, jn.class);
						if (local72 instanceof Class3_Sub2_Sub5) {
							Static181.method2905(local10.anInt2358, local10.anInt2349, local10.anInt2352, jn.class);
							@Pc(437) Class3_Sub2_Sub5 local437 = (Class3_Sub2_Sub5) local72;
							if (local437.aClass3_Sub2_2 != null) {
								Static313.method4402(local437.aClass3_Sub2_2, false);
							}
						}
					} else if (local44 == 3) {
						local174 = Static139.method2376(local10.anInt2358, local10.anInt2349, local10.anInt2352);
						if (local174 instanceof Class3_Sub1_Sub1) {
							Static124.method4917(local10.anInt2358, local10.anInt2349, local10.anInt2352);
							local193 = (Class3_Sub1_Sub1) local174;
							if (local193.aClass3_Sub1_1 != null) {
								Static80.method5638(local10.anInt2358, local10.anInt2349, local10.anInt2352, local193.aClass3_Sub1_1);
							}
						}
					}
					local10.method5866();
				} else if (Static131.anInt2821 == local10.anInt2347) {
					local44 = Static284.anIntArray418[local10.anInt2356];
					if (local44 == 0) {
						local266 = Static215.method3376(local10.anInt2358, local10.anInt2349, local10.anInt2352);
						if (local266 instanceof Class3_Sub5_Sub3) {
							local10.method5866();
						} else if (Static389.method5166(local10.anInt2358, local10.anInt2349, local10.anInt2352) == null) {
							local302 = new Class3_Sub5_Sub3(local10.anInt2356, local10.anInt2342, local10.anInt2348, local10.anInt2344, local10.anInt2346, local266);
							Static173.method2817(local10.anInt2358, local10.anInt2349, local10.anInt2352, local302, null);
						} else {
							local10.method5866();
						}
					} else if (local44 == 1) {
						local211 = Static414.method5443(local10.anInt2358, local10.anInt2349, local10.anInt2352);
						if (local211 instanceof Class3_Sub3_Sub3) {
							local10.method5866();
						} else if (Static82.method1498(local10.anInt2358, local10.anInt2349, local10.anInt2352) == null) {
							local247 = new Class3_Sub3_Sub3(local10.anInt2356, local10.anInt2342, local10.anInt2348, local10.anInt2344, local10.anInt2346, local211);
							Static87.method1703(local10.anInt2358, local10.anInt2349, local10.anInt2352, local247, null);
						} else {
							local10.method5866();
						}
					} else if (local44 == 2) {
						local72 = Static455.method4456(local10.anInt2358, local10.anInt2349, local10.anInt2352, jn.class);
						if (local72 instanceof Class3_Sub2_Sub5) {
							local10.method5866();
						} else {
							Static181.method2905(local10.anInt2358, local10.anInt2349, local10.anInt2352, jn.class);
							@Pc(101) Class134 local101 = Static118.aClass165_2.method3799(local10.anInt2351);
							@Pc(115) int local115;
							@Pc(112) int local112;
							if (local10.anInt2342 == 1 || local10.anInt2342 == 3) {
								local115 = local101.anInt3652;
								local112 = local101.anInt3670;
							} else {
								local112 = local101.anInt3652;
								local115 = local101.anInt3670;
							}
							@Pc(157) Class3_Sub2_Sub5 local157 = new Class3_Sub2_Sub5(local10.anInt2356, local10.anInt2342, local10.anInt2358, local10.anInt2348, local10.anInt2344, local10.anInt2346, local10.anInt2349, local10.anInt2349 + local115 - 1, local10.anInt2352, local10.anInt2352 + local112 - 1, local72);
							Static313.method4402(local157, false);
						}
					} else if (local44 == 3) {
						local174 = Static139.method2376(local10.anInt2358, local10.anInt2349, local10.anInt2352);
						if (local174 instanceof Class3_Sub1_Sub1) {
							local10.method5866();
						} else {
							local193 = new Class3_Sub1_Sub1(local10.anInt2348, local10.anInt2344, local10.anInt2346, local174);
							Static80.method5638(local10.anInt2358, local10.anInt2349, local10.anInt2352, local193);
						}
					}
				}
			}
		}
	}
}
