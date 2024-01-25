import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!nk", name = "O", descriptor = "[F")
	public static final float[] aFloatArray55 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!bba;Z)Z")
	public static boolean method5741(@OriginalArg(0) Class11_Sub1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static331.aClass112Array3 == Static164.aClass112Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method5637();
		if (arg0.aShort95 < 0 || arg0.aShort97 < 0 || arg0.aShort96 >= Static347.anInt6411 || arg0.aShort94 >= Static191.anInt6006) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort95; local36 <= arg0.aShort96; local36++) {
			for (local40 = arg0.aShort97; local40 <= arg0.aShort94; local40++) {
				@Pc(47) Class217 local47 = Static334.method5171(arg0.aByte124, local36, local40);
				if (local47 != null) {
					@Pc(53) Class61 local53 = Static620.method8435(arg0);
					@Pc(56) Class61 local56 = local47.aClass61_2;
					if (local56 == null) {
						local47.aClass61_2 = local53;
					} else {
						while (local56.aClass61_1 != null) {
							local56 = local56.aClass61_1;
						}
						local56.aClass61_1 = local53;
					}
					if (local6 && (Static41.anIntArrayArray9[local36][local40] & 0xFF000000) != 0) {
						local8 = Static41.anIntArrayArray9[local36][local40];
						local10 = Static588.aShortArrayArray31[local36][local40];
						local12 = Static150.aByteArrayArray6[local36][local40];
					}
					if (!arg1 && local47.aClass11_Sub1_Sub4_1 != null && local47.aClass11_Sub1_Sub4_1.aShort113 > local33) {
						local33 = local47.aClass11_Sub1_Sub4_1.aShort113;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort95; local40 <= arg0.aShort96; local40++) {
				for (@Pc(136) int local136 = arg0.aShort97; local136 <= arg0.aShort94; local136++) {
					if ((Static41.anIntArrayArray9[local40][local136] & 0xFF000000) == 0) {
						Static41.anIntArrayArray9[local40][local136] = local8;
						Static588.aShortArrayArray31[local40][local136] = local10;
						Static150.aByteArrayArray6[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static310.aClass11_Sub1_Sub1Array1[Static226.anInt4632++] = arg0;
		} else {
			local40 = Static331.aClass112Array3 == Static164.aClass112Array1 ? 1 : 0;
			if (!arg0.method8306()) {
				Static483.aClass11_Sub1ArrayArray3[local40][Static429.anIntArray527[local40]++] = arg0;
			} else if (arg0.method8310()) {
				Static146.aClass11_Sub1ArrayArray1[local40][Static442.anIntArray535[local40]++] = arg0;
			} else {
				Static317.aClass11_Sub1ArrayArray2[local40][Static336.anIntArray411[local40]++] = arg0;
				Static445.aBoolean594 = true;
			}
		}
		if (arg1) {
			arg0.anInt9930 -= local33;
		}
		return true;
	}
}
