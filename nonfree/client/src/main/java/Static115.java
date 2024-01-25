import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "[I")
	public static final int[] anIntArray419 = new int[32];

	@OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
	public static int anInt6760 = -50;

	@OriginalMember(owner = "client!ed", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray149 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!ed", name = "B", descriptor = "Z")
	public static boolean aBoolean505 = true;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZLclient!sp;I)V")
	public static void method5669(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class41_Sub2_Sub1_Sub4 arg1) {
		@Pc(9) Class365 local9 = arg1.method7861();
		if (arg1.anInt9535 == 0) {
			Static192.anInt3648 = -1;
			Static467.anInt7772 = 0;
			arg1.anInt9533 = 0;
			return;
		}
		if (arg1.anInt9489 != -1 && arg1.anInt9509 == 0) {
			@Pc(36) Class185 local36 = Static545.aClass240_2.method5680(arg1.anInt9489);
			if (arg1.anInt9534 > 0 && local36.anInt4987 == 0) {
				Static467.anInt7772 = 0;
				arg1.anInt9533++;
				Static192.anInt3648 = -1;
				return;
			}
			if (arg1.anInt9534 <= 0 && local36.anInt4985 == 0) {
				Static192.anInt3648 = -1;
				Static467.anInt7772 = 0;
				arg1.anInt9533++;
				return;
			}
		}
		@Pc(108) Class185 local108;
		@Pc(95) Class284 local95;
		if (arg1.anInt9528 != -1 && arg1.anInt9459 <= Static506.anInt8251) {
			local95 = Static368.aClass278_1.method6127(arg1.anInt9528);
			if (local95.aBoolean565 && local95.anInt7490 != -1) {
				local108 = Static545.aClass240_2.method5680(local95.anInt7490);
				if (arg1.anInt9534 > 0 && local108.anInt4987 == 0) {
					Static192.anInt3648 = -1;
					arg1.anInt9533++;
					Static467.anInt7772 = 0;
					return;
				}
				if (arg1.anInt9534 <= 0 && local108.anInt4985 == 0) {
					arg1.anInt9533++;
					Static192.anInt3648 = -1;
					Static467.anInt7772 = 0;
					return;
				}
			}
		}
		if (arg1.anInt9528 != -1 && arg1.anInt9459 <= Static506.anInt8251) {
			local95 = Static368.aClass278_1.method6127(arg1.anInt9528);
			if (local95.aBoolean565 && local95.anInt7490 != -1) {
				local108 = Static545.aClass240_2.method5680(local95.anInt7490);
				if (arg1.anInt9534 > 0 && local108.anInt4987 == 0) {
					arg1.anInt9533++;
					Static192.anInt3648 = -1;
					Static467.anInt7772 = 0;
					return;
				}
				if (arg1.anInt9534 <= 0 && local108.anInt4985 == 0) {
					Static192.anInt3648 = -1;
					arg1.anInt9533++;
					Static467.anInt7772 = 0;
					return;
				}
			}
		}
		@Pc(220) int local220 = arg1.anInt9444;
		@Pc(223) int local223 = arg1.anInt9442;
		@Pc(239) int local239 = arg1.anIntArray629[arg1.anInt9535 - 1] * 512 + arg1.method7858() * 256;
		@Pc(263) int local263 = arg1.anIntArray628[arg1.anInt9535 - 1] * 512 + arg1.method7858() * 256;
		if (local220 >= local239) {
			if (local239 >= local220) {
				if (local223 < local263) {
					arg1.method7865(8192);
				} else if (local263 < local223) {
					arg1.method7865(0);
				}
			} else if (local263 > local223) {
				arg1.method7865(6144);
			} else if (local223 <= local263) {
				arg1.method7865(4096);
			} else {
				arg1.method7865(2048);
			}
		} else if (local223 < local263) {
			arg1.method7865(10240);
		} else if (local263 < local223) {
			arg1.method7865(14336);
		} else {
			arg1.method7865(12288);
		}
		@Pc(345) byte local345 = arg1.aByteArray102[arg1.anInt9535 - 1];
		if (!arg0 && (local239 - local220 > 1024 || local239 - local220 < -1024 || local263 - local223 > 1024 || local263 - local223 < -1024)) {
			arg1.anInt9442 = local263;
			arg1.anInt9444 = local239;
			arg1.method7855(arg1.anInt9522, false);
			arg1.anInt9535--;
			if (arg1.anInt9534 > 0) {
				arg1.anInt9534--;
			}
			Static467.anInt7772 = 0;
			Static192.anInt3648 = -1;
			return;
		}
		@Pc(412) int local412 = 16;
		@Pc(414) boolean local414 = true;
		if (arg1 instanceof Class41_Sub2_Sub1_Sub4_Sub1) {
			local414 = ((Class41_Sub2_Sub1_Sub4_Sub1) arg1).aClass264_1.aBoolean539;
		}
		@Pc(432) int local432;
		if (local414) {
			local432 = arg1.anInt9522 - arg1.aClass259_7.anInt7038;
			if (local432 != 0 && arg1.anInt9483 == -1 && arg1.anInt9499 != 0) {
				local412 = 8;
			}
			if (!arg0 && arg1.anInt9535 > 2) {
				local412 = 24;
			}
			if (!arg0 && arg1.anInt9535 > 3) {
				local412 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt9535 > 1) {
				local412 = 24;
			}
			if (!arg0 && arg1.anInt9535 > 2) {
				local412 = 32;
			}
		}
		if (arg1.anInt9533 > 0 && arg1.anInt9535 > 1) {
			local412 = 32;
			arg1.anInt9533--;
		}
		if (local345 == 2) {
			local412 <<= 0x1;
		} else if (local345 == 0) {
			local412 >>= 0x1;
		}
		if (local9.anInt9718 != -1) {
			local412 <<= 0x9;
			if (arg1.anInt9535 == 1) {
				local432 = arg1.anInt9536 * arg1.anInt9536;
				@Pc(613) int local613 = (arg1.anInt9444 <= local239 ? local239 - arg1.anInt9444 : -local239 + arg1.anInt9444) << 9;
				@Pc(634) int local634 = (local263 >= arg1.anInt9442 ? local263 - arg1.anInt9442 : arg1.anInt9442 - local263) << 9;
				@Pc(645) int local645 = local613 > local634 ? local613 : local634;
				@Pc(652) int local652 = local645 * local9.anInt9718 * 2;
				if (local652 < local432) {
					arg1.anInt9536 /= 2;
				} else if (local432 / 2 > local645) {
					arg1.anInt9536 -= local9.anInt9718;
					if (arg1.anInt9536 < 0) {
						arg1.anInt9536 = 0;
					}
				} else if (local412 > arg1.anInt9536) {
					arg1.anInt9536 += local9.anInt9718;
					if (arg1.anInt9536 > local412) {
						arg1.anInt9536 = local412;
					}
				}
			} else if (local412 > arg1.anInt9536) {
				arg1.anInt9536 += local9.anInt9718;
				if (arg1.anInt9536 > local412) {
					arg1.anInt9536 = local412;
				}
			} else if (arg1.anInt9536 > 0) {
				arg1.anInt9536 -= local9.anInt9718;
				if (arg1.anInt9536 < 0) {
					arg1.anInt9536 = 0;
				}
			}
			local412 = arg1.anInt9536 >> 9;
			if (local412 < 1) {
				local412 = 1;
			}
		}
		Static467.anInt7772 = 0;
		if (local239 == local220 && local223 == local263) {
			Static192.anInt3648 = -1;
		} else {
			if (local220 < local239) {
				Static467.anInt7772 |= 0x4;
				arg1.anInt9444 += local412;
				if (local239 < arg1.anInt9444) {
					arg1.anInt9444 = local239;
				}
			} else if (local239 < local220) {
				arg1.anInt9444 -= local412;
				Static467.anInt7772 |= 0x8;
				if (local239 > arg1.anInt9444) {
					arg1.anInt9444 = local239;
				}
			}
			if (local263 > local223) {
				arg1.anInt9442 += local412;
				Static467.anInt7772 |= 0x1;
				if (local263 < arg1.anInt9442) {
					arg1.anInt9442 = local263;
				}
			} else if (local263 < local223) {
				Static467.anInt7772 |= 0x2;
				arg1.anInt9442 -= local412;
				if (arg1.anInt9442 < local263) {
					arg1.anInt9442 = local263;
				}
			}
			if (local412 >= 32) {
				Static192.anInt3648 = 2;
			} else {
				Static192.anInt3648 = local345;
			}
		}
		if (local239 == arg1.anInt9444 && arg1.anInt9442 == local263) {
			if (arg1.anInt9534 > 0) {
				arg1.anInt9534--;
			}
			arg1.anInt9535--;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method5671(@OriginalArg(1) Class322 arg0) {
		Static132.anInt9450 = arg0.method6823("p11_full");
		Static334.anInt5599 = arg0.method6823("p12_full");
		Static189.anInt3600 = arg0.method6823("b12_full");
	}
}
