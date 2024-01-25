import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static600 {

	@OriginalMember(owner = "client!vha", name = "A", descriptor = "Lclient!qk;")
	public static Class279 aClass279_15 = null;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIB)V")
	public static void method6746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(14) Class3_Sub22 local14 = (Class3_Sub22) Static511.aClass223_55.method5874(); local14 != null; local14 = (Class3_Sub22) Static511.aClass223_55.method5870()) {
			Static618.method8553(arg2, arg0, arg1, arg3, local14);
		}
		@Pc(189) boolean local189;
		for (@Pc(35) Class3_Sub22 local35 = (Class3_Sub22) Static456.aClass223_48.method5874(); local35 != null; local35 = (Class3_Sub22) Static456.aClass223_48.method5870()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class143 local44 = local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.method5058();
			if (local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt5743 == -1 || local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.aBoolean404) {
				local39 = 0;
			} else if (local44.anInt4187 == local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt5743 || local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt5743 == local44.anInt4194 || local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt5743 == local44.anInt4186 || local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt5743 == local44.anInt4182) {
				local39 = 2;
			} else if (local44.anInt4171 == local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt5743 || local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt5743 == local44.anInt4170 || local44.anInt4183 == local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt5743 || local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt5743 == local44.anInt4185) {
				local39 = 3;
			}
			if (local35.anInt3112 != local39) {
				@Pc(140) int local140 = Static559.method8065(local35.aClass4_Sub1_Sub2_Sub1_Sub1_1);
				@Pc(144) Class109 local144 = local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.aClass109_1;
				if (local144.anIntArray147 != null) {
					local144 = local144.method2813(Static373.aClass150_1);
				}
				if (local144 == null || local140 == -1) {
					local35.aBoolean204 = false;
					local35.anInt3101 = -1;
					local35.anInt3112 = local39;
				} else if (local35.anInt3101 == local140 && local35.aBoolean204 == local144.aBoolean197) {
					local35.anInt3112 = local39;
					local35.anInt3111 = local144.anInt3044;
				} else {
					local189 = false;
					if (local35.aClass3_Sub7_Sub3_1 == null) {
						local189 = true;
					} else {
						local35.anInt3111 -= 512;
						if (local35.anInt3111 <= 0) {
							Static204.aClass3_Sub7_Sub1_1.method1621(local35.aClass3_Sub7_Sub3_1);
							local35.aClass3_Sub7_Sub3_1 = null;
							local189 = true;
						}
					}
					if (local189) {
						local35.anInt3111 = local144.anInt3044;
						local35.aBoolean204 = local144.aBoolean197;
						local35.aClass3_Sub30_Sub1_2 = null;
						local35.anInt3101 = local140;
						local35.aClass3_Sub43_2 = null;
						local35.anInt3112 = local39;
					}
				}
			}
			local35.anInt3116 = local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt8916;
			local35.anInt3106 = local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt8916 + (local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.method5059() << 8);
			local35.anInt3103 = local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt8911;
			local35.anInt3108 = local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.anInt8911 + (local35.aClass4_Sub1_Sub2_Sub1_Sub1_1.method5059() << 8);
			Static618.method8553(arg2, arg0, arg1, arg3, local35);
		}
		for (@Pc(301) Class3_Sub22 local301 = (Class3_Sub22) Static613.aClass280_47.method7110(); local301 != null; local301 = (Class3_Sub22) Static613.aClass280_47.method7108()) {
			@Pc(305) byte local305 = 1;
			@Pc(310) Class143 local310 = local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.method5058();
			if (local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5743 == -1 || local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.aBoolean404) {
				local305 = 0;
			} else if (local310.anInt4187 == local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5743 || local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5743 == local310.anInt4194 || local310.anInt4186 == local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5743 || local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5743 == local310.anInt4182) {
				local305 = 2;
			} else if (local310.anInt4171 == local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5743 || local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5743 == local310.anInt4170 || local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5743 == local310.anInt4183 || local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5743 == local310.anInt4185) {
				local305 = 3;
			}
			if (local301.anInt3112 != local305) {
				@Pc(403) int local403 = Static638.method8714(local301.aClass4_Sub1_Sub2_Sub1_Sub2_1);
				if (local301.anInt3101 == local403 && local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.aBoolean413 == local301.aBoolean204) {
					local301.anInt3112 = local305;
					local301.anInt3111 = local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5831;
				} else {
					local189 = false;
					if (local301.aClass3_Sub7_Sub3_1 == null) {
						local189 = true;
					} else {
						local301.anInt3111 -= 512;
						if (local301.anInt3111 <= 0) {
							Static204.aClass3_Sub7_Sub1_1.method1621(local301.aClass3_Sub7_Sub3_1);
							local189 = true;
							local301.aClass3_Sub7_Sub3_1 = null;
						}
					}
					if (local189) {
						local301.anInt3111 = local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt5831;
						local301.anInt3112 = local305;
						local301.aClass3_Sub30_Sub1_2 = null;
						local301.aBoolean204 = local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.aBoolean413;
						local301.anInt3101 = local403;
						local301.aClass3_Sub43_2 = null;
					}
				}
			}
			local301.anInt3116 = local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt8916;
			local301.anInt3106 = local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt8916 + (local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.method5059() << 8);
			local301.anInt3103 = local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt8911;
			local301.anInt3108 = local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.anInt8911 + (local301.aClass4_Sub1_Sub2_Sub1_Sub2_1.method5059() << 8);
			Static618.method8553(arg2, arg0, arg1, arg3, local301);
		}
	}
}
