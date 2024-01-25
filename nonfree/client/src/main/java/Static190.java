import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "Lclient!bm;")
	public static Class28 aClass28_5;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	public static int anInt3695 = 0;

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!co;BZ)V")
	public static void method3000(@OriginalArg(0) Class3_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class156 local9 = arg0.method4925();
		if (arg0.anInt6206 == 0) {
			arg0.anInt6203 = 0;
			Static413.anInt6892 = -1;
			Static171.anInt3396 = 0;
			return;
		}
		if (arg0.anInt6163 != -1 && arg0.anInt6139 == 0) {
			@Pc(37) Class250 local37 = Static338.aClass12_2.method255(arg0.anInt6163);
			if (arg0.anInt6204 > 0 && local37.anInt7013 == 0) {
				Static413.anInt6892 = -1;
				arg0.anInt6203++;
				Static171.anInt3396 = 0;
				return;
			}
			if (arg0.anInt6204 <= 0 && local37.anInt7021 == 0) {
				Static171.anInt3396 = 0;
				Static413.anInt6892 = -1;
				arg0.anInt6203++;
				return;
			}
		}
		@Pc(103) Class250 local103;
		@Pc(89) Class203 local89;
		if (arg0.anInt6150 != -1 && Static131.anInt2821 >= arg0.anInt6186) {
			local89 = Static395.aClass247_2.method5407(arg0.anInt6150);
			if (local89.aBoolean398 && local89.anInt5615 != -1) {
				local103 = Static338.aClass12_2.method255(local89.anInt5615);
				if (arg0.anInt6204 > 0 && local103.anInt7013 == 0) {
					Static171.anInt3396 = 0;
					Static413.anInt6892 = -1;
					arg0.anInt6203++;
					return;
				}
				if (arg0.anInt6204 <= 0 && local103.anInt7021 == 0) {
					Static171.anInt3396 = 0;
					Static413.anInt6892 = -1;
					arg0.anInt6203++;
					return;
				}
			}
		}
		if (arg0.anInt6150 != -1 && Static131.anInt2821 >= arg0.anInt6186) {
			local89 = Static395.aClass247_2.method5407(arg0.anInt6150);
			if (local89.aBoolean398 && local89.anInt5615 != -1) {
				local103 = Static338.aClass12_2.method255(local89.anInt5615);
				if (arg0.anInt6204 > 0 && local103.anInt7013 == 0) {
					Static413.anInt6892 = -1;
					Static171.anInt3396 = 0;
					arg0.anInt6203++;
					return;
				}
				if (arg0.anInt6204 <= 0 && local103.anInt7021 == 0) {
					Static171.anInt3396 = 0;
					arg0.anInt6203++;
					Static413.anInt6892 = -1;
					return;
				}
			}
		}
		@Pc(214) int local214 = arg0.anInt6119;
		@Pc(217) int local217 = arg0.anInt6121;
		@Pc(237) int local237 = arg0.anIntArray525[arg0.anInt6206 - 1] * 128 + arg0.method4935() * 64;
		@Pc(253) int local253 = arg0.anIntArray524[arg0.anInt6206 - 1] * 128 + arg0.method4935() * 64;
		if (local214 >= local237) {
			if (local237 >= local214) {
				if (local253 > local217) {
					arg0.method4928(8192);
				} else if (local217 > local253) {
					arg0.method4928(0);
				}
			} else if (local217 < local253) {
				arg0.method4928(6144);
			} else if (local253 >= local217) {
				arg0.method4928(4096);
			} else {
				arg0.method4928(2048);
			}
		} else if (local217 < local253) {
			arg0.method4928(10240);
		} else if (local253 < local217) {
			arg0.method4928(14336);
		} else {
			arg0.method4928(12288);
		}
		@Pc(347) byte local347 = arg0.aByteArray119[arg0.anInt6206 - 1];
		if (!arg1 && (local237 - local214 > 256 || local237 - local214 < -256 || local253 - local217 > 256 || local253 - local217 < -256)) {
			arg0.anInt6121 = local253;
			arg0.anInt6119 = local237;
			arg0.method4921(arg0.anInt6159);
			arg0.anInt6206--;
			Static171.anInt3396 = 0;
			Static413.anInt6892 = -1;
			if (arg0.anInt6204 > 0) {
				arg0.anInt6204--;
			}
			return;
		}
		@Pc(410) int local410 = 4;
		@Pc(412) boolean local412 = true;
		if (arg0 instanceof Class3_Sub2_Sub1_Sub1) {
			local412 = ((Class3_Sub2_Sub1_Sub1) arg0).aClass65_1.aBoolean143;
		}
		@Pc(448) int local448;
		if (local412) {
			local448 = arg0.anInt6159 - arg0.aClass266_7.anInt7236;
			if (local448 != 0 && arg0.anInt6167 == -1 && arg0.anInt6138 != 0) {
				local410 = 2;
			}
			if (!arg1 && arg0.anInt6206 > 2) {
				local410 = 6;
			}
			if (!arg1 && arg0.anInt6206 > 3) {
				local410 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt6206 > 1) {
				local410 = 6;
			}
			if (!arg1 && arg0.anInt6206 > 2) {
				local410 = 8;
			}
		}
		if (arg0.anInt6203 > 0 && arg0.anInt6206 > 1) {
			local410 = 8;
			arg0.anInt6203--;
		}
		if (local347 == 2) {
			local410 <<= 0x1;
		} else if (local347 == 0) {
			local410 >>= 0x1;
		}
		Static171.anInt3396 = 0;
		if (local9.anInt4466 != -1) {
			local410 <<= 0x7;
			if (arg0.anInt6206 == 1) {
				local448 = arg0.anInt6205 * arg0.anInt6205;
				@Pc(590) int local590 = (local237 >= arg0.anInt6119 ? local237 - arg0.anInt6119 : arg0.anInt6119 + -local237) << 7;
				@Pc(611) int local611 = (arg0.anInt6121 <= local253 ? local253 - arg0.anInt6121 : arg0.anInt6121 + -local253) << 7;
				@Pc(618) int local618 = local611 < local590 ? local590 : local611;
				@Pc(625) int local625 = local9.anInt4466 * 2 * local618;
				if (local625 < local448) {
					arg0.anInt6205 /= 2;
				} else if (local448 / 2 > local618) {
					arg0.anInt6205 -= local9.anInt4466;
					if (arg0.anInt6205 < 0) {
						arg0.anInt6205 = 0;
					}
				} else if (local410 > arg0.anInt6205) {
					arg0.anInt6205 += local9.anInt4466;
					if (arg0.anInt6205 > local410) {
						arg0.anInt6205 = local410;
					}
				}
			} else if (arg0.anInt6205 < local410) {
				arg0.anInt6205 += local9.anInt4466;
				if (arg0.anInt6205 > local410) {
					arg0.anInt6205 = local410;
				}
			} else if (arg0.anInt6205 > 0) {
				arg0.anInt6205 -= local9.anInt4466;
				if (arg0.anInt6205 < 0) {
					arg0.anInt6205 = 0;
				}
			}
			local410 = arg0.anInt6205 >> 7;
			if (local410 < 1) {
				local410 = 1;
			}
		}
		if (local214 < local237) {
			Static171.anInt3396 |= 0x4;
			arg0.anInt6119 += local410;
			if (arg0.anInt6119 > local237) {
				arg0.anInt6119 = local237;
			}
		} else if (local214 > local237) {
			Static171.anInt3396 |= 0x8;
			arg0.anInt6119 -= local410;
			if (local237 > arg0.anInt6119) {
				arg0.anInt6119 = local237;
			}
		}
		if (local217 < local253) {
			arg0.anInt6121 += local410;
			Static171.anInt3396 |= 0x1;
			if (arg0.anInt6121 > local253) {
				arg0.anInt6121 = local253;
			}
		} else if (local217 > local253) {
			arg0.anInt6121 -= local410;
			Static171.anInt3396 |= 0x2;
			if (local253 > arg0.anInt6121) {
				arg0.anInt6121 = local253;
			}
		}
		if (local410 >= 8) {
			Static413.anInt6892 = 2;
		} else {
			Static413.anInt6892 = local347;
		}
		if (arg0.anInt6119 == local237 && arg0.anInt6121 == local253) {
			if (arg0.anInt6204 > 0) {
				arg0.anInt6204--;
			}
			arg0.anInt6206--;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!mg;)V")
	public static void method3001(@OriginalArg(1) Class160 arg0) {
		Static416.aClass160_80 = arg0;
	}
}
