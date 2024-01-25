import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static163 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BI)I")
	public static int method2976(@OriginalArg(1) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
	public static void method2977() {
		if (Static73.aBoolean110) {
			return;
		}
		Static261.aBoolean359 = true;
		Static73.aBoolean110 = true;
		if (Static140.aClass6_Sub48_Sub1_1.aBoolean678) {
			Static331.aFloat140 = (int) Static331.aFloat140 - 17 & 0xFFFFFFF0;
		} else {
			Static345.aFloat142 += (-12.0F - Static345.aFloat142) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)Lclient!mc;")
	public static Class6_Sub31 method2978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class6_Sub31 local5 = null;
		if (arg0 == 0) {
			local5 = Static114.method2007(Static126.aClass47_143, Static337.aClass324_1);
		}
		if (arg0 == 1) {
			local5 = Static114.method2007(Static401.aClass47_111, Static337.aClass324_1);
		}
		local5.aClass6_Sub21_Sub2_2.method6037(Static138.anInt3088 + arg2);
		local5.aClass6_Sub21_Sub2_2.method6023(Static39.anInt4952 + arg1);
		local5.aClass6_Sub21_Sub2_2.method6062(Static365.aClass155_1.method4042(82) ? 1 : 0);
		Static71.aBoolean107 = false;
		Static210.anInt4254 = arg2;
		Static530.anInt8828 = arg1;
		Static494.method6740();
		return local5;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	public static void method2979() {
		Static14.aClass292ArrayArray1 = new Class292[Static118.aClass251_30.method5755()][];
		Static131.aClass292ArrayArray2 = new Class292[Static118.aClass251_30.method5755()][];
		Static285.aBooleanArray25 = new boolean[Static118.aClass251_30.method5755()];
	}
}
