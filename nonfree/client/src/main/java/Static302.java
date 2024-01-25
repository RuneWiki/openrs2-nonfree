import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
	public static int anInt5438;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLclient!ap;Z)V")
	public static void method4181(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub2_Sub1 arg1) {
		@Pc(9) Class132 local9 = arg1.method4762();
		if (arg1.anInt6147 == 0) {
			Static415.anInt7049 = -1;
			arg1.anInt6146 = 0;
			Static283.anInt5103 = 0;
			return;
		}
		if (arg1.anInt6068 != -1 && arg1.anInt6117 == 0) {
			@Pc(33) Class233 local33 = Static269.aClass10_1.method286(arg1.anInt6068);
			if (arg1.anInt6145 > 0 && local33.anInt6752 == 0) {
				Static415.anInt7049 = -1;
				arg1.anInt6146++;
				Static283.anInt5103 = 0;
				return;
			}
			if (arg1.anInt6145 <= 0 && local33.anInt6744 == 0) {
				Static283.anInt5103 = 0;
				Static415.anInt7049 = -1;
				arg1.anInt6146++;
				return;
			}
		}
		@Pc(103) Class233 local103;
		@Pc(89) Class161 local89;
		if (arg1.anInt6120 != -1 && arg1.anInt6112 <= Static175.anInt3261) {
			local89 = Static92.aClass89_1.method1918(arg1.anInt6120);
			if (local89.aBoolean340 && local89.anInt4699 != -1) {
				local103 = Static269.aClass10_1.method286(local89.anInt4699);
				if (arg1.anInt6145 > 0 && local103.anInt6752 == 0) {
					arg1.anInt6146++;
					Static415.anInt7049 = -1;
					Static283.anInt5103 = 0;
					return;
				}
				if (arg1.anInt6145 <= 0 && local103.anInt6744 == 0) {
					Static415.anInt7049 = -1;
					arg1.anInt6146++;
					Static283.anInt5103 = 0;
					return;
				}
			}
		}
		if (arg1.anInt6120 != -1 && arg1.anInt6112 <= Static175.anInt3261) {
			local89 = Static92.aClass89_1.method1918(arg1.anInt6120);
			if (local89.aBoolean340 && local89.anInt4699 != -1) {
				local103 = Static269.aClass10_1.method286(local89.anInt4699);
				if (arg1.anInt6145 > 0 && local103.anInt6752 == 0) {
					arg1.anInt6146++;
					Static283.anInt5103 = 0;
					Static415.anInt7049 = -1;
					return;
				}
				if (arg1.anInt6145 <= 0 && local103.anInt6744 == 0) {
					Static415.anInt7049 = -1;
					Static283.anInt5103 = 0;
					arg1.anInt6146++;
					return;
				}
			}
		}
		@Pc(223) int local223 = arg1.anInt6062;
		@Pc(226) int local226 = arg1.anInt6061;
		@Pc(242) int local242 = arg1.anIntArray536[arg1.anInt6147 - 1] * 128 + arg1.method4763() * 64;
		@Pc(259) int local259 = arg1.anIntArray537[arg1.anInt6147 - 1] * 128 + arg1.method4763() * 64;
		if (local242 <= local223) {
			if (local242 < local223) {
				if (local259 > local226) {
					arg1.method4753(6144);
				} else if (local226 <= local259) {
					arg1.method4753(4096);
				} else {
					arg1.method4753(2048);
				}
			} else if (local259 > local226) {
				arg1.method4753(8192);
			} else if (local259 < local226) {
				arg1.method4753(0);
			}
		} else if (local226 < local259) {
			arg1.method4753(10240);
		} else if (local259 >= local226) {
			arg1.method4753(12288);
		} else {
			arg1.method4753(14336);
		}
		@Pc(357) byte local357 = arg1.aByteArray69[arg1.anInt6147 - 1];
		if (!arg0 && (local242 - local223 > 256 || local242 - local223 < -256 || local259 - local226 > 256 || local259 - local226 < -256)) {
			arg1.anInt6061 = local259;
			arg1.anInt6062 = local242;
			arg1.method4766(arg1.anInt6095);
			Static283.anInt5103 = 0;
			Static415.anInt7049 = -1;
			if (arg1.anInt6145 > 0) {
				arg1.anInt6145--;
			}
			arg1.anInt6147--;
			return;
		}
		@Pc(421) int local421 = 4;
		@Pc(423) boolean local423 = true;
		if (arg1 instanceof Class6_Sub2_Sub1_Sub2) {
			local423 = ((Class6_Sub2_Sub1_Sub2) arg1).aClass243_1.aBoolean464;
		}
		@Pc(441) int local441;
		if (local423) {
			local441 = arg1.anInt6095 - arg1.aClass216_7.anInt6397;
			if (local441 != 0 && arg1.anInt6081 == -1 && arg1.anInt6071 != 0) {
				local421 = 2;
			}
			if (!arg0 && arg1.anInt6147 > 2) {
				local421 = 6;
			}
			if (!arg0 && arg1.anInt6147 > 3) {
				local421 = 8;
			}
		} else {
			if (!arg0 && arg1.anInt6147 > 1) {
				local421 = 6;
			}
			if (!arg0 && arg1.anInt6147 > 2) {
				local421 = 8;
			}
		}
		if (arg1.anInt6146 > 0 && arg1.anInt6147 > 1) {
			arg1.anInt6146--;
			local421 = 8;
		}
		if (local357 == 2) {
			local421 <<= 0x1;
		} else if (local357 == 0) {
			local421 >>= 0x1;
		}
		if (local9.anInt3771 != -1) {
			local421 <<= 0x7;
			if (arg1.anInt6147 == 1) {
				local441 = arg1.anInt6144 * arg1.anInt6144;
				@Pc(606) int local606 = (arg1.anInt6062 <= local242 ? local242 - arg1.anInt6062 : arg1.anInt6062 + -local242) << 7;
				@Pc(624) int local624 = (arg1.anInt6061 <= local259 ? local259 - arg1.anInt6061 : -local259 + arg1.anInt6061) << 7;
				@Pc(635) int local635 = local606 <= local624 ? local624 : local606;
				@Pc(642) int local642 = local635 * local9.anInt3771 * 2;
				if (local441 > local642) {
					arg1.anInt6144 /= 2;
				} else if (local441 / 2 > local635) {
					arg1.anInt6144 -= local9.anInt3771;
					if (arg1.anInt6144 < 0) {
						arg1.anInt6144 = 0;
					}
				} else if (arg1.anInt6144 < local421) {
					arg1.anInt6144 += local9.anInt3771;
					if (local421 < arg1.anInt6144) {
						arg1.anInt6144 = local421;
					}
				}
			} else if (arg1.anInt6144 < local421) {
				arg1.anInt6144 += local9.anInt3771;
				if (arg1.anInt6144 > local421) {
					arg1.anInt6144 = local421;
				}
			} else if (arg1.anInt6144 > 0) {
				arg1.anInt6144 -= local9.anInt3771;
				if (arg1.anInt6144 < 0) {
					arg1.anInt6144 = 0;
				}
			}
			local421 = arg1.anInt6144 >> 7;
			if (local421 < 1) {
				local421 = 1;
			}
		}
		Static283.anInt5103 = 0;
		if (local223 < local242) {
			arg1.anInt6062 += local421;
			Static283.anInt5103 |= 0x4;
			if (local242 < arg1.anInt6062) {
				arg1.anInt6062 = local242;
			}
		} else if (local242 < local223) {
			arg1.anInt6062 -= local421;
			Static283.anInt5103 |= 0x8;
			if (arg1.anInt6062 < local242) {
				arg1.anInt6062 = local242;
			}
		}
		if (local226 < local259) {
			Static283.anInt5103 |= 0x1;
			arg1.anInt6061 += local421;
			if (local259 < arg1.anInt6061) {
				arg1.anInt6061 = local259;
			}
		} else if (local226 > local259) {
			Static283.anInt5103 |= 0x2;
			arg1.anInt6061 -= local421;
			if (arg1.anInt6061 < local259) {
				arg1.anInt6061 = local259;
			}
		}
		if (local421 >= 8) {
			Static415.anInt7049 = 2;
		} else {
			Static415.anInt7049 = local357;
		}
		if (arg1.anInt6062 == local242 && arg1.anInt6061 == local259) {
			if (arg1.anInt6145 > 0) {
				arg1.anInt6145--;
			}
			arg1.anInt6147--;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)V")
	public static void method4182(@OriginalArg(1) int arg0) {
		Static179.method2611();
		@Pc(16) int local16 = Static186.aClass54_1.method1422(arg0).anInt1787;
		if (local16 == 0) {
			return;
		}
		@Pc(24) int local24 = Static155.aClass149_1.anIntArray344[arg0];
		if (local16 == 5) {
			Static424.anInt7121 = local24;
		}
		if (local16 == 6) {
			Static33.anInt796 = local24;
		}
	}
}
