import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!gs", name = "e", descriptor = "Lclient!oe;")
	public static Class181 aClass181_23;

	@OriginalMember(owner = "client!gs", name = "c", descriptor = "Z")
	public static boolean aBoolean164 = false;

	@OriginalMember(owner = "client!gs", name = "d", descriptor = "Z")
	public static boolean aBoolean165 = true;

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(BFIFIIIF)[F")
	public static float[] method2330(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6) {
		@Pc(6) float[] local6 = new float[9];
		@Pc(9) float[] local9 = new float[9];
		@Pc(17) float local17 = (float) Math.cos((double) ((float) arg1 * 0.024543693F));
		@Pc(25) float local25 = (float) Math.sin((double) ((float) arg1 * 0.024543693F));
		local6[0] = local17;
		local6[5] = 0.0F;
		local6[6] = -local25;
		local6[3] = 0.0F;
		local6[7] = 0.0F;
		local6[4] = 1.0F;
		local6[8] = local17;
		local6[1] = 0.0F;
		local6[2] = local25;
		@Pc(69) float[] local69 = new float[9];
		@Pc(71) float local71 = 1.0F;
		@Pc(73) float local73 = 0.0F;
		@Pc(78) float local78 = (float) arg3 / 32767.0F;
		@Pc(95) float local95 = 1.0F - local78;
		@Pc(105) float local105 = -((float) Math.sqrt((double) (1.0F - local78 * local78)));
		@Pc(116) float local116 = (float) Math.sqrt((double) (arg5 * arg5 + arg4 * arg4));
		if (local116 == 0.0F && local78 == 0.0F) {
			local9 = local6;
		} else {
			if (local116 != 0.0F) {
				local71 = (float) -arg5 / local116;
				local73 = (float) arg4 / local116;
			}
			local69[7] = local105 * -local71;
			local69[8] = local78 + local73 * local73 * local95;
			local69[1] = local105 * local73;
			local69[5] = local71 * local105;
			local69[3] = local105 * -local73;
			local69[6] = local95 * local71 * local73;
			local69[2] = local71 * local73 * local95;
			local69[4] = local78;
			local69[0] = local78 + local71 * local71 * local95;
			local9[0] = local69[6] * local6[2] + local6[1] * local69[3] + local6[0] * local69[0];
			local9[1] = local69[4] * local6[1] + local6[0] * local69[1] + local6[2] * local69[7];
			local9[2] = local6[1] * local69[5] + local69[2] * local6[0] + local6[2] * local69[8];
			local9[3] = local6[4] * local69[3] + local69[0] * local6[3] + local6[5] * local69[6];
			local9[4] = local6[4] * local69[4] + local6[3] * local69[1] + local6[5] * local69[7];
			local9[5] = local69[8] * local6[5] + local69[2] * local6[3] + local6[4] * local69[5];
			local9[6] = local69[0] * local6[6] + local69[3] * local6[7] + local69[6] * local6[8];
			local9[7] = local6[8] * local69[7] + local6[6] * local69[1] + local6[7] * local69[4];
			local9[8] = local69[5] * local6[7] + local6[6] * local69[2] + local69[8] * local6[8];
		}
		local9[1] *= arg2;
		local9[3] *= arg0;
		local9[4] *= arg0;
		local9[6] *= arg6;
		local9[0] *= arg2;
		local9[8] *= arg6;
		local9[5] *= arg0;
		local9[2] *= arg2;
		local9[7] *= arg6;
		return local9;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZLclient!kk;I)V")
	public static void method2331(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class31_Sub2_Sub1 arg1) {
		@Pc(9) Class21 local9 = arg1.method5982();
		if (arg1.anInt7378 == 0) {
			Static294.anInt7294 = -1;
			arg1.anInt7380 = 0;
			Static43.anInt896 = 0;
			return;
		}
		if (arg1.anInt7365 != -1 && arg1.anInt7323 == 0) {
			@Pc(40) Class223 local40 = Static293.aClass127_1.method2975(arg1.anInt7365);
			if (arg1.anInt7379 > 0 && local40.anInt6048 == 0) {
				arg1.anInt7380++;
				Static43.anInt896 = 0;
				Static294.anInt7294 = -1;
				return;
			}
			if (arg1.anInt7379 <= 0 && local40.anInt6040 == 0) {
				Static294.anInt7294 = -1;
				arg1.anInt7380++;
				Static43.anInt896 = 0;
				return;
			}
		}
		@Pc(105) Class223 local105;
		@Pc(91) Class38 local91;
		if (arg1.anInt7321 != -1 && Static378.anInt4244 >= arg1.anInt7316) {
			local91 = Static67.aClass263_2.method5782(arg1.anInt7321);
			if (local91.aBoolean50 && local91.anInt1014 != -1) {
				local105 = Static293.aClass127_1.method2975(local91.anInt1014);
				if (arg1.anInt7379 > 0 && local105.anInt6048 == 0) {
					Static43.anInt896 = 0;
					Static294.anInt7294 = -1;
					arg1.anInt7380++;
					return;
				}
				if (arg1.anInt7379 <= 0 && local105.anInt6040 == 0) {
					arg1.anInt7380++;
					Static294.anInt7294 = -1;
					Static43.anInt896 = 0;
					return;
				}
			}
		}
		if (arg1.anInt7321 != -1 && arg1.anInt7316 <= Static378.anInt4244) {
			local91 = Static67.aClass263_2.method5782(arg1.anInt7321);
			if (local91.aBoolean50 && local91.anInt1014 != -1) {
				local105 = Static293.aClass127_1.method2975(local91.anInt1014);
				if (arg1.anInt7379 > 0 && local105.anInt6048 == 0) {
					Static294.anInt7294 = -1;
					Static43.anInt896 = 0;
					arg1.anInt7380++;
					return;
				}
				if (arg1.anInt7379 <= 0 && local105.anInt6040 == 0) {
					Static43.anInt896 = 0;
					arg1.anInt7380++;
					Static294.anInt7294 = -1;
					return;
				}
			}
		}
		@Pc(219) int local219 = arg1.anInt7300;
		@Pc(222) int local222 = arg1.anInt7298;
		@Pc(241) int local241 = arg1.anIntArray658[arg1.anInt7378 - 1] * 128 + arg1.method5989() * 64;
		@Pc(258) int local258 = arg1.anIntArray657[arg1.anInt7378 - 1] * 128 + arg1.method5989() * 64;
		if (local241 > local219) {
			if (local258 > local222) {
				arg1.method5981(10240);
			} else if (local222 <= local258) {
				arg1.method5981(12288);
			} else {
				arg1.method5981(14336);
			}
		} else if (local219 <= local241) {
			if (local222 < local258) {
				arg1.method5981(8192);
			} else if (local222 > local258) {
				arg1.method5981(0);
			}
		} else if (local258 > local222) {
			arg1.method5981(6144);
		} else if (local258 >= local222) {
			arg1.method5981(4096);
		} else {
			arg1.method5981(2048);
		}
		@Pc(352) byte local352 = arg1.aByteArray96[arg1.anInt7378 - 1];
		if (!arg0 && (local241 - local219 > 256 || local241 - local219 < -256 || local258 - local222 > 256 || local258 - local222 < -256)) {
			arg1.anInt7298 = local258;
			arg1.anInt7300 = local241;
			arg1.method5988(arg1.anInt7319);
			Static43.anInt896 = 0;
			if (arg1.anInt7379 > 0) {
				arg1.anInt7379--;
			}
			arg1.anInt7378--;
			Static294.anInt7294 = -1;
			return;
		}
		@Pc(419) int local419 = 4;
		@Pc(421) boolean local421 = true;
		if (arg1 instanceof Class31_Sub2_Sub1_Sub2) {
			local421 = ((Class31_Sub2_Sub1_Sub2) arg1).aClass53_1.aBoolean99;
		}
		@Pc(439) int local439;
		if (local421) {
			local439 = arg1.anInt7319 - arg1.aClass98_7.anInt2738;
			if (local439 != 0 && arg1.anInt7372 == -1 && arg1.anInt7345 != 0) {
				local419 = 2;
			}
			if (!arg0 && arg1.anInt7378 > 2) {
				local419 = 6;
			}
			if (!arg0 && arg1.anInt7378 > 3) {
				local419 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt7378 > 1) {
				local419 = 6;
			}
			if (!arg0 && arg1.anInt7378 > 2) {
				local419 = 8;
			}
		}
		if (arg1.anInt7380 > 0 && arg1.anInt7378 > 1) {
			arg1.anInt7380--;
			local419 = 8;
		}
		if (local352 == 2) {
			local419 <<= 0x1;
		} else if (local352 == 0) {
			local419 >>= 0x1;
		}
		if (local9.anInt635 != -1) {
			local419 <<= 0x7;
			if (arg1.anInt7378 == 1) {
				local439 = arg1.anInt7377 * arg1.anInt7377;
				@Pc(569) int local569 = (local241 < arg1.anInt7300 ? arg1.anInt7300 - local241 : -arg1.anInt7300 + local241) << 7;
				@Pc(591) int local591 = (local258 >= arg1.anInt7298 ? local258 - arg1.anInt7298 : arg1.anInt7298 + -local258) << 7;
				@Pc(602) int local602 = local569 > local591 ? local569 : local591;
				@Pc(609) int local609 = local602 * local9.anInt635 * 2;
				if (local609 < local439) {
					arg1.anInt7377 /= 2;
				} else if (local602 < local439 / 2) {
					arg1.anInt7377 -= local9.anInt635;
					if (arg1.anInt7377 < 0) {
						arg1.anInt7377 = 0;
					}
				} else if (arg1.anInt7377 < local419) {
					arg1.anInt7377 += local9.anInt635;
					if (arg1.anInt7377 > local419) {
						arg1.anInt7377 = local419;
					}
				}
			} else if (arg1.anInt7377 < local419) {
				arg1.anInt7377 += local9.anInt635;
				if (local419 < arg1.anInt7377) {
					arg1.anInt7377 = local419;
				}
			} else if (arg1.anInt7377 > 0) {
				arg1.anInt7377 -= local9.anInt635;
				if (arg1.anInt7377 < 0) {
					arg1.anInt7377 = 0;
				}
			}
			local419 = arg1.anInt7377 >> 7;
			if (local419 < 1) {
				local419 = 1;
			}
		}
		Static43.anInt896 = 0;
		if (local219 < local241) {
			arg1.anInt7300 += local419;
			Static43.anInt896 |= 0x4;
			if (local241 < arg1.anInt7300) {
				arg1.anInt7300 = local241;
			}
		} else if (local241 < local219) {
			arg1.anInt7300 -= local419;
			Static43.anInt896 |= 0x8;
			if (local241 > arg1.anInt7300) {
				arg1.anInt7300 = local241;
			}
		}
		if (local222 < local258) {
			Static43.anInt896 |= 0x1;
			arg1.anInt7298 += local419;
			if (local258 < arg1.anInt7298) {
				arg1.anInt7298 = local258;
			}
		} else if (local258 < local222) {
			Static43.anInt896 |= 0x2;
			arg1.anInt7298 -= local419;
			if (arg1.anInt7298 < local258) {
				arg1.anInt7298 = local258;
			}
		}
		if (local241 == arg1.anInt7300 && local258 == arg1.anInt7298) {
			if (arg1.anInt7379 > 0) {
				arg1.anInt7379--;
			}
			arg1.anInt7378--;
		}
		if (local419 >= 8) {
			Static294.anInt7294 = 2;
		} else {
			Static294.anInt7294 = local352;
		}
	}
}
