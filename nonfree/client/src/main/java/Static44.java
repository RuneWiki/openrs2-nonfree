import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!bv", name = "od", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_34 = new Class186(83, 1);

	@OriginalMember(owner = "client!bv", name = "le", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_11 = new Class242("K", "T", "K", "K");

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(IZIIII)V")
	public static void method896(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(45) int local45 = local21 * (Static15.aShort11 - Static252.aShort46) / 100 + Static252.aShort46;
		if (local45 < Static31.aShort24) {
			local45 = Static31.aShort24;
		} else if (Static14.aShort73 < local45) {
			local45 = Static14.aShort73;
		}
		@Pc(75) int local75 = local45 * arg0 * 512 / (arg2 * 334);
		@Pc(112) int local112;
		@Pc(119) int local119;
		@Pc(83) short local83;
		if (Static128.aShort47 > local75) {
			local83 = Static128.aShort47;
			local45 = arg2 * 334 * local83 / (arg0 * 512);
			if (Static14.aShort73 < local45) {
				local45 = Static14.aShort73;
				local112 = arg0 * 512 * local45 / (local83 * 334);
				local119 = (arg2 - local112) / 2;
				if (arg1) {
					Static16.aClass30_11.va();
					Static16.aClass30_11.method4692(local119, arg0, arg4, -16777216, arg3);
					Static16.aClass30_11.method4692(local119, arg0, arg4 + arg2 - local119, -16777216, arg3);
				}
				arg2 -= local119 * 2;
				arg4 += local119;
			}
		} else if (Static175.aShort58 < local75) {
			local83 = Static175.aShort58;
			local45 = arg2 * local83 * 334 / (arg0 * 512);
			if (Static31.aShort24 > local45) {
				local45 = Static31.aShort24;
				local112 = arg2 * local83 * 334 / (local45 * 512);
				local119 = (arg0 - local112) / 2;
				if (arg1) {
					Static16.aClass30_11.va();
					Static16.aClass30_11.method4692(arg2, local119, arg4, -16777216, arg3);
					Static16.aClass30_11.method4692(arg2, local119, arg4, -16777216, arg3 + arg0 - local119);
				}
				arg3 += local119;
				arg0 -= local119 * 2;
			}
		}
		Static416.anInt7075 = (short) arg0;
		Static103.anInt2206 = (short) arg2;
		Static3.anInt139 = arg3;
		Static267.anInt4770 = arg4;
		Static114.anInt2419 = arg0 * local45 / 334;
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(B)V")
	public static void method903() {
		@Pc(9) int local9 = Static251.anInt4557 * 128 + 64;
		@Pc(15) int local15 = Static253.anInt4570 * 128 + 64;
		@Pc(23) int local23 = Static222.method3109(local9, Static221.anInt4855, local15) - Static142.anInt2688;
		if (Static185.anInt6763 < 100) {
			if (Static254.anInt4614 < local9) {
				Static254.anInt4614 += Static185.anInt6763 * (local9 - Static254.anInt4614) / 1000 + Static356.anInt6389;
				if (Static254.anInt4614 > local9) {
					Static254.anInt4614 = local9;
				}
			}
			if (Static254.anInt4614 > local9) {
				Static254.anInt4614 -= Static356.anInt6389 + (Static254.anInt4614 - local9) * Static185.anInt6763 / 1000;
				if (local9 > Static254.anInt4614) {
					Static254.anInt4614 = local9;
				}
			}
			if (local23 > Static292.anInt5287) {
				Static292.anInt5287 += Static356.anInt6389 + Static185.anInt6763 * (local23 - Static292.anInt5287) / 1000;
				if (Static292.anInt5287 > local23) {
					Static292.anInt5287 = local23;
				}
			}
			if (Static30.anInt696 < local15) {
				Static30.anInt696 += (local15 - Static30.anInt696) * Static185.anInt6763 / 1000 + Static356.anInt6389;
				if (local15 < Static30.anInt696) {
					Static30.anInt696 = local15;
				}
			}
			if (local23 < Static292.anInt5287) {
				Static292.anInt5287 -= Static356.anInt6389 + Static185.anInt6763 * (Static292.anInt5287 - local23) / 1000;
				if (local23 > Static292.anInt5287) {
					Static292.anInt5287 = local23;
				}
			}
			if (Static30.anInt696 > local15) {
				Static30.anInt696 -= Static356.anInt6389 + Static185.anInt6763 * (Static30.anInt696 - local15) / 1000;
				if (Static30.anInt696 < local15) {
					Static30.anInt696 = local15;
				}
			}
		} else {
			Static30.anInt696 = Static253.anInt4570 * 128 + 64;
			Static254.anInt4614 = Static251.anInt4557 * 128 + 64;
			Static292.anInt5287 = Static222.method3109(Static254.anInt4614, Static221.anInt4855, Static30.anInt696) - Static142.anInt2688;
		}
		local15 = Static396.anInt6813 * 128 + 64;
		local9 = Static420.anInt7596 * 128 + 64;
		local23 = Static222.method3109(local9, Static221.anInt4855, local15) - Static84.anInt1908;
		@Pc(242) int local242 = local9 - Static254.anInt4614;
		@Pc(247) int local247 = local23 - Static292.anInt5287;
		@Pc(251) int local251 = local15 - Static30.anInt696;
		@Pc(262) int local262 = (int) Math.sqrt((double) (local251 * local251 + local242 * local242));
		@Pc(273) int local273 = (int) (Math.atan2((double) local247, (double) local262) * 2607.5945876176133D) & 0x3FFF;
		if (local273 < 1024) {
			local273 = 1024;
		}
		@Pc(291) int local291 = (int) (-2607.5945876176133D * Math.atan2((double) local242, (double) local251)) & 0x3FFF;
		if (local273 > 3072) {
			local273 = 3072;
		}
		if (local273 > Static183.anInt3503) {
			Static183.anInt3503 += (local273 - Static183.anInt3503 >> 3) * Static280.anInt4896 / 1000 + Static15.anInt417 << 3;
			if (Static183.anInt3503 > local273) {
				Static183.anInt3503 = local273;
			}
		}
		if (Static183.anInt3503 > local273) {
			Static183.anInt3503 -= Static280.anInt4896 * (Static183.anInt3503 - local273 >> 3) / 1000 + Static15.anInt417 << 3;
			if (local273 > Static183.anInt3503) {
				Static183.anInt3503 = local273;
			}
		}
		@Pc(360) int local360 = local291 - Static142.anInt2687;
		if (local360 > 8192) {
			local360 -= 16384;
		}
		if (local360 < -8192) {
			local360 += 16384;
		}
		local360 >>= 0x3;
		if (local360 > 0) {
			Static142.anInt2687 += Static15.anInt417 + local360 * Static280.anInt4896 / 1000 << 3;
			Static142.anInt2687 &= 0x3FFF;
		}
		if (local360 < 0) {
			Static142.anInt2687 -= Static15.anInt417 + Static280.anInt4896 * -local360 / 1000 << 3;
			Static142.anInt2687 &= 0x3FFF;
		}
		@Pc(427) int local427 = local291 - Static142.anInt2687;
		if (local427 > 8192) {
			local427 -= 16384;
		}
		if (local427 < -8192) {
			local427 += 16384;
		}
		Static185.anInt6759 = 0;
		if (local427 < 0 && local360 > 0 || local427 > 0 && local360 < 0) {
			Static142.anInt2687 = local291;
		}
	}
}
