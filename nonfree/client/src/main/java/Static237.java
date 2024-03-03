import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!on", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString39;

	@OriginalMember(owner = "client!on", name = "i", descriptor = "[S")
	public static short[] aShortArray78;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIIIBII)V", line = 29)
	public static void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static207.method3917(arg6)) {
			return;
		}
		if (Static106.aClass161ArrayArray2[arg6] == null) {
			Static42.method1402(Static25.aClass161ArrayArray1[arg6], -1, arg8, arg3, arg2, arg1, arg0, arg4, arg5, arg7);
		} else {
			Static42.method1402(Static106.aClass161ArrayArray2[arg6], -1, arg8, arg3, arg2, arg1, arg0, arg4, arg5, arg7);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIILclient!wm;)V", line = 47)
	public static void method3929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class19 arg4) {
		arg4.method2897(arg0, arg2, arg0 + arg3, arg1 + arg2);
		arg4.method2870(arg1, arg0, arg2, -16777216, arg3);
		if (Class235.anInt6569 < 100) {
			return;
		}
		@Pc(40) float local40 = (float) Static321.anInt6040 / (float) Static321.anInt6044;
		@Pc(42) int local42 = arg3;
		@Pc(44) int local44 = arg1;
		if (local40 < 1.0F) {
			local44 = (int) ((float) arg3 * local40);
		} else {
			local42 = (int) ((float) arg1 / local40);
		}
		@Pc(71) int local71 = arg0 + (arg3 - local42) / 2;
		@Pc(80) int local80 = arg2 + (arg1 - local44) / 2;
		if (Static346.aClass13_20 == null || Static346.aClass13_20.method6390() != arg3 || Static346.aClass13_20.method6383() != arg1) {
			Static321.method5531(Static321.anInt6045, Static321.anInt6043 + Static321.anInt6040, Static321.anInt6044 + Static321.anInt6045, Static321.anInt6043, local71, local80, local71 + local42, local44 + local80);
			Static321.method5523(arg4);
			Static346.aClass13_20 = arg4.method2820(local71, local80, local42, local44, false);
		}
		Static346.aClass13_20.method6386(local71, local80);
		@Pc(127) int local127 = local42 * Static41.anInt1104 / Static321.anInt6044;
		@Pc(133) int local133 = local44 * Static343.anInt6917 / Static321.anInt6040;
		@Pc(141) int local141 = Static166.anInt2314 * local42 / Static321.anInt6044 + local71;
		@Pc(155) int local155 = local44 + local80 - local133 - Static21.anInt548 * local44 / Static321.anInt6040;
		@Pc(157) int local157 = -1996554240;
		if (Class226.aClass50_4 == Class2_Sub3_Sub12.aClass50_1) {
			local157 = -1996488705;
		}
		arg4.method2903(local141, local155, local127, local133, local157, 1);
		arg4.method2838(local141, local155, local127, local133, local157, 0);
		if (Static226.anInt4488 <= 0) {
			return;
		}
		@Pc(194) int local194;
		if (Static84.anInt6624 > 50) {
			local194 = 500 - Static84.anInt6624 * 5;
		} else {
			local194 = Static84.anInt6624 * 5;
		}
		for (@Pc(205) Class2_Sub20 local205 = (Class2_Sub20) Class216.aClass135_36.method3552(); local205 != null; local205 = (Class2_Sub20) Class216.aClass135_36.method3553()) {
			@Pc(213) Class164 local213 = Static321.aClass125_4.method3380(local205.anInt2944);
			if (Static94.method2166(local213)) {
				@Pc(242) int local242;
				@Pc(255) int local255;
				if (local205.anInt2944 == Class11_Sub4_Sub1.anInt3974) {
					local242 = local42 * local205.anInt2946 / Static321.anInt6044 + local71;
					local255 = (Static321.anInt6040 - local205.anInt2949) * local44 / Static321.anInt6040 + local80;
					arg4.method2870(4, local242 - 2, local255 + -2, local194 << 24 | 0xFFFF00, 4);
				} else if (Class161.anInt4294 != -1 && local213.anInt4417 == Class161.anInt4294) {
					local242 = local71 + local205.anInt2946 * local42 / Static321.anInt6044;
					local255 = local80 + (Static321.anInt6040 - local205.anInt2949) * local44 / Static321.anInt6040;
					arg4.method2870(4, local242 - 2, local255 + -2, local194 << 24 | 0xFFFF00, 4);
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "f", descriptor = "(I)V", line = 166)
	public static void method3938() {
		for (@Pc(6) Class12_Sub6 local6 = (Class12_Sub6) Class2_Sub2_Sub6_Sub2.aClass36_10.method1426(); local6 != null; local6 = (Class12_Sub6) Class2_Sub2_Sub6_Sub2.aClass36_10.method1426()) {
			Static359.method6431(local6);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static203.aClass177_Sub1_2.method4496(Class2_Sub10.anInt1760)) {
			local31 = 0;
			local30 = 3;
		} else {
			local30 = Class2_Sub6.anInt1114;
			local31 = Class2_Sub6.anInt1114;
		}
		Static42.method1400();
		for (@Pc(40) int local40 = local31; local40 <= local30; local40++) {
			Static42.method1398();
			Static42.method1410(local40);
			Static42.method1411(local40);
		}
		Static42.method1409();
		Static42.method1412();
	}
}
