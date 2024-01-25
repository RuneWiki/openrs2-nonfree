import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
	public static void method1012() {
		Static24.anInt314 = -1;
		Static61.anInt1177 = -1;
		Static290.anInt5018 = 2;
		Static403.anInt7063 = 0;
		Static500.aClass270_114 = null;
		Static243.aBoolean335 = false;
		Static11.anInt142 = 1;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIZ)V")
	public static void method1013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(6) Class1_Sub38 local6 = (Class1_Sub38) Static356.aClass353_43.method7677(); local6 != null; local6 = (Class1_Sub38) Static356.aClass353_43.method7687()) {
			Static295.method4127(local6, arg0, arg1, arg3, arg2);
		}
		for (@Pc(35) Class1_Sub38 local35 = (Class1_Sub38) Static413.aClass353_56.method7677(); local35 != null; local35 = (Class1_Sub38) Static413.aClass353_56.method7687()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class140 local44 = local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.method5425();
			if (local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.aBoolean553) {
				local39 = 0;
			} else if (local44.anInt3597 == local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt6829 || local44.anInt3625 == local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt6829 || local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt6829 == local44.anInt3610 || local44.anInt3616 == local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt6829) {
				local39 = 2;
			} else if (local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt6829 == local44.anInt3593 || local44.anInt3636 == local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt6829 || local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt6829 == local44.anInt3628 || local44.anInt3602 == local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt6829) {
				local39 = 3;
			}
			if (local35.anInt6106 != local39) {
				@Pc(127) int local127 = Static185.method2594(local35.aClass8_Sub3_Sub3_Sub1_Sub2_1);
				@Pc(131) Class20 local131 = local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.aClass20_1;
				if (local131.anIntArray40 != null) {
					local131 = local131.method284(Static430.aClass321_1);
				}
				if (local131 == null || local127 == -1) {
					local35.aBoolean482 = false;
					local35.anInt6097 = -1;
				} else if (local35.anInt6097 != local127 || local131.aBoolean37 != local35.aBoolean482) {
					if (local35.aClass1_Sub7_Sub4_4 != null) {
						Static309.aClass1_Sub7_Sub1_2.method477(local35.aClass1_Sub7_Sub4_4);
						local35.aClass1_Sub7_Sub4_4 = null;
					}
					local35.aClass1_Sub17_Sub1_3 = null;
					local35.aBoolean482 = local131.aBoolean37;
					local35.aClass1_Sub50_3 = null;
					local35.anInt6097 = local127;
				}
				local35.anInt6106 = local39;
			}
			local35.anInt6099 = local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt9365;
			local35.anInt6101 = local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt9365 + (local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.method5434() << 8);
			local35.anInt6104 = local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt9370;
			local35.anInt6110 = local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.anInt9370 + (local35.aClass8_Sub3_Sub3_Sub1_Sub2_1.method5434() << 8);
			Static295.method4127(local35, arg0, arg1, arg3, arg2);
		}
		for (@Pc(254) Class1_Sub38 local254 = (Class1_Sub38) Static478.aClass187_41.method3799(); local254 != null; local254 = (Class1_Sub38) Static478.aClass187_41.method3805()) {
			@Pc(258) byte local258 = 1;
			@Pc(263) Class140 local263 = local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.method5425();
			if (local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.aBoolean553) {
				local258 = 0;
			} else if (local263.anInt3597 == local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt6829 || local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt6829 == local263.anInt3625 || local263.anInt3610 == local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt6829 || local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt6829 == local263.anInt3616) {
				local258 = 2;
			} else if (local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt6829 == local263.anInt3593 || local263.anInt3636 == local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt6829 || local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt6829 == local263.anInt3628 || local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt6829 == local263.anInt3602) {
				local258 = 3;
			}
			if (local258 != local254.anInt6106) {
				@Pc(350) int local350 = Static449.method6211(local254.aClass8_Sub3_Sub3_Sub1_Sub1_2);
				if (local350 != local254.anInt6097 || local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.aBoolean136 != local254.aBoolean482) {
					if (local254.aClass1_Sub7_Sub4_4 != null) {
						Static309.aClass1_Sub7_Sub1_2.method477(local254.aClass1_Sub7_Sub4_4);
						local254.aClass1_Sub7_Sub4_4 = null;
					}
					local254.aClass1_Sub50_3 = null;
					local254.aClass1_Sub17_Sub1_3 = null;
					local254.anInt6097 = local350;
					local254.aBoolean482 = local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.aBoolean136;
				}
				local254.anInt6106 = local258;
			}
			local254.anInt6099 = local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt9365;
			local254.anInt6101 = local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt9365 + (local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.method5434() << 8);
			local254.anInt6104 = local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt9370;
			local254.anInt6110 = local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.anInt9370 + (local254.aClass8_Sub3_Sub3_Sub1_Sub1_2.method5434() << 8);
			Static295.method4127(local254, arg0, arg1, arg3, arg2);
		}
	}
}
