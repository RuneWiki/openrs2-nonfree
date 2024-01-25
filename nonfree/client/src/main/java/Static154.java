import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
	public static int anInt6464;

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
	public static final int[] anIntArray457 = new int[2];

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	public static int anInt6467 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILclient!fh;)V")
	public static void method5147(@OriginalArg(1) Class5_Sub15 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static283.anInt4397; local7++) {
			@Pc(13) int local13 = arg0.method5542();
			@Pc(17) int local17 = arg0.method5598();
			if (local17 == 65535) {
				local17 = -1;
			}
			if (Static398.aClass50_Sub1Array2[local13] != null) {
				Static398.aClass50_Sub1Array2[local13].anInt1383 = local17;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I")
	public static int method5151(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static130.aShortArrayArray6 == null ? 0 : Static130.aShortArrayArray6[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
	public static void method5153(@OriginalArg(0) int arg0) {
		Static390.anInt6394 = -1;
		if (arg0 == 37) {
			Static98.aFloat83 = 3.0F;
		} else if (arg0 == 50) {
			Static98.aFloat83 = 4.0F;
		} else if (arg0 == 75) {
			Static98.aFloat83 = 6.0F;
		} else if (arg0 == 100) {
			Static98.aFloat83 = 8.0F;
		} else if (arg0 == 200) {
			Static98.aFloat83 = 16.0F;
		}
		Static390.anInt6394 = -1;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!wl;BZ)V")
	public static void method5156(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(9) Class133 local9 = arg0.method4910();
		if (arg0.anInt6199 == 0) {
			Static307.anInt4787 = 0;
			arg0.anInt6197 = 0;
			Static56.anInt1079 = -1;
			return;
		}
		if (arg0.anInt6193 != -1 && arg0.anInt6147 == 0) {
			@Pc(37) Class143 local37 = Static271.aClass219_4.method4752(arg0.anInt6193);
			if (arg0.anInt6196 > 0 && local37.anInt3786 == 0) {
				Static56.anInt1079 = -1;
				Static307.anInt4787 = 0;
				arg0.anInt6197++;
				return;
			}
			if (arg0.anInt6196 <= 0 && local37.anInt3770 == 0) {
				Static307.anInt4787 = 0;
				Static56.anInt1079 = -1;
				arg0.anInt6197++;
				return;
			}
		}
		@Pc(109) Class143 local109;
		@Pc(95) Class63 local95;
		if (arg0.anInt6125 != -1 && arg0.anInt6152 <= Static85.anInt1536) {
			local95 = Static3.aClass203_1.method4360(arg0.anInt6125);
			if (local95.aBoolean114 && local95.anInt1705 != -1) {
				local109 = Static271.aClass219_4.method4752(local95.anInt1705);
				if (arg0.anInt6196 > 0 && local109.anInt3786 == 0) {
					arg0.anInt6197++;
					Static307.anInt4787 = 0;
					Static56.anInt1079 = -1;
					return;
				}
				if (arg0.anInt6196 <= 0 && local109.anInt3770 == 0) {
					Static56.anInt1079 = -1;
					arg0.anInt6197++;
					Static307.anInt4787 = 0;
					return;
				}
			}
		}
		if (arg0.anInt6125 != -1 && arg0.anInt6152 <= Static85.anInt1536) {
			local95 = Static3.aClass203_1.method4360(arg0.anInt6125);
			if (local95.aBoolean114 && local95.anInt1705 != -1) {
				local109 = Static271.aClass219_4.method4752(local95.anInt1705);
				if (arg0.anInt6196 > 0 && local109.anInt3786 == 0) {
					Static56.anInt1079 = -1;
					Static307.anInt4787 = 0;
					arg0.anInt6197++;
					return;
				}
				if (arg0.anInt6196 <= 0 && local109.anInt3770 == 0) {
					Static56.anInt1079 = -1;
					Static307.anInt4787 = 0;
					arg0.anInt6197++;
					return;
				}
			}
		}
		@Pc(218) int local218 = arg0.anInt7500;
		@Pc(221) int local221 = arg0.anInt7502;
		@Pc(238) int local238 = arg0.anIntArray434[arg0.anInt6199 - 1] * 128 + arg0.method4913() * 64;
		@Pc(254) int local254 = arg0.anIntArray433[arg0.anInt6199 - 1] * 128 + arg0.method4913() * 64;
		if (local218 < local238) {
			if (local254 > local221) {
				arg0.method4915(10240);
			} else if (local254 >= local221) {
				arg0.method4915(12288);
			} else {
				arg0.method4915(14336);
			}
		} else if (local218 > local238) {
			if (local221 < local254) {
				arg0.method4915(6144);
			} else if (local221 > local254) {
				arg0.method4915(2048);
			} else {
				arg0.method4915(4096);
			}
		} else if (local221 < local254) {
			arg0.method4915(8192);
		} else if (local254 < local221) {
			arg0.method4915(0);
		}
		@Pc(346) byte local346 = arg0.aByteArray78[arg0.anInt6199 - 1];
		if (!arg1 && (local238 - local218 > 256 || local238 - local218 < -256 || local254 - local221 > 256 || local254 - local221 < -256)) {
			arg0.anInt7502 = local254;
			arg0.anInt7500 = local238;
			arg0.method4909(arg0.anInt6165, false);
			Static56.anInt1079 = -1;
			if (arg0.anInt6196 > 0) {
				arg0.anInt6196--;
			}
			arg0.anInt6199--;
			Static307.anInt4787 = 0;
			return;
		}
		@Pc(405) int local405 = 4;
		@Pc(413) boolean local413 = true;
		if (arg0 instanceof Class2_Sub1_Sub3_Sub1) {
			local413 = ((Class2_Sub1_Sub3_Sub1) arg0).aClass131_1.aBoolean223;
		}
		@Pc(449) int local449;
		if (local413) {
			local449 = arg0.anInt6165 - arg0.aClass110_7.anInt2906;
			if (local449 != 0 && arg0.anInt6176 == -1 && arg0.anInt6134 != 0) {
				local405 = 2;
			}
			if (!arg1 && arg0.anInt6199 > 2) {
				local405 = 6;
			}
			if (!arg1 && arg0.anInt6199 > 3) {
				local405 = 8;
			}
		} else {
			if (!arg1 && arg0.anInt6199 > 1) {
				local405 = 6;
			}
			if (!arg1 && arg0.anInt6199 > 2) {
				local405 = 8;
			}
		}
		if (arg0.anInt6197 > 0 && arg0.anInt6199 > 1) {
			local405 = 8;
			arg0.anInt6197--;
		}
		if (local346 == 2) {
			local405 <<= 0x1;
		} else if (local346 == 0) {
			local405 >>= 0x1;
		}
		if (local9.anInt3514 != -1) {
			local405 <<= 0x7;
			if (arg0.anInt6199 == 1) {
				local449 = arg0.anInt6198 * arg0.anInt6198;
				@Pc(603) int local603 = (local238 >= arg0.anInt7500 ? local238 - arg0.anInt7500 : arg0.anInt7500 - local238) << 7;
				@Pc(621) int local621 = (arg0.anInt7502 > local254 ? arg0.anInt7502 - local254 : -arg0.anInt7502 + local254) << 7;
				@Pc(628) int local628 = local603 <= local621 ? local621 : local603;
				@Pc(635) int local635 = local9.anInt3514 * 2 * local628;
				if (local635 < local449) {
					arg0.anInt6198 /= 2;
				} else if (local628 < local449 / 2) {
					arg0.anInt6198 -= local9.anInt3514;
					if (arg0.anInt6198 < 0) {
						arg0.anInt6198 = 0;
					}
				} else if (arg0.anInt6198 < local405) {
					arg0.anInt6198 += local9.anInt3514;
					if (local405 < arg0.anInt6198) {
						arg0.anInt6198 = local405;
					}
				}
			} else if (arg0.anInt6198 < local405) {
				arg0.anInt6198 += local9.anInt3514;
				if (arg0.anInt6198 > local405) {
					arg0.anInt6198 = local405;
				}
			} else if (arg0.anInt6198 > 0) {
				arg0.anInt6198 -= local9.anInt3514;
				if (arg0.anInt6198 < 0) {
					arg0.anInt6198 = 0;
				}
			}
			local405 = arg0.anInt6198 >> 7;
			if (local405 < 1) {
				local405 = 1;
			}
		}
		Static307.anInt4787 = 0;
		if (local218 == local238 && local221 == local254) {
			Static56.anInt1079 = -1;
		} else {
			if (local238 > local218) {
				arg0.anInt7500 += local405;
				Static307.anInt4787 |= 0x4;
				if (arg0.anInt7500 > local238) {
					arg0.anInt7500 = local238;
				}
			} else if (local238 < local218) {
				Static307.anInt4787 |= 0x8;
				arg0.anInt7500 -= local405;
				if (local238 > arg0.anInt7500) {
					arg0.anInt7500 = local238;
				}
			}
			if (local254 > local221) {
				Static307.anInt4787 |= 0x1;
				arg0.anInt7502 += local405;
				if (arg0.anInt7502 > local254) {
					arg0.anInt7502 = local254;
				}
			} else if (local221 > local254) {
				arg0.anInt7502 -= local405;
				Static307.anInt4787 |= 0x2;
				if (arg0.anInt7502 < local254) {
					arg0.anInt7502 = local254;
				}
			}
			if (local405 < 8) {
				Static56.anInt1079 = local346;
			} else {
				Static56.anInt1079 = 2;
			}
		}
		if (local238 == arg0.anInt7500 && arg0.anInt7502 == local254) {
			if (arg0.anInt6196 > 0) {
				arg0.anInt6196--;
			}
			arg0.anInt6199--;
		}
	}
}
