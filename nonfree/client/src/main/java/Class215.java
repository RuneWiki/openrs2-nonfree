import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class215 {

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "[I")
	private final int[] anIntArray492;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "[B")
	private final byte[] aByteArray94;

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "[I")
	private int[] anIntArray491;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "([B)V")
	public Class215(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray492 = new int[local6];
		this.aByteArray94 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray491 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local16[local30];
				this.anIntArray492[local24] = local45;
				@Pc(61) int local61;
				@Pc(65) int local65;
				@Pc(71) int local71;
				@Pc(85) int local85;
				if ((local45 & local41) == 0) {
					local61 = local41 | local45;
					for (local65 = local30 - 1; local65 >= 1; local65--) {
						local71 = local16[local65];
						if (local71 != local45) {
							break;
						}
						local85 = 0x1 << 32 - local65;
						if ((local71 & local85) != 0) {
							local16[local65] = local16[local65 - 1];
							break;
						}
						local16[local65] = local71 | local85;
					}
				} else {
					local61 = local16[local30 - 1];
				}
				local16[local30] = local61;
				for (local65 = local30 + 1; local65 <= 32; local65++) {
					if (local45 == local16[local65]) {
						local16[local65] = local61;
					}
				}
				local71 = 0;
				for (local85 = 0; local85 < local30; local85++) {
					@Pc(163) int local163 = Integer.MIN_VALUE >>> local85;
					if ((local45 & local163) == 0) {
						local71++;
					} else {
						if (this.anIntArray491[local71] == 0) {
							this.anIntArray491[local71] = local22;
						}
						local71 = this.anIntArray491[local71];
					}
					if (this.anIntArray491.length <= local71) {
						@Pc(204) int[] local204 = new int[this.anIntArray491.length * 2];
						for (@Pc(206) int local206 = 0; local206 < this.anIntArray491.length; local206++) {
							local204[local206] = this.anIntArray491[local206];
						}
						this.anIntArray491 = local204;
					}
				}
				if (local71 >= local22) {
					local22 = local71 + 1;
				}
				this.anIntArray491[local71] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[BIBI[B)I")
	public int method5758(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg3;
		@Pc(15) int local15 = arg0 << 3;
		while (local11 > arg2) {
			@Pc(23) int local23 = arg1[arg2] & 0xFF;
			@Pc(28) int local28 = this.anIntArray492[local23];
			@Pc(33) byte local33 = this.aByteArray94[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(72) int local72 = local50 + (local54 + local33 - 1 >> 3);
			@Pc(73) int local73 = local54 + 24;
			arg4[local50] = (byte) (local7 |= local28 >>> local73);
			if (local50 < local72) {
				local54 = local73 - 8;
				local50++;
				arg4[local50] = (byte) (local7 = local28 >>> local54);
				if (local72 > local50) {
					local50++;
					local54 -= 8;
					arg4[local50] = (byte) (local7 = local28 >>> local54);
					if (local50 < local72) {
						local50++;
						local54 -= 8;
						arg4[local50] = (byte) (local7 = local28 >>> local54);
						if (local72 > local50) {
							local54 -= 8;
							local50++;
							arg4[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			local15 += local33;
			arg2++;
		}
		return (local15 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BBIII[B)I")
	public int method5760(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(18) int local18 = arg2;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg1;
		while (true) {
			@Pc(26) byte local26 = arg4[local22];
			if (local26 >= 0) {
				local20++;
			} else {
				local20 = this.anIntArray491[local20];
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray491[local20]) < 0) {
				arg0[arg3++] = (byte) ~local45;
				if (local18 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray491[local20];
			}
			@Pc(81) int local81;
			if ((local81 = this.anIntArray491[local20]) < 0) {
				arg0[arg3++] = (byte) ~local81;
				if (local18 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray491[local20];
			}
			@Pc(120) int local120;
			if ((local120 = this.anIntArray491[local20]) < 0) {
				arg0[arg3++] = (byte) ~local120;
				if (arg3 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray491[local20];
			}
			@Pc(158) int local158;
			if ((local158 = this.anIntArray491[local20]) < 0) {
				arg0[arg3++] = (byte) ~local158;
				if (arg3 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray491[local20];
			}
			@Pc(197) int local197;
			if ((local197 = this.anIntArray491[local20]) < 0) {
				arg0[arg3++] = (byte) ~local197;
				if (arg3 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray491[local20];
			}
			@Pc(229) int local229;
			if ((local229 = this.anIntArray491[local20]) < 0) {
				arg0[arg3++] = (byte) ~local229;
				if (local18 <= arg3) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray491[local20];
			}
			@Pc(264) int local264;
			if ((local264 = this.anIntArray491[local20]) < 0) {
				arg0[arg3++] = (byte) ~local264;
				if (arg3 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray491[local20];
			}
			@Pc(303) int local303;
			if ((local303 = this.anIntArray491[local20]) < 0) {
				arg0[arg3++] = (byte) ~local303;
				if (arg3 >= local18) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg1;
	}
}
