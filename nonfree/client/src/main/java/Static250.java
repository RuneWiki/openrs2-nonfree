import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!ie", name = "m", descriptor = "Lclient!wm;")
	public static Class390 aClass390_57;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	public static int anInt4569;

	@OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
	public static int anInt4568 = 0;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	public static int anInt4570 = 0;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
	public static void method3863() {
		if (Static39.aClass255_1 != null) {
			Static39.aClass255_1.method7452();
		}
		if (Static345.aClass255_3 != null) {
			Static345.aClass255_3.method7452();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZLclient!fda;)V")
	public static void method3864(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class28_Sub1_Sub4_Sub2 arg1) {
		@Pc(9) Class167 local9 = arg1.method4580();
		if (arg1.anInt5524 == 0) {
			arg1.anInt5522 = 0;
			Static79.anInt1139 = 0;
			Static399.anInt7112 = -1;
			return;
		}
		if (arg1.anInt5482 != -1 && arg1.anInt5475 == 0) {
			@Pc(40) Class175 local40 = Static591.aClass66_2.method1768(arg1.anInt5482);
			if (arg1.anInt5525 > 0 && local40.anInt5026 == 0) {
				arg1.anInt5522++;
				Static79.anInt1139 = 0;
				Static399.anInt7112 = -1;
				return;
			}
			if (arg1.anInt5525 <= 0 && local40.anInt5032 == 0) {
				Static399.anInt7112 = -1;
				Static79.anInt1139 = 0;
				arg1.anInt5522++;
				return;
			}
		}
		for (@Pc(79) int local79 = 0; local79 < arg1.aClass227Array3.length; local79++) {
			if (arg1.aClass227Array3[local79].anInt6677 != -1 && arg1.aClass227Array3[local79].anInt6673 <= Static26.anInt350) {
				@Pc(113) Class338 local113 = Static239.aClass91_1.method2243(arg1.aClass227Array3[local79].anInt6677);
				if (local113.aBoolean794 && local113.anInt9376 != -1) {
					@Pc(127) Class175 local127 = Static591.aClass66_2.method1768(local113.anInt9376);
					if (arg1.anInt5525 > 0 && local127.anInt5026 == 0) {
						arg1.anInt5522++;
						Static79.anInt1139 = 0;
						Static399.anInt7112 = -1;
						return;
					}
					if (arg1.anInt5525 <= 0 && local127.anInt5032 == 0) {
						Static79.anInt1139 = 0;
						arg1.anInt5522++;
						Static399.anInt7112 = -1;
						return;
					}
				}
			}
		}
		@Pc(179) int local179 = arg1.anInt10781;
		@Pc(182) int local182 = arg1.anInt10784;
		@Pc(199) int local199 = arg1.anIntArray308[arg1.anInt5524 - 1] * 512 + arg1.method4599() * 256;
		@Pc(215) int local215 = arg1.anIntArray307[arg1.anInt5524 - 1] * 512 + arg1.method4599() * 256;
		if (local179 >= local199) {
			if (local179 > local199) {
				if (local215 > local182) {
					arg1.method4582(6144);
				} else if (local182 <= local215) {
					arg1.method4582(4096);
				} else {
					arg1.method4582(2048);
				}
			} else if (local182 < local215) {
				arg1.method4582(8192);
			} else if (local182 > local215) {
				arg1.method4582(0);
			}
		} else if (local182 < local215) {
			arg1.method4582(10240);
		} else if (local182 > local215) {
			arg1.method4582(14336);
		} else {
			arg1.method4582(12288);
		}
		@Pc(306) byte local306 = arg1.aByteArray44[arg1.anInt5524 - 1];
		if (!arg0 && (local199 - local179 > 1024 || local199 - local179 < -1024 || local215 - local182 > 1024 || local215 - local182 < -1024)) {
			arg1.anInt10784 = local215;
			arg1.anInt10781 = local199;
			arg1.method4590(arg1.anInt5509, false);
			arg1.anInt5524--;
			if (arg1.anInt5525 > 0) {
				arg1.anInt5525--;
			}
			Static79.anInt1139 = 0;
			Static399.anInt7112 = -1;
			return;
		}
		@Pc(372) int local372 = 16;
		@Pc(374) boolean local374 = true;
		if (arg1 instanceof Class28_Sub1_Sub4_Sub2_Sub1) {
			local374 = ((Class28_Sub1_Sub4_Sub2_Sub1) arg1).aClass134_1.aBoolean305;
		}
		@Pc(392) int local392;
		if (local374) {
			local392 = arg1.anInt5509 - arg1.aClass306_7.anInt8684;
			if (local392 != 0 && arg1.anInt5500 == -1 && arg1.anInt5519 != 0) {
				local372 = 8;
			}
			if (!arg0 && arg1.anInt5524 > 2) {
				local372 = 24;
			}
			if (!arg0 && arg1.anInt5524 > 3) {
				local372 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt5524 > 1) {
				local372 = 24;
			}
			if (!arg0 && arg1.anInt5524 > 2) {
				local372 = 32;
			}
		}
		if (arg1.anInt5522 > 0 && arg1.anInt5524 > 1) {
			local372 = 32;
			arg1.anInt5522--;
		}
		if (local306 == 2) {
			local372 <<= 0x1;
		} else if (local306 == 0) {
			local372 >>= 0x1;
		}
		if (local9.anInt4898 != -1) {
			local372 <<= 0x9;
			if (arg1.anInt5524 == 1) {
				local392 = arg1.anInt5523 * arg1.anInt5523;
				@Pc(518) int local518 = (local199 >= arg1.anInt10781 ? local199 - arg1.anInt10781 : -local199 + arg1.anInt10781) << 9;
				@Pc(538) int local538 = (local215 >= arg1.anInt10784 ? local215 - arg1.anInt10784 : arg1.anInt10784 - local215) << 9;
				@Pc(545) int local545 = local538 >= local518 ? local538 : local518;
				@Pc(552) int local552 = local545 * local9.anInt4898 * 2;
				if (local392 > local552) {
					arg1.anInt5523 /= 2;
				} else if (local392 / 2 > local545) {
					arg1.anInt5523 -= local9.anInt4898;
					if (arg1.anInt5523 < 0) {
						arg1.anInt5523 = 0;
					}
				} else if (arg1.anInt5523 < local372) {
					arg1.anInt5523 += local9.anInt4898;
					if (local372 < arg1.anInt5523) {
						arg1.anInt5523 = local372;
					}
				}
			} else if (local372 > arg1.anInt5523) {
				arg1.anInt5523 += local9.anInt4898;
				if (arg1.anInt5523 > local372) {
					arg1.anInt5523 = local372;
				}
			} else if (arg1.anInt5523 > 0) {
				arg1.anInt5523 -= local9.anInt4898;
				if (arg1.anInt5523 < 0) {
					arg1.anInt5523 = 0;
				}
			}
			local372 = arg1.anInt5523 >> 9;
			if (local372 < 1) {
				local372 = 1;
			}
		}
		Static79.anInt1139 = 0;
		if (local179 == local199 && local182 == local215) {
			Static399.anInt7112 = -1;
		} else {
			if (local179 < local199) {
				arg1.anInt10781 += local372;
				Static79.anInt1139 |= 0x4;
				if (arg1.anInt10781 > local199) {
					arg1.anInt10781 = local199;
				}
			} else if (local179 > local199) {
				arg1.anInt10781 -= local372;
				Static79.anInt1139 |= 0x8;
				if (arg1.anInt10781 < local199) {
					arg1.anInt10781 = local199;
				}
			}
			if (local372 < 32) {
				Static399.anInt7112 = local306;
			} else {
				Static399.anInt7112 = 2;
			}
			if (local182 < local215) {
				arg1.anInt10784 += local372;
				Static79.anInt1139 |= 0x1;
				if (local215 < arg1.anInt10784) {
					arg1.anInt10784 = local215;
				}
			} else if (local182 > local215) {
				arg1.anInt10784 -= local372;
				Static79.anInt1139 |= 0x2;
				if (local215 > arg1.anInt10784) {
					arg1.anInt10784 = local215;
				}
			}
		}
		if (local199 == arg1.anInt10781 && arg1.anInt10784 == local215) {
			if (arg1.anInt5525 > 0) {
				arg1.anInt5525--;
			}
			arg1.anInt5524--;
		}
	}
}
