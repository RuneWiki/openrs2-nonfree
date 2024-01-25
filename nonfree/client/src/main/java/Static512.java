import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
	public static int anInt8551;

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "Lclient!ag;")
	public static final Class8 aClass8_8 = new Class8(1, 2);

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "I")
	public static int anInt8553 = 0;

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
	public static int anInt8554 = 1;

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZI)I")
	public static int method7194(@OriginalArg(0) boolean arg0) {
		@Pc(9) int local9 = Static491.anInt8078;
		if (local9 == 0) {
			return arg0 ? 0 : Static290.anInt4733;
		} else if (local9 == 1) {
			return Static290.anInt4733;
		} else if (local9 == 2) {
			return 0;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILclient!hg;Z)V")
	public static void method7195(@OriginalArg(1) Class13_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class334 local9 = arg0.method3964();
		if (arg0.anInt4639 == 0) {
			arg0.anInt4640 = 0;
			anInt8551 = -1;
			Static41.anInt827 = 0;
			return;
		}
		if (arg0.anInt4559 != -1 && arg0.anInt4622 == 0) {
			@Pc(37) Class81 local37 = Static540.aClass173_2.method3791(arg0.anInt4559);
			if (arg0.anInt4637 > 0 && local37.anInt2145 == 0) {
				Static41.anInt827 = 0;
				anInt8551 = -1;
				arg0.anInt4640++;
				return;
			}
			if (arg0.anInt4637 <= 0 && local37.anInt2149 == 0) {
				arg0.anInt4640++;
				anInt8551 = -1;
				Static41.anInt827 = 0;
				return;
			}
		}
		@Pc(108) Class81 local108;
		@Pc(94) Class39 local94;
		if (arg0.anInt4556 != -1 && arg0.lb <= Static262.anInt5597) {
			local94 = Static460.aClass155_2.method3363(arg0.anInt4556);
			if (local94.aBoolean74 && local94.anInt1044 != -1) {
				local108 = Static540.aClass173_2.method3791(local94.anInt1044);
				if (arg0.anInt4637 > 0 && local108.anInt2145 == 0) {
					anInt8551 = -1;
					Static41.anInt827 = 0;
					arg0.anInt4640++;
					return;
				}
				if (arg0.anInt4637 <= 0 && local108.anInt2149 == 0) {
					anInt8551 = -1;
					Static41.anInt827 = 0;
					arg0.anInt4640++;
					return;
				}
			}
		}
		if (arg0.anInt4556 != -1 && arg0.lb <= Static262.anInt5597) {
			local94 = Static460.aClass155_2.method3363(arg0.anInt4556);
			if (local94.aBoolean74 && local94.anInt1044 != -1) {
				local108 = Static540.aClass173_2.method3791(local94.anInt1044);
				if (arg0.anInt4637 > 0 && local108.anInt2145 == 0) {
					anInt8551 = -1;
					Static41.anInt827 = 0;
					arg0.anInt4640++;
					return;
				}
				if (arg0.anInt4637 <= 0 && local108.anInt2149 == 0) {
					Static41.anInt827 = 0;
					anInt8551 = -1;
					arg0.anInt4640++;
					return;
				}
			}
		}
		@Pc(218) int local218 = arg0.anInt10090;
		@Pc(221) int local221 = arg0.anInt10089;
		@Pc(238) int local238 = arg0.anIntArray307[arg0.anInt4639 - 1] * 512 + arg0.method3950() * 256;
		@Pc(262) int local262 = arg0.anIntArray306[arg0.anInt4639 - 1] * 512 + arg0.method3950() * 256;
		if (local218 >= local238) {
			if (local238 < local218) {
				if (local262 > local221) {
					arg0.method3956(6144);
				} else if (local262 < local221) {
					arg0.method3956(2048);
				} else {
					arg0.method3956(4096);
				}
			} else if (local262 > local221) {
				arg0.method3956(8192);
			} else if (local221 > local262) {
				arg0.method3956(0);
			}
		} else if (local221 < local262) {
			arg0.method3956(10240);
		} else if (local262 < local221) {
			arg0.method3956(14336);
		} else {
			arg0.method3956(12288);
		}
		@Pc(356) byte local356 = arg0.aByteArray52[arg0.anInt4639 - 1];
		if (!arg1 && (local238 - local218 > 1024 || local238 - local218 < -1024 || local262 - local221 > 1024 || local262 - local221 < -1024)) {
			arg0.anInt10089 = local262;
			arg0.anInt10090 = local238;
			arg0.method3952(arg0.anInt4609, false);
			if (arg0.anInt4637 > 0) {
				arg0.anInt4637--;
			}
			arg0.anInt4639--;
			anInt8551 = -1;
			Static41.anInt827 = 0;
			return;
		}
		@Pc(419) int local419 = 16;
		@Pc(421) boolean local421 = true;
		if (arg0 instanceof Class13_Sub1_Sub1_Sub1_Sub1) {
			local421 = ((Class13_Sub1_Sub1_Sub1_Sub1) arg0).aClass150_1.aBoolean273;
		}
		@Pc(438) int local438;
		if (local421) {
			local438 = arg0.anInt4609 - arg0.aClass116_7.anInt3077;
			if (local438 != 0 && arg0.anInt4580 == -1 && arg0.anInt4563 != 0) {
				local419 = 8;
			}
			if (!arg1 && arg0.anInt4639 > 2) {
				local419 = 24;
			}
			if (!arg1 && arg0.anInt4639 > 3) {
				local419 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt4639 > 1) {
				local419 = 24;
			}
			if (!arg1 && arg0.anInt4639 > 2) {
				local419 = 32;
			}
		}
		if (arg0.anInt4640 > 0 && arg0.anInt4639 > 1) {
			arg0.anInt4640--;
			local419 = 32;
		}
		if (local356 == 2) {
			local419 <<= 0x1;
		} else if (local356 == 0) {
			local419 >>= 0x1;
		}
		if (local9.anInt8944 != -1) {
			local419 <<= 0x9;
			if (arg0.anInt4639 == 1) {
				local438 = arg0.anInt4638 * arg0.anInt4638;
				@Pc(614) int local614 = (local238 < arg0.anInt10090 ? arg0.anInt10090 - local238 : -arg0.anInt10090 + local238) << 9;
				@Pc(635) int local635 = (arg0.anInt10089 <= local262 ? local262 - arg0.anInt10089 : arg0.anInt10089 - local262) << 9;
				@Pc(642) int local642 = local635 >= local614 ? local635 : local614;
				@Pc(649) int local649 = local642 * local9.anInt8944 * 2;
				if (local438 > local649) {
					arg0.anInt4638 /= 2;
				} else if (local438 / 2 > local642) {
					arg0.anInt4638 -= local9.anInt8944;
					if (arg0.anInt4638 < 0) {
						arg0.anInt4638 = 0;
					}
				} else if (arg0.anInt4638 < local419) {
					arg0.anInt4638 += local9.anInt8944;
					if (arg0.anInt4638 > local419) {
						arg0.anInt4638 = local419;
					}
				}
			} else if (local419 > arg0.anInt4638) {
				arg0.anInt4638 += local9.anInt8944;
				if (arg0.anInt4638 > local419) {
					arg0.anInt4638 = local419;
				}
			} else if (arg0.anInt4638 > 0) {
				arg0.anInt4638 -= local9.anInt8944;
				if (arg0.anInt4638 < 0) {
					arg0.anInt4638 = 0;
				}
			}
			local419 = arg0.anInt4638 >> 9;
			if (local419 < 1) {
				local419 = 1;
			}
		}
		Static41.anInt827 = 0;
		if (local238 == local218 && local262 == local221) {
			anInt8551 = -1;
		} else {
			if (local218 < local238) {
				arg0.anInt10090 += local419;
				Static41.anInt827 |= 0x4;
				if (local238 < arg0.anInt10090) {
					arg0.anInt10090 = local238;
				}
			} else if (local238 < local218) {
				arg0.anInt10090 -= local419;
				Static41.anInt827 |= 0x8;
				if (arg0.anInt10090 < local238) {
					arg0.anInt10090 = local238;
				}
			}
			if (local221 < local262) {
				Static41.anInt827 |= 0x1;
				arg0.anInt10089 += local419;
				if (arg0.anInt10089 > local262) {
					arg0.anInt10089 = local262;
				}
			} else if (local221 > local262) {
				arg0.anInt10089 -= local419;
				Static41.anInt827 |= 0x2;
				if (local262 > arg0.anInt10089) {
					arg0.anInt10089 = local262;
				}
			}
			if (local419 >= 32) {
				anInt8551 = 2;
			} else {
				anInt8551 = local356;
			}
		}
		if (arg0.anInt10090 != local238 || local262 != arg0.anInt10089) {
			return;
		}
		arg0.anInt4639--;
		if (arg0.anInt4637 > 0) {
			arg0.anInt4637--;
			return;
		}
	}
}
