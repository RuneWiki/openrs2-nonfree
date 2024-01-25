import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!di", name = "m", descriptor = "I")
	public static int anInt2052 = 0;

	@OriginalMember(owner = "client!di", name = "g", descriptor = "I")
	public static int anInt2058 = 0;

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V")
	public static void method1981() {
		try {
			@Pc(17) int local17;
			if (Static432.anInt7414 == 1) {
				local17 = Static449.aClass6_Sub17_Sub4_3.method6072();
				if (local17 > 0 && Static449.aClass6_Sub17_Sub4_3.method6077()) {
					local17 -= Static99.anInt2024;
					if (local17 < 0) {
						local17 = 0;
					}
					Static449.aClass6_Sub17_Sub4_3.method6064(local17);
					return;
				}
				Static449.aClass6_Sub17_Sub4_3.method6095();
				Static449.aClass6_Sub17_Sub4_3.method6073();
				if (Static672.aClass223_121 == null) {
					Static432.anInt7414 = 0;
				} else {
					Static432.anInt7414 = 2;
				}
				Static63.aClass6_Sub27_1 = null;
				Static513.aClass181_1 = null;
			}
			if (Static432.anInt7414 == 3) {
				local17 = Static449.aClass6_Sub17_Sub4_3.method6072();
				if (Static417.anInt7212 > local17 && Static449.aClass6_Sub17_Sub4_3.method6077()) {
					local17 += Static98.anInt1458;
					if (local17 > Static417.anInt7212) {
						local17 = Static417.anInt7212;
					}
					Static449.aClass6_Sub17_Sub4_3.method6064(local17);
				} else {
					Static432.anInt7414 = 0;
					Static98.anInt1458 = 0;
				}
			}
		} catch (@Pc(104) Exception local104) {
			local104.printStackTrace();
			Static449.aClass6_Sub17_Sub4_3.method6095();
			Static145.aClass6_Sub17_Sub4_2 = null;
			Static513.aClass181_1 = null;
			Static672.aClass223_121 = null;
			Static63.aClass6_Sub27_1 = null;
			Static432.anInt7414 = 0;
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIBI)V")
	public static void method1982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = arg4 + 1;
		Static367.method5559(-7, arg0, arg2, Static36.anIntArrayArray4[arg4], arg1);
		@Pc(20) int local20 = arg3 - 1;
		Static367.method5559(-7, arg0, arg2, Static36.anIntArrayArray4[arg3], arg1);
		for (@Pc(30) int local30 = local11; local30 <= local20; local30++) {
			@Pc(36) int[] local36 = Static36.anIntArrayArray4[local30];
			local36[arg0] = local36[arg1] = arg2;
		}
	}
}
