import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oi")
public final class Class150 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "[I")
	private final int[] anIntArray348;

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "[B")
	private final byte[] aByteArray78;

	@OriginalMember(owner = "client!oi", name = "e", descriptor = "[I")
	private int[] anIntArray349;

	static {
		new Class117("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "([B)V")
	public Class150(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray348 = new int[local6];
		this.aByteArray78 = arg0;
		@Pc(16) int[] local16 = new int[33];
		this.anIntArray349 = new int[8];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(42) int local42 = 0x1 << 32 - local30;
				@Pc(46) int local46 = local16[local30];
				this.anIntArray348[local24] = local46;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(82) int local82;
				if ((local42 & local46) == 0) {
					local59 = local42 | local46;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local16[local63];
						if (local69 != local46) {
							break;
						}
						local82 = 0x1 << 32 - local63;
						if ((local69 & local82) != 0) {
							local16[local63] = local16[local63 - 1];
							break;
						}
						local16[local63] = local82 | local69;
					}
				} else {
					local59 = local16[local30 - 1];
				}
				local16[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local46 == local16[local63]) {
						local16[local63] = local59;
					}
				}
				local69 = 0;
				for (local82 = 0; local82 < local30; local82++) {
					@Pc(155) int local155 = Integer.MIN_VALUE >>> local82;
					if ((local46 & local155) == 0) {
						local69++;
					} else {
						if (this.anIntArray349[local69] == 0) {
							this.anIntArray349[local69] = local22;
						}
						local69 = this.anIntArray349[local69];
					}
					if (this.anIntArray349.length <= local69) {
						@Pc(195) int[] local195 = new int[this.anIntArray349.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray349.length; local197++) {
							local195[local197] = this.anIntArray349[local197];
						}
						this.anIntArray349 = local195;
					}
				}
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
				this.anIntArray349[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(BII[BI[B)I")
	public int method4033(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(25) int local25 = arg3;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = arg1;
		while (true) {
			@Pc(33) byte local33 = arg4[local29];
			if (local33 >= 0) {
				local27++;
			} else {
				local27 = this.anIntArray349[local27];
			}
			@Pc(49) int local49;
			if ((local49 = this.anIntArray349[local27]) < 0) {
				arg2[arg0++] = (byte) ~local49;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x40) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray349[local27];
			}
			@Pc(87) int local87;
			if ((local87 = this.anIntArray349[local27]) < 0) {
				arg2[arg0++] = (byte) ~local87;
				if (arg0 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x20) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray349[local27];
			}
			@Pc(126) int local126;
			if ((local126 = this.anIntArray349[local27]) < 0) {
				arg2[arg0++] = (byte) ~local126;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x10) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray349[local27];
			}
			@Pc(161) int local161;
			if ((local161 = this.anIntArray349[local27]) < 0) {
				arg2[arg0++] = (byte) ~local161;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x8) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray349[local27];
			}
			@Pc(203) int local203;
			if ((local203 = this.anIntArray349[local27]) < 0) {
				arg2[arg0++] = (byte) ~local203;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x4) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray349[local27];
			}
			@Pc(242) int local242;
			if ((local242 = this.anIntArray349[local27]) < 0) {
				arg2[arg0++] = (byte) ~local242;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x2) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray349[local27];
			}
			@Pc(280) int local280;
			if ((local280 = this.anIntArray349[local27]) < 0) {
				arg2[arg0++] = (byte) ~local280;
				if (arg0 >= local25) {
					break;
				}
				local27 = 0;
			}
			if ((local33 & 0x1) == 0) {
				local27++;
			} else {
				local27 = this.anIntArray349[local27];
			}
			@Pc(319) int local319;
			if ((local319 = this.anIntArray349[local27]) < 0) {
				arg2[arg0++] = (byte) ~local319;
				if (local25 <= arg0) {
					break;
				}
				local27 = 0;
			}
			local29++;
		}
		return local29 + 1 - arg1;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I[BI[BII)I")
	public int method4034(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg4 << 3;
		@Pc(15) int local15 = arg2;
		while (arg0 < local15) {
			@Pc(23) int local23 = arg3[arg0] & 0xFF;
			@Pc(28) int local28 = this.anIntArray348[local23];
			@Pc(33) byte local33 = this.aByteArray78[local23];
			if (local33 == 0) {
				throw new RuntimeException("No codeword for data value " + local23);
			}
			@Pc(50) int local50 = local11 >> 3;
			@Pc(54) int local54 = local11 & 0x7;
			local7 &= -local54 >> 31;
			@Pc(72) int local72 = local50 + (local54 + local33 - 1 >> 3);
			local11 += local33;
			@Pc(77) int local77 = local54 + 24;
			arg1[local50] = (byte) (local7 |= local28 >>> local77);
			if (local50 < local72) {
				local54 = local77 - 8;
				local50++;
				arg1[local50] = (byte) (local7 = local28 >>> local54);
				if (local72 > local50) {
					local54 -= 8;
					local50++;
					arg1[local50] = (byte) (local7 = local28 >>> local54);
					if (local50 < local72) {
						local54 -= 8;
						local50++;
						arg1[local50] = (byte) (local7 = local28 >>> local54);
						if (local72 > local50) {
							local54 -= 8;
							local50++;
							arg1[local50] = (byte) (local7 = local28 << -local54);
						}
					}
				}
			}
			arg0++;
		}
		return (local11 + 7 >> 3) - arg4;
	}
}
