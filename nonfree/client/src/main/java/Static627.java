import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static627 {

	@OriginalMember(owner = "client!wea", name = "F", descriptor = "Lclient!id;")
	public static Class157 aClass157_6;

	@OriginalMember(owner = "client!wea", name = "L", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_72 = new Class136(8);

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lclient!ht;Z)Z")
	public static boolean method8508(@OriginalArg(0) Class9_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static637.aClass91Array4 == Static485.aClass91Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8616();
		if (arg0.aShort126 < 0 || arg0.aShort124 < 0 || arg0.aShort127 >= Static573.anInt6750 || arg0.aShort125 >= Static547.anInt9143) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort126; local36 <= arg0.aShort127; local36++) {
			for (local40 = arg0.aShort124; local40 <= arg0.aShort125; local40++) {
				@Pc(47) Class351 local47 = Static175.method2895(arg0.aByte127, local36, local40);
				if (local47 != null) {
					@Pc(53) Class105 local53 = Static362.method5812(arg0);
					@Pc(56) Class105 local56 = local47.aClass105_3;
					if (local56 == null) {
						local47.aClass105_3 = local53;
					} else {
						while (local56.aClass105_1 != null) {
							local56 = local56.aClass105_1;
						}
						local56.aClass105_1 = local53;
					}
					if (local6 && (Static411.anIntArrayArray48[local36][local40] & 0xFF000000) != 0) {
						local8 = Static411.anIntArrayArray48[local36][local40];
						local10 = Static616.aShortArrayArray20[local36][local40];
						local12 = Static52.aByteArrayArray4[local36][local40];
					}
					if (!arg1 && local47.aClass9_Sub2_Sub4_1 != null && local47.aClass9_Sub2_Sub4_1.aShort93 > local33) {
						local33 = local47.aClass9_Sub2_Sub4_1.aShort93;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort126; local40 <= arg0.aShort127; local40++) {
				for (@Pc(136) int local136 = arg0.aShort124; local136 <= arg0.aShort125; local136++) {
					if ((Static411.anIntArrayArray48[local40][local136] & 0xFF000000) == 0) {
						Static411.anIntArrayArray48[local40][local136] = local8;
						Static616.aShortArrayArray20[local40][local136] = local10;
						Static52.aByteArrayArray4[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static513.aClass9_Sub2_Sub1Array1[Static135.anInt2825++] = arg0;
		} else {
			local40 = Static637.aClass91Array4 == Static485.aClass91Array1 ? 1 : 0;
			if (!arg0.method8597()) {
				arg0.aClass9_Sub2_23 = Static164.aClass9_Sub2Array1[local40];
				Static164.aClass9_Sub2Array1[local40] = arg0;
			} else if (arg0.method8607()) {
				arg0.aClass9_Sub2_23 = Static250.aClass9_Sub2Array5[local40];
				Static250.aClass9_Sub2Array5[local40] = arg0;
			} else {
				arg0.aClass9_Sub2_23 = Static463.aClass9_Sub2Array6[local40];
				Static463.aClass9_Sub2Array6[local40] = arg0;
				Static334.aBoolean462 = true;
			}
		}
		if (arg1) {
			arg0.anInt10154 -= local33;
		}
		return true;
	}
}
