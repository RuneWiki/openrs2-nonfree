import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_191 = new Class186(64, 20);

	@OriginalMember(owner = "client!qf", name = "i", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_73 = new Class242("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IB)V")
	public static void method4406(@OriginalArg(0) int arg0) {
		if (arg0 == Static73.anInt1749) {
			return;
		}
		if (Static73.anInt1749 == 0) {
			Static382.method5206();
		}
		if (arg0 == 40) {
			Static133.method1944();
		}
		if (arg0 != 40 && Static223.aClass5_2 != null) {
			Static223.aClass5_2.method119();
			Static223.aClass5_2 = null;
		}
		if (Static73.anInt1749 == 25 || Static73.anInt1749 == 28) {
			Static430.aClass166_284.anInt4829 = 2;
			Static224.aClass166_162.anInt4829 = 2;
			Static376.aClass166_259.anInt4829 = 2;
			Static195.aClass166_106.anInt4829 = 2;
			Static102.aClass166_75.anInt4829 = 2;
			Static416.aClass166_278.anInt4829 = 2;
			Static78.aClass166_61.anInt4829 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static235.anInt4317 = 0;
			Static113.anInt2413 = 0;
			Static240.anInt4397 = 1;
			Static276.anInt4866 = 0;
			Static213.anInt3994 = 1;
			Static455.method5875(true);
			Static430.aClass166_284.anInt4829 = 1;
			Static224.aClass166_162.anInt4829 = 1;
			Static376.aClass166_259.anInt4829 = 1;
			Static195.aClass166_106.anInt4829 = 1;
			Static102.aClass166_75.anInt4829 = 1;
			Static416.aClass166_278.anInt4829 = 1;
			Static78.aClass166_61.anInt4829 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static367.method5075();
		}
		if (arg0 == 5) {
			Static274.method3701(Static149.aClass166_105, Static16.aClass30_11);
		} else {
			Static282.method3777();
		}
		@Pc(141) boolean local141 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(163) boolean local163 = Static73.anInt1749 == 5 || Static73.anInt1749 == 10 || Static73.anInt1749 == 28;
		if (local141 != local163) {
			if (local141) {
				Static49.anInt1347 = Static291.anInt5269;
				if (Static126.aClass67_Sub1_1.anInt5859 == 0) {
					Static129.method1924();
				} else {
					Static371.method5089(Static126.aClass67_Sub1_1.anInt5859, Static273.aClass166_193, Static291.anInt5269);
				}
				Static366.aClass125_3.method2608(false);
			} else {
				Static129.method1924();
				Static366.aClass125_3.method2608(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static16.aClass30_11.method4637();
		}
		Static73.anInt1749 = arg0;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IZ)V")
	public static void method4407(@OriginalArg(1) boolean arg0) {
		Static110.anInt2332 = 0;
		Static164.anInt3042 = 0;
		Static246.method3388();
		Static40.method728(arg0);
		Static433.method5556();
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < Static164.anInt3042; local26++) {
			local32 = Static22.anIntArray603[local26];
			if (Static176.aClass6_Sub2_Sub1_Sub2Array1[local32].anInt6142 != Static175.anInt3261) {
				if (Static176.aClass6_Sub2_Sub1_Sub2Array1[local32].aClass243_1.method5341()) {
					Static240.method3311(Static176.aClass6_Sub2_Sub1_Sub2Array1[local32]);
				}
				Static176.aClass6_Sub2_Sub1_Sub2Array1[local32].method4770(null);
				Static176.aClass6_Sub2_Sub1_Sub2Array1[local32] = null;
			}
		}
		if (Static106.anInt2242 != Static349.aClass4_Sub30_Sub1_2.anInt6244) {
			throw new RuntimeException("gnp1 pos:" + Static349.aClass4_Sub30_Sub1_2.anInt6244 + " psize:" + Static106.anInt2242);
		}
		for (local32 = 0; local32 < Static249.anInt4520; local32++) {
			if (Static176.aClass6_Sub2_Sub1_Sub2Array1[Static128.anIntArray171[local32]] == null) {
				throw new RuntimeException("gnp2 pos:" + local32 + " size:" + Static249.anInt4520);
			}
		}
	}
}
