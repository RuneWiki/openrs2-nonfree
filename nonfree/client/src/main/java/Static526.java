import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static526 {

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
	public static int[] anIntArray619;

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "[[[Lclient!ms;")
	public static Class228[][][] aClass228ArrayArrayArray7;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
	public static int anInt9652;

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!mv;")
	public static Class229 aClass229_133;

	@OriginalMember(owner = "client!ua", name = "c", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_168 = new Class349(69, 5);

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!wo;Z)Z")
	public static boolean method7745(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static114.aClass151Array1 == Static320.aClass151Array3;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7514();
		if (arg0.aShort120 < 0 || arg0.aShort121 < 0 || arg0.aShort119 >= Static83.anInt1434 || arg0.aShort122 >= Static405.anInt6657) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort120; local36 <= arg0.aShort119; local36++) {
			for (local40 = arg0.aShort121; local40 <= arg0.aShort122; local40++) {
				@Pc(47) Class228 local47 = Static199.method2502(arg0.aByte128, local36, local40);
				if (local47 != null) {
					@Pc(53) Class180 local53 = Static378.method5263(arg0);
					@Pc(56) Class180 local56 = local47.aClass180_3;
					if (local56 == null) {
						local47.aClass180_3 = local53;
					} else {
						while (local56.aClass180_2 != null) {
							local56 = local56.aClass180_2;
						}
						local56.aClass180_2 = local53;
					}
					if (local6 && (Static434.anIntArrayArray48[local36][local40] & 0xFF000000) != 0) {
						local8 = Static434.anIntArrayArray48[local36][local40];
						local10 = Static94.aShortArrayArray7[local36][local40];
						local12 = Static576.aByteArrayArray24[local36][local40];
					}
					if (!arg1 && local47.aClass12_Sub2_Sub2_1 != null && local47.aClass12_Sub2_Sub2_1.aShort39 > local33) {
						local33 = local47.aClass12_Sub2_Sub2_1.aShort39;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort120; local40 <= arg0.aShort119; local40++) {
				for (@Pc(136) int local136 = arg0.aShort121; local136 <= arg0.aShort122; local136++) {
					if ((Static434.anIntArrayArray48[local40][local136] & 0xFF000000) == 0) {
						Static434.anIntArrayArray48[local40][local136] = local8;
						Static94.aShortArrayArray7[local40][local136] = local10;
						Static576.aByteArrayArray24[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static256.aClass12_Sub2_Sub1Array1[Static153.anInt2452++] = arg0;
		} else {
			local40 = Static114.aClass151Array1 == Static320.aClass151Array3 ? 1 : 0;
			if (!arg0.method7513()) {
				Static585.aClass12_Sub2ArrayArray3[local40][Static535.anIntArray577[local40]++] = arg0;
			} else if (arg0.method7503()) {
				Static310.aClass12_Sub2ArrayArray2[local40][Static503.anIntArray540[local40]++] = arg0;
			} else {
				Static146.aClass12_Sub2ArrayArray1[local40][Static313.anIntArray359[local40]++] = arg0;
			}
		}
		if (arg1) {
			arg0.anInt9373 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z")
	public static boolean method7746(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}
}
