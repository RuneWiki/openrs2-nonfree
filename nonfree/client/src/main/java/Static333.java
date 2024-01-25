import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!cs;Z)Z")
	public static boolean method5408(@OriginalArg(0) Class15_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static34.aClass86Array5 == Static253.aClass86Array4;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7558();
		if (arg0.aShort105 < 0 || arg0.aShort103 < 0 || arg0.aShort104 >= Static489.anInt8688 || arg0.aShort106 >= Static596.anInt10195) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort105; local36 <= arg0.aShort104; local36++) {
			for (local40 = arg0.aShort103; local40 <= arg0.aShort106; local40++) {
				@Pc(47) Class56 local47 = Static262.method4601(arg0.aByte124, local36, local40);
				if (local47 != null) {
					@Pc(53) Class152 local53 = Static147.method3035(arg0);
					@Pc(56) Class152 local56 = local47.aClass152_2;
					if (local56 == null) {
						local47.aClass152_2 = local53;
					} else {
						while (local56.aClass152_3 != null) {
							local56 = local56.aClass152_3;
						}
						local56.aClass152_3 = local53;
					}
					if (local6 && (Static442.anIntArrayArray43[local36][local40] & 0xFF000000) != 0) {
						local8 = Static442.anIntArrayArray43[local36][local40];
						local10 = Static431.aShortArrayArray10[local36][local40];
						local12 = Static117.aByteArrayArray48[local36][local40];
					}
					if (!arg1 && local47.aClass15_Sub1_Sub3_1 != null && local47.aClass15_Sub1_Sub3_1.aShort107 > local33) {
						local33 = local47.aClass15_Sub1_Sub3_1.aShort107;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort105; local40 <= arg0.aShort104; local40++) {
				for (@Pc(136) int local136 = arg0.aShort103; local136 <= arg0.aShort106; local136++) {
					if ((Static442.anIntArrayArray43[local40][local136] & 0xFF000000) == 0) {
						Static442.anIntArrayArray43[local40][local136] = local8;
						Static431.aShortArrayArray10[local40][local136] = local10;
						Static117.aByteArrayArray48[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static322.aClass15_Sub1_Sub2Array1[Static1.anInt10286++] = arg0;
		} else {
			local40 = Static34.aClass86Array5 == Static253.aClass86Array4 ? 1 : 0;
			if (!arg0.method8320()) {
				arg0.aClass15_Sub1_23 = Static16.aClass15_Sub1Array1[local40];
				Static16.aClass15_Sub1Array1[local40] = arg0;
			} else if (arg0.method8328()) {
				arg0.aClass15_Sub1_23 = Static351.aClass15_Sub1Array4[local40];
				Static351.aClass15_Sub1Array4[local40] = arg0;
			} else {
				arg0.aClass15_Sub1_23 = Static234.aClass15_Sub1Array3[local40];
				Static234.aClass15_Sub1Array3[local40] = arg0;
				Static147.aBoolean271 = true;
			}
		}
		if (arg1) {
			arg0.anInt10297 -= local33;
		}
		return true;
	}
}
