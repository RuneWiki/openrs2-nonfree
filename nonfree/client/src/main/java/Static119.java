import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt2070;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_32 = new Class231("shake:", "schütteln:", "tremblement:", "tremor:");

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!hi;")
	public static final Class106 aClass106_1 = new Class106(8, 0, 4, 1);

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(ZILclient!ta;)V")
	public static void method1908(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub3_Sub6 arg1) {
		@Pc(9) Class208 local9 = arg1.method5511();
		if (arg1.anInt6756 == 0) {
			Static180.anInt3128 = 0;
			arg1.anInt6757 = 0;
			Static20.anInt331 = -1;
			return;
		}
		if (arg1.anInt6713 != -1 && arg1.anInt6725 == 0) {
			@Pc(37) Class83 local37 = Static244.aClass174_2.method4011(arg1.anInt6713);
			if (arg1.anInt6755 > 0 && local37.anInt1992 == 0) {
				Static20.anInt331 = -1;
				arg1.anInt6757++;
				Static180.anInt3128 = 0;
				return;
			}
			if (arg1.anInt6755 <= 0 && local37.anInt1997 == 0) {
				Static20.anInt331 = -1;
				arg1.anInt6757++;
				Static180.anInt3128 = 0;
				return;
			}
		}
		@Pc(116) Class83 local116;
		@Pc(102) Class250 local102;
		if (arg1.anInt6712 != -1 && arg1.anInt6747 <= Static125.anInt2225) {
			local102 = Static93.aClass70_1.method1595(arg1.anInt6712);
			if (local102.aBoolean474 && local102.anInt6999 != -1) {
				local116 = Static244.aClass174_2.method4011(local102.anInt6999);
				if (arg1.anInt6755 > 0 && local116.anInt1992 == 0) {
					Static180.anInt3128 = 0;
					Static20.anInt331 = -1;
					arg1.anInt6757++;
					return;
				}
				if (arg1.anInt6755 <= 0 && local116.anInt1997 == 0) {
					arg1.anInt6757++;
					Static180.anInt3128 = 0;
					Static20.anInt331 = -1;
					return;
				}
			}
		}
		if (arg1.anInt6712 != -1 && Static125.anInt2225 >= arg1.anInt6747) {
			local102 = Static93.aClass70_1.method1595(arg1.anInt6712);
			if (local102.aBoolean474 && local102.anInt6999 != -1) {
				local116 = Static244.aClass174_2.method4011(local102.anInt6999);
				if (arg1.anInt6755 > 0 && local116.anInt1992 == 0) {
					Static180.anInt3128 = 0;
					arg1.anInt6757++;
					Static20.anInt331 = -1;
					return;
				}
				if (arg1.anInt6755 <= 0 && local116.anInt1997 == 0) {
					Static180.anInt3128 = 0;
					arg1.anInt6757++;
					Static20.anInt331 = -1;
					return;
				}
			}
		}
		@Pc(232) int local232 = arg1.anInt6675;
		@Pc(235) int local235 = arg1.anInt6677;
		@Pc(252) int local252 = arg1.anIntArray582[arg1.anInt6756 - 1] * 128 + arg1.method5512() * 64;
		@Pc(269) int local269 = arg1.anIntArray583[arg1.anInt6756 - 1] * 128 + arg1.method5512() * 64;
		if (local252 > local232) {
			if (local269 > local235) {
				arg1.method5516(10240);
			} else if (local269 >= local235) {
				arg1.method5516(12288);
			} else {
				arg1.method5516(14336);
			}
		} else if (local232 > local252) {
			if (local269 > local235) {
				arg1.method5516(6144);
			} else if (local235 > local269) {
				arg1.method5516(2048);
			} else {
				arg1.method5516(4096);
			}
		} else if (local235 < local269) {
			arg1.method5516(8192);
		} else if (local269 < local235) {
			arg1.method5516(0);
		}
		@Pc(359) byte local359 = arg1.aByteArray86[arg1.anInt6756 - 1];
		if (!arg0 && (local252 - local232 > 256 || local252 - local232 < -256 || local269 - local235 > 256 || local269 - local235 < -256)) {
			arg1.anInt6675 = local252;
			arg1.anInt6677 = local269;
			arg1.method5522(arg1.anInt6688);
			Static20.anInt331 = -1;
			Static180.anInt3128 = 0;
			arg1.anInt6756--;
			if (arg1.anInt6755 > 0) {
				arg1.anInt6755--;
			}
			return;
		}
		@Pc(425) int local425 = 4;
		@Pc(427) boolean local427 = true;
		if (arg1 instanceof Class3_Sub3_Sub6_Sub2) {
			local427 = ((Class3_Sub3_Sub6_Sub2) arg1).aClass17_1.aBoolean23;
		}
		@Pc(445) int local445;
		if (local427) {
			local445 = arg1.anInt6688 - arg1.aClass191_7.anInt4886;
			if (local445 != 0 && arg1.anInt6690 == -1 && arg1.anInt6679 != 0) {
				local425 = 2;
			}
			if (!arg0 && arg1.anInt6756 > 2) {
				local425 = 6;
			}
			if (!arg0 && arg1.anInt6756 > 3) {
				local425 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt6756 > 1) {
				local425 = 6;
			}
			if (!arg0 && arg1.anInt6756 > 2) {
				local425 = 8;
			}
		}
		if (arg1.anInt6757 > 0 && arg1.anInt6756 > 1) {
			arg1.anInt6757--;
			local425 = 8;
		}
		if (local359 == 2) {
			local425 <<= 0x1;
		} else if (local359 == 0) {
			local425 >>= 0x1;
		}
		if (local9.anInt5556 != -1) {
			local425 <<= 0x7;
			if (arg1.anInt6756 == 1) {
				local445 = arg1.anInt6754 * arg1.anInt6754;
				@Pc(624) int local624 = (arg1.anInt6675 <= local252 ? local252 - arg1.anInt6675 : arg1.anInt6675 - local252) << 7;
				@Pc(646) int local646 = (arg1.anInt6677 <= local269 ? local269 - arg1.anInt6677 : -local269 + arg1.anInt6677) << 7;
				@Pc(657) int local657 = local624 > local646 ? local624 : local646;
				@Pc(664) int local664 = local657 * local9.anInt5556 * 2;
				if (local664 < local445) {
					arg1.anInt6754 /= 2;
				} else if (local657 < local445 / 2) {
					arg1.anInt6754 -= local9.anInt5556;
					if (arg1.anInt6754 < 0) {
						arg1.anInt6754 = 0;
					}
				} else if (local425 > arg1.anInt6754) {
					arg1.anInt6754 += local9.anInt5556;
					if (local425 < arg1.anInt6754) {
						arg1.anInt6754 = local425;
					}
				}
			} else if (local425 > arg1.anInt6754) {
				arg1.anInt6754 += local9.anInt5556;
				if (local425 < arg1.anInt6754) {
					arg1.anInt6754 = local425;
				}
			} else if (arg1.anInt6754 > 0) {
				arg1.anInt6754 -= local9.anInt5556;
				if (arg1.anInt6754 < 0) {
					arg1.anInt6754 = 0;
				}
			}
			local425 = arg1.anInt6754 >> 7;
			if (local425 < 1) {
				local425 = 1;
			}
		}
		Static180.anInt3128 = 0;
		if (local252 > local232) {
			Static180.anInt3128 |= 0x4;
			arg1.anInt6675 += local425;
			if (arg1.anInt6675 > local252) {
				arg1.anInt6675 = local252;
			}
		} else if (local252 < local232) {
			arg1.anInt6675 -= local425;
			Static180.anInt3128 |= 0x8;
			if (arg1.anInt6675 < local252) {
				arg1.anInt6675 = local252;
			}
		}
		if (local269 > local235) {
			arg1.anInt6677 += local425;
			Static180.anInt3128 |= 0x1;
			if (local269 < arg1.anInt6677) {
				arg1.anInt6677 = local269;
			}
		} else if (local269 < local235) {
			arg1.anInt6677 -= local425;
			Static180.anInt3128 |= 0x2;
			if (local269 > arg1.anInt6677) {
				arg1.anInt6677 = local269;
			}
		}
		if (local425 >= 8) {
			Static20.anInt331 = 2;
		} else {
			Static20.anInt331 = local359;
		}
		if (arg1.anInt6675 != local252 || local269 != arg1.anInt6677) {
			return;
		}
		arg1.anInt6756--;
		if (arg1.anInt6755 > 0) {
			arg1.anInt6755--;
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method1909(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static367.method5802(arg2)) {
			return;
		}
		if (Static419.aClass239ArrayArray2[arg2] == null) {
			Static54.method1025(Static129.aClass239ArrayArray1[arg2], -1, arg7, arg4, arg5, arg6, arg0, arg3, arg8, arg1);
		} else {
			Static54.method1025(Static419.aClass239ArrayArray2[arg2], -1, arg7, arg4, arg5, arg6, arg0, arg3, arg8, arg1);
		}
	}
}
