import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ta", name = "I", descriptor = "[I")
	public static int[] anIntArray477;

	@OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
	public static int anInt5866;

	@OriginalMember(owner = "client!ta", name = "P", descriptor = "Lclient!ke;")
	public static Class113 aClass113_4;

	@OriginalMember(owner = "client!ta", name = "T", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas4;

	@OriginalMember(owner = "client!ta", name = "K", descriptor = "[I")
	public static final int[] anIntArray478 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ta", name = "S", descriptor = "I")
	public static int anInt5871 = 0;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public static void method5003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		Static162.method1731(arg0 + arg1, Static196.anIntArrayArray37[arg3], arg1 - arg0, arg2);
		@Pc(27) int local27 = -1;
		while (local7 < local9) {
			local27 += 2;
			local7++;
			local12 += local27;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(50) int[] local50 = Static196.anIntArrayArray37[arg3 + local9];
				@Pc(56) int[] local56 = Static196.anIntArrayArray37[arg3 - local9];
				@Pc(60) int local60 = local7 + arg1;
				@Pc(65) int local65 = arg1 - local7;
				Static162.method1731(local60, local50, local65, arg2);
				Static162.method1731(local60, local56, local65, arg2);
			}
			@Pc(81) int local81 = local9 + arg1;
			@Pc(86) int local86 = arg1 - local9;
			@Pc(92) int[] local92 = Static196.anIntArrayArray37[arg3 + local7];
			@Pc(99) int[] local99 = Static196.anIntArrayArray37[arg3 - local7];
			Static162.method1731(local81, local92, local86, arg2);
			Static162.method1731(local81, local99, local86, arg2);
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(B)I")
	public static int method5004() {
		if (Static115.aBoolean134) {
			return 0;
		} else if (Static75.method1142()) {
			return Static228.aBoolean265 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)V")
	public static void method5006(@OriginalArg(0) int arg0) {
		Static262.anInt6843 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static103.anInt2156; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static116.anInt2499; local6++) {
				if (Static256.aClass45ArrayArrayArray2[arg0][local3][local6] == null) {
					Static256.aClass45ArrayArrayArray2[arg0][local3][local6] = new Class45(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(BI)V")
	public static void method5007(@OriginalArg(1) int arg0) {
		Static148.anInt2916 = arg0;
		@Pc(7) Class198 local7 = Static190.aClass198_34;
		synchronized (Static190.aClass198_34) {
			Static190.aClass198_34.method5236();
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ps;BZ)V")
	public static void method5008(@OriginalArg(0) Class5_Sub4_Sub4 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class54 local9 = arg0.method4201();
		if (arg0.anInt4958 == 0) {
			arg0.anInt4956 = 0;
			Static57.anInt1246 = -1;
			Static138.anInt2797 = 0;
			return;
		}
		if (arg0.anInt4915 != -1 && arg0.anInt4918 == 0) {
			@Pc(36) Class131 local36 = Static343.method5604(arg0.anInt4915);
			if (arg0.anInt4954 > 0 && local36.anInt3992 == 0) {
				Static138.anInt2797 = 0;
				Static57.anInt1246 = -1;
				arg0.anInt4956++;
				return;
			}
			if (arg0.anInt4954 <= 0 && local36.anInt3984 == 0) {
				Static57.anInt1246 = -1;
				Static138.anInt2797 = 0;
				arg0.anInt4956++;
				return;
			}
		}
		if (arg0.anInt4910 != -1 && Static51.anInt1101 >= arg0.anInt4926) {
			@Pc(90) Class2 local90 = Static155.method1566(arg0.anInt4910);
			if (local90.aBoolean5 && local90.anInt22 != -1) {
				@Pc(102) Class131 local102 = Static343.method5604(local90.anInt22);
				if (arg0.anInt4954 > 0 && local102.anInt3992 == 0) {
					Static57.anInt1246 = -1;
					arg0.anInt4956++;
					Static138.anInt2797 = 0;
					return;
				}
				if (arg0.anInt4954 <= 0 && local102.anInt3984 == 0) {
					Static138.anInt2797 = 0;
					arg0.anInt4956++;
					Static57.anInt1246 = -1;
					return;
				}
			}
		}
		@Pc(145) int local145 = arg0.anInt5901;
		@Pc(148) int local148 = arg0.anInt5905;
		@Pc(164) int local164 = arg0.anIntArray405[arg0.anInt4958 - 1] * 128 + arg0.method4208() * 64;
		@Pc(180) int local180 = arg0.anIntArray404[arg0.anInt4958 - 1] * 128 + arg0.method4208() * 64;
		if (!arg1 && (local164 - local145 > 256 || local164 - local145 < -256 || local180 - local148 > 256 || local180 - local148 < -256)) {
			arg0.anInt5901 = local164;
			arg0.anInt5905 = local180;
			Static138.anInt2797 = 0;
			Static57.anInt1246 = -1;
			return;
		}
		if (local145 < local164) {
			if (local148 < local180) {
				arg0.method4200(10240);
			} else if (local148 > local180) {
				arg0.method4200(14336);
			} else {
				arg0.method4200(12288);
			}
		} else if (local145 <= local164) {
			if (local180 > local148) {
				arg0.method4200(8192);
			} else if (local148 > local180) {
				arg0.method4200(0);
			}
		} else if (local180 > local148) {
			arg0.method4200(6144);
		} else if (local180 < local148) {
			arg0.method4200(2048);
		} else {
			arg0.method4200(4096);
		}
		@Pc(316) int local316 = 4;
		@Pc(318) boolean local318 = true;
		if (arg0 instanceof Class5_Sub4_Sub4_Sub2) {
			local318 = ((Class5_Sub4_Sub4_Sub2) arg0).aClass119_1.aBoolean199;
		}
		if (local318) {
			@Pc(336) int local336 = arg0.anInt4885 - arg0.aClass193_7.anInt6100;
			if (local336 != 0 && arg0.anInt4942 == -1 && arg0.anInt4931 != 0) {
				local316 = 2;
			}
			if (!arg1 && arg0.anInt4958 > 2) {
				local316 = 6;
			}
			if (!arg1 && arg0.anInt4958 > 3) {
				local316 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt4958 > 1) {
				local316 = 6;
			}
			if (!arg1 && arg0.anInt4958 > 2) {
				local316 = 8;
			}
		}
		if (arg0.anInt4956 > 0 && arg0.anInt4958 > 1) {
			local316 = 8;
			arg0.anInt4956--;
		}
		@Pc(416) byte local416 = arg0.aByteArray80[arg0.anInt4958 - 1];
		if (local416 == 2) {
			local316 <<= 0x1;
		} else if (local416 == 0) {
			local316 >>= 0x1;
		}
		Static138.anInt2797 = 0;
		if (local9.anInt1496 != -1) {
			local316 <<= 0x7;
			if (arg0.anInt4958 == 1) {
				@Pc(454) int local454 = arg0.anInt4957 * arg0.anInt4957;
				@Pc(476) int local476 = (arg0.anInt5901 > local164 ? arg0.anInt5901 - local164 : -arg0.anInt5901 + local164) << 7;
				@Pc(498) int local498 = (arg0.anInt5905 > local180 ? arg0.anInt5905 - local180 : -arg0.anInt5905 + local180) << 7;
				@Pc(505) int local505 = local498 >= local476 ? local498 : local476;
				@Pc(512) int local512 = local9.anInt1496 * 2 * local505;
				if (local454 > local512) {
					arg0.anInt4957 /= 2;
				} else if (local454 / 2 > local505) {
					arg0.anInt4957 -= local9.anInt1496;
					if (arg0.anInt4957 < 0) {
						arg0.anInt4957 = 0;
					}
				} else if (arg0.anInt4957 < local316) {
					arg0.anInt4957 += local9.anInt1496;
					if (local316 < arg0.anInt4957) {
						arg0.anInt4957 = local316;
					}
				}
			} else if (local316 > arg0.anInt4957) {
				arg0.anInt4957 += local9.anInt1496;
				if (local316 < arg0.anInt4957) {
					arg0.anInt4957 = local316;
				}
			} else if (arg0.anInt4957 > 0) {
				arg0.anInt4957 -= local9.anInt1496;
				if (arg0.anInt4957 < 0) {
					arg0.anInt4957 = 0;
				}
			}
			local316 = arg0.anInt4957 >> 7;
			if (local316 < 1) {
				local316 = 1;
			}
		}
		if (local145 < local164) {
			arg0.anInt5901 += local316;
			Static138.anInt2797 |= 0x4;
			if (local164 < arg0.anInt5901) {
				arg0.anInt5901 = local164;
			}
		} else if (local145 > local164) {
			Static138.anInt2797 |= 0x8;
			arg0.anInt5901 -= local316;
			if (arg0.anInt5901 < local164) {
				arg0.anInt5901 = local164;
			}
		}
		if (local180 > local148) {
			arg0.anInt5905 += local316;
			Static138.anInt2797 |= 0x1;
			if (arg0.anInt5905 > local180) {
				arg0.anInt5905 = local180;
			}
		} else if (local180 < local148) {
			Static138.anInt2797 |= 0x2;
			arg0.anInt5905 -= local316;
			if (local180 > arg0.anInt5905) {
				arg0.anInt5905 = local180;
			}
		}
		if (local316 < 8) {
			Static57.anInt1246 = local416;
		} else {
			Static57.anInt1246 = 2;
		}
		if (local164 != arg0.anInt5901 || local180 != arg0.anInt5905) {
			return;
		}
		arg0.anInt4958--;
		if (arg0.anInt4954 > 0) {
			arg0.anInt4954--;
			return;
		}
	}
}
