import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static297 {

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IZLclient!sj;)V")
	public static void method4183(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class4_Sub2_Sub1_Sub2 arg1) {
		@Pc(9) Class49 local9 = arg1.method2064(-107);
		if (arg1.anInt2371 == 0) {
			arg1.anInt2369 = 0;
			Static668.anInt10394 = 0;
			Static4.anInt42 = -1;
			return;
		}
		if (arg1.aClass53_7.method4094() && !arg1.aClass53_7.method4075()) {
			@Pc(38) Class307 local38 = arg1.aClass53_7.method4074();
			if (arg1.anInt2370 > 0 && local38.anInt8123 == 0) {
				Static668.anInt10394 = 0;
				arg1.anInt2369++;
				Static4.anInt42 = -1;
				return;
			}
			if (arg1.anInt2370 <= 0 && local38.anInt8130 == 0) {
				Static4.anInt42 = -1;
				arg1.anInt2369++;
				Static668.anInt10394 = 0;
				return;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < arg1.aClass315Array3.length; local89++) {
			if (arg1.aClass315Array3[local89].anInt8456 != -1 && arg1.aClass315Array3[local89].aClass53_10.method4075()) {
				@Pc(119) Class347 local119 = Static119.aClass209_1.method4570(arg1.aClass315Array3[local89].anInt8456);
				if (local119.aBoolean800 && local119.anInt9356 != -1) {
					@Pc(136) Class307 local136 = Static89.aClass274_1.method6626(local119.anInt9356);
					if (arg1.anInt2370 > 0 && local136.anInt8123 == 0) {
						Static668.anInt10394 = 0;
						arg1.anInt2369++;
						Static4.anInt42 = -1;
						return;
					}
					if (arg1.anInt2370 <= 0 && local136.anInt8130 == 0) {
						Static668.anInt10394 = 0;
						Static4.anInt42 = -1;
						arg1.anInt2369++;
						return;
					}
				}
			}
		}
		@Pc(195) int local195 = arg1.anInt10229;
		@Pc(198) int local198 = arg1.anInt10228;
		@Pc(215) int local215 = arg1.anIntArray183[arg1.anInt2371 - 1] * 512 + arg1.method2046() * 256;
		@Pc(234) int local234 = arg1.anIntArray182[arg1.anInt2371 - 1] * 512 + arg1.method2046() * 256;
		if (local215 <= local195) {
			if (local215 < local195) {
				if (local234 > local198) {
					arg1.method2056(6144);
				} else if (local234 >= local198) {
					arg1.method2056(4096);
				} else {
					arg1.method2056(2048);
				}
			} else if (local198 < local234) {
				arg1.method2056(8192);
			} else if (local198 > local234) {
				arg1.method2056(0);
			}
		} else if (local234 > local198) {
			arg1.method2056(10240);
		} else if (local234 < local198) {
			arg1.method2056(14336);
		} else {
			arg1.method2056(12288);
		}
		@Pc(356) byte local356 = arg1.aByteArray27[arg1.anInt2371 - 1];
		if (!arg0 && (local215 - local195 > 1024 || local215 - local195 < -1024 || local234 - local198 > 1024 || local234 - local198 < -1024)) {
			arg1.anInt10229 = local215;
			arg1.anInt10228 = local234;
			arg1.method2054(false, arg1.anInt2355);
			arg1.anInt2371--;
			Static4.anInt42 = -1;
			Static668.anInt10394 = 0;
			if (arg1.anInt2370 > 0) {
				arg1.anInt2370--;
			}
			return;
		}
		@Pc(436) int local436 = 16;
		@Pc(438) boolean local438 = true;
		if (arg1 instanceof Class4_Sub2_Sub1_Sub2_Sub2) {
			local438 = ((Class4_Sub2_Sub1_Sub2_Sub2) arg1).aClass261_1.aBoolean589;
		}
		@Pc(456) int local456;
		if (local438) {
			local456 = arg1.anInt2355 - arg1.aClass178_7.anInt4197;
			if (local456 != 0 && arg1.anInt2348 == -1 && arg1.anInt2357 != 0) {
				local436 = 8;
			}
			if (!arg0 && arg1.anInt2371 > 2) {
				local436 = 24;
			}
			if (!arg0 && arg1.anInt2371 > 3) {
				local436 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt2371 > 1) {
				local436 = 24;
			}
			if (!arg0 && arg1.anInt2371 > 2) {
				local436 = 32;
			}
		}
		if (arg1.anInt2369 > 0 && arg1.anInt2371 > 1) {
			local436 = 32;
			arg1.anInt2369--;
		}
		if (local356 == 2) {
			local436 <<= 0x1;
		} else if (local356 == 0) {
			local436 >>= 0x1;
		}
		Static668.anInt10394 = 0;
		if (local9.anInt1075 != -1) {
			local436 <<= 0x9;
			if (arg1.anInt2371 == 1) {
				local456 = arg1.anInt2368 * arg1.anInt2368;
				@Pc(602) int local602 = (local215 >= arg1.anInt10229 ? local215 - arg1.anInt10229 : arg1.anInt10229 - local215) << 9;
				@Pc(620) int local620 = (arg1.anInt10228 > local234 ? arg1.anInt10228 - local234 : -arg1.anInt10228 + local234) << 9;
				@Pc(632) int local632 = local620 >= local602 ? local620 : local602;
				@Pc(639) int local639 = local632 * local9.anInt1075 * 2;
				if (local639 < local456) {
					arg1.anInt2368 /= 2;
				} else if (local456 / 2 > local632) {
					arg1.anInt2368 -= local9.anInt1075;
					if (arg1.anInt2368 < 0) {
						arg1.anInt2368 = 0;
					}
				} else if (arg1.anInt2368 < local436) {
					arg1.anInt2368 += local9.anInt1075;
					if (arg1.anInt2368 > local436) {
						arg1.anInt2368 = local436;
					}
				}
			} else if (arg1.anInt2368 < local436) {
				arg1.anInt2368 += local9.anInt1075;
				if (arg1.anInt2368 > local436) {
					arg1.anInt2368 = local436;
				}
			} else if (arg1.anInt2368 > 0) {
				arg1.anInt2368 -= local9.anInt1075;
				if (arg1.anInt2368 < 0) {
					arg1.anInt2368 = 0;
				}
			}
			local436 = arg1.anInt2368 >> 9;
			if (local436 < 1) {
				local436 = 1;
			}
		}
		if (local195 == local215 && local198 == local234) {
			Static4.anInt42 = -1;
		} else {
			if (local195 < local215) {
				arg1.anInt10229 += local436;
				Static668.anInt10394 |= 0x4;
				if (local215 < arg1.anInt10229) {
					arg1.anInt10229 = local215;
				}
			} else if (local215 < local195) {
				Static668.anInt10394 |= 0x8;
				arg1.anInt10229 -= local436;
				if (arg1.anInt10229 < local215) {
					arg1.anInt10229 = local215;
				}
			}
			if (local436 < 32) {
				Static4.anInt42 = local356;
			} else {
				Static4.anInt42 = 2;
			}
			if (local234 > local198) {
				arg1.anInt10228 += local436;
				Static668.anInt10394 |= 0x1;
				if (local234 < arg1.anInt10228) {
					arg1.anInt10228 = local234;
				}
			} else if (local198 > local234) {
				arg1.anInt10228 -= local436;
				Static668.anInt10394 |= 0x2;
				if (arg1.anInt10228 < local234) {
					arg1.anInt10228 = local234;
				}
			}
		}
		if (local215 != arg1.anInt10229 || arg1.anInt10228 != local234) {
			return;
		}
		arg1.anInt2371--;
		if (arg1.anInt2370 > 0) {
			arg1.anInt2370--;
			return;
		}
	}
}
