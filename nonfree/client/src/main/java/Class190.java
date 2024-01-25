import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class190 {

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[B")
	private final byte[] aByteArray92;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "[I")
	private final int[] anIntArray476;

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "[I")
	private int[] anIntArray475;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "([B)V")
	public Class190(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray92 = arg0;
		this.anIntArray476 = new int[local6];
		this.anIntArray475 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray476[local24] = local43;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(81) int local81;
				if ((local43 & local39) == 0) {
					local59 = local43 | local39;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local20[local63];
						if (local69 != local43) {
							break;
						}
						local81 = 0x1 << 32 - local63;
						if ((local69 & local81) != 0) {
							local20[local63] = local20[local63 - 1];
							break;
						}
						local20[local63] = local81 | local69;
					}
				} else {
					local59 = local20[local30 - 1];
				}
				local20[local30] = local59;
				for (local63 = local30 + 1; local63 <= 32; local63++) {
					if (local20[local63] == local43) {
						local20[local63] = local59;
					}
				}
				local69 = 0;
				for (local81 = 0; local81 < local30; local81++) {
					@Pc(157) int local157 = Integer.MIN_VALUE >>> local81;
					if ((local157 & local43) == 0) {
						local69++;
					} else {
						if (this.anIntArray475[local69] == 0) {
							this.anIntArray475[local69] = local22;
						}
						local69 = this.anIntArray475[local69];
					}
					if (this.anIntArray475.length <= local69) {
						@Pc(198) int[] local198 = new int[this.anIntArray475.length * 2];
						for (@Pc(200) int local200 = 0; local200 < this.anIntArray475.length; local200++) {
							local198[local200] = this.anIntArray475[local200];
						}
						this.anIntArray475 = local198;
					}
				}
				if (local22 <= local69) {
					local22 = local69 + 1;
				}
				this.anIntArray475[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZ[BI[BI)I")
	public int method4723(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = arg0 << 3;
		@Pc(20) int local20 = arg2;
		while (local20 > arg4) {
			@Pc(28) int local28 = arg3[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray476[local28];
			@Pc(38) byte local38 = this.aByteArray92[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local16 >> 3;
			@Pc(59) int local59 = local16 & 0x7;
			local7 &= -local59 >> 31;
			@Pc(77) int local77 = local55 + (local38 + local59 - 1 >> 3);
			@Pc(78) int local78 = local59 + 24;
			arg1[local55] = (byte) (local7 |= local33 >>> local78);
			if (local77 > local55) {
				local59 = local78 - 8;
				local55++;
				arg1[local55] = (byte) (local7 = local33 >>> local59);
				if (local77 > local55) {
					local59 -= 8;
					local55++;
					arg1[local55] = (byte) (local7 = local33 >>> local59);
					if (local55 < local77) {
						local55++;
						local59 -= 8;
						arg1[local55] = (byte) (local7 = local33 >>> local59);
						if (local77 > local55) {
							local59 -= 8;
							local55++;
							arg1[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			local16 += local38;
			arg4++;
		}
		return (local16 + 7 >> 3) - arg0;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II[B[BII)I")
	public int method4724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		if (arg4 == 0) {
			return 0;
		}
		@Pc(16) int local16 = arg4;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg0;
		while (true) {
			@Pc(24) byte local24 = arg2[local20];
			if (local24 < 0) {
				local18 = this.anIntArray475[local18];
			} else {
				local18++;
			}
			@Pc(43) int local43;
			if ((local43 = this.anIntArray475[local18]) < 0) {
				arg3[arg1++] = (byte) ~local43;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray475[local18];
			}
			@Pc(75) int local75;
			if ((local75 = this.anIntArray475[local18]) < 0) {
				arg3[arg1++] = (byte) ~local75;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray475[local18];
			}
			@Pc(111) int local111;
			if ((local111 = this.anIntArray475[local18]) < 0) {
				arg3[arg1++] = (byte) ~local111;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray475[local18];
			}
			@Pc(153) int local153;
			if ((local153 = this.anIntArray475[local18]) < 0) {
				arg3[arg1++] = (byte) ~local153;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray475[local18];
			}
			@Pc(188) int local188;
			if ((local188 = this.anIntArray475[local18]) < 0) {
				arg3[arg1++] = (byte) ~local188;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray475[local18];
			}
			@Pc(230) int local230;
			if ((local230 = this.anIntArray475[local18]) < 0) {
				arg3[arg1++] = (byte) ~local230;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray475[local18];
			}
			@Pc(269) int local269;
			if ((local269 = this.anIntArray475[local18]) < 0) {
				arg3[arg1++] = (byte) ~local269;
				if (local16 <= arg1) {
					break;
				}
				local18 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local18++;
			} else {
				local18 = this.anIntArray475[local18];
			}
			@Pc(307) int local307;
			if ((local307 = this.anIntArray475[local18]) < 0) {
				arg3[arg1++] = (byte) ~local307;
				if (arg1 >= local16) {
					break;
				}
				local18 = 0;
			}
			local20++;
		}
		return local20 + 1 - arg0;
	}
}
