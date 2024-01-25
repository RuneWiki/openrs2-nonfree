import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
	public static int anInt9786;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
	public static int anInt9787 = 0;

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
	public static final int anInt9791 = 0;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I[IIIB)V")
	public static void method7990(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		arg2--;
		@Pc(15) int local15 = arg3 - 1;
		@Pc(19) int local19 = local15 - 7;
		while (local19 > arg2) {
			@Pc(23) int local23 = arg2 + 1;
			arg1[local23] = arg0;
			@Pc(28) int local28 = local23 + 1;
			arg1[local28] = arg0;
			@Pc(33) int local33 = local28 + 1;
			arg1[local33] = arg0;
			@Pc(38) int local38 = local33 + 1;
			arg1[local38] = arg0;
			@Pc(43) int local43 = local38 + 1;
			arg1[local43] = arg0;
			@Pc(48) int local48 = local43 + 1;
			arg1[local48] = arg0;
			@Pc(53) int local53 = local48 + 1;
			arg1[local53] = arg0;
			arg2 = local53 + 1;
			arg1[arg2] = arg0;
		}
		while (arg2 < local15) {
			arg2++;
			arg1[arg2] = arg0;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(BZLclient!oi;)V")
	public static void method7991(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class9_Sub4_Sub2_Sub1 arg1) {
		@Pc(9) Class303 local9 = arg1.method3625();
		if (arg1.anInt4359 == 0) {
			Static511.anInt8817 = -1;
			Static623.anInt10492 = 0;
			arg1.anInt4358 = 0;
			return;
		}
		if (arg1.anInt4341 != -1 && arg1.anInt4326 == 0) {
			@Pc(33) Class113 local33 = Static528.aClass198_2.method5706(arg1.anInt4341);
			if (arg1.anInt4361 > 0 && local33.anInt3851 == 0) {
				arg1.anInt4358++;
				Static511.anInt8817 = -1;
				Static623.anInt10492 = 0;
				return;
			}
			if (arg1.anInt4361 <= 0 && local33.anInt3847 == 0) {
				Static623.anInt10492 = 0;
				arg1.anInt4358++;
				Static511.anInt8817 = -1;
				return;
			}
		}
		if (arg1.anInt4306 != -1 && arg1.anInt4317 <= Static384.anInt7234) {
			@Pc(90) Class124 local90 = Static360.aClass312_2.method7492(arg1.anInt4306);
			if (local90.aBoolean336 && local90.anInt4155 != -1) {
				@Pc(103) Class113 local103 = Static528.aClass198_2.method5706(local90.anInt4155);
				if (arg1.anInt4361 > 0 && local103.anInt3851 == 0) {
					arg1.anInt4358++;
					Static623.anInt10492 = 0;
					Static511.anInt8817 = -1;
					return;
				}
				if (arg1.anInt4361 <= 0 && local103.anInt3847 == 0) {
					arg1.anInt4358++;
					Static511.anInt8817 = -1;
					Static623.anInt10492 = 0;
					return;
				}
			}
		}
		if (arg1.anInt4306 != -1 && Static384.anInt7234 >= arg1.anInt4317) {
			@Pc(163) Class124 local163 = Static360.aClass312_2.method7492(arg1.anInt4306);
			if (local163.aBoolean336 && local163.anInt4155 != -1) {
				@Pc(176) Class113 local176 = Static528.aClass198_2.method5706(local163.anInt4155);
				if (arg1.anInt4361 > 0 && local176.anInt3851 == 0) {
					Static623.anInt10492 = 0;
					arg1.anInt4358++;
					Static511.anInt8817 = -1;
					return;
				}
				if (arg1.anInt4361 <= 0 && local176.anInt3847 == 0) {
					arg1.anInt4358++;
					Static511.anInt8817 = -1;
					Static623.anInt10492 = 0;
					return;
				}
			}
		}
		@Pc(219) int local219 = arg1.anInt10360;
		@Pc(222) int local222 = arg1.anInt10357;
		@Pc(238) int local238 = arg1.anIntArray197[arg1.anInt4359 - 1] * 512 + arg1.method3620() * 256;
		@Pc(255) int local255 = arg1.anIntArray198[arg1.anInt4359 - 1] * 512 + arg1.method3620() * 256;
		if (local219 < local238) {
			if (local222 < local255) {
				arg1.method3628(10240);
			} else if (local222 > local255) {
				arg1.method3628(14336);
			} else {
				arg1.method3628(12288);
			}
		} else if (local238 < local219) {
			if (local222 < local255) {
				arg1.method3628(6144);
			} else if (local222 <= local255) {
				arg1.method3628(4096);
			} else {
				arg1.method3628(2048);
			}
		} else if (local255 > local222) {
			arg1.method3628(8192);
		} else if (local222 > local255) {
			arg1.method3628(0);
		}
		@Pc(345) byte local345 = arg1.aByteArray31[arg1.anInt4359 - 1];
		if (!arg0 && (local238 - local219 > 1024 || local238 - local219 < -1024 || local255 - local222 > 1024 || local255 - local222 < -1024)) {
			arg1.anInt10360 = local238;
			arg1.anInt10357 = local255;
			arg1.method3633(arg1.anInt4343, false);
			Static511.anInt8817 = -1;
			if (arg1.anInt4361 > 0) {
				arg1.anInt4361--;
			}
			arg1.anInt4359--;
			Static623.anInt10492 = 0;
			return;
		}
		@Pc(409) int local409 = 16;
		@Pc(411) boolean local411 = true;
		if (arg1 instanceof Class9_Sub4_Sub2_Sub1_Sub1) {
			local411 = ((Class9_Sub4_Sub2_Sub1_Sub1) arg1).aClass158_1.aBoolean454;
		}
		@Pc(449) int local449;
		if (local411) {
			local449 = arg1.anInt4343 - arg1.aClass332_7.anInt9691;
			if (local449 != 0 && arg1.anInt4293 == -1 && arg1.anInt4342 != 0) {
				local409 = 8;
			}
			if (!arg0 && arg1.anInt4359 > 2) {
				local409 = 24;
			}
			if (!arg0 && arg1.anInt4359 > 3) {
				local409 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt4359 > 1) {
				local409 = 24;
			}
			if (!arg0 && arg1.anInt4359 > 2) {
				local409 = 32;
			}
		}
		if (arg1.anInt4358 > 0 && arg1.anInt4359 > 1) {
			local409 = 32;
			arg1.anInt4358--;
		}
		if (local345 == 2) {
			local409 <<= 0x1;
		} else if (local345 == 0) {
			local409 >>= 0x1;
		}
		if (local9.anInt8980 != -1) {
			local409 <<= 0x9;
			if (arg1.anInt4359 == 1) {
				local449 = arg1.anInt4360 * arg1.anInt4360;
				@Pc(563) int local563 = (arg1.anInt10360 <= local238 ? local238 - arg1.anInt10360 : arg1.anInt10360 - local238) << 9;
				@Pc(581) int local581 = (local255 < arg1.anInt10357 ? arg1.anInt10357 - local255 : local255 + -arg1.anInt10357) << 9;
				@Pc(592) int local592 = local563 > local581 ? local563 : local581;
				@Pc(599) int local599 = local9.anInt8980 * 2 * local592;
				if (local599 < local449) {
					arg1.anInt4360 /= 2;
				} else if (local449 / 2 > local592) {
					arg1.anInt4360 -= local9.anInt8980;
					if (arg1.anInt4360 < 0) {
						arg1.anInt4360 = 0;
					}
				} else if (arg1.anInt4360 < local409) {
					arg1.anInt4360 += local9.anInt8980;
					if (local409 < arg1.anInt4360) {
						arg1.anInt4360 = local409;
					}
				}
			} else if (arg1.anInt4360 < local409) {
				arg1.anInt4360 += local9.anInt8980;
				if (arg1.anInt4360 > local409) {
					arg1.anInt4360 = local409;
				}
			} else if (arg1.anInt4360 > 0) {
				arg1.anInt4360 -= local9.anInt8980;
				if (arg1.anInt4360 < 0) {
					arg1.anInt4360 = 0;
				}
			}
			local409 = arg1.anInt4360 >> 9;
			if (local409 < 1) {
				local409 = 1;
			}
		}
		Static623.anInt10492 = 0;
		if (local238 == local219 && local255 == local222) {
			Static511.anInt8817 = -1;
		} else {
			if (local238 > local219) {
				arg1.anInt10360 += local409;
				Static623.anInt10492 |= 0x4;
				if (local238 < arg1.anInt10360) {
					arg1.anInt10360 = local238;
				}
			} else if (local238 < local219) {
				Static623.anInt10492 |= 0x8;
				arg1.anInt10360 -= local409;
				if (arg1.anInt10360 < local238) {
					arg1.anInt10360 = local238;
				}
			}
			if (local409 < 32) {
				Static511.anInt8817 = local345;
			} else {
				Static511.anInt8817 = 2;
			}
			if (local222 < local255) {
				Static623.anInt10492 |= 0x1;
				arg1.anInt10357 += local409;
				if (local255 < arg1.anInt10357) {
					arg1.anInt10357 = local255;
				}
			} else if (local255 < local222) {
				Static623.anInt10492 |= 0x2;
				arg1.anInt10357 -= local409;
				if (arg1.anInt10357 < local255) {
					arg1.anInt10357 = local255;
				}
			}
		}
		if (local238 == arg1.anInt10360 && arg1.anInt10357 == local255) {
			if (arg1.anInt4361 > 0) {
				arg1.anInt4361--;
			}
			arg1.anInt4359--;
		}
	}
}
