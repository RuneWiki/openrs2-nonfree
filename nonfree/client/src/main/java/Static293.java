import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
	public static int anInt5263;

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "Lclient!kn;")
	public static Class97 aClass97_4;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
	public static int anInt5261 = 0;

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Ljava/lang/String;")
	public static String aString315 = " has logged out.";

	@OriginalMember(owner = "client!vb", name = "N", descriptor = "[I")
	public static int[] anIntArray466 = new int[4096];

	@OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
	public static int anInt5272 = 0;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!gi;B)V")
	public static void method4478(@OriginalArg(0) Class15_Sub5 arg0) {
		@Pc(13) Class11 local13 = arg0.method4698();
		arg0.anInt5569 = local13.anInt206;
		if (arg0.anInt5578 == 0) {
			arg0.anInt5519 = 0;
			return;
		}
		if (arg0.anInt5594 != -1 && arg0.anInt5585 == 0) {
			@Pc(44) Class157 local44 = Static80.method1561(arg0.anInt5594);
			if (arg0.anInt5589 > 0 && local44.anInt4528 == 0) {
				arg0.anInt5519++;
				return;
			}
			if (arg0.anInt5589 <= 0 && local44.anInt4529 == 0) {
				arg0.anInt5519++;
				return;
			}
		}
		if (arg0.anInt5510 != -1 && Static313.anInt2966 >= arg0.anInt5535) {
			@Pc(96) Class114 local96 = Static55.method978(arg0.anInt5510);
			if (local96.aBoolean235 && local96.anInt3473 != -1) {
				@Pc(109) Class157 local109 = Static80.method1561(local96.anInt3473);
				if (arg0.anInt5589 > 0 && local109.anInt4528 == 0) {
					arg0.anInt5519++;
					return;
				}
				if (arg0.anInt5589 <= 0 && local109.anInt4529 == 0) {
					arg0.anInt5519++;
					return;
				}
			}
		}
		@Pc(146) int local146 = arg0.anInt5559;
		@Pc(149) int local149 = arg0.anInt5557;
		@Pc(165) int local165 = arg0.anIntArray501[arg0.anInt5578 - 1] * 128 + arg0.method4702() * 64;
		@Pc(181) int local181 = arg0.anIntArray504[arg0.anInt5578 - 1] * 128 + arg0.method4702() * 64;
		if (local165 - local146 > 256 || local165 - local146 < -256 || local181 - local149 > 256 || local181 - local149 < -256) {
			arg0.anInt5557 = local181;
			arg0.anInt5559 = local165;
			return;
		}
		if (local165 > local146) {
			if (local181 > local149) {
				arg0.anInt5593 = 1280;
			} else if (local181 >= local149) {
				arg0.anInt5593 = 1536;
			} else {
				arg0.anInt5593 = 1792;
			}
		} else if (local165 >= local146) {
			if (local181 > local149) {
				arg0.anInt5593 = 1024;
			} else if (local181 < local149) {
				arg0.anInt5593 = 0;
			}
		} else if (local149 < local181) {
			arg0.anInt5593 = 768;
		} else if (local149 <= local181) {
			arg0.anInt5593 = 512;
		} else {
			arg0.anInt5593 = 256;
		}
		@Pc(300) int local300 = arg0.anInt5593 - arg0.anInt5554 & 0x7FF;
		@Pc(302) int local302 = 4;
		@Pc(304) byte local304 = 1;
		if (local300 > 1024) {
			local300 -= 2048;
		}
		@Pc(310) boolean local310 = true;
		@Pc(313) int local313 = local13.anInt207;
		if (local300 >= -256 && local300 <= 256) {
			local313 = local13.anInt200;
		} else if (local300 >= 256 && local300 < 768) {
			local313 = local13.anInt188;
		} else if (local300 >= -768 && local300 <= -256) {
			local313 = local13.anInt210;
		}
		if (local313 == -1) {
			local313 = local13.anInt200;
		}
		arg0.anInt5569 = local313;
		if (arg0 instanceof Class15_Sub5_Sub1) {
			local310 = ((Class15_Sub5_Sub1) arg0).aClass99_1.aBoolean187;
		}
		if (local310) {
			if (arg0.anInt5593 != arg0.anInt5554 && arg0.anInt5581 == -1 && arg0.anInt5529 != 0) {
				local302 = 2;
			}
			if (arg0.anInt5578 > 2) {
				local302 = 6;
			}
			if (arg0.anInt5578 > 3) {
				local302 = 8;
			}
			if (arg0.anInt5519 > 0 && arg0.anInt5578 > 1) {
				local302 = 8;
				arg0.anInt5519--;
			}
		} else {
			if (arg0.anInt5578 > 1) {
				local302 = 6;
			}
			if (arg0.anInt5578 > 2) {
				local302 = 8;
			}
			if (arg0.anInt5519 > 0 && arg0.anInt5578 > 1) {
				arg0.anInt5519--;
				local302 = 8;
			}
		}
		if (arg0.aByteArray73[arg0.anInt5578 - 1] == 2) {
			local302 <<= 0x1;
			local304 = 2;
		} else if (arg0.aByteArray73[arg0.anInt5578 - 1] == 0) {
			local304 = 0;
			local302 >>= 0x1;
		}
		if (local302 < 8 || local13.anInt187 == -1) {
			if (local13.anInt190 != -1 && local304 == 0) {
				if (arg0.anInt5569 == local13.anInt207 && local13.anInt197 != -1) {
					arg0.anInt5569 = local13.anInt197;
				} else if (local13.anInt210 == arg0.anInt5569 && local13.anInt192 != -1) {
					arg0.anInt5569 = local13.anInt192;
				} else if (arg0.anInt5569 == local13.anInt188 && local13.anInt181 != -1) {
					arg0.anInt5569 = local13.anInt181;
				} else {
					arg0.anInt5569 = local13.anInt190;
				}
			}
		} else if (arg0.anInt5569 == local13.anInt207 && local13.anInt193 != -1) {
			arg0.anInt5569 = local13.anInt193;
		} else if (local13.anInt210 == arg0.anInt5569 && local13.anInt191 != -1) {
			arg0.anInt5569 = local13.anInt191;
		} else if (local13.anInt188 == arg0.anInt5569 && local13.anInt212 != -1) {
			arg0.anInt5569 = local13.anInt212;
		} else {
			arg0.anInt5569 = local13.anInt187;
		}
		if (local13.anInt196 != -1) {
			local302 <<= 0x7;
			if (arg0.anInt5578 == 1) {
				@Pc(655) int local655 = arg0.anInt5524 * arg0.anInt5524;
				@Pc(677) int local677 = (local165 >= arg0.anInt5559 ? local165 - arg0.anInt5559 : -local165 + arg0.anInt5559) << 7;
				@Pc(698) int local698 = (local181 < arg0.anInt5557 ? arg0.anInt5557 - local181 : local181 - arg0.anInt5557) << 7;
				@Pc(705) int local705 = local677 <= local698 ? local698 : local677;
				@Pc(712) int local712 = local13.anInt196 * 2 * local705;
				if (local655 > local712) {
					arg0.anInt5524 /= 2;
				} else if (local705 < local655 / 2) {
					arg0.anInt5524 -= local13.anInt196;
					if (arg0.anInt5524 < 0) {
						arg0.anInt5524 = 0;
					}
				} else if (arg0.anInt5524 < local302) {
					arg0.anInt5524 += local13.anInt196;
					if (local302 < arg0.anInt5524) {
						arg0.anInt5524 = local302;
					}
				}
			} else if (arg0.anInt5524 < local302) {
				arg0.anInt5524 += local13.anInt196;
				if (arg0.anInt5524 > local302) {
					arg0.anInt5524 = local302;
				}
			} else if (arg0.anInt5524 > 0) {
				arg0.anInt5524 -= local13.anInt196;
				if (arg0.anInt5524 < 0) {
					arg0.anInt5524 = 0;
				}
			}
			local302 = arg0.anInt5524 >> 7;
			if (local302 < 1) {
				local302 = 1;
			}
		}
		if (local149 < local181) {
			arg0.anInt5557 += local302;
			if (local181 < arg0.anInt5557) {
				arg0.anInt5557 = local181;
			}
		} else if (local181 < local149) {
			arg0.anInt5557 -= local302;
			if (local181 > arg0.anInt5557) {
				arg0.anInt5557 = local181;
			}
		}
		if (local146 < local165) {
			arg0.anInt5559 += local302;
			if (arg0.anInt5559 > local165) {
				arg0.anInt5559 = local165;
			}
		} else if (local165 < local146) {
			arg0.anInt5559 -= local302;
			if (local165 > arg0.anInt5559) {
				arg0.anInt5559 = local165;
			}
		}
		if (local165 == arg0.anInt5559 && local181 == arg0.anInt5557) {
			if (arg0.anInt5589 > 0) {
				arg0.anInt5589--;
			}
			arg0.anInt5578--;
		}
	}
}
