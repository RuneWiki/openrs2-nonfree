import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!id", name = "h", descriptor = "Lclient!dp;")
	public static Class53 aClass53_75;

	@OriginalMember(owner = "client!id", name = "b", descriptor = "I")
	public static int anInt2374 = 0;

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BLclient!pe;Z)V")
	public static void method2527(@OriginalArg(1) Class44_Sub4_Sub4 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class128 local9 = arg0.method4716();
		if (arg0.anInt5156 == 0) {
			Static87.anInt1612 = 0;
			arg0.anInt5155 = 0;
			Static289.anInt5439 = -1;
			return;
		}
		if (arg0.anInt5099 != -1 && arg0.anInt5118 == 0) {
			@Pc(38) Class24 local38 = Static209.method3737(arg0.anInt5099);
			if (arg0.anInt5158 > 0 && local38.anInt595 == 0) {
				arg0.anInt5155++;
				Static87.anInt1612 = 0;
				Static289.anInt5439 = -1;
				return;
			}
			if (arg0.anInt5158 <= 0 && local38.anInt587 == 0) {
				Static289.anInt5439 = -1;
				Static87.anInt1612 = 0;
				arg0.anInt5155++;
				return;
			}
		}
		if (arg0.anInt5148 != -1 && arg0.anInt5088 <= Static76.anInt2853) {
			@Pc(106) Class166 local106 = Static62.method999(arg0.anInt5148);
			if (local106.aBoolean336 && local106.anInt4753 != -1) {
				@Pc(119) Class24 local119 = Static209.method3737(local106.anInt4753);
				if (arg0.anInt5158 > 0 && local119.anInt595 == 0) {
					Static289.anInt5439 = -1;
					Static87.anInt1612 = 0;
					arg0.anInt5155++;
					return;
				}
				if (arg0.anInt5158 <= 0 && local119.anInt587 == 0) {
					arg0.anInt5155++;
					Static87.anInt1612 = 0;
					Static289.anInt5439 = -1;
					return;
				}
			}
		}
		@Pc(162) int local162 = arg0.anInt6340;
		@Pc(165) int local165 = arg0.anInt6339;
		@Pc(182) int local182 = arg0.anIntArray560[arg0.anInt5156 - 1] * 128 + arg0.method4714() * 64;
		@Pc(198) int local198 = arg0.anIntArray561[arg0.anInt5156 - 1] * 128 + arg0.method4714() * 64;
		if (!arg1 && (local182 - local162 > 256 || local182 - local162 < -256 || local198 - local165 > 256 || local198 - local165 < -256)) {
			arg0.anInt6340 = local182;
			Static87.anInt1612 = 0;
			Static289.anInt5439 = -1;
			arg0.anInt6339 = local198;
			return;
		}
		if (local182 <= local162) {
			if (local162 <= local182) {
				if (local198 > local165) {
					arg0.method4706(8192);
				} else if (local165 > local198) {
					arg0.method4706(0);
				}
			} else if (local198 > local165) {
				arg0.method4706(6144);
			} else if (local165 <= local198) {
				arg0.method4706(4096);
			} else {
				arg0.method4706(2048);
			}
		} else if (local198 > local165) {
			arg0.method4706(10240);
		} else if (local165 > local198) {
			arg0.method4706(14336);
		} else {
			arg0.method4706(12288);
		}
		@Pc(321) int local321 = 4;
		@Pc(323) boolean local323 = true;
		if (arg0 instanceof Class44_Sub4_Sub4_Sub2) {
			local323 = ((Class44_Sub4_Sub4_Sub2) arg0).aClass18_1.aBoolean32;
		}
		if (local323) {
			@Pc(361) int local361 = arg0.anInt5089 - arg0.aClass219_7.anInt6305;
			if (local361 != 0 && arg0.anInt5103 == -1 && arg0.anInt5121 != 0) {
				local321 = 2;
			}
			if (!arg1 && arg0.anInt5156 > 2) {
				local321 = 6;
			}
			if (!arg1 && arg0.anInt5156 > 3) {
				local321 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt5156 > 1) {
				local321 = 6;
			}
			if (!arg1 && arg0.anInt5156 > 2) {
				local321 = 8;
			}
		}
		if (arg0.anInt5155 > 0 && arg0.anInt5156 > 1) {
			local321 = 8;
			arg0.anInt5155--;
		}
		@Pc(420) byte local420 = arg0.aByteArray83[arg0.anInt5156 - 1];
		if (local420 == 2) {
			local321 <<= 0x1;
		} else if (local420 == 0) {
			local321 >>= 0x1;
		}
		Static87.anInt1612 = 0;
		if (local9.anInt3373 != -1) {
			local321 <<= 0x7;
			if (arg0.anInt5156 == 1) {
				@Pc(500) int local500 = arg0.anInt5159 * arg0.anInt5159;
				@Pc(516) int local516 = (arg0.anInt6340 <= local182 ? local182 - arg0.anInt6340 : arg0.anInt6340 - local182) << 7;
				@Pc(537) int local537 = (arg0.anInt6339 > local198 ? arg0.anInt6339 - local198 : local198 - arg0.anInt6339) << 7;
				@Pc(548) int local548 = local537 < local516 ? local516 : local537;
				@Pc(555) int local555 = local548 * local9.anInt3373 * 2;
				if (local555 < local500) {
					arg0.anInt5159 /= 2;
				} else if (local500 / 2 > local548) {
					arg0.anInt5159 -= local9.anInt3373;
					if (arg0.anInt5159 < 0) {
						arg0.anInt5159 = 0;
					}
				} else if (local321 > arg0.anInt5159) {
					arg0.anInt5159 += local9.anInt3373;
					if (local321 < arg0.anInt5159) {
						arg0.anInt5159 = local321;
					}
				}
			} else if (local321 > arg0.anInt5159) {
				arg0.anInt5159 += local9.anInt3373;
				if (arg0.anInt5159 > local321) {
					arg0.anInt5159 = local321;
				}
			} else if (arg0.anInt5159 > 0) {
				arg0.anInt5159 -= local9.anInt3373;
				if (arg0.anInt5159 < 0) {
					arg0.anInt5159 = 0;
				}
			}
			local321 = arg0.anInt5159 >> 7;
			if (local321 < 1) {
				local321 = 1;
			}
		}
		if (local162 < local182) {
			Static87.anInt1612 |= 0x4;
			arg0.anInt6340 += local321;
			if (local182 < arg0.anInt6340) {
				arg0.anInt6340 = local182;
			}
		} else if (local182 < local162) {
			Static87.anInt1612 |= 0x8;
			arg0.anInt6340 -= local321;
			if (local182 > arg0.anInt6340) {
				arg0.anInt6340 = local182;
			}
		}
		if (local198 > local165) {
			Static87.anInt1612 |= 0x1;
			arg0.anInt6339 += local321;
			if (arg0.anInt6339 > local198) {
				arg0.anInt6339 = local198;
			}
		} else if (local198 < local165) {
			arg0.anInt6339 -= local321;
			Static87.anInt1612 |= 0x2;
			if (arg0.anInt6339 < local198) {
				arg0.anInt6339 = local198;
			}
		}
		if (local182 == arg0.anInt6340 && local198 == arg0.anInt6339) {
			arg0.anInt5156--;
			if (arg0.anInt5158 > 0) {
				arg0.anInt5158--;
			}
		}
		if (local321 >= 8) {
			Static289.anInt5439 = 2;
		} else {
			Static289.anInt5439 = local420;
		}
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(BC)Z")
	public static boolean method2532(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)V")
	public static void method2533() {
		Static43.aClass70_22.method1397(5);
		Static113.aClass70_37.method1397(5);
	}
}
