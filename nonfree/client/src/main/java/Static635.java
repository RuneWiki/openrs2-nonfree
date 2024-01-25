import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static635 {

	@OriginalMember(owner = "client!vha", name = "v", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_147 = new Class289(23, 11);

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method8718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg2; local11 <= arg1; local11++) {
			for (@Pc(15) int local15 = arg4; local15 <= arg3; local15++) {
				if (Static52.anIntArrayArray4[local11][local15] == arg0 && Static121.anIntArrayArray11[local11][local15] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(ILclient!ns;Z)V")
	public static void method8719(@OriginalArg(1) Class2_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class389 local9 = arg0.method4317();
		if (arg0.anInt5119 == 0) {
			Static417.anInt7257 = -1;
			Static449.anInt7502 = 0;
			arg0.anInt5122 = 0;
			return;
		}
		if (arg0.anInt5077 != -1 && arg0.anInt5065 == 0) {
			@Pc(39) Class119 local39 = Static334.aClass268_2.method6469(arg0.anInt5077);
			if (arg0.anInt5120 > 0 && local39.anInt3007 == 0) {
				Static449.anInt7502 = 0;
				Static417.anInt7257 = -1;
				arg0.anInt5122++;
				return;
			}
			if (arg0.anInt5120 <= 0 && local39.anInt3016 == 0) {
				Static417.anInt7257 = -1;
				arg0.anInt5122++;
				Static449.anInt7502 = 0;
				return;
			}
		}
		for (@Pc(81) int local81 = 0; local81 < arg0.aClass118Array3.length; local81++) {
			if (arg0.aClass118Array3[local81].anInt2965 != -1 && Static90.anInt1698 >= arg0.aClass118Array3[local81].anInt2967) {
				@Pc(107) Class213 local107 = Static111.aClass279_4.method6905(arg0.aClass118Array3[local81].anInt2965);
				if (local107.aBoolean398 && local107.anInt6006 != -1) {
					@Pc(121) Class119 local121 = Static334.aClass268_2.method6469(local107.anInt6006);
					if (arg0.anInt5120 > 0 && local121.anInt3007 == 0) {
						arg0.anInt5122++;
						Static449.anInt7502 = 0;
						Static417.anInt7257 = -1;
						return;
					}
					if (arg0.anInt5120 <= 0 && local121.anInt3016 == 0) {
						Static449.anInt7502 = 0;
						arg0.anInt5122++;
						Static417.anInt7257 = -1;
						return;
					}
				}
			}
		}
		@Pc(170) int local170 = arg0.anInt10006;
		@Pc(173) int local173 = arg0.anInt10001;
		@Pc(190) int local190 = arg0.anIntArray302[arg0.anInt5119 - 1] * 512 + arg0.method4326() * 256;
		@Pc(212) int local212 = arg0.anIntArray301[arg0.anInt5119 - 1] * 512 + arg0.method4326() * 256;
		if (local170 >= local190) {
			if (local170 <= local190) {
				if (local212 > local173) {
					arg0.method4327(8192);
				} else if (local173 > local212) {
					arg0.method4327(0);
				}
			} else if (local173 < local212) {
				arg0.method4327(6144);
			} else if (local173 <= local212) {
				arg0.method4327(4096);
			} else {
				arg0.method4327(2048);
			}
		} else if (local212 > local173) {
			arg0.method4327(10240);
		} else if (local173 > local212) {
			arg0.method4327(14336);
		} else {
			arg0.method4327(12288);
		}
		@Pc(306) byte local306 = arg0.aByteArray51[arg0.anInt5119 - 1];
		if (!arg1 && (local190 - local170 > 1024 || local190 - local170 < -1024 || local212 - local173 > 1024 || local212 - local173 < -1024)) {
			arg0.anInt10006 = local190;
			arg0.anInt10001 = local212;
			arg0.method4328(arg0.anInt5092, false);
			arg0.anInt5119--;
			Static449.anInt7502 = 0;
			if (arg0.anInt5120 > 0) {
				arg0.anInt5120--;
			}
			Static417.anInt7257 = -1;
			return;
		}
		@Pc(368) int local368 = 16;
		@Pc(370) boolean local370 = true;
		if (arg0 instanceof Class2_Sub1_Sub1_Sub3_Sub2) {
			local370 = ((Class2_Sub1_Sub1_Sub3_Sub2) arg0).aClass91_1.aBoolean144;
		}
		@Pc(388) int local388;
		if (local370) {
			local388 = arg0.anInt5092 - arg0.lb.anInt10072;
			if (local388 != 0 && arg0.anInt5066 == -1 && arg0.anInt5050 != 0) {
				local368 = 8;
			}
			if (!arg1 && arg0.anInt5119 > 2) {
				local368 = 24;
			}
			if (!arg1 && arg0.anInt5119 > 3) {
				local368 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt5119 > 1) {
				local368 = 24;
			}
			if (!arg1 && arg0.anInt5119 > 2) {
				local368 = 32;
			}
		}
		if (arg0.anInt5122 > 0 && arg0.anInt5119 > 1) {
			local368 = 32;
			arg0.anInt5122--;
		}
		if (local306 == 2) {
			local368 <<= 0x1;
		} else if (local306 == 0) {
			local368 >>= 0x1;
		}
		if (local9.anInt10734 != -1) {
			local368 <<= 0x9;
			if (arg0.anInt5119 == 1) {
				local388 = arg0.anInt5121 * arg0.anInt5121;
				@Pc(564) int local564 = (arg0.anInt10006 <= local190 ? local190 - arg0.anInt10006 : arg0.anInt10006 + -local190) << 9;
				@Pc(582) int local582 = (local212 < arg0.anInt10001 ? arg0.anInt10001 - local212 : local212 + -arg0.anInt10001) << 9;
				@Pc(589) int local589 = local564 > local582 ? local564 : local582;
				@Pc(596) int local596 = local9.anInt10734 * 2 * local589;
				if (local596 < local388) {
					arg0.anInt5121 /= 2;
				} else if (local589 < local388 / 2) {
					arg0.anInt5121 -= local9.anInt10734;
					if (arg0.anInt5121 < 0) {
						arg0.anInt5121 = 0;
					}
				} else if (arg0.anInt5121 < local368) {
					arg0.anInt5121 += local9.anInt10734;
					if (arg0.anInt5121 > local368) {
						arg0.anInt5121 = local368;
					}
				}
			} else if (arg0.anInt5121 < local368) {
				arg0.anInt5121 += local9.anInt10734;
				if (local368 < arg0.anInt5121) {
					arg0.anInt5121 = local368;
				}
			} else if (arg0.anInt5121 > 0) {
				arg0.anInt5121 -= local9.anInt10734;
				if (arg0.anInt5121 < 0) {
					arg0.anInt5121 = 0;
				}
			}
			local368 = arg0.anInt5121 >> 9;
			if (local368 < 1) {
				local368 = 1;
			}
		}
		Static449.anInt7502 = 0;
		if (local190 == local170 && local173 == local212) {
			Static417.anInt7257 = -1;
		} else {
			if (local170 < local190) {
				Static449.anInt7502 |= 0x4;
				arg0.anInt10006 += local368;
				if (local190 < arg0.anInt10006) {
					arg0.anInt10006 = local190;
				}
			} else if (local170 > local190) {
				Static449.anInt7502 |= 0x8;
				arg0.anInt10006 -= local368;
				if (arg0.anInt10006 < local190) {
					arg0.anInt10006 = local190;
				}
			}
			if (local368 < 32) {
				Static417.anInt7257 = local306;
			} else {
				Static417.anInt7257 = 2;
			}
			if (local212 > local173) {
				arg0.anInt10001 += local368;
				Static449.anInt7502 |= 0x1;
				if (local212 < arg0.anInt10001) {
					arg0.anInt10001 = local212;
				}
			} else if (local173 > local212) {
				arg0.anInt10001 -= local368;
				Static449.anInt7502 |= 0x2;
				if (arg0.anInt10001 < local212) {
					arg0.anInt10001 = local212;
				}
			}
		}
		if (local190 != arg0.anInt10006 || arg0.anInt10001 != local212) {
			return;
		}
		arg0.anInt5119--;
		if (arg0.anInt5120 > 0) {
			arg0.anInt5120--;
			return;
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;")
	public static String[] method8720(@OriginalArg(0) String arg0, @OriginalArg(2) char arg1) {
		@Pc(10) int local10 = Static380.method5384(arg1, arg0);
		@Pc(23) String[] local23 = new String[local10 + 1];
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < local10; local29++) {
			@Pc(33) int local33;
			for (local33 = local27; arg1 != arg0.charAt(local33); local33++) {
			}
			local23[local25++] = arg0.substring(local27, local33);
			local27 = local33 + 1;
		}
		local23[local10] = arg0.substring(local27);
		return local23;
	}
}
