import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Lclient!vb;")
	public static Class251 aClass251_12;

	@OriginalMember(owner = "client!po", name = "c", descriptor = "Lclient!md;")
	public static Class89 aClass89_2;

	@OriginalMember(owner = "client!po", name = "f", descriptor = "Lclient!og;")
	public static Class182 aClass182_4;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "I")
	public static int anInt6533 = 0;

	@OriginalMember(owner = "client!po", name = "d", descriptor = "Lclient!uj;")
	public static final Class242 aClass242_8 = new Class242();

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	public static int anInt6534 = 0;

	@OriginalMember(owner = "client!po", name = "g", descriptor = "I")
	public static int anInt6535 = 0;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(Z)V")
	public static void method5113() {
		for (@Pc(15) Class1_Sub36 local15 = (Class1_Sub36) Static260.aClass142_32.method3199(); local15 != null; local15 = (Class1_Sub36) Static260.aClass142_32.method3198()) {
			if (Static131.aClass137ArrayArrayArray2 == null) {
				local15.method5965();
			} else {
				@Pc(41) int local41;
				@Pc(263) Class47_Sub2 local263;
				@Pc(299) Class47_Sub2_Sub2 local299;
				@Pc(57) Class47_Sub4 local57;
				@Pc(165) Class47_Sub1 local165;
				@Pc(120) Class47_Sub5 local120;
				@Pc(93) Class47_Sub4_Sub2 local93;
				@Pc(139) Class47_Sub5_Sub3 local139;
				if (Static123.anInt2333 >= local15.anInt6196) {
					local41 = Static449.anIntArray583[local15.anInt6209];
					if (local41 == 0) {
						local263 = Static208.method3165(local15.anInt6195, local15.anInt6197, local15.anInt6205);
						if (local263 instanceof Class47_Sub2_Sub2) {
							Static284.method3907(local15.anInt6195, local15.anInt6197, local15.anInt6205);
							local299 = (Class47_Sub2_Sub2) local263;
							if (local299.aClass47_Sub2_3 != null) {
								Static302.method4112(local15.anInt6195, local15.anInt6197, local15.anInt6205, local299.aClass47_Sub2_3, null);
							}
						}
					} else if (local41 == 1) {
						local57 = Static170.method2638(local15.anInt6195, local15.anInt6197, local15.anInt6205);
						if (local57 instanceof Class47_Sub4_Sub2) {
							Static91.method4796(local15.anInt6195, local15.anInt6197, local15.anInt6205);
							local93 = (Class47_Sub4_Sub2) local57;
							if (local93.aClass47_Sub4_3 != null) {
								Static375.method5902(local15.anInt6195, local15.anInt6197, local15.anInt6205, local93.aClass47_Sub4_3, null);
							}
						}
					} else if (local41 == 2) {
						local165 = Static286.method3918(local15.anInt6195, local15.anInt6197, local15.anInt6205, rq.class);
						if (local165 instanceof Class47_Sub1_Sub4) {
							Static201.method3103(local15.anInt6195, local15.anInt6197, local15.anInt6205, rq.class);
							@Pc(435) Class47_Sub1_Sub4 local435 = (Class47_Sub1_Sub4) local165;
							if (local435.aClass47_Sub1_1 != null) {
								Static97.method1543(local435.aClass47_Sub1_1, false);
							}
						}
					} else if (local41 == 3) {
						local120 = Static112.method1764(local15.anInt6195, local15.anInt6197, local15.anInt6205);
						if (local120 instanceof Class47_Sub5_Sub3) {
							Static58.method897(local15.anInt6195, local15.anInt6197, local15.anInt6205);
							local139 = (Class47_Sub5_Sub3) local120;
							if (local139.aClass47_Sub5_2 != null) {
								Static55.method853(local15.anInt6195, local15.anInt6197, local15.anInt6205, local139.aClass47_Sub5_2);
							}
						}
					}
					local15.method5965();
				} else if (local15.anInt6202 == Static123.anInt2333) {
					local41 = Static449.anIntArray583[local15.anInt6209];
					if (local41 == 0) {
						local263 = Static208.method3165(local15.anInt6195, local15.anInt6197, local15.anInt6205);
						if (local263 instanceof Class47_Sub2_Sub2) {
							local15.method5965();
						} else if (Static55.method856(local15.anInt6195, local15.anInt6197, local15.anInt6205) == null) {
							local299 = new Class47_Sub2_Sub2(local15.anInt6209, local15.anInt6204, local15.anInt6210, local15.anInt6194, local15.anInt6200, local263);
							Static302.method4112(local15.anInt6195, local15.anInt6197, local15.anInt6205, local299, null);
						} else {
							local15.method5965();
						}
					} else if (local41 == 1) {
						local57 = Static170.method2638(local15.anInt6195, local15.anInt6197, local15.anInt6205);
						if (local57 instanceof Class47_Sub4_Sub2) {
							local15.method5965();
						} else if (Static140.method2257(local15.anInt6195, local15.anInt6197, local15.anInt6205) == null) {
							local93 = new Class47_Sub4_Sub2(local15.anInt6209, local15.anInt6204, local15.anInt6210, local15.anInt6194, local15.anInt6200, local57);
							Static375.method5902(local15.anInt6195, local15.anInt6197, local15.anInt6205, local93, null);
						} else {
							local15.method5965();
						}
					} else if (local41 == 2) {
						local165 = Static286.method3918(local15.anInt6195, local15.anInt6197, local15.anInt6205, rq.class);
						if (local165 instanceof Class47_Sub1_Sub4) {
							local15.method5965();
						} else {
							Static201.method3103(local15.anInt6195, local15.anInt6197, local15.anInt6205, rq.class);
							@Pc(194) Class29 local194 = Static251.aClass207_2.method4977(local15.anInt6201);
							@Pc(205) int local205;
							@Pc(208) int local208;
							if (local15.anInt6204 == 1 || local15.anInt6204 == 3) {
								local208 = local194.anInt532;
								local205 = local194.anInt542;
							} else {
								local205 = local194.anInt532;
								local208 = local194.anInt542;
							}
							@Pc(249) Class47_Sub1_Sub4 local249 = new Class47_Sub1_Sub4(local15.anInt6209, local15.anInt6204, local15.anInt6195, local15.anInt6210, local15.anInt6194, local15.anInt6200, local15.anInt6197, local205 + local15.anInt6197 - 1, local15.anInt6205, local15.anInt6205 + local208 - 1, local165);
							Static97.method1543(local249, false);
						}
					} else if (local41 == 3) {
						local120 = Static112.method1764(local15.anInt6195, local15.anInt6197, local15.anInt6205);
						if (local120 instanceof Class47_Sub5_Sub3) {
							local15.method5965();
						} else {
							local139 = new Class47_Sub5_Sub3(local15.anInt6210, local15.anInt6194, local15.anInt6200, local120);
							Static55.method853(local15.anInt6195, local15.anInt6197, local15.anInt6205, local139);
						}
					}
				}
			}
		}
	}
}
