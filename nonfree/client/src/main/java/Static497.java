import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static497 {

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
	public static int anInt8601;

	@OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
	public static int anInt8603;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "Lclient!db;")
	public static final Class64 aClass64_426 = new Class64(55, -1);

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public static int anInt8608 = -1;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I")
	public static int method7069() {
		return Static428.anInt7368;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZZLclient!vj;)V")
	public static void method7072(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class10_Sub1_Sub2 arg1) {
		@Pc(9) Class130 local9 = arg1.method7026();
		if (arg1.anInt8537 == 0) {
			Static351.anInt6124 = 0;
			arg1.anInt8538 = 0;
			Static466.anInt7863 = -1;
			return;
		}
		if (arg1.anInt8483 != -1 && arg1.anInt8510 == 0) {
			@Pc(37) Class77 local37 = Static168.aClass327_2.method7326(arg1.anInt8483);
			if (arg1.anInt8536 > 0 && local37.anInt2587 == 0) {
				Static466.anInt7863 = -1;
				Static351.anInt6124 = 0;
				arg1.anInt8538++;
				return;
			}
			if (arg1.anInt8536 <= 0 && local37.anInt2581 == 0) {
				Static351.anInt6124 = 0;
				arg1.anInt8538++;
				Static466.anInt7863 = -1;
				return;
			}
		}
		@Pc(111) Class77 local111;
		@Pc(98) Class318 local98;
		if (arg1.anInt8504 != -1 && Static237.anInt7561 >= arg1.anInt8514) {
			local98 = Static206.aClass275_1.method6050(arg1.anInt8504);
			if (local98.aBoolean610 && local98.anInt8788 != -1) {
				local111 = Static168.aClass327_2.method7326(local98.anInt8788);
				if (arg1.anInt8536 > 0 && local111.anInt2587 == 0) {
					Static466.anInt7863 = -1;
					arg1.anInt8538++;
					Static351.anInt6124 = 0;
					return;
				}
				if (arg1.anInt8536 <= 0 && local111.anInt2581 == 0) {
					Static466.anInt7863 = -1;
					arg1.anInt8538++;
					Static351.anInt6124 = 0;
					return;
				}
			}
		}
		if (arg1.anInt8504 != -1 && arg1.anInt8514 <= Static237.anInt7561) {
			local98 = Static206.aClass275_1.method6050(arg1.anInt8504);
			if (local98.aBoolean610 && local98.anInt8788 != -1) {
				local111 = Static168.aClass327_2.method7326(local98.anInt8788);
				if (arg1.anInt8536 > 0 && local111.anInt2587 == 0) {
					Static351.anInt6124 = 0;
					Static466.anInt7863 = -1;
					arg1.anInt8538++;
					return;
				}
				if (arg1.anInt8536 <= 0 && local111.anInt2581 == 0) {
					Static466.anInt7863 = -1;
					arg1.anInt8538++;
					Static351.anInt6124 = 0;
					return;
				}
			}
		}
		@Pc(220) int local220 = arg1.anInt8934;
		@Pc(223) int local223 = arg1.anInt8929;
		@Pc(240) int local240 = arg1.anIntArray653[arg1.anInt8537 - 1] * 512 + arg1.method7021() * 256;
		@Pc(257) int local257 = arg1.anIntArray654[arg1.anInt8537 - 1] * 512 + arg1.method7021() * 256;
		if (local220 >= local240) {
			if (local220 <= local240) {
				if (local257 > local223) {
					arg1.method7034(8192);
				} else if (local223 > local257) {
					arg1.method7034(0);
				}
			} else if (local223 < local257) {
				arg1.method7034(6144);
			} else if (local257 >= local223) {
				arg1.method7034(4096);
			} else {
				arg1.method7034(2048);
			}
		} else if (local223 < local257) {
			arg1.method7034(10240);
		} else if (local257 >= local223) {
			arg1.method7034(12288);
		} else {
			arg1.method7034(14336);
		}
		@Pc(359) byte local359 = arg1.aByteArray107[arg1.anInt8537 - 1];
		if (!arg0 && (local240 - local220 > 1024 || local240 - local220 < -1024 || local257 - local223 > 1024 || local257 - local223 < -1024)) {
			arg1.anInt8934 = local240;
			arg1.anInt8929 = local257;
			arg1.method7033(arg1.lb, false);
			arg1.anInt8537--;
			Static351.anInt6124 = 0;
			if (arg1.anInt8536 > 0) {
				arg1.anInt8536--;
			}
			Static466.anInt7863 = -1;
			return;
		}
		@Pc(425) int local425 = 16;
		@Pc(427) boolean local427 = true;
		if (arg1 instanceof Class10_Sub1_Sub2_Sub1) {
			local427 = ((Class10_Sub1_Sub2_Sub1) arg1).aClass54_1.aBoolean101;
		}
		@Pc(463) int local463;
		if (local427) {
			local463 = arg1.lb - arg1.aClass155_7.anInt4352;
			if (local463 != 0 && arg1.anInt8465 == -1 && arg1.anInt8513 != 0) {
				local425 = 8;
			}
			if (!arg0 && arg1.anInt8537 > 2) {
				local425 = 24;
			}
			if (!arg0 && arg1.anInt8537 > 3) {
				local425 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt8537 > 1) {
				local425 = 24;
			}
			if (!arg0 && arg1.anInt8537 > 2) {
				local425 = 32;
			}
		}
		if (arg1.anInt8538 > 0 && arg1.anInt8537 > 1) {
			local425 = 32;
			arg1.anInt8538--;
		}
		if (local359 == 2) {
			local425 <<= 0x1;
		} else if (local359 == 0) {
			local425 >>= 0x1;
		}
		if (local9.anInt3809 != -1) {
			local425 <<= 0x9;
			if (arg1.anInt8537 == 1) {
				local463 = arg1.anInt8539 * arg1.anInt8539;
				@Pc(565) int local565 = (local240 >= arg1.anInt8934 ? local240 - arg1.anInt8934 : -local240 + arg1.anInt8934) << 9;
				@Pc(583) int local583 = (local257 < arg1.anInt8929 ? arg1.anInt8929 - local257 : local257 + -arg1.anInt8929) << 9;
				@Pc(590) int local590 = local583 >= local565 ? local583 : local565;
				@Pc(597) int local597 = local590 * local9.anInt3809 * 2;
				if (local463 > local597) {
					arg1.anInt8539 /= 2;
				} else if (local463 / 2 > local590) {
					arg1.anInt8539 -= local9.anInt3809;
					if (arg1.anInt8539 < 0) {
						arg1.anInt8539 = 0;
					}
				} else if (arg1.anInt8539 < local425) {
					arg1.anInt8539 += local9.anInt3809;
					if (local425 < arg1.anInt8539) {
						arg1.anInt8539 = local425;
					}
				}
			} else if (local425 > arg1.anInt8539) {
				arg1.anInt8539 += local9.anInt3809;
				if (arg1.anInt8539 > local425) {
					arg1.anInt8539 = local425;
				}
			} else if (arg1.anInt8539 > 0) {
				arg1.anInt8539 -= local9.anInt3809;
				if (arg1.anInt8539 < 0) {
					arg1.anInt8539 = 0;
				}
			}
			local425 = arg1.anInt8539 >> 9;
			if (local425 < 1) {
				local425 = 1;
			}
		}
		Static351.anInt6124 = 0;
		if (local220 == local240 && local223 == local257) {
			Static466.anInt7863 = -1;
		} else {
			if (local240 > local220) {
				arg1.anInt8934 += local425;
				Static351.anInt6124 |= 0x4;
				if (arg1.anInt8934 > local240) {
					arg1.anInt8934 = local240;
				}
			} else if (local220 > local240) {
				Static351.anInt6124 |= 0x8;
				arg1.anInt8934 -= local425;
				if (arg1.anInt8934 < local240) {
					arg1.anInt8934 = local240;
				}
			}
			if (local223 < local257) {
				Static351.anInt6124 |= 0x1;
				arg1.anInt8929 += local425;
				if (arg1.anInt8929 > local257) {
					arg1.anInt8929 = local257;
				}
			} else if (local223 > local257) {
				arg1.anInt8929 -= local425;
				Static351.anInt6124 |= 0x2;
				if (local257 > arg1.anInt8929) {
					arg1.anInt8929 = local257;
				}
			}
			if (local425 < 32) {
				Static466.anInt7863 = local359;
			} else {
				Static466.anInt7863 = 2;
			}
		}
		if (local240 == arg1.anInt8934 && local257 == arg1.anInt8929) {
			if (arg1.anInt8536 > 0) {
				arg1.anInt8536--;
			}
			arg1.anInt8537--;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[I[J)V")
	public static void method7074(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static337.method5029(arg1, arg1.length - 1, 0, arg0);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZBLclient!no;[I)Lclient!mn;")
	public static Class114_Sub1_Sub1 method7075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) Class66_Sub3 arg2, @OriginalArg(5) int[] arg3) {
		if (arg2.aBoolean477 || Static422.method6062(arg1) && Static422.method6062(arg0)) {
			return new Class114_Sub1_Sub1(arg2, 3553, arg1, arg0, false, arg3);
		} else if (arg2.aBoolean489) {
			return new Class114_Sub1_Sub1(arg2, 34037, arg1, arg0, false, arg3);
		} else {
			return new Class114_Sub1_Sub1(arg2, arg1, arg0, Static514.method7261(arg1), Static514.method7261(arg0), arg3);
		}
	}
}
