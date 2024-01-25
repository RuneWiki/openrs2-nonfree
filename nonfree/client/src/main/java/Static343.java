import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIZBII)V")
	public static void method5475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg1 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(46) int local46 = (Static142.aShort53 - Static26.aShort10) * local21 / 100 + Static26.aShort10;
		if (Static349.aShort93 > local46) {
			local46 = Static349.aShort93;
		} else if (local46 > Static160.aShort55) {
			local46 = Static160.aShort55;
		}
		@Pc(68) int local68 = arg1 * 512 * local46 / (arg4 * 334);
		@Pc(117) int local117;
		@Pc(124) int local124;
		@Pc(88) short local88;
		if (local68 < Static334.aShort59) {
			local88 = Static334.aShort59;
			local46 = local88 * 334 * arg4 / (arg1 * 512);
			if (Static160.aShort55 < local46) {
				local46 = Static160.aShort55;
				local117 = local46 * arg1 * 512 / (local88 * 334);
				local124 = (arg4 - local117) / 2;
				if (arg2) {
					Static274.aClass47_9.method2722();
					Static274.aClass47_9.method2687(arg0, -16777216, local124, arg3, arg1);
					Static274.aClass47_9.method2687(arg4 + arg0 - local124, -16777216, local124, arg3, arg1);
				}
				arg4 -= local124 * 2;
				arg0 += local124;
			}
		} else if (local68 > Static176.aShort23) {
			local88 = Static176.aShort23;
			local46 = local88 * arg4 * 334 / (arg1 * 512);
			if (Static349.aShort93 > local46) {
				local46 = Static349.aShort93;
				local117 = local88 * 334 * arg4 / (local46 * 512);
				local124 = (arg1 - local117) / 2;
				if (arg2) {
					Static274.aClass47_9.method2722();
					Static274.aClass47_9.method2687(arg0, -16777216, arg4, arg3, local124);
					Static274.aClass47_9.method2687(arg0, -16777216, arg4, arg1 + arg3 - local124, local124);
				}
				arg1 -= local124 * 2;
				arg3 += local124;
			}
		}
		Static152.anInt3325 = (short) arg1;
		Static124.anInt2956 = (short) arg4;
		Static89.anInt2442 = arg3;
		Static272.anInt5415 = arg1 * local46 / 334;
		Static319.anInt6181 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IIIII)V")
	public static void method5476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static149.anInt3927 = arg3;
		Static340.anInt6523 = arg2;
		Static77.anInt2063 = arg1;
		Static229.anInt4618 = arg0;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)Lclient!lf;")
	public static Class4_Sub11 method5477() {
		@Pc(8) Class4_Sub11 local8 = new Class4_Sub11(38);
		local8.method3434(15);
		local8.method3434(Static305.anInt6786);
		local8.method3434(Static315.aBoolean453 ? 1 : 0);
		local8.method3434(Static158.aBoolean271 ? 1 : 0);
		local8.method3434(Static181.aBoolean302 ? 1 : 0);
		local8.method3434(Static166.aBoolean285 ? 1 : 0);
		local8.method3434(0);
		local8.method3434(Static292.aBoolean421 ? 1 : 0);
		local8.method3434(Static51.aBoolean102 ? 1 : 0);
		local8.method3434(Static241.aBoolean366 ? 1 : 0);
		local8.method3434(Static9.anInt216);
		local8.method3434(Static237.aBoolean480 ? 1 : 0);
		local8.method3434(Static284.aBoolean418 ? 1 : 0);
		local8.method3434(Static144.aBoolean265 ? 1 : 0);
		local8.method3434(Static333.anInt6382);
		local8.method3434(Static106.aBoolean193 ? 1 : 0);
		local8.method3434(Static292.anInt5680);
		local8.method3434(Static26.anInt577);
		local8.method3434(Static8.anInt192);
		local8.method3402(Static184.anInt3878);
		local8.method3402(Static43.anInt1147);
		local8.method3434(Static258.method4489());
		local8.method3452(Static90.anInt2474);
		local8.method3434(Static309.anInt6000);
		local8.method3434(Static165.aBoolean280 ? 1 : 0);
		local8.method3434(Static24.aBoolean37 ? 1 : 0);
		local8.method3434(Static159.anInt3440);
		local8.method3434(Static306.aBoolean438 ? 1 : 0);
		local8.method3434(Static335.aBoolean468 ? 1 : 0);
		local8.method3434(Static43.anInt1146);
		local8.method3434(Static209.aBoolean333 ? 1 : 0);
		local8.method3434(Static233.anInt4697);
		local8.method3434(Static348.anInt6588);
		return local8;
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)Lclient!dc;")
	public static Class40 method5478(@OriginalArg(1) int arg0) {
		@Pc(5) Class198 local5 = Static269.aClass198_194;
		@Pc(14) Class40 local14;
		synchronized (Static269.aClass198_194) {
			local14 = (Class40) Static269.aClass198_194.method5210((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(30) byte[] local30 = Static327.aClass193_102.method5047(32, arg0);
		local14 = new Class40();
		if (local30 != null) {
			local14.method1171(new Class4_Sub11(local30));
		}
		local14.method1177();
		@Pc(48) Class198 local48 = Static269.aClass198_194;
		synchronized (Static269.aClass198_194) {
			Static269.aClass198_194.method5201(local14, (long) arg0);
			return local14;
		}
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5479(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static129.anInt3035; local16++) {
			if (arg0.equalsIgnoreCase(Static332.aStringArray78[local16])) {
				return true;
			}
			if (arg0.equalsIgnoreCase(Static292.aStringArray68[local16])) {
				return true;
			}
		}
		return false;
	}
}
