import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_24 = new Class391(4);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "[F")
	public static final float[] aFloatArray39 = new float[16];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	public static void method4067() {
		@Pc(18) byte[] local18;
		if (Static138.anObject3 == null) {
			@Pc(9) Class40_Sub2_Sub1 local9 = new Class40_Sub2_Sub1();
			local18 = local9.method6551();
			Static138.anObject3 = Static631.method8844(local18);
		}
		if (Static215.anObject5 == null) {
			@Pc(36) Class40_Sub1_Sub2 local36 = new Class40_Sub1_Sub2();
			local18 = local36.method8842();
			Static215.anObject5 = Static631.method8844(local18);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	public static void method4068() {
		Static515.aClass5_Sub23_Sub2_1.method8549();
		@Pc(21) int local21 = Static515.aClass5_Sub23_Sub2_1.method8550(8);
		@Pc(30) int local30;
		if (Static247.anInt4256 > local21) {
			for (local30 = local21; local30 < Static247.anInt4256; local30++) {
				Static118.anIntArray16[Static552.anInt9321++] = Static671.anIntArray620[local30];
			}
		}
		if (Static247.anInt4256 < local21) {
			throw new RuntimeException("gnpov1");
		}
		Static247.anInt4256 = 0;
		for (local30 = 0; local30 < local21; local30++) {
			@Pc(71) int local71 = Static671.anIntArray620[local30];
			@Pc(79) Class8_Sub1_Sub3_Sub2_Sub2 local79 = ((Class5_Sub35) Static623.aClass291_43.method6993((long) local71, 1)).aClass8_Sub1_Sub3_Sub2_Sub2_2;
			@Pc(84) int local84 = Static515.aClass5_Sub23_Sub2_1.method8550(1);
			if (local84 == 0) {
				Static671.anIntArray620[Static247.anInt4256++] = local71;
				local79.anInt7040 = Static550.anInt9297;
			} else {
				@Pc(109) int local109 = Static515.aClass5_Sub23_Sub2_1.method8550(2);
				if (local109 == 0) {
					Static671.anIntArray620[Static247.anInt4256++] = local71;
					local79.anInt7040 = Static550.anInt9297;
					Static222.anIntArray207[Static560.anInt9473++] = local71;
				} else {
					@Pc(158) int local158;
					@Pc(168) int local168;
					if (local109 == 1) {
						Static671.anIntArray620[Static247.anInt4256++] = local71;
						local79.anInt7040 = Static550.anInt9297;
						local158 = Static515.aClass5_Sub23_Sub2_1.method8550(3);
						local79.method6007(local158, -107, 1);
						local168 = Static515.aClass5_Sub23_Sub2_1.method8550(1);
						if (local168 == 1) {
							Static222.anIntArray207[Static560.anInt9473++] = local71;
						}
					} else if (local109 == 2) {
						Static671.anIntArray620[Static247.anInt4256++] = local71;
						local79.anInt7040 = Static550.anInt9297;
						if (Static515.aClass5_Sub23_Sub2_1.method8550(1) == 1) {
							local158 = Static515.aClass5_Sub23_Sub2_1.method8550(3);
							local79.method6007(local158, -112, 2);
							local168 = Static515.aClass5_Sub23_Sub2_1.method8550(3);
							local79.method6007(local168, -126, 2);
						} else {
							local158 = Static515.aClass5_Sub23_Sub2_1.method8550(3);
							local79.method6007(local158, -109, 0);
						}
						local158 = Static515.aClass5_Sub23_Sub2_1.method8550(1);
						if (local158 == 1) {
							Static222.anIntArray207[Static560.anInt9473++] = local71;
						}
					} else if (local109 == 3) {
						Static118.anIntArray16[Static552.anInt9321++] = local71;
					}
				}
			}
		}
	}
}
