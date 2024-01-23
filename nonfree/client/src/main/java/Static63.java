import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!em", name = "L", descriptor = "[Lclient!in;")
	public static Class1_Sub1_Sub3[] aClass1_Sub1_Sub3Array6;

	@OriginalMember(owner = "client!em", name = "N", descriptor = "Lclient!ph;")
	public static Class138 aClass138_16;

	@OriginalMember(owner = "client!em", name = "K", descriptor = "I")
	public static int anInt1285 = 0;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(ILclient!gj;)V")
	public static void method1092(@OriginalArg(1) Class22_Sub3 arg0) {
		@Pc(17) Class78 local17 = arg0.method3659();
		arg0.anInt4566 = local17.anInt2171;
		if (arg0.anInt4580 == 0) {
			arg0.anInt4618 = 0;
			return;
		}
		if (arg0.anInt4642 != -1 && arg0.anInt4632 == 0) {
			@Pc(41) Class167 local41 = Static313.method4648(arg0.anInt4642);
			if (arg0.anInt4589 > 0 && local41.anInt5121 == 0) {
				arg0.anInt4618++;
				return;
			}
			if (arg0.anInt4589 <= 0 && local41.anInt5115 == 0) {
				arg0.anInt4618++;
				return;
			}
		}
		if (arg0.anInt4562 != -1 && Static37.anInt757 >= arg0.anInt4575) {
			@Pc(86) Class97 local86 = Static239.method3759(arg0.anInt4562);
			if (local86.aBoolean196 && local86.anInt2712 != -1) {
				@Pc(98) Class167 local98 = Static313.method4648(local86.anInt2712);
				if (arg0.anInt4589 > 0 && local98.anInt5121 == 0) {
					arg0.anInt4618++;
					return;
				}
				if (arg0.anInt4589 <= 0 && local98.anInt5115 == 0) {
					arg0.anInt4618++;
					return;
				}
			}
		}
		@Pc(132) int local132 = arg0.anInt4623;
		@Pc(135) int local135 = arg0.anInt4601;
		@Pc(152) int local152 = arg0.anIntArray427[arg0.anInt4580 - 1] * 128 + arg0.method3660() * 64;
		@Pc(168) int local168 = arg0.anIntArray424[arg0.anInt4580 - 1] * 128 + arg0.method3660() * 64;
		if (local152 - local135 > 256 || local152 - local135 < -256 || local168 - local132 > 256 || local168 - local132 < -256) {
			arg0.anInt4623 = local168;
			arg0.anInt4601 = local152;
			return;
		}
		if (local135 < local152) {
			if (local132 < local168) {
				arg0.anInt4561 = 1280;
			} else if (local132 > local168) {
				arg0.anInt4561 = 1792;
			} else {
				arg0.anInt4561 = 1536;
			}
		} else if (local135 <= local152) {
			if (local132 < local168) {
				arg0.anInt4561 = 1024;
			} else if (local168 < local132) {
				arg0.anInt4561 = 0;
			}
		} else if (local168 > local132) {
			arg0.anInt4561 = 768;
		} else if (local168 < local132) {
			arg0.anInt4561 = 256;
		} else {
			arg0.anInt4561 = 512;
		}
		@Pc(288) int local288 = arg0.anInt4561 - arg0.anInt4649 & 0x7FF;
		@Pc(291) int local291 = local17.anInt2160;
		if (local288 > 1024) {
			local288 -= 2048;
		}
		if (local288 >= -256 && local288 <= 256) {
			local291 = local17.anInt2140;
		} else if (local288 >= 256 && local288 < 768) {
			local291 = local17.anInt2139;
		} else if (local288 >= -768 && local288 <= -256) {
			local291 = local17.anInt2131;
		}
		if (local291 == -1) {
			local291 = local17.anInt2140;
		}
		@Pc(342) boolean local342 = true;
		@Pc(344) int local344 = 4;
		@Pc(346) boolean local346 = true;
		arg0.anInt4566 = local291;
		if (arg0 instanceof Class22_Sub3_Sub1) {
			local342 = ((Class22_Sub3_Sub1) arg0).aClass112_1.aBoolean246;
		}
		if (local342) {
			if (arg0.anInt4649 != arg0.anInt4561 && arg0.anInt4638 == -1 && arg0.anInt4611 != 0) {
				local344 = 2;
			}
			if (arg0.anInt4580 > 2) {
				local344 = 6;
			}
			if (arg0.anInt4580 > 3) {
				local344 = 8;
			}
			if (arg0.anInt4618 > 0 && arg0.anInt4580 > 1) {
				arg0.anInt4618--;
				local344 = 8;
			}
		} else {
			if (arg0.anInt4580 > 1) {
				local344 = 6;
			}
			if (arg0.anInt4580 > 2) {
				local344 = 8;
			}
			if (arg0.anInt4618 > 0 && arg0.anInt4580 > 1) {
				local344 = 8;
				arg0.anInt4618--;
			}
		}
		if (arg0.aByteArray54[arg0.anInt4580 - 1] == 2) {
			local344 <<= 0x1;
			local346 = true;
		} else if (arg0.aByteArray54[arg0.anInt4580 - 1] == 0) {
			local346 = false;
			local344 >>= 0x1;
		}
		if (local344 < 8 || local17.anInt2143 == -1) {
			if (local17.anInt2151 != -1 && !local346) {
				if (arg0.anInt4566 == local17.anInt2160 && local17.anInt2148 != -1) {
					arg0.anInt4566 = local17.anInt2148;
				} else if (local17.anInt2131 == arg0.anInt4566 && local17.anInt2161 != -1) {
					arg0.anInt4566 = local17.anInt2161;
				} else if (arg0.anInt4566 == local17.anInt2139 && local17.anInt2166 != -1) {
					arg0.anInt4566 = local17.anInt2166;
				} else {
					arg0.anInt4566 = local17.anInt2151;
				}
			}
		} else if (arg0.anInt4566 == local17.anInt2160 && local17.anInt2162 != -1) {
			arg0.anInt4566 = local17.anInt2162;
		} else if (arg0.anInt4566 == local17.anInt2131 && local17.anInt2132 != -1) {
			arg0.anInt4566 = local17.anInt2132;
		} else if (arg0.anInt4566 == local17.anInt2139 && local17.anInt2150 != -1) {
			arg0.anInt4566 = local17.anInt2150;
		} else {
			arg0.anInt4566 = local17.anInt2143;
		}
		if (local17.anInt2152 != -1) {
			local344 <<= 0x7;
			if (arg0.anInt4580 == 1) {
				@Pc(683) int local683 = arg0.anInt4626 * arg0.anInt4626;
				@Pc(701) int local701 = (arg0.anInt4601 <= local152 ? local152 - arg0.anInt4601 : arg0.anInt4601 + -local152) << 7;
				@Pc(717) int local717 = (arg0.anInt4623 > local168 ? arg0.anInt4623 - local168 : local168 - arg0.anInt4623) << 7;
				@Pc(724) int local724 = local701 > local717 ? local701 : local717;
				@Pc(731) int local731 = local17.anInt2152 * 2 * local724;
				if (local683 > local731) {
					arg0.anInt4626 /= 2;
				} else if (local724 < local683 / 2) {
					arg0.anInt4626 -= local17.anInt2152;
					if (arg0.anInt4626 < 0) {
						arg0.anInt4626 = 0;
					}
				} else if (local344 > arg0.anInt4626) {
					arg0.anInt4626 += local17.anInt2152;
					if (local344 < arg0.anInt4626) {
						arg0.anInt4626 = local344;
					}
				}
			} else if (arg0.anInt4626 < local344) {
				arg0.anInt4626 += local17.anInt2152;
				if (arg0.anInt4626 > local344) {
					arg0.anInt4626 = local344;
				}
			} else if (arg0.anInt4626 > 0) {
				arg0.anInt4626 -= local17.anInt2152;
				if (arg0.anInt4626 < 0) {
					arg0.anInt4626 = 0;
				}
			}
			local344 = arg0.anInt4626 >> 7;
			if (local344 < 1) {
				local344 = 1;
			}
		}
		if (local135 < local152) {
			arg0.anInt4601 += local344;
			if (arg0.anInt4601 > local152) {
				arg0.anInt4601 = local152;
			}
		} else if (local135 > local152) {
			arg0.anInt4601 -= local344;
			if (local152 > arg0.anInt4601) {
				arg0.anInt4601 = local152;
			}
		}
		if (local168 > local132) {
			arg0.anInt4623 += local344;
			if (local168 < arg0.anInt4623) {
				arg0.anInt4623 = local168;
			}
		} else if (local132 > local168) {
			arg0.anInt4623 -= local344;
			if (arg0.anInt4623 < local168) {
				arg0.anInt4623 = local168;
			}
		}
		if (local152 == arg0.anInt4601 && arg0.anInt4623 == local168) {
			arg0.anInt4580--;
			if (arg0.anInt4589 > 0) {
				arg0.anInt4589--;
			}
		}
	}
}
