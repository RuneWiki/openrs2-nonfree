import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "B")
	public static byte aByte124;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!qv;")
	public static final Class286 aClass286_7 = new Class286();

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_11 = new Class6(0, 1);

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
	public static int anInt9315 = 0;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BII)Z")
	public static boolean method7791(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZILclient!kda;)V")
	public static void method7792(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class3_Sub1_Sub3_Sub3 arg1) {
		@Pc(9) Class311 local9 = arg1.method5200();
		if (arg1.anInt6102 == 0) {
			arg1.anInt6105 = 0;
			Static56.anInt1903 = -1;
			Static133.anInt3322 = 0;
			return;
		}
		if (arg1.anInt6079 != -1 && arg1.anInt6029 == 0) {
			@Pc(40) Class130 local40 = Static195.aClass193_1.method5573(arg1.anInt6079);
			if (arg1.anInt6103 > 0 && local40.anInt4711 == 0) {
				Static56.anInt1903 = -1;
				Static133.anInt3322 = 0;
				arg1.anInt6105++;
				return;
			}
			if (arg1.anInt6103 <= 0 && local40.anInt4703 == 0) {
				Static133.anInt3322 = 0;
				Static56.anInt1903 = -1;
				arg1.anInt6105++;
				return;
			}
		}
		@Pc(109) Class130 local109;
		@Pc(95) Class109 local95;
		if (arg1.anInt6065 != -1 && arg1.anInt6032 <= Static407.anInt7704) {
			local95 = Static459.aClass62_2.method2250(arg1.anInt6065);
			if (local95.aBoolean296 && local95.anInt3971 != -1) {
				local109 = Static195.aClass193_1.method5573(local95.anInt3971);
				if (arg1.anInt6103 > 0 && local109.anInt4711 == 0) {
					Static133.anInt3322 = 0;
					arg1.anInt6105++;
					Static56.anInt1903 = -1;
					return;
				}
				if (arg1.anInt6103 <= 0 && local109.anInt4703 == 0) {
					Static56.anInt1903 = -1;
					Static133.anInt3322 = 0;
					arg1.anInt6105++;
					return;
				}
			}
		}
		if (arg1.anInt6065 != -1 && Static407.anInt7704 >= arg1.anInt6032) {
			local95 = Static459.aClass62_2.method2250(arg1.anInt6065);
			if (local95.aBoolean296 && local95.anInt3971 != -1) {
				local109 = Static195.aClass193_1.method5573(local95.anInt3971);
				if (arg1.anInt6103 > 0 && local109.anInt4711 == 0) {
					Static133.anInt3322 = 0;
					arg1.anInt6105++;
					Static56.anInt1903 = -1;
					return;
				}
				if (arg1.anInt6103 <= 0 && local109.anInt4703 == 0) {
					Static56.anInt1903 = -1;
					Static133.anInt3322 = 0;
					arg1.anInt6105++;
					return;
				}
			}
		}
		@Pc(232) int local232 = arg1.anInt10303;
		@Pc(235) int local235 = arg1.anInt10310;
		@Pc(251) int local251 = arg1.anIntArray358[arg1.anInt6102 - 1] * 512 + arg1.method5214() * 256;
		@Pc(268) int local268 = arg1.anIntArray357[arg1.anInt6102 - 1] * 512 + arg1.method5214() * 256;
		if (local232 >= local251) {
			if (local251 < local232) {
				if (local235 < local268) {
					arg1.method5218(6144);
				} else if (local235 > local268) {
					arg1.method5218(2048);
				} else {
					arg1.method5218(4096);
				}
			} else if (local268 > local235) {
				arg1.method5218(8192);
			} else if (local268 < local235) {
				arg1.method5218(0);
			}
		} else if (local268 > local235) {
			arg1.method5218(10240);
		} else if (local235 > local268) {
			arg1.method5218(14336);
		} else {
			arg1.method5218(12288);
		}
		@Pc(366) byte local366 = arg1.aByteArray82[arg1.anInt6102 - 1];
		if (!arg0 && (local251 - local232 > 1024 || local251 - local232 < -1024 || local268 - local235 > 1024 || local268 - local235 < -1024)) {
			arg1.anInt10310 = local268;
			arg1.anInt10303 = local251;
			arg1.method5213(arg1.anInt6076, false);
			Static56.anInt1903 = -1;
			arg1.anInt6102--;
			if (arg1.anInt6103 > 0) {
				arg1.anInt6103--;
			}
			Static133.anInt3322 = 0;
			return;
		}
		@Pc(432) int local432 = 16;
		@Pc(434) boolean local434 = true;
		if (arg1 instanceof Class3_Sub1_Sub3_Sub3_Sub1) {
			local434 = ((Class3_Sub1_Sub3_Sub3_Sub1) arg1).aClass27_1.aBoolean49;
		}
		@Pc(451) int local451;
		if (local434) {
			local451 = arg1.anInt6076 - arg1.aClass343_7.anInt10249;
			if (local451 != 0 && arg1.anInt6070 == -1 && arg1.anInt6097 != 0) {
				local432 = 8;
			}
			if (!arg0 && arg1.anInt6102 > 2) {
				local432 = 24;
			}
			if (!arg0 && arg1.anInt6102 > 3) {
				local432 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt6102 > 1) {
				local432 = 24;
			}
			if (!arg0 && arg1.anInt6102 > 2) {
				local432 = 32;
			}
		}
		if (arg1.anInt6105 > 0 && arg1.anInt6102 > 1) {
			local432 = 32;
			arg1.anInt6105--;
		}
		if (local366 == 2) {
			local432 <<= 0x1;
		} else if (local366 == 0) {
			local432 >>= 0x1;
		}
		Static133.anInt3322 = 0;
		if (local9.anInt9410 != -1) {
			local432 <<= 0x9;
			if (arg1.anInt6102 == 1) {
				local451 = arg1.anInt6104 * arg1.anInt6104;
				@Pc(618) int local618 = (local251 >= arg1.anInt10303 ? local251 - arg1.anInt10303 : arg1.anInt10303 + -local251) << 9;
				@Pc(635) int local635 = (arg1.anInt10310 <= local268 ? local268 - arg1.anInt10310 : arg1.anInt10310 + -local268) << 9;
				@Pc(642) int local642 = local635 >= local618 ? local635 : local618;
				@Pc(649) int local649 = local9.anInt9410 * 2 * local642;
				if (local451 > local649) {
					arg1.anInt6104 /= 2;
				} else if (local642 < local451 / 2) {
					arg1.anInt6104 -= local9.anInt9410;
					if (arg1.anInt6104 < 0) {
						arg1.anInt6104 = 0;
					}
				} else if (arg1.anInt6104 < local432) {
					arg1.anInt6104 += local9.anInt9410;
					if (arg1.anInt6104 > local432) {
						arg1.anInt6104 = local432;
					}
				}
			} else if (local432 > arg1.anInt6104) {
				arg1.anInt6104 += local9.anInt9410;
				if (local432 < arg1.anInt6104) {
					arg1.anInt6104 = local432;
				}
			} else if (arg1.anInt6104 > 0) {
				arg1.anInt6104 -= local9.anInt9410;
				if (arg1.anInt6104 < 0) {
					arg1.anInt6104 = 0;
				}
			}
			local432 = arg1.anInt6104 >> 9;
			if (local432 < 1) {
				local432 = 1;
			}
		}
		if (local232 == local251 && local268 == local235) {
			Static56.anInt1903 = -1;
		} else {
			if (local232 < local251) {
				Static133.anInt3322 |= 0x4;
				arg1.anInt10303 += local432;
				if (local251 < arg1.anInt10303) {
					arg1.anInt10303 = local251;
				}
			} else if (local251 < local232) {
				Static133.anInt3322 |= 0x8;
				arg1.anInt10303 -= local432;
				if (arg1.anInt10303 < local251) {
					arg1.anInt10303 = local251;
				}
			}
			if (local432 >= 32) {
				Static56.anInt1903 = 2;
			} else {
				Static56.anInt1903 = local366;
			}
			if (local268 > local235) {
				Static133.anInt3322 |= 0x1;
				arg1.anInt10310 += local432;
				if (arg1.anInt10310 > local268) {
					arg1.anInt10310 = local268;
				}
			} else if (local268 < local235) {
				Static133.anInt3322 |= 0x2;
				arg1.anInt10310 -= local432;
				if (local268 > arg1.anInt10310) {
					arg1.anInt10310 = local268;
				}
			}
		}
		if (arg1.anInt10303 == local251 && local268 == arg1.anInt10310) {
			if (arg1.anInt6103 > 0) {
				arg1.anInt6103--;
			}
			arg1.anInt6102--;
		}
	}
}
