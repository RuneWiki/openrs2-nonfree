import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
	public static int anInt5393;

	@OriginalMember(owner = "client!rj", name = "h", descriptor = "[I")
	public static int[] anIntArray419;

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "[I")
	public static final int[] anIntArray417 = new int[2500];

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "[Lclient!jl;")
	public static final Class104[] aClass104Array1 = new Class104[6];

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "[I")
	public static final int[] anIntArray418 = new int[5];

	@OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
	public static int anInt5394 = 0;

	@OriginalMember(owner = "client!rj", name = "g", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_178 = new Class217(19, 1);

	@OriginalMember(owner = "client!rj", name = "i", descriptor = "I")
	public static int anInt5395 = 0;

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZBLclient!va;)V")
	public static void method4938(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class11_Sub2_Sub6 arg1) {
		@Pc(9) Class67 local9 = arg1.method5898();
		if (arg1.anInt6798 == 0) {
			Static83.anInt1863 = -1;
			Static156.anInt3217 = 0;
			arg1.anInt6797 = 0;
			return;
		}
		if (arg1.anInt6772 != -1 && arg1.anInt6761 == 0) {
			@Pc(35) Class199 local35 = Static161.method3066(arg1.anInt6772);
			if (arg1.anInt6796 > 0 && local35.anInt6017 == 0) {
				arg1.anInt6797++;
				Static156.anInt3217 = 0;
				Static83.anInt1863 = -1;
				return;
			}
			if (arg1.anInt6796 <= 0 && local35.anInt6016 == 0) {
				arg1.anInt6797++;
				Static83.anInt1863 = -1;
				Static156.anInt3217 = 0;
				return;
			}
		}
		if (arg1.anInt6795 != -1 && arg1.anInt6774 <= Static51.anInt1301) {
			@Pc(91) Class109 local91 = Static345.method5752(arg1.anInt6795);
			if (local91.aBoolean221 && local91.anInt3267 != -1) {
				@Pc(103) Class199 local103 = Static161.method3066(local91.anInt3267);
				if (arg1.anInt6796 > 0 && local103.anInt6017 == 0) {
					arg1.anInt6797++;
					Static156.anInt3217 = 0;
					Static83.anInt1863 = -1;
					return;
				}
				if (arg1.anInt6796 <= 0 && local103.anInt6016 == 0) {
					arg1.anInt6797++;
					Static156.anInt3217 = 0;
					Static83.anInt1863 = -1;
					return;
				}
			}
		}
		@Pc(149) int local149 = arg1.anInt6729;
		@Pc(152) int local152 = arg1.anInt6726;
		@Pc(168) int local168 = arg1.anIntArray505[arg1.anInt6798 - 1] * 128 + arg1.method5894() * 64;
		@Pc(185) int local185 = arg1.anIntArray504[arg1.anInt6798 - 1] * 128 + arg1.method5894() * 64;
		if (local149 >= local168) {
			if (local149 > local168) {
				if (local152 < local185) {
					arg1.method5890(6144);
				} else if (local152 > local185) {
					arg1.method5890(2048);
				} else {
					arg1.method5890(4096);
				}
			} else if (local185 > local152) {
				arg1.method5890(8192);
			} else if (local185 < local152) {
				arg1.method5890(0);
			}
		} else if (local152 < local185) {
			arg1.method5890(10240);
		} else if (local152 > local185) {
			arg1.method5890(14336);
		} else {
			arg1.method5890(12288);
		}
		@Pc(272) byte local272 = arg1.aByteArray97[arg1.anInt6798 - 1];
		if (!arg0 && (local168 - local149 > 256 || local168 - local149 < -256 || local185 - local152 > 256 || local185 - local152 < -256)) {
			arg1.anInt6729 = local168;
			arg1.anInt6726 = local185;
			arg1.method5883(arg1.anInt6773);
			if (arg1.anInt6796 > 0) {
				arg1.anInt6796--;
			}
			Static156.anInt3217 = 0;
			Static83.anInt1863 = -1;
			arg1.anInt6798--;
			return;
		}
		@Pc(335) int local335 = 4;
		@Pc(337) boolean local337 = true;
		if (arg1 instanceof Class11_Sub2_Sub6_Sub2) {
			local337 = ((Class11_Sub2_Sub6_Sub2) arg1).aClass208_1.aBoolean460;
		}
		@Pc(355) int local355;
		if (local337) {
			local355 = arg1.anInt6773 - arg1.aClass223_7.anInt7017;
			if (local355 != 0 && arg1.anInt6736 == -1 && arg1.anInt6786 != 0) {
				local335 = 2;
			}
			if (!arg0 && arg1.anInt6798 > 2) {
				local335 = 6;
			}
			if (!arg0 && arg1.anInt6798 > 3) {
				local335 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt6798 > 1) {
				local335 = 6;
			}
			if (!arg0 && arg1.anInt6798 > 2) {
				local335 = 8;
			}
		}
		if (arg1.anInt6797 > 0 && arg1.anInt6798 > 1) {
			local335 = 8;
			arg1.anInt6797--;
		}
		if (local272 == 2) {
			local335 <<= 0x1;
		} else if (local272 == 0) {
			local335 >>= 0x1;
		}
		if (local9.anInt2100 != -1) {
			local335 <<= 0x7;
			if (arg1.anInt6798 == 1) {
				local355 = arg1.anInt6799 * arg1.anInt6799;
				@Pc(481) int local481 = (arg1.anInt6729 <= local168 ? local168 - arg1.anInt6729 : arg1.anInt6729 - local168) << 7;
				@Pc(503) int local503 = (arg1.anInt6726 <= local185 ? local185 - arg1.anInt6726 : arg1.anInt6726 + -local185) << 7;
				@Pc(510) int local510 = local503 < local481 ? local481 : local503;
				@Pc(517) int local517 = local510 * 2 * local9.anInt2100;
				if (local355 > local517) {
					arg1.anInt6799 /= 2;
				} else if (local510 < local355 / 2) {
					arg1.anInt6799 -= local9.anInt2100;
					if (arg1.anInt6799 < 0) {
						arg1.anInt6799 = 0;
					}
				} else if (arg1.anInt6799 < local335) {
					arg1.anInt6799 += local9.anInt2100;
					if (local335 < arg1.anInt6799) {
						arg1.anInt6799 = local335;
					}
				}
			} else if (arg1.anInt6799 < local335) {
				arg1.anInt6799 += local9.anInt2100;
				if (arg1.anInt6799 > local335) {
					arg1.anInt6799 = local335;
				}
			} else if (arg1.anInt6799 > 0) {
				arg1.anInt6799 -= local9.anInt2100;
				if (arg1.anInt6799 < 0) {
					arg1.anInt6799 = 0;
				}
			}
			local335 = arg1.anInt6799 >> 7;
			if (local335 < 1) {
				local335 = 1;
			}
		}
		Static156.anInt3217 = 0;
		if (local149 < local168) {
			arg1.anInt6729 += local335;
			Static156.anInt3217 |= 0x4;
			if (local168 < arg1.anInt6729) {
				arg1.anInt6729 = local168;
			}
		} else if (local149 > local168) {
			arg1.anInt6729 -= local335;
			Static156.anInt3217 |= 0x8;
			if (local168 > arg1.anInt6729) {
				arg1.anInt6729 = local168;
			}
		}
		if (local185 > local152) {
			Static156.anInt3217 |= 0x1;
			arg1.anInt6726 += local335;
			if (arg1.anInt6726 > local185) {
				arg1.anInt6726 = local185;
			}
		} else if (local185 < local152) {
			Static156.anInt3217 |= 0x2;
			arg1.anInt6726 -= local335;
			if (arg1.anInt6726 < local185) {
				arg1.anInt6726 = local185;
			}
		}
		if (local335 < 8) {
			Static83.anInt1863 = local272;
		} else {
			Static83.anInt1863 = 2;
		}
		if (local168 != arg1.anInt6729 || arg1.anInt6726 != local185) {
			return;
		}
		arg1.anInt6798--;
		if (arg1.anInt6796 > 0) {
			arg1.anInt6796--;
			return;
		}
	}
}
