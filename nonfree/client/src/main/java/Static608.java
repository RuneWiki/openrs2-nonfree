import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static608 {

	@OriginalMember(owner = "client!um", name = "A", descriptor = "I")
	public static int anInt10279;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_129 = new Class100(22, -1);

	@OriginalMember(owner = "client!um", name = "s", descriptor = "I")
	public static int anInt10273 = 0;

	@OriginalMember(owner = "client!um", name = "x", descriptor = "Lclient!mea;")
	public static Class230 aClass230_10 = null;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "I")
	public static int anInt10278 = 0;

	@OriginalMember(owner = "client!um", name = "z", descriptor = "[[I")
	public static final int[][] anIntArrayArray57 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)Lclient!jq;")
	public static Class189 method8556() {
		try {
			return (Class189) Class.forName("Class189_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ZBLjava/lang/String;I)V")
	public static void method8557(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		Static219.method3421();
		Static19.method5607();
		Static553.method7782();
		Static58.method1206(arg0, arg1, arg2);
		Static209.method3281();
		Static500.method7345(Static677.aClass137_47);
		Static178.method2840(Static677.aClass137_47);
		Static493.method7317(Static666.aClass386_141, Static677.aClass137_47);
		Static541.method8224();
		Static226.method5381(Static521.aClass20Array13);
		Static31.method720();
		Static221.method6306();
		if (Static430.anInt7691 == 3) {
			Static67.method1345(4);
		} else if (Static430.anInt7691 == 7) {
			Static67.method1345(8);
		} else if (Static430.anInt7691 == 10) {
			Static67.method1345(11);
		} else if (Static430.anInt7691 == 1 || Static430.anInt7691 == 2) {
			Static585.method8337();
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(ILclient!vn;Z)V")
	public static void method8558(@OriginalArg(1) Class12_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class132 local9 = arg0.method2416();
		if (arg0.anInt2964 == 0) {
			Static651.anInt10884 = -1;
			arg0.anInt2967 = 0;
			Static359.anInt6636 = 0;
			return;
		}
		if (arg0.anInt2921 != -1 && arg0.anInt2900 == 0) {
			@Pc(36) Class275 local36 = Static501.aClass191_2.method4322(arg0.anInt2921);
			if (arg0.anInt2966 > 0 && local36.anInt7913 == 0) {
				Static651.anInt10884 = -1;
				Static359.anInt6636 = 0;
				arg0.anInt2967++;
				return;
			}
			if (arg0.anInt2966 <= 0 && local36.anInt7922 == 0) {
				arg0.anInt2967++;
				Static359.anInt6636 = 0;
				Static651.anInt10884 = -1;
				return;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < arg0.aClass84Array3.length; local86++) {
			if (arg0.aClass84Array3[local86].anInt2468 != -1 && Static87.anInt1951 >= arg0.aClass84Array3[local86].anInt2475) {
				@Pc(112) Class60 local112 = Static556.aClass216_2.method5268(arg0.aClass84Array3[local86].anInt2468);
				if (local112.aBoolean127 && local112.anInt1664 != -1) {
					@Pc(126) Class275 local126 = Static501.aClass191_2.method4322(local112.anInt1664);
					if (arg0.anInt2966 > 0 && local126.anInt7913 == 0) {
						Static359.anInt6636 = 0;
						Static651.anInt10884 = -1;
						arg0.anInt2967++;
						return;
					}
					if (arg0.anInt2966 <= 0 && local126.anInt7922 == 0) {
						Static651.anInt10884 = -1;
						arg0.anInt2967++;
						Static359.anInt6636 = 0;
						return;
					}
				}
			}
		}
		@Pc(179) int local179 = arg0.anInt10998;
		@Pc(182) int local182 = arg0.anInt11002;
		@Pc(199) int local199 = arg0.anIntArray241[arg0.anInt2964 - 1] * 512 + arg0.method2422() * 256;
		@Pc(216) int local216 = arg0.anIntArray242[arg0.anInt2964 - 1] * 512 + arg0.method2422() * 256;
		if (local199 > local179) {
			if (local182 < local216) {
				arg0.method2419(10240);
			} else if (local182 > local216) {
				arg0.method2419(14336);
			} else {
				arg0.method2419(12288);
			}
		} else if (local179 <= local199) {
			if (local216 > local182) {
				arg0.method2419(8192);
			} else if (local182 > local216) {
				arg0.method2419(0);
			}
		} else if (local182 < local216) {
			arg0.method2419(6144);
		} else if (local216 >= local182) {
			arg0.method2419(4096);
		} else {
			arg0.method2419(2048);
		}
		@Pc(314) byte local314 = arg0.aByteArray43[arg0.anInt2964 - 1];
		if (!arg1 && (local199 - local179 > 1024 || local199 - local179 < -1024 || local216 - local182 > 1024 || local216 - local182 < -1024)) {
			arg0.anInt11002 = local216;
			arg0.anInt10998 = local199;
			arg0.method2423(false, arg0.anInt2937);
			Static359.anInt6636 = 0;
			if (arg0.anInt2966 > 0) {
				arg0.anInt2966--;
			}
			Static651.anInt10884 = -1;
			arg0.anInt2964--;
			return;
		}
		@Pc(378) int local378 = 16;
		@Pc(380) boolean local380 = true;
		if (arg0 instanceof Class12_Sub2_Sub2_Sub1_Sub1) {
			local380 = ((Class12_Sub2_Sub2_Sub1_Sub1) arg0).aClass283_1.aBoolean619;
		}
		@Pc(398) int local398;
		if (local380) {
			local398 = arg0.anInt2937 - arg0.aClass139_7.anInt3812;
			if (local398 != 0 && arg0.anInt2903 == -1 && arg0.anInt2931 != 0) {
				local378 = 8;
			}
			if (!arg1 && arg0.anInt2964 > 2) {
				local378 = 24;
			}
			if (!arg1 && arg0.anInt2964 > 3) {
				local378 = 32;
			}
		} else {
			if (!arg1 && arg0.anInt2964 > 1) {
				local378 = 24;
			}
			if (!arg1 && arg0.anInt2964 > 2) {
				local378 = 32;
			}
		}
		if (arg0.anInt2967 > 0 && arg0.anInt2964 > 1) {
			local378 = 32;
			arg0.anInt2967--;
		}
		if (local314 == 2) {
			local378 <<= 0x1;
		} else if (local314 == 0) {
			local378 >>= 0x1;
		}
		if (local9.anInt3660 != -1) {
			local378 <<= 0x9;
			if (arg0.anInt2964 == 1) {
				local398 = arg0.anInt2965 * arg0.anInt2965;
				@Pc(525) int local525 = (arg0.anInt10998 <= local199 ? local199 - arg0.anInt10998 : -local199 + arg0.anInt10998) << 9;
				@Pc(542) int local542 = (local216 < arg0.anInt11002 ? arg0.anInt11002 - local216 : local216 - arg0.anInt11002) << 9;
				@Pc(553) int local553 = local542 >= local525 ? local542 : local525;
				@Pc(560) int local560 = local553 * 2 * local9.anInt3660;
				if (local398 > local560) {
					arg0.anInt2965 /= 2;
				} else if (local398 / 2 > local553) {
					arg0.anInt2965 -= local9.anInt3660;
					if (arg0.anInt2965 < 0) {
						arg0.anInt2965 = 0;
					}
				} else if (arg0.anInt2965 < local378) {
					arg0.anInt2965 += local9.anInt3660;
					if (local378 < arg0.anInt2965) {
						arg0.anInt2965 = local378;
					}
				}
			} else if (local378 > arg0.anInt2965) {
				arg0.anInt2965 += local9.anInt3660;
				if (arg0.anInt2965 > local378) {
					arg0.anInt2965 = local378;
				}
			} else if (arg0.anInt2965 > 0) {
				arg0.anInt2965 -= local9.anInt3660;
				if (arg0.anInt2965 < 0) {
					arg0.anInt2965 = 0;
				}
			}
			local378 = arg0.anInt2965 >> 9;
			if (local378 < 1) {
				local378 = 1;
			}
		}
		Static359.anInt6636 = 0;
		if (local179 == local199 && local182 == local216) {
			Static651.anInt10884 = -1;
		} else {
			if (local179 < local199) {
				Static359.anInt6636 |= 0x4;
				arg0.anInt10998 += local378;
				if (arg0.anInt10998 > local199) {
					arg0.anInt10998 = local199;
				}
			} else if (local199 < local179) {
				arg0.anInt10998 -= local378;
				Static359.anInt6636 |= 0x8;
				if (arg0.anInt10998 < local199) {
					arg0.anInt10998 = local199;
				}
			}
			if (local378 >= 32) {
				Static651.anInt10884 = 2;
			} else {
				Static651.anInt10884 = local314;
			}
			if (local216 > local182) {
				arg0.anInt11002 += local378;
				Static359.anInt6636 |= 0x1;
				if (local216 < arg0.anInt11002) {
					arg0.anInt11002 = local216;
				}
			} else if (local182 > local216) {
				arg0.anInt11002 -= local378;
				Static359.anInt6636 |= 0x2;
				if (arg0.anInt11002 < local216) {
					arg0.anInt11002 = local216;
				}
			}
		}
		if (arg0.anInt10998 != local199 || arg0.anInt11002 != local216) {
			return;
		}
		arg0.anInt2964--;
		if (arg0.anInt2966 > 0) {
			arg0.anInt2966--;
			return;
		}
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	public static void method8559() {
		Static663.aClass262_75 = new Class262();
	}
}
