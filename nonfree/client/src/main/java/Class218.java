import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class218 {

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "[B")
	private final byte[] aByteArray92;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "[I")
	private final int[] anIntArray523;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "[I")
	private int[] anIntArray524;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([B)V")
	public Class218(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray92 = arg0;
		this.anIntArray523 = new int[local6];
		this.anIntArray524 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray523[local24] = local43;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(81) int local81;
				if ((local43 & local39) == 0) {
					local59 = local39 | local43;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local20[local63];
						if (local43 != local69) {
							break;
						}
						local81 = 0x1 << 32 - local63;
						if ((local81 & local69) != 0) {
							local20[local63] = local20[local63 - 1];
							break;
						}
						local20[local63] = local69 | local81;
					}
				} else {
					local59 = local20[local30 - 1];
				}
				local20[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local43 == local20[local63]) {
						local20[local63] = local59;
					}
				}
				local69 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(157) int local157 = Integer.MIN_VALUE >>> local81;
					if ((local43 & local157) == 0) {
						local69++;
					} else {
						if (this.anIntArray524[local69] == 0) {
							this.anIntArray524[local69] = local22;
						}
						local69 = this.anIntArray524[local69];
					}
					if (local69 >= this.anIntArray524.length) {
						@Pc(195) int[] local195 = new int[this.anIntArray524.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray524.length; local197++) {
							local195[local197] = this.anIntArray524[local197];
						}
						this.anIntArray524 = local195;
					}
				}
				this.anIntArray524[local69] = ~local24;
				if (local22 <= local69) {
					local22 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([BI[BIII)I")
	public int method5684(@OriginalArg(0) byte[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg2;
		@Pc(15) int local15 = arg3 << 3;
		while (arg4 < local11) {
			@Pc(23) int local23 = arg0[arg4] & 0xFF;
			@Pc(28) int local28 = this.anIntArray523[local23];
			@Pc(33) byte local33 = this.aByteArray92[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local15 >> 3;
			@Pc(54) int local54 = local15 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(72) int local72 = local50 + (local54 + local33 - 1 >> 3);
			local15 += local33;
			@Pc(77) int local77 = local54 + 24;
			arg1[local50] = (byte) (local7 |= local28 >>> local77);
			if (local50 < local72) {
				local50++;
				local54 = local77 - 8;
				arg1[local50] = (byte) (local7 = local28 >>> local54);
				if (local50 < local72) {
					local50++;
					local54 -= 8;
					arg1[local50] = (byte) (local7 = local28 >>> local54);
					if (local50 < local72) {
						local54 -= 8;
						local50++;
						arg1[local50] = (byte) (local7 = local28 >>> local54);
						if (local50 < local72) {
							local50++;
							local54 -= 8;
							arg1[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			arg4++;
		}
		return (local15 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[BIII[B)I")
	public int method5691(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg2 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg2;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = arg0;
		while (true) {
			@Pc(31) byte local31 = arg1[local27];
			if (local31 >= 0) {
				local25++;
			} else {
				local25 = this.anIntArray524[local25];
			}
			@Pc(50) int local50;
			if ((local50 = this.anIntArray524[local25]) < 0) {
				arg4[arg3++] = (byte) ~local50;
				if (local16 <= arg3) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x40) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray524[local25];
			}
			@Pc(92) int local92;
			if ((local92 = this.anIntArray524[local25]) < 0) {
				arg4[arg3++] = (byte) ~local92;
				if (local16 <= arg3) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x20) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray524[local25];
			}
			@Pc(127) int local127;
			if ((local127 = this.anIntArray524[local25]) < 0) {
				arg4[arg3++] = (byte) ~local127;
				if (arg3 >= local16) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x10) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray524[local25];
			}
			@Pc(165) int local165;
			if ((local165 = this.anIntArray524[local25]) < 0) {
				arg4[arg3++] = (byte) ~local165;
				if (arg3 >= local16) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x8) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray524[local25];
			}
			@Pc(201) int local201;
			if ((local201 = this.anIntArray524[local25]) < 0) {
				arg4[arg3++] = (byte) ~local201;
				if (local16 <= arg3) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x4) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray524[local25];
			}
			@Pc(240) int local240;
			if ((local240 = this.anIntArray524[local25]) < 0) {
				arg4[arg3++] = (byte) ~local240;
				if (arg3 >= local16) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x2) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray524[local25];
			}
			@Pc(279) int local279;
			if ((local279 = this.anIntArray524[local25]) < 0) {
				arg4[arg3++] = (byte) ~local279;
				if (local16 <= arg3) {
					break;
				}
				local25 = 0;
			}
			if ((local31 & 0x1) == 0) {
				local25++;
			} else {
				local25 = this.anIntArray524[local25];
			}
			@Pc(317) int local317;
			if ((local317 = this.anIntArray524[local25]) < 0) {
				arg4[arg3++] = (byte) ~local317;
				if (arg3 >= local16) {
					break;
				}
				local25 = 0;
			}
			local27++;
		}
		return local27 + 1 - arg0;
	}
}
