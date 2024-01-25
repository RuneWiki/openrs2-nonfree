import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!iaa", name = "j", descriptor = "[I")
	public static int[] anIntArray315;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_63 = new Class6(105, 7);

	@OriginalMember(owner = "client!iaa", name = "k", descriptor = "I")
	public static final int anInt4077 = 0;

	@OriginalMember(owner = "client!iaa", name = "l", descriptor = "Z")
	public static boolean aBoolean249 = false;

	@OriginalMember(owner = "client!iaa", name = "m", descriptor = "S")
	public static short aShort68 = 32767;

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIBI)I")
	public static int method3627(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg1 >>= 0x4;
		} else if (arg2 > 217) {
			arg1 >>= 0x3;
		} else if (arg2 > 192) {
			arg1 >>= 0x2;
		} else if (arg2 > 179) {
			arg1 >>= 0x1;
		}
		return ((arg0 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7) + (arg2 >> 1);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BZLclient!faa;)V")
	public static void method3630(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class47_Sub2_Sub3 arg1) {
		@Pc(15) Class255 local15 = arg1.method4356();
		if (arg1.anInt5082 == 0) {
			arg1.anInt5081 = 0;
			Static533.anInt9236 = -1;
			Static118.anInt2859 = 0;
			return;
		}
		if (arg1.anInt5018 != -1 && arg1.anInt5026 == 0) {
			@Pc(42) Class280 local42 = Static6.aClass126_1.method3574(arg1.anInt5018);
			if (arg1.anInt5080 > 0 && local42.anInt8111 == 0) {
				Static533.anInt9236 = -1;
				Static118.anInt2859 = 0;
				arg1.anInt5081++;
				return;
			}
			if (arg1.anInt5080 <= 0 && local42.anInt8112 == 0) {
				Static533.anInt9236 = -1;
				Static118.anInt2859 = 0;
				arg1.anInt5081++;
				return;
			}
		}
		@Pc(114) Class280 local114;
		@Pc(100) Class112 local100;
		if (arg1.anInt5052 != -1 && arg1.anInt5032 <= Static416.anInt7252) {
			local100 = Static529.aClass90_2.method2963(arg1.anInt5052);
			if (local100.aBoolean233 && local100.anInt3703 != -1) {
				local114 = Static6.aClass126_1.method3574(local100.anInt3703);
				if (arg1.anInt5080 > 0 && local114.anInt8111 == 0) {
					Static533.anInt9236 = -1;
					Static118.anInt2859 = 0;
					arg1.anInt5081++;
					return;
				}
				if (arg1.anInt5080 <= 0 && local114.anInt8112 == 0) {
					arg1.anInt5081++;
					Static118.anInt2859 = 0;
					Static533.anInt9236 = -1;
					return;
				}
			}
		}
		if (arg1.anInt5052 != -1 && Static416.anInt7252 >= arg1.anInt5032) {
			local100 = Static529.aClass90_2.method2963(arg1.anInt5052);
			if (local100.aBoolean233 && local100.anInt3703 != -1) {
				local114 = Static6.aClass126_1.method3574(local100.anInt3703);
				if (arg1.anInt5080 > 0 && local114.anInt8111 == 0) {
					Static118.anInt2859 = 0;
					arg1.anInt5081++;
					Static533.anInt9236 = -1;
					return;
				}
				if (arg1.anInt5080 <= 0 && local114.anInt8112 == 0) {
					Static533.anInt9236 = -1;
					arg1.anInt5081++;
					Static118.anInt2859 = 0;
					return;
				}
			}
		}
		@Pc(218) int local218 = arg1.anInt8189;
		@Pc(221) int local221 = arg1.anInt8191;
		@Pc(237) int local237 = arg1.anIntArray362[arg1.anInt5082 - 1] * 128 + arg1.method4350() * 64;
		@Pc(253) int local253 = arg1.anIntArray361[arg1.anInt5082 - 1] * 128 + arg1.method4350() * 64;
		if (local237 <= local218) {
			if (local237 < local218) {
				if (local253 > local221) {
					arg1.method4364(6144);
				} else if (local221 > local253) {
					arg1.method4364(2048);
				} else {
					arg1.method4364(4096);
				}
			} else if (local221 < local253) {
				arg1.method4364(8192);
			} else if (local221 > local253) {
				arg1.method4364(0);
			}
		} else if (local253 > local221) {
			arg1.method4364(10240);
		} else if (local253 >= local221) {
			arg1.method4364(12288);
		} else {
			arg1.method4364(14336);
		}
		@Pc(336) byte local336 = arg1.aByteArray68[arg1.anInt5082 - 1];
		if (!arg0 && (local237 - local218 > 256 || local237 - local218 < -256 || local253 - local221 > 256 || local253 - local221 < -256)) {
			arg1.anInt8189 = local237;
			arg1.anInt8191 = local253;
			arg1.method4351(false, arg1.anInt5037);
			if (arg1.anInt5080 > 0) {
				arg1.anInt5080--;
			}
			arg1.anInt5082--;
			Static118.anInt2859 = 0;
			Static533.anInt9236 = -1;
			return;
		}
		@Pc(397) int local397 = 4;
		@Pc(399) boolean local399 = true;
		if (arg1 instanceof Class47_Sub2_Sub3_Sub1) {
			local399 = ((Class47_Sub2_Sub3_Sub1) arg1).aClass238_1.aBoolean453;
		}
		@Pc(417) int local417;
		if (local399) {
			local417 = arg1.anInt5037 - arg1.aClass146_7.anInt4511;
			if (local417 != 0 && arg1.anInt5061 == -1 && arg1.anInt5001 != 0) {
				local397 = 2;
			}
			if (!arg0 && arg1.anInt5082 > 2) {
				local397 = 6;
			}
			if (!arg0 && arg1.anInt5082 > 3) {
				local397 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt5082 > 1) {
				local397 = 6;
			}
			if (!arg0 && arg1.anInt5082 > 2) {
				local397 = 8;
			}
		}
		if (arg1.anInt5081 > 0 && arg1.anInt5082 > 1) {
			arg1.anInt5081--;
			local397 = 8;
		}
		if (local336 == 2) {
			local397 <<= 0x1;
		} else if (local336 == 0) {
			local397 >>= 0x1;
		}
		Static118.anInt2859 = 0;
		if (local15.anInt7281 != -1) {
			local397 <<= 0x7;
			if (arg1.anInt5082 == 1) {
				local417 = arg1.anInt5083 * arg1.anInt5083;
				@Pc(539) int local539 = (arg1.anInt8189 > local237 ? arg1.anInt8189 - local237 : local237 - arg1.anInt8189) << 7;
				@Pc(561) int local561 = (local253 >= arg1.anInt8191 ? local253 - arg1.anInt8191 : arg1.anInt8191 + -local253) << 7;
				@Pc(568) int local568 = local539 <= local561 ? local561 : local539;
				@Pc(575) int local575 = local568 * local15.anInt7281 * 2;
				if (local575 < local417) {
					arg1.anInt5083 /= 2;
				} else if (local417 / 2 > local568) {
					arg1.anInt5083 -= local15.anInt7281;
					if (arg1.anInt5083 < 0) {
						arg1.anInt5083 = 0;
					}
				} else if (local397 > arg1.anInt5083) {
					arg1.anInt5083 += local15.anInt7281;
					if (arg1.anInt5083 > local397) {
						arg1.anInt5083 = local397;
					}
				}
			} else if (local397 > arg1.anInt5083) {
				arg1.anInt5083 += local15.anInt7281;
				if (arg1.anInt5083 > local397) {
					arg1.anInt5083 = local397;
				}
			} else if (arg1.anInt5083 > 0) {
				arg1.anInt5083 -= local15.anInt7281;
				if (arg1.anInt5083 < 0) {
					arg1.anInt5083 = 0;
				}
			}
			local397 = arg1.anInt5083 >> 7;
			if (local397 < 1) {
				local397 = 1;
			}
		}
		if (local218 == local237 && local253 == local221) {
			Static533.anInt9236 = -1;
		} else {
			if (local237 > local218) {
				Static118.anInt2859 |= 0x4;
				arg1.anInt8189 += local397;
				if (arg1.anInt8189 > local237) {
					arg1.anInt8189 = local237;
				}
			} else if (local218 > local237) {
				arg1.anInt8189 -= local397;
				Static118.anInt2859 |= 0x8;
				if (arg1.anInt8189 < local237) {
					arg1.anInt8189 = local237;
				}
			}
			if (local253 > local221) {
				arg1.anInt8191 += local397;
				Static118.anInt2859 |= 0x1;
				if (local253 < arg1.anInt8191) {
					arg1.anInt8191 = local253;
				}
			} else if (local253 < local221) {
				arg1.anInt8191 -= local397;
				Static118.anInt2859 |= 0x2;
				if (local253 > arg1.anInt8191) {
					arg1.anInt8191 = local253;
				}
			}
			if (local397 >= 8) {
				Static533.anInt9236 = 2;
			} else {
				Static533.anInt9236 = local336;
			}
		}
		if (arg1.anInt8189 == local237 && local253 == arg1.anInt8191) {
			if (arg1.anInt5080 > 0) {
				arg1.anInt5080--;
			}
			arg1.anInt5082--;
		}
	}
}
