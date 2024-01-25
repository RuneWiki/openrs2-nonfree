import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!po", name = "r", descriptor = "Lclient!mo;")
	public static Class143 aClass143_93;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "I")
	public static int anInt4851 = 0;

	@OriginalMember(owner = "client!po", name = "q", descriptor = "[Lclient!g;")
	public static final Class71[] aClass71Array1 = new Class71[4];

	@OriginalMember(owner = "client!po", name = "x", descriptor = "[I")
	public static final int[] anIntArray439 = new int[50];

	@OriginalMember(owner = "client!po", name = "e", descriptor = "(I)V")
	public static void method4373() {
		Static281.aClass11_124.method213();
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(II)V")
	public static void method4374(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static95.anInt2210 = arg0;
	}

	@OriginalMember(owner = "client!po", name = "f", descriptor = "(I)V")
	public static void method4375() {
		Static21.aStringArray23 = new String[500];
		Static176.anInt3874 = Static108.aClass76_5.anInt2285 + Static108.aClass76_5.anInt2286 + 2;
		Static223.anInt5819 = Static223.aClass76_9.anInt2285 + Static223.aClass76_9.anInt2286 + 2;
		for (@Pc(32) int local32 = 0; local32 < Static21.aStringArray23.length; local32++) {
			Static21.aStringArray23[local32] = "";
		}
	}

	@OriginalMember(owner = "client!po", name = "g", descriptor = "(I)V")
	public static void method4377() {
		Static30.aClass14_Sub4_Sub2_1.method2556();
		@Pc(13) int local13 = Static30.aClass14_Sub4_Sub2_1.method2558(8);
		@Pc(18) int local18;
		if (local13 < Static315.anInt6456) {
			for (local18 = local13; local18 < Static315.anInt6456; local18++) {
				Static4.anIntArray6[Static164.anInt3458++] = Static98.anIntArray205[local18];
			}
		}
		if (local13 > Static315.anInt6456) {
			throw new RuntimeException("gnpov1");
		}
		Static315.anInt6456 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(61) int local61 = Static98.anIntArray205[local18];
			@Pc(65) Class10_Sub3_Sub3_Sub1 local65 = Static266.aClass10_Sub3_Sub3_Sub1Array1[local61];
			@Pc(70) int local70 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
			if (local70 == 0) {
				Static98.anIntArray205[Static315.anInt6456++] = local61;
				local65.anInt5927 = Static153.anInt3257;
			} else {
				@Pc(95) int local95 = Static30.aClass14_Sub4_Sub2_1.method2558(2);
				if (local95 == 0) {
					Static98.anIntArray205[Static315.anInt6456++] = local61;
					local65.anInt5927 = Static153.anInt3257;
					Static116.anIntArray227[Static222.anInt4457++] = local61;
				} else {
					@Pc(139) int local139;
					@Pc(149) int local149;
					if (local95 == 1) {
						Static98.anIntArray205[Static315.anInt6456++] = local61;
						local65.anInt5927 = Static153.anInt3257;
						local139 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
						local65.method5361(local139, 1);
						local149 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
						if (local149 == 1) {
							Static116.anIntArray227[Static222.anInt4457++] = local61;
						}
					} else if (local95 == 2) {
						Static98.anIntArray205[Static315.anInt6456++] = local61;
						local65.anInt5927 = Static153.anInt3257;
						if (Static30.aClass14_Sub4_Sub2_1.method2558(1) == 1) {
							local139 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
							local65.method5361(local139, 2);
							local149 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
							local65.method5361(local149, 2);
						} else {
							local139 = Static30.aClass14_Sub4_Sub2_1.method2558(3);
							local65.method5361(local139, 0);
						}
						local139 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
						if (local139 == 1) {
							Static116.anIntArray227[Static222.anInt4457++] = local61;
						}
					} else if (local95 == 3) {
						Static4.anIntArray6[Static164.anInt3458++] = local61;
					}
				}
			}
		}
	}
}
