import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "I")
	public static int anInt6764;

	@OriginalMember(owner = "client!wo", name = "j", descriptor = "I")
	public static int anInt6768;

	@OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
	public static int anInt6783;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "J")
	public static long aLong216 = 0L;

	@OriginalMember(owner = "client!wo", name = "D", descriptor = "I")
	public static int anInt6787 = 0;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(III)V")
	public static void method5661(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static342.aClass1_Sub8_Sub1_7.method3229(82);
		Static342.aClass1_Sub8_Sub1_7.method4561(arg1);
		Static342.aClass1_Sub8_Sub1_7.method4527(arg0);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
	public static int method5662() {
		return 15;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	public static void method5668() {
		for (@Pc(9) int local9 = 0; local9 < Static225.anInt4698; local9++) {
			@Pc(15) int local15 = Static67.anIntArray181[local9]--;
			if (Static67.anIntArray181[local9] >= -10) {
				@Pc(92) Class77 local92 = Static289.aClass77Array2[local9];
				if (local92 == null) {
					local92 = Static364.method2070(Static309.aClass216_93, Static235.anIntArray432[local9], 0);
					if (local92 == null) {
						continue;
					}
					Static67.anIntArray181[local9] += local92.method2071();
					Static289.aClass77Array2[local9] = local92;
				}
				if (Static67.anIntArray181[local9] < 0) {
					@Pc(135) int local135;
					if (Static185.anIntArray363[local9] == 0) {
						local135 = Static80.anInt2078 * Static114.anIntArray397[local9] >> 8;
					} else {
						@Pc(145) int local145 = (Static185.anIntArray363[local9] & 0xFF) * 128;
						@Pc(153) int local153 = Static185.anIntArray363[local9] >> 16 & 0xFF;
						@Pc(163) int local163 = local153 * 128 + 64 - Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109;
						if (local163 < 0) {
							local163 = -local163;
						}
						@Pc(176) int local176 = Static185.anIntArray363[local9] >> 8 & 0xFF;
						@Pc(185) int local185 = local176 * 128 + 64 - Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108;
						if (local185 < 0) {
							local185 = -local185;
						}
						@Pc(197) int local197 = local163 + local185 - 128;
						if (local145 < local197) {
							Static67.anIntArray181[local9] = -100;
							continue;
						}
						if (local197 < 0) {
							local197 = 0;
						}
						local135 = (local145 - local197) * Static114.anInt4335 * Static114.anIntArray397[local9] / local145 >> 8;
					}
					if (local135 > 0) {
						@Pc(232) Class1_Sub15_Sub1 local232 = local92.method2069().method5363(Static278.aClass95_1);
						@Pc(237) Class1_Sub1_Sub2 local237 = Static370.method4057(local232, local135);
						local237.method4049(Static9.anIntArray33[local9] - 1);
						Static145.aClass1_Sub1_Sub4_1.method5040(local237);
					}
					Static67.anIntArray181[local9] = -100;
				}
			} else {
				Static225.anInt4698--;
				for (@Pc(31) int local31 = local9; local31 < Static225.anInt4698; local31++) {
					Static235.anIntArray432[local31] = Static235.anIntArray432[local31 + 1];
					Static289.aClass77Array2[local31] = Static289.aClass77Array2[local31 + 1];
					Static9.anIntArray33[local31] = Static9.anIntArray33[local31 + 1];
					Static67.anIntArray181[local31] = Static67.anIntArray181[local31 + 1];
					Static185.anIntArray363[local31] = Static185.anIntArray363[local31 + 1];
					Static114.anIntArray397[local31] = Static114.anIntArray397[local31 + 1];
				}
				local9--;
			}
		}
		if (Static82.aBoolean192 && !Static39.method920()) {
			if (Static167.anInt3605 != 0 && Static93.anInt2303 != -1) {
				Static228.method4251(Static93.anInt2303, Static228.aClass216_78, Static167.anInt3605);
			}
			Static82.aBoolean192 = false;
		} else if (Static167.anInt3605 != 0 && Static93.anInt2303 != -1 && !Static39.method920()) {
			Static342.aClass1_Sub8_Sub1_7.method3229(144);
			Static342.aClass1_Sub8_Sub1_7.method4529(Static93.anInt2303);
			Static93.anInt2303 = -1;
		}
	}
}
