import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!cga;")
	public static Class52 aClass52_1;

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "[I")
	public static int[] anIntArray290;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "([III[IILclient!gj;)Lclient!gn;")
	public static Class17_Sub3 method2644(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class90_Sub3 arg4) {
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(36) int local36;
		if (!arg4.method7556(Static357.aClass171_12, Static407.aClass254_14)) {
			@Pc(70) int[] local70 = new int[arg1 * arg3];
			for (local23 = 0; local23 < arg1; local23++) {
				local34 = arg3 * local23 + arg0[local23];
				for (local36 = 0; local36 < arg2[local23]; local36++) {
					local70[local34++] = -16777216;
				}
			}
			return new Class17_Sub3(arg4, arg3, arg1, local70);
		}
		@Pc(21) byte[] local21 = new byte[arg1 * arg3];
		for (local23 = 0; local23 < arg1; local23++) {
			local34 = arg3 * local23 + arg0[local23];
			for (local36 = 0; local36 < arg2[local23]; local36++) {
				local21[local34++] = -1;
			}
		}
		return new Class17_Sub3(arg4, arg3, arg1, local21);
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V")
	public static void method2650() {
		@Pc(9) int local9 = Static577.anInt9916 * 512 + 256;
		@Pc(15) int local15 = Static478.anInt8409 * 512 + 256;
		@Pc(24) int local24 = Static37.method631(local15, local9, Static391.anInt7128) - Static427.anInt7589;
		if (Static274.anInt4850 < 100) {
			if (local9 > Static378.anInt6923) {
				Static378.anInt6923 += Static450.anInt7954 + Static274.anInt4850 * (local9 - Static378.anInt6923) / 1000;
				if (Static378.anInt6923 > local9) {
					Static378.anInt6923 = local9;
				}
			}
			if (Static12.anInt183 < local24) {
				Static12.anInt183 += Static274.anInt4850 * (local24 - Static12.anInt183) / 1000 + Static450.anInt7954;
				if (local24 < Static12.anInt183) {
					Static12.anInt183 = local24;
				}
			}
			if (local9 < Static378.anInt6923) {
				Static378.anInt6923 -= (Static378.anInt6923 - local9) * Static274.anInt4850 / 1000 + Static450.anInt7954;
				if (local9 > Static378.anInt6923) {
					Static378.anInt6923 = local9;
				}
			}
			if (Static12.anInt183 > local24) {
				Static12.anInt183 -= (Static12.anInt183 - local24) * Static274.anInt4850 / 1000 + Static450.anInt7954;
				if (Static12.anInt183 < local24) {
					Static12.anInt183 = local24;
				}
			}
			if (local15 > Static208.anInt3949) {
				Static208.anInt3949 += (local15 - Static208.anInt3949) * Static274.anInt4850 / 1000 + Static450.anInt7954;
				if (local15 < Static208.anInt3949) {
					Static208.anInt3949 = local15;
				}
			}
			if (local15 < Static208.anInt3949) {
				Static208.anInt3949 -= Static274.anInt4850 * (Static208.anInt3949 - local15) / 1000 + Static450.anInt7954;
				if (local15 > Static208.anInt3949) {
					Static208.anInt3949 = local15;
				}
			}
		} else {
			Static208.anInt3949 = Static478.anInt8409 * 512 + 256;
			Static378.anInt6923 = Static577.anInt9916 * 512 + 256;
			Static12.anInt183 = Static37.method631(Static208.anInt3949, Static378.anInt6923, Static391.anInt7128) - Static427.anInt7589;
		}
		local15 = Static342.anInt6506 * 512 + 256;
		local9 = Static48.anInt8831 * 512 + 256;
		local24 = Static37.method631(local15, local9, Static391.anInt7128) - Static531.anInt9137;
		@Pc(232) int local232 = local9 - Static378.anInt6923;
		@Pc(237) int local237 = local24 - Static12.anInt183;
		@Pc(242) int local242 = local15 - Static208.anInt3949;
		@Pc(254) int local254 = (int) Math.sqrt((double) (local232 * local232 + local242 * local242));
		@Pc(265) int local265 = (int) (Math.atan2((double) local237, (double) local254) * 2607.5945876176133D) & 0x3FFF;
		@Pc(276) int local276 = (int) (-2607.5945876176133D * Math.atan2((double) local232, (double) local242)) & 0x3FFF;
		if (local265 < 1024) {
			local265 = 1024;
		}
		if (local265 > 3072) {
			local265 = 3072;
		}
		if (local265 > Static38.anInt742) {
			Static38.anInt742 += (local265 - Static38.anInt742 >> 3) * Static478.anInt8411 / 1000 + Static119.anInt7222 << 3;
			if (local265 < Static38.anInt742) {
				Static38.anInt742 = local265;
			}
		}
		if (Static38.anInt742 > local265) {
			Static38.anInt742 -= Static119.anInt7222 + (Static38.anInt742 - local265 >> 3) * Static478.anInt8411 / 1000 << 3;
			if (Static38.anInt742 < local265) {
				Static38.anInt742 = local265;
			}
		}
		@Pc(356) int local356 = local276 - Static232.anInt9865;
		if (local356 > 8192) {
			local356 -= 16384;
		}
		if (local356 < -8192) {
			local356 += 16384;
		}
		local356 >>= 0x3;
		if (local356 > 0) {
			Static232.anInt9865 += local356 * Static478.anInt8411 / 1000 + Static119.anInt7222 << 3;
			Static232.anInt9865 &= 0x3FFF;
		}
		if (local356 < 0) {
			Static232.anInt9865 -= -local356 * Static478.anInt8411 / 1000 + Static119.anInt7222 << 3;
			Static232.anInt9865 &= 0x3FFF;
		}
		@Pc(415) int local415 = local276 - Static232.anInt9865;
		if (local415 > 8192) {
			local415 -= 16384;
		}
		if (local415 < -8192) {
			local415 += 16384;
		}
		if (local415 < 0 && local356 > 0 || local415 > 0 && local356 < 0) {
			Static232.anInt9865 = local276;
		}
		Static463.anInt8184 = 0;
	}
}
