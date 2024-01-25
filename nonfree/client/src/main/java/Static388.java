import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static388 {

	@OriginalMember(owner = "client!nv", name = "n", descriptor = "[[B")
	public static byte[][] aByteArrayArray21;

	@OriginalMember(owner = "client!nv", name = "w", descriptor = "D")
	public static double aDouble36;

	@OriginalMember(owner = "client!nv", name = "z", descriptor = "Lclient!rp;")
	public static Class2_Sub42 aClass2_Sub42_1;

	@OriginalMember(owner = "client!nv", name = "t", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_84 = new Class179(78, -1);

	@OriginalMember(owner = "client!nv", name = "e", descriptor = "(B)V")
	public static void method5229() {
		if (!Static601.aBoolean709) {
			Static257.aFloat69 += (24.0F - Static257.aFloat69) / 2.0F;
			Static601.aBoolean709 = true;
			Static68.aBoolean87 = true;
		}
	}

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "(I)V")
	public static void method5230() {
		Static53.aClass2_Sub22_Sub2_1.method8566();
		@Pc(13) int local13 = Static53.aClass2_Sub22_Sub2_1.method8569(8);
		@Pc(18) int local18;
		if (Static639.anInt10306 > local13) {
			for (local18 = local13; local18 < Static639.anInt10306; local18++) {
				Static314.anIntArray344[Static52.anInt1087++] = Static147.anIntArray182[local18];
			}
		}
		if (local13 > Static639.anInt10306) {
			throw new RuntimeException("gnpov1");
		}
		Static639.anInt10306 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(52) int local52 = Static147.anIntArray182[local18];
			@Pc(60) Class13_Sub1_Sub1_Sub1_Sub1 local60 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) local52)).aClass13_Sub1_Sub1_Sub1_Sub1_2;
			@Pc(65) int local65 = Static53.aClass2_Sub22_Sub2_1.method8569(1);
			if (local65 == 0) {
				Static147.anIntArray182[Static639.anInt10306++] = local52;
				local60.anInt4601 = Static205.anInt6320;
			} else {
				@Pc(85) int local85 = Static53.aClass2_Sub22_Sub2_1.method8569(2);
				if (local85 == 0) {
					Static147.anIntArray182[Static639.anInt10306++] = local52;
					local60.anInt4601 = Static205.anInt6320;
					Static75.anIntArray108[Static140.anInt2578++] = local52;
				} else {
					@Pc(131) int local131;
					@Pc(141) int local141;
					if (local85 == 1) {
						Static147.anIntArray182[Static639.anInt10306++] = local52;
						local60.anInt4601 = Static205.anInt6320;
						local131 = Static53.aClass2_Sub22_Sub2_1.method8569(3);
						local60.method397(local131, 1);
						local141 = Static53.aClass2_Sub22_Sub2_1.method8569(1);
						if (local141 == 1) {
							Static75.anIntArray108[Static140.anInt2578++] = local52;
						}
					} else if (local85 == 2) {
						Static147.anIntArray182[Static639.anInt10306++] = local52;
						local60.anInt4601 = Static205.anInt6320;
						if (Static53.aClass2_Sub22_Sub2_1.method8569(1) == 1) {
							local131 = Static53.aClass2_Sub22_Sub2_1.method8569(3);
							local60.method397(local131, 2);
							local141 = Static53.aClass2_Sub22_Sub2_1.method8569(3);
							local60.method397(local141, 2);
						} else {
							local131 = Static53.aClass2_Sub22_Sub2_1.method8569(3);
							local60.method397(local131, 0);
						}
						local131 = Static53.aClass2_Sub22_Sub2_1.method8569(1);
						if (local131 == 1) {
							Static75.anIntArray108[Static140.anInt2578++] = local52;
						}
					} else if (local85 == 3) {
						Static314.anIntArray344[Static52.anInt1087++] = local52;
					}
				}
			}
		}
	}
}
