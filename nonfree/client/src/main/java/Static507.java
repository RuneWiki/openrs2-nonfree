import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!raa", name = "F", descriptor = "Lclient!kq;")
	public static Class199 aClass199_12 = null;

	@OriginalMember(owner = "client!raa", name = "N", descriptor = "[I")
	public static final int[] anIntArray542 = new int[64];

	@OriginalMember(owner = "client!raa", name = "c", descriptor = "(I)V")
	public static void method6914() {
		for (@Pc(10) Class3_Sub10 local10 = (Class3_Sub10) Static592.aClass236_8.method4951(); local10 != null; local10 = (Class3_Sub10) Static592.aClass236_8.method4951()) {
			Static603.method7931(local10);
		}
		@Pc(34) int local34;
		@Pc(33) int local33;
		if (Static124.aClass4_Sub20_4.aClass8_Sub3_1.method2884() == 1) {
			local33 = 3;
			local34 = 0;
		} else {
			local33 = Static431.anInt6799;
			local34 = Static431.anInt6799;
		}
		Static75.method1603();
		for (@Pc(43) int local43 = local34; local43 <= local33; local43++) {
			Static75.method1610();
			Static75.method1605(local43);
			Static75.method1606(local43);
		}
		Static75.method1613();
		Static75.method1602();
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IZLclient!kg;)V")
	public static void method6916(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class3_Sub1_Sub2_Sub2 arg1) {
		@Pc(14) Class377 local14 = arg1.method8525();
		if (arg1.anInt10003 == 0) {
			Static470.anInt7477 = 0;
			Static451.anInt7048 = -1;
			arg1.anInt10002 = 0;
			return;
		}
		if (arg1.anInt9981 != -1 && arg1.anInt9934 == 0) {
			@Pc(42) Class124 local42 = Static99.aClass2_1.method22(arg1.anInt9981);
			if (arg1.anInt10001 > 0 && local42.anInt3026 == 0) {
				arg1.anInt10002++;
				Static451.anInt7048 = -1;
				Static470.anInt7477 = 0;
				return;
			}
			if (arg1.anInt10001 <= 0 && local42.anInt3030 == 0) {
				Static451.anInt7048 = -1;
				arg1.anInt10002++;
				Static470.anInt7477 = 0;
				return;
			}
		}
		for (@Pc(81) int local81 = 0; local81 < arg1.aClass78Array3.length; local81++) {
			if (arg1.aClass78Array3[local81].anInt2180 != -1 && Static177.anInt3088 >= arg1.aClass78Array3[local81].anInt2177) {
				@Pc(107) Class323 local107 = Static341.aClass349_1.method7597(arg1.aClass78Array3[local81].anInt2180);
				if (local107.aBoolean644 && local107.anInt8322 != -1) {
					@Pc(121) Class124 local121 = Static99.aClass2_1.method22(local107.anInt8322);
					if (arg1.anInt10001 > 0 && local121.anInt3026 == 0) {
						Static470.anInt7477 = 0;
						arg1.anInt10002++;
						Static451.anInt7048 = -1;
						return;
					}
					if (arg1.anInt10001 <= 0 && local121.anInt3030 == 0) {
						Static451.anInt7048 = -1;
						arg1.anInt10002++;
						Static470.anInt7477 = 0;
						return;
					}
				}
			}
		}
		@Pc(176) int local176 = arg1.anInt9925;
		@Pc(179) int local179 = arg1.anInt9917;
		@Pc(196) int local196 = arg1.anIntArray693[arg1.anInt10003 - 1] * 512 + arg1.method8514() * 256;
		@Pc(212) int local212 = arg1.anIntArray694[arg1.anInt10003 - 1] * 512 + arg1.method8514() * 256;
		if (local196 <= local176) {
			if (local176 <= local196) {
				if (local212 > local179) {
					arg1.method8524(8192);
				} else if (local212 < local179) {
					arg1.method8524(0);
				}
			} else if (local212 > local179) {
				arg1.method8524(6144);
			} else if (local179 <= local212) {
				arg1.method8524(4096);
			} else {
				arg1.method8524(2048);
			}
		} else if (local212 > local179) {
			arg1.method8524(10240);
		} else if (local212 >= local179) {
			arg1.method8524(12288);
		} else {
			arg1.method8524(14336);
		}
		@Pc(310) byte local310 = arg1.aByteArray102[arg1.anInt10003 - 1];
		if (!arg0 && (local196 - local176 > 1024 || local196 - local176 < -1024 || local212 - local179 > 1024 || local212 - local179 < -1024)) {
			arg1.anInt9925 = local196;
			arg1.anInt9917 = local212;
			arg1.method8526(arg1.anInt9950, false);
			Static451.anInt7048 = -1;
			if (arg1.anInt10001 > 0) {
				arg1.anInt10001--;
			}
			arg1.anInt10003--;
			Static470.anInt7477 = 0;
			return;
		}
		@Pc(372) int local372 = 16;
		@Pc(374) boolean local374 = true;
		if (arg1 instanceof Class3_Sub1_Sub2_Sub2_Sub2) {
			local374 = ((Class3_Sub1_Sub2_Sub2_Sub2) arg1).aClass345_1.aBoolean694;
		}
		@Pc(412) int local412;
		if (local374) {
			local412 = arg1.anInt9950 - arg1.aClass240_7.anInt5668;
			if (local412 != 0 && arg1.anInt9947 == -1 && arg1.anInt9976 != 0) {
				local372 = 8;
			}
			if (!arg0 && arg1.anInt10003 > 2) {
				local372 = 24;
			}
			if (!arg0 && arg1.anInt10003 > 3) {
				local372 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt10003 > 1) {
				local372 = 24;
			}
			if (!arg0 && arg1.anInt10003 > 2) {
				local372 = 32;
			}
		}
		if (arg1.anInt10002 > 0 && arg1.anInt10003 > 1) {
			local372 = 32;
			arg1.anInt10002--;
		}
		if (local310 == 2) {
			local372 <<= 0x1;
		} else if (local310 == 0) {
			local372 >>= 0x1;
		}
		if (local14.anInt10058 != -1) {
			local372 <<= 0x9;
			if (arg1.anInt10003 == 1) {
				local412 = arg1.anInt10000 * arg1.anInt10000;
				@Pc(561) int local561 = (arg1.anInt9925 > local196 ? arg1.anInt9925 - local196 : -arg1.anInt9925 + local196) << 9;
				@Pc(578) int local578 = (arg1.anInt9917 <= local212 ? local212 - arg1.anInt9917 : -local212 + arg1.anInt9917) << 9;
				@Pc(589) int local589 = local578 < local561 ? local561 : local578;
				@Pc(596) int local596 = local14.anInt10058 * 2 * local589;
				if (local412 > local596) {
					arg1.anInt10000 /= 2;
				} else if (local589 < local412 / 2) {
					arg1.anInt10000 -= local14.anInt10058;
					if (arg1.anInt10000 < 0) {
						arg1.anInt10000 = 0;
					}
				} else if (local372 > arg1.anInt10000) {
					arg1.anInt10000 += local14.anInt10058;
					if (local372 < arg1.anInt10000) {
						arg1.anInt10000 = local372;
					}
				}
			} else if (arg1.anInt10000 < local372) {
				arg1.anInt10000 += local14.anInt10058;
				if (arg1.anInt10000 > local372) {
					arg1.anInt10000 = local372;
				}
			} else if (arg1.anInt10000 > 0) {
				arg1.anInt10000 -= local14.anInt10058;
				if (arg1.anInt10000 < 0) {
					arg1.anInt10000 = 0;
				}
			}
			local372 = arg1.anInt10000 >> 9;
			if (local372 < 1) {
				local372 = 1;
			}
		}
		Static470.anInt7477 = 0;
		if (local176 == local196 && local179 == local212) {
			Static451.anInt7048 = -1;
		} else {
			if (local196 > local176) {
				arg1.anInt9925 += local372;
				Static470.anInt7477 |= 0x4;
				if (local196 < arg1.anInt9925) {
					arg1.anInt9925 = local196;
				}
			} else if (local196 < local176) {
				arg1.anInt9925 -= local372;
				Static470.anInt7477 |= 0x8;
				if (local196 > arg1.anInt9925) {
					arg1.anInt9925 = local196;
				}
			}
			if (local179 < local212) {
				Static470.anInt7477 |= 0x1;
				arg1.anInt9917 += local372;
				if (arg1.anInt9917 > local212) {
					arg1.anInt9917 = local212;
				}
			} else if (local212 < local179) {
				arg1.anInt9917 -= local372;
				Static470.anInt7477 |= 0x2;
				if (arg1.anInt9917 < local212) {
					arg1.anInt9917 = local212;
				}
			}
			if (local372 >= 32) {
				Static451.anInt7048 = 2;
			} else {
				Static451.anInt7048 = local310;
			}
		}
		if (arg1.anInt9925 == local196 && arg1.anInt9917 == local212) {
			if (arg1.anInt10001 > 0) {
				arg1.anInt10001--;
			}
			arg1.anInt10003--;
		}
	}
}
