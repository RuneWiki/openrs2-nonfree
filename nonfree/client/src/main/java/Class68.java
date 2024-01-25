import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class68 {

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "[I")
	private final int[] anIntArray132;

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "[B")
	private final byte[] aByteArray13;

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "([B)V")
	public Class68(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		this.anIntArray132 = new int[local6];
		this.aByteArray13 = arg0;
		this.anIntArray133 = new int[8];
		@Pc(20) int[] local20 = new int[33];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local6; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(39) int local39 = 0x1 << 32 - local30;
				@Pc(43) int local43 = local20[local30];
				this.anIntArray132[local24] = local43;
				@Pc(59) int local59;
				@Pc(63) int local63;
				@Pc(69) int local69;
				@Pc(83) int local83;
				if ((local39 & local43) == 0) {
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
						local20[local63] = local83 | local69;
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
					@Pc(158) int local158 = Integer.MIN_VALUE >>> local83;
					if ((local43 & local158) == 0) {
						local69++;
					} else {
						if (this.anIntArray133[local69] == 0) {
							this.anIntArray133[local69] = local22;
						}
						local69 = this.anIntArray133[local69];
					}
					if (this.anIntArray133.length <= local69) {
						@Pc(195) int[] local195 = new int[this.anIntArray133.length * 2];
						for (@Pc(197) int local197 = 0; local197 < this.anIntArray133.length; local197++) {
							local195[local197] = this.anIntArray133[local197];
						}
						this.anIntArray133 = local195;
					}
				}
				if (local22 <= local69) {
					local22 = local69 + 1;
				}
				this.anIntArray133[local69] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([BII[BIB)I")
	public int method1586(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg4 << 3;
		while (local17 > arg1) {
			@Pc(29) int local29 = arg3[arg1] & 0xFF;
			@Pc(34) int local34 = this.anIntArray132[local29];
			@Pc(39) byte local39 = this.aByteArray13[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(56) int local56 = local21 >> 3;
			@Pc(60) int local60 = local21 & 0x7;
			local7 &= -local60 >> 31;
			@Pc(78) int local78 = local56 + (local39 + local60 - 1 >> 3);
			@Pc(79) int local79 = local60 + 24;
			arg0[local56] = (byte) (local7 |= local34 >>> local79);
			if (local56 < local78) {
				local56++;
				local60 = local79 - 8;
				arg0[local56] = (byte) (local7 = local34 >>> local60);
				if (local78 > local56) {
					local56++;
					local60 -= 8;
					arg0[local56] = (byte) (local7 = local34 >>> local60);
					if (local56 < local78) {
						local56++;
						local60 -= 8;
						arg0[local56] = (byte) (local7 = local34 >>> local60);
						if (local78 > local56) {
							local56++;
							local60 -= 8;
							arg0[local56] = (byte) (local7 = local34 << -local60);
						}
					}
				}
			}
			local21 += local39;
			arg1++;
		}
		return (local21 + 7 >> 3) - arg4;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III[BI[B)I")
	public int method1588(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		if (arg1 == 0) {
			return 0;
		}
		@Pc(13) int local13 = arg1;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg3;
		while (true) {
			@Pc(21) byte local21 = arg4[local17];
			if (local21 >= 0) {
				local15++;
			} else {
				local15 = this.anIntArray133[local15];
			}
			@Pc(40) int local40;
			if ((local40 = this.anIntArray133[local15]) < 0) {
				arg2[arg0++] = (byte) ~local40;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x40) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray133[local15];
			}
			@Pc(72) int local72;
			if ((local72 = this.anIntArray133[local15]) < 0) {
				arg2[arg0++] = (byte) ~local72;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x20) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray133[local15];
			}
			@Pc(108) int local108;
			if ((local108 = this.anIntArray133[local15]) < 0) {
				arg2[arg0++] = (byte) ~local108;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x10) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray133[local15];
			}
			@Pc(143) int local143;
			if ((local143 = this.anIntArray133[local15]) < 0) {
				arg2[arg0++] = (byte) ~local143;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x8) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray133[local15];
			}
			@Pc(178) int local178;
			if ((local178 = this.anIntArray133[local15]) < 0) {
				arg2[arg0++] = (byte) ~local178;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x4) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray133[local15];
			}
			@Pc(216) int local216;
			if ((local216 = this.anIntArray133[local15]) < 0) {
				arg2[arg0++] = (byte) ~local216;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x2) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray133[local15];
			}
			@Pc(248) int local248;
			if ((local248 = this.anIntArray133[local15]) < 0) {
				arg2[arg0++] = (byte) ~local248;
				if (local13 <= arg0) {
					break;
				}
				local15 = 0;
			}
			if ((local21 & 0x1) == 0) {
				local15++;
			} else {
				local15 = this.anIntArray133[local15];
			}
			@Pc(283) int local283;
			if ((local283 = this.anIntArray133[local15]) < 0) {
				arg2[arg0++] = (byte) ~local283;
				if (arg0 >= local13) {
					break;
				}
				local15 = 0;
			}
			local17++;
		}
		return local17 + 1 - arg3;
	}
}
