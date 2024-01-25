import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!oc", name = "m", descriptor = "Lclient!eu;")
	public static final Class114 aClass114_17 = new Class114(4);

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLclient!ec;Z)V")
	public static void method6982(@OriginalArg(1) Class8_Sub1_Sub3_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class101 local9 = arg0.method5991(108);
		if (arg0.anInt7050 == 0) {
			arg0.anInt7052 = 0;
			Static202.anInt3288 = 0;
			Static317.anInt5609 = -1;
			return;
		}
		if (arg0.anInt7023 != -1 && arg0.anInt7045 == 0) {
			@Pc(39) Class165 local39 = Static158.aClass317_1.method7882(arg0.anInt7023, 100);
			if (arg0.anInt7049 > 0 && local39.anInt3921 == 0) {
				Static317.anInt5609 = -1;
				Static202.anInt3288 = 0;
				arg0.anInt7052++;
				return;
			}
			if (arg0.anInt7049 <= 0 && local39.anInt3912 == 0) {
				arg0.anInt7052++;
				Static202.anInt3288 = 0;
				Static317.anInt5609 = -1;
				return;
			}
		}
		for (@Pc(87) int local87 = 0; local87 < arg0.aClass150Array3.length; local87++) {
			if (arg0.aClass150Array3[local87].anInt3303 != -1 && Static44.anInt740 >= arg0.aClass150Array3[local87].anInt3302) {
				@Pc(117) Class160 local117 = Static421.aClass385_2.method9166(arg0.aClass150Array3[local87].anInt3303);
				if (local117.aBoolean288 && local117.anInt3635 != -1) {
					@Pc(132) Class165 local132 = Static158.aClass317_1.method7882(local117.anInt3635, 100);
					if (arg0.anInt7049 > 0 && local132.anInt3921 == 0) {
						Static202.anInt3288 = 0;
						Static317.anInt5609 = -1;
						arg0.anInt7052++;
						return;
					}
					if (arg0.anInt7049 <= 0 && local132.anInt3912 == 0) {
						arg0.anInt7052++;
						Static202.anInt3288 = 0;
						Static317.anInt5609 = -1;
						return;
					}
				}
			}
		}
		@Pc(187) int local187 = arg0.anInt10355;
		@Pc(190) int local190 = arg0.anInt10363;
		@Pc(206) int local206 = arg0.anIntArray414[arg0.anInt7050 - 1] * 512 + arg0.method5993() * 256;
		@Pc(222) int local222 = arg0.anIntArray415[arg0.anInt7050 - 1] * 512 + arg0.method5993() * 256;
		if (local206 <= local187) {
			if (local206 >= local187) {
				if (local190 < local222) {
					arg0.method5989(8192);
				} else if (local222 < local190) {
					arg0.method5989(0);
				}
			} else if (local190 < local222) {
				arg0.method5989(6144);
			} else if (local190 > local222) {
				arg0.method5989(2048);
			} else {
				arg0.method5989(4096);
			}
		} else if (local190 < local222) {
			arg0.method5989(10240);
		} else if (local222 >= local190) {
			arg0.method5989(12288);
		} else {
			arg0.method5989(14336);
		}
		@Pc(352) byte local352 = arg0.aByteArray64[arg0.anInt7050 - 1];
		if (!arg1 && (local206 - local187 > 1024 || local206 - local187 < -1024 || local222 - local190 > 1024 || local222 - local190 < -1024)) {
			arg0.anInt10363 = local222;
			arg0.anInt10355 = local206;
			arg0.method5995(arg0.anInt7043, false);
			if (arg0.anInt7049 > 0) {
				arg0.anInt7049--;
			}
			Static202.anInt3288 = 0;
			Static317.anInt5609 = -1;
			arg0.anInt7050--;
			return;
		}
		@Pc(431) int local431 = 16;
		@Pc(433) boolean local433 = true;
		if (arg0 instanceof Class8_Sub1_Sub3_Sub2_Sub2) {
			local433 = ((Class8_Sub1_Sub3_Sub2_Sub2) arg0).aClass227_1.aBoolean467;
		}
		@Pc(456) int local456;
		if (local433) {
			local456 = arg0.anInt7043 - arg0.aClass270_7.anInt7432;
			if (local456 != 0 && arg0.anInt7041 == -1 && arg0.anInt7020 != 0) {
				local431 = 8;
			}
			if (!arg1 && arg0.anInt7050 > 2) {
				local431 = 24;
			}
			if (!arg1 && arg0.anInt7050 > 3) {
				local431 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt7050 > 1) {
				local431 = 24;
			}
			if (!arg1 && arg0.anInt7050 > 2) {
				local431 = 32;
			}
		}
		if (arg0.anInt7052 > 0 && arg0.anInt7050 > 1) {
			local431 = 32;
			arg0.anInt7052--;
		}
		if (local352 == 2) {
			local431 <<= 0x1;
		} else if (local352 == 0) {
			local431 >>= 0x1;
		}
		Static202.anInt3288 = 0;
		if (local9.anInt2195 != -1) {
			local431 <<= 0x9;
			if (arg0.anInt7050 == 1) {
				local456 = arg0.anInt7051 * arg0.anInt7051;
				@Pc(672) int local672 = (arg0.anInt10355 <= local206 ? local206 - arg0.anInt10355 : arg0.anInt10355 + -local206) << 9;
				@Pc(693) int local693 = (arg0.anInt10363 <= local222 ? local222 - arg0.anInt10363 : arg0.anInt10363 - local222) << 9;
				@Pc(705) int local705 = local672 > local693 ? local672 : local693;
				@Pc(712) int local712 = local705 * 2 * local9.anInt2195;
				if (local456 > local712) {
					arg0.anInt7051 /= 2;
				} else if (local456 / 2 > local705) {
					arg0.anInt7051 -= local9.anInt2195;
					if (arg0.anInt7051 < 0) {
						arg0.anInt7051 = 0;
					}
				} else if (arg0.anInt7051 < local431) {
					arg0.anInt7051 += local9.anInt2195;
					if (arg0.anInt7051 > local431) {
						arg0.anInt7051 = local431;
					}
				}
			} else if (local431 > arg0.anInt7051) {
				arg0.anInt7051 += local9.anInt2195;
				if (local431 < arg0.anInt7051) {
					arg0.anInt7051 = local431;
				}
			} else if (arg0.anInt7051 > 0) {
				arg0.anInt7051 -= local9.anInt2195;
				if (arg0.anInt7051 < 0) {
					arg0.anInt7051 = 0;
				}
			}
			local431 = arg0.anInt7051 >> 9;
			if (local431 < 1) {
				local431 = 1;
			}
		}
		if (local206 == local187 && local190 == local222) {
			Static317.anInt5609 = -1;
		} else {
			if (local206 > local187) {
				Static202.anInt3288 |= 0x4;
				arg0.anInt10355 += local431;
				if (local206 < arg0.anInt10355) {
					arg0.anInt10355 = local206;
				}
			} else if (local187 > local206) {
				arg0.anInt10355 -= local431;
				Static202.anInt3288 |= 0x8;
				if (local206 > arg0.anInt10355) {
					arg0.anInt10355 = local206;
				}
			}
			if (local222 > local190) {
				Static202.anInt3288 |= 0x1;
				arg0.anInt10363 += local431;
				if (arg0.anInt10363 > local222) {
					arg0.anInt10363 = local222;
				}
			} else if (local190 > local222) {
				Static202.anInt3288 |= 0x2;
				arg0.anInt10363 -= local431;
				if (arg0.anInt10363 < local222) {
					arg0.anInt10363 = local222;
				}
			}
			if (local431 < 32) {
				Static317.anInt5609 = local352;
			} else {
				Static317.anInt5609 = 2;
			}
		}
		if (arg0.anInt10355 == local206 && local222 == arg0.anInt10363) {
			if (arg0.anInt7049 > 0) {
				arg0.anInt7049--;
			}
			arg0.anInt7050--;
		}
	}
}
