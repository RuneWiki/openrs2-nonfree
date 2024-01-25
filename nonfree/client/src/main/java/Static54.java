import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "Lclient!cu;")
	public static Class61 aClass61_1;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "Lclient!os;")
	public static Class257 aClass257_1;

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "Lclient!av;")
	public static Class22 aClass22_1;

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "I")
	public static int anInt1032 = -1;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lclient!ha;BI)Lclient!ej;")
	public static Class93 method983(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class249 local9 = Static280.method4568(arg1, true, arg0);
		return local9 == null ? null : local9.aClass93_10;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZLclient!ni;)V")
	public static void method986(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class9_Sub2_Sub1_Sub2 arg1) {
		@Pc(13) Class176 local13 = arg1.method8633();
		if (arg1.anInt10236 == 0) {
			Static6.anInt81 = -1;
			Static98.anInt2005 = 0;
			arg1.anInt10235 = 0;
			return;
		}
		if (arg1.anInt10193 != -1 && arg1.anInt10219 == 0) {
			@Pc(41) Class267 local41 = Static474.aClass264_2.method6574(arg1.anInt10193);
			if (arg1.anInt10234 > 0 && local41.anInt7573 == 0) {
				Static6.anInt81 = -1;
				arg1.anInt10235++;
				Static98.anInt2005 = 0;
				return;
			}
			if (arg1.anInt10234 <= 0 && local41.anInt7571 == 0) {
				Static98.anInt2005 = 0;
				Static6.anInt81 = -1;
				arg1.anInt10235++;
				return;
			}
		}
		for (@Pc(80) int local80 = 0; local80 < arg1.aClass380Array3.length; local80++) {
			if (arg1.aClass380Array3[local80].anInt10136 != -1 && arg1.aClass380Array3[local80].anInt10146 <= Static304.anInt8391) {
				@Pc(105) Class207 local105 = Static266.aClass135_1.method3108(arg1.aClass380Array3[local80].anInt10136);
				if (local105.aBoolean457 && local105.anInt6225 != -1) {
					@Pc(119) Class267 local119 = Static474.aClass264_2.method6574(local105.anInt6225);
					if (arg1.anInt10234 > 0 && local119.anInt7573 == 0) {
						arg1.anInt10235++;
						Static6.anInt81 = -1;
						Static98.anInt2005 = 0;
						return;
					}
					if (arg1.anInt10234 <= 0 && local119.anInt7571 == 0) {
						Static6.anInt81 = -1;
						arg1.anInt10235++;
						Static98.anInt2005 = 0;
						return;
					}
				}
			}
		}
		@Pc(169) int local169 = arg1.anInt10152;
		@Pc(172) int local172 = arg1.anInt10158;
		@Pc(188) int local188 = arg1.anIntArray675[arg1.anInt10236 - 1] * 512 + arg1.method8619() * 256;
		@Pc(204) int local204 = arg1.anIntArray676[arg1.anInt10236 - 1] * 512 + arg1.method8619() * 256;
		if (local169 < local188) {
			if (local172 < local204) {
				arg1.method8635(10240);
			} else if (local172 > local204) {
				arg1.method8635(14336);
			} else {
				arg1.method8635(12288);
			}
		} else if (local188 < local169) {
			if (local204 > local172) {
				arg1.method8635(6144);
			} else if (local204 < local172) {
				arg1.method8635(2048);
			} else {
				arg1.method8635(4096);
			}
		} else if (local172 < local204) {
			arg1.method8635(8192);
		} else if (local204 < local172) {
			arg1.method8635(0);
		}
		@Pc(296) byte local296 = arg1.aByteArray107[arg1.anInt10236 - 1];
		if (!arg0 && (local188 - local169 > 1024 || local188 - local169 < -1024 || local204 - local172 > 1024 || local204 - local172 < -1024)) {
			arg1.anInt10152 = local188;
			arg1.anInt10158 = local204;
			arg1.method8621(false, arg1.anInt10232);
			if (arg1.anInt10234 > 0) {
				arg1.anInt10234--;
			}
			Static6.anInt81 = -1;
			Static98.anInt2005 = 0;
			arg1.anInt10236--;
			return;
		}
		@Pc(361) int local361 = 16;
		@Pc(363) boolean local363 = true;
		if (arg1 instanceof Class9_Sub2_Sub1_Sub2_Sub2) {
			local363 = ((Class9_Sub2_Sub1_Sub2_Sub2) arg1).aClass309_1.aBoolean656;
		}
		@Pc(399) int local399;
		if (local363) {
			local399 = arg1.anInt10232 - arg1.aClass191_7.anInt5877;
			if (local399 != 0 && arg1.anInt10185 == -1 && arg1.anInt10196 != 0) {
				local361 = 8;
			}
			if (!arg0 && arg1.anInt10236 > 2) {
				local361 = 24;
			}
			if (!arg0 && arg1.anInt10236 > 3) {
				local361 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt10236 > 1) {
				local361 = 24;
			}
			if (!arg0 && arg1.anInt10236 > 2) {
				local361 = 32;
			}
		}
		if (arg1.anInt10235 > 0 && arg1.anInt10236 > 1) {
			local361 = 32;
			arg1.anInt10235--;
		}
		if (local296 == 2) {
			local361 <<= 0x1;
		} else if (local296 == 0) {
			local361 >>= 0x1;
		}
		Static98.anInt2005 = 0;
		if (local13.anInt5232 != -1) {
			local361 <<= 0x9;
			if (arg1.anInt10236 == 1) {
				local399 = arg1.anInt10233 * arg1.anInt10233;
				@Pc(546) int local546 = (local188 >= arg1.anInt10152 ? local188 - arg1.anInt10152 : -local188 + arg1.anInt10152) << 9;
				@Pc(567) int local567 = (arg1.anInt10158 <= local204 ? local204 - arg1.anInt10158 : arg1.anInt10158 + -local204) << 9;
				@Pc(578) int local578 = local567 < local546 ? local546 : local567;
				@Pc(585) int local585 = local578 * local13.anInt5232 * 2;
				if (local399 > local585) {
					arg1.anInt10233 /= 2;
				} else if (local578 < local399 / 2) {
					arg1.anInt10233 -= local13.anInt5232;
					if (arg1.anInt10233 < 0) {
						arg1.anInt10233 = 0;
					}
				} else if (local361 > arg1.anInt10233) {
					arg1.anInt10233 += local13.anInt5232;
					if (local361 < arg1.anInt10233) {
						arg1.anInt10233 = local361;
					}
				}
			} else if (local361 > arg1.anInt10233) {
				arg1.anInt10233 += local13.anInt5232;
				if (local361 < arg1.anInt10233) {
					arg1.anInt10233 = local361;
				}
			} else if (arg1.anInt10233 > 0) {
				arg1.anInt10233 -= local13.anInt5232;
				if (arg1.anInt10233 < 0) {
					arg1.anInt10233 = 0;
				}
			}
			local361 = arg1.anInt10233 >> 9;
			if (local361 < 1) {
				local361 = 1;
			}
		}
		if (local169 == local188 && local204 == local172) {
			Static6.anInt81 = -1;
		} else {
			if (local188 > local169) {
				Static98.anInt2005 |= 0x4;
				arg1.anInt10152 += local361;
				if (arg1.anInt10152 > local188) {
					arg1.anInt10152 = local188;
				}
			} else if (local169 > local188) {
				Static98.anInt2005 |= 0x8;
				arg1.anInt10152 -= local361;
				if (arg1.anInt10152 < local188) {
					arg1.anInt10152 = local188;
				}
			}
			if (local361 < 32) {
				Static6.anInt81 = local296;
			} else {
				Static6.anInt81 = 2;
			}
			if (local204 > local172) {
				Static98.anInt2005 |= 0x1;
				arg1.anInt10158 += local361;
				if (local204 < arg1.anInt10158) {
					arg1.anInt10158 = local204;
				}
			} else if (local204 < local172) {
				arg1.anInt10158 -= local361;
				Static98.anInt2005 |= 0x2;
				if (arg1.anInt10158 < local204) {
					arg1.anInt10158 = local204;
				}
			}
		}
		if (arg1.anInt10152 != local188 || arg1.anInt10158 != local204) {
			return;
		}
		arg1.anInt10236--;
		if (arg1.anInt10234 > 0) {
			arg1.anInt10234--;
			return;
		}
	}
}
