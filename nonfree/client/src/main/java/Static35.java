import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
	public static int anInt1045;

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "Lclient!w;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "[Lclient!gf;")
	public static Class33[] aClass33Array1;

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
	public static int anInt1047 = 0;

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static int anInt1048 = 0;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public static int anInt1049 = 0;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method864() {
		aClass83_1 = null;
		aClass33Array1 = null;
		anIntArrayArrayArray17 = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method865() {
		for (@Pc(9) int local9 = 0; local9 < Static30.anInt957; local9++) {
			@Pc(14) int local14 = Static87.anIntArray421[local9]--;
			if (Static87.anIntArray421[local9] >= -10) {
				@Pc(79) Class51 local79 = Static43.aClass51Array1[local9];
				if (local79 == null) {
					local79 = Static187.method2099(Static127.aClass7_Sub1_14, Static17.anIntArray135[local9], 0);
					if (local79 == null) {
						continue;
					}
					Static87.anIntArray421[local9] += local79.method2098();
					Static43.aClass51Array1[local9] = local79;
				}
				if (Static87.anIntArray421[local9] < 0) {
					@Pc(119) int local119;
					if (Static96.anIntArray695[local9] == 0) {
						local119 = Static51.anInt1448;
					} else {
						@Pc(128) int local128 = (Static96.anIntArray695[local9] & 0xFF) * 128;
						@Pc(136) int local136 = Static96.anIntArray695[local9] >> 16 & 0xFF;
						@Pc(144) int local144 = Static96.anIntArray695[local9] >> 8 & 0xFF;
						@Pc(153) int local153 = local136 * 128 + 64 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1800;
						@Pc(163) int local163 = local144 * 128 + 64 - Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt1792;
						if (local163 < 0) {
							local163 = -local163;
						}
						if (local153 < 0) {
							local153 = -local153;
						}
						@Pc(185) int local185 = local163 + local153 - 128;
						if (local128 < local185) {
							Static87.anIntArray421[local9] = -100;
							continue;
						}
						if (local185 < 0) {
							local185 = 0;
						}
						local119 = Static138.anInt3540 * (local128 - local185) / local128;
					}
					if (local119 > 0) {
						@Pc(219) Class3_Sub13_Sub1 local219 = local79.method2100().method2062(aClass83_1);
						@Pc(224) Class3_Sub3_Sub1 local224 = Static183.method434(local219, local119);
						local224.method460(Static24.anIntArray155[local9] - 1);
						Static157.aClass3_Sub3_Sub4_2.method2850(local224);
					}
					Static87.anIntArray421[local9] = -100;
				}
			} else {
				Static30.anInt957--;
				for (@Pc(28) int local28 = local9; local28 < Static30.anInt957; local28++) {
					Static17.anIntArray135[local28] = Static17.anIntArray135[local28 + 1];
					Static43.aClass51Array1[local28] = Static43.aClass51Array1[local28 + 1];
					Static24.anIntArray155[local28] = Static24.anIntArray155[local28 + 1];
					Static87.anIntArray421[local28] = Static87.anIntArray421[local28 + 1];
					Static96.anIntArray695[local28] = Static96.anIntArray695[local28 + 1];
				}
				local9--;
			}
		}
		if (Static61.aBoolean101 && !Static83.method1906()) {
			if (Static126.anInt3243 != 0 && Static93.anInt2608 != -1) {
				Static68.method1631(Static93.anInt2608, 0, Static164.aClass7_Sub1_17, Static126.anInt3243);
			}
			Static61.aBoolean101 = false;
		} else if (Static126.anInt3243 != 0 && Static93.anInt2608 != -1 && !Static83.method1906()) {
			Static51.aClass3_Sub8_Sub1_2.method1559(40);
			Static51.aClass3_Sub8_Sub1_2.method1547(Static93.anInt2608);
			Static93.anInt2608 = -1;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public static void method866() {
		for (@Pc(5) int local5 = 0; local5 < Static69.anInt2115; local5++) {
			@Pc(10) int local10 = Static117.anIntArray523[local5];
			@Pc(14) Class3_Sub2_Sub1_Sub2_Sub2 local14 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local10];
			if (local14 != null) {
				Static1.method5(local14, local14.aClass3_Sub2_Sub7_1.anInt1338);
			}
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)Z")
	public static boolean method867(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}
}
