import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!me", name = "r", descriptor = "Lclient!f;")
	public static Class22 aClass22_11;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "[Lclient!iu;")
	public static final Class3_Sub3_Sub13[] aClass3_Sub3_Sub13Array3 = new Class3_Sub3_Sub13[14];

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!pb;")
	public static final Class180 aClass180_5 = new Class180("", 10);

	@OriginalMember(owner = "client!me", name = "s", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZLclient!gf;)V")
	public static void method3785(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class1_Sub3_Sub3 arg1) {
		@Pc(7) Class137 local7 = arg1.method4837();
		if (arg1.anInt6133 == 0) {
			Static10.anInt269 = 0;
			Static419.anInt7240 = -1;
			arg1.anInt6134 = 0;
			return;
		}
		if (arg1.anInt6092 != -1 && arg1.anInt6083 == 0) {
			@Pc(38) Class96 local38 = Static196.aClass30_2.method942(arg1.anInt6092);
			if (arg1.anInt6136 > 0 && local38.anInt3328 == 0) {
				arg1.anInt6134++;
				Static10.anInt269 = 0;
				Static419.anInt7240 = -1;
				return;
			}
			if (arg1.anInt6136 <= 0 && local38.anInt3324 == 0) {
				arg1.anInt6134++;
				Static419.anInt7240 = -1;
				Static10.anInt269 = 0;
				return;
			}
		}
		@Pc(105) Class96 local105;
		@Pc(92) Class186 local92;
		if (arg1.anInt6104 != -1 && Static290.anInt5325 >= arg1.anInt6062) {
			local92 = Static102.aClass91_2.method2560(arg1.anInt6104);
			if (local92.aBoolean406 && local92.anInt5611 != -1) {
				local105 = Static196.aClass30_2.method942(local92.anInt5611);
				if (arg1.anInt6136 > 0 && local105.anInt3328 == 0) {
					arg1.anInt6134++;
					Static10.anInt269 = 0;
					Static419.anInt7240 = -1;
					return;
				}
				if (arg1.anInt6136 <= 0 && local105.anInt3324 == 0) {
					Static10.anInt269 = 0;
					Static419.anInt7240 = -1;
					arg1.anInt6134++;
					return;
				}
			}
		}
		if (arg1.anInt6104 != -1 && arg1.anInt6062 <= Static290.anInt5325) {
			local92 = Static102.aClass91_2.method2560(arg1.anInt6104);
			if (local92.aBoolean406 && local92.anInt5611 != -1) {
				local105 = Static196.aClass30_2.method942(local92.anInt5611);
				if (arg1.anInt6136 > 0 && local105.anInt3328 == 0) {
					arg1.anInt6134++;
					Static10.anInt269 = 0;
					Static419.anInt7240 = -1;
					return;
				}
				if (arg1.anInt6136 <= 0 && local105.anInt3324 == 0) {
					arg1.anInt6134++;
					Static10.anInt269 = 0;
					Static419.anInt7240 = -1;
					return;
				}
			}
		}
		@Pc(219) int local219 = arg1.anInt6053;
		@Pc(222) int local222 = arg1.anInt6055;
		@Pc(238) int local238 = arg1.anIntArray453[arg1.anInt6133 - 1] * 128 + arg1.method4831() * 64;
		@Pc(255) int local255 = arg1.anIntArray454[arg1.anInt6133 - 1] * 128 + arg1.method4831() * 64;
		if (local238 > local219) {
			if (local255 > local222) {
				arg1.method4830(10240);
			} else if (local222 > local255) {
				arg1.method4830(14336);
			} else {
				arg1.method4830(12288);
			}
		} else if (local238 < local219) {
			if (local255 > local222) {
				arg1.method4830(6144);
			} else if (local255 >= local222) {
				arg1.method4830(4096);
			} else {
				arg1.method4830(2048);
			}
		} else if (local222 < local255) {
			arg1.method4830(8192);
		} else if (local222 > local255) {
			arg1.method4830(0);
		}
		@Pc(342) byte local342 = arg1.aByteArray69[arg1.anInt6133 - 1];
		if (!arg0 && (local238 - local219 > 256 || local238 - local219 < -256 || local255 - local222 > 256 || local255 - local222 < -256)) {
			arg1.anInt6055 = local255;
			arg1.anInt6053 = local238;
			arg1.method4833(arg1.anInt6128);
			Static419.anInt7240 = -1;
			Static10.anInt269 = 0;
			if (arg1.anInt6136 > 0) {
				arg1.anInt6136--;
			}
			arg1.anInt6133--;
			return;
		}
		@Pc(416) int local416 = 4;
		@Pc(418) boolean local418 = true;
		if (arg1 instanceof Class1_Sub3_Sub3_Sub2) {
			local418 = ((Class1_Sub3_Sub3_Sub2) arg1).aClass47_1.aBoolean123;
		}
		@Pc(452) int local452;
		if (local418) {
			local452 = arg1.anInt6128 - arg1.aClass160_7.anInt4763;
			if (local452 != 0 && arg1.anInt6102 == -1 && arg1.anInt6100 != 0) {
				local416 = 2;
			}
			if (!arg0 && arg1.anInt6133 > 2) {
				local416 = 6;
			}
			if (!arg0 && arg1.anInt6133 > 3) {
				local416 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt6133 > 1) {
				local416 = 6;
			}
			if (!arg0 && arg1.anInt6133 > 2) {
				local416 = 8;
			}
		}
		if (arg1.anInt6134 > 0 && arg1.anInt6133 > 1) {
			arg1.anInt6134--;
			local416 = 8;
		}
		if (local342 == 2) {
			local416 <<= 0x1;
		} else if (local342 == 0) {
			local416 >>= 0x1;
		}
		if (local7.anInt4210 != -1) {
			local416 <<= 0x7;
			if (arg1.anInt6133 == 1) {
				local452 = arg1.anInt6135 * arg1.anInt6135;
				@Pc(609) int local609 = (local238 < arg1.anInt6053 ? arg1.anInt6053 - local238 : -arg1.anInt6053 + local238) << 7;
				@Pc(630) int local630 = (local255 >= arg1.anInt6055 ? local255 - arg1.anInt6055 : arg1.anInt6055 + -local255) << 7;
				@Pc(637) int local637 = local609 <= local630 ? local630 : local609;
				@Pc(644) int local644 = local637 * local7.anInt4210 * 2;
				if (local644 < local452) {
					arg1.anInt6135 /= 2;
				} else if (local452 / 2 > local637) {
					arg1.anInt6135 -= local7.anInt4210;
					if (arg1.anInt6135 < 0) {
						arg1.anInt6135 = 0;
					}
				} else if (local416 > arg1.anInt6135) {
					arg1.anInt6135 += local7.anInt4210;
					if (arg1.anInt6135 > local416) {
						arg1.anInt6135 = local416;
					}
				}
			} else if (local416 > arg1.anInt6135) {
				arg1.anInt6135 += local7.anInt4210;
				if (local416 < arg1.anInt6135) {
					arg1.anInt6135 = local416;
				}
			} else if (arg1.anInt6135 > 0) {
				arg1.anInt6135 -= local7.anInt4210;
				if (arg1.anInt6135 < 0) {
					arg1.anInt6135 = 0;
				}
			}
			local416 = arg1.anInt6135 >> 7;
			if (local416 < 1) {
				local416 = 1;
			}
		}
		Static10.anInt269 = 0;
		if (local238 > local219) {
			arg1.anInt6053 += local416;
			Static10.anInt269 |= 0x4;
			if (local238 < arg1.anInt6053) {
				arg1.anInt6053 = local238;
			}
		} else if (local219 > local238) {
			arg1.anInt6053 -= local416;
			Static10.anInt269 |= 0x8;
			if (local238 > arg1.anInt6053) {
				arg1.anInt6053 = local238;
			}
		}
		if (local255 > local222) {
			Static10.anInt269 |= 0x1;
			arg1.anInt6055 += local416;
			if (local255 < arg1.anInt6055) {
				arg1.anInt6055 = local255;
			}
		} else if (local255 < local222) {
			Static10.anInt269 |= 0x2;
			arg1.anInt6055 -= local416;
			if (local255 > arg1.anInt6055) {
				arg1.anInt6055 = local255;
			}
		}
		if (local416 < 8) {
			Static419.anInt7240 = local342;
		} else {
			Static419.anInt7240 = 2;
		}
		if (arg1.anInt6053 == local238 && local255 == arg1.anInt6055) {
			if (arg1.anInt6136 > 0) {
				arg1.anInt6136--;
			}
			arg1.anInt6133--;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(IBI)Z")
	public static boolean method3788(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (Static12.method401(arg0, arg1) | Static276.method4120(arg0, arg1) | Static147.method2665(arg1, arg0)) & Static167.method5105(arg0, arg1);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z[[BLclient!bi;)V")
	public static void method3790(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class4_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(14) int local14 = 0; local14 < arg1.anInt808; local14++) {
			Static143.method2556();
			for (@Pc(20) int local20 = 0; local20 < Static399.anInt6923 >> 3; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static127.anInt2696 >> 3; local24++) {
					@Pc(28) boolean local28 = false;
					@Pc(36) int local36 = Static192.anIntArrayArrayArray11[local14][local20][local24];
					if (local36 != -1) {
						@Pc(46) int local46 = local36 >> 24 & 0x3;
						if (!arg1.aBoolean46 || local46 == 0) {
							@Pc(57) int local57 = local36 >> 1 & 0x3;
							@Pc(63) int local63 = local36 >> 14 & 0x3FF;
							@Pc(69) int local69 = local36 >> 3 & 0x7FF;
							@Pc(79) int local79 = (local63 / 8 << 8) + local69 / 8;
							for (@Pc(81) int local81 = 0; local81 < Static289.anIntArray407.length; local81++) {
								if (Static289.anIntArray407[local81] == local79 && arg0[local81] != null) {
									@Pc(99) Class3_Sub2 local99 = new Class3_Sub2(arg0[local81]);
									arg1.method741(local24 * 8, local20 * 8, local63, local99, local57, local69, local46, Static389.aClass23Array1, local14);
									arg1.method757(local99, Static266.aClass75_7, local57, local14, local46, local24 * 8, local63, local20 * 8, local69, local12[0] == -1 ? local12 : null);
									local28 = true;
									break;
								}
							}
						}
					}
					if (!local28) {
						arg1.method750(local24 * 8, 8, 8, local14, local20 * 8);
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static5.aClass29_1 = Static290.aClass2_1.method65(Static430.aClass211_1, local12[3], local12[2], local12[0], local12[1]);
			Static374.anInt6606 = local12[4];
		}
	}
}
