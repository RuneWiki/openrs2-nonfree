import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!rr", name = "n", descriptor = "[I")
	public static final int[] anIntArray704 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!rr", name = "t", descriptor = "[I")
	public static final int[] anIntArray705 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!sb;BZ)V")
	public static void method4676(@OriginalArg(0) Class22_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class79 local9 = arg0.method4417();
		if (arg0.anInt5151 == 0) {
			arg0.anInt5146 = 0;
			Static143.anInt4069 = -1;
			Static315.anInt6041 = 0;
			return;
		}
		if (arg0.anInt5133 != -1 && arg0.anInt5093 == 0) {
			@Pc(39) Class170 local39 = Static261.method4379(arg0.anInt5133);
			if (arg0.anInt5144 > 0 && local39.anInt4965 == 0) {
				Static315.anInt6041 = 0;
				arg0.anInt5146++;
				Static143.anInt4069 = -1;
				return;
			}
			if (arg0.anInt5144 <= 0 && local39.anInt4959 == 0) {
				arg0.anInt5146++;
				Static143.anInt4069 = -1;
				Static315.anInt6041 = 0;
				return;
			}
		}
		if (arg0.anInt5129 != -1 && arg0.anInt5092 <= Static212.anInt4234) {
			@Pc(96) Class197 local96 = Static10.method162(arg0.anInt5129);
			if (local96.aBoolean442 && local96.anInt6076 != -1) {
				@Pc(108) Class170 local108 = Static261.method4379(local96.anInt6076);
				if (arg0.anInt5144 > 0 && local108.anInt4965 == 0) {
					Static143.anInt4069 = -1;
					arg0.anInt5146++;
					Static315.anInt6041 = 0;
					return;
				}
				if (arg0.anInt5144 <= 0 && local108.anInt4959 == 0) {
					Static143.anInt4069 = -1;
					Static315.anInt6041 = 0;
					arg0.anInt5146++;
					return;
				}
			}
		}
		@Pc(154) int local154 = arg0.anInt5973;
		@Pc(157) int local157 = arg0.anInt5967;
		@Pc(173) int local173 = arg0.anIntArray666[arg0.anInt5151 - 1] * 128 + arg0.method4421() * 64;
		@Pc(190) int local190 = arg0.anIntArray665[arg0.anInt5151 - 1] * 128 + arg0.method4421() * 64;
		if (!arg1 && (local173 - local154 > 256 || local173 - local154 < -256 || local190 - local157 > 256 || local190 - local157 < -256)) {
			Static315.anInt6041 = 0;
			arg0.anInt5967 = local190;
			arg0.anInt5973 = local173;
			Static143.anInt4069 = -1;
			return;
		}
		if (local173 <= local154) {
			if (local173 < local154) {
				if (local157 < local190) {
					arg0.method4405(6144);
				} else if (local190 >= local157) {
					arg0.method4405(4096);
				} else {
					arg0.method4405(2048);
				}
			} else if (local157 < local190) {
				arg0.method4405(8192);
			} else if (local157 > local190) {
				arg0.method4405(0);
			}
		} else if (local157 < local190) {
			arg0.method4405(10240);
		} else if (local190 < local157) {
			arg0.method4405(14336);
		} else {
			arg0.method4405(12288);
		}
		@Pc(305) int local305 = 4;
		@Pc(307) boolean local307 = true;
		if (arg0 instanceof Class22_Sub2_Sub1_Sub2) {
			local307 = ((Class22_Sub2_Sub1_Sub2) arg0).aClass174_1.aBoolean388;
		}
		if (local307) {
			@Pc(347) int local347 = arg0.anInt5106 - arg0.aClass54_7.anInt1603;
			if (local347 != 0 && arg0.anInt5140 == -1 && arg0.anInt5111 != 0) {
				local305 = 2;
			}
			if (!arg1 && arg0.anInt5151 > 2) {
				local305 = 6;
			}
			if (!arg1 && arg0.anInt5151 > 3) {
				local305 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt5151 > 1) {
				local305 = 6;
			}
			if (!arg1 && arg0.anInt5151 > 2) {
				local305 = 8;
			}
		}
		if (arg0.anInt5146 > 0 && arg0.anInt5151 > 1) {
			arg0.anInt5146--;
			local305 = 8;
		}
		@Pc(406) byte local406 = arg0.aByteArray77[arg0.anInt5151 - 1];
		if (local406 == 2) {
			local305 <<= 0x1;
		} else if (local406 == 0) {
			local305 >>= 0x1;
		}
		Static315.anInt6041 = 0;
		if (local9.anInt2359 != -1) {
			local305 <<= 0x7;
			if (arg0.anInt5151 == 1) {
				@Pc(450) int local450 = arg0.anInt5152 * arg0.anInt5152;
				@Pc(471) int local471 = (arg0.anInt5973 <= local173 ? local173 - arg0.anInt5973 : -local173 + arg0.anInt5973) << 7;
				@Pc(492) int local492 = (arg0.anInt5967 <= local190 ? local190 - arg0.anInt5967 : -local190 + arg0.anInt5967) << 7;
				@Pc(503) int local503 = local471 > local492 ? local471 : local492;
				@Pc(510) int local510 = local503 * 2 * local9.anInt2359;
				if (local450 > local510) {
					arg0.anInt5152 /= 2;
				} else if (local503 < local450 / 2) {
					arg0.anInt5152 -= local9.anInt2359;
					if (arg0.anInt5152 < 0) {
						arg0.anInt5152 = 0;
					}
				} else if (local305 > arg0.anInt5152) {
					arg0.anInt5152 += local9.anInt2359;
					if (arg0.anInt5152 > local305) {
						arg0.anInt5152 = local305;
					}
				}
			} else if (local305 > arg0.anInt5152) {
				arg0.anInt5152 += local9.anInt2359;
				if (arg0.anInt5152 > local305) {
					arg0.anInt5152 = local305;
				}
			} else if (arg0.anInt5152 > 0) {
				arg0.anInt5152 -= local9.anInt2359;
				if (arg0.anInt5152 < 0) {
					arg0.anInt5152 = 0;
				}
			}
			local305 = arg0.anInt5152 >> 7;
			if (local305 < 1) {
				local305 = 1;
			}
		}
		if (local154 < local173) {
			Static315.anInt6041 |= 0x4;
			arg0.anInt5973 += local305;
			if (arg0.anInt5973 > local173) {
				arg0.anInt5973 = local173;
			}
		} else if (local154 > local173) {
			Static315.anInt6041 |= 0x8;
			arg0.anInt5973 -= local305;
			if (arg0.anInt5973 < local173) {
				arg0.anInt5973 = local173;
			}
		}
		if (local157 < local190) {
			Static315.anInt6041 |= 0x1;
			arg0.anInt5967 += local305;
			if (local190 < arg0.anInt5967) {
				arg0.anInt5967 = local190;
			}
		} else if (local190 < local157) {
			arg0.anInt5967 -= local305;
			Static315.anInt6041 |= 0x2;
			if (arg0.anInt5967 < local190) {
				arg0.anInt5967 = local190;
			}
		}
		if (arg0.anInt5973 == local173 && arg0.anInt5967 == local190) {
			if (arg0.anInt5144 > 0) {
				arg0.anInt5144--;
			}
			arg0.anInt5151--;
		}
		if (local305 < 8) {
			Static143.anInt4069 = local406;
		} else {
			Static143.anInt4069 = 2;
		}
	}
}
