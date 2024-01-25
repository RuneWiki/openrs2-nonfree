import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
	public static int anInt2285;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	public static int anInt2278 = 0;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!bs;")
	public static Class1_Sub2 method2112(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class51 local7 = Static196.aClass51ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class11 local14 = local7.aClass11_2; local14 != null; local14 = local14.aClass11_1) {
			@Pc(18) Class1_Sub2 local18 = local14.aClass1_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort89 == arg1 && local18.aShort90 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BZLclient!mr;)V")
	public static void method2120(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub2_Sub3 arg1) {
		@Pc(11) Class142 local11 = arg1.method5778();
		if (arg1.anInt6962 == 0) {
			arg1.anInt6964 = 0;
			Static316.anInt6235 = -1;
			Static118.anInt2491 = 0;
			return;
		}
		if (arg1.anInt6915 != -1 && arg1.anInt6900 == 0) {
			@Pc(40) Class84 local40 = Static91.method1822(arg1.anInt6915);
			if (arg1.anInt6963 > 0 && local40.anInt2443 == 0) {
				arg1.anInt6964++;
				Static316.anInt6235 = -1;
				Static118.anInt2491 = 0;
				return;
			}
			if (arg1.anInt6963 <= 0 && local40.anInt2463 == 0) {
				arg1.anInt6964++;
				Static316.anInt6235 = -1;
				Static118.anInt2491 = 0;
				return;
			}
		}
		if (arg1.anInt6902 != -1 && arg1.anInt6948 <= Static6.anInt91) {
			@Pc(94) Class177 local94 = Static41.method4707(arg1.anInt6902);
			if (local94.aBoolean516 && local94.anInt5808 != -1) {
				@Pc(107) Class84 local107 = Static91.method1822(local94.anInt5808);
				if (arg1.anInt6963 > 0 && local107.anInt2443 == 0) {
					Static316.anInt6235 = -1;
					Static118.anInt2491 = 0;
					arg1.anInt6964++;
					return;
				}
				if (arg1.anInt6963 <= 0 && local107.anInt2463 == 0) {
					arg1.anInt6964++;
					Static118.anInt2491 = 0;
					Static316.anInt6235 = -1;
					return;
				}
			}
		}
		@Pc(150) int local150 = arg1.anInt6893;
		@Pc(153) int local153 = arg1.anInt6888;
		@Pc(171) int local171 = arg1.anIntArray535[arg1.anInt6962 - 1] * 128 + arg1.method5787() * 64;
		@Pc(187) int local187 = arg1.anIntArray534[arg1.anInt6962 - 1] * 128 + arg1.method5787() * 64;
		if (local150 >= local171) {
			if (local150 <= local171) {
				if (local153 < local187) {
					arg1.method5773(8192);
				} else if (local187 < local153) {
					arg1.method5773(0);
				}
			} else if (local153 < local187) {
				arg1.method5773(6144);
			} else if (local153 > local187) {
				arg1.method5773(2048);
			} else {
				arg1.method5773(4096);
			}
		} else if (local187 > local153) {
			arg1.method5773(10240);
		} else if (local187 >= local153) {
			arg1.method5773(12288);
		} else {
			arg1.method5773(14336);
		}
		@Pc(283) byte local283 = arg1.aByteArray93[arg1.anInt6962 - 1];
		if (!arg0 && (local171 - local150 > 256 || local171 - local150 < -256 || local187 - local153 > 256 || local187 - local153 < -256)) {
			arg1.anInt6893 = local171;
			arg1.anInt6888 = local187;
			arg1.method5785(arg1.anInt6927);
			if (arg1.anInt6963 > 0) {
				arg1.anInt6963--;
			}
			arg1.anInt6962--;
			Static316.anInt6235 = -1;
			Static118.anInt2491 = 0;
			return;
		}
		@Pc(349) int local349 = 4;
		@Pc(356) boolean local356 = true;
		if (arg1 instanceof Class1_Sub2_Sub3_Sub2) {
			local356 = ((Class1_Sub2_Sub3_Sub2) arg1).aClass139_1.aBoolean414;
		}
		@Pc(374) int local374;
		if (local356) {
			local374 = arg1.anInt6927 - arg1.aClass219_7.anInt6829;
			if (local374 != 0 && arg1.anInt6916 == -1 && arg1.anInt6919 != 0) {
				local349 = 2;
			}
			if (!arg0 && arg1.anInt6962 > 2) {
				local349 = 6;
			}
			if (!arg0 && arg1.anInt6962 > 3) {
				local349 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt6962 > 1) {
				local349 = 6;
			}
			if (!arg0 && arg1.anInt6962 > 2) {
				local349 = 8;
			}
		}
		if (arg1.anInt6964 > 0 && arg1.anInt6962 > 1) {
			arg1.anInt6964--;
			local349 = 8;
		}
		if (local283 == 2) {
			local349 <<= 0x1;
		} else if (local283 == 0) {
			local349 >>= 0x1;
		}
		if (local11.anInt4899 != -1) {
			local349 <<= 0x7;
			if (arg1.anInt6962 == 1) {
				local374 = arg1.anInt6961 * arg1.anInt6961;
				@Pc(551) int local551 = (arg1.anInt6893 <= local171 ? local171 - arg1.anInt6893 : arg1.anInt6893 - local171) << 7;
				@Pc(572) int local572 = (arg1.anInt6888 <= local187 ? local187 - arg1.anInt6888 : arg1.anInt6888 - local187) << 7;
				@Pc(583) int local583 = local572 < local551 ? local551 : local572;
				@Pc(590) int local590 = local583 * local11.anInt4899 * 2;
				if (local590 < local374) {
					arg1.anInt6961 /= 2;
				} else if (local583 < local374 / 2) {
					arg1.anInt6961 -= local11.anInt4899;
					if (arg1.anInt6961 < 0) {
						arg1.anInt6961 = 0;
					}
				} else if (local349 > arg1.anInt6961) {
					arg1.anInt6961 += local11.anInt4899;
					if (arg1.anInt6961 > local349) {
						arg1.anInt6961 = local349;
					}
				}
			} else if (local349 > arg1.anInt6961) {
				arg1.anInt6961 += local11.anInt4899;
				if (arg1.anInt6961 > local349) {
					arg1.anInt6961 = local349;
				}
			} else if (arg1.anInt6961 > 0) {
				arg1.anInt6961 -= local11.anInt4899;
				if (arg1.anInt6961 < 0) {
					arg1.anInt6961 = 0;
				}
			}
			local349 = arg1.anInt6961 >> 7;
			if (local349 < 1) {
				local349 = 1;
			}
		}
		Static118.anInt2491 = 0;
		if (local171 > local150) {
			Static118.anInt2491 |= 0x4;
			arg1.anInt6893 += local349;
			if (arg1.anInt6893 > local171) {
				arg1.anInt6893 = local171;
			}
		} else if (local150 > local171) {
			Static118.anInt2491 |= 0x8;
			arg1.anInt6893 -= local349;
			if (local171 > arg1.anInt6893) {
				arg1.anInt6893 = local171;
			}
		}
		if (local153 < local187) {
			Static118.anInt2491 |= 0x1;
			arg1.anInt6888 += local349;
			if (arg1.anInt6888 > local187) {
				arg1.anInt6888 = local187;
			}
		} else if (local153 > local187) {
			Static118.anInt2491 |= 0x2;
			arg1.anInt6888 -= local349;
			if (local187 > arg1.anInt6888) {
				arg1.anInt6888 = local187;
			}
		}
		if (arg1.anInt6893 == local171 && local187 == arg1.anInt6888) {
			if (arg1.anInt6963 > 0) {
				arg1.anInt6963--;
			}
			arg1.anInt6962--;
		}
		if (local349 < 8) {
			Static316.anInt6235 = local283;
		} else {
			Static316.anInt6235 = 2;
		}
	}
}
