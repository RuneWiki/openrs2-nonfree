import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static404 {

	@OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
	public static int anInt6988;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_92 = new Class84("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!uh", name = "m", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_117 = new Class237(101, 7);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZZLclient!ir;)V")
	public static void method5461(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class26_Sub2_Sub2 arg1) {
		@Pc(9) Class164 local9 = arg1.method5533();
		if (arg1.anInt7148 == 0) {
			Static108.anInt1990 = -1;
			Static64.anInt1341 = 0;
			arg1.anInt7150 = 0;
			return;
		}
		if (arg1.anInt7073 != -1 && arg1.anInt7120 == 0) {
			@Pc(33) Class191 local33 = Static191.aClass28_1.method567(arg1.anInt7073);
			if (arg1.anInt7147 > 0 && local33.anInt5749 == 0) {
				Static108.anInt1990 = -1;
				Static64.anInt1341 = 0;
				arg1.anInt7150++;
				return;
			}
			if (arg1.anInt7147 <= 0 && local33.anInt5748 == 0) {
				Static108.anInt1990 = -1;
				arg1.anInt7150++;
				Static64.anInt1341 = 0;
				return;
			}
		}
		@Pc(98) Class191 local98;
		@Pc(85) Class45 local85;
		if (arg1.anInt7119 != -1 && arg1.anInt7131 <= Static403.anInt6978) {
			local85 = Static168.aClass115_2.method2718(arg1.anInt7119);
			if (local85.aBoolean62 && local85.anInt1316 != -1) {
				local98 = Static191.aClass28_1.method567(local85.anInt1316);
				if (arg1.anInt7147 > 0 && local98.anInt5749 == 0) {
					arg1.anInt7150++;
					Static64.anInt1341 = 0;
					Static108.anInt1990 = -1;
					return;
				}
				if (arg1.anInt7147 <= 0 && local98.anInt5748 == 0) {
					arg1.anInt7150++;
					Static108.anInt1990 = -1;
					Static64.anInt1341 = 0;
					return;
				}
			}
		}
		if (arg1.anInt7119 != -1 && Static403.anInt6978 >= arg1.anInt7131) {
			local85 = Static168.aClass115_2.method2718(arg1.anInt7119);
			if (local85.aBoolean62 && local85.anInt1316 != -1) {
				local98 = Static191.aClass28_1.method567(local85.anInt1316);
				if (arg1.anInt7147 > 0 && local98.anInt5749 == 0) {
					Static64.anInt1341 = 0;
					Static108.anInt1990 = -1;
					arg1.anInt7150++;
					return;
				}
				if (arg1.anInt7147 <= 0 && local98.anInt5748 == 0) {
					arg1.anInt7150++;
					Static64.anInt1341 = 0;
					Static108.anInt1990 = -1;
					return;
				}
			}
		}
		@Pc(219) int local219 = arg1.anInt7068;
		@Pc(222) int local222 = arg1.anInt7065;
		@Pc(238) int local238 = arg1.anIntArray590[arg1.anInt7148 - 1] * 128 + arg1.method5535() * 64;
		@Pc(255) int local255 = arg1.anIntArray589[arg1.anInt7148 - 1] * 128 + arg1.method5535() * 64;
		if (local219 < local238) {
			if (local255 > local222) {
				arg1.method5526(10240);
			} else if (local222 > local255) {
				arg1.method5526(14336);
			} else {
				arg1.method5526(12288);
			}
		} else if (local219 <= local238) {
			if (local222 < local255) {
				arg1.method5526(8192);
			} else if (local255 < local222) {
				arg1.method5526(0);
			}
		} else if (local255 > local222) {
			arg1.method5526(6144);
		} else if (local255 < local222) {
			arg1.method5526(2048);
		} else {
			arg1.method5526(4096);
		}
		@Pc(345) byte local345 = arg1.aByteArray84[arg1.anInt7148 - 1];
		if (!arg0 && (local238 - local219 > 256 || local238 - local219 < -256 || local255 - local222 > 256 || local255 - local222 < -256)) {
			arg1.anInt7065 = local255;
			arg1.anInt7068 = local238;
			arg1.method5537(arg1.anInt7144);
			Static108.anInt1990 = -1;
			Static64.anInt1341 = 0;
			arg1.anInt7148--;
			if (arg1.anInt7147 > 0) {
				arg1.anInt7147--;
			}
			return;
		}
		@Pc(413) int local413 = 4;
		@Pc(415) boolean local415 = true;
		if (arg1 instanceof Class26_Sub2_Sub2_Sub2) {
			local415 = ((Class26_Sub2_Sub2_Sub2) arg1).aClass66_1.aBoolean93;
		}
		@Pc(433) int local433;
		if (local415) {
			local433 = arg1.anInt7144 - arg1.aClass255_7.anInt7406;
			if (local433 != 0 && arg1.anInt7090 == -1 && arg1.anInt7126 != 0) {
				local413 = 2;
			}
			if (!arg0 && arg1.anInt7148 > 2) {
				local413 = 6;
			}
			if (!arg0 && arg1.anInt7148 > 3) {
				local413 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt7148 > 1) {
				local413 = 6;
			}
			if (!arg0 && arg1.anInt7148 > 2) {
				local413 = 8;
			}
		}
		if (arg1.anInt7150 > 0 && arg1.anInt7148 > 1) {
			local413 = 8;
			arg1.anInt7150--;
		}
		if (local345 == 2) {
			local413 <<= 0x1;
		} else if (local345 == 0) {
			local413 >>= 0x1;
		}
		Static64.anInt1341 = 0;
		if (local9.anInt4663 != -1) {
			local413 <<= 0x7;
			if (arg1.anInt7148 == 1) {
				local433 = arg1.anInt7149 * arg1.anInt7149;
				@Pc(562) int local562 = (arg1.anInt7068 > local238 ? arg1.anInt7068 - local238 : -arg1.anInt7068 + local238) << 7;
				@Pc(584) int local584 = (arg1.anInt7065 > local255 ? arg1.anInt7065 - local255 : local255 + -arg1.anInt7065) << 7;
				@Pc(591) int local591 = local584 >= local562 ? local584 : local562;
				@Pc(598) int local598 = local9.anInt4663 * 2 * local591;
				if (local598 < local433) {
					arg1.anInt7149 /= 2;
				} else if (local591 < local433 / 2) {
					arg1.anInt7149 -= local9.anInt4663;
					if (arg1.anInt7149 < 0) {
						arg1.anInt7149 = 0;
					}
				} else if (local413 > arg1.anInt7149) {
					arg1.anInt7149 += local9.anInt4663;
					if (local413 < arg1.anInt7149) {
						arg1.anInt7149 = local413;
					}
				}
			} else if (local413 > arg1.anInt7149) {
				arg1.anInt7149 += local9.anInt4663;
				if (local413 < arg1.anInt7149) {
					arg1.anInt7149 = local413;
				}
			} else if (arg1.anInt7149 > 0) {
				arg1.anInt7149 -= local9.anInt4663;
				if (arg1.anInt7149 < 0) {
					arg1.anInt7149 = 0;
				}
			}
			local413 = arg1.anInt7149 >> 7;
			if (local413 < 1) {
				local413 = 1;
			}
		}
		if (local238 > local219) {
			arg1.anInt7068 += local413;
			Static64.anInt1341 |= 0x4;
			if (local238 < arg1.anInt7068) {
				arg1.anInt7068 = local238;
			}
		} else if (local219 > local238) {
			arg1.anInt7068 -= local413;
			Static64.anInt1341 |= 0x8;
			if (local238 > arg1.anInt7068) {
				arg1.anInt7068 = local238;
			}
		}
		if (local255 > local222) {
			arg1.anInt7065 += local413;
			Static64.anInt1341 |= 0x1;
			if (arg1.anInt7065 > local255) {
				arg1.anInt7065 = local255;
			}
		} else if (local222 > local255) {
			arg1.anInt7065 -= local413;
			Static64.anInt1341 |= 0x2;
			if (arg1.anInt7065 < local255) {
				arg1.anInt7065 = local255;
			}
		}
		if (local413 >= 8) {
			Static108.anInt1990 = 2;
		} else {
			Static108.anInt1990 = local345;
		}
		if (local238 != arg1.anInt7068 || arg1.anInt7065 != local255) {
			return;
		}
		arg1.anInt7148--;
		if (arg1.anInt7147 > 0) {
			arg1.anInt7147--;
			return;
		}
	}
}
