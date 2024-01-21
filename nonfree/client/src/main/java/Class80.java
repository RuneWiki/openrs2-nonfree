import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class80 {

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "[B")
	private final byte[] aByteArray46;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
	private int[] anIntArray682;

	@OriginalMember(owner = "client!vd", name = "m", descriptor = "[I")
	private final int[] anIntArray683;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([B)V")
	public Class80(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int[] local6 = new int[33];
		@Pc(9) int local9 = arg0.length;
		this.aByteArray46 = arg0;
		this.anIntArray682 = new int[8];
		this.anIntArray683 = new int[local9];
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < local9; local24++) {
			@Pc(30) byte local30 = arg0[local24];
			if (local30 != 0) {
				@Pc(38) int local38 = 0x1 << 32 - local30;
				@Pc(42) int local42 = local6[local30];
				this.anIntArray683[local24] = local42;
				@Pc(112) int local112;
				@Pc(58) int local58;
				@Pc(64) int local64;
				@Pc(79) int local79;
				if ((local42 & local38) == 0) {
					for (local58 = local30 - 1; local58 >= 1; local58--) {
						local64 = local6[local58];
						if (local64 != local42) {
							break;
						}
						local79 = 0x1 << 32 - local58;
						if ((local64 & local79) != 0) {
							local6[local58] = local6[local58 - 1];
							break;
						}
						local6[local58] = local79 | local64;
					}
					local112 = local42 | local38;
				} else {
					local112 = local6[local30 - 1];
				}
				local6[local30] = local112;
				for (local58 = local30 + 1; local58 <= 32; local58++) {
					if (local6[local58] == local42) {
						local6[local58] = local112;
					}
				}
				local64 = 0;
				for (local79 = 0; local79 < local30; local79++) {
					@Pc(157) int local157 = Integer.MIN_VALUE >>> local79;
					if ((local42 & local157) == 0) {
						local64++;
					} else {
						if (this.anIntArray682[local64] == 0) {
							this.anIntArray682[local64] = local22;
						}
						local64 = this.anIntArray682[local64];
					}
					if (local64 >= this.anIntArray682.length) {
						@Pc(191) int[] local191 = new int[this.anIntArray682.length * 2];
						for (@Pc(193) int local193 = 0; local193 < this.anIntArray682.length; local193++) {
							local191[local193] = this.anIntArray682[local193];
						}
						this.anIntArray682 = local191;
					}
				}
				if (local22 <= local64) {
					local22 = local64 + 1;
				}
				this.anIntArray682[local64] = ~local24;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "([BI[BBII)I")
	public int method3094(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = arg4;
		@Pc(9) int local9 = 0;
		@Pc(13) int local13 = arg3 << 3;
		while (arg1 < local3) {
			@Pc(29) int local29 = arg2[arg1] & 0xFF;
			@Pc(34) int local34 = this.anIntArray683[local29];
			@Pc(39) byte local39 = this.aByteArray46[local29];
			if (local39 == 0) {
				throw new RuntimeException("No codeword for data value " + local29);
			}
			@Pc(56) int local56 = local13 >> 3;
			@Pc(60) int local60 = local13 & 0x7;
			local9 &= -local60 >> 31;
			@Pc(77) int local77 = (local39 + local60 - 1 >> 3) + local56;
			local13 += local39;
			@Pc(82) int local82 = local60 + 24;
			arg0[local56] = (byte) (local9 |= local34 >>> local82);
			if (local56 < local77) {
				local56++;
				local60 = local82 - 8;
				arg0[local56] = (byte) (local9 = local34 >>> local60);
				if (local77 > local56) {
					local60 -= 8;
					local56++;
					arg0[local56] = (byte) (local9 = local34 >>> local60);
					if (local77 > local56) {
						local56++;
						local60 -= 8;
						arg0[local56] = (byte) (local9 = local34 >>> local60);
						if (local77 > local56) {
							local56++;
							local60 -= 8;
							arg0[local56] = (byte) (local9 = local34 << -local60);
						}
					}
				}
			}
			arg1++;
		}
		return (local13 + 7 >> 3) - arg3;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZI[B[BII)I")
	public int method3097(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == 0) {
			return 0;
		}
		@Pc(11) int local11 = arg3;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = arg0;
		while (true) {
			@Pc(24) byte local24 = arg1[local15];
			if (local24 < 0) {
				local13 = this.anIntArray682[local13];
			} else {
				local13++;
			}
			@Pc(42) int local42;
			if ((local42 = this.anIntArray682[local13]) < 0) {
				arg2[arg4++] = (byte) ~local42;
				if (arg4 >= local11) {
					break;
				}
				local13 = 0;
			}
			if ((local24 & 0x40) == 0) {
				local13++;
			} else {
				local13 = this.anIntArray682[local13];
			}
			@Pc(77) int local77;
			if ((local77 = this.anIntArray682[local13]) < 0) {
				arg2[arg4++] = (byte) ~local77;
				if (local11 <= arg4) {
					break;
				}
				local13 = 0;
			}
			if ((local24 & 0x20) == 0) {
				local13++;
			} else {
				local13 = this.anIntArray682[local13];
			}
			@Pc(115) int local115;
			if ((local115 = this.anIntArray682[local13]) < 0) {
				arg2[arg4++] = (byte) ~local115;
				if (local11 <= arg4) {
					break;
				}
				local13 = 0;
			}
			if ((local24 & 0x10) == 0) {
				local13++;
			} else {
				local13 = this.anIntArray682[local13];
			}
			@Pc(146) int local146;
			if ((local146 = this.anIntArray682[local13]) < 0) {
				arg2[arg4++] = (byte) ~local146;
				if (arg4 >= local11) {
					break;
				}
				local13 = 0;
			}
			if ((local24 & 0x8) == 0) {
				local13++;
			} else {
				local13 = this.anIntArray682[local13];
			}
			@Pc(184) int local184;
			if ((local184 = this.anIntArray682[local13]) < 0) {
				arg2[arg4++] = (byte) ~local184;
				if (arg4 >= local11) {
					break;
				}
				local13 = 0;
			}
			if ((local24 & 0x4) == 0) {
				local13++;
			} else {
				local13 = this.anIntArray682[local13];
			}
			@Pc(218) int local218;
			if ((local218 = this.anIntArray682[local13]) < 0) {
				arg2[arg4++] = (byte) ~local218;
				if (arg4 >= local11) {
					break;
				}
				local13 = 0;
			}
			if ((local24 & 0x2) == 0) {
				local13++;
			} else {
				local13 = this.anIntArray682[local13];
			}
			@Pc(256) int local256;
			if ((local256 = this.anIntArray682[local13]) < 0) {
				arg2[arg4++] = (byte) ~local256;
				if (arg4 >= local11) {
					break;
				}
				local13 = 0;
			}
			if ((local24 & 0x1) == 0) {
				local13++;
			} else {
				local13 = this.anIntArray682[local13];
			}
			@Pc(294) int local294;
			if ((local294 = this.anIntArray682[local13]) < 0) {
				arg2[arg4++] = (byte) ~local294;
				if (arg4 >= local11) {
					break;
				}
				local13 = 0;
			}
			local15++;
		}
		return local15 + 1 - arg0;
	}
}
