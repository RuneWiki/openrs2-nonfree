import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static455 {

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "[I")
	public static int[] anIntArray522;

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "[Lclient!fe;")
	public static final Class109[] aClass109Array1 = new Class109[4];

	@OriginalMember(owner = "client!nu", name = "q", descriptor = "I")
	public static int anInt7068 = -1;

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLclient!kt;I)V")
	public static void method6040(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class9_Sub1_Sub1_Sub2 arg1) {
		@Pc(9) Class226 local9 = arg1.method7489();
		if (arg1.anInt8817 == 0) {
			Static285.anInt4361 = -1;
			Static268.anInt4146 = 0;
			arg1.anInt8814 = 0;
			return;
		}
		if (arg1.aClass45_10.method6572() && !arg1.aClass45_10.method6589()) {
			@Pc(38) Class149 local38 = arg1.aClass45_10.method6579();
			if (arg1.anInt8816 > 0 && local38.anInt3742 == 0) {
				Static268.anInt4146 = 0;
				arg1.anInt8814++;
				Static285.anInt4361 = -1;
				return;
			}
			if (arg1.anInt8816 <= 0 && local38.anInt3750 == 0) {
				Static268.anInt4146 = 0;
				arg1.anInt8814++;
				Static285.anInt4361 = -1;
				return;
			}
		}
		for (@Pc(80) int local80 = 0; local80 < arg1.aClass407Array3.length; local80++) {
			if (arg1.aClass407Array3[local80].anInt11162 != -1 && arg1.aClass407Array3[local80].aClass45_11.method6589()) {
				@Pc(114) Class139 local114 = Static381.aClass106_2.method2618(arg1.aClass407Array3[local80].anInt11162);
				if (local114.aBoolean218 && local114.anInt3453 != -1) {
					@Pc(129) Class149 local129 = Static592.aClass155_2.method3422(local114.anInt3453);
					if (arg1.anInt8816 > 0 && local129.anInt3742 == 0) {
						arg1.anInt8814++;
						Static285.anInt4361 = -1;
						Static268.anInt4146 = 0;
						return;
					}
					if (arg1.anInt8816 <= 0 && local129.anInt3750 == 0) {
						Static285.anInt4361 = -1;
						Static268.anInt4146 = 0;
						arg1.anInt8814++;
						return;
					}
				}
			}
		}
		@Pc(194) int local194 = arg1.anInt10694;
		@Pc(197) int local197 = arg1.anInt10695;
		@Pc(213) int local213 = arg1.anIntArray644[arg1.anInt8817 - 1] * 512 + arg1.method7485() * 256;
		@Pc(229) int local229 = arg1.anIntArray643[arg1.anInt8817 - 1] * 512 + arg1.method7485() * 256;
		if (local213 <= local194) {
			if (local194 <= local213) {
				if (local197 < local229) {
					arg1.method7479(8192);
				} else if (local229 < local197) {
					arg1.method7479(0);
				}
			} else if (local229 > local197) {
				arg1.method7479(6144);
			} else if (local197 > local229) {
				arg1.method7479(2048);
			} else {
				arg1.method7479(4096);
			}
		} else if (local229 > local197) {
			arg1.method7479(10240);
		} else if (local197 > local229) {
			arg1.method7479(14336);
		} else {
			arg1.method7479(12288);
		}
		@Pc(355) byte local355 = arg1.aByteArray86[arg1.anInt8817 - 1];
		if (!arg0 && (local213 - local194 > 1024 || local213 - local194 < -1024 || local229 - local197 > 1024 || local229 - local197 < -1024)) {
			arg1.anInt10695 = local229;
			arg1.anInt10694 = local213;
			arg1.method7495(arg1.anInt8803, false);
			if (arg1.anInt8816 > 0) {
				arg1.anInt8816--;
			}
			Static285.anInt4361 = -1;
			Static268.anInt4146 = 0;
			arg1.anInt8817--;
			return;
		}
		@Pc(432) int local432 = 16;
		@Pc(434) boolean local434 = true;
		if (arg1 instanceof Class9_Sub1_Sub1_Sub2_Sub2) {
			local434 = ((Class9_Sub1_Sub1_Sub2_Sub2) arg1).aClass219_1.aBoolean373;
		}
		@Pc(478) int local478;
		if (local434) {
			local478 = arg1.anInt8803 - arg1.aClass365_7.anInt9846;
			if (local478 != 0 && arg1.anInt8767 == -1 && arg1.anInt8807 != 0) {
				local432 = 8;
			}
			if (!arg0 && arg1.anInt8817 > 2) {
				local432 = 24;
			}
			if (!arg0 && arg1.anInt8817 > 3) {
				local432 = 32;
			}
		} else {
			if (!arg0 && arg1.anInt8817 > 1) {
				local432 = 24;
			}
			if (!arg0 && arg1.anInt8817 > 2) {
				local432 = 32;
			}
		}
		if (arg1.anInt8814 > 0 && arg1.anInt8817 > 1) {
			arg1.anInt8814--;
			local432 = 32;
		}
		if (local355 == 2) {
			local432 <<= 0x1;
		} else if (local355 == 0) {
			local432 >>= 0x1;
		}
		if (local9.anInt5785 != -1) {
			local432 <<= 0x9;
			if (arg1.anInt8817 == 1) {
				local478 = arg1.anInt8815 * arg1.anInt8815;
				@Pc(656) int local656 = (arg1.anInt10694 > local213 ? arg1.anInt10694 - local213 : -arg1.anInt10694 + local213) << 9;
				@Pc(675) int local675 = (local229 >= arg1.anInt10695 ? local229 - arg1.anInt10695 : -local229 + arg1.anInt10695) << 9;
				@Pc(687) int local687 = local675 >= local656 ? local675 : local656;
				@Pc(694) int local694 = local9.anInt5785 * 2 * local687;
				if (local694 < local478) {
					arg1.anInt8815 /= 2;
				} else if (local478 / 2 > local687) {
					arg1.anInt8815 -= local9.anInt5785;
					if (arg1.anInt8815 < 0) {
						arg1.anInt8815 = 0;
					}
				} else if (arg1.anInt8815 < local432) {
					arg1.anInt8815 += local9.anInt5785;
					if (local432 < arg1.anInt8815) {
						arg1.anInt8815 = local432;
					}
				}
			} else if (local432 > arg1.anInt8815) {
				arg1.anInt8815 += local9.anInt5785;
				if (local432 < arg1.anInt8815) {
					arg1.anInt8815 = local432;
				}
			} else if (arg1.anInt8815 > 0) {
				arg1.anInt8815 -= local9.anInt5785;
				if (arg1.anInt8815 < 0) {
					arg1.anInt8815 = 0;
				}
			}
			local432 = arg1.anInt8815 >> 9;
			if (local432 < 1) {
				local432 = 1;
			}
		}
		Static268.anInt4146 = 0;
		if (local213 == local194 && local197 == local229) {
			Static285.anInt4361 = -1;
		} else {
			if (local213 > local194) {
				arg1.anInt10694 += local432;
				Static268.anInt4146 |= 0x4;
				if (arg1.anInt10694 > local213) {
					arg1.anInt10694 = local213;
				}
			} else if (local194 > local213) {
				Static268.anInt4146 |= 0x8;
				arg1.anInt10694 -= local432;
				if (local213 > arg1.anInt10694) {
					arg1.anInt10694 = local213;
				}
			}
			if (local432 < 32) {
				Static285.anInt4361 = local355;
			} else {
				Static285.anInt4361 = 2;
			}
			if (local229 > local197) {
				Static268.anInt4146 |= 0x1;
				arg1.anInt10695 += local432;
				if (arg1.anInt10695 > local229) {
					arg1.anInt10695 = local229;
				}
			} else if (local229 < local197) {
				arg1.anInt10695 -= local432;
				Static268.anInt4146 |= 0x2;
				if (local229 > arg1.anInt10695) {
					arg1.anInt10695 = local229;
				}
			}
		}
		if (local213 == arg1.anInt10694 && local229 == arg1.anInt10695) {
			if (arg1.anInt8816 > 0) {
				arg1.anInt8816--;
			}
			arg1.anInt8817--;
		}
	}
}
