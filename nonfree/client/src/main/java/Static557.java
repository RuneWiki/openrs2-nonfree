import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vea", name = "s", descriptor = "[I")
	public static int[] anIntArray656;

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!bw;I)V")
	public static void method7418(@OriginalArg(0) Class3_Sub11_Sub1 arg0) {
		arg0.method3101(Static104.aClass246_56.method5666());
		arg0.method3101(Static287.aClass246_135.method5666());
		arg0.method3101(Static531.aClass246_249.method5666());
		arg0.method3101(Static415.aClass246_259.method5666());
		arg0.method3101(Static35.aClass246_28.method5666());
		arg0.method3101(Static565.aClass246_261.method5666());
		arg0.method3101(Static576.aClass246_267.method5666());
		arg0.method3101(Static384.aClass246_184.method5666());
		arg0.method3101(Static171.aClass246_84.method5666());
		arg0.method3101(Static202.aClass246_101.method5666());
		arg0.method3101(Static325.aClass246_158.method5666());
		arg0.method3101(Static444.aClass246_208.method5666());
		arg0.method3101(Static151.aClass246_77.method5666());
		arg0.method3101(Static467.aClass246_221.method5666());
		arg0.method3101(Static437.aClass246_205.method5666());
		arg0.method3101(Static500.aClass246_235.method5666());
		arg0.method3101(Static114.aClass246_67.method5666());
		arg0.method3101(Static463.aClass246_219.method5666());
		arg0.method3101(Static79.aClass246_44.method5666());
		arg0.method3101(Static329.aClass246_162.method5666());
		arg0.method3101(Static462.aClass246_218.method5666());
		arg0.method3101(Static530.aClass246_248.method5666());
		arg0.method3101(Static334.aClass246_165.method5666());
		arg0.method3101(Static494.aClass246_232.method5666());
		arg0.method3101(Static376.aClass246_180.method5666());
		arg0.method3101(Static285.aClass246_133.method5666());
		arg0.method3101(Static89.aClass246_46.method5666());
		arg0.method3101(Static207.aClass246_105.method5666());
		arg0.method3101(Static549.aClass246_251.method5666());
		arg0.method3101(Static89.aClass246_47.method5666());
		arg0.method3101(Static329.aClass246_161.method5666());
		arg0.method3101(Static542.aClass246_250.method5666());
		arg0.method3101(Static464.method6436());
		arg0.method3101(Static35.method625());
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method7419(@OriginalArg(0) String arg0) {
		return Static66.method1525(kda.class, arg0);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!lk;I)Lclient!lk;")
	public static Class203 method7420(@OriginalArg(0) Class203 arg0) {
		@Pc(14) Class203 local14 = Static69.method1649(arg0);
		if (local14 == null) {
			local14 = arg0.aClass203_94;
		}
		return local14;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIIBIZ)V")
	public static void method7421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg3 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(51) int local51 = Static92.aShort30 + local21 * (Static282.aShort63 - Static92.aShort30) / 100;
		if (local51 < Static427.aShort96) {
			local51 = Static427.aShort96;
		} else if (local51 > Static515.aShort45) {
			local51 = Static515.aShort45;
		}
		@Pc(77) int local77 = local51 * arg3 * 512 / (arg0 * 334);
		@Pc(107) int local107;
		@Pc(114) int local114;
		@Pc(82) short local82;
		if (Static530.aShort111 > local77) {
			local82 = Static530.aShort111;
			local51 = local82 * 334 * arg0 / (arg3 * 512);
			if (local51 > Static515.aShort45) {
				local51 = Static515.aShort45;
				local107 = local51 * 512 * arg3 / (local82 * 334);
				local114 = (arg0 - local107) / 2;
				if (arg4) {
					Static4.aClass43_1.JA();
					Static4.aClass43_1.method7185(arg2, arg3, local114, arg1, -16777216);
					Static4.aClass43_1.method7185(arg2, arg3, local114, arg0 + arg1 - local114, -16777216);
				}
				arg1 += local114;
				arg0 -= local114 * 2;
			}
		} else if (local77 > Static422.aShort95) {
			local82 = Static422.aShort95;
			local51 = local82 * 334 * arg0 / (arg3 * 512);
			if (Static427.aShort96 > local51) {
				local51 = Static427.aShort96;
				local107 = local82 * 334 * arg0 / (local51 * 512);
				local114 = (arg3 - local107) / 2;
				if (arg4) {
					Static4.aClass43_1.JA();
					Static4.aClass43_1.method7185(arg2, local114, arg0, arg1, -16777216);
					Static4.aClass43_1.method7185(arg2 + arg3 - local114, local114, arg0, arg1, -16777216);
				}
				arg2 += local114;
				arg3 -= local114 * 2;
			}
		}
		Static446.anInt7361 = (short) arg3;
		Static290.anInt9206 = arg2;
		Static588.anInt2856 = (short) arg0;
		Static201.anInt4077 = arg1;
		Static143.anInt8271 = arg3 * local51 / 334;
	}
}
