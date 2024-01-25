import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class186 {

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "[I")
	private final int[] anIntArray436;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "[I")
	private int[] anIntArray435;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "([B)V")
	public Class186(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray436 = new int[local6];
		this.aByteArray56 = arg0;
		this.anIntArray435 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray436[local24] = local43;
				@Pc(108) int local108;
				@Pc(59) int local59;
				@Pc(65) int local65;
				@Pc(79) int local79;
				if ((local39 & local43) == 0) {
					for (local59 = local30 - 1; local59 >= 1; local59--) {
						local65 = local20[local59];
						if (local65 != local43) {
							break;
						}
						local79 = 0x1 << 32 - local59;
						if ((local79 & local65) != 0) {
							local20[local59] = local20[local59 - 1];
							break;
						}
						local20[local59] = local65 | local79;
					}
					local108 = local39 | local43;
				} else {
					local108 = local20[local30 - 1];
				}
				local20[local30] = local108;
				for (local59 = local30 + 1; local59 <= 32; local59++) {
					if (local20[local59] == local43) {
						local20[local59] = local108;
					}
				}
				local65 = 0;
				for (local79 = 0; local79 < local30; local79++) {
					@Pc(153) int local153 = Integer.MIN_VALUE >>> local79;
					if ((local153 & local43) == 0) {
						local65++;
					} else {
						if (this.anIntArray435[local65] == 0) {
							this.anIntArray435[local65] = local22;
						}
						local65 = this.anIntArray435[local65];
					}
					if (this.anIntArray435.length <= local65) {
						@Pc(190) int[] local190 = new int[this.anIntArray435.length * 2];
						for (@Pc(192) int local192 = 0; local192 < this.anIntArray435.length; local192++) {
							local190[local192] = this.anIntArray435[local192];
						}
						this.anIntArray435 = local190;
					}
				}
				this.anIntArray435[local65] = ~local24;
				if (local22 <= local65) {
					local22 = local65 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIII[B[B)I")
	public int method4073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = arg1 << 3;
		@Pc(20) int local20 = arg0;
		while (local20 > arg2) {
			@Pc(28) int local28 = arg3[arg2] & 0xFF;
			@Pc(33) int local33 = this.anIntArray436[local28];
			@Pc(38) byte local38 = this.aByteArray56[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local7 &= -local59 >> 31;
			@Pc(76) int local76 = local55 + (local59 + local38 - 1 >> 3);
			local16 += local38;
			@Pc(81) int local81 = local59 + 24;
			arg4[local55] = (byte) (local7 |= local33 >>> local81);
			if (local76 > local55) {
				local55++;
				local59 = local81 - 8;
				arg4[local55] = (byte) (local7 = local33 >>> local59);
				if (local76 > local55) {
					local55++;
					local59 -= 8;
					arg4[local55] = (byte) (local7 = local33 >>> local59);
					if (local55 < local76) {
						local59 -= 8;
						local55++;
						arg4[local55] = (byte) (local7 = local33 >>> local59);
						if (local55 < local76) {
							local59 -= 8;
							local55++;
							arg4[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			arg2++;
		}
		return (local16 + 7 >> 3) - arg1;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I[BI[BII)I")
	public int method4074(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(18) int local18 = arg4;
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = arg3;
		while (true) {
			@Pc(26) byte local26 = arg2[local22];
			if (local26 < 0) {
				local20 = this.anIntArray435[local20];
			} else {
				local20++;
			}
			@Pc(45) int local45;
			if ((local45 = this.anIntArray435[local20]) < 0) {
				arg1[arg0++] = (byte) ~local45;
				if (arg0 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray435[local20];
			}
			@Pc(83) int local83;
			if ((local83 = this.anIntArray435[local20]) < 0) {
				arg1[arg0++] = (byte) ~local83;
				if (local18 <= arg0) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray435[local20];
			}
			@Pc(121) int local121;
			if ((local121 = this.anIntArray435[local20]) < 0) {
				arg1[arg0++] = (byte) ~local121;
				if (local18 <= arg0) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray435[local20];
			}
			@Pc(160) int local160;
			if ((local160 = this.anIntArray435[local20]) < 0) {
				arg1[arg0++] = (byte) ~local160;
				if (local18 <= arg0) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray435[local20];
			}
			@Pc(202) int local202;
			if ((local202 = this.anIntArray435[local20]) < 0) {
				arg1[arg0++] = (byte) ~local202;
				if (arg0 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray435[local20];
			}
			@Pc(244) int local244;
			if ((local244 = this.anIntArray435[local20]) < 0) {
				arg1[arg0++] = (byte) ~local244;
				if (arg0 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray435[local20];
			}
			@Pc(280) int local280;
			if ((local280 = this.anIntArray435[local20]) < 0) {
				arg1[arg0++] = (byte) ~local280;
				if (arg0 >= local18) {
					break;
				}
				local20 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local20++;
			} else {
				local20 = this.anIntArray435[local20];
			}
			@Pc(315) int local315;
			if ((local315 = this.anIntArray435[local20]) < 0) {
				arg1[arg0++] = (byte) ~local315;
				if (local18 <= arg0) {
					break;
				}
				local20 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg3;
	}
}
