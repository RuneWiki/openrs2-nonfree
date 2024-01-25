import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!uf", name = "U", descriptor = "I")
	public static final int anInt6130 = -14475237;

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IBIII)V")
	public static void method5473(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(16) int local16 = -arg3;
		@Pc(18) int local18 = -1;
		Static27.method690(arg3 + arg2, Static104.anIntArrayArray31[arg0], arg1, arg2 - arg3);
		while (local7 < local9) {
			local18 += 2;
			local16 += local18;
			local7++;
			if (local16 >= 0) {
				local9--;
				local16 -= local9 << 1;
				@Pc(57) int[] local57 = Static104.anIntArrayArray31[local9 + arg0];
				@Pc(64) int[] local64 = Static104.anIntArrayArray31[arg0 - local9];
				@Pc(68) int local68 = local7 + arg2;
				@Pc(73) int local73 = arg2 - local7;
				Static27.method690(local68, local57, arg1, local73);
				Static27.method690(local68, local64, arg1, local73);
			}
			@Pc(89) int local89 = local9 + arg2;
			@Pc(94) int local94 = arg2 - local9;
			@Pc(100) int[] local100 = Static104.anIntArrayArray31[local7 + arg0];
			@Pc(107) int[] local107 = Static104.anIntArrayArray31[arg0 - local7];
			Static27.method690(local89, local100, arg1, local94);
			Static27.method690(local89, local107, arg1, local94);
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(IB)V")
	public static void method5474(@OriginalArg(0) int arg0) {
		@Pc(12) Class14_Sub2_Sub13 local12 = Static1.method5711(14, arg0);
		local12.method3539();
	}

	@OriginalMember(owner = "client!uf", name = "e", descriptor = "(B)V")
	public static void method5476() {
		@Pc(9) int local9 = Static273.anInt5190 * 128 + 64;
		@Pc(15) int local15 = Static215.anInt4291 * 128 + 64;
		@Pc(24) int local24 = Static279.method4730(Static219.anInt4400, local9, local15) - Static273.anInt5197;
		if (Static205.anInt4108 < 100) {
			if (Static124.anInt2717 < local9) {
				Static124.anInt2717 += Static29.anInt4720 + (local9 - Static124.anInt2717) * Static205.anInt4108 / 1000;
				if (Static124.anInt2717 > local9) {
					Static124.anInt2717 = local9;
				}
			}
			if (Static103.anInt2301 < local24) {
				Static103.anInt2301 += Static29.anInt4720 + Static205.anInt4108 * (local24 - Static103.anInt2301) / 1000;
				if (local24 < Static103.anInt2301) {
					Static103.anInt2301 = local24;
				}
			}
			if (local9 < Static124.anInt2717) {
				Static124.anInt2717 -= Static29.anInt4720 + Static205.anInt4108 * (Static124.anInt2717 - local9) / 1000;
				if (local9 > Static124.anInt2717) {
					Static124.anInt2717 = local9;
				}
			}
			if (Static103.anInt2301 > local24) {
				Static103.anInt2301 -= Static29.anInt4720 + Static205.anInt4108 * (Static103.anInt2301 - local24) / 1000;
				if (Static103.anInt2301 < local24) {
					Static103.anInt2301 = local24;
				}
			}
			if (Static141.anInt2986 < local15) {
				Static141.anInt2986 += Static205.anInt4108 * (local15 - Static141.anInt2986) / 1000 + Static29.anInt4720;
				if (local15 < Static141.anInt2986) {
					Static141.anInt2986 = local15;
				}
			}
			if (Static141.anInt2986 > local15) {
				Static141.anInt2986 -= (Static141.anInt2986 - local15) * Static205.anInt4108 / 1000 + Static29.anInt4720;
				if (Static141.anInt2986 < local15) {
					Static141.anInt2986 = local15;
				}
			}
		} else {
			Static141.anInt2986 = Static215.anInt4291 * 128 + 64;
			Static124.anInt2717 = Static273.anInt5190 * 128 + 64;
			Static103.anInt2301 = Static279.method4730(Static219.anInt4400, Static124.anInt2717, Static141.anInt2986) - Static273.anInt5197;
		}
		local15 = Static162.anInt3405 * 128 + 64;
		local9 = Static341.anInt6533 * 128 + 64;
		local24 = Static279.method4730(Static219.anInt4400, local9, local15) - Static13.anInt2444;
		@Pc(210) int local210 = local9 - Static124.anInt2717;
		@Pc(215) int local215 = local24 - Static103.anInt2301;
		@Pc(220) int local220 = local15 - Static141.anInt2986;
		@Pc(231) int local231 = (int) Math.sqrt((double) (local210 * local210 + local220 * local220));
		@Pc(242) int local242 = (int) (Math.atan2((double) local215, (double) local231) * 2607.5945876176133D) & 0x3FFF;
		@Pc(253) int local253 = (int) (Math.atan2((double) local210, (double) local220) * -2607.5945876176133D) & 0x3FFF;
		if (local242 < 1024) {
			local242 = 1024;
		}
		if (local242 > 3072) {
			local242 = 3072;
		}
		if (Static112.anInt2486 < local242) {
			Static112.anInt2486 += (local242 - Static112.anInt2486 >> 3) * Static18.anInt378 / 1000 + Static17.anInt351 << 3;
			if (local242 < Static112.anInt2486) {
				Static112.anInt2486 = local242;
			}
		}
		if (local242 < Static112.anInt2486) {
			Static112.anInt2486 -= Static17.anInt351 + Static18.anInt378 * (Static112.anInt2486 - local242 >> 3) / 1000 << 3;
			if (local242 > Static112.anInt2486) {
				Static112.anInt2486 = local242;
			}
		}
		@Pc(331) int local331 = local253 - Static249.anInt4824;
		if (local331 > 8192) {
			local331 -= 16384;
		}
		if (local331 < -8192) {
			local331 += 16384;
		}
		local331 >>= 0x3;
		if (local331 > 0) {
			Static249.anInt4824 += local331 * Static18.anInt378 / 1000 + Static17.anInt351 << 3;
			Static249.anInt4824 &= 0x3FFF;
		}
		if (local331 < 0) {
			Static249.anInt4824 -= Static18.anInt378 * -local331 / 1000 + Static17.anInt351 << 3;
			Static249.anInt4824 &= 0x3FFF;
		}
		@Pc(391) int local391 = local253 - Static249.anInt4824;
		if (local391 > 8192) {
			local391 -= 16384;
		}
		if (local391 < -8192) {
			local391 += 16384;
		}
		if (local391 < 0 && local331 > 0 || local391 > 0 && local331 < 0) {
			Static249.anInt4824 = local253;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(BIIILclient!q;Lclient!ne;Lclient!gl;I)V")
	public static void method5477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class156 arg3, @OriginalArg(5) Class146 arg4, @OriginalArg(6) Class2 arg5, @OriginalArg(7) int arg6) {
		if (arg5 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static205.anInt4115 == 4) {
			local14 = (int) Static94.aFloat42 & 0x3FFF;
		} else {
			local14 = Static8.anInt205 + (int) Static94.aFloat42 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg4.anInt4133 / 2, arg4.anInt4199 / 2) + 10;
		@Pc(43) int local43 = arg6 * arg6 + arg1 * arg1;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(58) int local58 = Class14_Sub3_Sub34.anIntArray547[local14];
		@Pc(62) int local62 = Class14_Sub3_Sub34.anIntArray546[local14];
		if (Static205.anInt4115 != 4) {
			local58 = local58 * 256 / (Static309.anInt5886 + 256);
			local62 = local62 * 256 / (Static309.anInt5886 + 256);
		}
		@Pc(93) int local93 = arg6 * local58 + arg1 * local62 >> 15;
		@Pc(103) int local103 = local62 * arg6 - local58 * arg1 >> 15;
		arg5.method2636(arg2 + arg4.anInt4133 / 2 + local93 - arg5.method2630() / 2, arg0 + arg4.anInt4199 / 2 - local103 + -(arg5.method2627() / 2), arg3, arg2, arg0);
	}
}
