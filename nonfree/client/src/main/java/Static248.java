import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "Z")
	public static boolean aBoolean343;

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!tn;Lclient!ea;IIIILclient!qa;II)V")
	public static void method3568(@OriginalArg(0) Class229 arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class121 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) Class52 local14 = Static86.aClass103_2.method2055(arg6);
		if (local14 == null || !local14.aBoolean103 || !local14.method981(Static237.aClass80_1)) {
			return;
		}
		@Pc(36) int local36;
		if (local14.anIntArray56 != null) {
			@Pc(34) int[] local34 = new int[local14.anIntArray56.length];
			@Pc(50) int local50;
			for (local36 = 0; local36 < local34.length / 2; local36++) {
				if (Static57.anInt883 == 4) {
					local50 = (int) Static147.aFloat59 & 0x3FFF;
				} else {
					local50 = Static388.anInt7297 + (int) Static147.aFloat59 & 0x3FFF;
				}
				@Pc(61) int local61 = Class262.anIntArray575[local50];
				@Pc(65) int local65 = Class262.anIntArray576[local50];
				if (Static57.anInt883 != 4) {
					local65 = local65 * 256 / (Static25.anInt430 + 256);
					local61 = local61 * 256 / (Static25.anInt430 + 256);
				}
				local34[local36 * 2] = ((local14.anIntArray56[local36 * 2] * 4 + arg4) * local65 + local61 * (local14.anIntArray56[local36 * 2 + 1] * 4 + arg7) >> 15) + arg0.anInt6905 / 2 + arg3;
				local34[local36 * 2 + 1] = arg2 + arg0.anInt6895 / 2 - (local65 * (arg7 - -(local14.anIntArray56[local36 * 2 + 1] * 4)) - local61 * (local14.anIntArray56[local36 * 2] * 4 + arg4) >> 15);
			}
			Static351.method5035(arg5, local34, local14.anInt1181, arg0.anIntArray515, arg0.anIntArray509);
			for (local50 = 0; local50 < local34.length / 2 - 1; local50++) {
				arg5.method4603(local34[local50 * 2], local34[local50 * 2 + 1], local34[(local50 + 1) * 2], local34[(local50 + 1) * 2 + 1], local14.anInt1204, arg1, arg3, arg2);
			}
			arg5.method4603(local34[local34.length - 2], local34[local34.length - 1], local34[0], local34[1], local14.anInt1204, arg1, arg3, arg2);
		}
		@Pc(269) Class78 local269 = null;
		if (local14.anInt1197 != -1) {
			local269 = local14.method984(arg5, false);
			if (local269 != null) {
				Static257.method3643(arg3, local269, arg7, arg2, arg0, arg4, arg1);
			}
		}
		if (local14.aString26 == null) {
			return;
		}
		local36 = 0;
		if (local269 != null) {
			local36 = local269.qa();
		}
		@Pc(304) Class4 local304 = Static209.aClass4_6;
		@Pc(306) Class62 local306 = Static396.aClass62_9;
		if (local14.anInt1178 == 1) {
			local304 = Static199.aClass4_4;
			local306 = Static64.aClass62_3;
		}
		if (local14.anInt1178 == 2) {
			local304 = Static237.aClass4_5;
			local306 = Static126.aClass62_6;
		}
		Static316.method4364(local36, arg3, arg4, local14.anInt1182, local306, arg2, arg7, local304, arg1, arg0, local14.aString26);
		return;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(IBII)I")
	public static int method3569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 <= arg2) {
			return arg2 > arg1 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}
}
