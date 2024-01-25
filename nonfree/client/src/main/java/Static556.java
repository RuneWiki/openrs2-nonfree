import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!sg", name = "v", descriptor = "Lclient!eba;")
	public static Class14_Sub1_Sub3 aClass14_Sub1_Sub3_4;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "[[Lclient!sw;")
	public static Class342[][] aClass342ArrayArray1;

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
	public static int anInt9311 = 2;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLclient!nh;Z)V")
	public static void method8037(@OriginalArg(1) Class4_Sub3_Sub3_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class141 local9 = arg0.method2865();
		if (arg0.anInt3298 == 0) {
			Static583.anInt9645 = -1;
			arg0.anInt3299 = 0;
			Static198.anInt3445 = 0;
			return;
		}
		if (arg0.aClass181_8.method8970() && !arg0.aClass181_8.method8969()) {
			@Pc(41) Class259 local41 = arg0.aClass181_8.method8952();
			if (arg0.anInt3297 > 0 && local41.anInt7192 == 0) {
				arg0.anInt3299++;
				Static198.anInt3445 = 0;
				Static583.anInt9645 = -1;
				return;
			}
			if (arg0.anInt3297 <= 0 && local41.anInt7191 == 0) {
				Static583.anInt9645 = -1;
				arg0.anInt3299++;
				Static198.anInt3445 = 0;
				return;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < arg0.aClass214Array3.length; local89++) {
			if (arg0.aClass214Array3[local89].anInt5678 != -1 && arg0.aClass214Array3[local89].aClass181_10.method8969()) {
				@Pc(119) Class203 local119 = Static453.aClass281_2.method6686(arg0.aClass214Array3[local89].anInt5678);
				if (local119.aBoolean402 && local119.anInt5538 != -1) {
					@Pc(134) Class259 local134 = Static59.aClass204_1.method5041(local119.anInt5538);
					if (arg0.anInt3297 > 0 && local134.anInt7192 == 0) {
						Static198.anInt3445 = 0;
						Static583.anInt9645 = -1;
						arg0.anInt3299++;
						return;
					}
					if (arg0.anInt3297 <= 0 && local134.anInt7191 == 0) {
						Static198.anInt3445 = 0;
						Static583.anInt9645 = -1;
						arg0.anInt3299++;
						return;
					}
				}
			}
		}
		@Pc(193) int local193 = arg0.anInt11184;
		@Pc(196) int local196 = arg0.anInt11178;
		@Pc(213) int local213 = arg0.anIntArray200[arg0.anInt3298 - 1] * 512 + arg0.method2870(0) * 256;
		@Pc(230) int local230 = arg0.anIntArray201[arg0.anInt3298 - 1] * 512 + arg0.method2870(0) * 256;
		if (local213 <= local193) {
			if (local213 < local193) {
				if (local196 < local230) {
					arg0.method2881(6144);
				} else if (local230 >= local196) {
					arg0.method2881(4096);
				} else {
					arg0.method2881(2048);
				}
			} else if (local196 < local230) {
				arg0.method2881(8192);
			} else if (local230 < local196) {
				arg0.method2881(0);
			}
		} else if (local230 > local196) {
			arg0.method2881(10240);
		} else if (local230 >= local196) {
			arg0.method2881(12288);
		} else {
			arg0.method2881(14336);
		}
		@Pc(356) byte local356 = arg0.aByteArray50[arg0.anInt3298 - 1];
		if (!arg1 && (local213 - local193 > 1024 || local213 - local193 < -1024 || local230 - local196 > 1024 || local230 - local196 < -1024)) {
			arg0.anInt11184 = local213;
			arg0.anInt11178 = local230;
			arg0.method2873(arg0.anInt3289, false);
			if (arg0.anInt3297 > 0) {
				arg0.anInt3297--;
			}
			Static198.anInt3445 = 0;
			arg0.anInt3298--;
			Static583.anInt9645 = -1;
			return;
		}
		@Pc(432) int local432 = 16;
		@Pc(434) boolean local434 = true;
		if (arg0 instanceof Class4_Sub3_Sub3_Sub3_Sub1) {
			local434 = ((Class4_Sub3_Sub3_Sub3_Sub1) arg0).aClass362_1.aBoolean695;
		}
		@Pc(452) int local452;
		if (local434) {
			local452 = arg0.anInt3289 - arg0.aClass200_7.anInt5507;
			if (local452 != 0 && arg0.anInt3256 == -1 && arg0.anInt3295 != 0) {
				local432 = 8;
			}
			if (!arg1 && arg0.anInt3298 > 2) {
				local432 = 24;
			}
			if (!arg1 && arg0.anInt3298 > 3) {
				local432 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt3298 > 1) {
				local432 = 24;
			}
			if (!arg1 && arg0.anInt3298 > 2) {
				local432 = 32;
			}
		}
		if (arg0.anInt3299 > 0 && arg0.anInt3298 > 1) {
			local432 = 32;
			arg0.anInt3299--;
		}
		if (local356 == 2) {
			local432 <<= 0x1;
		} else if (local356 == 0) {
			local432 >>= 0x1;
		}
		if (local9.anInt3521 != -1) {
			local432 <<= 0x9;
			if (arg0.anInt3298 == 1) {
				local452 = arg0.anInt3300 * arg0.anInt3300;
				@Pc(605) int local605 = (arg0.anInt11184 > local213 ? arg0.anInt11184 - local213 : local213 - arg0.anInt11184) << 9;
				@Pc(628) int local628 = (local230 < arg0.anInt11178 ? arg0.anInt11178 - local230 : local230 + -arg0.anInt11178) << 9;
				@Pc(636) int local636 = local628 < local605 ? local605 : local628;
				@Pc(643) int local643 = local9.anInt3521 * 2 * local636;
				if (local452 > local643) {
					arg0.anInt3300 /= 2;
				} else if (local452 / 2 > local636) {
					arg0.anInt3300 -= local9.anInt3521;
					if (arg0.anInt3300 < 0) {
						arg0.anInt3300 = 0;
					}
				} else if (arg0.anInt3300 < local432) {
					arg0.anInt3300 += local9.anInt3521;
					if (local432 < arg0.anInt3300) {
						arg0.anInt3300 = local432;
					}
				}
			} else if (local432 > arg0.anInt3300) {
				arg0.anInt3300 += local9.anInt3521;
				if (local432 < arg0.anInt3300) {
					arg0.anInt3300 = local432;
				}
			} else if (arg0.anInt3300 > 0) {
				arg0.anInt3300 -= local9.anInt3521;
				if (arg0.anInt3300 < 0) {
					arg0.anInt3300 = 0;
				}
			}
			local432 = arg0.anInt3300 >> 9;
			if (local432 < 1) {
				local432 = 1;
			}
		}
		Static198.anInt3445 = 0;
		if (local213 == local193 && local196 == local230) {
			Static583.anInt9645 = -1;
		} else {
			if (local193 < local213) {
				Static198.anInt3445 |= 0x4;
				arg0.anInt11184 += local432;
				if (local213 < arg0.anInt11184) {
					arg0.anInt11184 = local213;
				}
			} else if (local193 > local213) {
				Static198.anInt3445 |= 0x8;
				arg0.anInt11184 -= local432;
				if (arg0.anInt11184 < local213) {
					arg0.anInt11184 = local213;
				}
			}
			if (local196 < local230) {
				Static198.anInt3445 |= 0x1;
				arg0.anInt11178 += local432;
				if (arg0.anInt11178 > local230) {
					arg0.anInt11178 = local230;
				}
			} else if (local230 < local196) {
				Static198.anInt3445 |= 0x2;
				arg0.anInt11178 -= local432;
				if (local230 > arg0.anInt11178) {
					arg0.anInt11178 = local230;
				}
			}
			if (local432 < 32) {
				Static583.anInt9645 = local356;
			} else {
				Static583.anInt9645 = 2;
			}
		}
		if (arg0.anInt11184 != local213 || arg0.anInt11178 != local230) {
			return;
		}
		arg0.anInt3298--;
		if (arg0.anInt3297 > 0) {
			arg0.anInt3297--;
			return;
		}
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)V")
	public static void method8038() {
		for (@Pc(14) Class14_Sub2_Sub11 local14 = (Class14_Sub2_Sub11) Static598.aClass125_42.method2633(); local14 != null; local14 = (Class14_Sub2_Sub11) Static598.aClass125_42.method2627()) {
			@Pc(19) Class4_Sub3_Sub3_Sub1 local19 = local14.aClass4_Sub3_Sub3_Sub1_1;
			local19.method2319(Static468.anInt7945);
			if (local19.method2316()) {
				local14.method9513();
				local19.method2322();
			} else if (local19.method2317()) {
				Static209.method9481(local19, true);
			}
		}
	}
}
