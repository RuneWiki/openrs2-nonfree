import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!ua;IILclient!wp;IIILclient!r;I)V")
	public static void method4454(@OriginalArg(0) Class81 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class361 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class45 arg6, @OriginalArg(8) int arg7) {
		@Pc(16) Class174 local16 = Static39.aClass102_1.method2925(arg7);
		if (local16 == null || !local16.aBoolean351 || !local16.method4116(Static491.aClass318_1)) {
			return;
		}
		@Pc(38) int local38;
		if (local16.anIntArray257 != null) {
			@Pc(36) int[] local36 = new int[local16.anIntArray257.length];
			@Pc(50) int local50;
			for (local38 = 0; local38 < local36.length / 2; local38++) {
				if (Static379.anInt6482 == 4) {
					local50 = (int) Static43.aFloat20 & 0x3FFF;
				} else {
					local50 = Static244.anInt4328 + (int) Static43.aFloat20 & 0x3FFF;
				}
				@Pc(63) int local63 = Class356.anIntArray597[local50];
				@Pc(67) int local67 = Class356.anIntArray598[local50];
				if (Static379.anInt6482 != 4) {
					local63 = local63 * 256 / (Static41.anInt765 + 256);
					local67 = local67 * 256 / (Static41.anInt765 + 256);
				}
				local36[local38 * 2] = arg5 + arg3.anInt9668 / 2 + (local63 * (local16.anIntArray257[local38 * 2 + 1] * 4 + arg2) + (arg4 + local16.anIntArray257[local38 * 2] * 4) * local67 >> 14);
				local36[local38 * 2 + 1] = arg1 + arg3.anInt9650 / 2 - (local67 * (local16.anIntArray257[local38 * 2 + 1] * 4 + arg2) - (local16.anIntArray257[local38 * 2] * 4 + arg4) * local63 >> 14);
			}
			Static197.method3302(arg6, local36, local16.anInt4758, arg3.anIntArray639, arg3.anIntArray633);
			for (local50 = 0; local50 < local36.length / 2 - 1; local50++) {
				arg6.method7382(local36[local50 * 2], local36[local50 * 2 + 1], local36[(local50 + 1) * 2], local36[(local50 + 1) * 2 + 1], local16.anInt4776, arg0, arg5, arg1);
			}
			arg6.method7382(local36[local36.length - 2], local36[local36.length - 1], local36[0], local36[1], local16.anInt4776, arg0, arg5, arg1);
		}
		@Pc(266) Class14 local266 = null;
		if (local16.anInt4772 != -1) {
			local266 = local16.method4118(false, arg6);
			if (local266 != null) {
				Static212.method3418(arg2, local266, arg0, arg5, arg3, arg4, arg1);
			}
		}
		if (local16.aString30 == null) {
			return;
		}
		local38 = 0;
		if (local266 != null) {
			local38 = local266.u();
		}
		@Pc(300) Class54 local300 = Static544.aClass54_15;
		@Pc(302) Class134 local302 = Static2.aClass134_1;
		if (local16.anInt4787 == 1) {
			local300 = Static569.aClass54_9;
			local302 = Static521.aClass134_12;
		}
		if (local16.anInt4787 == 2) {
			local302 = Static75.aClass134_7;
			local300 = Static460.aClass54_10;
		}
		Static472.method6507(local38, local16.aString30, arg2, arg4, local16.anInt4768, arg1, local302, arg3, local300, arg0, arg5);
		return;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(ZIII)Z")
	public static boolean method4456(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static77.aClass11_1.method7216(arg0, arg2, arg1, Static398.anIntArray424);
		@Pc(13) int local13 = Static398.anIntArray424[2];
		if (local13 < 50) {
			return false;
		} else {
			Static398.anIntArray424[0] = Static216.anInt3880 + Static505.anInt8213 * Static398.anIntArray424[0] / local13;
			Static398.anIntArray424[2] = local13;
			Static398.anIntArray424[1] = Static326.anInt5525 * Static398.anIntArray424[1] / local13 + Static469.anInt4271;
			return true;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!np;B)Lclient!ji;")
	public static Class9_Sub1 method4458(@OriginalArg(0) Class3_Sub11 arg0) {
		@Pc(15) Class9 local15 = Static472.method6504(arg0);
		@Pc(19) int local19 = arg0.method5192();
		return new Class9_Sub1(local15.anInt4466, local15.aClass63_12, local15.aClass249_11, local15.anInt4468, local15.anInt4463, local19);
	}
}
