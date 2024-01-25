import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!na;Z)Z")
	public static boolean method2202(@OriginalArg(0) Class1_Sub4_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static499.aClass83Array3 == Static183.aClass83Array6;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method8132();
		if (arg0.aShort121 < 0 || arg0.aShort120 < 0 || arg0.aShort122 >= Static182.anInt3633 || arg0.aShort119 >= Static253.anInt4651) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort121; local36 <= arg0.aShort122; local36++) {
			for (local40 = arg0.aShort120; local40 <= arg0.aShort119; local40++) {
				@Pc(47) Class53 local47 = Static351.method7422(arg0.aByte126, local36, local40);
				if (local47 != null) {
					@Pc(53) Class289 local53 = Static110.method2419(arg0);
					@Pc(56) Class289 local56 = local47.aClass289_1;
					if (local56 == null) {
						local47.aClass289_1 = local53;
					} else {
						while (local56.aClass289_3 != null) {
							local56 = local56.aClass289_3;
						}
						local56.aClass289_3 = local53;
					}
					if (local6 && (Static429.anIntArrayArray47[local36][local40] & 0xFF000000) != 0) {
						local8 = Static429.anIntArrayArray47[local36][local40];
						local10 = Static15.aShortArrayArray1[local36][local40];
						local12 = Static237.aByteArrayArray14[local36][local40];
					}
					if (!arg1 && local47.aClass1_Sub4_Sub4_1 != null && local47.aClass1_Sub4_Sub4_1.aShort83 > local33) {
						local33 = local47.aClass1_Sub4_Sub4_1.aShort83;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort121; local40 <= arg0.aShort122; local40++) {
				for (@Pc(136) int local136 = arg0.aShort120; local136 <= arg0.aShort119; local136++) {
					if ((Static429.anIntArrayArray47[local40][local136] & 0xFF000000) == 0) {
						Static429.anIntArrayArray47[local40][local136] = local8;
						Static15.aShortArrayArray1[local40][local136] = local10;
						Static237.aByteArrayArray14[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static384.aClass1_Sub4_Sub2Array1[Static375.anInt7259++] = arg0;
		} else {
			local40 = Static499.aClass83Array3 == Static183.aClass83Array6 ? 1 : 0;
			if (!arg0.method8118()) {
				Static27.aClass1_Sub4ArrayArray1[local40][Static2.anIntArray3[local40]++] = arg0;
			} else if (arg0.method8128()) {
				Static343.aClass1_Sub4ArrayArray3[local40][Static291.anIntArray291[local40]++] = arg0;
			} else {
				Static124.aClass1_Sub4ArrayArray4[local40][Static156.anIntArray148[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt9932 -= local33;
		}
		return true;
	}
}
