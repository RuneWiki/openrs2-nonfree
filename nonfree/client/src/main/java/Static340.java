import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "I")
	public static int anInt5517;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_100 = new Class198("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZLclient!kt;IIBII)V")
	public static void method4406(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class143 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static344.anInt5625 >= 50 || (arg1 == null || arg1.anIntArrayArray30 == null || arg3 >= arg1.anIntArrayArray30.length || arg1.anIntArrayArray30[arg3] == null)) {
			return;
		}
		@Pc(32) int local32 = arg1.anIntArrayArray30[arg3][0];
		@Pc(36) int local36 = local32 >> 8;
		@Pc(42) int local42 = local32 >> 5 & 0x7;
		@Pc(65) int local65;
		if (arg1.anIntArrayArray30[arg3].length > 1) {
			local65 = (int) (Math.random() * (double) arg1.anIntArrayArray30[arg3].length);
			if (local65 > 0) {
				local36 = arg1.anIntArrayArray30[arg3][local65];
			}
		}
		@Pc(81) int local81 = local32 & 0x1F;
		if (local81 == 0) {
			if (arg0) {
				Static64.method1000(local42, 0, local36, 255);
			}
		} else if (Static216.aClass1_Sub1_1.anInt4521 != 0) {
			local65 = arg2 - 64 >> 7;
			@Pc(108) int local108 = arg4 - 64 >> 7;
			Static113.aClass75Array1[Static344.anInt5625++] = new Class75((byte) 1, local36, local42, 0, 255, (local108 << 8) + (arg5 << 24) + (local65 << 16) + local81);
		}
	}

	@OriginalMember(owner = "client!qn", name = "f", descriptor = "(I)V")
	public static void method4407() {
		Static76.aClass5_Sub15_Sub2_1.method5605();
		@Pc(13) int local13 = Static76.aClass5_Sub15_Sub2_1.method5610(8);
		@Pc(18) int local18;
		if (Static424.anInt7114 > local13) {
			for (local18 = local13; local18 < Static424.anInt7114; local18++) {
				Static419.anIntArray477[Static217.anInt3644++] = Static218.anIntArray351[local18];
			}
		}
		if (Static424.anInt7114 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static424.anInt7114 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(52) int local52 = Static218.anIntArray351[local18];
			@Pc(60) Class2_Sub1_Sub3_Sub1 local60 = ((Class5_Sub7) Static380.aClass252_36.method5659((long) local52)).aClass2_Sub1_Sub3_Sub1_1;
			@Pc(65) int local65 = Static76.aClass5_Sub15_Sub2_1.method5610(1);
			if (local65 == 0) {
				Static218.anIntArray351[Static424.anInt7114++] = local52;
				local60.anInt6163 = Static85.anInt1536;
			} else {
				@Pc(85) int local85 = Static76.aClass5_Sub15_Sub2_1.method5610(2);
				if (local85 == 0) {
					Static218.anIntArray351[Static424.anInt7114++] = local52;
					local60.anInt6163 = Static85.anInt1536;
					Static175.anIntArray133[Static182.anInt3087++] = local52;
				} else {
					@Pc(130) int local130;
					@Pc(142) int local142;
					if (local85 == 1) {
						Static218.anIntArray351[Static424.anInt7114++] = local52;
						local60.anInt6163 = Static85.anInt1536;
						local130 = Static76.aClass5_Sub15_Sub2_1.method5610(3);
						local60.method4089(1, local130);
						local142 = Static76.aClass5_Sub15_Sub2_1.method5610(1);
						if (local142 == 1) {
							Static175.anIntArray133[Static182.anInt3087++] = local52;
						}
					} else if (local85 == 2) {
						Static218.anIntArray351[Static424.anInt7114++] = local52;
						local60.anInt6163 = Static85.anInt1536;
						if (Static76.aClass5_Sub15_Sub2_1.method5610(1) == 1) {
							local130 = Static76.aClass5_Sub15_Sub2_1.method5610(3);
							local60.method4089(2, local130);
							local142 = Static76.aClass5_Sub15_Sub2_1.method5610(3);
							local60.method4089(2, local142);
						} else {
							local130 = Static76.aClass5_Sub15_Sub2_1.method5610(3);
							local60.method4089(0, local130);
						}
						local130 = Static76.aClass5_Sub15_Sub2_1.method5610(1);
						if (local130 == 1) {
							Static175.anIntArray133[Static182.anInt3087++] = local52;
						}
					} else if (local85 == 3) {
						Static419.anIntArray477[Static217.anInt3644++] = local52;
					}
				}
			}
		}
	}
}
