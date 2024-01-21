import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
	public static int anInt84;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
	public static int anInt81 = 0;

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_8 = Static120.method1824("");

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public static int anInt82 = 0;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!pf;")
	public static final Class3_Sub17_Sub1 aClass3_Sub17_Sub1_1 = new Class3_Sub17_Sub1(5000);

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
	public static int anInt87 = -1;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_9 = Static120.method1824("Null");

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIII)V")
	public static void method78(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static61.method895(arg4, Static34.anInt790, Static17.anInt440);
		@Pc(17) int local17 = Static61.method895(arg0, Static34.anInt790, Static17.anInt440);
		@Pc(23) int local23 = Static61.method895(arg3, Static172.anInt3861, Static85.anInt1779);
		@Pc(29) int local29 = Static61.method895(arg1, Static172.anInt3861, Static85.anInt1779);
		for (@Pc(36) int local36 = local11; local36 <= local17; local36++) {
			Static46.method726(local23, arg2, Static96.anIntArrayArray27[local36], local29);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!oh;)V")
	public static void method79(@OriginalArg(1) Class3_Sub1_Sub5_Sub4 arg0) {
		arg0.anInt4285 = arg0.anInt4326;
		if (arg0.anInt4297 == 0) {
			arg0.anInt4293 = 0;
			return;
		}
		if (arg0.anInt4323 != -1 && arg0.anInt4286 == 0) {
			@Pc(29) Class3_Sub1_Sub15 local29 = Static148.method2368(arg0.anInt4323);
			if (arg0.anInt4291 > 0 && local29.anInt3546 == 0) {
				arg0.anInt4293++;
				return;
			}
			if (arg0.anInt4291 <= 0 && local29.anInt3551 == 0) {
				arg0.anInt4293++;
				return;
			}
		}
		@Pc(61) int local61 = arg0.anInt4315;
		@Pc(76) int local76 = arg0.anIntArray509[arg0.anInt4297 - 1] * 128 + arg0.anInt4277 * 64;
		@Pc(79) int local79 = arg0.anInt4329;
		@Pc(98) int local98 = arg0.anIntArray513[arg0.anInt4297 - 1] * 128 + arg0.anInt4277 * 64;
		if (local76 - local79 > 256 || local76 - local79 < -256 || local98 - local61 > 256 || local98 - local61 < -256) {
			arg0.anInt4329 = local76;
			arg0.anInt4315 = local98;
			return;
		}
		if (local76 <= local79) {
			if (local79 > local76) {
				if (local98 > local61) {
					arg0.anInt4309 = 768;
				} else if (local61 > local98) {
					arg0.anInt4309 = 256;
				} else {
					arg0.anInt4309 = 512;
				}
			} else if (local61 < local98) {
				arg0.anInt4309 = 1024;
			} else if (local61 > local98) {
				arg0.anInt4309 = 0;
			}
		} else if (local61 < local98) {
			arg0.anInt4309 = 1280;
		} else if (local98 < local61) {
			arg0.anInt4309 = 1792;
		} else {
			arg0.anInt4309 = 1536;
		}
		@Pc(229) int local229 = arg0.anInt4309 - arg0.anInt4301 & 0x7FF;
		@Pc(232) int local232 = arg0.anInt4288;
		if (local229 > 1024) {
			local229 -= 2048;
		}
		@Pc(238) int local238 = 4;
		if (local229 >= -256 && local229 <= 256) {
			local232 = arg0.anInt4324;
		} else if (local229 >= 256 && local229 < 768) {
			local232 = arg0.anInt4278;
		} else if (local229 >= -768 && local229 <= -256) {
			local232 = arg0.anInt4283;
		}
		if (local232 == -1) {
			local232 = arg0.anInt4324;
		}
		@Pc(281) boolean local281 = true;
		arg0.anInt4285 = local232;
		if (arg0 instanceof Class3_Sub1_Sub5_Sub4_Sub1) {
			local281 = ((Class3_Sub1_Sub5_Sub4_Sub1) arg0).aClass3_Sub1_Sub7_1.aBoolean42;
		}
		if (local281) {
			if (arg0.anInt4301 != arg0.anInt4309 && arg0.anInt4328 == -1 && arg0.anInt4302 != 0) {
				local238 = 2;
			}
			if (arg0.anInt4297 > 2) {
				local238 = 6;
			}
			if (arg0.anInt4297 > 3) {
				local238 = 8;
			}
			if (arg0.anInt4293 > 0 && arg0.anInt4297 > 1) {
				arg0.anInt4293--;
				local238 = 8;
			}
		} else {
			if (arg0.anInt4297 > 1) {
				local238 = 6;
			}
			if (arg0.anInt4297 > 2) {
				local238 = 8;
			}
			if (arg0.anInt4293 > 0 && arg0.anInt4297 > 1) {
				arg0.anInt4293--;
				local238 = 8;
			}
		}
		if (arg0.aBooleanArray19[arg0.anInt4297 - 1]) {
			local238 <<= 0x1;
		}
		if (local238 >= 8 && arg0.anInt4285 == arg0.anInt4324 && arg0.anInt4289 != -1) {
			arg0.anInt4285 = arg0.anInt4289;
		}
		if (local79 < local76) {
			arg0.anInt4329 += local238;
			if (local76 < arg0.anInt4329) {
				arg0.anInt4329 = local76;
			}
		} else if (local76 < local79) {
			arg0.anInt4329 -= local238;
			if (local76 > arg0.anInt4329) {
				arg0.anInt4329 = local76;
			}
		}
		if (local98 > local61) {
			arg0.anInt4315 += local238;
			if (local98 < arg0.anInt4315) {
				arg0.anInt4315 = local98;
			}
		} else if (local98 < local61) {
			arg0.anInt4315 -= local238;
			if (local98 > arg0.anInt4315) {
				arg0.anInt4315 = local98;
			}
		}
		if (local76 == arg0.anInt4329 && local98 == arg0.anInt4315) {
			if (arg0.anInt4291 > 0) {
				arg0.anInt4291--;
			}
			arg0.anInt4297--;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)I")
	public static int method81(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}
}
