import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!db", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray7;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZIIILclient!fb;)V")
	public static void method1555(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub16 arg4) {
		if (arg4.anInt2622 == -1 && arg4.anIntArray264 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg4.anInt2623 * Static7.aClass3_Sub15_Sub1_1.anInt8370 >> 8;
		if (arg1 > arg4.anInt2627) {
			local16 = arg1 - arg4.anInt2627;
		} else if (arg4.anInt2636 > arg1) {
			local16 = arg4.anInt2636 - arg1;
		}
		if (arg4.anInt2637 < arg2) {
			local16 += arg2 - arg4.anInt2637;
		} else if (arg4.anInt2630 > arg2) {
			local16 += arg4.anInt2630 - arg2;
		}
		if (arg4.anInt2632 == 0 || local16 - 256 > arg4.anInt2632 || Static7.aClass3_Sub15_Sub1_1.anInt8370 == 0 || arg4.anInt2633 != arg3) {
			if (arg4.aClass3_Sub9_Sub2_2 != null) {
				Static530.aClass3_Sub9_Sub3_2.method5653(arg4.aClass3_Sub9_Sub2_2);
				arg4.aClass3_Sub42_Sub1_2 = null;
				arg4.aClass3_Sub44_2 = null;
				arg4.aClass3_Sub9_Sub2_2 = null;
			}
			if (arg4.aClass3_Sub9_Sub2_3 != null) {
				Static530.aClass3_Sub9_Sub3_2.method5653(arg4.aClass3_Sub9_Sub2_3);
				arg4.aClass3_Sub44_3 = null;
				arg4.aClass3_Sub42_Sub1_3 = null;
				arg4.aClass3_Sub9_Sub2_3 = null;
			}
			return;
		}
		local16 -= 256;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(160) int local160 = local24 * (arg4.anInt2632 - local16) / arg4.anInt2632;
		@Pc(207) Class3_Sub9_Sub2 local207;
		if (arg4.aClass3_Sub9_Sub2_2 != null) {
			arg4.aClass3_Sub9_Sub2_2.method5339(local160);
		} else if (arg4.anInt2622 >= 0) {
			if (arg4.aBoolean197) {
				if (arg4.aClass3_Sub44_2 == null) {
					arg4.aClass3_Sub44_2 = Static433.method6581(Static135.aClass161_28, arg4.anInt2622);
				}
				if (arg4.aClass3_Sub44_2 != null) {
					if (arg4.aClass3_Sub42_Sub1_2 == null) {
						arg4.aClass3_Sub42_Sub1_2 = arg4.aClass3_Sub44_2.method6589(new int[] { 22050 });
					}
					if (arg4.aClass3_Sub42_Sub1_2 != null) {
						local207 = Static556.method5342(arg4.aClass3_Sub42_Sub1_2, local160);
						local207.method5365(-1);
						Static530.aClass3_Sub9_Sub3_2.method5654(local207);
						arg4.aClass3_Sub9_Sub2_2 = local207;
					}
				}
			} else {
				@Pc(224) Class31 local224 = Static552.method880(Static402.aClass161_107, arg4.anInt2622, 0);
				if (local224 != null) {
					@Pc(231) Class3_Sub42_Sub1 local231 = local224.method879().method6903(Static233.aClass270_1);
					@Pc(236) Class3_Sub9_Sub2 local236 = Static556.method5342(local231, local160);
					local236.method5365(-1);
					Static530.aClass3_Sub9_Sub3_2.method5654(local236);
					arg4.aClass3_Sub9_Sub2_2 = local236;
				}
			}
		}
		if (arg4.aClass3_Sub9_Sub2_3 != null) {
			arg4.aClass3_Sub9_Sub2_3.method5339(local160);
			if (!arg4.aClass3_Sub9_Sub2_3.method7821()) {
				arg4.aClass3_Sub42_Sub1_3 = null;
				arg4.aClass3_Sub9_Sub2_3 = null;
				arg4.aClass3_Sub44_3 = null;
			}
		} else if (arg4.anIntArray264 != null && (arg4.anInt2631 -= arg0) <= 0) {
			@Pc(298) int local298;
			if (!arg4.aBoolean195) {
				local298 = (int) ((double) arg4.anIntArray264.length * Math.random());
				@Pc(306) Class31 local306 = Static552.method880(Static402.aClass161_107, arg4.anIntArray264[local298], 0);
				if (local306 != null) {
					@Pc(313) Class3_Sub42_Sub1 local313 = local306.method879().method6903(Static233.aClass270_1);
					@Pc(318) Class3_Sub9_Sub2 local318 = Static556.method5342(local313, local160);
					local318.method5365(0);
					Static530.aClass3_Sub9_Sub3_2.method5654(local318);
					arg4.anInt2631 = arg4.anInt2625 + (int) (Math.random() * (double) (arg4.anInt2635 - arg4.anInt2625));
					arg4.aClass3_Sub9_Sub2_3 = local318;
					return;
				}
				return;
			}
			if (arg4.aClass3_Sub44_3 == null) {
				local298 = (int) ((double) arg4.anIntArray264.length * Math.random());
				arg4.aClass3_Sub44_3 = Static433.method6581(Static135.aClass161_28, arg4.anIntArray264[local298]);
			}
			if (arg4.aClass3_Sub44_3 != null) {
				if (arg4.aClass3_Sub42_Sub1_3 == null) {
					arg4.aClass3_Sub42_Sub1_3 = arg4.aClass3_Sub44_3.method6589(new int[] { 22050 });
				}
				if (arg4.aClass3_Sub42_Sub1_3 != null) {
					local207 = Static556.method5342(arg4.aClass3_Sub42_Sub1_3, local160);
					local207.method5365(0);
					Static530.aClass3_Sub9_Sub3_2.method5654(local207);
					arg4.anInt2631 = (int) (Math.random() * (double) (arg4.anInt2635 - arg4.anInt2625)) + arg4.anInt2625;
					arg4.aClass3_Sub9_Sub2_3 = local207;
					return;
				}
			}
		}
	}
}
