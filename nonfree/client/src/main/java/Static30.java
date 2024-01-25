import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_16 = new Class381(32, 3);

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public static int anInt445 = 0;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_14 = new Class156(108, -1);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)I")
	public static int method503(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10;
		if (arg0 < arg1) {
			local10 = arg0;
			arg0 = arg1;
			arg1 = local10;
		}
		while (arg1 != 0) {
			local10 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local10;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)I")
	public static int method504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if ((Static172.aByteArrayArrayArray23[arg0][arg2][arg1] & 0x8) == 0) {
			return arg0 <= 0 || (Static172.aByteArrayArrayArray23[1][arg2][arg1] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLclient!oi;B)V")
	public static void method505(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub1_Sub1_Sub2 arg1) {
		@Pc(9) Class92 local9 = arg1.method5930();
		if (arg1.anInt6895 == 0) {
			Static479.anInt7782 = -1;
			Static268.anInt4796 = 0;
			arg1.anInt6896 = 0;
			return;
		}
		if (arg1.anInt6872 != -1 && arg1.anInt6886 == 0) {
			@Pc(40) Class264 local40 = Static315.aClass14_1.method227(arg1.anInt6872);
			if (arg1.anInt6897 > 0 && local40.anInt7041 == 0) {
				arg1.anInt6896++;
				Static268.anInt4796 = 0;
				Static479.anInt7782 = -1;
				return;
			}
			if (arg1.anInt6897 <= 0 && local40.anInt7035 == 0) {
				Static268.anInt4796 = 0;
				Static479.anInt7782 = -1;
				arg1.anInt6896++;
				return;
			}
		}
		for (@Pc(88) int local88 = 0; local88 < arg1.aClass337Array3.length; local88++) {
			if (arg1.aClass337Array3[local88].anInt8754 != -1 && arg1.aClass337Array3[local88].anInt8756 <= Static565.anInt8921) {
				@Pc(117) Class295 local117 = Static463.aClass352_1.method8006(arg1.aClass337Array3[local88].anInt8754);
				if (local117.aBoolean514 && local117.anInt7610 != -1) {
					@Pc(132) Class264 local132 = Static315.aClass14_1.method227(local117.anInt7610);
					if (arg1.anInt6897 > 0 && local132.anInt7041 == 0) {
						arg1.anInt6896++;
						Static268.anInt4796 = 0;
						Static479.anInt7782 = -1;
						return;
					}
					if (arg1.anInt6897 <= 0 && local132.anInt7035 == 0) {
						arg1.anInt6896++;
						Static268.anInt4796 = 0;
						Static479.anInt7782 = -1;
						return;
					}
				}
			}
		}
		@Pc(184) int local184 = arg1.anInt9805;
		@Pc(187) int local187 = arg1.anInt9803;
		@Pc(203) int local203 = arg1.anIntArray405[arg1.anInt6895 - 1] * 512 + arg1.method5932() * 256;
		@Pc(220) int local220 = arg1.anIntArray404[arg1.anInt6895 - 1] * 512 + arg1.method5932() * 256;
		if (local184 < local203) {
			if (local220 > local187) {
				arg1.method5928(10240);
			} else if (local187 > local220) {
				arg1.method5928(14336);
			} else {
				arg1.method5928(12288);
			}
		} else if (local203 >= local184) {
			if (local187 < local220) {
				arg1.method5928(8192);
			} else if (local220 < local187) {
				arg1.method5928(0);
			}
		} else if (local187 < local220) {
			arg1.method5928(6144);
		} else if (local220 < local187) {
			arg1.method5928(2048);
		} else {
			arg1.method5928(4096);
		}
		@Pc(346) byte local346 = arg1.aByteArray76[arg1.anInt6895 - 1];
		if (!arg0 && (local203 - local184 > 1024 || local203 - local184 < -1024 || local220 - local187 > 1024 || local220 - local187 < -1024)) {
			arg1.anInt9805 = local203;
			arg1.anInt9803 = local220;
			arg1.method5936(false, arg1.anInt6870);
			Static479.anInt7782 = -1;
			if (arg1.anInt6897 > 0) {
				arg1.anInt6897--;
			}
			arg1.anInt6895--;
			Static268.anInt4796 = 0;
			return;
		}
		@Pc(425) int local425 = 16;
		@Pc(427) boolean local427 = true;
		if (arg1 instanceof Class4_Sub1_Sub1_Sub2_Sub2) {
			local427 = ((Class4_Sub1_Sub1_Sub2_Sub2) arg1).aClass105_1.aBoolean212;
		}
		@Pc(469) int local469;
		if (local427) {
			local469 = arg1.anInt6870 - arg1.aClass49_7.anInt965;
			if (local469 != 0 && arg1.anInt6863 == -1 && arg1.anInt6855 != 0) {
				local425 = 8;
			}
			if (!arg0 && arg1.anInt6895 > 2) {
				local425 = 24;
			}
			if (!arg0 && arg1.anInt6895 > 3) {
				local425 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt6895 > 1) {
				local425 = 24;
			}
			if (!arg0 && arg1.anInt6895 > 2) {
				local425 = 32;
			}
		}
		if (arg1.anInt6896 > 0 && arg1.anInt6895 > 1) {
			local425 = 32;
			arg1.anInt6896--;
		}
		if (local346 == 2) {
			local425 <<= 0x1;
		} else if (local346 == 0) {
			local425 >>= 0x1;
		}
		if (local9.anInt1907 != -1) {
			local425 <<= 0x9;
			if (arg1.anInt6895 == 1) {
				local469 = arg1.anInt6894 * arg1.anInt6894;
				@Pc(668) int local668 = (arg1.anInt9805 <= local203 ? local203 - arg1.anInt9805 : arg1.anInt9805 - local203) << 9;
				@Pc(686) int local686 = (local220 >= arg1.anInt9803 ? local220 - arg1.anInt9803 : arg1.anInt9803 + -local220) << 9;
				@Pc(694) int local694 = local668 <= local686 ? local686 : local668;
				@Pc(701) int local701 = local694 * local9.anInt1907 * 2;
				if (local701 < local469) {
					arg1.anInt6894 /= 2;
				} else if (local694 < local469 / 2) {
					arg1.anInt6894 -= local9.anInt1907;
					if (arg1.anInt6894 < 0) {
						arg1.anInt6894 = 0;
					}
				} else if (local425 > arg1.anInt6894) {
					arg1.anInt6894 += local9.anInt1907;
					if (arg1.anInt6894 > local425) {
						arg1.anInt6894 = local425;
					}
				}
			} else if (local425 > arg1.anInt6894) {
				arg1.anInt6894 += local9.anInt1907;
				if (local425 < arg1.anInt6894) {
					arg1.anInt6894 = local425;
				}
			} else if (arg1.anInt6894 > 0) {
				arg1.anInt6894 -= local9.anInt1907;
				if (arg1.anInt6894 < 0) {
					arg1.anInt6894 = 0;
				}
			}
			local425 = arg1.anInt6894 >> 9;
			if (local425 < 1) {
				local425 = 1;
			}
		}
		Static268.anInt4796 = 0;
		if (local203 == local184 && local187 == local220) {
			Static479.anInt7782 = -1;
		} else {
			if (local203 > local184) {
				arg1.anInt9805 += local425;
				Static268.anInt4796 |= 0x4;
				if (arg1.anInt9805 > local203) {
					arg1.anInt9805 = local203;
				}
			} else if (local203 < local184) {
				arg1.anInt9805 -= local425;
				Static268.anInt4796 |= 0x8;
				if (arg1.anInt9805 < local203) {
					arg1.anInt9805 = local203;
				}
			}
			if (local187 < local220) {
				arg1.anInt9803 += local425;
				Static268.anInt4796 |= 0x1;
				if (arg1.anInt9803 > local220) {
					arg1.anInt9803 = local220;
				}
			} else if (local220 < local187) {
				Static268.anInt4796 |= 0x2;
				arg1.anInt9803 -= local425;
				if (local220 > arg1.anInt9803) {
					arg1.anInt9803 = local220;
				}
			}
			if (local425 >= 32) {
				Static479.anInt7782 = 2;
			} else {
				Static479.anInt7782 = local346;
			}
		}
		if (local203 != arg1.anInt9805 || local220 != arg1.anInt9803) {
			return;
		}
		arg1.anInt6895--;
		if (arg1.anInt6897 > 0) {
			arg1.anInt6897--;
			return;
		}
	}
}
