import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!dp", name = "x", descriptor = "Lclient!br;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!dp", name = "d", descriptor = "(I)V")
	public static void method2274() {
		Static238.anInt3790 = -1;
		Static557.aClass3_Sub2_7 = null;
		Static309.anIntArrayArray22 = null;
		Static103.anInt2245 = 0;
		Static49.anInt1325 = 0;
		Static314.anInt5069 = 0;
		Static623.method8205();
		Static654.anInt10061 = 0;
		Static291.anInt4448 = 0;
		Static189.anInt3243 = 0;
		Static67.anInt1612 = 0;
		for (@Pc(29) int local29 = 0; local29 < Static110.aClass197Array1.length; local29++) {
			Static110.aClass197Array1[local29] = null;
		}
		Static655.method8598();
		for (@Pc(54) int local54 = 0; local54 < 2048; local54++) {
			Static19.aClass9_Sub1_Sub1_Sub2_Sub1Array1[local54] = null;
		}
		Static28.anInt1087 = 0;
		Static94.aClass313_8.method7101();
		Static568.anInt8629 = 0;
		Static113.aClass313_9.method7101();
		Static492.method6653();
		Static407.anInt6329 = 0;
		Static380.aClass127_1.method2983();
		Static107.aClass3_Sub14_10 = null;
		Static12.aClass3_Sub14_15 = null;
		Static85.aLong68 = 0L;
		Static215.aClass84_2 = null;
		Static35.aClass84_1 = null;
		Static369.aClass3_Sub3_2 = null;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "([BB)V")
	public static void method2276(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class3_Sub2 local10 = new Class3_Sub2(arg0);
		while (true) {
			while (true) {
				while (true) {
					@Pc(14) int local14 = local10.method2048(255);
					if (local14 == 0) {
						return;
					}
					if (local14 == 1) {
						@Pc(139) int[] local139 = Static210.anIntArray238 = new int[6];
						local139[0] = local10.method2028(-14795);
						local139[1] = local10.method2028(-14795);
						local139[2] = local10.method2028(-14795);
						local139[3] = local10.method2028(-14795);
						local139[4] = local10.method2028(-14795);
						local139[5] = local10.method2028(-14795);
					} else {
						@Pc(48) int local48;
						@Pc(43) int local43;
						if (local14 == 4) {
							local43 = local10.method2048(255);
							Static455.anIntArray522 = new int[local43];
							for (local48 = 0; local48 < local43; local48++) {
								Static455.anIntArray522[local48] = local10.method2028(-14795);
								if (Static455.anIntArray522[local48] == 65535) {
									Static455.anIntArray522[local48] = -1;
								}
							}
						} else if (local14 == 5) {
							local43 = local10.method2048(255);
							Static519.anIntArray590 = new int[local43];
							for (local48 = 0; local48 < local43; local48++) {
								Static519.anIntArray590[local48] = local10.method2028(-14795);
								if (Static519.anIntArray590[local48] == 65535) {
									Static519.anIntArray590[local48] = -1;
								}
							}
						}
					}
				}
			}
		}
	}
}
