import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray37;

	@OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
	public static int anInt9150;

	@OriginalMember(owner = "client!ek", name = "Db", descriptor = "I")
	public static int anInt9178;

	@OriginalMember(owner = "client!ek", name = "Lb", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
	public static int anInt9123 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lclient!ufa;BZ)V")
	public static void method7021(@OriginalArg(0) Class21_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class252 local9 = arg0.method3322();
		if (arg0.anInt4277 == 0) {
			Static203.anInt4167 = 0;
			Static470.anInt8940 = -1;
			arg0.anInt4279 = 0;
			return;
		}
		if (arg0.anInt4209 != -1 && arg0.anInt4214 == 0) {
			@Pc(36) Class111 local36 = Static17.aClass254_1.method5936(arg0.anInt4209);
			if (arg0.anInt4280 > 0 && local36.anInt3147 == 0) {
				Static203.anInt4167 = 0;
				arg0.anInt4279++;
				Static470.anInt8940 = -1;
				return;
			}
			if (arg0.anInt4280 <= 0 && local36.anInt3150 == 0) {
				arg0.anInt4279++;
				Static470.anInt8940 = -1;
				Static203.anInt4167 = 0;
				return;
			}
		}
		@Pc(105) Class111 local105;
		@Pc(91) Class49 local91;
		if (arg0.anInt4233 != -1 && Static306.anInt6122 >= arg0.anInt4231) {
			local91 = Static342.aClass132_2.method2958(arg0.anInt4233);
			if (local91.aBoolean119 && local91.anInt1459 != -1) {
				local105 = Static17.aClass254_1.method5936(local91.anInt1459);
				if (arg0.anInt4280 > 0 && local105.anInt3147 == 0) {
					Static470.anInt8940 = -1;
					arg0.anInt4279++;
					Static203.anInt4167 = 0;
					return;
				}
				if (arg0.anInt4280 <= 0 && local105.anInt3150 == 0) {
					Static203.anInt4167 = 0;
					arg0.anInt4279++;
					Static470.anInt8940 = -1;
					return;
				}
			}
		}
		if (arg0.anInt4233 != -1 && Static306.anInt6122 >= arg0.anInt4231) {
			local91 = Static342.aClass132_2.method2958(arg0.anInt4233);
			if (local91.aBoolean119 && local91.anInt1459 != -1) {
				local105 = Static17.aClass254_1.method5936(local91.anInt1459);
				if (arg0.anInt4280 > 0 && local105.anInt3147 == 0) {
					Static203.anInt4167 = 0;
					arg0.anInt4279++;
					Static470.anInt8940 = -1;
					return;
				}
				if (arg0.anInt4280 <= 0 && local105.anInt3150 == 0) {
					arg0.anInt4279++;
					Static470.anInt8940 = -1;
					Static203.anInt4167 = 0;
					return;
				}
			}
		}
		@Pc(218) int local218 = arg0.anInt10551;
		@Pc(221) int local221 = arg0.anInt10550;
		@Pc(237) int local237 = arg0.anIntArray206[arg0.anInt4277 - 1] * 512 + arg0.method3339() * 256;
		@Pc(254) int local254 = arg0.anIntArray207[arg0.anInt4277 - 1] * 512 + arg0.method3339() * 256;
		if (local237 > local218) {
			if (local221 < local254) {
				arg0.method3325(10240);
			} else if (local221 <= local254) {
				arg0.method3325(12288);
			} else {
				arg0.method3325(14336);
			}
		} else if (local218 > local237) {
			if (local254 > local221) {
				arg0.method3325(6144);
			} else if (local254 < local221) {
				arg0.method3325(2048);
			} else {
				arg0.method3325(4096);
			}
		} else if (local221 < local254) {
			arg0.method3325(8192);
		} else if (local254 < local221) {
			arg0.method3325(0);
		}
		@Pc(360) byte local360 = arg0.aByteArray34[arg0.anInt4277 - 1];
		if (!arg1 && (local237 - local218 > 1024 || local237 - local218 < -1024 || local254 - local221 > 1024 || local254 - local221 < -1024)) {
			arg0.anInt10551 = local237;
			arg0.anInt10550 = local254;
			arg0.method3340(false, arg0.anInt4228);
			Static470.anInt8940 = -1;
			if (arg0.anInt4280 > 0) {
				arg0.anInt4280--;
			}
			arg0.anInt4277--;
			Static203.anInt4167 = 0;
			return;
		}
		@Pc(424) int local424 = 16;
		@Pc(426) boolean local426 = true;
		if (arg0 instanceof Class21_Sub1_Sub1_Sub1_Sub1) {
			local426 = ((Class21_Sub1_Sub1_Sub1_Sub1) arg0).aClass51_1.aBoolean133;
		}
		@Pc(466) int local466;
		if (local426) {
			local466 = arg0.anInt4228 - arg0.aClass133_7.anInt3807;
			if (local466 != 0 && arg0.anInt4263 == -1 && arg0.anInt4255 != 0) {
				local424 = 8;
			}
			if (!arg1 && arg0.anInt4277 > 2) {
				local424 = 24;
			}
			if (!arg1 && arg0.anInt4277 > 3) {
				local424 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt4277 > 1) {
				local424 = 24;
			}
			if (!arg1 && arg0.anInt4277 > 2) {
				local424 = 32;
			}
		}
		if (arg0.anInt4279 > 0 && arg0.anInt4277 > 1) {
			local424 = 32;
			arg0.anInt4279--;
		}
		if (local360 == 2) {
			local424 <<= 0x1;
		} else if (local360 == 0) {
			local424 >>= 0x1;
		}
		if (local9.anInt7489 != -1) {
			local424 <<= 0x9;
			if (arg0.anInt4277 == 1) {
				local466 = arg0.anInt4278 * arg0.anInt4278;
				@Pc(570) int local570 = (arg0.anInt10551 > local237 ? arg0.anInt10551 - local237 : local237 - arg0.anInt10551) << 9;
				@Pc(592) int local592 = (arg0.anInt10550 > local254 ? arg0.anInt10550 - local254 : -arg0.anInt10550 + local254) << 9;
				@Pc(603) int local603 = local592 < local570 ? local570 : local592;
				@Pc(610) int local610 = local603 * local9.anInt7489 * 2;
				if (local610 < local466) {
					arg0.anInt4278 /= 2;
				} else if (local603 < local466 / 2) {
					arg0.anInt4278 -= local9.anInt7489;
					if (arg0.anInt4278 < 0) {
						arg0.anInt4278 = 0;
					}
				} else if (arg0.anInt4278 < local424) {
					arg0.anInt4278 += local9.anInt7489;
					if (arg0.anInt4278 > local424) {
						arg0.anInt4278 = local424;
					}
				}
			} else if (arg0.anInt4278 < local424) {
				arg0.anInt4278 += local9.anInt7489;
				if (arg0.anInt4278 > local424) {
					arg0.anInt4278 = local424;
				}
			} else if (arg0.anInt4278 > 0) {
				arg0.anInt4278 -= local9.anInt7489;
				if (arg0.anInt4278 < 0) {
					arg0.anInt4278 = 0;
				}
			}
			local424 = arg0.anInt4278 >> 9;
			if (local424 < 1) {
				local424 = 1;
			}
		}
		Static203.anInt4167 = 0;
		if (local237 == local218 && local221 == local254) {
			Static470.anInt8940 = -1;
		} else {
			if (local218 < local237) {
				arg0.anInt10551 += local424;
				Static203.anInt4167 |= 0x4;
				if (arg0.anInt10551 > local237) {
					arg0.anInt10551 = local237;
				}
			} else if (local218 > local237) {
				arg0.anInt10551 -= local424;
				Static203.anInt4167 |= 0x8;
				if (local237 > arg0.anInt10551) {
					arg0.anInt10551 = local237;
				}
			}
			if (local424 >= 32) {
				Static470.anInt8940 = 2;
			} else {
				Static470.anInt8940 = local360;
			}
			if (local254 > local221) {
				arg0.anInt10550 += local424;
				Static203.anInt4167 |= 0x1;
				if (local254 < arg0.anInt10550) {
					arg0.anInt10550 = local254;
				}
			} else if (local221 > local254) {
				Static203.anInt4167 |= 0x2;
				arg0.anInt10550 -= local424;
				if (local254 > arg0.anInt10550) {
					arg0.anInt10550 = local254;
				}
			}
		}
		if (arg0.anInt10551 != local237 || arg0.anInt10550 != local254) {
			return;
		}
		arg0.anInt4277--;
		if (arg0.anInt4280 > 0) {
			arg0.anInt4280--;
			return;
		}
	}
}
