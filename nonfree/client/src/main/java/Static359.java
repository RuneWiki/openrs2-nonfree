import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray41;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "[I")
	public static int[] anIntArray645;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "Lclient!us;")
	public static Class234 aClass234_123;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!e;IIIII)V")
	public static void method5356(@OriginalArg(0) Class3_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt1601 == -1 && arg0.anIntArray160 == null) {
			return;
		}
		@Pc(15) int local15 = 0;
		if (arg1 > arg0.anInt1614) {
			local15 = arg1 - arg0.anInt1614;
		} else if (arg0.anInt1615 > arg1) {
			local15 = arg0.anInt1615 - arg1;
		}
		@Pc(60) int local60 = Static164.aClass154_Sub1_1.anInt6055 * arg0.anInt1613 >> 8;
		if (arg0.anInt1606 < arg3) {
			local15 += arg3 - arg0.anInt1606;
		} else if (arg3 < arg0.anInt1609) {
			local15 += arg0.anInt1609 - arg3;
		}
		if (arg0.anInt1605 == 0 || local15 - 64 > arg0.anInt1605 || Static164.aClass154_Sub1_1.anInt6055 == 0 || arg4 != arg0.anInt1604) {
			if (arg0.aClass3_Sub8_Sub1_2 != null) {
				Static137.aClass3_Sub8_Sub2_2.method1712(arg0.aClass3_Sub8_Sub1_2);
				arg0.aClass3_Sub8_Sub1_2 = null;
			}
			if (arg0.aClass3_Sub8_Sub1_1 != null) {
				Static137.aClass3_Sub8_Sub2_2.method1712(arg0.aClass3_Sub8_Sub1_1);
				arg0.aClass3_Sub8_Sub1_1 = null;
			}
			return;
		}
		local15 -= 64;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(147) int local147 = local60 * (arg0.anInt1605 - local15) / arg0.anInt1605;
		if (arg0.aClass3_Sub8_Sub1_2 != null) {
			arg0.aClass3_Sub8_Sub1_2.method1242(local147);
		} else if (arg0.anInt1601 >= 0) {
			@Pc(159) Class71 local159 = Static397.method1481(Static389.aClass20_98, arg0.anInt1601, 0);
			if (local159 != null) {
				@Pc(166) Class3_Sub29_Sub1 local166 = local159.method1484().method3841(Static257.aClass41_1);
				@Pc(171) Class3_Sub8_Sub1 local171 = Static396.method1245(local166, local147);
				local171.method1248(-1);
				Static137.aClass3_Sub8_Sub2_2.method1710(local171);
				arg0.aClass3_Sub8_Sub1_2 = local171;
			}
		}
		if (arg0.aClass3_Sub8_Sub1_1 != null) {
			arg0.aClass3_Sub8_Sub1_1.method1242(local147);
			if (!arg0.aClass3_Sub8_Sub1_1.method5702()) {
				arg0.aClass3_Sub8_Sub1_1 = null;
			}
		} else if (arg0.anIntArray160 != null && (arg0.anInt1610 -= arg2) <= 0) {
			@Pc(224) int local224 = (int) ((double) arg0.anIntArray160.length * Math.random());
			@Pc(232) Class71 local232 = Static397.method1481(Static389.aClass20_98, arg0.anIntArray160[local224], 0);
			if (local232 != null) {
				@Pc(239) Class3_Sub29_Sub1 local239 = local232.method1484().method3841(Static257.aClass41_1);
				@Pc(244) Class3_Sub8_Sub1 local244 = Static396.method1245(local239, local147);
				local244.method1248(0);
				Static137.aClass3_Sub8_Sub2_2.method1710(local244);
				arg0.anInt1610 = arg0.anInt1612 + (int) ((double) (arg0.anInt1603 - arg0.anInt1612) * Math.random());
				arg0.aClass3_Sub8_Sub1_1 = local244;
				return;
			}
		}
	}
}
