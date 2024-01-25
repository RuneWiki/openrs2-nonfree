import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!pk", name = "i", descriptor = "Lclient!qj;")
	public static Class165 aClass165_73;

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString185 = "Loading wordpack - ";

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
	public static int anInt4660 = 0;

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "[I")
	public static final int[] anIntArray599 = new int[1000];

	@OriginalMember(owner = "client!pk", name = "f", descriptor = "[B")
	public static final byte[] aByteArray77 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!pk", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString186 = null;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
	public static void method4261() {
		while (true) {
			@Pc(6) Class1_Sub5 local6 = (Class1_Sub5) Static92.aClass195_14.method5031();
			if (local6 == null) {
				return;
			}
			if (Static138.aClass204ArrayArrayArray1 != null) {
				@Pc(24) Class5_Sub3_Sub3 local24;
				@Pc(19) int local19;
				if (local6.anInt421 < 0) {
					local19 = -local6.anInt421 - 1;
					if (local19 == Static69.anInt1424) {
						local24 = Static130.aClass5_Sub3_Sub3_Sub1_1;
					} else {
						local24 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local19];
					}
				} else {
					local19 = local6.anInt421 - 1;
					local24 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local19];
				}
				if (local24 != null) {
					@Pc(48) Class188 local48 = Static126.method2405(local6.anInt411);
					@Pc(64) int local64;
					@Pc(61) int local61;
					if (local6.anInt420 == 1 || local6.anInt420 == 3) {
						local61 = local48.anInt5541;
						local64 = local48.anInt5533;
					} else {
						local61 = local48.anInt5533;
						local64 = local48.anInt5541;
					}
					@Pc(79) int local79 = (local64 >> 1) + local6.anInt417;
					@Pc(88) int local88 = local6.anInt417 + (local64 + 1 >> 1);
					@Pc(95) int local95 = (local61 >> 1) + local6.anInt406;
					@Pc(105) int local105 = local6.anInt406 + (local61 + 1 >> 1);
					@Pc(110) Class41 local110 = Static7.aClass41Array1[local24.aByte53];
					@Pc(133) int local133 = local110.method5434(local79, local95) + local110.method5434(local88, local95) + local110.method5434(local79, local105) + local110.method5434(local88, local105) >> 2;
					@Pc(135) Interface8 local135 = null;
					@Pc(140) int local140 = Static6.anIntArray19[local6.anInt412];
					if (local140 == 0) {
						local135 = (Interface8) Static264.method4812(local24.aByte53, local6.anInt417, local6.anInt406);
					} else if (local140 == 1) {
						local135 = (Interface8) Static57.method1233(local24.aByte53, local6.anInt417, local6.anInt406);
					} else if (local140 == 2) {
						local135 = (Interface8) Static66.method1372(local24.aByte53, local6.anInt417, local6.anInt406, tr.class);
					} else if (local140 == 3) {
						local135 = (Interface8) Static331.method5551(local24.aByte53, local6.anInt417, local6.anInt406);
					}
					if (local135 != null) {
						Static95.method1778(-1, 0, local6.anInt406, local140, local6.anInt417, local24.aByte53, local6.anInt414, local6.anInt419 + 1, 0);
						local24.anInt4988 = local6.anInt406 * 128 + local61 * 64;
						local24.anInt4987 = local6.anInt417 * 128 + local64 * 64;
						local24.anInterface8_3 = local135;
						local24.anInt4983 = local6.anInt414 + Static215.anInt4246;
						local24.anInt4992 = local133;
						local24.anInt4982 = Static215.anInt4246 + local6.anInt419;
						@Pc(265) int local265 = local6.anInt415;
						@Pc(268) int local268 = local6.anInt407;
						@Pc(271) int local271 = local6.anInt416;
						@Pc(276) int local276;
						if (local268 < local265) {
							local276 = local265;
							local265 = local268;
							local268 = local276;
						}
						@Pc(283) int local283 = local6.anInt408;
						if (local283 < local271) {
							local276 = local271;
							local271 = local283;
							local283 = local276;
						}
						local24.anInt4990 = local268 + local6.anInt417;
						local24.anInt4986 = local6.anInt417 + local265;
						local24.anInt4993 = local6.anInt406 + local271;
						local24.anInt4989 = local283 + local6.anInt406;
					}
				}
			}
		}
	}
}
