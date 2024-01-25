import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static395 {

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "Lclient!fs;")
	public static Class76 aClass76_92;

	@OriginalMember(owner = "client!tv", name = "b", descriptor = "Ljava/lang/String;")
	public static String aString63 = null;

	@OriginalMember(owner = "client!tv", name = "g", descriptor = "[I")
	public static final int[] anIntArray502 = new int[25];

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III)I")
	public static int method5162(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(17) int local17 = (arg0 & 0x7F) * 96 >> 7;
		if (local17 < 2) {
			local17 = 2;
		} else if (local17 > 126) {
			local17 = 126;
		}
		return local17 + (arg0 & 0xFF80);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZLclient!r;)V")
	public static void method5163(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class16_Sub1_Sub5 arg1) {
		@Pc(9) Class151 local9 = arg1.method4757();
		if (arg1.anInt6086 == 0) {
			Static249.anInt4620 = -1;
			Static82.anInt1655 = 0;
			arg1.anInt6085 = 0;
			return;
		}
		if (arg1.anInt6021 != -1 && arg1.anInt6046 == 0) {
			@Pc(40) Class138 local40 = Static182.aClass55_1.method1397(arg1.anInt6021);
			if (arg1.anInt6087 > 0 && local40.anInt4401 == 0) {
				arg1.anInt6085++;
				Static82.anInt1655 = 0;
				Static249.anInt4620 = -1;
				return;
			}
			if (arg1.anInt6087 <= 0 && local40.anInt4410 == 0) {
				arg1.anInt6085++;
				Static249.anInt4620 = -1;
				Static82.anInt1655 = 0;
				return;
			}
		}
		@Pc(112) Class138 local112;
		@Pc(98) Class161 local98;
		if (arg1.anInt6029 != -1 && arg1.anInt6057 <= Static24.anInt5323) {
			local98 = Static352.aClass194_2.method4421(arg1.anInt6029);
			if (local98.aBoolean459 && local98.anInt5002 != -1) {
				local112 = Static182.aClass55_1.method1397(local98.anInt5002);
				if (arg1.anInt6087 > 0 && local112.anInt4401 == 0) {
					Static82.anInt1655 = 0;
					Static249.anInt4620 = -1;
					arg1.anInt6085++;
					return;
				}
				if (arg1.anInt6087 <= 0 && local112.anInt4410 == 0) {
					Static82.anInt1655 = 0;
					Static249.anInt4620 = -1;
					arg1.anInt6085++;
					return;
				}
			}
		}
		if (arg1.anInt6029 != -1 && arg1.anInt6057 <= Static24.anInt5323) {
			local98 = Static352.aClass194_2.method4421(arg1.anInt6029);
			if (local98.aBoolean459 && local98.anInt5002 != -1) {
				local112 = Static182.aClass55_1.method1397(local98.anInt5002);
				if (arg1.anInt6087 > 0 && local112.anInt4401 == 0) {
					Static249.anInt4620 = -1;
					arg1.anInt6085++;
					Static82.anInt1655 = 0;
					return;
				}
				if (arg1.anInt6087 <= 0 && local112.anInt4410 == 0) {
					arg1.anInt6085++;
					Static249.anInt4620 = -1;
					Static82.anInt1655 = 0;
					return;
				}
			}
		}
		@Pc(233) int local233 = arg1.anInt6893;
		@Pc(236) int local236 = arg1.anInt6892;
		@Pc(252) int local252 = arg1.anIntArray426[arg1.anInt6086 - 1] * 128 + arg1.method4751() * 64;
		@Pc(269) int local269 = arg1.anIntArray427[arg1.anInt6086 - 1] * 128 + arg1.method4751() * 64;
		if (local252 > local233) {
			if (local269 > local236) {
				arg1.method4743(10240);
			} else if (local236 <= local269) {
				arg1.method4743(12288);
			} else {
				arg1.method4743(14336);
			}
		} else if (local252 >= local233) {
			if (local236 < local269) {
				arg1.method4743(8192);
			} else if (local236 > local269) {
				arg1.method4743(0);
			}
		} else if (local269 > local236) {
			arg1.method4743(6144);
		} else if (local236 <= local269) {
			arg1.method4743(4096);
		} else {
			arg1.method4743(2048);
		}
		@Pc(355) byte local355 = arg1.aByteArray84[arg1.anInt6086 - 1];
		if (!arg0 && (local252 - local233 > 256 || local252 - local233 < -256 || local269 - local236 > 256 || local269 - local236 < -256)) {
			arg1.anInt6893 = local252;
			arg1.anInt6892 = local269;
			arg1.method4745(arg1.anInt6063);
			if (arg1.anInt6087 > 0) {
				arg1.anInt6087--;
			}
			Static249.anInt4620 = -1;
			Static82.anInt1655 = 0;
			arg1.anInt6086--;
			return;
		}
		@Pc(421) int local421 = 4;
		@Pc(423) boolean local423 = true;
		if (arg1 instanceof Class16_Sub1_Sub5_Sub2) {
			local423 = ((Class16_Sub1_Sub5_Sub2) arg1).aClass264_1.aBoolean683;
		}
		@Pc(441) int local441;
		if (local423) {
			local441 = arg1.anInt6063 - arg1.aClass35_7.anInt858;
			if (local441 != 0 && arg1.anInt6034 == -1 && arg1.anInt6080 != 0) {
				local421 = 2;
			}
			if (!arg0 && arg1.anInt6086 > 2) {
				local421 = 6;
			}
			if (!arg0 && arg1.anInt6086 > 3) {
				local421 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt6086 > 1) {
				local421 = 6;
			}
			if (!arg0 && arg1.anInt6086 > 2) {
				local421 = 8;
			}
		}
		if (arg1.anInt6085 > 0 && arg1.anInt6086 > 1) {
			local421 = 8;
			arg1.anInt6085--;
		}
		if (local355 == 2) {
			local421 <<= 0x1;
		} else if (local355 == 0) {
			local421 >>= 0x1;
		}
		if (local9.anInt4664 != -1) {
			local421 <<= 0x7;
			if (arg1.anInt6086 == 1) {
				local441 = arg1.anInt6088 * arg1.anInt6088;
				@Pc(576) int local576 = (local252 >= arg1.anInt6893 ? local252 - arg1.anInt6893 : arg1.anInt6893 - local252) << 7;
				@Pc(598) int local598 = (arg1.anInt6892 > local269 ? arg1.anInt6892 - local269 : local269 + -arg1.anInt6892) << 7;
				@Pc(609) int local609 = local598 < local576 ? local576 : local598;
				@Pc(616) int local616 = local609 * local9.anInt4664 * 2;
				if (local616 < local441) {
					arg1.anInt6088 /= 2;
				} else if (local441 / 2 > local609) {
					arg1.anInt6088 -= local9.anInt4664;
					if (arg1.anInt6088 < 0) {
						arg1.anInt6088 = 0;
					}
				} else if (arg1.anInt6088 < local421) {
					arg1.anInt6088 += local9.anInt4664;
					if (local421 < arg1.anInt6088) {
						arg1.anInt6088 = local421;
					}
				}
			} else if (arg1.anInt6088 < local421) {
				arg1.anInt6088 += local9.anInt4664;
				if (local421 < arg1.anInt6088) {
					arg1.anInt6088 = local421;
				}
			} else if (arg1.anInt6088 > 0) {
				arg1.anInt6088 -= local9.anInt4664;
				if (arg1.anInt6088 < 0) {
					arg1.anInt6088 = 0;
				}
			}
			local421 = arg1.anInt6088 >> 7;
			if (local421 < 1) {
				local421 = 1;
			}
		}
		Static82.anInt1655 = 0;
		if (local233 < local252) {
			arg1.anInt6893 += local421;
			Static82.anInt1655 |= 0x4;
			if (arg1.anInt6893 > local252) {
				arg1.anInt6893 = local252;
			}
		} else if (local252 < local233) {
			arg1.anInt6893 -= local421;
			Static82.anInt1655 |= 0x8;
			if (local252 > arg1.anInt6893) {
				arg1.anInt6893 = local252;
			}
		}
		if (local269 > local236) {
			arg1.anInt6892 += local421;
			Static82.anInt1655 |= 0x1;
			if (local269 < arg1.anInt6892) {
				arg1.anInt6892 = local269;
			}
		} else if (local269 < local236) {
			arg1.anInt6892 -= local421;
			Static82.anInt1655 |= 0x2;
			if (arg1.anInt6892 < local269) {
				arg1.anInt6892 = local269;
			}
		}
		if (arg1.anInt6893 == local252 && local269 == arg1.anInt6892) {
			arg1.anInt6086--;
			if (arg1.anInt6087 > 0) {
				arg1.anInt6087--;
			}
		}
		if (local421 >= 8) {
			Static249.anInt4620 = 2;
		} else {
			Static249.anInt4620 = local355;
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IZIII)V")
	public static void method5164(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static112.method2034(arg2)) {
			Static218.method3278(arg3, arg1, Static297.aClass247ArrayArray2[arg2], -1, arg0);
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)I")
	public static int method5165() {
		return 2;
	}
}
