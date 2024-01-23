import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static151 {

	@OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
	public static int anInt3323;

	@OriginalMember(owner = "client!kh", name = "N", descriptor = "Lclient!ek;")
	public static Class42 aClass42_41;

	@OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
	public static int anInt3328;

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString113 = "Loaded input handler";

	@OriginalMember(owner = "client!kh", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString114 = "Starting 3d Library";

	@OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
	public static int anInt3324 = 0;

	@OriginalMember(owner = "client!kh", name = "S", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray25 = new String[200];

	@OriginalMember(owner = "client!kh", name = "c", descriptor = "(II)Lclient!cm;")
	public static Class30 method2697(@OriginalArg(0) int arg0) {
		@Pc(16) Class30 local16 = (Class30) Static29.aClass157_7.method4031((long) arg0);
		if (local16 != null) {
			return local16;
		}
		@Pc(27) byte[] local27 = Static98.aClass42_25.method1256(33, arg0);
		local16 = new Class30();
		if (local27 != null) {
			local16.method815(new Class2_Sub16(local27), arg0);
		}
		Static29.aClass157_7.method4026((long) arg0, local16);
		return local16;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLclient!ek;Lclient!ek;)V")
	public static void method2698(@OriginalArg(1) Class42 arg0, @OriginalArg(2) Class42 arg1) {
		Static103.aClass42_29 = arg1;
		Static98.aClass42_24 = arg0;
		@Pc(22) int local22 = (int) (Math.random() * 21.0D) - 10;
		@Pc(29) int local29 = (int) (Math.random() * 21.0D) - 10;
		Static103.aClass42_29.method1269(34);
		@Pc(41) int local41 = (int) (Math.random() * 41.0D) - 20;
		@Pc(48) int local48 = (int) (Math.random() * 21.0D) - 10;
		Static301.anInt5805 = local29 + local41;
		Static220.anInt4520 = local48 + local41;
		Static155.anInt3465 = local41 + local22;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILclient!qc;)V")
	public static void method2699(@OriginalArg(1) Class15_Sub2 arg0) {
		@Pc(14) Class123 local14 = arg0.method4297();
		arg0.anInt5365 = local14.anInt4136;
		if (arg0.anInt5342 == 0) {
			arg0.anInt5296 = 0;
			return;
		}
		if (arg0.anInt5332 != -1 && arg0.anInt5343 == 0) {
			@Pc(37) Class112 local37 = Static208.method3496(arg0.anInt5332);
			if (arg0.anInt5370 > 0 && local37.anInt3855 == 0) {
				arg0.anInt5296++;
				return;
			}
			if (arg0.anInt5370 <= 0 && local37.anInt3859 == 0) {
				arg0.anInt5296++;
				return;
			}
		}
		if (arg0.anInt5301 != -1 && Static268.anInt5236 >= arg0.anInt5367) {
			@Pc(86) Class96 local86 = Static156.method2852(arg0.anInt5301);
			if (local86.aBoolean232 && local86.anInt3389 != -1) {
				@Pc(99) Class112 local99 = Static208.method3496(local86.anInt3389);
				if (arg0.anInt5370 > 0 && local99.anInt3855 == 0) {
					arg0.anInt5296++;
					return;
				}
				if (arg0.anInt5370 <= 0 && local99.anInt3859 == 0) {
					arg0.anInt5296++;
					return;
				}
			}
		}
		@Pc(132) int local132 = arg0.anInt5358;
		@Pc(135) int local135 = arg0.anInt5371;
		@Pc(152) int local152 = arg0.anIntArray516[arg0.anInt5342 - 1] * 128 + arg0.method4286() * 64;
		@Pc(169) int local169 = arg0.anIntArray518[arg0.anInt5342 - 1] * 128 + arg0.method4286() * 64;
		if (local152 - local132 > 256 || local152 - local132 < -256 || local169 - local135 > 256 || local169 - local135 < -256) {
			arg0.anInt5358 = local152;
			arg0.anInt5371 = local169;
			return;
		}
		if (local132 >= local152) {
			if (local132 <= local152) {
				if (local135 < local169) {
					arg0.anInt5313 = 1024;
				} else if (local169 < local135) {
					arg0.anInt5313 = 0;
				}
			} else if (local135 < local169) {
				arg0.anInt5313 = 768;
			} else if (local169 >= local135) {
				arg0.anInt5313 = 512;
			} else {
				arg0.anInt5313 = 256;
			}
		} else if (local169 > local135) {
			arg0.anInt5313 = 1280;
		} else if (local135 <= local169) {
			arg0.anInt5313 = 1536;
		} else {
			arg0.anInt5313 = 1792;
		}
		@Pc(283) int local283 = local14.anInt4128;
		@Pc(291) int local291 = arg0.anInt5313 - arg0.anInt5373 & 0x7FF;
		if (local291 > 1024) {
			local291 -= 2048;
		}
		@Pc(297) int local297 = 4;
		if (local291 >= -256 && local291 <= 256) {
			local283 = local14.anInt4120;
		} else if (local291 >= 256 && local291 < 768) {
			local283 = local14.anInt4143;
		} else if (local291 >= -768 && local291 <= -256) {
			local283 = local14.anInt4119;
		}
		if (local283 == -1) {
			local283 = local14.anInt4120;
		}
		arg0.anInt5365 = local283;
		@Pc(345) byte local345 = 1;
		@Pc(347) boolean local347 = true;
		if (arg0 instanceof Class15_Sub2_Sub1) {
			local347 = ((Class15_Sub2_Sub1) arg0).aClass188_1.aBoolean386;
		}
		if (local347) {
			if (arg0.anInt5373 != arg0.anInt5313 && arg0.anInt5352 == -1 && arg0.anInt5307 != 0) {
				local297 = 2;
			}
			if (arg0.anInt5342 > 2) {
				local297 = 6;
			}
			if (arg0.anInt5342 > 3) {
				local297 = 8;
			}
			if (arg0.anInt5296 > 0 && arg0.anInt5342 > 1) {
				arg0.anInt5296--;
				local297 = 8;
			}
		} else {
			if (arg0.anInt5342 > 1) {
				local297 = 6;
			}
			if (arg0.anInt5342 > 2) {
				local297 = 8;
			}
			if (arg0.anInt5296 > 0 && arg0.anInt5342 > 1) {
				arg0.anInt5296--;
				local297 = 8;
			}
		}
		if (arg0.aByteArray66[arg0.anInt5342 - 1] == 2) {
			local297 <<= 0x1;
			local345 = 2;
		} else if (arg0.aByteArray66[arg0.anInt5342 - 1] == 0) {
			local297 >>= 0x1;
			local345 = 0;
		}
		if (local297 < 8 || local14.anInt4111 == -1) {
			if (local14.anInt4113 != -1 && local345 == 0) {
				if (arg0.anInt5365 == local14.anInt4128 && local14.anInt4133 != -1) {
					arg0.anInt5365 = local14.anInt4133;
				} else if (local14.anInt4119 == arg0.anInt5365 && local14.anInt4142 != -1) {
					arg0.anInt5365 = local14.anInt4142;
				} else if (local14.anInt4143 == arg0.anInt5365 && local14.anInt4129 != -1) {
					arg0.anInt5365 = local14.anInt4129;
				} else {
					arg0.anInt5365 = local14.anInt4113;
				}
			}
		} else if (arg0.anInt5365 == local14.anInt4128 && local14.anInt4140 != -1) {
			arg0.anInt5365 = local14.anInt4140;
		} else if (arg0.anInt5365 == local14.anInt4119 && local14.anInt4124 != -1) {
			arg0.anInt5365 = local14.anInt4124;
		} else if (arg0.anInt5365 == local14.anInt4143 && local14.anInt4121 != -1) {
			arg0.anInt5365 = local14.anInt4121;
		} else {
			arg0.anInt5365 = local14.anInt4111;
		}
		if (local14.anInt4132 != -1) {
			local297 <<= 0x7;
			if (arg0.anInt5342 == 1) {
				@Pc(634) int local634 = arg0.anInt5347 * arg0.anInt5347;
				@Pc(656) int local656 = (local152 >= arg0.anInt5358 ? local152 - arg0.anInt5358 : -local152 + arg0.anInt5358) << 7;
				@Pc(674) int local674 = (local169 < arg0.anInt5371 ? arg0.anInt5371 - local169 : local169 + -arg0.anInt5371) << 7;
				@Pc(685) int local685 = local656 <= local674 ? local674 : local656;
				@Pc(692) int local692 = local685 * 2 * local14.anInt4132;
				if (local634 > local692) {
					arg0.anInt5347 /= 2;
				} else if (local634 / 2 > local685) {
					arg0.anInt5347 -= local14.anInt4132;
					if (arg0.anInt5347 < 0) {
						arg0.anInt5347 = 0;
					}
				} else if (local297 > arg0.anInt5347) {
					arg0.anInt5347 += local14.anInt4132;
					if (arg0.anInt5347 > local297) {
						arg0.anInt5347 = local297;
					}
				}
			} else if (arg0.anInt5347 < local297) {
				arg0.anInt5347 += local14.anInt4132;
				if (local297 < arg0.anInt5347) {
					arg0.anInt5347 = local297;
				}
			} else if (arg0.anInt5347 > 0) {
				arg0.anInt5347 -= local14.anInt4132;
				if (arg0.anInt5347 < 0) {
					arg0.anInt5347 = 0;
				}
			}
			local297 = arg0.anInt5347 >> 7;
			if (local297 < 1) {
				local297 = 1;
			}
		}
		if (local169 > local135) {
			arg0.anInt5371 += local297;
			if (local169 < arg0.anInt5371) {
				arg0.anInt5371 = local169;
			}
		} else if (local135 > local169) {
			arg0.anInt5371 -= local297;
			if (arg0.anInt5371 < local169) {
				arg0.anInt5371 = local169;
			}
		}
		if (local152 > local132) {
			arg0.anInt5358 += local297;
			if (local152 < arg0.anInt5358) {
				arg0.anInt5358 = local152;
			}
		} else if (local152 < local132) {
			arg0.anInt5358 -= local297;
			if (local152 > arg0.anInt5358) {
				arg0.anInt5358 = local152;
			}
		}
		if (local152 == arg0.anInt5358 && arg0.anInt5371 == local169) {
			if (arg0.anInt5370 > 0) {
				arg0.anInt5370--;
			}
			arg0.anInt5342--;
		}
	}
}
