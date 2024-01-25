import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!uc", name = "L", descriptor = "F")
	public static float aFloat72;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_139 = new Class119(20, 0);

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
	public static int anInt6631 = 0;

	@OriginalMember(owner = "client!uc", name = "O", descriptor = "[[I")
	public static final int[][] anIntArrayArray47 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
	public static int anInt6641 = 0;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!ob;IZ)V")
	public static void method5178(@OriginalArg(0) Class7_Sub2_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class1 local9 = arg0.method3514();
		if (arg0.anInt4404 == 0) {
			Static112.anInt2457 = -1;
			Static159.anInt3197 = 0;
			arg0.anInt4405 = 0;
			return;
		}
		if (arg0.anInt4366 != -1 && arg0.anInt4387 == 0) {
			@Pc(38) Class128 local38 = Static301.aClass170_3.method3936(arg0.anInt4366);
			if (arg0.anInt4403 > 0 && local38.anInt3980 == 0) {
				arg0.anInt4405++;
				Static159.anInt3197 = 0;
				Static112.anInt2457 = -1;
				return;
			}
			if (arg0.anInt4403 <= 0 && local38.anInt3975 == 0) {
				Static112.anInt2457 = -1;
				arg0.anInt4405++;
				Static159.anInt3197 = 0;
				return;
			}
		}
		@Pc(110) Class128 local110;
		@Pc(97) Class13 local97;
		if (arg0.anInt4345 != -1 && arg0.anInt4400 <= Static253.anInt4787) {
			local97 = Static96.aClass41_2.method1134(arg0.anInt4345);
			if (local97.aBoolean32 && local97.anInt466 != -1) {
				local110 = Static301.aClass170_3.method3936(local97.anInt466);
				if (arg0.anInt4403 > 0 && local110.anInt3980 == 0) {
					arg0.anInt4405++;
					Static159.anInt3197 = 0;
					Static112.anInt2457 = -1;
					return;
				}
				if (arg0.anInt4403 <= 0 && local110.anInt3975 == 0) {
					Static159.anInt3197 = 0;
					Static112.anInt2457 = -1;
					arg0.anInt4405++;
					return;
				}
			}
		}
		if (arg0.anInt4345 != -1 && arg0.anInt4400 <= Static253.anInt4787) {
			local97 = Static96.aClass41_2.method1134(arg0.anInt4345);
			if (local97.aBoolean32 && local97.anInt466 != -1) {
				local110 = Static301.aClass170_3.method3936(local97.anInt466);
				if (arg0.anInt4403 > 0 && local110.anInt3980 == 0) {
					Static159.anInt3197 = 0;
					arg0.anInt4405++;
					Static112.anInt2457 = -1;
					return;
				}
				if (arg0.anInt4403 <= 0 && local110.anInt3975 == 0) {
					Static159.anInt3197 = 0;
					Static112.anInt2457 = -1;
					arg0.anInt4405++;
					return;
				}
			}
		}
		@Pc(224) int local224 = arg0.anInt4318;
		@Pc(227) int local227 = arg0.anInt4321;
		@Pc(245) int local245 = arg0.anIntArray287[arg0.anInt4404 - 1] * 128 + arg0.method3499() * 64;
		@Pc(261) int local261 = arg0.anIntArray288[arg0.anInt4404 - 1] * 128 + arg0.method3499() * 64;
		if (local224 < local245) {
			if (local261 > local227) {
				arg0.method3506(10240);
			} else if (local227 <= local261) {
				arg0.method3506(12288);
			} else {
				arg0.method3506(14336);
			}
		} else if (local245 < local224) {
			if (local227 < local261) {
				arg0.method3506(6144);
			} else if (local227 > local261) {
				arg0.method3506(2048);
			} else {
				arg0.method3506(4096);
			}
		} else if (local261 > local227) {
			arg0.method3506(8192);
		} else if (local227 > local261) {
			arg0.method3506(0);
		}
		@Pc(363) byte local363 = arg0.aByteArray52[arg0.anInt4404 - 1];
		if (!arg1 && (local245 - local224 > 256 || local245 - local224 < -256 || local261 - local227 > 256 || local261 - local227 < -256)) {
			arg0.anInt4321 = local261;
			arg0.anInt4318 = local245;
			arg0.method3503(arg0.anInt4396);
			Static159.anInt3197 = 0;
			if (arg0.anInt4403 > 0) {
				arg0.anInt4403--;
			}
			arg0.anInt4404--;
			Static112.anInt2457 = -1;
			return;
		}
		@Pc(431) int local431 = 4;
		@Pc(433) boolean local433 = true;
		if (arg0 instanceof Class7_Sub2_Sub3_Sub1) {
			local433 = ((Class7_Sub2_Sub3_Sub1) arg0).aClass47_1.lb;
		}
		@Pc(469) int local469;
		if (local433) {
			local469 = arg0.anInt4396 - arg0.aClass91_7.anInt2732;
			if (local469 != 0 && arg0.anInt4332 == -1 && arg0.anInt4363 != 0) {
				local431 = 2;
			}
			if (!arg1 && arg0.anInt4404 > 2) {
				local431 = 6;
			}
			if (!arg1 && arg0.anInt4404 > 3) {
				local431 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4404 > 1) {
				local431 = 6;
			}
			if (!arg1 && arg0.anInt4404 > 2) {
				local431 = 8;
			}
		}
		if (arg0.anInt4405 > 0 && arg0.anInt4404 > 1) {
			arg0.anInt4405--;
			local431 = 8;
		}
		if (local363 == 2) {
			local431 <<= 0x1;
		} else if (local363 == 0) {
			local431 >>= 0x1;
		}
		if (local9.anInt22 != -1) {
			local431 <<= 0x7;
			if (arg0.anInt4404 == 1) {
				local469 = arg0.anInt4402 * arg0.anInt4402;
				@Pc(619) int local619 = (local245 < arg0.anInt4318 ? arg0.anInt4318 - local245 : -arg0.anInt4318 + local245) << 7;
				@Pc(636) int local636 = (local261 < arg0.anInt4321 ? arg0.anInt4321 - local261 : -arg0.anInt4321 + local261) << 7;
				@Pc(643) int local643 = local619 <= local636 ? local636 : local619;
				@Pc(650) int local650 = local9.anInt22 * 2 * local643;
				if (local650 < local469) {
					arg0.anInt4402 /= 2;
				} else if (local643 < local469 / 2) {
					arg0.anInt4402 -= local9.anInt22;
					if (arg0.anInt4402 < 0) {
						arg0.anInt4402 = 0;
					}
				} else if (arg0.anInt4402 < local431) {
					arg0.anInt4402 += local9.anInt22;
					if (local431 < arg0.anInt4402) {
						arg0.anInt4402 = local431;
					}
				}
			} else if (local431 > arg0.anInt4402) {
				arg0.anInt4402 += local9.anInt22;
				if (local431 < arg0.anInt4402) {
					arg0.anInt4402 = local431;
				}
			} else if (arg0.anInt4402 > 0) {
				arg0.anInt4402 -= local9.anInt22;
				if (arg0.anInt4402 < 0) {
					arg0.anInt4402 = 0;
				}
			}
			local431 = arg0.anInt4402 >> 7;
			if (local431 < 1) {
				local431 = 1;
			}
		}
		Static159.anInt3197 = 0;
		if (local224 < local245) {
			Static159.anInt3197 |= 0x4;
			arg0.anInt4318 += local431;
			if (arg0.anInt4318 > local245) {
				arg0.anInt4318 = local245;
			}
		} else if (local245 < local224) {
			arg0.anInt4318 -= local431;
			Static159.anInt3197 |= 0x8;
			if (arg0.anInt4318 < local245) {
				arg0.anInt4318 = local245;
			}
		}
		if (local227 < local261) {
			arg0.anInt4321 += local431;
			Static159.anInt3197 |= 0x1;
			if (arg0.anInt4321 > local261) {
				arg0.anInt4321 = local261;
			}
		} else if (local227 > local261) {
			arg0.anInt4321 -= local431;
			Static159.anInt3197 |= 0x2;
			if (local261 > arg0.anInt4321) {
				arg0.anInt4321 = local261;
			}
		}
		if (arg0.anInt4318 == local245 && local261 == arg0.anInt4321) {
			arg0.anInt4404--;
			if (arg0.anInt4403 > 0) {
				arg0.anInt4403--;
			}
		}
		if (local431 < 8) {
			Static112.anInt2457 = local363;
		} else {
			Static112.anInt2457 = 2;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZILclient!mq;B)V")
	public static void method5187(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class156 arg3) {
		@Pc(6) int local6 = arg3.anInt4853;
		@Pc(9) int local9 = arg3.anInt4823;
		if (arg3.aByte88 == 0) {
			arg3.anInt4853 = arg3.anInt4830;
		} else if (arg3.aByte88 == 1) {
			arg3.anInt4853 = arg2 - arg3.anInt4830;
		} else if (arg3.aByte88 == 2) {
			arg3.anInt4853 = arg2 * arg3.anInt4830 >> 14;
		}
		if (arg3.aByte87 == 0) {
			arg3.anInt4823 = arg3.anInt4804;
		} else if (arg3.aByte87 == 1) {
			arg3.anInt4823 = arg0 - arg3.anInt4804;
		} else if (arg3.aByte87 == 2) {
			arg3.anInt4823 = arg3.anInt4804 * arg0 >> 14;
		}
		if (arg3.aByte88 == 4) {
			arg3.anInt4853 = arg3.anInt4827 * arg3.anInt4823 / arg3.anInt4840;
		}
		if (arg3.aByte87 == 4) {
			arg3.anInt4823 = arg3.anInt4840 * arg3.anInt4853 / arg3.anInt4827;
		}
		if (Static63.aBoolean138 && (Static53.method1118(arg3).anInt7660 != 0 || arg3.anInt4792 == 0)) {
			if (arg3.anInt4823 < 5 && arg3.anInt4853 < 5) {
				arg3.anInt4853 = 5;
				arg3.anInt4823 = 5;
			} else {
				if (arg3.anInt4853 <= 0) {
					arg3.anInt4853 = 5;
				}
				if (arg3.anInt4823 <= 0) {
					arg3.anInt4823 = 5;
				}
			}
		}
		if (Static311.anInt5509 == arg3.anInt4794) {
			Static30.aClass156_1 = arg3;
		}
		if (arg1 && arg3.anObjectArray10 != null && (arg3.anInt4853 != local6 || local9 != arg3.anInt4823)) {
			@Pc(184) Class3_Sub31 local184 = new Class3_Sub31();
			local184.anObjectArray36 = arg3.anObjectArray10;
			local184.aClass156_11 = arg3;
			Static221.aClass243_26.method5198(local184);
		}
	}
}
