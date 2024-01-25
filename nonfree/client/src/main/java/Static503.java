import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static503 {

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "I")
	public static int anInt8533;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I)V")
	public static void method7250() {
		Static177.aClass59Array6 = null;
		Static237.aClass59Array7 = null;
		Static283.aClass59_12 = null;
		Static649.aClass59_39 = null;
		Static383.aClass72_10 = null;
		Static326.aClass59Array13 = null;
		Static5.aClass72_1 = null;
		Static267.aClass59Array9 = null;
		Static24.aClass59Array1 = null;
		Static117.aClass59Array3 = null;
		Static32.aClass72_2 = null;
		Static166.aClass59Array5 = null;
		Static558.aClass59Array16 = null;
		Static283.aClass59Array10 = null;
		Static574.aClass59Array17 = null;
		Static665.aClass59Array14 = null;
		Static137.aClass59Array4 = null;
		Static474.aClass59Array15 = null;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IZLclient!oga;ILclient!ha;Lclient!or;)Z")
	public static boolean method7251(@OriginalArg(2) Class5_Sub40 arg0, @OriginalArg(4) Class143 arg1, @OriginalArg(5) Class262 arg2) {
		@Pc(5) int local5 = Integer.MAX_VALUE;
		@Pc(7) int local7 = Integer.MIN_VALUE;
		@Pc(9) int local9 = Integer.MAX_VALUE;
		@Pc(11) int local11 = Integer.MIN_VALUE;
		if (arg2.anIntArray427 != null) {
			local11 = Static407.anInt6544 - (Static407.anInt6544 - Static407.anInt6538) * (arg2.anInt7644 + arg0.anInt7516 - Static407.anInt6542) / (Static407.anInt6546 - Static407.anInt6542);
			local7 = (Static407.anInt6545 - Static407.anInt6535) * (arg0.anInt7521 + arg2.anInt7625 - Static407.anInt6537) / (Static407.anInt6540 - Static407.anInt6537) + Static407.anInt6535;
			local9 = Static407.anInt6544 - (Static407.anInt6544 - Static407.anInt6538) * (arg2.anInt7616 + arg0.anInt7516 - Static407.anInt6542) / (Static407.anInt6546 - Static407.anInt6542);
			local5 = Static407.anInt6535 + (Static407.anInt6545 - Static407.anInt6535) * (arg0.anInt7521 + arg2.anInt7621 + -Static407.anInt6537) / (Static407.anInt6540 - Static407.anInt6537);
		}
		@Pc(100) Class59 local100 = null;
		@Pc(102) int local102 = 0;
		@Pc(109) int local109 = 0;
		@Pc(111) int local111 = 0;
		@Pc(113) int local113 = 0;
		if (arg2.anInt7628 != -1) {
			if (arg0.aBoolean548 && arg2.anInt7620 != -1) {
				local100 = arg2.method6489(arg1, true);
			} else {
				local100 = arg2.method6489(arg1, false);
			}
			if (local100 != null) {
				local102 = arg0.anInt7519 - (local100.method8053() + 1 >> 1);
				local109 = arg0.anInt7519 + (local100.method8053() + 1 >> 1);
				if (local5 > local102) {
					local5 = local102;
				}
				local111 = arg0.anInt7517 - (local100.method8064() + 1 >> 1);
				if (local109 > local7) {
					local7 = local109;
				}
				if (local9 > local111) {
					local9 = local111;
				}
				local113 = arg0.anInt7517 + (local100.method8064() + 1 >> 1);
				if (local11 < local113) {
					local11 = local113;
				}
			}
		}
		@Pc(204) Class170 local204 = null;
		@Pc(206) int local206 = 0;
		@Pc(208) int local208 = 0;
		@Pc(210) int local210 = 0;
		@Pc(212) int local212 = 0;
		@Pc(214) int local214 = 0;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(300) int local300;
		if (arg2.aString72 != null) {
			local204 = Static74.method1091(arg2.anInt7623);
			if (local204 != null) {
				local206 = Static172.aClass198_4.method4085(Static444.aStringArray29, (Class59[]) null, arg2.aString72, (int[]) null);
				local210 = arg0.anInt7517 - (Static407.anInt6544 - Static407.anInt6538) * arg2.anInt7614 / (Static407.anInt6546 - Static407.anInt6542);
				local208 = arg0.anInt7519 + (Static407.anInt6545 - Static407.anInt6535) * arg2.anInt7612 / (Static407.anInt6540 - Static407.anInt6537);
				if (local100 == null) {
					local210 -= local206 * local204.method3596() / 2;
				} else {
					local210 -= (local100.method8064() >> 1) + (local204.method3590() * local206);
				}
				for (local300 = 0; local300 < local206; local300++) {
					@Pc(305) String local305 = Static444.aStringArray29[local300];
					if (local206 - 1 > local300) {
						local305 = local305.substring(0, local305.length() - 4);
					}
					@Pc(322) int local322 = local204.method3593(local305);
					if (local212 < local322) {
						local212 = local322;
					}
				}
				local214 = local208 - local212 / 2;
				local216 = local208 + local212 / 2;
				if (local5 > local214) {
					local5 = local214;
				}
				if (local216 > local7) {
					local7 = local216;
				}
				local218 = local210;
				if (local9 > local218) {
					local9 = local218;
				}
				local220 = local206 * local204.method3590() + local210;
				if (local220 > local11) {
					local11 = local220;
				}
			}
		}
		if (Static407.anInt6535 > local7 || Static407.anInt6545 < local5 || local11 < Static407.anInt6538 || local9 > Static407.anInt6544) {
			return true;
		}
		Static407.method5510(arg1, arg0, arg2);
		if (local100 != null) {
			if (Static588.anInt9639 > 0 && (Static21.anInt152 != -1 && Static21.anInt152 == arg0.anInt7515 || Static143.anInt2376 != -1 && arg2.anInt7615 == Static143.anInt2376)) {
				if (Static452.anInt7898 <= 50) {
					local300 = Static452.anInt7898 * 2;
				} else {
					local300 = (100 - Static452.anInt7898) * 2;
				}
				@Pc(466) int local466 = local300 << 24 | 0xFFFF00;
				arg1.method6264(local466, arg0.anInt7517, arg0.anInt7519, local100.method8049() / 2 + 7);
				arg1.method6264(local466, arg0.anInt7517, arg0.anInt7519, local100.method8049() / 2 + 5);
				arg1.method6264(local466, arg0.anInt7517, arg0.anInt7519, local100.method8049() / 2 + 3);
				arg1.method6264(local466, arg0.anInt7517, arg0.anInt7519, local100.method8049() / 2 + 1);
				arg1.method6264(local466, arg0.anInt7517, arg0.anInt7519, local100.method8049() / 2);
			}
			local100.method8057(arg0.anInt7519 - (local100.method8053() >> 1), arg0.anInt7517 - (local100.method8064() >> 1));
		}
		if (arg2.aString72 != null && local204 != null) {
			Static494.method7188(arg0, arg1, local206, local210, arg2, local212, local204, local208);
		}
		if (arg2.anInt7628 != -1 || arg2.aString72 != null) {
			@Pc(590) Class5_Sub45 local590 = new Class5_Sub45(arg0);
			local590.anInt8799 = local218;
			local590.anInt8797 = local216;
			local590.anInt8804 = local109;
			local590.anInt8795 = local220;
			local590.anInt8796 = local113;
			local590.anInt8802 = local111;
			local590.anInt8803 = local102;
			local590.anInt8801 = local214;
			Static653.aClass124_104.method2574(local590);
		}
		return false;
	}
}
