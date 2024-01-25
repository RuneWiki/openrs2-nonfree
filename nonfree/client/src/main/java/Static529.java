import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static529 {

	@OriginalMember(owner = "client!wda", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString217;

	@OriginalMember(owner = "client!wda", name = "d", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_464 = new Class305(16, -2);

	@OriginalMember(owner = "client!wda", name = "i", descriptor = "[Lclient!mca;")
	public static Class38_Sub1[] aClass38_Sub1Array140 = new Class38_Sub1[0];

	@OriginalMember(owner = "client!wda", name = "j", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_465 = new Class305(52, -2);

	@OriginalMember(owner = "client!wda", name = "k", descriptor = "[I")
	public static final int[] anIntArray839 = new int[13];

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(II)V")
	public static void method8235(@OriginalArg(1) int arg0) {
		if (!Static278.method4887(arg0)) {
			return;
		}
		@Pc(22) Class91[] local22 = Static511.aClass91ArrayArray2[arg0];
		for (@Pc(24) int local24 = 0; local24 < local22.length; local24++) {
			@Pc(30) Class91 local30 = local22[local24];
			if (local30 != null) {
				local30.anInt2393 = 0;
				local30.anInt2381 = 1;
				local30.anInt2369 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wda", name = "b", descriptor = "(B)[Lclient!bv;")
	public static Class39[] method8236() {
		return new Class39[] { Static10.aClass39_1, Static10.aClass39_2, Static10.aClass39_3, Static10.aClass39_4, Static10.aClass39_5, Static10.aClass39_6, Static10.aClass39_7, Static10.aClass39_8, Static10.aClass39_9, Static10.aClass39_10, Static10.aClass39_11, Static10.aClass39_12, Static10.aClass39_13, Static10.aClass39_14 };
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method8237(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static332.anInt6224++;
		Static90.anInt2018 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static478.anInt8507; local7 < Static63.anInt1587; local7++) {
			@Pc(12) Class64[][] local12 = Static263.aClass64ArrayArrayArray3[local7];
			for (local14 = Static395.anInt6943; local14 < Static332.anInt6223; local14++) {
				for (@Pc(17) int local17 = Static301.anInt5882; local17 < Static287.anInt7764; local17++) {
					@Pc(24) Class64 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static38.aBooleanArrayArray1[local14 + Static466.anInt8044 - Static539.anInt9517][local17 + Static466.anInt8044 - Static421.anInt7325] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean154 = true;
							local24.aBoolean153 = true;
							if (local24.aClass232_2 == null) {
								local24.aBoolean152 = false;
							} else {
								local24.aBoolean152 = true;
							}
							Static90.anInt2018++;
						} else {
							local24.aBoolean154 = false;
							local24.aBoolean153 = false;
							local24.aByte28 = 0;
							if (local14 >= Static539.anInt9517 - 16 && local14 <= Static539.anInt9517 + 16 && local17 >= Static421.anInt7325 - 16 && local17 <= Static421.anInt7325 + 16 && (local24.aClass20_Sub2_1 != null || local24.aClass20_Sub2_2 != null || local24.aClass20_Sub4_2 != null || local24.aClass20_Sub4_1 != null || local24.aClass20_Sub5_1 != null || local24.aClass232_2 != null)) {
								Static164.aClass40_1.method8217(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static207.aClass7Array7 == Static296.aClass7Array11;
		for (local14 = Static478.anInt8507; local14 < Static63.anInt1587; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static281.aClass4_9.method7166() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static38.aBooleanArrayArray1.length;
				if (Static395.anInt6943 + Static38.aBooleanArrayArray1.length > Static501.anInt9458) {
					local172 -= Static395.anInt6943 + Static38.aBooleanArrayArray1.length - Static501.anInt9458;
				}
				@Pc(192) int local192 = Static38.aBooleanArrayArray1[0].length;
				if (Static301.anInt5882 + Static38.aBooleanArrayArray1[0].length > Static420.anInt7323) {
					local192 -= Static301.anInt5882 + Static38.aBooleanArrayArray1[0].length - Static420.anInt7323;
				}
				@Pc(213) int local213 = Static221.anInt4328;
				while (true) {
					if (local213 >= local172) {
						Static164.aClass40_1.method8216(Static296.aClass7Array11[local14], local14, true, local161);
						break;
					}
					@Pc(220) int local220 = local213 + Static395.anInt6943 - Static221.anInt4328;
					for (@Pc(222) int local222 = Static189.anInt3921; local222 < local192; local222++) {
						Static442.aBooleanArrayArray10[local213][local222] = false;
						if (Static38.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static301.anInt5882 - Static189.anInt3921;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static263.aClass64ArrayArrayArray3[local243][local220][local241] != null && Static263.aClass64ArrayArrayArray3[local243][local220][local241].aByte27 == local14) {
									Static442.aBooleanArrayArray10[local213][local222] = Static263.aClass64ArrayArrayArray3[local243][local220][local241].aBoolean154;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static164.aClass40_1.method8216(Static296.aClass7Array11[local14], local14, false, local161);
			}
			Static164.aClass40_1.method8209();
		}
		if (!Static318.method5464(true)) {
			Static318.method5464(false);
		}
	}

	@OriginalMember(owner = "client!wda", name = "a", descriptor = "(III)Z")
	public static boolean method8238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static232.anIntArrayArrayArray11[arg0][arg1][arg2];
		if (local7 == -Static332.anInt6224) {
			return false;
		} else if (local7 == Static332.anInt6224) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << Static275.anInt5260;
			@Pc(26) int local26 = arg2 << Static275.anInt5260;
			if (Static188.method3617(local22 + 1, Static296.aClass7Array11[arg0].ba(arg1, arg2), local26 + 1) && Static188.method3617(local22 + Static382.anInt6794 - 1, Static296.aClass7Array11[arg0].ba(arg1 + 1, arg2), local26 + 1) && Static188.method3617(local22 + Static382.anInt6794 - 1, Static296.aClass7Array11[arg0].ba(arg1 + 1, arg2 + 1), local26 + Static382.anInt6794 - 1) && Static188.method3617(local22 + 1, Static296.aClass7Array11[arg0].ba(arg1, arg2 + 1), local26 + Static382.anInt6794 - 1) && Static188.method3617(local22 + Static270.anInt5197, Static296.aClass7Array11[arg0].ba(arg1, arg2), local26 + 1) && Static188.method3617(local22 + Static382.anInt6794 - 1, Static296.aClass7Array11[arg0].ba(arg1 + 1, arg2), local26 + Static270.anInt5197) && Static188.method3617(local22 + Static270.anInt5197, Static296.aClass7Array11[arg0].ba(arg1, arg2 + 1), local26 + Static382.anInt6794 - 1) && Static188.method3617(local22 + Static382.anInt6794 - 1, Static296.aClass7Array11[arg0].ba(arg1, arg2), local26 + Static270.anInt5197) && Static188.method3617(local22 + Static270.anInt5197, Static296.aClass7Array11[arg0].ba(arg1, arg2), local26 + Static270.anInt5197)) {
				Static232.anIntArrayArrayArray11[arg0][arg1][arg2] = Static332.anInt6224;
				return true;
			} else {
				Static232.anIntArrayArrayArray11[arg0][arg1][arg2] = -Static332.anInt6224;
				return false;
			}
		}
	}
}
