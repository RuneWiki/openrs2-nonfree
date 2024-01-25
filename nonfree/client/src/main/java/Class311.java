import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class311 {

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "[I")
	private final int[] anIntArray470;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "[B")
	private final byte[] aByteArray87;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "([B)V")
	public Class311(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray470 = new int[local6];
		this.aByteArray87 = arg0;
		this.anIntArray469 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(41) int local41 = 0x1 << 32 - local30;
				@Pc(45) int local45 = local20[local30];
				this.anIntArray470[local24] = local45;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(77) int local77;
				@Pc(89) int local89;
				if ((local41 & local45) == 0) {
					for (local69 = local30 - 1; local69 >= 1; local69--) {
						local77 = local20[local69];
						if (local45 != local77) {
							break;
						}
						local89 = 0x1 << 32 - local69;
						if ((local77 & local89) != 0) {
							local20[local69] = local20[local69 - 1];
							break;
						}
						local20[local69] = local89 | local77;
					}
					local63 = local45 | local41;
				} else {
					local63 = local20[local30 - 1];
				}
				local20[local30] = local63;
				for (local69 = local30 + 1; local69 <= 32; local69++) {
					if (local20[local69] == local45) {
						local20[local69] = local63;
					}
				}
				local77 = 0;
				for (local89 = 0; local89 < local30; local89++) {
					@Pc(168) int local168 = Integer.MIN_VALUE >>> local89;
					if ((local168 & local45) == 0) {
						local77++;
					} else {
						if (this.anIntArray469[local77] == 0) {
							this.anIntArray469[local77] = local22;
						}
						local77 = this.anIntArray469[local77];
					}
					if (this.anIntArray469.length <= local77) {
						@Pc(216) int[] local216 = new int[this.anIntArray469.length * 2];
						for (@Pc(218) int local218 = 0; local218 < this.anIntArray469.length; local218++) {
							local216[local218] = this.anIntArray469[local218];
						}
						this.anIntArray469 = local216;
					}
				}
				if (local22 <= local77) {
					local22 = local77 + 1;
				}
				this.anIntArray469[local77] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "([BBIII[B)I")
	public int method7023(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(7) int local7 = 0;
		@Pc(11) int local11 = arg3;
		@Pc(15) int local15 = arg2 << 3;
		while (local11 > arg1) {
			@Pc(25) int local25 = arg0[arg1] & 0xFF;
			@Pc(30) int local30 = this.anIntArray470[local25];
			@Pc(35) byte local35 = this.aByteArray87[local25];
			if (local35 == 0) {
				throw new RuntimeException("No codeword for data value " + local25);
			}
			@Pc(58) int local58 = local15 >> 3;
			@Pc(62) int local62 = local15 & 0x7;
			local7 &= -local62 >> 31;
			@Pc(81) int local81 = local58 + (local62 + local35 - 1 >> 3);
			local15 += local35;
			@Pc(86) int local86 = local62 + 24;
			arg4[local58] = (byte) (local7 |= local30 >>> local86);
			if (local58 < local81) {
				local58++;
				local62 = local86 - 8;
				arg4[local58] = (byte) (local7 = local30 >>> local62);
				if (local58 < local81) {
					local58++;
					local62 -= 8;
					arg4[local58] = (byte) (local7 = local30 >>> local62);
					if (local58 < local81) {
						local58++;
						local62 -= 8;
						arg4[local58] = (byte) (local7 = local30 >>> local62);
						if (local81 > local58) {
							local58++;
							local62 -= 8;
							arg4[local58] = (byte) (local7 = local30 << -local62);
						}
					}
				}
			}
			arg1++;
		}
		if (88 != 88) {
			Static510.aClass70_11 = null;
		}
		return (local15 + 7 >> 3) - arg2;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II[B[BII)I")
	public int method7024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(12) int local12 = 0;
		@Pc(24) int local24 = arg1;
		@Pc(26) int local26 = arg0;
		while (true) {
			@Pc(30) byte local30 = arg3[local26];
			if (local30 < 0) {
				local12 = this.anIntArray469[local12];
			} else {
				local12++;
			}
			@Pc(52) int local52;
			if ((local52 = this.anIntArray469[local12]) < 0) {
				arg2[arg4++] = (byte) ~local52;
				if (arg4 >= local24) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x40) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray469[local12];
			}
			@Pc(95) int local95;
			if ((local95 = this.anIntArray469[local12]) < 0) {
				arg2[arg4++] = (byte) ~local95;
				if (local24 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x20) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray469[local12];
			}
			@Pc(131) int local131;
			if ((local131 = this.anIntArray469[local12]) < 0) {
				arg2[arg4++] = (byte) ~local131;
				if (arg4 >= local24) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x10) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray469[local12];
			}
			@Pc(174) int local174;
			if ((local174 = this.anIntArray469[local12]) < 0) {
				arg2[arg4++] = (byte) ~local174;
				if (arg4 >= local24) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x8) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray469[local12];
			}
			@Pc(210) int local210;
			if ((local210 = this.anIntArray469[local12]) < 0) {
				arg2[arg4++] = (byte) ~local210;
				if (arg4 >= local24) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x4) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray469[local12];
			}
			@Pc(252) int local252;
			if ((local252 = this.anIntArray469[local12]) < 0) {
				arg2[arg4++] = (byte) ~local252;
				if (local24 <= arg4) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x2) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray469[local12];
			}
			@Pc(291) int local291;
			if ((local291 = this.anIntArray469[local12]) < 0) {
				arg2[arg4++] = (byte) ~local291;
				if (arg4 >= local24) {
					break;
				}
				local12 = 0;
			}
			if ((local30 & 0x1) == 0) {
				local12++;
			} else {
				local12 = this.anIntArray469[local12];
			}
			@Pc(334) int local334;
			if ((local334 = this.anIntArray469[local12]) < 0) {
				arg2[arg4++] = (byte) ~local334;
				if (local24 <= arg4) {
					break;
				}
				local12 = 0;
			}
			local26++;
		}
		return local26 + 1 - arg0;
	}
}
