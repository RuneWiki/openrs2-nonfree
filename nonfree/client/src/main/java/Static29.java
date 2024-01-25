import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bo", name = "O", descriptor = "Lclient!tj;")
	public static Class193 aClass193_8;

	@OriginalMember(owner = "client!bo", name = "S", descriptor = "I")
	public static int anInt636;

	@OriginalMember(owner = "client!bo", name = "P", descriptor = "[I")
	public static final int[] anIntArray29 = new int[25];

	@OriginalMember(owner = "client!bo", name = "R", descriptor = "[I")
	public static final int[] anIntArray30 = new int[32];

	@OriginalMember(owner = "client!bo", name = "V", descriptor = "I")
	public static int anInt638 = 0;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!hl;BZ)V")
	public static void method496(@OriginalArg(0) Class8_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(11) Class40 local11 = arg0.method4347();
		if (arg0.anInt4987 == 0) {
			Static221.anInt2807 = -1;
			Static93.anInt2504 = 0;
			arg0.anInt4990 = 0;
			return;
		}
		if (arg0.anInt4954 != -1 && arg0.anInt4935 == 0) {
			@Pc(40) Class14 local40 = Static225.method4042(arg0.anInt4954);
			if (arg0.anInt4981 > 0 && local40.anInt361 == 0) {
				Static93.anInt2504 = 0;
				arg0.anInt4990++;
				Static221.anInt2807 = -1;
				return;
			}
			if (arg0.anInt4981 <= 0 && local40.anInt352 == 0) {
				arg0.anInt4990++;
				Static93.anInt2504 = 0;
				Static221.anInt2807 = -1;
				return;
			}
		}
		if (arg0.anInt4972 != -1 && arg0.anInt4919 <= Static199.anInt4137) {
			@Pc(97) Class5 local97 = Static116.method2427(arg0.anInt4972);
			if (local97.aBoolean11 && local97.anInt101 != -1) {
				@Pc(110) Class14 local110 = Static225.method4042(local97.anInt101);
				if (arg0.anInt4981 > 0 && local110.anInt361 == 0) {
					Static221.anInt2807 = -1;
					Static93.anInt2504 = 0;
					arg0.anInt4990++;
					return;
				}
				if (arg0.anInt4981 <= 0 && local110.anInt352 == 0) {
					Static93.anInt2504 = 0;
					Static221.anInt2807 = -1;
					arg0.anInt4990++;
					return;
				}
			}
		}
		@Pc(156) int local156 = arg0.anInt6701;
		@Pc(159) int local159 = arg0.anInt6702;
		@Pc(180) int local180 = arg0.anIntArray415[arg0.anInt4987 - 1] * 128 + arg0.method4349() * 64;
		@Pc(197) int local197 = arg0.anIntArray416[arg0.anInt4987 - 1] * 128 + arg0.method4349() * 64;
		if (!arg1 && (local180 - local156 > 256 || local180 - local156 < -256 || local197 - local159 > 256 || local197 - local159 < -256)) {
			Static221.anInt2807 = -1;
			Static93.anInt2504 = 0;
			arg0.anInt6701 = local180;
			arg0.anInt6702 = local197;
			return;
		}
		if (local180 <= local156) {
			if (local156 <= local180) {
				if (local197 > local159) {
					arg0.method4331(8192);
				} else if (local159 > local197) {
					arg0.method4331(0);
				}
			} else if (local197 > local159) {
				arg0.method4331(6144);
			} else if (local159 <= local197) {
				arg0.method4331(4096);
			} else {
				arg0.method4331(2048);
			}
		} else if (local197 > local159) {
			arg0.method4331(10240);
		} else if (local159 > local197) {
			arg0.method4331(14336);
		} else {
			arg0.method4331(12288);
		}
		@Pc(327) int local327 = 4;
		@Pc(329) boolean local329 = true;
		if (arg0 instanceof Class8_Sub1_Sub2_Sub2) {
			local329 = ((Class8_Sub1_Sub2_Sub2) arg0).aClass141_1.aBoolean342;
		}
		if (local329) {
			@Pc(366) int local366 = arg0.anInt4976 - arg0.aClass106_7.anInt3316;
			if (local366 != 0 && arg0.anInt4964 == -1 && arg0.anInt4963 != 0) {
				local327 = 2;
			}
			if (!arg1 && arg0.anInt4987 > 2) {
				local327 = 6;
			}
			if (!arg1 && arg0.anInt4987 > 3) {
				local327 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4987 > 1) {
				local327 = 6;
			}
			if (!arg1 && arg0.anInt4987 > 2) {
				local327 = 8;
			}
		}
		if (arg0.anInt4990 > 0 && arg0.anInt4987 > 1) {
			local327 = 8;
			arg0.anInt4990--;
		}
		@Pc(422) byte local422 = arg0.aByteArray67[arg0.anInt4987 - 1];
		if (local422 == 2) {
			local327 <<= 0x1;
		} else if (local422 == 0) {
			local327 >>= 0x1;
		}
		Static93.anInt2504 = 0;
		if (local11.anInt1442 != -1) {
			local327 <<= 0x7;
			if (arg0.anInt4987 == 1) {
				@Pc(460) int local460 = arg0.anInt4985 * arg0.anInt4985;
				@Pc(478) int local478 = (arg0.anInt6701 <= local180 ? local180 - arg0.anInt6701 : -local180 + arg0.anInt6701) << 7;
				@Pc(499) int local499 = (arg0.anInt6702 <= local197 ? local197 - arg0.anInt6702 : arg0.anInt6702 - local197) << 7;
				@Pc(506) int local506 = local499 >= local478 ? local499 : local478;
				@Pc(513) int local513 = local11.anInt1442 * 2 * local506;
				if (local460 > local513) {
					arg0.anInt4985 /= 2;
				} else if (local506 < local460 / 2) {
					arg0.anInt4985 -= local11.anInt1442;
					if (arg0.anInt4985 < 0) {
						arg0.anInt4985 = 0;
					}
				} else if (arg0.anInt4985 < local327) {
					arg0.anInt4985 += local11.anInt1442;
					if (arg0.anInt4985 > local327) {
						arg0.anInt4985 = local327;
					}
				}
			} else if (local327 > arg0.anInt4985) {
				arg0.anInt4985 += local11.anInt1442;
				if (local327 < arg0.anInt4985) {
					arg0.anInt4985 = local327;
				}
			} else if (arg0.anInt4985 > 0) {
				arg0.anInt4985 -= local11.anInt1442;
				if (arg0.anInt4985 < 0) {
					arg0.anInt4985 = 0;
				}
			}
			local327 = arg0.anInt4985 >> 7;
			if (local327 < 1) {
				local327 = 1;
			}
		}
		if (local180 > local156) {
			Static93.anInt2504 |= 0x4;
			arg0.anInt6701 += local327;
			if (arg0.anInt6701 > local180) {
				arg0.anInt6701 = local180;
			}
		} else if (local156 > local180) {
			arg0.anInt6701 -= local327;
			Static93.anInt2504 |= 0x8;
			if (local180 > arg0.anInt6701) {
				arg0.anInt6701 = local180;
			}
		}
		if (local159 < local197) {
			Static93.anInt2504 |= 0x1;
			arg0.anInt6702 += local327;
			if (arg0.anInt6702 > local197) {
				arg0.anInt6702 = local197;
			}
		} else if (local159 > local197) {
			Static93.anInt2504 |= 0x2;
			arg0.anInt6702 -= local327;
			if (local197 > arg0.anInt6702) {
				arg0.anInt6702 = local197;
			}
		}
		if (local327 < 8) {
			Static221.anInt2807 = local422;
		} else {
			Static221.anInt2807 = 2;
		}
		if (arg0.anInt6701 != local180 || local197 != arg0.anInt6702) {
			return;
		}
		arg0.anInt4987--;
		if (arg0.anInt4981 > 0) {
			arg0.anInt4981--;
			return;
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "()V")
	public static void method497() {
		for (@Pc(1) int local1 = 0; local1 < Static329.anInt3942; local1++) {
			@Pc(6) Class8_Sub1 local6 = Static213.aClass8_Sub1Array1[local1];
			Static223.method4030(local6);
			Static213.aClass8_Sub1Array1[local1] = null;
		}
		Static329.anInt3942 = 0;
	}
}
