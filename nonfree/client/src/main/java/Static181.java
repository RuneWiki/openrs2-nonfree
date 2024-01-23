import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
	public static int anInt3455;

	@OriginalMember(owner = "client!nb", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23 = new String[200];

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
	public static int[] anIntArray383 = new int[100];

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	public static int anInt3469 = 0;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
	public static void method2937() {
		Static131.aClass26_25.method511();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public static void method2938() {
		Static149.aClass26_28.method511();
		Static125.aClass26_23.method511();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(III)I")
	public static int method2939(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(39) int local39 = Static284.method4368(arg1 + 91923, arg0 - -45365, 4) + (Static284.method4368(arg1 + 37821, arg0 + 10294, 2) - 128 >> 1) + (Static284.method4368(arg1, arg0, 1) + -128 >> 2) - 128;
		local39 = (int) ((double) local39 * 0.3D) + 35;
		if (local39 < 10) {
			local39 = 10;
		} else if (local39 > 60) {
			local39 = 60;
		}
		return local39;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;I)V")
	public static void method2940(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4) {
		for (@Pc(7) int local7 = 99; local7 > 0; local7--) {
			Static216.anIntArray447[local7] = Static216.anIntArray447[local7 - 1];
			Static118.aStringArray16[local7] = Static118.aStringArray16[local7 - 1];
			Static261.aStringArray31[local7] = Static261.aStringArray31[local7 - 1];
			Static16.aStringArray4[local7] = Static16.aStringArray4[local7 - 1];
			Static278.anIntArray598[local7] = Static278.anIntArray598[local7 - 1];
		}
		Static216.anIntArray447[0] = arg3;
		Static118.aStringArray16[0] = arg0;
		Static261.aStringArray31[0] = arg4;
		Static271.anInt5190 = Static261.anInt4980;
		Static278.anIntArray598[0] = arg1;
		anInt3469++;
		Static16.aStringArray4[0] = arg2;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIC)I")
	public static int method2941(@OriginalArg(1) int arg0, @OriginalArg(2) char arg1) {
		@Pc(12) int local12 = arg1 << 4;
		if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
			arg1 = Character.toLowerCase(arg1);
			local12 = (arg1 << 4) + 1;
		}
		if (arg1 == 'ñ' && arg0 == 0) {
			local12 = 1762;
		}
		return local12;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZI)V")
	public static void method2942(@OriginalArg(1) int arg0) {
		Static300.anInt5638--;
		if (Static300.anInt5638 == arg0) {
			return;
		}
		Static316.method73(Static259.aStringArray30, arg0 + 1, Static259.aStringArray30, arg0, Static300.anInt5638 - arg0);
		Static316.method73(Static249.aStringArray27, arg0 + 1, Static249.aStringArray27, arg0, Static300.anInt5638 - arg0);
		Static316.method74(Static86.anIntArray160, arg0 + 1, Static86.anIntArray160, arg0, Static300.anInt5638 - arg0);
		Static316.method78(Static262.aShortArray100, arg0 + 1, Static262.aShortArray100, arg0, Static300.anInt5638 - arg0);
		Static316.method79(Static141.aLongArray56, arg0 + 1, Static141.aLongArray56, arg0, Static300.anInt5638 - arg0);
		Static316.method74(Static73.anIntArray117, arg0 + 1, Static73.anIntArray117, arg0, Static300.anInt5638 - arg0);
		Static316.method74(Static262.anIntArray543, arg0 + 1, Static262.anIntArray543, arg0, Static300.anInt5638 - arg0);
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public static void method2943() {
		Static18.aBoolean17 = false;
		Static300.anInt5638 = 0;
		Static34.anInt552 = -1;
		Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
		Static174.anInt3335 = -1;
		Static113.anInt2273 = -1;
		Static63.anInt1231 = -1;
		Static135.anInt2583 = 0;
		Static189.aClass4_Sub10_Sub1_2.anInt5713 = 0;
		Static225.anInt4330 = 0;
		Static21.anInt1052 = 0;
		Static8.method115();
		@Pc(33) int local33;
		for (local33 = 0; local33 < Static182.aClass53_Sub1_Sub1Array1.length; local33++) {
			if (Static182.aClass53_Sub1_Sub1Array1[local33] != null) {
				Static182.aClass53_Sub1_Sub1Array1[local33].anInt3985 = -1;
			}
		}
		for (local33 = 0; local33 < Static110.aClass53_Sub1_Sub2Array1.length; local33++) {
			if (Static110.aClass53_Sub1_Sub2Array1[local33] != null) {
				Static110.aClass53_Sub1_Sub2Array1[local33].anInt3985 = -1;
			}
		}
		Static44.method715();
		Static41.anInt772 = 1;
		Static15.method233(30);
		for (local33 = 0; local33 < 100; local33++) {
			Static85.aBooleanArray8[local33] = true;
		}
		Static131.method2002();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!p;)V")
	public static void method2944(@OriginalArg(1) Class53_Sub1_Sub2 arg0) {
		for (@Pc(14) Class4_Sub11 local14 = (Class4_Sub11) Static82.aClass114_9.method2623(); local14 != null; local14 = (Class4_Sub11) Static82.aClass114_9.method2629()) {
			if (arg0 == local14.aClass53_Sub1_Sub2_1) {
				if (local14.aClass4_Sub6_Sub4_3 != null) {
					Static211.aClass4_Sub6_Sub3_2.method2683(local14.aClass4_Sub6_Sub4_3);
					local14.aClass4_Sub6_Sub4_3 = null;
				}
				local14.method4854();
				return;
			}
		}
	}
}
