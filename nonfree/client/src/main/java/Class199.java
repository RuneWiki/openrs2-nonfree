import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class199 {

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "[B")
	private final byte[] aByteArray79;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "[I")
	private final int[] anIntArray476;

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "[I")
	private int[] anIntArray477;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
	public Class199(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.aByteArray79 = arg0;
		this.anIntArray476 = new int[local6];
		this.anIntArray477 = new int[8];
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
				@Pc(83) int local83;
				if ((local43 & local39) == 0) {
					local59 = local39 | local43;
					for (local63 = local30 - 1; local63 >= 1; local63--) {
						local69 = local20[local63];
						if (local69 != local43) {
							break;
						}
						local83 = 0x1 << 32 - local63;
						if ((local83 & local69) != 0) {
							local20[local63] = local20[local63 - 1];
							break;
						}
						local20[local63] = local69 | local83;
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
				for (local83 = 0; local83 < local30; local83++) {
					@Pc(161) int local161 = Integer.MIN_VALUE >>> local83;
					if ((local161 & local43) == 0) {
						local69++;
					} else {
						if (this.anIntArray477[local69] == 0) {
							this.anIntArray477[local69] = local22;
						}
						local69 = this.anIntArray477[local69];
					}
					if (local69 >= this.anIntArray477.length) {
						@Pc(199) int[] local199 = new int[this.anIntArray477.length * 2];
						for (@Pc(201) int local201 = 0; local201 < this.anIntArray477.length; local201++) {
							local199[local201] = this.anIntArray477[local201];
						}
						this.anIntArray477 = local199;
					}
				}
				this.anIntArray477[local69] = ~local24;
				if (local69 >= local22) {
					local22 = local69 + 1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIB[BI[B)I")
	public int method5476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg0 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg0;
		@Pc(15) int local15 = 0;
		@Pc(22) int local22 = arg1;
		while (true) {
			@Pc(26) byte local26 = arg2[local22];
			if (local26 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray477[local15];
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray477[local15]) < 0) {
				arg4[arg3++] = (byte) ~local42;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray477[local15];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray477[local15]) < 0) {
				arg4[arg3++] = (byte) ~local77;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray477[local15];
			}
			@Pc(109) int local109;
			if ((local109 = this.anIntArray477[local15]) < 0) {
				arg4[arg3++] = (byte) ~local109;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray477[local15];
			}
			@Pc(144) int local144;
			if ((local144 = this.anIntArray477[local15]) < 0) {
				arg4[arg3++] = (byte) ~local144;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray477[local15];
			}
			@Pc(180) int local180;
			if ((local180 = this.anIntArray477[local15]) < 0) {
				arg4[arg3++] = (byte) ~local180;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray477[local15];
			}
			@Pc(212) int local212;
			if ((local212 = this.anIntArray477[local15]) < 0) {
				arg4[arg3++] = (byte) ~local212;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray477[local15];
			}
			@Pc(250) int local250;
			if ((local250 = this.anIntArray477[local15]) < 0) {
				arg4[arg3++] = (byte) ~local250;
				if (local13 <= arg3) {
					break;
				}
				local15 = 0;
			}
			if ((local26 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray477[local15];
			}
			@Pc(285) int local285;
			if ((local285 = this.anIntArray477[local15]) < 0) {
				arg4[arg3++] = (byte) ~local285;
				if (arg3 >= local13) {
					break;
				}
				local15 = 0;
			}
			local22++;
		}
		return local22 + 1 - arg1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I[B[BIII)I")
	public int method5477(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg0 << 3;
		while (arg4 < local16) {
			@Pc(28) int local28 = arg2[arg4] & 0xFF;
			@Pc(33) int local33 = this.anIntArray476[local28];
			@Pc(38) byte local38 = this.aByteArray79[local28];
			if (local38 == 0) {
				throw new RuntimeException("No codeword for data value " + local28);
			}
			@Pc(55) int local55 = local20 >> 3;
			@Pc(59) int local59 = local20 & 0x7;
			local7 &= -local59 >> 31;
			@Pc(77) int local77 = (local59 + local38 - 1 >> 3) + local55;
			@Pc(78) int local78 = local59 + 24;
			arg1[local55] = (byte) (local7 |= local33 >>> local78);
			if (local77 > local55) {
				local55++;
				local59 = local78 - 8;
				arg1[local55] = (byte) (local7 = local33 >>> local59);
				if (local55 < local77) {
					local59 -= 8;
					local55++;
					arg1[local55] = (byte) (local7 = local33 >>> local59);
					if (local55 < local77) {
						local55++;
						local59 -= 8;
						arg1[local55] = (byte) (local7 = local33 >>> local59);
						if (local77 > local55) {
							local55++;
							local59 -= 8;
							arg1[local55] = (byte) (local7 = local33 << -local59);
						}
					}
				}
			}
			local20 += local38;
			arg4++;
		}
		return (local20 + 7 >> 3) - arg0;
	}
}
