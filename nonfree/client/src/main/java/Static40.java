import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
	public static int anInt987;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "[I")
	public static final int[] anIntArray50 = new int[14];

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt988 = -1;

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
	public static int anInt989 = -1;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "[C")
	public static final char[] aCharArray4 = new char[128];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!bo;IZ)V")
	public static void method890(@OriginalArg(0) Class25_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class33 local9 = arg0.method4659();
		if (arg0.anInt5337 == 0) {
			arg0.anInt5334 = 0;
			Static215.anInt4285 = 0;
			Static275.anInt5381 = -1;
			return;
		}
		if (arg0.anInt5312 != -1 && arg0.anInt5263 == 0) {
			@Pc(35) Class17 local35 = Static261.method4492(arg0.anInt5312);
			if (arg0.anInt5341 > 0 && local35.anInt516 == 0) {
				Static275.anInt5381 = -1;
				arg0.anInt5334++;
				Static215.anInt4285 = 0;
				return;
			}
			if (arg0.anInt5341 <= 0 && local35.anInt518 == 0) {
				Static215.anInt4285 = 0;
				Static275.anInt5381 = -1;
				arg0.anInt5334++;
				return;
			}
		}
		if (arg0.anInt5269 != -1 && arg0.anInt5306 <= Static180.anInt3606) {
			@Pc(88) Class128 local88 = Static136.method2578(arg0.anInt5269);
			if (local88.aBoolean266 && local88.anInt3759 != -1) {
				@Pc(100) Class17 local100 = Static261.method4492(local88.anInt3759);
				if (arg0.anInt5341 > 0 && local100.anInt516 == 0) {
					arg0.anInt5334++;
					Static275.anInt5381 = -1;
					Static215.anInt4285 = 0;
					return;
				}
				if (arg0.anInt5341 <= 0 && local100.anInt518 == 0) {
					Static215.anInt4285 = 0;
					arg0.anInt5334++;
					Static275.anInt5381 = -1;
					return;
				}
			}
		}
		@Pc(146) int local146 = arg0.anInt5769;
		@Pc(149) int local149 = arg0.anInt5773;
		@Pc(166) int local166 = arg0.anIntArray402[arg0.anInt5337 - 1] * 128 + arg0.method4646() * 64;
		@Pc(183) int local183 = arg0.anIntArray401[arg0.anInt5337 - 1] * 128 + arg0.method4646() * 64;
		if (!arg1 && (local166 - local146 > 256 || local166 - local146 < -256 || local183 - local149 > 256 || local183 - local149 < -256)) {
			arg0.anInt5773 = local183;
			Static275.anInt5381 = -1;
			arg0.anInt5769 = local166;
			Static215.anInt4285 = 0;
			return;
		}
		if (local166 <= local146) {
			if (local146 > local166) {
				if (local183 > local149) {
					arg0.method4653(6144);
				} else if (local183 >= local149) {
					arg0.method4653(4096);
				} else {
					arg0.method4653(2048);
				}
			} else if (local183 > local149) {
				arg0.method4653(8192);
			} else if (local183 < local149) {
				arg0.method4653(0);
			}
		} else if (local149 < local183) {
			arg0.method4653(10240);
		} else if (local183 < local149) {
			arg0.method4653(14336);
		} else {
			arg0.method4653(12288);
		}
		@Pc(306) int local306 = 4;
		@Pc(308) boolean local308 = true;
		if (arg0 instanceof Class25_Sub1_Sub1_Sub2) {
			local308 = ((Class25_Sub1_Sub1_Sub2) arg0).aClass216_1.aBoolean481;
		}
		if (local308) {
			@Pc(325) int local325 = arg0.anInt5328 - arg0.aClass131_7.anInt3850;
			if (local325 != 0 && arg0.anInt5332 == -1 && arg0.anInt5308 != 0) {
				local306 = 2;
			}
			if (!arg1 && arg0.anInt5337 > 2) {
				local306 = 6;
			}
			if (!arg1 && arg0.anInt5337 > 3) {
				local306 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt5337 > 1) {
				local306 = 6;
			}
			if (!arg1 && arg0.anInt5337 > 2) {
				local306 = 8;
			}
		}
		if (arg0.anInt5334 > 0 && arg0.anInt5337 > 1) {
			arg0.anInt5334--;
			local306 = 8;
		}
		@Pc(405) byte local405 = arg0.aByteArray75[arg0.anInt5337 - 1];
		if (local405 == 2) {
			local306 <<= 0x1;
		} else if (local405 == 0) {
			local306 >>= 0x1;
		}
		if (local9.anInt944 != -1) {
			local306 <<= 0x7;
			if (arg0.anInt5337 == 1) {
				@Pc(440) int local440 = arg0.anInt5340 * arg0.anInt5340;
				@Pc(461) int local461 = (arg0.anInt5769 > local166 ? arg0.anInt5769 - local166 : local166 + -arg0.anInt5769) << 7;
				@Pc(481) int local481 = (arg0.anInt5773 <= local183 ? local183 - arg0.anInt5773 : arg0.anInt5773 - local183) << 7;
				@Pc(488) int local488 = local481 >= local461 ? local481 : local461;
				@Pc(495) int local495 = local488 * 2 * local9.anInt944;
				if (local440 > local495) {
					arg0.anInt5340 /= 2;
				} else if (local488 < local440 / 2) {
					arg0.anInt5340 -= local9.anInt944;
					if (arg0.anInt5340 < 0) {
						arg0.anInt5340 = 0;
					}
				} else if (local306 > arg0.anInt5340) {
					arg0.anInt5340 += local9.anInt944;
					if (local306 < arg0.anInt5340) {
						arg0.anInt5340 = local306;
					}
				}
			} else if (arg0.anInt5340 < local306) {
				arg0.anInt5340 += local9.anInt944;
				if (local306 < arg0.anInt5340) {
					arg0.anInt5340 = local306;
				}
			} else if (arg0.anInt5340 > 0) {
				arg0.anInt5340 -= local9.anInt944;
				if (arg0.anInt5340 < 0) {
					arg0.anInt5340 = 0;
				}
			}
			local306 = arg0.anInt5340 >> 7;
			if (local306 < 1) {
				local306 = 1;
			}
		}
		Static215.anInt4285 = 0;
		if (local166 > local146) {
			Static215.anInt4285 |= 0x4;
			arg0.anInt5769 += local306;
			if (local166 < arg0.anInt5769) {
				arg0.anInt5769 = local166;
			}
		} else if (local146 > local166) {
			arg0.anInt5769 -= local306;
			Static215.anInt4285 |= 0x8;
			if (arg0.anInt5769 < local166) {
				arg0.anInt5769 = local166;
			}
		}
		if (local183 > local149) {
			arg0.anInt5773 += local306;
			Static215.anInt4285 |= 0x1;
			if (arg0.anInt5773 > local183) {
				arg0.anInt5773 = local183;
			}
		} else if (local149 > local183) {
			arg0.anInt5773 -= local306;
			Static215.anInt4285 |= 0x2;
			if (arg0.anInt5773 < local183) {
				arg0.anInt5773 = local183;
			}
		}
		if (arg0.anInt5769 == local166 && arg0.anInt5773 == local183) {
			arg0.anInt5337--;
			if (arg0.anInt5341 > 0) {
				arg0.anInt5341--;
			}
		}
		if (local306 < 8) {
			Static275.anInt5381 = local405;
		} else {
			Static275.anInt5381 = 2;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)I")
	public static int method891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg0 == 4 || arg0 == 5 ? Static81.anIntArray112[arg1 & 0x3] : 256;
	}
}
