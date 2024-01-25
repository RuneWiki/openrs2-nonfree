import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!oba", name = "b", descriptor = "I")
	public static int anInt7491 = 0;

	@OriginalMember(owner = "client!oba", name = "e", descriptor = "Z")
	public static boolean aBoolean544 = false;

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V")
	public static void method6419() {
		Static627.aClass2_Sub11_Sub2_6.method8407();
		@Pc(15) int local15 = Static627.aClass2_Sub11_Sub2_6.method8400(8);
		@Pc(28) int local28;
		if (Static398.anInt7589 > local15) {
			for (local28 = local15; local28 < Static398.anInt7589; local28++) {
				Static644.anIntArray716[Static140.anInt3408++] = Static301.anIntArray367[local28];
			}
		}
		if (Static398.anInt7589 < local15) {
			throw new RuntimeException("gnpov1");
		}
		Static398.anInt7589 = 0;
		for (local28 = 0; local28 < local15; local28++) {
			@Pc(66) int local66 = Static301.anIntArray367[local28];
			@Pc(74) Class3_Sub1_Sub3_Sub3_Sub1 local74 = ((Class2_Sub33) Static600.aClass99_79.method3056((long) local66)).aClass3_Sub1_Sub3_Sub3_Sub1_2;
			@Pc(79) int local79 = Static627.aClass2_Sub11_Sub2_6.method8400(1);
			if (local79 == 0) {
				Static301.anIntArray367[Static398.anInt7589++] = local66;
				local74.anInt6095 = Static431.anInt8060;
			} else {
				@Pc(102) int local102 = Static627.aClass2_Sub11_Sub2_6.method8400(2);
				if (local102 == 0) {
					Static301.anIntArray367[Static398.anInt7589++] = local66;
					local74.anInt6095 = Static431.anInt8060;
					Static18.anIntArray18[Static33.anInt5425++] = local66;
				} else {
					@Pc(146) int local146;
					@Pc(156) int local156;
					if (local102 == 1) {
						Static301.anIntArray367[Static398.anInt7589++] = local66;
						local74.anInt6095 = Static431.anInt8060;
						local146 = Static627.aClass2_Sub11_Sub2_6.method8400(3);
						local74.method3401(local146, 1);
						local156 = Static627.aClass2_Sub11_Sub2_6.method8400(1);
						if (local156 == 1) {
							Static18.anIntArray18[Static33.anInt5425++] = local66;
						}
					} else if (local102 == 2) {
						Static301.anIntArray367[Static398.anInt7589++] = local66;
						local74.anInt6095 = Static431.anInt8060;
						if (Static627.aClass2_Sub11_Sub2_6.method8400(1) == 1) {
							local146 = Static627.aClass2_Sub11_Sub2_6.method8400(3);
							local74.method3401(local146, 2);
							local156 = Static627.aClass2_Sub11_Sub2_6.method8400(3);
							local74.method3401(local156, 2);
						} else {
							local146 = Static627.aClass2_Sub11_Sub2_6.method8400(3);
							local74.method3401(local146, 0);
						}
						local146 = Static627.aClass2_Sub11_Sub2_6.method8400(1);
						if (local146 == 1) {
							Static18.anIntArray18[Static33.anInt5425++] = local66;
						}
					} else if (local102 == 3) {
						Static644.anIntArray716[Static140.anInt3408++] = local66;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oba", name = "a", descriptor = "(IB)Z")
	public static boolean method6421(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
