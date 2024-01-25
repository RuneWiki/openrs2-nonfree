import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
	public static int anInt6317 = 0;

	@OriginalMember(owner = "client!wa", name = "L", descriptor = "I")
	public static int anInt6325 = -1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZLclient!fo;Z)V")
	public static void method5493(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub5_Sub1 arg1) {
		@Pc(9) Class103 local9 = arg1.method5552();
		if (arg1.anInt6456 == 0) {
			arg1.anInt6454 = 0;
			Static38.anInt806 = -1;
			Static209.anInt3826 = 0;
			return;
		}
		if (arg1.anInt6405 != -1 && arg1.anInt6429 == 0) {
			@Pc(40) Class202 local40 = Static36.aClass236_1.method5396(arg1.anInt6405);
			if (arg1.anInt6455 > 0 && local40.anInt4937 == 0) {
				Static209.anInt3826 = 0;
				arg1.anInt6454++;
				Static38.anInt806 = -1;
				return;
			}
			if (arg1.anInt6455 <= 0 && local40.anInt4934 == 0) {
				Static38.anInt806 = -1;
				arg1.anInt6454++;
				Static209.anInt3826 = 0;
				return;
			}
		}
		if (arg1.anInt6420 != -1 && Static253.anInt4469 >= arg1.anInt6395) {
			@Pc(102) Class34 local102 = Static149.aClass173_5.method3800(arg1.anInt6420);
			if (local102.aBoolean65 && local102.anInt863 != -1) {
				@Pc(115) Class202 local115 = Static36.aClass236_1.method5396(local102.anInt863);
				if (arg1.anInt6455 > 0 && local115.anInt4937 == 0) {
					Static38.anInt806 = -1;
					Static209.anInt3826 = 0;
					arg1.anInt6454++;
					return;
				}
				if (arg1.anInt6455 <= 0 && local115.anInt4934 == 0) {
					Static209.anInt3826 = 0;
					arg1.anInt6454++;
					Static38.anInt806 = -1;
					return;
				}
			}
		}
		@Pc(155) int local155 = arg1.anInt6390;
		@Pc(158) int local158 = arg1.anInt6386;
		@Pc(174) int local174 = arg1.anIntArray1324[arg1.anInt6456 - 1] * 128 + arg1.method5547() * 64;
		@Pc(191) int local191 = arg1.anIntArray1323[arg1.anInt6456 - 1] * 128 + arg1.method5547() * 64;
		if (local155 >= local174) {
			if (local155 <= local174) {
				if (local158 < local191) {
					arg1.method5554(8192);
				} else if (local191 < local158) {
					arg1.method5554(0);
				}
			} else if (local191 > local158) {
				arg1.method5554(6144);
			} else if (local191 >= local158) {
				arg1.method5554(4096);
			} else {
				arg1.method5554(2048);
			}
		} else if (local191 > local158) {
			arg1.method5554(10240);
		} else if (local158 <= local191) {
			arg1.method5554(12288);
		} else {
			arg1.method5554(14336);
		}
		@Pc(289) byte local289 = arg1.aByteArray115[arg1.anInt6456 - 1];
		if (!arg0 && (local174 - local155 > 256 || local174 - local155 < -256 || local191 - local158 > 256 || local191 - local158 < -256)) {
			arg1.anInt6390 = local174;
			arg1.anInt6386 = local191;
			arg1.method5542(arg1.anInt6397);
			if (arg1.anInt6455 > 0) {
				arg1.anInt6455--;
			}
			Static209.anInt3826 = 0;
			arg1.anInt6456--;
			Static38.anInt806 = -1;
			return;
		}
		@Pc(354) int local354 = 4;
		@Pc(356) boolean local356 = true;
		if (arg1 instanceof Class1_Sub5_Sub1_Sub2) {
			local356 = ((Class1_Sub5_Sub1_Sub2) arg1).aClass133_1.aBoolean263;
		}
		@Pc(374) int local374;
		if (local356) {
			local374 = arg1.anInt6397 - arg1.aClass247_7.anInt6566;
			if (local374 != 0 && arg1.anInt6410 == -1 && arg1.anInt6435 != 0) {
				local354 = 2;
			}
			if (!arg0 && arg1.anInt6456 > 2) {
				local354 = 6;
			}
			if (!arg0 && arg1.anInt6456 > 3) {
				local354 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt6456 > 1) {
				local354 = 6;
			}
			if (!arg0 && arg1.anInt6456 > 2) {
				local354 = 8;
			}
		}
		if (arg1.anInt6454 > 0 && arg1.anInt6456 > 1) {
			arg1.anInt6454--;
			local354 = 8;
		}
		if (local289 == 2) {
			local354 <<= 0x1;
		} else if (local289 == 0) {
			local354 >>= 0x1;
		}
		if (local9.anInt2818 != -1) {
			local354 <<= 0x7;
			if (arg1.anInt6456 == 1) {
				local374 = arg1.anInt6453 * arg1.anInt6453;
				@Pc(497) int local497 = (local174 >= arg1.anInt6390 ? local174 - arg1.anInt6390 : arg1.anInt6390 + -local174) << 7;
				@Pc(519) int local519 = (arg1.anInt6386 <= local191 ? local191 - arg1.anInt6386 : -local191 + arg1.anInt6386) << 7;
				@Pc(530) int local530 = local497 > local519 ? local497 : local519;
				@Pc(537) int local537 = local530 * local9.anInt2818 * 2;
				if (local374 > local537) {
					arg1.anInt6453 /= 2;
				} else if (local374 / 2 > local530) {
					arg1.anInt6453 -= local9.anInt2818;
					if (arg1.anInt6453 < 0) {
						arg1.anInt6453 = 0;
					}
				} else if (local354 > arg1.anInt6453) {
					arg1.anInt6453 += local9.anInt2818;
					if (local354 < arg1.anInt6453) {
						arg1.anInt6453 = local354;
					}
				}
			} else if (local354 > arg1.anInt6453) {
				arg1.anInt6453 += local9.anInt2818;
				if (arg1.anInt6453 > local354) {
					arg1.anInt6453 = local354;
				}
			} else if (arg1.anInt6453 > 0) {
				arg1.anInt6453 -= local9.anInt2818;
				if (arg1.anInt6453 < 0) {
					arg1.anInt6453 = 0;
				}
			}
			local354 = arg1.anInt6453 >> 7;
			if (local354 < 1) {
				local354 = 1;
			}
		}
		Static209.anInt3826 = 0;
		if (local174 > local155) {
			Static209.anInt3826 |= 0x4;
			arg1.anInt6390 += local354;
			if (local174 < arg1.anInt6390) {
				arg1.anInt6390 = local174;
			}
		} else if (local155 > local174) {
			Static209.anInt3826 |= 0x8;
			arg1.anInt6390 -= local354;
			if (arg1.anInt6390 < local174) {
				arg1.anInt6390 = local174;
			}
		}
		if (local191 > local158) {
			Static209.anInt3826 |= 0x1;
			arg1.anInt6386 += local354;
			if (arg1.anInt6386 > local191) {
				arg1.anInt6386 = local191;
			}
		} else if (local191 < local158) {
			Static209.anInt3826 |= 0x2;
			arg1.anInt6386 -= local354;
			if (local191 > arg1.anInt6386) {
				arg1.anInt6386 = local191;
			}
		}
		if (arg1.anInt6390 == local174 && local191 == arg1.anInt6386) {
			if (arg1.anInt6455 > 0) {
				arg1.anInt6455--;
			}
			arg1.anInt6456--;
		}
		if (local354 >= 8) {
			Static38.anInt806 = 2;
		} else {
			Static38.anInt806 = local289;
		}
	}
}
