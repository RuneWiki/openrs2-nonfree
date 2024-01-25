import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!dc", name = "rb", descriptor = "I")
	public static int anInt1215;

	@OriginalMember(owner = "client!dc", name = "L", descriptor = "[F")
	public static final float[] aFloatArray2 = new float[16];

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "Lclient!go;")
	public static Class95 aClass95_2 = null;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!kh;BZ)V")
	public static void method923(@OriginalArg(0) Class26_Sub2_Sub4 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class78 local9 = arg0.method5507();
		if (arg0.anInt7117 == 0) {
			arg0.anInt7114 = 0;
			Static9.anInt59 = -1;
			Static19.anInt274 = 0;
			return;
		}
		if (arg0.anInt7046 != -1 && arg0.anInt7069 == 0) {
			@Pc(36) Class139 local36 = Static364.aClass151_2.method3293(arg0.anInt7046);
			if (arg0.anInt7116 > 0 && local36.anInt3952 == 0) {
				Static9.anInt59 = -1;
				arg0.anInt7114++;
				Static19.anInt274 = 0;
				return;
			}
			if (arg0.anInt7116 <= 0 && local36.anInt3932 == 0) {
				Static19.anInt274 = 0;
				Static9.anInt59 = -1;
				arg0.anInt7114++;
				return;
			}
		}
		@Pc(97) Class139 local97;
		@Pc(84) Class105 local84;
		if (arg0.anInt7066 != -1 && Static274.anInt4617 >= arg0.anInt7095) {
			local84 = Static79.aClass231_1.method4830(arg0.anInt7066);
			if (local84.aBoolean176 && local84.anInt2900 != -1) {
				local97 = Static364.aClass151_2.method3293(local84.anInt2900);
				if (arg0.anInt7116 > 0 && local97.anInt3952 == 0) {
					Static9.anInt59 = -1;
					Static19.anInt274 = 0;
					arg0.anInt7114++;
					return;
				}
				if (arg0.anInt7116 <= 0 && local97.anInt3932 == 0) {
					Static9.anInt59 = -1;
					Static19.anInt274 = 0;
					arg0.anInt7114++;
					return;
				}
			}
		}
		if (arg0.anInt7066 != -1 && Static274.anInt4617 >= arg0.anInt7095) {
			local84 = Static79.aClass231_1.method4830(arg0.anInt7066);
			if (local84.aBoolean176 && local84.anInt2900 != -1) {
				local97 = Static364.aClass151_2.method3293(local84.anInt2900);
				if (arg0.anInt7116 > 0 && local97.anInt3952 == 0) {
					Static9.anInt59 = -1;
					Static19.anInt274 = 0;
					arg0.anInt7114++;
					return;
				}
				if (arg0.anInt7116 <= 0 && local97.anInt3932 == 0) {
					arg0.anInt7114++;
					Static9.anInt59 = -1;
					Static19.anInt274 = 0;
					return;
				}
			}
		}
		@Pc(217) int local217 = arg0.anInt7388;
		@Pc(220) int local220 = arg0.anInt7383;
		@Pc(236) int local236 = arg0.anIntArray603[arg0.anInt7117 - 1] * 128 + arg0.method5512() * 64;
		@Pc(252) int local252 = arg0.anIntArray604[arg0.anInt7117 - 1] * 128 + arg0.method5512() * 64;
		if (local236 <= local217) {
			if (local217 <= local236) {
				if (local220 < local252) {
					arg0.method5521(8192);
				} else if (local252 < local220) {
					arg0.method5521(0);
				}
			} else if (local252 > local220) {
				arg0.method5521(6144);
			} else if (local220 > local252) {
				arg0.method5521(2048);
			} else {
				arg0.method5521(4096);
			}
		} else if (local252 > local220) {
			arg0.method5521(10240);
		} else if (local252 >= local220) {
			arg0.method5521(12288);
		} else {
			arg0.method5521(14336);
		}
		@Pc(342) byte local342 = arg0.aByteArray94[arg0.anInt7117 - 1];
		if (!arg1 && (local236 - local217 > 256 || local236 - local217 < -256 || local252 - local220 > 256 || local252 - local220 < -256)) {
			arg0.anInt7383 = local252;
			arg0.anInt7388 = local236;
			arg0.method5505(arg0.anInt7072);
			if (arg0.anInt7116 > 0) {
				arg0.anInt7116--;
			}
			Static19.anInt274 = 0;
			Static9.anInt59 = -1;
			arg0.anInt7117--;
			return;
		}
		@Pc(409) int local409 = 4;
		@Pc(411) boolean local411 = true;
		if (arg0 instanceof Class26_Sub2_Sub4_Sub1) {
			local411 = ((Class26_Sub2_Sub4_Sub1) arg0).aClass249_1.aBoolean425;
		}
		@Pc(451) int local451;
		if (local411) {
			local451 = arg0.anInt7072 - arg0.aClass158_7.anInt4265;
			if (local451 != 0 && arg0.anInt7060 == -1 && arg0.anInt7044 != 0) {
				local409 = 2;
			}
			if (!arg1 && arg0.anInt7117 > 2) {
				local409 = 6;
			}
			if (!arg1 && arg0.anInt7117 > 3) {
				local409 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt7117 > 1) {
				local409 = 6;
			}
			if (!arg1 && arg0.anInt7117 > 2) {
				local409 = 8;
			}
		}
		if (arg0.anInt7114 > 0 && arg0.anInt7117 > 1) {
			local409 = 8;
			arg0.anInt7114--;
		}
		if (local342 == 2) {
			local409 <<= 0x1;
		} else if (local342 == 0) {
			local409 >>= 0x1;
		}
		if (local9.anInt2284 != -1) {
			local409 <<= 0x7;
			if (arg0.anInt7117 == 1) {
				local451 = arg0.anInt7115 * arg0.anInt7115;
				@Pc(600) int local600 = (arg0.anInt7388 > local236 ? arg0.anInt7388 - local236 : local236 - arg0.anInt7388) << 7;
				@Pc(621) int local621 = (arg0.anInt7383 > local252 ? arg0.anInt7383 - local252 : local252 - arg0.anInt7383) << 7;
				@Pc(628) int local628 = local621 >= local600 ? local621 : local600;
				@Pc(635) int local635 = local628 * local9.anInt2284 * 2;
				if (local451 > local635) {
					arg0.anInt7115 /= 2;
				} else if (local451 / 2 > local628) {
					arg0.anInt7115 -= local9.anInt2284;
					if (arg0.anInt7115 < 0) {
						arg0.anInt7115 = 0;
					}
				} else if (local409 > arg0.anInt7115) {
					arg0.anInt7115 += local9.anInt2284;
					if (local409 < arg0.anInt7115) {
						arg0.anInt7115 = local409;
					}
				}
			} else if (arg0.anInt7115 < local409) {
				arg0.anInt7115 += local9.anInt2284;
				if (local409 < arg0.anInt7115) {
					arg0.anInt7115 = local409;
				}
			} else if (arg0.anInt7115 > 0) {
				arg0.anInt7115 -= local9.anInt2284;
				if (arg0.anInt7115 < 0) {
					arg0.anInt7115 = 0;
				}
			}
			local409 = arg0.anInt7115 >> 7;
			if (local409 < 1) {
				local409 = 1;
			}
		}
		Static19.anInt274 = 0;
		if (local236 > local217) {
			arg0.anInt7388 += local409;
			Static19.anInt274 |= 0x4;
			if (local236 < arg0.anInt7388) {
				arg0.anInt7388 = local236;
			}
		} else if (local217 > local236) {
			Static19.anInt274 |= 0x8;
			arg0.anInt7388 -= local409;
			if (local236 > arg0.anInt7388) {
				arg0.anInt7388 = local236;
			}
		}
		if (local252 > local220) {
			Static19.anInt274 |= 0x1;
			arg0.anInt7383 += local409;
			if (local252 < arg0.anInt7383) {
				arg0.anInt7383 = local252;
			}
		} else if (local252 < local220) {
			arg0.anInt7383 -= local409;
			Static19.anInt274 |= 0x2;
			if (arg0.anInt7383 < local252) {
				arg0.anInt7383 = local252;
			}
		}
		if (local409 < 8) {
			Static9.anInt59 = local342;
		} else {
			Static9.anInt59 = 2;
		}
		if (local236 == arg0.anInt7388 && local252 == arg0.anInt7383) {
			if (arg0.anInt7116 > 0) {
				arg0.anInt7116--;
			}
			arg0.anInt7117--;
		}
	}
}
