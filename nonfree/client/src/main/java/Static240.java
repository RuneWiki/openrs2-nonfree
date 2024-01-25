import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "Z")
	public static boolean aBoolean782 = false;

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZIIIII)V")
	public static void method9043(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 < 1) {
			arg3 = 1;
		}
		if (arg4 < 1) {
			arg4 = 1;
		}
		@Pc(21) int local21 = arg4 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(47) int local47 = (Static464.aShort114 - Static49.aShort6) * local21 / 100 + Static49.aShort6;
		if (Static134.aShort20 > local47) {
			local47 = Static134.aShort20;
		} else if (Static232.aShort54 < local47) {
			local47 = Static232.aShort54;
		}
		@Pc(79) int local79 = local47 * 512 * arg4 / (arg3 * 334);
		@Pc(113) int local113;
		@Pc(120) int local120;
		@Pc(84) short local84;
		if (local79 < Static454.aShort112) {
			local84 = Static454.aShort112;
			local47 = local84 * arg3 * 334 / (arg4 * 512);
			if (local47 > Static232.aShort54) {
				local47 = Static232.aShort54;
				local113 = local47 * arg4 * 512 / (local84 * 334);
				local120 = (arg3 - local113) / 2;
				if (arg0) {
					Static488.aClass67_12.la();
					Static488.aClass67_12.method7696(arg2, arg4, local120, arg1, -16777216);
					Static488.aClass67_12.method7696(arg3 + arg2 - local120, arg4, local120, arg1, -16777216);
				}
				arg2 += local120;
				arg3 -= local120 * 2;
			}
		} else if (local79 > Static424.aShort97) {
			local84 = Static424.aShort97;
			local47 = local84 * arg3 * 334 / (arg4 * 512);
			if (Static134.aShort20 > local47) {
				local47 = Static134.aShort20;
				local113 = local84 * arg3 * 334 / (local47 * 512);
				local120 = (arg4 - local113) / 2;
				if (arg0) {
					Static488.aClass67_12.la();
					Static488.aClass67_12.method7696(arg2, local120, arg3, arg1, -16777216);
					Static488.aClass67_12.method7696(arg2, local120, arg3, arg1 + arg4 - local120, -16777216);
				}
				arg4 -= local120 * 2;
				arg1 += local120;
			}
		}
		Static523.anInt8906 = arg1;
		Static9.anInt141 = (short) arg3;
		Static575.anInt9442 = (short) arg4;
		Static141.anInt2657 = arg2;
		Static2.anInt10934 = arg4 * local47 / 334;
	}
}
